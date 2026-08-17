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

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 9.0 memory edition (standard architecture).</li><li>22: Valkey 9.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).<br><strong>Note</strong>: CKV editions are currently used by some users and are temporarily retained.</li></ul>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, query the sales specifications for all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p><ul><li>When <strong>TypeId</strong> is standard architecture, <strong>MemSize</strong> is the total memory capacity of the instance.</li><li>When <strong>TypeId</strong> is cluster architecture, <strong>MemSize</strong> is the sharded memory capacity.</li></ul>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Instance count. Number of instances to purchase at a time. For details, query sales specifications in all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Duration of instance purchase.</p><ul><li>If <strong>BillingMode</strong> is <strong>1</strong>, that is, the billing mode is monthly subscription, you need to set this parameter to specify the duration of instance purchase. Measurement unit: month, permissible range [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</li><li>If <strong>BillingMode</strong> is <strong>0</strong>, that is, the billing mode is pay-as-you-go, set this parameter to 1.</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Billing mode.</p><ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Password for accessing instances.</p><ul><li>When the input parameter <strong>NoAuth</strong> is <strong>true</strong>, it means setting instances to Password-free access, and Password does not need to be configured. Otherwise, Password is required.</li><li>When the instance type <strong>TypeId</strong> is Redis 2.8 memory edition standard architecture, Redis 4.0, 5.0, 6.2, or 7.0 memory edition standard architecture or cluster architecture, the Password complexity requirements are: 8-64 characters, containing at least lowercase letters, uppercase letters, digits, and 2 of the following characters: ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>When the instance type <strong>TypeId</strong> is CKV 3.2 memory edition standard architecture or cluster architecture, the Password complexity is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>VPC ID. If you do not configure this parameter, the basic network is selected by default. Log in to the <a href="https://console.cloud.tencent.com/vpc">private network</a> console to query the specific ID.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet of the private network VPC. In the basic network, this parameter requires no configuration. Log in to the <a href="https://console.cloud.tencent.com/vpc">Private Network</a> console to query the subnet list and obtain the specific ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>, select <strong>Project Management</strong> from the account information menu in the top-right corner, and query the project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Automatic renewal flag.</p><ul><li>0: default status (manual renewal).</li><li>1: automatic renewal.</li><li>2: non-renewal upon expiration.</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Security group ID array.</p><ul><li>A security group is a virtual firewall that controls network access to a cloud database instance. When creating an instance, it is recommended to bind the corresponding security group.</li><li>Get the security group ID of an instance through the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API.</li></ul>
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * <p>User-defined network port. Defaults to 6379, range [1024,65535].</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>Number of instance shards.</p><ul><li>No need to configure this parameter for standard edition instances.</li><li>For cluster edition instances, the shard quantity range is: [1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, 128].</li></ul>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>Instance replica number.</p><ul><li>Redis Memory Edition 4.0, 5.0, 6.2, and 7.0 cluster architecture supports a replica quantity range of [1,5].</li><li>Redis 2.8 Standard Edition and CKV Standard Edition support only 1 replica.</li></ul>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>Flag whether the instance needs to support read-only replica.</p><ul><li>Redis 2.8 Standard Edition and CKV Standard Edition do not support read-only replica.</li><li>If read-only replica is enabled, the instance will automatically separate read and write operations, with write requests routed to the primary node and read requests routed to replica nodes.</li><li>If needed to enable read-only replica, it is recommended to have at least 2 replicas.</li></ul>
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * <p>Instance name. Naming requirement: It only supports Chinese characters, letters, numbers, hyphens ("-"), or underscores ("_"), with a length of less than 60.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Configure whether the instance supports password-free access.</p><ul><li>true: Access the instance without a password.</li><li>false: Access the instance with a password. By default, password access is enabled. Only instances in a VPC network support password-free access.</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>Node information of instance, including node ID, node type, node availability zone ID. For details, please see <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1">RedisNodeInfo</a>.<br>Currently support inputting node type (primary node or replica node) and availability zone. When this parameter is not specified, in regions that support multi-availability zone deployment, the system defaults to creating instances with multi-availability zone architecture.</p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>Set a tag for the instance.</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Specify the name of the AZ to which the instance belongs. For details, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>Parameter template ID of the specified instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt to the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Internal parameter to identify whether creating an instance needs to check.</p><ul><li>false: Default value. Send a normal request and create the instance directly after passing the check.</li><li>true: Send a check request without creating an instance.</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Indicates the instance deployment mode.</p><ul><li>local: traditional architecture, defaults to local.</li><li>cdc: dedicated cluster.</li><li>cloud: cloud native, currently not available for sale.</li></ul>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>Dedicated cluster ID.</p><ul><li>When <strong>ProductVersion</strong> is set to <strong>cdc</strong>, this parameter must be set.</li><li>Get cluster ID through the API <a href="https://www.tencentcloud.com/document/product/239/109628?from_cn_redirect=1">DescribeRedisClusters</a>.</li></ul>
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * <p>Alarm policy ID array.</p><ul><li>Log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to get alarm policy ID.</li><li>If this parameter is not configured, the default alarm policy will be bound. For the default alarm policy details, log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to view.</li></ul>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
    * <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
    * <p>Instance-level password complexity policy. When not passed in or Enabled=false, deem as not enabling policy, validate by system default rule.</p>
    */
    @SerializedName("PasswordPolicy")
    @Expose
    private PasswordPolicy PasswordPolicy;

    /**
    * <p>Whether to enable SSL encryption.</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul>
    */
    @SerializedName("EnableSSL")
    @Expose
    private Boolean EnableSSL;

    /**
    * <p>Whether to write the private IPv4 address of an instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><ul><li>true: Allows using private IP to perform SSL certificate verification.</li><li>false: Does not add the SAN extended information to the certificate.</li></ul>
    */
    @SerializedName("SSLBindPrivateIPv4")
    @Expose
    private Boolean SSLBindPrivateIPv4;

    /**
    * <p>Instance connectivity access Mode.</p><ul><li>0: Proxy Mode (default value).</li><li>1: Direct access Mode.</li></ul>
    */
    @SerializedName("ConnectionMode")
    @Expose
    private Long ConnectionMode;

    /**
     * Get <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 9.0 memory edition (standard architecture).</li><li>22: Valkey 9.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).<br><strong>Note</strong>: CKV editions are currently used by some users and are temporarily retained.</li></ul> 
     * @return TypeId <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 9.0 memory edition (standard architecture).</li><li>22: Valkey 9.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).<br><strong>Note</strong>: CKV editions are currently used by some users and are temporarily retained.</li></ul>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 9.0 memory edition (standard architecture).</li><li>22: Valkey 9.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).<br><strong>Note</strong>: CKV editions are currently used by some users and are temporarily retained.</li></ul>
     * @param TypeId <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 9.0 memory edition (standard architecture).</li><li>22: Valkey 9.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).<br><strong>Note</strong>: CKV editions are currently used by some users and are temporarily retained.</li></ul>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, query the sales specifications for all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p><ul><li>When <strong>TypeId</strong> is standard architecture, <strong>MemSize</strong> is the total memory capacity of the instance.</li><li>When <strong>TypeId</strong> is cluster architecture, <strong>MemSize</strong> is the sharded memory capacity.</li></ul> 
     * @return MemSize <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, query the sales specifications for all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p><ul><li>When <strong>TypeId</strong> is standard architecture, <strong>MemSize</strong> is the total memory capacity of the instance.</li><li>When <strong>TypeId</strong> is cluster architecture, <strong>MemSize</strong> is the sharded memory capacity.</li></ul>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, query the sales specifications for all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p><ul><li>When <strong>TypeId</strong> is standard architecture, <strong>MemSize</strong> is the total memory capacity of the instance.</li><li>When <strong>TypeId</strong> is cluster architecture, <strong>MemSize</strong> is the sharded memory capacity.</li></ul>
     * @param MemSize <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, query the sales specifications for all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p><ul><li>When <strong>TypeId</strong> is standard architecture, <strong>MemSize</strong> is the total memory capacity of the instance.</li><li>When <strong>TypeId</strong> is cluster architecture, <strong>MemSize</strong> is the sharded memory capacity.</li></ul>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Instance count. Number of instances to purchase at a time. For details, query sales specifications in all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p> 
     * @return GoodsNum <p>Instance count. Number of instances to purchase at a time. For details, query sales specifications in all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Instance count. Number of instances to purchase at a time. For details, query sales specifications in all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p>
     * @param GoodsNum <p>Instance count. Number of instances to purchase at a time. For details, query sales specifications in all regions via the <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">DescribeProductInfo</a> API.</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Duration of instance purchase.</p><ul><li>If <strong>BillingMode</strong> is <strong>1</strong>, that is, the billing mode is monthly subscription, you need to set this parameter to specify the duration of instance purchase. Measurement unit: month, permissible range [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</li><li>If <strong>BillingMode</strong> is <strong>0</strong>, that is, the billing mode is pay-as-you-go, set this parameter to 1.</li></ul> 
     * @return Period <p>Duration of instance purchase.</p><ul><li>If <strong>BillingMode</strong> is <strong>1</strong>, that is, the billing mode is monthly subscription, you need to set this parameter to specify the duration of instance purchase. Measurement unit: month, permissible range [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</li><li>If <strong>BillingMode</strong> is <strong>0</strong>, that is, the billing mode is pay-as-you-go, set this parameter to 1.</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Duration of instance purchase.</p><ul><li>If <strong>BillingMode</strong> is <strong>1</strong>, that is, the billing mode is monthly subscription, you need to set this parameter to specify the duration of instance purchase. Measurement unit: month, permissible range [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</li><li>If <strong>BillingMode</strong> is <strong>0</strong>, that is, the billing mode is pay-as-you-go, set this parameter to 1.</li></ul>
     * @param Period <p>Duration of instance purchase.</p><ul><li>If <strong>BillingMode</strong> is <strong>1</strong>, that is, the billing mode is monthly subscription, you need to set this parameter to specify the duration of instance purchase. Measurement unit: month, permissible range [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</li><li>If <strong>BillingMode</strong> is <strong>0</strong>, that is, the billing mode is pay-as-you-go, set this parameter to 1.</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Billing mode.</p><ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul> 
     * @return BillingMode <p>Billing mode.</p><ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode.</p><ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul>
     * @param BillingMode <p>Billing mode.</p><ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p> 
     * @return ZoneId <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     * @param ZoneId <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Password for accessing instances.</p><ul><li>When the input parameter <strong>NoAuth</strong> is <strong>true</strong>, it means setting instances to Password-free access, and Password does not need to be configured. Otherwise, Password is required.</li><li>When the instance type <strong>TypeId</strong> is Redis 2.8 memory edition standard architecture, Redis 4.0, 5.0, 6.2, or 7.0 memory edition standard architecture or cluster architecture, the Password complexity requirements are: 8-64 characters, containing at least lowercase letters, uppercase letters, digits, and 2 of the following characters: ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>When the instance type <strong>TypeId</strong> is CKV 3.2 memory edition standard architecture or cluster architecture, the Password complexity is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul> 
     * @return Password <p>Password for accessing instances.</p><ul><li>When the input parameter <strong>NoAuth</strong> is <strong>true</strong>, it means setting instances to Password-free access, and Password does not need to be configured. Otherwise, Password is required.</li><li>When the instance type <strong>TypeId</strong> is Redis 2.8 memory edition standard architecture, Redis 4.0, 5.0, 6.2, or 7.0 memory edition standard architecture or cluster architecture, the Password complexity requirements are: 8-64 characters, containing at least lowercase letters, uppercase letters, digits, and 2 of the following characters: ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>When the instance type <strong>TypeId</strong> is CKV 3.2 memory edition standard architecture or cluster architecture, the Password complexity is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password for accessing instances.</p><ul><li>When the input parameter <strong>NoAuth</strong> is <strong>true</strong>, it means setting instances to Password-free access, and Password does not need to be configured. Otherwise, Password is required.</li><li>When the instance type <strong>TypeId</strong> is Redis 2.8 memory edition standard architecture, Redis 4.0, 5.0, 6.2, or 7.0 memory edition standard architecture or cluster architecture, the Password complexity requirements are: 8-64 characters, containing at least lowercase letters, uppercase letters, digits, and 2 of the following characters: ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>When the instance type <strong>TypeId</strong> is CKV 3.2 memory edition standard architecture or cluster architecture, the Password complexity is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul>
     * @param Password <p>Password for accessing instances.</p><ul><li>When the input parameter <strong>NoAuth</strong> is <strong>true</strong>, it means setting instances to Password-free access, and Password does not need to be configured. Otherwise, Password is required.</li><li>When the instance type <strong>TypeId</strong> is Redis 2.8 memory edition standard architecture, Redis 4.0, 5.0, 6.2, or 7.0 memory edition standard architecture or cluster architecture, the Password complexity requirements are: 8-64 characters, containing at least lowercase letters, uppercase letters, digits, and 2 of the following characters: ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/, and cannot start with "/".</li><li>When the instance type <strong>TypeId</strong> is CKV 3.2 memory edition standard architecture or cluster architecture, the Password complexity is: 8-30 characters, must include letters and digits, and exclude other characters.</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>VPC ID. If you do not configure this parameter, the basic network is selected by default. Log in to the <a href="https://console.cloud.tencent.com/vpc">private network</a> console to query the specific ID.</p> 
     * @return VpcId <p>VPC ID. If you do not configure this parameter, the basic network is selected by default. Log in to the <a href="https://console.cloud.tencent.com/vpc">private network</a> console to query the specific ID.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID. If you do not configure this parameter, the basic network is selected by default. Log in to the <a href="https://console.cloud.tencent.com/vpc">private network</a> console to query the specific ID.</p>
     * @param VpcId <p>VPC ID. If you do not configure this parameter, the basic network is selected by default. Log in to the <a href="https://console.cloud.tencent.com/vpc">private network</a> console to query the specific ID.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet of the private network VPC. In the basic network, this parameter requires no configuration. Log in to the <a href="https://console.cloud.tencent.com/vpc">Private Network</a> console to query the subnet list and obtain the specific ID.</p> 
     * @return SubnetId <p>Subnet of the private network VPC. In the basic network, this parameter requires no configuration. Log in to the <a href="https://console.cloud.tencent.com/vpc">Private Network</a> console to query the subnet list and obtain the specific ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet of the private network VPC. In the basic network, this parameter requires no configuration. Log in to the <a href="https://console.cloud.tencent.com/vpc">Private Network</a> console to query the subnet list and obtain the specific ID.</p>
     * @param SubnetId <p>Subnet of the private network VPC. In the basic network, this parameter requires no configuration. Log in to the <a href="https://console.cloud.tencent.com/vpc">Private Network</a> console to query the subnet list and obtain the specific ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>, select <strong>Project Management</strong> from the account information menu in the top-right corner, and query the project ID.</p> 
     * @return ProjectId <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>, select <strong>Project Management</strong> from the account information menu in the top-right corner, and query the project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>, select <strong>Project Management</strong> from the account information menu in the top-right corner, and query the project ID.</p>
     * @param ProjectId <p>Project ID. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a>, select <strong>Project Management</strong> from the account information menu in the top-right corner, and query the project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Automatic renewal flag.</p><ul><li>0: default status (manual renewal).</li><li>1: automatic renewal.</li><li>2: non-renewal upon expiration.</li></ul> 
     * @return AutoRenew <p>Automatic renewal flag.</p><ul><li>0: default status (manual renewal).</li><li>1: automatic renewal.</li><li>2: non-renewal upon expiration.</li></ul>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Automatic renewal flag.</p><ul><li>0: default status (manual renewal).</li><li>1: automatic renewal.</li><li>2: non-renewal upon expiration.</li></ul>
     * @param AutoRenew <p>Automatic renewal flag.</p><ul><li>0: default status (manual renewal).</li><li>1: automatic renewal.</li><li>2: non-renewal upon expiration.</li></ul>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Security group ID array.</p><ul><li>A security group is a virtual firewall that controls network access to a cloud database instance. When creating an instance, it is recommended to bind the corresponding security group.</li><li>Get the security group ID of an instance through the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API.</li></ul> 
     * @return SecurityGroupIdList <p>Security group ID array.</p><ul><li>A security group is a virtual firewall that controls network access to a cloud database instance. When creating an instance, it is recommended to bind the corresponding security group.</li><li>Get the security group ID of an instance through the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API.</li></ul>
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set <p>Security group ID array.</p><ul><li>A security group is a virtual firewall that controls network access to a cloud database instance. When creating an instance, it is recommended to bind the corresponding security group.</li><li>Get the security group ID of an instance through the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API.</li></ul>
     * @param SecurityGroupIdList <p>Security group ID array.</p><ul><li>A security group is a virtual firewall that controls network access to a cloud database instance. When creating an instance, it is recommended to bind the corresponding security group.</li><li>Get the security group ID of an instance through the <a href="https://www.tencentcloud.com/document/product/239/34447?from_cn_redirect=1">DescribeInstanceSecurityGroup</a> API.</li></ul>
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get <p>User-defined network port. Defaults to 6379, range [1024,65535].</p> 
     * @return VPort <p>User-defined network port. Defaults to 6379, range [1024,65535].</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>User-defined network port. Defaults to 6379, range [1024,65535].</p>
     * @param VPort <p>User-defined network port. Defaults to 6379, range [1024,65535].</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>Number of instance shards.</p><ul><li>No need to configure this parameter for standard edition instances.</li><li>For cluster edition instances, the shard quantity range is: [1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, 128].</li></ul> 
     * @return RedisShardNum <p>Number of instance shards.</p><ul><li>No need to configure this parameter for standard edition instances.</li><li>For cluster edition instances, the shard quantity range is: [1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, 128].</li></ul>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>Number of instance shards.</p><ul><li>No need to configure this parameter for standard edition instances.</li><li>For cluster edition instances, the shard quantity range is: [1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, 128].</li></ul>
     * @param RedisShardNum <p>Number of instance shards.</p><ul><li>No need to configure this parameter for standard edition instances.</li><li>For cluster edition instances, the shard quantity range is: [1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, 128].</li></ul>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>Instance replica number.</p><ul><li>Redis Memory Edition 4.0, 5.0, 6.2, and 7.0 cluster architecture supports a replica quantity range of [1,5].</li><li>Redis 2.8 Standard Edition and CKV Standard Edition support only 1 replica.</li></ul> 
     * @return RedisReplicasNum <p>Instance replica number.</p><ul><li>Redis Memory Edition 4.0, 5.0, 6.2, and 7.0 cluster architecture supports a replica quantity range of [1,5].</li><li>Redis 2.8 Standard Edition and CKV Standard Edition support only 1 replica.</li></ul>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>Instance replica number.</p><ul><li>Redis Memory Edition 4.0, 5.0, 6.2, and 7.0 cluster architecture supports a replica quantity range of [1,5].</li><li>Redis 2.8 Standard Edition and CKV Standard Edition support only 1 replica.</li></ul>
     * @param RedisReplicasNum <p>Instance replica number.</p><ul><li>Redis Memory Edition 4.0, 5.0, 6.2, and 7.0 cluster architecture supports a replica quantity range of [1,5].</li><li>Redis 2.8 Standard Edition and CKV Standard Edition support only 1 replica.</li></ul>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>Flag whether the instance needs to support read-only replica.</p><ul><li>Redis 2.8 Standard Edition and CKV Standard Edition do not support read-only replica.</li><li>If read-only replica is enabled, the instance will automatically separate read and write operations, with write requests routed to the primary node and read requests routed to replica nodes.</li><li>If needed to enable read-only replica, it is recommended to have at least 2 replicas.</li></ul> 
     * @return ReplicasReadonly <p>Flag whether the instance needs to support read-only replica.</p><ul><li>Redis 2.8 Standard Edition and CKV Standard Edition do not support read-only replica.</li><li>If read-only replica is enabled, the instance will automatically separate read and write operations, with write requests routed to the primary node and read requests routed to replica nodes.</li><li>If needed to enable read-only replica, it is recommended to have at least 2 replicas.</li></ul>
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set <p>Flag whether the instance needs to support read-only replica.</p><ul><li>Redis 2.8 Standard Edition and CKV Standard Edition do not support read-only replica.</li><li>If read-only replica is enabled, the instance will automatically separate read and write operations, with write requests routed to the primary node and read requests routed to replica nodes.</li><li>If needed to enable read-only replica, it is recommended to have at least 2 replicas.</li></ul>
     * @param ReplicasReadonly <p>Flag whether the instance needs to support read-only replica.</p><ul><li>Redis 2.8 Standard Edition and CKV Standard Edition do not support read-only replica.</li><li>If read-only replica is enabled, the instance will automatically separate read and write operations, with write requests routed to the primary node and read requests routed to replica nodes.</li><li>If needed to enable read-only replica, it is recommended to have at least 2 replicas.</li></ul>
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get <p>Instance name. Naming requirement: It only supports Chinese characters, letters, numbers, hyphens ("-"), or underscores ("_"), with a length of less than 60.</p> 
     * @return InstanceName <p>Instance name. Naming requirement: It only supports Chinese characters, letters, numbers, hyphens ("-"), or underscores ("_"), with a length of less than 60.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name. Naming requirement: It only supports Chinese characters, letters, numbers, hyphens ("-"), or underscores ("_"), with a length of less than 60.</p>
     * @param InstanceName <p>Instance name. Naming requirement: It only supports Chinese characters, letters, numbers, hyphens ("-"), or underscores ("_"), with a length of less than 60.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Configure whether the instance supports password-free access.</p><ul><li>true: Access the instance without a password.</li><li>false: Access the instance with a password. By default, password access is enabled. Only instances in a VPC network support password-free access.</li></ul> 
     * @return NoAuth <p>Configure whether the instance supports password-free access.</p><ul><li>true: Access the instance without a password.</li><li>false: Access the instance with a password. By default, password access is enabled. Only instances in a VPC network support password-free access.</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>Configure whether the instance supports password-free access.</p><ul><li>true: Access the instance without a password.</li><li>false: Access the instance with a password. By default, password access is enabled. Only instances in a VPC network support password-free access.</li></ul>
     * @param NoAuth <p>Configure whether the instance supports password-free access.</p><ul><li>true: Access the instance without a password.</li><li>false: Access the instance with a password. By default, password access is enabled. Only instances in a VPC network support password-free access.</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>Node information of instance, including node ID, node type, node availability zone ID. For details, please see <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1">RedisNodeInfo</a>.<br>Currently support inputting node type (primary node or replica node) and availability zone. When this parameter is not specified, in regions that support multi-availability zone deployment, the system defaults to creating instances with multi-availability zone architecture.</p> 
     * @return NodeSet <p>Node information of instance, including node ID, node type, node availability zone ID. For details, please see <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1">RedisNodeInfo</a>.<br>Currently support inputting node type (primary node or replica node) and availability zone. When this parameter is not specified, in regions that support multi-availability zone deployment, the system defaults to creating instances with multi-availability zone architecture.</p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>Node information of instance, including node ID, node type, node availability zone ID. For details, please see <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1">RedisNodeInfo</a>.<br>Currently support inputting node type (primary node or replica node) and availability zone. When this parameter is not specified, in regions that support multi-availability zone deployment, the system defaults to creating instances with multi-availability zone architecture.</p>
     * @param NodeSet <p>Node information of instance, including node ID, node type, node availability zone ID. For details, please see <a href="https://www.tencentcloud.com/document/product/239/20022?from_cn_redirect=1">RedisNodeInfo</a>.<br>Currently support inputting node type (primary node or replica node) and availability zone. When this parameter is not specified, in regions that support multi-availability zone deployment, the system defaults to creating instances with multi-availability zone architecture.</p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>Set a tag for the instance.</p> 
     * @return ResourceTags <p>Set a tag for the instance.</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Set a tag for the instance.</p>
     * @param ResourceTags <p>Set a tag for the instance.</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Specify the name of the AZ to which the instance belongs. For details, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p> 
     * @return ZoneName <p>Specify the name of the AZ to which the instance belongs. For details, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Specify the name of the AZ to which the instance belongs. For details, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     * @param ZoneName <p>Specify the name of the AZ to which the instance belongs. For details, see <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>Parameter template ID of the specified instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt to the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul> 
     * @return TemplateId <p>Parameter template ID of the specified instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt to the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Parameter template ID of the specified instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt to the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     * @param TemplateId <p>Parameter template ID of the specified instance.</p><ul><li>If this parameter is not configured, the system will automatically adapt to the corresponding default template based on the selected compatible version and architecture.</li><li>Query the parameter template list of the instance through the <a href="https://www.tencentcloud.com/document/product/239/58750?from_cn_redirect=1">DescribeParamTemplates</a> API to obtain the template ID number.</li></ul>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Internal parameter to identify whether creating an instance needs to check.</p><ul><li>false: Default value. Send a normal request and create the instance directly after passing the check.</li><li>true: Send a check request without creating an instance.</li></ul> 
     * @return DryRun <p>Internal parameter to identify whether creating an instance needs to check.</p><ul><li>false: Default value. Send a normal request and create the instance directly after passing the check.</li><li>true: Send a check request without creating an instance.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Internal parameter to identify whether creating an instance needs to check.</p><ul><li>false: Default value. Send a normal request and create the instance directly after passing the check.</li><li>true: Send a check request without creating an instance.</li></ul>
     * @param DryRun <p>Internal parameter to identify whether creating an instance needs to check.</p><ul><li>false: Default value. Send a normal request and create the instance directly after passing the check.</li><li>true: Send a check request without creating an instance.</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Indicates the instance deployment mode.</p><ul><li>local: traditional architecture, defaults to local.</li><li>cdc: dedicated cluster.</li><li>cloud: cloud native, currently not available for sale.</li></ul> 
     * @return ProductVersion <p>Indicates the instance deployment mode.</p><ul><li>local: traditional architecture, defaults to local.</li><li>cdc: dedicated cluster.</li><li>cloud: cloud native, currently not available for sale.</li></ul>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>Indicates the instance deployment mode.</p><ul><li>local: traditional architecture, defaults to local.</li><li>cdc: dedicated cluster.</li><li>cloud: cloud native, currently not available for sale.</li></ul>
     * @param ProductVersion <p>Indicates the instance deployment mode.</p><ul><li>local: traditional architecture, defaults to local.</li><li>cdc: dedicated cluster.</li><li>cloud: cloud native, currently not available for sale.</li></ul>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>Dedicated cluster ID.</p><ul><li>When <strong>ProductVersion</strong> is set to <strong>cdc</strong>, this parameter must be set.</li><li>Get cluster ID through the API <a href="https://www.tencentcloud.com/document/product/239/109628?from_cn_redirect=1">DescribeRedisClusters</a>.</li></ul> 
     * @return RedisClusterId <p>Dedicated cluster ID.</p><ul><li>When <strong>ProductVersion</strong> is set to <strong>cdc</strong>, this parameter must be set.</li><li>Get cluster ID through the API <a href="https://www.tencentcloud.com/document/product/239/109628?from_cn_redirect=1">DescribeRedisClusters</a>.</li></ul>
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set <p>Dedicated cluster ID.</p><ul><li>When <strong>ProductVersion</strong> is set to <strong>cdc</strong>, this parameter must be set.</li><li>Get cluster ID through the API <a href="https://www.tencentcloud.com/document/product/239/109628?from_cn_redirect=1">DescribeRedisClusters</a>.</li></ul>
     * @param RedisClusterId <p>Dedicated cluster ID.</p><ul><li>When <strong>ProductVersion</strong> is set to <strong>cdc</strong>, this parameter must be set.</li><li>Get cluster ID through the API <a href="https://www.tencentcloud.com/document/product/239/109628?from_cn_redirect=1">DescribeRedisClusters</a>.</li></ul>
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get <p>Alarm policy ID array.</p><ul><li>Log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to get alarm policy ID.</li><li>If this parameter is not configured, the default alarm policy will be bound. For the default alarm policy details, log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to view.</li></ul> 
     * @return AlarmPolicyList <p>Alarm policy ID array.</p><ul><li>Log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to get alarm policy ID.</li><li>If this parameter is not configured, the default alarm policy will be bound. For the default alarm policy details, log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to view.</li></ul>
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>Alarm policy ID array.</p><ul><li>Log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to get alarm policy ID.</li><li>If this parameter is not configured, the default alarm policy will be bound. For the default alarm policy details, log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to view.</li></ul>
     * @param AlarmPolicyList <p>Alarm policy ID array.</p><ul><li>Log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to get alarm policy ID.</li><li>If this parameter is not configured, the default alarm policy will be bound. For the default alarm policy details, log in to <a href="https://console.cloud.tencent.com/monitor/alarm/policy">Tencent Cloud Observability Platform - Alarm Management - Policy Management</a> to view.</li></ul>
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul> 
     * @return EncryptPassword <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
     * @param EncryptPassword <p>Whether to enable password encryption for transmission.</p><ul><li>true: Encrypted.</li><li>false: Not encrypted (default value).</li></ul>
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    /**
     * Get <p>Instance-level password complexity policy. When not passed in or Enabled=false, deem as not enabling policy, validate by system default rule.</p> 
     * @return PasswordPolicy <p>Instance-level password complexity policy. When not passed in or Enabled=false, deem as not enabling policy, validate by system default rule.</p>
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.PasswordPolicy;
    }

    /**
     * Set <p>Instance-level password complexity policy. When not passed in or Enabled=false, deem as not enabling policy, validate by system default rule.</p>
     * @param PasswordPolicy <p>Instance-level password complexity policy. When not passed in or Enabled=false, deem as not enabling policy, validate by system default rule.</p>
     */
    public void setPasswordPolicy(PasswordPolicy PasswordPolicy) {
        this.PasswordPolicy = PasswordPolicy;
    }

    /**
     * Get <p>Whether to enable SSL encryption.</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul> 
     * @return EnableSSL <p>Whether to enable SSL encryption.</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul>
     */
    public Boolean getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set <p>Whether to enable SSL encryption.</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul>
     * @param EnableSSL <p>Whether to enable SSL encryption.</p><ul><li>true: Enable.</li><li>false: Disable (default value).</li></ul>
     */
    public void setEnableSSL(Boolean EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get <p>Whether to write the private IPv4 address of an instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><ul><li>true: Allows using private IP to perform SSL certificate verification.</li><li>false: Does not add the SAN extended information to the certificate.</li></ul> 
     * @return SSLBindPrivateIPv4 <p>Whether to write the private IPv4 address of an instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><ul><li>true: Allows using private IP to perform SSL certificate verification.</li><li>false: Does not add the SAN extended information to the certificate.</li></ul>
     */
    public Boolean getSSLBindPrivateIPv4() {
        return this.SSLBindPrivateIPv4;
    }

    /**
     * Set <p>Whether to write the private IPv4 address of an instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><ul><li>true: Allows using private IP to perform SSL certificate verification.</li><li>false: Does not add the SAN extended information to the certificate.</li></ul>
     * @param SSLBindPrivateIPv4 <p>Whether to write the private IPv4 address of an instance to the domain alias (SAN) of the certificate when SSL is enabled. This parameter is valid only when EnableSSL is true.</p><ul><li>true: Allows using private IP to perform SSL certificate verification.</li><li>false: Does not add the SAN extended information to the certificate.</li></ul>
     */
    public void setSSLBindPrivateIPv4(Boolean SSLBindPrivateIPv4) {
        this.SSLBindPrivateIPv4 = SSLBindPrivateIPv4;
    }

    /**
     * Get <p>Instance connectivity access Mode.</p><ul><li>0: Proxy Mode (default value).</li><li>1: Direct access Mode.</li></ul> 
     * @return ConnectionMode <p>Instance connectivity access Mode.</p><ul><li>0: Proxy Mode (default value).</li><li>1: Direct access Mode.</li></ul>
     */
    public Long getConnectionMode() {
        return this.ConnectionMode;
    }

    /**
     * Set <p>Instance connectivity access Mode.</p><ul><li>0: Proxy Mode (default value).</li><li>1: Direct access Mode.</li></ul>
     * @param ConnectionMode <p>Instance connectivity access Mode.</p><ul><li>0: Proxy Mode (default value).</li><li>1: Direct access Mode.</li></ul>
     */
    public void setConnectionMode(Long ConnectionMode) {
        this.ConnectionMode = ConnectionMode;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.SecurityGroupIdList != null) {
            this.SecurityGroupIdList = new String[source.SecurityGroupIdList.length];
            for (int i = 0; i < source.SecurityGroupIdList.length; i++) {
                this.SecurityGroupIdList[i] = new String(source.SecurityGroupIdList[i]);
            }
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.ReplicasReadonly != null) {
            this.ReplicasReadonly = new Boolean(source.ReplicasReadonly);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new String[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new String(source.AlarmPolicyList[i]);
            }
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
        if (source.ConnectionMode != null) {
            this.ConnectionMode = new Long(source.ConnectionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);
        this.setParamObj(map, prefix + "PasswordPolicy.", this.PasswordPolicy);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "SSLBindPrivateIPv4", this.SSLBindPrivateIPv4);
        this.setParamSimple(map, prefix + "ConnectionMode", this.ConnectionMode);

    }
}

