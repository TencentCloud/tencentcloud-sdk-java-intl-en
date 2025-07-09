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

public class RuleEngineAction extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Node cache ttl configuration parameter. when name is cache, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CacheParameters")
    @Expose
    private CacheParameters CacheParameters;

    /**
    * Custom cache key configuration parameter. when name is cachekey, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CacheKeyParameters")
    @Expose
    private CacheKeyParameters CacheKeyParameters;

    /**
    * The cache prefresh configuration parameter. this parameter is required when `name` is `cacheprefresh`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CachePrefreshParameters")
    @Expose
    private CachePrefreshParameters CachePrefreshParameters;

    /**
    * The access url redirection configuration parameter. this parameter is required when `name` is `accessurlredirect`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("AccessURLRedirectParameters")
    @Expose
    private AccessURLRedirectParameters AccessURLRedirectParameters;

    /**
    * The origin-pull url rewrite configuration parameter. this parameter is required when `name` is `upstreamurlrewrite`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("UpstreamURLRewriteParameters")
    @Expose
    private UpstreamURLRewriteParameters UpstreamURLRewriteParameters;

    /**
    * The quic configuration parameter. this parameter is required when `name` is `quic`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("QUICParameters")
    @Expose
    private QUICParameters QUICParameters;

    /**
    * The websocket configuration parameter. this parameter is required when `name` is `websocket`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("WebSocketParameters")
    @Expose
    private WebSocketParameters WebSocketParameters;

    /**
    * Token authentication configuration parameter. this parameter is required when `name` is `authentication`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("AuthenticationParameters")
    @Expose
    private AuthenticationParameters AuthenticationParameters;

    /**
    * Browser cache ttl configuration parameter. this parameter is required when `name` is `maxage`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("MaxAgeParameters")
    @Expose
    private MaxAgeParameters MaxAgeParameters;

    /**
    * Status code cache ttl configuration parameter. this parameter is required when `name` is `statuscodecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("StatusCodeCacheParameters")
    @Expose
    private StatusCodeCacheParameters StatusCodeCacheParameters;

    /**
    * Offline cache configuration parameter. this parameter is required when `name` is `offlinecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OfflineCacheParameters")
    @Expose
    private OfflineCacheParameters OfflineCacheParameters;

    /**
    * Smart acceleration configuration parameter. this parameter is required when `name` is `smartrouting`.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("SmartRoutingParameters")
    @Expose
    private SmartRoutingParameters SmartRoutingParameters;

    /**
    * Shard source retrieval configuration parameter. this parameter is required when name is set to rangeoriginpull.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("RangeOriginPullParameters")
    @Expose
    private RangeOriginPullParameters RangeOriginPullParameters;

    /**
    * HTTP2 origin-pull configuration parameter. this parameter is required when name is set to upstreamhttp2.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("UpstreamHTTP2Parameters")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2Parameters;

    /**
    * Host header rewrite configuration parameter. this parameter is required when name is set to hostheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HostHeaderParameters")
    @Expose
    private HostHeaderParameters HostHeaderParameters;

    /**
    * Force https redirect configuration parameter. this parameter is required when the name is set to forceredirecthttps.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ForceRedirectHTTPSParameters")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters;

    /**
    * Intelligent compression configuration. this parameter is required when name is set to compression.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CompressionParameters")
    @Expose
    private CompressionParameters CompressionParameters;

    /**
    * HSTS configuration parameter. this parameter is required when name is hsts.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HSTSParameters")
    @Expose
    private HSTSParameters HSTSParameters;

    /**
    * Client ip header configuration for storing client request ip information. this parameter is required when name is clientipheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ClientIPHeaderParameters")
    @Expose
    private ClientIPHeaderParameters ClientIPHeaderParameters;

    /**
    * OCSP stapling configuration parameter. this parameter is required when the name is set to ocspstapling.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OCSPStaplingParameters")
    @Expose
    private OCSPStaplingParameters OCSPStaplingParameters;

    /**
    * HTTP2 access configuration parameter. this parameter is required when name is http2.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HTTP2Parameters")
    @Expose
    private HTTP2Parameters HTTP2Parameters;

    /**
    * Maximum size configuration for file streaming upload via a post request. this parameter is required when name is postmaxsize.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("PostMaxSizeParameters")
    @Expose
    private PostMaxSizeParameters PostMaxSizeParameters;

    /**
    * Configuration parameter for carrying the region information of the client ip during origin-pull. this parameter is required when the name is set to clientipcountry.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ClientIPCountryParameters")
    @Expose
    private ClientIPCountryParameters ClientIPCountryParameters;

    /**
    * Configuration parameter for following redirects during origin-pull. this parameter is required when the name is set to upstreamfollowredirect.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("UpstreamFollowRedirectParameters")
    @Expose
    private UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters;

    /**
    * Configuration parameter for origin-pull request. this parameter is required when the name is set to upstreamrequest.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("UpstreamRequestParameters")
    @Expose
    private UpstreamRequestParameters UpstreamRequestParameters;

    /**
    * SSL/TLS security configuration parameter. this parameter is required when the name is set to tlsconfig.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("TLSConfigParameters")
    @Expose
    private TLSConfigParameters TLSConfigParameters;

    /**
    * Configuration parameter for modifying the origin server. this parameter is required when the name is set to modifyorigin.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ModifyOriginParameters")
    @Expose
    private ModifyOriginParameters ModifyOriginParameters;

    /**
    * Configuration of layer 7 origin timeout. this parameter is required when name is httpupstreamtimeout.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HTTPUpstreamTimeoutParameters")
    @Expose
    private HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters;

    /**
    * HTTP response configuration parameters. this parameter is required when name is httpresponse.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HttpResponseParameters")
    @Expose
    private HTTPResponseParameters HttpResponseParameters;

    /**
    * Custom error page configuration parameters. this parameter is required when name is errorpage.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ErrorPageParameters")
    @Expose
    private ErrorPageParameters ErrorPageParameters;

    /**
    * Modify http node response header configuration parameters. this parameter is required when name is modifyresponseheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ModifyResponseHeaderParameters")
    @Expose
    private ModifyResponseHeaderParameters ModifyResponseHeaderParameters;

    /**
    * Modify http node request header configuration parameters. this parameter is required when name is modifyrequestheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ModifyRequestHeaderParameters")
    @Expose
    private ModifyRequestHeaderParameters ModifyRequestHeaderParameters;

    /**
    * Single connection download speed limit configuration parameter. this parameter is required when name is responsespeedlimit.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ResponseSpeedLimitParameters")
    @Expose
    private ResponseSpeedLimitParameters ResponseSpeedLimitParameters;

    /**
    * Content identification configuration parameter. this parameter is required when name is httpresponse.

Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("SetContentIdentifierParameters")
    @Expose
    private SetContentIdentifierParameters SetContentIdentifierParameters;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Node cache ttl configuration parameter. when name is cache, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CacheParameters Node cache ttl configuration parameter. when name is cache, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheParameters getCacheParameters() {
        return this.CacheParameters;
    }

    /**
     * Set Node cache ttl configuration parameter. when name is cache, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CacheParameters Node cache ttl configuration parameter. when name is cache, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCacheParameters(CacheParameters CacheParameters) {
        this.CacheParameters = CacheParameters;
    }

    /**
     * Get Custom cache key configuration parameter. when name is cachekey, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CacheKeyParameters Custom cache key configuration parameter. when name is cachekey, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheKeyParameters getCacheKeyParameters() {
        return this.CacheKeyParameters;
    }

    /**
     * Set Custom cache key configuration parameter. when name is cachekey, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CacheKeyParameters Custom cache key configuration parameter. when name is cachekey, this parameter is required.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCacheKeyParameters(CacheKeyParameters CacheKeyParameters) {
        this.CacheKeyParameters = CacheKeyParameters;
    }

    /**
     * Get The cache prefresh configuration parameter. this parameter is required when `name` is `cacheprefresh`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CachePrefreshParameters The cache prefresh configuration parameter. this parameter is required when `name` is `cacheprefresh`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CachePrefreshParameters getCachePrefreshParameters() {
        return this.CachePrefreshParameters;
    }

    /**
     * Set The cache prefresh configuration parameter. this parameter is required when `name` is `cacheprefresh`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CachePrefreshParameters The cache prefresh configuration parameter. this parameter is required when `name` is `cacheprefresh`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCachePrefreshParameters(CachePrefreshParameters CachePrefreshParameters) {
        this.CachePrefreshParameters = CachePrefreshParameters;
    }

    /**
     * Get The access url redirection configuration parameter. this parameter is required when `name` is `accessurlredirect`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return AccessURLRedirectParameters The access url redirection configuration parameter. this parameter is required when `name` is `accessurlredirect`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public AccessURLRedirectParameters getAccessURLRedirectParameters() {
        return this.AccessURLRedirectParameters;
    }

    /**
     * Set The access url redirection configuration parameter. this parameter is required when `name` is `accessurlredirect`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param AccessURLRedirectParameters The access url redirection configuration parameter. this parameter is required when `name` is `accessurlredirect`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAccessURLRedirectParameters(AccessURLRedirectParameters AccessURLRedirectParameters) {
        this.AccessURLRedirectParameters = AccessURLRedirectParameters;
    }

    /**
     * Get The origin-pull url rewrite configuration parameter. this parameter is required when `name` is `upstreamurlrewrite`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return UpstreamURLRewriteParameters The origin-pull url rewrite configuration parameter. this parameter is required when `name` is `upstreamurlrewrite`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamURLRewriteParameters getUpstreamURLRewriteParameters() {
        return this.UpstreamURLRewriteParameters;
    }

    /**
     * Set The origin-pull url rewrite configuration parameter. this parameter is required when `name` is `upstreamurlrewrite`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param UpstreamURLRewriteParameters The origin-pull url rewrite configuration parameter. this parameter is required when `name` is `upstreamurlrewrite`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setUpstreamURLRewriteParameters(UpstreamURLRewriteParameters UpstreamURLRewriteParameters) {
        this.UpstreamURLRewriteParameters = UpstreamURLRewriteParameters;
    }

    /**
     * Get The quic configuration parameter. this parameter is required when `name` is `quic`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return QUICParameters The quic configuration parameter. this parameter is required when `name` is `quic`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public QUICParameters getQUICParameters() {
        return this.QUICParameters;
    }

    /**
     * Set The quic configuration parameter. this parameter is required when `name` is `quic`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param QUICParameters The quic configuration parameter. this parameter is required when `name` is `quic`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setQUICParameters(QUICParameters QUICParameters) {
        this.QUICParameters = QUICParameters;
    }

    /**
     * Get The websocket configuration parameter. this parameter is required when `name` is `websocket`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return WebSocketParameters The websocket configuration parameter. this parameter is required when `name` is `websocket`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public WebSocketParameters getWebSocketParameters() {
        return this.WebSocketParameters;
    }

    /**
     * Set The websocket configuration parameter. this parameter is required when `name` is `websocket`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param WebSocketParameters The websocket configuration parameter. this parameter is required when `name` is `websocket`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setWebSocketParameters(WebSocketParameters WebSocketParameters) {
        this.WebSocketParameters = WebSocketParameters;
    }

    /**
     * Get Token authentication configuration parameter. this parameter is required when `name` is `authentication`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return AuthenticationParameters Token authentication configuration parameter. this parameter is required when `name` is `authentication`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public AuthenticationParameters getAuthenticationParameters() {
        return this.AuthenticationParameters;
    }

    /**
     * Set Token authentication configuration parameter. this parameter is required when `name` is `authentication`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param AuthenticationParameters Token authentication configuration parameter. this parameter is required when `name` is `authentication`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAuthenticationParameters(AuthenticationParameters AuthenticationParameters) {
        this.AuthenticationParameters = AuthenticationParameters;
    }

    /**
     * Get Browser cache ttl configuration parameter. this parameter is required when `name` is `maxage`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return MaxAgeParameters Browser cache ttl configuration parameter. this parameter is required when `name` is `maxage`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public MaxAgeParameters getMaxAgeParameters() {
        return this.MaxAgeParameters;
    }

    /**
     * Set Browser cache ttl configuration parameter. this parameter is required when `name` is `maxage`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param MaxAgeParameters Browser cache ttl configuration parameter. this parameter is required when `name` is `maxage`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setMaxAgeParameters(MaxAgeParameters MaxAgeParameters) {
        this.MaxAgeParameters = MaxAgeParameters;
    }

    /**
     * Get Status code cache ttl configuration parameter. this parameter is required when `name` is `statuscodecache`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return StatusCodeCacheParameters Status code cache ttl configuration parameter. this parameter is required when `name` is `statuscodecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public StatusCodeCacheParameters getStatusCodeCacheParameters() {
        return this.StatusCodeCacheParameters;
    }

    /**
     * Set Status code cache ttl configuration parameter. this parameter is required when `name` is `statuscodecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param StatusCodeCacheParameters Status code cache ttl configuration parameter. this parameter is required when `name` is `statuscodecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setStatusCodeCacheParameters(StatusCodeCacheParameters StatusCodeCacheParameters) {
        this.StatusCodeCacheParameters = StatusCodeCacheParameters;
    }

    /**
     * Get Offline cache configuration parameter. this parameter is required when `name` is `offlinecache`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return OfflineCacheParameters Offline cache configuration parameter. this parameter is required when `name` is `offlinecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public OfflineCacheParameters getOfflineCacheParameters() {
        return this.OfflineCacheParameters;
    }

    /**
     * Set Offline cache configuration parameter. this parameter is required when `name` is `offlinecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param OfflineCacheParameters Offline cache configuration parameter. this parameter is required when `name` is `offlinecache`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOfflineCacheParameters(OfflineCacheParameters OfflineCacheParameters) {
        this.OfflineCacheParameters = OfflineCacheParameters;
    }

    /**
     * Get Smart acceleration configuration parameter. this parameter is required when `name` is `smartrouting`.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return SmartRoutingParameters Smart acceleration configuration parameter. this parameter is required when `name` is `smartrouting`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public SmartRoutingParameters getSmartRoutingParameters() {
        return this.SmartRoutingParameters;
    }

    /**
     * Set Smart acceleration configuration parameter. this parameter is required when `name` is `smartrouting`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param SmartRoutingParameters Smart acceleration configuration parameter. this parameter is required when `name` is `smartrouting`.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setSmartRoutingParameters(SmartRoutingParameters SmartRoutingParameters) {
        this.SmartRoutingParameters = SmartRoutingParameters;
    }

    /**
     * Get Shard source retrieval configuration parameter. this parameter is required when name is set to rangeoriginpull.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return RangeOriginPullParameters Shard source retrieval configuration parameter. this parameter is required when name is set to rangeoriginpull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public RangeOriginPullParameters getRangeOriginPullParameters() {
        return this.RangeOriginPullParameters;
    }

    /**
     * Set Shard source retrieval configuration parameter. this parameter is required when name is set to rangeoriginpull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param RangeOriginPullParameters Shard source retrieval configuration parameter. this parameter is required when name is set to rangeoriginpull.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setRangeOriginPullParameters(RangeOriginPullParameters RangeOriginPullParameters) {
        this.RangeOriginPullParameters = RangeOriginPullParameters;
    }

    /**
     * Get HTTP2 origin-pull configuration parameter. this parameter is required when name is set to upstreamhttp2.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return UpstreamHTTP2Parameters HTTP2 origin-pull configuration parameter. this parameter is required when name is set to upstreamhttp2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2Parameters() {
        return this.UpstreamHTTP2Parameters;
    }

    /**
     * Set HTTP2 origin-pull configuration parameter. this parameter is required when name is set to upstreamhttp2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param UpstreamHTTP2Parameters HTTP2 origin-pull configuration parameter. this parameter is required when name is set to upstreamhttp2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setUpstreamHTTP2Parameters(UpstreamHTTP2Parameters UpstreamHTTP2Parameters) {
        this.UpstreamHTTP2Parameters = UpstreamHTTP2Parameters;
    }

    /**
     * Get Host header rewrite configuration parameter. this parameter is required when name is set to hostheader.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HostHeaderParameters Host header rewrite configuration parameter. this parameter is required when name is set to hostheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HostHeaderParameters getHostHeaderParameters() {
        return this.HostHeaderParameters;
    }

    /**
     * Set Host header rewrite configuration parameter. this parameter is required when name is set to hostheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HostHeaderParameters Host header rewrite configuration parameter. this parameter is required when name is set to hostheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHostHeaderParameters(HostHeaderParameters HostHeaderParameters) {
        this.HostHeaderParameters = HostHeaderParameters;
    }

    /**
     * Get Force https redirect configuration parameter. this parameter is required when the name is set to forceredirecthttps.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ForceRedirectHTTPSParameters Force https redirect configuration parameter. this parameter is required when the name is set to forceredirecthttps.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPSParameters() {
        return this.ForceRedirectHTTPSParameters;
    }

    /**
     * Set Force https redirect configuration parameter. this parameter is required when the name is set to forceredirecthttps.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ForceRedirectHTTPSParameters Force https redirect configuration parameter. this parameter is required when the name is set to forceredirecthttps.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setForceRedirectHTTPSParameters(ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters) {
        this.ForceRedirectHTTPSParameters = ForceRedirectHTTPSParameters;
    }

    /**
     * Get Intelligent compression configuration. this parameter is required when name is set to compression.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CompressionParameters Intelligent compression configuration. this parameter is required when name is set to compression.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CompressionParameters getCompressionParameters() {
        return this.CompressionParameters;
    }

    /**
     * Set Intelligent compression configuration. this parameter is required when name is set to compression.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CompressionParameters Intelligent compression configuration. this parameter is required when name is set to compression.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCompressionParameters(CompressionParameters CompressionParameters) {
        this.CompressionParameters = CompressionParameters;
    }

    /**
     * Get HSTS configuration parameter. this parameter is required when name is hsts.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HSTSParameters HSTS configuration parameter. this parameter is required when name is hsts.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HSTSParameters getHSTSParameters() {
        return this.HSTSParameters;
    }

    /**
     * Set HSTS configuration parameter. this parameter is required when name is hsts.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HSTSParameters HSTS configuration parameter. this parameter is required when name is hsts.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHSTSParameters(HSTSParameters HSTSParameters) {
        this.HSTSParameters = HSTSParameters;
    }

    /**
     * Get Client ip header configuration for storing client request ip information. this parameter is required when name is clientipheader.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ClientIPHeaderParameters Client ip header configuration for storing client request ip information. this parameter is required when name is clientipheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ClientIPHeaderParameters getClientIPHeaderParameters() {
        return this.ClientIPHeaderParameters;
    }

    /**
     * Set Client ip header configuration for storing client request ip information. this parameter is required when name is clientipheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ClientIPHeaderParameters Client ip header configuration for storing client request ip information. this parameter is required when name is clientipheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setClientIPHeaderParameters(ClientIPHeaderParameters ClientIPHeaderParameters) {
        this.ClientIPHeaderParameters = ClientIPHeaderParameters;
    }

    /**
     * Get OCSP stapling configuration parameter. this parameter is required when the name is set to ocspstapling.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return OCSPStaplingParameters OCSP stapling configuration parameter. this parameter is required when the name is set to ocspstapling.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public OCSPStaplingParameters getOCSPStaplingParameters() {
        return this.OCSPStaplingParameters;
    }

    /**
     * Set OCSP stapling configuration parameter. this parameter is required when the name is set to ocspstapling.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param OCSPStaplingParameters OCSP stapling configuration parameter. this parameter is required when the name is set to ocspstapling.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOCSPStaplingParameters(OCSPStaplingParameters OCSPStaplingParameters) {
        this.OCSPStaplingParameters = OCSPStaplingParameters;
    }

    /**
     * Get HTTP2 access configuration parameter. this parameter is required when name is http2.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HTTP2Parameters HTTP2 access configuration parameter. this parameter is required when name is http2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HTTP2Parameters getHTTP2Parameters() {
        return this.HTTP2Parameters;
    }

    /**
     * Set HTTP2 access configuration parameter. this parameter is required when name is http2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HTTP2Parameters HTTP2 access configuration parameter. this parameter is required when name is http2.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHTTP2Parameters(HTTP2Parameters HTTP2Parameters) {
        this.HTTP2Parameters = HTTP2Parameters;
    }

    /**
     * Get Maximum size configuration for file streaming upload via a post request. this parameter is required when name is postmaxsize.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return PostMaxSizeParameters Maximum size configuration for file streaming upload via a post request. this parameter is required when name is postmaxsize.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public PostMaxSizeParameters getPostMaxSizeParameters() {
        return this.PostMaxSizeParameters;
    }

    /**
     * Set Maximum size configuration for file streaming upload via a post request. this parameter is required when name is postmaxsize.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param PostMaxSizeParameters Maximum size configuration for file streaming upload via a post request. this parameter is required when name is postmaxsize.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setPostMaxSizeParameters(PostMaxSizeParameters PostMaxSizeParameters) {
        this.PostMaxSizeParameters = PostMaxSizeParameters;
    }

    /**
     * Get Configuration parameter for carrying the region information of the client ip during origin-pull. this parameter is required when the name is set to clientipcountry.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ClientIPCountryParameters Configuration parameter for carrying the region information of the client ip during origin-pull. this parameter is required when the name is set to clientipcountry.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ClientIPCountryParameters getClientIPCountryParameters() {
        return this.ClientIPCountryParameters;
    }

    /**
     * Set Configuration parameter for carrying the region information of the client ip during origin-pull. this parameter is required when the name is set to clientipcountry.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ClientIPCountryParameters Configuration parameter for carrying the region information of the client ip during origin-pull. this parameter is required when the name is set to clientipcountry.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setClientIPCountryParameters(ClientIPCountryParameters ClientIPCountryParameters) {
        this.ClientIPCountryParameters = ClientIPCountryParameters;
    }

    /**
     * Get Configuration parameter for following redirects during origin-pull. this parameter is required when the name is set to upstreamfollowredirect.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return UpstreamFollowRedirectParameters Configuration parameter for following redirects during origin-pull. this parameter is required when the name is set to upstreamfollowredirect.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamFollowRedirectParameters getUpstreamFollowRedirectParameters() {
        return this.UpstreamFollowRedirectParameters;
    }

    /**
     * Set Configuration parameter for following redirects during origin-pull. this parameter is required when the name is set to upstreamfollowredirect.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param UpstreamFollowRedirectParameters Configuration parameter for following redirects during origin-pull. this parameter is required when the name is set to upstreamfollowredirect.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setUpstreamFollowRedirectParameters(UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters) {
        this.UpstreamFollowRedirectParameters = UpstreamFollowRedirectParameters;
    }

    /**
     * Get Configuration parameter for origin-pull request. this parameter is required when the name is set to upstreamrequest.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return UpstreamRequestParameters Configuration parameter for origin-pull request. this parameter is required when the name is set to upstreamrequest.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamRequestParameters getUpstreamRequestParameters() {
        return this.UpstreamRequestParameters;
    }

    /**
     * Set Configuration parameter for origin-pull request. this parameter is required when the name is set to upstreamrequest.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param UpstreamRequestParameters Configuration parameter for origin-pull request. this parameter is required when the name is set to upstreamrequest.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setUpstreamRequestParameters(UpstreamRequestParameters UpstreamRequestParameters) {
        this.UpstreamRequestParameters = UpstreamRequestParameters;
    }

    /**
     * Get SSL/TLS security configuration parameter. this parameter is required when the name is set to tlsconfig.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return TLSConfigParameters SSL/TLS security configuration parameter. this parameter is required when the name is set to tlsconfig.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public TLSConfigParameters getTLSConfigParameters() {
        return this.TLSConfigParameters;
    }

    /**
     * Set SSL/TLS security configuration parameter. this parameter is required when the name is set to tlsconfig.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param TLSConfigParameters SSL/TLS security configuration parameter. this parameter is required when the name is set to tlsconfig.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setTLSConfigParameters(TLSConfigParameters TLSConfigParameters) {
        this.TLSConfigParameters = TLSConfigParameters;
    }

    /**
     * Get Configuration parameter for modifying the origin server. this parameter is required when the name is set to modifyorigin.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ModifyOriginParameters Configuration parameter for modifying the origin server. this parameter is required when the name is set to modifyorigin.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ModifyOriginParameters getModifyOriginParameters() {
        return this.ModifyOriginParameters;
    }

    /**
     * Set Configuration parameter for modifying the origin server. this parameter is required when the name is set to modifyorigin.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ModifyOriginParameters Configuration parameter for modifying the origin server. this parameter is required when the name is set to modifyorigin.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setModifyOriginParameters(ModifyOriginParameters ModifyOriginParameters) {
        this.ModifyOriginParameters = ModifyOriginParameters;
    }

    /**
     * Get Configuration of layer 7 origin timeout. this parameter is required when name is httpupstreamtimeout.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HTTPUpstreamTimeoutParameters Configuration of layer 7 origin timeout. this parameter is required when name is httpupstreamtimeout.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HTTPUpstreamTimeoutParameters getHTTPUpstreamTimeoutParameters() {
        return this.HTTPUpstreamTimeoutParameters;
    }

    /**
     * Set Configuration of layer 7 origin timeout. this parameter is required when name is httpupstreamtimeout.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HTTPUpstreamTimeoutParameters Configuration of layer 7 origin timeout. this parameter is required when name is httpupstreamtimeout.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHTTPUpstreamTimeoutParameters(HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters) {
        this.HTTPUpstreamTimeoutParameters = HTTPUpstreamTimeoutParameters;
    }

    /**
     * Get HTTP response configuration parameters. this parameter is required when name is httpresponse.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HttpResponseParameters HTTP response configuration parameters. this parameter is required when name is httpresponse.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HTTPResponseParameters getHttpResponseParameters() {
        return this.HttpResponseParameters;
    }

    /**
     * Set HTTP response configuration parameters. this parameter is required when name is httpresponse.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HttpResponseParameters HTTP response configuration parameters. this parameter is required when name is httpresponse.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHttpResponseParameters(HTTPResponseParameters HttpResponseParameters) {
        this.HttpResponseParameters = HttpResponseParameters;
    }

    /**
     * Get Custom error page configuration parameters. this parameter is required when name is errorpage.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ErrorPageParameters Custom error page configuration parameters. this parameter is required when name is errorpage.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ErrorPageParameters getErrorPageParameters() {
        return this.ErrorPageParameters;
    }

    /**
     * Set Custom error page configuration parameters. this parameter is required when name is errorpage.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ErrorPageParameters Custom error page configuration parameters. this parameter is required when name is errorpage.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setErrorPageParameters(ErrorPageParameters ErrorPageParameters) {
        this.ErrorPageParameters = ErrorPageParameters;
    }

    /**
     * Get Modify http node response header configuration parameters. this parameter is required when name is modifyresponseheader.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ModifyResponseHeaderParameters Modify http node response header configuration parameters. this parameter is required when name is modifyresponseheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ModifyResponseHeaderParameters getModifyResponseHeaderParameters() {
        return this.ModifyResponseHeaderParameters;
    }

    /**
     * Set Modify http node response header configuration parameters. this parameter is required when name is modifyresponseheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ModifyResponseHeaderParameters Modify http node response header configuration parameters. this parameter is required when name is modifyresponseheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setModifyResponseHeaderParameters(ModifyResponseHeaderParameters ModifyResponseHeaderParameters) {
        this.ModifyResponseHeaderParameters = ModifyResponseHeaderParameters;
    }

    /**
     * Get Modify http node request header configuration parameters. this parameter is required when name is modifyrequestheader.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ModifyRequestHeaderParameters Modify http node request header configuration parameters. this parameter is required when name is modifyrequestheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ModifyRequestHeaderParameters getModifyRequestHeaderParameters() {
        return this.ModifyRequestHeaderParameters;
    }

    /**
     * Set Modify http node request header configuration parameters. this parameter is required when name is modifyrequestheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ModifyRequestHeaderParameters Modify http node request header configuration parameters. this parameter is required when name is modifyrequestheader.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setModifyRequestHeaderParameters(ModifyRequestHeaderParameters ModifyRequestHeaderParameters) {
        this.ModifyRequestHeaderParameters = ModifyRequestHeaderParameters;
    }

    /**
     * Get Single connection download speed limit configuration parameter. this parameter is required when name is responsespeedlimit.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return ResponseSpeedLimitParameters Single connection download speed limit configuration parameter. this parameter is required when name is responsespeedlimit.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public ResponseSpeedLimitParameters getResponseSpeedLimitParameters() {
        return this.ResponseSpeedLimitParameters;
    }

    /**
     * Set Single connection download speed limit configuration parameter. this parameter is required when name is responsespeedlimit.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param ResponseSpeedLimitParameters Single connection download speed limit configuration parameter. this parameter is required when name is responsespeedlimit.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setResponseSpeedLimitParameters(ResponseSpeedLimitParameters ResponseSpeedLimitParameters) {
        this.ResponseSpeedLimitParameters = ResponseSpeedLimitParameters;
    }

    /**
     * Get Content identification configuration parameter. this parameter is required when name is httpresponse.

Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return SetContentIdentifierParameters Content identification configuration parameter. this parameter is required when name is httpresponse.

Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public SetContentIdentifierParameters getSetContentIdentifierParameters() {
        return this.SetContentIdentifierParameters;
    }

    /**
     * Set Content identification configuration parameter. this parameter is required when name is httpresponse.

Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param SetContentIdentifierParameters Content identification configuration parameter. this parameter is required when name is httpresponse.

Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setSetContentIdentifierParameters(SetContentIdentifierParameters SetContentIdentifierParameters) {
        this.SetContentIdentifierParameters = SetContentIdentifierParameters;
    }

    public RuleEngineAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineAction(RuleEngineAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CacheParameters != null) {
            this.CacheParameters = new CacheParameters(source.CacheParameters);
        }
        if (source.CacheKeyParameters != null) {
            this.CacheKeyParameters = new CacheKeyParameters(source.CacheKeyParameters);
        }
        if (source.CachePrefreshParameters != null) {
            this.CachePrefreshParameters = new CachePrefreshParameters(source.CachePrefreshParameters);
        }
        if (source.AccessURLRedirectParameters != null) {
            this.AccessURLRedirectParameters = new AccessURLRedirectParameters(source.AccessURLRedirectParameters);
        }
        if (source.UpstreamURLRewriteParameters != null) {
            this.UpstreamURLRewriteParameters = new UpstreamURLRewriteParameters(source.UpstreamURLRewriteParameters);
        }
        if (source.QUICParameters != null) {
            this.QUICParameters = new QUICParameters(source.QUICParameters);
        }
        if (source.WebSocketParameters != null) {
            this.WebSocketParameters = new WebSocketParameters(source.WebSocketParameters);
        }
        if (source.AuthenticationParameters != null) {
            this.AuthenticationParameters = new AuthenticationParameters(source.AuthenticationParameters);
        }
        if (source.MaxAgeParameters != null) {
            this.MaxAgeParameters = new MaxAgeParameters(source.MaxAgeParameters);
        }
        if (source.StatusCodeCacheParameters != null) {
            this.StatusCodeCacheParameters = new StatusCodeCacheParameters(source.StatusCodeCacheParameters);
        }
        if (source.OfflineCacheParameters != null) {
            this.OfflineCacheParameters = new OfflineCacheParameters(source.OfflineCacheParameters);
        }
        if (source.SmartRoutingParameters != null) {
            this.SmartRoutingParameters = new SmartRoutingParameters(source.SmartRoutingParameters);
        }
        if (source.RangeOriginPullParameters != null) {
            this.RangeOriginPullParameters = new RangeOriginPullParameters(source.RangeOriginPullParameters);
        }
        if (source.UpstreamHTTP2Parameters != null) {
            this.UpstreamHTTP2Parameters = new UpstreamHTTP2Parameters(source.UpstreamHTTP2Parameters);
        }
        if (source.HostHeaderParameters != null) {
            this.HostHeaderParameters = new HostHeaderParameters(source.HostHeaderParameters);
        }
        if (source.ForceRedirectHTTPSParameters != null) {
            this.ForceRedirectHTTPSParameters = new ForceRedirectHTTPSParameters(source.ForceRedirectHTTPSParameters);
        }
        if (source.CompressionParameters != null) {
            this.CompressionParameters = new CompressionParameters(source.CompressionParameters);
        }
        if (source.HSTSParameters != null) {
            this.HSTSParameters = new HSTSParameters(source.HSTSParameters);
        }
        if (source.ClientIPHeaderParameters != null) {
            this.ClientIPHeaderParameters = new ClientIPHeaderParameters(source.ClientIPHeaderParameters);
        }
        if (source.OCSPStaplingParameters != null) {
            this.OCSPStaplingParameters = new OCSPStaplingParameters(source.OCSPStaplingParameters);
        }
        if (source.HTTP2Parameters != null) {
            this.HTTP2Parameters = new HTTP2Parameters(source.HTTP2Parameters);
        }
        if (source.PostMaxSizeParameters != null) {
            this.PostMaxSizeParameters = new PostMaxSizeParameters(source.PostMaxSizeParameters);
        }
        if (source.ClientIPCountryParameters != null) {
            this.ClientIPCountryParameters = new ClientIPCountryParameters(source.ClientIPCountryParameters);
        }
        if (source.UpstreamFollowRedirectParameters != null) {
            this.UpstreamFollowRedirectParameters = new UpstreamFollowRedirectParameters(source.UpstreamFollowRedirectParameters);
        }
        if (source.UpstreamRequestParameters != null) {
            this.UpstreamRequestParameters = new UpstreamRequestParameters(source.UpstreamRequestParameters);
        }
        if (source.TLSConfigParameters != null) {
            this.TLSConfigParameters = new TLSConfigParameters(source.TLSConfigParameters);
        }
        if (source.ModifyOriginParameters != null) {
            this.ModifyOriginParameters = new ModifyOriginParameters(source.ModifyOriginParameters);
        }
        if (source.HTTPUpstreamTimeoutParameters != null) {
            this.HTTPUpstreamTimeoutParameters = new HTTPUpstreamTimeoutParameters(source.HTTPUpstreamTimeoutParameters);
        }
        if (source.HttpResponseParameters != null) {
            this.HttpResponseParameters = new HTTPResponseParameters(source.HttpResponseParameters);
        }
        if (source.ErrorPageParameters != null) {
            this.ErrorPageParameters = new ErrorPageParameters(source.ErrorPageParameters);
        }
        if (source.ModifyResponseHeaderParameters != null) {
            this.ModifyResponseHeaderParameters = new ModifyResponseHeaderParameters(source.ModifyResponseHeaderParameters);
        }
        if (source.ModifyRequestHeaderParameters != null) {
            this.ModifyRequestHeaderParameters = new ModifyRequestHeaderParameters(source.ModifyRequestHeaderParameters);
        }
        if (source.ResponseSpeedLimitParameters != null) {
            this.ResponseSpeedLimitParameters = new ResponseSpeedLimitParameters(source.ResponseSpeedLimitParameters);
        }
        if (source.SetContentIdentifierParameters != null) {
            this.SetContentIdentifierParameters = new SetContentIdentifierParameters(source.SetContentIdentifierParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "CacheParameters.", this.CacheParameters);
        this.setParamObj(map, prefix + "CacheKeyParameters.", this.CacheKeyParameters);
        this.setParamObj(map, prefix + "CachePrefreshParameters.", this.CachePrefreshParameters);
        this.setParamObj(map, prefix + "AccessURLRedirectParameters.", this.AccessURLRedirectParameters);
        this.setParamObj(map, prefix + "UpstreamURLRewriteParameters.", this.UpstreamURLRewriteParameters);
        this.setParamObj(map, prefix + "QUICParameters.", this.QUICParameters);
        this.setParamObj(map, prefix + "WebSocketParameters.", this.WebSocketParameters);
        this.setParamObj(map, prefix + "AuthenticationParameters.", this.AuthenticationParameters);
        this.setParamObj(map, prefix + "MaxAgeParameters.", this.MaxAgeParameters);
        this.setParamObj(map, prefix + "StatusCodeCacheParameters.", this.StatusCodeCacheParameters);
        this.setParamObj(map, prefix + "OfflineCacheParameters.", this.OfflineCacheParameters);
        this.setParamObj(map, prefix + "SmartRoutingParameters.", this.SmartRoutingParameters);
        this.setParamObj(map, prefix + "RangeOriginPullParameters.", this.RangeOriginPullParameters);
        this.setParamObj(map, prefix + "UpstreamHTTP2Parameters.", this.UpstreamHTTP2Parameters);
        this.setParamObj(map, prefix + "HostHeaderParameters.", this.HostHeaderParameters);
        this.setParamObj(map, prefix + "ForceRedirectHTTPSParameters.", this.ForceRedirectHTTPSParameters);
        this.setParamObj(map, prefix + "CompressionParameters.", this.CompressionParameters);
        this.setParamObj(map, prefix + "HSTSParameters.", this.HSTSParameters);
        this.setParamObj(map, prefix + "ClientIPHeaderParameters.", this.ClientIPHeaderParameters);
        this.setParamObj(map, prefix + "OCSPStaplingParameters.", this.OCSPStaplingParameters);
        this.setParamObj(map, prefix + "HTTP2Parameters.", this.HTTP2Parameters);
        this.setParamObj(map, prefix + "PostMaxSizeParameters.", this.PostMaxSizeParameters);
        this.setParamObj(map, prefix + "ClientIPCountryParameters.", this.ClientIPCountryParameters);
        this.setParamObj(map, prefix + "UpstreamFollowRedirectParameters.", this.UpstreamFollowRedirectParameters);
        this.setParamObj(map, prefix + "UpstreamRequestParameters.", this.UpstreamRequestParameters);
        this.setParamObj(map, prefix + "TLSConfigParameters.", this.TLSConfigParameters);
        this.setParamObj(map, prefix + "ModifyOriginParameters.", this.ModifyOriginParameters);
        this.setParamObj(map, prefix + "HTTPUpstreamTimeoutParameters.", this.HTTPUpstreamTimeoutParameters);
        this.setParamObj(map, prefix + "HttpResponseParameters.", this.HttpResponseParameters);
        this.setParamObj(map, prefix + "ErrorPageParameters.", this.ErrorPageParameters);
        this.setParamObj(map, prefix + "ModifyResponseHeaderParameters.", this.ModifyResponseHeaderParameters);
        this.setParamObj(map, prefix + "ModifyRequestHeaderParameters.", this.ModifyRequestHeaderParameters);
        this.setParamObj(map, prefix + "ResponseSpeedLimitParameters.", this.ResponseSpeedLimitParameters);
        this.setParamObj(map, prefix + "SetContentIdentifierParameters.", this.SetContentIdentifierParameters);

    }
}

