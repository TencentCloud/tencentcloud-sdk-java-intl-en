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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneInstancesRequest extends AbstractModel {

    /**
    * <p>Specify the source instance ID to be cloned. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>The number of clone instances per operation.</p><ul><li>The maximum allowed number for each Monthly Subscription purchase is 100.</li><li>The maximum allowed number for each Pay-As-You-Go purchase is 30.</li></ul>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Availability zone ID of the cloned instance. For supported AZ IDs, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Payment method.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>Instance Purchase Duration.<ul><li>Unit: month.</li><li>When the payment method is set to Monthly Subscription, the value range is [1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60].</li><li>When the payment method is set to Pay-As-You-Go, it is set to 1.</li></ul></p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Security group ID. Call the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API to obtain the security group ID for the instance.</p>
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * <p>Backup ID used to clone an instance. Use the interface <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a> to obtain the backup ID.</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>Configure whether the cloned instance supports password-free access. Enabling SSL or public network does not support password-free access.<ul><li>true: Password-free instance,</li><li>false: Non-password-free instance. Default for non-passwordless instance.</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>Configure the VPC ID for the clone instance. If not configured, the basic network is selected by default.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Configure the subnet of the private network for the cloned instance. This parameter requires no configuration for the basic network.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Name of the cloned instance.<br>Only Chinese characters, English letters, numbers, dashes ("-"), or underscores ("_") are allowed, with a length of less than 60.<br></p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>The access password of the clone instance.<ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, setting this parameter is optional.</li><li>For Redis 2.8, 4.0, and 5.0 instances, the password format is: 8-30 characters, containing at least lowercase letters, uppercase letters, digits, and 2 types of characters from ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>For CKV 3.2 instances, the password format is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul></p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Automatic renewal flag.<ul><li>0: default status, manual renewal.</li><li>1: automatic renewal.</li><li>2: no automatic renewal, auto-isolation upon expiration.</li></ul></p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>User-defined port, defaults to 6379, in the range of [1024,65535].</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>Node information of instance.<ul><li>Currently supports configuring node type (primary node or replica node) and its availability zone info. For details, please refer to <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo">RedisNodeInfo</a>.</li><li>This parameter can be left blank for single-AZ deployment.</li></ul></p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>. You can find the project ID in the <b>Account Center</b> &gt; <b>Project Management</b> at the top-right corner.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Tag bound to the clone instance.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Specify the parameter template ID related to the cloned instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Specify the alarm policy ID of the clone instance. Log in to the <a href="https://console.cloud.tencent.com/monitor/alarm2/policy">Tencent Cloud observability platform console</a>, and get policy ID information on the <b>alarm management</b> &gt; <b>policy management</b> page.</p>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
    * <p>Clone the time when data is recovered.<br>Only instances with second-level backup enabled are supported.</p>
    */
    @SerializedName("CloneTime")
    @Expose
    private String CloneTime;

    /**
    * <p>Whether to encrypt the password</p>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
    * <p>Instance password complexity policy</p><p>Input parameter limit: If not passed or Enabled=false, deem as not enabled and verify by default rule.</p>
    */
    @SerializedName("PasswordPolicy")
    @Expose
    private PasswordPolicy PasswordPolicy;

    /**
    * <p>Whether to enable SSL encryption.</p><p>Enumeration value:</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul><p>Default value: false</p>
    */
    @SerializedName("EnableSSL")
    @Expose
    private Boolean EnableSSL;

    /**
    * <p>Whether to write the private IPv4 address of the instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><p>Enumeration value:</p><ul><li>true: The private IP is allowed for SSL certificate verification.</li><li>false: The SAN extended information of the certificate is not added.</li></ul><p>Default value: false</p>
    */
    @SerializedName("SSLBindPrivateIPv4")
    @Expose
    private Boolean SSLBindPrivateIPv4;

    /**
    * <p>Indicates the instance type.</p><p>Enumeration value:</p><ul><li>local: Common I</li><li>localv2: Common II</li></ul><p>If not passed, it remains the same as the original instance type by default.</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
     * Get <p>Specify the source instance ID to be cloned. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specify the source instance ID to be cloned. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specify the source instance ID to be cloned. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specify the source instance ID to be cloned. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>The number of clone instances per operation.</p><ul><li>The maximum allowed number for each Monthly Subscription purchase is 100.</li><li>The maximum allowed number for each Pay-As-You-Go purchase is 30.</li></ul> 
     * @return GoodsNum <p>The number of clone instances per operation.</p><ul><li>The maximum allowed number for each Monthly Subscription purchase is 100.</li><li>The maximum allowed number for each Pay-As-You-Go purchase is 30.</li></ul>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>The number of clone instances per operation.</p><ul><li>The maximum allowed number for each Monthly Subscription purchase is 100.</li><li>The maximum allowed number for each Pay-As-You-Go purchase is 30.</li></ul>
     * @param GoodsNum <p>The number of clone instances per operation.</p><ul><li>The maximum allowed number for each Monthly Subscription purchase is 100.</li><li>The maximum allowed number for each Pay-As-You-Go purchase is 30.</li></ul>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Availability zone ID of the cloned instance. For supported AZ IDs, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>.</p> 
     * @return ZoneId <p>Availability zone ID of the cloned instance. For supported AZ IDs, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Availability zone ID of the cloned instance. For supported AZ IDs, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     * @param ZoneId <p>Availability zone ID of the cloned instance. For supported AZ IDs, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Payment method.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p> 
     * @return BillingMode <p>Payment method.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Payment method.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     * @param BillingMode <p>Payment method.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>Instance Purchase Duration.<ul><li>Unit: month.</li><li>When the payment method is set to Monthly Subscription, the value range is [1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60].</li><li>When the payment method is set to Pay-As-You-Go, it is set to 1.</li></ul></p> 
     * @return Period <p>Instance Purchase Duration.<ul><li>Unit: month.</li><li>When the payment method is set to Monthly Subscription, the value range is [1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60].</li><li>When the payment method is set to Pay-As-You-Go, it is set to 1.</li></ul></p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Instance Purchase Duration.<ul><li>Unit: month.</li><li>When the payment method is set to Monthly Subscription, the value range is [1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60].</li><li>When the payment method is set to Pay-As-You-Go, it is set to 1.</li></ul></p>
     * @param Period <p>Instance Purchase Duration.<ul><li>Unit: month.</li><li>When the payment method is set to Monthly Subscription, the value range is [1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60].</li><li>When the payment method is set to Pay-As-You-Go, it is set to 1.</li></ul></p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Security group ID. Call the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API to obtain the security group ID for the instance.</p> 
     * @return SecurityGroupIdList <p>Security group ID. Call the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API to obtain the security group ID for the instance.</p>
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set <p>Security group ID. Call the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API to obtain the security group ID for the instance.</p>
     * @param SecurityGroupIdList <p>Security group ID. Call the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API to obtain the security group ID for the instance.</p>
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get <p>Backup ID used to clone an instance. Use the interface <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a> to obtain the backup ID.</p> 
     * @return BackupId <p>Backup ID used to clone an instance. Use the interface <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a> to obtain the backup ID.</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>Backup ID used to clone an instance. Use the interface <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a> to obtain the backup ID.</p>
     * @param BackupId <p>Backup ID used to clone an instance. Use the interface <a href="https://www.tencentcloud.com/document/product/239/20011?from_cn_redirect=1">DescribeInstanceBackups</a> to obtain the backup ID.</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>Configure whether the cloned instance supports password-free access. Enabling SSL or public network does not support password-free access.<ul><li>true: Password-free instance,</li><li>false: Non-password-free instance. Default for non-passwordless instance.</li></ul></p> 
     * @return NoAuth <p>Configure whether the cloned instance supports password-free access. Enabling SSL or public network does not support password-free access.<ul><li>true: Password-free instance,</li><li>false: Non-password-free instance. Default for non-passwordless instance.</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>Configure whether the cloned instance supports password-free access. Enabling SSL or public network does not support password-free access.<ul><li>true: Password-free instance,</li><li>false: Non-password-free instance. Default for non-passwordless instance.</li></ul></p>
     * @param NoAuth <p>Configure whether the cloned instance supports password-free access. Enabling SSL or public network does not support password-free access.<ul><li>true: Password-free instance,</li><li>false: Non-password-free instance. Default for non-passwordless instance.</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>Configure the VPC ID for the clone instance. If not configured, the basic network is selected by default.</p> 
     * @return VpcId <p>Configure the VPC ID for the clone instance. If not configured, the basic network is selected by default.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Configure the VPC ID for the clone instance. If not configured, the basic network is selected by default.</p>
     * @param VpcId <p>Configure the VPC ID for the clone instance. If not configured, the basic network is selected by default.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Configure the subnet of the private network for the cloned instance. This parameter requires no configuration for the basic network.</p> 
     * @return SubnetId <p>Configure the subnet of the private network for the cloned instance. This parameter requires no configuration for the basic network.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Configure the subnet of the private network for the cloned instance. This parameter requires no configuration for the basic network.</p>
     * @param SubnetId <p>Configure the subnet of the private network for the cloned instance. This parameter requires no configuration for the basic network.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Name of the cloned instance.<br>Only Chinese characters, English letters, numbers, dashes ("-"), or underscores ("_") are allowed, with a length of less than 60.<br></p> 
     * @return InstanceName <p>Name of the cloned instance.<br>Only Chinese characters, English letters, numbers, dashes ("-"), or underscores ("_") are allowed, with a length of less than 60.<br></p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Name of the cloned instance.<br>Only Chinese characters, English letters, numbers, dashes ("-"), or underscores ("_") are allowed, with a length of less than 60.<br></p>
     * @param InstanceName <p>Name of the cloned instance.<br>Only Chinese characters, English letters, numbers, dashes ("-"), or underscores ("_") are allowed, with a length of less than 60.<br></p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>The access password of the clone instance.<ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, setting this parameter is optional.</li><li>For Redis 2.8, 4.0, and 5.0 instances, the password format is: 8-30 characters, containing at least lowercase letters, uppercase letters, digits, and 2 types of characters from ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>For CKV 3.2 instances, the password format is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul></p> 
     * @return Password <p>The access password of the clone instance.<ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, setting this parameter is optional.</li><li>For Redis 2.8, 4.0, and 5.0 instances, the password format is: 8-30 characters, containing at least lowercase letters, uppercase letters, digits, and 2 types of characters from ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>For CKV 3.2 instances, the password format is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul></p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>The access password of the clone instance.<ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, setting this parameter is optional.</li><li>For Redis 2.8, 4.0, and 5.0 instances, the password format is: 8-30 characters, containing at least lowercase letters, uppercase letters, digits, and 2 types of characters from ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>For CKV 3.2 instances, the password format is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul></p>
     * @param Password <p>The access password of the clone instance.<ul><li>When the input parameter <b>NoAuth</b> is <b>true</b>, setting this parameter is optional.</li><li>For Redis 2.8, 4.0, and 5.0 instances, the password format is: 8-30 characters, containing at least lowercase letters, uppercase letters, digits, and 2 types of characters from ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>For CKV 3.2 instances, the password format is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul></p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Automatic renewal flag.<ul><li>0: default status, manual renewal.</li><li>1: automatic renewal.</li><li>2: no automatic renewal, auto-isolation upon expiration.</li></ul></p> 
     * @return AutoRenew <p>Automatic renewal flag.<ul><li>0: default status, manual renewal.</li><li>1: automatic renewal.</li><li>2: no automatic renewal, auto-isolation upon expiration.</li></ul></p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Automatic renewal flag.<ul><li>0: default status, manual renewal.</li><li>1: automatic renewal.</li><li>2: no automatic renewal, auto-isolation upon expiration.</li></ul></p>
     * @param AutoRenew <p>Automatic renewal flag.<ul><li>0: default status, manual renewal.</li><li>1: automatic renewal.</li><li>2: no automatic renewal, auto-isolation upon expiration.</li></ul></p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>User-defined port, defaults to 6379, in the range of [1024,65535].</p> 
     * @return VPort <p>User-defined port, defaults to 6379, in the range of [1024,65535].</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>User-defined port, defaults to 6379, in the range of [1024,65535].</p>
     * @param VPort <p>User-defined port, defaults to 6379, in the range of [1024,65535].</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>Node information of instance.<ul><li>Currently supports configuring node type (primary node or replica node) and its availability zone info. For details, please refer to <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo">RedisNodeInfo</a>.</li><li>This parameter can be left blank for single-AZ deployment.</li></ul></p> 
     * @return NodeSet <p>Node information of instance.<ul><li>Currently supports configuring node type (primary node or replica node) and its availability zone info. For details, please refer to <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo">RedisNodeInfo</a>.</li><li>This parameter can be left blank for single-AZ deployment.</li></ul></p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>Node information of instance.<ul><li>Currently supports configuring node type (primary node or replica node) and its availability zone info. For details, please refer to <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo">RedisNodeInfo</a>.</li><li>This parameter can be left blank for single-AZ deployment.</li></ul></p>
     * @param NodeSet <p>Node information of instance.<ul><li>Currently supports configuring node type (primary node or replica node) and its availability zone info. For details, please refer to <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1#RedisNodeInfo">RedisNodeInfo</a>.</li><li>This parameter can be left blank for single-AZ deployment.</li></ul></p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>. You can find the project ID in the <b>Account Center</b> &gt; <b>Project Management</b> at the top-right corner.</p> 
     * @return ProjectId <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>. You can find the project ID in the <b>Account Center</b> &gt; <b>Project Management</b> at the top-right corner.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>. You can find the project ID in the <b>Account Center</b> &gt; <b>Project Management</b> at the top-right corner.</p>
     * @param ProjectId <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>. You can find the project ID in the <b>Account Center</b> &gt; <b>Project Management</b> at the top-right corner.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Tag bound to the clone instance.</p> 
     * @return ResourceTags <p>Tag bound to the clone instance.</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Tag bound to the clone instance.</p>
     * @param ResourceTags <p>Tag bound to the clone instance.</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Specify the parameter template ID related to the cloned instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul> 
     * @return TemplateId <p>Specify the parameter template ID related to the cloned instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Specify the parameter template ID related to the cloned instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     * @param TemplateId <p>Specify the parameter template ID related to the cloned instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Specify the alarm policy ID of the clone instance. Log in to the <a href="https://console.cloud.tencent.com/monitor/alarm2/policy">Tencent Cloud observability platform console</a>, and get policy ID information on the <b>alarm management</b> &gt; <b>policy management</b> page.</p> 
     * @return AlarmPolicyList <p>Specify the alarm policy ID of the clone instance. Log in to the <a href="https://console.cloud.tencent.com/monitor/alarm2/policy">Tencent Cloud observability platform console</a>, and get policy ID information on the <b>alarm management</b> &gt; <b>policy management</b> page.</p>
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>Specify the alarm policy ID of the clone instance. Log in to the <a href="https://console.cloud.tencent.com/monitor/alarm2/policy">Tencent Cloud observability platform console</a>, and get policy ID information on the <b>alarm management</b> &gt; <b>policy management</b> page.</p>
     * @param AlarmPolicyList <p>Specify the alarm policy ID of the clone instance. Log in to the <a href="https://console.cloud.tencent.com/monitor/alarm2/policy">Tencent Cloud observability platform console</a>, and get policy ID information on the <b>alarm management</b> &gt; <b>policy management</b> page.</p>
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get <p>Clone the time when data is recovered.<br>Only instances with second-level backup enabled are supported.</p> 
     * @return CloneTime <p>Clone the time when data is recovered.<br>Only instances with second-level backup enabled are supported.</p>
     */
    public String getCloneTime() {
        return this.CloneTime;
    }

    /**
     * Set <p>Clone the time when data is recovered.<br>Only instances with second-level backup enabled are supported.</p>
     * @param CloneTime <p>Clone the time when data is recovered.<br>Only instances with second-level backup enabled are supported.</p>
     */
    public void setCloneTime(String CloneTime) {
        this.CloneTime = CloneTime;
    }

    /**
     * Get <p>Whether to encrypt the password</p> 
     * @return EncryptPassword <p>Whether to encrypt the password</p>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>Whether to encrypt the password</p>
     * @param EncryptPassword <p>Whether to encrypt the password</p>
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    /**
     * Get <p>Instance password complexity policy</p><p>Input parameter limit: If not passed or Enabled=false, deem as not enabled and verify by default rule.</p> 
     * @return PasswordPolicy <p>Instance password complexity policy</p><p>Input parameter limit: If not passed or Enabled=false, deem as not enabled and verify by default rule.</p>
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.PasswordPolicy;
    }

    /**
     * Set <p>Instance password complexity policy</p><p>Input parameter limit: If not passed or Enabled=false, deem as not enabled and verify by default rule.</p>
     * @param PasswordPolicy <p>Instance password complexity policy</p><p>Input parameter limit: If not passed or Enabled=false, deem as not enabled and verify by default rule.</p>
     */
    public void setPasswordPolicy(PasswordPolicy PasswordPolicy) {
        this.PasswordPolicy = PasswordPolicy;
    }

    /**
     * Get <p>Whether to enable SSL encryption.</p><p>Enumeration value:</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul><p>Default value: false</p> 
     * @return EnableSSL <p>Whether to enable SSL encryption.</p><p>Enumeration value:</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul><p>Default value: false</p>
     */
    public Boolean getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set <p>Whether to enable SSL encryption.</p><p>Enumeration value:</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul><p>Default value: false</p>
     * @param EnableSSL <p>Whether to enable SSL encryption.</p><p>Enumeration value:</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul><p>Default value: false</p>
     */
    public void setEnableSSL(Boolean EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get <p>Whether to write the private IPv4 address of the instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><p>Enumeration value:</p><ul><li>true: The private IP is allowed for SSL certificate verification.</li><li>false: The SAN extended information of the certificate is not added.</li></ul><p>Default value: false</p> 
     * @return SSLBindPrivateIPv4 <p>Whether to write the private IPv4 address of the instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><p>Enumeration value:</p><ul><li>true: The private IP is allowed for SSL certificate verification.</li><li>false: The SAN extended information of the certificate is not added.</li></ul><p>Default value: false</p>
     */
    public Boolean getSSLBindPrivateIPv4() {
        return this.SSLBindPrivateIPv4;
    }

    /**
     * Set <p>Whether to write the private IPv4 address of the instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><p>Enumeration value:</p><ul><li>true: The private IP is allowed for SSL certificate verification.</li><li>false: The SAN extended information of the certificate is not added.</li></ul><p>Default value: false</p>
     * @param SSLBindPrivateIPv4 <p>Whether to write the private IPv4 address of the instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><p>Enumeration value:</p><ul><li>true: The private IP is allowed for SSL certificate verification.</li><li>false: The SAN extended information of the certificate is not added.</li></ul><p>Default value: false</p>
     */
    public void setSSLBindPrivateIPv4(Boolean SSLBindPrivateIPv4) {
        this.SSLBindPrivateIPv4 = SSLBindPrivateIPv4;
    }

    /**
     * Get <p>Indicates the instance type.</p><p>Enumeration value:</p><ul><li>local: Common I</li><li>localv2: Common II</li></ul><p>If not passed, it remains the same as the original instance type by default.</p> 
     * @return ProductVersion <p>Indicates the instance type.</p><p>Enumeration value:</p><ul><li>local: Common I</li><li>localv2: Common II</li></ul><p>If not passed, it remains the same as the original instance type by default.</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>Indicates the instance type.</p><p>Enumeration value:</p><ul><li>local: Common I</li><li>localv2: Common II</li></ul><p>If not passed, it remains the same as the original instance type by default.</p>
     * @param ProductVersion <p>Indicates the instance type.</p><p>Enumeration value:</p><ul><li>local: Common I</li><li>localv2: Common II</li></ul><p>If not passed, it remains the same as the original instance type by default.</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
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
        if (source.CloneTime != null) {
            this.CloneTime = new String(source.CloneTime);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
        if (source.PasswordPolicy != null) {
            this.PasswordPolicy = new PasswordPolicy(source.PasswordPolicy);
        }
        if (source.EnableSSL != null) {
            this.EnableSSL = new Boolean(source.EnableSSL);
        }
        if (source.SSLBindPrivateIPv4 != null) {
            this.SSLBindPrivateIPv4 = new Boolean(source.SSLBindPrivateIPv4);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
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
        this.setParamSimple(map, prefix + "CloneTime", this.CloneTime);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);
        this.setParamObj(map, prefix + "PasswordPolicy.", this.PasswordPolicy);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "SSLBindPrivateIPv4", this.SSLBindPrivateIPv4);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);

    }
}

