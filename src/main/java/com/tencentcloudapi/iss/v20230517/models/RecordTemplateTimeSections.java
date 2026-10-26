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

public class RecordTemplateTimeSections extends AbstractModel {

    /**
    * Day of the week. Value range: 1–7 (corresponding to Monday–Sunday)
    */
    @SerializedName("DayOfWeek")
    @Expose
    private Long DayOfWeek;

    /**
    * Start time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Day of the week. Value range: 1–7 (corresponding to Monday–Sunday) 
     * @return DayOfWeek Day of the week. Value range: 1–7 (corresponding to Monday–Sunday)
     */
    public Long getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set Day of the week. Value range: 1–7 (corresponding to Monday–Sunday)
     * @param DayOfWeek Day of the week. Value range: 1–7 (corresponding to Monday–Sunday)
     */
    public void setDayOfWeek(Long DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get Start time. Format: HH:MM:SS. Range: [00:00:00–23:59:59] 
     * @return StartTime Start time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     * @param StartTime Start time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. Format: HH:MM:SS. Range: [00:00:00–23:59:59] 
     * @return EndTime End time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     * @param EndTime End time. Format: HH:MM:SS. Range: [00:00:00–23:59:59]
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RecordTemplateTimeSections() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTemplateTimeSections(RecordTemplateTimeSections source) {
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new Long(source.DayOfWeek);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

