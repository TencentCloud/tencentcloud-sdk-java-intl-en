/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuietPeriod extends AbstractModel {

    /**
    * Represents the days of the week, 1 for Monday, 7 for Sunday, and so on
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DaysOfWeek")
    @Expose
    private Long [] DaysOfWeek;

    /**
    * Start TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Represents the days of the week, 1 for Monday, 7 for Sunday, and so on
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DaysOfWeek Represents the days of the week, 1 for Monday, 7 for Sunday, and so on
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getDaysOfWeek() {
        return this.DaysOfWeek;
    }

    /**
     * Set Represents the days of the week, 1 for Monday, 7 for Sunday, and so on
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DaysOfWeek Represents the days of the week, 1 for Monday, 7 for Sunday, and so on
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDaysOfWeek(Long [] DaysOfWeek) {
        this.DaysOfWeek = DaysOfWeek;
    }

    /**
     * Get Start TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public QuietPeriod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuietPeriod(QuietPeriod source) {
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

