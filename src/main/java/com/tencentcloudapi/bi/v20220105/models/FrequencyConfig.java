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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrequencyConfig extends AbstractModel {

    /**
    * Cycle
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * Date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Dates")
    @Expose
    private Long [] Dates;

    /**
    * Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Interval
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 1:SECOND,2:MINUTE,3:HOUR,4:DAY
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTimeUnit")
    @Expose
    private Long IntervalTimeUnit;

    /**
    * hourly list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hours")
    @Expose
    private Long [] Hours;

    /**
    * Minute list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Minute")
    @Expose
    private Long [] Minute;

    /**
     * Get Cycle
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Frequency Cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Cycle
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Frequency Cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Dates Date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDates() {
        return this.Dates;
    }

    /**
     * Set Date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Dates Date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDates(Long [] Dates) {
        this.Dates = Dates;
    }

    /**
     * Get Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Time Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Time Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Interval
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTime Interval
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Interval
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalTime Interval
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 1:SECOND,2:MINUTE,3:HOUR,4:DAY
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTimeUnit 1:SECOND,2:MINUTE,3:HOUR,4:DAY
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTimeUnit() {
        return this.IntervalTimeUnit;
    }

    /**
     * Set 1:SECOND,2:MINUTE,3:HOUR,4:DAY
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalTimeUnit 1:SECOND,2:MINUTE,3:HOUR,4:DAY
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTimeUnit(Long IntervalTimeUnit) {
        this.IntervalTimeUnit = IntervalTimeUnit;
    }

    /**
     * Get hourly list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Hours hourly list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getHours() {
        return this.Hours;
    }

    /**
     * Set hourly list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Hours hourly list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHours(Long [] Hours) {
        this.Hours = Hours;
    }

    /**
     * Get Minute list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Minute Minute list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getMinute() {
        return this.Minute;
    }

    /**
     * Set Minute list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Minute Minute list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinute(Long [] Minute) {
        this.Minute = Minute;
    }

    public FrequencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequencyConfig(FrequencyConfig source) {
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.Dates != null) {
            this.Dates = new Long[source.Dates.length];
            for (int i = 0; i < source.Dates.length; i++) {
                this.Dates[i] = new Long(source.Dates[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.IntervalTimeUnit != null) {
            this.IntervalTimeUnit = new Long(source.IntervalTimeUnit);
        }
        if (source.Hours != null) {
            this.Hours = new Long[source.Hours.length];
            for (int i = 0; i < source.Hours.length; i++) {
                this.Hours[i] = new Long(source.Hours[i]);
            }
        }
        if (source.Minute != null) {
            this.Minute = new Long[source.Minute.length];
            for (int i = 0; i < source.Minute.length; i++) {
                this.Minute[i] = new Long(source.Minute[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamArraySimple(map, prefix + "Dates.", this.Dates);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "IntervalTimeUnit", this.IntervalTimeUnit);
        this.setParamArraySimple(map, prefix + "Hours.", this.Hours);
        this.setParamArraySimple(map, prefix + "Minute.", this.Minute);

    }
}

