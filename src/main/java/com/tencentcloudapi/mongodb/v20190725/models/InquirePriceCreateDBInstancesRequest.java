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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDBInstancesRequest extends AbstractModel {

    /**
    * Instance region name in the format of ap-guangzhou-2.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of primary and secondary nodes per shard. <br>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and the `MinNodeNum` and `MaxNodeNum` parameters are the minimal and maximum value respectively.</li></ul>
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
    *  Instance disk size. <ul><li>Unit: GB</li><li>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and `MinStorage` and `MaxStorage` parameters are the minimal and maximum value of the disk size respectively.</br>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Instance version information. <ul><li>For specific supported versions, query through the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, the returned parameter `MongoVersionCode` in data structure `SpecItems` is the supported version information. </li><li>The correspondences between parameters and versions are as follows <ul><li>MONGO_3_WT: MongoDB 3.2 WiredTiger storage engine version. </li><li>MONGO_3_ROCKS: MongoDB 3.2 RocksDB storage engine version. </li><li>MONGO_36_WT: MongoDB 3.6 WiredTiger storage engine version. </li><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version. </li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version. </li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version. </li></ul>
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Server type. Valid values: `HIO` (high IO), `HIO10G` (ten-gigabit high IO)
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
    * Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * 
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * 
    */
    @SerializedName("MongosNum")
    @Expose
    private Long MongosNum;

    /**
    * 
    */
    @SerializedName("ConfigServerCpu")
    @Expose
    private Long ConfigServerCpu;

    /**
    * 
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * 
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

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
     * Get Number of primary and secondary nodes per shard. <br>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and the `MinNodeNum` and `MaxNodeNum` parameters are the minimal and maximum value respectively.</li></ul> 
     * @return NodeNum Number of primary and secondary nodes per shard. <br>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and the `MinNodeNum` and `MaxNodeNum` parameters are the minimal and maximum value respectively.</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of primary and secondary nodes per shard. <br>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and the `MinNodeNum` and `MaxNodeNum` parameters are the minimal and maximum value respectively.</li></ul>
     * @param NodeNum Number of primary and secondary nodes per shard. <br>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and the `MinNodeNum` and `MaxNodeNum` parameters are the minimal and maximum value respectively.</li></ul>
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
     * Get  Instance disk size. <ul><li>Unit: GB</li><li>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and `MinStorage` and `MaxStorage` parameters are the minimal and maximum value of the disk size respectively.</br> 
     * @return Volume  Instance disk size. <ul><li>Unit: GB</li><li>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and `MinStorage` and `MaxStorage` parameters are the minimal and maximum value of the disk size respectively.</br>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set  Instance disk size. <ul><li>Unit: GB</li><li>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and `MinStorage` and `MaxStorage` parameters are the minimal and maximum value of the disk size respectively.</br>
     * @param Volume  Instance disk size. <ul><li>Unit: GB</li><li>Value range: It can be queried by the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, and `MinStorage` and `MaxStorage` parameters are the minimal and maximum value of the disk size respectively.</br>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Instance version information. <ul><li>For specific supported versions, query through the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, the returned parameter `MongoVersionCode` in data structure `SpecItems` is the supported version information. </li><li>The correspondences between parameters and versions are as follows <ul><li>MONGO_3_WT: MongoDB 3.2 WiredTiger storage engine version. </li><li>MONGO_3_ROCKS: MongoDB 3.2 RocksDB storage engine version. </li><li>MONGO_36_WT: MongoDB 3.6 WiredTiger storage engine version. </li><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version. </li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version. </li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version. </li></ul> 
     * @return MongoVersion Instance version information. <ul><li>For specific supported versions, query through the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, the returned parameter `MongoVersionCode` in data structure `SpecItems` is the supported version information. </li><li>The correspondences between parameters and versions are as follows <ul><li>MONGO_3_WT: MongoDB 3.2 WiredTiger storage engine version. </li><li>MONGO_3_ROCKS: MongoDB 3.2 RocksDB storage engine version. </li><li>MONGO_36_WT: MongoDB 3.6 WiredTiger storage engine version. </li><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version. </li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version. </li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version. </li></ul>
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Instance version information. <ul><li>For specific supported versions, query through the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, the returned parameter `MongoVersionCode` in data structure `SpecItems` is the supported version information. </li><li>The correspondences between parameters and versions are as follows <ul><li>MONGO_3_WT: MongoDB 3.2 WiredTiger storage engine version. </li><li>MONGO_3_ROCKS: MongoDB 3.2 RocksDB storage engine version. </li><li>MONGO_36_WT: MongoDB 3.6 WiredTiger storage engine version. </li><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version. </li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version. </li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version. </li></ul>
     * @param MongoVersion Instance version information. <ul><li>For specific supported versions, query through the <a href="https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API, the returned parameter `MongoVersionCode` in data structure `SpecItems` is the supported version information. </li><li>The correspondences between parameters and versions are as follows <ul><li>MONGO_3_WT: MongoDB 3.2 WiredTiger storage engine version. </li><li>MONGO_3_ROCKS: MongoDB 3.2 RocksDB storage engine version. </li><li>MONGO_36_WT: MongoDB 3.6 WiredTiger storage engine version. </li><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version. </li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version. </li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version. </li></ul>
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Server type. Valid values: `HIO` (high IO), `HIO10G` (ten-gigabit high IO) 
     * @return MachineCode Server type. Valid values: `HIO` (high IO), `HIO10G` (ten-gigabit high IO)
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Server type. Valid values: `HIO` (high IO), `HIO10G` (ten-gigabit high IO)
     * @param MachineCode Server type. Valid values: `HIO` (high IO), `HIO10G` (ten-gigabit high IO)
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
     * Get  
     * @return InstanceChargeType 
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 
     * @param InstanceChargeType 
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get  
     * @return MongosCpu 
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set 
     * @param MongosCpu 
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get  
     * @return MongosMemory 
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set 
     * @param MongosMemory 
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get  
     * @return MongosNum 
     */
    public Long getMongosNum() {
        return this.MongosNum;
    }

    /**
     * Set 
     * @param MongosNum 
     */
    public void setMongosNum(Long MongosNum) {
        this.MongosNum = MongosNum;
    }

    /**
     * Get  
     * @return ConfigServerCpu 
     */
    public Long getConfigServerCpu() {
        return this.ConfigServerCpu;
    }

    /**
     * Set 
     * @param ConfigServerCpu 
     */
    public void setConfigServerCpu(Long ConfigServerCpu) {
        this.ConfigServerCpu = ConfigServerCpu;
    }

    /**
     * Get  
     * @return ConfigServerMemory 
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set 
     * @param ConfigServerMemory 
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get  
     * @return ConfigServerVolume 
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set 
     * @param ConfigServerVolume 
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    public InquirePriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateDBInstancesRequest(InquirePriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNum != null) {
            this.MongosNum = new Long(source.MongosNum);
        }
        if (source.ConfigServerCpu != null) {
            this.ConfigServerCpu = new Long(source.ConfigServerCpu);
        }
        if (source.ConfigServerMemory != null) {
            this.ConfigServerMemory = new Long(source.ConfigServerMemory);
        }
        if (source.ConfigServerVolume != null) {
            this.ConfigServerVolume = new Long(source.ConfigServerVolume);
        }
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
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNum", this.MongosNum);
        this.setParamSimple(map, prefix + "ConfigServerCpu", this.ConfigServerCpu);
        this.setParamSimple(map, prefix + "ConfigServerMemory", this.ConfigServerMemory);
        this.setParamSimple(map, prefix + "ConfigServerVolume", this.ConfigServerVolume);

    }
}

