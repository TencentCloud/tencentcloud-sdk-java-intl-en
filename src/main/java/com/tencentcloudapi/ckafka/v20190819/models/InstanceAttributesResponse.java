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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAttributesResponse extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
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
    * Instance status. 0: creating, 1: running, 2: deleting
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
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Kafka version information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Maximum number of groups
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * Sale type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

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
     * Get Instance status. 0: creating, 1: running, 2: deleting 
     * @return Status Instance status. 0: creating, 1: running, 2: deleting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: creating, 1: running, 2: deleting
     * @param Status Instance status. 0: creating, 1: running, 2: deleting
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
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag array
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag array
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Expiration time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneIds Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneIds Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Kafka version information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Version Kafka version information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Kafka version information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Version Kafka version information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Maximum number of groups
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxGroupNum Maximum number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set Maximum number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxGroupNum Maximum number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get Sale type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cvm Sale type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set Sale type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cvm Sale type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
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

    }
}

