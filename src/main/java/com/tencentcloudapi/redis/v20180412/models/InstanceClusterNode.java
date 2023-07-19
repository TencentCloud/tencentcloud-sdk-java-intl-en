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

public class InstanceClusterNode extends AbstractModel{

    /**
    * Node name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ID of the runtime node of an instance
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * Cluster role. Valid values:  - `0` (master) - `1` (replica)
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * Node status. Valid values:  - `0` (read/write) - `1` (read) - `2` (backup)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Service status. Valid values: `0` (down), `1` (on).
    */
    @SerializedName("Connected")
    @Expose
    private Long Connected;

    /**
    * Node creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Node elimination time
    */
    @SerializedName("DownTime")
    @Expose
    private String DownTime;

    /**
    * Node slot distribution range
    */
    @SerializedName("Slots")
    @Expose
    private String Slots;

    /**
    * Distribution of node keys
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * Node QPS Number of executions per second on sharded nodes Unit: Counts/sec
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * QPS slope of a node
    */
    @SerializedName("QpsSlope")
    @Expose
    private Float QpsSlope;

    /**
    * Node storage
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Node storage slope
    */
    @SerializedName("StorageSlope")
    @Expose
    private Float StorageSlope;

    /**
     * Get Node name 
     * @return Name Node name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node name
     * @param Name Node name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ID of the runtime node of an instance 
     * @return RunId ID of the runtime node of an instance
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set ID of the runtime node of an instance
     * @param RunId ID of the runtime node of an instance
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get Cluster role. Valid values:  - `0` (master) - `1` (replica) 
     * @return Role Cluster role. Valid values:  - `0` (master) - `1` (replica)
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Cluster role. Valid values:  - `0` (master) - `1` (replica)
     * @param Role Cluster role. Valid values:  - `0` (master) - `1` (replica)
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get Node status. Valid values:  - `0` (read/write) - `1` (read) - `2` (backup) 
     * @return Status Node status. Valid values:  - `0` (read/write) - `1` (read) - `2` (backup)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Node status. Valid values:  - `0` (read/write) - `1` (read) - `2` (backup)
     * @param Status Node status. Valid values:  - `0` (read/write) - `1` (read) - `2` (backup)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Service status. Valid values: `0` (down), `1` (on). 
     * @return Connected Service status. Valid values: `0` (down), `1` (on).
     */
    public Long getConnected() {
        return this.Connected;
    }

    /**
     * Set Service status. Valid values: `0` (down), `1` (on).
     * @param Connected Service status. Valid values: `0` (down), `1` (on).
     */
    public void setConnected(Long Connected) {
        this.Connected = Connected;
    }

    /**
     * Get Node creation time 
     * @return CreateTime Node creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Node creation time
     * @param CreateTime Node creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Node elimination time 
     * @return DownTime Node elimination time
     */
    public String getDownTime() {
        return this.DownTime;
    }

    /**
     * Set Node elimination time
     * @param DownTime Node elimination time
     */
    public void setDownTime(String DownTime) {
        this.DownTime = DownTime;
    }

    /**
     * Get Node slot distribution range 
     * @return Slots Node slot distribution range
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * Set Node slot distribution range
     * @param Slots Node slot distribution range
     */
    public void setSlots(String Slots) {
        this.Slots = Slots;
    }

    /**
     * Get Distribution of node keys 
     * @return Keys Distribution of node keys
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set Distribution of node keys
     * @param Keys Distribution of node keys
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Node QPS Number of executions per second on sharded nodes Unit: Counts/sec 
     * @return Qps Node QPS Number of executions per second on sharded nodes Unit: Counts/sec
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Node QPS Number of executions per second on sharded nodes Unit: Counts/sec
     * @param Qps Node QPS Number of executions per second on sharded nodes Unit: Counts/sec
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get QPS slope of a node 
     * @return QpsSlope QPS slope of a node
     */
    public Float getQpsSlope() {
        return this.QpsSlope;
    }

    /**
     * Set QPS slope of a node
     * @param QpsSlope QPS slope of a node
     */
    public void setQpsSlope(Float QpsSlope) {
        this.QpsSlope = QpsSlope;
    }

    /**
     * Get Node storage 
     * @return Storage Node storage
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Node storage
     * @param Storage Node storage
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Node storage slope 
     * @return StorageSlope Node storage slope
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * Set Node storage slope
     * @param StorageSlope Node storage slope
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
    }

    public InstanceClusterNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceClusterNode(InstanceClusterNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Connected != null) {
            this.Connected = new Long(source.Connected);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DownTime != null) {
            this.DownTime = new String(source.DownTime);
        }
        if (source.Slots != null) {
            this.Slots = new String(source.Slots);
        }
        if (source.Keys != null) {
            this.Keys = new Long(source.Keys);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.QpsSlope != null) {
            this.QpsSlope = new Float(source.QpsSlope);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageSlope != null) {
            this.StorageSlope = new Float(source.StorageSlope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Connected", this.Connected);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownTime", this.DownTime);
        this.setParamSimple(map, prefix + "Slots", this.Slots);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "QpsSlope", this.QpsSlope);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageSlope", this.StorageSlope);

    }
}

