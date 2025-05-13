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

public class RegisterDsEventRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event cycle type: 
1. minute: MIN
2. HOUR: HOUR 
3. DAY: DAY
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event ttl. specifies a value that is an integer above 0
    */
    @SerializedName("TimeToLive")
    @Expose
    private String TimeToLive;

    /**
    * Lifetime unit of the event: 1. day: DAYS 2. minute: MINUTES
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Event Owner Account Nickname
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Event Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event type GENERAL, TIME_SERIES
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event BROADCAST type: SINGLE, BROADCAST
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Time Format
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

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
     * Get Event Name 
     * @return Name Event Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event Name
     * @param Name Event Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event cycle type: 
1. minute: MIN
2. HOUR: HOUR 
3. DAY: DAY 
     * @return EventSubType Event cycle type: 
1. minute: MIN
2. HOUR: HOUR 
3. DAY: DAY
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event cycle type: 
1. minute: MIN
2. HOUR: HOUR 
3. DAY: DAY
     * @param EventSubType Event cycle type: 
1. minute: MIN
2. HOUR: HOUR 
3. DAY: DAY
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event ttl. specifies a value that is an integer above 0 
     * @return TimeToLive Event ttl. specifies a value that is an integer above 0
     */
    public String getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set Event ttl. specifies a value that is an integer above 0
     * @param TimeToLive Event ttl. specifies a value that is an integer above 0
     */
    public void setTimeToLive(String TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get Lifetime unit of the event: 1. day: DAYS 2. minute: MINUTES 
     * @return TimeUnit Lifetime unit of the event: 1. day: DAYS 2. minute: MINUTES
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Lifetime unit of the event: 1. day: DAYS 2. minute: MINUTES
     * @param TimeUnit Lifetime unit of the event: 1. day: DAYS 2. minute: MINUTES
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Event Owner Account Nickname 
     * @return Owner Event Owner Account Nickname
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Event Owner Account Nickname
     * @param Owner Event Owner Account Nickname
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
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

    /**
     * Get Event type GENERAL, TIME_SERIES 
     * @return EventType Event type GENERAL, TIME_SERIES
     * @deprecated
     */
    @Deprecated
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type GENERAL, TIME_SERIES
     * @param EventType Event type GENERAL, TIME_SERIES
     * @deprecated
     */
    @Deprecated
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event BROADCAST type: SINGLE, BROADCAST 
     * @return EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST
     * @deprecated
     */
    @Deprecated
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event BROADCAST type: SINGLE, BROADCAST
     * @param EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST
     * @deprecated
     */
    @Deprecated
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Time Format 
     * @return DimensionFormat Time Format
     * @deprecated
     */
    @Deprecated
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set Time Format
     * @param DimensionFormat Time Format
     * @deprecated
     */
    @Deprecated
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    public RegisterDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterDsEventRequest(RegisterDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new String(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);

    }
}

