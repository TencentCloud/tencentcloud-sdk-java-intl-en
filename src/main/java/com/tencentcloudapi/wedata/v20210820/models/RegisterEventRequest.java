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

public class RegisterEventRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event Name, supports English, numbers, and underscores, up to 20 characters long, cannot start with a number or underscore.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event Segmentation Type, cycle types: DAY, HOUR, MIN, SECOND
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Broadcast: BROADCAST, Unicast: SINGLE
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * For cycle types of day and hour: HOURS, For minutes: MINUTES, For seconds: SECONDS
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Event Owner
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Event Type, default value: TIME_SERIES
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Corresponding DAY: yyyyMMdd, Corresponding HOUR: yyyyMMddHH, Corresponding MIN: yyyyMMddHHmm, Corresponding SECOND: yyyyMMddHHmmss
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * Uptime
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long TimeToLive;

    /**
    * Event Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Event Name, supports English, numbers, and underscores, up to 20 characters long, cannot start with a number or underscore. 
     * @return Name Event Name, supports English, numbers, and underscores, up to 20 characters long, cannot start with a number or underscore.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event Name, supports English, numbers, and underscores, up to 20 characters long, cannot start with a number or underscore.
     * @param Name Event Name, supports English, numbers, and underscores, up to 20 characters long, cannot start with a number or underscore.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event Segmentation Type, cycle types: DAY, HOUR, MIN, SECOND 
     * @return EventSubType Event Segmentation Type, cycle types: DAY, HOUR, MIN, SECOND
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event Segmentation Type, cycle types: DAY, HOUR, MIN, SECOND
     * @param EventSubType Event Segmentation Type, cycle types: DAY, HOUR, MIN, SECOND
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Broadcast: BROADCAST, Unicast: SINGLE 
     * @return EventBroadcastType Broadcast: BROADCAST, Unicast: SINGLE
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Broadcast: BROADCAST, Unicast: SINGLE
     * @param EventBroadcastType Broadcast: BROADCAST, Unicast: SINGLE
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get For cycle types of day and hour: HOURS, For minutes: MINUTES, For seconds: SECONDS 
     * @return TimeUnit For cycle types of day and hour: HOURS, For minutes: MINUTES, For seconds: SECONDS
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set For cycle types of day and hour: HOURS, For minutes: MINUTES, For seconds: SECONDS
     * @param TimeUnit For cycle types of day and hour: HOURS, For minutes: MINUTES, For seconds: SECONDS
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Event Owner 
     * @return Owner Event Owner
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Event Owner
     * @param Owner Event Owner
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Event Type, default value: TIME_SERIES 
     * @return EventType Event Type, default value: TIME_SERIES
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event Type, default value: TIME_SERIES
     * @param EventType Event Type, default value: TIME_SERIES
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Corresponding DAY: yyyyMMdd, Corresponding HOUR: yyyyMMddHH, Corresponding MIN: yyyyMMddHHmm, Corresponding SECOND: yyyyMMddHHmmss 
     * @return DimensionFormat Corresponding DAY: yyyyMMdd, Corresponding HOUR: yyyyMMddHH, Corresponding MIN: yyyyMMddHHmm, Corresponding SECOND: yyyyMMddHHmmss
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set Corresponding DAY: yyyyMMdd, Corresponding HOUR: yyyyMMddHH, Corresponding MIN: yyyyMMddHHmm, Corresponding SECOND: yyyyMMddHHmmss
     * @param DimensionFormat Corresponding DAY: yyyyMMdd, Corresponding HOUR: yyyyMMddHH, Corresponding MIN: yyyyMMddHHmm, Corresponding SECOND: yyyyMMddHHmmss
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get Uptime 
     * @return TimeToLive Uptime
     */
    public Long getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set Uptime
     * @param TimeToLive Uptime
     */
    public void setTimeToLive(Long TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get Event Description 
     * @return Description Event Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event Description
     * @param Description Event Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RegisterEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterEventRequest(RegisterEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

