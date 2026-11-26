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

public class Action extends AbstractModel {

    /**
    * Normal feature operation. Feature items of this type:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart acceleration (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Single connection download speed limit (ResponseSpeedLimit);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout).</li>
<li> HTTP response (HttpResponse).</li>
    */
    @SerializedName("NormalAction")
    @Expose
    private NormalAction NormalAction;

    /**
    * Feature operations with request/response headers. Feature items of this type include:
<li>HTTP request header modification (RequestHeader).</li>
<li> HTTP response header modification (ResponseHeader).</li>
    */
    @SerializedName("RewriteAction")
    @Expose
    private RewriteAction RewriteAction;

    /**
    * Feature operation with a status code. Feature items of this type:
<li> Custom error page (ErrorPage);</li>
<li> Status code cache TTL (StatusCodeCache).</li>
    */
    @SerializedName("CodeAction")
    @Expose
    private CodeAction CodeAction;

    /**
     * Get Normal feature operation. Feature items of this type:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart acceleration (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Single connection download speed limit (ResponseSpeedLimit);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout).</li>
<li> HTTP response (HttpResponse).</li> 
     * @return NormalAction Normal feature operation. Feature items of this type:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart acceleration (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Single connection download speed limit (ResponseSpeedLimit);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout).</li>
<li> HTTP response (HttpResponse).</li>
     */
    public NormalAction getNormalAction() {
        return this.NormalAction;
    }

    /**
     * Set Normal feature operation. Feature items of this type:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart acceleration (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Single connection download speed limit (ResponseSpeedLimit);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout).</li>
<li> HTTP response (HttpResponse).</li>
     * @param NormalAction Normal feature operation. Feature items of this type:
<li> Access URL rewrite (AccessUrlRedirect);</li>
<li> Origin-pull URL rewrite (UpstreamUrlRedirect);</li>
<li> QUIC(QUIC);</li>
<li> WebSocket (WebSocket);</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node cache TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart acceleration (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Force HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Single connection download speed limit (ResponseSpeedLimit);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Intelligent compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout).</li>
<li> HTTP response (HttpResponse).</li>
     */
    public void setNormalAction(NormalAction NormalAction) {
        this.NormalAction = NormalAction;
    }

    /**
     * Get Feature operations with request/response headers. Feature items of this type include:
<li>HTTP request header modification (RequestHeader).</li>
<li> HTTP response header modification (ResponseHeader).</li> 
     * @return RewriteAction Feature operations with request/response headers. Feature items of this type include:
<li>HTTP request header modification (RequestHeader).</li>
<li> HTTP response header modification (ResponseHeader).</li>
     */
    public RewriteAction getRewriteAction() {
        return this.RewriteAction;
    }

    /**
     * Set Feature operations with request/response headers. Feature items of this type include:
<li>HTTP request header modification (RequestHeader).</li>
<li> HTTP response header modification (ResponseHeader).</li>
     * @param RewriteAction Feature operations with request/response headers. Feature items of this type include:
<li>HTTP request header modification (RequestHeader).</li>
<li> HTTP response header modification (ResponseHeader).</li>
     */
    public void setRewriteAction(RewriteAction RewriteAction) {
        this.RewriteAction = RewriteAction;
    }

    /**
     * Get Feature operation with a status code. Feature items of this type:
<li> Custom error page (ErrorPage);</li>
<li> Status code cache TTL (StatusCodeCache).</li> 
     * @return CodeAction Feature operation with a status code. Feature items of this type:
<li> Custom error page (ErrorPage);</li>
<li> Status code cache TTL (StatusCodeCache).</li>
     */
    public CodeAction getCodeAction() {
        return this.CodeAction;
    }

    /**
     * Set Feature operation with a status code. Feature items of this type:
<li> Custom error page (ErrorPage);</li>
<li> Status code cache TTL (StatusCodeCache).</li>
     * @param CodeAction Feature operation with a status code. Feature items of this type:
<li> Custom error page (ErrorPage);</li>
<li> Status code cache TTL (StatusCodeCache).</li>
     */
    public void setCodeAction(CodeAction CodeAction) {
        this.CodeAction = CodeAction;
    }

    public Action() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Action(Action source) {
        if (source.NormalAction != null) {
            this.NormalAction = new NormalAction(source.NormalAction);
        }
        if (source.RewriteAction != null) {
            this.RewriteAction = new RewriteAction(source.RewriteAction);
        }
        if (source.CodeAction != null) {
            this.CodeAction = new CodeAction(source.CodeAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NormalAction.", this.NormalAction);
        this.setParamObj(map, prefix + "RewriteAction.", this.RewriteAction);
        this.setParamObj(map, prefix + "CodeAction.", this.CodeAction);

    }
}

