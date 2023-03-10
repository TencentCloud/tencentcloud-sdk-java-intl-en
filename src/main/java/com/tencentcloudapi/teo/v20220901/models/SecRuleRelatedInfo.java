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

public class SecRuleRelatedInfo extends AbstractModel{

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Risk level (only found in WAF logs). Values:
<li>`high risk`: High risk;</li>
<li>`middle risk`: Middle risk;</li>
<li>`low risk`: Low risk;</li>
<li>`unkonw`: Unknown.</li>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Rule level. Values:
<li>`normal`: Moderate.</li>
    */
    @SerializedName("RuleLevel")
    @Expose
    private String RuleLevel;

    /**
    * Rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The rule type.
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * The rule type. Values:
<li>`waf`: Tencent Cloud-managed rule</li>
<li>`acl`: Custom rule</li>
<li>`rate`: Rate limiting rule</li>
<li>`bot`: Bot rule</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Whether to enable the rule
    */
    @SerializedName("RuleEnabled")
    @Expose
    private Boolean RuleEnabled;

    /**
    * Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
    */
    @SerializedName("RuleDeleted")
    @Expose
    private Boolean RuleDeleted;

    /**
    * Whether to enable alerting for this rule
    */
    @SerializedName("AlarmEnabled")
    @Expose
    private Boolean AlarmEnabled;

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li> 
     * @return Action Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     * @param Action Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Risk level (only found in WAF logs). Values:
<li>`high risk`: High risk;</li>
<li>`middle risk`: Middle risk;</li>
<li>`low risk`: Low risk;</li>
<li>`unkonw`: Unknown.</li> 
     * @return RiskLevel Risk level (only found in WAF logs). Values:
<li>`high risk`: High risk;</li>
<li>`middle risk`: Middle risk;</li>
<li>`low risk`: Low risk;</li>
<li>`unkonw`: Unknown.</li>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level (only found in WAF logs). Values:
<li>`high risk`: High risk;</li>
<li>`middle risk`: Middle risk;</li>
<li>`low risk`: Low risk;</li>
<li>`unkonw`: Unknown.</li>
     * @param RiskLevel Risk level (only found in WAF logs). Values:
<li>`high risk`: High risk;</li>
<li>`middle risk`: Middle risk;</li>
<li>`low risk`: Low risk;</li>
<li>`unkonw`: Unknown.</li>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Rule level. Values:
<li>`normal`: Moderate.</li> 
     * @return RuleLevel Rule level. Values:
<li>`normal`: Moderate.</li>
     */
    public String getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set Rule level. Values:
<li>`normal`: Moderate.</li>
     * @param RuleLevel Rule level. Values:
<li>`normal`: Moderate.</li>
     */
    public void setRuleLevel(String RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get Rule description. 
     * @return Description Rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description.
     * @param Description Rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The rule type. 
     * @return RuleTypeName The rule type.
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set The rule type.
     * @param RuleTypeName The rule type.
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get The attack content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackContent The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackContent The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get The rule type. Values:
<li>`waf`: Tencent Cloud-managed rule</li>
<li>`acl`: Custom rule</li>
<li>`rate`: Rate limiting rule</li>
<li>`bot`: Bot rule</li> 
     * @return RuleType The rule type. Values:
<li>`waf`: Tencent Cloud-managed rule</li>
<li>`acl`: Custom rule</li>
<li>`rate`: Rate limiting rule</li>
<li>`bot`: Bot rule</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set The rule type. Values:
<li>`waf`: Tencent Cloud-managed rule</li>
<li>`acl`: Custom rule</li>
<li>`rate`: Rate limiting rule</li>
<li>`bot`: Bot rule</li>
     * @param RuleType The rule type. Values:
<li>`waf`: Tencent Cloud-managed rule</li>
<li>`acl`: Custom rule</li>
<li>`rate`: Rate limiting rule</li>
<li>`bot`: Bot rule</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Whether to enable the rule 
     * @return RuleEnabled Whether to enable the rule
     */
    public Boolean getRuleEnabled() {
        return this.RuleEnabled;
    }

    /**
     * Set Whether to enable the rule
     * @param RuleEnabled Whether to enable the rule
     */
    public void setRuleEnabled(Boolean RuleEnabled) {
        this.RuleEnabled = RuleEnabled;
    }

    /**
     * Get Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li> 
     * @return RuleDeleted Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     */
    public Boolean getRuleDeleted() {
        return this.RuleDeleted;
    }

    /**
     * Set Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     * @param RuleDeleted Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     */
    public void setRuleDeleted(Boolean RuleDeleted) {
        this.RuleDeleted = RuleDeleted;
    }

    /**
     * Get Whether to enable alerting for this rule 
     * @return AlarmEnabled Whether to enable alerting for this rule
     */
    public Boolean getAlarmEnabled() {
        return this.AlarmEnabled;
    }

    /**
     * Set Whether to enable alerting for this rule
     * @param AlarmEnabled Whether to enable alerting for this rule
     */
    public void setAlarmEnabled(Boolean AlarmEnabled) {
        this.AlarmEnabled = AlarmEnabled;
    }

    public SecRuleRelatedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecRuleRelatedInfo(SecRuleRelatedInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new String(source.RuleLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleEnabled != null) {
            this.RuleEnabled = new Boolean(source.RuleEnabled);
        }
        if (source.RuleDeleted != null) {
            this.RuleDeleted = new Boolean(source.RuleDeleted);
        }
        if (source.AlarmEnabled != null) {
            this.AlarmEnabled = new Boolean(source.AlarmEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleEnabled", this.RuleEnabled);
        this.setParamSimple(map, prefix + "RuleDeleted", this.RuleDeleted);
        this.setParamSimple(map, prefix + "AlarmEnabled", this.AlarmEnabled);

    }
}

