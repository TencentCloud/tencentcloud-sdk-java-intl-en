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
    * Common feature operations. the options for this category include:.
<Li>Access url rewrite (`accessurlredirect`).</li>.
<Li> origin url overriding (upstreamurlredirect);</li>.
<Li> quic;</li>.
<Li> websocket;</li>.
<Li> video dragging (videoseek);</li>.
<Li> token authentication (authentication);</li>.
<Li> custom cachekey (cachekey);</li>.
<Li> node caching ttl (cache);</li>.
<Li> browser cache ttl (maxage);</li>.
<Li> offline caching (offlinecache);</li>.
<Li> smart acceleration (smartrouting);</li>.
<Li> range-based origin pull (rangeoriginpull);</li>.
<Li> http/2 origin pull (upstreamhttp2);</li>.
<Li> host header overriding (hostheader);</li>.
<Li> force https (forceredirect);</li>.
<Li> https origin pull (originpullprotocol);</li>.
<Li>`ResponseSpeedLimit`: single connection download speed limit.</li>.
<Li>`CachePrefresh`: cache prefresh.</li>.
<Li>`Compression`: smart compression.</li>.
<Li>Hsts;</Li>.
<Li>ClientIpHeader;</Li>.
<Li> ssltlssecureconf;</li>.
<Li> ocspstapling;</li>.
<Li> http/2 access (http2);</li>.
<Li> redirection during origin pull (upstreamfollowredirect);</li>.
<Li> modifying origin server (origin);</li>.
<Li> layer 7 origin pull timeout (httpupstreamtimeout).</li>.
<Li> http response (httpresponse).</li>.
Note: this field may return null, which indicates a failure to obtain a valid value.
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
     * Get Common feature operations. the options for this category include:.
