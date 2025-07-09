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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationRegistry extends AbstractModel {

    /**
    * Master instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Replication instance ID
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * Region ID of the replication instance
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * Region name of the replication instance
    */
    @SerializedName("ReplicationRegionName")
    @Expose
    private String ReplicationRegionName;

    /**
    * Status of the replication instance
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get Master instance ID 
     * @return RegistryId Master instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Master instance ID
     * @param RegistryId Master instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Replication instance ID 
     * @return ReplicationRegistryId Replication instance ID
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set Replication instance ID
     * @param ReplicationRegistryId Replication instance ID
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
    }

    /**
     * Get Region ID of the replication instance 
     * @return ReplicationRegionId Region ID of the replication instance
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set Region ID of the replication instance
     * @param ReplicationRegionId Region ID of the replication instance
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get Region name of the replication instance 
     * @return ReplicationRegionName Region name of the replication instance
     */
    public String getReplicationRegionName() {
        return this.ReplicationRegionName;
    }

    /**
     * Set Region name of the replication instance
     * @param ReplicationRegionName Region name of the replication instance
     */
    public void setReplicationRegionName(String ReplicationRegionName) {
        this.ReplicationRegionName = ReplicationRegionName;
    }

    /**
     * Get Status of the replication instance 
     * @return Status Status of the replication instance
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the replication instance
     * @param Status Status of the replication instance
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public ReplicationRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationRegistry(ReplicationRegistry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.ReplicationRegistryId != null) {
            this.ReplicationRegistryId = new String(source.ReplicationRegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
        if (source.ReplicationRegionName != null) {
            this.ReplicationRegionName = new String(source.ReplicationRegionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ReplicationRegionName", this.ReplicationRegionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

