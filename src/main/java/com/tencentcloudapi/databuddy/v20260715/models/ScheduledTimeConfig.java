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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledTimeConfig extends AbstractModel {

    /**
    * <p>Scheduling time zone, IANA time zone ID</p>
    */
    @SerializedName("ScheduledTimeZone")
    @Expose
    private String ScheduledTimeZone;

    /**
    * <p>Start of effective scheduling time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Scheduling expiration time</p><p>Parameter format: millisecond timestamp (UTC)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>WEEK_CYCLE: Week</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>Period step</p>
    */
    @SerializedName("CycleNum")
    @Expose
    private Long CycleNum;

    /**
     * Get <p>Scheduling time zone, IANA time zone ID</p> 
     * @return ScheduledTimeZone <p>Scheduling time zone, IANA time zone ID</p>
     */
    public String getScheduledTimeZone() {
        return this.ScheduledTimeZone;
    }

    /**
     * Set <p>Scheduling time zone, IANA time zone ID</p>
     * @param ScheduledTimeZone <p>Scheduling time zone, IANA time zone ID</p>
     */
    public void setScheduledTimeZone(String ScheduledTimeZone) {
        this.ScheduledTimeZone = ScheduledTimeZone;
    }

    /**
     * Get <p>Start of effective scheduling time</p><p>Parameter format: timestamp in milliseconds (UTC)</p> 
     * @return StartTime <p>Start of effective scheduling time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start of effective scheduling time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     * @param StartTime <p>Start of effective scheduling time</p><p>Parameter format: timestamp in milliseconds (UTC)</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Scheduling expiration time</p><p>Parameter format: millisecond timestamp (UTC)</p> 
     * @return EndTime <p>Scheduling expiration time</p><p>Parameter format: millisecond timestamp (UTC)</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Scheduling expiration time</p><p>Parameter format: millisecond timestamp (UTC)</p>
     * @param EndTime <p>Scheduling expiration time</p><p>Parameter format: millisecond timestamp (UTC)</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>WEEK_CYCLE: Week</li></ul> 
     * @return CycleType <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>WEEK_CYCLE: Week</li></ul>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>WEEK_CYCLE: Week</li></ul>
     * @param CycleType <p>Cycle type</p><p>Enumeration values:</p><ul><li>DAY_CYCLE: Day</li><li>HOUR_CYCLE: Hour</li><li>MINUTE_CYCLE: Minute</li><li>WEEK_CYCLE: Week</li></ul>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>Period step</p> 
     * @return CycleNum <p>Period step</p>
     */
    public Long getCycleNum() {
        return this.CycleNum;
    }

    /**
     * Set <p>Period step</p>
     * @param CycleNum <p>Period step</p>
     */
    public void setCycleNum(Long CycleNum) {
        this.CycleNum = CycleNum;
    }

    public ScheduledTimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledTimeConfig(ScheduledTimeConfig source) {
        if (source.ScheduledTimeZone != null) {
            this.ScheduledTimeZone = new String(source.ScheduledTimeZone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleNum != null) {
            this.CycleNum = new Long(source.CycleNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledTimeZone", this.ScheduledTimeZone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleNum", this.CycleNum);

    }
}

