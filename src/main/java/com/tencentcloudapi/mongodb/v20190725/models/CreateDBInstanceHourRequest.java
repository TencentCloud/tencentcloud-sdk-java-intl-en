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

public class CreateDBInstanceHourRequest extends AbstractModel {

    /**
    * <p>Instance memory size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable memory specifications.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance disk size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <ul><li>Specifies the number of replica sets during replica set instance creation. This parameter can only be 1.</li><li>Specifies the number of shards during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * <ul><li>Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each replica set.</li><li>Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum number of nodes supported for each shard.</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Refers to version information. For supported versions, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to query.</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger engine version.</li></ul>
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
    * <p>Number of instances. The minimum value is 1, and the maximum value is 30.</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>AZ information. The input format must be ap-guangzhou-2.</p><ul><li>For details, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to obtain them.</li><li>This parameter is the primary AZ. If multi-AZ deployment is used, Zone must be one of AvailabilityZoneList.</li></ul>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance architecture type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>VPC ID.</p><ul><li>Only supports configuration of private networks. A private network in the same region as the instance must be selected. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain a usable VPC ID.</li><li>After successful instance creation, VPC replacement is allowed. For detailed operations, see <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Changing the Network</a>.</li></ul>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID of the VPC.</p><ul><li>You must specify a subnet within the selected private network. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain the subnet ID.</li><li>After the instance is successfully created, replacement of the private network and subnet is allowed. For detailed operations, please refer to <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Network Change</a>.</li></ul>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance password. The requirements are as follows:</p><ul><li>Character count is [8,32].</li><li>Enter characters within [A,Z], [a,z], [0,9].</li><li>Special characters include: exclamation mark "!", at "@", pound sign "#", percent sign "%", caret "^", asterisk "*", brackets "()", underscore "_".</li><li>Cannot set a single letter or number.</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Project ID.</p><ul><li>If this parameter is not set, the default project is used.</li><li>You can obtain the project ID on the <a href="https://console.cloud.tencent.com/project">MongoDB console project management</a> page.</li></ul>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Instance tag information.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Instance type.</p><ul><li>1: Formal instance.</li><li>3: Read-only instance.</li><li>4: Disaster recovery instance.</li><li>5: Clone instance. Note: RestoreTime is a required item when you clone an instance.</li></ul>
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * <p>Parent instance ID.</p><ul><li>When the <strong>Clone</strong> parameter is 3 or 4, that is, the instance is read-only or a disaster recovery instance, this parameter must be configured.</li><li>Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the parent instance ID in the instance list.</li></ul>
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * <p>Security group ID. Log in to the <a href="https://console.cloud.tencent.com/vpc/security-group">security group console</a> to obtain the ID of the security group within the same region as the database instance.</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>Rollback time of the cloned instance.</p><ul><li>This parameter is required for cloned instances. Format: 2021-08-13 16:30:00.</li><li>Rollback time range: Only data within the last 7 days can be rolled back.</li></ul>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * <p>Instance name. Only Chinese, English, digits, underscores (_), and hyphens (-) are supported, with a maximum length of 128 characters. When purchasing database instances in batches, you can efficiently set instance names by using custom pattern strings and automatically ascending numeric suffixes.</p><ul><li>Basic mode: prefix + automatic ascending number (starting from 1 by default). Only a custom instance name prefix is required for <strong>lnstanceName</strong>. For example, it can be set to cmgo. If the purchase quantity is set to 5, after purchase, the instances will be sequentially named cmgo1, cmgo2, cmgo3, cmgo4, and cmgo5, respectively.</li><li>Custom starting number mode: prefix + {R:x} (x is the custom starting number). <strong>InstanceName</strong> requires "prefix{R:x}". For example, cmgo{R:3}. If the purchase quantity is set to 5, the instance names will be cmgo3, cmgo4, cmgo5, cmgo6, and cmgo7.</li><li>Composite pattern string: prefix1{R:x} + prefix2{R:y} + ⋯ + fixed suffix, where x and y are the starting numbers for each prefix. <strong>InstanceName</strong> requires a composite pattern string. For example, cmgo{R:10}_node{R:12}_db. If the batch purchase quantity is set to 5, the instance names will be cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, and cmgo14_node16_db.</li></ul>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>For cloud database instances in multi-AZ deployment, specify the availability zone list.</p><ul><li>For instances in multi-AZ deployment mode, the <strong>Zone</strong> parameter specifies the primary AZ, and <strong>AvailabilityZoneList</strong> specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].</li><li>Use the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to access cloud databases and obtain availability zone information planned for different regions, so that you can assign valid AZs.</li><li>Nodes in multi-AZ deployment can only be deployed in 3 different availability zones. Deploying most nodes of a cluster in the same availability zone is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same zone.</li></ul>
    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.</p>
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * <p>Mongos node memory size.</p><ul><li>This parameter is required during sharded cluster instance purchase.</li><li>Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores).</li></ul>
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * <p>Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.</p><ul><li>For single-AZ deployment instances, the quantity range is [3,32].</li><li>For instances deployed across multiple availability zones, the quantity range is [6,32].</li></ul>
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * <p>Number of read-only nodes. Value ranges from 0 to 5.</p>
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * <p>Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when <strong>ReadonlyNodeNum</strong> is not set to <strong>0</strong>.</p>
    */
    @SerializedName("ReadonlyNodeAvailabilityZoneList")
    @Expose
    private String [] ReadonlyNodeAvailabilityZoneList;

