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

public class WorkflowSchedulerConfiguration extends AbstractModel {

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
    * Effective End Time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Workflow dependency. Valid values: yes or no.
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * Execution time. specifies the left-closed interval. example: 00:00.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution time right closed interval, for example: 23:59.

    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Cron expression


    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Whether calendar scheduling is enabled. Valid values: 1 (enabled), 0 (disabled).
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
     * Get Effective End Time. 
     * @return EndTime Effective End Time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Effective End Time.
     * @param EndTime Effective End Time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get Execution time. specifies the left-closed interval. example: 00:00. 
     * @return ExecutionStartTime Execution time. specifies the left-closed interval. example: 00:00.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution time. specifies the left-closed interval. example: 00:00.
     * @param ExecutionStartTime Execution time. specifies the left-closed interval. example: 00:00.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution time right closed interval, for example: 23:59.
 
     * @return ExecutionEndTime Execution time right closed interval, for example: 23:59.

     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution time right closed interval, for example: 23:59.

     * @param ExecutionEndTime Execution time right closed interval, for example: 23:59.

     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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

    public WorkflowSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerConfiguration(WorkflowSchedulerConfiguration source) {
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
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
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
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);

    }
}

