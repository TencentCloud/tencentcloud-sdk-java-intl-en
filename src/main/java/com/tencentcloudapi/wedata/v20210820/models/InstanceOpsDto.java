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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceOpsDto extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Owner
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Data Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Next Data Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NextCurDate")
    @Expose
    private String NextCurDate;

    /**
    * Running Priority
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * Number of Attempts
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * Current Running Times
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * Total Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalRunNum")
    @Expose
    private Long TotalRunNum;

    /**
    * Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DoFlag")
    @Expose
    private Long DoFlag;

    /**
    * Whether it is a Retry
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RedoFlag")
    @Expose
    private Long RedoFlag;

    /**
    * Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Run Node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeBroker")
    @Expose
    private String RuntimeBroker;

    /**
    * Reason for Failure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * Task TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * Dependency Judgment Completion Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependenceFulfillTime")
    @Expose
    private String DependenceFulfillTime;

    /**
    * First Dependency Judgment Pass Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstDependenceFulfillTime")
    @Expose
    private String FirstDependenceFulfillTime;

    /**
    * Initial startup time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstStartTime")
    @Expose
    private String FirstStartTime;

    /**
    * Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operation completion time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * Elapsed time (ms)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CostMillisecond")
    @Expose
    private Long CostMillisecond;

    /**
    * Maximum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Long MaxCostTime;

    /**
    * Minimum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MinCostTime")
    @Expose
    private Long MinCostTime;

    /**
    * Average operation duration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AvgCostTime")
    @Expose
    private Float AvgCostTime;

    /**
    * Recent logs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastLog")
    @Expose
    private String LastLog;

    /**
    * Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerDateTime")
    @Expose
    private String SchedulerDateTime;

    /**
    * Last scheduling time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastSchedulerDateTime")
    @Expose
    private String LastSchedulerDateTime;

    /**
    * Last update event
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Branch, Dependency Relationship and,or
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * Execution space
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private String ExecutionSpace;

    /**
    * Ignore events
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IgnoreEvent")
    @Expose
    private Boolean IgnoreEvent;

    /**
    * Virtual Task Instance
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Recursive Instance Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SonList")
    @Expose
    private String SonList;

    /**
    * Product Business Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Resource Group Specified Execution Node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * Resource Queue
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * Scheduling Plan
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project Identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Project nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Instance Identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * Associated Instance Information.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RelatedInstanceList")
    @Expose
    private InstanceOpsDto [] RelatedInstanceList;

    /**
    * Associated Instance Information Quantity, not strongly associated with RelatedInstanceList.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RelatedInstanceSize")
    @Expose
    private Long RelatedInstanceSize;

    /**
    * ownerId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * User ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceLifeCycleOpsDto")
    @Expose
    private InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto;

    /**
    * Automatic Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RetryAttempts")
    @Expose
    private Long RetryAttempts;

    /**
    * Urgently Removed Dependency Parent Instance List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeletedFatherList")
    @Expose
    private String [] DeletedFatherList;

    /**
    * Cyclic Dependency Associated Instances
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CirculateInstanceList")
    @Expose
    private InstanceOpsDto [] CirculateInstanceList;

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Owner
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Owner
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Cycle Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Data Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunDate Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunDate Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Next Data Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NextCurDate Next Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNextCurDate() {
        return this.NextCurDate;
    }

    /**
     * Set Next Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NextCurDate Next Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNextCurDate(String NextCurDate) {
        this.NextCurDate = NextCurDate;
    }

    /**
     * Get Running Priority
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RunPriority Running Priority
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set Running Priority
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RunPriority Running Priority
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get Number of Attempts
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TryLimit Number of Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Number of Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TryLimit Number of Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get Current Running Times
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tries Current Running Times
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Current Running Times
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tries Current Running Times
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Total Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalRunNum Total Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalRunNum() {
        return this.TotalRunNum;
    }

    /**
     * Set Total Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalRunNum Total Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalRunNum(Long TotalRunNum) {
        this.TotalRunNum = TotalRunNum;
    }

    /**
     * Get Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DoFlag Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDoFlag() {
        return this.DoFlag;
    }

    /**
     * Set Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DoFlag Whether to Supplement
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDoFlag(Long DoFlag) {
        this.DoFlag = DoFlag;
    }

    /**
     * Get Whether it is a Retry
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RedoFlag Whether it is a Retry
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRedoFlag() {
        return this.RedoFlag;
    }

    /**
     * Set Whether it is a Retry
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RedoFlag Whether it is a Retry
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRedoFlag(Long RedoFlag) {
        this.RedoFlag = RedoFlag;
    }

    /**
     * Get Instance StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return State Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param State Instance StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Run Node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuntimeBroker Run Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuntimeBroker() {
        return this.RuntimeBroker;
    }

    /**
     * Set Run Node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuntimeBroker Run Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuntimeBroker(String RuntimeBroker) {
        this.RuntimeBroker = RuntimeBroker;
    }

    /**
     * Get Reason for Failure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorDesc Reason for Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Reason for Failure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorDesc Reason for Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get Task TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskType Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskTypeOpsDto getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskType Task TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskType(TaskTypeOpsDto TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Dependency Judgment Completion Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependenceFulfillTime Dependency Judgment Completion Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDependenceFulfillTime() {
        return this.DependenceFulfillTime;
    }

    /**
     * Set Dependency Judgment Completion Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependenceFulfillTime Dependency Judgment Completion Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependenceFulfillTime(String DependenceFulfillTime) {
        this.DependenceFulfillTime = DependenceFulfillTime;
    }

    /**
     * Get First Dependency Judgment Pass Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstDependenceFulfillTime First Dependency Judgment Pass Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstDependenceFulfillTime() {
        return this.FirstDependenceFulfillTime;
    }

    /**
     * Set First Dependency Judgment Pass Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstDependenceFulfillTime First Dependency Judgment Pass Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstDependenceFulfillTime(String FirstDependenceFulfillTime) {
        this.FirstDependenceFulfillTime = FirstDependenceFulfillTime;
    }

    /**
     * Get Initial startup time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstStartTime Initial startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstStartTime() {
        return this.FirstStartTime;
    }

    /**
     * Set Initial startup time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstStartTime Initial startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstStartTime(String FirstStartTime) {
        this.FirstStartTime = FirstStartTime;
    }

    /**
     * Get Start startup time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start startup time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operation completion time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Operation completion time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Operation completion time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Operation completion time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Time Consumed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Elapsed time (ms)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CostMillisecond Elapsed time (ms)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCostMillisecond() {
        return this.CostMillisecond;
    }

    /**
     * Set Elapsed time (ms)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CostMillisecond Elapsed time (ms)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCostMillisecond(Long CostMillisecond) {
        this.CostMillisecond = CostMillisecond;
    }

    /**
     * Get Maximum operation duration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MaxCostTime Maximum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set Maximum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MaxCostTime Maximum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMaxCostTime(Long MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get Minimum operation duration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MinCostTime Minimum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set Minimum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MinCostTime Minimum operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMinCostTime(Long MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get Average operation duration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AvgCostTime Average operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getAvgCostTime() {
        return this.AvgCostTime;
    }

    /**
     * Set Average operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AvgCostTime Average operation duration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAvgCostTime(Float AvgCostTime) {
        this.AvgCostTime = AvgCostTime;
    }

    /**
     * Get Recent logs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastLog Recent logs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastLog() {
        return this.LastLog;
    }

    /**
     * Set Recent logs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastLog Recent logs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastLog(String LastLog) {
        this.LastLog = LastLog;
    }

    /**
     * Get Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerDateTime Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerDateTime() {
        return this.SchedulerDateTime;
    }

    /**
     * Set Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerDateTime Scheduling Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerDateTime(String SchedulerDateTime) {
        this.SchedulerDateTime = SchedulerDateTime;
    }

    /**
     * Get Last scheduling time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastSchedulerDateTime Last scheduling time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastSchedulerDateTime() {
        return this.LastSchedulerDateTime;
    }

    /**
     * Set Last scheduling time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastSchedulerDateTime Last scheduling time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastSchedulerDateTime(String LastSchedulerDateTime) {
        this.LastSchedulerDateTime = LastSchedulerDateTime;
    }

    /**
     * Get Last update event
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastUpdate Last update event
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set Last update event
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastUpdate Last update event
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Branch, Dependency Relationship and,or
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependencyRel Branch, Dependency Relationship and,or
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set Branch, Dependency Relationship and,or
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependencyRel Branch, Dependency Relationship and,or
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get Execution space
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionSpace Execution space
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set Execution space
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionSpace Execution space
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionSpace(String ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get Ignore events
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IgnoreEvent Ignore events
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIgnoreEvent() {
        return this.IgnoreEvent;
    }

    /**
     * Set Ignore events
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IgnoreEvent Ignore events
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIgnoreEvent(Boolean IgnoreEvent) {
        this.IgnoreEvent = IgnoreEvent;
    }

    /**
     * Get Virtual Task Instance
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualFlag Virtual Task Instance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set Virtual Task Instance
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualFlag Virtual Task Instance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get Folder ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Folder Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderName Folder Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FolderName Folder Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Recursive Instance Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SonList Recursive Instance Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSonList() {
        return this.SonList;
    }

    /**
     * Set Recursive Instance Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SonList Recursive Instance Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSonList(String SonList) {
        this.SonList = SonList;
    }

    /**
     * Get Product Business Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProductName Product Business Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product Business Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProductName Product Business Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Resource Group
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceGroup Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceGroup Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Resource Group Specified Execution Node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceInstanceId Resource Group Specified Execution Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set Resource Group Specified Execution Node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceInstanceId Resource Group Specified Execution Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get Resource Queue
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return YarnQueue Resource Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set Resource Queue
Note: This field may return null, indicating that no valid value can be obtained.
     * @param YarnQueue Resource Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get Scheduling Plan
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerDesc Scheduling Plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set Scheduling Plan
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerDesc Scheduling Plan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstSubmitTime Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstSubmitTime Latest Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get First Execution Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstRunTime First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstRunTime First Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project Identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectIdent Project Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectIdent Project Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get Project nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Tenant ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TenantId Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TenantId Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Instance Identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceKey Instance Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceKey Instance Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupId Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupId Resource Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupName Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupName Resource Group Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get Associated Instance Information.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RelatedInstanceList Associated Instance Information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceOpsDto [] getRelatedInstanceList() {
        return this.RelatedInstanceList;
    }

    /**
     * Set Associated Instance Information.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RelatedInstanceList Associated Instance Information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRelatedInstanceList(InstanceOpsDto [] RelatedInstanceList) {
        this.RelatedInstanceList = RelatedInstanceList;
    }

    /**
     * Get Associated Instance Information Quantity, not strongly associated with RelatedInstanceList.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RelatedInstanceSize Associated Instance Information Quantity, not strongly associated with RelatedInstanceList.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRelatedInstanceSize() {
        return this.RelatedInstanceSize;
    }

    /**
     * Set Associated Instance Information Quantity, not strongly associated with RelatedInstanceList.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RelatedInstanceSize Associated Instance Information Quantity, not strongly associated with RelatedInstanceList.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRelatedInstanceSize(Long RelatedInstanceSize) {
        this.RelatedInstanceSize = RelatedInstanceSize;
    }

    /**
     * Get ownerId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerId ownerId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set ownerId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerId ownerId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceLifeCycleOpsDto Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceLifeCycleOpsDto getInstanceLifeCycleOpsDto() {
        return this.InstanceLifeCycleOpsDto;
    }

    /**
     * Set Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceLifeCycleOpsDto Instance LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceLifeCycleOpsDto(InstanceLifeCycleOpsDto InstanceLifeCycleOpsDto) {
        this.InstanceLifeCycleOpsDto = InstanceLifeCycleOpsDto;
    }

    /**
     * Get Automatic Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RetryAttempts Automatic Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRetryAttempts() {
        return this.RetryAttempts;
    }

    /**
     * Set Automatic Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RetryAttempts Automatic Retry Attempts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRetryAttempts(Long RetryAttempts) {
        this.RetryAttempts = RetryAttempts;
    }

    /**
     * Get Urgently Removed Dependency Parent Instance List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DeletedFatherList Urgently Removed Dependency Parent Instance List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getDeletedFatherList() {
        return this.DeletedFatherList;
    }

    /**
     * Set Urgently Removed Dependency Parent Instance List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DeletedFatherList Urgently Removed Dependency Parent Instance List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeletedFatherList(String [] DeletedFatherList) {
        this.DeletedFatherList = DeletedFatherList;
    }

    /**
     * Get Cyclic Dependency Associated Instances
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CirculateInstanceList Cyclic Dependency Associated Instances
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceOpsDto [] getCirculateInstanceList() {
        return this.CirculateInstanceList;
    }

    /**
     * Set Cyclic Dependency Associated Instances
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CirculateInstanceList Cyclic Dependency Associated Instances
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCirculateInstanceList(InstanceOpsDto [] CirculateInstanceList) {
        this.CirculateInstanceList = CirculateInstanceList;
    }

    public InstanceOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceOpsDto(InstanceOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.NextCurDate != null) {
            this.NextCurDate = new String(source.NextCurDate);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.TotalRunNum != null) {
            this.TotalRunNum = new Long(source.TotalRunNum);
        }
        if (source.DoFlag != null) {
            this.DoFlag = new Long(source.DoFlag);
        }
        if (source.RedoFlag != null) {
            this.RedoFlag = new Long(source.RedoFlag);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RuntimeBroker != null) {
            this.RuntimeBroker = new String(source.RuntimeBroker);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
        if (source.DependenceFulfillTime != null) {
            this.DependenceFulfillTime = new String(source.DependenceFulfillTime);
        }
        if (source.FirstDependenceFulfillTime != null) {
            this.FirstDependenceFulfillTime = new String(source.FirstDependenceFulfillTime);
        }
        if (source.FirstStartTime != null) {
            this.FirstStartTime = new String(source.FirstStartTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
        if (source.CostMillisecond != null) {
            this.CostMillisecond = new Long(source.CostMillisecond);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Long(source.MaxCostTime);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Long(source.MinCostTime);
        }
        if (source.AvgCostTime != null) {
            this.AvgCostTime = new Float(source.AvgCostTime);
        }
        if (source.LastLog != null) {
            this.LastLog = new String(source.LastLog);
        }
        if (source.SchedulerDateTime != null) {
            this.SchedulerDateTime = new String(source.SchedulerDateTime);
        }
        if (source.LastSchedulerDateTime != null) {
            this.LastSchedulerDateTime = new String(source.LastSchedulerDateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DependencyRel != null) {
            this.DependencyRel = new String(source.DependencyRel);
        }
        if (source.ExecutionSpace != null) {
            this.ExecutionSpace = new String(source.ExecutionSpace);
        }
        if (source.IgnoreEvent != null) {
            this.IgnoreEvent = new Boolean(source.IgnoreEvent);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.SonList != null) {
            this.SonList = new String(source.SonList);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ResourceInstanceId != null) {
            this.ResourceInstanceId = new String(source.ResourceInstanceId);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.RelatedInstanceList != null) {
            this.RelatedInstanceList = new InstanceOpsDto[source.RelatedInstanceList.length];
            for (int i = 0; i < source.RelatedInstanceList.length; i++) {
                this.RelatedInstanceList[i] = new InstanceOpsDto(source.RelatedInstanceList[i]);
            }
        }
        if (source.RelatedInstanceSize != null) {
            this.RelatedInstanceSize = new Long(source.RelatedInstanceSize);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.InstanceLifeCycleOpsDto != null) {
            this.InstanceLifeCycleOpsDto = new InstanceLifeCycleOpsDto(source.InstanceLifeCycleOpsDto);
        }
        if (source.RetryAttempts != null) {
            this.RetryAttempts = new Long(source.RetryAttempts);
        }
        if (source.DeletedFatherList != null) {
            this.DeletedFatherList = new String[source.DeletedFatherList.length];
            for (int i = 0; i < source.DeletedFatherList.length; i++) {
                this.DeletedFatherList[i] = new String(source.DeletedFatherList[i]);
            }
        }
        if (source.CirculateInstanceList != null) {
            this.CirculateInstanceList = new InstanceOpsDto[source.CirculateInstanceList.length];
            for (int i = 0; i < source.CirculateInstanceList.length; i++) {
                this.CirculateInstanceList[i] = new InstanceOpsDto(source.CirculateInstanceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "NextCurDate", this.NextCurDate);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "TotalRunNum", this.TotalRunNum);
        this.setParamSimple(map, prefix + "DoFlag", this.DoFlag);
        this.setParamSimple(map, prefix + "RedoFlag", this.RedoFlag);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RuntimeBroker", this.RuntimeBroker);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "DependenceFulfillTime", this.DependenceFulfillTime);
        this.setParamSimple(map, prefix + "FirstDependenceFulfillTime", this.FirstDependenceFulfillTime);
        this.setParamSimple(map, prefix + "FirstStartTime", this.FirstStartTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CostMillisecond", this.CostMillisecond);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "AvgCostTime", this.AvgCostTime);
        this.setParamSimple(map, prefix + "LastLog", this.LastLog);
        this.setParamSimple(map, prefix + "SchedulerDateTime", this.SchedulerDateTime);
        this.setParamSimple(map, prefix + "LastSchedulerDateTime", this.LastSchedulerDateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "ExecutionSpace", this.ExecutionSpace);
        this.setParamSimple(map, prefix + "IgnoreEvent", this.IgnoreEvent);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "SonList", this.SonList);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ResourceInstanceId", this.ResourceInstanceId);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamArrayObj(map, prefix + "RelatedInstanceList.", this.RelatedInstanceList);
        this.setParamSimple(map, prefix + "RelatedInstanceSize", this.RelatedInstanceSize);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "InstanceLifeCycleOpsDto.", this.InstanceLifeCycleOpsDto);
        this.setParamSimple(map, prefix + "RetryAttempts", this.RetryAttempts);
        this.setParamArraySimple(map, prefix + "DeletedFatherList.", this.DeletedFatherList);
        this.setParamArrayObj(map, prefix + "CirculateInstanceList.", this.CirculateInstanceList);

    }
}

