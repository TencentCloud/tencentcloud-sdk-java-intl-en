/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneSettingRequest extends AbstractModel{

    /**
    * Site ID to modify.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Cache expiration time configuration
The original configuration will apply if this field is not specified.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * The node cache key configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * The browser cache configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * The offline cache configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * QUIC access configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * POST transport configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * The smart compression configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * HTTP2 origin-pull configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Force HTTPS redirect configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * HTTPS acceleration configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * The origin server configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * The smart acceleration configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * WebSocket configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Origin-pull client IP header configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIpHeader ClientIpHeader;

    /**
    * The cache prefresh configuration.
The original configuration will apply if this field is not specified.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * Ipv6 access configuration. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Whether to carry the location information of the client IP during origin-pull. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
    * Configuration of gRPC support. 
The original configuration will apply if it is not specified.
    */
    @SerializedName("Grpc")
    @Expose
    private Grpc Grpc;

    /**
    * Image optimization. 
It is disabled if this parameter is not specified.
    */
    @SerializedName("ImageOptimize")
    @Expose
    private ImageOptimize ImageOptimize;

    /**
    * 
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebug StandardDebug;

    /**
     * Get Site ID to modify. 
     * @return ZoneId Site ID to modify.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID to modify.
     * @param ZoneId Site ID to modify.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Cache expiration time configuration
The original configuration will apply if this field is not specified. 
     * @return CacheConfig Cache expiration time configuration
The original configuration will apply if this field is not specified.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache expiration time configuration
The original configuration will apply if this field is not specified.
     * @param CacheConfig Cache expiration time configuration
The original configuration will apply if this field is not specified.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get The node cache key configuration.
The original configuration will apply if this field is not specified. 
     * @return CacheKey The node cache key configuration.
The original configuration will apply if this field is not specified.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set The node cache key configuration.
The original configuration will apply if this field is not specified.
     * @param CacheKey The node cache key configuration.
The original configuration will apply if this field is not specified.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get The browser cache configuration.
The original configuration will apply if this field is not specified. 
     * @return MaxAge The browser cache configuration.
The original configuration will apply if this field is not specified.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set The browser cache configuration.
The original configuration will apply if this field is not specified.
     * @param MaxAge The browser cache configuration.
The original configuration will apply if this field is not specified.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get The offline cache configuration.
The original configuration will apply if this field is not specified. 
     * @return OfflineCache The offline cache configuration.
The original configuration will apply if this field is not specified.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set The offline cache configuration.
The original configuration will apply if this field is not specified.
     * @param OfflineCache The offline cache configuration.
The original configuration will apply if this field is not specified.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get QUIC access configuration. 
The original configuration will apply if it is not specified. 
     * @return Quic QUIC access configuration. 
The original configuration will apply if it is not specified.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC access configuration. 
The original configuration will apply if it is not specified.
     * @param Quic QUIC access configuration. 
The original configuration will apply if it is not specified.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get POST transport configuration. 
The original configuration will apply if it is not specified. 
     * @return PostMaxSize POST transport configuration. 
The original configuration will apply if it is not specified.
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST transport configuration. 
The original configuration will apply if it is not specified.
     * @param PostMaxSize POST transport configuration. 
The original configuration will apply if it is not specified.
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get The smart compression configuration.
The original configuration will apply if this field is not specified. 
     * @return Compression The smart compression configuration.
The original configuration will apply if this field is not specified.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set The smart compression configuration.
The original configuration will apply if this field is not specified.
     * @param Compression The smart compression configuration.
The original configuration will apply if this field is not specified.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get HTTP2 origin-pull configuration. 
The original configuration will apply if it is not specified. 
     * @return UpstreamHttp2 HTTP2 origin-pull configuration. 
The original configuration will apply if it is not specified.
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set HTTP2 origin-pull configuration. 
The original configuration will apply if it is not specified.
     * @param UpstreamHttp2 HTTP2 origin-pull configuration. 
The original configuration will apply if it is not specified.
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Force HTTPS redirect configuration. 
The original configuration will apply if it is not specified. 
     * @return ForceRedirect Force HTTPS redirect configuration. 
The original configuration will apply if it is not specified.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Force HTTPS redirect configuration. 
The original configuration will apply if it is not specified.
     * @param ForceRedirect Force HTTPS redirect configuration. 
The original configuration will apply if it is not specified.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get HTTPS acceleration configuration. 
The original configuration will apply if it is not specified. 
     * @return Https HTTPS acceleration configuration. 
The original configuration will apply if it is not specified.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS acceleration configuration. 
The original configuration will apply if it is not specified.
     * @param Https HTTPS acceleration configuration. 
The original configuration will apply if it is not specified.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get The origin server configuration.
The original configuration will apply if this field is not specified. 
     * @return Origin The origin server configuration.
The original configuration will apply if this field is not specified.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set The origin server configuration.
The original configuration will apply if this field is not specified.
     * @param Origin The origin server configuration.
The original configuration will apply if this field is not specified.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get The smart acceleration configuration.
The original configuration will apply if this field is not specified. 
     * @return SmartRouting The smart acceleration configuration.
The original configuration will apply if this field is not specified.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set The smart acceleration configuration.
The original configuration will apply if this field is not specified.
     * @param SmartRouting The smart acceleration configuration.
The original configuration will apply if this field is not specified.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get WebSocket configuration. 
The original configuration will apply if it is not specified. 
     * @return WebSocket WebSocket configuration. 
The original configuration will apply if it is not specified.
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration. 
The original configuration will apply if it is not specified.
     * @param WebSocket WebSocket configuration. 
The original configuration will apply if it is not specified.
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Origin-pull client IP header configuration. 
The original configuration will apply if it is not specified. 
     * @return ClientIpHeader Origin-pull client IP header configuration. 
The original configuration will apply if it is not specified.
     */
    public ClientIpHeader getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Origin-pull client IP header configuration. 
The original configuration will apply if it is not specified.
     * @param ClientIpHeader Origin-pull client IP header configuration. 
The original configuration will apply if it is not specified.
     */
    public void setClientIpHeader(ClientIpHeader ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get The cache prefresh configuration.
The original configuration will apply if this field is not specified. 
     * @return CachePrefresh The cache prefresh configuration.
The original configuration will apply if this field is not specified.
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set The cache prefresh configuration.
The original configuration will apply if this field is not specified.
     * @param CachePrefresh The cache prefresh configuration.
The original configuration will apply if this field is not specified.
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Ipv6 access configuration. 
The original configuration will apply if it is not specified. 
     * @return Ipv6 Ipv6 access configuration. 
The original configuration will apply if it is not specified.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration. 
The original configuration will apply if it is not specified.
     * @param Ipv6 Ipv6 access configuration. 
The original configuration will apply if it is not specified.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether to carry the location information of the client IP during origin-pull. 
The original configuration will apply if it is not specified. 
     * @return ClientIpCountry Whether to carry the location information of the client IP during origin-pull. 
The original configuration will apply if it is not specified.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Whether to carry the location information of the client IP during origin-pull. 
The original configuration will apply if it is not specified.
     * @param ClientIpCountry Whether to carry the location information of the client IP during origin-pull. 
The original configuration will apply if it is not specified.
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    /**
     * Get Configuration of gRPC support. 
The original configuration will apply if it is not specified. 
     * @return Grpc Configuration of gRPC support. 
The original configuration will apply if it is not specified.
     */
    public Grpc getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Configuration of gRPC support. 
The original configuration will apply if it is not specified.
     * @param Grpc Configuration of gRPC support. 
The original configuration will apply if it is not specified.
     */
    public void setGrpc(Grpc Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Image optimization. 
It is disabled if this parameter is not specified. 
     * @return ImageOptimize Image optimization. 
It is disabled if this parameter is not specified.
     */
    public ImageOptimize getImageOptimize() {
        return this.ImageOptimize;
    }

    /**
     * Set Image optimization. 
It is disabled if this parameter is not specified.
     * @param ImageOptimize Image optimization. 
It is disabled if this parameter is not specified.
     */
    public void setImageOptimize(ImageOptimize ImageOptimize) {
        this.ImageOptimize = ImageOptimize;
    }

    /**
     * Get  
     * @return StandardDebug 
     */
    public StandardDebug getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set 
     * @param StandardDebug 
     */
    public void setStandardDebug(StandardDebug StandardDebug) {
        this.StandardDebug = StandardDebug;
    }

    public ModifyZoneSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneSettingRequest(ModifyZoneSettingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.Quic != null) {
            this.Quic = new Quic(source.Quic);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostMaxSize(source.PostMaxSize);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.UpstreamHttp2 != null) {
            this.UpstreamHttp2 = new UpstreamHttp2(source.UpstreamHttp2);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.ClientIpHeader != null) {
            this.ClientIpHeader = new ClientIpHeader(source.ClientIpHeader);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefresh(source.CachePrefresh);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.ClientIpCountry != null) {
            this.ClientIpCountry = new ClientIpCountry(source.ClientIpCountry);
        }
        if (source.Grpc != null) {
            this.Grpc = new Grpc(source.Grpc);
        }
        if (source.ImageOptimize != null) {
            this.ImageOptimize = new ImageOptimize(source.ImageOptimize);
        }
        if (source.StandardDebug != null) {
            this.StandardDebug = new StandardDebug(source.StandardDebug);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "UpstreamHttp2.", this.UpstreamHttp2);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "ClientIpCountry.", this.ClientIpCountry);
        this.setParamObj(map, prefix + "Grpc.", this.Grpc);
        this.setParamObj(map, prefix + "ImageOptimize.", this.ImageOptimize);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);

    }
}

