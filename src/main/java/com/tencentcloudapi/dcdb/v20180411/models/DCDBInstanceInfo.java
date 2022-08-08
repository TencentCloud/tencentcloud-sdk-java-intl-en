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

public class DCDBInstanceInfo extends AbstractModel{

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
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Numeric ID of a VPC
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet Digital ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Private IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Auto-renewal flag
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of shards
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * Expiration time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Isolation time
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * Account ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Shard details
    */
    @SerializedName("ShardDetail")
    @Expose
    private ShardInfo [] ShardDetail;

    /**
    * Number of nodes. 2: one master and one slave; 3: one master and two slaves
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Temporary instance flag. 0: non-temporary instance
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * Dedicated cluster ID. If this parameter is empty, the instance is a non-dedicated cluster instance
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * VPC ID in string type
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * VPC subnet ID in string type
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Numeric ID of instance (this field is obsolete and should not be depended on)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Domain name for public network access, which can be resolved by the public network
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP address, which can be accessed over the public network
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * Public network port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Product type ID (this field is obsolete and should not be depended on)
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Last updated time of an instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Database engine
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * Database engine version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Billing mode
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Locker")
    @Expose
    private Long Locker;

    /**
    * Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * Whether the instance supports audit. 1: yes; 0: no
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * Instance type. Valid values: `1` (dedicated primary instance), `2` (standard primary instance), `3` (standard disaster recovery instance), `4` (dedicated disaster recovery instance)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * Database engine version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

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
     * Get Application ID 
     * @return AppId Application ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Numeric ID of a VPC 
     * @return VpcId Numeric ID of a VPC
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Numeric ID of a VPC
     * @param VpcId Numeric ID of a VPC
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet Digital ID 
     * @return SubnetId Subnet Digital ID
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet Digital ID
     * @param SubnetId Subnet Digital ID
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Status description 
     * @return StatusDesc Status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description
     * @param StatusDesc Status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data) 
     * @return Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     * @param Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Private IP 
     * @return Vip Private IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP
     * @param Vip Private IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port 
     * @return Vport Private network port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port
     * @param Vport Private network port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Auto-renewal flag 
     * @return AutoRenewFlag Auto-renewal flag
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag
     * @param AutoRenewFlag Auto-renewal flag
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity in GB 
     * @return Storage Storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB
     * @param Storage Storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of shards 
     * @return ShardCount Number of shards
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set Number of shards
     * @param ShardCount Number of shards
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get Expiration time 
     * @return PeriodEndTime Expiration time
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time
     * @param PeriodEndTime Expiration time
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Isolation time 
     * @return IsolatedTimestamp Isolation time
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set Isolation time
     * @param IsolatedTimestamp Isolation time
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get Account ID 
     * @return Uin Account ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account ID
     * @param Uin Account ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Shard details 
     * @return ShardDetail Shard details
     */
    public ShardInfo [] getShardDetail() {
        return this.ShardDetail;
    }

    /**
     * Set Shard details
     * @param ShardDetail Shard details
     */
    public void setShardDetail(ShardInfo [] ShardDetail) {
        this.ShardDetail = ShardDetail;
    }

