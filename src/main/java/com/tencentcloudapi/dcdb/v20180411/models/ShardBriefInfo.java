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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardBriefInfo extends AbstractModel {

    /**
    * Shard serial ID
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * Shard ID, such as shard-7vg1o339.
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * Shard running status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Description of shard running status
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Shard creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Shard memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Shard disk size in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Log disk space size of a shard in GB
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * Number of shard nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Disk space utilization of a shard
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * Version information of the shard proxy
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Source AZ of a shard
    */
    @SerializedName("ShardMasterZone")
    @Expose
    private String ShardMasterZone;

    /**
    * Replica AZ of a shard
    */
    @SerializedName("ShardSlaveZones")
    @Expose
    private String [] ShardSlaveZones;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Node information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodesInfo")
    @Expose
    private NodeInfo [] NodesInfo;

    /**
     * Get Shard serial ID 
     * @return ShardSerialId Shard serial ID
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set Shard serial ID
     * @param ShardSerialId Shard serial ID
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get Shard ID, such as shard-7vg1o339. 
     * @return ShardInstanceId Shard ID, such as shard-7vg1o339.
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set Shard ID, such as shard-7vg1o339.
     * @param ShardInstanceId Shard ID, such as shard-7vg1o339.
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get Shard running status 
     * @return Status Shard running status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Shard running status
     * @param Status Shard running status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Description of shard running status 
     * @return StatusDesc Description of shard running status
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Description of shard running status
     * @param StatusDesc Description of shard running status
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Shard creation time 
     * @return CreateTime Shard creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Shard creation time
     * @param CreateTime Shard creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Shard memory size in GB 
     * @return Memory Shard memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Shard memory size in GB
     * @param Memory Shard memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Shard disk size in GB 
     * @return Storage Shard disk size in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Shard disk size in GB
     * @param Storage Shard disk size in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Log disk space size of a shard in GB 
     * @return LogDisk Log disk space size of a shard in GB
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set Log disk space size of a shard in GB
     * @param LogDisk Log disk space size of a shard in GB
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get Number of shard nodes 
     * @return NodeCount Number of shard nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of shard nodes
     * @param NodeCount Number of shard nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Disk space utilization of a shard 
     * @return StorageUsage Disk space utilization of a shard
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set Disk space utilization of a shard
     * @param StorageUsage Disk space utilization of a shard
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get Version information of the shard proxy 
     * @return ProxyVersion Version information of the shard proxy
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set Version information of the shard proxy
     * @param ProxyVersion Version information of the shard proxy
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Source AZ of a shard 
     * @return ShardMasterZone Source AZ of a shard
     */
    public String getShardMasterZone() {
        return this.ShardMasterZone;
    }

    /**
     * Set Source AZ of a shard
     * @param ShardMasterZone Source AZ of a shard
     */
    public void setShardMasterZone(String ShardMasterZone) {
        this.ShardMasterZone = ShardMasterZone;
    }

    /**
     * Get Replica AZ of a shard 
     * @return ShardSlaveZones Replica AZ of a shard
     */
    public String [] getShardSlaveZones() {
        return this.ShardSlaveZones;
    }

    /**
     * Set Replica AZ of a shard
     * @param ShardSlaveZones Replica AZ of a shard
     */
    public void setShardSlaveZones(String [] ShardSlaveZones) {
        this.ShardSlaveZones = ShardSlaveZones;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Node information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodesInfo Node information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeInfo [] getNodesInfo() {
        return this.NodesInfo;
    }

    /**
     * Set Node information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodesInfo Node information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodesInfo(NodeInfo [] NodesInfo) {
        this.NodesInfo = NodesInfo;
    }

    public ShardBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShardBriefInfo(ShardBriefInfo source) {
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.ShardInstanceId != null) {
            this.ShardInstanceId = new String(source.ShardInstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.LogDisk != null) {
            this.LogDisk = new Long(source.LogDisk);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new Float(source.StorageUsage);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.ShardMasterZone != null) {
            this.ShardMasterZone = new String(source.ShardMasterZone);
        }
        if (source.ShardSlaveZones != null) {
            this.ShardSlaveZones = new String[source.ShardSlaveZones.length];
            for (int i = 0; i < source.ShardSlaveZones.length; i++) {
                this.ShardSlaveZones[i] = new String(source.ShardSlaveZones[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.NodesInfo != null) {
            this.NodesInfo = new NodeInfo[source.NodesInfo.length];
            for (int i = 0; i < source.NodesInfo.length; i++) {
                this.NodesInfo[i] = new NodeInfo(source.NodesInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "LogDisk", this.LogDisk);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "ShardMasterZone", this.ShardMasterZone);
        this.setParamArraySimple(map, prefix + "ShardSlaveZones.", this.ShardSlaveZones);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamArrayObj(map, prefix + "NodesInfo.", this.NodesInfo);

    }
}

