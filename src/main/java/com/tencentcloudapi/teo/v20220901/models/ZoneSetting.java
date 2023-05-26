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

public class ZoneSetting extends AbstractModel{

    /**
    * Name of the site
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Site acceleration region. Values:
<li>`mainland`: Acceleration in the Chinese mainland.</li>
<li>`overseas`: Acceleration outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Node cache key configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * The QUIC access configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * The POST transport configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * Smart compression configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * HTTP2 origin-pull configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Force HTTPS redirect configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Cache expiration time configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * Origin server configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Smart acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * Browser cache configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * The offline cache configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * WebSocket configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Origin-pull client IP header configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIpHeader ClientIpHeader;

    /**
    * Cache prefresh configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * IPv6 access configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * HTTPS acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
    * Configuration of gRPC support
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Grpc")
    @Expose
    private Grpc Grpc;

    /**
    * Image optimization configuration. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ImageOptimize")
    @Expose
    private ImageOptimize ImageOptimize;

    /**
    * 
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

    /**
     * Get Name of the site 
     * @return ZoneName Name of the site
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the site
     * @param ZoneName Name of the site
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Site acceleration region. Values:
<li>`mainland`: Acceleration in the Chinese mainland.</li>
<li>`overseas`: Acceleration outside the Chinese mainland.</li> 
     * @return Area Site acceleration region. Values:
<li>`mainland`: Acceleration in the Chinese mainland.</li>
<li>`overseas`: Acceleration outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Site acceleration region. Values:
<li>`mainland`: Acceleration in the Chinese mainland.</li>
<li>`overseas`: Acceleration outside the Chinese mainland.</li>
     * @param Area Site acceleration region. Values:
<li>`mainland`: Acceleration in the Chinese mainland.</li>
<li>`overseas`: Acceleration outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Node cache key configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheKey Node cache key configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheKey Node cache key configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get The QUIC access configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quic The QUIC access configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set The QUIC access configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quic The QUIC access configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get The POST transport configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PostMaxSize The POST transport configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set The POST transport configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PostMaxSize The POST transport configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Smart compression configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compression Smart compression configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compression Smart compression configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get HTTP2 origin-pull configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamHttp2 HTTP2 origin-pull configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set HTTP2 origin-pull configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamHttp2 HTTP2 origin-pull configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Force HTTPS redirect configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForceRedirect Force HTTPS redirect configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Force HTTPS redirect configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForceRedirect Force HTTPS redirect configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Cache expiration time configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheConfig Cache expiration time configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache expiration time configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheConfig Cache expiration time configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get Origin server configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Origin Origin server configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Origin Origin server configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Smart acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SmartRouting Smart acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Smart acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SmartRouting Smart acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Browser cache configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxAge Browser cache configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxAge Browser cache configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get The offline cache configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OfflineCache The offline cache configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set The offline cache configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OfflineCache The offline cache configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get WebSocket configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WebSocket WebSocket configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WebSocket WebSocket configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Origin-pull client IP header configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIpHeader Origin-pull client IP header configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClientIpHeader getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Origin-pull client IP header configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIpHeader Origin-pull client IP header configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIpHeader(ClientIpHeader ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get Cache prefresh configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CachePrefresh Cache prefresh configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set Cache prefresh configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CachePrefresh Cache prefresh configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get IPv6 access configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6 IPv6 access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv6 IPv6 access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get HTTPS acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Https HTTPS acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Https HTTPS acceleration configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClientIpCountry Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClientIpCountry Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    /**
     * Get Configuration of gRPC support
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Grpc Configuration of gRPC support
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Grpc getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Configuration of gRPC support
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Grpc Configuration of gRPC support
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setGrpc(Grpc Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Image optimization configuration. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ImageOptimize Image optimization configuration. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ImageOptimize getImageOptimize() {
        return this.ImageOptimize;
    }

    /**
     * Set Image optimization configuration. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param ImageOptimize Image optimization configuration. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setImageOptimize(ImageOptimize ImageOptimize) {
        this.ImageOptimize = ImageOptimize;
    }

    /**
     * Get  
     * @return AccelerateMainland 
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set 
     * @param AccelerateMainland 
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    public ZoneSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneSetting(ZoneSetting source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
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
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
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
        if (source.Https != null) {
            this.Https = new Https(source.Https);
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
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "UpstreamHttp2.", this.UpstreamHttp2);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "ClientIpCountry.", this.ClientIpCountry);
        this.setParamObj(map, prefix + "Grpc.", this.Grpc);
        this.setParamObj(map, prefix + "ImageOptimize.", this.ImageOptimize);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);

    }
}

