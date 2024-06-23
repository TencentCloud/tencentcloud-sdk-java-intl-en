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

public class EventCaseAuditLogOptDto extends AbstractModel {

    /**
    * Event Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * Event nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event Split Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event Broadcast Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Event Instance TTL
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Event Instance TTL Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Data Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * Event Instance Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Event Instance Trigger Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventTriggerTimestamp")
    @Expose
    private String EventTriggerTimestamp;

    /**
    * Event Instance Consumption Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LogTimestamp")
    @Expose
    private String LogTimestamp;

    /**
    * Event Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Event Instance ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CaseId Event Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set Event Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CaseId Event Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get Event nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventName Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventName Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventType Event typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventType Event typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event Split Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventSubType Event Split Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event Split Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventSubType Event Split Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event Broadcast Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventBroadcastType Event Broadcast Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event Broadcast Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventBroadcastType Event Broadcast Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Event Instance TTL
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TTL Event Instance TTL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Event Instance TTL
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TTL Event Instance TTL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Event Instance TTL Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TimeUnit Event Instance TTL Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Event Instance TTL Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TimeUnit Event Instance TTL Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Data Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Dimension Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Dimension Data Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get Event Instance Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Event Instance Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event Instance Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Event Instance Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Event Instance Trigger Timestamp
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventTriggerTimestamp Event Instance Trigger Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventTriggerTimestamp() {
        return this.EventTriggerTimestamp;
    }

    /**
     * Set Event Instance Trigger Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventTriggerTimestamp Event Instance Trigger Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventTriggerTimestamp(String EventTriggerTimestamp) {
        this.EventTriggerTimestamp = EventTriggerTimestamp;
    }

    /**
     * Get Event Instance Consumption Timestamp
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LogTimestamp Event Instance Consumption Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLogTimestamp() {
        return this.LogTimestamp;
    }

    /**
     * Set Event Instance Consumption Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LogTimestamp Event Instance Consumption Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLogTimestamp(String LogTimestamp) {
        this.LogTimestamp = LogTimestamp;
    }

    /**
     * Get Event Instance Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Event Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Event Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventCaseAuditLogOptDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseAuditLogOptDto(EventCaseAuditLogOptDto source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventTriggerTimestamp != null) {
            this.EventTriggerTimestamp = new String(source.EventTriggerTimestamp);
        }
        if (source.LogTimestamp != null) {
            this.LogTimestamp = new String(source.LogTimestamp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventTriggerTimestamp", this.EventTriggerTimestamp);
        this.setParamSimple(map, prefix + "LogTimestamp", this.LogTimestamp);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

