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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel{

    /**
    * Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Cloud disk types. Valid values: <br><li>CLOUD_BASIC: HDD cloud disk <br><li>CLOUD_PREMIUM: Premium Cloud Disk <br><li>CLOUD_BSSD: General Purpose SSD <br><li>CLOUD_SSD: SSD <br><li>CLOUD_HSSD: Enhanced SSD <br><li>CLOUD_TSSD: Tremendous SSD
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive.
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * The total number of snapshots of the cloud disk.
    */
    @SerializedName("SnapshotCount")
    @Expose
    private Long SnapshotCount;

    /**
    * Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AutoRenewFlagError")
    @Expose
    private Boolean AutoRenewFlagError;

    /**
    * Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes
    */
    @SerializedName("Rollbacking")
    @Expose
    private Boolean Rollbacking;

    /**
    * For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk's Instance IDs currently mounted to the CVM.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted.
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * Cloud disk name.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Specifies whether to create a snapshot when the cloud disk is terminated due to overdue payment or expiration. `true`: create snapshot; `false`: do not create snapshot.
    */
    @SerializedName("BackupDisk")
    @Expose
    private Boolean BackupDisk;

    /**
    * The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * ID of the CVM to which the cloud disk is mounted.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cloud disk mount method. Valid values: <br><li>PF: mount as a PF (Physical Function)<br><li>VF: mount as a VF (Virtual Function)
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AttachMode")
    @Expose
    private String AttachMode;

    /**
    * ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * Extra performance for a cloud disk, in MB/sec.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Migrating")
    @Expose
    private Boolean Migrating;

    /**
    * Cloud disk ID.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * The total capacity of the snapshots of the cloud disk. Unit: MB.
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * Location of the cloud disk.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * Expiration time of the cloud disk.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted.
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * Cloud disk size (in GB).
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MigratePercent")
    @Expose
    private Long MigratePercent;

    /**
    * Cloud disk type. Value range:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Whether it is an elastic cloud disk. false: Non-elastic cloud disk; true: Elastic cloud disk.
    */
    @SerializedName("Portable")
    @Expose
    private Boolean Portable;

    /**
    * Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots.
    */
    @SerializedName("SnapshotAbility")
    @Expose
    private Boolean SnapshotAbility;

    /**
    * This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false:Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeadlineError")
    @Expose
    private Boolean DeadlineError;

    /**
    * Rollback progress of a cloud disk snapshot.
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Long RollbackPercent;

    /**
    * Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * Whether or not cloud disk is shareable cloud disk.
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
    * Creation time of the cloud disk.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default). `1`: Yes. To check whether a snapshot is permanently reserved, refer to the `IsPermanent` field returned by the `DescribeSnapshots` API. 
    */
    @SerializedName("DeleteSnapshot")
    @Expose
    private Long DeleteSnapshot;

    /**
    * Quota of cloud disk backup points, i.e., the maximum number of backup points that a cloud disk can have.
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
    * Number of used cloud disk backups.
    */
    @SerializedName("DiskBackupCount")
    @Expose
    private Long DiskBackupCount;

    /**
    * Type of the instance mounted to the cloud disk. Valid values: <br><li>CVM<br><li>EKS
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 
    */
    @SerializedName("LastAttachInsId")
    @Expose
    private String LastAttachInsId;

    /**
    * 
    */
    @SerializedName("ErrorPrompt")
    @Expose
    private String ErrorPrompt;

    /**
     * Get Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found. 
     * @return DeleteWithInstance Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found.
     * @param DeleteWithInstance Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found. 
     * @return RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found.
     * @param RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Cloud disk types. Valid values: <br><li>CLOUD_BASIC: HDD cloud disk <br><li>CLOUD_PREMIUM: Premium Cloud Disk <br><li>CLOUD_BSSD: General Purpose SSD <br><li>CLOUD_SSD: SSD <br><li>CLOUD_HSSD: Enhanced SSD <br><li>CLOUD_TSSD: Tremendous SSD 
     * @return DiskType Cloud disk types. Valid values: <br><li>CLOUD_BASIC: HDD cloud disk <br><li>CLOUD_PREMIUM: Premium Cloud Disk <br><li>CLOUD_BSSD: General Purpose SSD <br><li>CLOUD_SSD: SSD <br><li>CLOUD_HSSD: Enhanced SSD <br><li>CLOUD_TSSD: Tremendous SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk types. Valid values: <br><li>CLOUD_BASIC: HDD cloud disk <br><li>CLOUD_PREMIUM: Premium Cloud Disk <br><li>CLOUD_BSSD: General Purpose SSD <br><li>CLOUD_SSD: SSD <br><li>CLOUD_HSSD: Enhanced SSD <br><li>CLOUD_TSSD: Tremendous SSD
     * @param DiskType Cloud disk types. Valid values: <br><li>CLOUD_BASIC: HDD cloud disk <br><li>CLOUD_PREMIUM: Premium Cloud Disk <br><li>CLOUD_BSSD: General Purpose SSD <br><li>CLOUD_SSD: SSD <br><li>CLOUD_HSSD: Enhanced SSD <br><li>CLOUD_TSSD: Tremendous SSD
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive. 
     * @return DiskState The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive.
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive.
     * @param DiskState The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive.
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get The total number of snapshots of the cloud disk. 
     * @return SnapshotCount The total number of snapshots of the cloud disk.
     */
    public Long getSnapshotCount() {
        return this.SnapshotCount;
    }

    /**
     * Set The total number of snapshots of the cloud disk.
     * @param SnapshotCount The total number of snapshots of the cloud disk.
     */
    public void setSnapshotCount(Long SnapshotCount) {
        this.SnapshotCount = SnapshotCount;
    }

    /**
     * Get Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found. 
     * @return AutoRenewFlagError Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getAutoRenewFlagError() {
        return this.AutoRenewFlagError;
    }

    /**
     * Set Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found.
     * @param AutoRenewFlagError Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAutoRenewFlagError(Boolean AutoRenewFlagError) {
        this.AutoRenewFlagError = AutoRenewFlagError;
    }

    /**
     * Get Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes 
     * @return Rollbacking Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes
     */
    public Boolean getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * Set Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes
     * @param Rollbacking Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes
     */
    public void setRollbacking(Boolean Rollbacking) {
        this.Rollbacking = Rollbacking;
    }

    /**
     * Get For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk's Instance IDs currently mounted to the CVM. 
     * @return InstanceIdList For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk's Instance IDs currently mounted to the CVM.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk's Instance IDs currently mounted to the CVM.
     * @param InstanceIdList For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk's Instance IDs currently mounted to the CVM.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted. 
     * @return Encrypt Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted.
     * @param Encrypt Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted.
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Cloud disk name. 
     * @return DiskName Cloud disk name.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Cloud disk name.
     * @param DiskName Cloud disk name.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Specifies whether to create a snapshot when the cloud disk is terminated due to overdue payment or expiration. `true`: create snapshot; `false`: do not create snapshot. 
     * @return BackupDisk Specifies whether to create a snapshot when the cloud disk is terminated due to overdue payment or expiration. `true`: create snapshot; `false`: do not create snapshot.
     */
    public Boolean getBackupDisk() {
        return this.BackupDisk;
    }

    /**
     * Set Specifies whether to create a snapshot when the cloud disk is terminated due to overdue payment or expiration. `true`: create snapshot; `false`: do not create snapshot.
     * @param BackupDisk Specifies whether to create a snapshot when the cloud disk is terminated due to overdue payment or expiration. `true`: create snapshot; `false`: do not create snapshot.
     */
    public void setBackupDisk(Boolean BackupDisk) {
        this.BackupDisk = BackupDisk;
    }

    /**
     * Get The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found. 
     * @return Tags The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found.
     * @param Tags The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the CVM to which the cloud disk is mounted. 
     * @return InstanceId ID of the CVM to which the cloud disk is mounted.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the CVM to which the cloud disk is mounted.
     * @param InstanceId ID of the CVM to which the cloud disk is mounted.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cloud disk mount method. Valid values: <br><li>PF: mount as a PF (Physical Function)<br><li>VF: mount as a VF (Virtual Function)
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AttachMode Cloud disk mount method. Valid values: <br><li>PF: mount as a PF (Physical Function)<br><li>VF: mount as a VF (Virtual Function)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getAttachMode() {
        return this.AttachMode;
    }

    /**
     * Set Cloud disk mount method. Valid values: <br><li>PF: mount as a PF (Physical Function)<br><li>VF: mount as a VF (Virtual Function)
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AttachMode Cloud disk mount method. Valid values: <br><li>PF: mount as a PF (Physical Function)<br><li>VF: mount as a VF (Virtual Function)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAttachMode(String AttachMode) {
        this.AttachMode = AttachMode;
    }

    /**
     * Get ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found. 
     * @return AutoSnapshotPolicyIds ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found.
     * @param AutoSnapshotPolicyIds ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get Extra performance for a cloud disk, in MB/sec.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ThroughputPerformance Extra performance for a cloud disk, in MB/sec.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Extra performance for a cloud disk, in MB/sec.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ThroughputPerformance Extra performance for a cloud disk, in MB/sec.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found. 
     * @return Migrating Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getMigrating() {
        return this.Migrating;
    }

    /**
     * Set Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found.
     * @param Migrating Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMigrating(Boolean Migrating) {
        this.Migrating = Migrating;
    }

    /**
     * Get Cloud disk ID. 
     * @return DiskId Cloud disk ID.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Cloud disk ID.
     * @param DiskId Cloud disk ID.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get The total capacity of the snapshots of the cloud disk. Unit: MB. 
     * @return SnapshotSize The total capacity of the snapshots of the cloud disk. Unit: MB.
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set The total capacity of the snapshots of the cloud disk. Unit: MB.
     * @param SnapshotSize The total capacity of the snapshots of the cloud disk. Unit: MB.
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get Location of the cloud disk. 
     * @return Placement Location of the cloud disk.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the cloud disk.
     * @param Placement Location of the cloud disk.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found. 
     * @return IsReturnable Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found.
     * @param IsReturnable Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * Get Expiration time of the cloud disk. 
     * @return DeadlineTime Expiration time of the cloud disk.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Expiration time of the cloud disk.
     * @param DeadlineTime Expiration time of the cloud disk.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted. 
     * @return Attached Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted.
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted.
     * @param Attached Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted.
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get Cloud disk size (in GB). 
     * @return DiskSize Cloud disk size (in GB).
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size (in GB).
     * @param DiskSize Cloud disk size (in GB).
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found. 
     * @return MigratePercent Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getMigratePercent() {
        return this.MigratePercent;
    }

    /**
     * Set Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found.
     * @param MigratePercent Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMigratePercent(Long MigratePercent) {
        this.MigratePercent = MigratePercent;
    }

    /**
     * Get Cloud disk type. Value range:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk. 
     * @return DiskUsage Cloud disk type. Value range:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud disk type. Value range:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     * @param DiskUsage Cloud disk type. Value range:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go. 
     * @return DiskChargeType Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     * @param DiskChargeType Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Whether it is an elastic cloud disk. false: Non-elastic cloud disk; true: Elastic cloud disk. 
     * @return Portable Whether it is an elastic cloud disk. false: Non-elastic cloud disk; true: Elastic cloud disk.
     */
    public Boolean getPortable() {
        return this.Portable;
    }

    /**
     * Set Whether it is an elastic cloud disk. false: Non-elastic cloud disk; true: Elastic cloud disk.
     * @param Portable Whether it is an elastic cloud disk. false: Non-elastic cloud disk; true: Elastic cloud disk.
     */
    public void setPortable(Boolean Portable) {
        this.Portable = Portable;
    }

    /**
     * Get Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots. 
     * @return SnapshotAbility Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots.
     */
    public Boolean getSnapshotAbility() {
        return this.SnapshotAbility;
    }

    /**
     * Set Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots.
     * @param SnapshotAbility Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots.
     */
    public void setSnapshotAbility(Boolean SnapshotAbility) {
        this.SnapshotAbility = SnapshotAbility;
    }

    /**
     * Get This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false:Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found. 
     * @return DeadlineError This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false:Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getDeadlineError() {
        return this.DeadlineError;
    }

    /**
     * Set This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false:Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     * @param DeadlineError This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false:Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDeadlineError(Boolean DeadlineError) {
        this.DeadlineError = DeadlineError;
    }

    /**
     * Get Rollback progress of a cloud disk snapshot. 
     * @return RollbackPercent Rollback progress of a cloud disk snapshot.
     */
    public Long getRollbackPercent() {
        return this.RollbackPercent;
    }

    /**
     * Set Rollback progress of a cloud disk snapshot.
     * @param RollbackPercent Rollback progress of a cloud disk snapshot.
     */
    public void setRollbackPercent(Long RollbackPercent) {
        this.RollbackPercent = RollbackPercent;
    }

    /**
     * Get Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found. 
     * @return DifferDaysOfDeadline Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getDifferDaysOfDeadline() {
        return this.DifferDaysOfDeadline;
    }

    /**
     * Set Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found.
     * @param DifferDaysOfDeadline Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDifferDaysOfDeadline(Long DifferDaysOfDeadline) {
        this.DifferDaysOfDeadline = DifferDaysOfDeadline;
    }

    /**
     * Get In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found. 
     * @return ReturnFailCode In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found.
     * @param ReturnFailCode In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setReturnFailCode(Long ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * Get Whether or not cloud disk is shareable cloud disk. 
     * @return Shareable Whether or not cloud disk is shareable cloud disk.
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set Whether or not cloud disk is shareable cloud disk.
     * @param Shareable Whether or not cloud disk is shareable cloud disk.
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    /**
     * Get Creation time of the cloud disk. 
     * @return CreateTime Creation time of the cloud disk.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the cloud disk.
     * @param CreateTime Creation time of the cloud disk.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default). `1`: Yes. To check whether a snapshot is permanently reserved, refer to the `IsPermanent` field returned by the `DescribeSnapshots` API.  
     * @return DeleteSnapshot Delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default). `1`: Yes. To check whether a snapshot is permanently reserved, refer to the `IsPermanent` field returned by the `DescribeSnapshots` API. 
     */
    public Long getDeleteSnapshot() {
        return this.DeleteSnapshot;
    }

    /**
     * Set Delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default). `1`: Yes. To check whether a snapshot is permanently reserved, refer to the `IsPermanent` field returned by the `DescribeSnapshots` API. 
     * @param DeleteSnapshot Delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default). `1`: Yes. To check whether a snapshot is permanently reserved, refer to the `IsPermanent` field returned by the `DescribeSnapshots` API. 
     */
    public void setDeleteSnapshot(Long DeleteSnapshot) {
        this.DeleteSnapshot = DeleteSnapshot;
    }

    /**
     * Get Quota of cloud disk backup points, i.e., the maximum number of backup points that a cloud disk can have. 
     * @return DiskBackupQuota Quota of cloud disk backup points, i.e., the maximum number of backup points that a cloud disk can have.
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set Quota of cloud disk backup points, i.e., the maximum number of backup points that a cloud disk can have.
     * @param DiskBackupQuota Quota of cloud disk backup points, i.e., the maximum number of backup points that a cloud disk can have.
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    /**
     * Get Number of used cloud disk backups. 
     * @return DiskBackupCount Number of used cloud disk backups.
     */
    public Long getDiskBackupCount() {
        return this.DiskBackupCount;
    }

    /**
     * Set Number of used cloud disk backups.
     * @param DiskBackupCount Number of used cloud disk backups.
     */
    public void setDiskBackupCount(Long DiskBackupCount) {
        this.DiskBackupCount = DiskBackupCount;
    }

    /**
     * Get Type of the instance mounted to the cloud disk. Valid values: <br><li>CVM<br><li>EKS 
     * @return InstanceType Type of the instance mounted to the cloud disk. Valid values: <br><li>CVM<br><li>EKS
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Type of the instance mounted to the cloud disk. Valid values: <br><li>CVM<br><li>EKS
     * @param InstanceType Type of the instance mounted to the cloud disk. Valid values: <br><li>CVM<br><li>EKS
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get  
     * @return LastAttachInsId 
     */
    public String getLastAttachInsId() {
        return this.LastAttachInsId;
    }

    /**
     * Set 
     * @param LastAttachInsId 
     */
    public void setLastAttachInsId(String LastAttachInsId) {
        this.LastAttachInsId = LastAttachInsId;
    }

    /**
     * Get  
     * @return ErrorPrompt 
     */
    public String getErrorPrompt() {
        return this.ErrorPrompt;
    }

    /**
     * Set 
     * @param ErrorPrompt 
     */
    public void setErrorPrompt(String ErrorPrompt) {
        this.ErrorPrompt = ErrorPrompt;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskState != null) {
            this.DiskState = new String(source.DiskState);
        }
        if (source.SnapshotCount != null) {
            this.SnapshotCount = new Long(source.SnapshotCount);
        }
        if (source.AutoRenewFlagError != null) {
            this.AutoRenewFlagError = new Boolean(source.AutoRenewFlagError);
        }
        if (source.Rollbacking != null) {
            this.Rollbacking = new Boolean(source.Rollbacking);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.BackupDisk != null) {
            this.BackupDisk = new Boolean(source.BackupDisk);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AttachMode != null) {
            this.AttachMode = new String(source.AttachMode);
        }
        if (source.AutoSnapshotPolicyIds != null) {
            this.AutoSnapshotPolicyIds = new String[source.AutoSnapshotPolicyIds.length];
            for (int i = 0; i < source.AutoSnapshotPolicyIds.length; i++) {
                this.AutoSnapshotPolicyIds[i] = new String(source.AutoSnapshotPolicyIds[i]);
            }
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.Migrating != null) {
            this.Migrating = new Boolean(source.Migrating);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.SnapshotSize != null) {
            this.SnapshotSize = new Long(source.SnapshotSize);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.IsReturnable != null) {
            this.IsReturnable = new Boolean(source.IsReturnable);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Attached != null) {
            this.Attached = new Boolean(source.Attached);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MigratePercent != null) {
            this.MigratePercent = new Long(source.MigratePercent);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.Portable != null) {
            this.Portable = new Boolean(source.Portable);
        }
        if (source.SnapshotAbility != null) {
            this.SnapshotAbility = new Boolean(source.SnapshotAbility);
        }
        if (source.DeadlineError != null) {
            this.DeadlineError = new Boolean(source.DeadlineError);
        }
        if (source.RollbackPercent != null) {
            this.RollbackPercent = new Long(source.RollbackPercent);
        }
        if (source.DifferDaysOfDeadline != null) {
            this.DifferDaysOfDeadline = new Long(source.DifferDaysOfDeadline);
        }
        if (source.ReturnFailCode != null) {
            this.ReturnFailCode = new Long(source.ReturnFailCode);
        }
        if (source.Shareable != null) {
            this.Shareable = new Boolean(source.Shareable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeleteSnapshot != null) {
            this.DeleteSnapshot = new Long(source.DeleteSnapshot);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
        if (source.DiskBackupCount != null) {
            this.DiskBackupCount = new Long(source.DiskBackupCount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.LastAttachInsId != null) {
            this.LastAttachInsId = new String(source.LastAttachInsId);
        }
        if (source.ErrorPrompt != null) {
            this.ErrorPrompt = new String(source.ErrorPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "SnapshotCount", this.SnapshotCount);
        this.setParamSimple(map, prefix + "AutoRenewFlagError", this.AutoRenewFlagError);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "BackupDisk", this.BackupDisk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AttachMode", this.AttachMode);
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "Migrating", this.Migrating);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MigratePercent", this.MigratePercent);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamSimple(map, prefix + "SnapshotAbility", this.SnapshotAbility);
        this.setParamSimple(map, prefix + "DeadlineError", this.DeadlineError);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "DifferDaysOfDeadline", this.DifferDaysOfDeadline);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeleteSnapshot", this.DeleteSnapshot);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);
        this.setParamSimple(map, prefix + "DiskBackupCount", this.DiskBackupCount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "LastAttachInsId", this.LastAttachInsId);
        this.setParamSimple(map, prefix + "ErrorPrompt", this.ErrorPrompt);

    }
}

