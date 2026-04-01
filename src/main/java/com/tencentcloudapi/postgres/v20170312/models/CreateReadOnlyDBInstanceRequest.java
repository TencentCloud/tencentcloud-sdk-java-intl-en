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
    * Primary instance ID of the read-only instance. obtain through the api [DescribeDBInstances](https://www.tencentcloud.comom/document/api/409/16773?from_cn_redirect=1).
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
    * Instance disk capacity size in GB. specifies the step length for parameter settings as 10.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of instances to purchase. value range: [1-6]. maximum allowed number is 6.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
<li>Pay-as-you-go: Only supports `1`.</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance billing type, which currently supports:.
<Li>PREPAID: prepaid, i.e., yearly/monthly subscription.</li>.
<Li>POSTPAID_BY_HOUR: pay-as-you-go, i.e., pay by consumption.</li>.
Default value: PREPAID. if the primary instance is postpaid, the read-only instance must also be postpaid.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
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
    * Specifies the auto-renewal flag.
<Li>`0`: manual renewal.</li>.
<Li>`1`: auto-renewal</li>.
Default value: 0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Project ID. default value is 0, means it belongs to the default project.
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
    * Specifies whether to support Ipv6.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * Instance name. only chinese characters, letters, digits, underscores (_), and delimiters (-) are supported. the length must be less than 60 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the kernel version number should be consistent with the primary instance and no longer needed to be specified.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * CDC ID.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Specifies whether to enable deletion protection for the instance. valid values: true (enable deletion protection), false (disable deletion protection).
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

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
     * Get Primary instance ID of the read-only instance. obtain through the api [DescribeDBInstances](https://www.tencentcloud.comom/document/api/409/16773?from_cn_redirect=1). 
     * @return MasterDBInstanceId Primary instance ID of the read-only instance. obtain through the api [DescribeDBInstances](https://www.tencentcloud.comom/document/api/409/16773?from_cn_redirect=1).
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set Primary instance ID of the read-only instance. obtain through the api [DescribeDBInstances](https://www.tencentcloud.comom/document/api/409/16773?from_cn_redirect=1).
     * @param MasterDBInstanceId Primary instance ID of the read-only instance. obtain through the api [DescribeDBInstances](https://www.tencentcloud.comom/document/api/409/16773?from_cn_redirect=1).
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
     * Get Instance disk capacity size in GB. specifies the step length for parameter settings as 10. 
     * @return Storage Instance disk capacity size in GB. specifies the step length for parameter settings as 10.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk capacity size in GB. specifies the step length for parameter settings as 10.
     * @param Storage Instance disk capacity size in GB. specifies the step length for parameter settings as 10.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of instances to purchase. value range: [1-6]. maximum allowed number is 6. 
     * @return InstanceCount Number of instances to purchase. value range: [1-6]. maximum allowed number is 6.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to purchase. value range: [1-6]. maximum allowed number is 6.
     * @param InstanceCount Number of instances to purchase. value range: [1-6]. maximum allowed number is 6.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
<li>Pay-as-you-go: Only supports `1`.</li> 
     * @return Period Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
<li>Pay-as-you-go: Only supports `1`.</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
<li>Pay-as-you-go: Only supports `1`.</li>
     * @param Period Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
<li>Pay-as-you-go: Only supports `1`.</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API. 
     * @return VpcId VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     * @param VpcId VPC ID, in the format of vpc-xxxxxxxx (this parameter is currently required). A valid VpcId can be obtained by logging into the console; it can also be obtained from the unVpcId field in the return value of calling of the [DescribeVpcEx](https://intl.cloud.tencent.com/document/api/215/1372?from_cn_redirect=1) API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API. 
     * @return SubnetId VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     * @param SubnetId VPC subnet ID, in the format of subnet-xxxxxxxx (this parameter is currently required). A valid VPC subnet ID can be obtained by logging into the console; it can also be obtained from the unSubnetId field in the return value of calling of the [DescribeSubnets](https://intl.cloud.tencent.com/document/api/215/15784?from_cn_redirect=1) API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance billing type, which currently supports:.
<Li>PREPAID: prepaid, i.e., yearly/monthly subscription.</li>.
<Li>POSTPAID_BY_HOUR: pay-as-you-go, i.e., pay by consumption.</li>.
Default value: PREPAID. if the primary instance is postpaid, the read-only instance must also be postpaid. 
     * @return InstanceChargeType Instance billing type, which currently supports:.
<Li>PREPAID: prepaid, i.e., yearly/monthly subscription.</li>.
<Li>POSTPAID_BY_HOUR: pay-as-you-go, i.e., pay by consumption.</li>.
Default value: PREPAID. if the primary instance is postpaid, the read-only instance must also be postpaid.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type, which currently supports:.
<Li>PREPAID: prepaid, i.e., yearly/monthly subscription.</li>.
<Li>POSTPAID_BY_HOUR: pay-as-you-go, i.e., pay by consumption.</li>.
Default value: PREPAID. if the primary instance is postpaid, the read-only instance must also be postpaid.
     * @param InstanceChargeType Instance billing type, which currently supports:.
<Li>PREPAID: prepaid, i.e., yearly/monthly subscription.</li>.
<Li>POSTPAID_BY_HOUR: pay-as-you-go, i.e., pay by consumption.</li>.
Default value: PREPAID. if the primary instance is postpaid, the read-only instance must also be postpaid.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0 
     * @return AutoVoucher Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     * @param AutoVoucher Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
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
     * Get Specifies the auto-renewal flag.
<Li>`0`: manual renewal.</li>.
<Li>`1`: auto-renewal</li>.
Default value: 0 
     * @return AutoRenewFlag Specifies the auto-renewal flag.
<Li>`0`: manual renewal.</li>.
<Li>`1`: auto-renewal</li>.
Default value: 0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Specifies the auto-renewal flag.
<Li>`0`: manual renewal.</li>.
<Li>`1`: auto-renewal</li>.
Default value: 0
     * @param AutoRenewFlag Specifies the auto-renewal flag.
<Li>`0`: manual renewal.</li>.
<Li>`1`: auto-renewal</li>.
Default value: 0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Project ID. default value is 0, means it belongs to the default project. 
     * @return ProjectId Project ID. default value is 0, means it belongs to the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. default value is 0, means it belongs to the default project.
     * @param ProjectId Project ID. default value is 0, means it belongs to the default project.
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
     * Get Specifies whether to support Ipv6.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0 
     * @return NeedSupportIpv6 Specifies whether to support Ipv6.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Specifies whether to support Ipv6.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     * @param NeedSupportIpv6 Specifies whether to support Ipv6.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get Instance name. only chinese characters, letters, digits, underscores (_), and delimiters (-) are supported. the length must be less than 60 characters. 
     * @return Name Instance name. only chinese characters, letters, digits, underscores (_), and delimiters (-) are supported. the length must be less than 60 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name. only chinese characters, letters, digits, underscores (_), and delimiters (-) are supported. the length must be less than 60 characters.
     * @param Name Instance name. only chinese characters, letters, digits, underscores (_), and delimiters (-) are supported. the length must be less than 60 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the kernel version number should be consistent with the primary instance and no longer needed to be specified. 
     * @return DBVersion Specifies the kernel version number should be consistent with the primary instance and no longer needed to be specified.
     * @deprecated
     */
    @Deprecated
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Specifies the kernel version number should be consistent with the primary instance and no longer needed to be specified.
     * @param DBVersion Specifies the kernel version number should be consistent with the primary instance and no longer needed to be specified.
     * @deprecated
     */
    @Deprecated
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get CDC ID. 
     * @return DedicatedClusterId CDC ID.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID.
     * @param DedicatedClusterId CDC ID.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Specifies whether to enable deletion protection for the instance. valid values: true (enable deletion protection), false (disable deletion protection). 
     * @return DeletionProtection Specifies whether to enable deletion protection for the instance. valid values: true (enable deletion protection), false (disable deletion protection).
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Specifies whether to enable deletion protection for the instance. valid values: true (enable deletion protection), false (disable deletion protection).
     * @param DeletionProtection Specifies whether to enable deletion protection for the instance. valid values: true (enable deletion protection), false (disable deletion protection).
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
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
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

