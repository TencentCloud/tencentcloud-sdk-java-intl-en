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
    * <p>Period type: Defaults to DAY_CYCLE</p><p>Supported types are </p><ul><li>ONEOFF_CYCLE: One-time</li><li>YEAR_CYCLE: Year</li><li>MONTH_CYCLE: Month</li><li>WEEK_CYCLE: Week</li><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>CRONTAB_CYCLE: crontab expression</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>Time zone, defaults to UTC+8</p>
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>Cron expression, defaults to 0 0 0 * * ? *</p>
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>Effective date, defaults to 00:00:00 of the current date</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End date, defaults to 2099-12-31 23:59:59</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Execution time left-closed interval, default 00:00</p>
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>Execution time right closed interval, default 23:59</p>
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>Calendar scheduling value is 0 and 1, where 1 is on and 0 is shutdown, with a default value of 0.</p>
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * <p>Calendar scheduling Calendar ID</p>
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * <p>Self-dependent, default value serial, value: parallel, serial, orderly</p>
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>Upstream dependency array</p>
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] UpstreamDependencyConfigList;

    /**
    * <p>Event array</p>
    */
    @SerializedName("EventListenerList")
    @Expose
    private EventListener [] EventListenerList;

    /**
    * <p>Rerun & replenishment configuration, defaults to ALL; , ALL allows rerun or replenishment after successful or failed running, FAILURE cannot rerun or replenish after successful running but allows rerun or replenishment after running FAILURE, NONE does not allow rerun or replenishment after either successful or failed running;</p>
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * <p>Output parameter array</p>
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * <p>Input parameter array</p>
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * <p>Output registration</p>
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
    * <p><strong>Instance Generation Policy</strong></p><ul><li>T_PLUS_0: T+0 generation, default policy</li><li>T_PLUS_1: T+1 generation</li></ul>
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private String ScheduleRunType;

    /**
    * <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
    */
    @SerializedName("RunPriority")
    @Expose
    private String RunPriority;

    /**
    * <p>Retry policy Retry wait time, in minutes: Default: 5</p>
    */
    @SerializedName("RetryWait")
    @Expose
    private String RetryWait;

    /**
    * <p>Retry policy Maximum attempts, Default: 4</p>
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private String MaxRetryAttempts;

    /**
    * <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private String ExecutionTTL;

    /**
    * <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
    */
    @SerializedName("WaitExecutionTotalTTL")
    @Expose
    private String WaitExecutionTotalTTL;

    /**
    * <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * <p>Retry policy Retry wait time, in minutes: Default: 5</p>
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * <p>Retry policy Maximum attempts, Default: 4</p>
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * <ul><li>The task dependency run condition defaults to ALL_SUCCESS. Currently, only workflow scheduling under the project supports configuration.</li><li>ALL_SUCCESS: All successful: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful, the dependency check passes. Otherwise, if one upstream task skips running, it is marked as skipped. In other cases, it is marked as upstream failure.</li><li>ALL_FAILED: All failed: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a failed state or marked as upstream failure, the dependency check passes. Otherwise, it is marked as skipped.</li><li>ALL_DONE: All completed: When all upstream dependency tasks reach the final state, perform a dependency check, and the dependency check passes directly.</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one is successful, the dependency check passes. Otherwise, it skips running.</li><li>ALL_SKIPPED: All upstream tasks skipped: When all upstream dependency tasks reach the final state, perform a dependency check. Only if all upstream tasks are in a skipped state does the dependency check pass. Otherwise, the current node skips running.</li><li>ONE_FAILED: At least one failed: If at least one upstream task fails, perform a dependency check, and the check passes. If all upstream tasks complete but none fail, it skips running.</li><li>ONE_SUCCESS: At least one success: If at least one upstream task succeeds, perform a dependency check, and the check passes. If all upstream tasks complete but none succeed, it skips running.</li><li>ONE_DONE: At least one completed: If at least one upstream task completes, perform a dependency check, and the check passes. Otherwise, it continues waiting for upstream.</li><li>NONE_FAILED: All upstream tasks completed with no failure: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful or skipped, the check passes. Otherwise, it is marked as upstream failure.</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with no failure and at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If no upstream task fails and at least one succeeds, the check passes. Otherwise, it skips running.</li><li>NONE_SKIPPED: All upstream tasks completed with no skipped runs: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a successful, failed, or upstream failure state, the check passes. Otherwise, it skips running.</li><li>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream tasks completed with at least one failure: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one fails, the check passes. Otherwise, it skips running.</li></ul>
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
    * <p>Whether to allow downstream dependency 1 Allow 0 Do not allow</p><p>Value ranges from 0 to 1</p><p>Default value: 1</p>
    */
    @SerializedName("AllowDownstreamDependency")
    @Expose
    private Long AllowDownstreamDependency;

    /**
     * Get <p>Period type: Defaults to DAY_CYCLE</p><p>Supported types are </p><ul><li>ONEOFF_CYCLE: One-time</li><li>YEAR_CYCLE: Year</li><li>MONTH_CYCLE: Month</li><li>WEEK_CYCLE: Week</li><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>CRONTAB_CYCLE: crontab expression</li></ul> 
     * @return CycleType <p>Period type: Defaults to DAY_CYCLE</p><p>Supported types are </p><ul><li>ONEOFF_CYCLE: One-time</li><li>YEAR_CYCLE: Year</li><li>MONTH_CYCLE: Month</li><li>WEEK_CYCLE: Week</li><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>CRONTAB_CYCLE: crontab expression</li></ul>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>Period type: Defaults to DAY_CYCLE</p><p>Supported types are </p><ul><li>ONEOFF_CYCLE: One-time</li><li>YEAR_CYCLE: Year</li><li>MONTH_CYCLE: Month</li><li>WEEK_CYCLE: Week</li><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>CRONTAB_CYCLE: crontab expression</li></ul>
     * @param CycleType <p>Period type: Defaults to DAY_CYCLE</p><p>Supported types are </p><ul><li>ONEOFF_CYCLE: One-time</li><li>YEAR_CYCLE: Year</li><li>MONTH_CYCLE: Month</li><li>WEEK_CYCLE: Week</li><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>CRONTAB_CYCLE: crontab expression</li></ul>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>Time zone, defaults to UTC+8</p> 
     * @return ScheduleTimeZone <p>Time zone, defaults to UTC+8</p>
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>Time zone, defaults to UTC+8</p>
     * @param ScheduleTimeZone <p>Time zone, defaults to UTC+8</p>
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>Cron expression, defaults to 0 0 0 * * ? *</p> 
     * @return CrontabExpression <p>Cron expression, defaults to 0 0 0 * * ? *</p>
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>Cron expression, defaults to 0 0 0 * * ? *</p>
     * @param CrontabExpression <p>Cron expression, defaults to 0 0 0 * * ? *</p>
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>Effective date, defaults to 00:00:00 of the current date</p> 
     * @return StartTime <p>Effective date, defaults to 00:00:00 of the current date</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Effective date, defaults to 00:00:00 of the current date</p>
     * @param StartTime <p>Effective date, defaults to 00:00:00 of the current date</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End date, defaults to 2099-12-31 23:59:59</p> 
     * @return EndTime <p>End date, defaults to 2099-12-31 23:59:59</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End date, defaults to 2099-12-31 23:59:59</p>
     * @param EndTime <p>End date, defaults to 2099-12-31 23:59:59</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Execution time left-closed interval, default 00:00</p> 
     * @return ExecutionStartTime <p>Execution time left-closed interval, default 00:00</p>
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>Execution time left-closed interval, default 00:00</p>
     * @param ExecutionStartTime <p>Execution time left-closed interval, default 00:00</p>
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>Execution time right closed interval, default 23:59</p> 
     * @return ExecutionEndTime <p>Execution time right closed interval, default 23:59</p>
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>Execution time right closed interval, default 23:59</p>
     * @param ExecutionEndTime <p>Execution time right closed interval, default 23:59</p>
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>Calendar scheduling value is 0 and 1, where 1 is on and 0 is shutdown, with a default value of 0.</p> 
     * @return CalendarOpen <p>Calendar scheduling value is 0 and 1, where 1 is on and 0 is shutdown, with a default value of 0.</p>
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set <p>Calendar scheduling value is 0 and 1, where 1 is on and 0 is shutdown, with a default value of 0.</p>
     * @param CalendarOpen <p>Calendar scheduling value is 0 and 1, where 1 is on and 0 is shutdown, with a default value of 0.</p>
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get <p>Calendar scheduling Calendar ID</p> 
     * @return CalendarId <p>Calendar scheduling Calendar ID</p>
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set <p>Calendar scheduling Calendar ID</p>
     * @param CalendarId <p>Calendar scheduling Calendar ID</p>
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get <p>Self-dependent, default value serial, value: parallel, serial, orderly</p> 
     * @return SelfDepend <p>Self-dependent, default value serial, value: parallel, serial, orderly</p>
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>Self-dependent, default value serial, value: parallel, serial, orderly</p>
     * @param SelfDepend <p>Self-dependent, default value serial, value: parallel, serial, orderly</p>
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>Upstream dependency array</p> 
     * @return UpstreamDependencyConfigList <p>Upstream dependency array</p>
     */
    public DependencyTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set <p>Upstream dependency array</p>
     * @param UpstreamDependencyConfigList <p>Upstream dependency array</p>
     */
    public void setUpstreamDependencyConfigList(DependencyTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get <p>Event array</p> 
     * @return EventListenerList <p>Event array</p>
     */
    public EventListener [] getEventListenerList() {
        return this.EventListenerList;
    }

    /**
     * Set <p>Event array</p>
     * @param EventListenerList <p>Event array</p>
     */
    public void setEventListenerList(EventListener [] EventListenerList) {
        this.EventListenerList = EventListenerList;
    }

    /**
     * Get <p>Rerun & replenishment configuration, defaults to ALL; , ALL allows rerun or replenishment after successful or failed running, FAILURE cannot rerun or replenish after successful running but allows rerun or replenishment after running FAILURE, NONE does not allow rerun or replenishment after either successful or failed running;</p> 
     * @return AllowRedoType <p>Rerun & replenishment configuration, defaults to ALL; , ALL allows rerun or replenishment after successful or failed running, FAILURE cannot rerun or replenish after successful running but allows rerun or replenishment after running FAILURE, NONE does not allow rerun or replenishment after either successful or failed running;</p>
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set <p>Rerun & replenishment configuration, defaults to ALL; , ALL allows rerun or replenishment after successful or failed running, FAILURE cannot rerun or replenish after successful running but allows rerun or replenishment after running FAILURE, NONE does not allow rerun or replenishment after either successful or failed running;</p>
     * @param AllowRedoType <p>Rerun & replenishment configuration, defaults to ALL; , ALL allows rerun or replenishment after successful or failed running, FAILURE cannot rerun or replenish after successful running but allows rerun or replenishment after running FAILURE, NONE does not allow rerun or replenishment after either successful or failed running;</p>
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get <p>Output parameter array</p> 
     * @return ParamTaskOutList <p>Output parameter array</p>
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set <p>Output parameter array</p>
     * @param ParamTaskOutList <p>Output parameter array</p>
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get <p>Input parameter array</p> 
     * @return ParamTaskInList <p>Input parameter array</p>
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set <p>Input parameter array</p>
     * @param ParamTaskInList <p>Input parameter array</p>
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get <p>Output registration</p> 
     * @return TaskOutputRegistryList <p>Output registration</p>
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set <p>Output registration</p>
     * @param TaskOutputRegistryList <p>Output registration</p>
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    /**
     * Get <p><strong>Instance Generation Policy</strong></p><ul><li>T_PLUS_0: T+0 generation, default policy</li><li>T_PLUS_1: T+1 generation</li></ul> 
     * @return InitStrategy <p><strong>Instance Generation Policy</strong></p><ul><li>T_PLUS_0: T+0 generation, default policy</li><li>T_PLUS_1: T+1 generation</li></ul>
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set <p><strong>Instance Generation Policy</strong></p><ul><li>T_PLUS_0: T+0 generation, default policy</li><li>T_PLUS_1: T+1 generation</li></ul>
     * @param InitStrategy <p><strong>Instance Generation Policy</strong></p><ul><li>T_PLUS_0: T+0 generation, default policy</li><li>T_PLUS_1: T+1 generation</li></ul>
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p> 
     * @return ScheduleRunType <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     * @deprecated
     */
    @Deprecated
    public String getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     * @param ScheduleRunType <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     * @deprecated
     */
    @Deprecated
    public void setScheduleRunType(String ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p> 
     * @return RunPriority <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     * @deprecated
     */
    @Deprecated
    public String getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     * @param RunPriority <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     * @deprecated
     */
    @Deprecated
    public void setRunPriority(String RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get <p>Retry policy Retry wait time, in minutes: Default: 5</p> 
     * @return RetryWait <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     * @deprecated
     */
    @Deprecated
    public String getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     * @param RetryWait <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     * @deprecated
     */
    @Deprecated
    public void setRetryWait(String RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get <p>Retry policy Maximum attempts, Default: 4</p> 
     * @return MaxRetryAttempts <p>Retry policy Maximum attempts, Default: 4</p>
     * @deprecated
     */
    @Deprecated
    public String getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set <p>Retry policy Maximum attempts, Default: 4</p>
     * @param MaxRetryAttempts <p>Retry policy Maximum attempts, Default: 4</p>
     * @deprecated
     */
    @Deprecated
    public void setMaxRetryAttempts(String MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p> 
     * @return ExecutionTTL <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     * @deprecated
     */
    @Deprecated
    public String getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     * @param ExecutionTTL <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     * @deprecated
     */
    @Deprecated
    public void setExecutionTTL(String ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p> 
     * @return WaitExecutionTotalTTL <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     * @deprecated
     */
    @Deprecated
    public String getWaitExecutionTotalTTL() {
        return this.WaitExecutionTotalTTL;
    }

    /**
     * Set <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     * @param WaitExecutionTotalTTL <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     * @deprecated
     */
    @Deprecated
    public void setWaitExecutionTotalTTL(String WaitExecutionTotalTTL) {
        this.WaitExecutionTotalTTL = WaitExecutionTotalTTL;
    }

    /**
     * Get <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p> 
     * @return ScheduleType <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     * @param ScheduleType <p>Scheduling type: 0 normal scheduling 1 dry-run scheduling, default is 0</p>
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p> 
     * @return RunPriorityType <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     * @param RunPriorityType <p>Task scheduling priority Execution priority 4 High 5 Medium 6 Low, Default:6</p>
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get <p>Retry policy Retry wait time, in minutes: Default: 5</p> 
     * @return RetryWaitMinute <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     * @param RetryWaitMinute <p>Retry policy Retry wait time, in minutes: Default: 5</p>
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get <p>Retry policy Maximum attempts, Default: 4</p> 
     * @return MaxRetryNumber <p>Retry policy Maximum attempts, Default: 4</p>
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set <p>Retry policy Maximum attempts, Default: 4</p>
     * @param MaxRetryNumber <p>Retry policy Maximum attempts, Default: 4</p>
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p> 
     * @return ExecutionTTLMinute <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     * @param ExecutionTTLMinute <p>Timeout handling strategy Runtime timeout (unit: minutes) Default is -1</p>
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p> 
     * @return WaitExecutionTotalTTLMinute <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     * @param WaitExecutionTotalTTLMinute <p>Timeout handling strategy Wait duration timeout (unit: minutes) Default value is -1</p>
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get <ul><li>The task dependency run condition defaults to ALL_SUCCESS. Currently, only workflow scheduling under the project supports configuration.</li><li>ALL_SUCCESS: All successful: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful, the dependency check passes. Otherwise, if one upstream task skips running, it is marked as skipped. In other cases, it is marked as upstream failure.</li><li>ALL_FAILED: All failed: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a failed state or marked as upstream failure, the dependency check passes. Otherwise, it is marked as skipped.</li><li>ALL_DONE: All completed: When all upstream dependency tasks reach the final state, perform a dependency check, and the dependency check passes directly.</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one is successful, the dependency check passes. Otherwise, it skips running.</li><li>ALL_SKIPPED: All upstream tasks skipped: When all upstream dependency tasks reach the final state, perform a dependency check. Only if all upstream tasks are in a skipped state does the dependency check pass. Otherwise, the current node skips running.</li><li>ONE_FAILED: At least one failed: If at least one upstream task fails, perform a dependency check, and the check passes. If all upstream tasks complete but none fail, it skips running.</li><li>ONE_SUCCESS: At least one success: If at least one upstream task succeeds, perform a dependency check, and the check passes. If all upstream tasks complete but none succeed, it skips running.</li><li>ONE_DONE: At least one completed: If at least one upstream task completes, perform a dependency check, and the check passes. Otherwise, it continues waiting for upstream.</li><li>NONE_FAILED: All upstream tasks completed with no failure: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful or skipped, the check passes. Otherwise, it is marked as upstream failure.</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with no failure and at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If no upstream task fails and at least one succeeds, the check passes. Otherwise, it skips running.</li><li>NONE_SKIPPED: All upstream tasks completed with no skipped runs: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a successful, failed, or upstream failure state, the check passes. Otherwise, it skips running.</li><li>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream tasks completed with at least one failure: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one fails, the check passes. Otherwise, it skips running.</li></ul> 
     * @return DependencyTriggerPolicy <ul><li>The task dependency run condition defaults to ALL_SUCCESS. Currently, only workflow scheduling under the project supports configuration.</li><li>ALL_SUCCESS: All successful: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful, the dependency check passes. Otherwise, if one upstream task skips running, it is marked as skipped. In other cases, it is marked as upstream failure.</li><li>ALL_FAILED: All failed: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a failed state or marked as upstream failure, the dependency check passes. Otherwise, it is marked as skipped.</li><li>ALL_DONE: All completed: When all upstream dependency tasks reach the final state, perform a dependency check, and the dependency check passes directly.</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one is successful, the dependency check passes. Otherwise, it skips running.</li><li>ALL_SKIPPED: All upstream tasks skipped: When all upstream dependency tasks reach the final state, perform a dependency check. Only if all upstream tasks are in a skipped state does the dependency check pass. Otherwise, the current node skips running.</li><li>ONE_FAILED: At least one failed: If at least one upstream task fails, perform a dependency check, and the check passes. If all upstream tasks complete but none fail, it skips running.</li><li>ONE_SUCCESS: At least one success: If at least one upstream task succeeds, perform a dependency check, and the check passes. If all upstream tasks complete but none succeed, it skips running.</li><li>ONE_DONE: At least one completed: If at least one upstream task completes, perform a dependency check, and the check passes. Otherwise, it continues waiting for upstream.</li><li>NONE_FAILED: All upstream tasks completed with no failure: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful or skipped, the check passes. Otherwise, it is marked as upstream failure.</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with no failure and at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If no upstream task fails and at least one succeeds, the check passes. Otherwise, it skips running.</li><li>NONE_SKIPPED: All upstream tasks completed with no skipped runs: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a successful, failed, or upstream failure state, the check passes. Otherwise, it skips running.</li><li>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream tasks completed with at least one failure: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one fails, the check passes. Otherwise, it skips running.</li></ul>
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set <ul><li>The task dependency run condition defaults to ALL_SUCCESS. Currently, only workflow scheduling under the project supports configuration.</li><li>ALL_SUCCESS: All successful: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful, the dependency check passes. Otherwise, if one upstream task skips running, it is marked as skipped. In other cases, it is marked as upstream failure.</li><li>ALL_FAILED: All failed: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a failed state or marked as upstream failure, the dependency check passes. Otherwise, it is marked as skipped.</li><li>ALL_DONE: All completed: When all upstream dependency tasks reach the final state, perform a dependency check, and the dependency check passes directly.</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one is successful, the dependency check passes. Otherwise, it skips running.</li><li>ALL_SKIPPED: All upstream tasks skipped: When all upstream dependency tasks reach the final state, perform a dependency check. Only if all upstream tasks are in a skipped state does the dependency check pass. Otherwise, the current node skips running.</li><li>ONE_FAILED: At least one failed: If at least one upstream task fails, perform a dependency check, and the check passes. If all upstream tasks complete but none fail, it skips running.</li><li>ONE_SUCCESS: At least one success: If at least one upstream task succeeds, perform a dependency check, and the check passes. If all upstream tasks complete but none succeed, it skips running.</li><li>ONE_DONE: At least one completed: If at least one upstream task completes, perform a dependency check, and the check passes. Otherwise, it continues waiting for upstream.</li><li>NONE_FAILED: All upstream tasks completed with no failure: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful or skipped, the check passes. Otherwise, it is marked as upstream failure.</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with no failure and at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If no upstream task fails and at least one succeeds, the check passes. Otherwise, it skips running.</li><li>NONE_SKIPPED: All upstream tasks completed with no skipped runs: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a successful, failed, or upstream failure state, the check passes. Otherwise, it skips running.</li><li>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream tasks completed with at least one failure: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one fails, the check passes. Otherwise, it skips running.</li></ul>
     * @param DependencyTriggerPolicy <ul><li>The task dependency run condition defaults to ALL_SUCCESS. Currently, only workflow scheduling under the project supports configuration.</li><li>ALL_SUCCESS: All successful: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful, the dependency check passes. Otherwise, if one upstream task skips running, it is marked as skipped. In other cases, it is marked as upstream failure.</li><li>ALL_FAILED: All failed: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a failed state or marked as upstream failure, the dependency check passes. Otherwise, it is marked as skipped.</li><li>ALL_DONE: All completed: When all upstream dependency tasks reach the final state, perform a dependency check, and the dependency check passes directly.</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one is successful, the dependency check passes. Otherwise, it skips running.</li><li>ALL_SKIPPED: All upstream tasks skipped: When all upstream dependency tasks reach the final state, perform a dependency check. Only if all upstream tasks are in a skipped state does the dependency check pass. Otherwise, the current node skips running.</li><li>ONE_FAILED: At least one failed: If at least one upstream task fails, perform a dependency check, and the check passes. If all upstream tasks complete but none fail, it skips running.</li><li>ONE_SUCCESS: At least one success: If at least one upstream task succeeds, perform a dependency check, and the check passes. If all upstream tasks complete but none succeed, it skips running.</li><li>ONE_DONE: At least one completed: If at least one upstream task completes, perform a dependency check, and the check passes. Otherwise, it continues waiting for upstream.</li><li>NONE_FAILED: All upstream tasks completed with no failure: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are successful or skipped, the check passes. Otherwise, it is marked as upstream failure.</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS: All upstream tasks completed with no failure and at least one success: When all upstream dependency tasks reach the final state, perform a dependency check. If no upstream task fails and at least one succeeds, the check passes. Otherwise, it skips running.</li><li>NONE_SKIPPED: All upstream tasks completed with no skipped runs: When all upstream dependency tasks reach the final state, perform a dependency check. If all upstream tasks are in a successful, failed, or upstream failure state, the check passes. Otherwise, it skips running.</li><li>ALL_DONE_AT_LEAST_ONE_FAILED: All upstream tasks completed with at least one failure: When all upstream dependency tasks reach the final state, perform a dependency check. If at least one fails, the check passes. Otherwise, it skips running.</li></ul>
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    /**
     * Get <p>Whether to allow downstream dependency 1 Allow 0 Do not allow</p><p>Value ranges from 0 to 1</p><p>Default value: 1</p> 
     * @return AllowDownstreamDependency <p>Whether to allow downstream dependency 1 Allow 0 Do not allow</p><p>Value ranges from 0 to 1</p><p>Default value: 1</p>
     * @deprecated
     */
    @Deprecated
    public Long getAllowDownstreamDependency() {
        return this.AllowDownstreamDependency;
    }

    /**
     * Set <p>Whether to allow downstream dependency 1 Allow 0 Do not allow</p><p>Value ranges from 0 to 1</p><p>Default value: 1</p>
     * @param AllowDownstreamDependency <p>Whether to allow downstream dependency 1 Allow 0 Do not allow</p><p>Value ranges from 0 to 1</p><p>Default value: 1</p>
     * @deprecated
     */
    @Deprecated
    public void setAllowDownstreamDependency(Long AllowDownstreamDependency) {
        this.AllowDownstreamDependency = AllowDownstreamDependency;
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
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new String(source.ScheduleRunType);
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
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.RunPriorityType != null) {
            this.RunPriorityType = new Long(source.RunPriorityType);
        }
        if (source.RetryWaitMinute != null) {
            this.RetryWaitMinute = new Long(source.RetryWaitMinute);
        }
        if (source.MaxRetryNumber != null) {
            this.MaxRetryNumber = new Long(source.MaxRetryNumber);
        }
        if (source.ExecutionTTLMinute != null) {
            this.ExecutionTTLMinute = new Long(source.ExecutionTTLMinute);
        }
        if (source.WaitExecutionTotalTTLMinute != null) {
            this.WaitExecutionTotalTTLMinute = new Long(source.WaitExecutionTotalTTLMinute);
        }
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
        if (source.AllowDownstreamDependency != null) {
            this.AllowDownstreamDependency = new Long(source.AllowDownstreamDependency);
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
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamArrayObj(map, prefix + "EventListenerList.", this.EventListenerList);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTL", this.WaitExecutionTotalTTL);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "RunPriorityType", this.RunPriorityType);
        this.setParamSimple(map, prefix + "RetryWaitMinute", this.RetryWaitMinute);
        this.setParamSimple(map, prefix + "MaxRetryNumber", this.MaxRetryNumber);
        this.setParamSimple(map, prefix + "ExecutionTTLMinute", this.ExecutionTTLMinute);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTLMinute", this.WaitExecutionTotalTTLMinute);
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);
        this.setParamSimple(map, prefix + "AllowDownstreamDependency", this.AllowDownstreamDependency);

    }
}

