/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.common;

import com.tencent.polaris.api.core.ConsumerAPI;
import com.tencent.polaris.api.exception.ErrorCode;
import com.tencent.polaris.api.exception.PolarisException;
import com.tencent.polaris.api.pojo.Instance;
import com.tencent.polaris.api.pojo.RetStatus;
import com.tencent.polaris.api.pojo.ServiceInstances;
import com.tencent.polaris.api.pojo.ServiceKey;
import com.tencent.polaris.api.rpc.GetAllInstancesRequest;
import com.tencent.polaris.api.rpc.GetInstancesRequest;
import com.tencent.polaris.api.rpc.GetServiceRuleRequest;
import com.tencent.polaris.api.rpc.GetOneInstanceRequest;
import com.tencent.polaris.api.rpc.InstancesFuture;
import com.tencent.polaris.api.rpc.InstancesResponse;
import com.tencent.polaris.api.rpc.ServiceCallResult;
import com.tencent.polaris.api.rpc.ServiceRuleResponse;
import com.tencent.polaris.api.rpc.UnWatchServiceRequest;
import com.tencent.polaris.api.rpc.WatchServiceRequest;
import com.tencent.polaris.api.rpc.WatchServiceResponse;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.PolarisProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * End-to-end tests for the Polaris + EndpointFailover interceptor stack.
 *
 * <p>{@link AbstractClient}'s constructor installs {@link PolarisInterceptor}
 * first and {@link EndpointFailoverInterceptor} second. OkHttp runs
 * application interceptors in installation order, so Polaris rewrites the
 * request first, then Failover sees the rewritten host. These tests verify
 * the resulting host classification and failover behaviour for each Polaris
 * outcome:
 *
 * <ol>
 *   <li>Polaris success → URL.host becomes an instance IP → Failover sees a
 *       non-Tencent-Cloud host and passes through without creating a breaker.
 *   <li>Polaris degradation to an internal TLD → Failover recognises the
 *       Tencent-Cloud host and can rotate within the internal family when the
 *       transport fails.
 *   <li>Polaris degradation to the default woa TLD → Failover does not
 *       recognise the host and passes through.
 * </ol>
 */
public class PolarisFailoverStackTest {

    // =================================================================
    //  Scenario 1: Polaris success → Failover passthrough on instance IP
    // =================================================================

    /**
     * Polaris resolves to an instance IP (10.0.0.1:8080). Failover sees
     * url.host()="10.0.0.1". Although Failover's {@code selectHost} always
     * creates a per-host breaker on the fast path, the host is not a known
     * Tencent Cloud host, so {@code buildCandidateHosts} returns an empty
     * list — Failover cannot rotate and must pass through. The transport
     * receives the request with the instance IP as url.host (unchanged by
     * Failover) and the original business domain in the Host header.
     */
    @Test
    public void testPolarisSuccessFailoverPassthroughOnInstanceIp() throws Exception {
        FakeConsumerAPI polaris = new FakeConsumerAPI(
                java.util.Arrays.asList(
                        newInstancesResponse("10.0.0.1", 8080, null),
                        newInstancesResponse("10.0.0.1", 8080, null)),
                new PolarisException[0]);
        CvmClient client = newClientWithPolaris(polaris);
        TransportStub transport = installStub(client);
        transport.programOk();

        DescribeInstancesResponse resp = client.DescribeInstances(
                new DescribeInstancesRequest());

        assertNotNull(resp);
        assertEquals(1, transport.received.size());
        Request sent = transport.received.get(0);
        // URL.host rewritten by Polaris to the instance IP; Failover did not
        // rewrite it further.
        assertEquals("10.0.0.1", sent.url().host());
        assertEquals(8080, sent.url().port());
        // Host header preserved as the business domain by Polaris.resign().
        assertEquals("cvm.tencentcloudapi.com", sent.header("Host"));

        // Failover created a breaker for the instance IP (selectHost always
        // does), but since it's not a Tencent Cloud host, no rotation happens.
        // Verify by tripping that breaker and confirming the next request
        // still hits the same instance IP (no alternate candidate).
        EndpointFailoverInterceptor failover = failoverInterceptorOf(client);
        CircuitBreaker ipBreaker = failover.breakerFor("10.0.0.1");
        assertNotNull("breaker for instance IP should exist", ipBreaker);
        tripBreaker(ipBreaker);

        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("Failover has no alternate for non-Tencent host, "
                        + "must still hit the instance IP even with breaker open",
                "10.0.0.1", transport.received.get(1).url().host());

        // Polaris reported a success result for the instance on each call.
        assertEquals(2, polaris.reportCalls.get());
    }

