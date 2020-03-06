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
    * Cloud disk ID.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

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
    * Location of the cloud disk.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Whether the cloud disk has the capability to create snapshots. Value range: <br><li>false: Cannot create snapshots. true: Can create snapshots.
    */
    @SerializedName("SnapshotAbility")
    @Expose
    private Boolean SnapshotAbility;

    /**
    * Cloud disk name.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Cloud disk size (in GB).
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * The state of the cloud disk. Value range: <br><li>UNATTACHED: Not mounted <br><li>ATTACHING: Mounting <br><li>ATTACHED: Mounted <br><li>DETACHING: Un-mounting <br><li>EXPANDING: Expanding <br><li>ROLLBACKING: Rolling back <br><li>TORECYCE: Pending recycling. <br><li>DUMPING: Copying the hard drive.
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Whether the cloud disk is mounted to the CVM. Value range: <br><li>false: Unmounted <br><li>true: Mounted.
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * ID of the CVM to which the cloud disk is mounted.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation time of the cloud disk.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time of the cloud disk.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Whether the cloud disk is in the status of snapshot rollback. Value range: <br><li>false: No <br><li>true: Yes
    */
    @SerializedName("Rollbacking")
    @Expose
    private Boolean Rollbacking;

    /**
    * Rollback progress of a cloud disk snapshot.
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Long RollbackPercent;

    /**
    * Whether the cloud disk is encrypted. Value range: <br><li>false: Not encrypted <br><li>true: Encrypted.
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * Cloud disk already mounted to CVM, and both CVM and cloud disk use monthly subscription.<br><li>true: CVM has auto-renewal flag set up, but cloud disk does not.<br><li>false: Cloud disk auto-renewal flag set up normally.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AutoRenewFlagError")
    @Expose
    private Boolean AutoRenewFlagError;

    /**
    * Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW: Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Neither notify expiry nor renew automatically.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false： Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeadlineError")
    @Expose
    private Boolean DeadlineError;

    /**
    * Determines whether or not prepaid cloud disk supports active return. <br><li>true: Active return supported.<br><li>false: Active return not supported.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * In circumstances where the prepaid cloud disk does not support active return, this parameter indicates the reason that return is not supported. Value range: <br><li>1: The cloud disk has already been returned. <br><li>2: The cloud disk has already expired. <br><li>3: The cloud disk does not support return. <br><li> 8: The limit on the number of returns is exceeded.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * ID of the periodic snapshot associated to the cloud disk. This parameter is returned only if the value of parameter ReturnBindAutoSnapshotPolicy is TRUE when the API DescribeDisks is called.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * The tag bound to the cloud disk. The value Null is used when no tag is bound to the cloud disk.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether the cloud disk terminates along with the instance mounted to it. <br><li>true: Cloud disk will also be terminated when instance terminates, so only hourly postpaid cloud disk are supported.<br><li>false: Cloud disk does not terminate when instance terminates.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Number of days from current time until disk expiration (only applicable for prepaid disks).
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * Whether cloud disk is in process of type change. Value range: <br><li>false: Cloud disk not in process of type change. <br><li>true: Cloud disk type change has been launched, and migration is in process.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Migrating")
    @Expose
    private Boolean Migrating;

    /**
    * Migration progress of cloud disk type change, from 0 to 100.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MigratePercent")
    @Expose
    private Long MigratePercent;

    /**
    * Whether or not cloud disk is shareable cloud disk.
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
    * For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk’s Instance IDs currently mounted to the CVM.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * The total number of snapshots of the cloud disk.
    */
    @SerializedName("SnapshotCount")
    @Expose
    private Long SnapshotCount;

    /**
    * The total capacity of the snapshots of the cloud disk. Unit: MB.
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * Indicates whether a snapshot should be created for backup when the cloud disk is terminated due to arrears or expiration. `True`: create a snapshot to backup the disk upon termination. `False`: terminate the disk without backup
    */
    @SerializedName("BackupDisk")
    @Expose
    private Boolean BackupDisk;

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
     * Get Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk. 
     * @return DiskType Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     * @param DiskType Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
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
     * Get This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false： Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found. 
     * @return DeadlineError This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false： Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getDeadlineError() {
        return this.DeadlineError;
    }

    /**
     * Set This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false： Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     * @param DeadlineError This field is only applicable when the instance is already mounted to the cloud disk, and both the instance and the cloud disk use monthly subscription. <br><li>true: Expiration time of cloud disk is earlier than that of the instance.<br><li>false： Expiration time of cloud disk is later than that of the instance.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDeadlineError(Boolean DeadlineError) {
        this.DeadlineError = DeadlineError;
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
     * Get For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk’s Instance IDs currently mounted to the CVM. 
     * @return InstanceIdList For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk’s Instance IDs currently mounted to the CVM.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk’s Instance IDs currently mounted to the CVM.
     * @param InstanceIdList For non-shareable cloud disks, this parameter is null. For shareable cloud disks, this parameters indicates this cloud disk’s Instance IDs currently mounted to the CVM.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
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
     * Get Indicates whether a snapshot should be created for backup when the cloud disk is terminated due to arrears or expiration. `True`: create a snapshot to backup the disk upon termination. `False`: terminate the disk without backup 
     * @return BackupDisk Indicates whether a snapshot should be created for backup when the cloud disk is terminated due to arrears or expiration. `True`: create a snapshot to backup the disk upon termination. `False`: terminate the disk without backup
     */
    public Boolean getBackupDisk() {
        return this.BackupDisk;
    }

    /**
     * Set Indicates whether a snapshot should be created for backup when the cloud disk is terminated due to arrears or expiration. `True`: create a snapshot to backup the disk upon termination. `False`: terminate the disk without backup
     * @param BackupDisk Indicates whether a snapshot should be created for backup when the cloud disk is terminated due to arrears or expiration. `True`: create a snapshot to backup the disk upon termination. `False`: terminate the disk without backup
     */
    public void setBackupDisk(Boolean BackupDisk) {
        this.BackupDisk = BackupDisk;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "SnapshotAbility", this.SnapshotAbility);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "AutoRenewFlagError", this.AutoRenewFlagError);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeadlineError", this.DeadlineError);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DifferDaysOfDeadline", this.DifferDaysOfDeadline);
        this.setParamSimple(map, prefix + "Migrating", this.Migrating);
        this.setParamSimple(map, prefix + "MigratePercent", this.MigratePercent);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "SnapshotCount", this.SnapshotCount);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "BackupDisk", this.BackupDisk);

    }
}

