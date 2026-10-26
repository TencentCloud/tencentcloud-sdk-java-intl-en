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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EffectiveTime extends AbstractModel {

    /**
    * <p>Start time</p><p>Parameter format: hh:mm:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>End time</p><p>Parameter format: hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Repetition cycle: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday</p><p>Value range: [1, 7]</p>
    */
    @SerializedName("WeekDay")
    @Expose
    private Long WeekDay;

    /**
     * Get <p>Start time</p><p>Parameter format: hh:mm:ss</p> 
     * @return BeginTime <p>Start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Start time</p><p>Parameter format: hh:mm:ss</p>
     * @param BeginTime <p>Start time</p><p>Parameter format: hh:mm:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>End time</p><p>Parameter format: hh:mm:ss</p> 
     * @return EndTime <p>End time</p><p>Parameter format: hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time</p><p>Parameter format: hh:mm:ss</p>
     * @param EndTime <p>End time</p><p>Parameter format: hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Repetition cycle: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday</p><p>Value range: [1, 7]</p> 
     * @return WeekDay <p>Repetition cycle: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday</p><p>Value range: [1, 7]</p>
     */
    public Long getWeekDay() {
        return this.WeekDay;
    }

    /**
     * Set <p>Repetition cycle: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday</p><p>Value range: [1, 7]</p>
     * @param WeekDay <p>Repetition cycle: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6-Saturday 7-Sunday</p><p>Value range: [1, 7]</p>
     */
    public void setWeekDay(Long WeekDay) {
        this.WeekDay = WeekDay;
    }

    public EffectiveTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectiveTime(EffectiveTime source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.WeekDay != null) {
            this.WeekDay = new Long(source.WeekDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "WeekDay", this.WeekDay);

    }
}

