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

public class DetailHost extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration service status. Valid values:
<li> process: deploying;</li>
<li> online: started;</li>
<li>offline: closed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Assigned Cname domain name
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Lock status.
    */
    @SerializedName("Lock")
    @Expose
    private Long Lock;

    /**
    * Domain name status type.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Domain name acceleration area. Valid values:
<li> global: global;</li>
<li> mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Acceleration type configuration item.
    */
    @SerializedName("AccelerateType")
    @Expose
    private AccelerateType AccelerateType;

    /**
    * Https configuration item.
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * Cache configuration item.
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * Origin server configuration item.
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Security type.
    */
    @SerializedName("SecurityType")
    @Expose
    private SecurityType SecurityType;

    /**
    * Cache key configuration item.
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Intelligent compression configuration item.
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Waf protection configuration item.
    */
    @SerializedName("Waf")
    @Expose
    private Waf Waf;

    /**
    * CC protection configuration item.
    */
    @SerializedName("CC")
    @Expose
    private CC CC;

    /**
    * DDoS protection configuration.
    */
    @SerializedName("DDoS")
    @Expose
    private DDoS DDoS;

    /**
    * Intelligent routing configuration item.
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * Ipv6 access configuration item.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Configuration of whether to carry the region of the client IP during origin-pull.
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration service status. Valid values:
<li> process: deploying;</li>
<li> online: started;</li>
<li>offline: closed.</li> 
     * @return Status Acceleration service status. Valid values:
<li> process: deploying;</li>
<li> online: started;</li>
<li>offline: closed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Acceleration service status. Valid values:
<li> process: deploying;</li>
<li> online: started;</li>
<li>offline: closed.</li>
     * @param Status Acceleration service status. Valid values:
<li> process: deploying;</li>
<li> online: started;</li>
<li>offline: closed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name. 
     * @return Host Domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name.
     * @param Host Domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Site name. 
     * @return ZoneName Site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name.
     * @param ZoneName Site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Assigned Cname domain name 
     * @return Cname Assigned Cname domain name
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Assigned Cname domain name
     * @param Cname Assigned Cname domain name
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Resource ID. 
     * @return Id Resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID.
     * @param Id Resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Lock status. 
     * @return Lock Lock status.
     */
    public Long getLock() {
        return this.Lock;
    }

    /**
     * Set Lock status.
     * @param Lock Lock status.
     */
    public void setLock(Long Lock) {
        this.Lock = Lock;
    }

    /**
     * Get Domain name status type. 
     * @return Mode Domain name status type.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Domain name status type.
     * @param Mode Domain name status type.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Domain name acceleration area. Valid values:
<li> global: global;</li>
<li> mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li> 
     * @return Area Domain name acceleration area. Valid values:
<li> global: global;</li>
<li> mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration area. Valid values:
<li> global: global;</li>
<li> mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>
     * @param Area Domain name acceleration area. Valid values:
<li> global: global;</li>
<li> mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Acceleration type configuration item. 
     * @return AccelerateType Acceleration type configuration item.
     */
    public AccelerateType getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Acceleration type configuration item.
     * @param AccelerateType Acceleration type configuration item.
     */
    public void setAccelerateType(AccelerateType AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get Https configuration item. 
     * @return Https Https configuration item.
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https configuration item.
     * @param Https Https configuration item.
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get Cache configuration item. 
     * @return CacheConfig Cache configuration item.
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache configuration item.
     * @param CacheConfig Cache configuration item.
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get Origin server configuration item. 
     * @return Origin Origin server configuration item.
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration item.
     * @param Origin Origin server configuration item.
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Security type. 
     * @return SecurityType Security type.
     */
    public SecurityType getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Security type.
     * @param SecurityType Security type.
     */
    public void setSecurityType(SecurityType SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Cache key configuration item. 
     * @return CacheKey Cache key configuration item.
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set Cache key configuration item.
     * @param CacheKey Cache key configuration item.
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Intelligent compression configuration item. 
     * @return Compression Intelligent compression configuration item.
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set Intelligent compression configuration item.
     * @param Compression Intelligent compression configuration item.
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Waf protection configuration item. 
     * @return Waf Waf protection configuration item.
     */
    public Waf getWaf() {
        return this.Waf;
    }

    /**
     * Set Waf protection configuration item.
     * @param Waf Waf protection configuration item.
     */
    public void setWaf(Waf Waf) {
        this.Waf = Waf;
    }

    /**
     * Get CC protection configuration item. 
     * @return CC CC protection configuration item.
     */
    public CC getCC() {
        return this.CC;
    }

    /**
     * Set CC protection configuration item.
     * @param CC CC protection configuration item.
     */
    public void setCC(CC CC) {
        this.CC = CC;
    }

    /**
     * Get DDoS protection configuration. 
     * @return DDoS DDoS protection configuration.
     */
    public DDoS getDDoS() {
        return this.DDoS;
    }

    /**
     * Set DDoS protection configuration.
     * @param DDoS DDoS protection configuration.
     */
    public void setDDoS(DDoS DDoS) {
        this.DDoS = DDoS;
    }

    /**
     * Get Intelligent routing configuration item. 
     * @return SmartRouting Intelligent routing configuration item.
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set Intelligent routing configuration item.
     * @param SmartRouting Intelligent routing configuration item.
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get Ipv6 access configuration item. 
     * @return Ipv6 Ipv6 access configuration item.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration item.
     * @param Ipv6 Ipv6 access configuration item.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Configuration of whether to carry the region of the client IP during origin-pull. 
     * @return ClientIpCountry Configuration of whether to carry the region of the client IP during origin-pull.
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set Configuration of whether to carry the region of the client IP during origin-pull.
     * @param ClientIpCountry Configuration of whether to carry the region of the client IP during origin-pull.
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

