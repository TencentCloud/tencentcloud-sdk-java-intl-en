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

public class ModifySecurityPolicyRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Security policy configuration. <li>When the `CustomRule` in the `SecurityPolicy` parameter is set, the `AclConfg` and `IpTableConfg` in the `SecurityConfig` parameter will be ignored;</li> <li>when the `ManagedRule` in the `SecurityPolicy` parameter is set, the `WafConfig` in the `SecurityConfig` parameter will be ignored.</li> <li>For custom rules and managed rule policy configuration, using `SecurityPolicy` parameter to configure settings is recommended.</li>
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * Security policy configuration. The parameter is recommended to use for custom policies and managed rule configurations of web protection, it supports configuring security policies with expression grammar.	
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
    * `SecurityPolicy` type, the following parameter values can be used for query: <li>`ZoneDefaultPolicy`: used to specify a query for site-level policies;</li> <li>`Template`: used to specify a query for policy templates. the `TemplateId` parameter needs to be specified simultaneously;</li> <li>`Host`: used to specify a query for domain-level policies (note: when using `Host` to specify a domain name service policy, only domain name services or policy templates that have been applied domain-level policies are supported).</li>	
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Specify the domain name. When the `Entity` parameter value is set to `Host`, use the domain-level policy specified by this parameter to query the domain configuration. For example, use `www.example.com` to configure the domain-level policy for that domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Specify the policy template ID. Use this parameter to specify the ID of the policy Template to query the Template configuration when the `Entity` parameter value is set to `Template`.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

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
     * Get Security policy configuration. <li>When the `CustomRule` in the `SecurityPolicy` parameter is set, the `AclConfg` and `IpTableConfg` in the `SecurityConfig` parameter will be ignored;</li> <li>when the `ManagedRule` in the `SecurityPolicy` parameter is set, the `WafConfig` in the `SecurityConfig` parameter will be ignored.</li> <li>For custom rules and managed rule policy configuration, using `SecurityPolicy` parameter to configure settings is recommended.</li> 
     * @return SecurityConfig Security policy configuration. <li>When the `CustomRule` in the `SecurityPolicy` parameter is set, the `AclConfg` and `IpTableConfg` in the `SecurityConfig` parameter will be ignored;</li> <li>when the `ManagedRule` in the `SecurityPolicy` parameter is set, the `WafConfig` in the `SecurityConfig` parameter will be ignored.</li> <li>For custom rules and managed rule policy configuration, using `SecurityPolicy` parameter to configure settings is recommended.</li>
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set Security policy configuration. <li>When the `CustomRule` in the `SecurityPolicy` parameter is set, the `AclConfg` and `IpTableConfg` in the `SecurityConfig` parameter will be ignored;</li> <li>when the `ManagedRule` in the `SecurityPolicy` parameter is set, the `WafConfig` in the `SecurityConfig` parameter will be ignored.</li> <li>For custom rules and managed rule policy configuration, using `SecurityPolicy` parameter to configure settings is recommended.</li>
     * @param SecurityConfig Security policy configuration. <li>When the `CustomRule` in the `SecurityPolicy` parameter is set, the `AclConfg` and `IpTableConfg` in the `SecurityConfig` parameter will be ignored;</li> <li>when the `ManagedRule` in the `SecurityPolicy` parameter is set, the `WafConfig` in the `SecurityConfig` parameter will be ignored.</li> <li>For custom rules and managed rule policy configuration, using `SecurityPolicy` parameter to configure settings is recommended.</li>
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get Security policy configuration. The parameter is recommended to use for custom policies and managed rule configurations of web protection, it supports configuring security policies with expression grammar.	 
     * @return SecurityPolicy Security policy configuration. The parameter is recommended to use for custom policies and managed rule configurations of web protection, it supports configuring security policies with expression grammar.	
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Security policy configuration. The parameter is recommended to use for custom policies and managed rule configurations of web protection, it supports configuring security policies with expression grammar.	
     * @param SecurityPolicy Security policy configuration. The parameter is recommended to use for custom policies and managed rule configurations of web protection, it supports configuring security policies with expression grammar.	
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get `SecurityPolicy` type, the following parameter values can be used for query: <li>`ZoneDefaultPolicy`: used to specify a query for site-level policies;</li> <li>`Template`: used to specify a query for policy templates. the `TemplateId` parameter needs to be specified simultaneously;</li> <li>`Host`: used to specify a query for domain-level policies (note: when using `Host` to specify a domain name service policy, only domain name services or policy templates that have been applied domain-level policies are supported).</li>	 
     * @return Entity `SecurityPolicy` type, the following parameter values can be used for query: <li>`ZoneDefaultPolicy`: used to specify a query for site-level policies;</li> <li>`Template`: used to specify a query for policy templates. the `TemplateId` parameter needs to be specified simultaneously;</li> <li>`Host`: used to specify a query for domain-level policies (note: when using `Host` to specify a domain name service policy, only domain name services or policy templates that have been applied domain-level policies are supported).</li>	
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set `SecurityPolicy` type, the following parameter values can be used for query: <li>`ZoneDefaultPolicy`: used to specify a query for site-level policies;</li> <li>`Template`: used to specify a query for policy templates. the `TemplateId` parameter needs to be specified simultaneously;</li> <li>`Host`: used to specify a query for domain-level policies (note: when using `Host` to specify a domain name service policy, only domain name services or policy templates that have been applied domain-level policies are supported).</li>	
     * @param Entity `SecurityPolicy` type, the following parameter values can be used for query: <li>`ZoneDefaultPolicy`: used to specify a query for site-level policies;</li> <li>`Template`: used to specify a query for policy templates. the `TemplateId` parameter needs to be specified simultaneously;</li> <li>`Host`: used to specify a query for domain-level policies (note: when using `Host` to specify a domain name service policy, only domain name services or policy templates that have been applied domain-level policies are supported).</li>	
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Specify the domain name. When the `Entity` parameter value is set to `Host`, use the domain-level policy specified by this parameter to query the domain configuration. For example, use `www.example.com` to configure the domain-level policy for that domain name. 
     * @return Host Specify the domain name. When the `Entity` parameter value is set to `Host`, use the domain-level policy specified by this parameter to query the domain configuration. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Specify the domain name. When the `Entity` parameter value is set to `Host`, use the domain-level policy specified by this parameter to query the domain configuration. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     * @param Host Specify the domain name. When the `Entity` parameter value is set to `Host`, use the domain-level policy specified by this parameter to query the domain configuration. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Specify the policy template ID. Use this parameter to specify the ID of the policy Template to query the Template configuration when the `Entity` parameter value is set to `Template`. 
     * @return TemplateId Specify the policy template ID. Use this parameter to specify the ID of the policy Template to query the Template configuration when the `Entity` parameter value is set to `Template`.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specify the policy template ID. Use this parameter to specify the ID of the policy Template to query the Template configuration when the `Entity` parameter value is set to `Template`.
     * @param TemplateId Specify the policy template ID. Use this parameter to specify the ID of the policy Template to query the Template configuration when the `Entity` parameter value is set to `Template`.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy(source.SecurityPolicy);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

