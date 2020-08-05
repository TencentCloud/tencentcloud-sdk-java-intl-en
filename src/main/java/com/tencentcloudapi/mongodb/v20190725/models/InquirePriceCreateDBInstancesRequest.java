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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDBInstancesRequest extends AbstractModel{

    /**
    * Instance region name in the format of ap-guangzhou-2.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of nodes in each replica set. Currently, the number of nodes per replica set is fixed at 3, while the number of secondary nodes per shard is customizable. For more information, please see the parameter returned by the `DescribeSpecInfo` API.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Instance memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard).
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * Number of instances. Minimum value: 1. Maximum value: 10.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance type. Valid values: REPLSET (replica set), SHARD (sharded cluster), STANDALONE (single-node).
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Number of replica sets. To create a replica set instance, set this parameter to 1; to create a shard instance, see the parameters returned by the `DescribeSpecInfo` API; to create a single-node instance, set this parameter to 0.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
     * Get Instance region name in the format of ap-guangzhou-2. 
     * @return Zone Instance region name in the format of ap-guangzhou-2.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance region name in the format of ap-guangzhou-2.
     * @param Zone Instance region name in the format of ap-guangzhou-2.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of nodes in each replica set. Currently, the number of nodes per replica set is fixed at 3, while the number of secondary nodes per shard is customizable. For more information, please see the parameter returned by the `DescribeSpecInfo` API. 
     * @return NodeNum Number of nodes in each replica set. Currently, the number of nodes per replica set is fixed at 3, while the number of secondary nodes per shard is customizable. For more information, please see the parameter returned by the `DescribeSpecInfo` API.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of nodes in each replica set. Currently, the number of nodes per replica set is fixed at 3, while the number of secondary nodes per shard is customizable. For more information, please see the parameter returned by the `DescribeSpecInfo` API.
     * @param NodeNum Number of nodes in each replica set. Currently, the number of nodes per replica set is fixed at 3, while the number of secondary nodes per shard is customizable. For more information, please see the parameter returned by the `DescribeSpecInfo` API.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Instance memory size in GB. 
     * @return Memory Instance memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB.
     * @param Memory Instance memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB. 
     * @return Volume Instance disk size in GB.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB.
     * @param Volume Instance disk size in GB.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition. 
     * @return MongoVersion Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition.
     * @param MongoVersion Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard). 
     * @return MachineCode Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard).
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard).
     * @param MachineCode Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard).
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get Number of instances. Minimum value: 1. Maximum value: 10. 
     * @return GoodsNum Number of instances. Minimum value: 1. Maximum value: 10.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Minimum value: 1. Maximum value: 10.
     * @param GoodsNum Number of instances. Minimum value: 1. Maximum value: 10.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36. 
     * @return Period Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     * @param Period Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance type. Valid values: REPLSET (replica set), SHARD (sharded cluster), STANDALONE (single-node). 
     * @return ClusterType Instance type. Valid values: REPLSET (replica set), SHARD (sharded cluster), STANDALONE (single-node).
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Instance type. Valid values: REPLSET (replica set), SHARD (sharded cluster), STANDALONE (single-node).
     * @param ClusterType Instance type. Valid values: REPLSET (replica set), SHARD (sharded cluster), STANDALONE (single-node).
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Number of replica sets. To create a replica set instance, set this parameter to 1; to create a shard instance, see the parameters returned by the `DescribeSpecInfo` API; to create a single-node instance, set this parameter to 0. 
     * @return ReplicateSetNum Number of replica sets. To create a replica set instance, set this parameter to 1; to create a shard instance, see the parameters returned by the `DescribeSpecInfo` API; to create a single-node instance, set this parameter to 0.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Number of replica sets. To create a replica set instance, set this parameter to 1; to create a shard instance, see the parameters returned by the `DescribeSpecInfo` API; to create a single-node instance, set this parameter to 0.
     * @param ReplicateSetNum Number of replica sets. To create a replica set instance, set this parameter to 1; to create a shard instance, see the parameters returned by the `DescribeSpecInfo` API; to create a single-node instance, set this parameter to 0.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);

    }
}

