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

public class GetWorkflowTaskRunRsp extends AbstractModel {

    /**
    * <p>Task name.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Task running ID.</p>
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * <p>Running state. For parameter values, see the workflow task running status enumeration, such as Pending / Running / Succeeded / Failed / Killed</p>
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow run ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task Type Name. For details, see the TaskTypeName field description in the TaskType data structure.</p>
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>Task version ID.</p>
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * <p>Trigger type</p><p>Enumeration values:</p><ul><li>Scheduler: Scheduling trigger</li><li>Manual: Manual triggering</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Associated resource group ID</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>Error code</p>
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * <p>Running user UIN.</p>
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * <p>Running user name.</p>
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * <p>Creator UIN</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>Execution platform execution ID.</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>Creation time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Dependency task completion time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * <p>Start time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>Running end time, unit: millisecond timestamp</p>
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * <p>Running time, unit: seconds</p>
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * <p>Waiting duration (waiting duration from dependency readiness to start), unit: seconds</p>
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * <p>Execution platform time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * <p>Time zone</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>Depend on upstream Task ID list. Reserved field, temporarily returns []</p><p>Reserved field, temporarily returns []</p>
    */
    @SerializedName("DependOnList")
    @Expose
    private String [] DependOnList;

    /**
    * <p>Running parameter</p>
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * <p>Task extension information, including script path</p>
    */
    @SerializedName("TaskTypeExtensions")
    @Expose
    private String TaskTypeExtensions;

    /**
    * <p>X coordinate of the task</p>
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>Task Y-axis coordinate</p>
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>Number of retries.</p>
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * <p>Workflow name</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>Rerun count</p>
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * <p>Whether it is the most recent run</p>
    */
    @SerializedName("IsLatestRun")
    @Expose
    private Boolean IsLatestRun;

    /**
    * <p>Resource group information list.</p>
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>Execution result</p>
    */
    @SerializedName("RunResult")
    @Expose
    private String RunResult;

    /**
    * <p>Built-in workflow task execution details (only for FOR_EACH tasks; this field is not returned for other task types)</p>
    */
    @SerializedName("InnerWorkflowTaskRun")
    @Expose
    private InnerWorkflowTaskRun InnerWorkflowTaskRun;

