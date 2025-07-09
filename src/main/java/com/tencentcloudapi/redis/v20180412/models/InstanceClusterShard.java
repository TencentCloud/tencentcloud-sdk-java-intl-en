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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceClusterShard extends AbstractModel {

    /**
    * The name of a shard node
    */
    @SerializedName("ShardName")
    @Expose
    private String ShardName;

    /**
    * The serial number of a shard node
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * The role of a shard node
- `0`: Master node.
- `1`: Replica node.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * Number of keys
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * Slot information
    */
    @SerializedName("Slots")
    @Expose
    private String Slots;

    /**
    * Used Capacity
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Capacity slope
    */
    @SerializedName("StorageSlope")
    @Expose
    private Float StorageSlope;

    /**
    * This field is recommended to use the RunId instead due to spelling inconsistency.
 Meaning: The node ID during instance runtime.

    */
    @SerializedName("Runid")
    @Expose
    private String Runid;

    /**
    * The node ID during instance runtime.
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * Service status
- `0`: Down.
- `1`: On.
    */
    @SerializedName("Connected")
    @Expose
    private Long Connected;

    /**
     * Get The name of a shard node 
     * @return ShardName The name of a shard node
     */
    public String getShardName() {
        return this.ShardName;
    }

    /**
     * Set The name of a shard node
     * @param ShardName The name of a shard node
     */
    public void setShardName(String ShardName) {
        this.ShardName = ShardName;
    }

    /**
     * Get The serial number of a shard node 
     * @return ShardId The serial number of a shard node
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set The serial number of a shard node
     * @param ShardId The serial number of a shard node
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get The role of a shard node
- `0`: Master node.
- `1`: Replica node. 
     * @return Role The role of a shard node
- `0`: Master node.
- `1`: Replica node.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set The role of a shard node
- `0`: Master node.
- `1`: Replica node.
     * @param Role The role of a shard node
- `0`: Master node.
- `1`: Replica node.
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get Number of keys 
     * @return Keys Number of keys
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set Number of keys
     * @param Keys Number of keys
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Slot information 
     * @return Slots Slot information
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * Set Slot information
     * @param Slots Slot information
     */
    public void setSlots(String Slots) {
        this.Slots = Slots;
    }

    /**
     * Get Used Capacity 
     * @return Storage Used Capacity
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Used Capacity
     * @param Storage Used Capacity
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Capacity slope 
     * @return StorageSlope Capacity slope
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * Set Capacity slope
     * @param StorageSlope Capacity slope
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
    }

    /**
     * Get This field is recommended to use the RunId instead due to spelling inconsistency.
 Meaning: The node ID during instance runtime.
 
     * @return Runid This field is recommended to use the RunId instead due to spelling inconsistency.
 Meaning: The node ID during instance runtime.

     */
    public String getRunid() {
        return this.Runid;
    }

    /**
     * Set This field is recommended to use the RunId instead due to spelling inconsistency.
 Meaning: The node ID during instance runtime.

     * @param Runid This field is recommended to use the RunId instead due to spelling inconsistency.
 Meaning: The node ID during instance runtime.

     */
    public void setRunid(String Runid) {
        this.Runid = Runid;
    }

    /**
     * Get The node ID during instance runtime. 
     * @return RunId The node ID during instance runtime.
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set The node ID during instance runtime.
     * @param RunId The node ID during instance runtime.
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get Service status
- `0`: Down.
- `1`: On. 
     * @return Connected Service status
- `0`: Down.
- `1`: On.
     */
    public Long getConnected() {
        return this.Connected;
    }

    /**
     * Set Service status
- `0`: Down.
- `1`: On.
     * @param Connected Service status
- `0`: Down.
- `1`: On.
     */
    public void setConnected(Long Connected) {
        this.Connected = Connected;
    }

    public InstanceClusterShard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceClusterShard(InstanceClusterShard source) {
        if (source.ShardName != null) {
            this.ShardName = new String(source.ShardName);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.Keys != null) {
            this.Keys = new Long(source.Keys);
        }
        if (source.Slots != null) {
            this.Slots = new String(source.Slots);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageSlope != null) {
            this.StorageSlope = new Float(source.StorageSlope);
        }
        if (source.Runid != null) {
            this.Runid = new String(source.Runid);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.Connected != null) {
            this.Connected = new Long(source.Connected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardName", this.ShardName);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slots", this.Slots);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageSlope", this.StorageSlope);
        this.setParamSimple(map, prefix + "Runid", this.Runid);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Connected", this.Connected);

    }
}

