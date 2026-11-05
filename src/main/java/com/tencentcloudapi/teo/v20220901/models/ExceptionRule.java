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

public class ExceptionRule extends AbstractModel {

    /**
    * ID of the exception rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the Rules list in the ExceptionRules parameter will be deleted.</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name of the exception rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specific content of the exception rule must comply with the expression grammar. For detailed specifications, please refer to the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Exception rule execution options. Valid values: <li>WebSecurityModules: assigns the security protection module for the exception rule. Use in conjunction with WebSecurityModulesForException.</li><li>WebSecuritySubmodules: assigns the security protection submodule for the exception rule. Use in conjunction with WebSecuritySubmodulesForException.</li><li>ManagedRules: assigns the specific managed rule for the exception rule. Use in conjunction with ManagedRulesForException.</li><li>ManagedRuleGroups: assigns the managed rule group for the exception rule. Use in conjunction with ManagedRuleGroupsForException.</li>
    */
    @SerializedName("SkipScope")
    @Expose
    private String SkipScope;

    /**
    * Skip the specific type of request. Valid values: <li>SkipOnAllRequestFields: skip all requests;</li><li>SkipOnSpecifiedRequestFields: skip specified request fields.</li>Valid only when SkipScope is ManagedRules or ManagedRuleGroups.
    */
    @SerializedName("SkipOption")
    @Expose
    private String SkipOption;

    /**
    * Security protection module for the exception rule. Valid only when SkipScope is WebSecurityModules. Valid values: <li>websec-mod-managed-rules: managed rule</li><li>websec-mod-rate-limiting: rate limit</li><li>websec-mod-custom-rules: custom rule</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection</li><li>websec-mod-bot: bot management</li>
    */
    @SerializedName("WebSecurityModulesForException")
    @Expose
    private String [] WebSecurityModulesForException;

    /**
    * Specifies the security protection submodule for the exception rule. Valid only when SkipScope is WebSecuritySubmodules. Valid values: <ul><li>ManagedRules module features: <ul><li>websec-mod-managed-rules/managed-rule-groups: rule set;</li><li>websec-mod-managed-rules/frequent-scanning-protection: high frequency scan protection;</li></ul></li><li>RateLimitingRules module features: <ul><li>websec-mod-rate-limiting-rules: rate limiting rule;</li></ul></li><li>CustomRules module features: <ul><li>websec-mod-custom-rules: custom rule;</li></ul></li><li>HttpDDoSProtection module features: <ul><li>websec-mod-HTTP-DDoS-protection/adaptive-frequency-control: adaptive frequency control;</li><li>websec-mod-HTTP-DDoS-protection/client-filtering: intelligent client filtering;</li><li>websec-mod-HTTP-DDoS-protection/bandwidth-abuse-defense: traffic fraud protection;</li></ul></li><li>BotManagement module features: <ul><li>websec-mod-Bot-management/basic-feature: basic feature management;</li><li>websec-mod-Bot-management/ip-reputation: client profile analysis;</li><li>websec-mod-Bot-management/Bot-intelligence: intelligent Bot analysis;</li><li>websec-mod-Bot-management/custom-rules: custom rule;</li><li>websec-mod-Bot-management/browser-impersonation-detection: proactive feature recognition;</li><li>websec-mod-Bot-management/client-attestation-rules: client authentication;</li></ul></li><li>BotManagementLite module features: <ul><li>websec-mod-Bot-management-lite/ai-crawler-detection: ai crawler disposal;</li><li>websec-mod-Bot-management-lite/captcha-page-challenge: captcha page challenge.</li></ul></li></ul>
    */
    @SerializedName("WebSecuritySubmodulesForException")
    @Expose
    private String [] WebSecuritySubmodulesForException;

    /**
    * Specify the specific managed rule for the exception rule. This parameter is valid only when SkipScope is ManagedRules.
    */
    @SerializedName("ManagedRulesForException")
    @Expose
    private String [] ManagedRulesForException;

