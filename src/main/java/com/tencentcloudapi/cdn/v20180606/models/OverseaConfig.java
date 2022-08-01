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

public class OverseaConfig extends AbstractModel{

    /**
    * Timestamp hotlink protection configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * Bandwidth cap configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthAlert")
    @Expose
    private BandwidthAlert BandwidthAlert;

    /**
    * Cache rule configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Smart compression configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Download speed limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DownstreamCapping")
    @Expose
    private DownstreamCapping DownstreamCapping;

    /**
    * Error code redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorPage")
    @Expose
    private ErrorPage ErrorPage;

    /**
    * 301 and 302 automatic origin-pull follow-redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Protocol redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * HTTPS configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * IP blocklist/allowlist configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP access limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Browser cache rules configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Origin server configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Cross-border optimization configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * Range GETs configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RangeOriginPull")
    @Expose
    private RangeOriginPull RangeOriginPull;

    /**
    * Hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Origin-pull request header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * Origin server response header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Follows origin server cache header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseHeaderCache")
    @Expose
    private ResponseHeaderCache ResponseHeaderCache;

    /**
    * SEO configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * Domain name service type. Values: `web` (static acceleration); `download` (download acceleration); `media` (streaming media acceleration).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Status code cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * Video dragging configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoSeek")
    @Expose
    private VideoSeek VideoSeek;

    /**
    * Access authentication for S3 origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * Access authentication for OSS origin
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

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
     * Get Timestamp hotlink protection configuration.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Authentication Timestamp hotlink protection configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Authentication Timestamp hotlink protection configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get Bandwidth cap configuration.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BandwidthAlert Bandwidth cap configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public BandwidthAlert getBandwidthAlert() {
        return this.BandwidthAlert;
    }

    /**
     * Set Bandwidth cap configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BandwidthAlert Bandwidth cap configuration.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBandwidthAlert(BandwidthAlert BandwidthAlert) {
        this.BandwidthAlert = BandwidthAlert;
    }

    /**
     * Get Cache rule configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cache Cache rule configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Cache rule configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cache Cache rule configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheKey Cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheKey Cache configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
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
     * Get Download speed limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DownstreamCapping Download speed limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DownstreamCapping getDownstreamCapping() {
        return this.DownstreamCapping;
    }

    /**
     * Set Download speed limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DownstreamCapping Download speed limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDownstreamCapping(DownstreamCapping DownstreamCapping) {
        this.DownstreamCapping = DownstreamCapping;
    }

    /**
     * Get Error code redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ErrorPage Error code redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error code redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ErrorPage Error code redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setErrorPage(ErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get 301 and 302 automatic origin-pull follow-redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FollowRedirect 301 and 302 automatic origin-pull follow-redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301 and 302 automatic origin-pull follow-redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FollowRedirect 301 and 302 automatic origin-pull follow-redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Protocol redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ForceRedirect Protocol redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Protocol redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ForceRedirect Protocol redirect configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get HTTPS configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Https HTTPS configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Https HTTPS configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get IP blocklist/allowlist configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IpFilter IP blocklist/allowlist configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blocklist/allowlist configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IpFilter IP blocklist/allowlist configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP access limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IpFreqLimit IP access limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP access limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IpFreqLimit IP access limit configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Browser cache rules configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MaxAge Browser cache rules configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache rules configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MaxAge Browser cache rules configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Origin server configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Origin Origin server configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Origin Origin server configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Cross-border optimization configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginPullOptimization Cross-border optimization configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set Cross-border optimization configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginPullOptimization Cross-border optimization configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get Range GETs configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RangeOriginPull Range GETs configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RangeOriginPull getRangeOriginPull() {
        return this.RangeOriginPull;
    }

    /**
     * Set Range GETs configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RangeOriginPull Range GETs configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRangeOriginPull(RangeOriginPull RangeOriginPull) {
        this.RangeOriginPull = RangeOriginPull;
    }

    /**
     * Get Hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Referer Hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Referer Hotlink protection configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Origin-pull request header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RequestHeader Origin-pull request header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Origin-pull request header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RequestHeader Origin-pull request header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Origin server response header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseHeader Origin server response header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Origin server response header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseHeader Origin server response header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Follows origin server cache header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseHeaderCache Follows origin server cache header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ResponseHeaderCache getResponseHeaderCache() {
        return this.ResponseHeaderCache;
    }

    /**
     * Set Follows origin server cache header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseHeaderCache Follows origin server cache header configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseHeaderCache(ResponseHeaderCache ResponseHeaderCache) {
        this.ResponseHeaderCache = ResponseHeaderCache;
    }

    /**
     * Get SEO configuration.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Seo SEO configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Seo SEO configuration.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get Domain name service type. Values: `web` (static acceleration); `download` (download acceleration); `media` (streaming media acceleration).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ServiceType Domain name service type. Values: `web` (static acceleration); `download` (download acceleration); `media` (streaming media acceleration).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Domain name service type. Values: `web` (static acceleration); `download` (download acceleration); `media` (streaming media acceleration).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ServiceType Domain name service type. Values: `web` (static acceleration); `download` (download acceleration); `media` (streaming media acceleration).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
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
     * Get Access authentication for S3 origin
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AwsPrivateAccess Access authentication for S3 origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set Access authentication for S3 origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AwsPrivateAccess Access authentication for S3 origin
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
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

    public OverseaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverseaConfig(OverseaConfig source) {
        if (source.Authentication != null) {
            this.Authentication = new Authentication(source.Authentication);
        }
        if (source.BandwidthAlert != null) {
            this.BandwidthAlert = new BandwidthAlert(source.BandwidthAlert);
        }
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.DownstreamCapping != null) {
            this.DownstreamCapping = new DownstreamCapping(source.DownstreamCapping);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ErrorPage(source.ErrorPage);
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new FollowRedirect(source.FollowRedirect);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.IpFilter != null) {
            this.IpFilter = new IpFilter(source.IpFilter);
        }
        if (source.IpFreqLimit != null) {
            this.IpFreqLimit = new IpFreqLimit(source.IpFreqLimit);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.OriginPullOptimization != null) {
            this.OriginPullOptimization = new OriginPullOptimization(source.OriginPullOptimization);
        }
        if (source.RangeOriginPull != null) {
            this.RangeOriginPull = new RangeOriginPull(source.RangeOriginPull);
        }
        if (source.Referer != null) {
            this.Referer = new Referer(source.Referer);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new RequestHeader(source.RequestHeader);
        }
        if (source.ResponseHeader != null) {
            this.ResponseHeader = new ResponseHeader(source.ResponseHeader);
        }
        if (source.ResponseHeaderCache != null) {
            this.ResponseHeaderCache = new ResponseHeaderCache(source.ResponseHeaderCache);
        }
        if (source.Seo != null) {
            this.Seo = new Seo(source.Seo);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.StatusCodeCache != null) {
            this.StatusCodeCache = new StatusCodeCache(source.StatusCodeCache);
        }
        if (source.VideoSeek != null) {
            this.VideoSeek = new VideoSeek(source.VideoSeek);
        }
        if (source.AwsPrivateAccess != null) {
            this.AwsPrivateAccess = new AwsPrivateAccess(source.AwsPrivateAccess);
        }
        if (source.OssPrivateAccess != null) {
            this.OssPrivateAccess = new OssPrivateAccess(source.OssPrivateAccess);
        }
        if (source.HwPrivateAccess != null) {
            this.HwPrivateAccess = new HwPrivateAccess(source.HwPrivateAccess);
        }
        if (source.QnPrivateAccess != null) {
            this.QnPrivateAccess = new QnPrivateAccess(source.QnPrivateAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Authentication.", this.Authentication);
        this.setParamObj(map, prefix + "BandwidthAlert.", this.BandwidthAlert);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "DownstreamCapping.", this.DownstreamCapping);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamObj(map, prefix + "FollowRedirect.", this.FollowRedirect);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "OriginPullOptimization.", this.OriginPullOptimization);
        this.setParamObj(map, prefix + "RangeOriginPull.", this.RangeOriginPull);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "RequestHeader.", this.RequestHeader);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "ResponseHeaderCache.", this.ResponseHeaderCache);
        this.setParamObj(map, prefix + "Seo.", this.Seo);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "StatusCodeCache.", this.StatusCodeCache);
        this.setParamObj(map, prefix + "VideoSeek.", this.VideoSeek);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "QnPrivateAccess.", this.QnPrivateAccess);

    }
}

