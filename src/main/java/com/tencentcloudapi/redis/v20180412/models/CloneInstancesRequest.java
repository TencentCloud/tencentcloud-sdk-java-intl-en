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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneInstancesRequest extends AbstractModel {

    /**
    * The ID of the source instance to be cloned, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The number of clone instances at a time
- The maximum number of monthly subscribed instances is 100 for each purchase.
- The maximum number of pay-as-you-go instances is 30 for each purchase.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * ID of the AZ where the clone instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Billing mode. Valid values: <ul><li>`0` (Pay-as-you-go) </li><li>`1` (Monthly subscription) </li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Purchase duration of an instance. <ul><li>Unit: Month</li><li>Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48`, `60` (for monthly subscription mode).</li><li> Valid value: `1` (for pay-as-you-go mode).</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Security group ID, which can be obtained on the <b>Security Group</b> page in the console.
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * Backup ID of the clone instance, which can be obtained through the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * Whether the clone instance supports password-free access. Valid values: <ul><li>`true` (Yes)</li><li>`false` (No. When SSL or public network is enabled). Default value: `false`.</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * The VPC ID of the clone instance. If this parameter is not passed in, the classic network will be selected by default.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The VPC subnet ID to which the clone instance belongs, which is not required for the classic network.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Name of the clone instance. <br>Enter up to 60 letters, digits, hyphens, and underscores.</br>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The access password of the clone instance. <ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, this parameter is not required. </li><li>When the instance is Redis 2.8, 4.0, or 5.0, the password must contain 8–30 characters in at least two of the following types: lowercase letters, uppercase letters, digits, and special characters `()`~!@#$%^&*-+=_|{}[]:;<>,.?/` and cannot start with `/`.</li><li>When the instance is CKV 3.2, the password must and can only contain 8–30 letters and digits.</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The auto-renewal flag. Valid values <ul><li>`0`: Manual renewal (default). </li><li>`1`: Auto-renewal. </li><li>`2`: Not auto-renewal (set by user).</ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Customized port. Valid range: 1024-65535. Default value: `6379`.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Node information of an instance. <ul><li>Currently supported type and AZ information of a node to be configured (master node or replica node) For more information, see [RedisNodeInfo](https://intl.cloud.tencent.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo).</li><li>This parameter is not required for single-AZ deployment.</li></ul>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * Project ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and find the project ID in <b>Account Center</b> > <b>Project Management</b> in the top-right corner.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Tag to be bound for the clone instance
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * The parameter template ID associated with the clone instance
- If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.
- You can query the parameter template list of the instance to get the template ID through the [DescribeParamTemplates](https://intl.cloud.tencent.com/document/product/239/58750?from_cn_redirect=1) API.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * The alarm policy ID of the instance to be cloned. Log in to the [Tencent Cloud Observable Platform console](https://console.cloud.tencent.com/monitor/alarm2/policy), and get the policy ID in <b>Alarm Management</b> > <b>Policy Management</b>.
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
     * Get The ID of the source instance to be cloned, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list. 
     * @return InstanceId The ID of the source instance to be cloned, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ID of the source instance to be cloned, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     * @param InstanceId The ID of the source instance to be cloned, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The number of clone instances at a time
- The maximum number of monthly subscribed instances is 100 for each purchase.
- The maximum number of pay-as-you-go instances is 30 for each purchase. 
     * @return GoodsNum The number of clone instances at a time
- The maximum number of monthly subscribed instances is 100 for each purchase.
- The maximum number of pay-as-you-go instances is 30 for each purchase.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set The number of clone instances at a time
- The maximum number of monthly subscribed instances is 100 for each purchase.
- The maximum number of pay-as-you-go instances is 30 for each purchase.
     * @param GoodsNum The number of clone instances at a time
- The maximum number of monthly subscribed instances is 100 for each purchase.
- The maximum number of pay-as-you-go instances is 30 for each purchase.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get ID of the AZ where the clone instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1). 
     * @return ZoneId ID of the AZ where the clone instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the AZ where the clone instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     * @param ZoneId ID of the AZ where the clone instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Billing mode. Valid values: <ul><li>`0` (Pay-as-you-go) </li><li>`1` (Monthly subscription) </li></ul> 
     * @return BillingMode Billing mode. Valid values: <ul><li>`0` (Pay-as-you-go) </li><li>`1` (Monthly subscription) </li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode. Valid values: <ul><li>`0` (Pay-as-you-go) </li><li>`1` (Monthly subscription) </li></ul>
     * @param BillingMode Billing mode. Valid values: <ul><li>`0` (Pay-as-you-go) </li><li>`1` (Monthly subscription) </li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Purchase duration of an instance. <ul><li>Unit: Month</li><li>Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48`, `60` (for monthly subscription mode).</li><li> Valid value: `1` (for pay-as-you-go mode).</li></ul> 
     * @return Period Purchase duration of an instance. <ul><li>Unit: Month</li><li>Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48`, `60` (for monthly subscription mode).</li><li> Valid value: `1` (for pay-as-you-go mode).</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration of an instance. <ul><li>Unit: Month</li><li>Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48`, `60` (for monthly subscription mode).</li><li> Valid value: `1` (for pay-as-you-go mode).</li></ul>
     * @param Period Purchase duration of an instance. <ul><li>Unit: Month</li><li>Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48`, `60` (for monthly subscription mode).</li><li> Valid value: `1` (for pay-as-you-go mode).</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Security group ID, which can be obtained on the <b>Security Group</b> page in the console. 
     * @return SecurityGroupIdList Security group ID, which can be obtained on the <b>Security Group</b> page in the console.
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set Security group ID, which can be obtained on the <b>Security Group</b> page in the console.
     * @param SecurityGroupIdList Security group ID, which can be obtained on the <b>Security Group</b> page in the console.
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get Backup ID of the clone instance, which can be obtained through the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API. 
     * @return BackupId Backup ID of the clone instance, which can be obtained through the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup ID of the clone instance, which can be obtained through the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     * @param BackupId Backup ID of the clone instance, which can be obtained through the [DescribeInstanceBackups](https://intl.cloud.tencent.com/document/product/239/20011?from_cn_redirect=1) API.
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Whether the clone instance supports password-free access. Valid values: <ul><li>`true` (Yes)</li><li>`false` (No. When SSL or public network is enabled). Default value: `false`.</li></ul> 
     * @return NoAuth Whether the clone instance supports password-free access. Valid values: <ul><li>`true` (Yes)</li><li>`false` (No. When SSL or public network is enabled). Default value: `false`.</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether the clone instance supports password-free access. Valid values: <ul><li>`true` (Yes)</li><li>`false` (No. When SSL or public network is enabled). Default value: `false`.</li></ul>
     * @param NoAuth Whether the clone instance supports password-free access. Valid values: <ul><li>`true` (Yes)</li><li>`false` (No. When SSL or public network is enabled). Default value: `false`.</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get The VPC ID of the clone instance. If this parameter is not passed in, the classic network will be selected by default. 
     * @return VpcId The VPC ID of the clone instance. If this parameter is not passed in, the classic network will be selected by default.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID of the clone instance. If this parameter is not passed in, the classic network will be selected by default.
     * @param VpcId The VPC ID of the clone instance. If this parameter is not passed in, the classic network will be selected by default.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The VPC subnet ID to which the clone instance belongs, which is not required for the classic network. 
     * @return SubnetId The VPC subnet ID to which the clone instance belongs, which is not required for the classic network.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The VPC subnet ID to which the clone instance belongs, which is not required for the classic network.
     * @param SubnetId The VPC subnet ID to which the clone instance belongs, which is not required for the classic network.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Name of the clone instance. <br>Enter up to 60 letters, digits, hyphens, and underscores.</br> 
     * @return InstanceName Name of the clone instance. <br>Enter up to 60 letters, digits, hyphens, and underscores.</br>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Name of the clone instance. <br>Enter up to 60 letters, digits, hyphens, and underscores.</br>
     * @param InstanceName Name of the clone instance. <br>Enter up to 60 letters, digits, hyphens, and underscores.</br>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get The access password of the clone instance. <ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, this parameter is not required. </li><li>When the instance is Redis 2.8, 4.0, or 5.0, the password must contain 8–30 characters in at least two of the following types: lowercase letters, uppercase letters, digits, and special characters `()`~!@#$%^&*-+=_|{}[]:;<>,.?/` and cannot start with `/`.</li><li>When the instance is CKV 3.2, the password must and can only contain 8–30 letters and digits.</li></ul> 
     * @return Password The access password of the clone instance. <ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, this parameter is not required. </li><li>When the instance is Redis 2.8, 4.0, or 5.0, the password must contain 8–30 characters in at least two of the following types: lowercase letters, uppercase letters, digits, and special characters `()`~!@#$%^&*-+=_|{}[]:;<>,.?/` and cannot start with `/`.</li><li>When the instance is CKV 3.2, the password must and can only contain 8–30 letters and digits.</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The access password of the clone instance. <ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, this parameter is not required. </li><li>When the instance is Redis 2.8, 4.0, or 5.0, the password must contain 8–30 characters in at least two of the following types: lowercase letters, uppercase letters, digits, and special characters `()`~!@#$%^&*-+=_|{}[]:;<>,.?/` and cannot start with `/`.</li><li>When the instance is CKV 3.2, the password must and can only contain 8–30 letters and digits.</li></ul>
     * @param Password The access password of the clone instance. <ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, this parameter is not required. </li><li>When the instance is Redis 2.8, 4.0, or 5.0, the password must contain 8–30 characters in at least two of the following types: lowercase letters, uppercase letters, digits, and special characters `()`~!@#$%^&*-+=_|{}[]:;<>,.?/` and cannot start with `/`.</li><li>When the instance is CKV 3.2, the password must and can only contain 8–30 letters and digits.</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The auto-renewal flag. Valid values <ul><li>`0`: Manual renewal (default). </li><li>`1`: Auto-renewal. </li><li>`2`: Not auto-renewal (set by user).</ul> 
     * @return AutoRenew The auto-renewal flag. Valid values <ul><li>`0`: Manual renewal (default). </li><li>`1`: Auto-renewal. </li><li>`2`: Not auto-renewal (set by user).</ul>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set The auto-renewal flag. Valid values <ul><li>`0`: Manual renewal (default). </li><li>`1`: Auto-renewal. </li><li>`2`: Not auto-renewal (set by user).</ul>
     * @param AutoRenew The auto-renewal flag. Valid values <ul><li>`0`: Manual renewal (default). </li><li>`1`: Auto-renewal. </li><li>`2`: Not auto-renewal (set by user).</ul>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Customized port. Valid range: 1024-65535. Default value: `6379`. 
     * @return VPort Customized port. Valid range: 1024-65535. Default value: `6379`.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Customized port. Valid range: 1024-65535. Default value: `6379`.
     * @param VPort Customized port. Valid range: 1024-65535. Default value: `6379`.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Node information of an instance. <ul><li>Currently supported type and AZ information of a node to be configured (master node or replica node) For more information, see [RedisNodeInfo](https://intl.cloud.tencent.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo).</li><li>This parameter is not required for single-AZ deployment.</li></ul> 
     * @return NodeSet Node information of an instance. <ul><li>Currently supported type and AZ information of a node to be configured (master node or replica node) For more information, see [RedisNodeInfo](https://intl.cloud.tencent.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo).</li><li>This parameter is not required for single-AZ deployment.</li></ul>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set Node information of an instance. <ul><li>Currently supported type and AZ information of a node to be configured (master node or replica node) For more information, see [RedisNodeInfo](https://intl.cloud.tencent.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo).</li><li>This parameter is not required for single-AZ deployment.</li></ul>
     * @param NodeSet Node information of an instance. <ul><li>Currently supported type and AZ information of a node to be configured (master node or replica node) For more information, see [RedisNodeInfo](https://intl.cloud.tencent.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo).</li><li>This parameter is not required for single-AZ deployment.</li></ul>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get Project ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and find the project ID in <b>Account Center</b> > <b>Project Management</b> in the top-right corner. 
     * @return ProjectId Project ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and find the project ID in <b>Account Center</b> > <b>Project Management</b> in the top-right corner.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and find the project ID in <b>Account Center</b> > <b>Project Management</b> in the top-right corner.
     * @param ProjectId Project ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and find the project ID in <b>Account Center</b> > <b>Project Management</b> in the top-right corner.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Tag to be bound for the clone instance 
     * @return ResourceTags Tag to be bound for the clone instance
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Tag to be bound for the clone instance
     * @param ResourceTags Tag to be bound for the clone instance
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get The parameter template ID associated with the clone instance
- If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.
- You can query the parameter template list of the instance to get the template ID through the [DescribeParamTemplates](https://intl.cloud.tencent.com/document/product/239/58750?from_cn_redirect=1) API. 
     * @return TemplateId The parameter template ID associated with the clone instance
- If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.
- You can query the parameter template list of the instance to get the template ID through the [DescribeParamTemplates](https://intl.cloud.tencent.com/document/product/239/58750?from_cn_redirect=1) API.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The parameter template ID associated with the clone instance
- If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.
- You can query the parameter template list of the instance to get the template ID through the [DescribeParamTemplates](https://intl.cloud.tencent.com/document/product/239/58750?from_cn_redirect=1) API.
     * @param TemplateId The parameter template ID associated with the clone instance
- If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.
- You can query the parameter template list of the instance to get the template ID through the [DescribeParamTemplates](https://intl.cloud.tencent.com/document/product/239/58750?from_cn_redirect=1) API.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The alarm policy ID of the instance to be cloned. Log in to the [Tencent Cloud Observable Platform console](https://console.cloud.tencent.com/monitor/alarm2/policy), and get the policy ID in <b>Alarm Management</b> > <b>Policy Management</b>. 
     * @return AlarmPolicyList The alarm policy ID of the instance to be cloned. Log in to the [Tencent Cloud Observable Platform console](https://console.cloud.tencent.com/monitor/alarm2/policy), and get the policy ID in <b>Alarm Management</b> > <b>Policy Management</b>.
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set The alarm policy ID of the instance to be cloned. Log in to the [Tencent Cloud Observable Platform console](https://console.cloud.tencent.com/monitor/alarm2/policy), and get the policy ID in <b>Alarm Management</b> > <b>Policy Management</b>.
     * @param AlarmPolicyList The alarm policy ID of the instance to be cloned. Log in to the [Tencent Cloud Observable Platform console](https://console.cloud.tencent.com/monitor/alarm2/policy), and get the policy ID in <b>Alarm Management</b> > <b>Policy Management</b>.
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    public CloneInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneInstancesRequest(CloneInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SecurityGroupIdList != null) {
            this.SecurityGroupIdList = new String[source.SecurityGroupIdList.length];
            for (int i = 0; i < source.SecurityGroupIdList.length; i++) {
                this.SecurityGroupIdList[i] = new String(source.SecurityGroupIdList[i]);
            }
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new String[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new String(source.AlarmPolicyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);

    }
}