    /**
    * Managed rule group with specified exception rules. This parameter is valid only when SkipScope is ManagedRuleGroups.
    */
    @SerializedName("ManagedRuleGroupsForException")
    @Expose
    private String [] ManagedRuleGroupsForException;

    /**
    * Configuration for specifying exception rules to skip specified request fields. This is valid only when SkipScope is ManagedRules or ManagedRuleGroups and SkipOption is SkipOnSpecifiedRequestFields.
    */
    @SerializedName("RequestFieldsForException")
    @Expose
    private RequestFieldsForException [] RequestFieldsForException;

    /**
    * Whether the exception rule is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get ID of the exception rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the Rules list in the ExceptionRules parameter will be deleted.</li> 
     * @return Id ID of the exception rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the Rules list in the ExceptionRules parameter will be deleted.</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID of the exception rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the Rules list in the ExceptionRules parameter will be deleted.</li>
     * @param Id ID of the exception rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave the ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the Rules list in the ExceptionRules parameter will be deleted.</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Name of the exception rule. 
     * @return Name Name of the exception rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the exception rule.
     * @param Name Name of the exception rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specific content of the exception rule must comply with the expression grammar. For detailed specifications, please refer to the product document. 
     * @return Condition Specific content of the exception rule must comply with the expression grammar. For detailed specifications, please refer to the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Specific content of the exception rule must comply with the expression grammar. For detailed specifications, please refer to the product document.
     * @param Condition Specific content of the exception rule must comply with the expression grammar. For detailed specifications, please refer to the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Exception rule execution options. Valid values: <li>WebSecurityModules: assigns the security protection module for the exception rule. Use in conjunction with WebSecurityModulesForException.</li><li>WebSecuritySubmodules: assigns the security protection submodule for the exception rule. Use in conjunction with WebSecuritySubmodulesForException.</li><li>ManagedRules: assigns the specific managed rule for the exception rule. Use in conjunction with ManagedRulesForException.</li><li>ManagedRuleGroups: assigns the managed rule group for the exception rule. Use in conjunction with ManagedRuleGroupsForException.</li> 
     * @return SkipScope Exception rule execution options. Valid values: <li>WebSecurityModules: assigns the security protection module for the exception rule. Use in conjunction with WebSecurityModulesForException.</li><li>WebSecuritySubmodules: assigns the security protection submodule for the exception rule. Use in conjunction with WebSecuritySubmodulesForException.</li><li>ManagedRules: assigns the specific managed rule for the exception rule. Use in conjunction with ManagedRulesForException.</li><li>ManagedRuleGroups: assigns the managed rule group for the exception rule. Use in conjunction with ManagedRuleGroupsForException.</li>
     */
    public String getSkipScope() {
        return this.SkipScope;
    }

    /**
     * Set Exception rule execution options. Valid values: <li>WebSecurityModules: assigns the security protection module for the exception rule. Use in conjunction with WebSecurityModulesForException.</li><li>WebSecuritySubmodules: assigns the security protection submodule for the exception rule. Use in conjunction with WebSecuritySubmodulesForException.</li><li>ManagedRules: assigns the specific managed rule for the exception rule. Use in conjunction with ManagedRulesForException.</li><li>ManagedRuleGroups: assigns the managed rule group for the exception rule. Use in conjunction with ManagedRuleGroupsForException.</li>
     * @param SkipScope Exception rule execution options. Valid values: <li>WebSecurityModules: assigns the security protection module for the exception rule. Use in conjunction with WebSecurityModulesForException.</li><li>WebSecuritySubmodules: assigns the security protection submodule for the exception rule. Use in conjunction with WebSecuritySubmodulesForException.</li><li>ManagedRules: assigns the specific managed rule for the exception rule. Use in conjunction with ManagedRulesForException.</li><li>ManagedRuleGroups: assigns the managed rule group for the exception rule. Use in conjunction with ManagedRuleGroupsForException.</li>
     */
    public void setSkipScope(String SkipScope) {
        this.SkipScope = SkipScope;
    }

