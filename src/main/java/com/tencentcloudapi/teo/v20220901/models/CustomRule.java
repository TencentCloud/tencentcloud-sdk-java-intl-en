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

public class CustomRule extends AbstractModel {

    /**
    * The custom rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The specific content of custom rules must comply with expression grammar. For detailed specifications, please refer to the product document (https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1).
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * The handling action of custom rules. The value range of SecurityAction.Name is as follows:<ul><li>Deny: blocking;</li><li>Monitor: observation;</li><li>ReturnCustomPage: use specified page to block;</li><li>Redirect: redirect to URL;</li><li>BlockIP: IP blocking;</li><li>JSChallenge: JavaScript challenge;</li><li>ManagedChallenge: managed challenge;</li><li>Allow: allowing.</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * Whether the custom rule is enabled. Valid values: <ul><li>on: enable</li><li>off: disable</li></ul>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * ID of the custom rule. Different rule configuration operations are supported by rule ID:<ul><li>Add a new rule: The ID is empty or the ID parameter is not specified.</li><li>Modify an existing rule: Specify the rule ID that needs to be updated or modified.</li><li>Delete an existing rule: Existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Type of custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, only supported in output parameters.</li></ul>Description: When RuleType is not specified, it defaults to `PreciseMatchRule`.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Priority of custom rules, ranging from 0 to 100, defaults to 0, and only supports exact matching rules (`PreciseMatchRule`).
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get The custom rule name. 
     * @return Name The custom rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The custom rule name.
     * @param Name The custom rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The specific content of custom rules must comply with expression grammar. For detailed specifications, please refer to the product document (https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1). 
     * @return Condition The specific content of custom rules must comply with expression grammar. For detailed specifications, please refer to the product document (https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1).
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set The specific content of custom rules must comply with expression grammar. For detailed specifications, please refer to the product document (https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1).
     * @param Condition The specific content of custom rules must comply with expression grammar. For detailed specifications, please refer to the product document (https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1).
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get The handling action of custom rules. The value range of SecurityAction.Name is as follows:<ul><li>Deny: blocking;</li><li>Monitor: observation;</li><li>ReturnCustomPage: use specified page to block;</li><li>Redirect: redirect to URL;</li><li>BlockIP: IP blocking;</li><li>JSChallenge: JavaScript challenge;</li><li>ManagedChallenge: managed challenge;</li><li>Allow: allowing.</li></ul> 
     * @return Action The handling action of custom rules. The value range of SecurityAction.Name is as follows:<ul><li>Deny: blocking;</li><li>Monitor: observation;</li><li>ReturnCustomPage: use specified page to block;</li><li>Redirect: redirect to URL;</li><li>BlockIP: IP blocking;</li><li>JSChallenge: JavaScript challenge;</li><li>ManagedChallenge: managed challenge;</li><li>Allow: allowing.</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set The handling action of custom rules. The value range of SecurityAction.Name is as follows:<ul><li>Deny: blocking;</li><li>Monitor: observation;</li><li>ReturnCustomPage: use specified page to block;</li><li>Redirect: redirect to URL;</li><li>BlockIP: IP blocking;</li><li>JSChallenge: JavaScript challenge;</li><li>ManagedChallenge: managed challenge;</li><li>Allow: allowing.</li></ul>
     * @param Action The handling action of custom rules. The value range of SecurityAction.Name is as follows:<ul><li>Deny: blocking;</li><li>Monitor: observation;</li><li>ReturnCustomPage: use specified page to block;</li><li>Redirect: redirect to URL;</li><li>BlockIP: IP blocking;</li><li>JSChallenge: JavaScript challenge;</li><li>ManagedChallenge: managed challenge;</li><li>Allow: allowing.</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get Whether the custom rule is enabled. Valid values: <ul><li>on: enable</li><li>off: disable</li></ul> 
     * @return Enabled Whether the custom rule is enabled. Valid values: <ul><li>on: enable</li><li>off: disable</li></ul>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the custom rule is enabled. Valid values: <ul><li>on: enable</li><li>off: disable</li></ul>
     * @param Enabled Whether the custom rule is enabled. Valid values: <ul><li>on: enable</li><li>off: disable</li></ul>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get ID of the custom rule. Different rule configuration operations are supported by rule ID:<ul><li>Add a new rule: The ID is empty or the ID parameter is not specified.</li><li>Modify an existing rule: Specify the rule ID that needs to be updated or modified.</li><li>Delete an existing rule: Existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul> 
     * @return Id ID of the custom rule. Different rule configuration operations are supported by rule ID:<ul><li>Add a new rule: The ID is empty or the ID parameter is not specified.</li><li>Modify an existing rule: Specify the rule ID that needs to be updated or modified.</li><li>Delete an existing rule: Existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID of the custom rule. Different rule configuration operations are supported by rule ID:<ul><li>Add a new rule: The ID is empty or the ID parameter is not specified.</li><li>Modify an existing rule: Specify the rule ID that needs to be updated or modified.</li><li>Delete an existing rule: Existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul>
     * @param Id ID of the custom rule. Different rule configuration operations are supported by rule ID:<ul><li>Add a new rule: The ID is empty or the ID parameter is not specified.</li><li>Modify an existing rule: Specify the rule ID that needs to be updated or modified.</li><li>Delete an existing rule: Existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Type of custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, only supported in output parameters.</li></ul>Description: When RuleType is not specified, it defaults to `PreciseMatchRule`. 
     * @return RuleType Type of custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, only supported in output parameters.</li></ul>Description: When RuleType is not specified, it defaults to `PreciseMatchRule`.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Type of custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, only supported in output parameters.</li></ul>Description: When RuleType is not specified, it defaults to `PreciseMatchRule`.
     * @param RuleType Type of custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, only supported in output parameters.</li></ul>Description: When RuleType is not specified, it defaults to `PreciseMatchRule`.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Priority of custom rules, ranging from 0 to 100, defaults to 0, and only supports exact matching rules (`PreciseMatchRule`). 
     * @return Priority Priority of custom rules, ranging from 0 to 100, defaults to 0, and only supports exact matching rules (`PreciseMatchRule`).
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of custom rules, ranging from 0 to 100, defaults to 0, and only supports exact matching rules (`PreciseMatchRule`).
     * @param Priority Priority of custom rules, ranging from 0 to 100, defaults to 0, and only supports exact matching rules (`PreciseMatchRule`).
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRule(CustomRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

