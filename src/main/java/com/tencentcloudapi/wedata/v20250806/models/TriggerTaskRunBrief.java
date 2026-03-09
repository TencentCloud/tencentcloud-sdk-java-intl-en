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

public class TriggerTaskRunBrief extends AbstractModel {

    /**
    * Running ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * Execution status: FAILED (FAILED to run), SUCCESS (executed successfully), PENDING (waiting), SKIP (SKIP RUNNING), RUNNING (RUNNING).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Running ID of the workflow.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Waiting duration, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * Associated resource group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Error code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * Operating account.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreaterUin")
    @Expose
    private String CreaterUin;

    /**
    * Execution ID of the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Creation Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Task completion time dependency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * Task delivery time to the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * Started waiting for source time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * Start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Queuing time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * Running time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * Total time spent.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllCostTime")
    @Expose
    private String AllCostTime;

    /**
    * Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Depends on the upstream task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DependOnList")
    @Expose
    private String [] DependOnList;

    /**
    * Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * Task extension information, including script path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeExtensions")
    @Expose
    private String TaskTypeExtensions;

    /**
    * Retry count. it indicates the first run when set to 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * Left coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * Top coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * Resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Error code description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * Issue the execution platform time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Operator name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * Number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * Whether it is the most recent run.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLatestExecution")
    @Expose
    private Boolean IsLatestExecution;

    /**
    * Task running status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskExecutionState")
    @Expose
    private String TaskExecutionState;

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
    * Responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * Folder ID
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
    * Project name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Workflow running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * Whether rerun is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * Workflow execution status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionState")
    @Expose
    private String WorkflowExecutionState;

    /**
    * Task execution result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionResult")
    @Expose
    private String ExecutionResult;

    /**
     * Get Running ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionId Running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionId Running ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Execution status: FAILED (FAILED to run), SUCCESS (executed successfully), PENDING (waiting), SKIP (SKIP RUNNING), RUNNING (RUNNING).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionState Execution status: FAILED (FAILED to run), SUCCESS (executed successfully), PENDING (waiting), SKIP (SKIP RUNNING), RUNNING (RUNNING).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set Execution status: FAILED (FAILED to run), SUCCESS (executed successfully), PENDING (waiting), SKIP (SKIP RUNNING), RUNNING (RUNNING).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionState Execution status: FAILED (FAILED to run), SUCCESS (executed successfully), PENDING (waiting), SKIP (SKIP RUNNING), RUNNING (RUNNING).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
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
     * Get Running ID of the workflow.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionId Running ID of the workflow.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set Running ID of the workflow.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionId Running ID of the workflow.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskVersionId Task version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set Task version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskVersionId Task version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    /**
     * Get Trigger Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerType Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerType Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Waiting duration, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WaitTime Waiting duration, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set Waiting duration, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WaitTime Waiting duration, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get Associated resource group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroup Associated resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Associated resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroup Associated resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Error code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCode Error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Error code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorCode Error code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Operating account.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteUserUin Operating account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set Operating account.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteUserUin Operating account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get Creator ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreaterUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreaterUin() {
        return this.CreaterUin;
    }

    /**
     * Set Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreaterUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreaterUin(String CreaterUin) {
        this.CreaterUin = CreaterUin;
    }

    /**
     * Get Execution ID of the execution platform.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Execution ID of the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Execution ID of the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Execution ID of the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Creation Timestamp
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update Timestamp
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Task completion time dependency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DependenceFinishedTime Task completion time dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set Task completion time dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DependenceFinishedTime Task completion time dependency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get Task delivery time to the execution platform.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueStartTime Task delivery time to the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set Task delivery time to the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueStartTime Task delivery time to the execution platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get Started waiting for source time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PendingStartTime Started waiting for source time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set Started waiting for source time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PendingStartTime Started waiting for source time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get Start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionStartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionStartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Running end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionEndTime Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionEndTime Running end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Queuing time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueCostTime Queuing time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set Queuing time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueCostTime Queuing time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get Running time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionTime Running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set Running time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionTime Running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Total time spent.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllCostTime Total time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAllCostTime() {
        return this.AllCostTime;
    }

    /**
     * Set Total time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllCostTime Total time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllCostTime(String AllCostTime) {
        this.AllCostTime = AllCostTime;
    }

    /**
     * Get Time zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeZone Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeZone Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Depends on the upstream task ID list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DependOnList Depends on the upstream task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set Depends on the upstream task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DependOnList Depends on the upstream task ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDependOnList(String [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get Running parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunParams Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunParams Running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get Task extension information, including script path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeExtensions Task extension information, including script path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskTypeExtensions() {
        return this.TaskTypeExtensions;
    }

    /**
     * Set Task extension information, including script path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeExtensions Task extension information, including script path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeExtensions(String TaskTypeExtensions) {
        this.TaskTypeExtensions = TaskTypeExtensions;
    }

    /**
     * Get Retry count. it indicates the first run when set to 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetryTimes Retry count. it indicates the first run when set to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set Retry count. it indicates the first run when set to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetryTimes Retry count. it indicates the first run when set to 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get Left coordinate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LeftCoordinate Left coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set Left coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LeftCoordinate Left coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get Top coordinate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopCoordinate Top coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set Top coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopCoordinate Top coordinate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get Resource group ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupId Resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set Resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupId Resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Error code description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCodeStr Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorCodeStr Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUin Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Issue the execution platform time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssueTime Issue the execution platform time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set Issue the execution platform time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssueTime Issue the execution platform time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
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
     * Get Operator name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteUserName Operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set Operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteUserName Operator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
    }

    /**
     * Get Number of retries.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RerunTimes Number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set Number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RerunTimes Number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get Whether it is the most recent run.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsLatestExecution Whether it is the most recent run.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsLatestExecution() {
        return this.IsLatestExecution;
    }

    /**
     * Set Whether it is the most recent run.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsLatestExecution Whether it is the most recent run.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLatestExecution(Boolean IsLatestExecution) {
        this.IsLatestExecution = IsLatestExecution;
    }

    /**
     * Get Task running status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskExecutionState Task running status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskExecutionState() {
        return this.TaskExecutionState;
    }

    /**
     * Set Task running status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskExecutionState Task running status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskExecutionState(String TaskExecutionState) {
        this.TaskExecutionState = TaskExecutionState;
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
     * Get Responsible person id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserUinInCharge Responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set Responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserUinInCharge Responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get Resource group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupName Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupName Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get Time zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timezone Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timezone Time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get Folder ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderId Folder ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderId Folder ID
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
     * Get Project name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Task type id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Workflow running parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowParams Workflow running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowParams Workflow running parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
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
     * Get Workflow execution status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionState Workflow execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowExecutionState() {
        return this.WorkflowExecutionState;
    }

    /**
     * Set Workflow execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionState Workflow execution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionState(String WorkflowExecutionState) {
        this.WorkflowExecutionState = WorkflowExecutionState;
    }

    /**
     * Get Task execution result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionResult Task execution result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionResult() {
        return this.ExecutionResult;
    }

    /**
     * Set Task execution result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionResult Task execution result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionResult(String ExecutionResult) {
        this.ExecutionResult = ExecutionResult;
    }

    public TriggerTaskRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskRunBrief(TriggerTaskRunBrief source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskVersionId != null) {
            this.TaskVersionId = new String(source.TaskVersionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.CreaterUin != null) {
            this.CreaterUin = new String(source.CreaterUin);
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
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.AllCostTime != null) {
            this.AllCostTime = new String(source.AllCostTime);
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
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ExecuteUserName != null) {
            this.ExecuteUserName = new String(source.ExecuteUserName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.IsLatestExecution != null) {
            this.IsLatestExecution = new Boolean(source.IsLatestExecution);
        }
        if (source.TaskExecutionState != null) {
            this.TaskExecutionState = new String(source.TaskExecutionState);
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
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.SupportRerun != null) {
            this.SupportRerun = new Boolean(source.SupportRerun);
        }
        if (source.WorkflowExecutionState != null) {
            this.WorkflowExecutionState = new String(source.WorkflowExecutionState);
        }
        if (source.ExecutionResult != null) {
            this.ExecutionResult = new String(source.ExecutionResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "CreaterUin", this.CreaterUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DependenceFinishedTime", this.DependenceFinishedTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "AllCostTime", this.AllCostTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "TaskTypeExtensions", this.TaskTypeExtensions);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ExecuteUserName", this.ExecuteUserName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "IsLatestExecution", this.IsLatestExecution);
        this.setParamSimple(map, prefix + "TaskExecutionState", this.TaskExecutionState);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "WorkflowExecutionState", this.WorkflowExecutionState);
        this.setParamSimple(map, prefix + "ExecutionResult", this.ExecutionResult);

    }
}