    /**
     * Get Skip the specific type of request. Valid values: <li>SkipOnAllRequestFields: skip all requests;</li><li>SkipOnSpecifiedRequestFields: skip specified request fields.</li>Valid only when SkipScope is ManagedRules or ManagedRuleGroups. 
     * @return SkipOption Skip the specific type of request. Valid values: <li>SkipOnAllRequestFields: skip all requests;</li><li>SkipOnSpecifiedRequestFields: skip specified request fields.</li>Valid only when SkipScope is ManagedRules or ManagedRuleGroups.
     */
    public String getSkipOption() {
        return this.SkipOption;
    }

    /**
     * Set Skip the specific type of request. Valid values: <li>SkipOnAllRequestFields: skip all requests;</li><li>SkipOnSpecifiedRequestFields: skip specified request fields.</li>Valid only when SkipScope is ManagedRules or ManagedRuleGroups.
     * @param SkipOption Skip the specific type of request. Valid values: <li>SkipOnAllRequestFields: skip all requests;</li><li>SkipOnSpecifiedRequestFields: skip specified request fields.</li>Valid only when SkipScope is ManagedRules or ManagedRuleGroups.
     */
    public void setSkipOption(String SkipOption) {
        this.SkipOption = SkipOption;
    }

    /**
     * Get Security protection module for the exception rule. Valid only when SkipScope is WebSecurityModules. Valid values: <li>websec-mod-managed-rules: managed rule</li><li>websec-mod-rate-limiting: rate limit</li><li>websec-mod-custom-rules: custom rule</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection</li><li>websec-mod-bot: bot management</li> 
     * @return WebSecurityModulesForException Security protection module for the exception rule. Valid only when SkipScope is WebSecurityModules. Valid values: <li>websec-mod-managed-rules: managed rule</li><li>websec-mod-rate-limiting: rate limit</li><li>websec-mod-custom-rules: custom rule</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection</li><li>websec-mod-bot: bot management</li>
     */
    public String [] getWebSecurityModulesForException() {
        return this.WebSecurityModulesForException;
    }

    /**
     * Set Security protection module for the exception rule. Valid only when SkipScope is WebSecurityModules. Valid values: <li>websec-mod-managed-rules: managed rule</li><li>websec-mod-rate-limiting: rate limit</li><li>websec-mod-custom-rules: custom rule</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection</li><li>websec-mod-bot: bot management</li>
     * @param WebSecurityModulesForException Security protection module for the exception rule. Valid only when SkipScope is WebSecurityModules. Valid values: <li>websec-mod-managed-rules: managed rule</li><li>websec-mod-rate-limiting: rate limit</li><li>websec-mod-custom-rules: custom rule</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection</li><li>websec-mod-bot: bot management</li>
     */
    public void setWebSecurityModulesForException(String [] WebSecurityModulesForException) {
        this.WebSecurityModulesForException = WebSecurityModulesForException;
    }

