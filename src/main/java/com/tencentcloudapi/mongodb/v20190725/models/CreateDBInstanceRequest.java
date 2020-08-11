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

public class CreateDBInstanceRequest extends AbstractModel{

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
    * Number of instances. Minimum value: 1. Maximum value: 10.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Instance region name in the format of ap-guangzhou-2.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance validity period in months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Server type. Valid values: HIO (high IO), HIO10G (10-gigabit high IO), STDS5 (standard).
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

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
    * Project ID. If this parameter is not set, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID. If this parameter is not set, the classic network will be used. Please use the `DescribeVpcs` API to query the VPC list.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. Please use the `DescribeSubnets` API to query the subnet list.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance password. If this parameter is not set, you need to set an instance password through the `SetPassword` API after creating an instance. The password can only contain 8-16 characters and must contain at least two of the following types of characters: letters, digits, and special characters `!@#%^*()`.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Instance tag information.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Auto-renewal flag. Valid values: 0 (auto-renewal not enabled), 1 (auto-renewal enabled). Default value: 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically use a voucher. Valid values: 1 (yes), 0 (no). Default value: 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Valid values: 1 (regular instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance).
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * Primary instance ID. It is required for read-only and disaster recovery instances.
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * Security group.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

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
     * Get Project ID. If this parameter is not set, the default project will be used. 
     * @return ProjectId Project ID. If this parameter is not set, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this parameter is not set, the default project will be used.
     * @param ProjectId Project ID. If this parameter is not set, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID. If this parameter is not set, the classic network will be used. Please use the `DescribeVpcs` API to query the VPC list. 
     * @return VpcId VPC ID. If this parameter is not set, the classic network will be used. Please use the `DescribeVpcs` API to query the VPC list.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is not set, the classic network will be used. Please use the `DescribeVpcs` API to query the VPC list.
     * @param VpcId VPC ID. If this parameter is not set, the classic network will be used. Please use the `DescribeVpcs` API to query the VPC list.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. Please use the `DescribeSubnets` API to query the subnet list. 
     * @return SubnetId VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. Please use the `DescribeSubnets` API to query the subnet list.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. Please use the `DescribeSubnets` API to query the subnet list.
     * @param SubnetId VPC subnet ID. If `UniqVpcId` is set, then `UniqSubnetId` will be required. Please use the `DescribeSubnets` API to query the subnet list.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance password. If this parameter is not set, you need to set an instance password through the `SetPassword` API after creating an instance. The password can only contain 8-16 characters and must contain at least two of the following types of characters: letters, digits, and special characters `!@#%^*()`. 
     * @return Password Instance password. If this parameter is not set, you need to set an instance password through the `SetPassword` API after creating an instance. The password can only contain 8-16 characters and must contain at least two of the following types of characters: letters, digits, and special characters `!@#%^*()`.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password. If this parameter is not set, you need to set an instance password through the `SetPassword` API after creating an instance. The password can only contain 8-16 characters and must contain at least two of the following types of characters: letters, digits, and special characters `!@#%^*()`.
     * @param Password Instance password. If this parameter is not set, you need to set an instance password through the `SetPassword` API after creating an instance. The password can only contain 8-16 characters and must contain at least two of the following types of characters: letters, digits, and special characters `!@#%^*()`.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Instance tag information. 
     * @return Tags Instance tag information.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance tag information.
     * @param Tags Instance tag information.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Auto-renewal flag. Valid values: 0 (auto-renewal not enabled), 1 (auto-renewal enabled). Default value: 0. 
     * @return AutoRenewFlag Auto-renewal flag. Valid values: 0 (auto-renewal not enabled), 1 (auto-renewal enabled). Default value: 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values: 0 (auto-renewal not enabled), 1 (auto-renewal enabled). Default value: 0.
     * @param AutoRenewFlag Auto-renewal flag. Valid values: 0 (auto-renewal not enabled), 1 (auto-renewal enabled). Default value: 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically use a voucher. Valid values: 1 (yes), 0 (no). Default value: 0. 
     * @return AutoVoucher Whether to automatically use a voucher. Valid values: 1 (yes), 0 (no). Default value: 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use a voucher. Valid values: 1 (yes), 0 (no). Default value: 0.
     * @param AutoVoucher Whether to automatically use a voucher. Valid values: 1 (yes), 0 (no). Default value: 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Valid values: 1 (regular instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance). 
     * @return Clone Valid values: 1 (regular instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance).
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set Valid values: 1 (regular instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance).
     * @param Clone Valid values: 1 (regular instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance).
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get Primary instance ID. It is required for read-only and disaster recovery instances. 
     * @return Father Primary instance ID. It is required for read-only and disaster recovery instances.
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set Primary instance ID. It is required for read-only and disaster recovery instances.
     * @param Father Primary instance ID. It is required for read-only and disaster recovery instances.
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get Security group. 
     * @return SecurityGroup Security group.
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group.
     * @param SecurityGroup Security group.
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "Clone", this.Clone);
        this.setParamSimple(map, prefix + "Father", this.Father);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);

    }
}

