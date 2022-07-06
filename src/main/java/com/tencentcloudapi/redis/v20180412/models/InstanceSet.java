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

public class InstanceSet extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User `Appid`
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC ID, such as 75101
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * VPC subnet ID, such as 46315
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance VIP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Port number of the instance
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance creation time
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * Instance capacity in MB
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * This field has been disused
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether to set the auto-renewal flag for the instance. 1: yes; 0: no
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Instance expiration time
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Engine: Redis Community Edition, Tencent Cloud CKV
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Instance type. Valid values: standalone (Standard Edition); cluster (Cluster Edition)
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * VPC ID, such as vpc-fk33jsf43kgv
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID, such as subnet-fd3j6l35mm0
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Billing mode. 0: pay-as-you-go; 1: monthly subscription
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Description of the instance status, such as "instance running"
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * Planned elimination time
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Sub-status returned for the instance in process
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * Anti-affinity tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Instance node information
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * Shard size
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * Number of shards
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Billing ID
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * Isolation time
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * Read weight of the replica node
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * Project name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Whether the instance is password-free. true: yes; false: no.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * Number of client connections
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * DTS status (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * Shard bandwidth cap in MB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * Password-free instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * Read-only instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * Disk size of the Tendis instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Monitoring version. Valid values: 1m (monitoring at 1-minute granularity); 5s (monitoring at 5-second granularity)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * Minimum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * Maximum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * Instance node details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * Instance region, such as ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User `Appid` 
     * @return Appid User `Appid`
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set User `Appid`
     * @param Appid User `Appid`
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
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
     * Get Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan 
     * @return RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     * @param RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong (China); 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID 
     * @return ZoneId Region ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID
     * @param ZoneId Region ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC ID, such as 75101 
     * @return VpcId VPC ID, such as 75101
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, such as 75101
     * @param VpcId VPC ID, such as 75101
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, such as 46315 
     * @return SubnetId VPC subnet ID, such as 46315
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, such as 46315
     * @param SubnetId VPC subnet ID, such as 46315
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted 
     * @return Status Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     * @param Status Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance VIP 
     * @return WanIp Instance VIP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Instance VIP
     * @param WanIp Instance VIP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Port number of the instance 
     * @return Port Port number of the instance
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number of the instance
     * @param Port Port number of the instance
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance creation time 
     * @return Createtime Instance creation time
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set Instance creation time
     * @param Createtime Instance creation time
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get Instance capacity in MB 
     * @return Size Instance capacity in MB
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set Instance capacity in MB
     * @param Size Instance capacity in MB
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get This field has been disused 
     * @return SizeUsed This field has been disused
     */
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set This field has been disused
     * @param SizeUsed This field has been disused
     */
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture) 
     * @return Type Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture)
     * @param Type Instance type. Valid values: `1` (Redis 2.8 Memory Edition in cluster architecture), `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to set the auto-renewal flag for the instance. 1: yes; 0: no 
     * @return AutoRenewFlag Whether to set the auto-renewal flag for the instance. 1: yes; 0: no
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to set the auto-renewal flag for the instance. 1: yes; 0: no
     * @param AutoRenewFlag Whether to set the auto-renewal flag for the instance. 1: yes; 0: no
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Instance expiration time 
     * @return DeadlineTime Instance expiration time
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Instance expiration time
     * @param DeadlineTime Instance expiration time
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Engine: Redis Community Edition, Tencent Cloud CKV 
     * @return Engine Engine: Redis Community Edition, Tencent Cloud CKV
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine: Redis Community Edition, Tencent Cloud CKV
     * @param Engine Engine: Redis Community Edition, Tencent Cloud CKV
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Instance type. Valid values: standalone (Standard Edition); cluster (Cluster Edition) 
     * @return ProductType Instance type. Valid values: standalone (Standard Edition); cluster (Cluster Edition)
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set Instance type. Valid values: standalone (Standard Edition); cluster (Cluster Edition)
     * @param ProductType Instance type. Valid values: standalone (Standard Edition); cluster (Cluster Edition)
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get VPC ID, such as vpc-fk33jsf43kgv 
     * @return UniqVpcId VPC ID, such as vpc-fk33jsf43kgv
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID, such as vpc-fk33jsf43kgv
     * @param UniqVpcId VPC ID, such as vpc-fk33jsf43kgv
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID, such as subnet-fd3j6l35mm0 
     * @return UniqSubnetId VPC subnet ID, such as subnet-fd3j6l35mm0
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC subnet ID, such as subnet-fd3j6l35mm0
     * @param UniqSubnetId VPC subnet ID, such as subnet-fd3j6l35mm0
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Billing mode. 0: pay-as-you-go; 1: monthly subscription 
     * @return BillingMode Billing mode. 0: pay-as-you-go; 1: monthly subscription
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode. 0: pay-as-you-go; 1: monthly subscription
     * @param BillingMode Billing mode. 0: pay-as-you-go; 1: monthly subscription
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Description of the instance status, such as "instance running" 
     * @return InstanceTitle Description of the instance status, such as "instance running"
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set Description of the instance status, such as "instance running"
     * @param InstanceTitle Description of the instance status, such as "instance running"
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get Planned elimination time 
     * @return OfflineTime Planned elimination time
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Planned elimination time
     * @param OfflineTime Planned elimination time
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Sub-status returned for the instance in process 
     * @return SubStatus Sub-status returned for the instance in process
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Sub-status returned for the instance in process
     * @param SubStatus Sub-status returned for the instance in process
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get Anti-affinity tag 
     * @return Tags Anti-affinity tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Anti-affinity tag
     * @param Tags Anti-affinity tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance node information 
     * @return InstanceNode Instance node information
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set Instance node information
     * @param InstanceNode Instance node information
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get Shard size 
     * @return RedisShardSize Shard size
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set Shard size
     * @param RedisShardSize Shard size
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get Number of shards 
     * @return RedisShardNum Number of shards
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards
     * @param RedisShardNum Number of shards
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas 
     * @return RedisReplicasNum Number of replicas
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas
     * @param RedisReplicasNum Number of replicas
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Billing ID 
     * @return PriceId Billing ID
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set Billing ID
     * @param PriceId Billing ID
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get Isolation time 
     * @return CloseTime Isolation time
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set Isolation time
     * @param CloseTime Isolation time
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get Read weight of the replica node 
     * @return SlaveReadWeight Read weight of the replica node
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set Read weight of the replica node
     * @param SlaveReadWeight Read weight of the replica node
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get Instance tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTags Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceTags Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get Project name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Whether the instance is password-free. true: yes; false: no.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoAuth Whether the instance is password-free. true: yes; false: no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether the instance is password-free. true: yes; false: no.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoAuth Whether the instance is password-free. true: yes; false: no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get Number of client connections
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientLimit Number of client connections
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set Number of client connections
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientLimit Number of client connections
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get DTS status (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DtsStatus DTS status (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set DTS status (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DtsStatus DTS status (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get Shard bandwidth cap in MB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetLimit Shard bandwidth cap in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set Shard bandwidth cap in MB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetLimit Shard bandwidth cap in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get Password-free instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PasswordFree Password-free instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set Password-free instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PasswordFree Password-free instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get Read-only instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadOnly Read-only instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Read-only instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadOnly Read-only instance flag (internal parameter, which can be ignored)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip6 Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip6 Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemainBandwidthDuration Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemainBandwidthDuration Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get Disk size of the Tendis instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size of the Tendis instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size of the Tendis instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size of the Tendis instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Monitoring version. Valid values: 1m (monitoring at 1-minute granularity); 5s (monitoring at 5-second granularity)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MonitorVersion Monitoring version. Valid values: 1m (monitoring at 1-minute granularity); 5s (monitoring at 5-second granularity)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set Monitoring version. Valid values: 1m (monitoring at 1-minute granularity); 5s (monitoring at 5-second granularity)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MonitorVersion Monitoring version. Valid values: 1m (monitoring at 1-minute granularity); 5s (monitoring at 5-second granularity)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get Minimum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientLimitMin Minimum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set Minimum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientLimitMin Minimum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get Maximum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientLimitMax Maximum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set Maximum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientLimitMax Maximum value for the range of maximum connections to the client
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get Instance node details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeSet Instance node details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set Instance node details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeSet Instance node details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get Instance region, such as ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Instance region, such as ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region, such as ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Instance region, such as ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public InstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSet(InstanceSet source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.SizeUsed != null) {
            this.SizeUsed = new Float(source.SizeUsed);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.InstanceTitle != null) {
            this.InstanceTitle = new String(source.InstanceTitle);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.InstanceNode != null) {
            this.InstanceNode = new InstanceNode[source.InstanceNode.length];
            for (int i = 0; i < source.InstanceNode.length; i++) {
                this.InstanceNode[i] = new InstanceNode(source.InstanceNode[i]);
            }
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
        if (source.CloseTime != null) {
            this.CloseTime = new String(source.CloseTime);
        }
        if (source.SlaveReadWeight != null) {
            this.SlaveReadWeight = new Long(source.SlaveReadWeight);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
        if (source.DtsStatus != null) {
            this.DtsStatus = new Long(source.DtsStatus);
        }
        if (source.NetLimit != null) {
            this.NetLimit = new Long(source.NetLimit);
        }
        if (source.PasswordFree != null) {
            this.PasswordFree = new Long(source.PasswordFree);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.RemainBandwidthDuration != null) {
            this.RemainBandwidthDuration = new String(source.RemainBandwidthDuration);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.ClientLimitMin != null) {
            this.ClientLimitMin = new Long(source.ClientLimitMin);
        }
        if (source.ClientLimitMax != null) {
            this.ClientLimitMax = new Long(source.ClientLimitMax);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeUsed", this.SizeUsed);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "InstanceTitle", this.InstanceTitle);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "InstanceNode.", this.InstanceNode);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "CloseTime", this.CloseTime);
        this.setParamSimple(map, prefix + "SlaveReadWeight", this.SlaveReadWeight);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);
        this.setParamSimple(map, prefix + "DtsStatus", this.DtsStatus);
        this.setParamSimple(map, prefix + "NetLimit", this.NetLimit);
        this.setParamSimple(map, prefix + "PasswordFree", this.PasswordFree);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "RemainBandwidthDuration", this.RemainBandwidthDuration);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamSimple(map, prefix + "ClientLimitMin", this.ClientLimitMin);
        this.setParamSimple(map, prefix + "ClientLimitMax", this.ClientLimitMax);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

