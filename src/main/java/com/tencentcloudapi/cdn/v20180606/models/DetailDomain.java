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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailDomain extends AbstractModel {

    /**
    * Domain name ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Tencent Cloud account ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Accelerated domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * CNAME address of domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Acceleration service status
`rejected`: The domain name is rejected due to expiration/deregistration of its ICP filing
`processing`: Deploying
`closing`: Disabling
`online`: Enabled
`offline`: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Project ID, which can be viewed on the Tencent Cloud project management page
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Acceleration domain name service type
`web`: Webpage file downloads
`download`: Large file downloads
`media`: Audio and video on demand acceleration
`hybrid`: Dynamic and static content acceleration
`dynamic`: Dynamic content acceleration
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Domain name creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Domain name update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin server configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Bandwidth cap configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Range GETs configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 301/302 origin-pull follow-redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Custom error page configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * Custom request header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * Custom response header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Single-link downstream speed limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * Configuration of cache with/without parameter
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Origin server header cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * Node cache expiration rule configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Cross-border linkage optimization configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * HTTPS Acceleration Configuration Guide
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Timestamp hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * Domain name block status
`normal`: Normal
`overdue`: The domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
`malicious`: The acceleration service has been forcibly disabled due to detection of malicious behavior.
`ddos`: The acceleration service has been disabled due to large-scale DDoS attacks to the domain name
`idle`: No operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
`unlicensed`: The acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
`capping`: The configured upper limit for bandwidth has been reached.
`readonly`: The domain name has a special configuration and has been locked.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * Access protocol forced redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser cache expiration rule configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * IPv6 origin-pull configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Backwards compatibility configuration (compatibility field for internal use)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Compatibility")
    @Expose
    private Compatibility Compatibility;

    /**
    * Region-specific configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * Acceleration region
`mainland`: Acceleration inside the Chinese mainland
`overseas`: Acceleration outside the Chinese mainland
`global`: Acceleration over the globe
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Domain name lock status
`normal`: Not locked
`mainland`: Locked in the Chinese mainland
`overseas`: Locked outside the Chinese mainland
global: Locked globally
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * Origin-pull timeout configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
    * S3 bucket origin access authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * SCDN configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * Image optimization configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ImageOptimization")
    @Expose
    private ImageOptimization ImageOptimization;

    /**
    * UA blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * Access control
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AccessControl")
    @Expose
    private AccessControl AccessControl;

    /**
    * Whether to support advanced configuration items
`on`: Supported
`off`: Not supported
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Advance")
    @Expose
    private String Advance;

    /**
    * URL redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UrlRedirect")
    @Expose
    private UrlRedirect UrlRedirect;

    /**
    * Access port configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AccessPort")
    @Expose
    private Long [] AccessPort;

    /**
    * Tag configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Timestamp hotlink protection advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AdvancedAuthentication")
    @Expose
    private AdvancedAuthentication AdvancedAuthentication;

    /**
    * Origin-pull authentication advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginAuthentication")
    @Expose
    private OriginAuthentication OriginAuthentication;

    /**
    * IPv6 access configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * Advanced configuration settings
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AdvanceSet")
    @Expose
    private AdvanceConfig [] AdvanceSet;

    /**
    * Offline cache (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * Merging origin-pull requests (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginCombine")
    @Expose
    private OriginCombine OriginCombine;

    /**
    * POST request configuration item
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostSize PostMaxSize;

    /**
    * QUIC configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * WebSocket configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * Remote authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoteAuthentication")
    @Expose
    private RemoteAuthentication RemoteAuthentication;

    /**
    * Shared CNAME configuration (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ShareCname")
    @Expose
    private ShareCname ShareCname;

    /**
    * Rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleEngine")
    @Expose
    private RuleEngine RuleEngine;

    /**
    * Primary domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentHost")
    @Expose
    private String ParentHost;

    /**
    * Access authentication for Huawei Cloud OBS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * Access authentication for QiNiu Cloud Kodo origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("QnPrivateAccess")
    @Expose
    private QnPrivateAccess QnPrivateAccess;

    /**
    * HTTPS (enabled by default)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpsBilling")
    @Expose
    private HttpsBilling HttpsBilling;

    /**
    * Origin-pull authentication for other origins
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OthersPrivateAccess")
    @Expose
    private OthersPrivateAccess OthersPrivateAccess;

    /**
     * Get Domain name ID 
     * @return ResourceId Domain name ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Domain name ID
     * @param ResourceId Domain name ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Tencent Cloud account ID 
     * @return AppId Tencent Cloud account ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tencent Cloud account ID
     * @param AppId Tencent Cloud account ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Accelerated domain name. 
     * @return Domain Accelerated domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Accelerated domain name.
     * @param Domain Accelerated domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get CNAME address of domain name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Cname CNAME address of domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME address of domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Cname CNAME address of domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Acceleration service status
`rejected`: The domain name is rejected due to expiration/deregistration of its ICP filing
`processing`: Deploying
`closing`: Disabling
`online`: Enabled
`offline`: Disabled 
     * @return Status Acceleration service status
`rejected`: The domain name is rejected due to expiration/deregistration of its ICP filing
`processing`: Deploying
`closing`: Disabling
`online`: Enabled
`offline`: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Acceleration service status
`rejected`: The domain name is rejected due to expiration/deregistration of its ICP filing
`processing`: Deploying
`closing`: Disabling
`online`: Enabled
`offline`: Disabled
     * @param Status Acceleration service status
`rejected`: The domain name is rejected due to expiration/deregistration of its ICP filing
`processing`: Deploying
`closing`: Disabling
`online`: Enabled
`offline`: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID, which can be viewed on the Tencent Cloud project management page 
     * @return ProjectId Project ID, which can be viewed on the Tencent Cloud project management page
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, which can be viewed on the Tencent Cloud project management page
     * @param ProjectId Project ID, which can be viewed on the Tencent Cloud project management page
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Acceleration domain name service type
`web`: Webpage file downloads
`download`: Large file downloads
`media`: Audio and video on demand acceleration
`hybrid`: Dynamic and static content acceleration
`dynamic`: Dynamic content acceleration 
     * @return ServiceType Acceleration domain name service type
`web`: Webpage file downloads
`download`: Large file downloads
`media`: Audio and video on demand acceleration
`hybrid`: Dynamic and static content acceleration
`dynamic`: Dynamic content acceleration
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Acceleration domain name service type
`web`: Webpage file downloads
`download`: Large file downloads
`media`: Audio and video on demand acceleration
`hybrid`: Dynamic and static content acceleration
`dynamic`: Dynamic content acceleration
     * @param ServiceType Acceleration domain name service type
`web`: Webpage file downloads
`download`: Large file downloads
`media`: Audio and video on demand acceleration
`hybrid`: Dynamic and static content acceleration
`dynamic`: Dynamic content acceleration
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Domain name creation time 
     * @return CreateTime Domain name creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Domain name creation time
     * @param CreateTime Domain name creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Domain name update time 
     * @return UpdateTime Domain name update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Domain name update time
     * @param UpdateTime Domain name update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin server configuration. 
     * @return Origin Origin server configuration.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
     * @param Origin Origin server configuration.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get IP blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IpFilter IP blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IpFilter IP blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IpFreqLimit IP access limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IpFreqLimit IP access limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return StatusCodeCache Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param StatusCodeCache Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Compression Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Compression Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Bandwidth cap configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BandwidthAlert Bandwidth cap configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set Bandwidth cap configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BandwidthAlert Bandwidth cap configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Range GETs configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RangeOriginPull Range GETs configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range GETs configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RangeOriginPull Range GETs configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 301/302 origin-pull follow-redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FollowRedirect 301/302 origin-pull follow-redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 origin-pull follow-redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FollowRedirect 301/302 origin-pull follow-redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Custom error page configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ErrorPage Custom error page configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Custom error page configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ErrorPage Custom error page configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get Custom request header configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RequestHeader Custom request header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Custom request header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RequestHeader Custom request header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Custom response header configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseHeader Custom response header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Custom response header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseHeader Custom response header configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Single-link downstream speed limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DownstreamCapping Single-link downstream speed limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set Single-link downstream speed limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DownstreamCapping Single-link downstream speed limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get Configuration of cache with/without parameter
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheKey Configuration of cache with/without parameter
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Configuration of cache with/without parameter
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheKey Configuration of cache with/without parameter
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Origin server header cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseHeaderCache Origin server header cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set Origin server header cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseHeaderCache Origin server header cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return VideoSeek Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param VideoSeek Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get Node cache expiration rule configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cache Node cache expiration rule configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Node cache expiration rule configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cache Node cache expiration rule configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Cross-border linkage optimization configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginPullOptimization Cross-border linkage optimization configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set Cross-border linkage optimization configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginPullOptimization Cross-border linkage optimization configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get HTTPS Acceleration Configuration Guide
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Https HTTPS Acceleration Configuration Guide
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS Acceleration Configuration Guide
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Https HTTPS Acceleration Configuration Guide
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Timestamp hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Authentication Timestamp hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Authentication Timestamp hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Seo SEO configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Seo SEO configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get Domain name block status
`normal`: Normal
`overdue`: The domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
`malicious`: The acceleration service has been forcibly disabled due to detection of malicious behavior.
`ddos`: The acceleration service has been disabled due to large-scale DDoS attacks to the domain name
`idle`: No operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
`unlicensed`: The acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
`capping`: The configured upper limit for bandwidth has been reached.
`readonly`: The domain name has a special configuration and has been locked.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Disable Domain name block status
`normal`: Normal
`overdue`: The domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
`malicious`: The acceleration service has been forcibly disabled due to detection of malicious behavior.
`ddos`: The acceleration service has been disabled due to large-scale DDoS attacks to the domain name
`idle`: No operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
`unlicensed`: The acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
`capping`: The configured upper limit for bandwidth has been reached.
`readonly`: The domain name has a special configuration and has been locked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set Domain name block status
`normal`: Normal
`overdue`: The domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
`malicious`: The acceleration service has been forcibly disabled due to detection of malicious behavior.
`ddos`: The acceleration service has been disabled due to large-scale DDoS attacks to the domain name
`idle`: No operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
`unlicensed`: The acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
`capping`: The configured upper limit for bandwidth has been reached.
`readonly`: The domain name has a special configuration and has been locked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Disable Domain name block status
`normal`: Normal
`overdue`: The domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
`malicious`: The acceleration service has been forcibly disabled due to detection of malicious behavior.
`ddos`: The acceleration service has been disabled due to large-scale DDoS attacks to the domain name
`idle`: No operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
`unlicensed`: The acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
`capping`: The configured upper limit for bandwidth has been reached.
`readonly`: The domain name has a special configuration and has been locked.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Access protocol forced redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ForceRedirect Access protocol forced redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol forced redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ForceRedirect Access protocol forced redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Referer Referer configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Referer Referer configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser cache expiration rule configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MaxAge Browser cache expiration rule configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache expiration rule configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MaxAge Browser cache expiration rule configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get IPv6 origin-pull configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Ipv6 IPv6 origin-pull configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 origin-pull configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Ipv6 IPv6 origin-pull configuration (in beta)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Backwards compatibility configuration (compatibility field for internal use)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Compatibility Backwards compatibility configuration (compatibility field for internal use)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Compatibility getCompatibility() {
        return this.Compatibility;
    }

    /**
     * Set Backwards compatibility configuration (compatibility field for internal use)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Compatibility Backwards compatibility configuration (compatibility field for internal use)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCompatibility(Compatibility Compatibility) {
        this.Compatibility = Compatibility;
    }

    /**
     * Get Region-specific configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SpecificConfig Region-specific configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set Region-specific configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SpecificConfig Region-specific configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get Acceleration region
`mainland`: Acceleration inside the Chinese mainland
`overseas`: Acceleration outside the Chinese mainland
`global`: Acceleration over the globe
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Area Acceleration region
`mainland`: Acceleration inside the Chinese mainland
`overseas`: Acceleration outside the Chinese mainland
`global`: Acceleration over the globe
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region
`mainland`: Acceleration inside the Chinese mainland
`overseas`: Acceleration outside the Chinese mainland
`global`: Acceleration over the globe
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Area Acceleration region
`mainland`: Acceleration inside the Chinese mainland
`overseas`: Acceleration outside the Chinese mainland
`global`: Acceleration over the globe
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Domain name lock status
`normal`: Not locked
`mainland`: Locked in the Chinese mainland
`overseas`: Locked outside the Chinese mainland
global: Locked globally
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Readonly Domain name lock status
`normal`: Not locked
`mainland`: Locked in the Chinese mainland
`overseas`: Locked outside the Chinese mainland
global: Locked globally
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set Domain name lock status
`normal`: Not locked
`mainland`: Locked in the Chinese mainland
`overseas`: Locked outside the Chinese mainland
global: Locked globally
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Readonly Domain name lock status
`normal`: Not locked
`mainland`: Locked in the Chinese mainland
`overseas`: Locked outside the Chinese mainland
global: Locked globally
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get Origin-pull timeout configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginPullTimeout Origin-pull timeout configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set Origin-pull timeout configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginPullTimeout Origin-pull timeout configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
    }

    /**
     * Get S3 bucket origin access authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AwsPrivateAccess S3 bucket origin access authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set S3 bucket origin access authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AwsPrivateAccess S3 bucket origin access authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get SCDN configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SecurityConfig SCDN configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set SCDN configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SecurityConfig SCDN configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get Image optimization configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ImageOptimization Image optimization configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ImageOptimization getImageOptimization() {
        return this.ImageOptimization;
    }

    /**
     * Set Image optimization configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ImageOptimization Image optimization configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setImageOptimization(ImageOptimization ImageOptimization) {
        this.ImageOptimization = ImageOptimization;
    }

    /**
     * Get UA blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UserAgentFilter UA blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UA blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UserAgentFilter UA blocklist/allowlist configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get Access control
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AccessControl Access control
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Access control
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AccessControl Access control
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAccessControl(AccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get Whether to support advanced configuration items
`on`: Supported
`off`: Not supported
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Advance Whether to support advanced configuration items
`on`: Supported
`off`: Not supported
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAdvance() {
        return this.Advance;
    }

    /**
     * Set Whether to support advanced configuration items
`on`: Supported
`off`: Not supported
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Advance Whether to support advanced configuration items
`on`: Supported
`off`: Not supported
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvance(String Advance) {
        this.Advance = Advance;
    }

    /**
     * Get URL redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UrlRedirect URL redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public UrlRedirect getUrlRedirect() {
        return this.UrlRedirect;
    }

    /**
     * Set URL redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UrlRedirect URL redirect configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUrlRedirect(UrlRedirect UrlRedirect) {
        this.UrlRedirect = UrlRedirect;
    }

    /**
     * Get Access port configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AccessPort Access port configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getAccessPort() {
        return this.AccessPort;
    }

    /**
     * Set Access port configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AccessPort Access port configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAccessPort(Long [] AccessPort) {
        this.AccessPort = AccessPort;
    }

    /**
     * Get Tag configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Tag Tag configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Tag Tag configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AdvancedAuthentication Timestamp hotlink protection advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AdvancedAuthentication getAdvancedAuthentication() {
        return this.AdvancedAuthentication;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AdvancedAuthentication Timestamp hotlink protection advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvancedAuthentication(AdvancedAuthentication AdvancedAuthentication) {
        this.AdvancedAuthentication = AdvancedAuthentication;
    }

    /**
     * Get Origin-pull authentication advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginAuthentication Origin-pull authentication advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginAuthentication getOriginAuthentication() {
        return this.OriginAuthentication;
    }

    /**
     * Set Origin-pull authentication advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginAuthentication Origin-pull authentication advanced configuration (allowlist feature)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginAuthentication(OriginAuthentication OriginAuthentication) {
        this.OriginAuthentication = OriginAuthentication;
    }

    /**
     * Get IPv6 access configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Ipv6Access IPv6 access configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set IPv6 access configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Ipv6Access IPv6 access configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get Advanced configuration settings
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AdvanceSet Advanced configuration settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AdvanceConfig [] getAdvanceSet() {
        return this.AdvanceSet;
    }

    /**
     * Set Advanced configuration settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AdvanceSet Advanced configuration settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvanceSet(AdvanceConfig [] AdvanceSet) {
        this.AdvanceSet = AdvanceSet;
    }

    /**
     * Get Offline cache (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OfflineCache Offline cache (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set Offline cache (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OfflineCache Offline cache (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Merging origin-pull requests (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginCombine Merging origin-pull requests (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginCombine getOriginCombine() {
        return this.OriginCombine;
    }

    /**
     * Set Merging origin-pull requests (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginCombine Merging origin-pull requests (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginCombine(OriginCombine OriginCombine) {
        this.OriginCombine = OriginCombine;
    }

    /**
     * Get POST request configuration item
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PostMaxSize POST request configuration item
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public PostSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST request configuration item
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PostMaxSize POST request configuration item
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPostMaxSize(PostSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get QUIC configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Quic QUIC configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Quic QUIC configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OssPrivateAccess Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OssPrivateAccess Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
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
     * Get Remote authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RemoteAuthentication Remote authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RemoteAuthentication getRemoteAuthentication() {
        return this.RemoteAuthentication;
    }

    /**
     * Set Remote authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RemoteAuthentication Remote authentication configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRemoteAuthentication(RemoteAuthentication RemoteAuthentication) {
        this.RemoteAuthentication = RemoteAuthentication;
    }

    /**
     * Get Shared CNAME configuration (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ShareCname Shared CNAME configuration (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ShareCname getShareCname() {
        return this.ShareCname;
    }

    /**
     * Set Shared CNAME configuration (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ShareCname Shared CNAME configuration (only available to beta users)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setShareCname(ShareCname ShareCname) {
        this.ShareCname = ShareCname;
    }

    /**
     * Get Rule engine
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleEngine Rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RuleEngine getRuleEngine() {
        return this.RuleEngine;
    }

    /**
     * Set Rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleEngine Rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleEngine(RuleEngine RuleEngine) {
        this.RuleEngine = RuleEngine;
    }

    /**
     * Get Primary domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ParentHost Primary domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getParentHost() {
        return this.ParentHost;
    }

    /**
     * Set Primary domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ParentHost Primary domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setParentHost(String ParentHost) {
        this.ParentHost = ParentHost;
    }

    /**
     * Get Access authentication for Huawei Cloud OBS origin
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HwPrivateAccess Access authentication for Huawei Cloud OBS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set Access authentication for Huawei Cloud OBS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HwPrivateAccess Access authentication for Huawei Cloud OBS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get Access authentication for QiNiu Cloud Kodo origin
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return QnPrivateAccess Access authentication for QiNiu Cloud Kodo origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public QnPrivateAccess getQnPrivateAccess() {
        return this.QnPrivateAccess;
    }

    /**
     * Set Access authentication for QiNiu Cloud Kodo origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param QnPrivateAccess Access authentication for QiNiu Cloud Kodo origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQnPrivateAccess(QnPrivateAccess QnPrivateAccess) {
        this.QnPrivateAccess = QnPrivateAccess;
    }

    /**
     * Get HTTPS (enabled by default)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HttpsBilling HTTPS (enabled by default)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HttpsBilling getHttpsBilling() {
        return this.HttpsBilling;
    }

    /**
     * Set HTTPS (enabled by default)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HttpsBilling HTTPS (enabled by default)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHttpsBilling(HttpsBilling HttpsBilling) {
        this.HttpsBilling = HttpsBilling;
    }

    /**
     * Get Origin-pull authentication for other origins
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OthersPrivateAccess Origin-pull authentication for other origins
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public OthersPrivateAccess getOthersPrivateAccess() {
        return this.OthersPrivateAccess;
    }

    /**
     * Set Origin-pull authentication for other origins
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OthersPrivateAccess Origin-pull authentication for other origins
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOthersPrivateAccess(OthersPrivateAccess OthersPrivateAccess) {
        this.OthersPrivateAccess = OthersPrivateAccess;
    }

    public DetailDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailDomain(DetailDomain source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        if (source.Disable != null) {
            this.Disable = new String(source.Disable);
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
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.Compatibility != null) {
            this.Compatibility = new Compatibility(source.Compatibility);
        }
        if (source.SpecificConfig != null) {
            this.SpecificConfig = new SpecificConfig(source.SpecificConfig);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Readonly != null) {
            this.Readonly = new String(source.Readonly);
        }
        if (source.OriginPullTimeout != null) {
            this.OriginPullTimeout = new OriginPullTimeout(source.OriginPullTimeout);
        }
        if (source.AwsPrivateAccess != null) {
            this.AwsPrivateAccess = new AwsPrivateAccess(source.AwsPrivateAccess);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.ImageOptimization != null) {
            this.ImageOptimization = new ImageOptimization(source.ImageOptimization);
        }
        if (source.UserAgentFilter != null) {
            this.UserAgentFilter = new UserAgentFilter(source.UserAgentFilter);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new AccessControl(source.AccessControl);
        }
        if (source.Advance != null) {
            this.Advance = new String(source.Advance);
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
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
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
        if (source.AdvanceSet != null) {
            this.AdvanceSet = new AdvanceConfig[source.AdvanceSet.length];
            for (int i = 0; i < source.AdvanceSet.length; i++) {
                this.AdvanceSet[i] = new AdvanceConfig(source.AdvanceSet[i]);
            }
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.OriginCombine != null) {
            this.OriginCombine = new OriginCombine(source.OriginCombine);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostSize(source.PostMaxSize);
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
        if (source.RuleEngine != null) {
            this.RuleEngine = new RuleEngine(source.RuleEngine);
        }
        if (source.ParentHost != null) {
            this.ParentHost = new String(source.ParentHost);
        }
        if (source.HwPrivateAccess != null) {
            this.HwPrivateAccess = new HwPrivateAccess(source.HwPrivateAccess);
        }
        if (source.QnPrivateAccess != null) {
            this.QnPrivateAccess = new QnPrivateAccess(source.QnPrivateAccess);
        }
        if (source.HttpsBilling != null) {
            this.HttpsBilling = new HttpsBilling(source.HttpsBilling);
        }
        if (source.OthersPrivateAccess != null) {
            this.OthersPrivateAccess = new OthersPrivateAccess(source.OthersPrivateAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
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
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Compatibility.", this.Compatibility);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamObj(map, prefix + "ImageOptimization.", this.ImageOptimization);
        this.setParamObj(map, prefix + "UserAgentFilter.", this.UserAgentFilter);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamObj(map, prefix + "UrlRedirect.", this.UrlRedirect);
        this.setParamArraySimple(map, prefix + "AccessPort.", this.AccessPort);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "AdvancedAuthentication.", this.AdvancedAuthentication);
        this.setParamObj(map, prefix + "OriginAuthentication.", this.OriginAuthentication);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamArrayObj(map, prefix + "AdvanceSet.", this.AdvanceSet);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "OriginCombine.", this.OriginCombine);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "RemoteAuthentication.", this.RemoteAuthentication);
        this.setParamObj(map, prefix + "ShareCname.", this.ShareCname);
        this.setParamObj(map, prefix + "RuleEngine.", this.RuleEngine);
        this.setParamSimple(map, prefix + "ParentHost", this.ParentHost);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "QnPrivateAccess.", this.QnPrivateAccess);
        this.setParamObj(map, prefix + "HttpsBilling.", this.HttpsBilling);
        this.setParamObj(map, prefix + "OthersPrivateAccess.", this.OthersPrivateAccess);

    }
}