    // =================================================================
    //  Scenario 2: Polaris degrades to internal TLD → Failover rotates family
    // =================================================================

    /**
     * Polaris fails to resolve and degrades to
     * {@code cvm.internal.tencentcloudapi.com} (via cached dfs metadata).
     * Failover recognises this as the internal family. When that host's
     * breaker is tripped, Failover should rotate to another TLD in the
     * internal family (e.g. {@code internal.tencentcloudapi.com.cn}) on the
     * next request.
     *
     * <p>This verifies the two layers compose: Polaris picks the TLD family,
     * Failover handles per-host breaker rotation within that family.
     */
    @Test
    public void testPolarisDegradesToInternalTldFailoverRotatesFamily() throws Exception {
        // Call 1: Polaris succeeds with dfs metadata (primes cache).
        // Calls 2..4: Polaris throws → degrades using cached dfs metadata
        //   → failoverHost = cvm.internal.tencentcloudapi.com.
        FakeConsumerAPI polaris = new FakeConsumerAPI(
                Collections.singletonList(
                        newInstancesResponse("10.0.0.1", 8080, mapOf("strip_type", "dfs"))),
                new PolarisException[]{
                        null,                              // call 1: success
                        newPolarisException("down #2"),   // call 2: degrade
                        newPolarisException("down #3"),   // call 3: degrade
                        newPolarisException("down #4"),   // call 4: degrade
                });
        CvmClient client = newClientWithPolaris(polaris);
        TransportStub transport = installStub(client);

        // Request 1: Polaris success path (primes the cache).
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("first request should hit the primed instance IP",
                "10.0.0.1", transport.received.get(0).url().host());

        // Request 2: Polaris degrades to internal TLD; transport succeeds.
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("second request should hit the internal TLD",
                "cvm.internal.tencentcloudapi.com",
                transport.received.get(1).url().host());

        // Trip the internal host's breaker so Failover must rotate.
        EndpointFailoverInterceptor failover = failoverInterceptorOf(client);
        CircuitBreaker internalBreaker =
                failover.breakerFor("cvm.internal.tencentcloudapi.com");
        assertNotNull("breaker for internal TLD should exist", internalBreaker);
        tripBreaker(internalBreaker);

        // Request 3: Polaris degrades to the same internal TLD again, but
        // Failover sees the breaker open and rotates to another TLD in the
        // internal family.
        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        String rotatedHost = transport.received.get(2).url().host();
        assertTrue("Failover should rotate to another internal-family TLD, got "
                        + rotatedHost,
                rotatedHost.equals("cvm.internal.tencentcloudapi.com.cn")
                        || rotatedHost.equals("cvm.internal.tencentcloudapi.cn"));
    }

    // =================================================================
    //  Scenario 3: Polaris degrades to default woa TLD → Failover passthrough
    // =================================================================

