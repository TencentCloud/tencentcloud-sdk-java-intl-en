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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel {

    /**
    * Specifies whether the cloud disk is destroyed along with the mounted instance.<br><li>true: destroy the cloud disk along with the instance. only hourly postpaid cloud disk is supported.</li><li>false: destroying instance without destroying cloud disk.</li>.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * AUTO renewal flag. supported values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY expiry AND RENEW automatically</li><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiry but not RENEW automatically</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither NOTIFY expiry nor RENEW automatically.</li>.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Hard disk media type. valid values:<br><li>CLOUD_BASIC: BASIC CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_BSSD: universal type SSD CLOUD disk</li><li>CLOUD_SSD: SSD CLOUD disk</li><li>CLOUD_HSSD: enhanced SSD CLOUD disk</li><li>CLOUD_TSSD: ultra-fast SSD cbs.</li>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk state. valid values:<br><li>UNATTACHED: unmounted</li><li>ATTACHING: mounting</li><li>ATTACHED: mounted</li><li>DETACHING: unmounting</li><li>EXPANDING: EXPANDING</li><li>ROLLBACKING: rolling back</li><li>TORECYCLE: to be recycled</li><li>DUMPING: copying hard drive.</li>.
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
    * Cloud disk mounted to child machine, and both child machine and cloud disk are on a monthly subscription basis.<br><li>true: auto renewal flag is set for child machine, but cloud disk not set</li><li>false: cloud disk auto-renewal flag normal</li>.
    */
    @SerializedName("AutoRenewFlagError")
    @Expose
    private Boolean AutoRenewFlagError;

    /**
    * Indicates if the cloud disk is in snapshot rollback status. valid values: <br><li>false: means not in snapshot rollback status</li><li>true: means in snapshot rollback status.</li>.
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
    * Indicates whether the cloud disk is encrypted. valid values:<br><li>false: non-encrypted disk</li><li>true: encrypted disk</li>.
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
    * It indicates the tag bound to the cloud disk. If the cloud disk is not bound to any tag, the value is empty.
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
    * The mount type of the cloud disk. valid values: <br><li>PF: PF mount</li><li>VF: VF mount</li>.
    */
    @SerializedName("AttachMode")
    @Expose
    private String AttachMode;

    /**
    * Regular snapshot ID associated with the cloud disk. return this parameter only when calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API with ReturnBindAutoSnapshotPolicy set to TRUE.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * Specifies the additional performance value of the CBS in MiB/s.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Indicates if the cloud disk is in type change. valid values: <br><li>false: means the cloud disk is not in type change</li><li>true: means the cloud disk has initiated type change and is migrating.</li>.
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
    * Total snapshot capacity of the cloud disk. unit: MiB.
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
    * Determines if a prepaid cloud disk supports proactive return.<br><li>true: supports proactive return</li><li>false: does not support proactive return.</li>.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Indicates whether the cloud disk is mounted to the cvm. valid values: <br><li>false: means not mounted</li><li>true: means mounted.</li>.
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * Specifies the disk capacity in GiB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * It indicates the migration progress of cloud disk type change. The value range is 0 to 100.
    */
    @SerializedName("MigratePercent")
    @Expose
    private Long MigratePercent;

    /**
    * Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><li>DATA_DISK: DATA DISK.</li>.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
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
    * Specifies whether the cloud disk has the capability to create snapshots. valid values:<br><li>false: cannot create snapshots</li><li>true: can create snapshots.</li>.
    */
    @SerializedName("SnapshotAbility")
    @Expose
    private Boolean SnapshotAbility;

    /**
    * Indicates whether the cloud disk expiration time is earlier than that of the instance. this field is valid only when the cloud disk is mounted to the instance and both the instance and the cloud disk are on a monthly subscription basis.<br><li>true: the expiration time of the cloud disk is earlier than that of the instance.</li><li>false: cloud disk expiration time later than instance.</li>.
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
    * The number of days from the current time to disk expiration (only applicable to prepaid cbs).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * For prepaid cloud disks that do not support proactive return, this parameter indicates the specific reason for not supporting refund. value range: <br><li>1: the cloud disk has already been returned.</li><li>2: the cloud disk has expired.</li><li>3: the cloud disk does not support return.</li><li>8: the maximum returnable quantity is exceeded.</li><li>10: non-elastic cloud disks, system disks, and pay-as-you-go cloud disks do not support return.</li>.
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
    * Specifies whether to delete associated non-permanently retained snapshots when destroying the cloud disk. 0 indicates non-permanent snapshots are not deleted with cloud disk destruction, 1 indicates non-permanent snapshots are deleted with cloud disk destruction. default value: 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the DescribeSnapshots API (https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1). true indicates permanent snapshot, false indicates non-permanent snapshot.
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
    * The type of the CBS mounting instance. valid values: <br><li>CVM</li><li>EKS</li>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * ID of the last instance to which the cloud disk is attached
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastAttachInsId")
    @Expose
    private String LastAttachInsId;

    /**
    * Error prompt for the last operation on cbs.
    */
    @SerializedName("ErrorPrompt")
    @Expose
    private String ErrorPrompt;

    /**
    * Whether performance burst is enabled for the cloud disk.
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
    * Encryption type of cbs. valid values: ENCRYPT_V1 and ENCRYPT_V2, which indicate first generation and second generation encryption technology respectively. the two kinds are incompatible.
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * Key ID of the encrypted disk.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get Specifies whether the cloud disk is destroyed along with the mounted instance.<br><li>true: destroy the cloud disk along with the instance. only hourly postpaid cloud disk is supported.</li><li>false: destroying instance without destroying cloud disk.</li>. 
     * @return DeleteWithInstance Specifies whether the cloud disk is destroyed along with the mounted instance.<br><li>true: destroy the cloud disk along with the instance. only hourly postpaid cloud disk is supported.</li><li>false: destroying instance without destroying cloud disk.</li>.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Specifies whether the cloud disk is destroyed along with the mounted instance.<br><li>true: destroy the cloud disk along with the instance. only hourly postpaid cloud disk is supported.</li><li>false: destroying instance without destroying cloud disk.</li>.
     * @param DeleteWithInstance Specifies whether the cloud disk is destroyed along with the mounted instance.<br><li>true: destroy the cloud disk along with the instance. only hourly postpaid cloud disk is supported.</li><li>false: destroying instance without destroying cloud disk.</li>.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get AUTO renewal flag. supported values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY expiry AND RENEW automatically</li><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiry but not RENEW automatically</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither NOTIFY expiry nor RENEW automatically.</li>. 
     * @return RenewFlag AUTO renewal flag. supported values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY expiry AND RENEW automatically</li><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiry but not RENEW automatically</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither NOTIFY expiry nor RENEW automatically.</li>.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set AUTO renewal flag. supported values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY expiry AND RENEW automatically</li><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiry but not RENEW automatically</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither NOTIFY expiry nor RENEW automatically.</li>.
     * @param RenewFlag AUTO renewal flag. supported values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY expiry AND RENEW automatically</li><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiry but not RENEW automatically</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: neither NOTIFY expiry nor RENEW automatically.</li>.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Hard disk media type. valid values:<br><li>CLOUD_BASIC: BASIC CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_BSSD: universal type SSD CLOUD disk</li><li>CLOUD_SSD: SSD CLOUD disk</li><li>CLOUD_HSSD: enhanced SSD CLOUD disk</li><li>CLOUD_TSSD: ultra-fast SSD cbs.</li>. 
     * @return DiskType Hard disk media type. valid values:<br><li>CLOUD_BASIC: BASIC CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_BSSD: universal type SSD CLOUD disk</li><li>CLOUD_SSD: SSD CLOUD disk</li><li>CLOUD_HSSD: enhanced SSD CLOUD disk</li><li>CLOUD_TSSD: ultra-fast SSD cbs.</li>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Hard disk media type. valid values:<br><li>CLOUD_BASIC: BASIC CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_BSSD: universal type SSD CLOUD disk</li><li>CLOUD_SSD: SSD CLOUD disk</li><li>CLOUD_HSSD: enhanced SSD CLOUD disk</li><li>CLOUD_TSSD: ultra-fast SSD cbs.</li>.
     * @param DiskType Hard disk media type. valid values:<br><li>CLOUD_BASIC: BASIC CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_BSSD: universal type SSD CLOUD disk</li><li>CLOUD_SSD: SSD CLOUD disk</li><li>CLOUD_HSSD: enhanced SSD CLOUD disk</li><li>CLOUD_TSSD: ultra-fast SSD cbs.</li>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk state. valid values:<br><li>UNATTACHED: unmounted</li><li>ATTACHING: mounting</li><li>ATTACHED: mounted</li><li>DETACHING: unmounting</li><li>EXPANDING: EXPANDING</li><li>ROLLBACKING: rolling back</li><li>TORECYCLE: to be recycled</li><li>DUMPING: copying hard drive.</li>. 
     * @return DiskState Cloud disk state. valid values:<br><li>UNATTACHED: unmounted</li><li>ATTACHING: mounting</li><li>ATTACHED: mounted</li><li>DETACHING: unmounting</li><li>EXPANDING: EXPANDING</li><li>ROLLBACKING: rolling back</li><li>TORECYCLE: to be recycled</li><li>DUMPING: copying hard drive.</li>.
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set Cloud disk state. valid values:<br><li>UNATTACHED: unmounted</li><li>ATTACHING: mounting</li><li>ATTACHED: mounted</li><li>DETACHING: unmounting</li><li>EXPANDING: EXPANDING</li><li>ROLLBACKING: rolling back</li><li>TORECYCLE: to be recycled</li><li>DUMPING: copying hard drive.</li>.
     * @param DiskState Cloud disk state. valid values:<br><li>UNATTACHED: unmounted</li><li>ATTACHING: mounting</li><li>ATTACHED: mounted</li><li>DETACHING: unmounting</li><li>EXPANDING: EXPANDING</li><li>ROLLBACKING: rolling back</li><li>TORECYCLE: to be recycled</li><li>DUMPING: copying hard drive.</li>.
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
     * Get Cloud disk mounted to child machine, and both child machine and cloud disk are on a monthly subscription basis.<br><li>true: auto renewal flag is set for child machine, but cloud disk not set</li><li>false: cloud disk auto-renewal flag normal</li>. 
     * @return AutoRenewFlagError Cloud disk mounted to child machine, and both child machine and cloud disk are on a monthly subscription basis.<br><li>true: auto renewal flag is set for child machine, but cloud disk not set</li><li>false: cloud disk auto-renewal flag normal</li>.
     */
    public Boolean getAutoRenewFlagError() {
        return this.AutoRenewFlagError;
    }

    /**
     * Set Cloud disk mounted to child machine, and both child machine and cloud disk are on a monthly subscription basis.<br><li>true: auto renewal flag is set for child machine, but cloud disk not set</li><li>false: cloud disk auto-renewal flag normal</li>.
     * @param AutoRenewFlagError Cloud disk mounted to child machine, and both child machine and cloud disk are on a monthly subscription basis.<br><li>true: auto renewal flag is set for child machine, but cloud disk not set</li><li>false: cloud disk auto-renewal flag normal</li>.
     */
    public void setAutoRenewFlagError(Boolean AutoRenewFlagError) {
        this.AutoRenewFlagError = AutoRenewFlagError;
    }

    /**
     * Get Indicates if the cloud disk is in snapshot rollback status. valid values: <br><li>false: means not in snapshot rollback status</li><li>true: means in snapshot rollback status.</li>. 
     * @return Rollbacking Indicates if the cloud disk is in snapshot rollback status. valid values: <br><li>false: means not in snapshot rollback status</li><li>true: means in snapshot rollback status.</li>.
     */
    public Boolean getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * Set Indicates if the cloud disk is in snapshot rollback status. valid values: <br><li>false: means not in snapshot rollback status</li><li>true: means in snapshot rollback status.</li>.
     * @param Rollbacking Indicates if the cloud disk is in snapshot rollback status. valid values: <br><li>false: means not in snapshot rollback status</li><li>true: means in snapshot rollback status.</li>.
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
     * Get Indicates whether the cloud disk is encrypted. valid values:<br><li>false: non-encrypted disk</li><li>true: encrypted disk</li>. 
     * @return Encrypt Indicates whether the cloud disk is encrypted. valid values:<br><li>false: non-encrypted disk</li><li>true: encrypted disk</li>.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Indicates whether the cloud disk is encrypted. valid values:<br><li>false: non-encrypted disk</li><li>true: encrypted disk</li>.
     * @param Encrypt Indicates whether the cloud disk is encrypted. valid values:<br><li>false: non-encrypted disk</li><li>true: encrypted disk</li>.
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
     * Get It indicates the tag bound to the cloud disk. If the cloud disk is not bound to any tag, the value is empty. 
     * @return Tags It indicates the tag bound to the cloud disk. If the cloud disk is not bound to any tag, the value is empty.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set It indicates the tag bound to the cloud disk. If the cloud disk is not bound to any tag, the value is empty.
     * @param Tags It indicates the tag bound to the cloud disk. If the cloud disk is not bound to any tag, the value is empty.
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
     * Get The mount type of the cloud disk. valid values: <br><li>PF: PF mount</li><li>VF: VF mount</li>. 
     * @return AttachMode The mount type of the cloud disk. valid values: <br><li>PF: PF mount</li><li>VF: VF mount</li>.
     */
    public String getAttachMode() {
        return this.AttachMode;
    }

    /**
     * Set The mount type of the cloud disk. valid values: <br><li>PF: PF mount</li><li>VF: VF mount</li>.
     * @param AttachMode The mount type of the cloud disk. valid values: <br><li>PF: PF mount</li><li>VF: VF mount</li>.
     */
    public void setAttachMode(String AttachMode) {
        this.AttachMode = AttachMode;
    }

    /**
     * Get Regular snapshot ID associated with the cloud disk. return this parameter only when calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API with ReturnBindAutoSnapshotPolicy set to TRUE.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoSnapshotPolicyIds Regular snapshot ID associated with the cloud disk. return this parameter only when calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API with ReturnBindAutoSnapshotPolicy set to TRUE.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set Regular snapshot ID associated with the cloud disk. return this parameter only when calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API with ReturnBindAutoSnapshotPolicy set to TRUE.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoSnapshotPolicyIds Regular snapshot ID associated with the cloud disk. return this parameter only when calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API with ReturnBindAutoSnapshotPolicy set to TRUE.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get Specifies the additional performance value of the CBS in MiB/s. 
     * @return ThroughputPerformance Specifies the additional performance value of the CBS in MiB/s.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Specifies the additional performance value of the CBS in MiB/s.
     * @param ThroughputPerformance Specifies the additional performance value of the CBS in MiB/s.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Indicates if the cloud disk is in type change. valid values: <br><li>false: means the cloud disk is not in type change</li><li>true: means the cloud disk has initiated type change and is migrating.</li>. 
     * @return Migrating Indicates if the cloud disk is in type change. valid values: <br><li>false: means the cloud disk is not in type change</li><li>true: means the cloud disk has initiated type change and is migrating.</li>.
     */
    public Boolean getMigrating() {
        return this.Migrating;
    }

    /**
     * Set Indicates if the cloud disk is in type change. valid values: <br><li>false: means the cloud disk is not in type change</li><li>true: means the cloud disk has initiated type change and is migrating.</li>.
     * @param Migrating Indicates if the cloud disk is in type change. valid values: <br><li>false: means the cloud disk is not in type change</li><li>true: means the cloud disk has initiated type change and is migrating.</li>.
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
     * Get Total snapshot capacity of the cloud disk. unit: MiB. 
     * @return SnapshotSize Total snapshot capacity of the cloud disk. unit: MiB.
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set Total snapshot capacity of the cloud disk. unit: MiB.
     * @param SnapshotSize Total snapshot capacity of the cloud disk. unit: MiB.
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
     * Get Determines if a prepaid cloud disk supports proactive return.<br><li>true: supports proactive return</li><li>false: does not support proactive return.</li>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsReturnable Determines if a prepaid cloud disk supports proactive return.<br><li>true: supports proactive return</li><li>false: does not support proactive return.</li>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set Determines if a prepaid cloud disk supports proactive return.<br><li>true: supports proactive return</li><li>false: does not support proactive return.</li>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsReturnable Determines if a prepaid cloud disk supports proactive return.<br><li>true: supports proactive return</li><li>false: does not support proactive return.</li>.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Indicates whether the cloud disk is mounted to the cvm. valid values: <br><li>false: means not mounted</li><li>true: means mounted.</li>. 
     * @return Attached Indicates whether the cloud disk is mounted to the cvm. valid values: <br><li>false: means not mounted</li><li>true: means mounted.</li>.
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set Indicates whether the cloud disk is mounted to the cvm. valid values: <br><li>false: means not mounted</li><li>true: means mounted.</li>.
     * @param Attached Indicates whether the cloud disk is mounted to the cvm. valid values: <br><li>false: means not mounted</li><li>true: means mounted.</li>.
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get Specifies the disk capacity in GiB. 
     * @return DiskSize Specifies the disk capacity in GiB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk capacity in GiB.
     * @param DiskSize Specifies the disk capacity in GiB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get It indicates the migration progress of cloud disk type change. The value range is 0 to 100. 
     * @return MigratePercent It indicates the migration progress of cloud disk type change. The value range is 0 to 100.
     */
    public Long getMigratePercent() {
        return this.MigratePercent;
    }

    /**
     * Set It indicates the migration progress of cloud disk type change. The value range is 0 to 100.
     * @param MigratePercent It indicates the migration progress of cloud disk type change. The value range is 0 to 100.
     */
    public void setMigratePercent(Long MigratePercent) {
        this.MigratePercent = MigratePercent;
    }

    /**
     * Get Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><li>DATA_DISK: DATA DISK.</li>. 
     * @return DiskUsage Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><li>DATA_DISK: DATA DISK.</li>.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><li>DATA_DISK: DATA DISK.</li>.
     * @param DiskUsage Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><li>DATA_DISK: DATA DISK.</li>.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>. 
     * @return DiskChargeType Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
     * @param DiskChargeType Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
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
     * Get Specifies whether the cloud disk has the capability to create snapshots. valid values:<br><li>false: cannot create snapshots</li><li>true: can create snapshots.</li>. 
     * @return SnapshotAbility Specifies whether the cloud disk has the capability to create snapshots. valid values:<br><li>false: cannot create snapshots</li><li>true: can create snapshots.</li>.
     */
    public Boolean getSnapshotAbility() {
        return this.SnapshotAbility;
    }

    /**
     * Set Specifies whether the cloud disk has the capability to create snapshots. valid values:<br><li>false: cannot create snapshots</li><li>true: can create snapshots.</li>.
     * @param SnapshotAbility Specifies whether the cloud disk has the capability to create snapshots. valid values:<br><li>false: cannot create snapshots</li><li>true: can create snapshots.</li>.
     */
    public void setSnapshotAbility(Boolean SnapshotAbility) {
        this.SnapshotAbility = SnapshotAbility;
    }

    /**
     * Get Indicates whether the cloud disk expiration time is earlier than that of the instance. this field is valid only when the cloud disk is mounted to the instance and both the instance and the cloud disk are on a monthly subscription basis.<br><li>true: the expiration time of the cloud disk is earlier than that of the instance.</li><li>false: cloud disk expiration time later than instance.</li>. 
     * @return DeadlineError Indicates whether the cloud disk expiration time is earlier than that of the instance. this field is valid only when the cloud disk is mounted to the instance and both the instance and the cloud disk are on a monthly subscription basis.<br><li>true: the expiration time of the cloud disk is earlier than that of the instance.</li><li>false: cloud disk expiration time later than instance.</li>.
     */
    public Boolean getDeadlineError() {
        return this.DeadlineError;
    }

    /**
     * Set Indicates whether the cloud disk expiration time is earlier than that of the instance. this field is valid only when the cloud disk is mounted to the instance and both the instance and the cloud disk are on a monthly subscription basis.<br><li>true: the expiration time of the cloud disk is earlier than that of the instance.</li><li>false: cloud disk expiration time later than instance.</li>.
     * @param DeadlineError Indicates whether the cloud disk expiration time is earlier than that of the instance. this field is valid only when the cloud disk is mounted to the instance and both the instance and the cloud disk are on a monthly subscription basis.<br><li>true: the expiration time of the cloud disk is earlier than that of the instance.</li><li>false: cloud disk expiration time later than instance.</li>.
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
     * Get The number of days from the current time to disk expiration (only applicable to prepaid cbs).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DifferDaysOfDeadline The number of days from the current time to disk expiration (only applicable to prepaid cbs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDifferDaysOfDeadline() {
        return this.DifferDaysOfDeadline;
    }

    /**
     * Set The number of days from the current time to disk expiration (only applicable to prepaid cbs).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DifferDaysOfDeadline The number of days from the current time to disk expiration (only applicable to prepaid cbs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDifferDaysOfDeadline(Long DifferDaysOfDeadline) {
        this.DifferDaysOfDeadline = DifferDaysOfDeadline;
    }

    /**
     * Get For prepaid cloud disks that do not support proactive return, this parameter indicates the specific reason for not supporting refund. value range: <br><li>1: the cloud disk has already been returned.</li><li>2: the cloud disk has expired.</li><li>3: the cloud disk does not support return.</li><li>8: the maximum returnable quantity is exceeded.</li><li>10: non-elastic cloud disks, system disks, and pay-as-you-go cloud disks do not support return.</li>. 
     * @return ReturnFailCode For prepaid cloud disks that do not support proactive return, this parameter indicates the specific reason for not supporting refund. value range: <br><li>1: the cloud disk has already been returned.</li><li>2: the cloud disk has expired.</li><li>3: the cloud disk does not support return.</li><li>8: the maximum returnable quantity is exceeded.</li><li>10: non-elastic cloud disks, system disks, and pay-as-you-go cloud disks do not support return.</li>.
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set For prepaid cloud disks that do not support proactive return, this parameter indicates the specific reason for not supporting refund. value range: <br><li>1: the cloud disk has already been returned.</li><li>2: the cloud disk has expired.</li><li>3: the cloud disk does not support return.</li><li>8: the maximum returnable quantity is exceeded.</li><li>10: non-elastic cloud disks, system disks, and pay-as-you-go cloud disks do not support return.</li>.
     * @param ReturnFailCode For prepaid cloud disks that do not support proactive return, this parameter indicates the specific reason for not supporting refund. value range: <br><li>1: the cloud disk has already been returned.</li><li>2: the cloud disk has expired.</li><li>3: the cloud disk does not support return.</li><li>8: the maximum returnable quantity is exceeded.</li><li>10: non-elastic cloud disks, system disks, and pay-as-you-go cloud disks do not support return.</li>.
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
     * Get Specifies whether to delete associated non-permanently retained snapshots when destroying the cloud disk. 0 indicates non-permanent snapshots are not deleted with cloud disk destruction, 1 indicates non-permanent snapshots are deleted with cloud disk destruction. default value: 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the DescribeSnapshots API (https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1). true indicates permanent snapshot, false indicates non-permanent snapshot. 
     * @return DeleteSnapshot Specifies whether to delete associated non-permanently retained snapshots when destroying the cloud disk. 0 indicates non-permanent snapshots are not deleted with cloud disk destruction, 1 indicates non-permanent snapshots are deleted with cloud disk destruction. default value: 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the DescribeSnapshots API (https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1). true indicates permanent snapshot, false indicates non-permanent snapshot.
     */
    public Long getDeleteSnapshot() {
        return this.DeleteSnapshot;
    }

    /**
     * Set Specifies whether to delete associated non-permanently retained snapshots when destroying the cloud disk. 0 indicates non-permanent snapshots are not deleted with cloud disk destruction, 1 indicates non-permanent snapshots are deleted with cloud disk destruction. default value: 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the DescribeSnapshots API (https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1). true indicates permanent snapshot, false indicates non-permanent snapshot.
     * @param DeleteSnapshot Specifies whether to delete associated non-permanently retained snapshots when destroying the cloud disk. 0 indicates non-permanent snapshots are not deleted with cloud disk destruction, 1 indicates non-permanent snapshots are deleted with cloud disk destruction. default value: 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the DescribeSnapshots API (https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1). true indicates permanent snapshot, false indicates non-permanent snapshot.
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
     * Get The type of the CBS mounting instance. valid values: <br><li>CVM</li><li>EKS</li>. 
     * @return InstanceType The type of the CBS mounting instance. valid values: <br><li>CVM</li><li>EKS</li>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of the CBS mounting instance. valid values: <br><li>CVM</li><li>EKS</li>.
     * @param InstanceType The type of the CBS mounting instance. valid values: <br><li>CVM</li><li>EKS</li>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get ID of the last instance to which the cloud disk is attached
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastAttachInsId ID of the last instance to which the cloud disk is attached
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastAttachInsId() {
        return this.LastAttachInsId;
    }

    /**
     * Set ID of the last instance to which the cloud disk is attached
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastAttachInsId ID of the last instance to which the cloud disk is attached
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastAttachInsId(String LastAttachInsId) {
        this.LastAttachInsId = LastAttachInsId;
    }

    /**
     * Get Error prompt for the last operation on cbs. 
     * @return ErrorPrompt Error prompt for the last operation on cbs.
     */
    public String getErrorPrompt() {
        return this.ErrorPrompt;
    }

    /**
     * Set Error prompt for the last operation on cbs.
     * @param ErrorPrompt Error prompt for the last operation on cbs.
     */
    public void setErrorPrompt(String ErrorPrompt) {
        this.ErrorPrompt = ErrorPrompt;
    }

    /**
     * Get Whether performance burst is enabled for the cloud disk. 
     * @return BurstPerformance Whether performance burst is enabled for the cloud disk.
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set Whether performance burst is enabled for the cloud disk.
     * @param BurstPerformance Whether performance burst is enabled for the cloud disk.
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    /**
     * Get Encryption type of cbs. valid values: ENCRYPT_V1 and ENCRYPT_V2, which indicate first generation and second generation encryption technology respectively. the two kinds are incompatible. 
     * @return EncryptType Encryption type of cbs. valid values: ENCRYPT_V1 and ENCRYPT_V2, which indicate first generation and second generation encryption technology respectively. the two kinds are incompatible.
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set Encryption type of cbs. valid values: ENCRYPT_V1 and ENCRYPT_V2, which indicate first generation and second generation encryption technology respectively. the two kinds are incompatible.
     * @param EncryptType Encryption type of cbs. valid values: ENCRYPT_V1 and ENCRYPT_V2, which indicate first generation and second generation encryption technology respectively. the two kinds are incompatible.
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get Key ID of the encrypted disk. 
     * @return KmsKeyId Key ID of the encrypted disk.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Key ID of the encrypted disk.
     * @param KmsKeyId Key ID of the encrypted disk.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
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
        if (source.BurstPerformance != null) {
            this.BurstPerformance = new Boolean(source.BurstPerformance);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
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
        this.setParamSimple(map, prefix + "BurstPerformance", this.BurstPerformance);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

