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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListGroup extends AbstractModel {

    /**
    * Policy group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Whether it is enabled.
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * Policy view name.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Uin that was last edited.
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * Last modified time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Creation time.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * Number of instances that are bound to the policy group.
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * Number of unshielded instances that are bound to the policy group.
    */
    @SerializedName("NoShieldedSum")
    @Expose
    private Long NoShieldedSum;

    /**
    * Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Whether the policy can be configured as the default policy.
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * Parent policy group ID.
    */
    @SerializedName("ParentGroupId")
    @Expose
    private Long ParentGroupId;

    /**
    * Remarks of the policy group.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * ID of the project to which the policy group belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Conditions")
    @Expose
    private DescribePolicyGroupInfoCondition [] Conditions;

    /**
    * Product event rule list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventConditions")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConditions;

    /**
    * Recipient list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * Instance group that is bound to the policy group.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceGroup")
    @Expose
    private DescribePolicyGroupListGroupInstanceGroup InstanceGroup;

    /**
    * The 'AND' or 'OR' rule. The value 0 indicates the 'OR' rule (indicating that an alarm will be triggered if any rule meets the threshold condition). The value 1 indicates the 'AND' rule (indicating that an alarm will be triggered when all rules meet the threshold conditions).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

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
     * Get Whether it is enabled. 
     * @return IsOpen Whether it is enabled.
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set Whether it is enabled.
     * @param IsOpen Whether it is enabled.
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get Policy view name. 
     * @return ViewName Policy view name.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Policy view name.
     * @param ViewName Policy view name.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Uin that was last edited. 
     * @return LastEditUin Uin that was last edited.
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set Uin that was last edited.
     * @param LastEditUin Uin that was last edited.
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get Last modified time. 
     * @return UpdateTime Last modified time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time.
     * @param UpdateTime Last modified time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time. 
     * @return InsertTime Creation time.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
     * @param InsertTime Creation time.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Number of instances that are bound to the policy group. 
     * @return UseSum Number of instances that are bound to the policy group.
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set Number of instances that are bound to the policy group.
     * @param UseSum Number of instances that are bound to the policy group.
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get Number of unshielded instances that are bound to the policy group. 
     * @return NoShieldedSum Number of unshielded instances that are bound to the policy group.
     */
    public Long getNoShieldedSum() {
        return this.NoShieldedSum;
    }

    /**
     * Set Number of unshielded instances that are bound to the policy group.
     * @param NoShieldedSum Number of unshielded instances that are bound to the policy group.
     */
    public void setNoShieldedSum(Long NoShieldedSum) {
        this.NoShieldedSum = NoShieldedSum;
    }

    /**
     * Get Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy. 
     * @return IsDefault Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     * @param IsDefault Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the policy can be configured as the default policy. 
     * @return CanSetDefault Whether the policy can be configured as the default policy.
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set Whether the policy can be configured as the default policy.
     * @param CanSetDefault Whether the policy can be configured as the default policy.
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get Parent policy group ID. 
     * @return ParentGroupId Parent policy group ID.
     */
    public Long getParentGroupId() {
        return this.ParentGroupId;
    }

    /**
     * Set Parent policy group ID.
     * @param ParentGroupId Parent policy group ID.
     */
    public void setParentGroupId(Long ParentGroupId) {
        this.ParentGroupId = ParentGroupId;
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
     * Get ID of the project to which the policy group belongs. 
     * @return ProjectId ID of the project to which the policy group belongs.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the policy group belongs.
     * @param ProjectId ID of the project to which the policy group belongs.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Threshold rule list.
Note: This field may return null, indicating that no valid value was found. 
     * @return Conditions Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     * @param Conditions Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setConditions(DescribePolicyGroupInfoCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Product event rule list.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventConditions Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     * @param EventConditions Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventConditions(DescribePolicyGroupInfoEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get Recipient list.
Note: This field may return null, indicating that no valid value was found. 
     * @return ReceiverInfos Recipient list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set Recipient list.
Note: This field may return null, indicating that no valid value was found.
     * @param ReceiverInfos Recipient list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get Template-based policy group.
Note: This field may return null, indicating that no valid value was found. 
     * @return ConditionsTemp Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     * @param ConditionsTemp Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get Instance group that is bound to the policy group.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceGroup Instance group that is bound to the policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupListGroupInstanceGroup getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set Instance group that is bound to the policy group.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceGroup Instance group that is bound to the policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceGroup(DescribePolicyGroupListGroupInstanceGroup InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Get The 'AND' or 'OR' rule. The value 0 indicates the 'OR' rule (indicating that an alarm will be triggered if any rule meets the threshold condition). The value 1 indicates the 'AND' rule (indicating that an alarm will be triggered when all rules meet the threshold conditions).
Note: This field may return null, indicating that no valid value was found. 
     * @return IsUnionRule The 'AND' or 'OR' rule. The value 0 indicates the 'OR' rule (indicating that an alarm will be triggered if any rule meets the threshold condition). The value 1 indicates the 'AND' rule (indicating that an alarm will be triggered when all rules meet the threshold conditions).
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set The 'AND' or 'OR' rule. The value 0 indicates the 'OR' rule (indicating that an alarm will be triggered if any rule meets the threshold condition). The value 1 indicates the 'AND' rule (indicating that an alarm will be triggered when all rules meet the threshold conditions).
Note: This field may return null, indicating that no valid value was found.
     * @param IsUnionRule The 'AND' or 'OR' rule. The value 0 indicates the 'OR' rule (indicating that an alarm will be triggered if any rule meets the threshold condition). The value 1 indicates the 'AND' rule (indicating that an alarm will be triggered when all rules meet the threshold conditions).
Note: This field may return null, indicating that no valid value was found.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    public DescribePolicyGroupListGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListGroup(DescribePolicyGroupListGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.UseSum != null) {
            this.UseSum = new Long(source.UseSum);
        }
        if (source.NoShieldedSum != null) {
            this.NoShieldedSum = new Long(source.NoShieldedSum);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
        }
        if (source.ParentGroupId != null) {
            this.ParentGroupId = new Long(source.ParentGroupId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Conditions != null) {
            this.Conditions = new DescribePolicyGroupInfoCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new DescribePolicyGroupInfoCondition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new DescribePolicyGroupInfoEventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new DescribePolicyGroupInfoEventCondition(source.EventConditions[i]);
            }
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new DescribePolicyGroupInfoReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new DescribePolicyGroupInfoReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new DescribePolicyGroupInfoConditionTpl(source.ConditionsTemp);
        }
        if (source.InstanceGroup != null) {
            this.InstanceGroup = new DescribePolicyGroupListGroupInstanceGroup(source.InstanceGroup);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UseSum", this.UseSum);
        this.setParamSimple(map, prefix + "NoShieldedSum", this.NoShieldedSum);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "ParentGroupId", this.ParentGroupId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

