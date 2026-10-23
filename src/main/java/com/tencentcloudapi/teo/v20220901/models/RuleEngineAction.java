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
    * <p>Operation name. The name must correspond to the parameters structure. For example, if Name=Cache, then CacheParameters is required.<li>Cache: Node cache TTL;</li><li>CacheKey: Custom Cache Key;</li><li>CachePrefresh: Cache pre-refresh;</li><li>AccessURLRedirect: Access URL redirection;</li><li>UpstreamURLRewrite: Origin-pull URL rewrite;</li><li>QUIC: QUIC;</li><li>WebSocket: WebSocket;</li><li>Authentication: Token authentication;</li><li>MaxAge: Browser cache TTL;</li><li>StatusCodeCache: Status code cache TTL;</li><li>OfflineCache: Offline cache;</li><li>SmartRouting: Smart acceleration;</li><li>AdvancedOriginRouting: Advanced origin optimization;</li><li>RangeOriginPull: Range-based origin pull;</li><li>UpstreamHTTP2: HTTP2 origin-pull;</li><li>HostHeader: Host header rewrite;</li><li>ForceRedirectHTTPS: Forced HTTPS redirect configuration;</li><li>OriginPullProtocol: Origin-pull HTTPS;</li><li>Compression: Intelligent compression configuration;</li><li>HSTS: HSTS;</li><li>ClientIPHeader: Configuration for storing client IP address in the header;</li><li>OCSPStapling: OCSP stapling;</li><li>HTTP2: HTTP2 integration;</li><li>PostMaxSize: Maximum limit configuration for POST request upload file streaming transmission;</li><li>ClientIPCountry: Carrying regional information of the client IP during origin-pull;</li><li>UpstreamFollowRedirect: Upstream follow redirect parameter configuration;</li><li>UpstreamRequest: Origin-pull request parameters;</li><li>Shield: Origin server uninstallation configuration;</li><li>TLSConfig: SSL/TLS security;</li><li>ModifyOrigin: Modify origin server;</li><li>SiteFailover: Origin server fault migration;</li><li>HTTPUpstreamTimeout: Layer-7 origin-pull timeout configuration;</li><li>HttpResponse: HTTP response;</li><li>ErrorPage: Custom error page;</li><li>ModifyResponseHeader: Modify HTTP node response header;</li><li>ModifyRequestHeader: Modify HTTP node request header;</li><li>ResponseSpeedLimit: Single connection download speed limit;</li><li>SetContentIdentifier: Set content identifier;</li><li>Vary: Vary feature configuration;</li><li>ContentCompression: Content compression configuration;</li><li>OriginAuthentication: Origin-pull authentication configuration;</li><li>CustomAction: Custom configuration.</li></p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Node cache TTL configuration parameter. This parameter is required when the Name value is Cache.</p>
    */
    @SerializedName("CacheParameters")
    @Expose
    private CacheParameters CacheParameters;

    /**
    * <p>Custom Cache Key configuration parameter. When Name value is CacheKey, this parameter is required.
    */
    @SerializedName("CacheKeyParameters")
    @Expose
    private CacheKeyParameters CacheKeyParameters;

    /**
    * <p>Cache pre-refresh configuration parameter. This parameter is required when the Name value is CachePrefresh.</p>
    */
    @SerializedName("CachePrefreshParameters")
    @Expose
    private CachePrefreshParameters CachePrefreshParameters;

    /**
    * <p>Access URL redirection configuration parameter. This parameter is required when the Name value is AccessURLRedirect.</p>
    */
    @SerializedName("AccessURLRedirectParameters")
    @Expose
    private AccessURLRedirectParameters AccessURLRedirectParameters;

    /**
    * <p>Origin-pull URL rewrite configuration parameter. This parameter is required when the value of Name is UpstreamURLRewrite.</p>
    */
    @SerializedName("UpstreamURLRewriteParameters")
    @Expose
    private UpstreamURLRewriteParameters UpstreamURLRewriteParameters;

    /**
    * <p>QUIC configuration parameter. This parameter is required when the Name value is QUIC.</p>
    */
    @SerializedName("QUICParameters")
    @Expose
    private QUICParameters QUICParameters;

    /**
    * <p>WebSocket configuration parameter. This parameter is required when the Name value is WebSocket.</p>
    */
    @SerializedName("WebSocketParameters")
    @Expose
    private WebSocketParameters WebSocketParameters;

    /**
    * <p>Token authentication configuration parameter. This parameter is required when the Name value is Authentication.</p>
    */
    @SerializedName("AuthenticationParameters")
    @Expose
    private AuthenticationParameters AuthenticationParameters;

    /**
    * <p>Browser cache TTL configuration parameter. This parameter is required when the value of Name is MaxAge.</p>
    */
    @SerializedName("MaxAgeParameters")
    @Expose
    private MaxAgeParameters MaxAgeParameters;

    /**
    * <p>Status code cache TTL configuration parameter. This parameter is required when the Name value is StatusCodeCache.</p>
    */
    @SerializedName("StatusCodeCacheParameters")
    @Expose
    private StatusCodeCacheParameters StatusCodeCacheParameters;

    /**
    * <p>Offline cache configuration parameter. This parameter is required when the Name value is OfflineCache.</p>
    */
    @SerializedName("OfflineCacheParameters")
    @Expose
    private OfflineCacheParameters OfflineCacheParameters;

    /**
    * <p>Smart acceleration configuration parameter. This parameter is required when the Name value is SmartRouting.</p>
    */
    @SerializedName("SmartRoutingParameters")
    @Expose
    private SmartRoutingParameters SmartRoutingParameters;

    /**
    * <p>Advanced origin optimization configuration parameter. This parameter is required when the Name value is AdvancedOriginRouting.</p>
    */
    @SerializedName("AdvancedOriginRoutingParameters")
    @Expose
    private AdvancedOriginRoutingParameters AdvancedOriginRoutingParameters;

    /**
    * <p>Configuration parameter for range-based origin pull. This parameter is required when the value of Name is RangeOriginPull.</p>
    */
    @SerializedName("RangeOriginPullParameters")
    @Expose
    private RangeOriginPullParameters RangeOriginPullParameters;

    /**
    * <p>HTTP2 origin configuration parameter. This parameter is required when the Name value is UpstreamHTTP2.</p>
    */
    @SerializedName("UpstreamHTTP2Parameters")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2Parameters;

    /**
    * <p>Host header rewrite configuration parameter. When the Name value is HostHeader, this parameter is required.</p>
    */
    @SerializedName("HostHeaderParameters")
    @Expose
    private HostHeaderParameters HostHeaderParameters;

    /**
    * <p>Forced HTTPS redirect configuration for the access protocol. This parameter is required when the Name value is ForceRedirectHTTPS.</p>
    */
    @SerializedName("ForceRedirectHTTPSParameters")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters;

    /**
    * <p>Origin HTTPS configuration parameter. This parameter is required when the Name value is OriginPullProtocol.</p>
    */
    @SerializedName("OriginPullProtocolParameters")
    @Expose
    private OriginPullProtocolParameters OriginPullProtocolParameters;

    /**
    * <p>Intelligent compression configuration. This parameter is required when the Name value is Compression.</p>
    */
    @SerializedName("CompressionParameters")
    @Expose
    private CompressionParameters CompressionParameters;

    /**
    * <p>HSTS configuration parameter. When the Name value is HSTS, this parameter is required.</p>
    */
    @SerializedName("HSTSParameters")
    @Expose
    private HSTSParameters HSTSParameters;

    /**
    * <p>Configuration header information for storing client request IP. When the Name value is ClientIPHeader, this parameter is required.</p>
    */
    @SerializedName("ClientIPHeaderParameters")
    @Expose
    private ClientIPHeaderParameters ClientIPHeaderParameters;

    /**
    * <p>OCSP stapling configuration parameter. This parameter is required when Name value is OCSPStapling.</p>
    */
    @SerializedName("OCSPStaplingParameters")
    @Expose
    private OCSPStaplingParameters OCSPStaplingParameters;

    /**
    * <p>HTTP2 integration configuration parameter. This parameter is required when the Name value is HTTP2.</p>
    */
    @SerializedName("HTTP2Parameters")
    @Expose
    private HTTP2Parameters HTTP2Parameters;

    /**
    * <p>Maximum limit configuration for file streaming transmission in POST request upload. When the Name value is PostMaxSize, this parameter is required.</p>
    */
    @SerializedName("PostMaxSizeParameters")
    @Expose
    private PostMaxSizeParameters PostMaxSizeParameters;

    /**
    * <p>Configuration parameter for carrying client IP regional information during origin pull. When the Name value is ClientIPCountry, this parameter is required.</p>
    */
    @SerializedName("ClientIPCountryParameters")
    @Expose
    private ClientIPCountryParameters ClientIPCountryParameters;

    /**
    * <p>Origin-pull follow redirect parameter configuration. This parameter is required when the Name value is UpstreamFollowRedirect.</p>
    */
    @SerializedName("UpstreamFollowRedirectParameters")
    @Expose
    private UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters;

    /**
    * <p>Origin-pull request parameter configuration parameter. This parameter is required when the Name value is UpstreamRequest.</p>
    */
    @SerializedName("UpstreamRequestParameters")
    @Expose
    private UpstreamRequestParameters UpstreamRequestParameters;

    /**
    * <p>Origin server uninstallation configuration parameter. This parameter is required when the Name value is Shield.</p>
    */
    @SerializedName("ShieldParameters")
    @Expose
    private ShieldParameters ShieldParameters;

    /**
    * <p>SSL/TLS security configuration parameter. This parameter is required when the Name value is TLSConfig.</p>
    */
    @SerializedName("TLSConfigParameters")
    @Expose
    private TLSConfigParameters TLSConfigParameters;

    /**
    * <p>Modify origin server configuration parameter. When the Name value is ModifyOrigin, this parameter is required.</p>
    */
    @SerializedName("ModifyOriginParameters")
    @Expose
    private ModifyOriginParameters ModifyOriginParameters;

    /**
    * <p>Source site fault migration config. When the Name value is SiteFailover, this parameter is required.</p>
    */
    @SerializedName("SiteFailoverParameters")
    @Expose
    private SiteFailoverParameters SiteFailoverParameters;

    /**
    * <p>Layer 7 origin pull timeout configuration. This parameter is required when the Name value is HTTPUpstreamTimeout.</p>
    */
    @SerializedName("HTTPUpstreamTimeoutParameters")
    @Expose
    private HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters;

    /**
    * <p>HTTP response configuration parameter. This parameter is required when the Name value is HttpResponse.</p>
    */
    @SerializedName("HttpResponseParameters")
    @Expose
    private HTTPResponseParameters HttpResponseParameters;

    /**
    * <p>Custom error page configuration parameter. This parameter is required when the value of Name is ErrorPage.</p>
    */
    @SerializedName("ErrorPageParameters")
    @Expose
    private ErrorPageParameters ErrorPageParameters;

    /**
    * <p>Modify the HTTP node response header configuration parameter. This parameter is required when the Name value is ModifyResponseHeader.</p>
    */
    @SerializedName("ModifyResponseHeaderParameters")
    @Expose
    private ModifyResponseHeaderParameters ModifyResponseHeaderParameters;

    /**
    * <p>Modify the request header configuration parameter of the HTTP node. This parameter is required when the Name value is ModifyRequestHeader.</p>
    */
    @SerializedName("ModifyRequestHeaderParameters")
    @Expose
    private ModifyRequestHeaderParameters ModifyRequestHeaderParameters;

    /**
    * <p>Single connection download speed limit configuration parameter. This parameter is required when the Name value is ResponseSpeedLimit.</p>
    */
    @SerializedName("ResponseSpeedLimitParameters")
    @Expose
    private ResponseSpeedLimitParameters ResponseSpeedLimitParameters;

    /**
    * <p>Content identification configuration parameter. This parameter is required when the Name value is SetContentIdentifier.</p>
    */
    @SerializedName("SetContentIdentifierParameters")
    @Expose
    private SetContentIdentifierParameters SetContentIdentifierParameters;

    /**
    * <p>Vary feature configuration parameter. This parameter is required when the Name value is Vary.</p>
    */
    @SerializedName("VaryParameters")
    @Expose
    private VaryParameters VaryParameters;

    /**
    * <p>Content compression configuration parameter. When the Name value is ContentCompression, this parameter is required. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
    */
    @SerializedName("ContentCompressionParameters")
    @Expose
    private ContentCompressionParameters ContentCompressionParameters;

    /**
    * <p>Origin authentication configuration parameter. This parameter is required when Name value is OriginAuthentication. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
    */
    @SerializedName("OriginAuthenticationParameters")
    @Expose
    private OriginAuthenticationParameters OriginAuthenticationParameters;

    /**
    * <p>Custom configuration operation parameter. This parameter is required when the Name value is CustomAction.</p><p>You can obtain the list of currently supported custom configuration items through the CustomActionSet returned value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
    */
    @SerializedName("CustomActionParameters")
    @Expose
    private CustomActionParameters CustomActionParameters;

    /**
     * Get <p>Operation name. The name must correspond to the parameters structure. For example, if Name=Cache, then CacheParameters is required.<li>Cache: Node cache TTL;</li><li>CacheKey: Custom Cache Key;</li><li>CachePrefresh: Cache pre-refresh;</li><li>AccessURLRedirect: Access URL redirection;</li><li>UpstreamURLRewrite: Origin-pull URL rewrite;</li><li>QUIC: QUIC;</li><li>WebSocket: WebSocket;</li><li>Authentication: Token authentication;</li><li>MaxAge: Browser cache TTL;</li><li>StatusCodeCache: Status code cache TTL;</li><li>OfflineCache: Offline cache;</li><li>SmartRouting: Smart acceleration;</li><li>AdvancedOriginRouting: Advanced origin optimization;</li><li>RangeOriginPull: Range-based origin pull;</li><li>UpstreamHTTP2: HTTP2 origin-pull;</li><li>HostHeader: Host header rewrite;</li><li>ForceRedirectHTTPS: Forced HTTPS redirect configuration;</li><li>OriginPullProtocol: Origin-pull HTTPS;</li><li>Compression: Intelligent compression configuration;</li><li>HSTS: HSTS;</li><li>ClientIPHeader: Configuration for storing client IP address in the header;</li><li>OCSPStapling: OCSP stapling;</li><li>HTTP2: HTTP2 integration;</li><li>PostMaxSize: Maximum limit configuration for POST request upload file streaming transmission;</li><li>ClientIPCountry: Carrying regional information of the client IP during origin-pull;</li><li>UpstreamFollowRedirect: Upstream follow redirect parameter configuration;</li><li>UpstreamRequest: Origin-pull request parameters;</li><li>Shield: Origin server uninstallation configuration;</li><li>TLSConfig: SSL/TLS security;</li><li>ModifyOrigin: Modify origin server;</li><li>SiteFailover: Origin server fault migration;</li><li>HTTPUpstreamTimeout: Layer-7 origin-pull timeout configuration;</li><li>HttpResponse: HTTP response;</li><li>ErrorPage: Custom error page;</li><li>ModifyResponseHeader: Modify HTTP node response header;</li><li>ModifyRequestHeader: Modify HTTP node request header;</li><li>ResponseSpeedLimit: Single connection download speed limit;</li><li>SetContentIdentifier: Set content identifier;</li><li>Vary: Vary feature configuration;</li><li>ContentCompression: Content compression configuration;</li><li>OriginAuthentication: Origin-pull authentication configuration;</li><li>CustomAction: Custom configuration.</li></p> 
     * @return Name <p>Operation name. The name must correspond to the parameters structure. For example, if Name=Cache, then CacheParameters is required.<li>Cache: Node cache TTL;</li><li>CacheKey: Custom Cache Key;</li><li>CachePrefresh: Cache pre-refresh;</li><li>AccessURLRedirect: Access URL redirection;</li><li>UpstreamURLRewrite: Origin-pull URL rewrite;</li><li>QUIC: QUIC;</li><li>WebSocket: WebSocket;</li><li>Authentication: Token authentication;</li><li>MaxAge: Browser cache TTL;</li><li>StatusCodeCache: Status code cache TTL;</li><li>OfflineCache: Offline cache;</li><li>SmartRouting: Smart acceleration;</li><li>AdvancedOriginRouting: Advanced origin optimization;</li><li>RangeOriginPull: Range-based origin pull;</li><li>UpstreamHTTP2: HTTP2 origin-pull;</li><li>HostHeader: Host header rewrite;</li><li>ForceRedirectHTTPS: Forced HTTPS redirect configuration;</li><li>OriginPullProtocol: Origin-pull HTTPS;</li><li>Compression: Intelligent compression configuration;</li><li>HSTS: HSTS;</li><li>ClientIPHeader: Configuration for storing client IP address in the header;</li><li>OCSPStapling: OCSP stapling;</li><li>HTTP2: HTTP2 integration;</li><li>PostMaxSize: Maximum limit configuration for POST request upload file streaming transmission;</li><li>ClientIPCountry: Carrying regional information of the client IP during origin-pull;</li><li>UpstreamFollowRedirect: Upstream follow redirect parameter configuration;</li><li>UpstreamRequest: Origin-pull request parameters;</li><li>Shield: Origin server uninstallation configuration;</li><li>TLSConfig: SSL/TLS security;</li><li>ModifyOrigin: Modify origin server;</li><li>SiteFailover: Origin server fault migration;</li><li>HTTPUpstreamTimeout: Layer-7 origin-pull timeout configuration;</li><li>HttpResponse: HTTP response;</li><li>ErrorPage: Custom error page;</li><li>ModifyResponseHeader: Modify HTTP node response header;</li><li>ModifyRequestHeader: Modify HTTP node request header;</li><li>ResponseSpeedLimit: Single connection download speed limit;</li><li>SetContentIdentifier: Set content identifier;</li><li>Vary: Vary feature configuration;</li><li>ContentCompression: Content compression configuration;</li><li>OriginAuthentication: Origin-pull authentication configuration;</li><li>CustomAction: Custom configuration.</li></p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Operation name. The name must correspond to the parameters structure. For example, if Name=Cache, then CacheParameters is required.<li>Cache: Node cache TTL;</li><li>CacheKey: Custom Cache Key;</li><li>CachePrefresh: Cache pre-refresh;</li><li>AccessURLRedirect: Access URL redirection;</li><li>UpstreamURLRewrite: Origin-pull URL rewrite;</li><li>QUIC: QUIC;</li><li>WebSocket: WebSocket;</li><li>Authentication: Token authentication;</li><li>MaxAge: Browser cache TTL;</li><li>StatusCodeCache: Status code cache TTL;</li><li>OfflineCache: Offline cache;</li><li>SmartRouting: Smart acceleration;</li><li>AdvancedOriginRouting: Advanced origin optimization;</li><li>RangeOriginPull: Range-based origin pull;</li><li>UpstreamHTTP2: HTTP2 origin-pull;</li><li>HostHeader: Host header rewrite;</li><li>ForceRedirectHTTPS: Forced HTTPS redirect configuration;</li><li>OriginPullProtocol: Origin-pull HTTPS;</li><li>Compression: Intelligent compression configuration;</li><li>HSTS: HSTS;</li><li>ClientIPHeader: Configuration for storing client IP address in the header;</li><li>OCSPStapling: OCSP stapling;</li><li>HTTP2: HTTP2 integration;</li><li>PostMaxSize: Maximum limit configuration for POST request upload file streaming transmission;</li><li>ClientIPCountry: Carrying regional information of the client IP during origin-pull;</li><li>UpstreamFollowRedirect: Upstream follow redirect parameter configuration;</li><li>UpstreamRequest: Origin-pull request parameters;</li><li>Shield: Origin server uninstallation configuration;</li><li>TLSConfig: SSL/TLS security;</li><li>ModifyOrigin: Modify origin server;</li><li>SiteFailover: Origin server fault migration;</li><li>HTTPUpstreamTimeout: Layer-7 origin-pull timeout configuration;</li><li>HttpResponse: HTTP response;</li><li>ErrorPage: Custom error page;</li><li>ModifyResponseHeader: Modify HTTP node response header;</li><li>ModifyRequestHeader: Modify HTTP node request header;</li><li>ResponseSpeedLimit: Single connection download speed limit;</li><li>SetContentIdentifier: Set content identifier;</li><li>Vary: Vary feature configuration;</li><li>ContentCompression: Content compression configuration;</li><li>OriginAuthentication: Origin-pull authentication configuration;</li><li>CustomAction: Custom configuration.</li></p>
     * @param Name <p>Operation name. The name must correspond to the parameters structure. For example, if Name=Cache, then CacheParameters is required.<li>Cache: Node cache TTL;</li><li>CacheKey: Custom Cache Key;</li><li>CachePrefresh: Cache pre-refresh;</li><li>AccessURLRedirect: Access URL redirection;</li><li>UpstreamURLRewrite: Origin-pull URL rewrite;</li><li>QUIC: QUIC;</li><li>WebSocket: WebSocket;</li><li>Authentication: Token authentication;</li><li>MaxAge: Browser cache TTL;</li><li>StatusCodeCache: Status code cache TTL;</li><li>OfflineCache: Offline cache;</li><li>SmartRouting: Smart acceleration;</li><li>AdvancedOriginRouting: Advanced origin optimization;</li><li>RangeOriginPull: Range-based origin pull;</li><li>UpstreamHTTP2: HTTP2 origin-pull;</li><li>HostHeader: Host header rewrite;</li><li>ForceRedirectHTTPS: Forced HTTPS redirect configuration;</li><li>OriginPullProtocol: Origin-pull HTTPS;</li><li>Compression: Intelligent compression configuration;</li><li>HSTS: HSTS;</li><li>ClientIPHeader: Configuration for storing client IP address in the header;</li><li>OCSPStapling: OCSP stapling;</li><li>HTTP2: HTTP2 integration;</li><li>PostMaxSize: Maximum limit configuration for POST request upload file streaming transmission;</li><li>ClientIPCountry: Carrying regional information of the client IP during origin-pull;</li><li>UpstreamFollowRedirect: Upstream follow redirect parameter configuration;</li><li>UpstreamRequest: Origin-pull request parameters;</li><li>Shield: Origin server uninstallation configuration;</li><li>TLSConfig: SSL/TLS security;</li><li>ModifyOrigin: Modify origin server;</li><li>SiteFailover: Origin server fault migration;</li><li>HTTPUpstreamTimeout: Layer-7 origin-pull timeout configuration;</li><li>HttpResponse: HTTP response;</li><li>ErrorPage: Custom error page;</li><li>ModifyResponseHeader: Modify HTTP node response header;</li><li>ModifyRequestHeader: Modify HTTP node request header;</li><li>ResponseSpeedLimit: Single connection download speed limit;</li><li>SetContentIdentifier: Set content identifier;</li><li>Vary: Vary feature configuration;</li><li>ContentCompression: Content compression configuration;</li><li>OriginAuthentication: Origin-pull authentication configuration;</li><li>CustomAction: Custom configuration.</li></p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Node cache TTL configuration parameter. This parameter is required when the Name value is Cache.</p> 
     * @return CacheParameters <p>Node cache TTL configuration parameter. This parameter is required when the Name value is Cache.</p>
     */
    public CacheParameters getCacheParameters() {
        return this.CacheParameters;
    }

    /**
     * Set <p>Node cache TTL configuration parameter. This parameter is required when the Name value is Cache.</p>
     * @param CacheParameters <p>Node cache TTL configuration parameter. This parameter is required when the Name value is Cache.</p>
     */
    public void setCacheParameters(CacheParameters CacheParameters) {
        this.CacheParameters = CacheParameters;
    }

    /**
     * Get <p>Custom Cache Key configuration parameter. When Name value is CacheKey, this parameter is required. 
     * @return CacheKeyParameters <p>Custom Cache Key configuration parameter. When Name value is CacheKey, this parameter is required.
     */
    public CacheKeyParameters getCacheKeyParameters() {
        return this.CacheKeyParameters;
    }

    /**
     * Set <p>Custom Cache Key configuration parameter. When Name value is CacheKey, this parameter is required.
     * @param CacheKeyParameters <p>Custom Cache Key configuration parameter. When Name value is CacheKey, this parameter is required.
     */
    public void setCacheKeyParameters(CacheKeyParameters CacheKeyParameters) {
        this.CacheKeyParameters = CacheKeyParameters;
    }

    /**
     * Get <p>Cache pre-refresh configuration parameter. This parameter is required when the Name value is CachePrefresh.</p> 
     * @return CachePrefreshParameters <p>Cache pre-refresh configuration parameter. This parameter is required when the Name value is CachePrefresh.</p>
     */
    public CachePrefreshParameters getCachePrefreshParameters() {
        return this.CachePrefreshParameters;
    }

    /**
     * Set <p>Cache pre-refresh configuration parameter. This parameter is required when the Name value is CachePrefresh.</p>
     * @param CachePrefreshParameters <p>Cache pre-refresh configuration parameter. This parameter is required when the Name value is CachePrefresh.</p>
     */
    public void setCachePrefreshParameters(CachePrefreshParameters CachePrefreshParameters) {
        this.CachePrefreshParameters = CachePrefreshParameters;
    }

    /**
     * Get <p>Access URL redirection configuration parameter. This parameter is required when the Name value is AccessURLRedirect.</p> 
     * @return AccessURLRedirectParameters <p>Access URL redirection configuration parameter. This parameter is required when the Name value is AccessURLRedirect.</p>
     */
    public AccessURLRedirectParameters getAccessURLRedirectParameters() {
        return this.AccessURLRedirectParameters;
    }

    /**
     * Set <p>Access URL redirection configuration parameter. This parameter is required when the Name value is AccessURLRedirect.</p>
     * @param AccessURLRedirectParameters <p>Access URL redirection configuration parameter. This parameter is required when the Name value is AccessURLRedirect.</p>
     */
    public void setAccessURLRedirectParameters(AccessURLRedirectParameters AccessURLRedirectParameters) {
        this.AccessURLRedirectParameters = AccessURLRedirectParameters;
    }

    /**
     * Get <p>Origin-pull URL rewrite configuration parameter. This parameter is required when the value of Name is UpstreamURLRewrite.</p> 
     * @return UpstreamURLRewriteParameters <p>Origin-pull URL rewrite configuration parameter. This parameter is required when the value of Name is UpstreamURLRewrite.</p>
     */
    public UpstreamURLRewriteParameters getUpstreamURLRewriteParameters() {
        return this.UpstreamURLRewriteParameters;
    }

    /**
     * Set <p>Origin-pull URL rewrite configuration parameter. This parameter is required when the value of Name is UpstreamURLRewrite.</p>
     * @param UpstreamURLRewriteParameters <p>Origin-pull URL rewrite configuration parameter. This parameter is required when the value of Name is UpstreamURLRewrite.</p>
     */
    public void setUpstreamURLRewriteParameters(UpstreamURLRewriteParameters UpstreamURLRewriteParameters) {
        this.UpstreamURLRewriteParameters = UpstreamURLRewriteParameters;
    }

    /**
     * Get <p>QUIC configuration parameter. This parameter is required when the Name value is QUIC.</p> 
     * @return QUICParameters <p>QUIC configuration parameter. This parameter is required when the Name value is QUIC.</p>
     */
    public QUICParameters getQUICParameters() {
        return this.QUICParameters;
    }

    /**
     * Set <p>QUIC configuration parameter. This parameter is required when the Name value is QUIC.</p>
     * @param QUICParameters <p>QUIC configuration parameter. This parameter is required when the Name value is QUIC.</p>
     */
    public void setQUICParameters(QUICParameters QUICParameters) {
        this.QUICParameters = QUICParameters;
    }

    /**
     * Get <p>WebSocket configuration parameter. This parameter is required when the Name value is WebSocket.</p> 
     * @return WebSocketParameters <p>WebSocket configuration parameter. This parameter is required when the Name value is WebSocket.</p>
     */
    public WebSocketParameters getWebSocketParameters() {
        return this.WebSocketParameters;
    }

    /**
     * Set <p>WebSocket configuration parameter. This parameter is required when the Name value is WebSocket.</p>
     * @param WebSocketParameters <p>WebSocket configuration parameter. This parameter is required when the Name value is WebSocket.</p>
     */
    public void setWebSocketParameters(WebSocketParameters WebSocketParameters) {
        this.WebSocketParameters = WebSocketParameters;
    }

    /**
     * Get <p>Token authentication configuration parameter. This parameter is required when the Name value is Authentication.</p> 
     * @return AuthenticationParameters <p>Token authentication configuration parameter. This parameter is required when the Name value is Authentication.</p>
     */
    public AuthenticationParameters getAuthenticationParameters() {
        return this.AuthenticationParameters;
    }

    /**
     * Set <p>Token authentication configuration parameter. This parameter is required when the Name value is Authentication.</p>
     * @param AuthenticationParameters <p>Token authentication configuration parameter. This parameter is required when the Name value is Authentication.</p>
     */
    public void setAuthenticationParameters(AuthenticationParameters AuthenticationParameters) {
        this.AuthenticationParameters = AuthenticationParameters;
    }

    /**
     * Get <p>Browser cache TTL configuration parameter. This parameter is required when the value of Name is MaxAge.</p> 
     * @return MaxAgeParameters <p>Browser cache TTL configuration parameter. This parameter is required when the value of Name is MaxAge.</p>
     */
    public MaxAgeParameters getMaxAgeParameters() {
        return this.MaxAgeParameters;
    }

    /**
     * Set <p>Browser cache TTL configuration parameter. This parameter is required when the value of Name is MaxAge.</p>
     * @param MaxAgeParameters <p>Browser cache TTL configuration parameter. This parameter is required when the value of Name is MaxAge.</p>
     */
    public void setMaxAgeParameters(MaxAgeParameters MaxAgeParameters) {
        this.MaxAgeParameters = MaxAgeParameters;
    }

    /**
     * Get <p>Status code cache TTL configuration parameter. This parameter is required when the Name value is StatusCodeCache.</p> 
     * @return StatusCodeCacheParameters <p>Status code cache TTL configuration parameter. This parameter is required when the Name value is StatusCodeCache.</p>
     */
    public StatusCodeCacheParameters getStatusCodeCacheParameters() {
        return this.StatusCodeCacheParameters;
    }

    /**
     * Set <p>Status code cache TTL configuration parameter. This parameter is required when the Name value is StatusCodeCache.</p>
     * @param StatusCodeCacheParameters <p>Status code cache TTL configuration parameter. This parameter is required when the Name value is StatusCodeCache.</p>
     */
    public void setStatusCodeCacheParameters(StatusCodeCacheParameters StatusCodeCacheParameters) {
        this.StatusCodeCacheParameters = StatusCodeCacheParameters;
    }

    /**
     * Get <p>Offline cache configuration parameter. This parameter is required when the Name value is OfflineCache.</p> 
     * @return OfflineCacheParameters <p>Offline cache configuration parameter. This parameter is required when the Name value is OfflineCache.</p>
     */
    public OfflineCacheParameters getOfflineCacheParameters() {
        return this.OfflineCacheParameters;
    }

    /**
     * Set <p>Offline cache configuration parameter. This parameter is required when the Name value is OfflineCache.</p>
     * @param OfflineCacheParameters <p>Offline cache configuration parameter. This parameter is required when the Name value is OfflineCache.</p>
     */
    public void setOfflineCacheParameters(OfflineCacheParameters OfflineCacheParameters) {
        this.OfflineCacheParameters = OfflineCacheParameters;
    }

    /**
     * Get <p>Smart acceleration configuration parameter. This parameter is required when the Name value is SmartRouting.</p> 
     * @return SmartRoutingParameters <p>Smart acceleration configuration parameter. This parameter is required when the Name value is SmartRouting.</p>
     */
    public SmartRoutingParameters getSmartRoutingParameters() {
        return this.SmartRoutingParameters;
    }

    /**
     * Set <p>Smart acceleration configuration parameter. This parameter is required when the Name value is SmartRouting.</p>
     * @param SmartRoutingParameters <p>Smart acceleration configuration parameter. This parameter is required when the Name value is SmartRouting.</p>
     */
    public void setSmartRoutingParameters(SmartRoutingParameters SmartRoutingParameters) {
        this.SmartRoutingParameters = SmartRoutingParameters;
    }

    /**
     * Get <p>Advanced origin optimization configuration parameter. This parameter is required when the Name value is AdvancedOriginRouting.</p> 
     * @return AdvancedOriginRoutingParameters <p>Advanced origin optimization configuration parameter. This parameter is required when the Name value is AdvancedOriginRouting.</p>
     */
    public AdvancedOriginRoutingParameters getAdvancedOriginRoutingParameters() {
        return this.AdvancedOriginRoutingParameters;
    }

    /**
     * Set <p>Advanced origin optimization configuration parameter. This parameter is required when the Name value is AdvancedOriginRouting.</p>
     * @param AdvancedOriginRoutingParameters <p>Advanced origin optimization configuration parameter. This parameter is required when the Name value is AdvancedOriginRouting.</p>
     */
    public void setAdvancedOriginRoutingParameters(AdvancedOriginRoutingParameters AdvancedOriginRoutingParameters) {
        this.AdvancedOriginRoutingParameters = AdvancedOriginRoutingParameters;
    }

    /**
     * Get <p>Configuration parameter for range-based origin pull. This parameter is required when the value of Name is RangeOriginPull.</p> 
     * @return RangeOriginPullParameters <p>Configuration parameter for range-based origin pull. This parameter is required when the value of Name is RangeOriginPull.</p>
     */
    public RangeOriginPullParameters getRangeOriginPullParameters() {
        return this.RangeOriginPullParameters;
    }

    /**
     * Set <p>Configuration parameter for range-based origin pull. This parameter is required when the value of Name is RangeOriginPull.</p>
     * @param RangeOriginPullParameters <p>Configuration parameter for range-based origin pull. This parameter is required when the value of Name is RangeOriginPull.</p>
     */
    public void setRangeOriginPullParameters(RangeOriginPullParameters RangeOriginPullParameters) {
        this.RangeOriginPullParameters = RangeOriginPullParameters;
    }

    /**
     * Get <p>HTTP2 origin configuration parameter. This parameter is required when the Name value is UpstreamHTTP2.</p> 
     * @return UpstreamHTTP2Parameters <p>HTTP2 origin configuration parameter. This parameter is required when the Name value is UpstreamHTTP2.</p>
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2Parameters() {
        return this.UpstreamHTTP2Parameters;
    }

    /**
     * Set <p>HTTP2 origin configuration parameter. This parameter is required when the Name value is UpstreamHTTP2.</p>
     * @param UpstreamHTTP2Parameters <p>HTTP2 origin configuration parameter. This parameter is required when the Name value is UpstreamHTTP2.</p>
     */
    public void setUpstreamHTTP2Parameters(UpstreamHTTP2Parameters UpstreamHTTP2Parameters) {
        this.UpstreamHTTP2Parameters = UpstreamHTTP2Parameters;
    }

    /**
     * Get <p>Host header rewrite configuration parameter. When the Name value is HostHeader, this parameter is required.</p> 
     * @return HostHeaderParameters <p>Host header rewrite configuration parameter. When the Name value is HostHeader, this parameter is required.</p>
     */
    public HostHeaderParameters getHostHeaderParameters() {
        return this.HostHeaderParameters;
    }

    /**
     * Set <p>Host header rewrite configuration parameter. When the Name value is HostHeader, this parameter is required.</p>
     * @param HostHeaderParameters <p>Host header rewrite configuration parameter. When the Name value is HostHeader, this parameter is required.</p>
     */
    public void setHostHeaderParameters(HostHeaderParameters HostHeaderParameters) {
        this.HostHeaderParameters = HostHeaderParameters;
    }

    /**
     * Get <p>Forced HTTPS redirect configuration for the access protocol. This parameter is required when the Name value is ForceRedirectHTTPS.</p> 
     * @return ForceRedirectHTTPSParameters <p>Forced HTTPS redirect configuration for the access protocol. This parameter is required when the Name value is ForceRedirectHTTPS.</p>
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPSParameters() {
        return this.ForceRedirectHTTPSParameters;
    }

    /**
     * Set <p>Forced HTTPS redirect configuration for the access protocol. This parameter is required when the Name value is ForceRedirectHTTPS.</p>
     * @param ForceRedirectHTTPSParameters <p>Forced HTTPS redirect configuration for the access protocol. This parameter is required when the Name value is ForceRedirectHTTPS.</p>
     */
    public void setForceRedirectHTTPSParameters(ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters) {
        this.ForceRedirectHTTPSParameters = ForceRedirectHTTPSParameters;
    }

    /**
     * Get <p>Origin HTTPS configuration parameter. This parameter is required when the Name value is OriginPullProtocol.</p> 
     * @return OriginPullProtocolParameters <p>Origin HTTPS configuration parameter. This parameter is required when the Name value is OriginPullProtocol.</p>
     */
    public OriginPullProtocolParameters getOriginPullProtocolParameters() {
        return this.OriginPullProtocolParameters;
    }

    /**
     * Set <p>Origin HTTPS configuration parameter. This parameter is required when the Name value is OriginPullProtocol.</p>
     * @param OriginPullProtocolParameters <p>Origin HTTPS configuration parameter. This parameter is required when the Name value is OriginPullProtocol.</p>
     */
    public void setOriginPullProtocolParameters(OriginPullProtocolParameters OriginPullProtocolParameters) {
        this.OriginPullProtocolParameters = OriginPullProtocolParameters;
    }

    /**
     * Get <p>Intelligent compression configuration. This parameter is required when the Name value is Compression.</p> 
     * @return CompressionParameters <p>Intelligent compression configuration. This parameter is required when the Name value is Compression.</p>
     */
    public CompressionParameters getCompressionParameters() {
        return this.CompressionParameters;
    }

    /**
     * Set <p>Intelligent compression configuration. This parameter is required when the Name value is Compression.</p>
     * @param CompressionParameters <p>Intelligent compression configuration. This parameter is required when the Name value is Compression.</p>
     */
    public void setCompressionParameters(CompressionParameters CompressionParameters) {
        this.CompressionParameters = CompressionParameters;
    }

    /**
     * Get <p>HSTS configuration parameter. When the Name value is HSTS, this parameter is required.</p> 
     * @return HSTSParameters <p>HSTS configuration parameter. When the Name value is HSTS, this parameter is required.</p>
     */
    public HSTSParameters getHSTSParameters() {
        return this.HSTSParameters;
    }

    /**
     * Set <p>HSTS configuration parameter. When the Name value is HSTS, this parameter is required.</p>
     * @param HSTSParameters <p>HSTS configuration parameter. When the Name value is HSTS, this parameter is required.</p>
     */
    public void setHSTSParameters(HSTSParameters HSTSParameters) {
        this.HSTSParameters = HSTSParameters;
    }

    /**
     * Get <p>Configuration header information for storing client request IP. When the Name value is ClientIPHeader, this parameter is required.</p> 
     * @return ClientIPHeaderParameters <p>Configuration header information for storing client request IP. When the Name value is ClientIPHeader, this parameter is required.</p>
     */
    public ClientIPHeaderParameters getClientIPHeaderParameters() {
        return this.ClientIPHeaderParameters;
    }

    /**
     * Set <p>Configuration header information for storing client request IP. When the Name value is ClientIPHeader, this parameter is required.</p>
     * @param ClientIPHeaderParameters <p>Configuration header information for storing client request IP. When the Name value is ClientIPHeader, this parameter is required.</p>
     */
    public void setClientIPHeaderParameters(ClientIPHeaderParameters ClientIPHeaderParameters) {
        this.ClientIPHeaderParameters = ClientIPHeaderParameters;
    }

    /**
     * Get <p>OCSP stapling configuration parameter. This parameter is required when Name value is OCSPStapling.</p> 
     * @return OCSPStaplingParameters <p>OCSP stapling configuration parameter. This parameter is required when Name value is OCSPStapling.</p>
     */
    public OCSPStaplingParameters getOCSPStaplingParameters() {
        return this.OCSPStaplingParameters;
    }

    /**
     * Set <p>OCSP stapling configuration parameter. This parameter is required when Name value is OCSPStapling.</p>
     * @param OCSPStaplingParameters <p>OCSP stapling configuration parameter. This parameter is required when Name value is OCSPStapling.</p>
     */
    public void setOCSPStaplingParameters(OCSPStaplingParameters OCSPStaplingParameters) {
        this.OCSPStaplingParameters = OCSPStaplingParameters;
    }

    /**
     * Get <p>HTTP2 integration configuration parameter. This parameter is required when the Name value is HTTP2.</p> 
     * @return HTTP2Parameters <p>HTTP2 integration configuration parameter. This parameter is required when the Name value is HTTP2.</p>
     */
    public HTTP2Parameters getHTTP2Parameters() {
        return this.HTTP2Parameters;
    }

    /**
     * Set <p>HTTP2 integration configuration parameter. This parameter is required when the Name value is HTTP2.</p>
     * @param HTTP2Parameters <p>HTTP2 integration configuration parameter. This parameter is required when the Name value is HTTP2.</p>
     */
    public void setHTTP2Parameters(HTTP2Parameters HTTP2Parameters) {
        this.HTTP2Parameters = HTTP2Parameters;
    }

    /**
     * Get <p>Maximum limit configuration for file streaming transmission in POST request upload. When the Name value is PostMaxSize, this parameter is required.</p> 
     * @return PostMaxSizeParameters <p>Maximum limit configuration for file streaming transmission in POST request upload. When the Name value is PostMaxSize, this parameter is required.</p>
     */
    public PostMaxSizeParameters getPostMaxSizeParameters() {
        return this.PostMaxSizeParameters;
    }

    /**
     * Set <p>Maximum limit configuration for file streaming transmission in POST request upload. When the Name value is PostMaxSize, this parameter is required.</p>
     * @param PostMaxSizeParameters <p>Maximum limit configuration for file streaming transmission in POST request upload. When the Name value is PostMaxSize, this parameter is required.</p>
     */
    public void setPostMaxSizeParameters(PostMaxSizeParameters PostMaxSizeParameters) {
        this.PostMaxSizeParameters = PostMaxSizeParameters;
    }

    /**
     * Get <p>Configuration parameter for carrying client IP regional information during origin pull. When the Name value is ClientIPCountry, this parameter is required.</p> 
     * @return ClientIPCountryParameters <p>Configuration parameter for carrying client IP regional information during origin pull. When the Name value is ClientIPCountry, this parameter is required.</p>
     */
    public ClientIPCountryParameters getClientIPCountryParameters() {
        return this.ClientIPCountryParameters;
    }

    /**
     * Set <p>Configuration parameter for carrying client IP regional information during origin pull. When the Name value is ClientIPCountry, this parameter is required.</p>
     * @param ClientIPCountryParameters <p>Configuration parameter for carrying client IP regional information during origin pull. When the Name value is ClientIPCountry, this parameter is required.</p>
     */
    public void setClientIPCountryParameters(ClientIPCountryParameters ClientIPCountryParameters) {
        this.ClientIPCountryParameters = ClientIPCountryParameters;
    }

    /**
     * Get <p>Origin-pull follow redirect parameter configuration. This parameter is required when the Name value is UpstreamFollowRedirect.</p> 
     * @return UpstreamFollowRedirectParameters <p>Origin-pull follow redirect parameter configuration. This parameter is required when the Name value is UpstreamFollowRedirect.</p>
     */
    public UpstreamFollowRedirectParameters getUpstreamFollowRedirectParameters() {
        return this.UpstreamFollowRedirectParameters;
    }

    /**
     * Set <p>Origin-pull follow redirect parameter configuration. This parameter is required when the Name value is UpstreamFollowRedirect.</p>
     * @param UpstreamFollowRedirectParameters <p>Origin-pull follow redirect parameter configuration. This parameter is required when the Name value is UpstreamFollowRedirect.</p>
     */
    public void setUpstreamFollowRedirectParameters(UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters) {
        this.UpstreamFollowRedirectParameters = UpstreamFollowRedirectParameters;
    }

    /**
     * Get <p>Origin-pull request parameter configuration parameter. This parameter is required when the Name value is UpstreamRequest.</p> 
     * @return UpstreamRequestParameters <p>Origin-pull request parameter configuration parameter. This parameter is required when the Name value is UpstreamRequest.</p>
     */
    public UpstreamRequestParameters getUpstreamRequestParameters() {
        return this.UpstreamRequestParameters;
    }

    /**
     * Set <p>Origin-pull request parameter configuration parameter. This parameter is required when the Name value is UpstreamRequest.</p>
     * @param UpstreamRequestParameters <p>Origin-pull request parameter configuration parameter. This parameter is required when the Name value is UpstreamRequest.</p>
     */
    public void setUpstreamRequestParameters(UpstreamRequestParameters UpstreamRequestParameters) {
        this.UpstreamRequestParameters = UpstreamRequestParameters;
    }

    /**
     * Get <p>Origin server uninstallation configuration parameter. This parameter is required when the Name value is Shield.</p> 
     * @return ShieldParameters <p>Origin server uninstallation configuration parameter. This parameter is required when the Name value is Shield.</p>
     */
    public ShieldParameters getShieldParameters() {
        return this.ShieldParameters;
    }

    /**
     * Set <p>Origin server uninstallation configuration parameter. This parameter is required when the Name value is Shield.</p>
     * @param ShieldParameters <p>Origin server uninstallation configuration parameter. This parameter is required when the Name value is Shield.</p>
     */
    public void setShieldParameters(ShieldParameters ShieldParameters) {
        this.ShieldParameters = ShieldParameters;
    }

    /**
     * Get <p>SSL/TLS security configuration parameter. This parameter is required when the Name value is TLSConfig.</p> 
     * @return TLSConfigParameters <p>SSL/TLS security configuration parameter. This parameter is required when the Name value is TLSConfig.</p>
     */
    public TLSConfigParameters getTLSConfigParameters() {
        return this.TLSConfigParameters;
    }

    /**
     * Set <p>SSL/TLS security configuration parameter. This parameter is required when the Name value is TLSConfig.</p>
     * @param TLSConfigParameters <p>SSL/TLS security configuration parameter. This parameter is required when the Name value is TLSConfig.</p>
     */
    public void setTLSConfigParameters(TLSConfigParameters TLSConfigParameters) {
        this.TLSConfigParameters = TLSConfigParameters;
    }

    /**
     * Get <p>Modify origin server configuration parameter. When the Name value is ModifyOrigin, this parameter is required.</p> 
     * @return ModifyOriginParameters <p>Modify origin server configuration parameter. When the Name value is ModifyOrigin, this parameter is required.</p>
     */
    public ModifyOriginParameters getModifyOriginParameters() {
        return this.ModifyOriginParameters;
    }

    /**
     * Set <p>Modify origin server configuration parameter. When the Name value is ModifyOrigin, this parameter is required.</p>
     * @param ModifyOriginParameters <p>Modify origin server configuration parameter. When the Name value is ModifyOrigin, this parameter is required.</p>
     */
    public void setModifyOriginParameters(ModifyOriginParameters ModifyOriginParameters) {
        this.ModifyOriginParameters = ModifyOriginParameters;
    }

    /**
     * Get <p>Source site fault migration config. When the Name value is SiteFailover, this parameter is required.</p> 
     * @return SiteFailoverParameters <p>Source site fault migration config. When the Name value is SiteFailover, this parameter is required.</p>
     */
    public SiteFailoverParameters getSiteFailoverParameters() {
        return this.SiteFailoverParameters;
    }

    /**
     * Set <p>Source site fault migration config. When the Name value is SiteFailover, this parameter is required.</p>
     * @param SiteFailoverParameters <p>Source site fault migration config. When the Name value is SiteFailover, this parameter is required.</p>
     */
    public void setSiteFailoverParameters(SiteFailoverParameters SiteFailoverParameters) {
        this.SiteFailoverParameters = SiteFailoverParameters;
    }

    /**
     * Get <p>Layer 7 origin pull timeout configuration. This parameter is required when the Name value is HTTPUpstreamTimeout.</p> 
     * @return HTTPUpstreamTimeoutParameters <p>Layer 7 origin pull timeout configuration. This parameter is required when the Name value is HTTPUpstreamTimeout.</p>
     */
    public HTTPUpstreamTimeoutParameters getHTTPUpstreamTimeoutParameters() {
        return this.HTTPUpstreamTimeoutParameters;
    }

    /**
     * Set <p>Layer 7 origin pull timeout configuration. This parameter is required when the Name value is HTTPUpstreamTimeout.</p>
     * @param HTTPUpstreamTimeoutParameters <p>Layer 7 origin pull timeout configuration. This parameter is required when the Name value is HTTPUpstreamTimeout.</p>
     */
    public void setHTTPUpstreamTimeoutParameters(HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters) {
        this.HTTPUpstreamTimeoutParameters = HTTPUpstreamTimeoutParameters;
    }

    /**
     * Get <p>HTTP response configuration parameter. This parameter is required when the Name value is HttpResponse.</p> 
     * @return HttpResponseParameters <p>HTTP response configuration parameter. This parameter is required when the Name value is HttpResponse.</p>
     */
    public HTTPResponseParameters getHttpResponseParameters() {
        return this.HttpResponseParameters;
    }

    /**
     * Set <p>HTTP response configuration parameter. This parameter is required when the Name value is HttpResponse.</p>
     * @param HttpResponseParameters <p>HTTP response configuration parameter. This parameter is required when the Name value is HttpResponse.</p>
     */
    public void setHttpResponseParameters(HTTPResponseParameters HttpResponseParameters) {
        this.HttpResponseParameters = HttpResponseParameters;
    }

    /**
     * Get <p>Custom error page configuration parameter. This parameter is required when the value of Name is ErrorPage.</p> 
     * @return ErrorPageParameters <p>Custom error page configuration parameter. This parameter is required when the value of Name is ErrorPage.</p>
     */
    public ErrorPageParameters getErrorPageParameters() {
        return this.ErrorPageParameters;
    }

    /**
     * Set <p>Custom error page configuration parameter. This parameter is required when the value of Name is ErrorPage.</p>
     * @param ErrorPageParameters <p>Custom error page configuration parameter. This parameter is required when the value of Name is ErrorPage.</p>
     */
    public void setErrorPageParameters(ErrorPageParameters ErrorPageParameters) {
        this.ErrorPageParameters = ErrorPageParameters;
    }

    /**
     * Get <p>Modify the HTTP node response header configuration parameter. This parameter is required when the Name value is ModifyResponseHeader.</p> 
     * @return ModifyResponseHeaderParameters <p>Modify the HTTP node response header configuration parameter. This parameter is required when the Name value is ModifyResponseHeader.</p>
     */
    public ModifyResponseHeaderParameters getModifyResponseHeaderParameters() {
        return this.ModifyResponseHeaderParameters;
    }

    /**
     * Set <p>Modify the HTTP node response header configuration parameter. This parameter is required when the Name value is ModifyResponseHeader.</p>
     * @param ModifyResponseHeaderParameters <p>Modify the HTTP node response header configuration parameter. This parameter is required when the Name value is ModifyResponseHeader.</p>
     */
    public void setModifyResponseHeaderParameters(ModifyResponseHeaderParameters ModifyResponseHeaderParameters) {
        this.ModifyResponseHeaderParameters = ModifyResponseHeaderParameters;
    }

    /**
     * Get <p>Modify the request header configuration parameter of the HTTP node. This parameter is required when the Name value is ModifyRequestHeader.</p> 
     * @return ModifyRequestHeaderParameters <p>Modify the request header configuration parameter of the HTTP node. This parameter is required when the Name value is ModifyRequestHeader.</p>
     */
    public ModifyRequestHeaderParameters getModifyRequestHeaderParameters() {
        return this.ModifyRequestHeaderParameters;
    }

    /**
     * Set <p>Modify the request header configuration parameter of the HTTP node. This parameter is required when the Name value is ModifyRequestHeader.</p>
     * @param ModifyRequestHeaderParameters <p>Modify the request header configuration parameter of the HTTP node. This parameter is required when the Name value is ModifyRequestHeader.</p>
     */
    public void setModifyRequestHeaderParameters(ModifyRequestHeaderParameters ModifyRequestHeaderParameters) {
        this.ModifyRequestHeaderParameters = ModifyRequestHeaderParameters;
    }

    /**
     * Get <p>Single connection download speed limit configuration parameter. This parameter is required when the Name value is ResponseSpeedLimit.</p> 
     * @return ResponseSpeedLimitParameters <p>Single connection download speed limit configuration parameter. This parameter is required when the Name value is ResponseSpeedLimit.</p>
     */
    public ResponseSpeedLimitParameters getResponseSpeedLimitParameters() {
        return this.ResponseSpeedLimitParameters;
    }

    /**
     * Set <p>Single connection download speed limit configuration parameter. This parameter is required when the Name value is ResponseSpeedLimit.</p>
     * @param ResponseSpeedLimitParameters <p>Single connection download speed limit configuration parameter. This parameter is required when the Name value is ResponseSpeedLimit.</p>
     */
    public void setResponseSpeedLimitParameters(ResponseSpeedLimitParameters ResponseSpeedLimitParameters) {
        this.ResponseSpeedLimitParameters = ResponseSpeedLimitParameters;
    }

    /**
     * Get <p>Content identification configuration parameter. This parameter is required when the Name value is SetContentIdentifier.</p> 
     * @return SetContentIdentifierParameters <p>Content identification configuration parameter. This parameter is required when the Name value is SetContentIdentifier.</p>
     */
    public SetContentIdentifierParameters getSetContentIdentifierParameters() {
        return this.SetContentIdentifierParameters;
    }

    /**
     * Set <p>Content identification configuration parameter. This parameter is required when the Name value is SetContentIdentifier.</p>
     * @param SetContentIdentifierParameters <p>Content identification configuration parameter. This parameter is required when the Name value is SetContentIdentifier.</p>
     */
    public void setSetContentIdentifierParameters(SetContentIdentifierParameters SetContentIdentifierParameters) {
        this.SetContentIdentifierParameters = SetContentIdentifierParameters;
    }

    /**
     * Get <p>Vary feature configuration parameter. This parameter is required when the Name value is Vary.</p> 
     * @return VaryParameters <p>Vary feature configuration parameter. This parameter is required when the Name value is Vary.</p>
     */
    public VaryParameters getVaryParameters() {
        return this.VaryParameters;
    }

    /**
     * Set <p>Vary feature configuration parameter. This parameter is required when the Name value is Vary.</p>
     * @param VaryParameters <p>Vary feature configuration parameter. This parameter is required when the Name value is Vary.</p>
     */
    public void setVaryParameters(VaryParameters VaryParameters) {
        this.VaryParameters = VaryParameters;
    }

    /**
     * Get <p>Content compression configuration parameter. When the Name value is ContentCompression, this parameter is required. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p> 
     * @return ContentCompressionParameters <p>Content compression configuration parameter. When the Name value is ContentCompression, this parameter is required. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     */
    public ContentCompressionParameters getContentCompressionParameters() {
        return this.ContentCompressionParameters;
    }

    /**
     * Set <p>Content compression configuration parameter. When the Name value is ContentCompression, this parameter is required. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     * @param ContentCompressionParameters <p>Content compression configuration parameter. When the Name value is ContentCompression, this parameter is required. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     */
    public void setContentCompressionParameters(ContentCompressionParameters ContentCompressionParameters) {
        this.ContentCompressionParameters = ContentCompressionParameters;
    }

    /**
     * Get <p>Origin authentication configuration parameter. This parameter is required when Name value is OriginAuthentication. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p> 
     * @return OriginAuthenticationParameters <p>Origin authentication configuration parameter. This parameter is required when Name value is OriginAuthentication. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     */
    public OriginAuthenticationParameters getOriginAuthenticationParameters() {
        return this.OriginAuthenticationParameters;
    }

    /**
     * Set <p>Origin authentication configuration parameter. This parameter is required when Name value is OriginAuthentication. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     * @param OriginAuthenticationParameters <p>Origin authentication configuration parameter. This parameter is required when Name value is OriginAuthentication. This parameter is an allowlist feature. If needed, contact Tencent Cloud Engineers.</p>
     */
    public void setOriginAuthenticationParameters(OriginAuthenticationParameters OriginAuthenticationParameters) {
        this.OriginAuthenticationParameters = OriginAuthenticationParameters;
    }

    /**
     * Get <p>Custom configuration operation parameter. This parameter is required when the Name value is CustomAction.</p><p>You can obtain the list of currently supported custom configuration items through the CustomActionSet returned value of the DescribeAvailableCustomActionsForRuleEngine API.</p> 
     * @return CustomActionParameters <p>Custom configuration operation parameter. This parameter is required when the Name value is CustomAction.</p><p>You can obtain the list of currently supported custom configuration items through the CustomActionSet returned value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public CustomActionParameters getCustomActionParameters() {
        return this.CustomActionParameters;
    }

    /**
     * Set <p>Custom configuration operation parameter. This parameter is required when the Name value is CustomAction.</p><p>You can obtain the list of currently supported custom configuration items through the CustomActionSet returned value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     * @param CustomActionParameters <p>Custom configuration operation parameter. This parameter is required when the Name value is CustomAction.</p><p>You can obtain the list of currently supported custom configuration items through the CustomActionSet returned value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public void setCustomActionParameters(CustomActionParameters CustomActionParameters) {
        this.CustomActionParameters = CustomActionParameters;
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
        if (source.AdvancedOriginRoutingParameters != null) {
            this.AdvancedOriginRoutingParameters = new AdvancedOriginRoutingParameters(source.AdvancedOriginRoutingParameters);
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
        if (source.OriginPullProtocolParameters != null) {
            this.OriginPullProtocolParameters = new OriginPullProtocolParameters(source.OriginPullProtocolParameters);
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
        if (source.ShieldParameters != null) {
            this.ShieldParameters = new ShieldParameters(source.ShieldParameters);
        }
        if (source.TLSConfigParameters != null) {
            this.TLSConfigParameters = new TLSConfigParameters(source.TLSConfigParameters);
        }
        if (source.ModifyOriginParameters != null) {
            this.ModifyOriginParameters = new ModifyOriginParameters(source.ModifyOriginParameters);
        }
        if (source.SiteFailoverParameters != null) {
            this.SiteFailoverParameters = new SiteFailoverParameters(source.SiteFailoverParameters);
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
        if (source.VaryParameters != null) {
            this.VaryParameters = new VaryParameters(source.VaryParameters);
        }
        if (source.ContentCompressionParameters != null) {
            this.ContentCompressionParameters = new ContentCompressionParameters(source.ContentCompressionParameters);
        }
        if (source.OriginAuthenticationParameters != null) {
            this.OriginAuthenticationParameters = new OriginAuthenticationParameters(source.OriginAuthenticationParameters);
        }
        if (source.CustomActionParameters != null) {
            this.CustomActionParameters = new CustomActionParameters(source.CustomActionParameters);
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
        this.setParamObj(map, prefix + "AdvancedOriginRoutingParameters.", this.AdvancedOriginRoutingParameters);
        this.setParamObj(map, prefix + "RangeOriginPullParameters.", this.RangeOriginPullParameters);
        this.setParamObj(map, prefix + "UpstreamHTTP2Parameters.", this.UpstreamHTTP2Parameters);
        this.setParamObj(map, prefix + "HostHeaderParameters.", this.HostHeaderParameters);
        this.setParamObj(map, prefix + "ForceRedirectHTTPSParameters.", this.ForceRedirectHTTPSParameters);
        this.setParamObj(map, prefix + "OriginPullProtocolParameters.", this.OriginPullProtocolParameters);
        this.setParamObj(map, prefix + "CompressionParameters.", this.CompressionParameters);
        this.setParamObj(map, prefix + "HSTSParameters.", this.HSTSParameters);
        this.setParamObj(map, prefix + "ClientIPHeaderParameters.", this.ClientIPHeaderParameters);
        this.setParamObj(map, prefix + "OCSPStaplingParameters.", this.OCSPStaplingParameters);
        this.setParamObj(map, prefix + "HTTP2Parameters.", this.HTTP2Parameters);
        this.setParamObj(map, prefix + "PostMaxSizeParameters.", this.PostMaxSizeParameters);
        this.setParamObj(map, prefix + "ClientIPCountryParameters.", this.ClientIPCountryParameters);
        this.setParamObj(map, prefix + "UpstreamFollowRedirectParameters.", this.UpstreamFollowRedirectParameters);
        this.setParamObj(map, prefix + "UpstreamRequestParameters.", this.UpstreamRequestParameters);
        this.setParamObj(map, prefix + "ShieldParameters.", this.ShieldParameters);
        this.setParamObj(map, prefix + "TLSConfigParameters.", this.TLSConfigParameters);
        this.setParamObj(map, prefix + "ModifyOriginParameters.", this.ModifyOriginParameters);
        this.setParamObj(map, prefix + "SiteFailoverParameters.", this.SiteFailoverParameters);
        this.setParamObj(map, prefix + "HTTPUpstreamTimeoutParameters.", this.HTTPUpstreamTimeoutParameters);
        this.setParamObj(map, prefix + "HttpResponseParameters.", this.HttpResponseParameters);
        this.setParamObj(map, prefix + "ErrorPageParameters.", this.ErrorPageParameters);
        this.setParamObj(map, prefix + "ModifyResponseHeaderParameters.", this.ModifyResponseHeaderParameters);
        this.setParamObj(map, prefix + "ModifyRequestHeaderParameters.", this.ModifyRequestHeaderParameters);
        this.setParamObj(map, prefix + "ResponseSpeedLimitParameters.", this.ResponseSpeedLimitParameters);
        this.setParamObj(map, prefix + "SetContentIdentifierParameters.", this.SetContentIdentifierParameters);
        this.setParamObj(map, prefix + "VaryParameters.", this.VaryParameters);
        this.setParamObj(map, prefix + "ContentCompressionParameters.", this.ContentCompressionParameters);
        this.setParamObj(map, prefix + "OriginAuthenticationParameters.", this.OriginAuthenticationParameters);
        this.setParamObj(map, prefix + "CustomActionParameters.", this.CustomActionParameters);

    }
}

