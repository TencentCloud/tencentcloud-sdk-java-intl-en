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

public class TaskMaintainInfo extends AbstractModel {

    /**
    * Execution start time (seconds from 0 o'clock).
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * Specifies the continuous time. the unit is second.
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * Specifies the time when it can be executed. valid values: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"].
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
     * Get Execution start time (seconds from 0 o'clock). 
     * @return MaintainStartTime Execution start time (seconds from 0 o'clock).
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set Execution start time (seconds from 0 o'clock).
     * @param MaintainStartTime Execution start time (seconds from 0 o'clock).
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get Specifies the continuous time. the unit is second. 
     * @return MaintainDuration Specifies the continuous time. the unit is second.
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set Specifies the continuous time. the unit is second.
     * @param MaintainDuration Specifies the continuous time. the unit is second.
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get Specifies the time when it can be executed. valid values: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]. 
     * @return MaintainWeekDays Specifies the time when it can be executed. valid values: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"].
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set Specifies the time when it can be executed. valid values: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"].
     * @param MaintainWeekDays Specifies the time when it can be executed. valid values: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"].
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    public TaskMaintainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskMaintainInfo(TaskMaintainInfo source) {
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);

    }
}

