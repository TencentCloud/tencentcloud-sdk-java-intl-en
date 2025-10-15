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

public class CreateTaskSchedulerConfiguration extends AbstractModel {

    /**
    * Period type: defaults to DAY_CYCLE.

Supported types. 

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Time zone, defaults to UTC+8.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * Cron expression, defaults to 0 0 0 * * ? *.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Effective date, defaults to 00:00:00 of the current date.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date, defaults to 2099-12-31 23:59:59.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Execution time: the left-closed interval. Default: 00:00.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution time: the right closed interval. Default: 23:59.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling. Default is 0.
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private String ScheduleRunType;

    /**
    * Calendar scheduling value: 0 or 1, where 1 means ON and 0 means OFF. Default is 0.
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * Calendar scheduling:  the calendar ID.
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Specifies the upstream dependency list.
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] UpstreamDependencyConfigList;

    /**
    * List of Events
    */
    @SerializedName("EventListenerList")
    @Expose
    private EventListener [] EventListenerList;

    /**
    * Task scheduling priority. Valid values: 4 (high), 5 (medium), 6 (low). Default: 6.
    */
    @SerializedName("RunPriority")
    @Expose
    private String RunPriority;

    /**
    * Retry Policy: Retry Wait Time (in minutes): Default 5
    */
    @SerializedName("RetryWait")
    @Expose
    private String RetryWait;

    /**
    * Retry Policy: maximum attempts. Default: 4.
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private String MaxRetryAttempts;

    /**
    * Timeout Handling Policy: Execution Timeout (in minutes), default: -1
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private String ExecutionTTL;

    /**
    * Timeout Handling Policy: Wait Duration Timeout  (in minutes), default: -1
    */
    @SerializedName("WaitExecutionTotalTTL")
    @Expose
    private String WaitExecutionTotalTTL;

