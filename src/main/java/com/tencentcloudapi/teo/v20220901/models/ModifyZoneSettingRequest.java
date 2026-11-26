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

public class ModifyZoneSettingRequest extends AbstractModel {

    /**
    * Site ID to be changed.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Cache expiration time configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * Node cache key configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Browser cache configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Offline cache configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * Quic access configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Configuration for Post request transmission.
Leave blank to retain the original configuration.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * Intelligent compression configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Http2 origin-pull configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Access protocol forcing Https redirection configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Https acceleration configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Origin server configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Intelligent acceleration configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * WebSocket configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Client IP origin-pull request header configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIpHeader ClientIpHeader;

    /**
    * Cache pre-refresh configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * Ipv6 access configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Configuration of whether to carry the regional information of the client IP during origin-pull.
Leave blank to retain the original configuration.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
    * Grpc protocol support configuration.
Leave blank to retain the original configuration.
    */
    @SerializedName("Grpc")
    @Expose
    private Grpc Grpc;

    /**
    * Network error log configuration. If this field is not specified, the original configuration will be retained.
    */
    @SerializedName("NetworkErrorLogging")
    @Expose
    private NetworkErrorLogging NetworkErrorLogging;

    /**
    * Image optimization configuration.
Not specified: disabled.
    */
    @SerializedName("ImageOptimize")
    @Expose
    private ImageOptimize ImageOptimize;

    /**
    * Standard Debug configuration.
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebug StandardDebug;

    /**
    * Just-in-time media processing configuration. The original configuration applies if this field is not specified.
    */
    @SerializedName("JITVideoProcess")
    @Expose
    private JITVideoProcess JITVideoProcess;

