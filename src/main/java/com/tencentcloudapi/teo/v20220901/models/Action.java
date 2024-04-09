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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Action extends AbstractModel {

    /**
    * Common feature operations. The options for this category include:
<li> Access URL overriding (AccessUrlRedirect);</li>
<li> Origin URL overriding (UpstreamUrlRedirect);</li>
<li> QUIC;</li>
<li> WebSocket;</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node caching TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Forced HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Smart compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout);</li>
<li> HTTP response (HttpResponse).</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NormalAction")
    @Expose
    private NormalAction NormalAction;

    /**
    * Feature operation with a request/response header. Features of this type include:
<li>`RequestHeader`: HTTP request header modification.</li>
<li>`ResponseHeader`: HTTP response header modification.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewriteAction")
    @Expose
    private RewriteAction RewriteAction;

    /**
    * Feature operation with a status code. Features of this type include:
<li>`ErrorPage`: Custom error page.</li>
<li>`StatusCodeCache`: Status code cache TTL.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CodeAction")
    @Expose
    private CodeAction CodeAction;

    /**
     * Get Common feature operations. The options for this category include:
<li> Access URL overriding (AccessUrlRedirect);</li>
<li> Origin URL overriding (UpstreamUrlRedirect);</li>
<li> QUIC;</li>
<li> WebSocket;</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node caching TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Forced HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Smart compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout);</li>
<li> HTTP response (HttpResponse).</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NormalAction Common feature operations. The options for this category include:
<li> Access URL overriding (AccessUrlRedirect);</li>
<li> Origin URL overriding (UpstreamUrlRedirect);</li>
<li> QUIC;</li>
<li> WebSocket;</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node caching TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Forced HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Smart compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout);</li>
<li> HTTP response (HttpResponse).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalAction getNormalAction() {
        return this.NormalAction;
    }

    /**
     * Set Common feature operations. The options for this category include:
<li> Access URL overriding (AccessUrlRedirect);</li>
<li> Origin URL overriding (UpstreamUrlRedirect);</li>
<li> QUIC;</li>
<li> WebSocket;</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node caching TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Forced HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Smart compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout);</li>
<li> HTTP response (HttpResponse).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NormalAction Common feature operations. The options for this category include:
<li> Access URL overriding (AccessUrlRedirect);</li>
<li> Origin URL overriding (UpstreamUrlRedirect);</li>
<li> QUIC;</li>
<li> WebSocket;</li>
<li> Video dragging (VideoSeek);</li>
<li> Token authentication (Authentication);</li>
<li> Custom CacheKey (CacheKey);</li>
<li> Node caching TTL (Cache);</li>
<li> Browser caching TTL (MaxAge);</li>
<li> Offline caching (OfflineCache);</li>
<li> Smart routing (SmartRouting);</li>
<li> Range-based origin pull (RangeOriginPull);</li>
<li> HTTP/2 origin pull (UpstreamHttp2);</li>
<li> Host header overriding (HostHeader);</li>
<li> Forced HTTPS (ForceRedirect);</li>
<li> HTTPS origin pull (OriginPullProtocol);</li>
<li> Cache pre-refresh (CachePrefresh);</li>
<li> Smart compression (Compression);</li>
<li> Hsts;</li>
<li> ClientIpHeader;</li>
<li> SslTlsSecureConf;</li>
<li> OcspStapling;</li>
<li> HTTP/2 access (Http2);</li>
<li> Redirection during origin pull (UpstreamFollowRedirect);</li>
<li> Modifying origin server (Origin);</li>
<li> Layer 7 origin pull timeout (HTTPUpstreamTimeout);</li>
<li> HTTP response (HttpResponse).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNormalAction(NormalAction NormalAction) {
        this.NormalAction = NormalAction;
    }

    /**
     * Get Feature operation with a request/response header. Features of this type include:
<li>`RequestHeader`: HTTP request header modification.</li>
<li>`ResponseHeader`: HTTP response header modification.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RewriteAction Feature operation with a request/response header. Features of this type include:
<li>`RequestHeader`: HTTP request header modification.</li>
<li>`ResponseHeader`: HTTP response header modification.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RewriteAction getRewriteAction() {
        return this.RewriteAction;
    }

    /**
     * Set Feature operation with a request/response header. Features of this type include:
<li>`RequestHeader`: HTTP request header modification.</li>
<li>`ResponseHeader`: HTTP response header modification.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RewriteAction Feature operation with a request/response header. Features of this type include:
<li>`RequestHeader`: HTTP request header modification.</li>
<li>`ResponseHeader`: HTTP response header modification.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRewriteAction(RewriteAction RewriteAction) {
        this.RewriteAction = RewriteAction;
    }

    /**
     * Get Feature operation with a status code. Features of this type include:
<li>`ErrorPage`: Custom error page.</li>
<li>`StatusCodeCache`: Status code cache TTL.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CodeAction Feature operation with a status code. Features of this type include:
<li>`ErrorPage`: Custom error page.</li>
<li>`StatusCodeCache`: Status code cache TTL.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CodeAction getCodeAction() {
        return this.CodeAction;
    }

    /**
     * Set Feature operation with a status code. Features of this type include:
<li>`ErrorPage`: Custom error page.</li>
<li>`StatusCodeCache`: Status code cache TTL.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CodeAction Feature operation with a status code. Features of this type include:
<li>`ErrorPage`: Custom error page.</li>
<li>`StatusCodeCache`: Status code cache TTL.</li>
Note: This field may return null, indicating that no valid values can be obtained.
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