    /**
    * <p>Scheduled dispatch time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private String ScheduledTime;

    /**
     * Get <p>Task name.</p> 
     * @return TaskName <p>Task name.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name.</p>
     * @param TaskName <p>Task name.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Task running ID.</p> 
     * @return WorkflowTaskRunId <p>Task running ID.</p>
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>Task running ID.</p>
     * @param WorkflowTaskRunId <p>Task running ID.</p>
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get <p>Running state. For parameter values, see the workflow task running status enumeration, such as Pending / Running / Succeeded / Failed / Killed</p> 
     * @return RunState <p>Running state. For parameter values, see the workflow task running status enumeration, such as Pending / Running / Succeeded / Failed / Killed</p>
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>Running state. For parameter values, see the workflow task running status enumeration, such as Pending / Running / Succeeded / Failed / Killed</p>
     * @param RunState <p>Running state. For parameter values, see the workflow task running status enumeration, such as Pending / Running / Succeeded / Failed / Killed</p>
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
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
     * Get <p>Workflow run ID</p> 
     * @return WorkflowRunId <p>Workflow run ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Workflow run ID</p>
     * @param WorkflowRunId <p>Workflow run ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task Type Name. For details, see the TaskTypeName field description in the TaskType data structure.</p> 
     * @return TaskTypeName <p>Task Type Name. For details, see the TaskTypeName field description in the TaskType data structure.</p>
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>Task Type Name. For details, see the TaskTypeName field description in the TaskType data structure.</p>
     * @param TaskTypeName <p>Task Type Name. For details, see the TaskTypeName field description in the TaskType data structure.</p>
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>Task version ID.</p> 
     * @return TaskVersionId <p>Task version ID.</p>
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set <p>Task version ID.</p>
     * @param TaskVersionId <p>Task version ID.</p>
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    /**
     * Get <p>Trigger type</p><p>Enumeration values:</p><ul><li>Scheduler: Scheduling trigger</li><li>Manual: Manual triggering</li></ul> 
     * @return TriggerType <p>Trigger type</p><p>Enumeration values:</p><ul><li>Scheduler: Scheduling trigger</li><li>Manual: Manual triggering</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger type</p><p>Enumeration values:</p><ul><li>Scheduler: Scheduling trigger</li><li>Manual: Manual triggering</li></ul>
     * @param TriggerType <p>Trigger type</p><p>Enumeration values:</p><ul><li>Scheduler: Scheduling trigger</li><li>Manual: Manual triggering</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Associated resource group ID</p> 
     * @return ResourceGroupId <p>Associated resource group ID</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>Associated resource group ID</p>
     * @param ResourceGroupId <p>Associated resource group ID</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
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
     * Get <p>Running user UIN.</p> 
     * @return RunUserUin <p>Running user UIN.</p>
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set <p>Running user UIN.</p>
     * @param RunUserUin <p>Running user UIN.</p>
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get <p>Running user name.</p> 
     * @return RunUserName <p>Running user name.</p>
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set <p>Running user name.</p>
     * @param RunUserName <p>Running user name.</p>
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get <p>Creator UIN</p> 
     * @return CreateUserUin <p>Creator UIN</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>Creator UIN</p>
     * @param CreateUserUin <p>Creator UIN</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>Execution platform execution ID.</p> 
     * @return JobId <p>Execution platform execution ID.</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>Execution platform execution ID.</p>
     * @param JobId <p>Execution platform execution ID.</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>Creation time, unit: timestamp in milliseconds</p> 
     * @return CreateTime <p>Creation time, unit: timestamp in milliseconds</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, unit: timestamp in milliseconds</p>
     * @param CreateTime <p>Creation time, unit: timestamp in milliseconds</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time, unit: timestamp in milliseconds</p> 
     * @return UpdateTime <p>Update time, unit: timestamp in milliseconds</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, unit: timestamp in milliseconds</p>
     * @param UpdateTime <p>Update time, unit: timestamp in milliseconds</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Dependency task completion time, unit: timestamp in milliseconds</p> 
     * @return DependenceFinishedTime <p>Dependency task completion time, unit: timestamp in milliseconds</p>
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set <p>Dependency task completion time, unit: timestamp in milliseconds</p>
     * @param DependenceFinishedTime <p>Dependency task completion time, unit: timestamp in milliseconds</p>
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get <p>Start time, unit: timestamp in milliseconds</p> 
     * @return RunStartTime <p>Start time, unit: timestamp in milliseconds</p>
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set <p>Start time, unit: timestamp in milliseconds</p>
     * @param RunStartTime <p>Start time, unit: timestamp in milliseconds</p>
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>Running end time, unit: millisecond timestamp</p> 
     * @return RunEndTime <p>Running end time, unit: millisecond timestamp</p>
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set <p>Running end time, unit: millisecond timestamp</p>
     * @param RunEndTime <p>Running end time, unit: millisecond timestamp</p>
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
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
     * Get <p>Waiting duration (waiting duration from dependency readiness to start), unit: seconds</p> 
     * @return WaitTime <p>Waiting duration (waiting duration from dependency readiness to start), unit: seconds</p>
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set <p>Waiting duration (waiting duration from dependency readiness to start), unit: seconds</p>
     * @param WaitTime <p>Waiting duration (waiting duration from dependency readiness to start), unit: seconds</p>
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get <p>Execution platform time, unit: timestamp in milliseconds</p> 
     * @return IssueTime <p>Execution platform time, unit: timestamp in milliseconds</p>
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set <p>Execution platform time, unit: timestamp in milliseconds</p>
     * @param IssueTime <p>Execution platform time, unit: timestamp in milliseconds</p>
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get <p>Time zone</p> 
     * @return TimeZone <p>Time zone</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>Time zone</p>
     * @param TimeZone <p>Time zone</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>Depend on upstream Task ID list. Reserved field, temporarily returns []</p><p>Reserved field, temporarily returns []</p> 
     * @return DependOnList <p>Depend on upstream Task ID list. Reserved field, temporarily returns []</p><p>Reserved field, temporarily returns []</p>
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>Depend on upstream Task ID list. Reserved field, temporarily returns []</p><p>Reserved field, temporarily returns []</p>
     * @param DependOnList <p>Depend on upstream Task ID list. Reserved field, temporarily returns []</p><p>Reserved field, temporarily returns []</p>
     */
    public void setDependOnList(String [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get <p>Running parameter</p> 
     * @return RunParams <p>Running parameter</p>
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set <p>Running parameter</p>
     * @param RunParams <p>Running parameter</p>
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get <p>Task extension information, including script path</p> 
     * @return TaskTypeExtensions <p>Task extension information, including script path</p>
     */
    public String getTaskTypeExtensions() {
        return this.TaskTypeExtensions;
    }

    /**
     * Set <p>Task extension information, including script path</p>
     * @param TaskTypeExtensions <p>Task extension information, including script path</p>
     */
    public void setTaskTypeExtensions(String TaskTypeExtensions) {
        this.TaskTypeExtensions = TaskTypeExtensions;
    }

    /**
     * Get <p>X coordinate of the task</p> 
     * @return LeftCoordinate <p>X coordinate of the task</p>
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>X coordinate of the task</p>
     * @param LeftCoordinate <p>X coordinate of the task</p>
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>Task Y-axis coordinate</p> 
     * @return TopCoordinate <p>Task Y-axis coordinate</p>
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>Task Y-axis coordinate</p>
     * @param TopCoordinate <p>Task Y-axis coordinate</p>
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>Number of retries.</p> 
     * @return RetryTimes <p>Number of retries.</p>
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set <p>Number of retries.</p>
     * @param RetryTimes <p>Number of retries.</p>
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
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
     * Get <p>Rerun count</p> 
     * @return RerunTimes <p>Rerun count</p>
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set <p>Rerun count</p>
     * @param RerunTimes <p>Rerun count</p>
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get <p>Whether it is the most recent run</p> 
     * @return IsLatestRun <p>Whether it is the most recent run</p>
     */
    public Boolean getIsLatestRun() {
        return this.IsLatestRun;
    }

    /**
     * Set <p>Whether it is the most recent run</p>
     * @param IsLatestRun <p>Whether it is the most recent run</p>
     */
    public void setIsLatestRun(Boolean IsLatestRun) {
        this.IsLatestRun = IsLatestRun;
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
     * Get <p>Error message.</p> 
     * @return ErrorMessage <p>Error message.</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>Error message.</p>
     * @param ErrorMessage <p>Error message.</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>Execution result</p> 
     * @return RunResult <p>Execution result</p>
     */
    public String getRunResult() {
        return this.RunResult;
    }

    /**
     * Set <p>Execution result</p>
     * @param RunResult <p>Execution result</p>
     */
    public void setRunResult(String RunResult) {
        this.RunResult = RunResult;
    }

    /**
     * Get <p>Built-in workflow task execution details (only for FOR_EACH tasks; this field is not returned for other task types)</p> 
     * @return InnerWorkflowTaskRun <p>Built-in workflow task execution details (only for FOR_EACH tasks; this field is not returned for other task types)</p>
     */
    public InnerWorkflowTaskRun getInnerWorkflowTaskRun() {
        return this.InnerWorkflowTaskRun;
    }

    /**
     * Set <p>Built-in workflow task execution details (only for FOR_EACH tasks; this field is not returned for other task types)</p>
     * @param InnerWorkflowTaskRun <p>Built-in workflow task execution details (only for FOR_EACH tasks; this field is not returned for other task types)</p>
     */
    public void setInnerWorkflowTaskRun(InnerWorkflowTaskRun InnerWorkflowTaskRun) {
        this.InnerWorkflowTaskRun = InnerWorkflowTaskRun;
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

    public GetWorkflowTaskRunRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWorkflowTaskRunRsp(GetWorkflowTaskRunRsp source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.TaskVersionId != null) {
            this.TaskVersionId = new String(source.TaskVersionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DependenceFinishedTime != null) {
            this.DependenceFinishedTime = new String(source.DependenceFinishedTime);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DependOnList != null) {
            this.DependOnList = new String[source.DependOnList.length];
            for (int i = 0; i < source.DependOnList.length; i++) {
                this.DependOnList[i] = new String(source.DependOnList[i]);
            }
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.TaskTypeExtensions != null) {
            this.TaskTypeExtensions = new String(source.TaskTypeExtensions);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.IsLatestRun != null) {
            this.IsLatestRun = new Boolean(source.IsLatestRun);
        }
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RunResult != null) {
            this.RunResult = new String(source.RunResult);
        }
        if (source.InnerWorkflowTaskRun != null) {
            this.InnerWorkflowTaskRun = new InnerWorkflowTaskRun(source.InnerWorkflowTaskRun);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new String(source.ScheduledTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DependenceFinishedTime", this.DependenceFinishedTime);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "TaskTypeExtensions", this.TaskTypeExtensions);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "IsLatestRun", this.IsLatestRun);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RunResult", this.RunResult);
        this.setParamObj(map, prefix + "InnerWorkflowTaskRun.", this.InnerWorkflowTaskRun);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);

    }
}

