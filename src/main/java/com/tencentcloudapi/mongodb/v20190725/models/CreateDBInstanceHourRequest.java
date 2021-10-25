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

public class CreateDBInstanceHourRequest extends AbstractModel{

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Number of replica sets. When a replica set instance is created, this parameter must be set to 1. When a sharding instance is created, please see the parameters returned by the DescribeSpecInfo API
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * The number of nodes in each replica set. The value range is subject to the response parameter of the `DescribeSpecInfo` API.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition; MONGO_42_WT: MongoDB 4.2 WiredTiger Edition.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Server type. HIO: high IO; HIO10G: 10-Gigabit high IO
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * Number of instances. Minimum value: 1. Maximum value: 10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * AZ in the format of ap-guangzhou-2. If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance type. REPLSET: replica set; SHARD: sharding cluster
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * VPC ID. If this parameter is not set, the basic network will be selected by default
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID. If VpcId is set, then SubnetId will be required
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance password, which must contain 8 to 16 characters and comprise at least two of the following types: letters, digits, and symbols (!@#%^*()). If it is left empty, the password is in the format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001".
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Project ID. If this parameter is not set, the default project will be used
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
    * Instance type. Valid values: `1` (primary instance), `2` (temp instance), `3` (read-only instance), `4` (disaster recovery instance), `5` (cloned instance).
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * Parent instance ID. It is required if the `Clone` is 3 or 4.
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
    * The point in time to which the cloned instance will be rolled back. This parameter is required for a cloned instance. The point in time in the format of 2021-08-13 16:30:00 must be within the last seven days.
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * Instance name, which can contain up to 60 letters, digits, or symbols (_-).
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * AZ list when multi-AZ deployment is enabled. For the specific purchasable versions which support multi-AZ deployment, please see the return result of the `DescribeSpecInfo` API. Notes: 1. Nodes of a multi-AZ instance must be deployed across three AZs. 2. To ensure a successful cross-AZ switch, you should not deploy most of the nodes to the same AZ. (For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.) 3. MongoDB 4.2 and later versions do not support multi-AZ deployment. 4. Read-Only and disaster recovery instances do not support multi-AZ deployment. 5. Instances in the classic network do not support multi-AZ deployment.
    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * The number of mongos CPUs, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * The size of mongos memory, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * The number of mongos routers, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. Note: please purchase 3-32 mongos routers for high availability.
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
     * Get Instance memory size in GB 
     * @return Memory Instance memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB
     * @param Memory Instance memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB 
     * @return Volume Instance disk size in GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB
     * @param Volume Instance disk size in GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Number of replica sets. When a replica set instance is created, this parameter must be set to 1. When a sharding instance is created, please see the parameters returned by the DescribeSpecInfo API 
     * @return ReplicateSetNum Number of replica sets. When a replica set instance is created, this parameter must be set to 1. When a sharding instance is created, please see the parameters returned by the DescribeSpecInfo API
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Number of replica sets. When a replica set instance is created, this parameter must be set to 1. When a sharding instance is created, please see the parameters returned by the DescribeSpecInfo API
     * @param ReplicateSetNum Number of replica sets. When a replica set instance is created, this parameter must be set to 1. When a sharding instance is created, please see the parameters returned by the DescribeSpecInfo API
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get The number of nodes in each replica set. The value range is subject to the response parameter of the `DescribeSpecInfo` API. 
     * @return NodeNum The number of nodes in each replica set. The value range is subject to the response parameter of the `DescribeSpecInfo` API.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set The number of nodes in each replica set. The value range is subject to the response parameter of the `DescribeSpecInfo` API.
     * @param NodeNum The number of nodes in each replica set. The value range is subject to the response parameter of the `DescribeSpecInfo` API.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition; MONGO_42_WT: MongoDB 4.2 WiredTiger Edition. 
     * @return MongoVersion Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition; MONGO_42_WT: MongoDB 4.2 WiredTiger Edition.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition; MONGO_42_WT: MongoDB 4.2 WiredTiger Edition.
     * @param MongoVersion Version number. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. The correspondences between parameters and versions are as follows: MONGO_3_WT: MongoDB 3.2 WiredTiger Edition; MONGO_3_ROCKS: MongoDB 3.2 RocksDB Edition; MONGO_36_WT: MongoDB 3.6 WiredTiger Edition; MONGO_40_WT: MongoDB 4.0 WiredTiger Edition; MONGO_42_WT: MongoDB 4.2 WiredTiger Edition.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Server type. HIO: high IO; HIO10G: 10-Gigabit high IO 
     * @return MachineCode Server type. HIO: high IO; HIO10G: 10-Gigabit high IO
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Server type. HIO: high IO; HIO10G: 10-Gigabit high IO
     * @param MachineCode Server type. HIO: high IO; HIO10G: 10-Gigabit high IO
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get Number of instances. Minimum value: 1. Maximum value: 10 
     * @return GoodsNum Number of instances. Minimum value: 1. Maximum value: 10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Minimum value: 1. Maximum value: 10
     * @param GoodsNum Number of instances. Minimum value: 1. Maximum value: 10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get AZ in the format of ap-guangzhou-2. If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`. 
     * @return Zone AZ in the format of ap-guangzhou-2. If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ in the format of ap-guangzhou-2. If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     * @param Zone AZ in the format of ap-guangzhou-2. If multi-AZ deployment is enabled, this parameter refers to the primary AZ and must be one of the values of `AvailabilityZoneList`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance type. REPLSET: replica set; SHARD: sharding cluster 
     * @return ClusterType Instance type. REPLSET: replica set; SHARD: sharding cluster
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Instance type. REPLSET: replica set; SHARD: sharding cluster
     * @param ClusterType Instance type. REPLSET: replica set; SHARD: sharding cluster
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get VPC ID. If this parameter is not set, the basic network will be selected by default 
     * @return VpcId VPC ID. If this parameter is not set, the basic network will be selected by default
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is not set, the basic network will be selected by default
     * @param VpcId VPC ID. If this parameter is not set, the basic network will be selected by default
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID. If VpcId is set, then SubnetId will be required 
     * @return SubnetId VPC subnet ID. If VpcId is set, then SubnetId will be required
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID. If VpcId is set, then SubnetId will be required
     * @param SubnetId VPC subnet ID. If VpcId is set, then SubnetId will be required
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance password, which must contain 8 to 16 characters and comprise at least two of the following types: letters, digits, and symbols (!@#%^*()). If it is left empty, the password is in the format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
     * @return Password Instance password, which must contain 8 to 16 characters and comprise at least two of the following types: letters, digits, and symbols (!@#%^*()). If it is left empty, the password is in the format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001".
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password, which must contain 8 to 16 characters and comprise at least two of the following types: letters, digits, and symbols (!@#%^*()). If it is left empty, the password is in the format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001".
     * @param Password Instance password, which must contain 8 to 16 characters and comprise at least two of the following types: letters, digits, and symbols (!@#%^*()). If it is left empty, the password is in the format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001".
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Project ID. If this parameter is not set, the default project will be used 
     * @return ProjectId Project ID. If this parameter is not set, the default project will be used
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this parameter is not set, the default project will be used
     * @param ProjectId Project ID. If this parameter is not set, the default project will be used
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
     * Get Instance type. Valid values: `1` (primary instance), `2` (temp instance), `3` (read-only instance), `4` (disaster recovery instance), `5` (cloned instance). 
     * @return Clone Instance type. Valid values: `1` (primary instance), `2` (temp instance), `3` (read-only instance), `4` (disaster recovery instance), `5` (cloned instance).
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set Instance type. Valid values: `1` (primary instance), `2` (temp instance), `3` (read-only instance), `4` (disaster recovery instance), `5` (cloned instance).
     * @param Clone Instance type. Valid values: `1` (primary instance), `2` (temp instance), `3` (read-only instance), `4` (disaster recovery instance), `5` (cloned instance).
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get Parent instance ID. It is required if the `Clone` is 3 or 4. 
     * @return Father Parent instance ID. It is required if the `Clone` is 3 or 4.
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set Parent instance ID. It is required if the `Clone` is 3 or 4.
     * @param Father Parent instance ID. It is required if the `Clone` is 3 or 4.
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
     * Get The point in time to which the cloned instance will be rolled back. This parameter is required for a cloned instance. The point in time in the format of 2021-08-13 16:30:00 must be within the last seven days. 
     * @return RestoreTime The point in time to which the cloned instance will be rolled back. This parameter is required for a cloned instance. The point in time in the format of 2021-08-13 16:30:00 must be within the last seven days.
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set The point in time to which the cloned instance will be rolled back. This parameter is required for a cloned instance. The point in time in the format of 2021-08-13 16:30:00 must be within the last seven days.
     * @param RestoreTime The point in time to which the cloned instance will be rolled back. This parameter is required for a cloned instance. The point in time in the format of 2021-08-13 16:30:00 must be within the last seven days.
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get Instance name, which can contain up to 60 letters, digits, or symbols (_-). 
     * @return InstanceName Instance name, which can contain up to 60 letters, digits, or symbols (_-).
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which can contain up to 60 letters, digits, or symbols (_-).
     * @param InstanceName Instance name, which can contain up to 60 letters, digits, or symbols (_-).
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get AZ list when multi-AZ deployment is enabled. For the specific purchasable versions which support multi-AZ deployment, please see the return result of the `DescribeSpecInfo` API. Notes: 1. Nodes of a multi-AZ instance must be deployed across three AZs. 2. To ensure a successful cross-AZ switch, you should not deploy most of the nodes to the same AZ. (For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.) 3. MongoDB 4.2 and later versions do not support multi-AZ deployment. 4. Read-Only and disaster recovery instances do not support multi-AZ deployment. 5. Instances in the classic network do not support multi-AZ deployment. 
     * @return AvailabilityZoneList AZ list when multi-AZ deployment is enabled. For the specific purchasable versions which support multi-AZ deployment, please see the return result of the `DescribeSpecInfo` API. Notes: 1. Nodes of a multi-AZ instance must be deployed across three AZs. 2. To ensure a successful cross-AZ switch, you should not deploy most of the nodes to the same AZ. (For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.) 3. MongoDB 4.2 and later versions do not support multi-AZ deployment. 4. Read-Only and disaster recovery instances do not support multi-AZ deployment. 5. Instances in the classic network do not support multi-AZ deployment.
     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set AZ list when multi-AZ deployment is enabled. For the specific purchasable versions which support multi-AZ deployment, please see the return result of the `DescribeSpecInfo` API. Notes: 1. Nodes of a multi-AZ instance must be deployed across three AZs. 2. To ensure a successful cross-AZ switch, you should not deploy most of the nodes to the same AZ. (For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.) 3. MongoDB 4.2 and later versions do not support multi-AZ deployment. 4. Read-Only and disaster recovery instances do not support multi-AZ deployment. 5. Instances in the classic network do not support multi-AZ deployment.
     * @param AvailabilityZoneList AZ list when multi-AZ deployment is enabled. For the specific purchasable versions which support multi-AZ deployment, please see the return result of the `DescribeSpecInfo` API. Notes: 1. Nodes of a multi-AZ instance must be deployed across three AZs. 2. To ensure a successful cross-AZ switch, you should not deploy most of the nodes to the same AZ. (For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.) 3. MongoDB 4.2 and later versions do not support multi-AZ deployment. 4. Read-Only and disaster recovery instances do not support multi-AZ deployment. 5. Instances in the classic network do not support multi-AZ deployment.
     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get The number of mongos CPUs, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. 
     * @return MongosCpu The number of mongos CPUs, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set The number of mongos CPUs, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     * @param MongosCpu The number of mongos CPUs, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get The size of mongos memory, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. 
     * @return MongosMemory The size of mongos memory, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set The size of mongos memory, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     * @param MongosMemory The size of mongos memory, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API.
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get The number of mongos routers, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. Note: please purchase 3-32 mongos routers for high availability. 
     * @return MongosNodeNum The number of mongos routers, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. Note: please purchase 3-32 mongos routers for high availability.
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set The number of mongos routers, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. Note: please purchase 3-32 mongos routers for high availability.
     * @param MongosNodeNum The number of mongos routers, which is required for a sharded cluster instance of MongoDB 4.2 WiredTiger. For the specific purchasable versions supported, please see the return result of the `DescribeSpecInfo` API. Note: please purchase 3-32 mongos routers for high availability.
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
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

    }
}

