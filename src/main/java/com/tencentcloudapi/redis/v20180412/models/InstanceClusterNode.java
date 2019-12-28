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
    * Cluster role. 0: master; 1: slave
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * Node status. 0: readwrite; 1: read; 2: backup
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Service status. 0: down; 1: on
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
    * Node deactivation time
    */
    @SerializedName("DownTime")
    @Expose
    private String DownTime;

    /**
    * Distribution of node slots
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
    * Node QPS
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
    * Storage slope of a node
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
     * Get Cluster role. 0: master; 1: slave 
     * @return Role Cluster role. 0: master; 1: slave
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Cluster role. 0: master; 1: slave
     * @param Role Cluster role. 0: master; 1: slave
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get Node status. 0: readwrite; 1: read; 2: backup 
     * @return Status Node status. 0: readwrite; 1: read; 2: backup
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Node status. 0: readwrite; 1: read; 2: backup
     * @param Status Node status. 0: readwrite; 1: read; 2: backup
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Node deactivation time 
     * @return DownTime Node deactivation time
     */
    public String getDownTime() {
        return this.DownTime;
    }

    /**
     * Set Node deactivation time
     * @param DownTime Node deactivation time
     */
    public void setDownTime(String DownTime) {
        this.DownTime = DownTime;
    }

    /**
     * Get Distribution of node slots 
     * @return Slots Distribution of node slots
     */
    public String getSlots() {
        return this.Slots;
    }

    /**
     * Set Distribution of node slots
     * @param Slots Distribution of node slots
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
     * Get Node QPS 
     * @return Qps Node QPS
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Node QPS
     * @param Qps Node QPS
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
     * Get Storage slope of a node 
     * @return StorageSlope Storage slope of a node
     */
    public Float getStorageSlope() {
        return this.StorageSlope;
    }

    /**
     * Set Storage slope of a node
     * @param StorageSlope Storage slope of a node
     */
    public void setStorageSlope(Float StorageSlope) {
        this.StorageSlope = StorageSlope;
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

