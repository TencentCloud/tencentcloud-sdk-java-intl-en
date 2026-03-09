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

public class WorkflowTriggerConfig extends AbstractModel {

    /**
    * Trigger mode.
-Scheduled TRIGGER: TIME_TRIGGER.
- CONTINUE_RUN: continuously RUN.
-FILE_ARRIVAL.

Note:.
-In TIME_TRIGGER and CONTINUE_RUN mode, SchedulerStatus, SchedulerTimeZone, StartTime, EndTime, ConfigMode, CycleType, and CrontabExpression are required.
-In FILE_ARRIVAL mode, FileArrivalPath, TriggerMinimumIntervalSecond, and TriggerWaitTimeSecond are required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * Convert WorkflowTriggerConfig into Json format for reconciliation usage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * Scheduling time zone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * Schedule effective time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Schedule end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Setting method, general: COMMON, CRON EXPRESSION: CRON_EXPRESSION.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigMode")
    @Expose
    private String ConfigMode;

    /**
    * Period type: supported types are.
ONEOFF_CYCLE: one-time.
YEAR_CYCLE: year.
MONTH_CYCLE: month.
WEEK_CYCLE: week.
DAY_CYCLE: day.
HOUR_CYCLE: hr.
MINUTE_CYCLE: minute.
CRONTAB_CYCLE: crontab expression type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Cron expression
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * triggerId, uuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * Listening path in the storage system under file arrival mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileArrivalPath")
    @Expose
    private String FileArrivalPath;

    /**
    * File arrival mode triggers the shortest interval (unit: s).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerMinimumIntervalSecond")
    @Expose
    private Long TriggerMinimumIntervalSecond;

    /**
    * File arrival in mode. trigger waiting time (unit: seconds).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerWaitTimeSecond")
    @Expose
    private Long TriggerWaitTimeSecond;

    /**
    * Trigger status. valid values: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

    /**
     * Get Trigger mode.
-Scheduled TRIGGER: TIME_TRIGGER.
- CONTINUE_RUN: continuously RUN.
-FILE_ARRIVAL.

Note:.
-In TIME_TRIGGER and CONTINUE_RUN mode, SchedulerStatus, SchedulerTimeZone, StartTime, EndTime, ConfigMode, CycleType, and CrontabExpression are required.
-In FILE_ARRIVAL mode, FileArrivalPath, TriggerMinimumIntervalSecond, and TriggerWaitTimeSecond are required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerMode Trigger mode.
-Scheduled TRIGGER: TIME_TRIGGER.
- CONTINUE_RUN: continuously RUN.
-FILE_ARRIVAL.

Note:.
-In TIME_TRIGGER and CONTINUE_RUN mode, SchedulerStatus, SchedulerTimeZone, StartTime, EndTime, ConfigMode, CycleType, and CrontabExpression are required.
-In FILE_ARRIVAL mode, FileArrivalPath, TriggerMinimumIntervalSecond, and TriggerWaitTimeSecond are required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set Trigger mode.
-Scheduled TRIGGER: TIME_TRIGGER.
- CONTINUE_RUN: continuously RUN.
-FILE_ARRIVAL.

Note:.
-In TIME_TRIGGER and CONTINUE_RUN mode, SchedulerStatus, SchedulerTimeZone, StartTime, EndTime, ConfigMode, CycleType, and CrontabExpression are required.
-In FILE_ARRIVAL mode, FileArrivalPath, TriggerMinimumIntervalSecond, and TriggerWaitTimeSecond are required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerMode Trigger mode.
-Scheduled TRIGGER: TIME_TRIGGER.
- CONTINUE_RUN: continuously RUN.
-FILE_ARRIVAL.

Note:.
-In TIME_TRIGGER and CONTINUE_RUN mode, SchedulerStatus, SchedulerTimeZone, StartTime, EndTime, ConfigMode, CycleType, and CrontabExpression are required.
-In FILE_ARRIVAL mode, FileArrivalPath, TriggerMinimumIntervalSecond, and TriggerWaitTimeSecond are required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get Convert WorkflowTriggerConfig into Json format for reconciliation usage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraInfo Convert WorkflowTriggerConfig into Json format for reconciliation usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Convert WorkflowTriggerConfig into Json format for reconciliation usage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraInfo Convert WorkflowTriggerConfig into Json format for reconciliation usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Scheduling time zone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleTimeZone Scheduling time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Scheduling time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleTimeZone Scheduling time zone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get Schedule effective time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Schedule effective time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Schedule effective time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Schedule effective time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Schedule end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Schedule end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Schedule end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Schedule end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Setting method, general: COMMON, CRON EXPRESSION: CRON_EXPRESSION.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigMode Setting method, general: COMMON, CRON EXPRESSION: CRON_EXPRESSION.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigMode() {
        return this.ConfigMode;
    }

    /**
     * Set Setting method, general: COMMON, CRON EXPRESSION: CRON_EXPRESSION.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigMode Setting method, general: COMMON, CRON EXPRESSION: CRON_EXPRESSION.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigMode(String ConfigMode) {
        this.ConfigMode = ConfigMode;
    }

    /**
     * Get Period type: supported types are.
ONEOFF_CYCLE: one-time.
YEAR_CYCLE: year.
MONTH_CYCLE: month.
WEEK_CYCLE: week.
DAY_CYCLE: day.
HOUR_CYCLE: hr.
MINUTE_CYCLE: minute.
CRONTAB_CYCLE: crontab expression type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CycleType Period type: supported types are.
ONEOFF_CYCLE: one-time.
YEAR_CYCLE: year.
MONTH_CYCLE: month.
WEEK_CYCLE: week.
DAY_CYCLE: day.
HOUR_CYCLE: hr.
MINUTE_CYCLE: minute.
CRONTAB_CYCLE: crontab expression type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Period type: supported types are.
ONEOFF_CYCLE: one-time.
YEAR_CYCLE: year.
MONTH_CYCLE: month.
WEEK_CYCLE: week.
DAY_CYCLE: day.
HOUR_CYCLE: hr.
MINUTE_CYCLE: minute.
CRONTAB_CYCLE: crontab expression type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CycleType Period type: supported types are.
ONEOFF_CYCLE: one-time.
YEAR_CYCLE: year.
MONTH_CYCLE: month.
WEEK_CYCLE: week.
DAY_CYCLE: day.
HOUR_CYCLE: hr.
MINUTE_CYCLE: minute.
CRONTAB_CYCLE: crontab expression type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Cron expression
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CrontabExpression Cron expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Cron expression
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CrontabExpression Cron expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get triggerId, uuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerId triggerId, uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set triggerId, uuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerId triggerId, uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get Listening path in the storage system under file arrival mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileArrivalPath Listening path in the storage system under file arrival mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileArrivalPath() {
        return this.FileArrivalPath;
    }

    /**
     * Set Listening path in the storage system under file arrival mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileArrivalPath Listening path in the storage system under file arrival mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileArrivalPath(String FileArrivalPath) {
        this.FileArrivalPath = FileArrivalPath;
    }

    /**
     * Get File arrival mode triggers the shortest interval (unit: s).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerMinimumIntervalSecond File arrival mode triggers the shortest interval (unit: s).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTriggerMinimumIntervalSecond() {
        return this.TriggerMinimumIntervalSecond;
    }

    /**
     * Set File arrival mode triggers the shortest interval (unit: s).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerMinimumIntervalSecond File arrival mode triggers the shortest interval (unit: s).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerMinimumIntervalSecond(Long TriggerMinimumIntervalSecond) {
        this.TriggerMinimumIntervalSecond = TriggerMinimumIntervalSecond;
    }

    /**
     * Get File arrival in mode. trigger waiting time (unit: seconds).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerWaitTimeSecond File arrival in mode. trigger waiting time (unit: seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTriggerWaitTimeSecond() {
        return this.TriggerWaitTimeSecond;
    }

    /**
     * Set File arrival in mode. trigger waiting time (unit: seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerWaitTimeSecond File arrival in mode. trigger waiting time (unit: seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerWaitTimeSecond(Long TriggerWaitTimeSecond) {
        this.TriggerWaitTimeSecond = TriggerWaitTimeSecond;
    }

    /**
     * Get Trigger status. valid values: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchedulerStatus Trigger status. valid values: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set Trigger status. valid values: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchedulerStatus Trigger status. valid values: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    public WorkflowTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTriggerConfig(WorkflowTriggerConfig source) {
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ConfigMode != null) {
            this.ConfigMode = new String(source.ConfigMode);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.FileArrivalPath != null) {
            this.FileArrivalPath = new String(source.FileArrivalPath);
        }
        if (source.TriggerMinimumIntervalSecond != null) {
            this.TriggerMinimumIntervalSecond = new Long(source.TriggerMinimumIntervalSecond);
        }
        if (source.TriggerWaitTimeSecond != null) {
            this.TriggerWaitTimeSecond = new Long(source.TriggerWaitTimeSecond);
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ConfigMode", this.ConfigMode);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "FileArrivalPath", this.FileArrivalPath);
        this.setParamSimple(map, prefix + "TriggerMinimumIntervalSecond", this.TriggerMinimumIntervalSecond);
        this.setParamSimple(map, prefix + "TriggerWaitTimeSecond", this.TriggerWaitTimeSecond);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);

    }
}

