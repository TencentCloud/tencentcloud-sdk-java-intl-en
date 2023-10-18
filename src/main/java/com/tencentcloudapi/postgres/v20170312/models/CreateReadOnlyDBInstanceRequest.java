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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyDBInstanceRequest extends AbstractModel {

    /**
    * Primary AZ of an instance, such as "ap-guangzhou-3".
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ID of the primary instance to which the read-only instance belongs
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Validity period in months, valid values:
<li>Monthly subscription: `1`, `2`, `3`, 4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID in the format of `subnet-xxxxxxxx` which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance billing mode. Valid values: 
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. If the primary instance is pay-as-you-go, so is the read-only instance.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list. Currently, you can specify only one voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Special offer ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * RO group ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
    */
    @SerializedName("TagList")
    @Expose
    private Tag TagList;

    /**
    * Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * Instance name (which will be supported in the future)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * (Disused) You don’t need to specify a version, as the kernel version is as the same as that of the instance.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
     * Get Primary AZ of an instance, such as "ap-guangzhou-3".
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API. 
     * @return Zone Primary AZ of an instance, such as "ap-guangzhou-3".
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Primary AZ of an instance, such as "ap-guangzhou-3".
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     * @param Zone Primary AZ of an instance, such as "ap-guangzhou-3".
The information of AZ can be obtained from the `Zone` field in the return value of the [DescribeZones](https://intl.cloud.tencent.com/document/api/409/16769?from_cn_redirect=1) API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ID of the primary instance to which the read-only instance belongs 
     * @return MasterDBInstanceId ID of the primary instance to which the read-only instance belongs
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set ID of the primary instance to which the read-only instance belongs
     * @param MasterDBInstanceId ID of the primary instance to which the read-only instance belongs
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API. 
     * @return SpecCode Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     * @param SpecCode Purchasable code, which can be obtained from the `SpecCode` field in the return value of the [DescribeClasses](https://intl.cloud.tencent.com/document/api/409/89019?from_cn_redirect=1) API.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
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
     * Get The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls. 
     * @return InstanceCount The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     * @param InstanceCount The number of instances to be purchased at a time. Value range: 1-10. To purchase more than 10 instances each time, you can make multiple calls.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Validity period in months, valid values:
<li>Monthly subscription: `1`, `2`, `3`, 4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`. 
     * @return Period Validity period in months, valid values:
<li>Monthly subscription: `1`, `2`, `3`, 4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months, valid values:
<li>Monthly subscription: `1`, `2`, `3`, 4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     * @param Period Validity period in months, valid values:
<li>Monthly subscription: `1`, `2`, `3`, 4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API. 
     * @return VpcId VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     * @param VpcId VPC ID in the format of `vpc-xxxxxxx`, which can be obtained in the console or from the `unVpcId` field in the return value of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID in the format of `subnet-xxxxxxxx` which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. 
     * @return SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx` which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of `subnet-xxxxxxxx` which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     * @param SubnetId VPC subnet ID in the format of `subnet-xxxxxxxx` which can be obtained in the console or from the `unSubnetId` field in the return value of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance billing mode. Valid values: 
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. If the primary instance is pay-as-you-go, so is the read-only instance. 
     * @return InstanceChargeType Instance billing mode. Valid values: 
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. If the primary instance is pay-as-you-go, so is the read-only instance.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values: 
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. If the primary instance is pay-as-you-go, so is the read-only instance.
     * @param InstanceChargeType Instance billing mode. Valid values: 
<li>`PREPAID`: Monthly subscription
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go
Default value: `PREPAID`. If the primary instance is pay-as-you-go, so is the read-only instance.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. Currently, you can specify only one voucher. 
     * @return VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. Currently, you can specify only one voucher.
     * @param VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`. 
     * @return AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     * @param AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
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
     * Get Special offer ID 
     * @return ActivityId Special offer ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Special offer ID
     * @param ActivityId Special offer ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get RO group ID 
     * @return ReadOnlyGroupId RO group ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set RO group ID
     * @param ReadOnlyGroupId RO group ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API. 
     * @return TagList The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     */
    public Tag getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     * @param TagList The information of tags to be bound with the instance, which is left empty by default. This parameter can be obtained from the `Tags` field in the return value of the [DescribeTags](https://intl.cloud.tencent.com/document/api/651/35316?from_cn_redirect=1) API.
     */
    public void setTagList(Tag TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.
 
     * @return SecurityGroupIds Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     * @param SecurityGroupIds Security group of the instance, which can be obtained from the `sgld` field in the return value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API. If this parameter is not specified, the default security group will be bound.

     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return NeedSupportIpv6 Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param NeedSupportIpv6 Whether IPv6 is supported.
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get Instance name (which will be supported in the future) 
     * @return Name Instance name (which will be supported in the future)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name (which will be supported in the future)
     * @param Name Instance name (which will be supported in the future)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get (Disused) You don’t need to specify a version, as the kernel version is as the same as that of the instance. 
     * @return DBVersion (Disused) You don’t need to specify a version, as the kernel version is as the same as that of the instance.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set (Disused) You don’t need to specify a version, as the kernel version is as the same as that of the instance.
     * @param DBVersion (Disused) You don’t need to specify a version, as the kernel version is as the same as that of the instance.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    public CreateReadOnlyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyDBInstanceRequest(CreateReadOnlyDBInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag(source.TagList);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);

    }
}