<Li>Access url rewrite (`accessurlredirect`).</li>.
<Li> origin url overriding (upstreamurlredirect);</li>.
<Li> quic;</li>.
<Li> websocket;</li>.
<Li> video dragging (videoseek);</li>.
<Li> token authentication (authentication);</li>.
<Li> custom cachekey (cachekey);</li>.
<Li> node caching ttl (cache);</li>.
<Li> browser cache ttl (maxage);</li>.
<Li> offline caching (offlinecache);</li>.
<Li> smart acceleration (smartrouting);</li>.
<Li> range-based origin pull (rangeoriginpull);</li>.
<Li> http/2 origin pull (upstreamhttp2);</li>.
<Li> host header overriding (hostheader);</li>.
<Li> force https (forceredirect);</li>.
<Li> https origin pull (originpullprotocol);</li>.
<Li>`ResponseSpeedLimit`: single connection download speed limit.</li>.
<Li>`CachePrefresh`: cache prefresh.</li>.
<Li>`Compression`: smart compression.</li>.
<Li>Hsts;</Li>.
<Li>ClientIpHeader;</Li>.
<Li> ssltlssecureconf;</li>.
<Li> ocspstapling;</li>.
<Li> http/2 access (http2);</li>.
<Li> redirection during origin pull (upstreamfollowredirect);</li>.
<Li> modifying origin server (origin);</li>.
<Li> layer 7 origin pull timeout (httpupstreamtimeout).</li>.
<Li> http response (httpresponse).</li>.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return NormalAction Common feature operations. the options for this category include:.
<Li>Access url rewrite (`accessurlredirect`).</li>.
<Li> origin url overriding (upstreamurlredirect);</li>.
<Li> quic;</li>.
<Li> websocket;</li>.
<Li> video dragging (videoseek);</li>.
<Li> token authentication (authentication);</li>.
<Li> custom cachekey (cachekey);</li>.
<Li> node caching ttl (cache);</li>.
<Li> browser cache ttl (maxage);</li>.
<Li> offline caching (offlinecache);</li>.
<Li> smart acceleration (smartrouting);</li>.
<Li> range-based origin pull (rangeoriginpull);</li>.
<Li> http/2 origin pull (upstreamhttp2);</li>.
<Li> host header overriding (hostheader);</li>.
<Li> force https (forceredirect);</li>.
<Li> https origin pull (originpullprotocol);</li>.
<Li>`ResponseSpeedLimit`: single connection download speed limit.</li>.
<Li>`CachePrefresh`: cache prefresh.</li>.
<Li>`Compression`: smart compression.</li>.
<Li>Hsts;</Li>.
<Li>ClientIpHeader;</Li>.
<Li> ssltlssecureconf;</li>.
<Li> ocspstapling;</li>.
<Li> http/2 access (http2);</li>.
<Li> redirection during origin pull (upstreamfollowredirect);</li>.
<Li> modifying origin server (origin);</li>.
<Li> layer 7 origin pull timeout (httpupstreamtimeout).</li>.
<Li> http response (httpresponse).</li>.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public NormalAction getNormalAction() {
        return this.NormalAction;
    }

    /**
     * Set Common feature operations. the options for this category include:.
<Li>Access url rewrite (`accessurlredirect`).</li>.
<Li> origin url overriding (upstreamurlredirect);</li>.
<Li> quic;</li>.
<Li> websocket;</li>.
<Li> video dragging (videoseek);</li>.
<Li> token authentication (authentication);</li>.
<Li> custom cachekey (cachekey);</li>.
<Li> node caching ttl (cache);</li>.
<Li> browser cache ttl (maxage);</li>.
<Li> offline caching (offlinecache);</li>.
<Li> smart acceleration (smartrouting);</li>.
<Li> range-based origin pull (rangeoriginpull);</li>.
<Li> http/2 origin pull (upstreamhttp2);</li>.
<Li> host header overriding (hostheader);</li>.
<Li> force https (forceredirect);</li>.
<Li> https origin pull (originpullprotocol);</li>.
<Li>`ResponseSpeedLimit`: single connection download speed limit.</li>.
<Li>`CachePrefresh`: cache prefresh.</li>.
<Li>`Compression`: smart compression.</li>.
<Li>Hsts;</Li>.
<Li>ClientIpHeader;</Li>.
<Li> ssltlssecureconf;</li>.
<Li> ocspstapling;</li>.
<Li> http/2 access (http2);</li>.
<Li> redirection during origin pull (upstreamfollowredirect);</li>.
<Li> modifying origin server (origin);</li>.
<Li> layer 7 origin pull timeout (httpupstreamtimeout).</li>.
<Li> http response (httpresponse).</li>.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param NormalAction Common feature operations. the options for this category include:.
<Li>Access url rewrite (`accessurlredirect`).</li>.
<Li> origin url overriding (upstreamurlredirect);</li>.
<Li> quic;</li>.
<Li> websocket;</li>.
<Li> video dragging (videoseek);</li>.
<Li> token authentication (authentication);</li>.
<Li> custom cachekey (cachekey);</li>.
<Li> node caching ttl (cache);</li>.
<Li> browser cache ttl (maxage);</li>.
<Li> offline caching (offlinecache);</li>.
<Li> smart acceleration (smartrouting);</li>.
<Li> range-based origin pull (rangeoriginpull);</li>.
<Li> http/2 origin pull (upstreamhttp2);</li>.
<Li> host header overriding (hostheader);</li>.
<Li> force https (forceredirect);</li>.
<Li> https origin pull (originpullprotocol);</li>.
<Li>`ResponseSpeedLimit`: single connection download speed limit.</li>.
<Li>`CachePrefresh`: cache prefresh.</li>.
<Li>`Compression`: smart compression.</li>.
<Li>Hsts;</Li>.
<Li>ClientIpHeader;</Li>.
<Li> ssltlssecureconf;</li>.
<Li> ocspstapling;</li>.
<Li> http/2 access (http2);</li>.
<Li> redirection during origin pull (upstreamfollowredirect);</li>.
<Li> modifying origin server (origin);</li>.
<Li> layer 7 origin pull timeout (httpupstreamtimeout).</li>.
<Li> http response (httpresponse).</li>.
Note: this field may return null, which indicates a failure to obtain a valid value.
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

