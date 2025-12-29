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
    * <p>Specifies the Name of the ckafka cluster instance, which is any string with a length not more than 128 characters.</p>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <P>Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. <a href="https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1">view availability zones</a></p>.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <P>Specifies the prepaid purchase duration, such as "1m" (exactly one month). value ranges from 1m to 36m.</p>.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <P>Specifies the standard edition instance specification for the international site. currently only the standard edition on the international site uses the current field to distinguish specifications, while the domestic site standard edition uses peak bandwidth. fill in 1 for all instances except the international site standard edition. for international site standard edition instances: [entry-level (general)] fill 1; [standard type (standard)] fill 2; [advanced] fill 3; [capacity type (capacity)] fill 4; [advanced type 1 (specialized-1)] fill 5; [advanced type 2 (specialized-2)] fill 6; [advanced type 3 (specialized-3)] fill 7; [advanced type 4 (specialized-4)] fill 8.</p>.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>VPC Id.</p>.
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
    * <P>Optional. specifies the maximum retention time for instance logs, in minutes. default value: 1440 (1 day) when left blank. configurable range: 1 minute to 90 days.</p>.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>Specifies the cluster Id when creating an instance. this parameter indicates the cluster Id.</p>.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <P>Auto-Renewal tag for prepaid services. 0 means default state (not set by the user, i.e. initial state), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user).</p>.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value is 2.4.1. 2.4.1 and 2.4.2 belong to the same version, any one can be passed.</p>.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <P>Instance type. specifies "standard" for standard edition instance (default), "profession" for professional edition instance, "premium" for advanced edition instance.</p>.
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * <P>Disk size. if it does not match the console specification ratio, creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link to view billing specifications: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1</p>.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Instance bandwidth, default value is 40, unit MB/s. minimum value: 20MB/s. advanced edition maximum value: 360MB/s. professional edition maximum value: 100000MB/s. standard version fixed bandwidth specifications: 40MB/s, 100MB/s, 150MB/s. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1</p>.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <P>Specifies the partition size. if it does not match the console specification ratio, the creation cannot succeed. default value is 800 with a step length of 100. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1</p>.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>Tag.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Specifies the instance disk type for pro edition/advanced edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Specifies whether to create a cross-availability zone instance. when the current parameter is true, zoneIds is required.</p>.
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * <P>Availability zone list. required item when purchasing multi-availability zone instance.</p>.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>Specifies the public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. default value: 0. ensure the input parameter is a multiple of 3.</p>.
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
    * <p>Specifies the number of instances to purchase. optional. default value is 1. when input this parameter, it will create multiple instances with case-sensitive suffixes added to instanceName.</p>.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <P>Specifies whether to automatically select voucher. valid values: 1-yes; 0-no. default is 0.</p>.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <P>Elastic bandwidth switch 0 disable 1 enable (0 default).</p>.
    */
    @SerializedName("ElasticBandwidthSwitch")
    @Expose
    private Long ElasticBandwidthSwitch;

    /**
    * <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.comom/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
    */
    @SerializedName("CustomSSLCertId")
    @Expose
    private String CustomSSLCertId;

    /**
     * Get <p>Specifies the Name of the ckafka cluster instance, which is any string with a length not more than 128 characters.</p>. 
     * @return InstanceName <p>Specifies the Name of the ckafka cluster instance, which is any string with a length not more than 128 characters.</p>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Specifies the Name of the ckafka cluster instance, which is any string with a length not more than 128 characters.</p>.
     * @param InstanceName <p>Specifies the Name of the ckafka cluster instance, which is any string with a length not more than 128 characters.</p>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <P>Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. <a href="https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1">view availability zones</a></p>. 
     * @return ZoneId <P>Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. <a href="https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1">view availability zones</a></p>.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <P>Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. <a href="https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1">view availability zones</a></p>.
     * @param ZoneId <P>Availability zone. when purchasing a multi-availability zone instance, this parameter specifies the primary az. <a href="https://www.tencentcloud.comom/document/product/597/55246?from_cn_redirect=1">view availability zones</a></p>.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <P>Specifies the prepaid purchase duration, such as "1m" (exactly one month). value ranges from 1m to 36m.</p>. 
     * @return Period <P>Specifies the prepaid purchase duration, such as "1m" (exactly one month). value ranges from 1m to 36m.</p>.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <P>Specifies the prepaid purchase duration, such as "1m" (exactly one month). value ranges from 1m to 36m.</p>.
     * @param Period <P>Specifies the prepaid purchase duration, such as "1m" (exactly one month). value ranges from 1m to 36m.</p>.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
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
     * Get <p>VPC Id.</p>. 
     * @return VpcId <p>VPC Id.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC Id.</p>.
     * @param VpcId <p>VPC Id.</p>.
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
     * Get <P>Optional. specifies the maximum retention time for instance logs, in minutes. default value: 1440 (1 day) when left blank. configurable range: 1 minute to 90 days.</p>. 
     * @return MsgRetentionTime <P>Optional. specifies the maximum retention time for instance logs, in minutes. default value: 1440 (1 day) when left blank. configurable range: 1 minute to 90 days.</p>.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <P>Optional. specifies the maximum retention time for instance logs, in minutes. default value: 1440 (1 day) when left blank. configurable range: 1 minute to 90 days.</p>.
     * @param MsgRetentionTime <P>Optional. specifies the maximum retention time for instance logs, in minutes. default value: 1440 (1 day) when left blank. configurable range: 1 minute to 90 days.</p>.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>Specifies the cluster Id when creating an instance. this parameter indicates the cluster Id.</p>. 
     * @return ClusterId <p>Specifies the cluster Id when creating an instance. this parameter indicates the cluster Id.</p>.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Specifies the cluster Id when creating an instance. this parameter indicates the cluster Id.</p>.
     * @param ClusterId <p>Specifies the cluster Id when creating an instance. this parameter indicates the cluster Id.</p>.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <P>Auto-Renewal tag for prepaid services. 0 means default state (not set by the user, i.e. initial state), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user).</p>. 
     * @return RenewFlag <P>Auto-Renewal tag for prepaid services. 0 means default state (not set by the user, i.e. initial state), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user).</p>.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <P>Auto-Renewal tag for prepaid services. 0 means default state (not set by the user, i.e. initial state), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user).</p>.
     * @param RenewFlag <P>Auto-Renewal tag for prepaid services. 0 means default state (not set by the user, i.e. initial state), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user).</p>.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value is 2.4.1. 2.4.1 and 2.4.2 belong to the same version, any one can be passed.</p>. 
     * @return KafkaVersion <p>Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value is 2.4.1. 2.4.1 and 2.4.2 belong to the same version, any one can be passed.</p>.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value is 2.4.1. 2.4.1 and 2.4.2 belong to the same version, any one can be passed.</p>.
     * @param KafkaVersion <p>Specifies the CKafka version number. valid values: 2.4.1, 2.4.2, 2.8.1, 3.2.3. default value is 2.4.1. 2.4.1 and 2.4.2 belong to the same version, any one can be passed.</p>.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <P>Instance type. specifies "standard" for standard edition instance (default), "profession" for professional edition instance, "premium" for advanced edition instance.</p>. 
     * @return SpecificationsType <P>Instance type. specifies "standard" for standard edition instance (default), "profession" for professional edition instance, "premium" for advanced edition instance.</p>.
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set <P>Instance type. specifies "standard" for standard edition instance (default), "profession" for professional edition instance, "premium" for advanced edition instance.</p>.
     * @param SpecificationsType <P>Instance type. specifies "standard" for standard edition instance (default), "profession" for professional edition instance, "premium" for advanced edition instance.</p>.
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get <P>Disk size. if it does not match the console specification ratio, creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link to view billing specifications: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1</p>. 
     * @return DiskSize <P>Disk size. if it does not match the console specification ratio, creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link to view billing specifications: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1</p>.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <P>Disk size. if it does not match the console specification ratio, creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link to view billing specifications: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1</p>.
     * @param DiskSize <P>Disk size. if it does not match the console specification ratio, creation cannot succeed. default value is 500. step length is set to 100. can be accessed through the following link to view billing specifications: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1</p>.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Instance bandwidth, default value is 40, unit MB/s. minimum value: 20MB/s. advanced edition maximum value: 360MB/s. professional edition maximum value: 100000MB/s. standard version fixed bandwidth specifications: 40MB/s, 100MB/s, 150MB/s. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1</p>. 
     * @return BandWidth <p>Instance bandwidth, default value is 40, unit MB/s. minimum value: 20MB/s. advanced edition maximum value: 360MB/s. professional edition maximum value: 100000MB/s. standard version fixed bandwidth specifications: 40MB/s, 100MB/s, 150MB/s. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1</p>.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>Instance bandwidth, default value is 40, unit MB/s. minimum value: 20MB/s. advanced edition maximum value: 360MB/s. professional edition maximum value: 100000MB/s. standard version fixed bandwidth specifications: 40MB/s, 100MB/s, 150MB/s. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1</p>.
     * @param BandWidth <p>Instance bandwidth, default value is 40, unit MB/s. minimum value: 20MB/s. advanced edition maximum value: 360MB/s. professional edition maximum value: 100000MB/s. standard version fixed bandwidth specifications: 40MB/s, 100MB/s, 150MB/s. billing specifications can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1</p>.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <P>Specifies the partition size. if it does not match the console specification ratio, the creation cannot succeed. default value is 800 with a step length of 100. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1</p>. 
     * @return Partition <P>Specifies the partition size. if it does not match the console specification ratio, the creation cannot succeed. default value is 800 with a step length of 100. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1</p>.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <P>Specifies the partition size. if it does not match the console specification ratio, the creation cannot succeed. default value is 800 with a step length of 100. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1</p>.
     * @param Partition <P>Specifies the partition size. if it does not match the console specification ratio, the creation cannot succeed. default value is 800 with a step length of 100. view billing specifications through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1</p>.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
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
     * Get <p>Specifies the instance disk type for pro edition/advanced edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>. 
     * @return DiskType <p>Specifies the instance disk type for pro edition/advanced edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Specifies the instance disk type for pro edition/advanced edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     * @param DiskType <p>Specifies the instance disk type for pro edition/advanced edition. standard edition instances do not require this field. valid values: "CLOUD_SSD" (SSD CLOUD disk), "CLOUD_BASIC" (high-performance CLOUD block storage). default value: "CLOUD_BASIC".</p>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Specifies whether to create a cross-availability zone instance. when the current parameter is true, zoneIds is required.</p>. 
     * @return MultiZoneFlag <p>Specifies whether to create a cross-availability zone instance. when the current parameter is true, zoneIds is required.</p>.
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set <p>Specifies whether to create a cross-availability zone instance. when the current parameter is true, zoneIds is required.</p>.
     * @param MultiZoneFlag <p>Specifies whether to create a cross-availability zone instance. when the current parameter is true, zoneIds is required.</p>.
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get <P>Availability zone list. required item when purchasing multi-availability zone instance.</p>. 
     * @return ZoneIds <P>Availability zone list. required item when purchasing multi-availability zone instance.</p>.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <P>Availability zone list. required item when purchasing multi-availability zone instance.</p>.
     * @param ZoneIds <P>Availability zone list. required item when purchasing multi-availability zone instance.</p>.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Specifies the public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. default value: 0. ensure the input parameter is a multiple of 3.</p>. 
     * @return PublicNetworkMonthly <p>Specifies the public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. default value: 0. ensure the input parameter is a multiple of 3.</p>.
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set <p>Specifies the public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. default value: 0. ensure the input parameter is a multiple of 3.</p>.
     * @param PublicNetworkMonthly <p>Specifies the public bandwidth size in Mbps. the free 3 Mbps bandwidth is not included by default. for example, if the total required public network bandwidth is 3 Mbps, input 0 here; if the total required public network bandwidth is 6 Mbps, input 3 here. default value: 0. ensure the input parameter is a multiple of 3.</p>.
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
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
     * Get <P>Specifies whether to automatically select voucher. valid values: 1-yes; 0-no. default is 0.</p>. 
     * @return AutoVoucher <P>Specifies whether to automatically select voucher. valid values: 1-yes; 0-no. default is 0.</p>.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <P>Specifies whether to automatically select voucher. valid values: 1-yes; 0-no. default is 0.</p>.
     * @param AutoVoucher <P>Specifies whether to automatically select voucher. valid values: 1-yes; 0-no. default is 0.</p>.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <P>Elastic bandwidth switch 0 disable 1 enable (0 default).</p>. 
     * @return ElasticBandwidthSwitch <P>Elastic bandwidth switch 0 disable 1 enable (0 default).</p>.
     */
    public Long getElasticBandwidthSwitch() {
        return this.ElasticBandwidthSwitch;
    }

    /**
     * Set <P>Elastic bandwidth switch 0 disable 1 enable (0 default).</p>.
     * @param ElasticBandwidthSwitch <P>Elastic bandwidth switch 0 disable 1 enable (0 default).</p>.
     */
    public void setElasticBandwidthSwitch(Long ElasticBandwidthSwitch) {
        this.ElasticBandwidthSwitch = ElasticBandwidthSwitch;
    }

    /**
     * Get <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.comom/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>. 
     * @return CustomSSLCertId <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.comom/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     */
    public String getCustomSSLCertId() {
        return this.CustomSSLCertId;
    }

    /**
     * Set <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.comom/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     * @param CustomSSLCertId <p>Specifies the custom certificate Id. this parameter is valid only when SpecificationsType is profession. supports custom certificate capacity.</p><p>can be obtained through the <a href="https://www.tencentcloud.comom/document/product/400/41673?from_cn_redirect=1">DescribeCertificateDetail</a> api.</p>.
     */
    public void setCustomSSLCertId(String CustomSSLCertId) {
        this.CustomSSLCertId = CustomSSLCertId;
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
        if (source.CustomSSLCertId != null) {
            this.CustomSSLCertId = new String(source.CustomSSLCertId);
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
        this.setParamSimple(map, prefix + "CustomSSLCertId", this.CustomSSLCertId);

    }
}

