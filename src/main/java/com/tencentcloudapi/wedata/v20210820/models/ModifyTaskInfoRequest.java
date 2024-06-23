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

public class ModifyTaskInfoRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Execution time, in minutes, applicable to daily/weekly/monthly/yearly scheduling. For example, with daily scheduling, executing once at 02:00 AM every day, delayTime is 120 minutes
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Start Time
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * Self-Dependency Type  1: Sequential serial, one at a time, queued, 2: Unordered serial, one at a time, not queued, 3: Parallel, multiple at once
    */
    @SerializedName("SelfDepend")
    @Expose
    private Long SelfDepend;

    /**
    * Effective Start Time, format yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Effective End Time, format yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Scheduling Configuration - Elastic Cycle Configuration, applicable to Hourly/Weekly/Monthly/Yearly schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * "Cycle Type  0:crontab, 1:Minute,2:Hour,3:Day,4:Week,5:Month,6:One-time,7:User driven,10:Flexible cycle Week,11:Flexible cycle Month,12:Year,13:Immediate Trigger Instant type, isolated from normal cycle scheduling task logic
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * Step Length, Interval Time, minimum of 1
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Cron Expression is required only for Cron Tab Scheduling
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Execution Time Left Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution Time Right Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * New Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Failure Retry Interval, in minutes, a default value has already been provided during task creation
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * Number of Retry Attempts on Failure, a default value has already been provided during task creation
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * Whether to Retry, 1 for yes
    */
    @SerializedName("Retriable")
    @Expose
    private Long Retriable;

    /**
    * Running Priority, 4 for High, 5 for Medium, 6 for Low
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * Extended Task Configuration
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtInfo [] TaskExt;

    /**
    * Execution Resource Group ID, needs to be created on the Resource Management Service and bind to a CVM machine
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Resource Pool Queue Name
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * Specific Execution Machine under Resource Group, 'any' means it can run on any machine.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Person in Charge
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Task notes
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * Task Parameters
    */
    @SerializedName("TaskParamInfos")
    @Expose
    private ParamInfo [] TaskParamInfos;

    /**
    * Source Data Source
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * Target Data Source
    */
    @SerializedName("TargetServer")
    @Expose
    private String TargetServer;

    /**
    * Supports Workflow Dependencies yes/no, default no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * Dependency Configuration
    */
    @SerializedName("DependencyConfigDTOs")
    @Expose
    private DependencyConfig [] DependencyConfigDTOs;

    /**
    * Execution Duration
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * Whether the Script has Changed
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
    * Responsible Person ID
    */
    @SerializedName("InChargeIds")
    @Expose
    private String [] InChargeIds;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Execution time, in minutes, applicable to daily/weekly/monthly/yearly scheduling. For example, with daily scheduling, executing once at 02:00 AM every day, delayTime is 120 minutes 
     * @return DelayTime Execution time, in minutes, applicable to daily/weekly/monthly/yearly scheduling. For example, with daily scheduling, executing once at 02:00 AM every day, delayTime is 120 minutes
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Execution time, in minutes, applicable to daily/weekly/monthly/yearly scheduling. For example, with daily scheduling, executing once at 02:00 AM every day, delayTime is 120 minutes
     * @param DelayTime Execution time, in minutes, applicable to daily/weekly/monthly/yearly scheduling. For example, with daily scheduling, executing once at 02:00 AM every day, delayTime is 120 minutes
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Start Time 
     * @return StartupTime Start Time
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set Start Time
     * @param StartupTime Start Time
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get Self-Dependency Type  1: Sequential serial, one at a time, queued, 2: Unordered serial, one at a time, not queued, 3: Parallel, multiple at once 
     * @return SelfDepend Self-Dependency Type  1: Sequential serial, one at a time, queued, 2: Unordered serial, one at a time, not queued, 3: Parallel, multiple at once
     */
    public Long getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set Self-Dependency Type  1: Sequential serial, one at a time, queued, 2: Unordered serial, one at a time, not queued, 3: Parallel, multiple at once
     * @param SelfDepend Self-Dependency Type  1: Sequential serial, one at a time, queued, 2: Unordered serial, one at a time, not queued, 3: Parallel, multiple at once
     */
    public void setSelfDepend(Long SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Effective Start Time, format yyyy-MM-dd HH:mm:ss 
     * @return StartTime Effective Start Time, format yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective Start Time, format yyyy-MM-dd HH:mm:ss
     * @param StartTime Effective Start Time, format yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Effective End Time, format yyyy-MM-dd HH:mm:ss 
     * @return EndTime Effective End Time, format yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Effective End Time, format yyyy-MM-dd HH:mm:ss
     * @param EndTime Effective End Time, format yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Scheduling Configuration - Elastic Cycle Configuration, applicable to Hourly/Weekly/Monthly/Yearly schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'. 
     * @return TaskAction Scheduling Configuration - Elastic Cycle Configuration, applicable to Hourly/Weekly/Monthly/Yearly schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Scheduling Configuration - Elastic Cycle Configuration, applicable to Hourly/Weekly/Monthly/Yearly schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'.
     * @param TaskAction Scheduling Configuration - Elastic Cycle Configuration, applicable to Hourly/Weekly/Monthly/Yearly schedules. For hourly tasks scheduled at 0, 3, 4 o'clock, it would be '0,3,4'.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get "Cycle Type  0:crontab, 1:Minute,2:Hour,3:Day,4:Week,5:Month,6:One-time,7:User driven,10:Flexible cycle Week,11:Flexible cycle Month,12:Year,13:Immediate Trigger Instant type, isolated from normal cycle scheduling task logic 
     * @return CycleType "Cycle Type  0:crontab, 1:Minute,2:Hour,3:Day,4:Week,5:Month,6:One-time,7:User driven,10:Flexible cycle Week,11:Flexible cycle Month,12:Year,13:Immediate Trigger Instant type, isolated from normal cycle scheduling task logic
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set "Cycle Type  0:crontab, 1:Minute,2:Hour,3:Day,4:Week,5:Month,6:One-time,7:User driven,10:Flexible cycle Week,11:Flexible cycle Month,12:Year,13:Immediate Trigger Instant type, isolated from normal cycle scheduling task logic
     * @param CycleType "Cycle Type  0:crontab, 1:Minute,2:Hour,3:Day,4:Week,5:Month,6:One-time,7:User driven,10:Flexible cycle Week,11:Flexible cycle Month,12:Year,13:Immediate Trigger Instant type, isolated from normal cycle scheduling task logic
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Step Length, Interval Time, minimum of 1 
     * @return CycleStep Step Length, Interval Time, minimum of 1
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Step Length, Interval Time, minimum of 1
     * @param CycleStep Step Length, Interval Time, minimum of 1
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Cron Expression is required only for Cron Tab Scheduling 
     * @return CrontabExpression Cron Expression is required only for Cron Tab Scheduling
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Cron Expression is required only for Cron Tab Scheduling
     * @param CrontabExpression Cron Expression is required only for Cron Tab Scheduling
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Execution Time Left Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day 
     * @return ExecutionStartTime Execution Time Left Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution Time Left Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     * @param ExecutionStartTime Execution Time Left Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution Time Right Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day 
     * @return ExecutionEndTime Execution Time Right Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution Time Right Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     * @param ExecutionEndTime Execution Time Right Closed Interval, format: HH:mm. Applicable only to hourly scheduling. For example, for hourly tasks, it specifies the effective interval every day
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get New Task Name 
     * @return TaskName New Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set New Task Name
     * @param TaskName New Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Failure Retry Interval, in minutes, a default value has already been provided during task creation 
     * @return RetryWait Failure Retry Interval, in minutes, a default value has already been provided during task creation
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set Failure Retry Interval, in minutes, a default value has already been provided during task creation
     * @param RetryWait Failure Retry Interval, in minutes, a default value has already been provided during task creation
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get Number of Retry Attempts on Failure, a default value has already been provided during task creation 
     * @return TryLimit Number of Retry Attempts on Failure, a default value has already been provided during task creation
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Number of Retry Attempts on Failure, a default value has already been provided during task creation
     * @param TryLimit Number of Retry Attempts on Failure, a default value has already been provided during task creation
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get Whether to Retry, 1 for yes 
     * @return Retriable Whether to Retry, 1 for yes
     */
    public Long getRetriable() {
        return this.Retriable;
    }

    /**
     * Set Whether to Retry, 1 for yes
     * @param Retriable Whether to Retry, 1 for yes
     */
    public void setRetriable(Long Retriable) {
        this.Retriable = Retriable;
    }

    /**
     * Get Running Priority, 4 for High, 5 for Medium, 6 for Low 
     * @return RunPriority Running Priority, 4 for High, 5 for Medium, 6 for Low
     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set Running Priority, 4 for High, 5 for Medium, 6 for Low
     * @param RunPriority Running Priority, 4 for High, 5 for Medium, 6 for Low
     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get Extended Task Configuration 
     * @return TaskExt Extended Task Configuration
     */
    public TaskExtInfo [] getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set Extended Task Configuration
     * @param TaskExt Extended Task Configuration
     */
    public void setTaskExt(TaskExtInfo [] TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get Execution Resource Group ID, needs to be created on the Resource Management Service and bind to a CVM machine 
     * @return ResourceGroup Execution Resource Group ID, needs to be created on the Resource Management Service and bind to a CVM machine
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Execution Resource Group ID, needs to be created on the Resource Management Service and bind to a CVM machine
     * @param ResourceGroup Execution Resource Group ID, needs to be created on the Resource Management Service and bind to a CVM machine
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Resource Pool Queue Name 
     * @return YarnQueue Resource Pool Queue Name
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set Resource Pool Queue Name
     * @param YarnQueue Resource Pool Queue Name
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get Specific Execution Machine under Resource Group, 'any' means it can run on any machine. 
     * @return BrokerIp Specific Execution Machine under Resource Group, 'any' means it can run on any machine.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Specific Execution Machine under Resource Group, 'any' means it can run on any machine.
     * @param BrokerIp Specific Execution Machine under Resource Group, 'any' means it can run on any machine.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Person in Charge 
     * @return InCharge Person in Charge
     * @deprecated
     */
    @Deprecated
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Person in Charge
     * @param InCharge Person in Charge
     * @deprecated
     */
    @Deprecated
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Task notes 
     * @return Notes Task notes
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set Task notes
     * @param Notes Task notes
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get Task Parameters 
     * @return TaskParamInfos Task Parameters
     */
    public ParamInfo [] getTaskParamInfos() {
        return this.TaskParamInfos;
    }

    /**
     * Set Task Parameters
     * @param TaskParamInfos Task Parameters
     */
    public void setTaskParamInfos(ParamInfo [] TaskParamInfos) {
        this.TaskParamInfos = TaskParamInfos;
    }

    /**
     * Get Source Data Source 
     * @return SourceServer Source Data Source
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set Source Data Source
     * @param SourceServer Source Data Source
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get Target Data Source 
     * @return TargetServer Target Data Source
     */
    public String getTargetServer() {
        return this.TargetServer;
    }

    /**
     * Set Target Data Source
     * @param TargetServer Target Data Source
     */
    public void setTargetServer(String TargetServer) {
        this.TargetServer = TargetServer;
    }

    /**
     * Get Supports Workflow Dependencies yes/no, default no 
     * @return DependencyWorkflow Supports Workflow Dependencies yes/no, default no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Supports Workflow Dependencies yes/no, default no
     * @param DependencyWorkflow Supports Workflow Dependencies yes/no, default no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get Dependency Configuration 
     * @return DependencyConfigDTOs Dependency Configuration
     */
    public DependencyConfig [] getDependencyConfigDTOs() {
        return this.DependencyConfigDTOs;
    }

    /**
     * Set Dependency Configuration
     * @param DependencyConfigDTOs Dependency Configuration
     */
    public void setDependencyConfigDTOs(DependencyConfig [] DependencyConfigDTOs) {
        this.DependencyConfigDTOs = DependencyConfigDTOs;
    }

    /**
     * Get Execution Duration 
     * @return ExecutionTTL Execution Duration
     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set Execution Duration
     * @param ExecutionTTL Execution Duration
     */
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get Whether the Script has Changed 
     * @return ScriptChange Whether the Script has Changed
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set Whether the Script has Changed
     * @param ScriptChange Whether the Script has Changed
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
    }

    /**
     * Get Responsible Person ID 
     * @return InChargeIds Responsible Person ID
     */
    public String [] getInChargeIds() {
        return this.InChargeIds;
    }

    /**
     * Set Responsible Person ID
     * @param InChargeIds Responsible Person ID
     */
    public void setInChargeIds(String [] InChargeIds) {
        this.InChargeIds = InChargeIds;
    }

    public ModifyTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskInfoRequest(ModifyTaskInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new Long(source.SelfDepend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Retriable != null) {
            this.Retriable = new Long(source.Retriable);
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.TaskExt != null) {
            this.TaskExt = new TaskExtInfo[source.TaskExt.length];
            for (int i = 0; i < source.TaskExt.length; i++) {
                this.TaskExt[i] = new TaskExtInfo(source.TaskExt[i]);
            }
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.TaskParamInfos != null) {
            this.TaskParamInfos = new ParamInfo[source.TaskParamInfos.length];
            for (int i = 0; i < source.TaskParamInfos.length; i++) {
                this.TaskParamInfos[i] = new ParamInfo(source.TaskParamInfos[i]);
            }
        }
        if (source.SourceServer != null) {
            this.SourceServer = new String(source.SourceServer);
        }
        if (source.TargetServer != null) {
            this.TargetServer = new String(source.TargetServer);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.DependencyConfigDTOs != null) {
            this.DependencyConfigDTOs = new DependencyConfig[source.DependencyConfigDTOs.length];
            for (int i = 0; i < source.DependencyConfigDTOs.length; i++) {
                this.DependencyConfigDTOs[i] = new DependencyConfig(source.DependencyConfigDTOs[i]);
            }
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
        if (source.ScriptChange != null) {
            this.ScriptChange = new Boolean(source.ScriptChange);
        }
        if (source.InChargeIds != null) {
            this.InChargeIds = new String[source.InChargeIds.length];
            for (int i = 0; i < source.InChargeIds.length; i++) {
                this.InChargeIds[i] = new String(source.InChargeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Retriable", this.Retriable);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamArrayObj(map, prefix + "TaskExt.", this.TaskExt);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamArrayObj(map, prefix + "TaskParamInfos.", this.TaskParamInfos);
        this.setParamSimple(map, prefix + "SourceServer", this.SourceServer);
        this.setParamSimple(map, prefix + "TargetServer", this.TargetServer);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamArrayObj(map, prefix + "DependencyConfigDTOs.", this.DependencyConfigDTOs);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "ScriptChange", this.ScriptChange);
        this.setParamArraySimple(map, prefix + "InChargeIds.", this.InChargeIds);

    }
}

