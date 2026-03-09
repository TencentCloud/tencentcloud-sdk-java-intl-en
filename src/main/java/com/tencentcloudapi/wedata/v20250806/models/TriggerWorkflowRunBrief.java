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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerWorkflowRunBrief extends AbstractModel {

    /**
    * User AppId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow running ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * Trigger ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * Trigger mode: scheduling trigger Scheduler, manual trigger ManualTrigger, Event trigger Event.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Workflow trigger time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Execution start timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution end timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Running time, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionCostTime")
    @Expose
    private String ExecutionCostTime;

    /**
    * Concurrent queue time taken, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * Wait time for resource spending, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PendingCostTime")
    @Expose
    private String PendingCostTime;

    /**
    * Execution status: execution FAILED: FAILED, operation successful: SUCCESS, waiting: PENDING, skip RUNNING: SKIPED, RUNNING: RUNNING.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * Running user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * Running username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * Error code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * Workflow version info ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * Number of reruns.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * Running task scope, comma-separated task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SelectedTaskIds")
    @Expose
    private String [] SelectedTaskIds;

    /**
    * Start time of pending concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * Queued waiting start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlannedSchedulingTime")
    @Expose
    private String PlannedSchedulingTime;

    /**
    * Cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Responsible person's name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
     * Get User AppId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User AppId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User AppId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Workflow name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow running ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionId Workflow running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Workflow running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionId Workflow running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Trigger ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerId Trigger ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set Trigger ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerId Trigger ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get Trigger mode: scheduling trigger Scheduler, manual trigger ManualTrigger, Event trigger Event.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerType Trigger mode: scheduling trigger Scheduler, manual trigger ManualTrigger, Event trigger Event.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger mode: scheduling trigger Scheduler, manual trigger ManualTrigger, Event trigger Event.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerType Trigger mode: scheduling trigger Scheduler, manual trigger ManualTrigger, Event trigger Event.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Workflow trigger time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Workflow trigger time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Workflow trigger time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Workflow trigger time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Execution start timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionStartTime Execution start timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution start timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionStartTime Execution start timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution end timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionEndTime Execution end timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution end timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionEndTime Execution end timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Running time, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionCostTime Running time, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionCostTime() {
        return this.ExecutionCostTime;
    }

    /**
     * Set Running time, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionCostTime Running time, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionCostTime(String ExecutionCostTime) {
        this.ExecutionCostTime = ExecutionCostTime;
    }

    /**
     * Get Concurrent queue time taken, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueCostTime Concurrent queue time taken, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set Concurrent queue time taken, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueCostTime Concurrent queue time taken, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get Wait time for resource spending, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PendingCostTime Wait time for resource spending, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPendingCostTime() {
        return this.PendingCostTime;
    }

    /**
     * Set Wait time for resource spending, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PendingCostTime Wait time for resource spending, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPendingCostTime(String PendingCostTime) {
        this.PendingCostTime = PendingCostTime;
    }

    /**
     * Get Execution status: execution FAILED: FAILED, operation successful: SUCCESS, waiting: PENDING, skip RUNNING: SKIPED, RUNNING: RUNNING.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionState Execution status: execution FAILED: FAILED, operation successful: SUCCESS, waiting: PENDING, skip RUNNING: SKIPED, RUNNING: RUNNING.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set Execution status: execution FAILED: FAILED, operation successful: SUCCESS, waiting: PENDING, skip RUNNING: SKIPED, RUNNING: RUNNING.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionState Execution status: execution FAILED: FAILED, operation successful: SUCCESS, waiting: PENDING, skip RUNNING: SKIPED, RUNNING: RUNNING.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get Running user UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteUserUin Running user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set Running user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteUserUin Running user UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get Running username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteUserName Running username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set Running username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteUserName Running username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
    }

    /**
     * Get Error code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCodeStr Error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set Error code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorCodeStr Error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get Running parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowParams Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowParams Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get Workflow version info ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowVersionId Workflow version info ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set Workflow version info ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowVersionId Workflow version info ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportRerun Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportRerun() {
        return this.SupportRerun;
    }

    /**
     * Set Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportRerun Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportRerun(Boolean SupportRerun) {
        this.SupportRerun = SupportRerun;
    }

    /**
     * Get Number of reruns.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RerunTimes Number of reruns.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set Number of reruns.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RerunTimes Number of reruns.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get Running task scope, comma-separated task ID list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SelectedTaskIds Running task scope, comma-separated task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSelectedTaskIds() {
        return this.SelectedTaskIds;
    }

    /**
     * Set Running task scope, comma-separated task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SelectedTaskIds Running task scope, comma-separated task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSelectedTaskIds(String [] SelectedTaskIds) {
        this.SelectedTaskIds = SelectedTaskIds;
    }

    /**
     * Get Start time of pending concurrency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PendingStartTime Start time of pending concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set Start time of pending concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PendingStartTime Start time of pending concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get Queued waiting start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueStartTime Queued waiting start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set Queued waiting start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueStartTime Queued waiting start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get Running end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Folder ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Folder name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PlannedSchedulingTime Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPlannedSchedulingTime() {
        return this.PlannedSchedulingTime;
    }

    /**
     * Set Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PlannedSchedulingTime Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlannedSchedulingTime(String PlannedSchedulingTime) {
        this.PlannedSchedulingTime = PlannedSchedulingTime;
    }

    /**
     * Get Cycle type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CycleType Cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CycleType Cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Responsible person's name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserNameInCharge Responsible person's name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set Responsible person's name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserNameInCharge Responsible person's name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserUinInCharge Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserUinInCharge Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    public TriggerWorkflowRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowRunBrief(TriggerWorkflowRunBrief source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.ExecutionCostTime != null) {
            this.ExecutionCostTime = new String(source.ExecutionCostTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.PendingCostTime != null) {
            this.PendingCostTime = new String(source.PendingCostTime);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.ExecuteUserName != null) {
            this.ExecuteUserName = new String(source.ExecuteUserName);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
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
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.SelectedTaskIds != null) {
            this.SelectedTaskIds = new String[source.SelectedTaskIds.length];
            for (int i = 0; i < source.SelectedTaskIds.length; i++) {
                this.SelectedTaskIds[i] = new String(source.SelectedTaskIds[i]);
            }
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.PlannedSchedulingTime != null) {
            this.PlannedSchedulingTime = new String(source.PlannedSchedulingTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.UserNameInCharge != null) {
            this.UserNameInCharge = new String(source.UserNameInCharge);
        }
        if (source.UserUinInCharge != null) {
            this.UserUinInCharge = new String(source.UserUinInCharge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionCostTime", this.ExecutionCostTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "PendingCostTime", this.PendingCostTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "ExecuteUserName", this.ExecuteUserName);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamArraySimple(map, prefix + "SelectedTaskIds.", this.SelectedTaskIds);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "PlannedSchedulingTime", this.PlannedSchedulingTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);

    }
}

