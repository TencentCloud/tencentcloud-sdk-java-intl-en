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

public class DetailDomain extends AbstractModel{

    /**
    * Domain name ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Tencent Cloud account ID.
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
    * Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Domain name status. pending: under review; rejected: review failed; processing: review succeeded and under deployment; online: enabled; offline: disabled; deleted: deleted.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Domain name business type. web: static acceleration; download: download acceleration; media: streaming media acceleration.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Domain name creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Domain name update time.
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
    * IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Status code cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * Smart compression configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Bandwidth cap configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Range origin-pull configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * 301 and 302 automatic origin-pull follow-redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Error code redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * Origin-pull request header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Download speed configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * Node cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Follows origin server cache header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * Video dragging configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * Cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Cross-border optimization configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Timestamp hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * Domain name block status, including normal, overdue, quota, malicious, ddos, idle, unlicensed, capping, and readonly.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * Access protocol forced redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * IPv6 configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Whether it is compatible with configurations in old versions.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compatibility")
    @Expose
    private Compatibility Compatibility;

    /**
    * Specific configuration by region.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * Acceleration region, including mainland, overseas, and global.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Domain name lock status. normal: not locked; mainland: locked in mainland China; overseas: locked outside mainland China; global: locked globally.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * Origin-pull timeout configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginPullTimeout")
    @Expose
    private OriginPullTimeout OriginPullTimeout;

    /**
     * Get Domain name ID. 
     * @return ResourceId Domain name ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Domain name ID.
     * @param ResourceId Domain name ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Tencent Cloud account ID. 
     * @return AppId Tencent Cloud account ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tencent Cloud account ID.
     * @param AppId Tencent Cloud account ID.
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
     * Get Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cname Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cname Domain name CNAME.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Domain name status. pending: under review; rejected: review failed; processing: review succeeded and under deployment; online: enabled; offline: disabled; deleted: deleted. 
     * @return Status Domain name status. pending: under review; rejected: review failed; processing: review succeeded and under deployment; online: enabled; offline: disabled; deleted: deleted.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name status. pending: under review; rejected: review failed; processing: review succeeded and under deployment; online: enabled; offline: disabled; deleted: deleted.
     * @param Status Domain name status. pending: under review; rejected: review failed; processing: review succeeded and under deployment; online: enabled; offline: disabled; deleted: deleted.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Domain name business type. web: static acceleration; download: download acceleration; media: streaming media acceleration. 
     * @return ServiceType Domain name business type. web: static acceleration; download: download acceleration; media: streaming media acceleration.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Domain name business type. web: static acceleration; download: download acceleration; media: streaming media acceleration.
     * @param ServiceType Domain name business type. web: static acceleration; download: download acceleration; media: streaming media acceleration.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Domain name creation time. 
     * @return CreateTime Domain name creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Domain name creation time.
     * @param CreateTime Domain name creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Domain name update time. 
     * @return UpdateTime Domain name update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Domain name update time.
     * @param UpdateTime Domain name update time.
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
     * Get IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpFilter IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpFilter IP blacklist/whitelist configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpFreqLimit IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpFreqLimit IP access limit configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Status code cache configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusCodeCache Status code cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set Status code cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusCodeCache Status code cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get Smart compression configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Compression Smart compression configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Compression Smart compression configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Bandwidth cap configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthAlert Bandwidth cap configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set Bandwidth cap configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BandwidthAlert Bandwidth cap configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Range origin-pull configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RangeOriginPull Range origin-pull configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range origin-pull configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RangeOriginPull Range origin-pull configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get 301 and 302 automatic origin-pull follow-redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FollowRedirect 301 and 302 automatic origin-pull follow-redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301 and 302 automatic origin-pull follow-redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FollowRedirect 301 and 302 automatic origin-pull follow-redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Error code redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorPage Error code redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error code redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorPage Error code redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get Origin-pull request header configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RequestHeader Origin-pull request header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Origin-pull request header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RequestHeader Origin-pull request header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseHeader Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseHeader Origin server response header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Download speed configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DownstreamCapping Download speed configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set Download speed configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DownstreamCapping Download speed configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get Node cache configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheKey Node cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Node cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheKey Node cache configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Follows origin server cache header configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseHeaderCache Follows origin server cache header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set Follows origin server cache header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseHeaderCache Follows origin server cache header configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get Video dragging configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoSeek Video dragging configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public VideoSeek getVideoSeek() {
        return this.VideoSeek;
    }

    /**
     * Set Video dragging configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoSeek Video dragging configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoSeek(VideoSeek VideoSeek) {
        this.VideoSeek = VideoSeek;
    }

    /**
     * Get Cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cache Cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cache Cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Cross-border optimization configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginPullOptimization Cross-border optimization configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set Cross-border optimization configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginPullOptimization Cross-border optimization configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Https HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Https HTTPS configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Timestamp hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Authentication Timestamp hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Authentication Timestamp hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Seo SEO configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Seo SEO configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get Domain name block status, including normal, overdue, quota, malicious, ddos, idle, unlicensed, capping, and readonly.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Disable Domain name block status, including normal, overdue, quota, malicious, ddos, idle, unlicensed, capping, and readonly.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set Domain name block status, including normal, overdue, quota, malicious, ddos, idle, unlicensed, capping, and readonly.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Disable Domain name block status, including normal, overdue, quota, malicious, ddos, idle, unlicensed, capping, and readonly.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Access protocol forced redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ForceRedirect Access protocol forced redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol forced redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ForceRedirect Access protocol forced redirect configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Referer Hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Referer Hotlink protection configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxAge Browser cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxAge Browser cache rules configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get IPv6 configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6 IPv6 configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ipv6 IPv6 configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether it is compatible with configurations in old versions.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Compatibility Whether it is compatible with configurations in old versions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Compatibility getCompatibility() {
        return this.Compatibility;
    }

    /**
     * Set Whether it is compatible with configurations in old versions.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Compatibility Whether it is compatible with configurations in old versions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompatibility(Compatibility Compatibility) {
        this.Compatibility = Compatibility;
    }

    /**
     * Get Specific configuration by region.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SpecificConfig Specific configuration by region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SpecificConfig getSpecificConfig() {
        return this.SpecificConfig;
    }

    /**
     * Set Specific configuration by region.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SpecificConfig Specific configuration by region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecificConfig(SpecificConfig SpecificConfig) {
        this.SpecificConfig = SpecificConfig;
    }

    /**
     * Get Acceleration region, including mainland, overseas, and global.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Area Acceleration region, including mainland, overseas, and global.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region, including mainland, overseas, and global.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Area Acceleration region, including mainland, overseas, and global.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Domain name lock status. normal: not locked; mainland: locked in mainland China; overseas: locked outside mainland China; global: locked globally.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Readonly Domain name lock status. normal: not locked; mainland: locked in mainland China; overseas: locked outside mainland China; global: locked globally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set Domain name lock status. normal: not locked; mainland: locked in mainland China; overseas: locked outside mainland China; global: locked globally.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Readonly Domain name lock status. normal: not locked; mainland: locked in mainland China; overseas: locked outside mainland China; global: locked globally.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get Origin-pull timeout configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginPullTimeout Origin-pull timeout configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OriginPullTimeout getOriginPullTimeout() {
        return this.OriginPullTimeout;
    }

    /**
     * Set Origin-pull timeout configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginPullTimeout Origin-pull timeout configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginPullTimeout(OriginPullTimeout OriginPullTimeout) {
        this.OriginPullTimeout = OriginPullTimeout;
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

    }
}

