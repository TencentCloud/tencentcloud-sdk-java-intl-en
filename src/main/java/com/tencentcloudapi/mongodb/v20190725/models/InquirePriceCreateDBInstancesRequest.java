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
    * <p>Region and AZ information of the instance. For details, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Instance memory size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li></ul>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance disk size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.</li></ul>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Instance version information. The <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API can be called to obtain specific supported versions. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported by instances. The corresponding relationship between version information and version number is as follows:</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger storage engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger storage engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger storage engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger storage engine version.</li></ul>
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * <p>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud disk edition).</li></ul><p>Note: Allowlist specification types are under allowlist control. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * <p>Number of instances. Value range: [1,10].</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Instance type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * <ul><li>When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.<br>- When the pay-as-you-go mode is selected, that is, when <b>InstanceChargeType</b> is set to <strong>POSTPAID_BY_HOUR</strong>, this parameter can only be set to 1.</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Instance payment method.</p><ul><li>PREPAID: Annual and monthly subscription.</li><li>POSTPAID_BY_HOUR: Pay-As-You-Go.</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.</p>
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * <p>Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.</p>
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * <p>Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.</p>
    */
    @SerializedName("MongosNum")
    @Expose
    private Long MongosNum;

    /**
    * <p>Refers to the number of ConfigServer CPU cores, value fixed at 1, unit: GB. This parameter can be left blank.</p>
    */
    @SerializedName("ConfigServerCpu")
    @Expose
    private Long ConfigServerCpu;

    /**
    * <p>Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.</p>
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * <p>Specifies the ConfigServer disk size. The value is fixed at 20. Unit: GB. This parameter can be left blank.</p>
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

    /**
    * <ul><li>Create a replica set instance. It refers to the read-only node quantity in each replica set.</li><li>Create a sharded cluster instance. It refers to the read-only node quantity in each shard.<br>Value range: [1,5].</li></ul>
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * <p>CPU size of the instance.</p><ul><li>Unit: C.</li><li>Value range: Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li><li>Note: You need to pass in the CPU core size corresponding to the memory when querying the price of a Common I Instance Type.</li></ul>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get <p>Region and AZ information of the instance. For details, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p> 
     * @return Zone <p>Region and AZ information of the instance. For details, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Region and AZ information of the instance. For details, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     * @param Zone <p>Region and AZ information of the instance. For details, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul> 
     * @return NodeNum <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul>
     * @param NodeNum <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Instance memory size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li></ul> 
     * @return Memory <p>Instance memory size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li></ul>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li></ul>
     * @param Memory <p>Instance memory size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li></ul>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance disk size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.</li></ul> 
     * @return Volume <p>Instance disk size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.</li></ul>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Instance disk size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.</li></ul>
     * @param Volume <p>Instance disk size.</p><ul><li>Unit: GB.</li><li>For the value range, call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The MinStorage and MaxStorage parameters in the returned data structure SpecItems correspond to the minimum and maximum disk specifications, respectively.</li></ul>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Instance version information. The <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API can be called to obtain specific supported versions. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported by instances. The corresponding relationship between version information and version number is as follows:</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger storage engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger storage engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger storage engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger storage engine version.</li></ul> 
     * @return MongoVersion <p>Instance version information. The <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API can be called to obtain specific supported versions. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported by instances. The corresponding relationship between version information and version number is as follows:</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger storage engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger storage engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger storage engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger storage engine version.</li></ul>
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set <p>Instance version information. The <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API can be called to obtain specific supported versions. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported by instances. The corresponding relationship between version information and version number is as follows:</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger storage engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger storage engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger storage engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger storage engine version.</li></ul>
     * @param MongoVersion <p>Instance version information. The <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API can be called to obtain specific supported versions. The MongoVersionCode parameter in the returned data structure SpecItems indicates the information on versions supported by instances. The corresponding relationship between version information and version number is as follows:</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger storage engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger storage engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger storage engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger storage engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger storage engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger storage engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger storage engine version.</li></ul>
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get <p>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud disk edition).</li></ul><p>Note: Allowlist specification types are under allowlist control. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p> 
     * @return MachineCode <p>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud disk edition).</li></ul><p>Note: Allowlist specification types are under allowlist control. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set <p>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud disk edition).</li></ul><p>Note: Allowlist specification types are under allowlist control. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     * @param MachineCode <p>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud disk edition).</li></ul><p>Note: Allowlist specification types are under allowlist control. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</p>
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get <p>Number of instances. Value range: [1,10].</p> 
     * @return GoodsNum <p>Number of instances. Value range: [1,10].</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Number of instances. Value range: [1,10].</p>
     * @param GoodsNum <p>Number of instances. Value range: [1,10].</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Instance type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul> 
     * @return ClusterType <p>Instance type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Instance type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     * @param ClusterType <p>Instance type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul> 
     * @return ReplicateSetNum <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul>
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul>
     * @param ReplicateSetNum <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul>
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get <ul><li>When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.<br>- When the pay-as-you-go mode is selected, that is, when <b>InstanceChargeType</b> is set to <strong>POSTPAID_BY_HOUR</strong>, this parameter can only be set to 1.</li></ul> 
     * @return Period <ul><li>When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.<br>- When the pay-as-you-go mode is selected, that is, when <b>InstanceChargeType</b> is set to <strong>POSTPAID_BY_HOUR</strong>, this parameter can only be set to 1.</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <ul><li>When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.<br>- When the pay-as-you-go mode is selected, that is, when <b>InstanceChargeType</b> is set to <strong>POSTPAID_BY_HOUR</strong>, this parameter can only be set to 1.</li></ul>
     * @param Period <ul><li>When the monthly subscription mode is selected, that is, when <b>InstanceChargeType</b> is set to <b>PREPAID</b>, this parameter is required for specifying the purchase duration of instances. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Unit: months.<br>- When the pay-as-you-go mode is selected, that is, when <b>InstanceChargeType</b> is set to <strong>POSTPAID_BY_HOUR</strong>, this parameter can only be set to 1.</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Instance payment method.</p><ul><li>PREPAID: Annual and monthly subscription.</li><li>POSTPAID_BY_HOUR: Pay-As-You-Go.</li></ul> 
     * @return InstanceChargeType <p>Instance payment method.</p><ul><li>PREPAID: Annual and monthly subscription.</li><li>POSTPAID_BY_HOUR: Pay-As-You-Go.</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance payment method.</p><ul><li>PREPAID: Annual and monthly subscription.</li><li>POSTPAID_BY_HOUR: Pay-As-You-Go.</li></ul>
     * @param InstanceChargeType <p>Instance payment method.</p><ul><li>PREPAID: Annual and monthly subscription.</li><li>POSTPAID_BY_HOUR: Pay-As-You-Go.</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.</p> 
     * @return MongosCpu <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.</p>
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.</p>
     * @param MongosCpu <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase. If this parameter is left blank, the default value 2 is used.</p>
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get <p>Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.</p> 
     * @return MongosMemory <p>Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.</p>
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.</p>
     * @param MongosMemory <p>Mongos node memory size. - This parameter is required during sharded cluster instance purchase. - Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores). If this parameter is left blank, the default value 4 is used.</p>
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.</p> 
     * @return MongosNum <p>Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.</p>
     */
    public Long getMongosNum() {
        return this.MongosNum;
    }

    /**
     * Set <p>Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.</p>
     * @param MongosNum <p>Specifies the number of Mongos nodes. Value range: [3,32]. For querying the price of sharded cluster instances, this parameter is required. If it is left blank, the default value 3 is used.</p>
     */
    public void setMongosNum(Long MongosNum) {
        this.MongosNum = MongosNum;
    }

    /**
     * Get <p>Refers to the number of ConfigServer CPU cores, value fixed at 1, unit: GB. This parameter can be left blank.</p> 
     * @return ConfigServerCpu <p>Refers to the number of ConfigServer CPU cores, value fixed at 1, unit: GB. This parameter can be left blank.</p>
     */
    public Long getConfigServerCpu() {
        return this.ConfigServerCpu;
    }

    /**
     * Set <p>Refers to the number of ConfigServer CPU cores, value fixed at 1, unit: GB. This parameter can be left blank.</p>
     * @param ConfigServerCpu <p>Refers to the number of ConfigServer CPU cores, value fixed at 1, unit: GB. This parameter can be left blank.</p>
     */
    public void setConfigServerCpu(Long ConfigServerCpu) {
        this.ConfigServerCpu = ConfigServerCpu;
    }

    /**
     * Get <p>Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.</p> 
     * @return ConfigServerMemory <p>Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.</p>
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set <p>Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.</p>
     * @param ConfigServerMemory <p>Specifies the ConfigServer memory size. The value is fixed as 2. Unit: GB. This parameter can be left blank.</p>
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get <p>Specifies the ConfigServer disk size. The value is fixed at 20. Unit: GB. This parameter can be left blank.</p> 
     * @return ConfigServerVolume <p>Specifies the ConfigServer disk size. The value is fixed at 20. Unit: GB. This parameter can be left blank.</p>
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set <p>Specifies the ConfigServer disk size. The value is fixed at 20. Unit: GB. This parameter can be left blank.</p>
     * @param ConfigServerVolume <p>Specifies the ConfigServer disk size. The value is fixed at 20. Unit: GB. This parameter can be left blank.</p>
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    /**
     * Get <ul><li>Create a replica set instance. It refers to the read-only node quantity in each replica set.</li><li>Create a sharded cluster instance. It refers to the read-only node quantity in each shard.<br>Value range: [1,5].</li></ul> 
     * @return ReadonlyNodeNum <ul><li>Create a replica set instance. It refers to the read-only node quantity in each replica set.</li><li>Create a sharded cluster instance. It refers to the read-only node quantity in each shard.<br>Value range: [1,5].</li></ul>
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set <ul><li>Create a replica set instance. It refers to the read-only node quantity in each replica set.</li><li>Create a sharded cluster instance. It refers to the read-only node quantity in each shard.<br>Value range: [1,5].</li></ul>
     * @param ReadonlyNodeNum <ul><li>Create a replica set instance. It refers to the read-only node quantity in each replica set.</li><li>Create a sharded cluster instance. It refers to the read-only node quantity in each shard.<br>Value range: [1,5].</li></ul>
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get <p>CPU size of the instance.</p><ul><li>Unit: C.</li><li>Value range: Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li><li>Note: You need to pass in the CPU core size corresponding to the memory when querying the price of a Common I Instance Type.</li></ul> 
     * @return Cpu <p>CPU size of the instance.</p><ul><li>Unit: C.</li><li>Value range: Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li><li>Note: You need to pass in the CPU core size corresponding to the memory when querying the price of a Common I Instance Type.</li></ul>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU size of the instance.</p><ul><li>Unit: C.</li><li>Value range: Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li><li>Note: You need to pass in the CPU core size corresponding to the memory when querying the price of a Common I Instance Type.</li></ul>
     * @param Cpu <p>CPU size of the instance.</p><ul><li>Unit: C.</li><li>Value range: Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API. The CPU and Memory parameters in the returned data structure SpecItems correspond to the number of CPU cores and the memory specifications, respectively.</li><li>Note: You need to pass in the CPU core size corresponding to the memory when querying the price of a Common I Instance Type.</li></ul>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
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
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
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
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

