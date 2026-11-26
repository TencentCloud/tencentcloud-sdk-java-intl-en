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

public class RulesSettingAction extends AbstractModel {

    /**
    * Feature name. Valid values:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> Custom error page
(ErrorPage);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header rewrite (HostHeader);</li>
<li> force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li>HTTP request header modification (RequestHeader);</li>
<li> HTTP response header modification (ResponseHeader);</li>
<li> Status code cache TTL (StatusCodeCache);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> TlsVersion;</li>
<li> OcspStapling.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Parameter information.
    */
    @SerializedName("Properties")
    @Expose
    private RulesProperties [] Properties;

    /**
     * Get Feature name. Valid values:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> Custom error page
(ErrorPage);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header rewrite (HostHeader);</li>
<li> force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li>HTTP request header modification (RequestHeader);</li>
<li> HTTP response header modification (ResponseHeader);</li>
<li> Status code cache TTL (StatusCodeCache);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> TlsVersion;</li>
<li> OcspStapling.</li> 
     * @return Action Feature name. Valid values:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> Custom error page
(ErrorPage);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header rewrite (HostHeader);</li>
<li> force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li>HTTP request header modification (RequestHeader);</li>
<li> HTTP response header modification (ResponseHeader);</li>
<li> Status code cache TTL (StatusCodeCache);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> TlsVersion;</li>
<li> OcspStapling.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Feature name. Valid values:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> Custom error page
(ErrorPage);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header rewrite (HostHeader);</li>
<li> force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li>HTTP request header modification (RequestHeader);</li>
<li> HTTP response header modification (ResponseHeader);</li>
<li> Status code cache TTL (StatusCodeCache);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> TlsVersion;</li>
<li> OcspStapling.</li>
     * @param Action Feature name. Valid values:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> Custom error page
(ErrorPage);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header rewrite (HostHeader);</li>
<li> force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li>HTTP request header modification (RequestHeader);</li>
<li> HTTP response header modification (ResponseHeader);</li>
<li> Status code cache TTL (StatusCodeCache);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> TlsVersion;</li>
<li> OcspStapling.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Parameter information. 
     * @return Properties Parameter information.
     */
    public RulesProperties [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Parameter information.
     * @param Properties Parameter information.
     */
    public void setProperties(RulesProperties [] Properties) {
        this.Properties = Properties;
    }

    public RulesSettingAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulesSettingAction(RulesSettingAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Properties != null) {
            this.Properties = new RulesProperties[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new RulesProperties(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

