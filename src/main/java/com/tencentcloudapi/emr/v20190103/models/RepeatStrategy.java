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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepeatStrategy extends AbstractModel {

    /**
    * The valid values DAY, DOW, DOM, and NONE respectively indicate repetition by day, repetition by week, repetition by month, and one-time execution. This parameter is required.
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
    * Daily repetition rule, which is effective when RepeatType is set to DAY

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DayRepeat")
    @Expose
    private DayRepeatStrategy DayRepeat;

    /**
    * Weekly repetition rule, effective when RepeatType is DOW

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeekRepeat")
    @Expose
    private WeekRepeatStrategy WeekRepeat;

    /**
    * Monthly repetition rule, valid when RepeatType is DOM

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonthRepeat")
    @Expose
    private MonthRepeatStrategy MonthRepeat;

    /**
    * One-time execution rule, valid when RepeatType is NONE

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotRepeat")
    @Expose
    private NotRepeatStrategy NotRepeat;

    /**
    * Rule expiration time. After this time is due, the rule will be automatically set to the status "suspended". The format is "2020-07-23 00:00:00". It is required.
    */
    @SerializedName("Expire")
    @Expose
    private String Expire;

    /**
    * Periodic rule start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get The valid values DAY, DOW, DOM, and NONE respectively indicate repetition by day, repetition by week, repetition by month, and one-time execution. This parameter is required. 
     * @return RepeatType The valid values DAY, DOW, DOM, and NONE respectively indicate repetition by day, repetition by week, repetition by month, and one-time execution. This parameter is required.
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set The valid values DAY, DOW, DOM, and NONE respectively indicate repetition by day, repetition by week, repetition by month, and one-time execution. This parameter is required.
     * @param RepeatType The valid values DAY, DOW, DOM, and NONE respectively indicate repetition by day, repetition by week, repetition by month, and one-time execution. This parameter is required.
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    /**
     * Get Daily repetition rule, which is effective when RepeatType is set to DAY

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DayRepeat Daily repetition rule, which is effective when RepeatType is set to DAY

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DayRepeatStrategy getDayRepeat() {
        return this.DayRepeat;
    }

    /**
     * Set Daily repetition rule, which is effective when RepeatType is set to DAY

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DayRepeat Daily repetition rule, which is effective when RepeatType is set to DAY

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDayRepeat(DayRepeatStrategy DayRepeat) {
        this.DayRepeat = DayRepeat;
    }

    /**
     * Get Weekly repetition rule, effective when RepeatType is DOW

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WeekRepeat Weekly repetition rule, effective when RepeatType is DOW

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WeekRepeatStrategy getWeekRepeat() {
        return this.WeekRepeat;
    }

    /**
     * Set Weekly repetition rule, effective when RepeatType is DOW

Note: This field may return null, indicating that no valid values can be obtained.
     * @param WeekRepeat Weekly repetition rule, effective when RepeatType is DOW

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeekRepeat(WeekRepeatStrategy WeekRepeat) {
        this.WeekRepeat = WeekRepeat;
    }

    /**
     * Get Monthly repetition rule, valid when RepeatType is DOM

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MonthRepeat Monthly repetition rule, valid when RepeatType is DOM

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MonthRepeatStrategy getMonthRepeat() {
        return this.MonthRepeat;
    }

    /**
     * Set Monthly repetition rule, valid when RepeatType is DOM

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MonthRepeat Monthly repetition rule, valid when RepeatType is DOM

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonthRepeat(MonthRepeatStrategy MonthRepeat) {
        this.MonthRepeat = MonthRepeat;
    }

    /**
     * Get One-time execution rule, valid when RepeatType is NONE

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NotRepeat One-time execution rule, valid when RepeatType is NONE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NotRepeatStrategy getNotRepeat() {
        return this.NotRepeat;
    }

    /**
     * Set One-time execution rule, valid when RepeatType is NONE

Note: This field may return null, indicating that no valid values can be obtained.
     * @param NotRepeat One-time execution rule, valid when RepeatType is NONE

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNotRepeat(NotRepeatStrategy NotRepeat) {
        this.NotRepeat = NotRepeat;
    }

    /**
     * Get Rule expiration time. After this time is due, the rule will be automatically set to the status "suspended". The format is "2020-07-23 00:00:00". It is required. 
     * @return Expire Rule expiration time. After this time is due, the rule will be automatically set to the status "suspended". The format is "2020-07-23 00:00:00". It is required.
     */
    public String getExpire() {
        return this.Expire;
    }

    /**
     * Set Rule expiration time. After this time is due, the rule will be automatically set to the status "suspended". The format is "2020-07-23 00:00:00". It is required.
     * @param Expire Rule expiration time. After this time is due, the rule will be automatically set to the status "suspended". The format is "2020-07-23 00:00:00". It is required.
     */
    public void setExpire(String Expire) {
        this.Expire = Expire;
    }

    /**
     * Get Periodic rule start time. 
     * @return StartTime Periodic rule start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Periodic rule start time.
     * @param StartTime Periodic rule start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public RepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepeatStrategy(RepeatStrategy source) {
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
        if (source.DayRepeat != null) {
            this.DayRepeat = new DayRepeatStrategy(source.DayRepeat);
        }
        if (source.WeekRepeat != null) {
            this.WeekRepeat = new WeekRepeatStrategy(source.WeekRepeat);
        }
        if (source.MonthRepeat != null) {
            this.MonthRepeat = new MonthRepeatStrategy(source.MonthRepeat);
        }
        if (source.NotRepeat != null) {
            this.NotRepeat = new NotRepeatStrategy(source.NotRepeat);
        }
        if (source.Expire != null) {
            this.Expire = new String(source.Expire);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);
        this.setParamObj(map, prefix + "DayRepeat.", this.DayRepeat);
        this.setParamObj(map, prefix + "WeekRepeat.", this.WeekRepeat);
        this.setParamObj(map, prefix + "MonthRepeat.", this.MonthRepeat);
        this.setParamObj(map, prefix + "NotRepeat.", this.NotRepeat);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

