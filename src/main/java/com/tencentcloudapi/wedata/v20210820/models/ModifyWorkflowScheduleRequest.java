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

public class ModifyWorkflowScheduleRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Delay time, in minutes
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
    * Workflow Dependency, yes or no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

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
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Delay time, in minutes 
     * @return DelayTime Delay time, in minutes
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delay time, in minutes
     * @param DelayTime Delay time, in minutes
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
     * Get Workflow Dependency, yes or no 
     * @return DependencyWorkflow Workflow Dependency, yes or no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Workflow Dependency, yes or no
     * @param DependencyWorkflow Workflow Dependency, yes or no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    public ModifyWorkflowScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkflowScheduleRequest(ModifyWorkflowScheduleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
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
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
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
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);

    }
}

