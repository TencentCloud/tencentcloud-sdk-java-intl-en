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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailHost extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The acceleration status. Values:
<li>`process`: In progress</li>
<li>`online`: Enabled</li>
<li>`offline`: Disabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Name of the site
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The assigned CNAME
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * The resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The lock status.
    */
    @SerializedName("Lock")
    @Expose
    private Long Lock;

    /**
    * The domain name status.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * The acceleration area of the domain name. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The acceleration type configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccelerateType")
    @Expose
    private AccelerateType AccelerateType;

    /**
    * The HTTPS configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * The cache configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * The origin configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * The security type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityType")
    @Expose
    private SecurityType SecurityType;

    /**
    * The cache key configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * The smart compression configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * The WAF protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Waf")
    @Expose
    private Waf Waf;

    /**
    * The CC protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CC")
    @Expose
    private CC CC;

    /**
    * DDoS mitigation configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoS")
    @Expose
    private DDoS DDoS;

    /**
    * The smart routing configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * The IPv6 access configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The acceleration status. Values:
<li>`process`: In progress</li>
<li>`online`: Enabled</li>
<li>`offline`: Disabled</li> 
     * @return Status The acceleration status. Values:
<li>`process`: In progress</li>
<li>`online`: Enabled</li>
<li>`offline`: Disabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The acceleration status. Values:
<li>`process`: In progress</li>
<li>`online`: Enabled</li>
<li>`offline`: Disabled</li>
     * @param Status The acceleration status. Values:
<li>`process`: In progress</li>
<li>`online`: Enabled</li>
<li>`offline`: Disabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The domain name. 
     * @return Host The domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The domain name.
     * @param Host The domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Name of the site 
     * @return ZoneName Name of the site
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the site
     * @param ZoneName Name of the site
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The assigned CNAME 
     * @return Cname The assigned CNAME
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set The assigned CNAME
     * @param Cname The assigned CNAME
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get The resource ID. 
     * @return Id The resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The resource ID.
     * @param Id The resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The instance ID. 
     * @return InstanceId The instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The instance ID.
     * @param InstanceId The instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The lock status. 
     * @return Lock The lock status.
     */
    public Long getLock() {
        return this.Lock;
    }

    /**
     * Set The lock status.
     * @param Lock The lock status.
     */
    public void setLock(Long Lock) {
        this.Lock = Lock;
    }

    /**
     * Get The domain name status. 
     * @return Mode The domain name status.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set The domain name status.
     * @param Mode The domain name status.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The acceleration area of the domain name. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li> 
     * @return Area The acceleration area of the domain name. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The acceleration area of the domain name. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     * @param Area The acceleration area of the domain name. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The acceleration type configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccelerateType The acceleration type configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccelerateType getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set The acceleration type configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccelerateType The acceleration type configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccelerateType(AccelerateType AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get The HTTPS configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Https The HTTPS configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set The HTTPS configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Https The HTTPS configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get The cache configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheConfig The cache configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set The cache configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheConfig The cache configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get The origin configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Origin The origin configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set The origin configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Origin The origin configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get The security type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityType The security type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecurityType getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set The security type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityType The security type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityType(SecurityType SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get The cache key configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheKey The cache key configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set The cache key configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheKey The cache key configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get The smart compression configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compression The smart compression configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set The smart compression configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compression The smart compression configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get The WAF protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Waf The WAF protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Waf getWaf() {
        return this.Waf;
    }

    /**
     * Set The WAF protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Waf The WAF protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWaf(Waf Waf) {
        this.Waf = Waf;
    }

    /**
     * Get The CC protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CC The CC protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CC getCC() {
        return this.CC;
    }

    /**
     * Set The CC protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CC The CC protection configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCC(CC CC) {
        this.CC = CC;
    }

    /**
     * Get DDoS mitigation configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoS DDoS mitigation configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoS getDDoS() {
        return this.DDoS;
    }

    /**
     * Set DDoS mitigation configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoS DDoS mitigation configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoS(DDoS DDoS) {
        this.DDoS = DDoS;
    }

    /**
     * Get The smart routing configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SmartRouting The smart routing configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set The smart routing configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SmartRouting The smart routing configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get The IPv6 access configuration item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6 The IPv6 access configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set The IPv6 access configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv6 The IPv6 access configuration item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClientIpCountry Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClientIpCountry Whether to carry the location information of the client IP during origin-pull.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    public DetailHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailHost(DetailHost source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Lock != null) {
            this.Lock = new Long(source.Lock);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new AccelerateType(source.AccelerateType);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new SecurityType(source.SecurityType);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.Waf != null) {
            this.Waf = new Waf(source.Waf);
        }
        if (source.CC != null) {
            this.CC = new CC(source.CC);
        }
        if (source.DDoS != null) {
            this.DDoS = new DDoS(source.DDoS);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.ClientIpCountry != null) {
            this.ClientIpCountry = new ClientIpCountry(source.ClientIpCountry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Lock", this.Lock);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "AccelerateType.", this.AccelerateType);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SecurityType.", this.SecurityType);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "CC.", this.CC);
        this.setParamObj(map, prefix + "DDoS.", this.DDoS);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "ClientIpCountry.", this.ClientIpCountry);

    }
}

