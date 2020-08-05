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

public class InstanceDetail extends AbstractModel{

    /**
    * Instance ID
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
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance),
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
    * Network type. Valid values: 0 (basic network), 1 (VPC)
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
    * Instance status. Valid values: 0 (to be initialized), 1 (in process), 2 (running), -2 (expired)
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
    * Instance version information
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Instance memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in MB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Number of CPU cores of an instance
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Instance machine type
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
    * Instance auto-renewal flag. Valid values: 0 (manual renewal), 1 (auto-renewal), 2 (no renewal upon expiration)
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Used capacity in MB
    */
    @SerializedName("UsedVolume")
    @Expose
    private Long UsedVolume;

    /**
    * Start time of the maintenance time window
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * End time of the maintenance time window
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
    * Information of associated instances. For a promoted instance, this field represents information of its temp instance; for a temp instance, this field represents information of its promoted instance; and for a read-only/disaster recovery instance, this field represents information of its primary instance
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
    * Instance version tag
    */
    @SerializedName("InstanceVer")
    @Expose
    private Long InstanceVer;

    /**
    * Instance version tag
    */
    @SerializedName("ClusterVer")
    @Expose
    private Long ClusterVer;

    /**
    * Protocol information. Valid values: 1 (mongodb), 2 (dynamodb)
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * Instance type. Valid values: 1 (promoted instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance status description
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * Physical instance ID. For an instance that has been rolled back and replaced, its InstanceId and RealInstanceId are different. The physical instance ID is needed in such scenarios as getting monitoring data from Barad
    */
    @SerializedName("RealInstanceId")
    @Expose
    private String RealInstanceId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
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
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), 
     * @return ClusterType Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance),
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance),
     * @param ClusterType Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance),
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
     * Get Network type. Valid values: 0 (basic network), 1 (VPC) 
     * @return NetType Network type. Valid values: 0 (basic network), 1 (VPC)
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: 0 (basic network), 1 (VPC)
     * @param NetType Network type. Valid values: 0 (basic network), 1 (VPC)
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
     * Get Instance status. Valid values: 0 (to be initialized), 1 (in process), 2 (running), -2 (expired) 
     * @return Status Instance status. Valid values: 0 (to be initialized), 1 (in process), 2 (running), -2 (expired)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: 0 (to be initialized), 1 (in process), 2 (running), -2 (expired)
     * @param Status Instance status. Valid values: 0 (to be initialized), 1 (in process), 2 (running), -2 (expired)
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
     * Get Instance version information 
     * @return MongoVersion Instance version information
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set Instance version information
     * @param MongoVersion Instance version information
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Instance memory size in MB 
     * @return Memory Instance memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in MB
     * @param Memory Instance memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in MB 
     * @return Volume Instance disk size in MB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in MB
     * @param Volume Instance disk size in MB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Number of CPU cores of an instance 
     * @return CpuNum Number of CPU cores of an instance
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of CPU cores of an instance
     * @param CpuNum Number of CPU cores of an instance
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Instance machine type 
     * @return MachineType Instance machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Instance machine type
     * @param MachineType Instance machine type
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
     * Get Instance auto-renewal flag. Valid values: 0 (manual renewal), 1 (auto-renewal), 2 (no renewal upon expiration) 
     * @return AutoRenewFlag Instance auto-renewal flag. Valid values: 0 (manual renewal), 1 (auto-renewal), 2 (no renewal upon expiration)
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Instance auto-renewal flag. Valid values: 0 (manual renewal), 1 (auto-renewal), 2 (no renewal upon expiration)
     * @param AutoRenewFlag Instance auto-renewal flag. Valid values: 0 (manual renewal), 1 (auto-renewal), 2 (no renewal upon expiration)
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Used capacity in MB 
     * @return UsedVolume Used capacity in MB
     */
    public Long getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * Set Used capacity in MB
     * @param UsedVolume Used capacity in MB
     */
    public void setUsedVolume(Long UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * Get Start time of the maintenance time window 
     * @return MaintenanceStart Start time of the maintenance time window
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * Set Start time of the maintenance time window
     * @param MaintenanceStart Start time of the maintenance time window
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * Get End time of the maintenance time window 
     * @return MaintenanceEnd End time of the maintenance time window
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * Set End time of the maintenance time window
     * @param MaintenanceEnd End time of the maintenance time window
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
     * Get Information of associated instances. For a promoted instance, this field represents information of its temp instance; for a temp instance, this field represents information of its promoted instance; and for a read-only/disaster recovery instance, this field represents information of its primary instance 
     * @return RelatedInstance Information of associated instances. For a promoted instance, this field represents information of its temp instance; for a temp instance, this field represents information of its promoted instance; and for a read-only/disaster recovery instance, this field represents information of its primary instance
     */
    public DBInstanceInfo getRelatedInstance() {
        return this.RelatedInstance;
    }

    /**
     * Set Information of associated instances. For a promoted instance, this field represents information of its temp instance; for a temp instance, this field represents information of its promoted instance; and for a read-only/disaster recovery instance, this field represents information of its primary instance
     * @param RelatedInstance Information of associated instances. For a promoted instance, this field represents information of its temp instance; for a temp instance, this field represents information of its promoted instance; and for a read-only/disaster recovery instance, this field represents information of its primary instance
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
     * Get Instance version tag 
     * @return InstanceVer Instance version tag
     */
    public Long getInstanceVer() {
        return this.InstanceVer;
    }

    /**
     * Set Instance version tag
     * @param InstanceVer Instance version tag
     */
    public void setInstanceVer(Long InstanceVer) {
        this.InstanceVer = InstanceVer;
    }

    /**
     * Get Instance version tag 
     * @return ClusterVer Instance version tag
     */
    public Long getClusterVer() {
        return this.ClusterVer;
    }

    /**
     * Set Instance version tag
     * @param ClusterVer Instance version tag
     */
    public void setClusterVer(Long ClusterVer) {
        this.ClusterVer = ClusterVer;
    }

    /**
     * Get Protocol information. Valid values: 1 (mongodb), 2 (dynamodb) 
     * @return Protocol Protocol information. Valid values: 1 (mongodb), 2 (dynamodb)
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol information. Valid values: 1 (mongodb), 2 (dynamodb)
     * @param Protocol Protocol information. Valid values: 1 (mongodb), 2 (dynamodb)
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Instance type. Valid values: 1 (promoted instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance) 
     * @return InstanceType Instance type. Valid values: 1 (promoted instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: 1 (promoted instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance)
     * @param InstanceType Instance type. Valid values: 1 (promoted instance), 2 (temp instance), 3 (read-only instance), 4 (disaster recovery instance)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status description 
     * @return InstanceStatusDesc Instance status description
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set Instance status description
     * @param InstanceStatusDesc Instance status description
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get Physical instance ID. For an instance that has been rolled back and replaced, its InstanceId and RealInstanceId are different. The physical instance ID is needed in such scenarios as getting monitoring data from Barad 
     * @return RealInstanceId Physical instance ID. For an instance that has been rolled back and replaced, its InstanceId and RealInstanceId are different. The physical instance ID is needed in such scenarios as getting monitoring data from Barad
     */
    public String getRealInstanceId() {
        return this.RealInstanceId;
    }

    /**
     * Set Physical instance ID. For an instance that has been rolled back and replaced, its InstanceId and RealInstanceId are different. The physical instance ID is needed in such scenarios as getting monitoring data from Barad
     * @param RealInstanceId Physical instance ID. For an instance that has been rolled back and replaced, its InstanceId and RealInstanceId are different. The physical instance ID is needed in such scenarios as getting monitoring data from Barad
     */
    public void setRealInstanceId(String RealInstanceId) {
        this.RealInstanceId = RealInstanceId;
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

    }
}

