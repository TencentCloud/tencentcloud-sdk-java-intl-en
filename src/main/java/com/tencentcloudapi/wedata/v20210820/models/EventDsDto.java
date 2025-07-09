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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDsDto extends AbstractModel {

    /**
    * Event name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event type GENERAL, TIME_SERIES.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Survival time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long TimeToLive;

    /**
    * Lifetime unit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Event segmentation type: SECOND, MIN, HOUR, DAY.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event BROADCAST type: SINGLE, BROADCAST.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Time format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * Event owner.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Attribute.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * Description information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event listener information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Listeners")
    @Expose
    private EventListenerDTO [] Listeners;

    /**
    * Project ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get Event name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event type GENERAL, TIME_SERIES.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventType Event type GENERAL, TIME_SERIES.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type GENERAL, TIME_SERIES.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventType Event type GENERAL, TIME_SERIES.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Survival time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeToLive Survival time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set Survival time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeToLive Survival time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeToLive(Long TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get Lifetime unit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Lifetime unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Lifetime unit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Lifetime unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Event segmentation type: SECOND, MIN, HOUR, DAY.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventSubType Event segmentation type: SECOND, MIN, HOUR, DAY.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event segmentation type: SECOND, MIN, HOUR, DAY.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventSubType Event segmentation type: SECOND, MIN, HOUR, DAY.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event BROADCAST type: SINGLE, BROADCAST.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event BROADCAST type: SINGLE, BROADCAST.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Time format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DimensionFormat Time format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set Time format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DimensionFormat Time format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreationTs Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreationTs Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get Event owner.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Owner Event owner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Event owner.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Owner Event owner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Attribute.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Properties Attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set Attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Properties Attribute.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Description information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event listener information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Listeners Event listener information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EventListenerDTO [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set Event listener information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Listeners Event listener information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListeners(EventListenerDTO [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get Project ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public EventDsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDsDto(EventDsDto source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
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
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
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
            this.Listeners = new EventListenerDTO[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new EventListenerDTO(source.Listeners[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

