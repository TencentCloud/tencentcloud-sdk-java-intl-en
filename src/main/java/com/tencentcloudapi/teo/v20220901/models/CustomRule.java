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
    * <p>Custom rule name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The specific content of a custom rule must comply with the expression syntax. For detailed specifications, refer to the <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>Handling action of the custom rule. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * <p>Whether the custom rule is enabled. Valid values: <ul><li>on: enabled;</li><li>off: disabled.</li></ul></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>ID of the custom rule. The rule ID supports different rule configuration operations: <ul><li>Add a new rule: leave the ID empty or do not specify the ID parameter;</li><li>Modify an existing rule: specify the rule ID that needs to be updated/modified;</li><li>Delete an existing rule: existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Type of the custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, supported only for output parameters.</li></ul>Note: If RuleType is not specified, it defaults to <code>PreciseMatchRule</code>.</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>Priority of custom rules. Value range: 0-100. Default value: 0. Only exact matching rules (<code>PreciseMatchRule</code>) are supported.</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>Custom rule name.</p> 
     * @return Name <p>Custom rule name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Custom rule name.</p>
     * @param Name <p>Custom rule name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The specific content of a custom rule must comply with the expression syntax. For detailed specifications, refer to the <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p> 
     * @return Condition <p>The specific content of a custom rule must comply with the expression syntax. For detailed specifications, refer to the <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>The specific content of a custom rule must comply with the expression syntax. For detailed specifications, refer to the <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     * @param Condition <p>The specific content of a custom rule must comply with the expression syntax. For detailed specifications, refer to the <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>Handling action of the custom rule. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul> 
     * @return Action <p>Handling action of the custom rule. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set <p>Handling action of the custom rule. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     * @param Action <p>Handling action of the custom rule. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Whether the custom rule is enabled. Valid values: <ul><li>on: enabled;</li><li>off: disabled.</li></ul></p> 
     * @return Enabled <p>Whether the custom rule is enabled. Valid values: <ul><li>on: enabled;</li><li>off: disabled.</li></ul></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether the custom rule is enabled. Valid values: <ul><li>on: enabled;</li><li>off: disabled.</li></ul></p>
     * @param Enabled <p>Whether the custom rule is enabled. Valid values: <ul><li>on: enabled;</li><li>off: disabled.</li></ul></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>ID of the custom rule. The rule ID supports different rule configuration operations: <ul><li>Add a new rule: leave the ID empty or do not specify the ID parameter;</li><li>Modify an existing rule: specify the rule ID that needs to be updated/modified;</li><li>Delete an existing rule: existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul></p> 
     * @return Id <p>ID of the custom rule. The rule ID supports different rule configuration operations: <ul><li>Add a new rule: leave the ID empty or do not specify the ID parameter;</li><li>Modify an existing rule: specify the rule ID that needs to be updated/modified;</li><li>Delete an existing rule: existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID of the custom rule. The rule ID supports different rule configuration operations: <ul><li>Add a new rule: leave the ID empty or do not specify the ID parameter;</li><li>Modify an existing rule: specify the rule ID that needs to be updated/modified;</li><li>Delete an existing rule: existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul></p>
     * @param Id <p>ID of the custom rule. The rule ID supports different rule configuration operations: <ul><li>Add a new rule: leave the ID empty or do not specify the ID parameter;</li><li>Modify an existing rule: specify the rule ID that needs to be updated/modified;</li><li>Delete an existing rule: existing rules not included in the Rules list in the CustomRules parameter will be deleted.</li></ul></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Type of the custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, supported only for output parameters.</li></ul>Note: If RuleType is not specified, it defaults to <code>PreciseMatchRule</code>.</p> 
     * @return RuleType <p>Type of the custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, supported only for output parameters.</li></ul>Note: If RuleType is not specified, it defaults to <code>PreciseMatchRule</code>.</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Type of the custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, supported only for output parameters.</li></ul>Note: If RuleType is not specified, it defaults to <code>PreciseMatchRule</code>.</p>
     * @param RuleType <p>Type of the custom rule. Valid values: <ul><li>BasicAccessRule: basic access control;</li><li>PreciseMatchRule: exact matching rule;</li><li>ManagedAccessRule: expert customized rule, supported only for output parameters.</li></ul>Note: If RuleType is not specified, it defaults to <code>PreciseMatchRule</code>.</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Priority of custom rules. Value range: 0-100. Default value: 0. Only exact matching rules (<code>PreciseMatchRule</code>) are supported.</p> 
     * @return Priority <p>Priority of custom rules. Value range: 0-100. Default value: 0. Only exact matching rules (<code>PreciseMatchRule</code>) are supported.</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Priority of custom rules. Value range: 0-100. Default value: 0. Only exact matching rules (<code>PreciseMatchRule</code>) are supported.</p>
     * @param Priority <p>Priority of custom rules. Value range: 0-100. Default value: 0. Only exact matching rules (<code>PreciseMatchRule</code>) are supported.</p>
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

