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
    * Security policy configuration.<li>When ExceptionRules in the SecurityPolicy parameter is set, ExceptConfig in the SecurityConfig parameter will be ignored;</li><li>When CustomRules in the SecurityPolicy parameter is set, AclConfig and IpTableConfig in the SecurityConfig parameter will be ignored;</li><li>When HttpDDoSProtection and RateLimitingRules in the SecurityPolicy parameter are set, RateLimitConfig in the SecurityConfig parameter will be ignored;</li><li>When ManagedRule in the SecurityPolicy parameter is set, WafConfig in the SecurityConfig parameter will be ignored;</li><li>When BotManagement in the SecurityPolicy parameter is set, BotConfig in the SecurityConfig parameter will be ignored;</li><li>For exception rules, custom rules, rate limits, managed rules, and bot management policies, it is recommended to use the SecurityPolicy parameter for configuration.</li>
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * Security policy configuration. For Web exception rules, custom protection policies, rate rules, managed rules, and Bot management configuration, we recommend using expression syntax to configure security policies.
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
    * Security policy type. The following parameter values are available: <li>ZoneDefaultPolicy: used to specify a site-level policy;</li><li>Template: used to specify a policy template. You need to simultaneously specify the TemplateId parameter;</li><li>Host: used to specify a domain-level policy (Note: when using a domain name to specify a domain name service policy, only DNS that has already applied a domain-level policy or policy template is supported).</li>
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Specified domain name. When the value of the `Entity` parameter is `Host`, use this parameter to specify a domain-level policy. For example, use `www.example.com` to configure the domain-level policy for that domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID.
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
     * Get Security policy configuration.<li>When ExceptionRules in the SecurityPolicy parameter is set, ExceptConfig in the SecurityConfig parameter will be ignored;</li><li>When CustomRules in the SecurityPolicy parameter is set, AclConfig and IpTableConfig in the SecurityConfig parameter will be ignored;</li><li>When HttpDDoSProtection and RateLimitingRules in the SecurityPolicy parameter are set, RateLimitConfig in the SecurityConfig parameter will be ignored;</li><li>When ManagedRule in the SecurityPolicy parameter is set, WafConfig in the SecurityConfig parameter will be ignored;</li><li>When BotManagement in the SecurityPolicy parameter is set, BotConfig in the SecurityConfig parameter will be ignored;</li><li>For exception rules, custom rules, rate limits, managed rules, and bot management policies, it is recommended to use the SecurityPolicy parameter for configuration.</li> 
     * @return SecurityConfig Security policy configuration.<li>When ExceptionRules in the SecurityPolicy parameter is set, ExceptConfig in the SecurityConfig parameter will be ignored;</li><li>When CustomRules in the SecurityPolicy parameter is set, AclConfig and IpTableConfig in the SecurityConfig parameter will be ignored;</li><li>When HttpDDoSProtection and RateLimitingRules in the SecurityPolicy parameter are set, RateLimitConfig in the SecurityConfig parameter will be ignored;</li><li>When ManagedRule in the SecurityPolicy parameter is set, WafConfig in the SecurityConfig parameter will be ignored;</li><li>When BotManagement in the SecurityPolicy parameter is set, BotConfig in the SecurityConfig parameter will be ignored;</li><li>For exception rules, custom rules, rate limits, managed rules, and bot management policies, it is recommended to use the SecurityPolicy parameter for configuration.</li>
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set Security policy configuration.<li>When ExceptionRules in the SecurityPolicy parameter is set, ExceptConfig in the SecurityConfig parameter will be ignored;</li><li>When CustomRules in the SecurityPolicy parameter is set, AclConfig and IpTableConfig in the SecurityConfig parameter will be ignored;</li><li>When HttpDDoSProtection and RateLimitingRules in the SecurityPolicy parameter are set, RateLimitConfig in the SecurityConfig parameter will be ignored;</li><li>When ManagedRule in the SecurityPolicy parameter is set, WafConfig in the SecurityConfig parameter will be ignored;</li><li>When BotManagement in the SecurityPolicy parameter is set, BotConfig in the SecurityConfig parameter will be ignored;</li><li>For exception rules, custom rules, rate limits, managed rules, and bot management policies, it is recommended to use the SecurityPolicy parameter for configuration.</li>
     * @param SecurityConfig Security policy configuration.<li>When ExceptionRules in the SecurityPolicy parameter is set, ExceptConfig in the SecurityConfig parameter will be ignored;</li><li>When CustomRules in the SecurityPolicy parameter is set, AclConfig and IpTableConfig in the SecurityConfig parameter will be ignored;</li><li>When HttpDDoSProtection and RateLimitingRules in the SecurityPolicy parameter are set, RateLimitConfig in the SecurityConfig parameter will be ignored;</li><li>When ManagedRule in the SecurityPolicy parameter is set, WafConfig in the SecurityConfig parameter will be ignored;</li><li>When BotManagement in the SecurityPolicy parameter is set, BotConfig in the SecurityConfig parameter will be ignored;</li><li>For exception rules, custom rules, rate limits, managed rules, and bot management policies, it is recommended to use the SecurityPolicy parameter for configuration.</li>
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get Security policy configuration. For Web exception rules, custom protection policies, rate rules, managed rules, and Bot management configuration, we recommend using expression syntax to configure security policies. 
     * @return SecurityPolicy Security policy configuration. For Web exception rules, custom protection policies, rate rules, managed rules, and Bot management configuration, we recommend using expression syntax to configure security policies.
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Security policy configuration. For Web exception rules, custom protection policies, rate rules, managed rules, and Bot management configuration, we recommend using expression syntax to configure security policies.
     * @param SecurityPolicy Security policy configuration. For Web exception rules, custom protection policies, rate rules, managed rules, and Bot management configuration, we recommend using expression syntax to configure security policies.
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get Security policy type. The following parameter values are available: <li>ZoneDefaultPolicy: used to specify a site-level policy;</li><li>Template: used to specify a policy template. You need to simultaneously specify the TemplateId parameter;</li><li>Host: used to specify a domain-level policy (Note: when using a domain name to specify a domain name service policy, only DNS that has already applied a domain-level policy or policy template is supported).</li> 
     * @return Entity Security policy type. The following parameter values are available: <li>ZoneDefaultPolicy: used to specify a site-level policy;</li><li>Template: used to specify a policy template. You need to simultaneously specify the TemplateId parameter;</li><li>Host: used to specify a domain-level policy (Note: when using a domain name to specify a domain name service policy, only DNS that has already applied a domain-level policy or policy template is supported).</li>
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Security policy type. The following parameter values are available: <li>ZoneDefaultPolicy: used to specify a site-level policy;</li><li>Template: used to specify a policy template. You need to simultaneously specify the TemplateId parameter;</li><li>Host: used to specify a domain-level policy (Note: when using a domain name to specify a domain name service policy, only DNS that has already applied a domain-level policy or policy template is supported).</li>
     * @param Entity Security policy type. The following parameter values are available: <li>ZoneDefaultPolicy: used to specify a site-level policy;</li><li>Template: used to specify a policy template. You need to simultaneously specify the TemplateId parameter;</li><li>Host: used to specify a domain-level policy (Note: when using a domain name to specify a domain name service policy, only DNS that has already applied a domain-level policy or policy template is supported).</li>
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Specified domain name. When the value of the `Entity` parameter is `Host`, use this parameter to specify a domain-level policy. For example, use `www.example.com` to configure the domain-level policy for that domain name. 
     * @return Host Specified domain name. When the value of the `Entity` parameter is `Host`, use this parameter to specify a domain-level policy. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Specified domain name. When the value of the `Entity` parameter is `Host`, use this parameter to specify a domain-level policy. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     * @param Host Specified domain name. When the value of the `Entity` parameter is `Host`, use this parameter to specify a domain-level policy. For example, use `www.example.com` to configure the domain-level policy for that domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID. 
     * @return TemplateId Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID.
     * @param TemplateId Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID.
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