    /**
     * Get Specifies the security protection submodule for the exception rule. Valid only when SkipScope is WebSecuritySubmodules. Valid values: <ul><li>ManagedRules module features: <ul><li>websec-mod-managed-rules/managed-rule-groups: rule set;</li><li>websec-mod-managed-rules/frequent-scanning-protection: high frequency scan protection;</li></ul></li><li>RateLimitingRules module features: <ul><li>websec-mod-rate-limiting-rules: rate limiting rule;</li></ul></li><li>CustomRules module features: <ul><li>websec-mod-custom-rules: custom rule;</li></ul></li><li>HttpDDoSProtection module features: <ul><li>websec-mod-HTTP-DDoS-protection/adaptive-frequency-control: adaptive frequency control;</li><li>websec-mod-HTTP-DDoS-protection/client-filtering: intelligent client filtering;</li><li>websec-mod-HTTP-DDoS-protection/bandwidth-abuse-defense: traffic fraud protection;</li></ul></li><li>BotManagement module features: <ul><li>websec-mod-Bot-management/basic-feature: basic feature management;</li><li>websec-mod-Bot-management/ip-reputation: client profile analysis;</li><li>websec-mod-Bot-management/Bot-intelligence: intelligent Bot analysis;</li><li>websec-mod-Bot-management/custom-rules: custom rule;</li><li>websec-mod-Bot-management/browser-impersonation-detection: proactive feature recognition;</li><li>websec-mod-Bot-management/client-attestation-rules: client authentication;</li></ul></li><li>BotManagementLite module features: <ul><li>websec-mod-Bot-management-lite/ai-crawler-detection: ai crawler disposal;</li><li>websec-mod-Bot-management-lite/captcha-page-challenge: captcha page challenge.</li></ul></li></ul> 
     * @return WebSecuritySubmodulesForException Specifies the security protection submodule for the exception rule. Valid only when SkipScope is WebSecuritySubmodules. Valid values: <ul><li>ManagedRules module features: <ul><li>websec-mod-managed-rules/managed-rule-groups: rule set;</li><li>websec-mod-managed-rules/frequent-scanning-protection: high frequency scan protection;</li></ul></li><li>RateLimitingRules module features: <ul><li>websec-mod-rate-limiting-rules: rate limiting rule;</li></ul></li><li>CustomRules module features: <ul><li>websec-mod-custom-rules: custom rule;</li></ul></li><li>HttpDDoSProtection module features: <ul><li>websec-mod-HTTP-DDoS-protection/adaptive-frequency-control: adaptive frequency control;</li><li>websec-mod-HTTP-DDoS-protection/client-filtering: intelligent client filtering;</li><li>websec-mod-HTTP-DDoS-protection/bandwidth-abuse-defense: traffic fraud protection;</li></ul></li><li>BotManagement module features: <ul><li>websec-mod-Bot-management/basic-feature: basic feature management;</li><li>websec-mod-Bot-management/ip-reputation: client profile analysis;</li><li>websec-mod-Bot-management/Bot-intelligence: intelligent Bot analysis;</li><li>websec-mod-Bot-management/custom-rules: custom rule;</li><li>websec-mod-Bot-management/browser-impersonation-detection: proactive feature recognition;</li><li>websec-mod-Bot-management/client-attestation-rules: client authentication;</li></ul></li><li>BotManagementLite module features: <ul><li>websec-mod-Bot-management-lite/ai-crawler-detection: ai crawler disposal;</li><li>websec-mod-Bot-management-lite/captcha-page-challenge: captcha page challenge.</li></ul></li></ul>
     */
    public String [] getWebSecuritySubmodulesForException() {
        return this.WebSecuritySubmodulesForException;
    }

