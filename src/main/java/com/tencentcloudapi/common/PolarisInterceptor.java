package com.tencentcloudapi.common;

import com.tencent.polaris.api.exception.PolarisException;
import com.tencent.polaris.api.pojo.Instance;
import com.tencent.polaris.api.rpc.InstancesResponse;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.PolarisProfile;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

class PolarisInterceptor implements Interceptor {
    private final AbstractClient client;
    private final PolarisProfile profile;
    private final TCLog log;

    /**
     * Caches the most recent successful resolve so a failover TLD can still be
     * derived from instance metadata when {@link PolarisProfile#getOneInstance()} fails.
     */
    private final AtomicReference<InstancesResponse> lastSuccess =
            new AtomicReference<InstancesResponse>();

    public PolarisInterceptor(AbstractClient client, PolarisProfile profile, TCLog log) {
        this.client = client;
        this.profile = profile;
        this.log = log;
    }

    public Response intercept(Chain chain) throws IOException {
        Request req = chain.request();
        ResolvedTarget target = resolve(req);

        Request signed = resign(req, target);

        boolean success = false;
        try {
            Response resp = chain.proceed(signed);
            success = resp.code() == 200;
            return resp;
        } finally {
            if (target.instance != null) {
                profile.updateServiceCallResult(target.instance, success);
            }
        }
    }

    /**
     * Resolves the host to sign for and the URL to connect to. On success,
     * signs for the business domain and connects to the instance IP. On
     * failure, uses cached metadata when available, or the default failover TLD
     * when no successful resolve has been cached yet.
     */
    private ResolvedTarget resolve(Request req) throws IOException {
        URL url = req.url().url();
        String headerHost = req.header("Host");
        String originHost = headerHost != null ? headerHost : url.getHost();

        try {
            InstancesResponse resp = profile.getOneInstance();
            if (resp == null || resp.getInstances() == null || resp.getInstances().length == 0) {
                throw new IOException("GetOneInstance return 0 instance");
            }
            lastSuccess.set(resp);
            Instance instance = resp.getInstances()[0];
            URL instanceUrl = new URL(url.getProtocol(), instance.getHost(), instance.getPort(), url.getFile());
            return new ResolvedTarget(instance, originHost, instanceUrl);
        } catch (PolarisException e) {
            log.info("polaris resolve failed: " + e.getMessage());
            InstancesResponse cached = lastSuccess.get();
            Map<String, String> metadata = (cached != null) ? cached.getMetadata() : null;
            String service = client.getServiceNameForFailover();
            if (service == null || service.isEmpty()) {
                service = serviceOf(originHost);
            }
            String failoverHost = service + "." + polarisFailoverTLD(metadata);
            URL failoverUrl = new URL("https", failoverHost, 443, url.getFile());
            return new ResolvedTarget(null, failoverHost, failoverUrl);
        }
    }

    private Request resign(Request req, ResolvedTarget target) throws IOException {
        try {
            RequestBuilder rb = RequestBuilder.from(req).fromClient(client);
            if (target.url != null) {
                rb.withURL(target.url);
            } else if (target.host != null) {
                rb.withUrlHost(target.host).withUrlSchemeHttps();
            }
            if (target.host != null) {
                rb.withHost(target.host);
            }
            return rb.build();
        } catch (TencentCloudSDKException | IOException e) {
            log.info("polaris re-sign failed: " + e.getMessage());
            throw new IOException("Failed to re-sign request for Polaris failover: " + e.getMessage(), e);
        }
    }

    private static String serviceOf(String host) {
        int dot = host.indexOf('.');
        return dot < 0 ? host : host.substring(0, dot);
    }

    private static final class ResolvedTarget {
        final Instance instance;
        final String host;
        final URL url;

        private ResolvedTarget(Instance instance, String host, URL url) {
            this.instance = instance;
            this.host = host;
            this.url = url;
        }
    }

    static final String DEFAULT_FAILOVER_TLD = "ap-guangzhou.tencentcloudapi.woa.com";

    /**
     * Maps Polaris instance metadata to a failover TLD. Never returns null —
     * falls back to {@link #DEFAULT_FAILOVER_TLD} when metadata is missing,
     * the type is unknown, or a required region is absent.
     */
    static String polarisFailoverTLD(Map<String, String> metadata) {
        if (metadata == null) {
            return DEFAULT_FAILOVER_TLD;
        }
        String type = metadata.get("strip_type");
        String region = metadata.get("region");
        if (type == null) {
            return DEFAULT_FAILOVER_TLD;
        }
        boolean hasRegion = region != null && !region.isEmpty();
        switch (type) {
            case "dfs":
                return "internal.tencentcloudapi.com";
            case "internal":
                return hasRegion ? region + ".tencentcloudapi.woa.com" : DEFAULT_FAILOVER_TLD;
            case "mc":
                return hasRegion ? region + ".api.tencentyun.com" : DEFAULT_FAILOVER_TLD;
            case "trpc":
                return "ai.tencentcloudapi.com";
            case "woa":
                return hasRegion ? region + ".tencentcloudapi.woa.com" : DEFAULT_FAILOVER_TLD;
            default:
                return DEFAULT_FAILOVER_TLD;
        }
    }
}