    /**
     * Get Number of nodes. 2: one master and one slave; 3: one master and two slaves 
     * @return NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one master and one slave; 3: one master and two slaves
     * @param NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Temporary instance flag. 0: non-temporary instance 
     * @return IsTmp Temporary instance flag. 0: non-temporary instance
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set Temporary instance flag. 0: non-temporary instance
     * @param IsTmp Temporary instance flag. 0: non-temporary instance
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get Dedicated cluster ID. If this parameter is empty, the instance is a non-dedicated cluster instance 
     * @return ExclusterId Dedicated cluster ID. If this parameter is empty, the instance is a non-dedicated cluster instance
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set Dedicated cluster ID. If this parameter is empty, the instance is a non-dedicated cluster instance
     * @param ExclusterId Dedicated cluster ID. If this parameter is empty, the instance is a non-dedicated cluster instance
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get VPC ID in string type 
     * @return UniqueVpcId VPC ID in string type
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set VPC ID in string type
     * @param UniqueVpcId VPC ID in string type
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get VPC subnet ID in string type 
     * @return UniqueSubnetId VPC subnet ID in string type
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set VPC subnet ID in string type
     * @param UniqueSubnetId VPC subnet ID in string type
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Numeric ID of instance (this field is obsolete and should not be depended on) 
     * @return Id Numeric ID of instance (this field is obsolete and should not be depended on)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Numeric ID of instance (this field is obsolete and should not be depended on)
     * @param Id Numeric ID of instance (this field is obsolete and should not be depended on)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Domain name for public network access, which can be resolved by the public network 
     * @return WanDomain Domain name for public network access, which can be resolved by the public network
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Domain name for public network access, which can be resolved by the public network
     * @param WanDomain Domain name for public network access, which can be resolved by the public network
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP address, which can be accessed over the public network 
     * @return WanVip Public IP address, which can be accessed over the public network
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set Public IP address, which can be accessed over the public network
     * @param WanVip Public IP address, which can be accessed over the public network
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get Public network port 
     * @return WanPort Public network port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port
     * @param WanPort Public network port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Product type ID (this field is obsolete and should not be depended on) 
     * @return Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product type ID (this field is obsolete and should not be depended on)
     * @param Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Last updated time of an instance in the format of 2006-01-02 15:04:05 
     * @return UpdateTime Last updated time of an instance in the format of 2006-01-02 15:04:05
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last updated time of an instance in the format of 2006-01-02 15:04:05
     * @param UpdateTime Last updated time of an instance in the format of 2006-01-02 15:04:05
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Database engine 
     * @return DbEngine Database engine
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set Database engine
     * @param DbEngine Database engine
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get Database engine version 
     * @return DbVersion Database engine version
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database engine version
     * @param DbVersion Database engine version
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Billing mode 
     * @return Paymode Billing mode
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing mode
     * @param Paymode Billing mode
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Locker Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLocker() {
        return this.Locker;
    }

    /**
     * Set Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Locker Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocker(Long Locker) {
        this.Locker = Locker;
    }

    /**
     * Get Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling 
     * @return WanStatus Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     * @param WanStatus Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Whether the instance supports audit. 1: yes; 0: no 
     * @return IsAuditSupported Whether the instance supports audit. 1: yes; 0: no
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set Whether the instance supports audit. 1: yes; 0: no
     * @param IsAuditSupported Whether the instance supports audit. 1: yes; 0: no
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6Flag Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ipv6Flag Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Vipv6 Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Vipv6 Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanVipv6 Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanVipv6 Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanPortIpv6 Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanPortIpv6 Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanStatusIpv6 Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanStatusIpv6 Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
    }

    /**
     * Get DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnFlag DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnFlag DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnStatus DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnStatus DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnDstNum The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnDstNum The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get Instance type. Valid values: `1` (dedicated primary instance), `2` (standard primary instance), `3` (standard disaster recovery instance), `4` (dedicated disaster recovery instance)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (standard primary instance), `3` (standard disaster recovery instance), `4` (dedicated disaster recovery instance)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: `1` (dedicated primary instance), `2` (standard primary instance), `3` (standard disaster recovery instance), `4` (dedicated disaster recovery instance)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (standard primary instance), `3` (standard disaster recovery instance), `4` (dedicated disaster recovery instance)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceTags Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceTags Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database engine version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbVersionId Database engine version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set Database engine version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbVersionId Database engine version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    public DCDBInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCDBInstanceInfo(DCDBInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
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
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.IsolatedTimestamp != null) {
            this.IsolatedTimestamp = new String(source.IsolatedTimestamp);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ShardDetail != null) {
            this.ShardDetail = new ShardInfo[source.ShardDetail.length];
            for (int i = 0; i < source.ShardDetail.length; i++) {
                this.ShardDetail[i] = new ShardInfo(source.ShardDetail[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.IsTmp != null) {
            this.IsTmp = new Long(source.IsTmp);
        }
        if (source.ExclusterId != null) {
            this.ExclusterId = new String(source.ExclusterId);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.Locker != null) {
            this.Locker = new Long(source.Locker);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.IsAuditSupported != null) {
            this.IsAuditSupported = new Long(source.IsAuditSupported);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.WanVipv6 != null) {
            this.WanVipv6 = new String(source.WanVipv6);
        }
        if (source.WanPortIpv6 != null) {
            this.WanPortIpv6 = new Long(source.WanPortIpv6);
        }
        if (source.WanStatusIpv6 != null) {
            this.WanStatusIpv6 = new Long(source.WanStatusIpv6);
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArrayObj(map, prefix + "ShardDetail.", this.ShardDetail);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "WanVipv6", this.WanVipv6);
        this.setParamSimple(map, prefix + "WanPortIpv6", this.WanPortIpv6);
        this.setParamSimple(map, prefix + "WanStatusIpv6", this.WanStatusIpv6);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "DcnDstNum", this.DcnDstNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);

    }
}

