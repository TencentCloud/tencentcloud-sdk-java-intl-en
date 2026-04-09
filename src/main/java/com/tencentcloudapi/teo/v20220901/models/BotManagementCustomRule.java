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

public class BotManagementCustomRule extends AbstractModel {

    /**
    * The ID of a Bot custom rule. different rule configuration operations are supported by rule ID: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the BotManagementCustomRules parameter will be deleted.</li>.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the name of the Bot custom rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the custom Bot rule is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Priority of custom Bot rules. value range: 1–100. default value is 50.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Specifies the specific content of the Bot custom rule, which must comply with expression grammar. for detailed specifications, refer to the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * The handling method for Bot custom rules. valid values: <li>Monitor: observation;</li><li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li><li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li><li>Redirect: Redirect to URL.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityWeightedAction [] Action;

    /**
     * Get The ID of a Bot custom rule. different rule configuration operations are supported by rule ID: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the BotManagementCustomRules parameter will be deleted.</li>. 
     * @return Id The ID of a Bot custom rule. different rule configuration operations are supported by rule ID: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the BotManagementCustomRules parameter will be deleted.</li>.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID of a Bot custom rule. different rule configuration operations are supported by rule ID: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the BotManagementCustomRules parameter will be deleted.</li>.
     * @param Id The ID of a Bot custom rule. different rule configuration operations are supported by rule ID: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the BotManagementCustomRules parameter will be deleted.</li>.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the name of the Bot custom rule. 
     * @return Name Specifies the name of the Bot custom rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the name of the Bot custom rule.
     * @param Name Specifies the name of the Bot custom rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether the custom Bot rule is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>. 
     * @return Enabled Whether the custom Bot rule is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the custom Bot rule is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     * @param Enabled Whether the custom Bot rule is enabled. valid values: <li>on: enabled;</li><li>off: disabled.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Priority of custom Bot rules. value range: 1–100. default value is 50. 
     * @return Priority Priority of custom Bot rules. value range: 1–100. default value is 50.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of custom Bot rules. value range: 1–100. default value is 50.
     * @param Priority Priority of custom Bot rules. value range: 1–100. default value is 50.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Specifies the specific content of the Bot custom rule, which must comply with expression grammar. for detailed specifications, refer to the product document. 
     * @return Condition Specifies the specific content of the Bot custom rule, which must comply with expression grammar. for detailed specifications, refer to the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Specifies the specific content of the Bot custom rule, which must comply with expression grammar. for detailed specifications, refer to the product document.
     * @param Condition Specifies the specific content of the Bot custom rule, which must comply with expression grammar. for detailed specifications, refer to the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get The handling method for Bot custom rules. valid values: <li>Monitor: observation;</li><li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li><li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li><li>Redirect: Redirect to URL.</li>. 
     * @return Action The handling method for Bot custom rules. valid values: <li>Monitor: observation;</li><li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li><li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li><li>Redirect: Redirect to URL.</li>.
     */
    public SecurityWeightedAction [] getAction() {
        return this.Action;
    }

    /**
     * Set The handling method for Bot custom rules. valid values: <li>Monitor: observation;</li><li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li><li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li><li>Redirect: Redirect to URL.</li>.
     * @param Action The handling method for Bot custom rules. valid values: <li>Monitor: observation;</li><li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li><li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li><li>Redirect: Redirect to URL.</li>.
     */
    public void setAction(SecurityWeightedAction [] Action) {
        this.Action = Action;
    }

    public BotManagementCustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementCustomRule(BotManagementCustomRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityWeightedAction[source.Action.length];
            for (int i = 0; i < source.Action.length; i++) {
                this.Action[i] = new SecurityWeightedAction(source.Action[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "Action.", this.Action);

    }
}

