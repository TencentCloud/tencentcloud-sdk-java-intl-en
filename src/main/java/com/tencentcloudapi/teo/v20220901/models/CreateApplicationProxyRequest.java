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

public class CreateApplicationProxyRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * When `ProxyType=hostname`, this field indicates a domain name or subdomain name.
When `ProxyType=instance`, it indicates a proxy instance.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * The scheduling mode. Values:
<li>`ip`: Schedule via Anycast IP.</li>
<li>`domain`: Schedule via CNAME.</li>
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * Whether to enable security protection. Values:
<li>`0`: Disable security protection.</li>
<li>`1`: Enable security protection.</li>
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * Whether to enable acceleration. Values:
<li>`0`: Disable acceleration.</li>
<li>`1`: Enable acceleration.</li>
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * The proxy type. Values:
<li>`hostname`: The proxy is created by subdomain name.</li>
<li>`instance`: The proxy is created by instance.</li>If not specified, this field uses the default value `instance`.
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * The session persistence duration. Value range: 30-3600 (in seconds).
If not specified, this field uses the default value 600.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * The IPv6 access configuration.
If this field is not specified, IPv6 access will be disabled.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * The rule details.
If this field is not specified, an application proxy rule will not be created.
    */
    @SerializedName("ApplicationProxyRules")
    @Expose
    private ApplicationProxyRule [] ApplicationProxyRules;

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
     * Get When `ProxyType=hostname`, this field indicates a domain name or subdomain name.
When `ProxyType=instance`, it indicates a proxy instance. 
     * @return ProxyName When `ProxyType=hostname`, this field indicates a domain name or subdomain name.
When `ProxyType=instance`, it indicates a proxy instance.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set When `ProxyType=hostname`, this field indicates a domain name or subdomain name.
When `ProxyType=instance`, it indicates a proxy instance.
     * @param ProxyName When `ProxyType=hostname`, this field indicates a domain name or subdomain name.
When `ProxyType=instance`, it indicates a proxy instance.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get The scheduling mode. Values:
<li>`ip`: Schedule via Anycast IP.</li>
<li>`domain`: Schedule via CNAME.</li> 
     * @return PlatType The scheduling mode. Values:
<li>`ip`: Schedule via Anycast IP.</li>
<li>`domain`: Schedule via CNAME.</li>
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set The scheduling mode. Values:
<li>`ip`: Schedule via Anycast IP.</li>
<li>`domain`: Schedule via CNAME.</li>
     * @param PlatType The scheduling mode. Values:
<li>`ip`: Schedule via Anycast IP.</li>
<li>`domain`: Schedule via CNAME.</li>
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get Whether to enable security protection. Values:
<li>`0`: Disable security protection.</li>
<li>`1`: Enable security protection.</li> 
     * @return SecurityType Whether to enable security protection. Values:
<li>`0`: Disable security protection.</li>
<li>`1`: Enable security protection.</li>
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether to enable security protection. Values:
<li>`0`: Disable security protection.</li>
<li>`1`: Enable security protection.</li>
     * @param SecurityType Whether to enable security protection. Values:
<li>`0`: Disable security protection.</li>
<li>`1`: Enable security protection.</li>
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get Whether to enable acceleration. Values:
<li>`0`: Disable acceleration.</li>
<li>`1`: Enable acceleration.</li> 
     * @return AccelerateType Whether to enable acceleration. Values:
<li>`0`: Disable acceleration.</li>
<li>`1`: Enable acceleration.</li>
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Whether to enable acceleration. Values:
<li>`0`: Disable acceleration.</li>
<li>`1`: Enable acceleration.</li>
     * @param AccelerateType Whether to enable acceleration. Values:
<li>`0`: Disable acceleration.</li>
<li>`1`: Enable acceleration.</li>
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get The proxy type. Values:
<li>`hostname`: The proxy is created by subdomain name.</li>
<li>`instance`: The proxy is created by instance.</li>If not specified, this field uses the default value `instance`. 
     * @return ProxyType The proxy type. Values:
<li>`hostname`: The proxy is created by subdomain name.</li>
<li>`instance`: The proxy is created by instance.</li>If not specified, this field uses the default value `instance`.
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set The proxy type. Values:
<li>`hostname`: The proxy is created by subdomain name.</li>
<li>`instance`: The proxy is created by instance.</li>If not specified, this field uses the default value `instance`.
     * @param ProxyType The proxy type. Values:
<li>`hostname`: The proxy is created by subdomain name.</li>
<li>`instance`: The proxy is created by instance.</li>If not specified, this field uses the default value `instance`.
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get The session persistence duration. Value range: 30-3600 (in seconds).
If not specified, this field uses the default value 600. 
     * @return SessionPersistTime The session persistence duration. Value range: 30-3600 (in seconds).
If not specified, this field uses the default value 600.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set The session persistence duration. Value range: 30-3600 (in seconds).
If not specified, this field uses the default value 600.
     * @param SessionPersistTime The session persistence duration. Value range: 30-3600 (in seconds).
If not specified, this field uses the default value 600.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get The IPv6 access configuration.
If this field is not specified, IPv6 access will be disabled. 
     * @return Ipv6 The IPv6 access configuration.
If this field is not specified, IPv6 access will be disabled.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set The IPv6 access configuration.
If this field is not specified, IPv6 access will be disabled.
     * @param Ipv6 The IPv6 access configuration.
If this field is not specified, IPv6 access will be disabled.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get The rule details.
If this field is not specified, an application proxy rule will not be created. 
     * @return ApplicationProxyRules The rule details.
If this field is not specified, an application proxy rule will not be created.
     */
    public ApplicationProxyRule [] getApplicationProxyRules() {
        return this.ApplicationProxyRules;
    }

    /**
     * Set The rule details.
If this field is not specified, an application proxy rule will not be created.
     * @param ApplicationProxyRules The rule details.
If this field is not specified, an application proxy rule will not be created.
     */
    public void setApplicationProxyRules(ApplicationProxyRule [] ApplicationProxyRules) {
        this.ApplicationProxyRules = ApplicationProxyRules;
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

    }
}