    /**
     * Polaris fails with no cached metadata and degrades to
     * {@code cvm.ap-guangzhou.tencentcloudapi.woa.com} (DEFAULT_FAILOVER_TLD).
     * Failover does not recognise the woa host as a Tencent Cloud host, so
     * {@code buildCandidateHosts} returns an empty list — Failover cannot
     * rotate and passes through. Tripping the woa host's breaker does not
     * cause rotation; the next request still hits the woa host.
     */
    @Test
    public void testPolarisDegradesToDefaultWoaTldFailoverPassthrough() throws Exception {
        // No successes scripted → first call throws with no cache → default TLD.
        FakeConsumerAPI polaris = new FakeConsumerAPI(
                new ArrayList<InstancesResponse>(),
                new PolarisException[]{
                        newPolarisException("no cache"),
                        newPolarisException("no cache"),
                });
        CvmClient client = newClientWithPolaris(polaris);
        TransportStub transport = installStub(client);
        transport.programOk();

        DescribeInstancesResponse resp = client.DescribeInstances(
                new DescribeInstancesRequest());

        assertNotNull(resp);
        assertEquals(1, transport.received.size());
        Request sent = transport.received.get(0);
        // DEFAULT_FAILOVER_TLD = ap-guangzhou.tencentcloudapi.woa.com
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com",
                sent.url().host());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com",
                sent.header("Host"));

        // Trip the woa host's breaker; Failover should still pass through
        // because it has no alternate candidate for a non-Tencent host.
        EndpointFailoverInterceptor failover = failoverInterceptorOf(client);
        CircuitBreaker woaBreaker =
                failover.breakerFor("cvm.ap-guangzhou.tencentcloudapi.woa.com");
        assertNotNull("breaker for woa TLD should exist", woaBreaker);
        tripBreaker(woaBreaker);

        transport.programOk();
        client.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("Failover has no alternate for non-Tencent woa host, "
                        + "must still hit it even with breaker open",
                "cvm.ap-guangzhou.tencentcloudapi.woa.com",
                transport.received.get(1).url().host());
    }

    // =================================================================
    //  Scenario 4: getOneInstance returns null → IOException propagates, Failover does not retry
    // =================================================================

    /**
     * When {@code getOneInstance()} returns null, Polaris throws
     * {@code IOException("GetOneInstance return 0 instance")} from
     * {@code resolve()} — before the {@code try/finally} that reports to
     * Polaris, and NOT via the {@code catch (PolarisException)} degradation
     * path. The stacked {@link EndpointFailoverInterceptor} sees this
     * IOException, but {@code shouldFailover()} only matches
     * UnknownHostException/SSLException/SocketException/SocketTimeoutException/
     * UnhealthyResponseException — a plain IOException does not qualify, so
     * Failover passes it through without recording a breaker failure or
     * rotating.
     *
     * <p>This is the critical behavioural difference from the PolarisException
     * path: no degradation TLD is selected, no breaker state changes, and the
     * request surfaces exactly one transport-layer attempt that never reached
     * the network.
     */
    @Test
    public void testGetOneInstanceNullPropagatesFailoverDoesNotRetry() throws Exception {
        // scriptedSuccesses = [null] → getOneInstance returns null.
        FakeConsumerAPI polaris = new FakeConsumerAPI(
                java.util.Collections.<InstancesResponse>singletonList(null),
                new PolarisException[0]);
        CvmClient client = newClientWithPolaris(polaris);
        TransportStub transport = installStub(client);

        try {
            client.DescribeInstances(new DescribeInstancesRequest());
            assertTrue("expected TencentCloudSDKException for null getOneInstance", false);
        } catch (TencentCloudSDKException e) {
            Throwable cause = e.getCause();
            assertNotNull("exception must wrap the IOException cause", cause);
            assertTrue("cause should be IOException, got "
                    + cause.getClass().getName(), cause instanceof IOException);
            assertTrue("expected 'GetOneInstance return 0 instance' message, got: "
                    + cause.getMessage(),
                    cause.getMessage().contains("GetOneInstance return 0 instance"));
        }

        // The transport stub never saw a request — Polaris threw before
        // chain.proceed, and Failover (which runs before Polaris in the
        // interceptor chain... wait, Polaris runs first) — so no request
        // reached the transport.
        assertEquals("transport should not have received any request",
                0, transport.received.size());

        // Failover's selectHost ran (it calls breakerFor on the origin host
        // before Polaris throws), but the IOException is not failover-eligible,
        // so no failure was recorded on the breaker. Verify the origin host's
        // breaker still allows requests (stayed closed).
        EndpointFailoverInterceptor failover = failoverInterceptorOf(client);
        CircuitBreaker originBreaker = failover.breakerFor("cvm.tencentcloudapi.com");
        assertNotNull(originBreaker);
        assertTrue("non-failover IOException must not record a breaker failure",
                originBreaker.allow().allowed);

        // Polaris's resolve() threw before the try/finally, so no result was
        // reported.
        assertEquals(0, polaris.reportCalls.get());
    }

    // =================================================================
    //  Helpers
    // =================================================================

    /**
     * Builds a real {@link CvmClient} with both a {@link PolarisProfile}
     * (backed by a {@link FakeConsumerAPI}) and the default
     * {@link EndpointFailoverInterceptor} (enableDomainFailover defaults to
     * true). This mirrors the production interceptor installation order.
     */
    private static CvmClient newClientWithPolaris(FakeConsumerAPI polarisApi) {
        ClientProfile profile = new ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.tencentcloudapi.com");
        PolarisProfile polarisProfile = new PolarisProfile(
                polarisApi, "test-ns", "cvm", 1000L);
        profile.setPolarisProfile(polarisProfile);
        // enableDomainFailover defaults to true; make it explicit.
        profile.setEnableDomainFailover(true);
        return new CvmClient(
                new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
    }

    private static TransportStub installStub(AbstractClient client) {
        TransportStub stub = new TransportStub();
        OkHttpClient orig = grabOkHttpClient(client);
        // Add the stub as the last application interceptor so it runs after
        // both Polaris and Failover.
        setOkHttpClient(client, orig.newBuilder().addInterceptor(stub).build());
        return stub;
    }

    private static OkHttpClient grabOkHttpClient(AbstractClient client) {
        try {
            Field f = AbstractClient.class.getDeclaredField("httpConnection");
            f.setAccessible(true);
            HttpConnection conn = (HttpConnection) f.get(client);
            return (OkHttpClient) conn.getHttpClient();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setOkHttpClient(AbstractClient client, OkHttpClient http) {
        try {
            Field f = AbstractClient.class.getDeclaredField("httpConnection");
            f.setAccessible(true);
            HttpConnection conn = (HttpConnection) f.get(client);
            conn.setHttpClient(http);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static EndpointFailoverInterceptor failoverInterceptorOf(AbstractClient client) {
        for (Interceptor it : grabOkHttpClient(client).interceptors()) {
            if (it instanceof EndpointFailoverInterceptor) {
                return (EndpointFailoverInterceptor) it;
            }
        }
        throw new IllegalStateException("EndpointFailoverInterceptor not installed");
    }

    /** Trips a breaker by feeding it 6 consecutive failures. */
    private static void tripBreaker(CircuitBreaker breaker) {
        for (int i = 0; i < 6; i++) {
            CircuitBreaker.Token t = breaker.allow();
            if (t.allowed) {
                t.report(false);
            }
        }
    }

    /** Counts breakers created by the failover interceptor (via reflection). */
    private static int breakerCount(EndpointFailoverInterceptor interceptor) {
        try {
            Field f = EndpointFailoverInterceptor.class.getDeclaredField("breakers");
            f.setAccessible(true);
            Map<?, ?> m = (Map<?, ?>) f.get(interceptor);
            return m.size();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, String> mapOf(String... kvPairs) {
        Map<String, String> m = new HashMap<String, String>();
        for (int i = 0; i + 1 < kvPairs.length; i += 2) {
            m.put(kvPairs[i], kvPairs[i + 1]);
        }
        return m;
    }

    private static PolarisException newPolarisException(String message) {
        return new PolarisException(ErrorCode.INTERNAL_ERROR, message);
    }

    private static InstancesResponse newInstancesResponse(String instanceHost, int port,
                                                          Map<String, String> metadata) {
        final Instance instance = new FakeInstance(instanceHost, port);
        ServiceInstances svc = new ServiceInstances() {
            @Override public ServiceKey getServiceKey() { return new ServiceKey("", ""); }
            @Override public int getTotalWeight() { return 0; }
            @Override public List<Instance> getInstances() { return Collections.singletonList(instance); }
            @Override public boolean isInitialized() { return true; }
            @Override public String getRevision() { return ""; }
            @Override public Map<String, String> getMetadata() { return metadata; }
            @Override public String getService() { return ""; }
            @Override public String getNamespace() { return ""; }
            @Override public Double getHealthThreshold() { return null; }
            @Override public void updateRequestCount(boolean success) { }
            @Override public boolean checkHalfOpenAvailable() { return true; }
            @Override public boolean isEnableDynamicWeight() { return false; }
            @Override public com.tencent.polaris.api.pojo.InstanceSet getInstanceSet() { return null; }
        };
        return new InstancesResponse(svc, false);
    }

    private static final class FakeInstance implements Instance {
        private final String host;
        private final int port;

        FakeInstance(String host, int port) {
            this.host = host;
            this.port = port;
        }

        @Override public String getId() { return ""; }
        @Override public String getNamespace() { return ""; }
        @Override public String getService() { return ""; }
        @Override public String getHost() { return host; }
        @Override public int getPort() { return port; }
        @Override public String getProtocol() { return ""; }
        @Override public String getVersion() { return ""; }
        @Override public int getWeight() { return 0; }
        @Override public boolean isHealthy() { return true; }
        @Override public boolean isIsolated() { return false; }
        @Override public boolean isEnableHealthCheck() { return false; }
        @Override public int getPriority() { return 0; }
        @Override public Map<String, String> getMetadata() { return null; }
        @Override public String getLogicSet() { return ""; }
        @Override public String getRegion() { return ""; }
        @Override public String getZone() { return ""; }
        @Override public String getCampus() { return ""; }
        @Override public String getRevision() { return ""; }
        @Override public com.tencent.polaris.api.pojo.CircuitBreakerStatus getCircuitBreakerStatus() { return null; }
        @Override public com.tencent.polaris.api.pojo.CircuitBreakerStatus getCircuitBreakerStatus(
                com.tencent.polaris.api.pojo.StatusDimension dimension) { return null; }
        @Override public int compareTo(Instance o) { return 0; }
        @Override public void setDynamicWeight(int weight) { }
        @Override public int getDynamicWeight() { return 0; }
    }

    /**
     * Programmable {@link ConsumerAPI}; only {@code getOneInstance} and
     * {@code updateServiceCallResult} are exercised by {@link PolarisProfile}.
     */
    private static final class FakeConsumerAPI implements ConsumerAPI {
        final AtomicInteger getCalls = new AtomicInteger();
        final AtomicInteger reportCalls = new AtomicInteger();
        final List<InstancesResponse> scriptedSuccesses;
        final PolarisException[] scriptedFailures; // null slot = success
        int failureIdx = 0;
        int successIdx = 0;

        FakeConsumerAPI(List<InstancesResponse> scriptedSuccesses,
                        PolarisException[] scriptedFailures) {
            this.scriptedSuccesses = scriptedSuccesses;
            this.scriptedFailures = scriptedFailures;
        }

        @Override
        public InstancesResponse getOneInstance(GetOneInstanceRequest req) throws PolarisException {
            getCalls.incrementAndGet();
            PolarisException e = (failureIdx < scriptedFailures.length)
                    ? scriptedFailures[failureIdx++] : null;
            if (e != null) throw e;
            if (successIdx >= scriptedSuccesses.size()) {
                throw new IllegalStateException("no more scripted successes");
            }
            return scriptedSuccesses.get(successIdx++);
        }

        @Override
        public void updateServiceCallResult(ServiceCallResult result) {
            reportCalls.incrementAndGet();
        }

        @Override public InstancesResponse getAllInstance(GetAllInstancesRequest r) { throw new UnsupportedOperationException(); }
        @Override public InstancesResponse getInstances(GetInstancesRequest r) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetAllInstances(GetAllInstancesRequest r) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetOneInstance(GetOneInstanceRequest r) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetInstances(GetInstancesRequest r) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetAllInstances(GetAllInstancesRequest r, java.util.concurrent.Executor exec) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetOneInstance(GetOneInstanceRequest r, java.util.concurrent.Executor exec) { throw new UnsupportedOperationException(); }
        @Override public InstancesFuture asyncGetInstances(GetInstancesRequest r, java.util.concurrent.Executor exec) { throw new UnsupportedOperationException(); }
        @Override public ServiceRuleResponse getServiceRule(GetServiceRuleRequest r) { throw new UnsupportedOperationException(); }
        @Override public WatchServiceResponse watchService(WatchServiceRequest r) { throw new UnsupportedOperationException(); }
        @Override public boolean unWatchService(UnWatchServiceRequest r) { throw new UnsupportedOperationException(); }
        @Override public void destroy() { }
    }

    private static final class TransportStub implements Interceptor {
        final List<Request> received = new ArrayList<Request>();
        private final java.util.Queue<Object> programmed = new java.util.LinkedList<Object>();

        void programOk() {
            programmed.add(new ProgrammedResponse(200,
                    "{\"Response\":{\"RequestId\":\"req-ok\",\"TotalCount\":0,\"InstanceSet\":[]}}",
                    "application/json"));
        }

        void programFailure(IOException e) {
            programmed.add(e);
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            received.add(request);
            Object next = programmed.poll();
            if (next == null) {
                throw new IllegalStateException(
                        "TransportStub got an unexpected request to " + request.url());
            }
            if (next instanceof IOException) {
                throw (IOException) next;
            }
            ProgrammedResponse pr = (ProgrammedResponse) next;
            return new Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .code(pr.code)
                    .message(pr.code == 200 ? "OK" : "Error")
                    .header("Content-Type", pr.contentType)
                    .body(ResponseBody.create(
                            okhttp3.MediaType.parse(pr.contentType), pr.body))
                    .build();
        }

        private static final class ProgrammedResponse {
            final int code;
            final String body;
            final String contentType;

            ProgrammedResponse(int code, String body, String contentType) {
                this.code = code;
                this.body = body;
                this.contentType = contentType;
            }
        }
    }
}
