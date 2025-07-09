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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonTimeWindow extends AbstractModel {

    /**
    * Time window on Monday in the format of 02:00-06:00
    */
    @SerializedName("Monday")
    @Expose
    private String Monday;

    /**
    * Time window on Tuesday in the format of 02:00-06:00
    */
    @SerializedName("Tuesday")
    @Expose
    private String Tuesday;

    /**
    * Time window on Wednesday in the format of 02:00-06:00
    */
    @SerializedName("Wednesday")
    @Expose
    private String Wednesday;

    /**
    * Time window on Thursday in the format of 02:00-06:00
    */
    @SerializedName("Thursday")
    @Expose
    private String Thursday;

    /**
    * Time window on Friday in the format of 02:00-06:00
    */
    @SerializedName("Friday")
    @Expose
    private String Friday;

    /**
    * Time window on Saturday in the format of 02:00-06:00
    */
    @SerializedName("Saturday")
    @Expose
    private String Saturday;

    /**
    * Time window on Sunday in the format of 02:00-06:00
    */
    @SerializedName("Sunday")
    @Expose
    private String Sunday;

    /**
    * Non-archive backup retention policy. Valid values: `weekly` (back up by week), monthly (back up by month), default value: `weekly`.
    */
    @SerializedName("BackupPeriodStrategy")
    @Expose
    private String BackupPeriodStrategy;

    /**
    * If `BackupPeriodStrategy` is `monthly`, you need to pass in the specific backup dates. The time interval between any two adjacent dates cannot exceed 2 days, for example, [1,4,7,9,11,14,17,19,22,25,28,30,31].
    */
    @SerializedName("Days")
    @Expose
    private Long [] Days;

    /**
    * Backup time by month in the format of 02:00–06:00, which is required when `BackupPeriodStrategy` is `monthly`.
    */
    @SerializedName("BackupPeriodTime")
    @Expose
    private String BackupPeriodTime;

    /**
     * Get Time window on Monday in the format of 02:00-06:00 
     * @return Monday Time window on Monday in the format of 02:00-06:00
     */
    public String getMonday() {
        return this.Monday;
    }

    /**
     * Set Time window on Monday in the format of 02:00-06:00
     * @param Monday Time window on Monday in the format of 02:00-06:00
     */
    public void setMonday(String Monday) {
        this.Monday = Monday;
    }

    /**
     * Get Time window on Tuesday in the format of 02:00-06:00 
     * @return Tuesday Time window on Tuesday in the format of 02:00-06:00
     */
    public String getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set Time window on Tuesday in the format of 02:00-06:00
     * @param Tuesday Time window on Tuesday in the format of 02:00-06:00
     */
    public void setTuesday(String Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get Time window on Wednesday in the format of 02:00-06:00 
     * @return Wednesday Time window on Wednesday in the format of 02:00-06:00
     */
    public String getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set Time window on Wednesday in the format of 02:00-06:00
     * @param Wednesday Time window on Wednesday in the format of 02:00-06:00
     */
    public void setWednesday(String Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get Time window on Thursday in the format of 02:00-06:00 
     * @return Thursday Time window on Thursday in the format of 02:00-06:00
     */
    public String getThursday() {
        return this.Thursday;
    }

    /**
     * Set Time window on Thursday in the format of 02:00-06:00
     * @param Thursday Time window on Thursday in the format of 02:00-06:00
     */
    public void setThursday(String Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get Time window on Friday in the format of 02:00-06:00 
     * @return Friday Time window on Friday in the format of 02:00-06:00
     */
    public String getFriday() {
        return this.Friday;
    }

    /**
     * Set Time window on Friday in the format of 02:00-06:00
     * @param Friday Time window on Friday in the format of 02:00-06:00
     */
    public void setFriday(String Friday) {
        this.Friday = Friday;
    }

    /**
     * Get Time window on Saturday in the format of 02:00-06:00 
     * @return Saturday Time window on Saturday in the format of 02:00-06:00
     */
    public String getSaturday() {
        return this.Saturday;
    }

    /**
     * Set Time window on Saturday in the format of 02:00-06:00
     * @param Saturday Time window on Saturday in the format of 02:00-06:00
     */
    public void setSaturday(String Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get Time window on Sunday in the format of 02:00-06:00 
     * @return Sunday Time window on Sunday in the format of 02:00-06:00
     */
    public String getSunday() {
        return this.Sunday;
    }

    /**
     * Set Time window on Sunday in the format of 02:00-06:00
     * @param Sunday Time window on Sunday in the format of 02:00-06:00
     */
    public void setSunday(String Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Get Non-archive backup retention policy. Valid values: `weekly` (back up by week), monthly (back up by month), default value: `weekly`. 
     * @return BackupPeriodStrategy Non-archive backup retention policy. Valid values: `weekly` (back up by week), monthly (back up by month), default value: `weekly`.
     */
    public String getBackupPeriodStrategy() {
        return this.BackupPeriodStrategy;
    }

    /**
     * Set Non-archive backup retention policy. Valid values: `weekly` (back up by week), monthly (back up by month), default value: `weekly`.
     * @param BackupPeriodStrategy Non-archive backup retention policy. Valid values: `weekly` (back up by week), monthly (back up by month), default value: `weekly`.
     */
    public void setBackupPeriodStrategy(String BackupPeriodStrategy) {
        this.BackupPeriodStrategy = BackupPeriodStrategy;
    }

    /**
     * Get If `BackupPeriodStrategy` is `monthly`, you need to pass in the specific backup dates. The time interval between any two adjacent dates cannot exceed 2 days, for example, [1,4,7,9,11,14,17,19,22,25,28,30,31]. 
     * @return Days If `BackupPeriodStrategy` is `monthly`, you need to pass in the specific backup dates. The time interval between any two adjacent dates cannot exceed 2 days, for example, [1,4,7,9,11,14,17,19,22,25,28,30,31].
     */
    public Long [] getDays() {
        return this.Days;
    }

    /**
     * Set If `BackupPeriodStrategy` is `monthly`, you need to pass in the specific backup dates. The time interval between any two adjacent dates cannot exceed 2 days, for example, [1,4,7,9,11,14,17,19,22,25,28,30,31].
     * @param Days If `BackupPeriodStrategy` is `monthly`, you need to pass in the specific backup dates. The time interval between any two adjacent dates cannot exceed 2 days, for example, [1,4,7,9,11,14,17,19,22,25,28,30,31].
     */
    public void setDays(Long [] Days) {
        this.Days = Days;
    }

    /**
     * Get Backup time by month in the format of 02:00–06:00, which is required when `BackupPeriodStrategy` is `monthly`. 
     * @return BackupPeriodTime Backup time by month in the format of 02:00–06:00, which is required when `BackupPeriodStrategy` is `monthly`.
     */
    public String getBackupPeriodTime() {
        return this.BackupPeriodTime;
    }

    /**
     * Set Backup time by month in the format of 02:00–06:00, which is required when `BackupPeriodStrategy` is `monthly`.
     * @param BackupPeriodTime Backup time by month in the format of 02:00–06:00, which is required when `BackupPeriodStrategy` is `monthly`.
     */
    public void setBackupPeriodTime(String BackupPeriodTime) {
        this.BackupPeriodTime = BackupPeriodTime;
    }

    public CommonTimeWindow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonTimeWindow(CommonTimeWindow source) {
        if (source.Monday != null) {
            this.Monday = new String(source.Monday);
        }
        if (source.Tuesday != null) {
            this.Tuesday = new String(source.Tuesday);
        }
        if (source.Wednesday != null) {
            this.Wednesday = new String(source.Wednesday);
        }
        if (source.Thursday != null) {
            this.Thursday = new String(source.Thursday);
        }
        if (source.Friday != null) {
            this.Friday = new String(source.Friday);
        }
        if (source.Saturday != null) {
            this.Saturday = new String(source.Saturday);
        }
        if (source.Sunday != null) {
            this.Sunday = new String(source.Sunday);
        }
        if (source.BackupPeriodStrategy != null) {
            this.BackupPeriodStrategy = new String(source.BackupPeriodStrategy);
        }
        if (source.Days != null) {
            this.Days = new Long[source.Days.length];
            for (int i = 0; i < source.Days.length; i++) {
                this.Days[i] = new Long(source.Days[i]);
            }
        }
        if (source.BackupPeriodTime != null) {
            this.BackupPeriodTime = new String(source.BackupPeriodTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Monday", this.Monday);
        this.setParamSimple(map, prefix + "Tuesday", this.Tuesday);
        this.setParamSimple(map, prefix + "Wednesday", this.Wednesday);
        this.setParamSimple(map, prefix + "Thursday", this.Thursday);
        this.setParamSimple(map, prefix + "Friday", this.Friday);
        this.setParamSimple(map, prefix + "Saturday", this.Saturday);
        this.setParamSimple(map, prefix + "Sunday", this.Sunday);
        this.setParamSimple(map, prefix + "BackupPeriodStrategy", this.BackupPeriodStrategy);
        this.setParamArraySimple(map, prefix + "Days.", this.Days);
        this.setParamSimple(map, prefix + "BackupPeriodTime", this.BackupPeriodTime);

    }
}

