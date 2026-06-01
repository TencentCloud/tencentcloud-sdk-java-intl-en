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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>Public network status. Possible returned values: 0 - External network not enabled; 1 - Public network enabled; 2 - Public network disabled</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * <p>AZ information</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Initialization flag. Possible returned values: 0 - uninitialized; 1 - initialized.</p>
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * <p>Read-only vip information. This field is available only for read-only instances with separate instance access enabled.</p>
    */
    @SerializedName("RoVipInfo")
    @Expose
    private RoVipInfo RoVipInfo;

    /**
    * <p>Memory capacity, in MB.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance status. Valid values: 0: creating; 1: running; 4: isolation operation in progress; 5: isolated.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>VPC ID, for example: 51102</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>Secondary server information</p>
    */
    @SerializedName("SlaveInfo")
    @Expose
    private SlaveInfo SlaveInfo;

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Disk capacity, in GB.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Auto-renewal flag. Possible returned values: 0 - auto-renewal is not enabled; 1 - auto-renewal is enabled; 2 - automatic renewal is disabled.</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Data replication mode. 0 - async replication; 1 - semi-sync replication; 2 - strong sync replication</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>Read-only group detailed information</p>
    */
    @SerializedName("RoGroups")
    @Expose
    private RoGroup [] RoGroups;

    /**
    * <p>Subnet ID, for example: 2333</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>Instance type. Possible returned values: 1 - Primary instance; 2 - Disaster recovery instance; 3 - Read-only instance.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Regional information</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Instance expiration time</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>Availability Zone Deployment method. Valid values: 0 - single availability zone; 1 - multi-availability zone.</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>Instance task status. 0 - No tasks, 1 - Upgrading, 2 - Data import, 3 - Opening Slave, 4 - Public network access enabling, 5 - Batch operation executing, 6 - Rolling back, 7 - Public network access disabling, 8 - Password modification, 9 - Renaming instance, 10 - Restarting, 12 - Self-built migration, 13 - Database deletion, 14 - Disaster recovery instance creation sync, 15 - Upgrade pending switch, 16 - Upgrade and switch, 17 - Upgrade and switch completed</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>Detailed information about the primary instance.</p>
    */
    @SerializedName("MasterInfo")
    @Expose
    private MasterInfo MasterInfo;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Kernel version</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Disaster recovery instance details</p>
    */
    @SerializedName("DrInfo")
    @Expose
    private DrInfo [] DrInfo;

    /**
    * <p>public network domain name</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>Public network port number</p>
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
    * <p>Instance creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Instance IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Port number</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Whether disk write is locked (data write volume of the instance exceeds disk quota). 0 - Unlocked 1 - Locked</p>
    */
    @SerializedName("CdbError")
    @Expose
    private Long CdbError;

    /**
    * <p>Private network descriptor, for example: "vpc-5v8wn9mg"</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet descriptor, such as "subnet-1typ0s7d"</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Physical ID</p>
    */
    @SerializedName("PhysicalId")
    @Expose
    private String PhysicalId;

    /**
    * <p>Core count</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Queries per second.</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>Chinese Name of Availability Zone</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>Physical machine model</p>
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * <p>Placement group ID</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>Availability zone ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Number of nodes</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>Tag list</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfoItem [] TagList;

    /**
    * <p>Engine type</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>Maximum delay threshold</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>Instance disk type. Only CLOUD disk edition and single-node (CLOUD disk) instances will return a valid value.<br>Description:</p><ol><li>If "DiskType": "CLOUD_HSSD" is returned, it indicates that the instance disk type is enhanced SSD CLOUD disk.</li><li>If "DiskType": "CLOUD_SSD" is returned, it indicates that the instance disk type is SSD CLOUD Block Storage.</li><li>If "DiskType": "" is returned and the DeviceType parameter value is UNIVERSAL or EXCLUSIVE, it means that the instance uses local SSD.</li></ol>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Current number of CPU cores for scale-out.</p>
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * <p>Cloud Disk Edition instance node information</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * <p>Analysis engine node list</p>
    */
    @SerializedName("AnalysisNodeInfos")
    @Expose
    private AnalysisNodeInfo [] AnalysisNodeInfos;

    /**
    * <p>Device bandwidth, in G. This parameter is valid only when DeviceClass is not empty. For example, 25 means the current device bandwidth is 25G; 10 means the current device bandwidth is 10G.</p>
    */
    @SerializedName("DeviceBandwidth")
    @Expose
    private Long DeviceBandwidth;

    /**
    * <p>Instance termination protection status. on indicates enabled; otherwise, the protection is disabled.</p>
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
    * <p>TDSQL engine parameters</p>
    */
    @SerializedName("CpuModel")
    @Expose
    private String CpuModel;

    /**
    * <p>Analysis engine instance version upgrade information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

    /**
     * Get <p>Public network status. Possible returned values: 0 - External network not enabled; 1 - Public network enabled; 2 - Public network disabled</p> 
     * @return WanStatus <p>Public network status. Possible returned values: 0 - External network not enabled; 1 - Public network enabled; 2 - Public network disabled</p>
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>Public network status. Possible returned values: 0 - External network not enabled; 1 - Public network enabled; 2 - Public network disabled</p>
     * @param WanStatus <p>Public network status. Possible returned values: 0 - External network not enabled; 1 - Public network enabled; 2 - Public network disabled</p>
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>AZ information</p> 
     * @return Zone <p>AZ information</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ information</p>
     * @param Zone <p>AZ information</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Initialization flag. Possible returned values: 0 - uninitialized; 1 - initialized.</p> 
     * @return InitFlag <p>Initialization flag. Possible returned values: 0 - uninitialized; 1 - initialized.</p>
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set <p>Initialization flag. Possible returned values: 0 - uninitialized; 1 - initialized.</p>
     * @param InitFlag <p>Initialization flag. Possible returned values: 0 - uninitialized; 1 - initialized.</p>
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get <p>Read-only vip information. This field is available only for read-only instances with separate instance access enabled.</p> 
     * @return RoVipInfo <p>Read-only vip information. This field is available only for read-only instances with separate instance access enabled.</p>
     */
    public RoVipInfo getRoVipInfo() {
        return this.RoVipInfo;
    }

    /**
     * Set <p>Read-only vip information. This field is available only for read-only instances with separate instance access enabled.</p>
     * @param RoVipInfo <p>Read-only vip information. This field is available only for read-only instances with separate instance access enabled.</p>
     */
    public void setRoVipInfo(RoVipInfo RoVipInfo) {
        this.RoVipInfo = RoVipInfo;
    }

    /**
     * Get <p>Memory capacity, in MB.</p> 
     * @return Memory <p>Memory capacity, in MB.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory capacity, in MB.</p>
     * @param Memory <p>Memory capacity, in MB.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance status. Valid values: 0: creating; 1: running; 4: isolation operation in progress; 5: isolated.</p> 
     * @return Status <p>Instance status. Valid values: 0: creating; 1: running; 4: isolation operation in progress; 5: isolated.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status. Valid values: 0: creating; 1: running; 4: isolation operation in progress; 5: isolated.</p>
     * @param Status <p>Instance status. Valid values: 0: creating; 1: running; 4: isolation operation in progress; 5: isolated.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>VPC ID, for example: 51102</p> 
     * @return VpcId <p>VPC ID, for example: 51102</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID, for example: 51102</p>
     * @param VpcId <p>VPC ID, for example: 51102</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Secondary server information</p> 
     * @return SlaveInfo <p>Secondary server information</p>
     */
    public SlaveInfo getSlaveInfo() {
        return this.SlaveInfo;
    }

    /**
     * Set <p>Secondary server information</p>
     * @param SlaveInfo <p>Secondary server information</p>
     */
    public void setSlaveInfo(SlaveInfo SlaveInfo) {
        this.SlaveInfo = SlaveInfo;
    }

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Disk capacity, in GB.</p> 
     * @return Volume <p>Disk capacity, in GB.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Disk capacity, in GB.</p>
     * @param Volume <p>Disk capacity, in GB.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Auto-renewal flag. Possible returned values: 0 - auto-renewal is not enabled; 1 - auto-renewal is enabled; 2 - automatic renewal is disabled.</p> 
     * @return AutoRenew <p>Auto-renewal flag. Possible returned values: 0 - auto-renewal is not enabled; 1 - auto-renewal is enabled; 2 - automatic renewal is disabled.</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Auto-renewal flag. Possible returned values: 0 - auto-renewal is not enabled; 1 - auto-renewal is enabled; 2 - automatic renewal is disabled.</p>
     * @param AutoRenew <p>Auto-renewal flag. Possible returned values: 0 - auto-renewal is not enabled; 1 - auto-renewal is enabled; 2 - automatic renewal is disabled.</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Data replication mode. 0 - async replication; 1 - semi-sync replication; 2 - strong sync replication</p> 
     * @return ProtectMode <p>Data replication mode. 0 - async replication; 1 - semi-sync replication; 2 - strong sync replication</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>Data replication mode. 0 - async replication; 1 - semi-sync replication; 2 - strong sync replication</p>
     * @param ProtectMode <p>Data replication mode. 0 - async replication; 1 - semi-sync replication; 2 - strong sync replication</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>Read-only group detailed information</p> 
     * @return RoGroups <p>Read-only group detailed information</p>
     */
    public RoGroup [] getRoGroups() {
        return this.RoGroups;
    }

    /**
     * Set <p>Read-only group detailed information</p>
     * @param RoGroups <p>Read-only group detailed information</p>
     */
    public void setRoGroups(RoGroup [] RoGroups) {
        this.RoGroups = RoGroups;
    }

    /**
     * Get <p>Subnet ID, for example: 2333</p> 
     * @return SubnetId <p>Subnet ID, for example: 2333</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID, for example: 2333</p>
     * @param SubnetId <p>Subnet ID, for example: 2333</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance type. Possible returned values: 1 - Primary instance; 2 - Disaster recovery instance; 3 - Read-only instance.</p> 
     * @return InstanceType <p>Instance type. Possible returned values: 1 - Primary instance; 2 - Disaster recovery instance; 3 - Read-only instance.</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type. Possible returned values: 1 - Primary instance; 2 - Disaster recovery instance; 3 - Read-only instance.</p>
     * @param InstanceType <p>Instance type. Possible returned values: 1 - Primary instance; 2 - Disaster recovery instance; 3 - Read-only instance.</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Regional information</p> 
     * @return Region <p>Regional information</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Regional information</p>
     * @param Region <p>Regional information</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Instance expiration time</p> 
     * @return DeadlineTime <p>Instance expiration time</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>Instance expiration time</p>
     * @param DeadlineTime <p>Instance expiration time</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>Availability Zone Deployment method. Valid values: 0 - single availability zone; 1 - multi-availability zone.</p> 
     * @return DeployMode <p>Availability Zone Deployment method. Valid values: 0 - single availability zone; 1 - multi-availability zone.</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>Availability Zone Deployment method. Valid values: 0 - single availability zone; 1 - multi-availability zone.</p>
     * @param DeployMode <p>Availability Zone Deployment method. Valid values: 0 - single availability zone; 1 - multi-availability zone.</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>Instance task status. 0 - No tasks, 1 - Upgrading, 2 - Data import, 3 - Opening Slave, 4 - Public network access enabling, 5 - Batch operation executing, 6 - Rolling back, 7 - Public network access disabling, 8 - Password modification, 9 - Renaming instance, 10 - Restarting, 12 - Self-built migration, 13 - Database deletion, 14 - Disaster recovery instance creation sync, 15 - Upgrade pending switch, 16 - Upgrade and switch, 17 - Upgrade and switch completed</p> 
     * @return TaskStatus <p>Instance task status. 0 - No tasks, 1 - Upgrading, 2 - Data import, 3 - Opening Slave, 4 - Public network access enabling, 5 - Batch operation executing, 6 - Rolling back, 7 - Public network access disabling, 8 - Password modification, 9 - Renaming instance, 10 - Restarting, 12 - Self-built migration, 13 - Database deletion, 14 - Disaster recovery instance creation sync, 15 - Upgrade pending switch, 16 - Upgrade and switch, 17 - Upgrade and switch completed</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Instance task status. 0 - No tasks, 1 - Upgrading, 2 - Data import, 3 - Opening Slave, 4 - Public network access enabling, 5 - Batch operation executing, 6 - Rolling back, 7 - Public network access disabling, 8 - Password modification, 9 - Renaming instance, 10 - Restarting, 12 - Self-built migration, 13 - Database deletion, 14 - Disaster recovery instance creation sync, 15 - Upgrade pending switch, 16 - Upgrade and switch, 17 - Upgrade and switch completed</p>
     * @param TaskStatus <p>Instance task status. 0 - No tasks, 1 - Upgrading, 2 - Data import, 3 - Opening Slave, 4 - Public network access enabling, 5 - Batch operation executing, 6 - Rolling back, 7 - Public network access disabling, 8 - Password modification, 9 - Renaming instance, 10 - Restarting, 12 - Self-built migration, 13 - Database deletion, 14 - Disaster recovery instance creation sync, 15 - Upgrade pending switch, 16 - Upgrade and switch, 17 - Upgrade and switch completed</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Detailed information about the primary instance.</p> 
     * @return MasterInfo <p>Detailed information about the primary instance.</p>
     */
    public MasterInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set <p>Detailed information about the primary instance.</p>
     * @param MasterInfo <p>Detailed information about the primary instance.</p>
     */
    public void setMasterInfo(MasterInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get <p>Instance type</p> 
     * @return DeviceType <p>Instance type</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance type</p>
     * @param DeviceType <p>Instance type</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Kernel version</p> 
     * @return EngineVersion <p>Kernel version</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Kernel version</p>
     * @param EngineVersion <p>Kernel version</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Disaster recovery instance details</p> 
     * @return DrInfo <p>Disaster recovery instance details</p>
     */
    public DrInfo [] getDrInfo() {
        return this.DrInfo;
    }

    /**
     * Set <p>Disaster recovery instance details</p>
     * @param DrInfo <p>Disaster recovery instance details</p>
     */
    public void setDrInfo(DrInfo [] DrInfo) {
        this.DrInfo = DrInfo;
    }

    /**
     * Get <p>public network domain name</p> 
     * @return WanDomain <p>public network domain name</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>public network domain name</p>
     * @param WanDomain <p>public network domain name</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>Public network port number</p> 
     * @return WanPort <p>Public network port number</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>Public network port number</p>
     * @param WanPort <p>Public network port number</p>
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
     * Get <p>Instance creation time</p> 
     * @return CreateTime <p>Instance creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Instance creation time</p>
     * @param CreateTime <p>Instance creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Instance IP</p> 
     * @return Vip <p>Instance IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Instance IP</p>
     * @param Vip <p>Instance IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Port number</p> 
     * @return Vport <p>Port number</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Port number</p>
     * @param Vport <p>Port number</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Whether disk write is locked (data write volume of the instance exceeds disk quota). 0 - Unlocked 1 - Locked</p> 
     * @return CdbError <p>Whether disk write is locked (data write volume of the instance exceeds disk quota). 0 - Unlocked 1 - Locked</p>
     */
    public Long getCdbError() {
        return this.CdbError;
    }

    /**
     * Set <p>Whether disk write is locked (data write volume of the instance exceeds disk quota). 0 - Unlocked 1 - Locked</p>
     * @param CdbError <p>Whether disk write is locked (data write volume of the instance exceeds disk quota). 0 - Unlocked 1 - Locked</p>
     */
    public void setCdbError(Long CdbError) {
        this.CdbError = CdbError;
    }

    /**
     * Get <p>Private network descriptor, for example: "vpc-5v8wn9mg"</p> 
     * @return UniqVpcId <p>Private network descriptor, for example: "vpc-5v8wn9mg"</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>Private network descriptor, for example: "vpc-5v8wn9mg"</p>
     * @param UniqVpcId <p>Private network descriptor, for example: "vpc-5v8wn9mg"</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet descriptor, such as "subnet-1typ0s7d"</p> 
     * @return UniqSubnetId <p>Subnet descriptor, such as "subnet-1typ0s7d"</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet descriptor, such as "subnet-1typ0s7d"</p>
     * @param UniqSubnetId <p>Subnet descriptor, such as "subnet-1typ0s7d"</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Physical ID</p> 
     * @return PhysicalId <p>Physical ID</p>
     */
    public String getPhysicalId() {
        return this.PhysicalId;
    }

    /**
     * Set <p>Physical ID</p>
     * @param PhysicalId <p>Physical ID</p>
     */
    public void setPhysicalId(String PhysicalId) {
        this.PhysicalId = PhysicalId;
    }

    /**
     * Get <p>Core count</p> 
     * @return Cpu <p>Core count</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Core count</p>
     * @param Cpu <p>Core count</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Queries per second.</p> 
     * @return Qps <p>Queries per second.</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>Queries per second.</p>
     * @param Qps <p>Queries per second.</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>Chinese Name of Availability Zone</p> 
     * @return ZoneName <p>Chinese Name of Availability Zone</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Chinese Name of Availability Zone</p>
     * @param ZoneName <p>Chinese Name of Availability Zone</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>Physical machine model</p> 
     * @return DeviceClass <p>Physical machine model</p>
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set <p>Physical machine model</p>
     * @param DeviceClass <p>Physical machine model</p>
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get <p>Placement group ID</p> 
     * @return DeployGroupId <p>Placement group ID</p>
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set <p>Placement group ID</p>
     * @param DeployGroupId <p>Placement group ID</p>
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get <p>Availability zone ID</p> 
     * @return ZoneId <p>Availability zone ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Availability zone ID</p>
     * @param ZoneId <p>Availability zone ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Number of nodes</p> 
     * @return InstanceNodes <p>Number of nodes</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>Number of nodes</p>
     * @param InstanceNodes <p>Number of nodes</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>Tag list</p> 
     * @return TagList <p>Tag list</p>
     */
    public TagInfoItem [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Tag list</p>
     * @param TagList <p>Tag list</p>
     */
    public void setTagList(TagInfoItem [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Engine type</p> 
     * @return EngineType <p>Engine type</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>Engine type</p>
     * @param EngineType <p>Engine type</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>Maximum delay threshold</p> 
     * @return MaxDelayTime <p>Maximum delay threshold</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>Maximum delay threshold</p>
     * @param MaxDelayTime <p>Maximum delay threshold</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>Instance disk type. Only CLOUD disk edition and single-node (CLOUD disk) instances will return a valid value.<br>Description:</p><ol><li>If "DiskType": "CLOUD_HSSD" is returned, it indicates that the instance disk type is enhanced SSD CLOUD disk.</li><li>If "DiskType": "CLOUD_SSD" is returned, it indicates that the instance disk type is SSD CLOUD Block Storage.</li><li>If "DiskType": "" is returned and the DeviceType parameter value is UNIVERSAL or EXCLUSIVE, it means that the instance uses local SSD.</li></ol> 
     * @return DiskType <p>Instance disk type. Only CLOUD disk edition and single-node (CLOUD disk) instances will return a valid value.<br>Description:</p><ol><li>If "DiskType": "CLOUD_HSSD" is returned, it indicates that the instance disk type is enhanced SSD CLOUD disk.</li><li>If "DiskType": "CLOUD_SSD" is returned, it indicates that the instance disk type is SSD CLOUD Block Storage.</li><li>If "DiskType": "" is returned and the DeviceType parameter value is UNIVERSAL or EXCLUSIVE, it means that the instance uses local SSD.</li></ol>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Instance disk type. Only CLOUD disk edition and single-node (CLOUD disk) instances will return a valid value.<br>Description:</p><ol><li>If "DiskType": "CLOUD_HSSD" is returned, it indicates that the instance disk type is enhanced SSD CLOUD disk.</li><li>If "DiskType": "CLOUD_SSD" is returned, it indicates that the instance disk type is SSD CLOUD Block Storage.</li><li>If "DiskType": "" is returned and the DeviceType parameter value is UNIVERSAL or EXCLUSIVE, it means that the instance uses local SSD.</li></ol>
     * @param DiskType <p>Instance disk type. Only CLOUD disk edition and single-node (CLOUD disk) instances will return a valid value.<br>Description:</p><ol><li>If "DiskType": "CLOUD_HSSD" is returned, it indicates that the instance disk type is enhanced SSD CLOUD disk.</li><li>If "DiskType": "CLOUD_SSD" is returned, it indicates that the instance disk type is SSD CLOUD Block Storage.</li><li>If "DiskType": "" is returned and the DeviceType parameter value is UNIVERSAL or EXCLUSIVE, it means that the instance uses local SSD.</li></ol>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Current number of CPU cores for scale-out.</p> 
     * @return ExpandCpu <p>Current number of CPU cores for scale-out.</p>
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set <p>Current number of CPU cores for scale-out.</p>
     * @param ExpandCpu <p>Current number of CPU cores for scale-out.</p>
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get <p>Cloud Disk Edition instance node information</p> 
     * @return ClusterInfo <p>Cloud Disk Edition instance node information</p>
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>Cloud Disk Edition instance node information</p>
     * @param ClusterInfo <p>Cloud Disk Edition instance node information</p>
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>Analysis engine node list</p> 
     * @return AnalysisNodeInfos <p>Analysis engine node list</p>
     */
    public AnalysisNodeInfo [] getAnalysisNodeInfos() {
        return this.AnalysisNodeInfos;
    }

    /**
     * Set <p>Analysis engine node list</p>
     * @param AnalysisNodeInfos <p>Analysis engine node list</p>
     */
    public void setAnalysisNodeInfos(AnalysisNodeInfo [] AnalysisNodeInfos) {
        this.AnalysisNodeInfos = AnalysisNodeInfos;
    }

    /**
     * Get <p>Device bandwidth, in G. This parameter is valid only when DeviceClass is not empty. For example, 25 means the current device bandwidth is 25G; 10 means the current device bandwidth is 10G.</p> 
     * @return DeviceBandwidth <p>Device bandwidth, in G. This parameter is valid only when DeviceClass is not empty. For example, 25 means the current device bandwidth is 25G; 10 means the current device bandwidth is 10G.</p>
     */
    public Long getDeviceBandwidth() {
        return this.DeviceBandwidth;
    }

    /**
     * Set <p>Device bandwidth, in G. This parameter is valid only when DeviceClass is not empty. For example, 25 means the current device bandwidth is 25G; 10 means the current device bandwidth is 10G.</p>
     * @param DeviceBandwidth <p>Device bandwidth, in G. This parameter is valid only when DeviceClass is not empty. For example, 25 means the current device bandwidth is 25G; 10 means the current device bandwidth is 10G.</p>
     */
    public void setDeviceBandwidth(Long DeviceBandwidth) {
        this.DeviceBandwidth = DeviceBandwidth;
    }

    /**
     * Get <p>Instance termination protection status. on indicates enabled; otherwise, the protection is disabled.</p> 
     * @return DestroyProtect <p>Instance termination protection status. on indicates enabled; otherwise, the protection is disabled.</p>
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set <p>Instance termination protection status. on indicates enabled; otherwise, the protection is disabled.</p>
     * @param DestroyProtect <p>Instance termination protection status. on indicates enabled; otherwise, the protection is disabled.</p>
     */
    public void setDestroyProtect(String DestroyProtect) {
        this.DestroyProtect = DestroyProtect;
    }

    /**
     * Get <p>TDSQL engine parameters</p> 
     * @return CpuModel <p>TDSQL engine parameters</p>
     */
    public String getCpuModel() {
        return this.CpuModel;
    }

    /**
     * Set <p>TDSQL engine parameters</p>
     * @param CpuModel <p>TDSQL engine parameters</p>
     */
    public void setCpuModel(String CpuModel) {
        this.CpuModel = CpuModel;
    }

    /**
     * Get <p>Analysis engine instance version upgrade information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnalysisUpgradeVersionInfo <p>Analysis engine instance version upgrade information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>Analysis engine instance version upgrade information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnalysisUpgradeVersionInfo <p>Analysis engine instance version upgrade information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.RoVipInfo != null) {
            this.RoVipInfo = new RoVipInfo(source.RoVipInfo);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SlaveInfo != null) {
            this.SlaveInfo = new SlaveInfo(source.SlaveInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.RoGroups != null) {
            this.RoGroups = new RoGroup[source.RoGroups.length];
            for (int i = 0; i < source.RoGroups.length; i++) {
                this.RoGroups[i] = new RoGroup(source.RoGroups[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.MasterInfo != null) {
            this.MasterInfo = new MasterInfo(source.MasterInfo);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DrInfo != null) {
            this.DrInfo = new DrInfo[source.DrInfo.length];
            for (int i = 0; i < source.DrInfo.length; i++) {
                this.DrInfo[i] = new DrInfo(source.DrInfo[i]);
            }
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.CdbError != null) {
            this.CdbError = new Long(source.CdbError);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.PhysicalId != null) {
            this.PhysicalId = new String(source.PhysicalId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfoItem[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfoItem(source.TagList[i]);
            }
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo[source.ClusterInfo.length];
            for (int i = 0; i < source.ClusterInfo.length; i++) {
                this.ClusterInfo[i] = new ClusterInfo(source.ClusterInfo[i]);
            }
        }
        if (source.AnalysisNodeInfos != null) {
            this.AnalysisNodeInfos = new AnalysisNodeInfo[source.AnalysisNodeInfos.length];
            for (int i = 0; i < source.AnalysisNodeInfos.length; i++) {
                this.AnalysisNodeInfos[i] = new AnalysisNodeInfo(source.AnalysisNodeInfos[i]);
            }
        }
        if (source.DeviceBandwidth != null) {
            this.DeviceBandwidth = new Long(source.DeviceBandwidth);
        }
        if (source.DestroyProtect != null) {
            this.DestroyProtect = new String(source.DestroyProtect);
        }
        if (source.CpuModel != null) {
            this.CpuModel = new String(source.CpuModel);
        }
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
        }
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
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamArrayObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamArrayObj(map, prefix + "AnalysisNodeInfos.", this.AnalysisNodeInfos);
        this.setParamSimple(map, prefix + "DeviceBandwidth", this.DeviceBandwidth);
        this.setParamSimple(map, prefix + "DestroyProtect", this.DestroyProtect);
        this.setParamSimple(map, prefix + "CpuModel", this.CpuModel);
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);

    }
}