    /**
    * <p>Availability zone of the Hidden node. To deploy instances across availability zones, you must configure this parameter.</p>
    */
    @SerializedName("HiddenZone")
    @Expose
    private String HiddenZone;

    /**
    * <p>Parameter template ID.</p><ul><li>A parameter template is a collection of preset specific parameters applicable to quick configuration of new MongoDB instances. Proper use of parameter templates can effectively improve database deployment efficiency and operating performance.</li><li>The parameter template ID can be obtained through the <a href="https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1">DescribeDBInstanceParamTpl</a> API. Please select the parameter template ID corresponding to your instance version and architecture.</li></ul>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>Instance CPU core size. Unit: C. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable CPU specifications.<br>Note: CPU size must be set for common I Instance Type.</p>
    */
    @SerializedName("CpuCore")
    @Expose
    private Long CpuCore;

    /**
     * Get <p>Instance memory size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable memory specifications.</p> 
     * @return Memory <p>Instance memory size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable memory specifications.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable memory specifications.</p>
     * @param Memory <p>Instance memory size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable memory specifications.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance disk size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.</p> 
     * @return Volume <p>Instance disk size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Instance disk size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.</p>
     * @param Volume <p>Instance disk size. Unit: GB. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
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
     * Get <p>Refers to version information. For supported versions, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to query.</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger engine version.</li></ul> 
     * @return MongoVersion <p>Refers to version information. For supported versions, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to query.</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger engine version.</li></ul>
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set <p>Refers to version information. For supported versions, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to query.</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger engine version.</li></ul>
     * @param MongoVersion <p>Refers to version information. For supported versions, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to query.</p><ul><li>MONGO_40_WT: MongoDB 4.0 WiredTiger engine version.</li><li>MONGO_42_WT: MongoDB 4.2 WiredTiger engine version.</li><li>MONGO_44_WT: MongoDB 4.4 WiredTiger engine version.</li><li>MONGO_50_WT: MongoDB 5.0 WiredTiger engine version.</li><li>MONGO_60_WT: MongoDB 6.0 WiredTiger engine version.</li><li>MONGO_70_WT: MongoDB 7.0 WiredTiger engine version.</li><li>MONGO_80_WT: MongoDB 8.0 WiredTiger engine version.</li></ul>
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
     * Get <p>Number of instances. The minimum value is 1, and the maximum value is 30.</p> 
     * @return GoodsNum <p>Number of instances. The minimum value is 1, and the maximum value is 30.</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Number of instances. The minimum value is 1, and the maximum value is 30.</p>
     * @param GoodsNum <p>Number of instances. The minimum value is 1, and the maximum value is 30.</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>AZ information. The input format must be ap-guangzhou-2.</p><ul><li>For details, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to obtain them.</li><li>This parameter is the primary AZ. If multi-AZ deployment is used, Zone must be one of AvailabilityZoneList.</li></ul> 
     * @return Zone <p>AZ information. The input format must be ap-guangzhou-2.</p><ul><li>For details, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to obtain them.</li><li>This parameter is the primary AZ. If multi-AZ deployment is used, Zone must be one of AvailabilityZoneList.</li></ul>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ information. The input format must be ap-guangzhou-2.</p><ul><li>For details, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to obtain them.</li><li>This parameter is the primary AZ. If multi-AZ deployment is used, Zone must be one of AvailabilityZoneList.</li></ul>
     * @param Zone <p>AZ information. The input format must be ap-guangzhou-2.</p><ul><li>For details, use the interface <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> to obtain them.</li><li>This parameter is the primary AZ. If multi-AZ deployment is used, Zone must be one of AvailabilityZoneList.</li></ul>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance architecture type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul> 
     * @return ClusterType <p>Instance architecture type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Instance architecture type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     * @param ClusterType <p>Instance architecture type.</p><ul><li>REPLSET (replica set)</li><li>SHARD (sharded cluster)</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>VPC ID.</p><ul><li>Only supports configuration of private networks. A private network in the same region as the instance must be selected. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain a usable VPC ID.</li><li>After successful instance creation, VPC replacement is allowed. For detailed operations, see <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Changing the Network</a>.</li></ul> 
     * @return VpcId <p>VPC ID.</p><ul><li>Only supports configuration of private networks. A private network in the same region as the instance must be selected. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain a usable VPC ID.</li><li>After successful instance creation, VPC replacement is allowed. For detailed operations, see <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Changing the Network</a>.</li></ul>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID.</p><ul><li>Only supports configuration of private networks. A private network in the same region as the instance must be selected. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain a usable VPC ID.</li><li>After successful instance creation, VPC replacement is allowed. For detailed operations, see <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Changing the Network</a>.</li></ul>
     * @param VpcId <p>VPC ID.</p><ul><li>Only supports configuration of private networks. A private network in the same region as the instance must be selected. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain a usable VPC ID.</li><li>After successful instance creation, VPC replacement is allowed. For detailed operations, see <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Changing the Network</a>.</li></ul>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID of the VPC.</p><ul><li>You must specify a subnet within the selected private network. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain the subnet ID.</li><li>After the instance is successfully created, replacement of the private network and subnet is allowed. For detailed operations, please refer to <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Network Change</a>.</li></ul> 
     * @return SubnetId <p>Subnet ID of the VPC.</p><ul><li>You must specify a subnet within the selected private network. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain the subnet ID.</li><li>After the instance is successfully created, replacement of the private network and subnet is allowed. For detailed operations, please refer to <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Network Change</a>.</li></ul>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID of the VPC.</p><ul><li>You must specify a subnet within the selected private network. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain the subnet ID.</li><li>After the instance is successfully created, replacement of the private network and subnet is allowed. For detailed operations, please refer to <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Network Change</a>.</li></ul>
     * @param SubnetId <p>Subnet ID of the VPC.</p><ul><li>You must specify a subnet within the selected private network. Log in to the <a href="https://console.cloud.tencent.com/vpc">VPC console</a> to obtain the subnet ID.</li><li>After the instance is successfully created, replacement of the private network and subnet is allowed. For detailed operations, please refer to <a href="https://www.tencentcloud.com/document/product/239/30910?from_cn_redirect=1">Network Change</a>.</li></ul>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance password. The requirements are as follows:</p><ul><li>Character count is [8,32].</li><li>Enter characters within [A,Z], [a,z], [0,9].</li><li>Special characters include: exclamation mark "!", at "@", pound sign "#", percent sign "%", caret "^", asterisk "*", brackets "()", underscore "_".</li><li>Cannot set a single letter or number.</li></ul> 
     * @return Password <p>Instance password. The requirements are as follows:</p><ul><li>Character count is [8,32].</li><li>Enter characters within [A,Z], [a,z], [0,9].</li><li>Special characters include: exclamation mark "!", at "@", pound sign "#", percent sign "%", caret "^", asterisk "*", brackets "()", underscore "_".</li><li>Cannot set a single letter or number.</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Instance password. The requirements are as follows:</p><ul><li>Character count is [8,32].</li><li>Enter characters within [A,Z], [a,z], [0,9].</li><li>Special characters include: exclamation mark "!", at "@", pound sign "#", percent sign "%", caret "^", asterisk "*", brackets "()", underscore "_".</li><li>Cannot set a single letter or number.</li></ul>
     * @param Password <p>Instance password. The requirements are as follows:</p><ul><li>Character count is [8,32].</li><li>Enter characters within [A,Z], [a,z], [0,9].</li><li>Special characters include: exclamation mark "!", at "@", pound sign "#", percent sign "%", caret "^", asterisk "*", brackets "()", underscore "_".</li><li>Cannot set a single letter or number.</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Project ID.</p><ul><li>If this parameter is not set, the default project is used.</li><li>You can obtain the project ID on the <a href="https://console.cloud.tencent.com/project">MongoDB console project management</a> page.</li></ul> 
     * @return ProjectId <p>Project ID.</p><ul><li>If this parameter is not set, the default project is used.</li><li>You can obtain the project ID on the <a href="https://console.cloud.tencent.com/project">MongoDB console project management</a> page.</li></ul>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p><ul><li>If this parameter is not set, the default project is used.</li><li>You can obtain the project ID on the <a href="https://console.cloud.tencent.com/project">MongoDB console project management</a> page.</li></ul>
     * @param ProjectId <p>Project ID.</p><ul><li>If this parameter is not set, the default project is used.</li><li>You can obtain the project ID on the <a href="https://console.cloud.tencent.com/project">MongoDB console project management</a> page.</li></ul>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Instance tag information.</p> 
     * @return Tags <p>Instance tag information.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Instance tag information.</p>
     * @param Tags <p>Instance tag information.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Instance type.</p><ul><li>1: Formal instance.</li><li>3: Read-only instance.</li><li>4: Disaster recovery instance.</li><li>5: Clone instance. Note: RestoreTime is a required item when you clone an instance.</li></ul> 
     * @return Clone <p>Instance type.</p><ul><li>1: Formal instance.</li><li>3: Read-only instance.</li><li>4: Disaster recovery instance.</li><li>5: Clone instance. Note: RestoreTime is a required item when you clone an instance.</li></ul>
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set <p>Instance type.</p><ul><li>1: Formal instance.</li><li>3: Read-only instance.</li><li>4: Disaster recovery instance.</li><li>5: Clone instance. Note: RestoreTime is a required item when you clone an instance.</li></ul>
     * @param Clone <p>Instance type.</p><ul><li>1: Formal instance.</li><li>3: Read-only instance.</li><li>4: Disaster recovery instance.</li><li>5: Clone instance. Note: RestoreTime is a required item when you clone an instance.</li></ul>
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get <p>Parent instance ID.</p><ul><li>When the <strong>Clone</strong> parameter is 3 or 4, that is, the instance is read-only or a disaster recovery instance, this parameter must be configured.</li><li>Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the parent instance ID in the instance list.</li></ul> 
     * @return Father <p>Parent instance ID.</p><ul><li>When the <strong>Clone</strong> parameter is 3 or 4, that is, the instance is read-only or a disaster recovery instance, this parameter must be configured.</li><li>Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the parent instance ID in the instance list.</li></ul>
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set <p>Parent instance ID.</p><ul><li>When the <strong>Clone</strong> parameter is 3 or 4, that is, the instance is read-only or a disaster recovery instance, this parameter must be configured.</li><li>Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the parent instance ID in the instance list.</li></ul>
     * @param Father <p>Parent instance ID.</p><ul><li>When the <strong>Clone</strong> parameter is 3 or 4, that is, the instance is read-only or a disaster recovery instance, this parameter must be configured.</li><li>Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the parent instance ID in the instance list.</li></ul>
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get <p>Security group ID. Log in to the <a href="https://console.cloud.tencent.com/vpc/security-group">security group console</a> to obtain the ID of the security group within the same region as the database instance.</p> 
     * @return SecurityGroup <p>Security group ID. Log in to the <a href="https://console.cloud.tencent.com/vpc/security-group">security group console</a> to obtain the ID of the security group within the same region as the database instance.</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>Security group ID. Log in to the <a href="https://console.cloud.tencent.com/vpc/security-group">security group console</a> to obtain the ID of the security group within the same region as the database instance.</p>
     * @param SecurityGroup <p>Security group ID. Log in to the <a href="https://console.cloud.tencent.com/vpc/security-group">security group console</a> to obtain the ID of the security group within the same region as the database instance.</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>Rollback time of the cloned instance.</p><ul><li>This parameter is required for cloned instances. Format: 2021-08-13 16:30:00.</li><li>Rollback time range: Only data within the last 7 days can be rolled back.</li></ul> 
     * @return RestoreTime <p>Rollback time of the cloned instance.</p><ul><li>This parameter is required for cloned instances. Format: 2021-08-13 16:30:00.</li><li>Rollback time range: Only data within the last 7 days can be rolled back.</li></ul>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>Rollback time of the cloned instance.</p><ul><li>This parameter is required for cloned instances. Format: 2021-08-13 16:30:00.</li><li>Rollback time range: Only data within the last 7 days can be rolled back.</li></ul>
     * @param RestoreTime <p>Rollback time of the cloned instance.</p><ul><li>This parameter is required for cloned instances. Format: 2021-08-13 16:30:00.</li><li>Rollback time range: Only data within the last 7 days can be rolled back.</li></ul>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get <p>Instance name. Only Chinese, English, digits, underscores (_), and hyphens (-) are supported, with a maximum length of 128 characters. When purchasing database instances in batches, you can efficiently set instance names by using custom pattern strings and automatically ascending numeric suffixes.</p><ul><li>Basic mode: prefix + automatic ascending number (starting from 1 by default). Only a custom instance name prefix is required for <strong>lnstanceName</strong>. For example, it can be set to cmgo. If the purchase quantity is set to 5, after purchase, the instances will be sequentially named cmgo1, cmgo2, cmgo3, cmgo4, and cmgo5, respectively.</li><li>Custom starting number mode: prefix + {R:x} (x is the custom starting number). <strong>InstanceName</strong> requires "prefix{R:x}". For example, cmgo{R:3}. If the purchase quantity is set to 5, the instance names will be cmgo3, cmgo4, cmgo5, cmgo6, and cmgo7.</li><li>Composite pattern string: prefix1{R:x} + prefix2{R:y} + ⋯ + fixed suffix, where x and y are the starting numbers for each prefix. <strong>InstanceName</strong> requires a composite pattern string. For example, cmgo{R:10}_node{R:12}_db. If the batch purchase quantity is set to 5, the instance names will be cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, and cmgo14_node16_db.</li></ul> 
     * @return InstanceName <p>Instance name. Only Chinese, English, digits, underscores (_), and hyphens (-) are supported, with a maximum length of 128 characters. When purchasing database instances in batches, you can efficiently set instance names by using custom pattern strings and automatically ascending numeric suffixes.</p><ul><li>Basic mode: prefix + automatic ascending number (starting from 1 by default). Only a custom instance name prefix is required for <strong>lnstanceName</strong>. For example, it can be set to cmgo. If the purchase quantity is set to 5, after purchase, the instances will be sequentially named cmgo1, cmgo2, cmgo3, cmgo4, and cmgo5, respectively.</li><li>Custom starting number mode: prefix + {R:x} (x is the custom starting number). <strong>InstanceName</strong> requires "prefix{R:x}". For example, cmgo{R:3}. If the purchase quantity is set to 5, the instance names will be cmgo3, cmgo4, cmgo5, cmgo6, and cmgo7.</li><li>Composite pattern string: prefix1{R:x} + prefix2{R:y} + ⋯ + fixed suffix, where x and y are the starting numbers for each prefix. <strong>InstanceName</strong> requires a composite pattern string. For example, cmgo{R:10}_node{R:12}_db. If the batch purchase quantity is set to 5, the instance names will be cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, and cmgo14_node16_db.</li></ul>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name. Only Chinese, English, digits, underscores (_), and hyphens (-) are supported, with a maximum length of 128 characters. When purchasing database instances in batches, you can efficiently set instance names by using custom pattern strings and automatically ascending numeric suffixes.</p><ul><li>Basic mode: prefix + automatic ascending number (starting from 1 by default). Only a custom instance name prefix is required for <strong>lnstanceName</strong>. For example, it can be set to cmgo. If the purchase quantity is set to 5, after purchase, the instances will be sequentially named cmgo1, cmgo2, cmgo3, cmgo4, and cmgo5, respectively.</li><li>Custom starting number mode: prefix + {R:x} (x is the custom starting number). <strong>InstanceName</strong> requires "prefix{R:x}". For example, cmgo{R:3}. If the purchase quantity is set to 5, the instance names will be cmgo3, cmgo4, cmgo5, cmgo6, and cmgo7.</li><li>Composite pattern string: prefix1{R:x} + prefix2{R:y} + ⋯ + fixed suffix, where x and y are the starting numbers for each prefix. <strong>InstanceName</strong> requires a composite pattern string. For example, cmgo{R:10}_node{R:12}_db. If the batch purchase quantity is set to 5, the instance names will be cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, and cmgo14_node16_db.</li></ul>
     * @param InstanceName <p>Instance name. Only Chinese, English, digits, underscores (_), and hyphens (-) are supported, with a maximum length of 128 characters. When purchasing database instances in batches, you can efficiently set instance names by using custom pattern strings and automatically ascending numeric suffixes.</p><ul><li>Basic mode: prefix + automatic ascending number (starting from 1 by default). Only a custom instance name prefix is required for <strong>lnstanceName</strong>. For example, it can be set to cmgo. If the purchase quantity is set to 5, after purchase, the instances will be sequentially named cmgo1, cmgo2, cmgo3, cmgo4, and cmgo5, respectively.</li><li>Custom starting number mode: prefix + {R:x} (x is the custom starting number). <strong>InstanceName</strong> requires "prefix{R:x}". For example, cmgo{R:3}. If the purchase quantity is set to 5, the instance names will be cmgo3, cmgo4, cmgo5, cmgo6, and cmgo7.</li><li>Composite pattern string: prefix1{R:x} + prefix2{R:y} + ⋯ + fixed suffix, where x and y are the starting numbers for each prefix. <strong>InstanceName</strong> requires a composite pattern string. For example, cmgo{R:10}_node{R:12}_db. If the batch purchase quantity is set to 5, the instance names will be cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, and cmgo14_node16_db.</li></ul>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>For cloud database instances in multi-AZ deployment, specify the availability zone list.</p><ul><li>For instances in multi-AZ deployment mode, the <strong>Zone</strong> parameter specifies the primary AZ, and <strong>AvailabilityZoneList</strong> specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].</li><li>Use the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to access cloud databases and obtain availability zone information planned for different regions, so that you can assign valid AZs.</li><li>Nodes in multi-AZ deployment can only be deployed in 3 different availability zones. Deploying most nodes of a cluster in the same availability zone is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same zone.</li></ul> 
     * @return AvailabilityZoneList <p>For cloud database instances in multi-AZ deployment, specify the availability zone list.</p><ul><li>For instances in multi-AZ deployment mode, the <strong>Zone</strong> parameter specifies the primary AZ, and <strong>AvailabilityZoneList</strong> specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].</li><li>Use the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to access cloud databases and obtain availability zone information planned for different regions, so that you can assign valid AZs.</li><li>Nodes in multi-AZ deployment can only be deployed in 3 different availability zones. Deploying most nodes of a cluster in the same availability zone is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same zone.</li></ul>
     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set <p>For cloud database instances in multi-AZ deployment, specify the availability zone list.</p><ul><li>For instances in multi-AZ deployment mode, the <strong>Zone</strong> parameter specifies the primary AZ, and <strong>AvailabilityZoneList</strong> specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].</li><li>Use the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to access cloud databases and obtain availability zone information planned for different regions, so that you can assign valid AZs.</li><li>Nodes in multi-AZ deployment can only be deployed in 3 different availability zones. Deploying most nodes of a cluster in the same availability zone is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same zone.</li></ul>
     * @param AvailabilityZoneList <p>For cloud database instances in multi-AZ deployment, specify the availability zone list.</p><ul><li>For instances in multi-AZ deployment mode, the <strong>Zone</strong> parameter specifies the primary AZ, and <strong>AvailabilityZoneList</strong> specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].</li><li>Use the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to access cloud databases and obtain availability zone information planned for different regions, so that you can assign valid AZs.</li><li>Nodes in multi-AZ deployment can only be deployed in 3 different availability zones. Deploying most nodes of a cluster in the same availability zone is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same zone.</li></ul>
     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.</p> 
     * @return MongosCpu <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.</p>
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.</p>
     * @param MongosCpu <p>Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.</p>
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get <p>Mongos node memory size.</p><ul><li>This parameter is required during sharded cluster instance purchase.</li><li>Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores).</li></ul> 
     * @return MongosMemory <p>Mongos node memory size.</p><ul><li>This parameter is required during sharded cluster instance purchase.</li><li>Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores).</li></ul>
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>Mongos node memory size.</p><ul><li>This parameter is required during sharded cluster instance purchase.</li><li>Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores).</li></ul>
     * @param MongosMemory <p>Mongos node memory size.</p><ul><li>This parameter is required during sharded cluster instance purchase.</li><li>Unit: GB. Valid values: 2 (for 1 core), 4 (for 2 cores), 8 (for 4 cores), 16 (for 8 cores), and 32 (for 16 cores).</li></ul>
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.</p><ul><li>For single-AZ deployment instances, the quantity range is [3,32].</li><li>For instances deployed across multiple availability zones, the quantity range is [6,32].</li></ul> 
     * @return MongosNodeNum <p>Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.</p><ul><li>For single-AZ deployment instances, the quantity range is [3,32].</li><li>For instances deployed across multiple availability zones, the quantity range is [6,32].</li></ul>
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set <p>Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.</p><ul><li>For single-AZ deployment instances, the quantity range is [3,32].</li><li>For instances deployed across multiple availability zones, the quantity range is [6,32].</li></ul>
     * @param MongosNodeNum <p>Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.</p><ul><li>For single-AZ deployment instances, the quantity range is [3,32].</li><li>For instances deployed across multiple availability zones, the quantity range is [6,32].</li></ul>
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get <p>Number of read-only nodes. Value ranges from 0 to 5.</p> 
     * @return ReadonlyNodeNum <p>Number of read-only nodes. Value ranges from 0 to 5.</p>
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set <p>Number of read-only nodes. Value ranges from 0 to 5.</p>
     * @param ReadonlyNodeNum <p>Number of read-only nodes. Value ranges from 0 to 5.</p>
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get <p>Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when <strong>ReadonlyNodeNum</strong> is not set to <strong>0</strong>.</p> 
     * @return ReadonlyNodeAvailabilityZoneList <p>Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when <strong>ReadonlyNodeNum</strong> is not set to <strong>0</strong>.</p>
     */
    public String [] getReadonlyNodeAvailabilityZoneList() {
        return this.ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Set <p>Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when <strong>ReadonlyNodeNum</strong> is not set to <strong>0</strong>.</p>
     * @param ReadonlyNodeAvailabilityZoneList <p>Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when <strong>ReadonlyNodeNum</strong> is not set to <strong>0</strong>.</p>
     */
    public void setReadonlyNodeAvailabilityZoneList(String [] ReadonlyNodeAvailabilityZoneList) {
        this.ReadonlyNodeAvailabilityZoneList = ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Get <p>Availability zone of the Hidden node. To deploy instances across availability zones, you must configure this parameter.</p> 
     * @return HiddenZone <p>Availability zone of the Hidden node. To deploy instances across availability zones, you must configure this parameter.</p>
     */
    public String getHiddenZone() {
        return this.HiddenZone;
    }

    /**
     * Set <p>Availability zone of the Hidden node. To deploy instances across availability zones, you must configure this parameter.</p>
     * @param HiddenZone <p>Availability zone of the Hidden node. To deploy instances across availability zones, you must configure this parameter.</p>
     */
    public void setHiddenZone(String HiddenZone) {
        this.HiddenZone = HiddenZone;
    }

    /**
     * Get <p>Parameter template ID.</p><ul><li>A parameter template is a collection of preset specific parameters applicable to quick configuration of new MongoDB instances. Proper use of parameter templates can effectively improve database deployment efficiency and operating performance.</li><li>The parameter template ID can be obtained through the <a href="https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1">DescribeDBInstanceParamTpl</a> API. Please select the parameter template ID corresponding to your instance version and architecture.</li></ul> 
     * @return ParamTemplateId <p>Parameter template ID.</p><ul><li>A parameter template is a collection of preset specific parameters applicable to quick configuration of new MongoDB instances. Proper use of parameter templates can effectively improve database deployment efficiency and operating performance.</li><li>The parameter template ID can be obtained through the <a href="https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1">DescribeDBInstanceParamTpl</a> API. Please select the parameter template ID corresponding to your instance version and architecture.</li></ul>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template ID.</p><ul><li>A parameter template is a collection of preset specific parameters applicable to quick configuration of new MongoDB instances. Proper use of parameter templates can effectively improve database deployment efficiency and operating performance.</li><li>The parameter template ID can be obtained through the <a href="https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1">DescribeDBInstanceParamTpl</a> API. Please select the parameter template ID corresponding to your instance version and architecture.</li></ul>
     * @param ParamTemplateId <p>Parameter template ID.</p><ul><li>A parameter template is a collection of preset specific parameters applicable to quick configuration of new MongoDB instances. Proper use of parameter templates can effectively improve database deployment efficiency and operating performance.</li><li>The parameter template ID can be obtained through the <a href="https://www.tencentcloud.com/document/product/240/109155?from_cn_redirect=1">DescribeDBInstanceParamTpl</a> API. Please select the parameter template ID corresponding to your instance version and architecture.</li></ul>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Instance CPU core size. Unit: C. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable CPU specifications.<br>Note: CPU size must be set for common I Instance Type.</p> 
     * @return CpuCore <p>Instance CPU core size. Unit: C. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable CPU specifications.<br>Note: CPU size must be set for common I Instance Type.</p>
     */
    public Long getCpuCore() {
        return this.CpuCore;
    }

    /**
     * Set <p>Instance CPU core size. Unit: C. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable CPU specifications.<br>Note: CPU size must be set for common I Instance Type.</p>
     * @param CpuCore <p>Instance CPU core size. Unit: C. Call the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API to obtain specific saleable CPU specifications.<br>Note: CPU size must be set for common I Instance Type.</p>
     */
    public void setCpuCore(Long CpuCore) {
        this.CpuCore = CpuCore;
    }

    public CreateDBInstanceHourRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceHourRequest(CreateDBInstanceHourRequest source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Clone != null) {
            this.Clone = new Long(source.Clone);
        }
        if (source.Father != null) {
            this.Father = new String(source.Father);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AvailabilityZoneList != null) {
            this.AvailabilityZoneList = new String[source.AvailabilityZoneList.length];
            for (int i = 0; i < source.AvailabilityZoneList.length; i++) {
                this.AvailabilityZoneList[i] = new String(source.AvailabilityZoneList[i]);
            }
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNodeNum != null) {
            this.MongosNodeNum = new Long(source.MongosNodeNum);
        }
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
        if (source.ReadonlyNodeAvailabilityZoneList != null) {
            this.ReadonlyNodeAvailabilityZoneList = new String[source.ReadonlyNodeAvailabilityZoneList.length];
            for (int i = 0; i < source.ReadonlyNodeAvailabilityZoneList.length; i++) {
                this.ReadonlyNodeAvailabilityZoneList[i] = new String(source.ReadonlyNodeAvailabilityZoneList[i]);
            }
        }
        if (source.HiddenZone != null) {
            this.HiddenZone = new String(source.HiddenZone);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.CpuCore != null) {
            this.CpuCore = new Long(source.CpuCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Clone", this.Clone);
        this.setParamSimple(map, prefix + "Father", this.Father);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "AvailabilityZoneList.", this.AvailabilityZoneList);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNodeNum", this.MongosNodeNum);
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);
        this.setParamArraySimple(map, prefix + "ReadonlyNodeAvailabilityZoneList.", this.ReadonlyNodeAvailabilityZoneList);
        this.setParamSimple(map, prefix + "HiddenZone", this.HiddenZone);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "CpuCore", this.CpuCore);

    }
}

