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

public class InstanceDetail extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Billing type. Valid value: 0 (pay-as-you-go)
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster type.
- 0: replica set instance.
- 1: sharded cluster instance.
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ information
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Network type.
- 0: basic network.
- 1: VPC.
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of VPC
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance status.
- 0: to be initialized.
- 1: processing, such as specification changes and parameter modifications.
- 2: running normally.
- -2: isolated (yearly/monthly subscription).
- -3: isolated (pay-as-you-go).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port number
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance expiration time
    */
    @SerializedName("DeadLine")
    @Expose
    private String DeadLine;

    /**
    * Storage engine version information on instances.
- MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Instance memory specification, in MB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk specification, in MB.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Number of the instance CPU cores.
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Instance machine type.
- HIO10G: general HIO 10GE type.
- HCD: Cloud Disk Edition type.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Number of secondary nodes of an instance
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Long SecondaryNum;

    /**
    * Number of instance shards
    */
    @SerializedName("ReplicationSetNum")
    @Expose
    private Long ReplicationSetNum;

    /**
    * Automatic renewal flag for the instance.
- 0: manual renewal.
- 1: automatic renewal.
- 2: no renewal after confirmation.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Used capacity, in MB.
    */
    @SerializedName("UsedVolume")
    @Expose
    private Long UsedVolume;

    /**
    * Start time of the maintenance time
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * End time of the maintenance time
    */
    @SerializedName("MaintenanceEnd")
    @Expose
    private String MaintenanceEnd;

    /**
    * Shard information
    */
    @SerializedName("ReplicaSets")
    @Expose
    private ShardInfo [] ReplicaSets;

    /**
    * Information of read-only instances
    */
    @SerializedName("ReadonlyInstances")
    @Expose
    private DBInstanceInfo [] ReadonlyInstances;

    /**
    * Information of disaster recovery instances
    */
    @SerializedName("StandbyInstances")
    @Expose
    private DBInstanceInfo [] StandbyInstances;

    /**
    * Information of temp instances
    */
    @SerializedName("CloneInstances")
    @Expose
    private DBInstanceInfo [] CloneInstances;

    /**
    * Information of associated instances. For a regular instance, this field represents the information of its temp instance; for a temp instance, this field represents the information of its regular instance; and for a read-only instance or a disaster recovery instance, this field represents the information of its primary instance.
    */
    @SerializedName("RelatedInstance")
    @Expose
    private DBInstanceInfo RelatedInstance;

    /**
    * Instance tag information set
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Instance version
    */
    @SerializedName("InstanceVer")
    @Expose
    private Long InstanceVer;

    /**
    * Instance version
    */
    @SerializedName("ClusterVer")
    @Expose
    private Long ClusterVer;

    /**
    * Protocol information: mongodb.
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * Instance type.
- 0: all instances.
- 1: formal instance.
- 2: temporary instance.
- 3: read-only instance.
- -1: include the formal, read-only, and disaster recovery instance simultaneously.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance status description.
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * Physical instance ID corresponding to the instance. The instances that have been rolled back and replaced have different InstanceIds and RealInstanceIds, which need to be obtained through the physical ID in scenarios such as obtaining monitoring data from Barad.
    */
    @SerializedName("RealInstanceId")
    @Expose
    private String RealInstanceId;

    /**
    * Number of Mongos nodes.
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * Mongos node memory, in MB.
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * Number of Mongos node CPU cores.
    */
    @SerializedName("MongosCpuNum")
    @Expose
    private Long MongosCpuNum;

    /**
    * Number of ConfigServer nodes.
    */
    @SerializedName("ConfigServerNodeNum")
    @Expose
    private Long ConfigServerNodeNum;

    /**
    * Config Server node memory, in MB.
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * Config Server node disk size, in MB.
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

    /**
    * Number of ConfigServer node CPU cores.
    */
    @SerializedName("ConfigServerCpuNum")
    @Expose
    private Long ConfigServerCpuNum;

    /**
    * Number of read-only nodes.
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Billing type. Valid value: 0 (pay-as-you-go) 
     * @return PayMode Billing type. Valid value: 0 (pay-as-you-go)
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type. Valid value: 0 (pay-as-you-go)
     * @param PayMode Billing type. Valid value: 0 (pay-as-you-go)
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster type.
- 0: replica set instance.
- 1: sharded cluster instance. 
     * @return ClusterType Cluster type.
- 0: replica set instance.
- 1: sharded cluster instance.
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type.
- 0: replica set instance.
- 1: sharded cluster instance.
     * @param ClusterType Cluster type.
- 0: replica set instance.
- 1: sharded cluster instance.
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ information 
     * @return Zone AZ information
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information
     * @param Zone AZ information
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Network type.
- 0: basic network.
- 1: VPC. 
     * @return NetType Network type.
- 0: basic network.
- 1: VPC.
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type.
- 0: basic network.
- 1: VPC.
     * @param NetType Network type.
- 0: basic network.
- 1: VPC.
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
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
     * Get Subnet ID of VPC 
     * @return SubnetId Subnet ID of VPC
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of VPC
     * @param SubnetId Subnet ID of VPC
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status.
- 0: to be initialized.
- 1: processing, such as specification changes and parameter modifications.
- 2: running normally.
- -2: isolated (yearly/monthly subscription).
- -3: isolated (pay-as-you-go). 
     * @return Status Instance status.
- 0: to be initialized.
- 1: processing, such as specification changes and parameter modifications.
- 2: running normally.
- -2: isolated (yearly/monthly subscription).
- -3: isolated (pay-as-you-go).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status.
- 0: to be initialized.
- 1: processing, such as specification changes and parameter modifications.
- 2: running normally.
- -2: isolated (yearly/monthly subscription).
- -3: isolated (pay-as-you-go).
     * @param Status Instance status.
- 0: to be initialized.
- 1: processing, such as specification changes and parameter modifications.
- 2: running normally.
- -2: isolated (yearly/monthly subscription).
- -3: isolated (pay-as-you-go).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance IP 
     * @return Vip Instance IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance IP
     * @param Vip Instance IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port number 
     * @return Vport Port number
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Port number
     * @param Vport Port number
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance expiration time 
     * @return DeadLine Instance expiration time
     */
    public String getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set Instance expiration time
     * @param DeadLine Instance expiration time
     */
    public void setDeadLine(String DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get Storage engine version information on instances.
- MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine. 
     * @return MongoVersion Storage engine version information on instances.
- MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Storage engine version information on instances.
- MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     * @param MongoVersion Storage engine version information on instances.
- MONGO_36_WT: version of the MongoDB 3.6 WiredTiger storage engine.
- MONGO_40_WT: version of the MongoDB 4.0 WiredTiger storage engine.
- MONGO_42_WT: version of the MongoDB 4.2 WiredTiger storage engine.
- MONGO_44_WT: version of the MongoDB 4.4 WiredTiger storage engine.
- MONGO_50_WT: version of the MongoDB 5.0 WiredTiger storage engine.
- MONGO_60_WT: version of the MongoDB 6.0 WiredTiger storage engine.
- MONGO_70_WT: version of the MongoDB 7.0 WiredTiger storage engine.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Instance memory specification, in MB. 
     * @return Memory Instance memory specification, in MB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory specification, in MB.
     * @param Memory Instance memory specification, in MB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk specification, in MB. 
     * @return Volume Instance disk specification, in MB.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk specification, in MB.
     * @param Volume Instance disk specification, in MB.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Number of the instance CPU cores. 
     * @return CpuNum Number of the instance CPU cores.
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of the instance CPU cores.
     * @param CpuNum Number of the instance CPU cores.
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Instance machine type.
- HIO10G: general HIO 10GE type.
- HCD: Cloud Disk Edition type. 
     * @return MachineType Instance machine type.
- HIO10G: general HIO 10GE type.
- HCD: Cloud Disk Edition type.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Instance machine type.
- HIO10G: general HIO 10GE type.
- HCD: Cloud Disk Edition type.
     * @param MachineType Instance machine type.
- HIO10G: general HIO 10GE type.
- HCD: Cloud Disk Edition type.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Number of secondary nodes of an instance 
     * @return SecondaryNum Number of secondary nodes of an instance
     */
    public Long getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * Set Number of secondary nodes of an instance
     * @param SecondaryNum Number of secondary nodes of an instance
     */
    public void setSecondaryNum(Long SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * Get Number of instance shards 
     * @return ReplicationSetNum Number of instance shards
     */
    public Long getReplicationSetNum() {
        return this.ReplicationSetNum;
    }

    /**
     * Set Number of instance shards
     * @param ReplicationSetNum Number of instance shards
     */
    public void setReplicationSetNum(Long ReplicationSetNum) {
        this.ReplicationSetNum = ReplicationSetNum;
    }

    /**
     * Get Automatic renewal flag for the instance.
- 0: manual renewal.
- 1: automatic renewal.
- 2: no renewal after confirmation. 
     * @return AutoRenewFlag Automatic renewal flag for the instance.
- 0: manual renewal.
- 1: automatic renewal.
- 2: no renewal after confirmation.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Automatic renewal flag for the instance.
- 0: manual renewal.
- 1: automatic renewal.
- 2: no renewal after confirmation.
     * @param AutoRenewFlag Automatic renewal flag for the instance.
- 0: manual renewal.
- 1: automatic renewal.
- 2: no renewal after confirmation.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Used capacity, in MB. 
     * @return UsedVolume Used capacity, in MB.
     */
    public Long getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * Set Used capacity, in MB.
     * @param UsedVolume Used capacity, in MB.
     */
    public void setUsedVolume(Long UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * Get Start time of the maintenance time 
     * @return MaintenanceStart Start time of the maintenance time
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * Set Start time of the maintenance time
     * @param MaintenanceStart Start time of the maintenance time
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * Get End time of the maintenance time 
     * @return MaintenanceEnd End time of the maintenance time
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * Set End time of the maintenance time
     * @param MaintenanceEnd End time of the maintenance time
     */
    public void setMaintenanceEnd(String MaintenanceEnd) {
        this.MaintenanceEnd = MaintenanceEnd;
    }

    /**
     * Get Shard information 
     * @return ReplicaSets Shard information
     */
    public ShardInfo [] getReplicaSets() {
        return this.ReplicaSets;
    }

    /**
     * Set Shard information
     * @param ReplicaSets Shard information
     */
    public void setReplicaSets(ShardInfo [] ReplicaSets) {
        this.ReplicaSets = ReplicaSets;
    }

    /**
     * Get Information of read-only instances 
     * @return ReadonlyInstances Information of read-only instances
     */
    public DBInstanceInfo [] getReadonlyInstances() {
        return this.ReadonlyInstances;
    }

    /**
     * Set Information of read-only instances
     * @param ReadonlyInstances Information of read-only instances
     */
    public void setReadonlyInstances(DBInstanceInfo [] ReadonlyInstances) {
        this.ReadonlyInstances = ReadonlyInstances;
    }

    /**
     * Get Information of disaster recovery instances 
     * @return StandbyInstances Information of disaster recovery instances
     */
    public DBInstanceInfo [] getStandbyInstances() {
        return this.StandbyInstances;
    }

    /**
     * Set Information of disaster recovery instances
     * @param StandbyInstances Information of disaster recovery instances
     */
    public void setStandbyInstances(DBInstanceInfo [] StandbyInstances) {
        this.StandbyInstances = StandbyInstances;
    }

    /**
     * Get Information of temp instances 
     * @return CloneInstances Information of temp instances
     */
    public DBInstanceInfo [] getCloneInstances() {
        return this.CloneInstances;
    }

    /**
     * Set Information of temp instances
     * @param CloneInstances Information of temp instances
     */
    public void setCloneInstances(DBInstanceInfo [] CloneInstances) {
        this.CloneInstances = CloneInstances;
    }

    /**
     * Get Information of associated instances. For a regular instance, this field represents the information of its temp instance; for a temp instance, this field represents the information of its regular instance; and for a read-only instance or a disaster recovery instance, this field represents the information of its primary instance. 
     * @return RelatedInstance Information of associated instances. For a regular instance, this field represents the information of its temp instance; for a temp instance, this field represents the information of its regular instance; and for a read-only instance or a disaster recovery instance, this field represents the information of its primary instance.
     */
    public DBInstanceInfo getRelatedInstance() {
        return this.RelatedInstance;
    }

    /**
     * Set Information of associated instances. For a regular instance, this field represents the information of its temp instance; for a temp instance, this field represents the information of its regular instance; and for a read-only instance or a disaster recovery instance, this field represents the information of its primary instance.
     * @param RelatedInstance Information of associated instances. For a regular instance, this field represents the information of its temp instance; for a temp instance, this field represents the information of its regular instance; and for a read-only instance or a disaster recovery instance, this field represents the information of its primary instance.
     */
    public void setRelatedInstance(DBInstanceInfo RelatedInstance) {
        this.RelatedInstance = RelatedInstance;
    }

    /**
     * Get Instance tag information set 
     * @return Tags Instance tag information set
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance tag information set
     * @param Tags Instance tag information set
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance version 
     * @return InstanceVer Instance version
     */
    public Long getInstanceVer() {
        return this.InstanceVer;
    }

    /**
     * Set Instance version
     * @param InstanceVer Instance version
     */
    public void setInstanceVer(Long InstanceVer) {
        this.InstanceVer = InstanceVer;
    }

    /**
     * Get Instance version 
     * @return ClusterVer Instance version
     */
    public Long getClusterVer() {
        return this.ClusterVer;
    }

    /**
     * Set Instance version
     * @param ClusterVer Instance version
     */
    public void setClusterVer(Long ClusterVer) {
        this.ClusterVer = ClusterVer;
    }

    /**
     * Get Protocol information: mongodb. 
     * @return Protocol Protocol information: mongodb.
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol information: mongodb.
     * @param Protocol Protocol information: mongodb.
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Instance type.
- 0: all instances.
- 1: formal instance.
- 2: temporary instance.
- 3: read-only instance.
- -1: include the formal, read-only, and disaster recovery instance simultaneously. 
     * @return InstanceType Instance type.
- 0: all instances.
- 1: formal instance.
- 2: temporary instance.
- 3: read-only instance.
- -1: include the formal, read-only, and disaster recovery instance simultaneously.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.
- 0: all instances.
- 1: formal instance.
- 2: temporary instance.
- 3: read-only instance.
- -1: include the formal, read-only, and disaster recovery instance simultaneously.
     * @param InstanceType Instance type.
- 0: all instances.
- 1: formal instance.
- 2: temporary instance.
- 3: read-only instance.
- -1: include the formal, read-only, and disaster recovery instance simultaneously.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status description. 
     * @return InstanceStatusDesc Instance status description.
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set Instance status description.
     * @param InstanceStatusDesc Instance status description.
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get Physical instance ID corresponding to the instance. The instances that have been rolled back and replaced have different InstanceIds and RealInstanceIds, which need to be obtained through the physical ID in scenarios such as obtaining monitoring data from Barad. 
     * @return RealInstanceId Physical instance ID corresponding to the instance. The instances that have been rolled back and replaced have different InstanceIds and RealInstanceIds, which need to be obtained through the physical ID in scenarios such as obtaining monitoring data from Barad.
     */
    public String getRealInstanceId() {
        return this.RealInstanceId;
    }

    /**
     * Set Physical instance ID corresponding to the instance. The instances that have been rolled back and replaced have different InstanceIds and RealInstanceIds, which need to be obtained through the physical ID in scenarios such as obtaining monitoring data from Barad.
     * @param RealInstanceId Physical instance ID corresponding to the instance. The instances that have been rolled back and replaced have different InstanceIds and RealInstanceIds, which need to be obtained through the physical ID in scenarios such as obtaining monitoring data from Barad.
     */
    public void setRealInstanceId(String RealInstanceId) {
        this.RealInstanceId = RealInstanceId;
    }

    /**
     * Get Number of Mongos nodes. 
     * @return MongosNodeNum Number of Mongos nodes.
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set Number of Mongos nodes.
     * @param MongosNodeNum Number of Mongos nodes.
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get Mongos node memory, in MB. 
     * @return MongosMemory Mongos node memory, in MB.
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos node memory, in MB.
     * @param MongosMemory Mongos node memory, in MB.
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get Number of Mongos node CPU cores. 
     * @return MongosCpuNum Number of Mongos node CPU cores.
     */
    public Long getMongosCpuNum() {
        return this.MongosCpuNum;
    }

    /**
     * Set Number of Mongos node CPU cores.
     * @param MongosCpuNum Number of Mongos node CPU cores.
     */
    public void setMongosCpuNum(Long MongosCpuNum) {
        this.MongosCpuNum = MongosCpuNum;
    }

    /**
     * Get Number of ConfigServer nodes. 
     * @return ConfigServerNodeNum Number of ConfigServer nodes.
     */
    public Long getConfigServerNodeNum() {
        return this.ConfigServerNodeNum;
    }

    /**
     * Set Number of ConfigServer nodes.
     * @param ConfigServerNodeNum Number of ConfigServer nodes.
     */
    public void setConfigServerNodeNum(Long ConfigServerNodeNum) {
        this.ConfigServerNodeNum = ConfigServerNodeNum;
    }

    /**
     * Get Config Server node memory, in MB. 
     * @return ConfigServerMemory Config Server node memory, in MB.
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set Config Server node memory, in MB.
     * @param ConfigServerMemory Config Server node memory, in MB.
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get Config Server node disk size, in MB. 
     * @return ConfigServerVolume Config Server node disk size, in MB.
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set Config Server node disk size, in MB.
     * @param ConfigServerVolume Config Server node disk size, in MB.
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    /**
     * Get Number of ConfigServer node CPU cores. 
     * @return ConfigServerCpuNum Number of ConfigServer node CPU cores.
     */
    public Long getConfigServerCpuNum() {
        return this.ConfigServerCpuNum;
    }

    /**
     * Set Number of ConfigServer node CPU cores.
     * @param ConfigServerCpuNum Number of ConfigServer node CPU cores.
     */
    public void setConfigServerCpuNum(Long ConfigServerCpuNum) {
        this.ConfigServerCpuNum = ConfigServerCpuNum;
    }

    /**
     * Get Number of read-only nodes. 
     * @return ReadonlyNodeNum Number of read-only nodes.
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set Number of read-only nodes.
     * @param ReadonlyNodeNum Number of read-only nodes.
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new String(source.DeadLine);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.SecondaryNum != null) {
            this.SecondaryNum = new Long(source.SecondaryNum);
        }
        if (source.ReplicationSetNum != null) {
            this.ReplicationSetNum = new Long(source.ReplicationSetNum);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.UsedVolume != null) {
            this.UsedVolume = new Long(source.UsedVolume);
        }
        if (source.MaintenanceStart != null) {
            this.MaintenanceStart = new String(source.MaintenanceStart);
        }
        if (source.MaintenanceEnd != null) {
            this.MaintenanceEnd = new String(source.MaintenanceEnd);
        }
        if (source.ReplicaSets != null) {
            this.ReplicaSets = new ShardInfo[source.ReplicaSets.length];
            for (int i = 0; i < source.ReplicaSets.length; i++) {
                this.ReplicaSets[i] = new ShardInfo(source.ReplicaSets[i]);
            }
        }
        if (source.ReadonlyInstances != null) {
            this.ReadonlyInstances = new DBInstanceInfo[source.ReadonlyInstances.length];
            for (int i = 0; i < source.ReadonlyInstances.length; i++) {
                this.ReadonlyInstances[i] = new DBInstanceInfo(source.ReadonlyInstances[i]);
            }
        }
        if (source.StandbyInstances != null) {
            this.StandbyInstances = new DBInstanceInfo[source.StandbyInstances.length];
            for (int i = 0; i < source.StandbyInstances.length; i++) {
                this.StandbyInstances[i] = new DBInstanceInfo(source.StandbyInstances[i]);
            }
        }
        if (source.CloneInstances != null) {
            this.CloneInstances = new DBInstanceInfo[source.CloneInstances.length];
            for (int i = 0; i < source.CloneInstances.length; i++) {
                this.CloneInstances[i] = new DBInstanceInfo(source.CloneInstances[i]);
            }
        }
        if (source.RelatedInstance != null) {
            this.RelatedInstance = new DBInstanceInfo(source.RelatedInstance);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.InstanceVer != null) {
            this.InstanceVer = new Long(source.InstanceVer);
        }
        if (source.ClusterVer != null) {
            this.ClusterVer = new Long(source.ClusterVer);
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.RealInstanceId != null) {
            this.RealInstanceId = new String(source.RealInstanceId);
        }
        if (source.MongosNodeNum != null) {
            this.MongosNodeNum = new Long(source.MongosNodeNum);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosCpuNum != null) {
            this.MongosCpuNum = new Long(source.MongosCpuNum);
        }
        if (source.ConfigServerNodeNum != null) {
            this.ConfigServerNodeNum = new Long(source.ConfigServerNodeNum);
        }
        if (source.ConfigServerMemory != null) {
            this.ConfigServerMemory = new Long(source.ConfigServerMemory);
        }
        if (source.ConfigServerVolume != null) {
            this.ConfigServerVolume = new Long(source.ConfigServerVolume);
        }
        if (source.ConfigServerCpuNum != null) {
            this.ConfigServerCpuNum = new Long(source.ConfigServerCpuNum);
        }
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "ReplicationSetNum", this.ReplicationSetNum);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "UsedVolume", this.UsedVolume);
        this.setParamSimple(map, prefix + "MaintenanceStart", this.MaintenanceStart);
        this.setParamSimple(map, prefix + "MaintenanceEnd", this.MaintenanceEnd);
        this.setParamArrayObj(map, prefix + "ReplicaSets.", this.ReplicaSets);
        this.setParamArrayObj(map, prefix + "ReadonlyInstances.", this.ReadonlyInstances);
        this.setParamArrayObj(map, prefix + "StandbyInstances.", this.StandbyInstances);
        this.setParamArrayObj(map, prefix + "CloneInstances.", this.CloneInstances);
        this.setParamObj(map, prefix + "RelatedInstance.", this.RelatedInstance);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceVer", this.InstanceVer);
        this.setParamSimple(map, prefix + "ClusterVer", this.ClusterVer);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "RealInstanceId", this.RealInstanceId);
        this.setParamSimple(map, prefix + "MongosNodeNum", this.MongosNodeNum);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosCpuNum", this.MongosCpuNum);
        this.setParamSimple(map, prefix + "ConfigServerNodeNum", this.ConfigServerNodeNum);
        this.setParamSimple(map, prefix + "ConfigServerMemory", this.ConfigServerMemory);
        this.setParamSimple(map, prefix + "ConfigServerVolume", this.ConfigServerVolume);
        this.setParamSimple(map, prefix + "ConfigServerCpuNum", this.ConfigServerCpuNum);
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);

    }
}

