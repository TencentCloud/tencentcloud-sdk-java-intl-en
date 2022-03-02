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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDomainConfigRequest extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Origin server configuration
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP blocklist/allowlist configuration
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Status code cache configuration
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * Smart compression configuration
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Bandwidth cap configuration
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Range GETs configuration
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 301/302 origin-pull follow-redirect configuration
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Error code redirect configuration (This feature is in beta and not generally available yet.)
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * Request header configuration
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * Response header configuration
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Download speed configuration
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * Node cache key configuration
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Header cache configuration
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * Video dragging configuration
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * Cache expiration time configuration
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Cross-border linkage optimization configuration
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * HTTPS acceleration configuration
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Timestamp hotlink protection configuration
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO configuration
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * Access protocol forced redirect configuration
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer hotlink protection configuration
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser cache configuration (This feature is in beta and not generally available yet.)
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Domain name service type
web: static acceleration
download: download acceleration
media: streaming media VOD acceleration
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China.
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * Domain name acceleration region
`mainland`: acceleration inside the Chinese mainland
`overseas`: acceleration outside the Chinese mainland
`global`: global acceleration
When you change it to from `mainland`/`overseas` to `global`, configurations of the domain name will be deployed to the region inside or outside the Chinese mainland. The deployment will take some time as this domain name has special settings.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Origin-pull timeout configuration
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
    * Origin access authentication for S3 bucket
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * UA blocklist/allowlist Configuration
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * Access control
    */
    @SerializedName("AccessControl")
    @Expose
    private AccessControl AccessControl;

    /**
    * Configuration of URL rewriting
    */
    @SerializedName("UrlRedirect")
    @Expose
    private UrlRedirect UrlRedirect;

    /**
    * Access port configuration
    */
    @SerializedName("AccessPort")
    @Expose
    private Long [] AccessPort;

    /**
    * Timestamp hotlink protection advanced configuration (allowlist feature)
    */
    @SerializedName("AdvancedAuthentication")
    @Expose
    private AdvancedAuthentication AdvancedAuthentication;

    /**
    * Origin-pull authentication advanced configuration (allowlist feature)
    */
    @SerializedName("OriginAuthentication")
    @Expose
    private OriginAuthentication OriginAuthentication;

    /**
    * IPv6 access configuration
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * Offline cache
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * Merging pull requests
    */
    @SerializedName("OriginCombine")
    @Expose
    private OriginCombine OriginCombine;

    /**
    * QUIC access, which is a paid service. You can check the product document and Billing Overview for more information.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Access authentication for OSS origin
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * WebSocket configuration.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Configuration of remote authentication
    */
    @SerializedName("RemoteAuthentication")
    @Expose
    private RemoteAuthentication RemoteAuthentication;

    /**
    * Shared CNAME configuration (only available to beta users)
    */
    @SerializedName("ShareCname")
    @Expose
    private ShareCname ShareCname;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get IP blocklist/allowlist configuration 
     * @return IpFilter IP blocklist/allowlist configuration
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blocklist/allowlist configuration
     * @param IpFilter IP blocklist/allowlist configuration
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration 
     * @return IpFreqLimit IP access limit configuration
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration
     * @param IpFreqLimit IP access limit configuration
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Status code cache configuration 
     * @return StatusCodeCache Status code cache configuration
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set Status code cache configuration
     * @param StatusCodeCache Status code cache configuration
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
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
     * Get Bandwidth cap configuration 
     * @return BandwidthAlert Bandwidth cap configuration
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set Bandwidth cap configuration
     * @param BandwidthAlert Bandwidth cap configuration
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Range GETs configuration 
     * @return RangeOriginPull Range GETs configuration
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range GETs configuration
     * @param RangeOriginPull Range GETs configuration
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 301/302 origin-pull follow-redirect configuration 
     * @return FollowRedirect 301/302 origin-pull follow-redirect configuration
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 origin-pull follow-redirect configuration
     * @param FollowRedirect 301/302 origin-pull follow-redirect configuration
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Error code redirect configuration (This feature is in beta and not generally available yet.) 
     * @return ErrorPage Error code redirect configuration (This feature is in beta and not generally available yet.)
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error code redirect configuration (This feature is in beta and not generally available yet.)
     * @param ErrorPage Error code redirect configuration (This feature is in beta and not generally available yet.)
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get Request header configuration 
     * @return RequestHeader Request header configuration
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Request header configuration
     * @param RequestHeader Request header configuration
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Response header configuration 
     * @return ResponseHeader Response header configuration
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Response header configuration
     * @param ResponseHeader Response header configuration
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Download speed configuration 
     * @return DownstreamCapping Download speed configuration
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set Download speed configuration
     * @param DownstreamCapping Download speed configuration
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get Node cache key configuration 
     * @return CacheKey Node cache key configuration
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache key configuration
     * @param CacheKey Node cache key configuration
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Header cache configuration 
     * @return ResponseHeaderCache Header cache configuration
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set Header cache configuration
     * @param ResponseHeaderCache Header cache configuration
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get Video dragging configuration 
     * @return VideoSeek Video dragging configuration
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set Video dragging configuration
     * @param VideoSeek Video dragging configuration
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get Cache expiration time configuration 
     * @return Cache Cache expiration time configuration
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Cache expiration time configuration
     * @param Cache Cache expiration time configuration
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Cross-border linkage optimization configuration 
     * @return OriginPullOptimization Cross-border linkage optimization configuration
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set Cross-border linkage optimization configuration
     * @param OriginPullOptimization Cross-border linkage optimization configuration
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
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
     * Get Timestamp hotlink protection configuration 
     * @return Authentication Timestamp hotlink protection configuration
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection configuration
     * @param Authentication Timestamp hotlink protection configuration
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO configuration 
     * @return Seo SEO configuration
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO configuration
     * @param Seo SEO configuration
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get Access protocol forced redirect configuration 
     * @return ForceRedirect Access protocol forced redirect configuration
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol forced redirect configuration
     * @param ForceRedirect Access protocol forced redirect configuration
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer hotlink protection configuration 
     * @return Referer Referer hotlink protection configuration
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer hotlink protection configuration
     * @param Referer Referer hotlink protection configuration
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser cache configuration (This feature is in beta and not generally available yet.) 
     * @return MaxAge Browser cache configuration (This feature is in beta and not generally available yet.)
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration (This feature is in beta and not generally available yet.)
     * @param MaxAge Browser cache configuration (This feature is in beta and not generally available yet.)
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Domain name service type
web: static acceleration
download: download acceleration
media: streaming media VOD acceleration 
     * @return ServiceType Domain name service type
