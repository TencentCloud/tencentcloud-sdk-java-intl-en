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

public class CreatePolicyGroupRequest extends AbstractModel{

    /**
    * Policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Name of the view to which the policy group belongs. If the policy group is created based on a template, this parameter is optional.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * ID of the project to which the policy group belongs, which will be used for authentication.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * ID of a template-based policy group. This parameter is required only when the policy group is created based on a template.
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private Long ConditionTempGroupId;

    /**
    * Whether the policy group is shielded. The value 0 indicates that the policy group is not shielded. The value 1 indicates that the policy group is shielded. The default value is 0.
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * Remarks of the policy group.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Insertion time in the format of Unix timestamp. If this parameter is not configured, the backend processing time is used.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * Alarm threshold rules in the policy group.
    */
    @SerializedName("Conditions")
    @Expose
    private CreatePolicyGroupCondition [] Conditions;

    /**
    * Event alarm rules in the policy group.
    */
    @SerializedName("EventConditions")
    @Expose
    private CreatePolicyGroupEventCondition [] EventConditions;

    /**
    * Whether it is a backend call. If the value is 1, rules from the policy template will be used to fill in the `Conditions` and `EventConditions` fields.
    */
    @SerializedName("BackEndCall")
    @Expose
    private Long BackEndCall;

    /**
    * The “AND” and “OR” rules for alarm metrics. The value 0 indicates “OR”, which means that an alarm will be triggered when any rule is met. The value 1 indicates “AND”, which means that an alarm will be triggered only when all rules are met.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

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
     * Get Name of the view to which the policy group belongs. If the policy group is created based on a template, this parameter is optional. 
     * @return ViewName Name of the view to which the policy group belongs. If the policy group is created based on a template, this parameter is optional.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Name of the view to which the policy group belongs. If the policy group is created based on a template, this parameter is optional.
     * @param ViewName Name of the view to which the policy group belongs. If the policy group is created based on a template, this parameter is optional.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get ID of the project to which the policy group belongs, which will be used for authentication. 
     * @return ProjectId ID of the project to which the policy group belongs, which will be used for authentication.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the policy group belongs, which will be used for authentication.
     * @param ProjectId ID of the project to which the policy group belongs, which will be used for authentication.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get ID of a template-based policy group. This parameter is required only when the policy group is created based on a template. 
     * @return ConditionTempGroupId ID of a template-based policy group. This parameter is required only when the policy group is created based on a template.
     */
    public Long getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set ID of a template-based policy group. This parameter is required only when the policy group is created based on a template.
     * @param ConditionTempGroupId ID of a template-based policy group. This parameter is required only when the policy group is created based on a template.
     */
    public void setConditionTempGroupId(Long ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Get Whether the policy group is shielded. The value 0 indicates that the policy group is not shielded. The value 1 indicates that the policy group is shielded. The default value is 0. 
     * @return IsShielded Whether the policy group is shielded. The value 0 indicates that the policy group is not shielded. The value 1 indicates that the policy group is shielded. The default value is 0.
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set Whether the policy group is shielded. The value 0 indicates that the policy group is not shielded. The value 1 indicates that the policy group is shielded. The default value is 0.
     * @param IsShielded Whether the policy group is shielded. The value 0 indicates that the policy group is not shielded. The value 1 indicates that the policy group is shielded. The default value is 0.
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get Remarks of the policy group. 
     * @return Remark Remarks of the policy group.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks of the policy group.
     * @param Remark Remarks of the policy group.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Insertion time in the format of Unix timestamp. If this parameter is not configured, the backend processing time is used. 
     * @return InsertTime Insertion time in the format of Unix timestamp. If this parameter is not configured, the backend processing time is used.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Insertion time in the format of Unix timestamp. If this parameter is not configured, the backend processing time is used.
     * @param InsertTime Insertion time in the format of Unix timestamp. If this parameter is not configured, the backend processing time is used.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Alarm threshold rules in the policy group. 
     * @return Conditions Alarm threshold rules in the policy group.
     */
    public CreatePolicyGroupCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Alarm threshold rules in the policy group.
     * @param Conditions Alarm threshold rules in the policy group.
     */
    public void setConditions(CreatePolicyGroupCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Event alarm rules in the policy group. 
     * @return EventConditions Event alarm rules in the policy group.
     */
    public CreatePolicyGroupEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set Event alarm rules in the policy group.
     * @param EventConditions Event alarm rules in the policy group.
     */
    public void setEventConditions(CreatePolicyGroupEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get Whether it is a backend call. If the value is 1, rules from the policy template will be used to fill in the `Conditions` and `EventConditions` fields. 
     * @return BackEndCall Whether it is a backend call. If the value is 1, rules from the policy template will be used to fill in the `Conditions` and `EventConditions` fields.
     */
    public Long getBackEndCall() {
        return this.BackEndCall;
    }

    /**
     * Set Whether it is a backend call. If the value is 1, rules from the policy template will be used to fill in the `Conditions` and `EventConditions` fields.
     * @param BackEndCall Whether it is a backend call. If the value is 1, rules from the policy template will be used to fill in the `Conditions` and `EventConditions` fields.
     */
    public void setBackEndCall(Long BackEndCall) {
        this.BackEndCall = BackEndCall;
    }

    /**
     * Get The “AND” and “OR” rules for alarm metrics. The value 0 indicates “OR”, which means that an alarm will be triggered when any rule is met. The value 1 indicates “AND”, which means that an alarm will be triggered only when all rules are met. 
     * @return IsUnionRule The “AND” and “OR” rules for alarm metrics. The value 0 indicates “OR”, which means that an alarm will be triggered when any rule is met. The value 1 indicates “AND”, which means that an alarm will be triggered only when all rules are met.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set The “AND” and “OR” rules for alarm metrics. The value 0 indicates “OR”, which means that an alarm will be triggered when any rule is met. The value 1 indicates “AND”, which means that an alarm will be triggered only when all rules are met.
     * @param IsUnionRule The “AND” and “OR” rules for alarm metrics. The value 0 indicates “OR”, which means that an alarm will be triggered when any rule is met. The value 1 indicates “AND”, which means that an alarm will be triggered only when all rules are met.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);
        this.setParamSimple(map, prefix + "IsShielded", this.IsShielded);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamSimple(map, prefix + "BackEndCall", this.BackEndCall);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

