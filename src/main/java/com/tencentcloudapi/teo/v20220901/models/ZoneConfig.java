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
    * <Intelligent acceleration configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRoutingParameters SmartRouting;

    /**
    * Node cache expiration time configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfigParameters Cache;

    /**
    * Browser cache rule configuration, which is used to set the default value of maxage and is disabled by default.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAgeParameters MaxAge;

    /**
    * The node cache key configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKeyConfigParameters CacheKey;

    /**
    * Cache prefresh configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefreshParameters CachePrefresh;

    /**
    * Offline cache configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCacheParameters OfflineCache;

    /**
    * Smart compression configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Compression")
    @Expose
    private CompressionParameters Compression;

    /**
    * Forced https redirect configuration for access protocols.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ForceRedirectHTTPS")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPS;

    /**
    * HSTS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HSTS")
    @Expose
    private HSTSParameters HSTS;

    /**
    * TLS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("TLSConfig")
    @Expose
    private TLSConfigParameters TLSConfig;

    /**
    * OCSP stapling configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OCSPStapling")
    @Expose
    private OCSPStaplingParameters OCSPStapling;

    /**
    * HTTP/2 configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HTTP2")
    @Expose
    private HTTP2Parameters HTTP2;

    /**
    * QUIC access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("QUIC")
    @Expose
    private QUICParameters QUIC;

    /**
    * HTTP2 origin-pull configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("UpstreamHTTP2")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2;

    /**
    * IPv6 access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("IPv6")
    @Expose
    private IPv6Parameters IPv6;

    /**
    * WebSocket configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocketParameters WebSocket;

    /**
    * POST request transport configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSizeParameters PostMaxSize;

    /**
    * Client ip origin-pull request header configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ClientIPHeader")
    @Expose
    private ClientIPHeaderParameters ClientIPHeader;

    /**
    * Whether to carry the region information of the client ip during origin-pull.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ClientIPCountry")
    @Expose
    private ClientIPCountryParameters ClientIPCountry;

    /**
    * Configuration of grpc support.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Grpc")
    @Expose
    private GrpcParameters Grpc;

    /**
    * Accelerate optimization and configuration in mainland china.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainlandParameters AccelerateMainland;

    /**
    * Standard debugging configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebugParameters StandardDebug;

    /**
     * Get <Intelligent acceleration configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return SmartRouting <Intelligent acceleration configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public SmartRoutingParameters getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set <Intelligent acceleration configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param SmartRouting <Intelligent acceleration configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setSmartRouting(SmartRoutingParameters SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Node cache expiration time configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Cache Node cache expiration time configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheConfigParameters getCache() {
        return this.Cache;
    }

    /**
     * Set Node cache expiration time configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Cache Node cache expiration time configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCache(CacheConfigParameters Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Browser cache rule configuration, which is used to set the default value of maxage and is disabled by default.
.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return MaxAge Browser cache rule configuration, which is used to set the default value of maxage and is disabled by default.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public MaxAgeParameters getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache rule configuration, which is used to set the default value of maxage and is disabled by default.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param MaxAge Browser cache rule configuration, which is used to set the default value of maxage and is disabled by default.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setMaxAge(MaxAgeParameters MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get The node cache key configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CacheKey The node cache key configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheKeyConfigParameters getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set The node cache key configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CacheKey The node cache key configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCacheKey(CacheKeyConfigParameters CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Cache prefresh configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CachePrefresh Cache prefresh configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CachePrefreshParameters getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set Cache prefresh configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CachePrefresh Cache prefresh configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCachePrefresh(CachePrefreshParameters CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Offline cache configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return OfflineCache Offline cache configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public OfflineCacheParameters getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param OfflineCache Offline cache configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOfflineCache(OfflineCacheParameters OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Smart compression configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Compression Smart compression configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CompressionParameters getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Compression Smart compression configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCompression(CompressionParameters Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Forced https redirect configuration for access protocols.
.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ForceRedirectHTTPS Forced https redirect configuration for access protocols.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPS() {
        return this.ForceRedirectHTTPS;
    }

    /**
     * Set Forced https redirect configuration for access protocols.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ForceRedirectHTTPS Forced https redirect configuration for access protocols.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setForceRedirectHTTPS(ForceRedirectHTTPSParameters ForceRedirectHTTPS) {
        this.ForceRedirectHTTPS = ForceRedirectHTTPS;
    }

    /**
     * Get HSTS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HSTS HSTS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HSTSParameters getHSTS() {
        return this.HSTS;
    }

    /**
     * Set HSTS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HSTS HSTS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHSTS(HSTSParameters HSTS) {
        this.HSTS = HSTS;
    }

    /**
     * Get TLS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return TLSConfig TLS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public TLSConfigParameters getTLSConfig() {
        return this.TLSConfig;
    }

    /**
     * Set TLS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param TLSConfig TLS configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setTLSConfig(TLSConfigParameters TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    /**
     * Get OCSP stapling configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return OCSPStapling OCSP stapling configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public OCSPStaplingParameters getOCSPStapling() {
        return this.OCSPStapling;
    }

    /**
     * Set OCSP stapling configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param OCSPStapling OCSP stapling configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOCSPStapling(OCSPStaplingParameters OCSPStapling) {
        this.OCSPStapling = OCSPStapling;
    }

    /**
     * Get HTTP/2 configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HTTP2 HTTP/2 configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HTTP2Parameters getHTTP2() {
        return this.HTTP2;
    }

    /**
     * Set HTTP/2 configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HTTP2 HTTP/2 configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHTTP2(HTTP2Parameters HTTP2) {
        this.HTTP2 = HTTP2;
    }

    /**
     * Get QUIC access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return QUIC QUIC access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public QUICParameters getQUIC() {
        return this.QUIC;
    }

    /**
     * Set QUIC access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param QUIC QUIC access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setQUIC(QUICParameters QUIC) {
        this.QUIC = QUIC;
    }

    /**
     * Get HTTP2 origin-pull configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return UpstreamHTTP2 HTTP2 origin-pull configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2() {
        return this.UpstreamHTTP2;
    }

    /**
     * Set HTTP2 origin-pull configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param UpstreamHTTP2 HTTP2 origin-pull configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setUpstreamHTTP2(UpstreamHTTP2Parameters UpstreamHTTP2) {
        this.UpstreamHTTP2 = UpstreamHTTP2;
    }

    /**
     * Get IPv6 access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return IPv6 IPv6 access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public IPv6Parameters getIPv6() {
        return this.IPv6;
    }

    /**
     * Set IPv6 access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param IPv6 IPv6 access configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setIPv6(IPv6Parameters IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get WebSocket configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return WebSocket WebSocket configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public WebSocketParameters getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param WebSocket WebSocket configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setWebSocket(WebSocketParameters WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get POST request transport configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return PostMaxSize POST request transport configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public PostMaxSizeParameters getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST request transport configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param PostMaxSize POST request transport configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setPostMaxSize(PostMaxSizeParameters PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Client ip origin-pull request header configuration.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ClientIPHeader Client ip origin-pull request header configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ClientIPHeaderParameters getClientIPHeader() {
        return this.ClientIPHeader;
    }

    /**
     * Set Client ip origin-pull request header configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ClientIPHeader Client ip origin-pull request header configuration.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setClientIPHeader(ClientIPHeaderParameters ClientIPHeader) {
        this.ClientIPHeader = ClientIPHeader;
    }

    /**
     * Get Whether to carry the region information of the client ip during origin-pull.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ClientIPCountry Whether to carry the region information of the client ip during origin-pull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ClientIPCountryParameters getClientIPCountry() {
        return this.ClientIPCountry;
    }

    /**
     * Set Whether to carry the region information of the client ip during origin-pull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ClientIPCountry Whether to carry the region information of the client ip during origin-pull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setClientIPCountry(ClientIPCountryParameters ClientIPCountry) {
        this.ClientIPCountry = ClientIPCountry;
    }

    /**
     * Get Configuration of grpc support.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Grpc Configuration of grpc support.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public GrpcParameters getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Configuration of grpc support.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Grpc Configuration of grpc support.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setGrpc(GrpcParameters Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Accelerate optimization and configuration in mainland china.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return AccelerateMainland Accelerate optimization and configuration in mainland china.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public AccelerateMainlandParameters getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Accelerate optimization and configuration in mainland china.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param AccelerateMainland Accelerate optimization and configuration in mainland china.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAccelerateMainland(AccelerateMainlandParameters AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get Standard debugging configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return StandardDebug Standard debugging configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public StandardDebugParameters getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set Standard debugging configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param StandardDebug Standard debugging configuration.
.
Note: this field may return null, which indicates a failure to obtain a valid value.
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
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);

    }
}

