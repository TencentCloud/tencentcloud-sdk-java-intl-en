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

public class CreateInstancesRequest extends AbstractModel{

    /**
    * Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * PostgreSQL kernel version. Valid values: `9.3.5`, `9.5.4`, `10.4`, `11.8`, `12.4`.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * The number of instances purchased at a time. Value range: 1-10.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Valid period in months of purchased instances. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Availability zone ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance character set. Valid values: `UTF8`, `LATIN1`.
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Instance root account name
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Instance root account password
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
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
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of a subnet in the VPC specified by `VpcId`
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Renewal flag. Valid values: `0` (manual renewal), `1` (auto-renewal). Default value: `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Campaign ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to support IPv6 address access. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * The information of tags to be associated with instances. This parameter is left empty by default.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Security group IDs
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

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
     * Get PostgreSQL kernel version. Valid values: `9.3.5`, `9.5.4`, `10.4`, `11.8`, `12.4`. 
     * @return DBVersion PostgreSQL kernel version. Valid values: `9.3.5`, `9.5.4`, `10.4`, `11.8`, `12.4`.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL kernel version. Valid values: `9.3.5`, `9.5.4`, `10.4`, `11.8`, `12.4`.
     * @param DBVersion PostgreSQL kernel version. Valid values: `9.3.5`, `9.5.4`, `10.4`, `11.8`, `12.4`.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
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
     * Get The number of instances purchased at a time. Value range: 1-10. 
     * @return InstanceCount The number of instances purchased at a time. Value range: 1-10.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set The number of instances purchased at a time. Value range: 1-10.
     * @param InstanceCount The number of instances purchased at a time. Value range: 1-10.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Valid period in months of purchased instances. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used. 
     * @return Period Valid period in months of purchased instances. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Valid period in months of purchased instances. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     * @param Period Valid period in months of purchased instances. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Availability zone ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API. 
     * @return Zone Availability zone ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     * @param Zone Availability zone ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance character set. Valid values: `UTF8`, `LATIN1`. 
     * @return Charset Instance character set. Valid values: `UTF8`, `LATIN1`.
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Instance character set. Valid values: `UTF8`, `LATIN1`.
     * @param Charset Instance character set. Valid values: `UTF8`, `LATIN1`.
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Instance root account name 
     * @return AdminName Instance root account name
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set Instance root account name
     * @param AdminName Instance root account name
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Instance root account password 
     * @return AdminPassword Instance root account password
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Instance root account password
     * @param AdminPassword Instance root account password
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
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
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of a subnet in the VPC specified by `VpcId` 
     * @return SubnetId ID of a subnet in the VPC specified by `VpcId`
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of a subnet in the VPC specified by `VpcId`
     * @param SubnetId ID of a subnet in the VPC specified by `VpcId`
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get Campaign ID 
     * @return ActivityId Campaign ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Campaign ID
     * @param ActivityId Campaign ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
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
     * Get Whether to support IPv6 address access. Valid values: `1` (yes), `0` (no). 
     * @return NeedSupportIpv6 Whether to support IPv6 address access. Valid values: `1` (yes), `0` (no).
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Whether to support IPv6 address access. Valid values: `1` (yes), `0` (no).
     * @param NeedSupportIpv6 Whether to support IPv6 address access. Valid values: `1` (yes), `0` (no).
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get The information of tags to be associated with instances. This parameter is left empty by default. 
     * @return TagList The information of tags to be associated with instances. This parameter is left empty by default.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags to be associated with instances. This parameter is left empty by default.
     * @param TagList The information of tags to be associated with instances. This parameter is left empty by default.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Security group IDs 
     * @return SecurityGroupIds Security group IDs
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group IDs
     * @param SecurityGroupIds Security group IDs
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

