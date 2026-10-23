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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparsePeriodTime extends AbstractModel {

    /**
    * By week: list of days of the week, 1-7, 1=Monday, 7=Sunday (only for weekly period, up to 7)
    */
    @SerializedName("WeekDays")
    @Expose
    private Long [] WeekDays;

    /**
    * Monthly: date list, 1-31 (only for monthly cycle, up to 7)
    */
    @SerializedName("Days")
    @Expose
    private Long [] Days;

    /**
    * Yearly: list of month-day combinations (only for yearly cycle, up to 7)
    */
    @SerializedName("MonthDays")
    @Expose
    private MonthDay [] MonthDays;

    /**
     * Get By week: list of days of the week, 1-7, 1=Monday, 7=Sunday (only for weekly period, up to 7) 
     * @return WeekDays By week: list of days of the week, 1-7, 1=Monday, 7=Sunday (only for weekly period, up to 7)
     */
    public Long [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set By week: list of days of the week, 1-7, 1=Monday, 7=Sunday (only for weekly period, up to 7)
     * @param WeekDays By week: list of days of the week, 1-7, 1=Monday, 7=Sunday (only for weekly period, up to 7)
     */
    public void setWeekDays(Long [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Monthly: date list, 1-31 (only for monthly cycle, up to 7) 
     * @return Days Monthly: date list, 1-31 (only for monthly cycle, up to 7)
     */
    public Long [] getDays() {
        return this.Days;
    }

    /**
     * Set Monthly: date list, 1-31 (only for monthly cycle, up to 7)
     * @param Days Monthly: date list, 1-31 (only for monthly cycle, up to 7)
     */
    public void setDays(Long [] Days) {
        this.Days = Days;
    }

    /**
     * Get Yearly: list of month-day combinations (only for yearly cycle, up to 7) 
     * @return MonthDays Yearly: list of month-day combinations (only for yearly cycle, up to 7)
     */
    public MonthDay [] getMonthDays() {
        return this.MonthDays;
    }

    /**
     * Set Yearly: list of month-day combinations (only for yearly cycle, up to 7)
     * @param MonthDays Yearly: list of month-day combinations (only for yearly cycle, up to 7)
     */
    public void setMonthDays(MonthDay [] MonthDays) {
        this.MonthDays = MonthDays;
    }

    public SparsePeriodTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparsePeriodTime(SparsePeriodTime source) {
        if (source.WeekDays != null) {
            this.WeekDays = new Long[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new Long(source.WeekDays[i]);
            }
        }
        if (source.Days != null) {
            this.Days = new Long[source.Days.length];
            for (int i = 0; i < source.Days.length; i++) {
                this.Days[i] = new Long(source.Days[i]);
            }
        }
        if (source.MonthDays != null) {
            this.MonthDays = new MonthDay[source.MonthDays.length];
            for (int i = 0; i < source.MonthDays.length; i++) {
                this.MonthDays[i] = new MonthDay(source.MonthDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamArraySimple(map, prefix + "Days.", this.Days);
        this.setParamArrayObj(map, prefix + "MonthDays.", this.MonthDays);

    }
}

