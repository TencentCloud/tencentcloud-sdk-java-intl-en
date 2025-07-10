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

public class InquirePriceCreateDBInstancesRequest extends AbstractModel {

    /**
    * Instance region name in the format of ap-guangzhou-2.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    *  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Instance memory size.

 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specification, respectively.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size.
 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Instance version information. For specific supported versions, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported for instances. The correspondence between version information and version number is as follows:
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk.
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
    * Instance type.

 - REPLSET: replica set.
 - SHARD: sharded cluster.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    *  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    *  - When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.
 - When pay-as-you-go is selected, that is, when <b>InstanceChargeType</b> is set to **POSTPAID_BY_HOUR**, this parameter only can be set to 1.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance payment method.
 - PREPAID: monthly subscription.
 - POSTPAID_BY_HOUR: pay-as-you-go.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.
    */
    @SerializedName("MongosNum")
    @Expose
    private Long MongosNum;

    /**
    * Specifies the number of ConfigServer CPU cores. The value is fixed as 1.
    */
    @SerializedName("ConfigServerCpu")
    @Expose
    private Long ConfigServerCpu;

    /**
    * Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * Specifies the ConfigServer disk size. The value is fixed as 20. Unit: GB. This parameter can be left blank.
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
     * Get  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard. 
     * @return NodeNum  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard.
     * @param NodeNum  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Instance memory size.

 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specification, respectively. 
     * @return Memory Instance memory size.

 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specification, respectively.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size.

 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specification, respectively.
     * @param Memory Instance memory size.

 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specification, respectively.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size.
 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively. 
     * @return Volume Instance disk size.
 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size.
 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.
     * @param Volume Instance disk size.
 - Unit: GB.
 - For the value range, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Instance version information. For specific supported versions, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported for instances. The correspondence between version information and version number is as follows:
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine. 
     * @return MongoVersion Instance version information. For specific supported versions, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported for instances. The correspondence between version information and version number is as follows:
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Instance version information. For specific supported versions, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported for instances. The correspondence between version information and version number is as follows:
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
     * @param MongoVersion Instance version information. For specific supported versions, call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported for instances. The correspondence between version information and version number is as follows:
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk. 
     * @return MachineCode Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk.
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk.
     * @param MachineCode Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk.
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
     * Get Instance type.

 - REPLSET: replica set.
 - SHARD: sharded cluster. 
     * @return ClusterType Instance type.

 - REPLSET: replica set.
 - SHARD: sharded cluster.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Instance type.

 - REPLSET: replica set.
 - SHARD: sharded cluster.
     * @param ClusterType Instance type.

 - REPLSET: replica set.
 - SHARD: sharded cluster.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively. 
     * @return ReplicateSetNum  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.
     * @param ReplicateSetNum  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get  - When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.
 - When pay-as-you-go is selected, that is, when <b>InstanceChargeType</b> is set to **POSTPAID_BY_HOUR**, this parameter only can be set to 1. 
     * @return Period  - When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.
 - When pay-as-you-go is selected, that is, when <b>InstanceChargeType</b> is set to **POSTPAID_BY_HOUR**, this parameter only can be set to 1.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set  - When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.
 - When pay-as-you-go is selected, that is, when <b>InstanceChargeType</b> is set to **POSTPAID_BY_HOUR**, this parameter only can be set to 1.
     * @param Period  - When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.
 - When pay-as-you-go is selected, that is, when <b>InstanceChargeType</b> is set to **POSTPAID_BY_HOUR**, this parameter only can be set to 1.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance payment method.
 - PREPAID: monthly subscription.
 - POSTPAID_BY_HOUR: pay-as-you-go. 
     * @return InstanceChargeType Instance payment method.
 - PREPAID: monthly subscription.
 - POSTPAID_BY_HOUR: pay-as-you-go.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance payment method.
 - PREPAID: monthly subscription.
 - POSTPAID_BY_HOUR: pay-as-you-go.
     * @param InstanceChargeType Instance payment method.
 - PREPAID: monthly subscription.
 - POSTPAID_BY_HOUR: pay-as-you-go.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used. 
     * @return MongosCpu Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.
     * @param MongosCpu Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used. 
     * @return MongosMemory Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.
     * @param MongosMemory Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used. 
     * @return MongosNum Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.
     */
    public Long getMongosNum() {
        return this.MongosNum;
    }

    /**
     * Set Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.
     * @param MongosNum Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.
     */
    public void setMongosNum(Long MongosNum) {
        this.MongosNum = MongosNum;
    }

    /**
     * Get Specifies the number of ConfigServer CPU cores. The value is fixed as 1. 
     * @return ConfigServerCpu Specifies the number of ConfigServer CPU cores. The value is fixed as 1.
     */
    public Long getConfigServerCpu() {
        return this.ConfigServerCpu;
    }

    /**
     * Set Specifies the number of ConfigServer CPU cores. The value is fixed as 1.
     * @param ConfigServerCpu Specifies the number of ConfigServer CPU cores. The value is fixed as 1.
     */
    public void setConfigServerCpu(Long ConfigServerCpu) {
        this.ConfigServerCpu = ConfigServerCpu;
    }

    /**
     * Get Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank. 
     * @return ConfigServerMemory Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.
     * @param ConfigServerMemory Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get Specifies the ConfigServer disk size. The value is fixed as 20. Unit: GB. This parameter can be left blank. 
     * @return ConfigServerVolume Specifies the ConfigServer disk size. The value is fixed as 20. Unit: GB. This parameter can be left blank.
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set Specifies the ConfigServer disk size. The value is fixed as 20. Unit: GB. This parameter can be left blank.
     * @param ConfigServerVolume Specifies the ConfigServer disk size. The value is fixed as 20. Unit: GB. This parameter can be left blank.
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

