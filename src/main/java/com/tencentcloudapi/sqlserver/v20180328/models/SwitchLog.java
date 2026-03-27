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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchLog extends AbstractModel {

    /**
    * Switchover Event ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Switchover Mode 0-System Automatic Switchover, 1-Manual Switchover
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * Switchover Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Switchover End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Machine failure causes automatic switchover.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Switchover Event ID 
     * @return EventId Switchover Event ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Switchover Event ID
     * @param EventId Switchover Event ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Switchover Mode 0-System Automatic Switchover, 1-Manual Switchover 
     * @return SwitchType Switchover Mode 0-System Automatic Switchover, 1-Manual Switchover
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set Switchover Mode 0-System Automatic Switchover, 1-Manual Switchover
     * @param SwitchType Switchover Mode 0-System Automatic Switchover, 1-Manual Switchover
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get Switchover Start Time 
     * @return StartTime Switchover Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Switchover Start Time
     * @param StartTime Switchover Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Switchover End Time 
     * @return EndTime Switchover End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Switchover End Time
     * @param EndTime Switchover End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Machine failure causes automatic switchover. 
     * @return Reason Machine failure causes automatic switchover.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Machine failure causes automatic switchover.
     * @param Reason Machine failure causes automatic switchover.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public SwitchLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchLog(SwitchLog source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

