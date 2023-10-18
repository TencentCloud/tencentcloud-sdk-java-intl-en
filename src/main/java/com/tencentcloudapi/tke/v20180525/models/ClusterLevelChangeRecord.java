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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterLevelChangeRecord extends AbstractModel {

    /**
    * Record ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Status (valid values: `trading`, `upgrading`, `success`, `failed`)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Original model
    */
    @SerializedName("OldLevel")
    @Expose
    private String OldLevel;

    /**
    * New model
    */
    @SerializedName("NewLevel")
    @Expose
    private String NewLevel;

    /**
    * Trigger type (valid values: `manual`, `auto`)
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Start time
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * End time
    */
    @SerializedName("EndedAt")
    @Expose
    private String EndedAt;

    /**
     * Get Record ID 
     * @return ID Record ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Record ID
     * @param ID Record ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Status (valid values: `trading`, `upgrading`, `success`, `failed`) 
     * @return Status Status (valid values: `trading`, `upgrading`, `success`, `failed`)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status (valid values: `trading`, `upgrading`, `success`, `failed`)
     * @param Status Status (valid values: `trading`, `upgrading`, `success`, `failed`)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status description 
     * @return Message Status description
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Status description
     * @param Message Status description
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Original model 
     * @return OldLevel Original model
     */
    public String getOldLevel() {
        return this.OldLevel;
    }

    /**
     * Set Original model
     * @param OldLevel Original model
     */
    public void setOldLevel(String OldLevel) {
        this.OldLevel = OldLevel;
    }

    /**
     * Get New model 
     * @return NewLevel New model
     */
    public String getNewLevel() {
        return this.NewLevel;
    }

    /**
     * Set New model
     * @param NewLevel New model
     */
    public void setNewLevel(String NewLevel) {
        this.NewLevel = NewLevel;
    }

    /**
     * Get Trigger type (valid values: `manual`, `auto`) 
     * @return TriggerType Trigger type (valid values: `manual`, `auto`)
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger type (valid values: `manual`, `auto`)
     * @param TriggerType Trigger type (valid values: `manual`, `auto`)
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Start time 
     * @return StartedAt Start time
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set Start time
     * @param StartedAt Start time
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get End time 
     * @return EndedAt End time
     */
    public String getEndedAt() {
        return this.EndedAt;
    }

    /**
     * Set End time
     * @param EndedAt End time
     */
    public void setEndedAt(String EndedAt) {
        this.EndedAt = EndedAt;
    }

    public ClusterLevelChangeRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterLevelChangeRecord(ClusterLevelChangeRecord source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.OldLevel != null) {
            this.OldLevel = new String(source.OldLevel);
        }
        if (source.NewLevel != null) {
            this.NewLevel = new String(source.NewLevel);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.EndedAt != null) {
            this.EndedAt = new String(source.EndedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "OldLevel", this.OldLevel);
        this.setParamSimple(map, prefix + "NewLevel", this.NewLevel);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "EndedAt", this.EndedAt);

    }
}

