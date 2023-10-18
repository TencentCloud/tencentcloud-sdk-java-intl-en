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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCdnDomainRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * Origin server configuration
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Project ID. Default value: 0, indicating `Default Project`
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * IP blocklist/allowlist
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP rate limiting
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * Status code cache
    */
    @SerializedName("StatusCodeCache")
    @Expose
    private StatusCodeCache StatusCodeCache;

    /**
    * Smart compression
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
    * Error code redirection (in beta)
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
    * Cache validity configuration
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Cross-MLC-border origin-pull optimization
    */
    @SerializedName("OriginPullOptimization")
    @Expose
    private OriginPullOptimization OriginPullOptimization;

    /**
    * HTTPS acceleration
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Timestamp hotlink protection
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * SEO optimization
    */
    @SerializedName("Seo")
    @Expose
    private Seo Seo;

    /**
    * Force redirect by access protocol
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer hotlink protection
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser caching (in beta)
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * IPv6 configuration (This feature is in beta and not generally available yet.)
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Specific region configuration
Applicable to cases where the acceleration domain name configuration differs for regions in and outside mainland China.
    */
    @SerializedName("SpecificConfig")
    @Expose
    private SpecificConfig SpecificConfig;

    /**
    * Domain name acceleration region
mainland: acceleration inside mainland China
overseas: acceleration outside mainland China
global: global acceleration
Overseas acceleration service must be enabled to use overseas acceleration and global acceleration.
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
    * Tag configuration
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Ipv6 access configuration
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
    * QUIC access, which is a paid service. You can check the product document and Billing Overview for more information.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Access authentication for S3 origin
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * Access authentication for OSS origin
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * Origin-pull authentication for Huawei Cloud OBS origin
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * Origin-pull authentication for Qiniu Cloud Kodo origin
    */
    @SerializedName("QnPrivateAccess")
    @Expose
    private QnPrivateAccess QnPrivateAccess;

    /**
    * Origin-pull authentication for other origins
    */
    @SerializedName("OthersPrivateAccess")
    @Expose
    private OthersPrivateAccess OthersPrivateAccess;

    /**
    * HTTPS (enabled by default), which is a paid service. You can check the product document and Billing Overview for more information.
    */
    @SerializedName("HttpsBilling")
    @Expose
    private HttpsBilling HttpsBilling;

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
     * Get Project ID. Default value: 0, indicating `Default Project` 
     * @return ProjectId Project ID. Default value: 0, indicating `Default Project`
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Default value: 0, indicating `Default Project`
     * @param ProjectId Project ID. Default value: 0, indicating `Default Project`
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get IP blocklist/allowlist 
     * @return IpFilter IP blocklist/allowlist
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blocklist/allowlist
     * @param IpFilter IP blocklist/allowlist
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP rate limiting 
     * @return IpFreqLimit IP rate limiting
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP rate limiting
     * @param IpFreqLimit IP rate limiting
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get Status code cache 
     * @return StatusCodeCache Status code cache
     */
    public StatusCodeCache getStatusCodeCache() {
        return this.StatusCodeCache;
    }

    /**
     * Set Status code cache
     * @param StatusCodeCache Status code cache
     */
    public void setStatusCodeCache(StatusCodeCache StatusCodeCache) {
        this.StatusCodeCache = StatusCodeCache;
    }

    /**
     * Get Smart compression 
     * @return Compression Smart compression
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Smart compression
     * @param Compression Smart compression
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
     * Get Error code redirection (in beta) 
     * @return ErrorPage Error code redirection (in beta)
     */
    public ErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error code redirection (in beta)
     * @param ErrorPage Error code redirection (in beta)
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
     * Get Cache validity configuration 
     * @return Cache Cache validity configuration
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Cache validity configuration
     * @param Cache Cache validity configuration
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Cross-MLC-border origin-pull optimization 
     * @return OriginPullOptimization Cross-MLC-border origin-pull optimization
     */
    public OriginPullOptimization getOriginPullOptimization() {
        return this.OriginPullOptimization;
    }

    /**
     * Set Cross-MLC-border origin-pull optimization
     * @param OriginPullOptimization Cross-MLC-border origin-pull optimization
     */
    public void setOriginPullOptimization(OriginPullOptimization OriginPullOptimization) {
        this.OriginPullOptimization = OriginPullOptimization;
    }

    /**
     * Get HTTPS acceleration 
     * @return Https HTTPS acceleration
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set HTTPS acceleration
     * @param Https HTTPS acceleration
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Timestamp hotlink protection 
     * @return Authentication Timestamp hotlink protection
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection
     * @param Authentication Timestamp hotlink protection
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get SEO optimization 
     * @return Seo SEO optimization
     */
    public Seo getSeo() {
        return this.Seo;
    }

    /**
     * Set SEO optimization
     * @param Seo SEO optimization
     */
    public void setSeo(Seo Seo) {
        this.Seo = Seo;
    }

    /**
     * Get Force redirect by access protocol 
     * @return ForceRedirect Force redirect by access protocol
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Force redirect by access protocol
     * @param ForceRedirect Force redirect by access protocol
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer hotlink protection 
     * @return Referer Referer hotlink protection
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer hotlink protection
     * @param Referer Referer hotlink protection
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser caching (in beta) 
     * @return MaxAge Browser caching (in beta)
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser caching (in beta)
     * @param MaxAge Browser caching (in beta)
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get IPv6 configuration (This feature is in beta and not generally available yet.) 
     * @return Ipv6 IPv6 configuration (This feature is in beta and not generally available yet.)
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 configuration (This feature is in beta and not generally available yet.)
     * @param Ipv6 IPv6 configuration (This feature is in beta and not generally available yet.)
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
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
mainland: acceleration inside mainland China
overseas: acceleration outside mainland China
global: global acceleration
Overseas acceleration service must be enabled to use overseas acceleration and global acceleration. 
     * @return Area Domain name acceleration region
mainland: acceleration inside mainland China
overseas: acceleration outside mainland China
global: global acceleration
Overseas acceleration service must be enabled to use overseas acceleration and global acceleration.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration region
mainland: acceleration inside mainland China
overseas: acceleration outside mainland China
global: global acceleration
Overseas acceleration service must be enabled to use overseas acceleration and global acceleration.
     * @param Area Domain name acceleration region
mainland: acceleration inside mainland China
overseas: acceleration outside mainland China
global: global acceleration
Overseas acceleration service must be enabled to use overseas acceleration and global acceleration.
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
     * Get Tag configuration 
     * @return Tag Tag configuration
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag configuration
     * @param Tag Tag configuration
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Ipv6 access configuration 
     * @return Ipv6Access Ipv6 access configuration
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set Ipv6 access configuration
     * @param Ipv6Access Ipv6 access configuration
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
     * Get Access authentication for S3 origin 
     * @return AwsPrivateAccess Access authentication for S3 origin
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set Access authentication for S3 origin
     * @param AwsPrivateAccess Access authentication for S3 origin
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
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
     * Get Origin-pull authentication for Huawei Cloud OBS origin 
     * @return HwPrivateAccess Origin-pull authentication for Huawei Cloud OBS origin
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set Origin-pull authentication for Huawei Cloud OBS origin
     * @param HwPrivateAccess Origin-pull authentication for Huawei Cloud OBS origin
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get Origin-pull authentication for Qiniu Cloud Kodo origin 
     * @return QnPrivateAccess Origin-pull authentication for Qiniu Cloud Kodo origin
     */
    public QnPrivateAccess getQnPrivateAccess() {
        return this.QnPrivateAccess;
    }

    /**
     * Set Origin-pull authentication for Qiniu Cloud Kodo origin
     * @param QnPrivateAccess Origin-pull authentication for Qiniu Cloud Kodo origin
     */
    public void setQnPrivateAccess(QnPrivateAccess QnPrivateAccess) {
        this.QnPrivateAccess = QnPrivateAccess;
    }

    /**
     * Get Origin-pull authentication for other origins 
     * @return OthersPrivateAccess Origin-pull authentication for other origins
     */
    public OthersPrivateAccess getOthersPrivateAccess() {
        return this.OthersPrivateAccess;
    }

    /**
     * Set Origin-pull authentication for other origins
     * @param OthersPrivateAccess Origin-pull authentication for other origins
     */
    public void setOthersPrivateAccess(OthersPrivateAccess OthersPrivateAccess) {
        this.OthersPrivateAccess = OthersPrivateAccess;
    }

    /**
     * Get HTTPS (enabled by default), which is a paid service. You can check the product document and Billing Overview for more information. 
     * @return HttpsBilling HTTPS (enabled by default), which is a paid service. You can check the product document and Billing Overview for more information.
     */
    public HttpsBilling getHttpsBilling() {
        return this.HttpsBilling;
    }

    /**
     * Set HTTPS (enabled by default), which is a paid service. You can check the product document and Billing Overview for more information.
     * @param HttpsBilling HTTPS (enabled by default), which is a paid service. You can check the product document and Billing Overview for more information.
     */
    public void setHttpsBilling(HttpsBilling HttpsBilling) {
        this.HttpsBilling = HttpsBilling;
    }

    public AddCdnDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCdnDomainRequest(AddCdnDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
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
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.Ipv6Access != null) {
            this.Ipv6Access = new Ipv6Access(source.Ipv6Access);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.Quic != null) {
            this.Quic = new Quic(source.Quic);
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
        if (source.OthersPrivateAccess != null) {
            this.OthersPrivateAccess = new OthersPrivateAccess(source.OthersPrivateAccess);
        }
        if (source.HttpsBilling != null) {
            this.HttpsBilling = new HttpsBilling(source.HttpsBilling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
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
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "SpecificConfig.", this.SpecificConfig);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "OriginPullTimeout.", this.OriginPullTimeout);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "QnPrivateAccess.", this.QnPrivateAccess);
        this.setParamObj(map, prefix + "OthersPrivateAccess.", this.OthersPrivateAccess);
        this.setParamObj(map, prefix + "HttpsBilling.", this.HttpsBilling);

    }
}

