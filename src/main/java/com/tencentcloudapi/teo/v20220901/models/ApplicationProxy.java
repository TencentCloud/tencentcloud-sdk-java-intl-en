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

public class ApplicationProxy extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Proxy ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * L4 proxy mode. Valid values:
<li>`hostname`: Create by subdomain name;</li>
<li>`instance`: Create by instance.</li>
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li>
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * Acceleration region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
Default value: overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether security is enabled. Valid values:
<li>0: Disable security;</li>
<li>1: Enable security.</li>
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * Whether to enable acceleration. Valid values:
<li>0: disable acceleration;</li>
<li>1: Enable acceleration.</li>
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * Session hold time, in seconds.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Status. Valid values:
<li>`online`: Enable;</li>
<li>`offline`: Disable;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Blocking status. Valid values:
<li>banned: blocked;</li>
<li>banning: Being banned;</li>
<li>recover: unblocked;</li>
<li>`recovering`: The name server is being unblocked.</li>
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * Scheduling information.
    */
    @SerializedName("ScheduleValue")
    @Expose
    private String [] ScheduleValue;

    /**
    * When ProxyType=hostname:
Indicates the unique ID of the proxy acceleration.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Ipv6 access configuration.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Rule list.
    */
    @SerializedName("ApplicationProxyRules")
    @Expose
    private ApplicationProxyRule [] ApplicationProxyRules;

    /**
    * Acceleration optimization configuration for the Chinese mainland.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

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
     * Get Proxy ID. 
     * @return ProxyId Proxy ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy ID.
     * @param ProxyId Proxy ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name. 
     * @return ProxyName When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name.
     * @param ProxyName When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get L4 proxy mode. Valid values:
<li>`hostname`: Create by subdomain name;</li>
<li>`instance`: Create by instance.</li> 
     * @return ProxyType L4 proxy mode. Valid values:
<li>`hostname`: Create by subdomain name;</li>
<li>`instance`: Create by instance.</li>
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set L4 proxy mode. Valid values:
<li>`hostname`: Create by subdomain name;</li>
<li>`instance`: Create by instance.</li>
     * @param ProxyType L4 proxy mode. Valid values:
<li>`hostname`: Create by subdomain name;</li>
<li>`instance`: Create by instance.</li>
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li> 
     * @return PlatType Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li>
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li>
     * @param PlatType Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li>
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get Acceleration region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
Default value: overseas 
     * @return Area Acceleration region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
Default value: overseas
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
Default value: overseas
     * @param Area Acceleration region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
Default value: overseas
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether security is enabled. Valid values:
<li>0: Disable security;</li>
<li>1: Enable security.</li> 
     * @return SecurityType Whether security is enabled. Valid values:
<li>0: Disable security;</li>
<li>1: Enable security.</li>
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether security is enabled. Valid values:
<li>0: Disable security;</li>
<li>1: Enable security.</li>
     * @param SecurityType Whether security is enabled. Valid values:
<li>0: Disable security;</li>
<li>1: Enable security.</li>
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Whether to enable acceleration. Valid values:
<li>0: disable acceleration;</li>
<li>1: Enable acceleration.</li> 
     * @return AccelerateType Whether to enable acceleration. Valid values:
<li>0: disable acceleration;</li>
<li>1: Enable acceleration.</li>
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Whether to enable acceleration. Valid values:
<li>0: disable acceleration;</li>
<li>1: Enable acceleration.</li>
     * @param AccelerateType Whether to enable acceleration. Valid values:
<li>0: disable acceleration;</li>
<li>1: Enable acceleration.</li>
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get Session hold time, in seconds. 
     * @return SessionPersistTime Session hold time, in seconds.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session hold time, in seconds.
     * @param SessionPersistTime Session hold time, in seconds.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Status. Valid values:
<li>`online`: Enable;</li>
<li>`offline`: Disable;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li> 
     * @return Status Status. Valid values:
<li>`online`: Enable;</li>
<li>`offline`: Disable;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values:
<li>`online`: Enable;</li>
<li>`offline`: Disable;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     * @param Status Status. Valid values:
<li>`online`: Enable;</li>
<li>`offline`: Disable;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Blocking status. Valid values:
<li>banned: blocked;</li>
<li>banning: Being banned;</li>
<li>recover: unblocked;</li>
<li>`recovering`: The name server is being unblocked.</li> 
     * @return BanStatus Blocking status. Valid values:
<li>banned: blocked;</li>
<li>banning: Being banned;</li>
<li>recover: unblocked;</li>
<li>`recovering`: The name server is being unblocked.</li>
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set Blocking status. Valid values:
<li>banned: blocked;</li>
<li>banning: Being banned;</li>
<li>recover: unblocked;</li>
<li>`recovering`: The name server is being unblocked.</li>
     * @param BanStatus Blocking status. Valid values:
<li>banned: blocked;</li>
<li>banning: Being banned;</li>
<li>recover: unblocked;</li>
<li>`recovering`: The name server is being unblocked.</li>
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get Scheduling information. 
     * @return ScheduleValue Scheduling information.
     */
    public String [] getScheduleValue() {
        return this.ScheduleValue;
    }

    /**
     * Set Scheduling information.
     * @param ScheduleValue Scheduling information.
     */
    public void setScheduleValue(String [] ScheduleValue) {
        this.ScheduleValue = ScheduleValue;
    }

    /**
     * Get When ProxyType=hostname:
Indicates the unique ID of the proxy acceleration. 
     * @return HostId When ProxyType=hostname:
Indicates the unique ID of the proxy acceleration.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set When ProxyType=hostname:
Indicates the unique ID of the proxy acceleration.
     * @param HostId When ProxyType=hostname:
Indicates the unique ID of the proxy acceleration.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Ipv6 access configuration. 
     * @return Ipv6 Ipv6 access configuration.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration.
     * @param Ipv6 Ipv6 access configuration.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Rule list. 
     * @return ApplicationProxyRules Rule list.
     */
    public ApplicationProxyRule [] getApplicationProxyRules() {
        return this.ApplicationProxyRules;
    }

    /**
     * Set Rule list.
     * @param ApplicationProxyRules Rule list.
     */
    public void setApplicationProxyRules(ApplicationProxyRule [] ApplicationProxyRules) {
        this.ApplicationProxyRules = ApplicationProxyRules;
    }

    /**
     * Get Acceleration optimization configuration for the Chinese mainland. 
     * @return AccelerateMainland Acceleration optimization configuration for the Chinese mainland.
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Acceleration optimization configuration for the Chinese mainland.
     * @param AccelerateMainland Acceleration optimization configuration for the Chinese mainland.
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    public ApplicationProxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProxy(ApplicationProxy source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.PlatType != null) {
            this.PlatType = new String(source.PlatType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new Long(source.AccelerateType);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new String(source.BanStatus);
        }
        if (source.ScheduleValue != null) {
            this.ScheduleValue = new String[source.ScheduleValue.length];
            for (int i = 0; i < source.ScheduleValue.length; i++) {
                this.ScheduleValue[i] = new String(source.ScheduleValue[i]);
            }
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ApplicationProxyRules != null) {
            this.ApplicationProxyRules = new ApplicationProxyRule[source.ApplicationProxyRules.length];
            for (int i = 0; i < source.ApplicationProxyRules.length; i++) {
                this.ApplicationProxyRules[i] = new ApplicationProxyRule(source.ApplicationProxyRules[i]);
            }
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamArraySimple(map, prefix + "ScheduleValue.", this.ScheduleValue);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ApplicationProxyRules.", this.ApplicationProxyRules);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);

    }
}

