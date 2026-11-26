/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneConfig extends AbstractModel {

    /**
    * Intelligent acceleration configuration.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRoutingParameters SmartRouting;

    /**
    * Cache expiration time configuration.
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfigParameters Cache;

    /**
    * Browser cache configuration.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAgeParameters MaxAge;

    /**
    * Node cache key configuration.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKeyConfigParameters CacheKey;

    /**
    * Cache pre-refresh configuration.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefreshParameters CachePrefresh;

    /**
    * Offline cache configuration.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCacheParameters OfflineCache;

    /**
    * Intelligent compression configuration.
    */
    @SerializedName("Compression")
    @Expose
    private CompressionParameters Compression;

    /**
    * Forced HTTPS redirect configuration for access protocols.
    */
    @SerializedName("ForceRedirectHTTPS")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPS;

    /**
    * HSTS configuration.
    */
    @SerializedName("HSTS")
    @Expose
    private HSTSParameters HSTS;

    /**
    * TLS configuration.
    */
    @SerializedName("TLSConfig")
    @Expose
    private TLSConfigParameters TLSConfig;

    /**
    * OCSP stapling configuration.
    */
    @SerializedName("OCSPStapling")
    @Expose
    private OCSPStaplingParameters OCSPStapling;

    /**
    * HTTP/2 configuration.
    */
    @SerializedName("HTTP2")
    @Expose
    private HTTP2Parameters HTTP2;

    /**
    * QUIC access configuration.
    */
    @SerializedName("QUIC")
    @Expose
    private QUICParameters QUIC;

    /**
    * HTTP/2 origin-pull configuration.
    */
    @SerializedName("UpstreamHTTP2")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2;

    /**
    * IPv6 access configuration.
    */
    @SerializedName("IPv6")
    @Expose
    private IPv6Parameters IPv6;

    /**
    * WebSocket configuration.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocketParameters WebSocket;

    /**
    * Configuration for POST request transmission.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSizeParameters PostMaxSize;

    /**
    * Client IP origin-pull request header configuration.
    */
    @SerializedName("ClientIPHeader")
    @Expose
    private ClientIPHeaderParameters ClientIPHeader;

    /**
    * Configuration of whether to carry the regional information of the client IP during origin-pull.
    */
    @SerializedName("ClientIPCountry")
    @Expose
    private ClientIPCountryParameters ClientIPCountry;

    /**
    * The gRPC protocol supports configuration.
    */
    @SerializedName("Grpc")
    @Expose
    private GrpcParameters Grpc;

    /**
    * Network error log configuration.
    */
    @SerializedName("NetworkErrorLogging")
    @Expose
    private NetworkErrorLoggingParameters NetworkErrorLogging;

    /**
    * Acceleration optimization configuration in the Chinese mainland.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainlandParameters AccelerateMainland;

    /**
    * Standard Debug configuration.
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebugParameters StandardDebug;

    /**
     * Get Intelligent acceleration configuration. 
     * @return SmartRouting Intelligent acceleration configuration.
     */
    public SmartRoutingParameters getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Intelligent acceleration configuration.
     * @param SmartRouting Intelligent acceleration configuration.
     */
    public void setSmartRouting(SmartRoutingParameters SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Cache expiration time configuration. 
     * @return Cache Cache expiration time configuration.
     */
    public CacheConfigParameters getCache() {
        return this.Cache;
    }

    /**
     * Set Cache expiration time configuration.
     * @param Cache Cache expiration time configuration.
     */
    public void setCache(CacheConfigParameters Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Browser cache configuration. 
     * @return MaxAge Browser cache configuration.
     */
    public MaxAgeParameters getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration.
     * @param MaxAge Browser cache configuration.
     */
    public void setMaxAge(MaxAgeParameters MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Node cache key configuration. 
     * @return CacheKey Node cache key configuration.
     */
    public CacheKeyConfigParameters getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration.
     * @param CacheKey Node cache key configuration.
     */
    public void setCacheKey(CacheKeyConfigParameters CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Cache pre-refresh configuration. 
     * @return CachePrefresh Cache pre-refresh configuration.
     */
    public CachePrefreshParameters getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set Cache pre-refresh configuration.
     * @param CachePrefresh Cache pre-refresh configuration.
     */
    public void setCachePrefresh(CachePrefreshParameters CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Offline cache configuration. 
     * @return OfflineCache Offline cache configuration.
     */
    public OfflineCacheParameters getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache configuration.
     * @param OfflineCache Offline cache configuration.
     */
    public void setOfflineCache(OfflineCacheParameters OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Intelligent compression configuration. 
     * @return Compression Intelligent compression configuration.
     */
    public CompressionParameters getCompression() {
        return this.Compression;
    }

    /**
     * Set Intelligent compression configuration.
     * @param Compression Intelligent compression configuration.
     */
    public void setCompression(CompressionParameters Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Forced HTTPS redirect configuration for access protocols. 
     * @return ForceRedirectHTTPS Forced HTTPS redirect configuration for access protocols.
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPS() {
        return this.ForceRedirectHTTPS;
    }

    /**
     * Set Forced HTTPS redirect configuration for access protocols.
     * @param ForceRedirectHTTPS Forced HTTPS redirect configuration for access protocols.
     */
    public void setForceRedirectHTTPS(ForceRedirectHTTPSParameters ForceRedirectHTTPS) {
        this.ForceRedirectHTTPS = ForceRedirectHTTPS;
    }

    /**
     * Get HSTS configuration. 
     * @return HSTS HSTS configuration.
     */
    public HSTSParameters getHSTS() {
        return this.HSTS;
    }

    /**
     * Set HSTS configuration.
     * @param HSTS HSTS configuration.
     */
    public void setHSTS(HSTSParameters HSTS) {
        this.HSTS = HSTS;
    }

    /**
     * Get TLS configuration. 
     * @return TLSConfig TLS configuration.
     */
    public TLSConfigParameters getTLSConfig() {
        return this.TLSConfig;
    }

    /**
     * Set TLS configuration.
     * @param TLSConfig TLS configuration.
     */
    public void setTLSConfig(TLSConfigParameters TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    /**
     * Get OCSP stapling configuration. 
     * @return OCSPStapling OCSP stapling configuration.
     */
    public OCSPStaplingParameters getOCSPStapling() {
        return this.OCSPStapling;
    }

    /**
     * Set OCSP stapling configuration.
     * @param OCSPStapling OCSP stapling configuration.
     */
    public void setOCSPStapling(OCSPStaplingParameters OCSPStapling) {
        this.OCSPStapling = OCSPStapling;
    }

    /**
     * Get HTTP/2 configuration. 
     * @return HTTP2 HTTP/2 configuration.
     */
    public HTTP2Parameters getHTTP2() {
        return this.HTTP2;
    }

    /**
     * Set HTTP/2 configuration.
     * @param HTTP2 HTTP/2 configuration.
     */
    public void setHTTP2(HTTP2Parameters HTTP2) {
        this.HTTP2 = HTTP2;
    }

    /**
     * Get QUIC access configuration. 
     * @return QUIC QUIC access configuration.
     */
    public QUICParameters getQUIC() {
        return this.QUIC;
    }

    /**
     * Set QUIC access configuration.
     * @param QUIC QUIC access configuration.
     */
    public void setQUIC(QUICParameters QUIC) {
        this.QUIC = QUIC;
    }

    /**
     * Get HTTP/2 origin-pull configuration. 
     * @return UpstreamHTTP2 HTTP/2 origin-pull configuration.
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2() {
        return this.UpstreamHTTP2;
    }

    /**
     * Set HTTP/2 origin-pull configuration.
     * @param UpstreamHTTP2 HTTP/2 origin-pull configuration.
     */
    public void setUpstreamHTTP2(UpstreamHTTP2Parameters UpstreamHTTP2) {
        this.UpstreamHTTP2 = UpstreamHTTP2;
    }

    /**
     * Get IPv6 access configuration. 
     * @return IPv6 IPv6 access configuration.
     */
    public IPv6Parameters getIPv6() {
        return this.IPv6;
    }

    /**
     * Set IPv6 access configuration.
     * @param IPv6 IPv6 access configuration.
     */
    public void setIPv6(IPv6Parameters IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get WebSocket configuration. 
     * @return WebSocket WebSocket configuration.
     */
    public WebSocketParameters getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
     * @param WebSocket WebSocket configuration.
     */
    public void setWebSocket(WebSocketParameters WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Configuration for POST request transmission. 
     * @return PostMaxSize Configuration for POST request transmission.
     */
    public PostMaxSizeParameters getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set Configuration for POST request transmission.
     * @param PostMaxSize Configuration for POST request transmission.
     */
    public void setPostMaxSize(PostMaxSizeParameters PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Client IP origin-pull request header configuration. 
     * @return ClientIPHeader Client IP origin-pull request header configuration.
     */
    public ClientIPHeaderParameters getClientIPHeader() {
        return this.ClientIPHeader;
    }

    /**
     * Set Client IP origin-pull request header configuration.
     * @param ClientIPHeader Client IP origin-pull request header configuration.
     */
    public void setClientIPHeader(ClientIPHeaderParameters ClientIPHeader) {
        this.ClientIPHeader = ClientIPHeader;
    }

    /**
     * Get Configuration of whether to carry the regional information of the client IP during origin-pull. 
     * @return ClientIPCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
     */
    public ClientIPCountryParameters getClientIPCountry() {
        return this.ClientIPCountry;
    }

    /**
     * Set Configuration of whether to carry the regional information of the client IP during origin-pull.
     * @param ClientIPCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
     */
    public void setClientIPCountry(ClientIPCountryParameters ClientIPCountry) {
        this.ClientIPCountry = ClientIPCountry;
    }

    /**
     * Get The gRPC protocol supports configuration. 
     * @return Grpc The gRPC protocol supports configuration.
     */
    public GrpcParameters getGrpc() {
        return this.Grpc;
    }

    /**
     * Set The gRPC protocol supports configuration.
     * @param Grpc The gRPC protocol supports configuration.
     */
    public void setGrpc(GrpcParameters Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Network error log configuration. 
     * @return NetworkErrorLogging Network error log configuration.
     */
    public NetworkErrorLoggingParameters getNetworkErrorLogging() {
        return this.NetworkErrorLogging;
    }

    /**
     * Set Network error log configuration.
     * @param NetworkErrorLogging Network error log configuration.
     */
    public void setNetworkErrorLogging(NetworkErrorLoggingParameters NetworkErrorLogging) {
        this.NetworkErrorLogging = NetworkErrorLogging;
    }

    /**
     * Get Acceleration optimization configuration in the Chinese mainland. 
     * @return AccelerateMainland Acceleration optimization configuration in the Chinese mainland.
     */
    public AccelerateMainlandParameters getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Acceleration optimization configuration in the Chinese mainland.
     * @param AccelerateMainland Acceleration optimization configuration in the Chinese mainland.
     */
    public void setAccelerateMainland(AccelerateMainlandParameters AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get Standard Debug configuration. 
     * @return StandardDebug Standard Debug configuration.
     */
    public StandardDebugParameters getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set Standard Debug configuration.
     * @param StandardDebug Standard Debug configuration.
     */
    public void setStandardDebug(StandardDebugParameters StandardDebug) {
        this.StandardDebug = StandardDebug;
    }

    public ZoneConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneConfig(ZoneConfig source) {
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRoutingParameters(source.SmartRouting);
        }
        if (source.Cache != null) {
            this.Cache = new CacheConfigParameters(source.Cache);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAgeParameters(source.MaxAge);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKeyConfigParameters(source.CacheKey);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefreshParameters(source.CachePrefresh);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCacheParameters(source.OfflineCache);
        }
        if (source.Compression != null) {
            this.Compression = new CompressionParameters(source.Compression);
        }
        if (source.ForceRedirectHTTPS != null) {
            this.ForceRedirectHTTPS = new ForceRedirectHTTPSParameters(source.ForceRedirectHTTPS);
        }
        if (source.HSTS != null) {
            this.HSTS = new HSTSParameters(source.HSTS);
        }
        if (source.TLSConfig != null) {
            this.TLSConfig = new TLSConfigParameters(source.TLSConfig);
        }
        if (source.OCSPStapling != null) {
            this.OCSPStapling = new OCSPStaplingParameters(source.OCSPStapling);
        }
        if (source.HTTP2 != null) {
            this.HTTP2 = new HTTP2Parameters(source.HTTP2);
        }
        if (source.QUIC != null) {
            this.QUIC = new QUICParameters(source.QUIC);
        }
        if (source.UpstreamHTTP2 != null) {
            this.UpstreamHTTP2 = new UpstreamHTTP2Parameters(source.UpstreamHTTP2);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new IPv6Parameters(source.IPv6);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocketParameters(source.WebSocket);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostMaxSizeParameters(source.PostMaxSize);
        }
        if (source.ClientIPHeader != null) {
            this.ClientIPHeader = new ClientIPHeaderParameters(source.ClientIPHeader);
        }
        if (source.ClientIPCountry != null) {
            this.ClientIPCountry = new ClientIPCountryParameters(source.ClientIPCountry);
        }
        if (source.Grpc != null) {
            this.Grpc = new GrpcParameters(source.Grpc);
        }
        if (source.NetworkErrorLogging != null) {
            this.NetworkErrorLogging = new NetworkErrorLoggingParameters(source.NetworkErrorLogging);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainlandParameters(source.AccelerateMainland);
        }
        if (source.StandardDebug != null) {
            this.StandardDebug = new StandardDebugParameters(source.StandardDebug);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "ForceRedirectHTTPS.", this.ForceRedirectHTTPS);
        this.setParamObj(map, prefix + "HSTS.", this.HSTS);
        this.setParamObj(map, prefix + "TLSConfig.", this.TLSConfig);
        this.setParamObj(map, prefix + "OCSPStapling.", this.OCSPStapling);
        this.setParamObj(map, prefix + "HTTP2.", this.HTTP2);
        this.setParamObj(map, prefix + "QUIC.", this.QUIC);
        this.setParamObj(map, prefix + "UpstreamHTTP2.", this.UpstreamHTTP2);
        this.setParamObj(map, prefix + "IPv6.", this.IPv6);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "ClientIPHeader.", this.ClientIPHeader);
        this.setParamObj(map, prefix + "ClientIPCountry.", this.ClientIPCountry);
        this.setParamObj(map, prefix + "Grpc.", this.Grpc);
        this.setParamObj(map, prefix + "NetworkErrorLogging.", this.NetworkErrorLogging);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);

    }
}

