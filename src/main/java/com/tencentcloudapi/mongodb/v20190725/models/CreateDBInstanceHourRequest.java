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
    * Instance memory size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain specific saleable memory specifications.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    *  - Specifies the number of replica sets during replica set instance creation. This parameter can only be set to 1.
 - Specifies the number of shards during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to query the range of shard quantity. The parameters MinReplicateSetNum and MaxReplicateSetNum in the returned data structure SpecItems correspond to the minimum value and maximum value, respectively.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    *  - Specifies the number of primary and secondary nodes for each replica set during replica set instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each replica set.
 - Specifies the number of primary and secondary nodes for each shard during sharded cluster instance creation. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum number of nodes supported for each shard.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Information on the specific supported versions. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain such versions.
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
 - HCD: cloud disk type.
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * Number of instances. Value range: 1-10.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * AZ information in the format of ap-guangzhou-2
- For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance architecture type
- REPLSET: Replica set
- SHARD: Sharded cluster
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * VPC ID. Log in to the [VPC console](https://console.cloud.tencent.com/vpc) to query the correct ID. Example value: vpc-pxyzim13.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet. Log in to the [VPC console](https://console.cloud.tencent.com/VPC) to query the subnet list and confirm the correct ID. Example value: subnet-7jbabche.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance password. The requirements are as follows:
 - The number of characters should be in the range of [8, 32].
 - Characters within the ranges [A,Z], [a,z], and [0,9] are allowed.
 - Special characters that can be entered include exclamation marks (!), at signs (@), number signs (#), percent signs (%), carets (^), asterisks (\*), brackets (()), and underscores (_).
 - It cannot contain only the same letters or digits.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Project ID. - The default project is used if this parameter is not specified.
 - The project ID can be obtained on the [project management page in the TencentDB for MongoDB console](https://console.cloud.tencent.com/project).
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance tag information
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Instance type. 1: formal instance; 3: read-only instance; 4: disaster recovery instance; 5: cloned instance. Note: For a cloned instance, RestoreTime is required.
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * Parent instance ID. It is required if the `Clone` is `3` or `4`, that is, read-only instance or disaster recovery instance
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * Security group ID.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Rollback time of the cloned instance
- This parameter is required for a cloned instance in the format of 2021-08-13 16:30:00.
- Time range for rollback: You can roll back data in the last 7 days.
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * Instance name, which can contain up to 60 letters, digits, and symbols (_-).
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Specifies the list of AZs during multi-AZ deployment of TencentDB for MongoDB instances.
 - For instances in multi-AZ deployment mode, the **Zone** parameter specifies the primary AZ, and **AvailabilityZoneList** specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].
 - The [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API can be called to obtain AZs planned for TencentDB for MongoDB instances in different regions, helping you specify valid AZs.
 - Nodes in multi-AZ deployment mode can only be deployed in 3 different AZs. Deploying most nodes of a cluster in the same AZ is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same AZ.

    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.

    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * Mongos node memory size.
 - This parameter is required during sharded cluster instance purchase.
 - Unit: GB. 1-core 2GB, 2-core 4GB, 4-core 8GB, 8-core 16GB, and 16-core 32GB are supported.


    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.
 - For instances in single-AZ deployment mode, the value range is [3,32].
 - For instances in multi-AZ deployment mode, the value range is [6,32].
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * Number of read-only nodes. Value ranges: [0,5].
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when **ReadonlyNodeNum** is not set to **0**.
    */
    @SerializedName("ReadonlyNodeAvailabilityZoneList")
    @Expose
    private String [] ReadonlyNodeAvailabilityZoneList;

    /**
    * AZ where the hidden node resides, which is required in cross-AZ instance deployment.
    */
    @SerializedName("HiddenZone")
    @Expose
    private String HiddenZone;

    /**
    * Parameter template ID. A parameter template is a collection of MongoDB parameters with preset values. You can save a group of parameters and values with the same requirements as a template. When you create an instance, you can directly reference these parameter values in the instance. Proper use of parameter templates can improve the efficiency of operations on TencentDB for MongoDB databases. The template list can be obtained by calling the DescribeDBInstanceParamTpl API. Pay attention to the database versions supported by templates.
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
     * Get Instance memory size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain specific saleable memory specifications. 
     * @return Memory Instance memory size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain specific saleable memory specifications.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain specific saleable memory specifications.
     * @param Memory Instance memory size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain specific saleable memory specifications.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum disk sizes corresponding to each CPU specification. 
     * @return Volume Instance disk size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.
     * @param Volume Instance disk size. Unit: GB. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain the maximum and minimum disk sizes corresponding to each CPU specification.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
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
     * Get Information on the specific supported versions. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain such versions.
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine. 
     * @return MongoVersion Information on the specific supported versions. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain such versions.
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
     * Set Information on the specific supported versions. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain such versions.
 - MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
 - MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
 - MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
 - MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
 - MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
 - MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
     * @param MongoVersion Information on the specific supported versions. Call the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API to obtain such versions.
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
 - HCD: cloud disk type. 
     * @return MachineCode Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     * @param MachineCode Product specification type.
 - HIO10G: general high-I/O 10GE type.
 - HCD: cloud disk type.
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get Number of instances. Value range: 1-10. 
     * @return GoodsNum Number of instances. Value range: 1-10.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Value range: 1-10.
     * @param GoodsNum Number of instances. Value range: 1-10.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get AZ information in the format of ap-guangzhou-2
- For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`. 
     * @return Zone AZ information in the format of ap-guangzhou-2
- For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information in the format of ap-guangzhou-2
- For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     * @param Zone AZ information in the format of ap-guangzhou-2
- For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance architecture type
- REPLSET: Replica set
- SHARD: Sharded cluster 
     * @return ClusterType Instance architecture type
- REPLSET: Replica set
- SHARD: Sharded cluster
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Instance architecture type
- REPLSET: Replica set
- SHARD: Sharded cluster
     * @param ClusterType Instance architecture type
- REPLSET: Replica set
- SHARD: Sharded cluster
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get VPC ID. Log in to the [VPC console](https://console.cloud.tencent.com/vpc) to query the correct ID. Example value: vpc-pxyzim13. 
     * @return VpcId VPC ID. Log in to the [VPC console](https://console.cloud.tencent.com/vpc) to query the correct ID. Example value: vpc-pxyzim13.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. Log in to the [VPC console](https://console.cloud.tencent.com/vpc) to query the correct ID. Example value: vpc-pxyzim13.
     * @param VpcId VPC ID. Log in to the [VPC console](https://console.cloud.tencent.com/vpc) to query the correct ID. Example value: vpc-pxyzim13.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet. Log in to the [VPC console](https://console.cloud.tencent.com/VPC) to query the subnet list and confirm the correct ID. Example value: subnet-7jbabche. 
     * @return SubnetId VPC subnet. Log in to the [VPC console](https://console.cloud.tencent.com/VPC) to query the subnet list and confirm the correct ID. Example value: subnet-7jbabche.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet. Log in to the [VPC console](https://console.cloud.tencent.com/VPC) to query the subnet list and confirm the correct ID. Example value: subnet-7jbabche.
     * @param SubnetId VPC subnet. Log in to the [VPC console](https://console.cloud.tencent.com/VPC) to query the subnet list and confirm the correct ID. Example value: subnet-7jbabche.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance password. The requirements are as follows:
 - The number of characters should be in the range of [8, 32].
 - Characters within the ranges [A,Z], [a,z], and [0,9] are allowed.
 - Special characters that can be entered include exclamation marks (!), at signs (@), number signs (#), percent signs (%), carets (^), asterisks (\*), brackets (()), and underscores (_).
 - It cannot contain only the same letters or digits. 
     * @return Password Instance password. The requirements are as follows:
 - The number of characters should be in the range of [8, 32].
 - Characters within the ranges [A,Z], [a,z], and [0,9] are allowed.
 - Special characters that can be entered include exclamation marks (!), at signs (@), number signs (#), percent signs (%), carets (^), asterisks (\*), brackets (()), and underscores (_).
 - It cannot contain only the same letters or digits.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password. The requirements are as follows:
 - The number of characters should be in the range of [8, 32].
 - Characters within the ranges [A,Z], [a,z], and [0,9] are allowed.
 - Special characters that can be entered include exclamation marks (!), at signs (@), number signs (#), percent signs (%), carets (^), asterisks (\*), brackets (()), and underscores (_).
 - It cannot contain only the same letters or digits.
     * @param Password Instance password. The requirements are as follows:
 - The number of characters should be in the range of [8, 32].
 - Characters within the ranges [A,Z], [a,z], and [0,9] are allowed.
 - Special characters that can be entered include exclamation marks (!), at signs (@), number signs (#), percent signs (%), carets (^), asterisks (\*), brackets (()), and underscores (_).
 - It cannot contain only the same letters or digits.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Project ID. - The default project is used if this parameter is not specified.
 - The project ID can be obtained on the [project management page in the TencentDB for MongoDB console](https://console.cloud.tencent.com/project). 
     * @return ProjectId Project ID. - The default project is used if this parameter is not specified.
 - The project ID can be obtained on the [project management page in the TencentDB for MongoDB console](https://console.cloud.tencent.com/project).
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. - The default project is used if this parameter is not specified.
 - The project ID can be obtained on the [project management page in the TencentDB for MongoDB console](https://console.cloud.tencent.com/project).
     * @param ProjectId Project ID. - The default project is used if this parameter is not specified.
 - The project ID can be obtained on the [project management page in the TencentDB for MongoDB console](https://console.cloud.tencent.com/project).
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance tag information 
     * @return Tags Instance tag information
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance tag information
     * @param Tags Instance tag information
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance type. 1: formal instance; 3: read-only instance; 4: disaster recovery instance; 5: cloned instance. Note: For a cloned instance, RestoreTime is required. 
     * @return Clone Instance type. 1: formal instance; 3: read-only instance; 4: disaster recovery instance; 5: cloned instance. Note: For a cloned instance, RestoreTime is required.
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set Instance type. 1: formal instance; 3: read-only instance; 4: disaster recovery instance; 5: cloned instance. Note: For a cloned instance, RestoreTime is required.
     * @param Clone Instance type. 1: formal instance; 3: read-only instance; 4: disaster recovery instance; 5: cloned instance. Note: For a cloned instance, RestoreTime is required.
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get Parent instance ID. It is required if the `Clone` is `3` or `4`, that is, read-only instance or disaster recovery instance 
     * @return Father Parent instance ID. It is required if the `Clone` is `3` or `4`, that is, read-only instance or disaster recovery instance
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set Parent instance ID. It is required if the `Clone` is `3` or `4`, that is, read-only instance or disaster recovery instance
     * @param Father Parent instance ID. It is required if the `Clone` is `3` or `4`, that is, read-only instance or disaster recovery instance
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get Security group ID. 
     * @return SecurityGroup Security group ID.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group ID.
     * @param SecurityGroup Security group ID.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Rollback time of the cloned instance
- This parameter is required for a cloned instance in the format of 2021-08-13 16:30:00.
- Time range for rollback: You can roll back data in the last 7 days. 
     * @return RestoreTime Rollback time of the cloned instance
- This parameter is required for a cloned instance in the format of 2021-08-13 16:30:00.
- Time range for rollback: You can roll back data in the last 7 days.
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set Rollback time of the cloned instance
- This parameter is required for a cloned instance in the format of 2021-08-13 16:30:00.
- Time range for rollback: You can roll back data in the last 7 days.
     * @param RestoreTime Rollback time of the cloned instance
- This parameter is required for a cloned instance in the format of 2021-08-13 16:30:00.
- Time range for rollback: You can roll back data in the last 7 days.
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get Instance name, which can contain up to 60 letters, digits, and symbols (_-). 
     * @return InstanceName Instance name, which can contain up to 60 letters, digits, and symbols (_-).
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which can contain up to 60 letters, digits, and symbols (_-).
     * @param InstanceName Instance name, which can contain up to 60 letters, digits, and symbols (_-).
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Specifies the list of AZs during multi-AZ deployment of TencentDB for MongoDB instances.
 - For instances in multi-AZ deployment mode, the **Zone** parameter specifies the primary AZ, and **AvailabilityZoneList** specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].
 - The [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API can be called to obtain AZs planned for TencentDB for MongoDB instances in different regions, helping you specify valid AZs.
 - Nodes in multi-AZ deployment mode can only be deployed in 3 different AZs. Deploying most nodes of a cluster in the same AZ is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same AZ.
 
     * @return AvailabilityZoneList Specifies the list of AZs during multi-AZ deployment of TencentDB for MongoDB instances.
 - For instances in multi-AZ deployment mode, the **Zone** parameter specifies the primary AZ, and **AvailabilityZoneList** specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].
 - The [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API can be called to obtain AZs planned for TencentDB for MongoDB instances in different regions, helping you specify valid AZs.
 - Nodes in multi-AZ deployment mode can only be deployed in 3 different AZs. Deploying most nodes of a cluster in the same AZ is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same AZ.

     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set Specifies the list of AZs during multi-AZ deployment of TencentDB for MongoDB instances.
 - For instances in multi-AZ deployment mode, the **Zone** parameter specifies the primary AZ, and **AvailabilityZoneList** specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].
 - The [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API can be called to obtain AZs planned for TencentDB for MongoDB instances in different regions, helping you specify valid AZs.
 - Nodes in multi-AZ deployment mode can only be deployed in 3 different AZs. Deploying most nodes of a cluster in the same AZ is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same AZ.

     * @param AvailabilityZoneList Specifies the list of AZs during multi-AZ deployment of TencentDB for MongoDB instances.
 - For instances in multi-AZ deployment mode, the **Zone** parameter specifies the primary AZ, and **AvailabilityZoneList** specifies all AZs, including the primary AZ. Format: [ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4].
 - The [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API can be called to obtain AZs planned for TencentDB for MongoDB instances in different regions, helping you specify valid AZs.
 - Nodes in multi-AZ deployment mode can only be deployed in 3 different AZs. Deploying most nodes of a cluster in the same AZ is not supported. For example, a 3-node cluster does not support deploying 2 nodes in the same AZ.

     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.
 
     * @return MongosCpu Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.

     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.

     * @param MongosCpu Number of Mongos node CPU cores. Valid values: 1, 2, 4, 8, and 16. This parameter is required during sharded cluster instance purchase.

     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get Mongos node memory size.
 - This parameter is required during sharded cluster instance purchase.
 - Unit: GB. 1-core 2GB, 2-core 4GB, 4-core 8GB, 8-core 16GB, and 16-core 32GB are supported.

 
     * @return MongosMemory Mongos node memory size.
 - This parameter is required during sharded cluster instance purchase.
 - Unit: GB. 1-core 2GB, 2-core 4GB, 4-core 8GB, 8-core 16GB, and 16-core 32GB are supported.


     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos node memory size.
 - This parameter is required during sharded cluster instance purchase.
 - Unit: GB. 1-core 2GB, 2-core 4GB, 4-core 8GB, 8-core 16GB, and 16-core 32GB are supported.


     * @param MongosMemory Mongos node memory size.
 - This parameter is required during sharded cluster instance purchase.
 - Unit: GB. 1-core 2GB, 2-core 4GB, 4-core 8GB, 8-core 16GB, and 16-core 32GB are supported.


     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.
 - For instances in single-AZ deployment mode, the value range is [3,32].
 - For instances in multi-AZ deployment mode, the value range is [6,32]. 
     * @return MongosNodeNum Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.
 - For instances in single-AZ deployment mode, the value range is [3,32].
 - For instances in multi-AZ deployment mode, the value range is [6,32].
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.
 - For instances in single-AZ deployment mode, the value range is [3,32].
 - For instances in multi-AZ deployment mode, the value range is [6,32].
     * @param MongosNodeNum Number of Mongos nodes. This parameter is required during sharded cluster instance purchase.
 - For instances in single-AZ deployment mode, the value range is [3,32].
 - For instances in multi-AZ deployment mode, the value range is [6,32].
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get Number of read-only nodes. Value ranges: [0,5]. 
     * @return ReadonlyNodeNum Number of read-only nodes. Value ranges: [0,5].
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set Number of read-only nodes. Value ranges: [0,5].
     * @param ReadonlyNodeNum Number of read-only nodes. Value ranges: [0,5].
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when **ReadonlyNodeNum** is not set to **0**. 
     * @return ReadonlyNodeAvailabilityZoneList Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when **ReadonlyNodeNum** is not set to **0**.
     */
    public String [] getReadonlyNodeAvailabilityZoneList() {
        return this.ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Set Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when **ReadonlyNodeNum** is not set to **0**.
     * @param ReadonlyNodeAvailabilityZoneList Array of AZs of read-only nodes. This parameter is required for instances in multi-AZ deployment mode when **ReadonlyNodeNum** is not set to **0**.
     */
    public void setReadonlyNodeAvailabilityZoneList(String [] ReadonlyNodeAvailabilityZoneList) {
        this.ReadonlyNodeAvailabilityZoneList = ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Get AZ where the hidden node resides, which is required in cross-AZ instance deployment. 
     * @return HiddenZone AZ where the hidden node resides, which is required in cross-AZ instance deployment.
     */
    public String getHiddenZone() {
        return this.HiddenZone;
    }

    /**
     * Set AZ where the hidden node resides, which is required in cross-AZ instance deployment.
     * @param HiddenZone AZ where the hidden node resides, which is required in cross-AZ instance deployment.
     */
    public void setHiddenZone(String HiddenZone) {
        this.HiddenZone = HiddenZone;
    }

    /**
     * Get Parameter template ID. A parameter template is a collection of MongoDB parameters with preset values. You can save a group of parameters and values with the same requirements as a template. When you create an instance, you can directly reference these parameter values in the instance. Proper use of parameter templates can improve the efficiency of operations on TencentDB for MongoDB databases. The template list can be obtained by calling the DescribeDBInstanceParamTpl API. Pay attention to the database versions supported by templates. 
     * @return ParamTemplateId Parameter template ID. A parameter template is a collection of MongoDB parameters with preset values. You can save a group of parameters and values with the same requirements as a template. When you create an instance, you can directly reference these parameter values in the instance. Proper use of parameter templates can improve the efficiency of operations on TencentDB for MongoDB databases. The template list can be obtained by calling the DescribeDBInstanceParamTpl API. Pay attention to the database versions supported by templates.
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID. A parameter template is a collection of MongoDB parameters with preset values. You can save a group of parameters and values with the same requirements as a template. When you create an instance, you can directly reference these parameter values in the instance. Proper use of parameter templates can improve the efficiency of operations on TencentDB for MongoDB databases. The template list can be obtained by calling the DescribeDBInstanceParamTpl API. Pay attention to the database versions supported by templates.
     * @param ParamTemplateId Parameter template ID. A parameter template is a collection of MongoDB parameters with preset values. You can save a group of parameters and values with the same requirements as a template. When you create an instance, you can directly reference these parameter values in the instance. Proper use of parameter templates can improve the efficiency of operations on TencentDB for MongoDB databases. The template list can be obtained by calling the DescribeDBInstanceParamTpl API. Pay attention to the database versions supported by templates.
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
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

    }
}

