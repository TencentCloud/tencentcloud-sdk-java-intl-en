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

public class CreatePostPaidInstanceRequest extends AbstractModel {

    /**
    * Instance name, which is a string of up to 64 letters, digits, and hyphens (-). It must start with a letter.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * ID of the VPC where the default access point of the created instance resides.  This parameter is required as instances cannot be created in the classic network currently.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet  where the default access point of the created instance resides.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance specification.  This parameter is required for a Standard Edition instance but not for a Pro Edition instance.  Valid values:  `1` (Small),  `2` (Standard),  `3` (Advanced),  `4` (Large),  `5` (Xlarge L1),  `6` (Xlarge L2),  `7` (Xlarge L3),  `8` (Xlarge L4),  
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * The maximum instance log retention period in minutes by default.  If this parameter is left empty, the default retention period is 1,440 minutes (1 day) to 30 days.  If the message retention period of the topic is explicitly set, it will prevail.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * Cluster ID, which can be selected when you create an instance.  You don’t need to pass in this parameter if the cluster where the instance resides is not specified.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Instance version.  Valid values: `0.10.2`, `1.1.1`, `2.4.2`, and `2.8.1`.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Instance type. `standard` (Standard Edition),  `profession`  (Pro Edition)
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * Instance disk type.  `CLOUD_BASIC` (Premium Cloud Storage),  `CLOUD_SSD` (SSD).  If this parameter is left empty, the default value `CLOUD_BASIC` will be used.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Private network peak bandwidth of an instance  in MB/sec.  If you create a Standard Edition instance, pass in the corresponding peak bandwidth for the current instance specification.  If you create a Pro Edition instance, configure the peak bandwidth, partition count, and other parameters as required by Pro Edition.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Instance disk size, which must meet the requirement of the instance’s specification.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * The maximum number of partitions of the instance, which must meet the requirement of the instance’s specification.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * The maximum number of topics of the instance, which must meet the requirement of the instance’s specification.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * AZ of the instance.  When a multi-AZ instance is created, the value of this parameter is the AZ ID of the subnet where the instance’s default access point resides.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Whether the current instance is a multi-AZ instance
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * This parameter indicates the list of AZ IDs when the instance is deployed in multiple AZs.  Note that `ZoneId` must be included in the array of this parameter.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * The number of purchased instances.  Default value: `1`. This parameter is optional.  If it is passed in, multiple instances will be created, with their names being `instanceName` plus different suffixes.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Public network bandwidth in Mbps.  The 3 Mbps of free bandwidth is not included here by default.  For example, if you need 3 Mbps of public network bandwidth, pass in `0`; if you need 6 Mbps, pass in `3`.  The value must be an integer multiple of 3.
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
     * Get Instance name, which is a string of up to 64 letters, digits, and hyphens (-). It must start with a letter. 
     * @return InstanceName Instance name, which is a string of up to 64 letters, digits, and hyphens (-). It must start with a letter.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which is a string of up to 64 letters, digits, and hyphens (-). It must start with a letter.
     * @param InstanceName Instance name, which is a string of up to 64 letters, digits, and hyphens (-). It must start with a letter.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get ID of the VPC where the default access point of the created instance resides.  This parameter is required as instances cannot be created in the classic network currently. 
     * @return VpcId ID of the VPC where the default access point of the created instance resides.  This parameter is required as instances cannot be created in the classic network currently.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC where the default access point of the created instance resides.  This parameter is required as instances cannot be created in the classic network currently.
     * @param VpcId ID of the VPC where the default access point of the created instance resides.  This parameter is required as instances cannot be created in the classic network currently.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet  where the default access point of the created instance resides. 
     * @return SubnetId ID of the subnet  where the default access point of the created instance resides.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet  where the default access point of the created instance resides.
     * @param SubnetId ID of the subnet  where the default access point of the created instance resides.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance specification.  This parameter is required for a Standard Edition instance but not for a Pro Edition instance.  Valid values:  `1` (Small),  `2` (Standard),  `3` (Advanced),  `4` (Large),  `5` (Xlarge L1),  `6` (Xlarge L2),  `7` (Xlarge L3),  `8` (Xlarge L4),   
     * @return InstanceType Instance specification.  This parameter is required for a Standard Edition instance but not for a Pro Edition instance.  Valid values:  `1` (Small),  `2` (Standard),  `3` (Advanced),  `4` (Large),  `5` (Xlarge L1),  `6` (Xlarge L2),  `7` (Xlarge L3),  `8` (Xlarge L4),  
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance specification.  This parameter is required for a Standard Edition instance but not for a Pro Edition instance.  Valid values:  `1` (Small),  `2` (Standard),  `3` (Advanced),  `4` (Large),  `5` (Xlarge L1),  `6` (Xlarge L2),  `7` (Xlarge L3),  `8` (Xlarge L4),  
     * @param InstanceType Instance specification.  This parameter is required for a Standard Edition instance but not for a Pro Edition instance.  Valid values:  `1` (Small),  `2` (Standard),  `3` (Advanced),  `4` (Large),  `5` (Xlarge L1),  `6` (Xlarge L2),  `7` (Xlarge L3),  `8` (Xlarge L4),  
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The maximum instance log retention period in minutes by default.  If this parameter is left empty, the default retention period is 1,440 minutes (1 day) to 30 days.  If the message retention period of the topic is explicitly set, it will prevail. 
     * @return MsgRetentionTime The maximum instance log retention period in minutes by default.  If this parameter is left empty, the default retention period is 1,440 minutes (1 day) to 30 days.  If the message retention period of the topic is explicitly set, it will prevail.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set The maximum instance log retention period in minutes by default.  If this parameter is left empty, the default retention period is 1,440 minutes (1 day) to 30 days.  If the message retention period of the topic is explicitly set, it will prevail.
     * @param MsgRetentionTime The maximum instance log retention period in minutes by default.  If this parameter is left empty, the default retention period is 1,440 minutes (1 day) to 30 days.  If the message retention period of the topic is explicitly set, it will prevail.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get Cluster ID, which can be selected when you create an instance.  You don’t need to pass in this parameter if the cluster where the instance resides is not specified. 
     * @return ClusterId Cluster ID, which can be selected when you create an instance.  You don’t need to pass in this parameter if the cluster where the instance resides is not specified.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which can be selected when you create an instance.  You don’t need to pass in this parameter if the cluster where the instance resides is not specified.
     * @param ClusterId Cluster ID, which can be selected when you create an instance.  You don’t need to pass in this parameter if the cluster where the instance resides is not specified.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance version.  Valid values: `0.10.2`, `1.1.1`, `2.4.2`, and `2.8.1`. 
     * @return KafkaVersion Instance version.  Valid values: `0.10.2`, `1.1.1`, `2.4.2`, and `2.8.1`.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Instance version.  Valid values: `0.10.2`, `1.1.1`, `2.4.2`, and `2.8.1`.
     * @param KafkaVersion Instance version.  Valid values: `0.10.2`, `1.1.1`, `2.4.2`, and `2.8.1`.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Instance type. `standard` (Standard Edition),  `profession`  (Pro Edition) 
     * @return SpecificationsType Instance type. `standard` (Standard Edition),  `profession`  (Pro Edition)
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set Instance type. `standard` (Standard Edition),  `profession`  (Pro Edition)
     * @param SpecificationsType Instance type. `standard` (Standard Edition),  `profession`  (Pro Edition)
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get Instance disk type.  `CLOUD_BASIC` (Premium Cloud Storage),  `CLOUD_SSD` (SSD).  If this parameter is left empty, the default value `CLOUD_BASIC` will be used. 
     * @return DiskType Instance disk type.  `CLOUD_BASIC` (Premium Cloud Storage),  `CLOUD_SSD` (SSD).  If this parameter is left empty, the default value `CLOUD_BASIC` will be used.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Instance disk type.  `CLOUD_BASIC` (Premium Cloud Storage),  `CLOUD_SSD` (SSD).  If this parameter is left empty, the default value `CLOUD_BASIC` will be used.
     * @param DiskType Instance disk type.  `CLOUD_BASIC` (Premium Cloud Storage),  `CLOUD_SSD` (SSD).  If this parameter is left empty, the default value `CLOUD_BASIC` will be used.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Private network peak bandwidth of an instance  in MB/sec.  If you create a Standard Edition instance, pass in the corresponding peak bandwidth for the current instance specification.  If you create a Pro Edition instance, configure the peak bandwidth, partition count, and other parameters as required by Pro Edition. 
     * @return BandWidth Private network peak bandwidth of an instance  in MB/sec.  If you create a Standard Edition instance, pass in the corresponding peak bandwidth for the current instance specification.  If you create a Pro Edition instance, configure the peak bandwidth, partition count, and other parameters as required by Pro Edition.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Private network peak bandwidth of an instance  in MB/sec.  If you create a Standard Edition instance, pass in the corresponding peak bandwidth for the current instance specification.  If you create a Pro Edition instance, configure the peak bandwidth, partition count, and other parameters as required by Pro Edition.
     * @param BandWidth Private network peak bandwidth of an instance  in MB/sec.  If you create a Standard Edition instance, pass in the corresponding peak bandwidth for the current instance specification.  If you create a Pro Edition instance, configure the peak bandwidth, partition count, and other parameters as required by Pro Edition.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Instance disk size, which must meet the requirement of the instance’s specification. 
     * @return DiskSize Instance disk size, which must meet the requirement of the instance’s specification.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Instance disk size, which must meet the requirement of the instance’s specification.
     * @param DiskSize Instance disk size, which must meet the requirement of the instance’s specification.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get The maximum number of partitions of the instance, which must meet the requirement of the instance’s specification. 
     * @return Partition The maximum number of partitions of the instance, which must meet the requirement of the instance’s specification.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set The maximum number of partitions of the instance, which must meet the requirement of the instance’s specification.
     * @param Partition The maximum number of partitions of the instance, which must meet the requirement of the instance’s specification.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get The maximum number of topics of the instance, which must meet the requirement of the instance’s specification. 
     * @return TopicNum The maximum number of topics of the instance, which must meet the requirement of the instance’s specification.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set The maximum number of topics of the instance, which must meet the requirement of the instance’s specification.
     * @param TopicNum The maximum number of topics of the instance, which must meet the requirement of the instance’s specification.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get AZ of the instance.  When a multi-AZ instance is created, the value of this parameter is the AZ ID of the subnet where the instance’s default access point resides. 
     * @return ZoneId AZ of the instance.  When a multi-AZ instance is created, the value of this parameter is the AZ ID of the subnet where the instance’s default access point resides.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ of the instance.  When a multi-AZ instance is created, the value of this parameter is the AZ ID of the subnet where the instance’s default access point resides.
     * @param ZoneId AZ of the instance.  When a multi-AZ instance is created, the value of this parameter is the AZ ID of the subnet where the instance’s default access point resides.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Whether the current instance is a multi-AZ instance 
     * @return MultiZoneFlag Whether the current instance is a multi-AZ instance
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set Whether the current instance is a multi-AZ instance
     * @param MultiZoneFlag Whether the current instance is a multi-AZ instance
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get This parameter indicates the list of AZ IDs when the instance is deployed in multiple AZs.  Note that `ZoneId` must be included in the array of this parameter. 
     * @return ZoneIds This parameter indicates the list of AZ IDs when the instance is deployed in multiple AZs.  Note that `ZoneId` must be included in the array of this parameter.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set This parameter indicates the list of AZ IDs when the instance is deployed in multiple AZs.  Note that `ZoneId` must be included in the array of this parameter.
     * @param ZoneIds This parameter indicates the list of AZ IDs when the instance is deployed in multiple AZs.  Note that `ZoneId` must be included in the array of this parameter.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get The number of purchased instances.  Default value: `1`. This parameter is optional.  If it is passed in, multiple instances will be created, with their names being `instanceName` plus different suffixes. 
     * @return InstanceNum The number of purchased instances.  Default value: `1`. This parameter is optional.  If it is passed in, multiple instances will be created, with their names being `instanceName` plus different suffixes.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set The number of purchased instances.  Default value: `1`. This parameter is optional.  If it is passed in, multiple instances will be created, with their names being `instanceName` plus different suffixes.
     * @param InstanceNum The number of purchased instances.  Default value: `1`. This parameter is optional.  If it is passed in, multiple instances will be created, with their names being `instanceName` plus different suffixes.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Public network bandwidth in Mbps.  The 3 Mbps of free bandwidth is not included here by default.  For example, if you need 3 Mbps of public network bandwidth, pass in `0`; if you need 6 Mbps, pass in `3`.  The value must be an integer multiple of 3. 
     * @return PublicNetworkMonthly Public network bandwidth in Mbps.  The 3 Mbps of free bandwidth is not included here by default.  For example, if you need 3 Mbps of public network bandwidth, pass in `0`; if you need 6 Mbps, pass in `3`.  The value must be an integer multiple of 3.
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set Public network bandwidth in Mbps.  The 3 Mbps of free bandwidth is not included here by default.  For example, if you need 3 Mbps of public network bandwidth, pass in `0`; if you need 6 Mbps, pass in `3`.  The value must be an integer multiple of 3.
     * @param PublicNetworkMonthly Public network bandwidth in Mbps.  The 3 Mbps of free bandwidth is not included here by default.  For example, if you need 3 Mbps of public network bandwidth, pass in `0`; if you need 6 Mbps, pass in `3`.  The value must be an integer multiple of 3.
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    public CreatePostPaidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePostPaidInstanceRequest(CreatePostPaidInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SpecificationsType != null) {
            this.SpecificationsType = new String(source.SpecificationsType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.PublicNetworkMonthly != null) {
            this.PublicNetworkMonthly = new Long(source.PublicNetworkMonthly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SpecificationsType", this.SpecificationsType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "PublicNetworkMonthly", this.PublicNetworkMonthly);

    }
}

