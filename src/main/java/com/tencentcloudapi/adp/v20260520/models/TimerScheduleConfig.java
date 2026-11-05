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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerScheduleConfig extends AbstractModel {

    /**
    * Cron configuration.
    */
    @SerializedName("Cron")
    @Expose
    private CronSchedule Cron;

    /**
    * Daily trigger
    */
    @SerializedName("Daily")
    @Expose
    private DailySchedule Daily;

    /**
    * Fixed interval
    */
    @SerializedName("Interval")
    @Expose
    private IntervalSchedule Interval;

    /**
    * Manual only
    */
    @SerializedName("ManualOnly")
    @Expose
    private ManualOnlySchedule ManualOnly;

    /**
    * Single time
    */
    @SerializedName("Once")
    @Expose
    private OnceSchedule Once;

    /**
    * Enumeration values:
| uint | Description |
| --- | --- |
| 0 |  |
Manual only
| 2 | Daily |
| 3 | Weekly |
| 4 | By interval |
| 5 | One-time |
| 6 | Cron |
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * Time zone
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * Triggers at a fixed time weekly.
    */
    @SerializedName("Weekly")
    @Expose
    private WeeklySchedule Weekly;

    /**
     * Get Cron configuration. 
     * @return Cron Cron configuration.
     */
    public CronSchedule getCron() {
        return this.Cron;
    }

    /**
     * Set Cron configuration.
     * @param Cron Cron configuration.
     */
    public void setCron(CronSchedule Cron) {
        this.Cron = Cron;
    }

    /**
     * Get Daily trigger 
     * @return Daily Daily trigger
     */
    public DailySchedule getDaily() {
        return this.Daily;
    }

    /**
     * Set Daily trigger
     * @param Daily Daily trigger
     */
    public void setDaily(DailySchedule Daily) {
        this.Daily = Daily;
    }

    /**
     * Get Fixed interval 
     * @return Interval Fixed interval
     */
    public IntervalSchedule getInterval() {
        return this.Interval;
    }

    /**
     * Set Fixed interval
     * @param Interval Fixed interval
     */
    public void setInterval(IntervalSchedule Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Manual only 
     * @return ManualOnly Manual only
     */
    public ManualOnlySchedule getManualOnly() {
        return this.ManualOnly;
    }

    /**
     * Set Manual only
     * @param ManualOnly Manual only
     */
    public void setManualOnly(ManualOnlySchedule ManualOnly) {
        this.ManualOnly = ManualOnly;
    }

    /**
     * Get Single time 
     * @return Once Single time
     */
    public OnceSchedule getOnce() {
        return this.Once;
    }

    /**
     * Set Single time
     * @param Once Single time
     */
    public void setOnce(OnceSchedule Once) {
        this.Once = Once;
    }

    /**
     * Get Enumeration values:
| uint | Description |
| --- | --- |
| 0 |  |
Manual only
| 2 | Daily |
| 3 | Weekly |
| 4 | By interval |
| 5 | One-time |
| 6 | Cron | 
     * @return ScheduleType Enumeration values:
| uint | Description |
| --- | --- |
| 0 |  |
Manual only
| 2 | Daily |
| 3 | Weekly |
| 4 | By interval |
| 5 | One-time |
| 6 | Cron |
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set Enumeration values:
| uint | Description |
| --- | --- |
| 0 |  |
Manual only
| 2 | Daily |
| 3 | Weekly |
| 4 | By interval |
| 5 | One-time |
| 6 | Cron |
     * @param ScheduleType Enumeration values:
| uint | Description |
| --- | --- |
| 0 |  |
Manual only
| 2 | Daily |
| 3 | Weekly |
| 4 | By interval |
| 5 | One-time |
| 6 | Cron |
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get Time zone 
     * @return Timezone Time zone
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set Time zone
     * @param Timezone Time zone
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get Triggers at a fixed time weekly. 
     * @return Weekly Triggers at a fixed time weekly.
     */
    public WeeklySchedule getWeekly() {
        return this.Weekly;
    }

    /**
     * Set Triggers at a fixed time weekly.
     * @param Weekly Triggers at a fixed time weekly.
     */
    public void setWeekly(WeeklySchedule Weekly) {
        this.Weekly = Weekly;
    }

    public TimerScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerScheduleConfig(TimerScheduleConfig source) {
        if (source.Cron != null) {
            this.Cron = new CronSchedule(source.Cron);
        }
        if (source.Daily != null) {
            this.Daily = new DailySchedule(source.Daily);
        }
        if (source.Interval != null) {
            this.Interval = new IntervalSchedule(source.Interval);
        }
        if (source.ManualOnly != null) {
            this.ManualOnly = new ManualOnlySchedule(source.ManualOnly);
        }
        if (source.Once != null) {
            this.Once = new OnceSchedule(source.Once);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.Weekly != null) {
            this.Weekly = new WeeklySchedule(source.Weekly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cron.", this.Cron);
        this.setParamObj(map, prefix + "Daily.", this.Daily);
        this.setParamObj(map, prefix + "Interval.", this.Interval);
        this.setParamObj(map, prefix + "ManualOnly.", this.ManualOnly);
        this.setParamObj(map, prefix + "Once.", this.Once);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamObj(map, prefix + "Weekly.", this.Weekly);

    }
}

