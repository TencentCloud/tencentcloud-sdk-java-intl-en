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

public class InstanceDetail extends AbstractModel{

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
    * Instance VIP information
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance port information
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Virtual IP list
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
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
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * vpcId. If this parameter is empty, it means the basic network
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Whether to renew the instance automatically, which is an int-type enumerated value. 1: yes, 2: no
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Instance status, which is an int-type value. 0: healthy, 1: alarmed, 2: exceptional
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * Instance status information
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Instance expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Whether it is an internal customer. 1: yes
    */
    @SerializedName("IsInternal")
    @Expose
    private Long IsInternal;

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Kafka version information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Cross-AZ
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * CKafka sale type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * CKafka instance type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Disk type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Maximum number of topics for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxTopicNumber")
    @Expose
    private Long MaxTopicNumber;

    /**
    * Maximum number of partitions for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxPartitionNumber")
    @Expose
    private Long MaxPartitionNumber;

    /**
    * Time of scheduled upgrade
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("RebalanceTime")
    @Expose
    private String RebalanceTime;

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
     * Get Instance VIP information 
     * @return Vip Instance VIP information
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance VIP information
     * @param Vip Instance VIP information
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance port information 
     * @return Vport Instance port information
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Instance port information
     * @param Vport Instance port information
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Virtual IP list 
     * @return VipList Virtual IP list
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set Virtual IP list
     * @param VipList Virtual IP list
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed 
     * @return Status Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
     * @param Status Instance status. 0: creating, 1: running, 2: deleting, 5: isolated, -1: creation failed
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
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get vpcId. If this parameter is empty, it means the basic network 
     * @return VpcId vpcId. If this parameter is empty, it means the basic network
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId. If this parameter is empty, it means the basic network
     * @param VpcId vpcId. If this parameter is empty, it means the basic network
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Whether to renew the instance automatically, which is an int-type enumerated value. 1: yes, 2: no 
     * @return RenewFlag Whether to renew the instance automatically, which is an int-type enumerated value. 1: yes, 2: no
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether to renew the instance automatically, which is an int-type enumerated value. 1: yes, 2: no
     * @param RenewFlag Whether to renew the instance automatically, which is an int-type enumerated value. 1: yes, 2: no
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Instance status, which is an int-type value. 0: healthy, 1: alarmed, 2: exceptional 
     * @return Healthy Instance status, which is an int-type value. 0: healthy, 1: alarmed, 2: exceptional
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Instance status, which is an int-type value. 0: healthy, 1: alarmed, 2: exceptional
     * @param Healthy Instance status, which is an int-type value. 0: healthy, 1: alarmed, 2: exceptional
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get Instance status information 
     * @return HealthyMessage Instance status information
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set Instance status information
     * @param HealthyMessage Instance status information
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance expiration time 
     * @return ExpireTime Instance expiration time
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time
     * @param ExpireTime Instance expiration time
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Whether it is an internal customer. 1: yes 
     * @return IsInternal Whether it is an internal customer. 1: yes
     */
    public Long getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set Whether it is an internal customer. 1: yes
     * @param IsInternal Whether it is an internal customer. 1: yes
     */
    public void setIsInternal(Long IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get Number of topics 
     * @return TopicNum Number of topics
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Number of topics
     * @param TopicNum Number of topics
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get CKafka sale type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cvm CKafka sale type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set CKafka sale type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cvm CKafka sale type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get CKafka instance type
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return InstanceType CKafka instance type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set CKafka instance type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param InstanceType CKafka instance type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Disk type
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return DiskType Disk type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param DiskType Disk type
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Maximum number of topics for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return MaxTopicNumber Maximum number of topics for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getMaxTopicNumber() {
        return this.MaxTopicNumber;
    }

    /**
     * Set Maximum number of topics for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param MaxTopicNumber Maximum number of topics for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setMaxTopicNumber(Long MaxTopicNumber) {
        this.MaxTopicNumber = MaxTopicNumber;
    }

    /**
     * Get Maximum number of partitions for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return MaxPartitionNumber Maximum number of partitions for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getMaxPartitionNumber() {
        return this.MaxPartitionNumber;
    }

    /**
     * Set Maximum number of partitions for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param MaxPartitionNumber Maximum number of partitions for the current instance
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setMaxPartitionNumber(Long MaxPartitionNumber) {
        this.MaxPartitionNumber = MaxPartitionNumber;
    }

    /**
     * Get Time of scheduled upgrade
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return RebalanceTime Time of scheduled upgrade
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set Time of scheduled upgrade
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param RebalanceTime Time of scheduled upgrade
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setRebalanceTime(String RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
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
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
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
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Long(source.IsInternal);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.Cvm != null) {
            this.Cvm = new Long(source.Cvm);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.MaxTopicNumber != null) {
            this.MaxTopicNumber = new Long(source.MaxTopicNumber);
        }
        if (source.MaxPartitionNumber != null) {
            this.MaxPartitionNumber = new Long(source.MaxPartitionNumber);
        }
        if (source.RebalanceTime != null) {
            this.RebalanceTime = new String(source.RebalanceTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyMessage", this.HealthyMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Cvm", this.Cvm);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "MaxTopicNumber", this.MaxTopicNumber);
        this.setParamSimple(map, prefix + "MaxPartitionNumber", this.MaxPartitionNumber);
        this.setParamSimple(map, prefix + "RebalanceTime", this.RebalanceTime);

    }
}

