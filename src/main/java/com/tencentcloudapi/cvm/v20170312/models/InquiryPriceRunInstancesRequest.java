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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRunInstancesRequest extends AbstractModel {

    /**
    * Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project.
 <b>Note: `Placement` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `Placement` prevails.</b>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * [Image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are three types of images: <br/><li>Public images</li><li>Custom images</li><li>Shared images</li><br/>You can obtain the available image IDs in the following ways: <br/><li>For IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.tencentcloud.com/cvm/image/index?rid=1&tab=PUBLIC_IMAGE&imageType=PUBLIC_IMAGE) to query the information. </li><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
 <b>Note: `ImageId` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `ImageId` prevails.</b>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * The instance [billing method](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>POSTPAID_BY_HOUR: Pay-as-you-go on an hourly basis<br>Default value: POSTPAID_BY_HOUR.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`. 
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Instance model. Different instance models specify different resource specifications.
<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, specifies the specific values obtained BY calling the [DescribeInstanceTypeConfig](https://www.tencentcloud.com/document/product/1119/45686?lang=en) api for the latest specification table or referring to [instance specifications](https://www.tencentcloud.com/document/product/213/11518). if not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><br><li>for instances created with the payment mode CDHPAID, indicates this parameter uses the prefix "CDH_" and is generated based on CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * System disk configuration of the instance. If this parameter is not specified, the default value will be used.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Data disk configuration of the instance. If the parameter is not specified, no data disk will be purchased by default. If you want to purchase data disks, you can specify 21 data disks, including up to 1 `LOCAL_BASIC` data disk or `LOCAL_SSD` data disk and up to 20 `CLOUD_BASIC` data disks, `CLOUD_PREMIUM` data disks, or `CLOUD_SSD` data disks.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * VPC configurations (VPC ID, subnet ID, etc). If It's not specified, the classic network will be used by default. If a VPC IP is specified in this parameter, the `InstanceCount` can only be 1.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Configuration of public network bandwidth. If it's not specified, 0 Mbps is used by default.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Number of instances to purchase. Value range: 1 (default) to 100. It cannot exceed the remaining CVM quota of the user. For more information on quota, see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Instance display name. <li>if no instance display name is specified, it will display 'unnamed' by default.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it means generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}`: when purchasing 1 instance, the instance display name is `server_3`; when purchasing 2 instances, the instance display names are `server_3` and `server_4` respectively. supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances without specifying a pattern string, suffixes `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, `server_`: when purchasing 2 instances, the instance display names are `server_1` and `server_2` respectively.</li> <li>supports up to 128 characters (including pattern strings).</li>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance, or keep the original login settings of the image. By default, a random password will be generated and sent to you via the Message Center.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Security group to which an instance belongs. obtain this parameter by calling the `SecurityGroupId` field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808). if not specified, bind the default security group under the designated project. if the default security group does not exist, automatically create it.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.<br>For more information, see Ensuring Idempotency.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Hostname of Cloud Virtual Machine.<br><li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><br><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><br><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 30 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * The tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * The market options of the instance.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * Custom metadata, supports creating key-value pairs of custom metadata when creating a CVM.

**Note: this field is in beta test.**.
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * HPC cluster ID.
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * Information about the CPU topology of an instance. If not specified, it is determined by system resources.
    */
    @SerializedName("CpuTopology")
    @Expose
    private CpuTopology CpuTopology;

    /**
    * 
    */
    @SerializedName("LaunchTemplate")
    @Expose
    private LaunchTemplate LaunchTemplate;

    /**
     * Get Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project.
 <b>Note: `Placement` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `Placement` prevails.</b> 
     * @return Placement Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project.
 <b>Note: `Placement` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `Placement` prevails.</b>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project.
 <b>Note: `Placement` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `Placement` prevails.</b>
     * @param Placement Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project.
 <b>Note: `Placement` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `Placement` prevails.</b>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get [Image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are three types of images: <br/><li>Public images</li><li>Custom images</li><li>Shared images</li><br/>You can obtain the available image IDs in the following ways: <br/><li>For IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.tencentcloud.com/cvm/image/index?rid=1&tab=PUBLIC_IMAGE&imageType=PUBLIC_IMAGE) to query the information. </li><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
 <b>Note: `ImageId` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `ImageId` prevails.</b> 
     * @return ImageId [Image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are three types of images: <br/><li>Public images</li><li>Custom images</li><li>Shared images</li><br/>You can obtain the available image IDs in the following ways: <br/><li>For IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.tencentcloud.com/cvm/image/index?rid=1&tab=PUBLIC_IMAGE&imageType=PUBLIC_IMAGE) to query the information. </li><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
 <b>Note: `ImageId` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `ImageId` prevails.</b>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set [Image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are three types of images: <br/><li>Public images</li><li>Custom images</li><li>Shared images</li><br/>You can obtain the available image IDs in the following ways: <br/><li>For IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.tencentcloud.com/cvm/image/index?rid=1&tab=PUBLIC_IMAGE&imageType=PUBLIC_IMAGE) to query the information. </li><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
 <b>Note: `ImageId` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `ImageId` prevails.</b>
     * @param ImageId [Image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. There are three types of images: <br/><li>Public images</li><li>Custom images</li><li>Shared images</li><br/>You can obtain the available image IDs in the following ways: <br/><li>For IDs of `public images`, `custom images`, and `shared images`, log in to the [CVM console](https://console.tencentcloud.com/cvm/image/index?rid=1&tab=PUBLIC_IMAGE&imageType=PUBLIC_IMAGE) to query the information. </li><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response.</li>
 <b>Note: `ImageId` is required when `LaunchTemplate` is not specified. If both the parameters are passed in, `ImageId` prevails.</b>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get The instance [billing method](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>POSTPAID_BY_HOUR: Pay-as-you-go on an hourly basis<br>Default value: POSTPAID_BY_HOUR. 
     * @return InstanceChargeType The instance [billing method](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>POSTPAID_BY_HOUR: Pay-as-you-go on an hourly basis<br>Default value: POSTPAID_BY_HOUR.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The instance [billing method](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>POSTPAID_BY_HOUR: Pay-as-you-go on an hourly basis<br>Default value: POSTPAID_BY_HOUR.
     * @param InstanceChargeType The instance [billing method](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>POSTPAID_BY_HOUR: Pay-as-you-go on an hourly basis<br>Default value: POSTPAID_BY_HOUR.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.  
     * @return InstanceChargePrepaid Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`. 
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`. 
     * @param InstanceChargePrepaid Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`. 
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Instance model. Different instance models specify different resource specifications.
<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, specifies the specific values obtained BY calling the [DescribeInstanceTypeConfig](https://www.tencentcloud.com/document/product/1119/45686?lang=en) api for the latest specification table or referring to [instance specifications](https://www.tencentcloud.com/document/product/213/11518). if not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><br><li>for instances created with the payment mode CDHPAID, indicates this parameter uses the prefix "CDH_" and is generated based on CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>. 
     * @return InstanceType Instance model. Different instance models specify different resource specifications.
<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, specifies the specific values obtained BY calling the [DescribeInstanceTypeConfig](https://www.tencentcloud.com/document/product/1119/45686?lang=en) api for the latest specification table or referring to [instance specifications](https://www.tencentcloud.com/document/product/213/11518). if not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><br><li>for instances created with the payment mode CDHPAID, indicates this parameter uses the prefix "CDH_" and is generated based on CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Different instance models specify different resource specifications.
<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, specifies the specific values obtained BY calling the [DescribeInstanceTypeConfig](https://www.tencentcloud.com/document/product/1119/45686?lang=en) api for the latest specification table or referring to [instance specifications](https://www.tencentcloud.com/document/product/213/11518). if not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><br><li>for instances created with the payment mode CDHPAID, indicates this parameter uses the prefix "CDH_" and is generated based on CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     * @param InstanceType Instance model. Different instance models specify different resource specifications.
<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, specifies the specific values obtained BY calling the [DescribeInstanceTypeConfig](https://www.tencentcloud.com/document/product/1119/45686?lang=en) api for the latest specification table or referring to [instance specifications](https://www.tencentcloud.com/document/product/213/11518). if not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><br><li>for instances created with the payment mode CDHPAID, indicates this parameter uses the prefix "CDH_" and is generated based on CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get System disk configuration of the instance. If this parameter is not specified, the default value will be used. 
     * @return SystemDisk System disk configuration of the instance. If this parameter is not specified, the default value will be used.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk configuration of the instance. If this parameter is not specified, the default value will be used.
     * @param SystemDisk System disk configuration of the instance. If this parameter is not specified, the default value will be used.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk configuration of the instance. If the parameter is not specified, no data disk will be purchased by default. If you want to purchase data disks, you can specify 21 data disks, including up to 1 `LOCAL_BASIC` data disk or `LOCAL_SSD` data disk and up to 20 `CLOUD_BASIC` data disks, `CLOUD_PREMIUM` data disks, or `CLOUD_SSD` data disks. 
     * @return DataDisks Data disk configuration of the instance. If the parameter is not specified, no data disk will be purchased by default. If you want to purchase data disks, you can specify 21 data disks, including up to 1 `LOCAL_BASIC` data disk or `LOCAL_SSD` data disk and up to 20 `CLOUD_BASIC` data disks, `CLOUD_PREMIUM` data disks, or `CLOUD_SSD` data disks.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk configuration of the instance. If the parameter is not specified, no data disk will be purchased by default. If you want to purchase data disks, you can specify 21 data disks, including up to 1 `LOCAL_BASIC` data disk or `LOCAL_SSD` data disk and up to 20 `CLOUD_BASIC` data disks, `CLOUD_PREMIUM` data disks, or `CLOUD_SSD` data disks.
     * @param DataDisks Data disk configuration of the instance. If the parameter is not specified, no data disk will be purchased by default. If you want to purchase data disks, you can specify 21 data disks, including up to 1 `LOCAL_BASIC` data disk or `LOCAL_SSD` data disk and up to 20 `CLOUD_BASIC` data disks, `CLOUD_PREMIUM` data disks, or `CLOUD_SSD` data disks.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get VPC configurations (VPC ID, subnet ID, etc). If It's not specified, the classic network will be used by default. If a VPC IP is specified in this parameter, the `InstanceCount` can only be 1. 
     * @return VirtualPrivateCloud VPC configurations (VPC ID, subnet ID, etc). If It's not specified, the classic network will be used by default. If a VPC IP is specified in this parameter, the `InstanceCount` can only be 1.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set VPC configurations (VPC ID, subnet ID, etc). If It's not specified, the classic network will be used by default. If a VPC IP is specified in this parameter, the `InstanceCount` can only be 1.
     * @param VirtualPrivateCloud VPC configurations (VPC ID, subnet ID, etc). If It's not specified, the classic network will be used by default. If a VPC IP is specified in this parameter, the `InstanceCount` can only be 1.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get Configuration of public network bandwidth. If it's not specified, 0 Mbps is used by default. 
     * @return InternetAccessible Configuration of public network bandwidth. If it's not specified, 0 Mbps is used by default.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Configuration of public network bandwidth. If it's not specified, 0 Mbps is used by default.
     * @param InternetAccessible Configuration of public network bandwidth. If it's not specified, 0 Mbps is used by default.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Number of instances to purchase. Value range: 1 (default) to 100. It cannot exceed the remaining CVM quota of the user. For more information on quota, see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). 
     * @return InstanceCount Number of instances to purchase. Value range: 1 (default) to 100. It cannot exceed the remaining CVM quota of the user. For more information on quota, see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to purchase. Value range: 1 (default) to 100. It cannot exceed the remaining CVM quota of the user. For more information on quota, see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     * @param InstanceCount Number of instances to purchase. Value range: 1 (default) to 100. It cannot exceed the remaining CVM quota of the user. For more information on quota, see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Instance display name. <li>if no instance display name is specified, it will display 'unnamed' by default.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it means generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}`: when purchasing 1 instance, the instance display name is `server_3`; when purchasing 2 instances, the instance display names are `server_3` and `server_4` respectively. supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances without specifying a pattern string, suffixes `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, `server_`: when purchasing 2 instances, the instance display names are `server_1` and `server_2` respectively.</li> <li>supports up to 128 characters (including pattern strings).</li>. 
     * @return InstanceName Instance display name. <li>if no instance display name is specified, it will display 'unnamed' by default.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it means generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}`: when purchasing 1 instance, the instance display name is `server_3`; when purchasing 2 instances, the instance display names are `server_3` and `server_4` respectively. supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances without specifying a pattern string, suffixes `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, `server_`: when purchasing 2 instances, the instance display names are `server_1` and `server_2` respectively.</li> <li>supports up to 128 characters (including pattern strings).</li>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance display name. <li>if no instance display name is specified, it will display 'unnamed' by default.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it means generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}`: when purchasing 1 instance, the instance display name is `server_3`; when purchasing 2 instances, the instance display names are `server_3` and `server_4` respectively. supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances without specifying a pattern string, suffixes `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, `server_`: when purchasing 2 instances, the instance display names are `server_1` and `server_2` respectively.</li> <li>supports up to 128 characters (including pattern strings).</li>.
     * @param InstanceName Instance display name. <li>if no instance display name is specified, it will display 'unnamed' by default.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it means generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}`: when purchasing 1 instance, the instance display name is `server_3`; when purchasing 2 instances, the instance display names are `server_3` and `server_4` respectively. supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances without specifying a pattern string, suffixes `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, `server_`: when purchasing 2 instances, the instance display names are `server_1` and `server_2` respectively.</li> <li>supports up to 128 characters (including pattern strings).</li>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance, or keep the original login settings of the image. By default, a random password will be generated and sent to you via the Message Center. 
     * @return LoginSettings Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance, or keep the original login settings of the image. By default, a random password will be generated and sent to you via the Message Center.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance, or keep the original login settings of the image. By default, a random password will be generated and sent to you via the Message Center.
     * @param LoginSettings Login settings of the instance. You can use this parameter to set the login method, password, and key of the instance, or keep the original login settings of the image. By default, a random password will be generated and sent to you via the Message Center.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Security group to which an instance belongs. obtain this parameter by calling the `SecurityGroupId` field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808). if not specified, bind the default security group under the designated project. if the default security group does not exist, automatically create it. 
     * @return SecurityGroupIds Security group to which an instance belongs. obtain this parameter by calling the `SecurityGroupId` field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808). if not specified, bind the default security group under the designated project. if the default security group does not exist, automatically create it.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group to which an instance belongs. obtain this parameter by calling the `SecurityGroupId` field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808). if not specified, bind the default security group under the designated project. if the default security group does not exist, automatically create it.
     * @param SecurityGroupIds Security group to which an instance belongs. obtain this parameter by calling the `SecurityGroupId` field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/product/215/15808). if not specified, bind the default security group under the designated project. if the default security group does not exist, automatically create it.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default. 
     * @return EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     * @param EnhancedService Enhanced services. You can use this parameter to specify whether to enable services such as Cloud Security and Cloud Monitor. If this parameter is not specified, Cloud Monitor and Cloud Security will be enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.<br>For more information, see Ensuring Idempotency. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.<br>For more information, see Ensuring Idempotency.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.<br>For more information, see Ensuring Idempotency.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.<br>For more information, see Ensuring Idempotency.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Hostname of Cloud Virtual Machine.<br><li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><br><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><br><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 30 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li> 
     * @return HostName Hostname of Cloud Virtual Machine.<br><li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><br><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><br><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 30 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Hostname of Cloud Virtual Machine.<br><li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><br><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><br><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 30 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>
     * @param HostName Hostname of Cloud Virtual Machine.<br><li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><br><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><br><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 30 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get The tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances. 
     * @return TagSpecification The tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set The tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     * @param TagSpecification The tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get The market options of the instance. 
     * @return InstanceMarketOptions The market options of the instance.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set The market options of the instance.
     * @param InstanceMarketOptions The market options of the instance.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get Custom metadata, supports creating key-value pairs of custom metadata when creating a CVM.

**Note: this field is in beta test.**. 
     * @return Metadata Custom metadata, supports creating key-value pairs of custom metadata when creating a CVM.

**Note: this field is in beta test.**.
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Custom metadata, supports creating key-value pairs of custom metadata when creating a CVM.

**Note: this field is in beta test.**.
     * @param Metadata Custom metadata, supports creating key-value pairs of custom metadata when creating a CVM.

**Note: this field is in beta test.**.
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get HPC cluster ID. 
     * @return HpcClusterId HPC cluster ID.
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set HPC cluster ID.
     * @param HpcClusterId HPC cluster ID.
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get Information about the CPU topology of an instance. If not specified, it is determined by system resources. 
     * @return CpuTopology Information about the CPU topology of an instance. If not specified, it is determined by system resources.
     */
    public CpuTopology getCpuTopology() {
        return this.CpuTopology;
    }

    /**
     * Set Information about the CPU topology of an instance. If not specified, it is determined by system resources.
     * @param CpuTopology Information about the CPU topology of an instance. If not specified, it is determined by system resources.
     */
    public void setCpuTopology(CpuTopology CpuTopology) {
        this.CpuTopology = CpuTopology;
    }

    /**
     * Get  
     * @return LaunchTemplate 
     */
    public LaunchTemplate getLaunchTemplate() {
        return this.LaunchTemplate;
    }

    /**
     * Set 
     * @param LaunchTemplate 
     */
    public void setLaunchTemplate(LaunchTemplate LaunchTemplate) {
        this.LaunchTemplate = LaunchTemplate;
    }

    public InquiryPriceRunInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRunInstancesRequest(InquiryPriceRunInstancesRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.CpuTopology != null) {
            this.CpuTopology = new CpuTopology(source.CpuTopology);
        }
        if (source.LaunchTemplate != null) {
            this.LaunchTemplate = new LaunchTemplate(source.LaunchTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "CpuTopology.", this.CpuTopology);
        this.setParamObj(map, prefix + "LaunchTemplate.", this.LaunchTemplate);

    }
}

