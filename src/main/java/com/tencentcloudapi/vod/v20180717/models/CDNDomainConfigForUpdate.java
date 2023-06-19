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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDNDomainConfigForUpdate extends AbstractModel{

    /**
    * Acceleration region:<li>mainland:Acceleration inside the Chinese mainland;</li> <li>overseas: Acceleration outside the Chinese mainland;</li> <li>Acceleration over the globe.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Origin Server Configuration.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * IP blocklist/allowlist configuration. This is disabled by default.
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * UserAgent:blacklist/whitelist configuration.
    */
    @SerializedName("UserAgentFilter")
    @Expose
    private UserAgentFilter UserAgentFilter;

    /**
    * Back to the source 301/302 status code automatically follows the configuration, the default is off
    */
    @SerializedName("FollowRedirect")
    @Expose
    private FollowRedirect FollowRedirect;

    /**
    * Custom request header configuration. This is disabled by default.
    */
    @SerializedName("RequestHeader")
    @Expose
    private RequestHeader RequestHeader;

    /**
    * Custom response header configuration. This is disabled by default.
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * Node cache expiration time configuration.
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Domain name HTTPS acceleration configuration. This is disabled by default.
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
    * Access protocol forced redirect configuration. This is disabled by default.
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Referer blacklist/whitelist configuration. This is disabled by default.
    */
    @SerializedName("Referer")
    @Expose
    private Referer Referer;

    /**
    * Browser cache rule configuration, which is used to set the default value of MaxAge and is disabled by default.
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * IPv6 access configuration.
    */
    @SerializedName("Ipv6Access")
    @Expose
    private Ipv6Access Ipv6Access;

    /**
    * QUIC configuration item.
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Origin access authentication for S3 bucket.
    */
    @SerializedName("AwsPrivateAccess")
    @Expose
    private AwsPrivateAccess AwsPrivateAccess;

    /**
    * Access authentication configuration for OSS origin.
    */
    @SerializedName("OssPrivateAccess")
    @Expose
    private OssPrivateAccess OssPrivateAccess;

    /**
    * Access authentication for Huawei Cloud OBS origin
    */
    @SerializedName("HwPrivateAccess")
    @Expose
    private HwPrivateAccess HwPrivateAccess;

    /**
    * Origin-pull authentication for other origins.
    */
    @SerializedName("OthersPrivateAccess")
    @Expose
    private OthersPrivateAccess OthersPrivateAccess;

    /**
     * Get Acceleration region:<li>mainland:Acceleration inside the Chinese mainland;</li> <li>overseas: Acceleration outside the Chinese mainland;</li> <li>Acceleration over the globe.</li> 
     * @return Area Acceleration region:<li>mainland:Acceleration inside the Chinese mainland;</li> <li>overseas: Acceleration outside the Chinese mainland;</li> <li>Acceleration over the globe.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region:<li>mainland:Acceleration inside the Chinese mainland;</li> <li>overseas: Acceleration outside the Chinese mainland;</li> <li>Acceleration over the globe.</li>
     * @param Area Acceleration region:<li>mainland:Acceleration inside the Chinese mainland;</li> <li>overseas: Acceleration outside the Chinese mainland;</li> <li>Acceleration over the globe.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Origin Server Configuration. 
     * @return Origin Origin Server Configuration.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin Server Configuration.
     * @param Origin Origin Server Configuration.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get IP blocklist/allowlist configuration. This is disabled by default. 
     * @return IpFilter IP blocklist/allowlist configuration. This is disabled by default.
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP blocklist/allowlist configuration. This is disabled by default.
     * @param IpFilter IP blocklist/allowlist configuration. This is disabled by default.
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get UserAgent:blacklist/whitelist configuration. 
     * @return UserAgentFilter UserAgent:blacklist/whitelist configuration.
     */
    public UserAgentFilter getUserAgentFilter() {
        return this.UserAgentFilter;
    }

    /**
     * Set UserAgent:blacklist/whitelist configuration.
     * @param UserAgentFilter UserAgent:blacklist/whitelist configuration.
     */
    public void setUserAgentFilter(UserAgentFilter UserAgentFilter) {
        this.UserAgentFilter = UserAgentFilter;
    }

    /**
     * Get Back to the source 301/302 status code automatically follows the configuration, the default is off 
     * @return FollowRedirect Back to the source 301/302 status code automatically follows the configuration, the default is off
     */
    public FollowRedirect getFollowRedirect() {
        return this.FollowRedirect;
    }

    /**
     * Set Back to the source 301/302 status code automatically follows the configuration, the default is off
     * @param FollowRedirect Back to the source 301/302 status code automatically follows the configuration, the default is off
     */
    public void setFollowRedirect(FollowRedirect FollowRedirect) {
        this.FollowRedirect = FollowRedirect;
    }

    /**
     * Get Custom request header configuration. This is disabled by default. 
     * @return RequestHeader Custom request header configuration. This is disabled by default.
     */
    public RequestHeader getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Custom request header configuration. This is disabled by default.
     * @param RequestHeader Custom request header configuration. This is disabled by default.
     */
    public void setRequestHeader(RequestHeader RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Custom response header configuration. This is disabled by default. 
     * @return ResponseHeader Custom response header configuration. This is disabled by default.
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set Custom response header configuration. This is disabled by default.
     * @param ResponseHeader Custom response header configuration. This is disabled by default.
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get Node cache expiration time configuration. 
     * @return Cache Node cache expiration time configuration.
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set Node cache expiration time configuration.
     * @param Cache Node cache expiration time configuration.
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Domain name HTTPS acceleration configuration. This is disabled by default. 
     * @return Https Domain name HTTPS acceleration configuration. This is disabled by default.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Domain name HTTPS acceleration configuration. This is disabled by default.
     * @param Https Domain name HTTPS acceleration configuration. This is disabled by default.
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
     * Get Access protocol forced redirect configuration. This is disabled by default. 
     * @return ForceRedirect Access protocol forced redirect configuration. This is disabled by default.
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set Access protocol forced redirect configuration. This is disabled by default.
     * @param ForceRedirect Access protocol forced redirect configuration. This is disabled by default.
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Referer blacklist/whitelist configuration. This is disabled by default. 
     * @return Referer Referer blacklist/whitelist configuration. This is disabled by default.
     */
    public Referer getReferer() {
        return this.Referer;
    }

    /**
     * Set Referer blacklist/whitelist configuration. This is disabled by default.
     * @param Referer Referer blacklist/whitelist configuration. This is disabled by default.
     */
    public void setReferer(Referer Referer) {
        this.Referer = Referer;
    }

    /**
     * Get Browser cache rule configuration, which is used to set the default value of MaxAge and is disabled by default. 
     * @return MaxAge Browser cache rule configuration, which is used to set the default value of MaxAge and is disabled by default.
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Browser cache rule configuration, which is used to set the default value of MaxAge and is disabled by default.
     * @param MaxAge Browser cache rule configuration, which is used to set the default value of MaxAge and is disabled by default.
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get IPv6 access configuration. 
     * @return Ipv6Access IPv6 access configuration.
     */
    public Ipv6Access getIpv6Access() {
        return this.Ipv6Access;
    }

    /**
     * Set IPv6 access configuration.
     * @param Ipv6Access IPv6 access configuration.
     */
    public void setIpv6Access(Ipv6Access Ipv6Access) {
        this.Ipv6Access = Ipv6Access;
    }

    /**
     * Get QUIC configuration item. 
     * @return Quic QUIC configuration item.
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set QUIC configuration item.
     * @param Quic QUIC configuration item.
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Origin access authentication for S3 bucket. 
     * @return AwsPrivateAccess Origin access authentication for S3 bucket.
     */
    public AwsPrivateAccess getAwsPrivateAccess() {
        return this.AwsPrivateAccess;
    }

    /**
     * Set Origin access authentication for S3 bucket.
     * @param AwsPrivateAccess Origin access authentication for S3 bucket.
     */
    public void setAwsPrivateAccess(AwsPrivateAccess AwsPrivateAccess) {
        this.AwsPrivateAccess = AwsPrivateAccess;
    }

    /**
     * Get Access authentication configuration for OSS origin. 
     * @return OssPrivateAccess Access authentication configuration for OSS origin.
     */
    public OssPrivateAccess getOssPrivateAccess() {
        return this.OssPrivateAccess;
    }

    /**
     * Set Access authentication configuration for OSS origin.
     * @param OssPrivateAccess Access authentication configuration for OSS origin.
     */
    public void setOssPrivateAccess(OssPrivateAccess OssPrivateAccess) {
        this.OssPrivateAccess = OssPrivateAccess;
    }

    /**
     * Get Access authentication for Huawei Cloud OBS origin 
     * @return HwPrivateAccess Access authentication for Huawei Cloud OBS origin
     */
    public HwPrivateAccess getHwPrivateAccess() {
        return this.HwPrivateAccess;
    }

    /**
     * Set Access authentication for Huawei Cloud OBS origin
     * @param HwPrivateAccess Access authentication for Huawei Cloud OBS origin
     */
    public void setHwPrivateAccess(HwPrivateAccess HwPrivateAccess) {
        this.HwPrivateAccess = HwPrivateAccess;
    }

    /**
     * Get Origin-pull authentication for other origins. 
     * @return OthersPrivateAccess Origin-pull authentication for other origins.
     */
    public OthersPrivateAccess getOthersPrivateAccess() {
        return this.OthersPrivateAccess;
    }

    /**
     * Set Origin-pull authentication for other origins.
     * @param OthersPrivateAccess Origin-pull authentication for other origins.
     */
    public void setOthersPrivateAccess(OthersPrivateAccess OthersPrivateAccess) {
        this.OthersPrivateAccess = OthersPrivateAccess;
    }

    public CDNDomainConfigForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDNDomainConfigForUpdate(CDNDomainConfigForUpdate source) {
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

