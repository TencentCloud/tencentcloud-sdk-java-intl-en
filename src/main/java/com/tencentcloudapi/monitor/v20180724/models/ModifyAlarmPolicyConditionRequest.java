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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmPolicyConditionRequest extends AbstractModel{

    /**
    * Module name, which is fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * ID of trigger condition template. This parameter can be left empty.
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private Long ConditionTemplateId;

    /**
    * Metric trigger condition
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * Event trigger condition
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
     * Get Module name, which is fixed at "monitor" 
     * @return Module Module name, which is fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name, which is fixed at "monitor"
     * @param Module Module name, which is fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Alarm policy ID 
     * @return PolicyId Alarm policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID
     * @param PolicyId Alarm policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get ID of trigger condition template. This parameter can be left empty. 
     * @return ConditionTemplateId ID of trigger condition template. This parameter can be left empty.
     */
    public Long getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set ID of trigger condition template. This parameter can be left empty.
     * @param ConditionTemplateId ID of trigger condition template. This parameter can be left empty.
     */
    public void setConditionTemplateId(Long ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get Metric trigger condition 
     * @return Condition Metric trigger condition
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set Metric trigger condition
     * @param Condition Metric trigger condition
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Event trigger condition 
     * @return EventCondition Event trigger condition
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set Event trigger condition
     * @param EventCondition Event trigger condition
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);

    }
}

