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
    * <p>Primary availability zone of the instance, such as: ap-guangzhou-3.<br>The availability zone can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/api/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Primary instance ID of the read-only instance, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * <p>Purchasable specification code. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/api/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>Instance disk capacity, in GB. The value for this parameter must be set in increments of 10.</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Number of instances to purchase. Value range: [1-6]. The maximum allowed number is 6.</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: supports only 1.</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>VPC ID, such as vpc-xxxxxxxx (this parameter is required). A valid VPC ID can be queried by logging in to the console. You can also call the DescribeVpcEx API to obtain it from the unVpcId field in the return value.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPC subnet ID, such as subnet-xxxxxxxx (this parameter is required). A valid VPC subnet ID can be queried by logging in to the console. You can also call the <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> API and obtain it from the unSubnetId field in the return value.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance billing type. Valid values:</p><li>PREPAID: prepaid (yearly/monthly subscription).</li><li>POSTPAID_BY_HOUR: postpaid (pay-as-you-go).</li>Default value: PREPAID. If the primary instance is postpaid, the read-only instance must also be postpaid.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Indicates whether to use vouchers automatically:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>Voucher ID list. Only one voucher can be specified.</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>Renewal flag:</p><li>0: manual renewal.</li><li>1: auto-renewal.</li>Default value: 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Project ID. The default value is 0, which means it belongs to the default project.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Discount offer ID.</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * <p>Read-only group ID.</p>
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * <p>Tags to be bound to the instance. This is empty by default. Tags can be obtained from the returned Tags field of the <a href="https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1">DescribeTags</a> API.</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag TagList;

    /**
    * <p>Security group to which the instance belongs. The value of this parameter can be obtained from the returned sgId field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, the default security group is bound.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Indicates whether to support IPv6:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * <p>Instance name. The name can contain only Chinese characters, letters, digits, underscores (&quot;_&quot;), and hyphens (&quot;-&quot;), with a length of less than 60.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Not required anymore. The kernel version is consistent with that of the primary instance.</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>Dedicated cluster ID.</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>Indicates whether to enable deletion protection for the instance: true - enables deletion protection. false - disables deletion protection.</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>Primary availability zone of the instance, such as: ap-guangzhou-3.<br>The availability zone can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/api/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p> 
     * @return Zone <p>Primary availability zone of the instance, such as: ap-guangzhou-3.<br>The availability zone can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/api/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Primary availability zone of the instance, such as: ap-guangzhou-3.<br>The availability zone can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/api/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     * @param Zone <p>Primary availability zone of the instance, such as: ap-guangzhou-3.<br>The availability zone can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/api/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Primary instance ID of the read-only instance, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p> 
     * @return MasterDBInstanceId <p>Primary instance ID of the read-only instance, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set <p>Primary instance ID of the read-only instance, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     * @param MasterDBInstanceId <p>Primary instance ID of the read-only instance, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get <p>Purchasable specification code. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/api/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p> 
     * @return SpecCode <p>Purchasable specification code. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/api/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Purchasable specification code. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/api/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     * @param SpecCode <p>Purchasable specification code. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/api/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>Instance disk capacity, in GB. The value for this parameter must be set in increments of 10.</p> 
     * @return Storage <p>Instance disk capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Instance disk capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     * @param Storage <p>Instance disk capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Number of instances to purchase. Value range: [1-6]. The maximum allowed number is 6.</p> 
     * @return InstanceCount <p>Number of instances to purchase. Value range: [1-6]. The maximum allowed number is 6.</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Number of instances to purchase. Value range: [1-6]. The maximum allowed number is 6.</p>
     * @param InstanceCount <p>Number of instances to purchase. Value range: [1-6]. The maximum allowed number is 6.</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: supports only 1.</li> 
     * @return Period <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: supports only 1.</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: supports only 1.</li>
     * @param Period <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: supports only 1.</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>VPC ID, such as vpc-xxxxxxxx (this parameter is required). A valid VPC ID can be queried by logging in to the console. You can also call the DescribeVpcEx API to obtain it from the unVpcId field in the return value.</p> 
     * @return VpcId <p>VPC ID, such as vpc-xxxxxxxx (this parameter is required). A valid VPC ID can be queried by logging in to the console. You can also call the DescribeVpcEx API to obtain it from the unVpcId field in the return value.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID, such as vpc-xxxxxxxx (this parameter is required). A valid VPC ID can be queried by logging in to the console. You can also call the DescribeVpcEx API to obtain it from the unVpcId field in the return value.</p>
     * @param VpcId <p>VPC ID, such as vpc-xxxxxxxx (this parameter is required). A valid VPC ID can be queried by logging in to the console. You can also call the DescribeVpcEx API to obtain it from the unVpcId field in the return value.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPC subnet ID, such as subnet-xxxxxxxx (this parameter is required). A valid VPC subnet ID can be queried by logging in to the console. You can also call the <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> API and obtain it from the unSubnetId field in the return value.</p> 
     * @return SubnetId <p>VPC subnet ID, such as subnet-xxxxxxxx (this parameter is required). A valid VPC subnet ID can be queried by logging in to the console. You can also call the <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> API and obtain it from the unSubnetId field in the return value.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>VPC subnet ID, such as subnet-xxxxxxxx (this parameter is required). A valid VPC subnet ID can be queried by logging in to the console. You can also call the <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> API and obtain it from the unSubnetId field in the return value.</p>
     * @param SubnetId <p>VPC subnet ID, such as subnet-xxxxxxxx (this parameter is required). A valid VPC subnet ID can be queried by logging in to the console. You can also call the <a href="https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1">DescribeSubnets</a> API and obtain it from the unSubnetId field in the return value.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance billing type. Valid values:</p><li>PREPAID: prepaid (yearly/monthly subscription).</li><li>POSTPAID_BY_HOUR: postpaid (pay-as-you-go).</li>Default value: PREPAID. If the primary instance is postpaid, the read-only instance must also be postpaid. 
     * @return InstanceChargeType <p>Instance billing type. Valid values:</p><li>PREPAID: prepaid (yearly/monthly subscription).</li><li>POSTPAID_BY_HOUR: postpaid (pay-as-you-go).</li>Default value: PREPAID. If the primary instance is postpaid, the read-only instance must also be postpaid.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type. Valid values:</p><li>PREPAID: prepaid (yearly/monthly subscription).</li><li>POSTPAID_BY_HOUR: postpaid (pay-as-you-go).</li>Default value: PREPAID. If the primary instance is postpaid, the read-only instance must also be postpaid.
     * @param InstanceChargeType <p>Instance billing type. Valid values:</p><li>PREPAID: prepaid (yearly/monthly subscription).</li><li>POSTPAID_BY_HOUR: postpaid (pay-as-you-go).</li>Default value: PREPAID. If the primary instance is postpaid, the read-only instance must also be postpaid.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Indicates whether to use vouchers automatically:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0. 
     * @return AutoVoucher <p>Indicates whether to use vouchers automatically:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Indicates whether to use vouchers automatically:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     * @param AutoVoucher <p>Indicates whether to use vouchers automatically:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Voucher ID list. Only one voucher can be specified.</p> 
     * @return VoucherIds <p>Voucher ID list. Only one voucher can be specified.</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>Voucher ID list. Only one voucher can be specified.</p>
     * @param VoucherIds <p>Voucher ID list. Only one voucher can be specified.</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>Renewal flag:</p><li>0: manual renewal.</li><li>1: auto-renewal.</li>Default value: 0. 
     * @return AutoRenewFlag <p>Renewal flag:</p><li>0: manual renewal.</li><li>1: auto-renewal.</li>Default value: 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Renewal flag:</p><li>0: manual renewal.</li><li>1: auto-renewal.</li>Default value: 0.
     * @param AutoRenewFlag <p>Renewal flag:</p><li>0: manual renewal.</li><li>1: auto-renewal.</li>Default value: 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Project ID. The default value is 0, which means it belongs to the default project.</p> 
     * @return ProjectId <p>Project ID. The default value is 0, which means it belongs to the default project.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. The default value is 0, which means it belongs to the default project.</p>
     * @param ProjectId <p>Project ID. The default value is 0, which means it belongs to the default project.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Discount offer ID.</p> 
     * @return ActivityId <p>Discount offer ID.</p>
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>Discount offer ID.</p>
     * @param ActivityId <p>Discount offer ID.</p>
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>Read-only group ID.</p> 
     * @return ReadOnlyGroupId <p>Read-only group ID.</p>
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set <p>Read-only group ID.</p>
     * @param ReadOnlyGroupId <p>Read-only group ID.</p>
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get <p>Tags to be bound to the instance. This is empty by default. Tags can be obtained from the returned Tags field of the <a href="https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1">DescribeTags</a> API.</p> 
     * @return TagList <p>Tags to be bound to the instance. This is empty by default. Tags can be obtained from the returned Tags field of the <a href="https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1">DescribeTags</a> API.</p>
     */
    public Tag getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Tags to be bound to the instance. This is empty by default. Tags can be obtained from the returned Tags field of the <a href="https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1">DescribeTags</a> API.</p>
     * @param TagList <p>Tags to be bound to the instance. This is empty by default. Tags can be obtained from the returned Tags field of the <a href="https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1">DescribeTags</a> API.</p>
     */
    public void setTagList(Tag TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Security group to which the instance belongs. The value of this parameter can be obtained from the returned sgId field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, the default security group is bound.</p> 
     * @return SecurityGroupIds <p>Security group to which the instance belongs. The value of this parameter can be obtained from the returned sgId field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, the default security group is bound.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group to which the instance belongs. The value of this parameter can be obtained from the returned sgId field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, the default security group is bound.</p>
     * @param SecurityGroupIds <p>Security group to which the instance belongs. The value of this parameter can be obtained from the returned sgId field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, the default security group is bound.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Indicates whether to support IPv6:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0. 
     * @return NeedSupportIpv6 <p>Indicates whether to support IPv6:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set <p>Indicates whether to support IPv6:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     * @param NeedSupportIpv6 <p>Indicates whether to support IPv6:</p><li>0: No.</li><li>1: Yes.</li>Default value: 0.
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get <p>Instance name. The name can contain only Chinese characters, letters, digits, underscores (&quot;_&quot;), and hyphens (&quot;-&quot;), with a length of less than 60.</p> 
     * @return Name <p>Instance name. The name can contain only Chinese characters, letters, digits, underscores (&quot;_&quot;), and hyphens (&quot;-&quot;), with a length of less than 60.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Instance name. The name can contain only Chinese characters, letters, digits, underscores (&quot;_&quot;), and hyphens (&quot;-&quot;), with a length of less than 60.</p>
     * @param Name <p>Instance name. The name can contain only Chinese characters, letters, digits, underscores (&quot;_&quot;), and hyphens (&quot;-&quot;), with a length of less than 60.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Not required anymore. The kernel version is consistent with that of the primary instance.</p> 
     * @return DBVersion <p>Not required anymore. The kernel version is consistent with that of the primary instance.</p>
     * @deprecated
     */
    @Deprecated
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>Not required anymore. The kernel version is consistent with that of the primary instance.</p>
     * @param DBVersion <p>Not required anymore. The kernel version is consistent with that of the primary instance.</p>
     * @deprecated
     */
    @Deprecated
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>Dedicated cluster ID.</p> 
     * @return DedicatedClusterId <p>Dedicated cluster ID.</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>Dedicated cluster ID.</p>
     * @param DedicatedClusterId <p>Dedicated cluster ID.</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>Indicates whether to enable deletion protection for the instance: true - enables deletion protection. false - disables deletion protection.</p> 
     * @return DeletionProtection <p>Indicates whether to enable deletion protection for the instance: true - enables deletion protection. false - disables deletion protection.</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>Indicates whether to enable deletion protection for the instance: true - enables deletion protection. false - disables deletion protection.</p>
     * @param DeletionProtection <p>Indicates whether to enable deletion protection for the instance: true - enables deletion protection. false - disables deletion protection.</p>
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

