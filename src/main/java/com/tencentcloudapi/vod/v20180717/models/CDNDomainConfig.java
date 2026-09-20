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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDNDomainConfig extends AbstractModel {

    /**
    * Domain acceleration region:
<li>mainland: domestic acceleration in China;</li>
<li>overseas: acceleration outside China;</li>
<li>global: global acceleration.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Origin server configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP allowlist/blocklist configuration.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * UA Blocklist/Allowlist Configuration.
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * 301/302 origin-pull follow configuration.
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Request header configuration.
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * header configuration.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Cache expiration time configuration.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Https configuration.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Timestamp hotlink protection configuration.
    */
    @SerializedName("Authentication")
    @Expose
    private Authentication Authentication;

    /**
    * Forced redirect configuration for access protocols.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer anti-leech configuration.
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser cache configuration.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * Ipv6 access configuration.
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * Quic access configuration.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Authentication configuration for AWS S3 origin-pull.
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * Authentication configuration for origin-pull from Alibaba Cloud OSS.
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * Authentication configuration for origin-pull from Huawei Cloud Object Storage.
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * Authentication configuration for origin-pull from other vendors' object storage.
    */
    @SerializedName("OthersPrivateAccess")
    @Expose
    private OthersPrivateAccess OthersPrivateAccess;

    /**
     * Get Domain acceleration region:
<li>mainland: domestic acceleration in China;</li>
<li>overseas: acceleration outside China;</li>
<li>global: global acceleration.</li> 
     * @return Area Domain acceleration region:
<li>mainland: domestic acceleration in China;</li>
<li>overseas: acceleration outside China;</li>
<li>global: global acceleration.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain acceleration region:
<li>mainland: domestic acceleration in China;</li>
<li>overseas: acceleration outside China;</li>
<li>global: global acceleration.</li>
     * @param Area Domain acceleration region:
<li>mainland: domestic acceleration in China;</li>
<li>overseas: acceleration outside China;</li>
<li>global: global acceleration.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
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
     * Get IP allowlist/blocklist configuration. 
     * @return IpFilter IP allowlist/blocklist configuration.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP allowlist/blocklist configuration.
     * @param IpFilter IP allowlist/blocklist configuration.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get UA Blocklist/Allowlist Configuration. 
     * @return UserAgentFilter UA Blocklist/Allowlist Configuration.
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UA Blocklist/Allowlist Configuration.
     * @param UserAgentFilter UA Blocklist/Allowlist Configuration.
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get 301/302 origin-pull follow configuration. 
     * @return FollowRedirect 301/302 origin-pull follow configuration.
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set 301/302 origin-pull follow configuration.
     * @param FollowRedirect 301/302 origin-pull follow configuration.
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Request header configuration. 
     * @return RequestHeader Request header configuration.
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Request header configuration.
     * @param RequestHeader Request header configuration.
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get header configuration. 
     * @return ResponseHeader header configuration.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set header configuration.
     * @param ResponseHeader header configuration.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Cache expiration time configuration. 
     * @return Cache Cache expiration time configuration.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Cache expiration time configuration.
     * @param Cache Cache expiration time configuration.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Https configuration. 
     * @return Https Https configuration.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https configuration.
     * @param Https Https configuration.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Timestamp hotlink protection configuration. 
     * @return Authentication Timestamp hotlink protection configuration.
     */
    public Authentication getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Timestamp hotlink protection configuration.
     * @param Authentication Timestamp hotlink protection configuration.
     */
    public void setAuthentication(Authentication Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get Forced redirect configuration for access protocols. 
     * @return ForceRedirect Forced redirect configuration for access protocols.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Forced redirect configuration for access protocols.
     * @param ForceRedirect Forced redirect configuration for access protocols.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer anti-leech configuration. 
     * @return Referer Referer anti-leech configuration.
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer anti-leech configuration.
     * @param Referer Referer anti-leech configuration.
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser cache configuration. 
     * @return MaxAge Browser cache configuration.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache configuration.
     * @param MaxAge Browser cache configuration.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Ipv6 access configuration. 
     * @return Ipv6Access Ipv6 access configuration.
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set Ipv6 access configuration.
     * @param Ipv6Access Ipv6 access configuration.
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get Quic access configuration. 
     * @return Quic Quic access configuration.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic access configuration.
     * @param Quic Quic access configuration.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Authentication configuration for AWS S3 origin-pull. 
     * @return AwsPrivateAccess Authentication configuration for AWS S3 origin-pull.
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set Authentication configuration for AWS S3 origin-pull.
     * @param AwsPrivateAccess Authentication configuration for AWS S3 origin-pull.
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get Authentication configuration for origin-pull from Alibaba Cloud OSS. 
     * @return OssPrivateAccess Authentication configuration for origin-pull from Alibaba Cloud OSS.
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set Authentication configuration for origin-pull from Alibaba Cloud OSS.
     * @param OssPrivateAccess Authentication configuration for origin-pull from Alibaba Cloud OSS.
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
    }

    /**
     * Get Authentication configuration for origin-pull from Huawei Cloud Object Storage. 
     * @return HwPrivateAccess Authentication configuration for origin-pull from Huawei Cloud Object Storage.
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set Authentication configuration for origin-pull from Huawei Cloud Object Storage.
     * @param HwPrivateAccess Authentication configuration for origin-pull from Huawei Cloud Object Storage.
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get Authentication configuration for origin-pull from other vendors' object storage. 
     * @return OthersPrivateAccess Authentication configuration for origin-pull from other vendors' object storage.
     */
    public OthersPrivateAccess getOthersPrivateAccess() {
        return this.OthersPrivateAccess;
    }

    /**
     * Set Authentication configuration for origin-pull from other vendors' object storage.
     * @param OthersPrivateAccess Authentication configuration for origin-pull from other vendors' object storage.
     */
    public void setOthersPrivateAccess(OthersPrivateAccess OthersPrivateAccess) {
        this.OthersPrivateAccess = OthersPrivateAccess;
    }

    public CDNDomainConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDNDomainConfig(CDNDomainConfig source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.IpFilter != null) {
            this.IpFilter = new IpFilter(source.IpFilter);
        }
        if (source.UserAgentFilter != null) {
            this.UserAgentFilter = new UserAgentFilter(source.UserAgentFilter);
        }
        if (source.FollowRedirect != null) {
            this.FollowRedirect = new FollowRedirect(source.FollowRedirect);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new RequestHeader(source.RequestHeader);
        }
        if (source.ResponseHeader != null) {
            this.ResponseHeader = new ResponseHeader(source.ResponseHeader);
        }
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.Authentication != null) {
            this.Authentication = new Authentication(source.Authentication);
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
        if (source.Ipv6Access != null) {
            this.Ipv6Access = new Ipv6Access(source.Ipv6Access);
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
        if (source.OthersPrivateAccess != null) {
            this.OthersPrivateAccess = new OthersPrivateAccess(source.OthersPrivateAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "UserAgentFilter.", this.UserAgentFilter);
        this.setParamObj(map, prefix + "FollowRedirect.", this.FollowRedirect);
        this.setParamObj(map, prefix + "RequestHeader.", this.RequestHeader);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "Authentication.", this.Authentication);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Referer.", this.Referer);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "Ipv6Access.", this.Ipv6Access);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "AwsPrivateAccess.", this.AwsPrivateAccess);
        this.setParamObj(map, prefix + "OssPrivateAccess.", this.OssPrivateAccess);
        this.setParamObj(map, prefix + "HwPrivateAccess.", this.HwPrivateAccess);
        this.setParamObj(map, prefix + "OthersPrivateAccess.", this.OthersPrivateAccess);

    }
}

