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

public class DescribeZoneSettingResponse extends AbstractModel{

    /**
    * Cache expiration time configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfig Cache;

    /**
    * Node cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Browser cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Offline cache
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * QUIC access
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * POST transport configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * Smart compression configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * HTTP2 origin-pull configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * Force HTTPS redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * HTTPS acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Origin server configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Dynamic acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain name of the site
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Origin-pull client IP header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cache expiration time configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cache Cache expiration time configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CacheConfig getCache() {
        return this.Cache;
    }

    /**
     * Set Cache expiration time configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cache Cache expiration time configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCache(CacheConfig Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Node cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheKey Node cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheKey Node cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Browser cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MaxAge Browser cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MaxAge Browser cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Offline cache
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OfflineCache Offline cache
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OfflineCache Offline cache
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get QUIC access
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Quic QUIC access
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC access
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Quic QUIC access
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get POST transport configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PostMaxSize POST transport configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST transport configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PostMaxSize POST transport configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get Smart compression configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Compression Smart compression configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Compression Smart compression configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get HTTP2 origin-pull configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpstreamHttp2 HTTP2 origin-pull configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set HTTP2 origin-pull configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpstreamHttp2 HTTP2 origin-pull configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get Force HTTPS redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ForceRedirect Force HTTPS redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Force HTTPS redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ForceRedirect Force HTTPS redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get HTTPS acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Https HTTPS acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Https HTTPS acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Origin server configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Origin Origin server configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Origin Origin server configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Dynamic acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SmartRouting Dynamic acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Dynamic acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SmartRouting Dynamic acceleration configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain name of the site 
     * @return Zone Domain name of the site
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Domain name of the site
     * @param Zone Domain name of the site
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WebSocket WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WebSocket WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get Origin-pull client IP header configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClientIpHeader Origin-pull client IP header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ClientIp getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set Origin-pull client IP header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClientIpHeader Origin-pull client IP header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
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

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeZoneSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneSettingResponse(DescribeZoneSettingResponse source) {
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
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

