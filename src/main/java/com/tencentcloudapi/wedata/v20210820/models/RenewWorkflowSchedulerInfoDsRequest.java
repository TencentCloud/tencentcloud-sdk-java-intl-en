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

public class RenewWorkflowSchedulerInfoDsRequest extends AbstractModel {

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
    * Delay Time
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
    * Task Dependency
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specified Running Time
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Scheduling Cycle Time Unit
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Scheduling Cycle
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Execution Time Left Closed Interval
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution Time Right Closed Interval
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Task initialization strategy. valid values: T_PLUS_1, T_PLUS_0, T_MINUS_1
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * Workflow dependency. valid values: yes or no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * CrontabExpression
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 0: Do not modify 
1: Change the upstream dependency configuration of the task to the default value
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * Whether calendar scheduling is enabled. 1 means enabled, and 0 means disabled.
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * Calendar name.
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * Calendar id.
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * Specifies the time zone.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * Whether to automatically clean up links to unsupported tasks.
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

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
     * Get Delay Time 
     * @return DelayTime Delay Time
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delay Time
     * @param DelayTime Delay Time
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
     * Get Task Dependency 
     * @return SelfDepend Task Dependency
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set Task Dependency
     * @param SelfDepend Task Dependency
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Start Time 
     * @return StartTime Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time
     * @param StartTime Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End Time 
     * @return EndTime End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time
     * @param EndTime End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specified Running Time 
     * @return TaskAction Specified Running Time
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Specified Running Time
     * @param TaskAction Specified Running Time
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Scheduling Cycle Time Unit 
     * @return CycleType Scheduling Cycle Time Unit
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Scheduling Cycle Time Unit
     * @param CycleType Scheduling Cycle Time Unit
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Scheduling Cycle 
     * @return CycleStep Scheduling Cycle
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Scheduling Cycle
     * @param CycleStep Scheduling Cycle
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Execution Time Left Closed Interval 
     * @return ExecutionStartTime Execution Time Left Closed Interval
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution Time Left Closed Interval
     * @param ExecutionStartTime Execution Time Left Closed Interval
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution Time Right Closed Interval 
     * @return ExecutionEndTime Execution Time Right Closed Interval
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution Time Right Closed Interval
     * @param ExecutionEndTime Execution Time Right Closed Interval
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Task initialization strategy. valid values: T_PLUS_1, T_PLUS_0, T_MINUS_1 
     * @return InstanceInitStrategy Task initialization strategy. valid values: T_PLUS_1, T_PLUS_0, T_MINUS_1
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Task initialization strategy. valid values: T_PLUS_1, T_PLUS_0, T_MINUS_1
     * @param InstanceInitStrategy Task initialization strategy. valid values: T_PLUS_1, T_PLUS_0, T_MINUS_1
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get Workflow dependency. valid values: yes or no 
     * @return DependencyWorkflow Workflow dependency. valid values: yes or no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Workflow dependency. valid values: yes or no
     * @param DependencyWorkflow Workflow dependency. valid values: yes or no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get CrontabExpression 
     * @return CrontabExpression CrontabExpression
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set CrontabExpression
     * @param CrontabExpression CrontabExpression
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 0: Do not modify 
1: Change the upstream dependency configuration of the task to the default value 
     * @return ModifyCycleValue 0: Do not modify 
1: Change the upstream dependency configuration of the task to the default value
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set 0: Do not modify 
1: Change the upstream dependency configuration of the task to the default value
     * @param ModifyCycleValue 0: Do not modify 
1: Change the upstream dependency configuration of the task to the default value
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get Whether calendar scheduling is enabled. 1 means enabled, and 0 means disabled. 
     * @return CalendarOpen Whether calendar scheduling is enabled. 1 means enabled, and 0 means disabled.
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set Whether calendar scheduling is enabled. 1 means enabled, and 0 means disabled.
     * @param CalendarOpen Whether calendar scheduling is enabled. 1 means enabled, and 0 means disabled.
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get Calendar name. 
     * @return CalendarName Calendar name.
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set Calendar name.
     * @param CalendarName Calendar name.
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get Calendar id. 
     * @return CalendarId Calendar id.
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set Calendar id.
     * @param CalendarId Calendar id.
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get Specifies the time zone. 
     * @return ScheduleTimeZone Specifies the time zone.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Specifies the time zone.
     * @param ScheduleTimeZone Specifies the time zone.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get Whether to automatically clean up links to unsupported tasks. 
     * @return ClearLink Whether to automatically clean up links to unsupported tasks.
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set Whether to automatically clean up links to unsupported tasks.
     * @param ClearLink Whether to automatically clean up links to unsupported tasks.
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    public RenewWorkflowSchedulerInfoDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewWorkflowSchedulerInfoDsRequest(RenewWorkflowSchedulerInfoDsRequest source) {
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
            this.SelfDepend = new String(source.SelfDepend);
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
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ModifyCycleValue != null) {
            this.ModifyCycleValue = new String(source.ModifyCycleValue);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarName != null) {
            this.CalendarName = new String(source.CalendarName);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.ClearLink != null) {
            this.ClearLink = new Boolean(source.ClearLink);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ModifyCycleValue", this.ModifyCycleValue);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "ClearLink", this.ClearLink);

    }
}