web: static acceleration
download: download acceleration
media: streaming media VOD acceleration
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Domain name service type
web: static acceleration
download: download acceleration
media: streaming media VOD acceleration
     * @param ServiceType Domain name service type
web: static acceleration
download: download acceleration
media: streaming media VOD acceleration
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China. 
     * @return SpecificConfig Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China.
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China.
     * @param SpecificConfig Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China.
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get Domain name acceleration region
`mainland`: acceleration inside the Chinese mainland
`overseas`: acceleration outside the Chinese mainland
`global`: global acceleration
When you change it to from `mainland`/`overseas` to `global`, configurations of the domain name will be deployed to the region inside or outside the Chinese mainland. The deployment will take some time as this domain name has special settings. 
     * @return Area Domain name acceleration region
`mainland`: acceleration inside the Chinese mainland
`overseas`: acceleration outside the Chinese mainland
`global`: global acceleration
When you change it to from `mainland`/`overseas` to `global`, configurations of the domain name will be deployed to the region inside or outside the Chinese mainland. The deployment will take some time as this domain name has special settings.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration region
`mainland`: acceleration inside the Chinese mainland
`overseas`: acceleration outside the Chinese mainland
`global`: global acceleration
When you change it to from `mainland`/`overseas` to `global`, configurations of the domain name will be deployed to the region inside or outside the Chinese mainland. The deployment will take some time as this domain name has special settings.
     * @param Area Domain name acceleration region
