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
    * VPC Id, obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet Id. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Specifies the cluster instance name of ckafka, an arbitrary character with length not exceeding 128.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.
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
    * Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value "2.4.1". "2.4.1" and "2.4.2" belong to the same version. any one can be passed.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Instance type. "standard": standard version. "profession": pro edition. (standard version is only supported on the international site. currently, the chinese site supports pro edition.).
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * Specifies the disk type for a pro edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specifies the peak bandwidth of the instance private network, with a default value of 40 MB/s. for standard version, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configuration such as peak bandwidth and number of partitions should meet the billing specification of the professional edition. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Maximum number of topics for the instance should meet the billing specification of the current instance. default value is 800, step length is set to 100.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Specifies the availability zone of the instance. when creating a multi-az instance, this parameter is the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
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
    * Specifies the multi-az id list when the instance is a multi-az instance. note that the multi-az corresponding to parameter ZoneId must be included in this parameter array. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1) api.
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
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Elastic bandwidth switch. valid values: 0 (disable, default), 1 (enable).
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
     * Get VPC Id, obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1). 
     * @return VpcId VPC Id, obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id, obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     * @param VpcId VPC Id, obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/215/15778?from_cn_redirect=1).
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet Id. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api. 
     * @return SubnetId Subnet Id. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet Id. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     * @param SubnetId Subnet Id. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Specifies the cluster instance name of ckafka, an arbitrary character with length not exceeding 128. 
     * @return InstanceName Specifies the cluster instance name of ckafka, an arbitrary character with length not exceeding 128.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the cluster instance name of ckafka, an arbitrary character with length not exceeding 128.
     * @param InstanceName Specifies the cluster instance name of ckafka, an arbitrary character with length not exceeding 128.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8. 
     * @return InstanceType Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.
     * @param InstanceType Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.
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
     * Get Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value "2.4.1". "2.4.1" and "2.4.2" belong to the same version. any one can be passed. 
     * @return KafkaVersion Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value "2.4.1". "2.4.1" and "2.4.2" belong to the same version. any one can be passed.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value "2.4.1". "2.4.1" and "2.4.2" belong to the same version. any one can be passed.
     * @param KafkaVersion Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value "2.4.1". "2.4.1" and "2.4.2" belong to the same version. any one can be passed.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Instance type. "standard": standard version. "profession": pro edition. (standard version is only supported on the international site. currently, the chinese site supports pro edition.). 
     * @return SpecificationsType Instance type. "standard": standard version. "profession": pro edition. (standard version is only supported on the international site. currently, the chinese site supports pro edition.).
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set Instance type. "standard": standard version. "profession": pro edition. (standard version is only supported on the international site. currently, the chinese site supports pro edition.).
     * @param SpecificationsType Instance type. "standard": standard version. "profession": pro edition. (standard version is only supported on the international site. currently, the chinese site supports pro edition.).
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get Specifies the disk type for a pro edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC". 
     * @return DiskType Specifies the disk type for a pro edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Specifies the disk type for a pro edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     * @param DiskType Specifies the disk type for a pro edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specifies the peak bandwidth of the instance private network, with a default value of 40 MB/s. for standard version, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configuration such as peak bandwidth and number of partitions should meet the billing specification of the professional edition. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1 
     * @return BandWidth Specifies the peak bandwidth of the instance private network, with a default value of 40 MB/s. for standard version, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configuration such as peak bandwidth and number of partitions should meet the billing specification of the professional edition. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Specifies the peak bandwidth of the instance private network, with a default value of 40 MB/s. for standard version, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configuration such as peak bandwidth and number of partitions should meet the billing specification of the professional edition. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     * @param BandWidth Specifies the peak bandwidth of the instance private network, with a default value of 40 MB/s. for standard version, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configuration such as peak bandwidth and number of partitions should meet the billing specification of the professional edition. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1 
     * @return DiskSize Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     * @param DiskSize Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1 
     * @return Partition Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     * @param Partition Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Maximum number of topics for the instance should meet the billing specification of the current instance. default value is 800, step length is set to 100. 
     * @return TopicNum Maximum number of topics for the instance should meet the billing specification of the current instance. default value is 800, step length is set to 100.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Maximum number of topics for the instance should meet the billing specification of the current instance. default value is 800, step length is set to 100.
     * @param TopicNum Maximum number of topics for the instance should meet the billing specification of the current instance. default value is 800, step length is set to 100.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Specifies the availability zone of the instance. when creating a multi-az instance, this parameter is the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1). 
     * @return ZoneId Specifies the availability zone of the instance. when creating a multi-az instance, this parameter is the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the availability zone of the instance. when creating a multi-az instance, this parameter is the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
     * @param ZoneId Specifies the availability zone of the instance. when creating a multi-az instance, this parameter is the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
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
     * Get Specifies the multi-az id list when the instance is a multi-az instance. note that the multi-az corresponding to parameter ZoneId must be included in this parameter array. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1) api. 
     * @return ZoneIds Specifies the multi-az id list when the instance is a multi-az instance. note that the multi-az corresponding to parameter ZoneId must be included in this parameter array. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1) api.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Specifies the multi-az id list when the instance is a multi-az instance. note that the multi-az corresponding to parameter ZoneId must be included in this parameter array. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1) api.
     * @param ZoneIds Specifies the multi-az id list when the instance is a multi-az instance. note that the multi-az corresponding to parameter ZoneId must be included in this parameter array. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the [DescribeCkafkaZone](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1) api.
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

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Elastic bandwidth switch. valid values: 0 (disable, default), 1 (enable). 
     * @return ElasticBandwidthSwitch Elastic bandwidth switch. valid values: 0 (disable, default), 1 (enable).
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set Elastic bandwidth switch. valid values: 0 (disable, default), 1 (enable).
     * @param ElasticBandwidthSwitch Elastic bandwidth switch. valid values: 0 (disable, default), 1 (enable).
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    public CreatePostPaidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePostPaidInstanceRequest(CreatePostPaidInstanceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ElasticBandwidthSwitch != null) {
            this.ElasticBandwidthSwitch = new Long(source.ElasticBandwidthSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);

    }
}

