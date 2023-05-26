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

public class AlgDetectRule extends AbstractModel{

    /**
    * ID of the rule.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Name of the rule.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Whether to enable the rule.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Condition specified for the rule.
    */
    @SerializedName("AlgConditions")
    @Expose
    private AclCondition [] AlgConditions;

    /**
    * Validate Cookie when the condition is satisfied.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlgDetectSession")
    @Expose
    private AlgDetectSession AlgDetectSession;

    /**
    * Validate client behavior when the condition is satisfied.
    */
    @SerializedName("AlgDetectJS")
    @Expose
    private AlgDetectJS [] AlgDetectJS;

    /**
    * The update time, which is only used as an output parameter.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID of the rule. 
     * @return RuleID ID of the rule.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set ID of the rule.
     * @param RuleID ID of the rule.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Name of the rule. 
     * @return RuleName Name of the rule.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the rule.
     * @param RuleName Name of the rule.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Whether to enable the rule. 
     * @return Switch Whether to enable the rule.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the rule.
     * @param Switch Whether to enable the rule.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Condition specified for the rule. 
     * @return AlgConditions Condition specified for the rule.
     */
    public AclCondition [] getAlgConditions() {
        return this.AlgConditions;
    }

    /**
     * Set Condition specified for the rule.
     * @param AlgConditions Condition specified for the rule.
     */
    public void setAlgConditions(AclCondition [] AlgConditions) {
        this.AlgConditions = AlgConditions;
    }

    /**
     * Get Validate Cookie when the condition is satisfied.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AlgDetectSession Validate Cookie when the condition is satisfied.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AlgDetectSession getAlgDetectSession() {
        return this.AlgDetectSession;
    }

    /**
     * Set Validate Cookie when the condition is satisfied.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AlgDetectSession Validate Cookie when the condition is satisfied.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlgDetectSession(AlgDetectSession AlgDetectSession) {
        this.AlgDetectSession = AlgDetectSession;
    }

    /**
     * Get Validate client behavior when the condition is satisfied. 
     * @return AlgDetectJS Validate client behavior when the condition is satisfied.
     */
    public AlgDetectJS [] getAlgDetectJS() {
        return this.AlgDetectJS;
    }

    /**
     * Set Validate client behavior when the condition is satisfied.
     * @param AlgDetectJS Validate client behavior when the condition is satisfied.
     */
    public void setAlgDetectJS(AlgDetectJS [] AlgDetectJS) {
        this.AlgDetectJS = AlgDetectJS;
    }

    /**
     * Get The update time, which is only used as an output parameter. 
     * @return UpdateTime The update time, which is only used as an output parameter.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time, which is only used as an output parameter.
     * @param UpdateTime The update time, which is only used as an output parameter.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AlgDetectRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectRule(AlgDetectRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AlgConditions != null) {
            this.AlgConditions = new AclCondition[source.AlgConditions.length];
            for (int i = 0; i < source.AlgConditions.length; i++) {
                this.AlgConditions[i] = new AclCondition(source.AlgConditions[i]);
            }
        }
        if (source.AlgDetectSession != null) {
            this.AlgDetectSession = new AlgDetectSession(source.AlgDetectSession);
        }
        if (source.AlgDetectJS != null) {
            this.AlgDetectJS = new AlgDetectJS[source.AlgDetectJS.length];
            for (int i = 0; i < source.AlgDetectJS.length; i++) {
                this.AlgDetectJS[i] = new AlgDetectJS(source.AlgDetectJS[i]);
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
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "AlgConditions.", this.AlgConditions);
        this.setParamObj(map, prefix + "AlgDetectSession.", this.AlgDetectSession);
        this.setParamArrayObj(map, prefix + "AlgDetectJS.", this.AlgDetectJS);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

