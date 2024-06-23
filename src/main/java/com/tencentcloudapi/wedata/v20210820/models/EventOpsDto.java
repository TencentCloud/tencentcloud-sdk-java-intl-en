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

public class EventOpsDto extends AbstractModel {

    /**
    * Event nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event Segmentation TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event Broadcast TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Data Time Format
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * UptimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long TimeToLive;

    /**
    * Lifetime Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Creation Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * Owner
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * AttributeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Listener
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Listeners")
    @Expose
    private EventListenerOpsDto [] Listeners;

    /**
    * Incident Case
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventCases")
    @Expose
    private EventCaseOpsDto [] EventCases;

    /**
     * Get Event nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Event Segmentation TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventSubType Event Segmentation TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event Segmentation TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventSubType Event Segmentation TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event Broadcast TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventBroadcastType Event Broadcast TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event Broadcast TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventBroadcastType Event Broadcast TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Data Time Format
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DimensionFormat Data Time Format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set Data Time Format
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DimensionFormat Data Time Format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get UptimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TimeToLive UptimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set UptimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param TimeToLive UptimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTimeToLive(Long TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get Lifetime Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TimeUnit Lifetime Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Lifetime Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TimeUnit Lifetime Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Creation Timestamp
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreationTimestamp Creation Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Creation Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreationTimestamp Creation Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get Owner
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Owner Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Owner
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Owner Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get AttributeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Properties AttributeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set AttributeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Properties AttributeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Listener
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Listeners Listener
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public EventListenerOpsDto [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set Listener
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Listeners Listener
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setListeners(EventListenerOpsDto [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get Incident Case
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EventCases Incident Case
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public EventCaseOpsDto [] getEventCases() {
        return this.EventCases;
    }

    /**
     * Set Incident Case
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EventCases Incident Case
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventCases(EventCaseOpsDto [] EventCases) {
        this.EventCases = EventCases;
    }

    public EventOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventOpsDto(EventOpsDto source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Listeners != null) {
            this.Listeners = new EventListenerOpsDto[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new EventListenerOpsDto(source.Listeners[i]);
            }
        }
        if (source.EventCases != null) {
            this.EventCases = new EventCaseOpsDto[source.EventCases.length];
            for (int i = 0; i < source.EventCases.length; i++) {
                this.EventCases[i] = new EventCaseOpsDto(source.EventCases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamArrayObj(map, prefix + "EventCases.", this.EventCases);

    }
}

