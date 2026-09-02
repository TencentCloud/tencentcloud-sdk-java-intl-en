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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmScheduleConfig extends AbstractModel {

    /**
    * Scheduling type: daily, weekly, monthly
    */
    @SerializedName("ScheduleType")
    @Expose
    private String ScheduleType;

    /**
    * If not passed, the day is used for daily scheduling. For weekly scheduling configuration (day of the week (1=Monday, ..., 7=Sunday)), for monthly scheduling configuration (day of the month (1-31)).
    */
    @SerializedName("Day")
    @Expose
    private Long Day;

    /**
    * Scheduling time configuration
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Time zone. Default: UTC+8 (Asia/Shanghai)
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Scheduling type: daily, weekly, monthly 
     * @return ScheduleType Scheduling type: daily, weekly, monthly
     */
    public String getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set Scheduling type: daily, weekly, monthly
     * @param ScheduleType Scheduling type: daily, weekly, monthly
     */
    public void setScheduleType(String ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get If not passed, the day is used for daily scheduling. For weekly scheduling configuration (day of the week (1=Monday, ..., 7=Sunday)), for monthly scheduling configuration (day of the month (1-31)). 
     * @return Day If not passed, the day is used for daily scheduling. For weekly scheduling configuration (day of the week (1=Monday, ..., 7=Sunday)), for monthly scheduling configuration (day of the month (1-31)).
     */
    public Long getDay() {
        return this.Day;
    }

    /**
     * Set If not passed, the day is used for daily scheduling. For weekly scheduling configuration (day of the week (1=Monday, ..., 7=Sunday)), for monthly scheduling configuration (day of the month (1-31)).
     * @param Day If not passed, the day is used for daily scheduling. For weekly scheduling configuration (day of the week (1=Monday, ..., 7=Sunday)), for monthly scheduling configuration (day of the month (1-31)).
     */
    public void setDay(Long Day) {
        this.Day = Day;
    }

    /**
     * Get Scheduling time configuration 
     * @return Time Scheduling time configuration
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Scheduling time configuration
     * @param Time Scheduling time configuration
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Time zone. Default: UTC+8 (Asia/Shanghai) 
     * @return TimeZone Time zone. Default: UTC+8 (Asia/Shanghai)
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone. Default: UTC+8 (Asia/Shanghai)
     * @param TimeZone Time zone. Default: UTC+8 (Asia/Shanghai)
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DspmScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmScheduleConfig(DspmScheduleConfig source) {
        if (source.ScheduleType != null) {
            this.ScheduleType = new String(source.ScheduleType);
        }
        if (source.Day != null) {
            this.Day = new Long(source.Day);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

