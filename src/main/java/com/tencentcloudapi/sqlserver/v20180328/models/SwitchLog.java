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
    * 
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get  
     * @return EventId 
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 
     * @param EventId 
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get  
     * @return SwitchType 
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set 
     * @param SwitchType 
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return Reason 
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 
     * @param Reason 
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

