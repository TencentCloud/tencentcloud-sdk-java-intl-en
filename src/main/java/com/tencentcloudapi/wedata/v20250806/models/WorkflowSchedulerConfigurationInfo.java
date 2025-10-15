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

public class WorkflowSchedulerConfigurationInfo extends AbstractModel {

    /**
    * Specifies the time zone.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * Period type. Supported types:

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Effective Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Effective End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cron expression
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Workflow dependency. Valid values: yes or no.
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 0: Do not modify
1: Reset the task's upstream dependency configuration to the default value
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * The workflow contains cross-workflow dependencies and uses a cron expression for scheduling. If unified scheduling is saved, unsupported dependencies will be disconnected.
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

    /**
    * Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency time dimension. Valid values are:
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency - instance scope. Valid values are:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * Execution time left closed interval, for example: 00:00. only required when the CycleType is MINUTE_CYCLE.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution time right closed interval, for example: 23:59. only required when the CycleType is MINUTE_CYCLE.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled).
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * Calendar id.
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

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
     * Get Period type. Supported types:

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type 
     * @return CycleType Period type. Supported types:

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Period type. Supported types:

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type
     * @param CycleType Period type. Supported types:

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial.  
     * @return SelfDepend Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
     * @param SelfDepend Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Effective Start Time 
     * @return StartTime Effective Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective Start Time
     * @param StartTime Effective Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Effective End Time 
     * @return EndTime Effective End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Effective End Time
     * @param EndTime Effective End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cron expression 
     * @return CrontabExpression Cron expression
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Cron expression
     * @param CrontabExpression Cron expression
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Workflow dependency. Valid values: yes or no. 
     * @return DependencyWorkflow Workflow dependency. Valid values: yes or no.
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Workflow dependency. Valid values: yes or no.
     * @param DependencyWorkflow Workflow dependency. Valid values: yes or no.
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 0: Do not modify
1: Reset the task's upstream dependency configuration to the default value 
     * @return ModifyCycleValue 0: Do not modify
1: Reset the task's upstream dependency configuration to the default value
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set 0: Do not modify
1: Reset the task's upstream dependency configuration to the default value
     * @param ModifyCycleValue 0: Do not modify
1: Reset the task's upstream dependency configuration to the default value
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get The workflow contains cross-workflow dependencies and uses a cron expression for scheduling. If unified scheduling is saved, unsupported dependencies will be disconnected. 
     * @return ClearLink The workflow contains cross-workflow dependencies and uses a cron expression for scheduling. If unified scheduling is saved, unsupported dependencies will be disconnected.
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set The workflow contains cross-workflow dependencies and uses a cron expression for scheduling. If unified scheduling is saved, unsupported dependencies will be disconnected.
     * @param ClearLink The workflow contains cross-workflow dependencies and uses a cron expression for scheduling. If unified scheduling is saved, unsupported dependencies will be disconnected.
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    /**
     * Get Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency time dimension. Valid values are:
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo 
     * @return MainCyclicConfig Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency time dimension. Valid values are:
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency time dimension. Valid values are:
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     * @param MainCyclicConfig Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency time dimension. Valid values are:
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency - instance scope. Valid values are:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo 
     * @return SubordinateCyclicConfig Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency - instance scope. Valid values are:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency - instance scope. Valid values are:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     * @param SubordinateCyclicConfig Takes effect when ModifyCycleValue = 1. Indicates the default modification of the upstream dependency - instance scope. Valid values are:
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get Execution time left closed interval, for example: 00:00. only required when the CycleType is MINUTE_CYCLE. 
     * @return ExecutionStartTime Execution time left closed interval, for example: 00:00. only required when the CycleType is MINUTE_CYCLE.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution time left closed interval, for example: 00:00. only required when the CycleType is MINUTE_CYCLE.
     * @param ExecutionStartTime Execution time left closed interval, for example: 00:00. only required when the CycleType is MINUTE_CYCLE.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution time right closed interval, for example: 23:59. only required when the CycleType is MINUTE_CYCLE. 
     * @return ExecutionEndTime Execution time right closed interval, for example: 23:59. only required when the CycleType is MINUTE_CYCLE.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution time right closed interval, for example: 23:59. only required when the CycleType is MINUTE_CYCLE.
     * @param ExecutionEndTime Execution time right closed interval, for example: 23:59. only required when the CycleType is MINUTE_CYCLE.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled). 
     * @return CalendarOpen Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled).
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled).
     * @param CalendarOpen Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled).
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
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

    public WorkflowSchedulerConfigurationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerConfigurationInfo(WorkflowSchedulerConfigurationInfo source) {
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
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
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.ModifyCycleValue != null) {
            this.ModifyCycleValue = new String(source.ModifyCycleValue);
        }
        if (source.ClearLink != null) {
            this.ClearLink = new Boolean(source.ClearLink);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "ModifyCycleValue", this.ModifyCycleValue);
        this.setParamSimple(map, prefix + "ClearLink", this.ClearLink);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);

    }
}

