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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOpsDto extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Actual Workflow ID when the task is a virtual task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RealWorkflowId")
    @Expose
    private String RealWorkflowId;

    /**
    * Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

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
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest Update Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * Task StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * Scheduling Effective Date
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scheduling End Date
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Cycle Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Step Length
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Delayed Execution Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Start Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * Retry Wait Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * Whether to Retry, 1 represents retryable
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RetryAble")
    @Expose
    private Long RetryAble;

    /**
    * Scheduling Configuration - Elastic Cycle Configuration, available for Hour/Weekly/Month/Year schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Limit on Number of Runs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * Running Priority
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * Task TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * Specified Running Nodes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Minimum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MinDateTime")
    @Expose
    private String MinDateTime;

    /**
    * Maximum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxDateTime")
    @Expose
    private String MaxDateTime;

    /**
    * Runtime Timeout
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * Self-Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Left Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * Top Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * Task Remark
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * Task Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * Compute Queue
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * Latest Schedule Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * Task Start Time Calculated by cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * Scheduling Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * Compute Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Task Creator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Task Dependency Type: and, or
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependencyRel")
    @Expose
    private String DependencyRel;

    /**
    * Task Workflow Dependency: yes, no
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * Event Listening Configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventListenerConfig")
    @Expose
    private String EventListenerConfig;

    /**
    * Event-driven Configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventPublisherConfig")
    @Expose
    private String EventPublisherConfig;

    /**
    * Virtual Task Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VirtualTaskStatus")
    @Expose
    private String VirtualTaskStatus;

    /**
    * Task Dependency Edge Details
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskLinkInfo")
    @Expose
    private LinkOpsDto TaskLinkInfo;

    /**
    * Task Product TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
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
    * Main Account userId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * User userId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Updater's Nickname
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Updater's userId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * Whether to Display Workflow
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ShowWorkflow")
    @Expose
    private Boolean ShowWorkflow;

    /**
    * First Submission Time
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
    * Scheduling Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * CycleNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleNum")
    @Expose
    private Long CycleNum;

    /**
    * ExpressionsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
    * Start Date
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End Date
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * Subtask List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TasksStr")
    @Expose
    private String TasksStr;

    /**
    * Whether the Task Version Has Been Submitted
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * Resource Group IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Resource Group NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

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
     * Get Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualTaskId Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualTaskId Virtual Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualFlag Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualFlag Virtual Task Marker
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
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
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Actual Workflow ID when the task is a virtual task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RealWorkflowId Actual Workflow ID when the task is a virtual task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRealWorkflowId() {
        return this.RealWorkflowId;
    }

    /**
     * Set Actual Workflow ID when the task is a virtual task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RealWorkflowId Actual Workflow ID when the task is a virtual task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRealWorkflowId(String RealWorkflowId) {
        this.RealWorkflowId = RealWorkflowId;
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
     * Get Latest Update Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastUpdate Latest Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set Latest Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastUpdate Latest Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get Task StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InChargeId Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InChargeId Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get Scheduling Effective Date
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Scheduling Effective Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scheduling Effective Date
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Scheduling Effective Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Scheduling End Date
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Scheduling End Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Scheduling End Date
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Scheduling End Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionStartTime Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionStartTime Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionEndTime Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionEndTime Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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
     * Get Step Length
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleStep Step Length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Step Length
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleStep Step Length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CrontabExpression Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CrontabExpression Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Delayed Execution Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DelayTime Delayed Execution Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed Execution Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DelayTime Delayed Execution Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Start Execution Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartupTime Start Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set Start Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartupTime Start Execution Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get Retry Wait Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RetryWait Retry Wait Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set Retry Wait Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RetryWait Retry Wait Time, unit=minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get Whether to Retry, 1 represents retryable
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RetryAble Whether to Retry, 1 represents retryable
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRetryAble() {
        return this.RetryAble;
    }

    /**
     * Set Whether to Retry, 1 represents retryable
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RetryAble Whether to Retry, 1 represents retryable
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRetryAble(Long RetryAble) {
        this.RetryAble = RetryAble;
    }

    /**
     * Get Scheduling Configuration - Elastic Cycle Configuration, available for Hour/Weekly/Month/Year schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Scheduling Configuration - Elastic Cycle Configuration, available for Hour/Weekly/Month/Year schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Scheduling Configuration - Elastic Cycle Configuration, available for Hour/Weekly/Month/Year schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Scheduling Configuration - Elastic Cycle Configuration, available for Hour/Weekly/Month/Year schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Limit on Number of Runs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TryLimit Limit on Number of Runs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Limit on Number of Runs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TryLimit Limit on Number of Runs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
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
     * Get Specified Running Nodes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BrokerIp Specified Running Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Specified Running Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BrokerIp Specified Running Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Cluster Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterId Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Minimum Data Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MinDateTime Minimum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMinDateTime() {
        return this.MinDateTime;
    }

    /**
     * Set Minimum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MinDateTime Minimum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMinDateTime(String MinDateTime) {
        this.MinDateTime = MinDateTime;
    }

    /**
     * Get Maximum Data Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MaxDateTime Maximum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMaxDateTime() {
        return this.MaxDateTime;
    }

    /**
     * Set Maximum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MaxDateTime Maximum Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMaxDateTime(String MaxDateTime) {
        this.MaxDateTime = MaxDateTime;
    }

    /**
     * Get Runtime Timeout
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionTTL Runtime Timeout
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set Runtime Timeout
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionTTL Runtime Timeout
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get Self-Dependency Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SelfDepend Self-Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set Self-Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SelfDepend Self-Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Left Coordinate
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LeftCoordinate Left Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set Left Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LeftCoordinate Left Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get Top Coordinate
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TopCoordinate Top Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set Top Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TopCoordinate Top Coordinate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get Task Remark
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Notes Task Remark
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set Task Remark
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Notes Task Remark
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get Task Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceInitStrategy Task Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Task Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceInitStrategy Task Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get Compute Queue
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return YarnQueue Compute Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set Compute Queue
Note: This field may return null, indicating that no valid value can be obtained.
     * @param YarnQueue Compute Queue
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get Latest Schedule Submission Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastSchedulerCommitTime Latest Schedule Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set Latest Schedule Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastSchedulerCommitTime Latest Schedule Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get Task Start Time Calculated by cron Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NormalizedJobStartTime Task Start Time Calculated by cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set Task Start Time Calculated by cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NormalizedJobStartTime Task Start Time Calculated by cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get Scheduling Plan Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerDesc Scheduling Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set Scheduling Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerDesc Scheduling Plan Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get Compute Resource Group
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceGroup Compute Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Compute Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceGroup Compute Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Task Creator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Creator Task Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Task Creator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Creator Task Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Task Dependency Type: and, or
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependencyRel Task Dependency Type: and, or
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDependencyRel() {
        return this.DependencyRel;
    }

    /**
     * Set Task Dependency Type: and, or
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependencyRel Task Dependency Type: and, or
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependencyRel(String DependencyRel) {
        this.DependencyRel = DependencyRel;
    }

    /**
     * Get Task Workflow Dependency: yes, no
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependencyWorkflow Task Workflow Dependency: yes, no
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Task Workflow Dependency: yes, no
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependencyWorkflow Task Workflow Dependency: yes, no
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get Event Listening Configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventListenerConfig Event Listening Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventListenerConfig() {
        return this.EventListenerConfig;
    }

    /**
     * Set Event Listening Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventListenerConfig Event Listening Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventListenerConfig(String EventListenerConfig) {
        this.EventListenerConfig = EventListenerConfig;
    }

    /**
     * Get Event-driven Configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventPublisherConfig Event-driven Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventPublisherConfig() {
        return this.EventPublisherConfig;
    }

    /**
     * Set Event-driven Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventPublisherConfig Event-driven Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventPublisherConfig(String EventPublisherConfig) {
        this.EventPublisherConfig = EventPublisherConfig;
    }

    /**
     * Get Virtual Task Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VirtualTaskStatus Virtual Task Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVirtualTaskStatus() {
        return this.VirtualTaskStatus;
    }

    /**
     * Set Virtual Task Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VirtualTaskStatus Virtual Task Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVirtualTaskStatus(String VirtualTaskStatus) {
        this.VirtualTaskStatus = VirtualTaskStatus;
    }

    /**
     * Get Task Dependency Edge Details
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskLinkInfo Task Dependency Edge Details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public LinkOpsDto getTaskLinkInfo() {
        return this.TaskLinkInfo;
    }

    /**
     * Set Task Dependency Edge Details
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskLinkInfo Task Dependency Edge Details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskLinkInfo(LinkOpsDto TaskLinkInfo) {
        this.TaskLinkInfo = TaskLinkInfo;
    }

    /**
     * Get Task Product TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProductName Task Product TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Task Product TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProductName Task Product TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project IdentifierNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
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
     * Get Main Account userId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnId Main Account userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set Main Account userId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnId Main Account userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get User userId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId User userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User userId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId User userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get Updater's Nickname
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateUser Updater's Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updater's Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateUser Updater's Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Updater's userId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateUserId Updater's userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set Updater's userId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateUserId Updater's userId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get Task Type ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task Type Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTypeDesc Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTypeDesc Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get Whether to Display Workflow
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ShowWorkflow Whether to Display Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getShowWorkflow() {
        return this.ShowWorkflow;
    }

    /**
     * Set Whether to Display Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ShowWorkflow Whether to Display Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setShowWorkflow(Boolean ShowWorkflow) {
        this.ShowWorkflow = ShowWorkflow;
    }

    /**
     * Get First Submission Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstSubmitTime First Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set First Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstSubmitTime First Submission Time
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
     * Get Scheduling Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScheduleDesc Scheduling Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set Scheduling Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScheduleDesc Scheduling Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get CycleNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleNum CycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleNum() {
        return this.CycleNum;
    }

    /**
     * Set CycleNote: This field may return null, indicating that no valid value can be obtained.
     * @param CycleNum CycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleNum(Long CycleNum) {
        this.CycleNum = CycleNum;
    }

    /**
     * Get ExpressionsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Crontab ExpressionsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set ExpressionsNote: This field may return null, indicating that no valid value can be obtained.
     * @param Crontab ExpressionsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get Start Date
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartDate Start Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start Date
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartDate Start Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End Date
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndDate End Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End Date
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndDate End Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InitStrategy Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InitStrategy Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get Hierarchy
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Layer Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Layer Hierarchy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceServiceId Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceServiceId Source Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceServiceType Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceServiceType Source Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetServiceId Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetServiceId Target Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetServiceType Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetServiceType Target Data Source Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get Subtask List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TasksStr Subtask List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTasksStr() {
        return this.TasksStr;
    }

    /**
     * Set Subtask List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TasksStr Subtask List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasksStr(String TasksStr) {
        this.TasksStr = TasksStr;
    }

    /**
     * Get Whether the Task Version Has Been Submitted
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Submit Whether the Task Version Has Been Submitted
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set Whether the Task Version Has Been Submitted
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Submit Whether the Task Version Has Been Submitted
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get Resource Group IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupId Resource Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Resource Group IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupId Resource Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Resource Group NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupName Resource Group NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Resource Group NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupName Resource Group NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    public TaskOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOpsDto(TaskOpsDto source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealWorkflowId != null) {
            this.RealWorkflowId = new String(source.RealWorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.RetryAble != null) {
            this.RetryAble = new Long(source.RetryAble);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MinDateTime != null) {
            this.MinDateTime = new String(source.MinDateTime);
        }
        if (source.MaxDateTime != null) {
            this.MaxDateTime = new String(source.MaxDateTime);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.NormalizedJobStartTime != null) {
            this.NormalizedJobStartTime = new String(source.NormalizedJobStartTime);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DependencyRel != null) {
            this.DependencyRel = new String(source.DependencyRel);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.EventListenerConfig != null) {
            this.EventListenerConfig = new String(source.EventListenerConfig);
        }
        if (source.EventPublisherConfig != null) {
            this.EventPublisherConfig = new String(source.EventPublisherConfig);
        }
        if (source.VirtualTaskStatus != null) {
            this.VirtualTaskStatus = new String(source.VirtualTaskStatus);
        }
        if (source.TaskLinkInfo != null) {
            this.TaskLinkInfo = new LinkOpsDto(source.TaskLinkInfo);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
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
        if (source.OwnId != null) {
            this.OwnId = new String(source.OwnId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.ShowWorkflow != null) {
            this.ShowWorkflow = new Boolean(source.ShowWorkflow);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.CycleNum != null) {
            this.CycleNum = new Long(source.CycleNum);
        }
        if (source.Crontab != null) {
            this.Crontab = new String(source.Crontab);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.TasksStr != null) {
            this.TasksStr = new String(source.TasksStr);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealWorkflowId", this.RealWorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "RetryAble", this.RetryAble);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MinDateTime", this.MinDateTime);
        this.setParamSimple(map, prefix + "MaxDateTime", this.MaxDateTime);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "NormalizedJobStartTime", this.NormalizedJobStartTime);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "DependencyRel", this.DependencyRel);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "EventListenerConfig", this.EventListenerConfig);
        this.setParamSimple(map, prefix + "EventPublisherConfig", this.EventPublisherConfig);
        this.setParamSimple(map, prefix + "VirtualTaskStatus", this.VirtualTaskStatus);
        this.setParamObj(map, prefix + "TaskLinkInfo.", this.TaskLinkInfo);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "ShowWorkflow", this.ShowWorkflow);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "CycleNum", this.CycleNum);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "TasksStr", this.TasksStr);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);

    }
}

