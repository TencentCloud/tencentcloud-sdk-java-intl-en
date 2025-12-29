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
    * <p>ckafka cluster instance Id.</p>.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <P>Specifies the name of the ckafka cluster instance.</p>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <P>Specifies the vip information for accessing the instance.</p>.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <P>Specifies the port information to access the instance.</p>.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>Specifies the virtual IP list.</p>.
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <P>Specifies the instance status. valid values: 0 (creating), 1 (running), 2 (deleting), 3 (deleted), 5 (isolated), 7 (upgrading), -1 (creation failed).</p>.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Specifies the instance bandwidth in Mbps.</p>.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>Specifies the disk size of the ckafka cluster instance, in gb.</p>.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Specifies the available zone ID.</p>.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>vpcId. if empty, indicates a basic network.</p>.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <P>Subnet id.</p>.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <P>Specifies whether to renew the instance. int enumeration value: 1 means auto-renew, 2 means explicitly no auto-renew.</p>.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Specifies the instance status. valid values: 1 (healthy), 2 (alarm), 3 (instance status exception).</p>.
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <P>Specifies the instance status information.</p>.
    */
    @SerializedName("HealthyMessage")
    @Expose
    private String HealthyMessage;

    /**
    * <P>Specifies the instance creation time.</p>.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <P>Specifies the instance expiration time.</p>.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <P>Specifies whether it is an internal customer. a value of 1 indicates an internal customer.</p>.
    */
    @SerializedName("IsInternal")
    @Expose
    private Long IsInternal;

    /**
    * <p>Specifies the number of topics.</p>.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * <P>Specifies the identifier tag.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>kafka version information.</p>.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <P>Specifies the cross-availability zone.</p>.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <P>Specifies the ckafka sales type.</p>.
    */
    @SerializedName("Cvm")
    @Expose
    private Long Cvm;

    /**
    * <P>Specifies the ckafka cluster instance type.</p>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <P>Specifies the disk type of the ckafka cluster instance.</p>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Maximum number of topics for current specifications.</p>.
    */
    @SerializedName("MaxTopicNumber")
    @Expose
    private Long MaxTopicNumber;

    /**
    * <p>Specifies the maximum number of partitions for current specifications.</p>.
    */
    @SerializedName("MaxPartitionNumber")
    @Expose
    private Long MaxPartitionNumber;

    /**
    * <P>Specifies the planned configuration upgrade time.</p>.
    */
    @SerializedName("RebalanceTime")
    @Expose
    private String RebalanceTime;

    /**
    * <P>Current number of partitions of the instance.</p>.
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * <P>Specifies the public network bandwidth type of the ckafka cluster instance.</p>.
    */
    @SerializedName("PublicNetworkChargeType")
    @Expose
    private String PublicNetworkChargeType;

    /**
    * <p>Specifies the public network bandwidth. value range: 3Mbps to 999Mbps. only supported in pro edition.</p>.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <P>Specifies the underlying cluster type of the ckafka cluster instance.</p>.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <P>Specifies the instance feature list.</p>.
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

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
     * Get <P>Specifies the name of the ckafka cluster instance.</p>. 
     * @return InstanceName <P>Specifies the name of the ckafka cluster instance.</p>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <P>Specifies the name of the ckafka cluster instance.</p>.
     * @param InstanceName <P>Specifies the name of the ckafka cluster instance.</p>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <P>Specifies the vip information for accessing the instance.</p>. 
     * @return Vip <P>Specifies the vip information for accessing the instance.</p>.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <P>Specifies the vip information for accessing the instance.</p>.
     * @param Vip <P>Specifies the vip information for accessing the instance.</p>.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <P>Specifies the port information to access the instance.</p>. 
     * @return Vport <P>Specifies the port information to access the instance.</p>.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <P>Specifies the port information to access the instance.</p>.
     * @param Vport <P>Specifies the port information to access the instance.</p>.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Specifies the virtual IP list.</p>. 
     * @return VipList <p>Specifies the virtual IP list.</p>.
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>Specifies the virtual IP list.</p>.
     * @param VipList <p>Specifies the virtual IP list.</p>.
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
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
     * Get <p>Specifies the instance bandwidth in Mbps.</p>. 
     * @return Bandwidth <p>Specifies the instance bandwidth in Mbps.</p>.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>Specifies the instance bandwidth in Mbps.</p>.
     * @param Bandwidth <p>Specifies the instance bandwidth in Mbps.</p>.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>Specifies the disk size of the ckafka cluster instance, in gb.</p>. 
     * @return DiskSize <p>Specifies the disk size of the ckafka cluster instance, in gb.</p>.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Specifies the disk size of the ckafka cluster instance, in gb.</p>.
     * @param DiskSize <p>Specifies the disk size of the ckafka cluster instance, in gb.</p>.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Specifies the available zone ID.</p>. 
     * @return ZoneId <p>Specifies the available zone ID.</p>.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Specifies the available zone ID.</p>.
     * @param ZoneId <p>Specifies the available zone ID.</p>.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>vpcId. if empty, indicates a basic network.</p>. 
     * @return VpcId <p>vpcId. if empty, indicates a basic network.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpcId. if empty, indicates a basic network.</p>.
     * @param VpcId <p>vpcId. if empty, indicates a basic network.</p>.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <P>Subnet id.</p>. 
     * @return SubnetId <P>Subnet id.</p>.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <P>Subnet id.</p>.
     * @param SubnetId <P>Subnet id.</p>.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <P>Specifies whether to renew the instance. int enumeration value: 1 means auto-renew, 2 means explicitly no auto-renew.</p>. 
     * @return RenewFlag <P>Specifies whether to renew the instance. int enumeration value: 1 means auto-renew, 2 means explicitly no auto-renew.</p>.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <P>Specifies whether to renew the instance. int enumeration value: 1 means auto-renew, 2 means explicitly no auto-renew.</p>.
     * @param RenewFlag <P>Specifies whether to renew the instance. int enumeration value: 1 means auto-renew, 2 means explicitly no auto-renew.</p>.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Specifies the instance status. valid values: 1 (healthy), 2 (alarm), 3 (instance status exception).</p>. 
     * @return Healthy <p>Specifies the instance status. valid values: 1 (healthy), 2 (alarm), 3 (instance status exception).</p>.
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <p>Specifies the instance status. valid values: 1 (healthy), 2 (alarm), 3 (instance status exception).</p>.
     * @param Healthy <p>Specifies the instance status. valid values: 1 (healthy), 2 (alarm), 3 (instance status exception).</p>.
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <P>Specifies the instance status information.</p>. 
     * @return HealthyMessage <P>Specifies the instance status information.</p>.
     */
    public String getHealthyMessage() {
        return this.HealthyMessage;
    }

    /**
     * Set <P>Specifies the instance status information.</p>.
     * @param HealthyMessage <P>Specifies the instance status information.</p>.
     */
    public void setHealthyMessage(String HealthyMessage) {
        this.HealthyMessage = HealthyMessage;
    }

    /**
     * Get <P>Specifies the instance creation time.</p>. 
     * @return CreateTime <P>Specifies the instance creation time.</p>.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <P>Specifies the instance creation time.</p>.
     * @param CreateTime <P>Specifies the instance creation time.</p>.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <P>Specifies the instance expiration time.</p>. 
     * @return ExpireTime <P>Specifies the instance expiration time.</p>.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <P>Specifies the instance expiration time.</p>.
     * @param ExpireTime <P>Specifies the instance expiration time.</p>.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <P>Specifies whether it is an internal customer. a value of 1 indicates an internal customer.</p>. 
     * @return IsInternal <P>Specifies whether it is an internal customer. a value of 1 indicates an internal customer.</p>.
     */
    public Long getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set <P>Specifies whether it is an internal customer. a value of 1 indicates an internal customer.</p>.
     * @param IsInternal <P>Specifies whether it is an internal customer. a value of 1 indicates an internal customer.</p>.
     */
    public void setIsInternal(Long IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get <p>Specifies the number of topics.</p>. 
     * @return TopicNum <p>Specifies the number of topics.</p>.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <p>Specifies the number of topics.</p>.
     * @param TopicNum <p>Specifies the number of topics.</p>.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get <P>Specifies the identifier tag.</p>. 
     * @return Tags <P>Specifies the identifier tag.</p>.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <P>Specifies the identifier tag.</p>.
     * @param Tags <P>Specifies the identifier tag.</p>.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>kafka version information.</p>. 
     * @return Version <p>kafka version information.</p>.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>kafka version information.</p>.
     * @param Version <p>kafka version information.</p>.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <P>Specifies the cross-availability zone.</p>. 
     * @return ZoneIds <P>Specifies the cross-availability zone.</p>.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <P>Specifies the cross-availability zone.</p>.
     * @param ZoneIds <P>Specifies the cross-availability zone.</p>.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <P>Specifies the ckafka sales type.</p>. 
     * @return Cvm <P>Specifies the ckafka sales type.</p>.
     */
    public Long getCvm() {
        return this.Cvm;
    }

    /**
     * Set <P>Specifies the ckafka sales type.</p>.
     * @param Cvm <P>Specifies the ckafka sales type.</p>.
     */
    public void setCvm(Long Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get <P>Specifies the ckafka cluster instance type.</p>. 
     * @return InstanceType <P>Specifies the ckafka cluster instance type.</p>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <P>Specifies the ckafka cluster instance type.</p>.
     * @param InstanceType <P>Specifies the ckafka cluster instance type.</p>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <P>Specifies the disk type of the ckafka cluster instance.</p>. 
     * @return DiskType <P>Specifies the disk type of the ckafka cluster instance.</p>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <P>Specifies the disk type of the ckafka cluster instance.</p>.
     * @param DiskType <P>Specifies the disk type of the ckafka cluster instance.</p>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Maximum number of topics for current specifications.</p>. 
     * @return MaxTopicNumber <p>Maximum number of topics for current specifications.</p>.
     */
    public Long getMaxTopicNumber() {
        return this.MaxTopicNumber;
    }

    /**
     * Set <p>Maximum number of topics for current specifications.</p>.
     * @param MaxTopicNumber <p>Maximum number of topics for current specifications.</p>.
     */
    public void setMaxTopicNumber(Long MaxTopicNumber) {
        this.MaxTopicNumber = MaxTopicNumber;
    }

    /**
     * Get <p>Specifies the maximum number of partitions for current specifications.</p>. 
     * @return MaxPartitionNumber <p>Specifies the maximum number of partitions for current specifications.</p>.
     */
    public Long getMaxPartitionNumber() {
        return this.MaxPartitionNumber;
    }

    /**
     * Set <p>Specifies the maximum number of partitions for current specifications.</p>.
     * @param MaxPartitionNumber <p>Specifies the maximum number of partitions for current specifications.</p>.
     */
    public void setMaxPartitionNumber(Long MaxPartitionNumber) {
        this.MaxPartitionNumber = MaxPartitionNumber;
    }

    /**
     * Get <P>Specifies the planned configuration upgrade time.</p>. 
     * @return RebalanceTime <P>Specifies the planned configuration upgrade time.</p>.
     */
    public String getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set <P>Specifies the planned configuration upgrade time.</p>.
     * @param RebalanceTime <P>Specifies the planned configuration upgrade time.</p>.
     */
    public void setRebalanceTime(String RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get <P>Current number of partitions of the instance.</p>. 
     * @return PartitionNumber <P>Current number of partitions of the instance.</p>.
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <P>Current number of partitions of the instance.</p>.
     * @param PartitionNumber <P>Current number of partitions of the instance.</p>.
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get <P>Specifies the public network bandwidth type of the ckafka cluster instance.</p>. 
     * @return PublicNetworkChargeType <P>Specifies the public network bandwidth type of the ckafka cluster instance.</p>.
     */
    public String getPublicNetworkChargeType() {
        return this.PublicNetworkChargeType;
    }

    /**
     * Set <P>Specifies the public network bandwidth type of the ckafka cluster instance.</p>.
     * @param PublicNetworkChargeType <P>Specifies the public network bandwidth type of the ckafka cluster instance.</p>.
     */
    public void setPublicNetworkChargeType(String PublicNetworkChargeType) {
        this.PublicNetworkChargeType = PublicNetworkChargeType;
    }

    /**
     * Get <p>Specifies the public network bandwidth. value range: 3Mbps to 999Mbps. only supported in pro edition.</p>. 
     * @return PublicNetwork <p>Specifies the public network bandwidth. value range: 3Mbps to 999Mbps. only supported in pro edition.</p>.
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>Specifies the public network bandwidth. value range: 3Mbps to 999Mbps. only supported in pro edition.</p>.
     * @param PublicNetwork <p>Specifies the public network bandwidth. value range: 3Mbps to 999Mbps. only supported in pro edition.</p>.
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <P>Specifies the underlying cluster type of the ckafka cluster instance.</p>. 
     * @return ClusterType <P>Specifies the underlying cluster type of the ckafka cluster instance.</p>.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <P>Specifies the underlying cluster type of the ckafka cluster instance.</p>.
     * @param ClusterType <P>Specifies the underlying cluster type of the ckafka cluster instance.</p>.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <P>Specifies the instance feature list.</p>. 
     * @return Features <P>Specifies the instance feature list.</p>.
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <P>Specifies the instance feature list.</p>.
     * @param Features <P>Specifies the instance feature list.</p>.
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