`mainland`: acceleration inside the Chinese mainland
`overseas`: acceleration outside the Chinese mainland
`global`: global acceleration
When you change it to from `mainland`/`overseas` to `global`, configurations of the domain name will be deployed to the region inside or outside the Chinese mainland. The deployment will take some time as this domain name has special settings.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Origin-pull timeout configuration 
     * @return OriginPullTimeout Origin-pull timeout configuration
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set Origin-pull timeout configuration
     * @param OriginPullTimeout Origin-pull timeout configuration
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
    }

    /**
     * Get Origin access authentication for S3 bucket 
     * @return AwsPrivateAccess Origin access authentication for S3 bucket
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set Origin access authentication for S3 bucket
     * @param AwsPrivateAccess Origin access authentication for S3 bucket
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get UA blocklist/allowlist Configuration 
     * @return UserAgentFilter UA blocklist/allowlist Configuration
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UA blocklist/allowlist Configuration
     * @param UserAgentFilter UA blocklist/allowlist Configuration
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get Access control 
     * @return AccessControl Access control
     */
    public AccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Access control
     * @param AccessControl Access control
     */
    public void setAccessControl(AccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get Configuration of URL rewriting 
     * @return UrlRedirect Configuration of URL rewriting
     */
    public UrlRedirect getUrlRedirect() {
        return this.UrlRedirect;
    }

    /**
     * Set Configuration of URL rewriting
     * @param UrlRedirect Configuration of URL rewriting
     */
    public void setUrlRedirect(UrlRedirect UrlRedirect) {
        this.UrlRedirect = UrlRedirect;
    }

    /**
     * Get Access port configuration 
     * @return AccessPort Access port configuration
     */
    public Long [] getAccessPort() {
        return this.AccessPort;
    }

    /**
     * Set Access port configuration
     * @param AccessPort Access port configuration
     */
    public void setAccessPort(Long [] AccessPort) {
        this.AccessPort = AccessPort;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration (allowlist feature) 
     * @return AdvancedAuthentication Timestamp hotlink protection advanced configuration (allowlist feature)
     */
    public AdvancedAuthentication getAdvancedAuthentication() {
        return this.AdvancedAuthentication;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration (allowlist feature)
     * @param AdvancedAuthentication Timestamp hotlink protection advanced configuration (allowlist feature)
     */
    public void setAdvancedAuthentication(AdvancedAuthentication AdvancedAuthentication) {
        this.AdvancedAuthentication = AdvancedAuthentication;
    }

    /**
     * Get Origin-pull authentication advanced configuration (allowlist feature) 
     * @return OriginAuthentication Origin-pull authentication advanced configuration (allowlist feature)
     */
    public OriginAuthentication getOriginAuthentication() {
        return this.OriginAuthentication;
    }

    /**
     * Set Origin-pull authentication advanced configuration (allowlist feature)
     * @param OriginAuthentication Origin-pull authentication advanced configuration (allowlist feature)
     */
    public void setOriginAuthentication(OriginAuthentication OriginAuthentication) {
        this.OriginAuthentication = OriginAuthentication;
    }

    /**
     * Get IPv6 access configuration 
     * @return Ipv6Access IPv6 access configuration
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set IPv6 access configuration
     * @param Ipv6Access IPv6 access configuration
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
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
     * Get Merging pull requests 
     * @return OriginCombine Merging pull requests
     */
    public OriginCombine getOriginCombine() {
        return this.OriginCombine;
    }

    /**
     * Set Merging pull requests
     * @param OriginCombine Merging pull requests
     */
    public void setOriginCombine(OriginCombine OriginCombine) {
        this.OriginCombine = OriginCombine;
    }

    /**
     * Get QUIC access, which is a paid service. You can check the product document and Billing Overview for more information. 
     * @return Quic QUIC access, which is a paid service. You can check the product document and Billing Overview for more information.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC access, which is a paid service. You can check the product document and Billing Overview for more information.
     * @param Quic QUIC access, which is a paid service. You can check the product document and Billing Overview for more information.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Access authentication for OSS origin 
     * @return OssPrivateAccess Access authentication for OSS origin
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set Access authentication for OSS origin
     * @param OssPrivateAccess Access authentication for OSS origin
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
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
     * Get Configuration of remote authentication 
     * @return RemoteAuthentication Configuration of remote authentication
     */
    public RemoteAuthentication getRemoteAuthentication() {
        return this.RemoteAuthentication;
    }

    /**
     * Set Configuration of remote authentication
     * @param RemoteAuthentication Configuration of remote authentication
     */
    public void setRemoteAuthentication(RemoteAuthentication RemoteAuthentication) {
        this.RemoteAuthentication = RemoteAuthentication;
    }

    /**
     * Get Shared CNAME configuration (only available to beta users) 
     * @return ShareCname Shared CNAME configuration (only available to beta users)
     */
    public ShareCname getShareCname() {
        return this.ShareCname;
    }

    /**
     * Set Shared CNAME configuration (only available to beta users)
     * @param ShareCname Shared CNAME configuration (only available to beta users)
     */
    public void setShareCname(ShareCname ShareCname) {
        this.ShareCname = ShareCname;
    }

    public UpdateDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDomainConfigRequest(UpdateDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.IpFilter != null) {
            this.IpFilter = new IpFilter(source.IpFilter);
        }
        if (source.IpFreqLimit != null) {
            this.IpFreqLimit = new IpFreqLimit(source.IpFreqLimit);
        }
        if (source.StatusCodeCache != null) {
            this.StatusCodeCache = new StatusCodeCache(source.StatusCodeCache);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.BandwidthAlert != null) {
            this.BandwidthAlert = new BandwidthAlert(source.BandwidthAlert);
        }
        if (source.RangeOriginPull != null) {
            this.RangeOriginPull = new RangeOriginPull(source.RangeOriginPull);
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new FollowRedirect(source.FollowRedirect);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ErrorPage(source.ErrorPage);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new RequestHeader(source.RequestHeader);
        }
        if (source.ResponseHeader != null) {
            this.ResponseHeader = new ResponseHeader(source.ResponseHeader);
        }
        if (source.DownstreamCapping != null) {
            this.DownstreamCapping = new DownstreamCapping(source.DownstreamCapping);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.ResponseHeaderCache != null) {
            this.ResponseHeaderCache = new ResponseHeaderCache(source.ResponseHeaderCache);
        }
        if (source.VideoSeek != null) {
            this.VideoSeek = new VideoSeek(source.VideoSeek);
        }
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.OriginPullOptimization != null) {
            this.OriginPullOptimization = new OriginPullOptimization(source.OriginPullOptimization);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.Authentication != null) {
            this.Authentication = new Authentication(source.Authentication);
        }
        if (source.Seo != null) {
            this.Seo = new Seo(source.Seo);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Referer != null) {
            this.Referer = new Referer(source.Referer);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.SpecificConfig != null) {
            this.SpecificConfig = new SpecificConfig(source.SpecificConfig);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.OriginPullTimeout != null) {
            this.OriginPullTimeout = new OriginPullTimeout(source.OriginPullTimeout);
        }
        if (source.AwsPrivateAccess != null) {
            this.AwsPrivateAccess = new AwsPrivateAccess(source.AwsPrivateAccess);
        }
        if (source.UserAgentFilter != null) {
            this.UserAgentFilter = new UserAgentFilter(source.UserAgentFilter);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new AccessControl(source.AccessControl);
        }
        if (source.UrlRedirect != null) {
            this.UrlRedirect = new UrlRedirect(source.UrlRedirect);
        }
        if (source.AccessPort != null) {
            this.AccessPort = new Long[source.AccessPort.length];
            for (int i = 0; i < source.AccessPort.length; i++) {
                this.AccessPort[i] = new Long(source.AccessPort[i]);
            }
        }
        if (source.AdvancedAuthentication != null) {
            this.AdvancedAuthentication = new AdvancedAuthentication(source.AdvancedAuthentication);
        }
        if (source.OriginAuthentication != null) {
            this.OriginAuthentication = new OriginAuthentication(source.OriginAuthentication);
        }
        if (source.Ipv6Access != null) {
            this.Ipv6Access = new Ipv6Access(source.Ipv6Access);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.OriginCombine != null) {
            this.OriginCombine = new OriginCombine(source.OriginCombine);
        }
        if (source.Quic != null) {
            this.Quic = new Quic(source.Quic);
        }
        if (source.OssPrivateAccess != null) {
            this.OssPrivateAccess = new OssPrivateAccess(source.OssPrivateAccess);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.RemoteAuthentication != null) {
            this.RemoteAuthentication = new RemoteAuthentication(source.RemoteAuthentication);
        }
        if (source.ShareCname != null) {
            this.ShareCname = new ShareCname(source.ShareCname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "StatusCodeCache.", this.StatusCodeCache);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "BandwidthAlert.", this.BandwidthAlert);
        this.setParamObj(map, prefix + "RangeOriginPull.", this.RangeOriginPull);
        this.setParamObj(map, prefix + "FollowRedirect.", this.FollowRedirect);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamObj(map, prefix + "RequestHeader.", this.RequestHeader);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "DownstreamCapping.", this.DownstreamCapping);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "ResponseHeaderCache.", this.ResponseHeaderCache);
        this.setParamObj(map, prefix + "VideoSeek.", this.VideoSeek);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "OriginPullOptimization.", this.OriginPullOptimization);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "Authentication.", this.Authentication);
        this.setParamObj(map, prefix + "Seo.", this.Seo);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "UserAgentFilter.", this.UserAgentFilter);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamObj(map, prefix + "UrlRedirect.", this.UrlRedirect);
        this.setParamArraySimple(map, prefix + "AccessPort.", this.AccessPort);
        this.setParamObj(map, prefix + "AdvancedAuthentication.", this.AdvancedAuthentication);
        this.setParamObj(map, prefix + "OriginAuthentication.", this.OriginAuthentication);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "OriginCombine.", this.OriginCombine);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "RemoteAuthentication.", this.RemoteAuthentication);
        this.setParamObj(map, prefix + "ShareCname.", this.ShareCname);

    }
}

