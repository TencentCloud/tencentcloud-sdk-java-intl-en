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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel{

    /**
    * AZ ID of instance
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Instance type. Valid values: 2 (Redis 2.8 memory edition in standard architecture), 3 (Redis 3.2 memory edition in standard architecture), 4 (CKV 3.2 memory edition in standard architecture), 6 (Redis 4.0 memory edition in standard architecture), 7 (Redis 4.0 memory edition in cluster architecture), 8 (Redis 5.0 memory edition in standard architecture), 9 (Redis 5.0 memory edition in cluster architecture).
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Billing method. 0: pay as you go
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Instance password. It can contain 8-30 characters and must contain at least two of the following types of characters: lowercase letters, uppercase letters, digits, and special symbols (()`~!@#$%^&*-+=_|{}[]:;<>,.?/). It cannot stat with the symbol (/).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Array of security group IDs
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * User-defined port. If this parameter is left empty, 6379 will be used by default. Value range: [1024,65535]
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Number of shards in an instance. This parameter is required for cluster edition instances. Valid values: 3, 5, 8, 12, 16, 24, 32, 64, 96, 128.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas in an instance. Redis 2.8 standard edition and CKV standard edition support 1 replica. Standard/cluster edition 4.0 and 5.0 support 1-5 replicas.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Whether to support read-only replicas. Neither Redis 2.8 standard edition nor CKV standard edition supports read-only replicas. Read/write separation will be automatically enabled for an instance after it enables read-only replicas. Write requests will be directed to the master node and read requests will be distributed on slave nodes. To enable read-only replicas, we recommend you create 2 or more replicas.
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * Instance name. It contains only letters, digits, underscores, and dashes with a length of up to 60 characters.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether to support the password-free feature. Valid values: true (password-free instance), false (password-enabled instance). Default value: false. Only instances in a VPC support the password-free access.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get AZ ID of instance 
     * @return ZoneId AZ ID of instance
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID of instance
     * @param ZoneId AZ ID of instance
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance type. Valid values: 2 (Redis 2.8 memory edition in standard architecture), 3 (Redis 3.2 memory edition in standard architecture), 4 (CKV 3.2 memory edition in standard architecture), 6 (Redis 4.0 memory edition in standard architecture), 7 (Redis 4.0 memory edition in cluster architecture), 8 (Redis 5.0 memory edition in standard architecture), 9 (Redis 5.0 memory edition in cluster architecture). 
     * @return TypeId Instance type. Valid values: 2 (Redis 2.8 memory edition in standard architecture), 3 (Redis 3.2 memory edition in standard architecture), 4 (CKV 3.2 memory edition in standard architecture), 6 (Redis 4.0 memory edition in standard architecture), 7 (Redis 4.0 memory edition in cluster architecture), 8 (Redis 5.0 memory edition in standard architecture), 9 (Redis 5.0 memory edition in cluster architecture).
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Instance type. Valid values: 2 (Redis 2.8 memory edition in standard architecture), 3 (Redis 3.2 memory edition in standard architecture), 4 (CKV 3.2 memory edition in standard architecture), 6 (Redis 4.0 memory edition in standard architecture), 7 (Redis 4.0 memory edition in cluster architecture), 8 (Redis 5.0 memory edition in standard architecture), 9 (Redis 5.0 memory edition in cluster architecture).
     * @param TypeId Instance type. Valid values: 2 (Redis 2.8 memory edition in standard architecture), 3 (Redis 3.2 memory edition in standard architecture), 4 (CKV 3.2 memory edition in standard architecture), 6 (Redis 4.0 memory edition in standard architecture), 7 (Redis 4.0 memory edition in cluster architecture), 8 (Redis 5.0 memory edition in standard architecture), 9 (Redis 5.0 memory edition in cluster architecture).
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API | 
     * @return MemSize Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     * @param MemSize Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API 
     * @return GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     * @param GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1 
     * @return Period Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     * @param Period Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Billing method. 0: pay as you go 
     * @return BillingMode Billing method. 0: pay as you go
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing method. 0: pay as you go
     * @param BillingMode Billing method. 0: pay as you go
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Instance password. It can contain 8-30 characters and must contain at least two of the following types of characters: lowercase letters, uppercase letters, digits, and special symbols (()`~!@#$%^&*-+=_|{}[]:;<>,.?/). It cannot stat with the symbol (/). 
     * @return Password Instance password. It can contain 8-30 characters and must contain at least two of the following types of characters: lowercase letters, uppercase letters, digits, and special symbols (()`~!@#$%^&*-+=_|{}[]:;<>,.?/). It cannot stat with the symbol (/).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password. It can contain 8-30 characters and must contain at least two of the following types of characters: lowercase letters, uppercase letters, digits, and special symbols (()`~!@#$%^&*-+=_|{}[]:;<>,.?/). It cannot stat with the symbol (/).
     * @param Password Instance password. It can contain 8-30 characters and must contain at least two of the following types of characters: lowercase letters, uppercase letters, digits, and special symbols (()`~!@#$%^&*-+=_|{}[]:;<>,.?/). It cannot stat with the symbol (/).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query. 
     * @return VpcId VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     * @param VpcId VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2 
     * @return SubnetId In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     * @param SubnetId In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list 
     * @return ProjectId Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     * @param ProjectId Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled 
     * @return AutoRenew Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     * @param AutoRenew Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Array of security group IDs 
     * @return SecurityGroupIdList Array of security group IDs
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set Array of security group IDs
     * @param SecurityGroupIdList Array of security group IDs
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get User-defined port. If this parameter is left empty, 6379 will be used by default. Value range: [1024,65535] 
     * @return VPort User-defined port. If this parameter is left empty, 6379 will be used by default. Value range: [1024,65535]
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set User-defined port. If this parameter is left empty, 6379 will be used by default. Value range: [1024,65535]
     * @param VPort User-defined port. If this parameter is left empty, 6379 will be used by default. Value range: [1024,65535]
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Number of shards in an instance. This parameter is required for cluster edition instances. Valid values: 3, 5, 8, 12, 16, 24, 32, 64, 96, 128. 
     * @return RedisShardNum Number of shards in an instance. This parameter is required for cluster edition instances. Valid values: 3, 5, 8, 12, 16, 24, 32, 64, 96, 128.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards in an instance. This parameter is required for cluster edition instances. Valid values: 3, 5, 8, 12, 16, 24, 32, 64, 96, 128.
     * @param RedisShardNum Number of shards in an instance. This parameter is required for cluster edition instances. Valid values: 3, 5, 8, 12, 16, 24, 32, 64, 96, 128.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas in an instance. Redis 2.8 standard edition and CKV standard edition support 1 replica. Standard/cluster edition 4.0 and 5.0 support 1-5 replicas. 
     * @return RedisReplicasNum Number of replicas in an instance. Redis 2.8 standard edition and CKV standard edition support 1 replica. Standard/cluster edition 4.0 and 5.0 support 1-5 replicas.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas in an instance. Redis 2.8 standard edition and CKV standard edition support 1 replica. Standard/cluster edition 4.0 and 5.0 support 1-5 replicas.
     * @param RedisReplicasNum Number of replicas in an instance. Redis 2.8 standard edition and CKV standard edition support 1 replica. Standard/cluster edition 4.0 and 5.0 support 1-5 replicas.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Whether to support read-only replicas. Neither Redis 2.8 standard edition nor CKV standard edition supports read-only replicas. Read/write separation will be automatically enabled for an instance after it enables read-only replicas. Write requests will be directed to the master node and read requests will be distributed on slave nodes. To enable read-only replicas, we recommend you create 2 or more replicas. 
     * @return ReplicasReadonly Whether to support read-only replicas. Neither Redis 2.8 standard edition nor CKV standard edition supports read-only replicas. Read/write separation will be automatically enabled for an instance after it enables read-only replicas. Write requests will be directed to the master node and read requests will be distributed on slave nodes. To enable read-only replicas, we recommend you create 2 or more replicas.
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set Whether to support read-only replicas. Neither Redis 2.8 standard edition nor CKV standard edition supports read-only replicas. Read/write separation will be automatically enabled for an instance after it enables read-only replicas. Write requests will be directed to the master node and read requests will be distributed on slave nodes. To enable read-only replicas, we recommend you create 2 or more replicas.
     * @param ReplicasReadonly Whether to support read-only replicas. Neither Redis 2.8 standard edition nor CKV standard edition supports read-only replicas. Read/write separation will be automatically enabled for an instance after it enables read-only replicas. Write requests will be directed to the master node and read requests will be distributed on slave nodes. To enable read-only replicas, we recommend you create 2 or more replicas.
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get Instance name. It contains only letters, digits, underscores, and dashes with a length of up to 60 characters. 
     * @return InstanceName Instance name. It contains only letters, digits, underscores, and dashes with a length of up to 60 characters.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. It contains only letters, digits, underscores, and dashes with a length of up to 60 characters.
     * @param InstanceName Instance name. It contains only letters, digits, underscores, and dashes with a length of up to 60 characters.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether to support the password-free feature. Valid values: true (password-free instance), false (password-enabled instance). Default value: false. Only instances in a VPC support the password-free access. 
     * @return NoAuth Whether to support the password-free feature. Valid values: true (password-free instance), false (password-enabled instance). Default value: false. Only instances in a VPC support the password-free access.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether to support the password-free feature. Valid values: true (password-free instance), false (password-enabled instance). Default value: false. Only instances in a VPC support the password-free access.
     * @param NoAuth Whether to support the password-free feature. Valid values: true (password-free instance), false (password-enabled instance). Default value: false. Only instances in a VPC support the password-free access.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
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

    }
}

