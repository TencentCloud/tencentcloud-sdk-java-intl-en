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
    * Specification information identifier
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Specification purchasable flag. Valid values: 0 (not purchasable), 1 (purchasable)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Computing resource specification in terms of CPU core
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Default disk size in MB
    */
    @SerializedName("DefaultStorage")
    @Expose
    private Long DefaultStorage;

    /**
    * Maximum disk size in MB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Minimum disk size in MB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * Maximum QPS
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Maximum number of connections
    */
    @SerializedName("Conns")
    @Expose
    private Long Conns;

    /**
    * MongoDB version information of an instance
    */
    @SerializedName("MongoVersionCode")
    @Expose
    private String MongoVersionCode;

    /**
    * MongoDB version number of an instance
    */
    @SerializedName("MongoVersionValue")
    @Expose
    private Long MongoVersionValue;

    /**
    * MongoDB version number of an instance (short)
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Storage engine
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Cluster type. Valid values: 1 (sharding cluster), 0 (replica set cluster)
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Minimum number of secondary nodes in a replica set
    */
    @SerializedName("MinNodeNum")
    @Expose
    private Long MinNodeNum;

    /**
    * Maximum number of secondary nodes in a replica set
    */
    @SerializedName("MaxNodeNum")
    @Expose
    private Long MaxNodeNum;

    /**
    * Minimum number of shards
    */
    @SerializedName("MinReplicateSetNum")
    @Expose
    private Long MinReplicateSetNum;

    /**
    * Maximum number of shards
    */
    @SerializedName("MaxReplicateSetNum")
    @Expose
    private Long MaxReplicateSetNum;

    /**
    * Minimum number of secondary nodes in a shard
    */
    @SerializedName("MinReplicateSetNodeNum")
    @Expose
    private Long MinReplicateSetNodeNum;

    /**
    * Maximum number of secondary nodes in a shard
    */
    @SerializedName("MaxReplicateSetNodeNum")
    @Expose
    private Long MaxReplicateSetNodeNum;

    /**
    * Server type. Valid values: 0 (HIO), 4 (HIO10G)
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get Specification information identifier 
     * @return SpecCode Specification information identifier
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Specification information identifier
     * @param SpecCode Specification information identifier
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Specification purchasable flag. Valid values: 0 (not purchasable), 1 (purchasable) 
     * @return Status Specification purchasable flag. Valid values: 0 (not purchasable), 1 (purchasable)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specification purchasable flag. Valid values: 0 (not purchasable), 1 (purchasable)
     * @param Status Specification purchasable flag. Valid values: 0 (not purchasable), 1 (purchasable)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Computing resource specification in terms of CPU core 
     * @return Cpu Computing resource specification in terms of CPU core
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Computing resource specification in terms of CPU core
     * @param Cpu Computing resource specification in terms of CPU core
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in MB 
     * @return Memory Memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in MB
     * @param Memory Memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Default disk size in MB 
     * @return DefaultStorage Default disk size in MB
     */
    public Long getDefaultStorage() {
        return this.DefaultStorage;
    }

    /**
     * Set Default disk size in MB
     * @param DefaultStorage Default disk size in MB
     */
    public void setDefaultStorage(Long DefaultStorage) {
        this.DefaultStorage = DefaultStorage;
    }

    /**
     * Get Maximum disk size in MB 
     * @return MaxStorage Maximum disk size in MB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Maximum disk size in MB
     * @param MaxStorage Maximum disk size in MB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Minimum disk size in MB 
     * @return MinStorage Minimum disk size in MB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set Minimum disk size in MB
     * @param MinStorage Minimum disk size in MB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get Maximum QPS 
     * @return Qps Maximum QPS
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Maximum QPS
     * @param Qps Maximum QPS
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Maximum number of connections 
     * @return Conns Maximum number of connections
     */
    public Long getConns() {
        return this.Conns;
    }

    /**
     * Set Maximum number of connections
     * @param Conns Maximum number of connections
     */
    public void setConns(Long Conns) {
        this.Conns = Conns;
    }

    /**
     * Get MongoDB version information of an instance 
     * @return MongoVersionCode MongoDB version information of an instance
     */
    public String getMongoVersionCode() {
        return this.MongoVersionCode;
    }

    /**
     * Set MongoDB version information of an instance
     * @param MongoVersionCode MongoDB version information of an instance
     */
    public void setMongoVersionCode(String MongoVersionCode) {
        this.MongoVersionCode = MongoVersionCode;
    }

    /**
     * Get MongoDB version number of an instance 
     * @return MongoVersionValue MongoDB version number of an instance
     */
    public Long getMongoVersionValue() {
        return this.MongoVersionValue;
    }

    /**
     * Set MongoDB version number of an instance
     * @param MongoVersionValue MongoDB version number of an instance
     */
    public void setMongoVersionValue(Long MongoVersionValue) {
        this.MongoVersionValue = MongoVersionValue;
    }

    /**
     * Get MongoDB version number of an instance (short) 
     * @return Version MongoDB version number of an instance (short)
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set MongoDB version number of an instance (short)
     * @param Version MongoDB version number of an instance (short)
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Storage engine 
     * @return EngineName Storage engine
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Storage engine
     * @param EngineName Storage engine
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Cluster type. Valid values: 1 (sharding cluster), 0 (replica set cluster) 
     * @return ClusterType Cluster type. Valid values: 1 (sharding cluster), 0 (replica set cluster)
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: 1 (sharding cluster), 0 (replica set cluster)
     * @param ClusterType Cluster type. Valid values: 1 (sharding cluster), 0 (replica set cluster)
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Minimum number of secondary nodes in a replica set 
     * @return MinNodeNum Minimum number of secondary nodes in a replica set
     */
    public Long getMinNodeNum() {
        return this.MinNodeNum;
    }

    /**
     * Set Minimum number of secondary nodes in a replica set
     * @param MinNodeNum Minimum number of secondary nodes in a replica set
     */
    public void setMinNodeNum(Long MinNodeNum) {
        this.MinNodeNum = MinNodeNum;
    }

    /**
     * Get Maximum number of secondary nodes in a replica set 
     * @return MaxNodeNum Maximum number of secondary nodes in a replica set
     */
    public Long getMaxNodeNum() {
        return this.MaxNodeNum;
    }

    /**
     * Set Maximum number of secondary nodes in a replica set
     * @param MaxNodeNum Maximum number of secondary nodes in a replica set
     */
    public void setMaxNodeNum(Long MaxNodeNum) {
        this.MaxNodeNum = MaxNodeNum;
    }

    /**
     * Get Minimum number of shards 
     * @return MinReplicateSetNum Minimum number of shards
     */
    public Long getMinReplicateSetNum() {
        return this.MinReplicateSetNum;
    }

    /**
     * Set Minimum number of shards
     * @param MinReplicateSetNum Minimum number of shards
     */
    public void setMinReplicateSetNum(Long MinReplicateSetNum) {
        this.MinReplicateSetNum = MinReplicateSetNum;
    }

    /**
     * Get Maximum number of shards 
     * @return MaxReplicateSetNum Maximum number of shards
     */
    public Long getMaxReplicateSetNum() {
        return this.MaxReplicateSetNum;
    }

    /**
     * Set Maximum number of shards
     * @param MaxReplicateSetNum Maximum number of shards
     */
    public void setMaxReplicateSetNum(Long MaxReplicateSetNum) {
        this.MaxReplicateSetNum = MaxReplicateSetNum;
    }

    /**
     * Get Minimum number of secondary nodes in a shard 
     * @return MinReplicateSetNodeNum Minimum number of secondary nodes in a shard
     */
    public Long getMinReplicateSetNodeNum() {
        return this.MinReplicateSetNodeNum;
    }

    /**
     * Set Minimum number of secondary nodes in a shard
     * @param MinReplicateSetNodeNum Minimum number of secondary nodes in a shard
     */
    public void setMinReplicateSetNodeNum(Long MinReplicateSetNodeNum) {
        this.MinReplicateSetNodeNum = MinReplicateSetNodeNum;
    }

    /**
     * Get Maximum number of secondary nodes in a shard 
     * @return MaxReplicateSetNodeNum Maximum number of secondary nodes in a shard
     */
    public Long getMaxReplicateSetNodeNum() {
        return this.MaxReplicateSetNodeNum;
    }

    /**
     * Set Maximum number of secondary nodes in a shard
     * @param MaxReplicateSetNodeNum Maximum number of secondary nodes in a shard
     */
    public void setMaxReplicateSetNodeNum(Long MaxReplicateSetNodeNum) {
        this.MaxReplicateSetNodeNum = MaxReplicateSetNodeNum;
    }

    /**
     * Get Server type. Valid values: 0 (HIO), 4 (HIO10G) 
     * @return MachineType Server type. Valid values: 0 (HIO), 4 (HIO10G)
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server type. Valid values: 0 (HIO), 4 (HIO10G)
     * @param MachineType Server type. Valid values: 0 (HIO), 4 (HIO10G)
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

