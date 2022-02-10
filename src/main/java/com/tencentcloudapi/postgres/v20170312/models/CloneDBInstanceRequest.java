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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneDBInstanceRequest extends AbstractModel{

    /**
    * ID of the original instance to be cloned.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance storage capacity in GB.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of a subnet in the VPC specified by `VpcId`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Name of the purchased instance.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Security group ID.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * The information of tags to be bound with the purchased instance. This parameter is left empty by default.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * This parameter is required if you purchase a multi-AZ deployed instance.
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String VoucherIds;

    /**
    * Campaign ID.
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * Basic backup set ID.
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * Restoration point in time.
    */
    @SerializedName("RecoveryTargetTime")
    @Expose
    private String RecoveryTargetTime;

    /**
     * Get ID of the original instance to be cloned. 
     * @return DBInstanceId ID of the original instance to be cloned.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set ID of the original instance to be cloned.
     * @param DBInstanceId ID of the original instance to be cloned.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API. 
     * @return SpecCode Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     * @param SpecCode Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Instance storage capacity in GB. 
     * @return Storage Instance storage capacity in GB.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB.
     * @param Storage Instance storage capacity in GB.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used. 
     * @return Period Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     * @param Period Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`. 
     * @return AutoRenewFlag Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`.
     * @param AutoRenewFlag Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get VPC ID. 
     * @return VpcId VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
     * @param VpcId VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of a subnet in the VPC specified by `VpcId`. 
     * @return SubnetId ID of a subnet in the VPC specified by `VpcId`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of a subnet in the VPC specified by `VpcId`.
     * @param SubnetId ID of a subnet in the VPC specified by `VpcId`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Name of the purchased instance. 
     * @return Name Name of the purchased instance.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the purchased instance.
     * @param Name Name of the purchased instance.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). 
     * @return InstanceChargeType Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go).
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go).
     * @param InstanceChargeType Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go).
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Security group ID. 
     * @return SecurityGroupIds Security group ID.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID.
     * @param SecurityGroupIds Security group ID.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
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
     * Get The information of tags to be bound with the purchased instance. This parameter is left empty by default. 
     * @return TagList The information of tags to be bound with the purchased instance. This parameter is left empty by default.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags to be bound with the purchased instance. This parameter is left empty by default.
     * @param TagList The information of tags to be bound with the purchased instance. This parameter is left empty by default.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get This parameter is required if you purchase a multi-AZ deployed instance. 
     * @return DBNodeSet This parameter is required if you purchase a multi-AZ deployed instance.
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set This parameter is required if you purchase a multi-AZ deployed instance.
     * @param DBNodeSet This parameter is required if you purchase a multi-AZ deployed instance.
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`. 
     * @return AutoVoucher Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     * @param AutoVoucher Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. 
     * @return VoucherIds Voucher ID list.
     */
    public String getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list.
     * @param VoucherIds Voucher ID list.
     */
    public void setVoucherIds(String VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Campaign ID. 
     * @return ActivityId Campaign ID.
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Campaign ID.
     * @param ActivityId Campaign ID.
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Basic backup set ID. 
     * @return BackupSetId Basic backup set ID.
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set Basic backup set ID.
     * @param BackupSetId Basic backup set ID.
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get Restoration point in time. 
     * @return RecoveryTargetTime Restoration point in time.
     */
    public String getRecoveryTargetTime() {
        return this.RecoveryTargetTime;
    }

    /**
     * Set Restoration point in time.
     * @param RecoveryTargetTime Restoration point in time.
     */
    public void setRecoveryTargetTime(String RecoveryTargetTime) {
        this.RecoveryTargetTime = RecoveryTargetTime;
    }

    public CloneDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneDBInstanceRequest(CloneDBInstanceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String(source.VoucherIds);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RecoveryTargetTime != null) {
            this.RecoveryTargetTime = new String(source.RecoveryTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "VoucherIds", this.VoucherIds);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RecoveryTargetTime", this.RecoveryTargetTime);

    }
}

