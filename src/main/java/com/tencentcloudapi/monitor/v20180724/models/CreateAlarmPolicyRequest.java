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

public class CreateAlarmPolicyRequest extends AbstractModel{

    /**
    * Value fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy name, which can contain up to 20 characters
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Type of alarm policy, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). An example value is `cvm_device`.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Remarks with up to 100 letters, digits, underscores, and hyphens
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether to enable. Valid values: 0 (no), 1 (yes). Default value: 1. This parameter can be left empty
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Project ID. For products with different projects, a value other than `-1` must be passed in. `-1`: no project; `0`: default project. If no value is passed in, `-1` will be used. The supported project IDs can be viewed on the [**Account Center** > **Project Management**](https://console.cloud.tencent.com/project) page of the console.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * ID of trigger condition template. This parameter can be left empty.
    */
    @SerializedName("ConditionTemplateId")
    @Expose
    private Long ConditionTemplateId;

    /**
    * Metric trigger condition. The supported metrics can be queried via [DescribeAlarmMetrics](https://intl.cloud.tencent.com/document/product/248/51283?from_cn_redirect=1).
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * Event trigger condition. The supported events can be queried via [DescribeAlarmEvents](https://intl.cloud.tencent.com/document/product/248/51284?from_cn_redirect=1).
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
    * List of notification rule IDs, which can be obtained via [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Triggered task list
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
     * Get Value fixed at "monitor" 
     * @return Module Value fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Value fixed at "monitor"
     * @param Module Value fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy name, which can contain up to 20 characters 
     * @return PolicyName Policy name, which can contain up to 20 characters
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name, which can contain up to 20 characters
     * @param PolicyName Policy name, which can contain up to 20 characters
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring) 
     * @return MonitorType Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     * @param MonitorType Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Type of alarm policy, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). An example value is `cvm_device`. 
     * @return Namespace Type of alarm policy, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). An example value is `cvm_device`.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Type of alarm policy, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). An example value is `cvm_device`.
     * @param Namespace Type of alarm policy, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). An example value is `cvm_device`.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Remarks with up to 100 letters, digits, underscores, and hyphens 
     * @return Remark Remarks with up to 100 letters, digits, underscores, and hyphens
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks with up to 100 letters, digits, underscores, and hyphens
     * @param Remark Remarks with up to 100 letters, digits, underscores, and hyphens
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether to enable. Valid values: 0 (no), 1 (yes). Default value: 1. This parameter can be left empty 
     * @return Enable Whether to enable. Valid values: 0 (no), 1 (yes). Default value: 1. This parameter can be left empty
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. Valid values: 0 (no), 1 (yes). Default value: 1. This parameter can be left empty
     * @param Enable Whether to enable. Valid values: 0 (no), 1 (yes). Default value: 1. This parameter can be left empty
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Project ID. For products with different projects, a value other than `-1` must be passed in. `-1`: no project; `0`: default project. If no value is passed in, `-1` will be used. The supported project IDs can be viewed on the [**Account Center** > **Project Management**](https://console.cloud.tencent.com/project) page of the console. 
     * @return ProjectId Project ID. For products with different projects, a value other than `-1` must be passed in. `-1`: no project; `0`: default project. If no value is passed in, `-1` will be used. The supported project IDs can be viewed on the [**Account Center** > **Project Management**](https://console.cloud.tencent.com/project) page of the console.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. For products with different projects, a value other than `-1` must be passed in. `-1`: no project; `0`: default project. If no value is passed in, `-1` will be used. The supported project IDs can be viewed on the [**Account Center** > **Project Management**](https://console.cloud.tencent.com/project) page of the console.
     * @param ProjectId Project ID. For products with different projects, a value other than `-1` must be passed in. `-1`: no project; `0`: default project. If no value is passed in, `-1` will be used. The supported project IDs can be viewed on the [**Account Center** > **Project Management**](https://console.cloud.tencent.com/project) page of the console.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get Metric trigger condition. The supported metrics can be queried via [DescribeAlarmMetrics](https://intl.cloud.tencent.com/document/product/248/51283?from_cn_redirect=1). 
     * @return Condition Metric trigger condition. The supported metrics can be queried via [DescribeAlarmMetrics](https://intl.cloud.tencent.com/document/product/248/51283?from_cn_redirect=1).
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set Metric trigger condition. The supported metrics can be queried via [DescribeAlarmMetrics](https://intl.cloud.tencent.com/document/product/248/51283?from_cn_redirect=1).
     * @param Condition Metric trigger condition. The supported metrics can be queried via [DescribeAlarmMetrics](https://intl.cloud.tencent.com/document/product/248/51283?from_cn_redirect=1).
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Event trigger condition. The supported events can be queried via [DescribeAlarmEvents](https://intl.cloud.tencent.com/document/product/248/51284?from_cn_redirect=1). 
     * @return EventCondition Event trigger condition. The supported events can be queried via [DescribeAlarmEvents](https://intl.cloud.tencent.com/document/product/248/51284?from_cn_redirect=1).
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set Event trigger condition. The supported events can be queried via [DescribeAlarmEvents](https://intl.cloud.tencent.com/document/product/248/51284?from_cn_redirect=1).
     * @param EventCondition Event trigger condition. The supported events can be queried via [DescribeAlarmEvents](https://intl.cloud.tencent.com/document/product/248/51284?from_cn_redirect=1).
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    /**
     * Get List of notification rule IDs, which can be obtained via [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1) 
     * @return NoticeIds List of notification rule IDs, which can be obtained via [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set List of notification rule IDs, which can be obtained via [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
     * @param NoticeIds List of notification rule IDs, which can be obtained via [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Triggered task list 
     * @return TriggerTasks Triggered task list
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set Triggered task list
     * @param TriggerTasks Triggered task list
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ConditionTemplateId", this.ConditionTemplateId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);

    }
}

