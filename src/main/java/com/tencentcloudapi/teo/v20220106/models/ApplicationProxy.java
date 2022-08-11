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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProxy extends AbstractModel{

    /**
    * ID of the proxy
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Name of the proxy:
Domain name or subdomain name when `ProxyType=hostname`
Instance name when `ProxyType=instance`
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Scheduling mode:
`ip`: Anycast IP
`domain`: CNAME
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * `0`: Disable security protection; `1`: Enable security protection.
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * `0`: Disable acceleration; `1`: Enable acceleration.
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * This field is moved to `Rule.ForwardClientIp`.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * This field is moved to `Rule.SessionPersist`.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * Rule list
    */
    @SerializedName("Rule")
    @Expose
    private ApplicationProxyRule [] Rule;

    /**
    * Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Scheduling information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleValue")
    @Expose
    private String [] ScheduleValue;

    /**
    * Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Site ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Session persistence duration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Specifies how a layer-4 proxy is created.
`hostname`: Create by subdomain name
`instance`: Create by instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * When `ProxyType=hostname`:
`ProxyName` indicates a specified domain name;
`HostId` indicates a unique ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
     * Get ID of the proxy
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ProxyId ID of the proxy
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set ID of the proxy
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ProxyId ID of the proxy
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Name of the proxy:
Domain name or subdomain name when `ProxyType=hostname`
Instance name when `ProxyType=instance` 
     * @return ProxyName Name of the proxy:
Domain name or subdomain name when `ProxyType=hostname`
Instance name when `ProxyType=instance`
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Name of the proxy:
Domain name or subdomain name when `ProxyType=hostname`
Instance name when `ProxyType=instance`
     * @param ProxyName Name of the proxy:
Domain name or subdomain name when `ProxyType=hostname`
Instance name when `ProxyType=instance`
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Scheduling mode:
`ip`: Anycast IP
`domain`: CNAME 
     * @return PlatType Scheduling mode:
`ip`: Anycast IP
`domain`: CNAME
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set Scheduling mode:
`ip`: Anycast IP
`domain`: CNAME
     * @param PlatType Scheduling mode:
`ip`: Anycast IP
`domain`: CNAME
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get `0`: Disable security protection; `1`: Enable security protection. 
     * @return SecurityType `0`: Disable security protection; `1`: Enable security protection.
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set `0`: Disable security protection; `1`: Enable security protection.
     * @param SecurityType `0`: Disable security protection; `1`: Enable security protection.
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get `0`: Disable acceleration; `1`: Enable acceleration. 
     * @return AccelerateType `0`: Disable acceleration; `1`: Enable acceleration.
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set `0`: Disable acceleration; `1`: Enable acceleration.
     * @param AccelerateType `0`: Disable acceleration; `1`: Enable acceleration.
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get This field is moved to `Rule.ForwardClientIp`. 
     * @return ForwardClientIp This field is moved to `Rule.ForwardClientIp`.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set This field is moved to `Rule.ForwardClientIp`.
     * @param ForwardClientIp This field is moved to `Rule.ForwardClientIp`.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get This field is moved to `Rule.SessionPersist`. 
     * @return SessionPersist This field is moved to `Rule.SessionPersist`.
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set This field is moved to `Rule.SessionPersist`.
     * @param SessionPersist This field is moved to `Rule.SessionPersist`.
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Rule list 
     * @return Rule Rule list
     */
    public ApplicationProxyRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set Rule list
     * @param Rule Rule list
     */
    public void setRule(ApplicationProxyRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Status Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Status Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Scheduling information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ScheduleValue Scheduling information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getScheduleValue() {
        return this.ScheduleValue;
    }

    /**
     * Set Scheduling information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ScheduleValue Scheduling information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setScheduleValue(String [] ScheduleValue) {
        this.ScheduleValue = ScheduleValue;
    }

    /**
     * Get Update time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Site ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ZoneId Site ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ZoneId Site ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ZoneName Site name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ZoneName Site name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Session persistence duration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SessionPersistTime Session persistence duration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session persistence duration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SessionPersistTime Session persistence duration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Specifies how a layer-4 proxy is created.
`hostname`: Create by subdomain name
`instance`: Create by instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyType Specifies how a layer-4 proxy is created.
`hostname`: Create by subdomain name
`instance`: Create by instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Specifies how a layer-4 proxy is created.
`hostname`: Create by subdomain name
`instance`: Create by instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyType Specifies how a layer-4 proxy is created.
`hostname`: Create by subdomain name
`instance`: Create by instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get When `ProxyType=hostname`:
`ProxyName` indicates a specified domain name;
`HostId` indicates a unique ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostId When `ProxyType=hostname`:
`ProxyName` indicates a specified domain name;
`HostId` indicates a unique ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set When `ProxyType=hostname`:
`ProxyName` indicates a specified domain name;
`HostId` indicates a unique ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostId When `ProxyType=hostname`:
`ProxyName` indicates a specified domain name;
`HostId` indicates a unique ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    public ApplicationProxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProxy(ApplicationProxy source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.PlatType != null) {
            this.PlatType = new String(source.PlatType);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new Long(source.AccelerateType);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.Rule != null) {
            this.Rule = new ApplicationProxyRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new ApplicationProxyRule(source.Rule[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScheduleValue != null) {
            this.ScheduleValue = new String[source.ScheduleValue.length];
            for (int i = 0; i < source.ScheduleValue.length; i++) {
                this.ScheduleValue[i] = new String(source.ScheduleValue[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ScheduleValue.", this.ScheduleValue);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "HostId", this.HostId);

    }
}

