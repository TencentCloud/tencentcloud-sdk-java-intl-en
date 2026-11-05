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

public class DailySchedule extends AbstractModel {

    /**
    * Time
    */
    @SerializedName("TimeOfDay")
    @Expose
    private String TimeOfDay;

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

    public DailySchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailySchedule(DailySchedule source) {
        if (source.TimeOfDay != null) {
            this.TimeOfDay = new String(source.TimeOfDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOfDay", this.TimeOfDay);

    }
}

