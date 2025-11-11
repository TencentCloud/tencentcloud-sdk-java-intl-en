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

public class CreateInstancePreRequest extends AbstractModel {

    /**
    * Specifies the ckafka cluster instance Name, an arbitrary string with length no more than 128 characters.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. [view availability zones](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Prepaid purchase duration, such as "1m", exactly one month. value ranges from 1m to 36m.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * Specifies the standard edition instance specification for the international site. currently only the international site standard edition uses the current field to distinguish specifications, while the domestic site standard edition distinguishes specifications by peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * VPC Id.
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
    * Optional. maximum retention time of instance logs, in minutes. default value: 1440 (1 day). value range: 1 minute to 90 days.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * Specifies the cluster Id when creating an instance.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Auto-Renewal tag for prepaid services. valid values: 0 (default state, not set by the user, initial status), 1 (auto-renew), 2 (explicitly no auto-renew, set by the user).
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value 2.4.1. 2.4.1 and 2.4.2 belong to the same version. any can be passed.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Specifies the instance type. valid values: standard (default), profession, premium.
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * Disk size. if it does not match the console specification ratio, the creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Instance bandwidth. default value: 40 MB/s. minimum value: 20 MB/s. maximum value for advanced edition: 360 MB/s. maximum value for pro edition: 100000 MB/s. standard version fixed bandwidth specifications: 40 MB/s, 100 MB/s, 150 MB/s. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Partition size. if it does not match the console specification ratio, creation will fail. default value is 800, step length is 100. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Specifies the disk type for a pro/advanced edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specifies whether to create a cross-az instance. when the current parameter is true, zoneIds is required.
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * Availability zone list. required item when purchasing a multi-availability zone instance.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Public network bandwidth size, in Mbps. the default is no free 3 Mbps bandwidth. for example, for a total of 3 Mbps public network bandwidth, pass 0 here; for a total of 6 Mbps public network bandwidth, pass 3 here. default value is 0. ensure the input parameter is a multiple of 3.
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * Number of instances to purchase. optional. default value is 1. when you input this parameter, it enables the creation of multiple instances with case-sensitive suffixes added to instanceName.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Whether to automatically select a voucher. valid values: 1 (yes), 0 (no). default is 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Elastic bandwidth switch. specifies whether to enable elastic bandwidth. valid values: 0 (not enabled, default), 1 (enabled).
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
     * Get Specifies the ckafka cluster instance Name, an arbitrary string with length no more than 128 characters. 
     * @return InstanceName Specifies the ckafka cluster instance Name, an arbitrary string with length no more than 128 characters.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the ckafka cluster instance Name, an arbitrary string with length no more than 128 characters.
     * @param InstanceName Specifies the ckafka cluster instance Name, an arbitrary string with length no more than 128 characters.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. [view availability zones](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1). 
     * @return ZoneId Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. [view availability zones](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. [view availability zones](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
     * @param ZoneId Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. [view availability zones](https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1).
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Prepaid purchase duration, such as "1m", exactly one month. value ranges from 1m to 36m. 
     * @return Period Prepaid purchase duration, such as "1m", exactly one month. value ranges from 1m to 36m.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set Prepaid purchase duration, such as "1m", exactly one month. value ranges from 1m to 36m.
     * @param Period Prepaid purchase duration, such as "1m", exactly one month. value ranges from 1m to 36m.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
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
     * Get VPC Id. 
     * @return VpcId VPC Id.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id.
     * @param VpcId VPC Id.
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
     * Get Optional. maximum retention time of instance logs, in minutes. default value: 1440 (1 day). value range: 1 minute to 90 days. 
     * @return MsgRetentionTime Optional. maximum retention time of instance logs, in minutes. default value: 1440 (1 day). value range: 1 minute to 90 days.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set Optional. maximum retention time of instance logs, in minutes. default value: 1440 (1 day). value range: 1 minute to 90 days.
     * @param MsgRetentionTime Optional. maximum retention time of instance logs, in minutes. default value: 1440 (1 day). value range: 1 minute to 90 days.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get Specifies the cluster Id when creating an instance. 
     * @return ClusterId Specifies the cluster Id when creating an instance.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Specifies the cluster Id when creating an instance.
     * @param ClusterId Specifies the cluster Id when creating an instance.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Auto-Renewal tag for prepaid services. valid values: 0 (default state, not set by the user, initial status), 1 (auto-renew), 2 (explicitly no auto-renew, set by the user). 
     * @return RenewFlag Auto-Renewal tag for prepaid services. valid values: 0 (default state, not set by the user, initial status), 1 (auto-renew), 2 (explicitly no auto-renew, set by the user).
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-Renewal tag for prepaid services. valid values: 0 (default state, not set by the user, initial status), 1 (auto-renew), 2 (explicitly no auto-renew, set by the user).
     * @param RenewFlag Auto-Renewal tag for prepaid services. valid values: 0 (default state, not set by the user, initial status), 1 (auto-renew), 2 (explicitly no auto-renew, set by the user).
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value 2.4.1. 2.4.1 and 2.4.2 belong to the same version. any can be passed. 
     * @return KafkaVersion Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value 2.4.1. 2.4.1 and 2.4.2 belong to the same version. any can be passed.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value 2.4.1. 2.4.1 and 2.4.2 belong to the same version. any can be passed.
     * @param KafkaVersion Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value 2.4.1. 2.4.1 and 2.4.2 belong to the same version. any can be passed.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Specifies the instance type. valid values: standard (default), profession, premium. 
     * @return SpecificationsType Specifies the instance type. valid values: standard (default), profession, premium.
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set Specifies the instance type. valid values: standard (default), profession, premium.
     * @param SpecificationsType Specifies the instance type. valid values: standard (default), profession, premium.
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get Disk size. if it does not match the console specification ratio, the creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1 
     * @return DiskSize Disk size. if it does not match the console specification ratio, the creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size. if it does not match the console specification ratio, the creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     * @param DiskSize Disk size. if it does not match the console specification ratio, the creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Instance bandwidth. default value: 40 MB/s. minimum value: 20 MB/s. maximum value for advanced edition: 360 MB/s. maximum value for pro edition: 100000 MB/s. standard version fixed bandwidth specifications: 40 MB/s, 100 MB/s, 150 MB/s. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1 
     * @return BandWidth Instance bandwidth. default value: 40 MB/s. minimum value: 20 MB/s. maximum value for advanced edition: 360 MB/s. maximum value for pro edition: 100000 MB/s. standard version fixed bandwidth specifications: 40 MB/s, 100 MB/s, 150 MB/s. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Instance bandwidth. default value: 40 MB/s. minimum value: 20 MB/s. maximum value for advanced edition: 360 MB/s. maximum value for pro edition: 100000 MB/s. standard version fixed bandwidth specifications: 40 MB/s, 100 MB/s, 150 MB/s. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     * @param BandWidth Instance bandwidth. default value: 40 MB/s. minimum value: 20 MB/s. maximum value for advanced edition: 360 MB/s. maximum value for pro edition: 100000 MB/s. standard version fixed bandwidth specifications: 40 MB/s, 100 MB/s, 150 MB/s. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Partition size. if it does not match the console specification ratio, creation will fail. default value is 800, step length is 100. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1 
     * @return Partition Partition size. if it does not match the console specification ratio, creation will fail. default value is 800, step length is 100. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition size. if it does not match the console specification ratio, creation will fail. default value is 800, step length is 100. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     * @param Partition Partition size. if it does not match the console specification ratio, creation will fail. default value is 800, step length is 100. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
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
     * Get Specifies the disk type for a pro/advanced edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC". 
     * @return DiskType Specifies the disk type for a pro/advanced edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Specifies the disk type for a pro/advanced edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     * @param DiskType Specifies the disk type for a pro/advanced edition instance. you do not need to fill it in for a standard edition instance. valid values: "CLOUD_SSD" for SSD CLOUD disk; "CLOUD_BASIC" for high-performance CLOUD block storage. default value: "CLOUD_BASIC".
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specifies whether to create a cross-az instance. when the current parameter is true, zoneIds is required. 
     * @return MultiZoneFlag Specifies whether to create a cross-az instance. when the current parameter is true, zoneIds is required.
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set Specifies whether to create a cross-az instance. when the current parameter is true, zoneIds is required.
     * @param MultiZoneFlag Specifies whether to create a cross-az instance. when the current parameter is true, zoneIds is required.
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get Availability zone list. required item when purchasing a multi-availability zone instance. 
     * @return ZoneIds Availability zone list. required item when purchasing a multi-availability zone instance.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Availability zone list. required item when purchasing a multi-availability zone instance.
     * @param ZoneIds Availability zone list. required item when purchasing a multi-availability zone instance.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Public network bandwidth size, in Mbps. the default is no free 3 Mbps bandwidth. for example, for a total of 3 Mbps public network bandwidth, pass 0 here; for a total of 6 Mbps public network bandwidth, pass 3 here. default value is 0. ensure the input parameter is a multiple of 3. 
     * @return PublicNetworkMonthly Public network bandwidth size, in Mbps. the default is no free 3 Mbps bandwidth. for example, for a total of 3 Mbps public network bandwidth, pass 0 here; for a total of 6 Mbps public network bandwidth, pass 3 here. default value is 0. ensure the input parameter is a multiple of 3.
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set Public network bandwidth size, in Mbps. the default is no free 3 Mbps bandwidth. for example, for a total of 3 Mbps public network bandwidth, pass 0 here; for a total of 6 Mbps public network bandwidth, pass 3 here. default value is 0. ensure the input parameter is a multiple of 3.
     * @param PublicNetworkMonthly Public network bandwidth size, in Mbps. the default is no free 3 Mbps bandwidth. for example, for a total of 3 Mbps public network bandwidth, pass 0 here; for a total of 6 Mbps public network bandwidth, pass 3 here. default value is 0. ensure the input parameter is a multiple of 3.
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    /**
     * Get Number of instances to purchase. optional. default value is 1. when you input this parameter, it enables the creation of multiple instances with case-sensitive suffixes added to instanceName. 
     * @return InstanceNum Number of instances to purchase. optional. default value is 1. when you input this parameter, it enables the creation of multiple instances with case-sensitive suffixes added to instanceName.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of instances to purchase. optional. default value is 1. when you input this parameter, it enables the creation of multiple instances with case-sensitive suffixes added to instanceName.
     * @param InstanceNum Number of instances to purchase. optional. default value is 1. when you input this parameter, it enables the creation of multiple instances with case-sensitive suffixes added to instanceName.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Whether to automatically select a voucher. valid values: 1 (yes), 0 (no). default is 0. 
     * @return AutoVoucher Whether to automatically select a voucher. valid values: 1 (yes), 0 (no). default is 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. valid values: 1 (yes), 0 (no). default is 0.
     * @param AutoVoucher Whether to automatically select a voucher. valid values: 1 (yes), 0 (no). default is 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Elastic bandwidth switch. specifies whether to enable elastic bandwidth. valid values: 0 (not enabled, default), 1 (enabled). 
     * @return ElasticBandwidthSwitch Elastic bandwidth switch. specifies whether to enable elastic bandwidth. valid values: 0 (not enabled, default), 1 (enabled).
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set Elastic bandwidth switch. specifies whether to enable elastic bandwidth. valid values: 0 (not enabled, default), 1 (enabled).
     * @param ElasticBandwidthSwitch Elastic bandwidth switch. specifies whether to enable elastic bandwidth. valid values: 0 (not enabled, default), 1 (enabled).
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    public CreateInstancePreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreRequest(CreateInstancePreRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SpecificationsType != null) {
            this.SpecificationsType = new String(source.SpecificationsType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
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
        if (source.PublicNetworkMonthly != null) {
            this.PublicNetworkMonthly = new Long(source.PublicNetworkMonthly);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ElasticBandwidthSwitch != null) {
            this.ElasticBandwidthSwitch = new Long(source.ElasticBandwidthSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SpecificationsType", this.SpecificationsType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "PublicNetworkMonthly", this.PublicNetworkMonthly);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "ElasticBandwidthSwitch", this.ElasticBandwidthSwitch);

    }
}

