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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmQuietInterval extends AbstractModel {

    /**
    * ISO standard. 1 means monday, 7 means sunday.
    */
    @SerializedName("DaysOfWeek")
    @Expose
    private Long [] DaysOfWeek;

    /**
    * Start time. precision: hour/minute/second. format: HH:mm:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. precision: hour/minute/second. format: HH:mm:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get ISO standard. 1 means monday, 7 means sunday. 
     * @return DaysOfWeek ISO standard. 1 means monday, 7 means sunday.
     */
    public Long [] getDaysOfWeek() {
        return this.DaysOfWeek;
    }

    /**
     * Set ISO standard. 1 means monday, 7 means sunday.
     * @param DaysOfWeek ISO standard. 1 means monday, 7 means sunday.
     */
    public void setDaysOfWeek(Long [] DaysOfWeek) {
        this.DaysOfWeek = DaysOfWeek;
    }

    /**
     * Get Start time. precision: hour/minute/second. format: HH:mm:ss. 
     * @return StartTime Start time. precision: hour/minute/second. format: HH:mm:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. precision: hour/minute/second. format: HH:mm:ss.
     * @param StartTime Start time. precision: hour/minute/second. format: HH:mm:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. precision: hour/minute/second. format: HH:mm:ss. 
     * @return EndTime End time. precision: hour/minute/second. format: HH:mm:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. precision: hour/minute/second. format: HH:mm:ss.
     * @param EndTime End time. precision: hour/minute/second. format: HH:mm:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public AlarmQuietInterval() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmQuietInterval(AlarmQuietInterval source) {
        if (source.DaysOfWeek != null) {
            this.DaysOfWeek = new Long[source.DaysOfWeek.length];
            for (int i = 0; i < source.DaysOfWeek.length; i++) {
                this.DaysOfWeek[i] = new Long(source.DaysOfWeek[i]);
            }
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
        this.setParamArraySimple(map, prefix + "DaysOfWeek.", this.DaysOfWeek);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

