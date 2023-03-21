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
    * Number of replica sets
- Number of the replica set instances to be created. Valid value: `1`.
- Number of sharded cluster instances to be created. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * The number of nodes in each replica set. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Version information. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT：MongoDB 3.6 WiredTiger storage engine
- MONGO_40_WT：MongoDB 4.0 WiredTiger storage engine
- MONGO_42_WT：MongoDB 4.2 WiredTiger storage engine
- MONGO_44_WT：MongoDB 4.4 WiredTiger storage engine
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Machine type
- HIO: High IO
- HIO10G: 10-Gigabit high IO
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
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID. If `VpcId` is set, then `SubnetId` will be required.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance password
- If it is left empty, the password is in the default format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
- The custom password must contain 8-32 characters in at least two of the following types: letters, digits, and symbols (!@#%^*()_).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Project ID. If it is left empty, `Default project` will be used.
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
    * Instance type. Valid values:
- `1`: Primary instance
- `3`: Read-only instance
- `4`: Disaster recovery instance
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
    * Security group
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
    * List of multi-AZ deployed nodes. For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- Nodes of a multi-AZ instance must be deployed across three AZs. Most nodes of the cluster can’t be deployed in the same AZ. For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.
- MongoDB 4.2 and later versions do not support multi-AZ deployment.
- Read-only and disaster recovery instances do not support multi-AZ deployment.
-Instances in the classic network do not support multi-AZ deployment.
    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * Number of Mongos CPU cores
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * Mongos memory size
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * Number of Monogs
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * Number of read-only nodes. Value range: 0-5.
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * AZ of read-only nodes, which is required when `ReadonlyNodeNum` is not `0` in cross-AZ instance deployment.
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
     * Get Number of replica sets
- Number of the replica set instances to be created. Valid value: `1`.
- Number of sharded cluster instances to be created. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. 
     * @return ReplicateSetNum Number of replica sets
- Number of the replica set instances to be created. Valid value: `1`.
- Number of sharded cluster instances to be created. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Number of replica sets
- Number of the replica set instances to be created. Valid value: `1`.
- Number of sharded cluster instances to be created. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     * @param ReplicateSetNum Number of replica sets
- Number of the replica set instances to be created. Valid value: `1`.
- Number of sharded cluster instances to be created. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get The number of nodes in each replica set. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API. 
     * @return NodeNum The number of nodes in each replica set. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set The number of nodes in each replica set. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     * @param NodeNum The number of nodes in each replica set. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Version information. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT：MongoDB 3.6 WiredTiger storage engine
- MONGO_40_WT：MongoDB 4.0 WiredTiger storage engine
- MONGO_42_WT：MongoDB 4.2 WiredTiger storage engine
- MONGO_44_WT：MongoDB 4.4 WiredTiger storage engine 
     * @return MongoVersion Version information. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT：MongoDB 3.6 WiredTiger storage engine
- MONGO_40_WT：MongoDB 4.0 WiredTiger storage engine
- MONGO_42_WT：MongoDB 4.2 WiredTiger storage engine
- MONGO_44_WT：MongoDB 4.4 WiredTiger storage engine
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Version information. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT：MongoDB 3.6 WiredTiger storage engine
- MONGO_40_WT：MongoDB 4.0 WiredTiger storage engine
- MONGO_42_WT：MongoDB 4.2 WiredTiger storage engine
- MONGO_44_WT：MongoDB 4.4 WiredTiger storage engine
     * @param MongoVersion Version information. You can get the specific purchasable specifications through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- MONGO_36_WT：MongoDB 3.6 WiredTiger storage engine
- MONGO_40_WT：MongoDB 4.0 WiredTiger storage engine
- MONGO_42_WT：MongoDB 4.2 WiredTiger storage engine
- MONGO_44_WT：MongoDB 4.4 WiredTiger storage engine
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Machine type
- HIO: High IO
- HIO10G: 10-Gigabit high IO 
     * @return MachineCode Machine type
- HIO: High IO
- HIO10G: 10-Gigabit high IO
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set Machine type
- HIO: High IO
- HIO10G: 10-Gigabit high IO
     * @param MachineCode Machine type
- HIO: High IO
- HIO10G: 10-Gigabit high IO
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
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID. If `VpcId` is set, then `SubnetId` will be required. 
     * @return SubnetId VPC subnet ID. If `VpcId` is set, then `SubnetId` will be required.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID. If `VpcId` is set, then `SubnetId` will be required.
     * @param SubnetId VPC subnet ID. If `VpcId` is set, then `SubnetId` will be required.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance password
- If it is left empty, the password is in the default format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
- The custom password must contain 8-32 characters in at least two of the following types: letters, digits, and symbols (!@#%^*()_). 
     * @return Password Instance password
- If it is left empty, the password is in the default format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
- The custom password must contain 8-32 characters in at least two of the following types: letters, digits, and symbols (!@#%^*()_).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password
- If it is left empty, the password is in the default format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
- The custom password must contain 8-32 characters in at least two of the following types: letters, digits, and symbols (!@#%^*()_).
     * @param Password Instance password
- If it is left empty, the password is in the default format of "instance ID+@+root account UIN". For example, if the instance ID is "cmgo-higv73ed" and the root account UIN "100000001", the instance password will be "cmgo-higv73ed@100000001". 
- The custom password must contain 8-32 characters in at least two of the following types: letters, digits, and symbols (!@#%^*()_).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Project ID. If it is left empty, `Default project` will be used. 
     * @return ProjectId Project ID. If it is left empty, `Default project` will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If it is left empty, `Default project` will be used.
     * @param ProjectId Project ID. If it is left empty, `Default project` will be used.
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
     * Get Instance type. Valid values:
- `1`: Primary instance
- `3`: Read-only instance
- `4`: Disaster recovery instance 
     * @return Clone Instance type. Valid values:
- `1`: Primary instance
- `3`: Read-only instance
- `4`: Disaster recovery instance
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set Instance type. Valid values:
- `1`: Primary instance
- `3`: Read-only instance
- `4`: Disaster recovery instance
     * @param Clone Instance type. Valid values:
- `1`: Primary instance
- `3`: Read-only instance
- `4`: Disaster recovery instance
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
     * Get Security group 
     * @return SecurityGroup Security group
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group
     * @param SecurityGroup Security group
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
     * Get List of multi-AZ deployed nodes. For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- Nodes of a multi-AZ instance must be deployed across three AZs. Most nodes of the cluster can’t be deployed in the same AZ. For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.
- MongoDB 4.2 and later versions do not support multi-AZ deployment.
- Read-only and disaster recovery instances do not support multi-AZ deployment.
-Instances in the classic network do not support multi-AZ deployment. 
     * @return AvailabilityZoneList List of multi-AZ deployed nodes. For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- Nodes of a multi-AZ instance must be deployed across three AZs. Most nodes of the cluster can’t be deployed in the same AZ. For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.
- MongoDB 4.2 and later versions do not support multi-AZ deployment.
- Read-only and disaster recovery instances do not support multi-AZ deployment.
-Instances in the classic network do not support multi-AZ deployment.
     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set List of multi-AZ deployed nodes. For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- Nodes of a multi-AZ instance must be deployed across three AZs. Most nodes of the cluster can’t be deployed in the same AZ. For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.
- MongoDB 4.2 and later versions do not support multi-AZ deployment.
- Read-only and disaster recovery instances do not support multi-AZ deployment.
-Instances in the classic network do not support multi-AZ deployment.
     * @param AvailabilityZoneList List of multi-AZ deployed nodes. For more information, query through the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API.
- Nodes of a multi-AZ instance must be deployed across three AZs. Most nodes of the cluster can’t be deployed in the same AZ. For example, a three-node sharded cluster instance does not support deploying two or more nodes in the same AZ.
- MongoDB 4.2 and later versions do not support multi-AZ deployment.
- Read-only and disaster recovery instances do not support multi-AZ deployment.
-Instances in the classic network do not support multi-AZ deployment.
     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get Number of Mongos CPU cores
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge. 
     * @return MongosCpu Number of Mongos CPU cores
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set Number of Mongos CPU cores
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     * @param MongosCpu Number of Mongos CPU cores
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get Mongos memory size
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge. 
     * @return MongosMemory Mongos memory size
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos memory size
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     * @param MongosMemory Mongos memory size
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get Number of Monogs
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge. 
     * @return MongosNodeNum Number of Monogs
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set Number of Monogs
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     * @param MongosNodeNum Number of Monogs
- This parameter is not required for a sharded cluster instance of MongoDB 3.6 WiredTiger or later.
- If this parameter is not configured, the mongos specification will be configured based on the mongod specification, and the default specification is free of charge.
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get Number of read-only nodes. Value range: 0-5. 
     * @return ReadonlyNodeNum Number of read-only nodes. Value range: 0-5.
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set Number of read-only nodes. Value range: 0-5.
     * @param ReadonlyNodeNum Number of read-only nodes. Value range: 0-5.
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get AZ of read-only nodes, which is required when `ReadonlyNodeNum` is not `0` in cross-AZ instance deployment. 
     * @return ReadonlyNodeAvailabilityZoneList AZ of read-only nodes, which is required when `ReadonlyNodeNum` is not `0` in cross-AZ instance deployment.
     */
    public String [] getReadonlyNodeAvailabilityZoneList() {
        return this.ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Set AZ of read-only nodes, which is required when `ReadonlyNodeNum` is not `0` in cross-AZ instance deployment.
     * @param ReadonlyNodeAvailabilityZoneList AZ of read-only nodes, which is required when `ReadonlyNodeNum` is not `0` in cross-AZ instance deployment.
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

    }
}

