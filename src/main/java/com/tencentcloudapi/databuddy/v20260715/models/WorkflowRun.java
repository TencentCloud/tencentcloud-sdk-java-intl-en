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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRun extends AbstractModel {

    /**
    * <p>Root account ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Workflow name</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow running ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Trigger mode: Scheduler, ManualTrigger, Event (for reference, see SchedulerTriggerType)</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Start time in milliseconds.</p>
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>Start time of the pending state, unit: timestamp in milliseconds</p>
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * <p>queue status start time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * <p>Running end time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * <p>End time. It has a value when running enters the end state. Unit: timestamp in milliseconds</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Running time, unit: seconds</p>
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * <p>Concurrency queue time, in seconds</p>
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * <p>Time spent waiting for resources, in seconds</p>
    */
    @SerializedName("PendingCostTime")
    @Expose
    private String PendingCostTime;

    /**
    * <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * <p>Computational resource (resource group ID set of the task)</p>
    */
    @SerializedName("ResourceGroupIds")
    @Expose
    private String [] ResourceGroupIds;

    /**
    * <p>Running user UIN</p>
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * <p>Username for operation</p>
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * <p>Error code</p>
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * <p>Running parameter</p>
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>Workflow version ID</p>
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * <p>Whether rerunning is supported for the current workflow</p>
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * <p>Workflow run creation time. Unit: millisecond timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Number of reruns.</p>
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * <p>Task scope in operation, Task ID list</p>
    */
    @SerializedName("SelectedTaskIds")
    @Expose
    private String [] SelectedTaskIds;

    /**
    * <p>Resource group information list.</p>
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * <p>Tag list.</p>
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * <p>Parent workflow running ID [unique to nested workflow triggers]</p>
    */
    @SerializedName("ParentWorkflowRunId")
    @Expose
    private String ParentWorkflowRunId;

    /**
    * <p>Parent workflow task running ID [unique to nested workflow triggers]</p>
    */
    @SerializedName("ParentWorkflowTaskRunId")
    @Expose
    private String ParentWorkflowTaskRunId;

    /**
    * <p>Parent workflow task run name [exclusive to nested workflow triggers]</p>
    */
    @SerializedName("ParentWorkflowTaskRunName")
    @Expose
    private String ParentWorkflowTaskRunName;

    /**
    * <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * <p>Parameters filled in by the user during advanced execution of the workflow</p>
    */
    @SerializedName("AdvancedParameters")
    @Expose
    private AdvancedParameter [] AdvancedParameters;

    /**
    * <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private String ScheduledTime;

    /**
     * Get <p>Root account ID</p> 
     * @return AppId <p>Root account ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Root account ID</p>
     * @param AppId <p>Root account ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Workflow name</p> 
     * @return WorkflowName <p>Workflow name</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>Workflow name</p>
     * @param WorkflowName <p>Workflow name</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>Workflow ID</p> 
     * @return WorkflowId <p>Workflow ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID</p>
     * @param WorkflowId <p>Workflow ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Workflow running ID</p> 
     * @return WorkflowRunId <p>Workflow running ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Workflow running ID</p>
     * @param WorkflowRunId <p>Workflow running ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>Workspace ID</p> 
     * @return WorkspaceId <p>Workspace ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param WorkspaceId <p>Workspace ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Trigger mode: Scheduler, ManualTrigger, Event (for reference, see SchedulerTriggerType)</p> 
     * @return TriggerType <p>Trigger mode: Scheduler, ManualTrigger, Event (for reference, see SchedulerTriggerType)</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger mode: Scheduler, ManualTrigger, Event (for reference, see SchedulerTriggerType)</p>
     * @param TriggerType <p>Trigger mode: Scheduler, ManualTrigger, Event (for reference, see SchedulerTriggerType)</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Start time in milliseconds.</p> 
     * @return RunStartTime <p>Start time in milliseconds.</p>
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set <p>Start time in milliseconds.</p>
     * @param RunStartTime <p>Start time in milliseconds.</p>
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>Start time of the pending state, unit: timestamp in milliseconds</p> 
     * @return PendingStartTime <p>Start time of the pending state, unit: timestamp in milliseconds</p>
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set <p>Start time of the pending state, unit: timestamp in milliseconds</p>
     * @param PendingStartTime <p>Start time of the pending state, unit: timestamp in milliseconds</p>
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get <p>queue status start time, unit: timestamp in milliseconds</p> 
     * @return QueueStartTime <p>queue status start time, unit: timestamp in milliseconds</p>
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set <p>queue status start time, unit: timestamp in milliseconds</p>
     * @param QueueStartTime <p>queue status start time, unit: timestamp in milliseconds</p>
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get <p>Running end time, unit: timestamp in milliseconds</p> 
     * @return RunEndTime <p>Running end time, unit: timestamp in milliseconds</p>
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set <p>Running end time, unit: timestamp in milliseconds</p>
     * @param RunEndTime <p>Running end time, unit: timestamp in milliseconds</p>
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * Get <p>End time. It has a value when running enters the end state. Unit: timestamp in milliseconds</p> 
     * @return EndTime <p>End time. It has a value when running enters the end state. Unit: timestamp in milliseconds</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time. It has a value when running enters the end state. Unit: timestamp in milliseconds</p>
     * @param EndTime <p>End time. It has a value when running enters the end state. Unit: timestamp in milliseconds</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Running time, unit: seconds</p> 
     * @return RunCostTime <p>Running time, unit: seconds</p>
     */
    public String getRunCostTime() {
        return this.RunCostTime;
    }

    /**
     * Set <p>Running time, unit: seconds</p>
     * @param RunCostTime <p>Running time, unit: seconds</p>
     */
    public void setRunCostTime(String RunCostTime) {
        this.RunCostTime = RunCostTime;
    }

    /**
     * Get <p>Concurrency queue time, in seconds</p> 
     * @return QueueCostTime <p>Concurrency queue time, in seconds</p>
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set <p>Concurrency queue time, in seconds</p>
     * @param QueueCostTime <p>Concurrency queue time, in seconds</p>
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get <p>Time spent waiting for resources, in seconds</p> 
     * @return PendingCostTime <p>Time spent waiting for resources, in seconds</p>
     */
    public String getPendingCostTime() {
        return this.PendingCostTime;
    }

    /**
     * Set <p>Time spent waiting for resources, in seconds</p>
     * @param PendingCostTime <p>Time spent waiting for resources, in seconds</p>
     */
    public void setPendingCostTime(String PendingCostTime) {
        this.PendingCostTime = PendingCostTime;
    }

    /**
     * Get <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p> 
     * @return RunState <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     * @param RunState <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("successful"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get <p>Computational resource (resource group ID set of the task)</p> 
     * @return ResourceGroupIds <p>Computational resource (resource group ID set of the task)</p>
     */
    public String [] getResourceGroupIds() {
        return this.ResourceGroupIds;
    }

    /**
     * Set <p>Computational resource (resource group ID set of the task)</p>
     * @param ResourceGroupIds <p>Computational resource (resource group ID set of the task)</p>
     */
    public void setResourceGroupIds(String [] ResourceGroupIds) {
        this.ResourceGroupIds = ResourceGroupIds;
    }

    /**
     * Get <p>Running user UIN</p> 
     * @return RunUserUin <p>Running user UIN</p>
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set <p>Running user UIN</p>
     * @param RunUserUin <p>Running user UIN</p>
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get <p>Username for operation</p> 
     * @return RunUserName <p>Username for operation</p>
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set <p>Username for operation</p>
     * @param RunUserName <p>Username for operation</p>
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get <p>Error code</p> 
     * @return ErrorCodeString <p>Error code</p>
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set <p>Error code</p>
     * @param ErrorCodeString <p>Error code</p>
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    /**
     * Get <p>Running parameter</p> 
     * @return WorkflowParams <p>Running parameter</p>
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>Running parameter</p>
     * @param WorkflowParams <p>Running parameter</p>
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get <p>Workflow version ID</p> 
     * @return WorkflowVersionId <p>Workflow version ID</p>
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set <p>Workflow version ID</p>
     * @param WorkflowVersionId <p>Workflow version ID</p>
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get <p>Whether rerunning is supported for the current workflow</p> 
     * @return SupportRerun <p>Whether rerunning is supported for the current workflow</p>
     */
    public Boolean getSupportRerun() {
        return this.SupportRerun;
    }

    /**
     * Set <p>Whether rerunning is supported for the current workflow</p>
     * @param SupportRerun <p>Whether rerunning is supported for the current workflow</p>
     */
    public void setSupportRerun(Boolean SupportRerun) {
        this.SupportRerun = SupportRerun;
    }

    /**
     * Get <p>Workflow run creation time. Unit: millisecond timestamp</p> 
     * @return CreateTime <p>Workflow run creation time. Unit: millisecond timestamp</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Workflow run creation time. Unit: millisecond timestamp</p>
     * @param CreateTime <p>Workflow run creation time. Unit: millisecond timestamp</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Number of reruns.</p> 
     * @return RerunTimes <p>Number of reruns.</p>
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set <p>Number of reruns.</p>
     * @param RerunTimes <p>Number of reruns.</p>
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get <p>Task scope in operation, Task ID list</p> 
     * @return SelectedTaskIds <p>Task scope in operation, Task ID list</p>
     */
    public String [] getSelectedTaskIds() {
        return this.SelectedTaskIds;
    }

    /**
     * Set <p>Task scope in operation, Task ID list</p>
     * @param SelectedTaskIds <p>Task scope in operation, Task ID list</p>
     */
    public void setSelectedTaskIds(String [] SelectedTaskIds) {
        this.SelectedTaskIds = SelectedTaskIds;
    }

    /**
     * Get <p>Resource group information list.</p> 
     * @return ResourceGroupInfoList <p>Resource group information list.</p>
     */
    public ResourceGroupInfo [] getResourceGroupInfoList() {
        return this.ResourceGroupInfoList;
    }

    /**
     * Set <p>Resource group information list.</p>
     * @param ResourceGroupInfoList <p>Resource group information list.</p>
     */
    public void setResourceGroupInfoList(ResourceGroupInfo [] ResourceGroupInfoList) {
        this.ResourceGroupInfoList = ResourceGroupInfoList;
    }

    /**
     * Get <p>Tag list.</p> 
     * @return LabelList <p>Tag list.</p>
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>Tag list.</p>
     * @param LabelList <p>Tag list.</p>
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>Parent workflow running ID [unique to nested workflow triggers]</p> 
     * @return ParentWorkflowRunId <p>Parent workflow running ID [unique to nested workflow triggers]</p>
     */
    public String getParentWorkflowRunId() {
        return this.ParentWorkflowRunId;
    }

    /**
     * Set <p>Parent workflow running ID [unique to nested workflow triggers]</p>
     * @param ParentWorkflowRunId <p>Parent workflow running ID [unique to nested workflow triggers]</p>
     */
    public void setParentWorkflowRunId(String ParentWorkflowRunId) {
        this.ParentWorkflowRunId = ParentWorkflowRunId;
    }

    /**
     * Get <p>Parent workflow task running ID [unique to nested workflow triggers]</p> 
     * @return ParentWorkflowTaskRunId <p>Parent workflow task running ID [unique to nested workflow triggers]</p>
     */
    public String getParentWorkflowTaskRunId() {
        return this.ParentWorkflowTaskRunId;
    }

    /**
     * Set <p>Parent workflow task running ID [unique to nested workflow triggers]</p>
     * @param ParentWorkflowTaskRunId <p>Parent workflow task running ID [unique to nested workflow triggers]</p>
     */
    public void setParentWorkflowTaskRunId(String ParentWorkflowTaskRunId) {
        this.ParentWorkflowTaskRunId = ParentWorkflowTaskRunId;
    }

    /**
     * Get <p>Parent workflow task run name [exclusive to nested workflow triggers]</p> 
     * @return ParentWorkflowTaskRunName <p>Parent workflow task run name [exclusive to nested workflow triggers]</p>
     */
    public String getParentWorkflowTaskRunName() {
        return this.ParentWorkflowTaskRunName;
    }

    /**
     * Set <p>Parent workflow task run name [exclusive to nested workflow triggers]</p>
     * @param ParentWorkflowTaskRunName <p>Parent workflow task run name [exclusive to nested workflow triggers]</p>
     */
    public void setParentWorkflowTaskRunName(String ParentWorkflowTaskRunName) {
        this.ParentWorkflowTaskRunName = ParentWorkflowTaskRunName;
    }

    /**
     * Get <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p> 
     * @return Permission <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     * @param Permission <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>Parameters filled in by the user during advanced execution of the workflow</p> 
     * @return AdvancedParameters <p>Parameters filled in by the user during advanced execution of the workflow</p>
     */
    public AdvancedParameter [] getAdvancedParameters() {
        return this.AdvancedParameters;
    }

    /**
     * Set <p>Parameters filled in by the user during advanced execution of the workflow</p>
     * @param AdvancedParameters <p>Parameters filled in by the user during advanced execution of the workflow</p>
     */
    public void setAdvancedParameters(AdvancedParameter [] AdvancedParameters) {
        this.AdvancedParameters = AdvancedParameters;
    }

    /**
     * Get <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p> 
     * @return ScheduledTime <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     */
    public String getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     * @param ScheduledTime <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     */
    public void setScheduledTime(String ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    public WorkflowRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRun(WorkflowRun source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.PendingCostTime != null) {
            this.PendingCostTime = new String(source.PendingCostTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.ResourceGroupIds != null) {
            this.ResourceGroupIds = new String[source.ResourceGroupIds.length];
            for (int i = 0; i < source.ResourceGroupIds.length; i++) {
                this.ResourceGroupIds[i] = new String(source.ResourceGroupIds[i]);
            }
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.WorkflowVersionId != null) {
            this.WorkflowVersionId = new String(source.WorkflowVersionId);
        }
        if (source.SupportRerun != null) {
            this.SupportRerun = new Boolean(source.SupportRerun);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.SelectedTaskIds != null) {
            this.SelectedTaskIds = new String[source.SelectedTaskIds.length];
            for (int i = 0; i < source.SelectedTaskIds.length; i++) {
                this.SelectedTaskIds[i] = new String(source.SelectedTaskIds[i]);
            }
        }
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.ParentWorkflowRunId != null) {
            this.ParentWorkflowRunId = new String(source.ParentWorkflowRunId);
        }
        if (source.ParentWorkflowTaskRunId != null) {
            this.ParentWorkflowTaskRunId = new String(source.ParentWorkflowTaskRunId);
        }
        if (source.ParentWorkflowTaskRunName != null) {
            this.ParentWorkflowTaskRunName = new String(source.ParentWorkflowTaskRunName);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.AdvancedParameters != null) {
            this.AdvancedParameters = new AdvancedParameter[source.AdvancedParameters.length];
            for (int i = 0; i < source.AdvancedParameters.length; i++) {
                this.AdvancedParameters[i] = new AdvancedParameter(source.AdvancedParameters[i]);
            }
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new String(source.ScheduledTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "PendingCostTime", this.PendingCostTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamArraySimple(map, prefix + "ResourceGroupIds.", this.ResourceGroupIds);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamArraySimple(map, prefix + "SelectedTaskIds.", this.SelectedTaskIds);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamSimple(map, prefix + "ParentWorkflowRunId", this.ParentWorkflowRunId);
        this.setParamSimple(map, prefix + "ParentWorkflowTaskRunId", this.ParentWorkflowTaskRunId);
        this.setParamSimple(map, prefix + "ParentWorkflowTaskRunName", this.ParentWorkflowTaskRunName);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamArrayObj(map, prefix + "AdvancedParameters.", this.AdvancedParameters);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);

    }
}

