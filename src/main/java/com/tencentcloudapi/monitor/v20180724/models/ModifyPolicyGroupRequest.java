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

public class ModifyPolicyGroupRequest extends AbstractModel{

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Alarm type.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The 'AND' and 'OR' rules for metric alarms. The value 1 indicates 'AND', which means that an alarm will be triggered only when all rules are met. The value 0 indicates 'OR', which means that an alarm will be triggered when any rule is met.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * Metric alarm condition rules. No filling indicates that all existing metric alarm condition rules will be deleted.
    */
    @SerializedName("Conditions")
    @Expose
    private ModifyPolicyGroupCondition [] Conditions;

    /**
    * Event alarm conditions. No filling indicates that all existing event alarm conditions will be deleted.
    */
    @SerializedName("EventConditions")
    @Expose
    private ModifyPolicyGroupEventCondition [] EventConditions;

    /**
    * Template-based policy group ID.
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private Long ConditionTempGroupId;

    /**
     * Get The value is fixed to monitor. 
     * @return Module The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The value is fixed to monitor.
     * @param Module The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy group ID. 
     * @return GroupId Policy group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID.
     * @param GroupId Policy group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alarm type. 
     * @return ViewName Alarm type.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Alarm type.
     * @param ViewName Alarm type.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Policy group name. 
     * @return GroupName Policy group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Policy group name.
     * @param GroupName Policy group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The 'AND' and 'OR' rules for metric alarms. The value 1 indicates 'AND', which means that an alarm will be triggered only when all rules are met. The value 0 indicates 'OR', which means that an alarm will be triggered when any rule is met. 
     * @return IsUnionRule The 'AND' and 'OR' rules for metric alarms. The value 1 indicates 'AND', which means that an alarm will be triggered only when all rules are met. The value 0 indicates 'OR', which means that an alarm will be triggered when any rule is met.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set The 'AND' and 'OR' rules for metric alarms. The value 1 indicates 'AND', which means that an alarm will be triggered only when all rules are met. The value 0 indicates 'OR', which means that an alarm will be triggered when any rule is met.
     * @param IsUnionRule The 'AND' and 'OR' rules for metric alarms. The value 1 indicates 'AND', which means that an alarm will be triggered only when all rules are met. The value 0 indicates 'OR', which means that an alarm will be triggered when any rule is met.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get Metric alarm condition rules. No filling indicates that all existing metric alarm condition rules will be deleted. 
     * @return Conditions Metric alarm condition rules. No filling indicates that all existing metric alarm condition rules will be deleted.
     */
    public ModifyPolicyGroupCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Metric alarm condition rules. No filling indicates that all existing metric alarm condition rules will be deleted.
     * @param Conditions Metric alarm condition rules. No filling indicates that all existing metric alarm condition rules will be deleted.
     */
    public void setConditions(ModifyPolicyGroupCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Event alarm conditions. No filling indicates that all existing event alarm conditions will be deleted. 
     * @return EventConditions Event alarm conditions. No filling indicates that all existing event alarm conditions will be deleted.
     */
    public ModifyPolicyGroupEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set Event alarm conditions. No filling indicates that all existing event alarm conditions will be deleted.
     * @param EventConditions Event alarm conditions. No filling indicates that all existing event alarm conditions will be deleted.
     */
    public void setEventConditions(ModifyPolicyGroupEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get Template-based policy group ID. 
     * @return ConditionTempGroupId Template-based policy group ID.
     */
    public Long getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set Template-based policy group ID.
     * @param ConditionTempGroupId Template-based policy group ID.
     */
    public void setConditionTempGroupId(Long ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);

    }
}

