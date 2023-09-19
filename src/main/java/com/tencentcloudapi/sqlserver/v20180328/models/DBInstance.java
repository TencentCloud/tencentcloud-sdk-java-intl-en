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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project ID of instance
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Instance AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Instance VPC ID, which will be 0 if the basic network is used
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Instance VPC subnet ID, which will be 0 if the basic network is used
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Instance status. Valid values: <li>1: creating</li> <li>2: running</li> <li>3: instance operations restricted (due to the ongoing primary-replica switch)</li> <li>4: isolated</li> <li>5: repossessing</li> <li>6: repossessed</li> <li>7: running tasks (such as backup and rollback tasks)</li> <li>8: eliminated</li> <li>9: expanding capacity</li> <li>10: migrating</li> <li>11: read-only</li> <li>12: restarting</li>  <li>13: modifying configuration and waiting for switch</li> <li>14: implementing pub/sub</li> <li>15: modifying pub/sub configuration</li> <li>16: modifying configuration and switching</li> <li>17: creating read-only instances</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance access IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance access port
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
    * Instance update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Instance billing start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance billing end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance isolation time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Used storage capacity of instance in GB
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance version
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Instance renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * Instance region name, such as ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ name, such as ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Backup time point
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Instance billing mode. 0: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Number of CPU cores of instance
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance version code
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Instance type. Valid values: `TS85` (physical machine, local SSD), `Z3` (early version of physical machine, local SSD), `CLOUD_BASIC` (virtual machine, HDD cloud disk), `CLOUD_PREMIUM` (virtual machine, premium cloud disk), `CLOUD_SSD` (virtual machine, SSD), `CLOUD_HSSD` (virtual machine, enhanced SSD), `CLOUD_TSSD` (virtual machine, ulTra SSD), `CLOUD_BSSD` virtual machine, balanced SSD).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Billing ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateOperator")
    @Expose
    private String IsolateOperator;

    /**
    * Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubFlag")
    @Expose
    private String SubFlag;

    /**
    * Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ROFlag")
    @Expose
    private String ROFlag;

    /**
    * Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HAFlag")
    @Expose
    private String HAFlag;

    /**
    * The list of tags associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node (default value)), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node (valid for Always On clusters)), `slave_no_pkg` (do not archive the backup files of the replica node (valid for Always On clusters)). This parameter is invalid for read-only instances.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupModel")
    @Expose
    private String BackupModel;

    /**
    * Instance backup info
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNote")
    @Expose
    private String InstanceNote;

    /**
    * Backup cycle
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
    * Backup cycle type. Valid values: `daily`, `weekly`, `monthly`.
    */
    @SerializedName("BackupCycleType")
    @Expose
    private String BackupCycleType;

    /**
    * Data (log) backup retention period
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * Instance type. Valid values: `HA` (high-availability), `RO` (read-only), `SI` (basic edition), `BI` (business intelligence service).
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The target region of cross-region backup. If this parameter left empty, it indicates that cross-region backup is disabled.
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * Cross-region backup status. Valid values: `enable` (enabled), `disable` (disabed)
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * The retention period of cross-region backup. Default value: 7 days
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * Domain name of the public network address
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * Port number of the public network
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
    * Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * System time zone. Default value: `China Standard Time`.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Whether the instance is deployed across AZs
    */
    @SerializedName("IsDrZone")
    @Expose
    private Boolean IsDrZone;

    /**
    * Replica AZ information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZones")
    @Expose
    private SlaveZones SlaveZones;

    /**
    * Architecture type. Valid values: `SINGLE` (single-node), `DOUBLE` (two-node).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Instance type. Valid values: `EXCLUSIVE` (dedicated), `SHARED` (shared)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Style")
    @Expose
    private String Style;

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
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project ID of instance 
     * @return ProjectId Project ID of instance
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of instance
     * @param ProjectId Project ID of instance
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance region ID 
     * @return RegionId Instance region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Instance region ID
     * @param RegionId Instance region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Instance AZ ID 
     * @return ZoneId Instance AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Instance AZ ID
     * @param ZoneId Instance AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance VPC ID, which will be 0 if the basic network is used 
     * @return VpcId Instance VPC ID, which will be 0 if the basic network is used
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Instance VPC ID, which will be 0 if the basic network is used
     * @param VpcId Instance VPC ID, which will be 0 if the basic network is used
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Instance VPC subnet ID, which will be 0 if the basic network is used 
     * @return SubnetId Instance VPC subnet ID, which will be 0 if the basic network is used
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Instance VPC subnet ID, which will be 0 if the basic network is used
     * @param SubnetId Instance VPC subnet ID, which will be 0 if the basic network is used
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status. Valid values: <li>1: creating</li> <li>2: running</li> <li>3: instance operations restricted (due to the ongoing primary-replica switch)</li> <li>4: isolated</li> <li>5: repossessing</li> <li>6: repossessed</li> <li>7: running tasks (such as backup and rollback tasks)</li> <li>8: eliminated</li> <li>9: expanding capacity</li> <li>10: migrating</li> <li>11: read-only</li> <li>12: restarting</li>  <li>13: modifying configuration and waiting for switch</li> <li>14: implementing pub/sub</li> <li>15: modifying pub/sub configuration</li> <li>16: modifying configuration and switching</li> <li>17: creating read-only instances</li> 
     * @return Status Instance status. Valid values: <li>1: creating</li> <li>2: running</li> <li>3: instance operations restricted (due to the ongoing primary-replica switch)</li> <li>4: isolated</li> <li>5: repossessing</li> <li>6: repossessed</li> <li>7: running tasks (such as backup and rollback tasks)</li> <li>8: eliminated</li> <li>9: expanding capacity</li> <li>10: migrating</li> <li>11: read-only</li> <li>12: restarting</li>  <li>13: modifying configuration and waiting for switch</li> <li>14: implementing pub/sub</li> <li>15: modifying pub/sub configuration</li> <li>16: modifying configuration and switching</li> <li>17: creating read-only instances</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: <li>1: creating</li> <li>2: running</li> <li>3: instance operations restricted (due to the ongoing primary-replica switch)</li> <li>4: isolated</li> <li>5: repossessing</li> <li>6: repossessed</li> <li>7: running tasks (such as backup and rollback tasks)</li> <li>8: eliminated</li> <li>9: expanding capacity</li> <li>10: migrating</li> <li>11: read-only</li> <li>12: restarting</li>  <li>13: modifying configuration and waiting for switch</li> <li>14: implementing pub/sub</li> <li>15: modifying pub/sub configuration</li> <li>16: modifying configuration and switching</li> <li>17: creating read-only instances</li>
     * @param Status Instance status. Valid values: <li>1: creating</li> <li>2: running</li> <li>3: instance operations restricted (due to the ongoing primary-replica switch)</li> <li>4: isolated</li> <li>5: repossessing</li> <li>6: repossessed</li> <li>7: running tasks (such as backup and rollback tasks)</li> <li>8: eliminated</li> <li>9: expanding capacity</li> <li>10: migrating</li> <li>11: read-only</li> <li>12: restarting</li>  <li>13: modifying configuration and waiting for switch</li> <li>14: implementing pub/sub</li> <li>15: modifying pub/sub configuration</li> <li>16: modifying configuration and switching</li> <li>17: creating read-only instances</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance access IP 
     * @return Vip Instance access IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance access IP
     * @param Vip Instance access IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance access port 
     * @return Vport Instance access port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance access port
     * @param Vport Instance access port
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
     * Get Instance update time 
     * @return UpdateTime Instance update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Instance update time
     * @param UpdateTime Instance update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance billing start time 
     * @return StartTime Instance billing start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Instance billing start time
     * @param StartTime Instance billing start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance billing end time 
     * @return EndTime Instance billing end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Instance billing end time
     * @param EndTime Instance billing end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Instance isolation time 
     * @return IsolateTime Instance isolation time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Instance isolation time
     * @param IsolateTime Instance isolation time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

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
     * Get Used storage capacity of instance in GB 
     * @return UsedStorage Used storage capacity of instance in GB
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set Used storage capacity of instance in GB
     * @param UsedStorage Used storage capacity of instance in GB
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return Storage Instance storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB
     * @param Storage Instance storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance version 
     * @return VersionName Instance version
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Instance version
     * @param VersionName Instance version
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Instance renewal flag 
     * @return RenewFlag Instance renewal flag
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Instance renewal flag
     * @param RenewFlag Instance renewal flag
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption) 
     * @return Model High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     * @param Model High-availability instance type. Valid values: 1 (dual-server high-availability), 2 (standalone), 3 (multi-AZ), 4 (multi-AZ cluster), 5 (cluster), 9 (private consumption)
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get Instance region name, such as ap-guangzhou 
     * @return Region Instance region name, such as ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region name, such as ap-guangzhou
     * @param Region Instance region name, such as ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ name, such as ap-guangzhou-1 
     * @return Zone Instance AZ name, such as ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ name, such as ap-guangzhou-1
     * @param Zone Instance AZ name, such as ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Backup time point 
     * @return BackupTime Backup time point
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time point
     * @param BackupTime Backup time point
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Instance billing mode. 0: pay-as-you-go 
     * @return PayMode Instance billing mode. 0: pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. 0: pay-as-you-go
     * @param PayMode Instance billing mode. 0: pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance UID 
     * @return Uid Instance UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Instance UID
     * @param Uid Instance UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Number of CPU cores of instance 
     * @return Cpu Number of CPU cores of instance
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of instance
     * @param Cpu Number of CPU cores of instance
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance version code 
     * @return Version Instance version code
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version code
     * @param Version Instance version code
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Instance type. Valid values: `TS85` (physical machine, local SSD), `Z3` (early version of physical machine, local SSD), `CLOUD_BASIC` (virtual machine, HDD cloud disk), `CLOUD_PREMIUM` (virtual machine, premium cloud disk), `CLOUD_SSD` (virtual machine, SSD), `CLOUD_HSSD` (virtual machine, enhanced SSD), `CLOUD_TSSD` (virtual machine, ulTra SSD), `CLOUD_BSSD` virtual machine, balanced SSD). 
     * @return Type Instance type. Valid values: `TS85` (physical machine, local SSD), `Z3` (early version of physical machine, local SSD), `CLOUD_BASIC` (virtual machine, HDD cloud disk), `CLOUD_PREMIUM` (virtual machine, premium cloud disk), `CLOUD_SSD` (virtual machine, SSD), `CLOUD_HSSD` (virtual machine, enhanced SSD), `CLOUD_TSSD` (virtual machine, ulTra SSD), `CLOUD_BSSD` virtual machine, balanced SSD).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type. Valid values: `TS85` (physical machine, local SSD), `Z3` (early version of physical machine, local SSD), `CLOUD_BASIC` (virtual machine, HDD cloud disk), `CLOUD_PREMIUM` (virtual machine, premium cloud disk), `CLOUD_SSD` (virtual machine, SSD), `CLOUD_HSSD` (virtual machine, enhanced SSD), `CLOUD_TSSD` (virtual machine, ulTra SSD), `CLOUD_BSSD` virtual machine, balanced SSD).
     * @param Type Instance type. Valid values: `TS85` (physical machine, local SSD), `Z3` (early version of physical machine, local SSD), `CLOUD_BASIC` (virtual machine, HDD cloud disk), `CLOUD_PREMIUM` (virtual machine, premium cloud disk), `CLOUD_SSD` (virtual machine, SSD), `CLOUD_HSSD` (virtual machine, enhanced SSD), `CLOUD_TSSD` (virtual machine, ulTra SSD), `CLOUD_BSSD` virtual machine, balanced SSD).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Billing ID 
     * @return Pid Billing ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Billing ID
     * @param Pid Billing ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used 
     * @return UniqVpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     * @param UniqVpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`, which is an empty string if the basic network is used
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used 
     * @return UniqSubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     * @param UniqSubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`, which is an empty string if the basic network is used
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsolateOperator Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolateOperator() {
        return this.IsolateOperator;
    }

    /**
     * Set Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsolateOperator Instance isolation.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateOperator(String IsolateOperator) {
        this.IsolateOperator = IsolateOperator;
    }

    /**
     * Get Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubFlag Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubFlag() {
        return this.SubFlag;
    }

    /**
     * Set Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubFlag Pub/sub flag. Valid values: SUB (subscribe instance), PUB (publish instance). If it is left empty, it refers to a regular instance without a pub/sub design.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubFlag(String SubFlag) {
        this.SubFlag = SubFlag;
    }

    /**
     * Get Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ROFlag Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getROFlag() {
        return this.ROFlag;
    }

    /**
     * Set Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ROFlag Read-only flag. Valid values: RO (read-only instance), MASTER (primary instance with read-only instances). If it is left empty, it refers to an instance which is not read-only and has no RO group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setROFlag(String ROFlag) {
        this.ROFlag = ROFlag;
    }

    /**
     * Get Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HAFlag Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHAFlag() {
        return this.HAFlag;
    }

    /**
     * Set Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HAFlag Disaster recovery type. Valid values: MIRROR (image), ALWAYSON (AlwaysOn), SINGLE (singleton).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHAFlag(String HAFlag) {
        this.HAFlag = HAFlag;
    }

    /**
     * Get The list of tags associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceTags The list of tags associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set The list of tags associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceTags The list of tags associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node (default value)), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node (valid for Always On clusters)), `slave_no_pkg` (do not archive the backup files of the replica node (valid for Always On clusters)). This parameter is invalid for read-only instances.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BackupModel Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node (default value)), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node (valid for Always On clusters)), `slave_no_pkg` (do not archive the backup files of the replica node (valid for Always On clusters)). This parameter is invalid for read-only instances.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBackupModel() {
        return this.BackupModel;
    }

    /**
     * Set Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node (default value)), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node (valid for Always On clusters)), `slave_no_pkg` (do not archive the backup files of the replica node (valid for Always On clusters)). This parameter is invalid for read-only instances.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BackupModel Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node (default value)), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node (valid for Always On clusters)), `slave_no_pkg` (do not archive the backup files of the replica node (valid for Always On clusters)). This parameter is invalid for read-only instances.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBackupModel(String BackupModel) {
        this.BackupModel = BackupModel;
    }

    /**
     * Get Instance backup info
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceNote Instance backup info
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceNote() {
        return this.InstanceNote;
    }

    /**
     * Set Instance backup info
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceNote Instance backup info
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceNote(String InstanceNote) {
        this.InstanceNote = InstanceNote;
    }

    /**
     * Get Backup cycle 
     * @return BackupCycle Backup cycle
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set Backup cycle
     * @param BackupCycle Backup cycle
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    /**
     * Get Backup cycle type. Valid values: `daily`, `weekly`, `monthly`. 
     * @return BackupCycleType Backup cycle type. Valid values: `daily`, `weekly`, `monthly`.
     */
    public String getBackupCycleType() {
        return this.BackupCycleType;
    }

    /**
     * Set Backup cycle type. Valid values: `daily`, `weekly`, `monthly`.
     * @param BackupCycleType Backup cycle type. Valid values: `daily`, `weekly`, `monthly`.
     */
    public void setBackupCycleType(String BackupCycleType) {
        this.BackupCycleType = BackupCycleType;
    }

    /**
     * Get Data (log) backup retention period 
     * @return BackupSaveDays Data (log) backup retention period
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set Data (log) backup retention period
     * @param BackupSaveDays Data (log) backup retention period
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get Instance type. Valid values: `HA` (high-availability), `RO` (read-only), `SI` (basic edition), `BI` (business intelligence service). 
     * @return InstanceType Instance type. Valid values: `HA` (high-availability), `RO` (read-only), `SI` (basic edition), `BI` (business intelligence service).
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: `HA` (high-availability), `RO` (read-only), `SI` (basic edition), `BI` (business intelligence service).
     * @param InstanceType Instance type. Valid values: `HA` (high-availability), `RO` (read-only), `SI` (basic edition), `BI` (business intelligence service).
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The target region of cross-region backup. If this parameter left empty, it indicates that cross-region backup is disabled. 
     * @return CrossRegions The target region of cross-region backup. If this parameter left empty, it indicates that cross-region backup is disabled.
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set The target region of cross-region backup. If this parameter left empty, it indicates that cross-region backup is disabled.
     * @param CrossRegions The target region of cross-region backup. If this parameter left empty, it indicates that cross-region backup is disabled.
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get Cross-region backup status. Valid values: `enable` (enabled), `disable` (disabed) 
     * @return CrossBackupEnabled Cross-region backup status. Valid values: `enable` (enabled), `disable` (disabed)
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set Cross-region backup status. Valid values: `enable` (enabled), `disable` (disabed)
     * @param CrossBackupEnabled Cross-region backup status. Valid values: `enable` (enabled), `disable` (disabed)
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get The retention period of cross-region backup. Default value: 7 days 
     * @return CrossBackupSaveDays The retention period of cross-region backup. Default value: 7 days
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set The retention period of cross-region backup. Default value: 7 days
     * @param CrossBackupSaveDays The retention period of cross-region backup. Default value: 7 days
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get Domain name of the public network address 
     * @return DnsPodDomain Domain name of the public network address
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set Domain name of the public network address
     * @param DnsPodDomain Domain name of the public network address
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get Port number of the public network 
     * @return TgwWanVPort Port number of the public network
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set Port number of the public network
     * @param TgwWanVPort Port number of the public network
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    /**
     * Get Collation of system character sets. Default value: `Chinese_PRC_CI_AS`. 
     * @return Collation Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     * @param Collation Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get System time zone. Default value: `China Standard Time`. 
     * @return TimeZone System time zone. Default value: `China Standard Time`.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set System time zone. Default value: `China Standard Time`.
     * @param TimeZone System time zone. Default value: `China Standard Time`.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Whether the instance is deployed across AZs 
     * @return IsDrZone Whether the instance is deployed across AZs
     */
    public Boolean getIsDrZone() {
        return this.IsDrZone;
    }

    /**
     * Set Whether the instance is deployed across AZs
     * @param IsDrZone Whether the instance is deployed across AZs
     */
    public void setIsDrZone(Boolean IsDrZone) {
        this.IsDrZone = IsDrZone;
    }

    /**
     * Get Replica AZ information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZones Replica AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SlaveZones getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Replica AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZones Replica AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZones(SlaveZones SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get Architecture type. Valid values: `SINGLE` (single-node), `DOUBLE` (two-node).
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Architecture Architecture type. Valid values: `SINGLE` (single-node), `DOUBLE` (two-node).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Architecture type. Valid values: `SINGLE` (single-node), `DOUBLE` (two-node).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Architecture Architecture type. Valid values: `SINGLE` (single-node), `DOUBLE` (two-node).
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get Instance type. Valid values: `EXCLUSIVE` (dedicated), `SHARED` (shared)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Style Instance type. Valid values: `EXCLUSIVE` (dedicated), `SHARED` (shared)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set Instance type. Valid values: `EXCLUSIVE` (dedicated), `SHARED` (shared)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Style Instance type. Valid values: `EXCLUSIVE` (dedicated), `SHARED` (shared)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Model != null) {
            this.Model = new Long(source.Model);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.IsolateOperator != null) {
            this.IsolateOperator = new String(source.IsolateOperator);
        }
        if (source.SubFlag != null) {
            this.SubFlag = new String(source.SubFlag);
        }
        if (source.ROFlag != null) {
            this.ROFlag = new String(source.ROFlag);
        }
        if (source.HAFlag != null) {
            this.HAFlag = new String(source.HAFlag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.BackupModel != null) {
            this.BackupModel = new String(source.BackupModel);
        }
        if (source.InstanceNote != null) {
            this.InstanceNote = new String(source.InstanceNote);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
        if (source.BackupCycleType != null) {
            this.BackupCycleType = new String(source.BackupCycleType);
        }
        if (source.BackupSaveDays != null) {
            this.BackupSaveDays = new Long(source.BackupSaveDays);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.DnsPodDomain != null) {
            this.DnsPodDomain = new String(source.DnsPodDomain);
        }
        if (source.TgwWanVPort != null) {
            this.TgwWanVPort = new Long(source.TgwWanVPort);
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.IsDrZone != null) {
            this.IsDrZone = new Boolean(source.IsDrZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new SlaveZones(source.SlaveZones);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "IsolateOperator", this.IsolateOperator);
        this.setParamSimple(map, prefix + "SubFlag", this.SubFlag);
        this.setParamSimple(map, prefix + "ROFlag", this.ROFlag);
        this.setParamSimple(map, prefix + "HAFlag", this.HAFlag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "BackupModel", this.BackupModel);
        this.setParamSimple(map, prefix + "InstanceNote", this.InstanceNote);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);
        this.setParamSimple(map, prefix + "BackupCycleType", this.BackupCycleType);
        this.setParamSimple(map, prefix + "BackupSaveDays", this.BackupSaveDays);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamSimple(map, prefix + "DnsPodDomain", this.DnsPodDomain);
        this.setParamSimple(map, prefix + "TgwWanVPort", this.TgwWanVPort);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "IsDrZone", this.IsDrZone);
        this.setParamObj(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

