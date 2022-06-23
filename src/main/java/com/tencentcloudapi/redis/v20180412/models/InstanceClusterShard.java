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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceClusterShard extends AbstractModel{

    /**
    * Shard node name
    */
    @SerializedName("ShardName")
    @Expose
    private String ShardName;

    /**
    * Shard node ID
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * Role
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
    * Storage capacity
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
    * ID of the runtime node of an instance
    */
    @SerializedName("Runid")
    @Expose
    private String Runid;

    /**
    * Service status. 0: down; 1: on
    */
    @SerializedName("Connected")
    @Expose
    private Long Connected;

    /**
     * Get Shard node name 
     * @return ShardName Shard node name
     */
    public String getShardName() {
        return this.ShardName;
    }

    /**
     * Set Shard node name
     * @param ShardName Shard node name
     */
    public void setShardName(String ShardName) {
        this.ShardName = ShardName;
    }

    /**
     * Get Shard node ID 
     * @return ShardId Shard node ID
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set Shard node ID
     * @param ShardId Shard node ID
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get Role 
     * @return Role Role
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Role
     * @param Role Role
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
     * Get Storage capacity 
     * @return Storage Storage capacity
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity
     * @param Storage Storage capacity
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
     * Get ID of the runtime node of an instance 
     * @return Runid ID of the runtime node of an instance
     */
    public String getRunid() {
        return this.Runid;
    }

    /**
     * Set ID of the runtime node of an instance
     * @param Runid ID of the runtime node of an instance
     */
    public void setRunid(String Runid) {
        this.Runid = Runid;
    }

    /**
     * Get Service status. 0: down; 1: on 
     * @return Connected Service status. 0: down; 1: on
     */
    public Long getConnected() {
        return this.Connected;
    }

    /**
     * Set Service status. 0: down; 1: on
     * @param Connected Service status. 0: down; 1: on
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
        this.setParamSimple(map, prefix + "Connected", this.Connected);

    }
}

