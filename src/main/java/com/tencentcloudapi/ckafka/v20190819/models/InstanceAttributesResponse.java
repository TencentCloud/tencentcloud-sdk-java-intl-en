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
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the Name of the ckafka cluster instance.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VIP list information of access point
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * Virtual IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Virtual port
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Instance status. 0: creating, 1: running, 2: deleting, 3: deleted, 5: isolated, 7: upgrading, -1: creation failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance bandwidth in Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * AZ
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC ID. If this parameter is empty, it means the basic network
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. If this parameter is empty, it means the basic network
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance health status. 1: healthy, 2: alarmed, 3: exceptional
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * Instance health information. Currently, the disk utilization is displayed with a maximum length of 256
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Message retention period in minutes
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * Configuration for automatic topic creation. If this field is empty, it means that automatic creation is not enabled
    */
    @SerializedName("Config")
    @Expose
    private InstanceConfigDO Config;

    /**
    * Number of remaining creatable partitions
    */
    @SerializedName("RemainderPartitions")
    @Expose
    private Long RemainderPartitions;

    /**
    * Number of remaining creatable topics
    */
    @SerializedName("RemainderTopics")
    @Expose
    private Long RemainderTopics;

    /**
    * Number of partitions already created
    */
    @SerializedName("CreatedPartitions")
    @Expose
    private Long CreatedPartitions;

    /**
    * Number of topics already created
    */
    @SerializedName("CreatedTopics")
    @Expose
    private Long CreatedTopics;

    /**
    * Tag array
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Availability Zone List
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Specifies the ckafka cluster instance version.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Maximum number of groups.
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * Sale type. valid values: 0 (standard version), 1 (pro edition).
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * Instance type. valid values:. 
Specifies the pro edition.    
Standard version.
premium. specifies the advanced edition.
Specifies the serverless version.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL means the policy support for configuring subnets.
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * Dynamic message retention policy.
    */
    @SerializedName("RetentionTimeConfig")
    @Expose
    private DynamicRetentionTime RetentionTimeConfig;

    /**
    * Maximum number of connections.
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * Public network bandwidth
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * Specifies the deprecated field with no actual meaning.
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
    * Number of remaining creatable partitions.
    */
    @SerializedName("RemainingPartitions")
    @Expose
    private Long RemainingPartitions;

    /**
    * Number of remaining creatable topics.
    */
    @SerializedName("RemainingTopics")
    @Expose
    private Long RemainingTopics;

    /**
    * Scaling policy for dynamic disk.
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Whether to enable the elastic bandwidth allowlist.   
Indicates the allowlist feature with elastic bandwidth enabled.
0: elastic bandwidth allowlist feature is disabled.
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * Indicates the elastic bandwidth activation status.
1: indicates elastic bandwidth is disabled.
Enable elastic bandwidth.
Enable elastic bandwidth successfully.
33: disabling elastic bandwidth.
Indicates that the elastic bandwidth is successfully disabled.
Enable elastic bandwidth failed.
Bandwidth failure.
    */
    @SerializedName("ElasticBandwidthOpenStatus")
    @Expose
    private Long ElasticBandwidthOpenStatus;

    /**
    * Cluster type.  
CLOUD_IDC idc cluster.
CLOUD_CVM_SHARE shared cluster.
CLOUD_CVM_YUNTI yunti cvm cluster.
CLOUD_CVM. specifies the cvm cluster.
CLOUD_CDC cdc cluster.
CLOUD_EKS_TSE eks cluster.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Number of free partitions.
    */
    @SerializedName("FreePartitionNumber")
    @Expose
    private Long FreePartitionNumber;

    /**
    * Specifies the elastic bandwidth upper limit.
    */
    @SerializedName("ElasticFloatBandwidth")
    @Expose
    private Long ElasticFloatBandwidth;

    /**
    * ssl custom certificate id. only returned for instance clusters with custom certificates.
    */
    @SerializedName("CustomCertId")
    @Expose
    private String CustomCertId;

    /**
    * Default unclean.leader.election.enable configuration for cluster topic: 1 enable 0 disable.
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Instance deletion protection switch. 1: enabled; 0: disabled.
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the Name of the ckafka cluster instance. 
     * @return InstanceName Specifies the Name of the ckafka cluster instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the Name of the ckafka cluster instance.
     * @param InstanceName Specifies the Name of the ckafka cluster instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VIP list information of access point 
     * @return VipList VIP list information of access point
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set VIP list information of access point
     * @param VipList VIP list information of access point
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get Virtual IP 
     * @return Vip Virtual IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Virtual IP
     * @param Vip Virtual IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Virtual port 
     * @return Vport Virtual port
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Virtual port
     * @param Vport Virtual port
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance status. 0: creating, 1: running, 2: deleting, 3: deleted, 5: isolated, 7: upgrading, -1: creation failed. 
     * @return Status Instance status. 0: creating, 1: running, 2: deleting, 3: deleted, 5: isolated, 7: upgrading, -1: creation failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: creating, 1: running, 2: deleting, 3: deleted, 5: isolated, 7: upgrading, -1: creation failed.
     * @param Status Instance status. 0: creating, 1: running, 2: deleting, 3: deleted, 5: isolated, 7: upgrading, -1: creation failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance bandwidth in Mbps 
     * @return Bandwidth Instance bandwidth in Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Instance bandwidth in Mbps
     * @param Bandwidth Instance bandwidth in Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return DiskSize Instance storage capacity in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Instance storage capacity in GB
     * @param DiskSize Instance storage capacity in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get AZ 
     * @return ZoneId AZ
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ
     * @param ZoneId AZ
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC ID. If this parameter is empty, it means the basic network 
     * @return VpcId VPC ID. If this parameter is empty, it means the basic network
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is empty, it means the basic network
     * @param VpcId VPC ID. If this parameter is empty, it means the basic network
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. If this parameter is empty, it means the basic network 
     * @return SubnetId Subnet ID. If this parameter is empty, it means the basic network
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. If this parameter is empty, it means the basic network
     * @param SubnetId Subnet ID. If this parameter is empty, it means the basic network
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance health status. 1: healthy, 2: alarmed, 3: exceptional 
     * @return Healthy Instance health status. 1: healthy, 2: alarmed, 3: exceptional
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Instance health status. 1: healthy, 2: alarmed, 3: exceptional
     * @param Healthy Instance health status. 1: healthy, 2: alarmed, 3: exceptional
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get Instance health information. Currently, the disk utilization is displayed with a maximum length of 256 
     * @return HealthyMessage Instance health information. Currently, the disk utilization is displayed with a maximum length of 256
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set Instance health information. Currently, the disk utilization is displayed with a maximum length of 256
     * @param HealthyMessage Instance health information. Currently, the disk utilization is displayed with a maximum length of 256
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Message retention period in minutes 
     * @return MsgRetentionTime Message retention period in minutes
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set Message retention period in minutes
     * @param MsgRetentionTime Message retention period in minutes
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get Configuration for automatic topic creation. If this field is empty, it means that automatic creation is not enabled 
     * @return Config Configuration for automatic topic creation. If this field is empty, it means that automatic creation is not enabled
     */
    public InstanceConfigDO getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration for automatic topic creation. If this field is empty, it means that automatic creation is not enabled
     * @param Config Configuration for automatic topic creation. If this field is empty, it means that automatic creation is not enabled
     */
    public void setConfig(InstanceConfigDO Config) {
        this.Config = Config;
    }

    /**
     * Get Number of remaining creatable partitions 
     * @return RemainderPartitions Number of remaining creatable partitions
     */
    public Long getRemainderPartitions() {
        return this.RemainderPartitions;
    }

    /**
     * Set Number of remaining creatable partitions
     * @param RemainderPartitions Number of remaining creatable partitions
     */
    public void setRemainderPartitions(Long RemainderPartitions) {
        this.RemainderPartitions = RemainderPartitions;
    }

    /**
     * Get Number of remaining creatable topics 
     * @return RemainderTopics Number of remaining creatable topics
     */
    public Long getRemainderTopics() {
        return this.RemainderTopics;
    }

    /**
     * Set Number of remaining creatable topics
     * @param RemainderTopics Number of remaining creatable topics
     */
    public void setRemainderTopics(Long RemainderTopics) {
        this.RemainderTopics = RemainderTopics;
    }

    /**
     * Get Number of partitions already created 
     * @return CreatedPartitions Number of partitions already created
     */
    public Long getCreatedPartitions() {
        return this.CreatedPartitions;
    }

    /**
     * Set Number of partitions already created
     * @param CreatedPartitions Number of partitions already created
     */
    public void setCreatedPartitions(Long CreatedPartitions) {
        this.CreatedPartitions = CreatedPartitions;
    }

    /**
     * Get Number of topics already created 
     * @return CreatedTopics Number of topics already created
     */
    public Long getCreatedTopics() {
        return this.CreatedTopics;
    }

    /**
     * Set Number of topics already created
     * @param CreatedTopics Number of topics already created
     */
    public void setCreatedTopics(Long CreatedTopics) {
        this.CreatedTopics = CreatedTopics;
    }

    /**
     * Get Tag array 
     * @return Tags Tag array
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array
     * @param Tags Tag array
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Availability Zone List 
     * @return ZoneIds Availability Zone List
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Availability Zone List
     * @param ZoneIds Availability Zone List
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Specifies the ckafka cluster instance version. 
     * @return Version Specifies the ckafka cluster instance version.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Specifies the ckafka cluster instance version.
     * @param Version Specifies the ckafka cluster instance version.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Maximum number of groups. 
     * @return MaxGroupNum Maximum number of groups.
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set Maximum number of groups.
     * @param MaxGroupNum Maximum number of groups.
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get Sale type. valid values: 0 (standard version), 1 (pro edition). 
     * @return Cvm Sale type. valid values: 0 (standard version), 1 (pro edition).
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set Sale type. valid values: 0 (standard version), 1 (pro edition).
     * @param Cvm Sale type. valid values: 0 (standard version), 1 (pro edition).
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get Instance type. valid values:. 
Specifies the pro edition.    
Standard version.
premium. specifies the advanced edition.
Specifies the serverless version. 
     * @return InstanceType Instance type. valid values:. 
Specifies the pro edition.    
Standard version.
premium. specifies the advanced edition.
Specifies the serverless version.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. valid values:. 
Specifies the pro edition.    
Standard version.
premium. specifies the advanced edition.
Specifies the serverless version.
     * @param InstanceType Instance type. valid values:. 
Specifies the pro edition.    
Standard version.
premium. specifies the advanced edition.
Specifies the serverless version.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL means the policy support for configuring subnets. 
     * @return Features Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL means the policy support for configuring subnets.
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL means the policy support for configuring subnets.
     * @param Features Indicates the characteristics supported by the instance. FEATURE_SUBNET_ACL means the policy support for configuring subnets.
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get Dynamic message retention policy. 
     * @return RetentionTimeConfig Dynamic message retention policy.
     */
    public DynamicRetentionTime getRetentionTimeConfig() {
        return this.RetentionTimeConfig;
    }

    /**
     * Set Dynamic message retention policy.
     * @param RetentionTimeConfig Dynamic message retention policy.
     */
    public void setRetentionTimeConfig(DynamicRetentionTime RetentionTimeConfig) {
        this.RetentionTimeConfig = RetentionTimeConfig;
    }

    /**
     * Get Maximum number of connections. 
     * @return MaxConnection Maximum number of connections.
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set Maximum number of connections.
     * @param MaxConnection Maximum number of connections.
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get Public network bandwidth 
     * @return PublicNetwork Public network bandwidth
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Public network bandwidth
     * @param PublicNetwork Public network bandwidth
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Specifies the deprecated field with no actual meaning. 
     * @return DeleteRouteTimestamp Specifies the deprecated field with no actual meaning.
     */
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set Specifies the deprecated field with no actual meaning.
     * @param DeleteRouteTimestamp Specifies the deprecated field with no actual meaning.
     */
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    /**
     * Get Number of remaining creatable partitions. 
     * @return RemainingPartitions Number of remaining creatable partitions.
     */
    public Long getRemainingPartitions() {
        return this.RemainingPartitions;
    }

    /**
     * Set Number of remaining creatable partitions.
     * @param RemainingPartitions Number of remaining creatable partitions.
     */
    public void setRemainingPartitions(Long RemainingPartitions) {
        this.RemainingPartitions = RemainingPartitions;
    }

    /**
     * Get Number of remaining creatable topics. 
     * @return RemainingTopics Number of remaining creatable topics.
     */
    public Long getRemainingTopics() {
        return this.RemainingTopics;
    }

    /**
     * Set Number of remaining creatable topics.
     * @param RemainingTopics Number of remaining creatable topics.
     */
    public void setRemainingTopics(Long RemainingTopics) {
        this.RemainingTopics = RemainingTopics;
    }

    /**
     * Get Scaling policy for dynamic disk. 
     * @return DynamicDiskConfig Scaling policy for dynamic disk.
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set Scaling policy for dynamic disk.
     * @param DynamicDiskConfig Scaling policy for dynamic disk.
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package. 
     * @return InstanceChargeType Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.
     * @param InstanceChargeType Specifies the instance billing type. POSTPAID_BY_HOUR: hourly billing; PREPAID: annual/monthly package.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Whether to enable the elastic bandwidth allowlist.   
Indicates the allowlist feature with elastic bandwidth enabled.
0: elastic bandwidth allowlist feature is disabled. 
     * @return ElasticBandwidthSwitch Whether to enable the elastic bandwidth allowlist.   
Indicates the allowlist feature with elastic bandwidth enabled.
0: elastic bandwidth allowlist feature is disabled.
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set Whether to enable the elastic bandwidth allowlist.   
Indicates the allowlist feature with elastic bandwidth enabled.
0: elastic bandwidth allowlist feature is disabled.
     * @param ElasticBandwidthSwitch Whether to enable the elastic bandwidth allowlist.   
Indicates the allowlist feature with elastic bandwidth enabled.
0: elastic bandwidth allowlist feature is disabled.
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get Indicates the elastic bandwidth activation status.
1: indicates elastic bandwidth is disabled.
Enable elastic bandwidth.
Enable elastic bandwidth successfully.
33: disabling elastic bandwidth.
Indicates that the elastic bandwidth is successfully disabled.
Enable elastic bandwidth failed.
Bandwidth failure. 
     * @return ElasticBandwidthOpenStatus Indicates the elastic bandwidth activation status.
1: indicates elastic bandwidth is disabled.
Enable elastic bandwidth.
Enable elastic bandwidth successfully.
33: disabling elastic bandwidth.
Indicates that the elastic bandwidth is successfully disabled.
Enable elastic bandwidth failed.
Bandwidth failure.
     */
    public Long getElasticBandwidthOpenStatus() {
        return this.ElasticBandwidthOpenStatus;
    }

    /**
     * Set Indicates the elastic bandwidth activation status.
1: indicates elastic bandwidth is disabled.
Enable elastic bandwidth.
Enable elastic bandwidth successfully.
33: disabling elastic bandwidth.
Indicates that the elastic bandwidth is successfully disabled.
Enable elastic bandwidth failed.
Bandwidth failure.
     * @param ElasticBandwidthOpenStatus Indicates the elastic bandwidth activation status.
1: indicates elastic bandwidth is disabled.
Enable elastic bandwidth.
Enable elastic bandwidth successfully.
33: disabling elastic bandwidth.
Indicates that the elastic bandwidth is successfully disabled.
Enable elastic bandwidth failed.
Bandwidth failure.
     */
    public void setElasticBandwidthOpenStatus(Long ElasticBandwidthOpenStatus) {
        this.ElasticBandwidthOpenStatus = ElasticBandwidthOpenStatus;
    }

    /**
     * Get Cluster type.  
CLOUD_IDC idc cluster.
CLOUD_CVM_SHARE shared cluster.
CLOUD_CVM_YUNTI yunti cvm cluster.
CLOUD_CVM. specifies the cvm cluster.
CLOUD_CDC cdc cluster.
CLOUD_EKS_TSE eks cluster. 
     * @return ClusterType Cluster type.  
CLOUD_IDC idc cluster.
CLOUD_CVM_SHARE shared cluster.
CLOUD_CVM_YUNTI yunti cvm cluster.
CLOUD_CVM. specifies the cvm cluster.
CLOUD_CDC cdc cluster.
CLOUD_EKS_TSE eks cluster.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type.  
CLOUD_IDC idc cluster.
CLOUD_CVM_SHARE shared cluster.
CLOUD_CVM_YUNTI yunti cvm cluster.
CLOUD_CVM. specifies the cvm cluster.
CLOUD_CDC cdc cluster.
CLOUD_EKS_TSE eks cluster.
     * @param ClusterType Cluster type.  
CLOUD_IDC idc cluster.
CLOUD_CVM_SHARE shared cluster.
CLOUD_CVM_YUNTI yunti cvm cluster.
CLOUD_CVM. specifies the cvm cluster.
CLOUD_CDC cdc cluster.
CLOUD_EKS_TSE eks cluster.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Number of free partitions. 
     * @return FreePartitionNumber Number of free partitions.
     */
    public Long getFreePartitionNumber() {
        return this.FreePartitionNumber;
    }

    /**
     * Set Number of free partitions.
     * @param FreePartitionNumber Number of free partitions.
     */
    public void setFreePartitionNumber(Long FreePartitionNumber) {
        this.FreePartitionNumber = FreePartitionNumber;
    }

    /**
     * Get Specifies the elastic bandwidth upper limit. 
     * @return ElasticFloatBandwidth Specifies the elastic bandwidth upper limit.
     */
    public Long getElasticFloatBandwidth() {
        return this.ElasticFloatBandwidth;
    }

    /**
     * Set Specifies the elastic bandwidth upper limit.
     * @param ElasticFloatBandwidth Specifies the elastic bandwidth upper limit.
     */
    public void setElasticFloatBandwidth(Long ElasticFloatBandwidth) {
        this.ElasticFloatBandwidth = ElasticFloatBandwidth;
    }

    /**
     * Get ssl custom certificate id. only returned for instance clusters with custom certificates. 
     * @return CustomCertId ssl custom certificate id. only returned for instance clusters with custom certificates.
     */
    public String getCustomCertId() {
        return this.CustomCertId;
    }

    /**
     * Set ssl custom certificate id. only returned for instance clusters with custom certificates.
     * @param CustomCertId ssl custom certificate id. only returned for instance clusters with custom certificates.
     */
    public void setCustomCertId(String CustomCertId) {
        this.CustomCertId = CustomCertId;
    }

    /**
     * Get Default unclean.leader.election.enable configuration for cluster topic: 1 enable 0 disable. 
     * @return UncleanLeaderElectionEnable Default unclean.leader.election.enable configuration for cluster topic: 1 enable 0 disable.
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set Default unclean.leader.election.enable configuration for cluster topic: 1 enable 0 disable.
     * @param UncleanLeaderElectionEnable Default unclean.leader.election.enable configuration for cluster topic: 1 enable 0 disable.
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Instance deletion protection switch. 1: enabled; 0: disabled. 
     * @return DeleteProtectionEnable Instance deletion protection switch. 1: enabled; 0: disabled.
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set Instance deletion protection switch. 1: enabled; 0: disabled.
     * @param DeleteProtectionEnable Instance deletion protection switch. 1: enabled; 0: disabled.
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

