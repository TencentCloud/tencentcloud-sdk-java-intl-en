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

public class ExceptUserRule extends AbstractModel{

    /**
    * The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * The rule action. It only supports the value `skip`, which indicates skipping all managed rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * The rule ID, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * The update time, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The matching condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptUserRuleConditions")
    @Expose
    private ExceptUserRuleCondition [] ExceptUserRuleConditions;

    /**
    * The scope to which the exception rule applies.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptUserRuleScope")
    @Expose
    private ExceptUserRuleScope ExceptUserRuleScope;

    /**
    * The rule priority. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get The rule name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get The rule action. It only supports the value `skip`, which indicates skipping all managed rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action The rule action. It only supports the value `skip`, which indicates skipping all managed rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The rule action. It only supports the value `skip`, which indicates skipping all managed rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action The rule action. It only supports the value `skip`, which indicates skipping all managed rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get The rule ID, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleID The rule ID, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set The rule ID, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleID The rule ID, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get The update time, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The update time, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The update time, which is only used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The matching condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptUserRuleConditions The matching condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExceptUserRuleCondition [] getExceptUserRuleConditions() {
        return this.ExceptUserRuleConditions;
    }

    /**
     * Set The matching condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptUserRuleConditions The matching condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptUserRuleConditions(ExceptUserRuleCondition [] ExceptUserRuleConditions) {
        this.ExceptUserRuleConditions = ExceptUserRuleConditions;
    }

    /**
     * Get The scope to which the exception rule applies.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptUserRuleScope The scope to which the exception rule applies.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExceptUserRuleScope getExceptUserRuleScope() {
        return this.ExceptUserRuleScope;
    }

    /**
     * Set The scope to which the exception rule applies.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptUserRuleScope The scope to which the exception rule applies.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptUserRuleScope(ExceptUserRuleScope ExceptUserRuleScope) {
        this.ExceptUserRuleScope = ExceptUserRuleScope;
    }

    /**
     * Get The rule priority. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RulePriority The rule priority. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set The rule priority. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RulePriority The rule priority. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public ExceptUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRule(ExceptUserRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExceptUserRuleConditions != null) {
            this.ExceptUserRuleConditions = new ExceptUserRuleCondition[source.ExceptUserRuleConditions.length];
            for (int i = 0; i < source.ExceptUserRuleConditions.length; i++) {
                this.ExceptUserRuleConditions[i] = new ExceptUserRuleCondition(source.ExceptUserRuleConditions[i]);
            }
        }
        if (source.ExceptUserRuleScope != null) {
            this.ExceptUserRuleScope = new ExceptUserRuleScope(source.ExceptUserRuleScope);
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ExceptUserRuleConditions.", this.ExceptUserRuleConditions);
        this.setParamObj(map, prefix + "ExceptUserRuleScope.", this.ExceptUserRuleScope);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

