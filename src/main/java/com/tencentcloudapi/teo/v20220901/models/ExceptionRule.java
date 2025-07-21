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
    * The ID of the exception rule. different rule configuration operations are supported by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list under the ExceptionRules parameter will be deleted.</li>.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The name of the exception rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Describes the specific content of the exception rule, which must comply with the expression grammar. for details, please refer to the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Exception rule execution options, valid values: <li>WebSecurityModules: designate the security protection module for the exception rule.</li> <li>ManagedRules: designate the managed rule.</li>.
    */
    @SerializedName("SkipScope")
    @Expose
    private String SkipScope;

    /**
    * Skip the specific type of request. valid values: <li>SkipOnAllRequestFields: skip all requests;</li> <li>SkipOnSpecifiedRequestFields: skip specified request fields.</li> valid only when SkipScope is ManagedRules.
    */
    @SerializedName("SkipOption")
    @Expose
    private String SkipOption;

    /**
    * Specifies the security protection module for exception rules. valid only when SkipScope is WebSecurityModules. valid values: <li>websec-mod-managed-rules: managed rule.</li><li>websec-mod-rate-limiting: rate limit.</li><li>websec-mod-custom-rules: custom rule.</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection.</li><li>websec-mod-bot: bot management.</li>.
    */
    @SerializedName("WebSecurityModulesForException")
    @Expose
    private String [] WebSecurityModulesForException;

    /**
    * Specifies the managed rule for the exception rule. valid only when SkipScope is ManagedRules. cannot specify ManagedRuleGroupsForException at this time.
    */
    @SerializedName("ManagedRulesForException")
    @Expose
    private String [] ManagedRulesForException;

    /**
    * A managed rule group with designated exception rules is valid only when SkipScope is ManagedRules, and at this point you cannot specify ManagedRulesForException.
    */
    @SerializedName("ManagedRuleGroupsForException")
    @Expose
    private String [] ManagedRuleGroupsForException;

    /**
    * Specify exception rules to skip request fields. valid only when SkipScope is ManagedRules and SkipOption is SkipOnSpecifiedRequestFields.
    */
    @SerializedName("RequestFieldsForException")
    @Expose
    private RequestFieldsForException [] RequestFieldsForException;

    /**
    * Whether the exception rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get The ID of the exception rule. different rule configuration operations are supported by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list under the ExceptionRules parameter will be deleted.</li>. 
     * @return Id The ID of the exception rule. different rule configuration operations are supported by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list under the ExceptionRules parameter will be deleted.</li>.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID of the exception rule. different rule configuration operations are supported by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list under the ExceptionRules parameter will be deleted.</li>.
     * @param Id The ID of the exception rule. different rule configuration operations are supported by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing Rules not included in the Rules list under the ExceptionRules parameter will be deleted.</li>.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The name of the exception rule. 
     * @return Name The name of the exception rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name of the exception rule.
     * @param Name The name of the exception rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Describes the specific content of the exception rule, which must comply with the expression grammar. for details, please refer to the product document. 
     * @return Condition Describes the specific content of the exception rule, which must comply with the expression grammar. for details, please refer to the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Describes the specific content of the exception rule, which must comply with the expression grammar. for details, please refer to the product document.
     * @param Condition Describes the specific content of the exception rule, which must comply with the expression grammar. for details, please refer to the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Exception rule execution options, valid values: <li>WebSecurityModules: designate the security protection module for the exception rule.</li> <li>ManagedRules: designate the managed rule.</li>. 
     * @return SkipScope Exception rule execution options, valid values: <li>WebSecurityModules: designate the security protection module for the exception rule.</li> <li>ManagedRules: designate the managed rule.</li>.
     */
    public String getSkipScope() {
        return this.SkipScope;
    }

    /**
     * Set Exception rule execution options, valid values: <li>WebSecurityModules: designate the security protection module for the exception rule.</li> <li>ManagedRules: designate the managed rule.</li>.
     * @param SkipScope Exception rule execution options, valid values: <li>WebSecurityModules: designate the security protection module for the exception rule.</li> <li>ManagedRules: designate the managed rule.</li>.
     */
    public void setSkipScope(String SkipScope) {
        this.SkipScope = SkipScope;
    }

    /**
     * Get Skip the specific type of request. valid values: <li>SkipOnAllRequestFields: skip all requests;</li> <li>SkipOnSpecifiedRequestFields: skip specified request fields.</li> valid only when SkipScope is ManagedRules. 
     * @return SkipOption Skip the specific type of request. valid values: <li>SkipOnAllRequestFields: skip all requests;</li> <li>SkipOnSpecifiedRequestFields: skip specified request fields.</li> valid only when SkipScope is ManagedRules.
     */
    public String getSkipOption() {
        return this.SkipOption;
    }

    /**
     * Set Skip the specific type of request. valid values: <li>SkipOnAllRequestFields: skip all requests;</li> <li>SkipOnSpecifiedRequestFields: skip specified request fields.</li> valid only when SkipScope is ManagedRules.
     * @param SkipOption Skip the specific type of request. valid values: <li>SkipOnAllRequestFields: skip all requests;</li> <li>SkipOnSpecifiedRequestFields: skip specified request fields.</li> valid only when SkipScope is ManagedRules.
     */
    public void setSkipOption(String SkipOption) {
        this.SkipOption = SkipOption;
    }

    /**
     * Get Specifies the security protection module for exception rules. valid only when SkipScope is WebSecurityModules. valid values: <li>websec-mod-managed-rules: managed rule.</li><li>websec-mod-rate-limiting: rate limit.</li><li>websec-mod-custom-rules: custom rule.</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection.</li><li>websec-mod-bot: bot management.</li>. 
     * @return WebSecurityModulesForException Specifies the security protection module for exception rules. valid only when SkipScope is WebSecurityModules. valid values: <li>websec-mod-managed-rules: managed rule.</li><li>websec-mod-rate-limiting: rate limit.</li><li>websec-mod-custom-rules: custom rule.</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection.</li><li>websec-mod-bot: bot management.</li>.
     */
    public String [] getWebSecurityModulesForException() {
        return this.WebSecurityModulesForException;
    }

    /**
     * Set Specifies the security protection module for exception rules. valid only when SkipScope is WebSecurityModules. valid values: <li>websec-mod-managed-rules: managed rule.</li><li>websec-mod-rate-limiting: rate limit.</li><li>websec-mod-custom-rules: custom rule.</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection.</li><li>websec-mod-bot: bot management.</li>.
     * @param WebSecurityModulesForException Specifies the security protection module for exception rules. valid only when SkipScope is WebSecurityModules. valid values: <li>websec-mod-managed-rules: managed rule.</li><li>websec-mod-rate-limiting: rate limit.</li><li>websec-mod-custom-rules: custom rule.</li><li>websec-mod-adaptive-control: adaptive frequency control, intelligent client filtering, slow attack protection, traffic theft protection.</li><li>websec-mod-bot: bot management.</li>.
     */
    public void setWebSecurityModulesForException(String [] WebSecurityModulesForException) {
        this.WebSecurityModulesForException = WebSecurityModulesForException;
    }

    /**
     * Get Specifies the managed rule for the exception rule. valid only when SkipScope is ManagedRules. cannot specify ManagedRuleGroupsForException at this time. 
     * @return ManagedRulesForException Specifies the managed rule for the exception rule. valid only when SkipScope is ManagedRules. cannot specify ManagedRuleGroupsForException at this time.
     */
    public String [] getManagedRulesForException() {
        return this.ManagedRulesForException;
    }

    /**
     * Set Specifies the managed rule for the exception rule. valid only when SkipScope is ManagedRules. cannot specify ManagedRuleGroupsForException at this time.
     * @param ManagedRulesForException Specifies the managed rule for the exception rule. valid only when SkipScope is ManagedRules. cannot specify ManagedRuleGroupsForException at this time.
     */
    public void setManagedRulesForException(String [] ManagedRulesForException) {
        this.ManagedRulesForException = ManagedRulesForException;
    }

    /**
     * Get A managed rule group with designated exception rules is valid only when SkipScope is ManagedRules, and at this point you cannot specify ManagedRulesForException. 
     * @return ManagedRuleGroupsForException A managed rule group with designated exception rules is valid only when SkipScope is ManagedRules, and at this point you cannot specify ManagedRulesForException.
     */
    public String [] getManagedRuleGroupsForException() {
        return this.ManagedRuleGroupsForException;
    }

    /**
     * Set A managed rule group with designated exception rules is valid only when SkipScope is ManagedRules, and at this point you cannot specify ManagedRulesForException.
     * @param ManagedRuleGroupsForException A managed rule group with designated exception rules is valid only when SkipScope is ManagedRules, and at this point you cannot specify ManagedRulesForException.
     */
    public void setManagedRuleGroupsForException(String [] ManagedRuleGroupsForException) {
        this.ManagedRuleGroupsForException = ManagedRuleGroupsForException;
    }

    /**
     * Get Specify exception rules to skip request fields. valid only when SkipScope is ManagedRules and SkipOption is SkipOnSpecifiedRequestFields. 
     * @return RequestFieldsForException Specify exception rules to skip request fields. valid only when SkipScope is ManagedRules and SkipOption is SkipOnSpecifiedRequestFields.
     */
    public RequestFieldsForException [] getRequestFieldsForException() {
        return this.RequestFieldsForException;
    }

    /**
     * Set Specify exception rules to skip request fields. valid only when SkipScope is ManagedRules and SkipOption is SkipOnSpecifiedRequestFields.
     * @param RequestFieldsForException Specify exception rules to skip request fields. valid only when SkipScope is ManagedRules and SkipOption is SkipOnSpecifiedRequestFields.
     */
    public void setRequestFieldsForException(RequestFieldsForException [] RequestFieldsForException) {
        this.RequestFieldsForException = RequestFieldsForException;
    }

    /**
     * Get Whether the exception rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>. 
     * @return Enabled Whether the exception rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the exception rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
     * @param Enabled Whether the exception rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
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
        this.setParamArraySimple(map, prefix + "ManagedRulesForException.", this.ManagedRulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRuleGroupsForException.", this.ManagedRuleGroupsForException);
        this.setParamArrayObj(map, prefix + "RequestFieldsForException.", this.RequestFieldsForException);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

