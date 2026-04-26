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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditTrackRequest extends AbstractModel {

    /**
    * Tracking set name, which can only contain 3-48 letters, digits, hyphens, and underscores.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tracking set status (0: Not enabled; 1: Enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Storage type of shipped data. Valid values: `cos`, `cls`.
    */
    @SerializedName("Storage")
    @Expose
    private Storage Storage;

    /**
    * Tracking set event type (`Read`: Read; `Write`: Write; `*`: All)
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * The product to which the tracking set event belongs. The value can be a single product such as `cos`, or `*` that indicates all products.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The list of API names of tracking set events. When `ResourceType` is `*`, the value of `EventNames` must be `*`. When `ResourceType` is a specified product, the value of `EventNames` can be `*`. When `ResourceType` is `cos` or `cls`, up to 10 APIs are supported.
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
    * Whether to enable the feature of shipping organization members' operation logs to the organization admin account or the trusted service admin account (0: Not enabled; 1: Enabled. This feature can only be enabled by the organization admin account or the trusted service admin account)
    */
    @SerializedName("TrackForAllMembers")
    @Expose
    private Long TrackForAllMembers;

    /**
    * 
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
     * Get Tracking set name, which can only contain 3-48 letters, digits, hyphens, and underscores. 
     * @return Name Tracking set name, which can only contain 3-48 letters, digits, hyphens, and underscores.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tracking set name, which can only contain 3-48 letters, digits, hyphens, and underscores.
     * @param Name Tracking set name, which can only contain 3-48 letters, digits, hyphens, and underscores.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tracking set status (0: Not enabled; 1: Enabled). 
     * @return Status Tracking set status (0: Not enabled; 1: Enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Tracking set status (0: Not enabled; 1: Enabled).
     * @param Status Tracking set status (0: Not enabled; 1: Enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get The product to which the tracking set event belongs. The value can be a single product such as `cos`, or `*` that indicates all products. 
     * @return ResourceType The product to which the tracking set event belongs. The value can be a single product such as `cos`, or `*` that indicates all products.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The product to which the tracking set event belongs. The value can be a single product such as `cos`, or `*` that indicates all products.
     * @param ResourceType The product to which the tracking set event belongs. The value can be a single product such as `cos`, or `*` that indicates all products.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The list of API names of tracking set events. When `ResourceType` is `*`, the value of `EventNames` must be `*`. When `ResourceType` is a specified product, the value of `EventNames` can be `*`. When `ResourceType` is `cos` or `cls`, up to 10 APIs are supported. 
     * @return EventNames The list of API names of tracking set events. When `ResourceType` is `*`, the value of `EventNames` must be `*`. When `ResourceType` is a specified product, the value of `EventNames` can be `*`. When `ResourceType` is `cos` or `cls`, up to 10 APIs are supported.
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set The list of API names of tracking set events. When `ResourceType` is `*`, the value of `EventNames` must be `*`. When `ResourceType` is a specified product, the value of `EventNames` can be `*`. When `ResourceType` is `cos` or `cls`, up to 10 APIs are supported.
     * @param EventNames The list of API names of tracking set events. When `ResourceType` is `*`, the value of `EventNames` must be `*`. When `ResourceType` is a specified product, the value of `EventNames` can be `*`. When `ResourceType` is `cos` or `cls`, up to 10 APIs are supported.
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    /**
     * Get Whether to enable the feature of shipping organization members' operation logs to the organization admin account or the trusted service admin account (0: Not enabled; 1: Enabled. This feature can only be enabled by the organization admin account or the trusted service admin account) 
     * @return TrackForAllMembers Whether to enable the feature of shipping organization members' operation logs to the organization admin account or the trusted service admin account (0: Not enabled; 1: Enabled. This feature can only be enabled by the organization admin account or the trusted service admin account)
     */
    public Long getTrackForAllMembers() {
        return this.TrackForAllMembers;
    }

    /**
     * Set Whether to enable the feature of shipping organization members' operation logs to the organization admin account or the trusted service admin account (0: Not enabled; 1: Enabled. This feature can only be enabled by the organization admin account or the trusted service admin account)
     * @param TrackForAllMembers Whether to enable the feature of shipping organization members' operation logs to the organization admin account or the trusted service admin account (0: Not enabled; 1: Enabled. This feature can only be enabled by the organization admin account or the trusted service admin account)
     */
    public void setTrackForAllMembers(Long TrackForAllMembers) {
        this.TrackForAllMembers = TrackForAllMembers;
    }

    /**
     * Get  
     * @return ExportId 
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set 
     * @param ExportId 
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    public CreateAuditTrackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditTrackRequest(CreateAuditTrackRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Storage != null) {
            this.Storage = new Storage(source.Storage);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
        if (source.TrackForAllMembers != null) {
            this.TrackForAllMembers = new Long(source.TrackForAllMembers);
        }
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);
        this.setParamSimple(map, prefix + "TrackForAllMembers", this.TrackForAllMembers);
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);

    }
}

