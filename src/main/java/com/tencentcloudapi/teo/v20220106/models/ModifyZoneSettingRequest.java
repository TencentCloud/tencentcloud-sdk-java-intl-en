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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneSettingRequest extends AbstractModel{

    /**
    * ID of the site to be modified
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Cache expiration time
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfig Cache;

    /**
    * Node cache key
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Browser cache configuration
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Offline cache
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * QUIC access
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Maximum size of files transferred over POST request
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * Smart compression configuration
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * HTTP2 origin-pull configuration
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Force HTTPS redirect configuration
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * HTTPS acceleration configuration
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Origin server configuration
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Smart acceleration configuration
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * WebSocket configuration
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Origin-pull client IP header configuration
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIp ClientIpHeader;

    /**
    * 
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
     * Get ID of the site to be modified 
     * @return ZoneId ID of the site to be modified
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site to be modified
     * @param ZoneId ID of the site to be modified
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Cache expiration time 
     * @return Cache Cache expiration time
     */
    public CacheConfig getCache() {
        return this.Cache;
    }

    /**
     * Set Cache expiration time
     * @param Cache Cache expiration time
     */
    public void setCache(CacheConfig Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Node cache key 
     * @return CacheKey Node cache key
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key
     * @param CacheKey Node cache key
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Browser cache configuration 
     * @return MaxAge Browser cache configuration
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration
     * @param MaxAge Browser cache configuration
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Offline cache 
     * @return OfflineCache Offline cache
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache
     * @param OfflineCache Offline cache
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get QUIC access 
     * @return Quic QUIC access
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC access
     * @param Quic QUIC access
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Maximum size of files transferred over POST request 
     * @return PostMaxSize Maximum size of files transferred over POST request
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set Maximum size of files transferred over POST request
     * @param PostMaxSize Maximum size of files transferred over POST request
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Smart compression configuration 
     * @return Compression Smart compression configuration
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration
     * @param Compression Smart compression configuration
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get HTTP2 origin-pull configuration 
     * @return UpstreamHttp2 HTTP2 origin-pull configuration
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set HTTP2 origin-pull configuration
     * @param UpstreamHttp2 HTTP2 origin-pull configuration
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Force HTTPS redirect configuration 
     * @return ForceRedirect Force HTTPS redirect configuration
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Force HTTPS redirect configuration
     * @param ForceRedirect Force HTTPS redirect configuration
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get HTTPS acceleration configuration 
     * @return Https HTTPS acceleration configuration
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS acceleration configuration
     * @param Https HTTPS acceleration configuration
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Origin server configuration 
     * @return Origin Origin server configuration
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration
     * @param Origin Origin server configuration
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Smart acceleration configuration 
     * @return SmartRouting Smart acceleration configuration
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Smart acceleration configuration
     * @param SmartRouting Smart acceleration configuration
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get WebSocket configuration 
     * @return WebSocket WebSocket configuration
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration
     * @param WebSocket WebSocket configuration
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Origin-pull client IP header configuration 
     * @return ClientIpHeader Origin-pull client IP header configuration
     */
    public ClientIp getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Origin-pull client IP header configuration
     * @param ClientIpHeader Origin-pull client IP header configuration
     */
    public void setClientIpHeader(ClientIp ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get  
     * @return CachePrefresh 
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set 
     * @param CachePrefresh 
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
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
        if (source.Cache != null) {
            this.Cache = new CacheConfig(source.Cache);
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
            this.ClientIpHeader = new ClientIp(source.ClientIpHeader);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefresh(source.CachePrefresh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
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

    }
}

