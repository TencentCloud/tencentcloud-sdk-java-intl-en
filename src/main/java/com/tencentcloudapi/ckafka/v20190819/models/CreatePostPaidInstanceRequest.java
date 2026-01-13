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
    * <p>VPC Id, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> api.</p>.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> api.</p>.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <P>Specifies the cluster instance name of ckafka, with a length not exceeding 128 arbitrary characters.</p>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <P>The default maximum retention time for instance logs, in minutes. default value: 1440 minutes (1 day) when this parameter is not input. maximum: 30 days. if the message retention time is explicitly set for a topic, the topic retention time takes precedence.</p>.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>Specifies the cluster Id when creating an instance. input this parameter to indicate the cluster Id. leave it empty if no cluster is specified.</p>.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <P>Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value is "2.4.1". "2.4.1" and "2.4.2" belong to the same version, any one can be passed.</p>.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <P>Instance type. "standard": standard version, "profession": professional version. (standard version is only supported on the international site. chinese site currently supports professional version)</p>.
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * <p>Specifies the instance disk type for pro edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>The peak bandwidth of the instance private network. the default value is 40 MB/s. for standard edition, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configurations such as peak bandwidth and number of partitions should meet the billing specification of the pro edition. you can view the billing specification through the following link: https://www.tencentcloud.com/document/product/597/11745.?from_cn_redirect=1</p>.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <P>Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link to view billing specifications: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1</p>.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <P>Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1</p>.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <P>Specifies the maximum number of topics for the instance, which should meet the billing specification of the current instance. default value is 800. step length is set to 100.</p>.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Specifies the availability zone where the instance is located. when creating a multi-az instance, this parameter indicates the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <P>Specifies whether the current instance is a multi-az instance.</p>.
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * <p>Specifies the multi-availability zone id list when the instance is a multi-az instance. note the corresponding multi-availability zone for parameter ZoneId must be included in the parameter array. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.</p>.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>Public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. ensure the input parameter is a multiple of 3.</p>.
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * <p>Tag.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <P>Specifies the elastic bandwidth switch. 0: disable (default); 1: enable.</p>.
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.com/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
    */
    @SerializedName("CustomSSLCertId")
    @Expose
    private String CustomSSLCertId;

    /**
     * Get <p>VPC Id, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> api.</p>. 
     * @return VpcId <p>VPC Id, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> api.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC Id, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> api.</p>.
     * @param VpcId <p>VPC Id, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> api.</p>.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> api.</p>. 
     * @return SubnetId <p>Subnet Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> api.</p>.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> api.</p>.
     * @param SubnetId <p>Subnet Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> api.</p>.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <P>Specifies the cluster instance name of ckafka, with a length not exceeding 128 arbitrary characters.</p>. 
     * @return InstanceName <P>Specifies the cluster instance name of ckafka, with a length not exceeding 128 arbitrary characters.</p>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <P>Specifies the cluster instance name of ckafka, with a length not exceeding 128 arbitrary characters.</p>.
     * @param InstanceName <P>Specifies the cluster instance name of ckafka, with a length not exceeding 128 arbitrary characters.</p>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>. 
     * @return InstanceType <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>.
     * @param InstanceType <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <P>The default maximum retention time for instance logs, in minutes. default value: 1440 minutes (1 day) when this parameter is not input. maximum: 30 days. if the message retention time is explicitly set for a topic, the topic retention time takes precedence.</p>. 
     * @return MsgRetentionTime <P>The default maximum retention time for instance logs, in minutes. default value: 1440 minutes (1 day) when this parameter is not input. maximum: 30 days. if the message retention time is explicitly set for a topic, the topic retention time takes precedence.</p>.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <P>The default maximum retention time for instance logs, in minutes. default value: 1440 minutes (1 day) when this parameter is not input. maximum: 30 days. if the message retention time is explicitly set for a topic, the topic retention time takes precedence.</p>.
     * @param MsgRetentionTime <P>The default maximum retention time for instance logs, in minutes. default value: 1440 minutes (1 day) when this parameter is not input. maximum: 30 days. if the message retention time is explicitly set for a topic, the topic retention time takes precedence.</p>.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>Specifies the cluster Id when creating an instance. input this parameter to indicate the cluster Id. leave it empty if no cluster is specified.</p>. 
     * @return ClusterId <p>Specifies the cluster Id when creating an instance. input this parameter to indicate the cluster Id. leave it empty if no cluster is specified.</p>.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Specifies the cluster Id when creating an instance. input this parameter to indicate the cluster Id. leave it empty if no cluster is specified.</p>.
     * @param ClusterId <p>Specifies the cluster Id when creating an instance. input this parameter to indicate the cluster Id. leave it empty if no cluster is specified.</p>.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <P>Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value is "2.4.1". "2.4.1" and "2.4.2" belong to the same version, any one can be passed.</p>. 
     * @return KafkaVersion <P>Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value is "2.4.1". "2.4.1" and "2.4.2" belong to the same version, any one can be passed.</p>.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <P>Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value is "2.4.1". "2.4.1" and "2.4.2" belong to the same version, any one can be passed.</p>.
     * @param KafkaVersion <P>Instance version. currently supports "2.4.1", "2.4.2", "2.8.1", "3.2.3". default value is "2.4.1". "2.4.1" and "2.4.2" belong to the same version, any one can be passed.</p>.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <P>Instance type. "standard": standard version, "profession": professional version. (standard version is only supported on the international site. chinese site currently supports professional version)</p>. 
     * @return SpecificationsType <P>Instance type. "standard": standard version, "profession": professional version. (standard version is only supported on the international site. chinese site currently supports professional version)</p>.
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set <P>Instance type. "standard": standard version, "profession": professional version. (standard version is only supported on the international site. chinese site currently supports professional version)</p>.
     * @param SpecificationsType <P>Instance type. "standard": standard version, "profession": professional version. (standard version is only supported on the international site. chinese site currently supports professional version)</p>.
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get <p>Specifies the instance disk type for pro edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>. 
     * @return DiskType <p>Specifies the instance disk type for pro edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Specifies the instance disk type for pro edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     * @param DiskType <p>Specifies the instance disk type for pro edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>The peak bandwidth of the instance private network. the default value is 40 MB/s. for standard edition, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configurations such as peak bandwidth and number of partitions should meet the billing specification of the pro edition. you can view the billing specification through the following link: https://www.tencentcloud.com/document/product/597/11745.?from_cn_redirect=1</p>. 
     * @return BandWidth <p>The peak bandwidth of the instance private network. the default value is 40 MB/s. for standard edition, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configurations such as peak bandwidth and number of partitions should meet the billing specification of the pro edition. you can view the billing specification through the following link: https://www.tencentcloud.com/document/product/597/11745.?from_cn_redirect=1</p>.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>The peak bandwidth of the instance private network. the default value is 40 MB/s. for standard edition, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configurations such as peak bandwidth and number of partitions should meet the billing specification of the pro edition. you can view the billing specification through the following link: https://www.tencentcloud.com/document/product/597/11745.?from_cn_redirect=1</p>.
     * @param BandWidth <p>The peak bandwidth of the instance private network. the default value is 40 MB/s. for standard edition, input the peak bandwidth corresponding to the current instance specifications. note that if the instance created is a pro edition instance, parameter configurations such as peak bandwidth and number of partitions should meet the billing specification of the pro edition. you can view the billing specification through the following link: https://www.tencentcloud.com/document/product/597/11745.?from_cn_redirect=1</p>.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <P>Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link to view billing specifications: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1</p>. 
     * @return DiskSize <P>Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link to view billing specifications: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1</p>.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <P>Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link to view billing specifications: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1</p>.
     * @param DiskSize <P>Instance disk size. default value is 500. step length is set to 100. should meet the billing specification of the current instance. can be accessed through the following link to view billing specifications: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1</p>.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <P>Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1</p>. 
     * @return Partition <P>Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1</p>.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <P>Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1</p>.
     * @param Partition <P>Specifies the maximum number of partitions for the instance, which should meet the billing specification of the current instance. default value is 800 with a step length of 100. the billing specification can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1</p>.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <P>Specifies the maximum number of topics for the instance, which should meet the billing specification of the current instance. default value is 800. step length is set to 100.</p>. 
     * @return TopicNum <P>Specifies the maximum number of topics for the instance, which should meet the billing specification of the current instance. default value is 800. step length is set to 100.</p>.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <P>Specifies the maximum number of topics for the instance, which should meet the billing specification of the current instance. default value is 800. step length is set to 100.</p>.
     * @param TopicNum <P>Specifies the maximum number of topics for the instance, which should meet the billing specification of the current instance. default value is 800. step length is set to 100.</p>.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Specifies the availability zone where the instance is located. when creating a multi-az instance, this parameter indicates the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>. 
     * @return ZoneId Specifies the availability zone where the instance is located. when creating a multi-az instance, this parameter indicates the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the availability zone where the instance is located. when creating a multi-az instance, this parameter indicates the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.
     * @param ZoneId Specifies the availability zone where the instance is located. when creating a multi-az instance, this parameter indicates the availability zone id of the subnet where the default access point is created. ZoneId and ZoneIds cannot be empty at the same time. you can obtain this information through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <P>Specifies whether the current instance is a multi-az instance.</p>. 
     * @return MultiZoneFlag <P>Specifies whether the current instance is a multi-az instance.</p>.
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set <P>Specifies whether the current instance is a multi-az instance.</p>.
     * @param MultiZoneFlag <P>Specifies whether the current instance is a multi-az instance.</p>.
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get <p>Specifies the multi-availability zone id list when the instance is a multi-az instance. note the corresponding multi-availability zone for parameter ZoneId must be included in the parameter array. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.</p>. 
     * @return ZoneIds <p>Specifies the multi-availability zone id list when the instance is a multi-az instance. note the corresponding multi-availability zone for parameter ZoneId must be included in the parameter array. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.</p>.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Specifies the multi-availability zone id list when the instance is a multi-az instance. note the corresponding multi-availability zone for parameter ZoneId must be included in the parameter array. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.</p>.
     * @param ZoneIds <p>Specifies the multi-availability zone id list when the instance is a multi-az instance. note the corresponding multi-availability zone for parameter ZoneId must be included in the parameter array. ZoneId and ZoneIds cannot be empty at the same time. obtain through the API <a href="https://www.tencentcloud.com/document/product/597/55246?from_cn_redirect=1">DescribeCkafkaZone</a>.</p>.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>. 
     * @return InstanceNum <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>.
     * @param InstanceNum <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>Public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. ensure the input parameter is a multiple of 3.</p>. 
     * @return PublicNetworkMonthly <p>Public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. ensure the input parameter is a multiple of 3.</p>.
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set <p>Public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. ensure the input parameter is a multiple of 3.</p>.
     * @param PublicNetworkMonthly <p>Public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. ensure the input parameter is a multiple of 3.</p>.
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    /**
     * Get <p>Tag.</p>. 
     * @return Tags <p>Tag.</p>.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>.
     * @param Tags <p>Tag.</p>.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <P>Specifies the elastic bandwidth switch. 0: disable (default); 1: enable.</p>. 
     * @return ElasticBandwidthSwitch <P>Specifies the elastic bandwidth switch. 0: disable (default); 1: enable.</p>.
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <P>Specifies the elastic bandwidth switch. 0: disable (default); 1: enable.</p>.
     * @param ElasticBandwidthSwitch <P>Specifies the elastic bandwidth switch. 0: disable (default); 1: enable.</p>.
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.com/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>. 
     * @return CustomSSLCertId <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.com/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     */
    public String getCustomSSLCertId() {
        return this.CustomSSLCertId;
    }

    /**
     * Set <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.com/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     * @param CustomSSLCertId <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.com/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     */
    public void setCustomSSLCertId(String CustomSSLCertId) {
        this.CustomSSLCertId = CustomSSLCertId;
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
        if (source.CustomSSLCertId != null) {
            this.CustomSSLCertId = new String(source.CustomSSLCertId);
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
        this.setParamSimple(map, prefix + "CustomSSLCertId", this.CustomSSLCertId);

    }
}

