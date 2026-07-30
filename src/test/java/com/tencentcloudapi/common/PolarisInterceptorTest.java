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
import com.tencentcloudapi.common.profile.PolarisProfile;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.net.ssl.SSLHandshakeException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for {@link PolarisInterceptor}.
 *
 * <p>Covers the success path (URL rewrite to instance host, report result on
 * success/failure) and the failure path (when {@link PolarisProfile#getOneInstance()}
 * throws, the interceptor rewrites the request to a Polaris-TLD-derived host
 * using the cached successful response's metadata, or the default failover TLD
 * if no successful response has been seen yet, or if the cached metadata yields no TLD).
 */
public class PolarisInterceptorTest {

    // =================================================================
    //  Test helpers
    // =================================================================

    /**
     * Programmable {@link ConsumerAPI} for tests. Only {@link #getOneInstance(GetOneInstanceRequest)}
     * and {@link #updateServiceCallResult(ServiceCallResult)} are exercised by
     * {@link PolarisProfile}; the rest throw {@link UnsupportedOperationException}.
     */
    private static final class FakeConsumerAPI implements ConsumerAPI {
        final AtomicInteger getCalls = new AtomicInteger();
        final AtomicInteger reportCalls = new AtomicInteger();
        final List<ServiceCallResult> reportedResults = new ArrayList<ServiceCallResult>();
        final List<InstancesResponse> scriptedSuccesses;
        final PolarisException[] scriptedFailures; // null slot = success
        int failureIdx = 0;
        int successIdx = 0;

        FakeConsumerAPI(List<InstancesResponse> scriptedSuccesses, PolarisException[] scriptedFailures) {
            this.scriptedSuccesses = scriptedSuccesses;
            this.scriptedFailures = scriptedFailures;
        }

        @Override
        public InstancesResponse getOneInstance(GetOneInstanceRequest req) throws PolarisException {
            getCalls.incrementAndGet();
            PolarisException e = (failureIdx < scriptedFailures.length)
                    ? scriptedFailures[failureIdx++] : null;
            if (e != null) throw e;
            return scriptedSuccesses.get(successIdx++);
        }

        @Override
        public void updateServiceCallResult(ServiceCallResult result) throws PolarisException {
            reportCalls.incrementAndGet();
            reportedResults.add(result);
        }

        // The methods below are not exercised through PolarisProfile.
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

    /** Minimal {@link Instance} for tests. */
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

    /** An {@link InstancesResponse} whose {@code getInstances()} is empty. */
    private static InstancesResponse newEmptyInstancesResponse() {
        ServiceInstances svc = new ServiceInstances() {
            @Override public ServiceKey getServiceKey() { return new ServiceKey("", ""); }
            @Override public int getTotalWeight() { return 0; }
            @Override public List<Instance> getInstances() { return Collections.<Instance>emptyList(); }
            @Override public boolean isInitialized() { return true; }
            @Override public String getRevision() { return ""; }
            @Override public Map<String, String> getMetadata() { return null; }
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

    private static Request newRequest(String urlHost, String headerHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/path")
                .header("Host", headerHost)
                .header("Authorization", "SKIP")
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
    }

    /** Like {@link #newRequest} but without an Authorization header (forces real signing). */
    private static Request newRequestNoAuth(String urlHost, String headerHost) {
        return new Request.Builder()
                .url("https://" + urlHost + "/path")
                .header("Host", headerHost)
                .header("Content-Type", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json"), "{}".getBytes()))
                .build();
    }

    private static Response okResponse(Request req) {
        return new Response.Builder()
                .request(req)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .body(ResponseBody.create(MediaType.parse("application/json"),
                        "{\"Response\":{}}"))
                .build();
    }

    /** Records the request handed to chain.proceed and returns a programmable outcome. */
    private static final class RecordingChain implements Interceptor.Chain {
        final Request input;
        Request seen;
        Response responseToReturn;
        IOException ioToThrow;

        RecordingChain(Request input) {
            this.input = input;
        }

        @Override
        public Request request() {
            return input;
        }

        @Override
        public Response proceed(Request request) throws IOException {
            this.seen = request;
            if (ioToThrow != null) throw ioToThrow;
            return responseToReturn;
        }

        @Override
        public okhttp3.Connection connection() {
            return null;
        }

        @Override
        public okhttp3.Call call() {
            return null;
        }

        @Override
        public int connectTimeoutMillis() {
            return 0;
        }

        @Override
        public Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            return this;
        }

        @Override
        public Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            return this;
        }

        @Override
        public int readTimeoutMillis() {
            return 0;
        }

        @Override
        public Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            return this;
        }

        @Override
        public int writeTimeoutMillis() {
            return 0;
        }
    }

    private static Map<String, String> mapOf(String... kvPairs) {
        Map<String, String> m = new HashMap<String, String>();
        for (int i = 0; i < kvPairs.length - 1; i += 2) {
            m.put(kvPairs[i], kvPairs[i + 1]);
        }
        return m;
    }

    /**
     * Creates a real {@link com.tencentcloudapi.cvm.v20170312.CvmClient} with a
     * dummy credential so that {@link RequestBuilder} can compute a real
     * TC3-HMAC-SHA256 signature for the failover host. The client is not used
     * for actual HTTP.
     */
    private static com.tencentcloudapi.cvm.v20170312.CvmClient newClient() {
        com.tencentcloudapi.common.profile.ClientProfile profile =
                new com.tencentcloudapi.common.profile.ClientProfile();
        profile.getHttpProfile().setEndpoint("cvm.tencentcloudapi.com");
        return new com.tencentcloudapi.cvm.v20170312.CvmClient(
                new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);
    }

    // =================================================================
    //  Success path
    // =================================================================

    // Successful getOneInstance → URL.host rewritten to instance host/port and
    // Host header carries the original public domain.
    @Test
    public void testSuccessRewritesUrlAndPreservesHostHeader() throws Exception {
        InstancesResponse resp = newInstancesResponse(
                "10.1.2.3", 8080, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(resp), new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.responseToReturn = okResponse(req);

        Response out = interceptor.intercept(chain);
        assertNotNull(out);
        assertEquals(200, out.code());

        Request seen = chain.seen;
        assertNotNull(seen);
        assertEquals("10.1.2.3", seen.url().host());
        assertEquals(8080, seen.url().port());
        assertEquals("cvm.tencentcloudapi.com", seen.header("Host"));
        assertEquals(1, api.reportCalls.get());
        assertEquals(RetStatus.RetSuccess, api.reportedResults.get(0).getRetStatus());
    }

    // Non-200 response from chain → still reports failure to Polaris.
    @Test
    public void testSuccessWithNon200ReportsFailure() throws Exception {
        InstancesResponse resp = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(resp), new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.responseToReturn = new Response.Builder()
                .request(req).protocol(Protocol.HTTP_1_1).code(500).message("err")
                .body(ResponseBody.create(MediaType.parse("application/json"), "{}"))
                .build();

        interceptor.intercept(chain);
        assertEquals(1, api.reportCalls.get());
        assertEquals(RetStatus.RetFail, api.reportedResults.get(0).getRetStatus());
    }

    // =================================================================
    //  Failure path — no cache yet → fall through to origin
    // =================================================================

    // First call (no cached success) fails → falls back to default failover TLD.
    @Test
    public void testFailureNoCacheUsesDefaultFailoverTld() throws Exception {
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.<InstancesResponse>emptyList(),
                new PolarisException[]{ new PolarisException(ErrorCode.INTERNAL_ERROR, "boom") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.responseToReturn = okResponse(req);

        interceptor.intercept(chain);

        Request seen = chain.seen;
        assertNotNull(seen);
        // No cached metadata → default failover TLD.
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com", seen.url().host());
        assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com", seen.header("Host"));
        assertEquals(0, api.reportCalls.get());
    }

    // =================================================================
    //  Failure path — cached success metadata available
    // =================================================================

    // dfs type cached → second failing call rewrites URL to *.internal.tencentcloudapi.com.
    @Test
    public void testFailureWithCachedDfsMetadataRewritesUrl() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "polaris down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        // First call (succeeds) primes the cache.
        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        // Second call (fails) — must use cached metadata to rewrite to dfs TLD.
        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        Request seen = chain2.seen;
        assertNotNull(seen);
        assertEquals("cvm.internal.tencentcloudapi.com", seen.url().host());
        assertEquals("cvm.internal.tencentcloudapi.com", seen.header("Host"));
        // Only the first (successful) call reports to Polaris; the second
        // (failed resolve) call must not add another report.
        assertEquals(1, api.reportCalls.get());
    }

    // Failure path must RE-SIGN the request for the new host (not just rewrite
    // the URL/Host header). Otherwise the server rejects the original TC3
    // signature, which was computed over the origin host. This test signs the
    // origin request with a real TC3-HMAC-SHA256 signature, then verifies the
    // failover request carries a different Authorization computed for the new
    // host (and a fresh X-TC-Timestamp).
    @Test
    public void testFailureReSignsRequestForFailoverHost() throws Exception {
        com.tencentcloudapi.cvm.v20170312.CvmClient client = newClient();
        // Origin request with a real TC3 signature for cvm.tencentcloudapi.com.
        Request originReq = new RequestBuilder(
                newRequestNoAuth("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com"))
                .fromClient(client)
                .withHost("cvm.tencentcloudapi.com")
                .build();
        String originAuth = originReq.header("Authorization");
        String originTs = originReq.header("X-TC-Timestamp");
        assertNotNull("origin request must be signed", originAuth);

        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(client, profile, new TCLog("t", false));

        // Prime the cache.
        RecordingChain chain1 = new RecordingChain(originReq);
        chain1.responseToReturn = okResponse(originReq);
        interceptor.intercept(chain1);

        // Second call fails → failover request must be re-signed for the new host.
        RecordingChain chain2 = new RecordingChain(originReq);
        chain2.responseToReturn = okResponse(originReq);
        interceptor.intercept(chain2);

        Request seen = chain2.seen;
        assertNotNull(seen);
        assertEquals("cvm.internal.tencentcloudapi.com", seen.url().host());
        assertEquals("cvm.internal.tencentcloudapi.com", seen.header("Host"));
        String seenAuth = seen.header("Authorization");
        String seenTs = seen.header("X-TC-Timestamp");
        assertNotNull("failover request must be signed", seenAuth);
        assertTrue("failover Authorization must differ from origin (re-signed for new host)",
                !originAuth.equals(seenAuth));
        // The credential scope encodes the service (host's first label) — both
        // hosts share the "cvm" service so the scope prefix is the same, but
        // the signature payload (host header) differs, so the signature differs.
        assertTrue("X-TC-Timestamp must be present", seenTs != null && !seenTs.isEmpty());
    }

    // internal type with region → cached metadata drives woa TLD.
    @Test
    public void testFailureWithCachedInternalMetadataRewritesUrl() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "internal", "region", "ap-shanghai"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        assertEquals("cvm.ap-shanghai.tencentcloudapi.woa.com", chain2.seen.url().host());
        assertEquals(1, api.reportCalls.get());
    }

    // mc type with region → *.api.tencentyun.com.
    @Test
    public void testFailureWithCachedMcMetadataRewritesUrl() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "mc", "region", "ap-guangzhou"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        assertEquals("cvm.ap-guangzhou.api.tencentyun.com", chain2.seen.url().host());
        assertEquals(1, api.reportCalls.get());
    }

    // trpc type → *.ai.tencentcloudapi.com.
    @Test
    public void testFailureWithCachedTrpcMetadataRewritesUrl() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "trpc"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        assertEquals("cvm.ai.tencentcloudapi.com", chain2.seen.url().host());
        assertEquals(1, api.reportCalls.get());
    }

    // woa type with region → *.tencentcloudapi.woa.com.
    @Test
    public void testFailureWithCachedWoaMetadataRewritesUrl() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "woa", "region", "ap-beijing"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        assertEquals("cvm.ap-beijing.tencentcloudapi.woa.com", chain2.seen.url().host());
        assertEquals(1, api.reportCalls.get());
    }

    // Cached type requires region but it's missing → default failover TLD.
    @Test
    public void testFailureWithCachedMetadataMissingRegionPassesThrough() throws Exception {
        for (String type : new String[]{"internal", "mc", "woa"}) {
            InstancesResponse first = newInstancesResponse(
                    "10.1.2.3", 80, mapOf("strip_type", type));
            FakeConsumerAPI api = new FakeConsumerAPI(
                    java.util.Collections.singletonList(first),
                    new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
            PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

            Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
            RecordingChain chain1 = new RecordingChain(req1);
            chain1.responseToReturn = okResponse(req1);
            interceptor.intercept(chain1);

            Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
            RecordingChain chain2 = new RecordingChain(req2);
            chain2.responseToReturn = okResponse(req2);
            interceptor.intercept(chain2);

            assertEquals(type, "cvm.ap-guangzhou.tencentcloudapi.woa.com", chain2.seen.url().host());
        }
    }

    // Unknown type cached → default failover TLD.
    @Test
    public void testFailureWithCachedUnknownTypePassesThrough() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "mystery"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first),
                new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com", chain2.seen.url().host());
    }

    // Null/empty cached metadata → default failover TLD.
    @Test
    public void testFailureWithNullOrEmptyCachedMetadataPassesThrough() throws Exception {
        for (Map<String, String> meta : new Map[]{
                null, new HashMap<String, String>()}) {
            InstancesResponse first = newInstancesResponse("10.1.2.3", 80, meta);
            FakeConsumerAPI api = new FakeConsumerAPI(
                    java.util.Collections.singletonList(first),
                    new PolarisException[]{ null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
            PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

            Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
            RecordingChain chain1 = new RecordingChain(req1);
            chain1.responseToReturn = okResponse(req1);
            interceptor.intercept(chain1);

            Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
            RecordingChain chain2 = new RecordingChain(req2);
            chain2.responseToReturn = okResponse(req2);
            interceptor.intercept(chain2);

            assertEquals("cvm.ap-guangzhou.tencentcloudapi.woa.com", chain2.seen.url().host());
        }
    }

    // Cache is updated on each success, so a later failure uses the most recent metadata.
    @Test
    public void testFailureUsesMostRecentCachedMetadata() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        InstancesResponse second = newInstancesResponse(
                "10.1.2.4", 80, mapOf("strip_type", "trpc"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Arrays.asList(first, second),
                new PolarisException[]{ null, null, new PolarisException(ErrorCode.INTERNAL_ERROR, "down") });
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req1 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain1 = new RecordingChain(req1);
        chain1.responseToReturn = okResponse(req1);
        interceptor.intercept(chain1);

        Request req2 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain2 = new RecordingChain(req2);
        chain2.responseToReturn = okResponse(req2);
        interceptor.intercept(chain2);

        Request req3 = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain3 = new RecordingChain(req3);
        chain3.responseToReturn = okResponse(req3);
        interceptor.intercept(chain3);

        // third call failed → uses second call's metadata (trpc).
        assertEquals("cvm.ai.tencentcloudapi.com", chain3.seen.url().host());
    }

    // Chain.proceed's IOException is propagated untouched on the success path.
    @Test
    public void testChainIoExceptionPropagated() throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first), new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.ioToThrow = new IOException("connect failed");

        try {
            interceptor.intercept(chain);
            fail("expected IOException");
        } catch (IOException e) {
            assertEquals("connect failed", e.getMessage());
        }
        // Failure still reported to Polaris.
        assertEquals(1, api.reportCalls.get());
    }

    // =================================================================
    //  Transport-layer failures on the success (Polaris-resolved) path:
    //  DNS miss, connection refused/timeout, TLS handshake failure. Unlike
    //  EndpointFailoverInterceptor, PolarisInterceptor does not classify or
    //  retry on these — it reports the failure to Polaris (RetFail) and lets
    //  the IOException propagate untouched, regardless of exception type.
    // =================================================================

    @Test
    public void testDnsFailureReportsFailureToPolarisAndPropagates() throws Exception {
        assertTransportFailureReportsAndPropagates(new UnknownHostException("dns miss"));
    }

    @Test
    public void testConnectFailureReportsFailureToPolarisAndPropagates() throws Exception {
        assertTransportFailureReportsAndPropagates(new ConnectException("connection refused"));
    }

    @Test
    public void testSocketTimeoutReportsFailureToPolarisAndPropagates() throws Exception {
        assertTransportFailureReportsAndPropagates(new SocketTimeoutException("read timed out"));
    }

    @Test
    public void testSslHandshakeFailureReportsFailureToPolarisAndPropagates() throws Exception {
        assertTransportFailureReportsAndPropagates(new SSLHandshakeException("tls failure"));
    }

    private void assertTransportFailureReportsAndPropagates(IOException failure) throws Exception {
        InstancesResponse first = newInstancesResponse(
                "10.1.2.3", 80, mapOf("strip_type", "dfs"));
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(first), new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);
        chain.ioToThrow = failure;

        try {
            interceptor.intercept(chain);
            fail("expected " + failure.getClass().getSimpleName() + " to propagate");
        } catch (IOException e) {
            assertTrue(failure.getClass().isInstance(e));
        }
        assertEquals(1, api.reportCalls.get());
        assertEquals(RetStatus.RetFail, api.reportedResults.get(0).getRetStatus());
    }

    // =================================================================
    //  getOneInstance returns null or empty — IOException path (no degradation)
    // =================================================================

    /**
     * When {@code getOneInstance()} returns {@code null},
     * {@link PolarisInterceptor#resolve} throws
     * {@code IOException("GetOneInstance return 0 instance")}. Unlike the
     * {@link PolarisException} path, this does NOT degrade to a failover TLD —
     * the IOException propagates directly. Because {@code resolve()} runs
     * before the {@code try/finally} that wraps {@code chain.proceed()}, no
     * service-call result is reported to Polaris.
     */
    @Test
    public void testGetOneInstanceReturnsNullPropagatesIoExceptionWithoutDegrading() throws Exception {
        // scriptedSuccesses holds a null element → getOneInstance returns null.
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.<InstancesResponse>singletonList(null),
                new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);

        try {
            interceptor.intercept(chain);
            fail("expected IOException for null getOneInstance");
        } catch (IOException e) {
            assertTrue("expected 'GetOneInstance return 0 instance' message, got: " + e.getMessage(),
                    e.getMessage().contains("GetOneInstance return 0 instance"));
        }
        // resolve() threw before the try/finally, so no result was reported.
        assertEquals(0, api.reportCalls.get());
        // chain.proceed was never reached.
        assertNull(chain.seen);
    }

    /**
     * When {@code getOneInstance()} returns an {@link InstancesResponse} with
     * an empty instances array, the same IOException path fires as for
     * {@code null}. No degradation, no result reported.
     */
    @Test
    public void testGetOneInstanceReturnsEmptyInstancesPropagatesIoExceptionWithoutDegrading() throws Exception {
        FakeConsumerAPI api = new FakeConsumerAPI(
                java.util.Collections.singletonList(newEmptyInstancesResponse()),
                new PolarisException[0]);
        PolarisProfile profile = new PolarisProfile(api, "ns", "svc", 1000);
        PolarisInterceptor interceptor = new PolarisInterceptor(newClient(), profile, new TCLog("t", false));

        Request req = newRequest("cvm.tencentcloudapi.com", "cvm.tencentcloudapi.com");
        RecordingChain chain = new RecordingChain(req);

        try {
            interceptor.intercept(chain);
            fail("expected IOException for empty instances");
        } catch (IOException e) {
            assertTrue("expected 'GetOneInstance return 0 instance' message, got: " + e.getMessage(),
                    e.getMessage().contains("GetOneInstance return 0 instance"));
        }
        assertEquals(0, api.reportCalls.get());
        assertNull(chain.seen);
    }

    // =================================================================
    //  polarisFailoverTLD direct tests
    // =================================================================

    @Test
    public void testPolarisFailoverTld() {
        assertEquals("internal.tencentcloudapi.com",
                PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "dfs")));
        assertEquals("ap-shanghai.tencentcloudapi.woa.com",
                PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "internal", "region", "ap-shanghai")));
        assertEquals("ap-guangzhou.api.tencentyun.com",
                PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "mc", "region", "ap-guangzhou")));
        assertEquals("ai.tencentcloudapi.com",
                PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "trpc")));
        assertEquals("ap-beijing.tencentcloudapi.woa.com",
                PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "woa", "region", "ap-beijing")));

        // Missing/unknown metadata falls back to the default failover TLD.
        String def = "ap-guangzhou.tencentcloudapi.woa.com";
        assertEquals(def, PolarisInterceptor.polarisFailoverTLD(null));
        assertEquals(def, PolarisInterceptor.polarisFailoverTLD(new HashMap<String, String>()));
        assertEquals(def, PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "unknown")));
        assertEquals(def, PolarisInterceptor.polarisFailoverTLD(mapOf("strip_type", "internal"))); // region missing
    }
}
