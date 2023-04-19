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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBInstanceDetailResponse extends AbstractModel{

    /**
    * Instance ID, such as dcdbt-7oaxtcb7.
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
    * Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Current status of the instance
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Instance private IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private port of instance
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Number of instance nodes. Valid values: `2` (1-source-1-replica), `3` (1-source-2-replica).
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Instance region, such as ap-guangzhou.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance VPC ID, such as vpc-r9jr0de3.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID of an instance, such as subnet-6rqs61o2.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * Domain name for public network access, which can be resolved by the public network.
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP address, which can be accessed over the public network.
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * Public network access port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Project ID of the instance
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Automatic renewal flag for an instance. Valid values: `0` (normal renewal), `1` (auto-renewal), `3` (no renewal upon expiration).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Dedicated cluster ID
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * Billing mode. Valid values: `prepaid` (monthly subscription), `postpaid` (pay-as-you-go).
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Creation time of the instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time of the instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Database version information
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Whether the instance supports audit. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
    * Whether data encryption is supported for an instance. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * Instance machine model
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * Instance memory size in GB, which is the sum of the memory of all shards.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk storage size in GB, which is the sum of the disk size of all shards.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance storage space utilization. It is calculated by dividing the sum of the used disk size of all shards by the total disk size of all shards.
    */
    @SerializedName("StorageUsage")
    @Expose
    private Float StorageUsage;

    /**
    * Size of log storage space in GB
    */
    @SerializedName("LogStorage")
    @Expose
    private Long LogStorage;

    /**
    * Product type ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Source AZ
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Replica AZ
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * Shard information
    */
    @SerializedName("Shards")
    @Expose
    private ShardBriefInfo [] Shards;

    /**
    * Private network IPv6 address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * Number of CPU cores of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance QPS
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Database engine
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * Whether IPv6 is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Public IPv6 address, which can be accessed over the public network
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * Public network IPv6 port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * Tag information
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * DCN type. Valid values: `0` (N/A), `1` (source instance), `2` (disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN status. Valid values: `0` (N/A), `1` (creating), `2` (syncing), `3` (disconnected).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * The number of DCN disaster recovery instances
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery read-only instance), `4` (dedicated disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Whether the instance supports setting the connection limit, which is not supported for kernel version 10.1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMaxUserConnectionsSupported")
    @Expose
    private Boolean IsMaxUserConnectionsSupported;

    /**
    * The displayed database version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * Encryption status. Valid values: `0` (disabled), `1` (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptStatus")
    @Expose
    private Long EncryptStatus;

    /**
    * Type of dedicated cluster. Valid values: `0` (public cloud), `1` (finance cage), `2` (CDC cluster).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * Nearby VPC access
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RsAccessStrategy")
    @Expose
    private Long RsAccessStrategy;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID, such as dcdbt-7oaxtcb7. 
     * @return InstanceId Instance ID, such as dcdbt-7oaxtcb7.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as dcdbt-7oaxtcb7.
     * @param InstanceId Instance ID, such as dcdbt-7oaxtcb7.
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
     * Get Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated). 
     * @return Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated).
     * @param Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Current status of the instance 
     * @return StatusDesc Current status of the instance
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Current status of the instance
     * @param StatusDesc Current status of the instance
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Instance private IP address 
     * @return Vip Instance private IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance private IP address
     * @param Vip Instance private IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private port of instance 
     * @return Vport Private port of instance
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private port of instance
     * @param Vport Private port of instance
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Number of instance nodes. Valid values: `2` (1-source-1-replica), `3` (1-source-2-replica). 
     * @return NodeCount Number of instance nodes. Valid values: `2` (1-source-1-replica), `3` (1-source-2-replica).
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of instance nodes. Valid values: `2` (1-source-1-replica), `3` (1-source-2-replica).
     * @param NodeCount Number of instance nodes. Valid values: `2` (1-source-1-replica), `3` (1-source-2-replica).
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Instance region, such as ap-guangzhou. 
     * @return Region Instance region, such as ap-guangzhou.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region, such as ap-guangzhou.
     * @param Region Instance region, such as ap-guangzhou.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance VPC ID, such as vpc-r9jr0de3. 
     * @return VpcId Instance VPC ID, such as vpc-r9jr0de3.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Instance VPC ID, such as vpc-r9jr0de3.
     * @param VpcId Instance VPC ID, such as vpc-r9jr0de3.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID of an instance, such as subnet-6rqs61o2. 
     * @return SubnetId VPC subnet ID of an instance, such as subnet-6rqs61o2.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID of an instance, such as subnet-6rqs61o2.
     * @param SubnetId VPC subnet ID of an instance, such as subnet-6rqs61o2.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling). 
     * @return WanStatus Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
     * @param WanStatus Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Domain name for public network access, which can be resolved by the public network. 
     * @return WanDomain Domain name for public network access, which can be resolved by the public network.
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Domain name for public network access, which can be resolved by the public network.
     * @param WanDomain Domain name for public network access, which can be resolved by the public network.
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP address, which can be accessed over the public network. 
     * @return WanVip Public IP address, which can be accessed over the public network.
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set Public IP address, which can be accessed over the public network.
     * @param WanVip Public IP address, which can be accessed over the public network.
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get Public network access port 
     * @return WanPort Public network access port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network access port
     * @param WanPort Public network access port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Project ID of the instance 
     * @return ProjectId Project ID of the instance
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of the instance
     * @param ProjectId Project ID of the instance
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Automatic renewal flag for an instance. Valid values: `0` (normal renewal), `1` (auto-renewal), `3` (no renewal upon expiration). 
     * @return AutoRenewFlag Automatic renewal flag for an instance. Valid values: `0` (normal renewal), `1` (auto-renewal), `3` (no renewal upon expiration).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Automatic renewal flag for an instance. Valid values: `0` (normal renewal), `1` (auto-renewal), `3` (no renewal upon expiration).
     * @param AutoRenewFlag Automatic renewal flag for an instance. Valid values: `0` (normal renewal), `1` (auto-renewal), `3` (no renewal upon expiration).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Dedicated cluster ID 
     * @return ExclusterId Dedicated cluster ID
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set Dedicated cluster ID
     * @param ExclusterId Dedicated cluster ID
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get Billing mode. Valid values: `prepaid` (monthly subscription), `postpaid` (pay-as-you-go). 
     * @return PayMode Billing mode. Valid values: `prepaid` (monthly subscription), `postpaid` (pay-as-you-go).
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values: `prepaid` (monthly subscription), `postpaid` (pay-as-you-go).
     * @param PayMode Billing mode. Valid values: `prepaid` (monthly subscription), `postpaid` (pay-as-you-go).
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Creation time of the instance in the format of 2006-01-02 15:04:05 
     * @return CreateTime Creation time of the instance in the format of 2006-01-02 15:04:05
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the instance in the format of 2006-01-02 15:04:05
     * @param CreateTime Creation time of the instance in the format of 2006-01-02 15:04:05
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time of the instance in the format of 2006-01-02 15:04:05 
     * @return PeriodEndTime Expiration time of the instance in the format of 2006-01-02 15:04:05
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time of the instance in the format of 2006-01-02 15:04:05
     * @param PeriodEndTime Expiration time of the instance in the format of 2006-01-02 15:04:05
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Database version information 
     * @return DbVersion Database version information
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version information
     * @param DbVersion Database version information
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Whether the instance supports audit. Valid values: `1` (yes), `0` (no). 
     * @return IsAuditSupported Whether the instance supports audit. Valid values: `1` (yes), `0` (no).
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set Whether the instance supports audit. Valid values: `1` (yes), `0` (no).
     * @param IsAuditSupported Whether the instance supports audit. Valid values: `1` (yes), `0` (no).
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get Whether data encryption is supported for an instance. Valid values: `1` (yes), `0` (no). 
     * @return IsEncryptSupported Whether data encryption is supported for an instance. Valid values: `1` (yes), `0` (no).
     */
    public Long getIsEncryptSupported() {
        return this.IsEncryptSupported;
    }

    /**
     * Set Whether data encryption is supported for an instance. Valid values: `1` (yes), `0` (no).
     * @param IsEncryptSupported Whether data encryption is supported for an instance. Valid values: `1` (yes), `0` (no).
     */
    public void setIsEncryptSupported(Long IsEncryptSupported) {
        this.IsEncryptSupported = IsEncryptSupported;
    }

    /**
     * Get Instance machine model 
     * @return Machine Instance machine model
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set Instance machine model
     * @param Machine Instance machine model
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get Instance memory size in GB, which is the sum of the memory of all shards. 
     * @return Memory Instance memory size in GB, which is the sum of the memory of all shards.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB, which is the sum of the memory of all shards.
     * @param Memory Instance memory size in GB, which is the sum of the memory of all shards.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk storage size in GB, which is the sum of the disk size of all shards. 
     * @return Storage Instance disk storage size in GB, which is the sum of the disk size of all shards.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk storage size in GB, which is the sum of the disk size of all shards.
     * @param Storage Instance disk storage size in GB, which is the sum of the disk size of all shards.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance storage space utilization. It is calculated by dividing the sum of the used disk size of all shards by the total disk size of all shards. 
     * @return StorageUsage Instance storage space utilization. It is calculated by dividing the sum of the used disk size of all shards by the total disk size of all shards.
     */
    public Float getStorageUsage() {
        return this.StorageUsage;
    }

    /**
     * Set Instance storage space utilization. It is calculated by dividing the sum of the used disk size of all shards by the total disk size of all shards.
     * @param StorageUsage Instance storage space utilization. It is calculated by dividing the sum of the used disk size of all shards by the total disk size of all shards.
     */
    public void setStorageUsage(Float StorageUsage) {
        this.StorageUsage = StorageUsage;
    }

    /**
     * Get Size of log storage space in GB 
     * @return LogStorage Size of log storage space in GB
     */
    public Long getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set Size of log storage space in GB
     * @param LogStorage Size of log storage space in GB
     */
    public void setLogStorage(Long LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get Product type ID 
     * @return Pid Product type ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product type ID
     * @param Pid Product type ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Source AZ 
     * @return MasterZone Source AZ
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Source AZ
     * @param MasterZone Source AZ
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Replica AZ 
     * @return SlaveZones Replica AZ
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Replica AZ
     * @param SlaveZones Replica AZ
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get Shard information 
     * @return Shards Shard information
     */
    public ShardBriefInfo [] getShards() {
        return this.Shards;
    }

    /**
     * Set Shard information
     * @param Shards Shard information
     */
    public void setShards(ShardBriefInfo [] Shards) {
        this.Shards = Shards;
    }

    /**
     * Get Private network IPv6 address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip6 Private network IPv6 address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set Private network IPv6 address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip6 Private network IPv6 address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get Number of CPU cores of an instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPU cores of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPU cores of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance QPS
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Qps Instance QPS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Instance QPS
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Qps Instance QPS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Database engine
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbEngine Database engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set Database engine
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbEngine Database engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get Whether IPv6 is supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6Flag Whether IPv6 is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Whether IPv6 is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv6Flag Whether IPv6 is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get Public IPv6 address, which can be accessed over the public network
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanVipv6 Public IPv6 address, which can be accessed over the public network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set Public IPv6 address, which can be accessed over the public network
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanVipv6 Public IPv6 address, which can be accessed over the public network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanStatusIpv6 Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanStatusIpv6 Public network status. Valid values: `0` (not enabled), `1` (enabled), `2` (disabled), `3`: (enabling), `4` (disabling).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
    }

    /**
     * Get Public network IPv6 port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanPortIpv6 Public network IPv6 port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set Public network IPv6 port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanPortIpv6 Public network IPv6 port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get Tag information 
     * @return ResourceTags Tag information
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Tag information
     * @param ResourceTags Tag information
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get DCN type. Valid values: `0` (N/A), `1` (source instance), `2` (disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DcnFlag DCN type. Valid values: `0` (N/A), `1` (source instance), `2` (disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN type. Valid values: `0` (N/A), `1` (source instance), `2` (disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DcnFlag DCN type. Valid values: `0` (N/A), `1` (source instance), `2` (disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN status. Valid values: `0` (N/A), `1` (creating), `2` (syncing), `3` (disconnected).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DcnStatus DCN status. Valid values: `0` (N/A), `1` (creating), `2` (syncing), `3` (disconnected).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN status. Valid values: `0` (N/A), `1` (creating), `2` (syncing), `3` (disconnected).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DcnStatus DCN status. Valid values: `0` (N/A), `1` (creating), `2` (syncing), `3` (disconnected).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get The number of DCN disaster recovery instances
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DcnDstNum The number of DCN disaster recovery instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set The number of DCN disaster recovery instances
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DcnDstNum The number of DCN disaster recovery instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery read-only instance), `4` (dedicated disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery read-only instance), `4` (dedicated disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery read-only instance), `4` (dedicated disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery read-only instance), `4` (dedicated disaster recovery read-only instance)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Whether the instance supports setting the connection limit, which is not supported for kernel version 10.1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsMaxUserConnectionsSupported Whether the instance supports setting the connection limit, which is not supported for kernel version 10.1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsMaxUserConnectionsSupported() {
        return this.IsMaxUserConnectionsSupported;
    }

    /**
     * Set Whether the instance supports setting the connection limit, which is not supported for kernel version 10.1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsMaxUserConnectionsSupported Whether the instance supports setting the connection limit, which is not supported for kernel version 10.1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsMaxUserConnectionsSupported(Boolean IsMaxUserConnectionsSupported) {
        this.IsMaxUserConnectionsSupported = IsMaxUserConnectionsSupported;
    }

    /**
     * Get The displayed database version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbVersionId The displayed database version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set The displayed database version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbVersionId The displayed database version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get Encryption status. Valid values: `0` (disabled), `1` (enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptStatus Encryption status. Valid values: `0` (disabled), `1` (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEncryptStatus() {
        return this.EncryptStatus;
    }

    /**
     * Set Encryption status. Valid values: `0` (disabled), `1` (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptStatus Encryption status. Valid values: `0` (disabled), `1` (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptStatus(Long EncryptStatus) {
        this.EncryptStatus = EncryptStatus;
    }

    /**
     * Get Type of dedicated cluster. Valid values: `0` (public cloud), `1` (finance cage), `2` (CDC cluster).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExclusterType Type of dedicated cluster. Valid values: `0` (public cloud), `1` (finance cage), `2` (CDC cluster).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set Type of dedicated cluster. Valid values: `0` (public cloud), `1` (finance cage), `2` (CDC cluster).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExclusterType Type of dedicated cluster. Valid values: `0` (public cloud), `1` (finance cage), `2` (CDC cluster).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get Nearby VPC access
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RsAccessStrategy Nearby VPC access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRsAccessStrategy() {
        return this.RsAccessStrategy;
    }

    /**
     * Set Nearby VPC access
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RsAccessStrategy Nearby VPC access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRsAccessStrategy(Long RsAccessStrategy) {
        this.RsAccessStrategy = RsAccessStrategy;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDCDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBInstanceDetailResponse(DescribeDCDBInstanceDetailResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanVip != null) {
            this.WanVip = new String(source.WanVip);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ExclusterId != null) {
            this.ExclusterId = new String(source.ExclusterId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.IsAuditSupported != null) {
            this.IsAuditSupported = new Long(source.IsAuditSupported);
        }
        if (source.IsEncryptSupported != null) {
            this.IsEncryptSupported = new Long(source.IsEncryptSupported);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageUsage != null) {
            this.StorageUsage = new Float(source.StorageUsage);
        }
        if (source.LogStorage != null) {
            this.LogStorage = new Long(source.LogStorage);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.Shards != null) {
            this.Shards = new ShardBriefInfo[source.Shards.length];
            for (int i = 0; i < source.Shards.length; i++) {
                this.Shards[i] = new ShardBriefInfo(source.Shards[i]);
            }
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.WanVipv6 != null) {
            this.WanVipv6 = new String(source.WanVipv6);
        }
        if (source.WanStatusIpv6 != null) {
            this.WanStatusIpv6 = new Long(source.WanStatusIpv6);
        }
        if (source.WanPortIpv6 != null) {
            this.WanPortIpv6 = new Long(source.WanPortIpv6);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.DcnStatus != null) {
            this.DcnStatus = new Long(source.DcnStatus);
        }
        if (source.DcnDstNum != null) {
            this.DcnDstNum = new Long(source.DcnDstNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsMaxUserConnectionsSupported != null) {
            this.IsMaxUserConnectionsSupported = new Boolean(source.IsMaxUserConnectionsSupported);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.EncryptStatus != null) {
            this.EncryptStatus = new Long(source.EncryptStatus);
        }
        if (source.ExclusterType != null) {
            this.ExclusterType = new Long(source.ExclusterType);
        }
        if (source.RsAccessStrategy != null) {
            this.RsAccessStrategy = new Long(source.RsAccessStrategy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "IsEncryptSupported", this.IsEncryptSupported);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageUsage", this.StorageUsage);
        this.setParamSimple(map, prefix + "LogStorage", this.LogStorage);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "Shards.", this.Shards);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "WanVipv6", this.WanVipv6);
        this.setParamSimple(map, prefix + "WanStatusIpv6", this.WanStatusIpv6);
        this.setParamSimple(map, prefix + "WanPortIpv6", this.WanPortIpv6);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "DcnDstNum", this.DcnDstNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsMaxUserConnectionsSupported", this.IsMaxUserConnectionsSupported);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "EncryptStatus", this.EncryptStatus);
        this.setParamSimple(map, prefix + "ExclusterType", this.ExclusterType);
        this.setParamSimple(map, prefix + "RsAccessStrategy", this.RsAccessStrategy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

