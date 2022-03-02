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

public class AlarmPolicy extends AbstractModel{

    /**
    * Alarm policy ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Alarm policy name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Status. Valid values: 0 (disabled), 1 (enabled)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Number of instances bound to policy group
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UseSum")
    @Expose
    private Long UseSum;

    /**
    * Project ID. Valid values: -1 (no project), 0 (default project)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Alarm policy type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Trigger condition template ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private String ConditionTemplateId;

    /**
    * Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * Notification rule ID list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Notification rule list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Notices")
    @Expose
    private AlarmNotice [] Notices;

    /**
    * Triggered task list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * Template policy group
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private ConditionsTemp ConditionsTemp;

    /**
    * `Uin` of the last modifying user
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * Update time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * Region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * Namespace display name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceShowName")
    @Expose
    private String NamespaceShowName;

    /**
    * Whether it is the default policy. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Whether the default policy can be set. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Long CanSetDefault;

    /**
    * Instance group ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Total number of instances in instance group
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * Instance group name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceGroupName")
    @Expose
    private String InstanceGroupName;

    /**
    * Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Policy ID for instance/instance group binding and unbinding APIs (BindingPolicyObject, UnBindingAllPolicyObject, UnBindingPolicyObject)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * Tag
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TagInstances")
    @Expose
    private TagInstance [] TagInstances;

    /**
    * Information on the filter dimension associated with a policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterDimensionsParam")
    @Expose
    private String FilterDimensionsParam;

    /**
     * Get Alarm policy ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId Alarm policy ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PolicyId Alarm policy ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Alarm policy name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PolicyName Alarm policy name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Alarm policy name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PolicyName Alarm policy name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MonitorType Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MonitorType Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Status. Valid values: 0 (disabled), 1 (enabled)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Enable Status. Valid values: 0 (disabled), 1 (enabled)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Status. Valid values: 0 (disabled), 1 (enabled)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Enable Status. Valid values: 0 (disabled), 1 (enabled)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Number of instances bound to policy group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UseSum Number of instances bound to policy group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUseSum() {
        return this.UseSum;
    }

    /**
     * Set Number of instances bound to policy group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UseSum Number of instances bound to policy group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUseSum(Long UseSum) {
        this.UseSum = UseSum;
    }

    /**
     * Get Project ID. Valid values: -1 (no project), 0 (default project)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID. Valid values: -1 (no project), 0 (default project)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Valid values: -1 (no project), 0 (default project)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID. Valid values: -1 (no project), 0 (default project)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Alarm policy type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Alarm policy type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Alarm policy type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Namespace Alarm policy type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Trigger condition template ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConditionTemplateId Trigger condition template ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConditionTemplateId() {
        return this.ConditionTemplateId;
    }

    /**
     * Set Trigger condition template ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConditionTemplateId Trigger condition template ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionTemplateId(String ConditionTemplateId) {
        this.ConditionTemplateId = ConditionTemplateId;
    }

    /**
     * Get Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Condition Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Condition Metric trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EventCondition Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EventCondition Event trigger condition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get Notification rule ID list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NoticeIds Notification rule ID list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set Notification rule ID list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NoticeIds Notification rule ID list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Notification rule list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Notices Notification rule list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set Notification rule list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Notices Notification rule list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotices(AlarmNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get Triggered task list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TriggerTasks Triggered task list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set Triggered task list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TriggerTasks Triggered task list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get Template policy group
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConditionsTemp Template policy group
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConditionsTemp getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set Template policy group
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConditionsTemp Template policy group
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionsTemp(ConditionsTemp ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get `Uin` of the last modifying user
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastEditUin `Uin` of the last modifying user
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set `Uin` of the last modifying user
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastEditUin `Uin` of the last modifying user
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get Update time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InsertTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InsertTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get Namespace display name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceShowName Namespace display name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceShowName() {
        return this.NamespaceShowName;
    }

    /**
     * Set Namespace display name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceShowName Namespace display name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceShowName(String NamespaceShowName) {
        this.NamespaceShowName = NamespaceShowName;
    }

    /**
     * Get Whether it is the default policy. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDefault Whether it is the default policy. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default policy. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDefault Whether it is the default policy. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the default policy can be set. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CanSetDefault Whether the default policy can be set. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set Whether the default policy can be set. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CanSetDefault Whether the default policy can be set. Valid values: 1 (yes), 0 (no)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCanSetDefault(Long CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get Instance group ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceGroupId Instance group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceGroupId Instance group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Total number of instances in instance group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceSum Total number of instances in instance group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set Total number of instances in instance group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceSum Total number of instances in instance group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get Instance group name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceGroupName Instance group name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceGroupName() {
        return this.InstanceGroupName;
    }

    /**
     * Set Instance group name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceGroupName Instance group name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceGroupName(String InstanceGroupName) {
        this.InstanceGroupName = InstanceGroupName;
    }

    /**
     * Get Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RuleType Trigger condition type. Valid values: STATIC (static threshold), DYNAMIC (dynamic)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Policy ID for instance/instance group binding and unbinding APIs (BindingPolicyObject, UnBindingAllPolicyObject, UnBindingPolicyObject)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginId Policy ID for instance/instance group binding and unbinding APIs (BindingPolicyObject, UnBindingAllPolicyObject, UnBindingPolicyObject)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set Policy ID for instance/instance group binding and unbinding APIs (BindingPolicyObject, UnBindingAllPolicyObject, UnBindingPolicyObject)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginId Policy ID for instance/instance group binding and unbinding APIs (BindingPolicyObject, UnBindingAllPolicyObject, UnBindingPolicyObject)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get Tag
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TagInstances Tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TagInstance [] getTagInstances() {
        return this.TagInstances;
    }

    /**
     * Set Tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TagInstances Tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTagInstances(TagInstance [] TagInstances) {
        this.TagInstances = TagInstances;
    }

    /**
     * Get Information on the filter dimension associated with a policy.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FilterDimensionsParam Information on the filter dimension associated with a policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFilterDimensionsParam() {
        return this.FilterDimensionsParam;
    }

    /**
     * Set Information on the filter dimension associated with a policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FilterDimensionsParam Information on the filter dimension associated with a policy.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFilterDimensionsParam(String FilterDimensionsParam) {
        this.FilterDimensionsParam = FilterDimensionsParam;
    }

    public AlarmPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicy(AlarmPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.UseSum != null) {
            this.UseSum = new Long(source.UseSum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ConditionTemplateId != null) {
            this.ConditionTemplateId = new String(source.ConditionTemplateId);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.Notices != null) {
            this.Notices = new AlarmNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new AlarmNotice(source.Notices[i]);
            }
        }
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new AlarmPolicyTriggerTask[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new AlarmPolicyTriggerTask(source.TriggerTasks[i]);
            }
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new ConditionsTemp(source.ConditionsTemp);
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
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.NamespaceShowName != null) {
            this.NamespaceShowName = new String(source.NamespaceShowName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Long(source.CanSetDefault);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.InstanceSum != null) {
            this.InstanceSum = new Long(source.InstanceSum);
        }
        if (source.InstanceGroupName != null) {
            this.InstanceGroupName = new String(source.InstanceGroupName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.TagInstances != null) {
            this.TagInstances = new TagInstance[source.TagInstances.length];
            for (int i = 0; i < source.TagInstances.length; i++) {
                this.TagInstances[i] = new TagInstance(source.TagInstances[i]);
            }
        }
        if (source.FilterDimensionsParam != null) {
            this.FilterDimensionsParam = new String(source.FilterDimensionsParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "UseSum", this.UseSum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "NamespaceShowName", this.NamespaceShowName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "InstanceGroupName", this.InstanceGroupName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamArrayObj(map, prefix + "TagInstances.", this.TagInstances);
        this.setParamSimple(map, prefix + "FilterDimensionsParam", this.FilterDimensionsParam);

    }
}