    /**
     * Set Specifies the security protection submodule for the exception rule. Valid only when SkipScope is WebSecuritySubmodules. Valid values: <ul><li>ManagedRules module features: <ul><li>websec-mod-managed-rules/managed-rule-groups: rule set;</li><li>websec-mod-managed-rules/frequent-scanning-protection: high frequency scan protection;</li></ul></li><li>RateLimitingRules module features: <ul><li>websec-mod-rate-limiting-rules: rate limiting rule;</li></ul></li><li>CustomRules module features: <ul><li>websec-mod-custom-rules: custom rule;</li></ul></li><li>HttpDDoSProtection module features: <ul><li>websec-mod-HTTP-DDoS-protection/adaptive-frequency-control: adaptive frequency control;</li><li>websec-mod-HTTP-DDoS-protection/client-filtering: intelligent client filtering;</li><li>websec-mod-HTTP-DDoS-protection/bandwidth-abuse-defense: traffic fraud protection;</li></ul></li><li>BotManagement module features: <ul><li>websec-mod-Bot-management/basic-feature: basic feature management;</li><li>websec-mod-Bot-management/ip-reputation: client profile analysis;</li><li>websec-mod-Bot-management/Bot-intelligence: intelligent Bot analysis;</li><li>websec-mod-Bot-management/custom-rules: custom rule;</li><li>websec-mod-Bot-management/browser-impersonation-detection: proactive feature recognition;</li><li>websec-mod-Bot-management/client-attestation-rules: client authentication;</li></ul></li><li>BotManagementLite module features: <ul><li>websec-mod-Bot-management-lite/ai-crawler-detection: ai crawler disposal;</li><li>websec-mod-Bot-management-lite/captcha-page-challenge: captcha page challenge.</li></ul></li></ul>
     * @param WebSecuritySubmodulesForException Specifies the security protection submodule for the exception rule. Valid only when SkipScope is WebSecuritySubmodules. Valid values: <ul><li>ManagedRules module features: <ul><li>websec-mod-managed-rules/managed-rule-groups: rule set;</li><li>websec-mod-managed-rules/frequent-scanning-protection: high frequency scan protection;</li></ul></li><li>RateLimitingRules module features: <ul><li>websec-mod-rate-limiting-rules: rate limiting rule;</li></ul></li><li>CustomRules module features: <ul><li>websec-mod-custom-rules: custom rule;</li></ul></li><li>HttpDDoSProtection module features: <ul><li>websec-mod-HTTP-DDoS-protection/adaptive-frequency-control: adaptive frequency control;</li><li>websec-mod-HTTP-DDoS-protection/client-filtering: intelligent client filtering;</li><li>websec-mod-HTTP-DDoS-protection/bandwidth-abuse-defense: traffic fraud protection;</li></ul></li><li>BotManagement module features: <ul><li>websec-mod-Bot-management/basic-feature: basic feature management;</li><li>websec-mod-Bot-management/ip-reputation: client profile analysis;</li><li>websec-mod-Bot-management/Bot-intelligence: intelligent Bot analysis;</li><li>websec-mod-Bot-management/custom-rules: custom rule;</li><li>websec-mod-Bot-management/browser-impersonation-detection: proactive feature recognition;</li><li>websec-mod-Bot-management/client-attestation-rules: client authentication;</li></ul></li><li>BotManagementLite module features: <ul><li>websec-mod-Bot-management-lite/ai-crawler-detection: ai crawler disposal;</li><li>websec-mod-Bot-management-lite/captcha-page-challenge: captcha page challenge.</li></ul></li></ul>
     */
    public void setWebSecuritySubmodulesForException(String [] WebSecuritySubmodulesForException) {
        this.WebSecuritySubmodulesForException = WebSecuritySubmodulesForException;
    }

    /**
     * Get Specify the specific managed rule for the exception rule. This parameter is valid only when SkipScope is ManagedRules. 
     * @return ManagedRulesForException Specify the specific managed rule for the exception rule. This parameter is valid only when SkipScope is ManagedRules.
     */
    public String [] getManagedRulesForException() {
        return this.ManagedRulesForException;
    }

    /**
     * Set Specify the specific managed rule for the exception rule. This parameter is valid only when SkipScope is ManagedRules.
     * @param ManagedRulesForException Specify the specific managed rule for the exception rule. This parameter is valid only when SkipScope is ManagedRules.
     */
    public void setManagedRulesForException(String [] ManagedRulesForException) {
        this.ManagedRulesForException = ManagedRulesForException;
    }

    /**
     * Get Managed rule group with specified exception rules. This parameter is valid only when SkipScope is ManagedRuleGroups. 
     * @return ManagedRuleGroupsForException Managed rule group with specified exception rules. This parameter is valid only when SkipScope is ManagedRuleGroups.
     */
    public String [] getManagedRuleGroupsForException() {
        return this.ManagedRuleGroupsForException;
    }

    /**
     * Set Managed rule group with specified exception rules. This parameter is valid only when SkipScope is ManagedRuleGroups.
     * @param ManagedRuleGroupsForException Managed rule group with specified exception rules. This parameter is valid only when SkipScope is ManagedRuleGroups.
     */
    public void setManagedRuleGroupsForException(String [] ManagedRuleGroupsForException) {
        this.ManagedRuleGroupsForException = ManagedRuleGroupsForException;
    }

