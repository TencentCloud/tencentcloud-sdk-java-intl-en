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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableTimeConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("DayType")
    @Expose
    private String DayType;

    /**
    * 
    */
    @SerializedName("DaysOfWeek")
    @Expose
    private String [] DaysOfWeek;

    /**
    * 
    */
    @SerializedName("TimeRanges")
    @Expose
    private TimeRange [] TimeRanges;

    /**
     * Get  
     * @return DayType 
     */
    public String getDayType() {
        return this.DayType;
    }

    /**
     * Set 
     * @param DayType 
     */
    public void setDayType(String DayType) {
        this.DayType = DayType;
    }

    /**
     * Get  
     * @return DaysOfWeek 
     */
    public String [] getDaysOfWeek() {
        return this.DaysOfWeek;
    }

    /**
     * Set 
     * @param DaysOfWeek 
     */
    public void setDaysOfWeek(String [] DaysOfWeek) {
        this.DaysOfWeek = DaysOfWeek;
    }

    /**
     * Get  
     * @return TimeRanges 
     */
    public TimeRange [] getTimeRanges() {
        return this.TimeRanges;
    }

    /**
     * Set 
     * @param TimeRanges 
     */
    public void setTimeRanges(TimeRange [] TimeRanges) {
        this.TimeRanges = TimeRanges;
    }

    public AvailableTimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableTimeConfig(AvailableTimeConfig source) {
        if (source.DayType != null) {
            this.DayType = new String(source.DayType);
        }
        if (source.DaysOfWeek != null) {
            this.DaysOfWeek = new String[source.DaysOfWeek.length];
            for (int i = 0; i < source.DaysOfWeek.length; i++) {
                this.DaysOfWeek[i] = new String(source.DaysOfWeek[i]);
            }
        }
        if (source.TimeRanges != null) {
            this.TimeRanges = new TimeRange[source.TimeRanges.length];
            for (int i = 0; i < source.TimeRanges.length; i++) {
                this.TimeRanges[i] = new TimeRange(source.TimeRanges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayType", this.DayType);
        this.setParamArraySimple(map, prefix + "DaysOfWeek.", this.DaysOfWeek);
        this.setParamArrayObj(map, prefix + "TimeRanges.", this.TimeRanges);

    }
}

