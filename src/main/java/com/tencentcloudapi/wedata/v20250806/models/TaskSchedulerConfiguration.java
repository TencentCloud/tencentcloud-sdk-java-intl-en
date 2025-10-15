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

public class TaskSchedulerConfiguration extends AbstractModel {

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
    * Time zone.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 0 2 3 1,L,2 * ?	

    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Effective date.

    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date

    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Execution time. the left-closed interval.

    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution time. right closed interval.

    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling.

    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

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
    * Calendar name, which needs to be obtained from DescribeScheduleCalendarPageList API.
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * Self-Dependent. Valid values: parallel, serial, orderly. Default value: serial. 
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Specifies the upstream dependency array.
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] UpstreamDependencyConfigList;

    /**
    * SpecSpecifies the downstream dependency array.

    */
    @SerializedName("DownStreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] DownStreamDependencyConfigList;

    /**
    * Array of Events

    */
    @SerializedName("EventListenerList")
    @Expose
    private EventListener [] EventListenerList;

    /**
    * Task scheduling priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.

    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * Retry policy. retry wait time in minutes. default: 5.

    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * Specifies the maximum attempts of the retry policy. default: 4.

    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
    * Timeout Handling Policy: Execution Timeout (in minutes), default: -1

    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

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
     * Get Time zone. 
     * @return ScheduleTimeZone Time zone.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Time zone.
     * @param ScheduleTimeZone Time zone.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 0 2 3 1,L,2 * ?	
 
     * @return CrontabExpression 0 2 3 1,L,2 * ?	

     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set 0 2 3 1,L,2 * ?	

     * @param CrontabExpression 0 2 3 1,L,2 * ?	

     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Effective date.
 
     * @return StartTime Effective date.

     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective date.

     * @param StartTime Effective date.

     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date
 
     * @return EndTime End date

     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date

     * @param EndTime End date

     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Execution time. the left-closed interval.
 
     * @return ExecutionStartTime Execution time. the left-closed interval.

     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution time. the left-closed interval.

     * @param ExecutionStartTime Execution time. the left-closed interval.

     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution time. right closed interval.
 
     * @return ExecutionEndTime Execution time. right closed interval.

     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution time. right closed interval.

     * @param ExecutionEndTime Execution time. right closed interval.

     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling.
 
     * @return ScheduleRunType Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling.

     */
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling.

     * @param ScheduleRunType Scheduling type: 0 for normal scheduling, 1 for dry-run scheduling.

     */
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
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

    /**
     * Get Calendar name, which needs to be obtained from DescribeScheduleCalendarPageList API. 
     * @return CalendarName Calendar name, which needs to be obtained from DescribeScheduleCalendarPageList API.
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set Calendar name, which needs to be obtained from DescribeScheduleCalendarPageList API.
     * @param CalendarName Calendar name, which needs to be obtained from DescribeScheduleCalendarPageList API.
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
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
     * Get Specifies the upstream dependency array. 
     * @return UpstreamDependencyConfigList Specifies the upstream dependency array.
     */
    public DependencyTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set Specifies the upstream dependency array.
     * @param UpstreamDependencyConfigList Specifies the upstream dependency array.
     */
    public void setUpstreamDependencyConfigList(DependencyTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get SpecSpecifies the downstream dependency array.
 
     * @return DownStreamDependencyConfigList SpecSpecifies the downstream dependency array.

     */
    public DependencyTaskBrief [] getDownStreamDependencyConfigList() {
        return this.DownStreamDependencyConfigList;
    }

    /**
     * Set SpecSpecifies the downstream dependency array.

     * @param DownStreamDependencyConfigList SpecSpecifies the downstream dependency array.

     */
    public void setDownStreamDependencyConfigList(DependencyTaskBrief [] DownStreamDependencyConfigList) {
        this.DownStreamDependencyConfigList = DownStreamDependencyConfigList;
    }

    /**
     * Get Array of Events
 
     * @return EventListenerList Array of Events

     */
    public EventListener [] getEventListenerList() {
        return this.EventListenerList;
    }

    /**
     * Set Array of Events

     * @param EventListenerList Array of Events

     */
    public void setEventListenerList(EventListener [] EventListenerList) {
        this.EventListenerList = EventListenerList;
    }

    /**
     * Get Task scheduling priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.
 
     * @return RunPriority Task scheduling priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.

     */
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set Task scheduling priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.

     * @param RunPriority Task scheduling priority. valid values: 4 (high), 5 (medium), 6 (low). default: 6.

     */
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get Retry policy. retry wait time in minutes. default: 5.
 
     * @return RetryWait Retry policy. retry wait time in minutes. default: 5.

     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set Retry policy. retry wait time in minutes. default: 5.

     * @param RetryWait Retry policy. retry wait time in minutes. default: 5.

     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get Specifies the maximum attempts of the retry policy. default: 4.
 
     * @return MaxRetryAttempts Specifies the maximum attempts of the retry policy. default: 4.

     */
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set Specifies the maximum attempts of the retry policy. default: 4.

     * @param MaxRetryAttempts Specifies the maximum attempts of the retry policy. default: 4.

     */
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get Timeout Handling Policy: Execution Timeout (in minutes), default: -1
 
     * @return ExecutionTTL Timeout Handling Policy: Execution Timeout (in minutes), default: -1

     */
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set Timeout Handling Policy: Execution Timeout (in minutes), default: -1

     * @param ExecutionTTL Timeout Handling Policy: Execution Timeout (in minutes), default: -1

     */
    public void setExecutionTTL(Long ExecutionTTL) {
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

    public TaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSchedulerConfiguration(TaskSchedulerConfiguration source) {
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
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.CalendarName != null) {
            this.CalendarName = new String(source.CalendarName);
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
        if (source.DownStreamDependencyConfigList != null) {
            this.DownStreamDependencyConfigList = new DependencyTaskBrief[source.DownStreamDependencyConfigList.length];
            for (int i = 0; i < source.DownStreamDependencyConfigList.length; i++) {
                this.DownStreamDependencyConfigList[i] = new DependencyTaskBrief(source.DownStreamDependencyConfigList[i]);
            }
        }
        if (source.EventListenerList != null) {
            this.EventListenerList = new EventListener[source.EventListenerList.length];
            for (int i = 0; i < source.EventListenerList.length; i++) {
                this.EventListenerList[i] = new EventListener(source.EventListenerList[i]);
            }
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new Long(source.MaxRetryAttempts);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
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
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamArrayObj(map, prefix + "DownStreamDependencyConfigList.", this.DownStreamDependencyConfigList);
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

