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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAttributesResponse extends AbstractModel {

    /**
    * <p>ckafka cluster instance Id.</p>.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Specifies the Name of the ckafka cluster instance.</p>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Access point VIP list information.</p>.
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <p>Virtual IP.</p>.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <P>Virtual port.</p>.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Instance bandwidth (unit: Mbps).</p>.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>Specifies the instance storage size in GB.</p>.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <P>Specifies the availability zone.</p>.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>VPC ID. being empty indicates a basic network.</p>.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Specifies the subnet ID. being empty indicates the basic network.</p>.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <P>Specifies the instance health status. valid values: 1 (healthy), 2 (alarm), 3 (abnormal).</p>.
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <P>Instance health information. currently shows disk utilization rate. maximum length is 256.</p>.
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * <P>Creation time.</p>.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <P>Message retention period, in minutes.</p>.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>Automatic creation Topic configuration. if this field is empty, it indicates that automatic creation is not enabled.</p>.
    */
    @SerializedName("Config")
    @Expose
    private InstanceConfigDO Config;

    /**
    * <P>Number of remaining creatable partitions.</p>.
    */
    @SerializedName("RemainderPartitions")
    @Expose
    private Long RemainderPartitions;

    /**
    * <P>Number of remaining creatable topics.</p>.
    */
    @SerializedName("RemainderTopics")
    @Expose
    private Long RemainderTopics;

    /**
    * <P>Specifies the current number of partitions created.</p>.
    */
    @SerializedName("CreatedPartitions")
    @Expose
    private Long CreatedPartitions;

    /**
    * <P>Specifies the current number of topics created.</p>.
    */
    @SerializedName("CreatedTopics")
    @Expose
    private Long CreatedTopics;

    /**
    * <P>Tag array.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <P>Specifies the expiration time.</p>.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <P>Specifies the availability zone list.</p>.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <P>Specifies the ckafka cluster instance version.</p>.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <P>Specifies the maximum number of groups.</p>.
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * <P>Sale type. 0: standard version; 1: pro edition.</p>.
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * <p>Instance type. enumerates the list: profession: pro edition; standards2: standard version; premium: advanced edition; serverless: serverless edition.</p>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL: indicates that the ACL policy supports setting subnets.</p>.
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * <P>Dynamic message retention policy.</p>.
    */
    @SerializedName("RetentionTimeConfig")
    @Expose
    private DynamicRetentionTime RetentionTimeConfig;

    /**
    * <P>Maximum number of connections.</p>.
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * <P>Public network bandwidth.</p>.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <P>Deprecated. no actual meaning.</p>.
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
    * <P>Number of remaining creatable partitions.</p>.
    */
    @SerializedName("RemainingPartitions")
    @Expose
    private Long RemainingPartitions;

    /**
    * <P>Number of remaining creatable topics.</p>.
    */
    @SerializedName("RemainingTopics")
    @Expose
    private Long RemainingTopics;

    /**
    * <P>Dynamic disk expansion policy.</p>.
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * <P>Specifies the system maintenance time.</p>.
    */
    @SerializedName("SystemMaintenanceTime")
    @Expose
    private String SystemMaintenanceTime;

    /**
    * <P>Specifies the maximum size of instance level messages.</p>.
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * <p>Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.</p>.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Specifies whether to enable the elastic bandwidth allowlist. valid values: 1 (enabled), 0 (disabled).</p>.
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * <P>Specifies the elastic bandwidth activation status. 1: elastic bandwidth is disabled; 16: enabling elastic bandwidth; 32: elastic bandwidth enabled successfully; 33: disabling elastic bandwidth; 34: elastic bandwidth disabled successfully; 64: failed to enable elastic bandwidth; 65: failed to disable elastic bandwidth.</p>.
    */
    @SerializedName("ElasticBandwidthOpenStatus")
    @Expose
    private Long ElasticBandwidthOpenStatus;

    /**
    * <p>ClusterType<br />CLOUD_IDC IDC cluster<br />CLOUD_CVM_SHARE CVM shared cluster<br />CLOUD_CVM_YUNTI YUNTI CVM cluster<br />CLOUD_CVM CVM cluster<br />CLOUD_CDC CDC cluster<br />CLOUD_EKS_TSE EKS cluster</p>.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <P>Specifies the number of free partitions.</p>.
    */
    @SerializedName("FreePartitionNumber")
    @Expose
    private Long FreePartitionNumber;

    /**
    * <P>Specifies the elastic bandwidth upper limit.</p>.
    */
    @SerializedName("ElasticFloatBandwidth")
    @Expose
    private Long ElasticFloatBandwidth;

    /**
    * <p>ssl custom certificate id. only returned for instance clusters with custom certificates.</p>.
    */
    @SerializedName("CustomCertId")
    @Expose
    private String CustomCertId;

    /**
    * <P>Specifies the default unclean.leader.election.enable configuration for cluster topics. valid values: 1 (enable), 0 (disable).</p>.
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <P>Specifies the instance deletion protection switch. valid values: 1 (enabled), 0 (disabled).</p>.
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
     * Get <p>ckafka cluster instance Id.</p>. 
     * @return InstanceId <p>ckafka cluster instance Id.</p>.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id.</p>.
     * @param InstanceId <p>ckafka cluster instance Id.</p>.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Specifies the Name of the ckafka cluster instance.</p>. 
     * @return InstanceName <p>Specifies the Name of the ckafka cluster instance.</p>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Specifies the Name of the ckafka cluster instance.</p>.
     * @param InstanceName <p>Specifies the Name of the ckafka cluster instance.</p>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Access point VIP list information.</p>. 
     * @return VipList <p>Access point VIP list information.</p>.
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>Access point VIP list information.</p>.
     * @param VipList <p>Access point VIP list information.</p>.
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get <p>Virtual IP.</p>. 
     * @return Vip <p>Virtual IP.</p>.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Virtual IP.</p>.
     * @param Vip <p>Virtual IP.</p>.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <P>Virtual port.</p>. 
     * @return Vport <P>Virtual port.</p>.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <P>Virtual port.</p>.
     * @param Vport <P>Virtual port.</p>.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>. 
     * @return Status <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>.
     * @param Status <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance bandwidth (unit: Mbps).</p>. 
     * @return Bandwidth <p>Instance bandwidth (unit: Mbps).</p>.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>Instance bandwidth (unit: Mbps).</p>.
     * @param Bandwidth <p>Instance bandwidth (unit: Mbps).</p>.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>Specifies the instance storage size in GB.</p>. 
     * @return DiskSize <p>Specifies the instance storage size in GB.</p>.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Specifies the instance storage size in GB.</p>.
     * @param DiskSize <p>Specifies the instance storage size in GB.</p>.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <P>Specifies the availability zone.</p>. 
     * @return ZoneId <P>Specifies the availability zone.</p>.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <P>Specifies the availability zone.</p>.
     * @param ZoneId <P>Specifies the availability zone.</p>.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>VPC ID. being empty indicates a basic network.</p>. 
     * @return VpcId <p>VPC ID. being empty indicates a basic network.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID. being empty indicates a basic network.</p>.
     * @param VpcId <p>VPC ID. being empty indicates a basic network.</p>.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Specifies the subnet ID. being empty indicates the basic network.</p>. 
     * @return SubnetId <p>Specifies the subnet ID. being empty indicates the basic network.</p>.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Specifies the subnet ID. being empty indicates the basic network.</p>.
     * @param SubnetId <p>Specifies the subnet ID. being empty indicates the basic network.</p>.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <P>Specifies the instance health status. valid values: 1 (healthy), 2 (alarm), 3 (abnormal).</p>. 
     * @return Healthy <P>Specifies the instance health status. valid values: 1 (healthy), 2 (alarm), 3 (abnormal).</p>.
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <P>Specifies the instance health status. valid values: 1 (healthy), 2 (alarm), 3 (abnormal).</p>.
     * @param Healthy <P>Specifies the instance health status. valid values: 1 (healthy), 2 (alarm), 3 (abnormal).</p>.
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <P>Instance health information. currently shows disk utilization rate. maximum length is 256.</p>. 
     * @return HealthyMessage <P>Instance health information. currently shows disk utilization rate. maximum length is 256.</p>.
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set <P>Instance health information. currently shows disk utilization rate. maximum length is 256.</p>.
     * @param HealthyMessage <P>Instance health information. currently shows disk utilization rate. maximum length is 256.</p>.
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get <P>Creation time.</p>. 
     * @return CreateTime <P>Creation time.</p>.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <P>Creation time.</p>.
     * @param CreateTime <P>Creation time.</p>.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <P>Message retention period, in minutes.</p>. 
     * @return MsgRetentionTime <P>Message retention period, in minutes.</p>.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <P>Message retention period, in minutes.</p>.
     * @param MsgRetentionTime <P>Message retention period, in minutes.</p>.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>Automatic creation Topic configuration. if this field is empty, it indicates that automatic creation is not enabled.</p>. 
     * @return Config <p>Automatic creation Topic configuration. if this field is empty, it indicates that automatic creation is not enabled.</p>.
     */
    public InstanceConfigDO getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Automatic creation Topic configuration. if this field is empty, it indicates that automatic creation is not enabled.</p>.
     * @param Config <p>Automatic creation Topic configuration. if this field is empty, it indicates that automatic creation is not enabled.</p>.
     */
    public void setConfig(InstanceConfigDO Config) {
        this.Config = Config;
    }

    /**
     * Get <P>Number of remaining creatable partitions.</p>. 
     * @return RemainderPartitions <P>Number of remaining creatable partitions.</p>.
     */
    public Long getRemainderPartitions() {
        return this.RemainderPartitions;
    }

    /**
     * Set <P>Number of remaining creatable partitions.</p>.
     * @param RemainderPartitions <P>Number of remaining creatable partitions.</p>.
     */
    public void setRemainderPartitions(Long RemainderPartitions) {
        this.RemainderPartitions = RemainderPartitions;
    }

    /**
     * Get <P>Number of remaining creatable topics.</p>. 
     * @return RemainderTopics <P>Number of remaining creatable topics.</p>.
     */
    public Long getRemainderTopics() {
        return this.RemainderTopics;
    }

    /**
     * Set <P>Number of remaining creatable topics.</p>.
     * @param RemainderTopics <P>Number of remaining creatable topics.</p>.
     */
    public void setRemainderTopics(Long RemainderTopics) {
        this.RemainderTopics = RemainderTopics;
    }

    /**
     * Get <P>Specifies the current number of partitions created.</p>. 
     * @return CreatedPartitions <P>Specifies the current number of partitions created.</p>.
     */
    public Long getCreatedPartitions() {
        return this.CreatedPartitions;
    }

    /**
     * Set <P>Specifies the current number of partitions created.</p>.
     * @param CreatedPartitions <P>Specifies the current number of partitions created.</p>.
     */
    public void setCreatedPartitions(Long CreatedPartitions) {
        this.CreatedPartitions = CreatedPartitions;
    }

    /**
     * Get <P>Specifies the current number of topics created.</p>. 
     * @return CreatedTopics <P>Specifies the current number of topics created.</p>.
     */
    public Long getCreatedTopics() {
        return this.CreatedTopics;
    }

    /**
     * Set <P>Specifies the current number of topics created.</p>.
     * @param CreatedTopics <P>Specifies the current number of topics created.</p>.
     */
    public void setCreatedTopics(Long CreatedTopics) {
        this.CreatedTopics = CreatedTopics;
    }

    /**
     * Get <P>Tag array.</p>. 
     * @return Tags <P>Tag array.</p>.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <P>Tag array.</p>.
     * @param Tags <P>Tag array.</p>.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <P>Specifies the expiration time.</p>. 
     * @return ExpireTime <P>Specifies the expiration time.</p>.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <P>Specifies the expiration time.</p>.
     * @param ExpireTime <P>Specifies the expiration time.</p>.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <P>Specifies the availability zone list.</p>. 
     * @return ZoneIds <P>Specifies the availability zone list.</p>.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <P>Specifies the availability zone list.</p>.
     * @param ZoneIds <P>Specifies the availability zone list.</p>.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <P>Specifies the ckafka cluster instance version.</p>. 
     * @return Version <P>Specifies the ckafka cluster instance version.</p>.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <P>Specifies the ckafka cluster instance version.</p>.
     * @param Version <P>Specifies the ckafka cluster instance version.</p>.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <P>Specifies the maximum number of groups.</p>. 
     * @return MaxGroupNum <P>Specifies the maximum number of groups.</p>.
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set <P>Specifies the maximum number of groups.</p>.
     * @param MaxGroupNum <P>Specifies the maximum number of groups.</p>.
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get <P>Sale type. 0: standard version; 1: pro edition.</p>. 
     * @return Cvm <P>Sale type. 0: standard version; 1: pro edition.</p>.
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set <P>Sale type. 0: standard version; 1: pro edition.</p>.
     * @param Cvm <P>Sale type. 0: standard version; 1: pro edition.</p>.
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get <p>Instance type. enumerates the list: profession: pro edition; standards2: standard version; premium: advanced edition; serverless: serverless edition.</p>. 
     * @return InstanceType <p>Instance type. enumerates the list: profession: pro edition; standards2: standard version; premium: advanced edition; serverless: serverless edition.</p>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type. enumerates the list: profession: pro edition; standards2: standard version; premium: advanced edition; serverless: serverless edition.</p>.
     * @param InstanceType <p>Instance type. enumerates the list: profession: pro edition; standards2: standard version; premium: advanced edition; serverless: serverless edition.</p>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL: indicates that the ACL policy supports setting subnets.</p>. 
     * @return Features <p>Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL: indicates that the ACL policy supports setting subnets.</p>.
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL: indicates that the ACL policy supports setting subnets.</p>.
     * @param Features <p>Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL: indicates that the ACL policy supports setting subnets.</p>.
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get <P>Dynamic message retention policy.</p>. 
     * @return RetentionTimeConfig <P>Dynamic message retention policy.</p>.
     */
    public DynamicRetentionTime getRetentionTimeConfig() {
        return this.RetentionTimeConfig;
    }

    /**
     * Set <P>Dynamic message retention policy.</p>.
     * @param RetentionTimeConfig <P>Dynamic message retention policy.</p>.
     */
    public void setRetentionTimeConfig(DynamicRetentionTime RetentionTimeConfig) {
        this.RetentionTimeConfig = RetentionTimeConfig;
    }

    /**
     * Get <P>Maximum number of connections.</p>. 
     * @return MaxConnection <P>Maximum number of connections.</p>.
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set <P>Maximum number of connections.</p>.
     * @param MaxConnection <P>Maximum number of connections.</p>.
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get <P>Public network bandwidth.</p>. 
     * @return PublicNetwork <P>Public network bandwidth.</p>.
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <P>Public network bandwidth.</p>.
     * @param PublicNetwork <P>Public network bandwidth.</p>.
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <P>Deprecated. no actual meaning.</p>. 
     * @return DeleteRouteTimestamp <P>Deprecated. no actual meaning.</p>.
     */
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set <P>Deprecated. no actual meaning.</p>.
     * @param DeleteRouteTimestamp <P>Deprecated. no actual meaning.</p>.
     */
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    /**
     * Get <P>Number of remaining creatable partitions.</p>. 
     * @return RemainingPartitions <P>Number of remaining creatable partitions.</p>.
     */
    public Long getRemainingPartitions() {
        return this.RemainingPartitions;
    }

    /**
     * Set <P>Number of remaining creatable partitions.</p>.
     * @param RemainingPartitions <P>Number of remaining creatable partitions.</p>.
     */
    public void setRemainingPartitions(Long RemainingPartitions) {
        this.RemainingPartitions = RemainingPartitions;
    }

    /**
     * Get <P>Number of remaining creatable topics.</p>. 
     * @return RemainingTopics <P>Number of remaining creatable topics.</p>.
     */
    public Long getRemainingTopics() {
        return this.RemainingTopics;
    }

    /**
     * Set <P>Number of remaining creatable topics.</p>.
     * @param RemainingTopics <P>Number of remaining creatable topics.</p>.
     */
    public void setRemainingTopics(Long RemainingTopics) {
        this.RemainingTopics = RemainingTopics;
    }

    /**
     * Get <P>Dynamic disk expansion policy.</p>. 
     * @return DynamicDiskConfig <P>Dynamic disk expansion policy.</p>.
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set <P>Dynamic disk expansion policy.</p>.
     * @param DynamicDiskConfig <P>Dynamic disk expansion policy.</p>.
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get <P>Specifies the system maintenance time.</p>. 
     * @return SystemMaintenanceTime <P>Specifies the system maintenance time.</p>.
     */
    public String getSystemMaintenanceTime() {
        return this.SystemMaintenanceTime;
    }

    /**
     * Set <P>Specifies the system maintenance time.</p>.
     * @param SystemMaintenanceTime <P>Specifies the system maintenance time.</p>.
     */
    public void setSystemMaintenanceTime(String SystemMaintenanceTime) {
        this.SystemMaintenanceTime = SystemMaintenanceTime;
    }

    /**
     * Get <P>Specifies the maximum size of instance level messages.</p>. 
     * @return MaxMessageByte <P>Specifies the maximum size of instance level messages.</p>.
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set <P>Specifies the maximum size of instance level messages.</p>.
     * @param MaxMessageByte <P>Specifies the maximum size of instance level messages.</p>.
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get <p>Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.</p>. 
     * @return InstanceChargeType <p>Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.</p>.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.</p>.
     * @param InstanceChargeType <p>Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.</p>.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Specifies whether to enable the elastic bandwidth allowlist. valid values: 1 (enabled), 0 (disabled).</p>. 
     * @return ElasticBandwidthSwitch <p>Specifies whether to enable the elastic bandwidth allowlist. valid values: 1 (enabled), 0 (disabled).</p>.
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <p>Specifies whether to enable the elastic bandwidth allowlist. valid values: 1 (enabled), 0 (disabled).</p>.
     * @param ElasticBandwidthSwitch <p>Specifies whether to enable the elastic bandwidth allowlist. valid values: 1 (enabled), 0 (disabled).</p>.
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get <P>Specifies the elastic bandwidth activation status. 1: elastic bandwidth is disabled; 16: enabling elastic bandwidth; 32: elastic bandwidth enabled successfully; 33: disabling elastic bandwidth; 34: elastic bandwidth disabled successfully; 64: failed to enable elastic bandwidth; 65: failed to disable elastic bandwidth.</p>. 
     * @return ElasticBandwidthOpenStatus <P>Specifies the elastic bandwidth activation status. 1: elastic bandwidth is disabled; 16: enabling elastic bandwidth; 32: elastic bandwidth enabled successfully; 33: disabling elastic bandwidth; 34: elastic bandwidth disabled successfully; 64: failed to enable elastic bandwidth; 65: failed to disable elastic bandwidth.</p>.
     */
    public Long getElasticBandwidthOpenStatus() {
        return this.ElasticBandwidthOpenStatus;
    }

    /**
     * Set <P>Specifies the elastic bandwidth activation status. 1: elastic bandwidth is disabled; 16: enabling elastic bandwidth; 32: elastic bandwidth enabled successfully; 33: disabling elastic bandwidth; 34: elastic bandwidth disabled successfully; 64: failed to enable elastic bandwidth; 65: failed to disable elastic bandwidth.</p>.
     * @param ElasticBandwidthOpenStatus <P>Specifies the elastic bandwidth activation status. 1: elastic bandwidth is disabled; 16: enabling elastic bandwidth; 32: elastic bandwidth enabled successfully; 33: disabling elastic bandwidth; 34: elastic bandwidth disabled successfully; 64: failed to enable elastic bandwidth; 65: failed to disable elastic bandwidth.</p>.
     */
    public void setElasticBandwidthOpenStatus(Long ElasticBandwidthOpenStatus) {
        this.ElasticBandwidthOpenStatus = ElasticBandwidthOpenStatus;
    }

    /**
     * Get <p>ClusterType<br />CLOUD_IDC IDC cluster<br />CLOUD_CVM_SHARE CVM shared cluster<br />CLOUD_CVM_YUNTI YUNTI CVM cluster<br />CLOUD_CVM CVM cluster<br />CLOUD_CDC CDC cluster<br />CLOUD_EKS_TSE EKS cluster</p>. 
     * @return ClusterType <p>ClusterType<br />CLOUD_IDC IDC cluster<br />CLOUD_CVM_SHARE CVM shared cluster<br />CLOUD_CVM_YUNTI YUNTI CVM cluster<br />CLOUD_CVM CVM cluster<br />CLOUD_CDC CDC cluster<br />CLOUD_EKS_TSE EKS cluster</p>.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>ClusterType<br />CLOUD_IDC IDC cluster<br />CLOUD_CVM_SHARE CVM shared cluster<br />CLOUD_CVM_YUNTI YUNTI CVM cluster<br />CLOUD_CVM CVM cluster<br />CLOUD_CDC CDC cluster<br />CLOUD_EKS_TSE EKS cluster</p>.
     * @param ClusterType <p>ClusterType<br />CLOUD_IDC IDC cluster<br />CLOUD_CVM_SHARE CVM shared cluster<br />CLOUD_CVM_YUNTI YUNTI CVM cluster<br />CLOUD_CVM CVM cluster<br />CLOUD_CDC CDC cluster<br />CLOUD_EKS_TSE EKS cluster</p>.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <P>Specifies the number of free partitions.</p>. 
     * @return FreePartitionNumber <P>Specifies the number of free partitions.</p>.
     */
    public Long getFreePartitionNumber() {
        return this.FreePartitionNumber;
    }

    /**
     * Set <P>Specifies the number of free partitions.</p>.
     * @param FreePartitionNumber <P>Specifies the number of free partitions.</p>.
     */
    public void setFreePartitionNumber(Long FreePartitionNumber) {
        this.FreePartitionNumber = FreePartitionNumber;
    }

    /**
     * Get <P>Specifies the elastic bandwidth upper limit.</p>. 
     * @return ElasticFloatBandwidth <P>Specifies the elastic bandwidth upper limit.</p>.
     */
    public Long getElasticFloatBandwidth() {
        return this.ElasticFloatBandwidth;
    }

    /**
     * Set <P>Specifies the elastic bandwidth upper limit.</p>.
     * @param ElasticFloatBandwidth <P>Specifies the elastic bandwidth upper limit.</p>.
     */
    public void setElasticFloatBandwidth(Long ElasticFloatBandwidth) {
        this.ElasticFloatBandwidth = ElasticFloatBandwidth;
    }

    /**
     * Get <p>ssl custom certificate id. only returned for instance clusters with custom certificates.</p>. 
     * @return CustomCertId <p>ssl custom certificate id. only returned for instance clusters with custom certificates.</p>.
     */
    public String getCustomCertId() {
        return this.CustomCertId;
    }

    /**
     * Set <p>ssl custom certificate id. only returned for instance clusters with custom certificates.</p>.
     * @param CustomCertId <p>ssl custom certificate id. only returned for instance clusters with custom certificates.</p>.
     */
    public void setCustomCertId(String CustomCertId) {
        this.CustomCertId = CustomCertId;
    }

    /**
     * Get <P>Specifies the default unclean.leader.election.enable configuration for cluster topics. valid values: 1 (enable), 0 (disable).</p>. 
     * @return UncleanLeaderElectionEnable <P>Specifies the default unclean.leader.election.enable configuration for cluster topics. valid values: 1 (enable), 0 (disable).</p>.
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <P>Specifies the default unclean.leader.election.enable configuration for cluster topics. valid values: 1 (enable), 0 (disable).</p>.
     * @param UncleanLeaderElectionEnable <P>Specifies the default unclean.leader.election.enable configuration for cluster topics. valid values: 1 (enable), 0 (disable).</p>.
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <P>Specifies the instance deletion protection switch. valid values: 1 (enabled), 0 (disabled).</p>. 
     * @return DeleteProtectionEnable <P>Specifies the instance deletion protection switch. valid values: 1 (enabled), 0 (disabled).</p>.
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set <P>Specifies the instance deletion protection switch. valid values: 1 (enabled), 0 (disabled).</p>.
     * @param DeleteProtectionEnable <P>Specifies the instance deletion protection switch. valid values: 1 (enabled), 0 (disabled).</p>.
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
    }

    public InstanceAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAttributesResponse(InstanceAttributesResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.HealthyMessage != null) {
            this.HealthyMessage = new String(source.HealthyMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.Config != null) {
            this.Config = new InstanceConfigDO(source.Config);
        }
        if (source.RemainderPartitions != null) {
            this.RemainderPartitions = new Long(source.RemainderPartitions);
        }
        if (source.RemainderTopics != null) {
            this.RemainderTopics = new Long(source.RemainderTopics);
        }
        if (source.CreatedPartitions != null) {
            this.CreatedPartitions = new Long(source.CreatedPartitions);
        }
        if (source.CreatedTopics != null) {
            this.CreatedTopics = new Long(source.CreatedTopics);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.MaxGroupNum != null) {
            this.MaxGroupNum = new Long(source.MaxGroupNum);
        }
        if (source.Cvm != null) {
            this.Cvm = new Long(source.Cvm);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.RetentionTimeConfig != null) {
            this.RetentionTimeConfig = new DynamicRetentionTime(source.RetentionTimeConfig);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.DeleteRouteTimestamp != null) {
            this.DeleteRouteTimestamp = new String(source.DeleteRouteTimestamp);
        }
        if (source.RemainingPartitions != null) {
            this.RemainingPartitions = new Long(source.RemainingPartitions);
        }
        if (source.RemainingTopics != null) {
            this.RemainingTopics = new Long(source.RemainingTopics);
        }
        if (source.DynamicDiskConfig != null) {
            this.DynamicDiskConfig = new DynamicDiskConfig(source.DynamicDiskConfig);
        }
        if (source.SystemMaintenanceTime != null) {
            this.SystemMaintenanceTime = new String(source.SystemMaintenanceTime);
        }
        if (source.MaxMessageByte != null) {
            this.MaxMessageByte = new Long(source.MaxMessageByte);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ElasticBandwidthSwitch != null) {
            this.ElasticBandwidthSwitch = new Long(source.ElasticBandwidthSwitch);
        }
        if (source.ElasticBandwidthOpenStatus != null) {
            this.ElasticBandwidthOpenStatus = new Long(source.ElasticBandwidthOpenStatus);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.FreePartitionNumber != null) {
            this.FreePartitionNumber = new Long(source.FreePartitionNumber);
        }
        if (source.ElasticFloatBandwidth != null) {
            this.ElasticFloatBandwidth = new Long(source.ElasticFloatBandwidth);
        }
        if (source.CustomCertId != null) {
            this.CustomCertId = new String(source.CustomCertId);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.DeleteProtectionEnable != null) {
            this.DeleteProtectionEnable = new Long(source.DeleteProtectionEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyMessage", this.HealthyMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "RemainderPartitions", this.RemainderPartitions);
        this.setParamSimple(map, prefix + "RemainderTopics", this.RemainderTopics);
        this.setParamSimple(map, prefix + "CreatedPartitions", this.CreatedPartitions);
        this.setParamSimple(map, prefix + "CreatedTopics", this.CreatedTopics);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "Cvm", this.Cvm);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamObj(map, prefix + "RetentionTimeConfig.", this.RetentionTimeConfig);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "DeleteRouteTimestamp", this.DeleteRouteTimestamp);
        this.setParamSimple(map, prefix + "RemainingPartitions", this.RemainingPartitions);
        this.setParamSimple(map, prefix + "RemainingTopics", this.RemainingTopics);
        this.setParamObj(map, prefix + "DynamicDiskConfig.", this.DynamicDiskConfig);
        this.setParamSimple(map, prefix + "SystemMaintenanceTime", this.SystemMaintenanceTime);
        this.setParamSimple(map, prefix + "MaxMessageByte", this.MaxMessageByte);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidthOpenStatus", this.ElasticBandwidthOpenStatus);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "FreePartitionNumber", this.FreePartitionNumber);
        this.setParamSimple(map, prefix + "ElasticFloatBandwidth", this.ElasticFloatBandwidth);
        this.setParamSimple(map, prefix + "CustomCertId", this.CustomCertId);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "DeleteProtectionEnable", this.DeleteProtectionEnable);

    }
}

