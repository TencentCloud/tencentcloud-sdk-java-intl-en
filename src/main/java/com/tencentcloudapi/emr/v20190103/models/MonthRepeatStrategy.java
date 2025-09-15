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

public class MonthRepeatStrategy extends AbstractModel {

    /**
    * Specific time for repetition task execution, such as 01:02:00.
    */
    @SerializedName("ExecuteAtTimeOfDay")
    @Expose
    private String ExecuteAtTimeOfDay;

    /**
    * Description of time period in days of the month. The length must be 2. For example, [2,10] indicates from the 2nd day to the 10th day every month.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DaysOfMonthRange")
    @Expose
    private Long [] DaysOfMonthRange;

    /**
     * Get Specific time for repetition task execution, such as 01:02:00. 
     * @return ExecuteAtTimeOfDay Specific time for repetition task execution, such as 01:02:00.
     */
    public String getExecuteAtTimeOfDay() {
        return this.ExecuteAtTimeOfDay;
    }

    /**
     * Set Specific time for repetition task execution, such as 01:02:00.
     * @param ExecuteAtTimeOfDay Specific time for repetition task execution, such as 01:02:00.
     */
    public void setExecuteAtTimeOfDay(String ExecuteAtTimeOfDay) {
        this.ExecuteAtTimeOfDay = ExecuteAtTimeOfDay;
    }

    /**
     * Get Description of time period in days of the month. The length must be 2. For example, [2,10] indicates from the 2nd day to the 10th day every month.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DaysOfMonthRange Description of time period in days of the month. The length must be 2. For example, [2,10] indicates from the 2nd day to the 10th day every month.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDaysOfMonthRange() {
        return this.DaysOfMonthRange;
    }

    /**
     * Set Description of time period in days of the month. The length must be 2. For example, [2,10] indicates from the 2nd day to the 10th day every month.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DaysOfMonthRange Description of time period in days of the month. The length must be 2. For example, [2,10] indicates from the 2nd day to the 10th day every month.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDaysOfMonthRange(Long [] DaysOfMonthRange) {
        this.DaysOfMonthRange = DaysOfMonthRange;
    }

    public MonthRepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthRepeatStrategy(MonthRepeatStrategy source) {
        if (source.ExecuteAtTimeOfDay != null) {
            this.ExecuteAtTimeOfDay = new String(source.ExecuteAtTimeOfDay);
        }
        if (source.DaysOfMonthRange != null) {
            this.DaysOfMonthRange = new Long[source.DaysOfMonthRange.length];
            for (int i = 0; i < source.DaysOfMonthRange.length; i++) {
                this.DaysOfMonthRange[i] = new Long(source.DaysOfMonthRange[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteAtTimeOfDay", this.ExecuteAtTimeOfDay);
        this.setParamArraySimple(map, prefix + "DaysOfMonthRange.", this.DaysOfMonthRange);

    }
}

