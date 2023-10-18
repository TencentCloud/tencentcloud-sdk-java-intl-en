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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tracks extends AbstractModel {

    /**
    * Tracking set name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tracking set event type (`Read`: Read; `Write`: Write; `*`: All)
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * The product to which the tracking set event belongs, such as `cos`, or `*` that indicates all products
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Tracking set status (0: Not enabled; 1: Enabled)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The list of API names of tracking set events (`*`: All)
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
    * Storage type of shipped data. Valid values: `cos`, `cls`.
    */
    @SerializedName("Storage")
    @Expose
    private Storage Storage;

    /**
    * Creation time of the tracking set
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Tracking set ID
    */
    @SerializedName("TrackId")
    @Expose
    private Long TrackId;

    /**
     * Get Tracking set name 
     * @return Name Tracking set name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tracking set name
     * @param Name Tracking set name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tracking set event type (`Read`: Read; `Write`: Write; `*`: All) 
     * @return ActionType Tracking set event type (`Read`: Read; `Write`: Write; `*`: All)
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Tracking set event type (`Read`: Read; `Write`: Write; `*`: All)
     * @param ActionType Tracking set event type (`Read`: Read; `Write`: Write; `*`: All)
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get The product to which the tracking set event belongs, such as `cos`, or `*` that indicates all products 
     * @return ResourceType The product to which the tracking set event belongs, such as `cos`, or `*` that indicates all products
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The product to which the tracking set event belongs, such as `cos`, or `*` that indicates all products
     * @param ResourceType The product to which the tracking set event belongs, such as `cos`, or `*` that indicates all products
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Tracking set status (0: Not enabled; 1: Enabled) 
     * @return Status Tracking set status (0: Not enabled; 1: Enabled)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Tracking set status (0: Not enabled; 1: Enabled)
     * @param Status Tracking set status (0: Not enabled; 1: Enabled)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The list of API names of tracking set events (`*`: All) 
     * @return EventNames The list of API names of tracking set events (`*`: All)
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set The list of API names of tracking set events (`*`: All)
     * @param EventNames The list of API names of tracking set events (`*`: All)
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    /**
     * Get Storage type of shipped data. Valid values: `cos`, `cls`. 
     * @return Storage Storage type of shipped data. Valid values: `cos`, `cls`.
     */
    public Storage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage type of shipped data. Valid values: `cos`, `cls`.
     * @param Storage Storage type of shipped data. Valid values: `cos`, `cls`.
     */
    public void setStorage(Storage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Creation time of the tracking set 
     * @return CreateTime Creation time of the tracking set
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the tracking set
     * @param CreateTime Creation time of the tracking set
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Tracking set ID 
     * @return TrackId Tracking set ID
     */
    public Long getTrackId() {
        return this.TrackId;
    }

    /**
     * Set Tracking set ID
     * @param TrackId Tracking set ID
     */
    public void setTrackId(Long TrackId) {
        this.TrackId = TrackId;
    }

    public Tracks() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tracks(Tracks source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
        if (source.Storage != null) {
            this.Storage = new Storage(source.Storage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TrackId != null) {
            this.TrackId = new Long(source.TrackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TrackId", this.TrackId);

    }
}

