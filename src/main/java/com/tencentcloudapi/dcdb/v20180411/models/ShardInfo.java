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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardInfo extends AbstractModel {

    /**
    * Shard ID
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;

    /**
    * Shard set ID
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * Status. 0: creating; 1: processing; 2: running; 3: shard not initialized; -2: shard deleted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Numeric ID of a shard
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * Number of nodes. 2: one primary and one secondary; 3: one primary and two secondaries
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Product type ID (this field is obsolete and should not be depended on)
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Shard ID 
     * @return ShardInstanceId Shard ID
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * Set Shard ID
     * @param ShardInstanceId Shard ID
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * Get Shard set ID 
     * @return ShardSerialId Shard set ID
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set Shard set ID
     * @param ShardSerialId Shard set ID
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get Status. 0: creating; 1: processing; 2: running; 3: shard not initialized; -2: shard deleted 
     * @return Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized; -2: shard deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: creating; 1: processing; 2: running; 3: shard not initialized; -2: shard deleted
     * @param Status Status. 0: creating; 1: processing; 2: running; 3: shard not initialized; -2: shard deleted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return Createtime Creation time
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set Creation time
     * @param Createtime Creation time
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity in GB 
     * @return Storage Storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB
     * @param Storage Storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Numeric ID of a shard 
     * @return ShardId Numeric ID of a shard
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set Numeric ID of a shard
     * @param ShardId Numeric ID of a shard
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get Number of nodes. 2: one primary and one secondary; 3: one primary and two secondaries 
     * @return NodeCount Number of nodes. 2: one primary and one secondary; 3: one primary and two secondaries
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one primary and one secondary; 3: one primary and two secondaries
     * @param NodeCount Number of nodes. 2: one primary and one secondary; 3: one primary and two secondaries
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Product type ID (this field is obsolete and should not be depended on) 
     * @return Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product type ID (this field is obsolete and should not be depended on)
     * @param Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
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

    public ShardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShardInfo(ShardInfo source) {
        if (source.ShardInstanceId != null) {
            this.ShardInstanceId = new String(source.ShardInstanceId);
        }
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.ShardId != null) {
            this.ShardId = new Long(source.ShardId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

