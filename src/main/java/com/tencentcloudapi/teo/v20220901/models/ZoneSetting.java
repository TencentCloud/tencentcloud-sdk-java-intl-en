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

public class ZoneSetting extends AbstractModel {

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Site acceleration region info. Valid values:
<li>mainland: domestic acceleration in China;</li>
<li> overseas: acceleration outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Node cache key configuration.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Quic access configuration.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * HTTP POST request transmission configuration.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * Intelligent compression configuration.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Http/2 origin-pull configuration.
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Access protocol mandatory Https redirection configuration.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Cache expiration time configuration.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * Origin server configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Smart acceleration configuration.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * Browser cache configuration.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Offline cache configuration.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * WebSocket configuration.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Client IP HTTP Request Headers configuration.
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIpHeader ClientIpHeader;

    /**
    * Cache pre-refresh configuration.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * Ipv6 access configuration.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Https acceleration configuration.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Configuration of whether to carry the regional information of the client IP during origin-pull.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
    * Grpc protocol supports configuration.
    */
    @SerializedName("Grpc")
    @Expose
    private Grpc Grpc;

    /**
    * Network error log configuration.
    */
    @SerializedName("NetworkErrorLogging")
    @Expose
    private NetworkErrorLogging NetworkErrorLogging;

    /**
    * Image optimization configuration.
    */
    @SerializedName("ImageOptimize")
    @Expose
    private ImageOptimize ImageOptimize;

    /**
    * Acceleration optimization configuration for the Chinese mainland.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

    /**
    * Standard Debug configuration.
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebug StandardDebug;

    /**
    * Just-in-time media processing configuration.
    */
    @SerializedName("JITVideoProcess")
    @Expose
    private JITVideoProcess JITVideoProcess;

