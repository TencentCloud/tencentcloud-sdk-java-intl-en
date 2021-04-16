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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * Public network access status. Value range: 0 (not enabled), 1 (enabled), 2 (disabled)
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * AZ information
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Initialization flag. Value range: 0 (not initialized), 1 (initialized)
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * VIP information of a read-only instance. This field is exclusive to read-only instances where read-only access is enabled separately
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoVipInfo")
    @Expose
    private RoVipInfo RoVipInfo;

    /**
    * Memory capacity in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance status. Value range: 0 (creating), 1 (running), 4 (isolating), 5 (isolated)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * VPC ID, such as 51102
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Information of a secondary server
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveInfo")
    @Expose
    private SlaveInfo SlaveInfo;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Disk capacity in GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Auto-renewal flag. Value range: 0 (auto-renewal not enabled), 1 (auto-renewal enabled), 2 (auto-renewal disabled)
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync)
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Details of a read-only group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoGroups")
    @Expose
    private RoGroup [] RoGroups;

    /**
    * Subnet ID, such as 2333
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance expiration time
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * AZ deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ)
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Instance task status. 0 - no task; 1 - upgrading; 2 - importing data; 3 - activating secondary; 4 - enabling public network access; 5 - batch operation in progress; 6 - rolling back; 7 - disabling public network access; 8 - changing password; 9 - renaming instance; 10 - restarting; 12 - migrating self-built instance; 13 - dropping table; 14 - creating and syncing disaster recovery instance; 15 - pending upgrade and switch; 16 - upgrade and switch in progress; 17 - upgrade and switch completed
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Details of a primary instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterInfo")
    @Expose
    private MasterInfo MasterInfo;

    /**
    * Instance type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Kernel version
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Details of a disaster recovery instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DrInfo")
    @Expose
    private DrInfo [] DrInfo;

    /**
    * Public domain name
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public network port number
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Billing type
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
    * Lock flag
    */
    @SerializedName("CdbError")
    @Expose
    private Long CdbError;

    /**
    * VPC descriptor, such as "vpc-5v8wn9mg"
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet descriptor, such as "subnet-1typ0s7d"
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Physical ID
    */
    @SerializedName("PhysicalId")
    @Expose
    private String PhysicalId;

    /**
    * Number of cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Queries per second
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * AZ name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Physical machine model
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * Placement group ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * AZ ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Number of nodes
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
     * Get Public network access status. Value range: 0 (not enabled), 1 (enabled), 2 (disabled) 
     * @return WanStatus Public network access status. Value range: 0 (not enabled), 1 (enabled), 2 (disabled)
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network access status. Value range: 0 (not enabled), 1 (enabled), 2 (disabled)
     * @param WanStatus Public network access status. Value range: 0 (not enabled), 1 (enabled), 2 (disabled)
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
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
     * Get Initialization flag. Value range: 0 (not initialized), 1 (initialized) 
     * @return InitFlag Initialization flag. Value range: 0 (not initialized), 1 (initialized)
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set Initialization flag. Value range: 0 (not initialized), 1 (initialized)
     * @param InitFlag Initialization flag. Value range: 0 (not initialized), 1 (initialized)
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get VIP information of a read-only instance. This field is exclusive to read-only instances where read-only access is enabled separately
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoVipInfo VIP information of a read-only instance. This field is exclusive to read-only instances where read-only access is enabled separately
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RoVipInfo getRoVipInfo() {
        return this.RoVipInfo;
    }

    /**
     * Set VIP information of a read-only instance. This field is exclusive to read-only instances where read-only access is enabled separately
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoVipInfo VIP information of a read-only instance. This field is exclusive to read-only instances where read-only access is enabled separately
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoVipInfo(RoVipInfo RoVipInfo) {
        this.RoVipInfo = RoVipInfo;
    }

    /**
     * Get Memory capacity in MB 
     * @return Memory Memory capacity in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity in MB
     * @param Memory Memory capacity in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance status. Value range: 0 (creating), 1 (running), 4 (isolating), 5 (isolated) 
     * @return Status Instance status. Value range: 0 (creating), 1 (running), 4 (isolating), 5 (isolated)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Value range: 0 (creating), 1 (running), 4 (isolating), 5 (isolated)
     * @param Status Instance status. Value range: 0 (creating), 1 (running), 4 (isolating), 5 (isolated)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get VPC ID, such as 51102 
     * @return VpcId VPC ID, such as 51102
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, such as 51102
     * @param VpcId VPC ID, such as 51102
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Information of a secondary server
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveInfo Information of a secondary server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SlaveInfo getSlaveInfo() {
        return this.SlaveInfo;
    }

    /**
     * Set Information of a secondary server
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveInfo Information of a secondary server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveInfo(SlaveInfo SlaveInfo) {
        this.SlaveInfo = SlaveInfo;
    }

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
     * Get Disk capacity in GB 
     * @return Volume Disk capacity in GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk capacity in GB
     * @param Volume Disk capacity in GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Auto-renewal flag. Value range: 0 (auto-renewal not enabled), 1 (auto-renewal enabled), 2 (auto-renewal disabled) 
     * @return AutoRenew Auto-renewal flag. Value range: 0 (auto-renewal not enabled), 1 (auto-renewal enabled), 2 (auto-renewal disabled)
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Auto-renewal flag. Value range: 0 (auto-renewal not enabled), 1 (auto-renewal enabled), 2 (auto-renewal disabled)
     * @param AutoRenew Auto-renewal flag. Value range: 0 (auto-renewal not enabled), 1 (auto-renewal enabled), 2 (auto-renewal disabled)
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync) 
     * @return ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync)
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync)
     * @param ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync)
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Details of a read-only group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoGroups Details of a read-only group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RoGroup [] getRoGroups() {
        return this.RoGroups;
    }

    /**
     * Set Details of a read-only group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoGroups Details of a read-only group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoGroups(RoGroup [] RoGroups) {
        this.RoGroups = RoGroups;
    }

    /**
     * Get Subnet ID, such as 2333 
     * @return SubnetId Subnet ID, such as 2333
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID, such as 2333
     * @param SubnetId Subnet ID, such as 2333
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only) 
     * @return InstanceType Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only)
     * @param InstanceType Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get Instance expiration time 
     * @return DeadlineTime Instance expiration time
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Instance expiration time
     * @param DeadlineTime Instance expiration time
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get AZ deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ) 
     * @return DeployMode AZ deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ)
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set AZ deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ)
     * @param DeployMode AZ deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ)
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Instance task status. 0 - no task; 1 - upgrading; 2 - importing data; 3 - activating secondary; 4 - enabling public network access; 5 - batch operation in progress; 6 - rolling back; 7 - disabling public network access; 8 - changing password; 9 - renaming instance; 10 - restarting; 12 - migrating self-built instance; 13 - dropping table; 14 - creating and syncing disaster recovery instance; 15 - pending upgrade and switch; 16 - upgrade and switch in progress; 17 - upgrade and switch completed 
     * @return TaskStatus Instance task status. 0 - no task; 1 - upgrading; 2 - importing data; 3 - activating secondary; 4 - enabling public network access; 5 - batch operation in progress; 6 - rolling back; 7 - disabling public network access; 8 - changing password; 9 - renaming instance; 10 - restarting; 12 - migrating self-built instance; 13 - dropping table; 14 - creating and syncing disaster recovery instance; 15 - pending upgrade and switch; 16 - upgrade and switch in progress; 17 - upgrade and switch completed
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Instance task status. 0 - no task; 1 - upgrading; 2 - importing data; 3 - activating secondary; 4 - enabling public network access; 5 - batch operation in progress; 6 - rolling back; 7 - disabling public network access; 8 - changing password; 9 - renaming instance; 10 - restarting; 12 - migrating self-built instance; 13 - dropping table; 14 - creating and syncing disaster recovery instance; 15 - pending upgrade and switch; 16 - upgrade and switch in progress; 17 - upgrade and switch completed
     * @param TaskStatus Instance task status. 0 - no task; 1 - upgrading; 2 - importing data; 3 - activating secondary; 4 - enabling public network access; 5 - batch operation in progress; 6 - rolling back; 7 - disabling public network access; 8 - changing password; 9 - renaming instance; 10 - restarting; 12 - migrating self-built instance; 13 - dropping table; 14 - creating and syncing disaster recovery instance; 15 - pending upgrade and switch; 16 - upgrade and switch in progress; 17 - upgrade and switch completed
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Details of a primary instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterInfo Details of a primary instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MasterInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set Details of a primary instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterInfo Details of a primary instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterInfo(MasterInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get Instance type 
     * @return DeviceType Instance type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance type
     * @param DeviceType Instance type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Kernel version 
     * @return EngineVersion Kernel version
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Kernel version
     * @param EngineVersion Kernel version
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
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
     * Get Details of a disaster recovery instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DrInfo Details of a disaster recovery instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DrInfo [] getDrInfo() {
        return this.DrInfo;
    }

    /**
     * Set Details of a disaster recovery instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DrInfo Details of a disaster recovery instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDrInfo(DrInfo [] DrInfo) {
        this.DrInfo = DrInfo;
    }

    /**
     * Get Public domain name 
     * @return WanDomain Public domain name
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public domain name
     * @param WanDomain Public domain name
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public network port number 
     * @return WanPort Public network port number
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port number
     * @param WanPort Public network port number
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Billing type 
     * @return PayType Billing type
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing type
     * @param PayType Billing type
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
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
     * Get Lock flag 
     * @return CdbError Lock flag
     */
    public Long getCdbError() {
        return this.CdbError;
    }

    /**
     * Set Lock flag
     * @param CdbError Lock flag
     */
    public void setCdbError(Long CdbError) {
        this.CdbError = CdbError;
    }

    /**
     * Get VPC descriptor, such as "vpc-5v8wn9mg" 
     * @return UniqVpcId VPC descriptor, such as "vpc-5v8wn9mg"
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC descriptor, such as "vpc-5v8wn9mg"
     * @param UniqVpcId VPC descriptor, such as "vpc-5v8wn9mg"
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet descriptor, such as "subnet-1typ0s7d" 
     * @return UniqSubnetId Subnet descriptor, such as "subnet-1typ0s7d"
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet descriptor, such as "subnet-1typ0s7d"
     * @param UniqSubnetId Subnet descriptor, such as "subnet-1typ0s7d"
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Physical ID 
     * @return PhysicalId Physical ID
     */
    public String getPhysicalId() {
        return this.PhysicalId;
    }

    /**
     * Set Physical ID
     * @param PhysicalId Physical ID
     */
    public void setPhysicalId(String PhysicalId) {
        this.PhysicalId = PhysicalId;
    }

    /**
     * Get Number of cores 
     * @return Cpu Number of cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of cores
     * @param Cpu Number of cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Queries per second 
     * @return Qps Queries per second
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Queries per second
     * @param Qps Queries per second
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get AZ name 
     * @return ZoneName AZ name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
     * @param ZoneName AZ name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Physical machine model
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeviceClass Physical machine model
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set Physical machine model
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeviceClass Physical machine model
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get Placement group ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeployGroupId Placement group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set Placement group ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeployGroupId Placement group ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get AZ ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId AZ ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneId AZ ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Number of nodes 
     * @return InstanceNodes Number of nodes
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set Number of nodes
     * @param InstanceNodes Number of nodes
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamObj(map, prefix + "RoVipInfo.", this.RoVipInfo);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "SlaveInfo.", this.SlaveInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamArrayObj(map, prefix + "RoGroups.", this.RoGroups);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "MasterInfo.", this.MasterInfo);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "DrInfo.", this.DrInfo);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CdbError", this.CdbError);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "PhysicalId", this.PhysicalId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);

    }
}