    /**
     * Get Configuration for specifying exception rules to skip specified request fields. This is valid only when SkipScope is ManagedRules or ManagedRuleGroups and SkipOption is SkipOnSpecifiedRequestFields. 
     * @return RequestFieldsForException Configuration for specifying exception rules to skip specified request fields. This is valid only when SkipScope is ManagedRules or ManagedRuleGroups and SkipOption is SkipOnSpecifiedRequestFields.
     */
    public RequestFieldsForException [] getRequestFieldsForException() {
        return this.RequestFieldsForException;
    }

    /**
     * Set Configuration for specifying exception rules to skip specified request fields. This is valid only when SkipScope is ManagedRules or ManagedRuleGroups and SkipOption is SkipOnSpecifiedRequestFields.
     * @param RequestFieldsForException Configuration for specifying exception rules to skip specified request fields. This is valid only when SkipScope is ManagedRules or ManagedRuleGroups and SkipOption is SkipOnSpecifiedRequestFields.
     */
    public void setRequestFieldsForException(RequestFieldsForException [] RequestFieldsForException) {
        this.RequestFieldsForException = RequestFieldsForException;
    }

    /**
     * Get Whether the exception rule is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li> 
     * @return Enabled Whether the exception rule is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the exception rule is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     * @param Enabled Whether the exception rule is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public ExceptionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionRule(ExceptionRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.SkipScope != null) {
            this.SkipScope = new String(source.SkipScope);
        }
        if (source.SkipOption != null) {
            this.SkipOption = new String(source.SkipOption);
        }
        if (source.WebSecurityModulesForException != null) {
            this.WebSecurityModulesForException = new String[source.WebSecurityModulesForException.length];
            for (int i = 0; i < source.WebSecurityModulesForException.length; i++) {
                this.WebSecurityModulesForException[i] = new String(source.WebSecurityModulesForException[i]);
            }
        }
        if (source.WebSecuritySubmodulesForException != null) {
            this.WebSecuritySubmodulesForException = new String[source.WebSecuritySubmodulesForException.length];
            for (int i = 0; i < source.WebSecuritySubmodulesForException.length; i++) {
                this.WebSecuritySubmodulesForException[i] = new String(source.WebSecuritySubmodulesForException[i]);
            }
        }
        if (source.ManagedRulesForException != null) {
            this.ManagedRulesForException = new String[source.ManagedRulesForException.length];
            for (int i = 0; i < source.ManagedRulesForException.length; i++) {
                this.ManagedRulesForException[i] = new String(source.ManagedRulesForException[i]);
            }
        }
        if (source.ManagedRuleGroupsForException != null) {
            this.ManagedRuleGroupsForException = new String[source.ManagedRuleGroupsForException.length];
            for (int i = 0; i < source.ManagedRuleGroupsForException.length; i++) {
                this.ManagedRuleGroupsForException[i] = new String(source.ManagedRuleGroupsForException[i]);
            }
        }
        if (source.RequestFieldsForException != null) {
            this.RequestFieldsForException = new RequestFieldsForException[source.RequestFieldsForException.length];
            for (int i = 0; i < source.RequestFieldsForException.length; i++) {
                this.RequestFieldsForException[i] = new RequestFieldsForException(source.RequestFieldsForException[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "SkipScope", this.SkipScope);
        this.setParamSimple(map, prefix + "SkipOption", this.SkipOption);
        this.setParamArraySimple(map, prefix + "WebSecurityModulesForException.", this.WebSecurityModulesForException);
        this.setParamArraySimple(map, prefix + "WebSecuritySubmodulesForException.", this.WebSecuritySubmodulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRulesForException.", this.ManagedRulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRuleGroupsForException.", this.ManagedRuleGroupsForException);
        this.setParamArrayObj(map, prefix + "RequestFieldsForException.", this.RequestFieldsForException);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