    /**
     * Get Site name. 
     * @return ZoneName Site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name.
     * @param ZoneName Site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Site acceleration region info. Valid values:
<li>mainland: domestic acceleration in China;</li>
<li> overseas: acceleration outside the Chinese mainland.</li> 
     * @return Area Site acceleration region info. Valid values:
<li>mainland: domestic acceleration in China;</li>
<li> overseas: acceleration outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Site acceleration region info. Valid values:
<li>mainland: domestic acceleration in China;</li>
<li> overseas: acceleration outside the Chinese mainland.</li>
     * @param Area Site acceleration region info. Valid values:
<li>mainland: domestic acceleration in China;</li>
<li> overseas: acceleration outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Node cache key configuration. 
     * @return CacheKey Node cache key configuration.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration.
     * @param CacheKey Node cache key configuration.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Quic access configuration. 
     * @return Quic Quic access configuration.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic access configuration.
     * @param Quic Quic access configuration.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get HTTP POST request transmission configuration. 
     * @return PostMaxSize HTTP POST request transmission configuration.
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set HTTP POST request transmission configuration.
     * @param PostMaxSize HTTP POST request transmission configuration.
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Intelligent compression configuration. 
     * @return Compression Intelligent compression configuration.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Intelligent compression configuration.
     * @param Compression Intelligent compression configuration.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Http/2 origin-pull configuration. 
     * @return UpstreamHttp2 Http/2 origin-pull configuration.
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set Http/2 origin-pull configuration.
     * @param UpstreamHttp2 Http/2 origin-pull configuration.
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Access protocol mandatory Https redirection configuration. 
     * @return ForceRedirect Access protocol mandatory Https redirection configuration.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol mandatory Https redirection configuration.
     * @param ForceRedirect Access protocol mandatory Https redirection configuration.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Cache expiration time configuration. 
     * @return CacheConfig Cache expiration time configuration.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache expiration time configuration.
     * @param CacheConfig Cache expiration time configuration.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get Origin server configuration. 
     * @return Origin Origin server configuration.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
     * @param Origin Origin server configuration.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Smart acceleration configuration. 
     * @return SmartRouting Smart acceleration configuration.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Smart acceleration configuration.
     * @param SmartRouting Smart acceleration configuration.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Browser cache configuration. 
     * @return MaxAge Browser cache configuration.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration.
     * @param MaxAge Browser cache configuration.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Offline cache configuration. 
     * @return OfflineCache Offline cache configuration.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache configuration.
     * @param OfflineCache Offline cache configuration.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get WebSocket configuration. 
     * @return WebSocket WebSocket configuration.
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
     * @param WebSocket WebSocket configuration.
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Client IP HTTP Request Headers configuration. 
     * @return ClientIpHeader Client IP HTTP Request Headers configuration.
     */
    public ClientIpHeader getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Client IP HTTP Request Headers configuration.
     * @param ClientIpHeader Client IP HTTP Request Headers configuration.
     */
    public void setClientIpHeader(ClientIpHeader ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get Cache pre-refresh configuration. 
     * @return CachePrefresh Cache pre-refresh configuration.
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set Cache pre-refresh configuration.
     * @param CachePrefresh Cache pre-refresh configuration.
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Ipv6 access configuration. 
     * @return Ipv6 Ipv6 access configuration.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration.
     * @param Ipv6 Ipv6 access configuration.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Https acceleration configuration. 
     * @return Https Https acceleration configuration.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https acceleration configuration.
     * @param Https Https acceleration configuration.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Configuration of whether to carry the regional information of the client IP during origin-pull. 
     * @return ClientIpCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Configuration of whether to carry the regional information of the client IP during origin-pull.
     * @param ClientIpCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    /**
     * Get Grpc protocol supports configuration. 
     * @return Grpc Grpc protocol supports configuration.
     */
    public Grpc getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Grpc protocol supports configuration.
     * @param Grpc Grpc protocol supports configuration.
     */
    public void setGrpc(Grpc Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Network error log configuration. 
     * @return NetworkErrorLogging Network error log configuration.
     */
    public NetworkErrorLogging getNetworkErrorLogging() {
        return this.NetworkErrorLogging;
    }

    /**
     * Set Network error log configuration.
     * @param NetworkErrorLogging Network error log configuration.
     */
    public void setNetworkErrorLogging(NetworkErrorLogging NetworkErrorLogging) {
        this.NetworkErrorLogging = NetworkErrorLogging;
    }

    /**
     * Get Image optimization configuration. 
     * @return ImageOptimize Image optimization configuration.
     */
    public ImageOptimize getImageOptimize() {
        return this.ImageOptimize;
    }

    /**
     * Set Image optimization configuration.
     * @param ImageOptimize Image optimization configuration.
     */
    public void setImageOptimize(ImageOptimize ImageOptimize) {
        this.ImageOptimize = ImageOptimize;
    }

    /**
     * Get Acceleration optimization configuration for the Chinese mainland. 
     * @return AccelerateMainland Acceleration optimization configuration for the Chinese mainland.
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Acceleration optimization configuration for the Chinese mainland.
     * @param AccelerateMainland Acceleration optimization configuration for the Chinese mainland.
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get Standard Debug configuration. 
     * @return StandardDebug Standard Debug configuration.
     */
    public StandardDebug getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set Standard Debug configuration.
     * @param StandardDebug Standard Debug configuration.
     */
    public void setStandardDebug(StandardDebug StandardDebug) {
        this.StandardDebug = StandardDebug;
    }

    /**
     * Get Just-in-time media processing configuration. 
     * @return JITVideoProcess Just-in-time media processing configuration.
     */
    public JITVideoProcess getJITVideoProcess() {
        return this.JITVideoProcess;
    }

    /**
     * Set Just-in-time media processing configuration.
     * @param JITVideoProcess Just-in-time media processing configuration.
     */
    public void setJITVideoProcess(JITVideoProcess JITVideoProcess) {
        this.JITVideoProcess = JITVideoProcess;
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
        if (source.NetworkErrorLogging != null) {
            this.NetworkErrorLogging = new NetworkErrorLogging(source.NetworkErrorLogging);
        }
        if (source.ImageOptimize != null) {
            this.ImageOptimize = new ImageOptimize(source.ImageOptimize);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
        if (source.StandardDebug != null) {
            this.StandardDebug = new StandardDebug(source.StandardDebug);
        }
        if (source.JITVideoProcess != null) {
            this.JITVideoProcess = new JITVideoProcess(source.JITVideoProcess);
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
        this.setParamObj(map, prefix + "NetworkErrorLogging.", this.NetworkErrorLogging);
        this.setParamObj(map, prefix + "ImageOptimize.", this.ImageOptimize);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);
        this.setParamObj(map, prefix + "JITVideoProcess.", this.JITVideoProcess);

    }
}

