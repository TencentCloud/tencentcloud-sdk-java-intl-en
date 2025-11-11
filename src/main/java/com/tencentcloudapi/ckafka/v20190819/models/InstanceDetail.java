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

public class InstanceDetail extends AbstractModel {

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CKafka cluster instance name.
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
    * Specifies the ckafka cluster instance disk size in gb.
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
    * Instance status. An int-type value will be returned. `0`: Healthy, `1`: Alarmed, `2`: Exceptional
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
    * kafka version information.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Cross-Availability zone.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * ckafka sales type.
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * Specifies the cluster instance type of ckafka.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Specifies the ckafka cluster instance disk type.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Maximum number of topics for current specifications.
    */
    @SerializedName("MaxTopicNumber")
    @Expose
    private Long MaxTopicNumber;

    /**
    * Maximum number of partitions for current specifications.
    */
    @SerializedName("MaxPartitionNumber")
    @Expose
    private Long MaxPartitionNumber;

    /**
    * Scheduled configuration upgrade time.
    */
    @SerializedName("RebalanceTime")
    @Expose
    private String RebalanceTime;

    /**
    * Specifies the number of partitions in the current instance.
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * Specifies the public network bandwidth type of the ckafka cluster instance.
    */
    @SerializedName("PublicNetworkChargeType")
    @Expose
    private String PublicNetworkChargeType;

    /**
    * Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * Specifies the underlying cluster type of the ckafka cluster instance.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Instance feature list.
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

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
     * Get CKafka cluster instance name. 
     * @return InstanceName CKafka cluster instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CKafka cluster instance name.
     * @param InstanceName CKafka cluster instance name.
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
     * Get Specifies the ckafka cluster instance disk size in gb. 
     * @return DiskSize Specifies the ckafka cluster instance disk size in gb.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the ckafka cluster instance disk size in gb.
     * @param DiskSize Specifies the ckafka cluster instance disk size in gb.
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
     * Get Instance status. An int-type value will be returned. `0`: Healthy, `1`: Alarmed, `2`: Exceptional 
     * @return Healthy Instance status. An int-type value will be returned. `0`: Healthy, `1`: Alarmed, `2`: Exceptional
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Instance status. An int-type value will be returned. `0`: Healthy, `1`: Alarmed, `2`: Exceptional
     * @param Healthy Instance status. An int-type value will be returned. `0`: Healthy, `1`: Alarmed, `2`: Exceptional
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
     * Get kafka version information. 
     * @return Version kafka version information.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set kafka version information.
     * @param Version kafka version information.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Cross-Availability zone. 
     * @return ZoneIds Cross-Availability zone.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Cross-Availability zone.
     * @param ZoneIds Cross-Availability zone.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get ckafka sales type. 
     * @return Cvm ckafka sales type.
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set ckafka sales type.
     * @param Cvm ckafka sales type.
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get Specifies the cluster instance type of ckafka. 
     * @return InstanceType Specifies the cluster instance type of ckafka.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the cluster instance type of ckafka.
     * @param InstanceType Specifies the cluster instance type of ckafka.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specifies the ckafka cluster instance disk type. 
     * @return DiskType Specifies the ckafka cluster instance disk type.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Specifies the ckafka cluster instance disk type.
     * @param DiskType Specifies the ckafka cluster instance disk type.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Maximum number of topics for current specifications. 
     * @return MaxTopicNumber Maximum number of topics for current specifications.
     */
    public Long getMaxTopicNumber() {
        return this.MaxTopicNumber;
    }

    /**
     * Set Maximum number of topics for current specifications.
     * @param MaxTopicNumber Maximum number of topics for current specifications.
     */
    public void setMaxTopicNumber(Long MaxTopicNumber) {
        this.MaxTopicNumber = MaxTopicNumber;
    }

    /**
     * Get Maximum number of partitions for current specifications. 
     * @return MaxPartitionNumber Maximum number of partitions for current specifications.
     */
    public Long getMaxPartitionNumber() {
        return this.MaxPartitionNumber;
    }

    /**
     * Set Maximum number of partitions for current specifications.
     * @param MaxPartitionNumber Maximum number of partitions for current specifications.
     */
    public void setMaxPartitionNumber(Long MaxPartitionNumber) {
        this.MaxPartitionNumber = MaxPartitionNumber;
    }

    /**
     * Get Scheduled configuration upgrade time. 
     * @return RebalanceTime Scheduled configuration upgrade time.
     */
    public String getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set Scheduled configuration upgrade time.
     * @param RebalanceTime Scheduled configuration upgrade time.
     */
    public void setRebalanceTime(String RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get Specifies the number of partitions in the current instance. 
     * @return PartitionNumber Specifies the number of partitions in the current instance.
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set Specifies the number of partitions in the current instance.
     * @param PartitionNumber Specifies the number of partitions in the current instance.
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get Specifies the public network bandwidth type of the ckafka cluster instance. 
     * @return PublicNetworkChargeType Specifies the public network bandwidth type of the ckafka cluster instance.
     */
    public String getPublicNetworkChargeType() {
        return this.PublicNetworkChargeType;
    }

    /**
     * Set Specifies the public network bandwidth type of the ckafka cluster instance.
     * @param PublicNetworkChargeType Specifies the public network bandwidth type of the ckafka cluster instance.
     */
    public void setPublicNetworkChargeType(String PublicNetworkChargeType) {
        this.PublicNetworkChargeType = PublicNetworkChargeType;
    }

    /**
     * Get Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. 
     * @return PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     * @param PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Specifies the underlying cluster type of the ckafka cluster instance. 
     * @return ClusterType Specifies the underlying cluster type of the ckafka cluster instance.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Specifies the underlying cluster type of the ckafka cluster instance.
     * @param ClusterType Specifies the underlying cluster type of the ckafka cluster instance.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Instance feature list. 
     * @return Features Instance feature list.
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set Instance feature list.
     * @param Features Instance feature list.
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
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
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
        if (source.PublicNetworkChargeType != null) {
            this.PublicNetworkChargeType = new String(source.PublicNetworkChargeType);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
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
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);
        this.setParamSimple(map, prefix + "PublicNetworkChargeType", this.PublicNetworkChargeType);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);

    }
}

