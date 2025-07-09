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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirusTendencyInfo extends AbstractModel {

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Total number of pending events
    */
    @SerializedName("PendingEventCount")
    @Expose
    private Long PendingEventCount;

    /**
    * Total number of containers at risk
    */
    @SerializedName("RiskContainerCount")
    @Expose
    private Long RiskContainerCount;

    /**
    * Total number of events
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Total number of isolated events
    */
    @SerializedName("IsolateEventCount")
    @Expose
    private Long IsolateEventCount;

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Total number of pending events 
     * @return PendingEventCount Total number of pending events
     */
    public Long getPendingEventCount() {
        return this.PendingEventCount;
    }

    /**
     * Set Total number of pending events
     * @param PendingEventCount Total number of pending events
     */
    public void setPendingEventCount(Long PendingEventCount) {
        this.PendingEventCount = PendingEventCount;
    }

    /**
     * Get Total number of containers at risk 
     * @return RiskContainerCount Total number of containers at risk
     */
    public Long getRiskContainerCount() {
        return this.RiskContainerCount;
    }

    /**
     * Set Total number of containers at risk
     * @param RiskContainerCount Total number of containers at risk
     */
    public void setRiskContainerCount(Long RiskContainerCount) {
        this.RiskContainerCount = RiskContainerCount;
    }

    /**
     * Get Total number of events 
     * @return EventCount Total number of events
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Total number of events
     * @param EventCount Total number of events
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Total number of isolated events 
     * @return IsolateEventCount Total number of isolated events
     */
    public Long getIsolateEventCount() {
        return this.IsolateEventCount;
    }

    /**
     * Set Total number of isolated events
     * @param IsolateEventCount Total number of isolated events
     */
    public void setIsolateEventCount(Long IsolateEventCount) {
        this.IsolateEventCount = IsolateEventCount;
    }

    public VirusTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusTendencyInfo(VirusTendencyInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.PendingEventCount != null) {
            this.PendingEventCount = new Long(source.PendingEventCount);
        }
        if (source.RiskContainerCount != null) {
            this.RiskContainerCount = new Long(source.RiskContainerCount);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.IsolateEventCount != null) {
            this.IsolateEventCount = new Long(source.IsolateEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PendingEventCount", this.PendingEventCount);
        this.setParamSimple(map, prefix + "RiskContainerCount", this.RiskContainerCount);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "IsolateEventCount", this.IsolateEventCount);

    }
}