    /**
    * Rerun & Refill Configuration: Default: ALL;

* ALL: Rerun or refill is allowed regardless of whether the task succeeds or fails.

* FAILURE: Rerun or refill is allowed only if the task fails; not allowed if the task succeeds.

* NONE: Rerun or refill is not allowed regardless of success or failure.
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * Output parameter list.
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * Input parameter list.
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * Output registration.
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
    * **Instance generation policy**.
T_PLUS_0: specifies t+0 generation. default policy.
T_PLUS_1: specifies t+1 generation.
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
     * Get Period type: defaults to DAY_CYCLE.

Supported types. 

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type. 
     * @return CycleType Period type: defaults to DAY_CYCLE.

Supported types. 

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Period type: defaults to DAY_CYCLE.

Supported types. 

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type.
     * @param CycleType Period type: defaults to DAY_CYCLE.

Supported types. 

ONEOFF_CYCLE: specifies a one-time cycle.
YEAR_CYCLE: specifies the year cycle.
MONTH_CYCLE: specifies the monthly cycle.
WEEK_CYCLE: specifies the week cycle.
DAY_CYCLE: specifies the day cycle.
HOUR_CYCLE: specifies the hour cycle.
MINUTE_CYCLE: specifies the minute cycle.
CRONTAB_CYCLE: specifies the crontab expression type.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Time zone, defaults to UTC+8. 
     * @return ScheduleTimeZone Time zone, defaults to UTC+8.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Time zone, defaults to UTC+8.
     * @param ScheduleTimeZone Time zone, defaults to UTC+8.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get Cron expression, defaults to 0 0 0 * * ? *. 
     * @return CrontabExpression Cron expression, defaults to 0 0 0 * * ? *.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Cron expression, defaults to 0 0 0 * * ? *.
     * @param CrontabExpression Cron expression, defaults to 0 0 0 * * ? *.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Effective date, defaults to 00:00:00 of the current date. 
     * @return StartTime Effective date, defaults to 00:00:00 of the current date.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective date, defaults to 00:00:00 of the current date.
     * @param StartTime Effective date, defaults to 00:00:00 of the current date.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date, defaults to 2099-12-31 23:59:59. 
     * @return EndTime End date, defaults to 2099-12-31 23:59:59.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date, defaults to 2099-12-31 23:59:59.
     * @param EndTime End date, defaults to 2099-12-31 23:59:59.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Execution time: the left-closed interval. Default: 00:00. 
     * @return ExecutionStartTime Execution time: the left-closed interval. Default: 00:00.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution time: the left-closed interval. Default: 00:00.
     * @param ExecutionStartTime Execution time: the left-closed interval. Default: 00:00.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution time: the right closed interval. Default: 23:59. 
     * @return ExecutionEndTime Execution time: the right closed interval. Default: 23:59.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution time: the right closed interval. Default: 23:59.
     * @param ExecutionEndTime Execution time: the right closed interval. Default: 23:59.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling. Default is 0. 
     * @return ScheduleRunType Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling. Default is 0.
     */
    public String getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling. Default is 0.
     * @param ScheduleRunType Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling. Default is 0.
     */
    public void setScheduleRunType(String ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get Calendar scheduling value: 0 or 1, where 1 means ON and 0 means OFF. Default is 0. 
     * @return CalendarOpen Calendar scheduling value: 0 or 1, where 1 means ON and 0 means OFF. Default is 0.
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set Calendar scheduling value: 0 or 1, where 1 means ON and 0 means OFF. Default is 0.
     * @param CalendarOpen Calendar scheduling value: 0 or 1, where 1 means ON and 0 means OFF. Default is 0.
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get Calendar scheduling:  the calendar ID. 
     * @return CalendarId Calendar scheduling:  the calendar ID.
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set Calendar scheduling:  the calendar ID.
     * @param CalendarId Calendar scheduling:  the calendar ID.
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
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
     * Get Specifies the upstream dependency list. 
     * @return UpstreamDependencyConfigList Specifies the upstream dependency list.
     */
    public DependencyTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set Specifies the upstream dependency list.
     * @param UpstreamDependencyConfigList Specifies the upstream dependency list.
     */
    public void setUpstreamDependencyConfigList(DependencyTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get List of Events 
     * @return EventListenerList List of Events
     */
    public EventListener [] getEventListenerList() {
        return this.EventListenerList;
    }

    /**
     * Set List of Events
     * @param EventListenerList List of Events
     */
    public void setEventListenerList(EventListener [] EventListenerList) {
        this.EventListenerList = EventListenerList;
    }

    /**
     * Get Task scheduling priority. Valid values: 4 (high), 5 (medium), 6 (low). Default: 6. 
     * @return RunPriority Task scheduling priority. Valid values: 4 (high), 5 (medium), 6 (low). Default: 6.
     */
    public String getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set Task scheduling priority. Valid values: 4 (high), 5 (medium), 6 (low). Default: 6.
     * @param RunPriority Task scheduling priority. Valid values: 4 (high), 5 (medium), 6 (low). Default: 6.
     */
    public void setRunPriority(String RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get Retry Policy: Retry Wait Time (in minutes): Default 5 
     * @return RetryWait Retry Policy: Retry Wait Time (in minutes): Default 5
     */
    public String getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set Retry Policy: Retry Wait Time (in minutes): Default 5
     * @param RetryWait Retry Policy: Retry Wait Time (in minutes): Default 5
     */
    public void setRetryWait(String RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get Retry Policy: maximum attempts. Default: 4. 
     * @return MaxRetryAttempts Retry Policy: maximum attempts. Default: 4.
     */
    public String getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set Retry Policy: maximum attempts. Default: 4.
     * @param MaxRetryAttempts Retry Policy: maximum attempts. Default: 4.
     */
    public void setMaxRetryAttempts(String MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get Timeout Handling Policy: Execution Timeout (in minutes), default: -1 
     * @return ExecutionTTL Timeout Handling Policy: Execution Timeout (in minutes), default: -1
     */
    public String getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set Timeout Handling Policy: Execution Timeout (in minutes), default: -1
     * @param ExecutionTTL Timeout Handling Policy: Execution Timeout (in minutes), default: -1
     */
    public void setExecutionTTL(String ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get Timeout Handling Policy: Wait Duration Timeout  (in minutes), default: -1 
     * @return WaitExecutionTotalTTL Timeout Handling Policy: Wait Duration Timeout  (in minutes), default: -1
     */
    public String getWaitExecutionTotalTTL() {
        return this.WaitExecutionTotalTTL;
    }

    /**
     * Set Timeout Handling Policy: Wait Duration Timeout  (in minutes), default: -1
     * @param WaitExecutionTotalTTL Timeout Handling Policy: Wait Duration Timeout  (in minutes), default: -1
     */
    public void setWaitExecutionTotalTTL(String WaitExecutionTotalTTL) {
        this.WaitExecutionTotalTTL = WaitExecutionTotalTTL;
    }

    /**
     * Get Rerun & Refill Configuration: Default: ALL;

* ALL: Rerun or refill is allowed regardless of whether the task succeeds or fails.

* FAILURE: Rerun or refill is allowed only if the task fails; not allowed if the task succeeds.

* NONE: Rerun or refill is not allowed regardless of success or failure. 
     * @return AllowRedoType Rerun & Refill Configuration: Default: ALL;

* ALL: Rerun or refill is allowed regardless of whether the task succeeds or fails.

* FAILURE: Rerun or refill is allowed only if the task fails; not allowed if the task succeeds.

* NONE: Rerun or refill is not allowed regardless of success or failure.
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set Rerun & Refill Configuration: Default: ALL;

* ALL: Rerun or refill is allowed regardless of whether the task succeeds or fails.

* FAILURE: Rerun or refill is allowed only if the task fails; not allowed if the task succeeds.

* NONE: Rerun or refill is not allowed regardless of success or failure.
     * @param AllowRedoType Rerun & Refill Configuration: Default: ALL;

* ALL: Rerun or refill is allowed regardless of whether the task succeeds or fails.

* FAILURE: Rerun or refill is allowed only if the task fails; not allowed if the task succeeds.

* NONE: Rerun or refill is not allowed regardless of success or failure.
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get Output parameter list. 
     * @return ParamTaskOutList Output parameter list.
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set Output parameter list.
     * @param ParamTaskOutList Output parameter list.
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get Input parameter list. 
     * @return ParamTaskInList Input parameter list.
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set Input parameter list.
     * @param ParamTaskInList Input parameter list.
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get Output registration. 
     * @return TaskOutputRegistryList Output registration.
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set Output registration.
     * @param TaskOutputRegistryList Output registration.
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    /**
     * Get **Instance generation policy**.
T_PLUS_0: specifies t+0 generation. default policy.
T_PLUS_1: specifies t+1 generation. 
     * @return InitStrategy **Instance generation policy**.
T_PLUS_0: specifies t+0 generation. default policy.
T_PLUS_1: specifies t+1 generation.
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set **Instance generation policy**.
T_PLUS_0: specifies t+0 generation. default policy.
T_PLUS_1: specifies t+1 generation.
     * @param InitStrategy **Instance generation policy**.
T_PLUS_0: specifies t+0 generation. default policy.
T_PLUS_1: specifies t+1 generation.
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    public CreateTaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskSchedulerConfiguration(CreateTaskSchedulerConfiguration source) {
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
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
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new String(source.ScheduleRunType);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.UpstreamDependencyConfigList != null) {
            this.UpstreamDependencyConfigList = new DependencyTaskBrief[source.UpstreamDependencyConfigList.length];
            for (int i = 0; i < source.UpstreamDependencyConfigList.length; i++) {
                this.UpstreamDependencyConfigList[i] = new DependencyTaskBrief(source.UpstreamDependencyConfigList[i]);
            }
        }
        if (source.EventListenerList != null) {
            this.EventListenerList = new EventListener[source.EventListenerList.length];
            for (int i = 0; i < source.EventListenerList.length; i++) {
                this.EventListenerList[i] = new EventListener(source.EventListenerList[i]);
            }
        }
        if (source.RunPriority != null) {
            this.RunPriority = new String(source.RunPriority);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new String(source.RetryWait);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new String(source.MaxRetryAttempts);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new String(source.ExecutionTTL);
        }
        if (source.WaitExecutionTotalTTL != null) {
            this.WaitExecutionTotalTTL = new String(source.WaitExecutionTotalTTL);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.ParamTaskOutList != null) {
            this.ParamTaskOutList = new OutTaskParameter[source.ParamTaskOutList.length];
            for (int i = 0; i < source.ParamTaskOutList.length; i++) {
                this.ParamTaskOutList[i] = new OutTaskParameter(source.ParamTaskOutList[i]);
            }
        }
        if (source.ParamTaskInList != null) {
            this.ParamTaskInList = new InTaskParameter[source.ParamTaskInList.length];
            for (int i = 0; i < source.ParamTaskInList.length; i++) {
                this.ParamTaskInList[i] = new InTaskParameter(source.ParamTaskInList[i]);
            }
        }
        if (source.TaskOutputRegistryList != null) {
            this.TaskOutputRegistryList = new TaskDataRegistry[source.TaskOutputRegistryList.length];
            for (int i = 0; i < source.TaskOutputRegistryList.length; i++) {
                this.TaskOutputRegistryList[i] = new TaskDataRegistry(source.TaskOutputRegistryList[i]);
            }
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamArrayObj(map, prefix + "EventListenerList.", this.EventListenerList);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTL", this.WaitExecutionTotalTTL);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);

    }
}