    /**
     * Get Site ID to be changed. 
     * @return ZoneId Site ID to be changed.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID to be changed.
     * @param ZoneId Site ID to be changed.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Cache expiration time configuration.
Leave blank to retain the original configuration. 
     * @return CacheConfig Cache expiration time configuration.
Leave blank to retain the original configuration.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache expiration time configuration.
Leave blank to retain the original configuration.
     * @param CacheConfig Cache expiration time configuration.
Leave blank to retain the original configuration.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get Node cache key configuration.
Leave blank to retain the original configuration. 
     * @return CacheKey Node cache key configuration.
Leave blank to retain the original configuration.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration.
Leave blank to retain the original configuration.
     * @param CacheKey Node cache key configuration.
Leave blank to retain the original configuration.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Browser cache configuration.
Leave blank to retain the original configuration. 
     * @return MaxAge Browser cache configuration.
Leave blank to retain the original configuration.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration.
Leave blank to retain the original configuration.
     * @param MaxAge Browser cache configuration.
Leave blank to retain the original configuration.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Offline cache configuration.
Leave blank to retain the original configuration. 
     * @return OfflineCache Offline cache configuration.
Leave blank to retain the original configuration.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache configuration.
Leave blank to retain the original configuration.
     * @param OfflineCache Offline cache configuration.
Leave blank to retain the original configuration.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Quic access configuration.
Leave blank to retain the original configuration. 
     * @return Quic Quic access configuration.
Leave blank to retain the original configuration.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic access configuration.
Leave blank to retain the original configuration.
     * @param Quic Quic access configuration.
Leave blank to retain the original configuration.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Configuration for Post request transmission.
Leave blank to retain the original configuration. 
     * @return PostMaxSize Configuration for Post request transmission.
Leave blank to retain the original configuration.
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set Configuration for Post request transmission.
Leave blank to retain the original configuration.
     * @param PostMaxSize Configuration for Post request transmission.
Leave blank to retain the original configuration.
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Intelligent compression configuration.
Leave blank to retain the original configuration. 
     * @return Compression Intelligent compression configuration.
Leave blank to retain the original configuration.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Intelligent compression configuration.
Leave blank to retain the original configuration.
     * @param Compression Intelligent compression configuration.
Leave blank to retain the original configuration.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Http2 origin-pull configuration.
Leave blank to retain the original configuration. 
     * @return UpstreamHttp2 Http2 origin-pull configuration.
Leave blank to retain the original configuration.
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set Http2 origin-pull configuration.
Leave blank to retain the original configuration.
     * @param UpstreamHttp2 Http2 origin-pull configuration.
Leave blank to retain the original configuration.
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Access protocol forcing Https redirection configuration.
Leave blank to retain the original configuration. 
     * @return ForceRedirect Access protocol forcing Https redirection configuration.
Leave blank to retain the original configuration.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol forcing Https redirection configuration.
Leave blank to retain the original configuration.
     * @param ForceRedirect Access protocol forcing Https redirection configuration.
Leave blank to retain the original configuration.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Https acceleration configuration.
Leave blank to retain the original configuration. 
     * @return Https Https acceleration configuration.
Leave blank to retain the original configuration.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https acceleration configuration.
Leave blank to retain the original configuration.
     * @param Https Https acceleration configuration.
Leave blank to retain the original configuration.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Origin server configuration.
Leave blank to retain the original configuration. 
     * @return Origin Origin server configuration.
Leave blank to retain the original configuration.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
Leave blank to retain the original configuration.
     * @param Origin Origin server configuration.
Leave blank to retain the original configuration.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Intelligent acceleration configuration.
Leave blank to retain the original configuration. 
     * @return SmartRouting Intelligent acceleration configuration.
Leave blank to retain the original configuration.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Intelligent acceleration configuration.
Leave blank to retain the original configuration.
     * @param SmartRouting Intelligent acceleration configuration.
Leave blank to retain the original configuration.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get WebSocket configuration.
Leave blank to retain the original configuration. 
     * @return WebSocket WebSocket configuration.
Leave blank to retain the original configuration.
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
Leave blank to retain the original configuration.
     * @param WebSocket WebSocket configuration.
Leave blank to retain the original configuration.
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Client IP origin-pull request header configuration.
Leave blank to retain the original configuration. 
     * @return ClientIpHeader Client IP origin-pull request header configuration.
Leave blank to retain the original configuration.
     */
    public ClientIpHeader getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Client IP origin-pull request header configuration.
Leave blank to retain the original configuration.
     * @param ClientIpHeader Client IP origin-pull request header configuration.
Leave blank to retain the original configuration.
     */
    public void setClientIpHeader(ClientIpHeader ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get Cache pre-refresh configuration.
Leave blank to retain the original configuration. 
     * @return CachePrefresh Cache pre-refresh configuration.
Leave blank to retain the original configuration.
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set Cache pre-refresh configuration.
Leave blank to retain the original configuration.
     * @param CachePrefresh Cache pre-refresh configuration.
Leave blank to retain the original configuration.
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Ipv6 access configuration.
Leave blank to retain the original configuration. 
     * @return Ipv6 Ipv6 access configuration.
Leave blank to retain the original configuration.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration.
Leave blank to retain the original configuration.
     * @param Ipv6 Ipv6 access configuration.
Leave blank to retain the original configuration.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Configuration of whether to carry the regional information of the client IP during origin-pull.
Leave blank to retain the original configuration. 
     * @return ClientIpCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
Leave blank to retain the original configuration.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Configuration of whether to carry the regional information of the client IP during origin-pull.
Leave blank to retain the original configuration.
     * @param ClientIpCountry Configuration of whether to carry the regional information of the client IP during origin-pull.
Leave blank to retain the original configuration.
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    /**
     * Get Grpc protocol support configuration.
Leave blank to retain the original configuration. 
     * @return Grpc Grpc protocol support configuration.
Leave blank to retain the original configuration.
     */
    public Grpc getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Grpc protocol support configuration.
Leave blank to retain the original configuration.
     * @param Grpc Grpc protocol support configuration.
Leave blank to retain the original configuration.
     */
    public void setGrpc(Grpc Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get Network error log configuration. If this field is not specified, the original configuration will be retained. 
     * @return NetworkErrorLogging Network error log configuration. If this field is not specified, the original configuration will be retained.
     */
    public NetworkErrorLogging getNetworkErrorLogging() {
        return this.NetworkErrorLogging;
    }

    /**
     * Set Network error log configuration. If this field is not specified, the original configuration will be retained.
     * @param NetworkErrorLogging Network error log configuration. If this field is not specified, the original configuration will be retained.
     */
    public void setNetworkErrorLogging(NetworkErrorLogging NetworkErrorLogging) {
        this.NetworkErrorLogging = NetworkErrorLogging;
    }

    /**
     * Get Image optimization configuration.
Not specified: disabled. 
     * @return ImageOptimize Image optimization configuration.
Not specified: disabled.
     */
    public ImageOptimize getImageOptimize() {
        return this.ImageOptimize;
    }

    /**
     * Set Image optimization configuration.
Not specified: disabled.
     * @param ImageOptimize Image optimization configuration.
Not specified: disabled.
     */
    public void setImageOptimize(ImageOptimize ImageOptimize) {
        this.ImageOptimize = ImageOptimize;
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
     * Get Just-in-time media processing configuration. The original configuration applies if this field is not specified. 
     * @return JITVideoProcess Just-in-time media processing configuration. The original configuration applies if this field is not specified.
     */
    public JITVideoProcess getJITVideoProcess() {
        return this.JITVideoProcess;
    }

    /**
     * Set Just-in-time media processing configuration. The original configuration applies if this field is not specified.
     * @param JITVideoProcess Just-in-time media processing configuration. The original configuration applies if this field is not specified.
     */
    public void setJITVideoProcess(JITVideoProcess JITVideoProcess) {
        this.JITVideoProcess = JITVideoProcess;
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
        if (source.NetworkErrorLogging != null) {
            this.NetworkErrorLogging = new NetworkErrorLogging(source.NetworkErrorLogging);
        }
        if (source.ImageOptimize != null) {
            this.ImageOptimize = new ImageOptimize(source.ImageOptimize);
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
        this.setParamObj(map, prefix + "NetworkErrorLogging.", this.NetworkErrorLogging);
        this.setParamObj(map, prefix + "ImageOptimize.", this.ImageOptimize);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);
        this.setParamObj(map, prefix + "JITVideoProcess.", this.JITVideoProcess);

    }
}

