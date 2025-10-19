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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecItem extends AbstractModel {

    /**
    * Specification information identifier. Format: mongo.HIO10G.128G. It consists of three parts: node type, specification type, and memory specification.
- Node type: **mongo** indicates a Mongod node; **mongos** indicates a Mongos node; **cfgstr** indicates a ConfigServer node.
- Specification type: **HIO10G** indicates the general HIO 10GE type; **HCD** indicates the Cloud Disk Edition type.
- Memory specification, in GB. Valid values: 4, 8, 16, 32, 64, 128, 240, and 512. 128g indicates 128 GB.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Saleable specification status flag. Valid values are as follows:
 - 0: selling stopped.
 - 1: available for sale.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Computing resource specification, indicating the number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory specification. Unit: MB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Default disk specification. Unit: MB.
    */
    @SerializedName("DefaultStorage")
    @Expose
    private Long DefaultStorage;

    /**
    * Maximum disk specification. Unit: MB.
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Minimum disk specification. Unit: MB.
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * Maximum number of requests per second. Unit: requests/second.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Maximum number of connections supported for the specification.
    */
    @SerializedName("Conns")
    @Expose
    private Long Conns;

    /**
    * Storage engine version information on instances.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
    */
    @SerializedName("MongoVersionCode")
    @Expose
    private String MongoVersionCode;

    /**
    * Digital version corresponding to the instance version.
    */
    @SerializedName("MongoVersionValue")
    @Expose
    private Long MongoVersionValue;

    /**
    * Instance version information. Valid values: 4.2, 4.4, 5.0, 6.0, and 7.0.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Storage engine.
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Cluster type. Valid values are as follows:
 - 1: sharded cluster.
 - 0: replica set cluster.
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Minimum number of nodes for each replica set.
    */
    @SerializedName("MinNodeNum")
    @Expose
    private Long MinNodeNum;

    /**
    * Maximum number of nodes for each replica set.
    */
    @SerializedName("MaxNodeNum")
    @Expose
    private Long MaxNodeNum;

    /**
    * Minimum number of shards.
    */
    @SerializedName("MinReplicateSetNum")
    @Expose
    private Long MinReplicateSetNum;

    /**
    * Maximum number of shards.
    */
    @SerializedName("MaxReplicateSetNum")
    @Expose
    private Long MaxReplicateSetNum;

    /**
    * Minimum number of nodes for each shard.
    */
    @SerializedName("MinReplicateSetNodeNum")
    @Expose
    private Long MinReplicateSetNodeNum;

    /**
    * Maximum number of nodes for each shard.
    */
    @SerializedName("MaxReplicateSetNodeNum")
    @Expose
    private Long MaxReplicateSetNodeNum;

    /**
    * Cluster specification type. Valid values are as follows:
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get Specification information identifier. Format: mongo.HIO10G.128G. It consists of three parts: node type, specification type, and memory specification.
- Node type: **mongo** indicates a Mongod node; **mongos** indicates a Mongos node; **cfgstr** indicates a ConfigServer node.
- Specification type: **HIO10G** indicates the general HIO 10GE type; **HCD** indicates the Cloud Disk Edition type.
- Memory specification, in GB. Valid values: 4, 8, 16, 32, 64, 128, 240, and 512. 128g indicates 128 GB. 
     * @return SpecCode Specification information identifier. Format: mongo.HIO10G.128G. It consists of three parts: node type, specification type, and memory specification.
- Node type: **mongo** indicates a Mongod node; **mongos** indicates a Mongos node; **cfgstr** indicates a ConfigServer node.
- Specification type: **HIO10G** indicates the general HIO 10GE type; **HCD** indicates the Cloud Disk Edition type.
- Memory specification, in GB. Valid values: 4, 8, 16, 32, 64, 128, 240, and 512. 128g indicates 128 GB.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Specification information identifier. Format: mongo.HIO10G.128G. It consists of three parts: node type, specification type, and memory specification.
- Node type: **mongo** indicates a Mongod node; **mongos** indicates a Mongos node; **cfgstr** indicates a ConfigServer node.
- Specification type: **HIO10G** indicates the general HIO 10GE type; **HCD** indicates the Cloud Disk Edition type.
- Memory specification, in GB. Valid values: 4, 8, 16, 32, 64, 128, 240, and 512. 128g indicates 128 GB.
     * @param SpecCode Specification information identifier. Format: mongo.HIO10G.128G. It consists of three parts: node type, specification type, and memory specification.
- Node type: **mongo** indicates a Mongod node; **mongos** indicates a Mongos node; **cfgstr** indicates a ConfigServer node.
- Specification type: **HIO10G** indicates the general HIO 10GE type; **HCD** indicates the Cloud Disk Edition type.
- Memory specification, in GB. Valid values: 4, 8, 16, 32, 64, 128, 240, and 512. 128g indicates 128 GB.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Saleable specification status flag. Valid values are as follows:
 - 0: selling stopped.
 - 1: available for sale. 
     * @return Status Saleable specification status flag. Valid values are as follows:
 - 0: selling stopped.
 - 1: available for sale.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Saleable specification status flag. Valid values are as follows:
 - 0: selling stopped.
 - 1: available for sale.
     * @param Status Saleable specification status flag. Valid values are as follows:
 - 0: selling stopped.
 - 1: available for sale.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Computing resource specification, indicating the number of CPU cores. 
     * @return Cpu Computing resource specification, indicating the number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Computing resource specification, indicating the number of CPU cores.
     * @param Cpu Computing resource specification, indicating the number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory specification. Unit: MB. 
     * @return Memory Memory specification. Unit: MB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory specification. Unit: MB.
     * @param Memory Memory specification. Unit: MB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Default disk specification. Unit: MB. 
     * @return DefaultStorage Default disk specification. Unit: MB.
     */
    public Long getDefaultStorage() {
        return this.DefaultStorage;
    }

    /**
     * Set Default disk specification. Unit: MB.
     * @param DefaultStorage Default disk specification. Unit: MB.
     */
    public void setDefaultStorage(Long DefaultStorage) {
        this.DefaultStorage = DefaultStorage;
    }

    /**
     * Get Maximum disk specification. Unit: MB. 
     * @return MaxStorage Maximum disk specification. Unit: MB.
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Maximum disk specification. Unit: MB.
     * @param MaxStorage Maximum disk specification. Unit: MB.
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Minimum disk specification. Unit: MB. 
     * @return MinStorage Minimum disk specification. Unit: MB.
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set Minimum disk specification. Unit: MB.
     * @param MinStorage Minimum disk specification. Unit: MB.
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get Maximum number of requests per second. Unit: requests/second. 
     * @return Qps Maximum number of requests per second. Unit: requests/second.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Maximum number of requests per second. Unit: requests/second.
     * @param Qps Maximum number of requests per second. Unit: requests/second.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Maximum number of connections supported for the specification. 
     * @return Conns Maximum number of connections supported for the specification.
     */
    public Long getConns() {
        return this.Conns;
    }

    /**
     * Set Maximum number of connections supported for the specification.
     * @param Conns Maximum number of connections supported for the specification.
     */
    public void setConns(Long Conns) {
        this.Conns = Conns;
    }

    /**
     * Get Storage engine version information on instances.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine. 
     * @return MongoVersionCode Storage engine version information on instances.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     */
    public String getMongoVersionCode() {
        return this.MongoVersionCode;
    }

    /**
     * Set Storage engine version information on instances.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     * @param MongoVersionCode Storage engine version information on instances.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     */
    public void setMongoVersionCode(String MongoVersionCode) {
        this.MongoVersionCode = MongoVersionCode;
    }

    /**
     * Get Digital version corresponding to the instance version. 
     * @return MongoVersionValue Digital version corresponding to the instance version.
     */
    public Long getMongoVersionValue() {
        return this.MongoVersionValue;
    }

    /**
     * Set Digital version corresponding to the instance version.
     * @param MongoVersionValue Digital version corresponding to the instance version.
     */
    public void setMongoVersionValue(Long MongoVersionValue) {
        this.MongoVersionValue = MongoVersionValue;
    }

    /**
     * Get Instance version information. Valid values: 4.2, 4.4, 5.0, 6.0, and 7.0. 
     * @return Version Instance version information. Valid values: 4.2, 4.4, 5.0, 6.0, and 7.0.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version information. Valid values: 4.2, 4.4, 5.0, 6.0, and 7.0.
     * @param Version Instance version information. Valid values: 4.2, 4.4, 5.0, 6.0, and 7.0.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Storage engine. 
     * @return EngineName Storage engine.
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Storage engine.
     * @param EngineName Storage engine.
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Cluster type. Valid values are as follows:
 - 1: sharded cluster.
 - 0: replica set cluster. 
     * @return ClusterType Cluster type. Valid values are as follows:
 - 1: sharded cluster.
 - 0: replica set cluster.
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values are as follows:
 - 1: sharded cluster.
 - 0: replica set cluster.
     * @param ClusterType Cluster type. Valid values are as follows:
 - 1: sharded cluster.
 - 0: replica set cluster.
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Minimum number of nodes for each replica set. 
     * @return MinNodeNum Minimum number of nodes for each replica set.
     */
    public Long getMinNodeNum() {
        return this.MinNodeNum;
    }

    /**
     * Set Minimum number of nodes for each replica set.
     * @param MinNodeNum Minimum number of nodes for each replica set.
     */
    public void setMinNodeNum(Long MinNodeNum) {
        this.MinNodeNum = MinNodeNum;
    }

    /**
     * Get Maximum number of nodes for each replica set. 
     * @return MaxNodeNum Maximum number of nodes for each replica set.
     */
    public Long getMaxNodeNum() {
        return this.MaxNodeNum;
    }

    /**
     * Set Maximum number of nodes for each replica set.
     * @param MaxNodeNum Maximum number of nodes for each replica set.
     */
    public void setMaxNodeNum(Long MaxNodeNum) {
        this.MaxNodeNum = MaxNodeNum;
    }

    /**
     * Get Minimum number of shards. 
     * @return MinReplicateSetNum Minimum number of shards.
     */
    public Long getMinReplicateSetNum() {
        return this.MinReplicateSetNum;
    }

    /**
     * Set Minimum number of shards.
     * @param MinReplicateSetNum Minimum number of shards.
     */
    public void setMinReplicateSetNum(Long MinReplicateSetNum) {
        this.MinReplicateSetNum = MinReplicateSetNum;
    }

    /**
     * Get Maximum number of shards. 
     * @return MaxReplicateSetNum Maximum number of shards.
     */
    public Long getMaxReplicateSetNum() {
        return this.MaxReplicateSetNum;
    }

    /**
     * Set Maximum number of shards.
     * @param MaxReplicateSetNum Maximum number of shards.
     */
    public void setMaxReplicateSetNum(Long MaxReplicateSetNum) {
        this.MaxReplicateSetNum = MaxReplicateSetNum;
    }

    /**
     * Get Minimum number of nodes for each shard. 
     * @return MinReplicateSetNodeNum Minimum number of nodes for each shard.
     */
    public Long getMinReplicateSetNodeNum() {
        return this.MinReplicateSetNodeNum;
    }

    /**
     * Set Minimum number of nodes for each shard.
     * @param MinReplicateSetNodeNum Minimum number of nodes for each shard.
     */
    public void setMinReplicateSetNodeNum(Long MinReplicateSetNodeNum) {
        this.MinReplicateSetNodeNum = MinReplicateSetNodeNum;
    }

    /**
     * Get Maximum number of nodes for each shard. 
     * @return MaxReplicateSetNodeNum Maximum number of nodes for each shard.
     */
    public Long getMaxReplicateSetNodeNum() {
        return this.MaxReplicateSetNodeNum;
    }

    /**
     * Set Maximum number of nodes for each shard.
     * @param MaxReplicateSetNodeNum Maximum number of nodes for each shard.
     */
    public void setMaxReplicateSetNodeNum(Long MaxReplicateSetNodeNum) {
        this.MaxReplicateSetNodeNum = MaxReplicateSetNodeNum;
    }

    /**
     * Get Cluster specification type. Valid values are as follows:
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type. 
     * @return MachineType Cluster specification type. Valid values are as follows:
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Cluster specification type. Valid values are as follows:
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     * @param MachineType Cluster specification type. Valid values are as follows:
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public SpecItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecItem(SpecItem source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DefaultStorage != null) {
            this.DefaultStorage = new Long(source.DefaultStorage);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Conns != null) {
            this.Conns = new Long(source.Conns);
        }
        if (source.MongoVersionCode != null) {
            this.MongoVersionCode = new String(source.MongoVersionCode);
        }
        if (source.MongoVersionValue != null) {
            this.MongoVersionValue = new Long(source.MongoVersionValue);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.MinNodeNum != null) {
            this.MinNodeNum = new Long(source.MinNodeNum);
        }
        if (source.MaxNodeNum != null) {
            this.MaxNodeNum = new Long(source.MaxNodeNum);
        }
        if (source.MinReplicateSetNum != null) {
            this.MinReplicateSetNum = new Long(source.MinReplicateSetNum);
        }
        if (source.MaxReplicateSetNum != null) {
            this.MaxReplicateSetNum = new Long(source.MaxReplicateSetNum);
        }
        if (source.MinReplicateSetNodeNum != null) {
            this.MinReplicateSetNodeNum = new Long(source.MinReplicateSetNodeNum);
        }
        if (source.MaxReplicateSetNodeNum != null) {
            this.MaxReplicateSetNodeNum = new Long(source.MaxReplicateSetNodeNum);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DefaultStorage", this.DefaultStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Conns", this.Conns);
        this.setParamSimple(map, prefix + "MongoVersionCode", this.MongoVersionCode);
        this.setParamSimple(map, prefix + "MongoVersionValue", this.MongoVersionValue);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "MinNodeNum", this.MinNodeNum);
        this.setParamSimple(map, prefix + "MaxNodeNum", this.MaxNodeNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNum", this.MinReplicateSetNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNum", this.MaxReplicateSetNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNodeNum", this.MinReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNodeNum", this.MaxReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

