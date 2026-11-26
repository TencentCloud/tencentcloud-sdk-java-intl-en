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

public class CreateApplicationProxyRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * When ProxyType=hostname, it indicates a domain name or subdomain.
When ProxyType=instance, it indicates the proxy name.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Scheduling mode. Valid values:
<li>`ip`: Anycast IP;</li>
<li>`domain`: CNAME.</li>
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * Whether security is enabled. Valid values:
<li>0: security off;</li>
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
    * Layer 4 proxy mode. Valid values: <li>instance: instance mode.</li>Use default value instance if not specified.
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * Session persistence duration. Value range: 30-3600. Unit: second.
If this field is not specified, the default value '600' will be used.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Ipv6 access configuration.
Not specified means disabling Ipv6 access.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Rule details.
If not specified, no rules are created.
    */
    @SerializedName("ApplicationProxyRules")
    @Expose
    private ApplicationProxyRule [] ApplicationProxyRules;

    /**
    * Acceleration optimization configuration for the Chinese mainland. Not specified means disabling acceleration optimization for the Chinese mainland.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Whether security is enabled. Valid values:
<li>0: security off;</li>
<li>1: Enable security.</li> 
     * @return SecurityType Whether security is enabled. Valid values:
<li>0: security off;</li>
<li>1: Enable security.</li>
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether security is enabled. Valid values:
<li>0: security off;</li>
<li>1: Enable security.</li>
     * @param SecurityType Whether security is enabled. Valid values:
<li>0: security off;</li>
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
     * Get Layer 4 proxy mode. Valid values: <li>instance: instance mode.</li>Use default value instance if not specified. 
     * @return ProxyType Layer 4 proxy mode. Valid values: <li>instance: instance mode.</li>Use default value instance if not specified.
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Layer 4 proxy mode. Valid values: <li>instance: instance mode.</li>Use default value instance if not specified.
     * @param ProxyType Layer 4 proxy mode. Valid values: <li>instance: instance mode.</li>Use default value instance if not specified.
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get Session persistence duration. Value range: 30-3600. Unit: second.
If this field is not specified, the default value '600' will be used. 
     * @return SessionPersistTime Session persistence duration. Value range: 30-3600. Unit: second.
If this field is not specified, the default value '600' will be used.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session persistence duration. Value range: 30-3600. Unit: second.
If this field is not specified, the default value '600' will be used.
     * @param SessionPersistTime Session persistence duration. Value range: 30-3600. Unit: second.
If this field is not specified, the default value '600' will be used.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Ipv6 access configuration.
Not specified means disabling Ipv6 access. 
     * @return Ipv6 Ipv6 access configuration.
Not specified means disabling Ipv6 access.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6 access configuration.
Not specified means disabling Ipv6 access.
     * @param Ipv6 Ipv6 access configuration.
Not specified means disabling Ipv6 access.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Rule details.
If not specified, no rules are created. 
     * @return ApplicationProxyRules Rule details.
If not specified, no rules are created.
     */
    public ApplicationProxyRule [] getApplicationProxyRules() {
        return this.ApplicationProxyRules;
    }

    /**
     * Set Rule details.
If not specified, no rules are created.
     * @param ApplicationProxyRules Rule details.
If not specified, no rules are created.
     */
    public void setApplicationProxyRules(ApplicationProxyRule [] ApplicationProxyRules) {
        this.ApplicationProxyRules = ApplicationProxyRules;
    }

    /**
     * Get Acceleration optimization configuration for the Chinese mainland. Not specified means disabling acceleration optimization for the Chinese mainland. 
     * @return AccelerateMainland Acceleration optimization configuration for the Chinese mainland. Not specified means disabling acceleration optimization for the Chinese mainland.
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Acceleration optimization configuration for the Chinese mainland. Not specified means disabling acceleration optimization for the Chinese mainland.
     * @param AccelerateMainland Acceleration optimization configuration for the Chinese mainland. Not specified means disabling acceleration optimization for the Chinese mainland.
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    public CreateApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationProxyRequest(CreateApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
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
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamArrayObj(map, prefix + "ApplicationProxyRules.", this.ApplicationProxyRules);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);

    }
}

