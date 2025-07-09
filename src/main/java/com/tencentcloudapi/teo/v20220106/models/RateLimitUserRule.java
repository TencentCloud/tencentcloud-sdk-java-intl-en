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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitUserRule extends AbstractModel {

    /**
    * Rate threshold
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Data collection time
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Name of the rule
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Action: `monitor` (Observe), `drop` (Block)
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Time it takes to perform the action
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * Time unit: second
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * Status of the rule
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * Rule
    */
    @SerializedName("Conditions")
    @Expose
    private ACLCondition [] Conditions;

    /**
    * Priority of the rule
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Word filter
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Rate threshold 
     * @return Threshold Rate threshold
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Rate threshold
     * @param Threshold Rate threshold
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Data collection time 
     * @return Period Data collection time
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Data collection time
     * @param Period Data collection time
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Name of the rule 
     * @return RuleName Name of the rule
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the rule
     * @param RuleName Name of the rule
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Action: `monitor` (Observe), `drop` (Block) 
     * @return Action Action: `monitor` (Observe), `drop` (Block)
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action: `monitor` (Observe), `drop` (Block)
     * @param Action Action: `monitor` (Observe), `drop` (Block)
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Time it takes to perform the action 
     * @return PunishTime Time it takes to perform the action
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set Time it takes to perform the action
     * @param PunishTime Time it takes to perform the action
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get Time unit: second 
     * @return PunishTimeUnit Time unit: second
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set Time unit: second
     * @param PunishTimeUnit Time unit: second
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get Status of the rule 
     * @return RuleStatus Status of the rule
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Status of the rule
     * @param RuleStatus Status of the rule
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Rule 
     * @return Conditions Rule
     */
    public ACLCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Rule
     * @param Conditions Rule
     */
    public void setConditions(ACLCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Priority of the rule 
     * @return RulePriority Priority of the rule
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Priority of the rule
     * @param RulePriority Priority of the rule
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleID ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleID ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Word filter
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FreqFields Word filter
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set Word filter
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FreqFields Word filter
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
    }

    /**
     * Get Update time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Update time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RateLimitUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitUserRule(RateLimitUserRule source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.Conditions != null) {
            this.Conditions = new ACLCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ACLCondition(source.Conditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.FreqFields != null) {
            this.FreqFields = new String[source.FreqFields.length];
            for (int i = 0; i < source.FreqFields.length; i++) {
                this.FreqFields[i] = new String(source.FreqFields[i]);
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
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

