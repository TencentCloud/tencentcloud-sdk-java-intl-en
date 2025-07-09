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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerValue extends AbstractModel {

    /**
    * Execute once every X day(s)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Day")
    @Expose
    private Long Day;

    /**
    * Specify the first day to execute the scaling action in a month (execute once per day)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FromDay")
    @Expose
    private Long FromDay;

    /**
    * Specify the last day to execute the scaling action in a month
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ToDay")
    @Expose
    private Long ToDay;

    /**
    * Specify the week days to repeat the scaling action. Multiple values are supported. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WeekDays")
    @Expose
    private Long [] WeekDays;

    /**
     * Get Execute once every X day(s)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Day Execute once every X day(s)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDay() {
        return this.Day;
    }

    /**
     * Set Execute once every X day(s)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Day Execute once every X day(s)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDay(Long Day) {
        this.Day = Day;
    }

    /**
     * Get Specify the first day to execute the scaling action in a month (execute once per day)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FromDay Specify the first day to execute the scaling action in a month (execute once per day)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFromDay() {
        return this.FromDay;
    }

    /**
     * Set Specify the first day to execute the scaling action in a month (execute once per day)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FromDay Specify the first day to execute the scaling action in a month (execute once per day)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFromDay(Long FromDay) {
        this.FromDay = FromDay;
    }

    /**
     * Get Specify the last day to execute the scaling action in a month
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ToDay Specify the last day to execute the scaling action in a month
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getToDay() {
        return this.ToDay;
    }

    /**
     * Set Specify the last day to execute the scaling action in a month
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ToDay Specify the last day to execute the scaling action in a month
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setToDay(Long ToDay) {
        this.ToDay = ToDay;
    }

    /**
     * Get Specify the week days to repeat the scaling action. Multiple values are supported. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WeekDays Specify the week days to repeat the scaling action. Multiple values are supported. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Specify the week days to repeat the scaling action. Multiple values are supported. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WeekDays Specify the week days to repeat the scaling action. Multiple values are supported. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWeekDays(Long [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    public TimerValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerValue(TimerValue source) {
        if (source.Day != null) {
            this.Day = new Long(source.Day);
        }
        if (source.FromDay != null) {
            this.FromDay = new Long(source.FromDay);
        }
        if (source.ToDay != null) {
            this.ToDay = new Long(source.ToDay);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new Long[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new Long(source.WeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamSimple(map, prefix + "FromDay", this.FromDay);
        this.setParamSimple(map, prefix + "ToDay", this.ToDay);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);

    }
}

