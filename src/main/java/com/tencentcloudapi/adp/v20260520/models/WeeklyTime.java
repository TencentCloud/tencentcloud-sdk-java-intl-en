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

public class WeeklyTime extends AbstractModel {

    /**
    * Time
    */
    @SerializedName("TimeOfDay")
    @Expose
    private String TimeOfDay;

    /**
    * Day of the week
    */
    @SerializedName("Weekday")
    @Expose
    private Long Weekday;

    /**
     * Get Time 
     * @return TimeOfDay Time
     */
    public String getTimeOfDay() {
        return this.TimeOfDay;
    }

    /**
     * Set Time
     * @param TimeOfDay Time
     */
    public void setTimeOfDay(String TimeOfDay) {
        this.TimeOfDay = TimeOfDay;
    }

    /**
     * Get Day of the week 
     * @return Weekday Day of the week
     */
    public Long getWeekday() {
        return this.Weekday;
    }

    /**
     * Set Day of the week
     * @param Weekday Day of the week
     */
    public void setWeekday(Long Weekday) {
        this.Weekday = Weekday;
    }

    public WeeklyTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeeklyTime(WeeklyTime source) {
        if (source.TimeOfDay != null) {
            this.TimeOfDay = new String(source.TimeOfDay);
        }
        if (source.Weekday != null) {
            this.Weekday = new Long(source.Weekday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOfDay", this.TimeOfDay);
        this.setParamSimple(map, prefix + "Weekday", this.Weekday);

    }
}

