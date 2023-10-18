/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel {

    /**
    * Specifies the time that that the scheduled snapshot policy will be triggered. The unit is hour. The value range is [0-23]. 00:00-23:00 is a total of 24 time points that can be selected. 1 indicates 01:00, and so on.
    */
    @SerializedName("Hour")
    @Expose
    private Long [] Hour;

    /**
    * Specifies the days of the week, from Monday to Sunday, on which a scheduled snapshot will be triggered. Value range: [0, 6]. 0 indicates triggering on Sunday, 1-6 indicate triggering on Monday-Saturday.
    */
    @SerializedName("DayOfWeek")
    @Expose
    private Long [] DayOfWeek;

    /**
    * Specifies the dates of the month on which a scheduled snapshot will be triggered. Value range: [1, 31]. `1` to `31` indicate the specific dates of the month; for example, `5` indicates the 5th day of the month. Note: If you set a date that does not exist in some months such as 29, 30, and 31, these months will be skipped for scheduled snapshot creation.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private Long [] DayOfMonth;

    /**
    * Specifies the interval for creating scheduled snapshots in days. Value range: [1, 365]. For example, if it is set to `5`, scheduled snapshots will be created every 5 days. Note: If you choose to back up by day, the time for the first backup is theoretically the day when the backup policy is created. If the backup policy creation time on the current day is later than the set backup time, the first backup will be performed in the second backup cycle.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get Specifies the time that that the scheduled snapshot policy will be triggered. The unit is hour. The value range is [0-23]. 00:00-23:00 is a total of 24 time points that can be selected. 1 indicates 01:00, and so on. 
     * @return Hour Specifies the time that that the scheduled snapshot policy will be triggered. The unit is hour. The value range is [0-23]. 00:00-23:00 is a total of 24 time points that can be selected. 1 indicates 01:00, and so on.
     */
    public Long [] getHour() {
        return this.Hour;
    }

    /**
     * Set Specifies the time that that the scheduled snapshot policy will be triggered. The unit is hour. The value range is [0-23]. 00:00-23:00 is a total of 24 time points that can be selected. 1 indicates 01:00, and so on.
     * @param Hour Specifies the time that that the scheduled snapshot policy will be triggered. The unit is hour. The value range is [0-23]. 00:00-23:00 is a total of 24 time points that can be selected. 1 indicates 01:00, and so on.
     */
    public void setHour(Long [] Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Specifies the days of the week, from Monday to Sunday, on which a scheduled snapshot will be triggered. Value range: [0, 6]. 0 indicates triggering on Sunday, 1-6 indicate triggering on Monday-Saturday. 
     * @return DayOfWeek Specifies the days of the week, from Monday to Sunday, on which a scheduled snapshot will be triggered. Value range: [0, 6]. 0 indicates triggering on Sunday, 1-6 indicate triggering on Monday-Saturday.
     */
    public Long [] getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set Specifies the days of the week, from Monday to Sunday, on which a scheduled snapshot will be triggered. Value range: [0, 6]. 0 indicates triggering on Sunday, 1-6 indicate triggering on Monday-Saturday.
     * @param DayOfWeek Specifies the days of the week, from Monday to Sunday, on which a scheduled snapshot will be triggered. Value range: [0, 6]. 0 indicates triggering on Sunday, 1-6 indicate triggering on Monday-Saturday.
     */
    public void setDayOfWeek(Long [] DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get Specifies the dates of the month on which a scheduled snapshot will be triggered. Value range: [1, 31]. `1` to `31` indicate the specific dates of the month; for example, `5` indicates the 5th day of the month. Note: If you set a date that does not exist in some months such as 29, 30, and 31, these months will be skipped for scheduled snapshot creation. 
     * @return DayOfMonth Specifies the dates of the month on which a scheduled snapshot will be triggered. Value range: [1, 31]. `1` to `31` indicate the specific dates of the month; for example, `5` indicates the 5th day of the month. Note: If you set a date that does not exist in some months such as 29, 30, and 31, these months will be skipped for scheduled snapshot creation.
     */
    public Long [] getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set Specifies the dates of the month on which a scheduled snapshot will be triggered. Value range: [1, 31]. `1` to `31` indicate the specific dates of the month; for example, `5` indicates the 5th day of the month. Note: If you set a date that does not exist in some months such as 29, 30, and 31, these months will be skipped for scheduled snapshot creation.
     * @param DayOfMonth Specifies the dates of the month on which a scheduled snapshot will be triggered. Value range: [1, 31]. `1` to `31` indicate the specific dates of the month; for example, `5` indicates the 5th day of the month. Note: If you set a date that does not exist in some months such as 29, 30, and 31, these months will be skipped for scheduled snapshot creation.
     */
    public void setDayOfMonth(Long [] DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get Specifies the interval for creating scheduled snapshots in days. Value range: [1, 365]. For example, if it is set to `5`, scheduled snapshots will be created every 5 days. Note: If you choose to back up by day, the time for the first backup is theoretically the day when the backup policy is created. If the backup policy creation time on the current day is later than the set backup time, the first backup will be performed in the second backup cycle. 
     * @return IntervalDays Specifies the interval for creating scheduled snapshots in days. Value range: [1, 365]. For example, if it is set to `5`, scheduled snapshots will be created every 5 days. Note: If you choose to back up by day, the time for the first backup is theoretically the day when the backup policy is created. If the backup policy creation time on the current day is later than the set backup time, the first backup will be performed in the second backup cycle.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set Specifies the interval for creating scheduled snapshots in days. Value range: [1, 365]. For example, if it is set to `5`, scheduled snapshots will be created every 5 days. Note: If you choose to back up by day, the time for the first backup is theoretically the day when the backup policy is created. If the backup policy creation time on the current day is later than the set backup time, the first backup will be performed in the second backup cycle.
     * @param IntervalDays Specifies the interval for creating scheduled snapshots in days. Value range: [1, 365]. For example, if it is set to `5`, scheduled snapshots will be created every 5 days. Note: If you choose to back up by day, the time for the first backup is theoretically the day when the backup policy is created. If the backup policy creation time on the current day is later than the set backup time, the first backup will be performed in the second backup cycle.
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Hour != null) {
            this.Hour = new Long[source.Hour.length];
            for (int i = 0; i < source.Hour.length; i++) {
                this.Hour[i] = new Long(source.Hour[i]);
            }
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new Long[source.DayOfWeek.length];
            for (int i = 0; i < source.DayOfWeek.length; i++) {
                this.DayOfWeek[i] = new Long(source.DayOfWeek[i]);
            }
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new Long[source.DayOfMonth.length];
            for (int i = 0; i < source.DayOfMonth.length; i++) {
                this.DayOfMonth[i] = new Long(source.DayOfMonth[i]);
            }
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Hour.", this.Hour);
        this.setParamArraySimple(map, prefix + "DayOfWeek.", this.DayOfWeek);
        this.setParamArraySimple(map, prefix + "DayOfMonth.", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

