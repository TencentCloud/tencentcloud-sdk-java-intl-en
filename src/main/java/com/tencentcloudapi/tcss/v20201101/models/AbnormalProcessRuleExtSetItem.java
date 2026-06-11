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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessRuleExtSetItem extends AbstractModel {

    /**
    * Sub-rule list of the user-defined policy. Has a value when IsDefault=false.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChildRules")
    @Expose
    private AbnormalProcessChildRuleInfo [] ChildRules;

    /**
    * Edit username
    */
    @SerializedName("EditUserName")
    @Expose
    private String EditUserName;

    /**
    * Policy enforcement image count
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * true: default policy, false: custom policy
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether the rule applies to all images. true indicates it takes effect on all images.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * true: Policy activation, false: Policy deactivation
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * Deduplicated list of ALL execution actions in the rule group. RULE_MODE_ALERT: Alert RULE_MODE_HOLDUP: Block
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleActions")
    @Expose
    private String [] RuleActions;

    /**
    * Policy ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Policy name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Sub-rule list of system policy. Has value when IsDefault=true.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemChildRules")
    @Expose
    private AbnormalProcessSystemChildRuleInfo [] SystemChildRules;

    /**
    * Policy update time. May be empty.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Sub-rule list of the user-defined policy. Has a value when IsDefault=false.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChildRules Sub-rule list of the user-defined policy. Has a value when IsDefault=false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AbnormalProcessChildRuleInfo [] getChildRules() {
        return this.ChildRules;
    }

    /**
     * Set Sub-rule list of the user-defined policy. Has a value when IsDefault=false.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChildRules Sub-rule list of the user-defined policy. Has a value when IsDefault=false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChildRules(AbnormalProcessChildRuleInfo [] ChildRules) {
        this.ChildRules = ChildRules;
    }

    /**
     * Get Edit username 
     * @return EditUserName Edit username
     */
    public String getEditUserName() {
        return this.EditUserName;
    }

    /**
     * Set Edit username
     * @param EditUserName Edit username
     */
    public void setEditUserName(String EditUserName) {
        this.EditUserName = EditUserName;
    }

    /**
     * Get Policy enforcement image count 
     * @return EffectImageCount Policy enforcement image count
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set Policy enforcement image count
     * @param EffectImageCount Policy enforcement image count
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get true: default policy, false: custom policy 
     * @return IsDefault true: default policy, false: custom policy
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set true: default policy, false: custom policy
     * @param IsDefault true: default policy, false: custom policy
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the rule applies to all images. true indicates it takes effect on all images. 
     * @return IsGlobal Whether the rule applies to all images. true indicates it takes effect on all images.
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule applies to all images. true indicates it takes effect on all images.
     * @param IsGlobal Whether the rule applies to all images. true indicates it takes effect on all images.
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get true: Policy activation, false: Policy deactivation 
     * @return IsEnable true: Policy activation, false: Policy deactivation
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set true: Policy activation, false: Policy deactivation
     * @param IsEnable true: Policy activation, false: Policy deactivation
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get Deduplicated list of ALL execution actions in the rule group. RULE_MODE_ALERT: Alert RULE_MODE_HOLDUP: Block
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleActions Deduplicated list of ALL execution actions in the rule group. RULE_MODE_ALERT: Alert RULE_MODE_HOLDUP: Block
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set Deduplicated list of ALL execution actions in the rule group. RULE_MODE_ALERT: Alert RULE_MODE_HOLDUP: Block
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleActions Deduplicated list of ALL execution actions in the rule group. RULE_MODE_ALERT: Alert RULE_MODE_HOLDUP: Block
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleActions(String [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get Policy ID 
     * @return RuleId Policy ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Policy ID
     * @param RuleId Policy ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Policy name 
     * @return RuleName Policy name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Policy name
     * @param RuleName Policy name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Sub-rule list of system policy. Has value when IsDefault=true.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemChildRules Sub-rule list of system policy. Has value when IsDefault=true.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AbnormalProcessSystemChildRuleInfo [] getSystemChildRules() {
        return this.SystemChildRules;
    }

    /**
     * Set Sub-rule list of system policy. Has value when IsDefault=true.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemChildRules Sub-rule list of system policy. Has value when IsDefault=true.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemChildRules(AbnormalProcessSystemChildRuleInfo [] SystemChildRules) {
        this.SystemChildRules = SystemChildRules;
    }

    /**
     * Get Policy update time. May be empty. 
     * @return UpdateTime Policy update time. May be empty.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Policy update time. May be empty.
     * @param UpdateTime Policy update time. May be empty.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AbnormalProcessRuleExtSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessRuleExtSetItem(AbnormalProcessRuleExtSetItem source) {
        if (source.ChildRules != null) {
            this.ChildRules = new AbnormalProcessChildRuleInfo[source.ChildRules.length];
            for (int i = 0; i < source.ChildRules.length; i++) {
                this.ChildRules[i] = new AbnormalProcessChildRuleInfo(source.ChildRules[i]);
            }
        }
        if (source.EditUserName != null) {
            this.EditUserName = new String(source.EditUserName);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new String[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new String(source.RuleActions[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SystemChildRules != null) {
            this.SystemChildRules = new AbnormalProcessSystemChildRuleInfo[source.SystemChildRules.length];
            for (int i = 0; i < source.SystemChildRules.length; i++) {
                this.SystemChildRules[i] = new AbnormalProcessSystemChildRuleInfo(source.SystemChildRules[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ChildRules.", this.ChildRules);
        this.setParamSimple(map, prefix + "EditUserName", this.EditUserName);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamArraySimple(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "SystemChildRules.", this.SystemChildRules);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

