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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchTemplateRequest extends AbstractModel {

    /**
    * Name of an instance launch template. It contains 2 to 128 English or Chinese characters.
    */
    @SerializedName("LaunchTemplateName")
    @Expose
    private String LaunchTemplateName;

    /**
    * Location of the instance. You can specify attributes such as availability zone, project, and host (specified when creating a instance on the CDH) to which the instance belongs through this parameter.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Specify an effective [mirror](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. there are four image types: <li>PUBLIC image</li> <li>custom image</li> <li>shared image</li> <li>service market image</li>  you can obtain available mirror ids in the following ways: <li>the mirror ids of `PUBLIC image`, `custom image` and `shared image` can be queried by logging in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_image); the mirror ids of `service market image` can be queried through the [cloud market](https://market.cloud.tencent.com/list).</li> <li>call the api [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1), input InstanceType to obtain the list of images supported by the current model, and take the `ImageId` field from the return information.</li>.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Version description of an instance launch template. It contains 2 to 256 English or Chinese characters.
    */
    @SerializedName("LaunchTemplateVersionDescription")
    @Expose
    private String LaunchTemplateVersionDescription;

    /**
    * Instance model. Different instance models specify different resource specifications.

<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, the specific values can be obtained BY calling the [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749?from_cn_redirect=1) api to get the latest specification table or referring to the [instance specifications](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) description. if this parameter is not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><li>for instances created with the payment mode CDHPAID, this parameter has the prefix "CDH_" and is generated based on the CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance system disk configuration information. If this parameter is not specified, it will be assigned based on the system default values.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Instance data disk configuration information. if not specified, no data disks are purchased by default. support specifying 21 data disks at the time of purchase, among which a maximum of 1 LOCAL_BASIC data disk or LOCAL_SSD data disk can be included, and a maximum of 20 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks or CLOUD_SSD data disks can be included.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * VPC-related information configuration. You can specify information such as VPC ID and subnet ID through this parameter. If this parameter is not specified, use the basic network by default. If a VPC IP is specified in this parameter, it indicates the primary network interface card IP of each instance. In addition, the number of the InstanceCount parameter should be consistent with the number of the VPC IP and should not exceed 20.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Public bandwidth-related settings. If this parameter is not specified, the public bandwidth is 0 Mbps by default.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Number of instances to purchase. value range for monthly subscription instances: [1, 300]. value range for pay-as-you-go instances: [1, 100]. default value: 1. the number of instances to purchase must not exceed the remaining user quota. for specific quota limitations, see [CVM instance purchase limitations](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1).
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Instance display name. <li>if the instance display name is not specified, it will display by default as 'unnamed'.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it indicates generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}` will result in instance display names as `server_3` when purchasing 1 instance; when purchasing 2 instances, the instance display names will be `server_3` and `server_4` respectively. it supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances, if no pattern string is specified, a suffix `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, for `server_`, when purchasing 2 instances, the instance display names will be `server_1` and `server_2` respectively.</li> <li>it supports up to 128 characters (including pattern strings).</li>.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance login settings. this parameter allows you to set the instance login method to key or maintain the original login settings of the image.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Security group to which an instance belongs. this parameter can be obtained by calling the sgId field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1). if not specified, the default security group is bound.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Enhanced services. You can specify whether to enable services such as Cloud Security and Cloud Monitor through this parameter. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled for public images by default, but not enabled for custom images and marketplace images by default. Instead, they use services retained in the images.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Specifies the HostName of the cloud virtual machine.<br><li>the dot (.) and hyphen (-) cannot be used at the beginning or end of the HostName, and cannot be used consecutively.</li><li>for Windows instances: the character length is 2 to 15. it consists of letters (case insensitive), digits, and hyphens (-). dots (.) are not supported, and it cannot be all digits.</li><li>for other types (such as Linux) instances: the character length is 2 to 60. multiple dots are allowed. each segment between dots can include letters (case insensitive), digits, and hyphens (-).</li>.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Scheduled task. You can specify a scheduled task for the instance through this parameter. Currently, only scheduled termination is supported.
    */
    @SerializedName("ActionTimer")
    @Expose
    private ActionTimer ActionTimer;

    /**
    * Placement group ID. Only one can be specified.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * List of tag descriptions. You can bind tags to corresponding resource instances at the same time by specifying this parameter. Currently, only binding tags to the CVM is supported.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * Market-Related options of the instance, such as relevant parameters of the bidding instance. this parameter is required if the payment mode of the specified instance is spot payment.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * User data provided for an instance must be encoded in base64. valid values for maximum data size are up to 16 KB. for details on obtaining this parameter, see running commands at startup for Windows (https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and Linux (https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Whether it is a pre-check for this request only.
true: sends a check request without creating an instance. check items include whether required parameters are filled in, request format, service limits, and cvm inventory.
If the check fails, return the corresponding error code.
If the check passed, return RequestId.
false (default): sends a normal request. after passing the check, creates an instance directly.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * CAM role name. it can be obtained through the roleName in the return value from the API DescribeRoleList.
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * High-performance computing cluster ID. If the created instance is a high-performance computing instance, the cluster where the instance is placed should be specified. Otherwise, it cannot be specified.
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * Instance [billing mode](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>PREPAID: prepaid, that is, monthly subscription.</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour.</li><li>CDHPAID: CDH instance (created based on CDH; the resources of the host are free of charge).</li><li>SPOTPAID: spot payment.</li>Default value: POSTPAID_BY_HOUR.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Prepaid mode, that is, annual and monthly subscription related parameter settings. Through this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to set auto-renewal, etc. If the specified instance's billing mode is the prepaid mode, this parameter must be passed.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Instance destruction protection flag: indicates whether an instance is allowed to be deleted through an api. value ranges from: - **TRUE**: indicates that instance protection is enabled, deletion through apis is not allowed. - **FALSE**: indicates that instance protection is disabled, deletion through apis is allowed.  default value: FALSE.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * Description list of tags. by specifying this parameter, tags can be bound to the instance launch template.
    */
    @SerializedName("LaunchTemplateTagSpecification")
    @Expose
    private TagSpecification [] LaunchTemplateTagSpecification;

    /**
    * Custom metadata. specifies that custom metadata key-value pairs can be added when creating a CVM.
Note: this field is in beta test.
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * Specifies that only the Update and Replace parameters are allowed. this parameter is valid only when custom Metadata is used in the template and Metadata is also transmitted in RunInstances. defaults to Replace.

-Update: if template t contains this parameter with a value of Update and metadata=[k1:v1, k2:v2], then RunInstances (with metadata=[k2:v3]) + t creates a cvm using metadata=[k1:v1, k2:v3]. 
-Replace: if the template t contains this parameter with a value of Replace and metadata=[k1:v1, k2:v2], then when creating a cvm using RunInstances (with metadata=[k2:v3]) + t, the created cvm will use metadata=[k2:v3]. 
Note: this field is in beta test.
    */
    @SerializedName("TemplateDataModifyAction")
    @Expose
    private String TemplateDataModifyAction;

    /**
     * Get Name of an instance launch template. It contains 2 to 128 English or Chinese characters. 
     * @return LaunchTemplateName Name of an instance launch template. It contains 2 to 128 English or Chinese characters.
     */
    public String getLaunchTemplateName() {
        return this.LaunchTemplateName;
    }

    /**
     * Set Name of an instance launch template. It contains 2 to 128 English or Chinese characters.
     * @param LaunchTemplateName Name of an instance launch template. It contains 2 to 128 English or Chinese characters.
     */
    public void setLaunchTemplateName(String LaunchTemplateName) {
        this.LaunchTemplateName = LaunchTemplateName;
    }

    /**
     * Get Location of the instance. You can specify attributes such as availability zone, project, and host (specified when creating a instance on the CDH) to which the instance belongs through this parameter. 
     * @return Placement Location of the instance. You can specify attributes such as availability zone, project, and host (specified when creating a instance on the CDH) to which the instance belongs through this parameter.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance. You can specify attributes such as availability zone, project, and host (specified when creating a instance on the CDH) to which the instance belongs through this parameter.
     * @param Placement Location of the instance. You can specify attributes such as availability zone, project, and host (specified when creating a instance on the CDH) to which the instance belongs through this parameter.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Specify an effective [mirror](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. there are four image types: <li>PUBLIC image</li> <li>custom image</li> <li>shared image</li> <li>service market image</li>  you can obtain available mirror ids in the following ways: <li>the mirror ids of `PUBLIC image`, `custom image` and `shared image` can be queried by logging in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_image); the mirror ids of `service market image` can be queried through the [cloud market](https://market.cloud.tencent.com/list).</li> <li>call the api [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1), input InstanceType to obtain the list of images supported by the current model, and take the `ImageId` field from the return information.</li>. 
     * @return ImageId Specify an effective [mirror](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. there are four image types: <li>PUBLIC image</li> <li>custom image</li> <li>shared image</li> <li>service market image</li>  you can obtain available mirror ids in the following ways: <li>the mirror ids of `PUBLIC image`, `custom image` and `shared image` can be queried by logging in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_image); the mirror ids of `service market image` can be queried through the [cloud market](https://market.cloud.tencent.com/list).</li> <li>call the api [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1), input InstanceType to obtain the list of images supported by the current model, and take the `ImageId` field from the return information.</li>.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Specify an effective [mirror](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. there are four image types: <li>PUBLIC image</li> <li>custom image</li> <li>shared image</li> <li>service market image</li>  you can obtain available mirror ids in the following ways: <li>the mirror ids of `PUBLIC image`, `custom image` and `shared image` can be queried by logging in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_image); the mirror ids of `service market image` can be queried through the [cloud market](https://market.cloud.tencent.com/list).</li> <li>call the api [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1), input InstanceType to obtain the list of images supported by the current model, and take the `ImageId` field from the return information.</li>.
     * @param ImageId Specify an effective [mirror](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-xxx`. there are four image types: <li>PUBLIC image</li> <li>custom image</li> <li>shared image</li> <li>service market image</li>  you can obtain available mirror ids in the following ways: <li>the mirror ids of `PUBLIC image`, `custom image` and `shared image` can be queried by logging in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_image); the mirror ids of `service market image` can be queried through the [cloud market](https://market.cloud.tencent.com/list).</li> <li>call the api [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1), input InstanceType to obtain the list of images supported by the current model, and take the `ImageId` field from the return information.</li>.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Version description of an instance launch template. It contains 2 to 256 English or Chinese characters. 
     * @return LaunchTemplateVersionDescription Version description of an instance launch template. It contains 2 to 256 English or Chinese characters.
     */
    public String getLaunchTemplateVersionDescription() {
        return this.LaunchTemplateVersionDescription;
    }

    /**
     * Set Version description of an instance launch template. It contains 2 to 256 English or Chinese characters.
     * @param LaunchTemplateVersionDescription Version description of an instance launch template. It contains 2 to 256 English or Chinese characters.
     */
    public void setLaunchTemplateVersionDescription(String LaunchTemplateVersionDescription) {
        this.LaunchTemplateVersionDescription = LaunchTemplateVersionDescription;
    }

    /**
     * Get Instance model. Different instance models specify different resource specifications.

<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, the specific values can be obtained BY calling the [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749?from_cn_redirect=1) api to get the latest specification table or referring to the [instance specifications](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) description. if this parameter is not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><li>for instances created with the payment mode CDHPAID, this parameter has the prefix "CDH_" and is generated based on the CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>. 
     * @return InstanceType Instance model. Different instance models specify different resource specifications.

<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, the specific values can be obtained BY calling the [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749?from_cn_redirect=1) api to get the latest specification table or referring to the [instance specifications](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) description. if this parameter is not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><li>for instances created with the payment mode CDHPAID, this parameter has the prefix "CDH_" and is generated based on the CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Different instance models specify different resource specifications.

<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, the specific values can be obtained BY calling the [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749?from_cn_redirect=1) api to get the latest specification table or referring to the [instance specifications](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) description. if this parameter is not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><li>for instances created with the payment mode CDHPAID, this parameter has the prefix "CDH_" and is generated based on the CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     * @param InstanceType Instance model. Different instance models specify different resource specifications.

<br><li>For instances created with the payment modes PREPAID or POSTPAID_BY_HOUR, the specific values can be obtained BY calling the [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749?from_cn_redirect=1) api to get the latest specification table or referring to the [instance specifications](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1) description. if this parameter is not specified, the system will dynamically assign a default model based on the current resource sales situation in a region.</li><li>for instances created with the payment mode CDHPAID, this parameter has the prefix "CDH_" and is generated based on the CPU and memory configuration. the specific format is: CDH_XCXG. for example, for creating a CDH instance with 1 CPU core and 1 gb memory, this parameter should be CDH_1C1G.</li>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance system disk configuration information. If this parameter is not specified, it will be assigned based on the system default values. 
     * @return SystemDisk Instance system disk configuration information. If this parameter is not specified, it will be assigned based on the system default values.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Instance system disk configuration information. If this parameter is not specified, it will be assigned based on the system default values.
     * @param SystemDisk Instance system disk configuration information. If this parameter is not specified, it will be assigned based on the system default values.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Instance data disk configuration information. if not specified, no data disks are purchased by default. support specifying 21 data disks at the time of purchase, among which a maximum of 1 LOCAL_BASIC data disk or LOCAL_SSD data disk can be included, and a maximum of 20 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks or CLOUD_SSD data disks can be included. 
     * @return DataDisks Instance data disk configuration information. if not specified, no data disks are purchased by default. support specifying 21 data disks at the time of purchase, among which a maximum of 1 LOCAL_BASIC data disk or LOCAL_SSD data disk can be included, and a maximum of 20 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks or CLOUD_SSD data disks can be included.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Instance data disk configuration information. if not specified, no data disks are purchased by default. support specifying 21 data disks at the time of purchase, among which a maximum of 1 LOCAL_BASIC data disk or LOCAL_SSD data disk can be included, and a maximum of 20 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks or CLOUD_SSD data disks can be included.
     * @param DataDisks Instance data disk configuration information. if not specified, no data disks are purchased by default. support specifying 21 data disks at the time of purchase, among which a maximum of 1 LOCAL_BASIC data disk or LOCAL_SSD data disk can be included, and a maximum of 20 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks or CLOUD_SSD data disks can be included.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get VPC-related information configuration. You can specify information such as VPC ID and subnet ID through this parameter. If this parameter is not specified, use the basic network by default. If a VPC IP is specified in this parameter, it indicates the primary network interface card IP of each instance. In addition, the number of the InstanceCount parameter should be consistent with the number of the VPC IP and should not exceed 20. 
     * @return VirtualPrivateCloud VPC-related information configuration. You can specify information such as VPC ID and subnet ID through this parameter. If this parameter is not specified, use the basic network by default. If a VPC IP is specified in this parameter, it indicates the primary network interface card IP of each instance. In addition, the number of the InstanceCount parameter should be consistent with the number of the VPC IP and should not exceed 20.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set VPC-related information configuration. You can specify information such as VPC ID and subnet ID through this parameter. If this parameter is not specified, use the basic network by default. If a VPC IP is specified in this parameter, it indicates the primary network interface card IP of each instance. In addition, the number of the InstanceCount parameter should be consistent with the number of the VPC IP and should not exceed 20.
     * @param VirtualPrivateCloud VPC-related information configuration. You can specify information such as VPC ID and subnet ID through this parameter. If this parameter is not specified, use the basic network by default. If a VPC IP is specified in this parameter, it indicates the primary network interface card IP of each instance. In addition, the number of the InstanceCount parameter should be consistent with the number of the VPC IP and should not exceed 20.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get Public bandwidth-related settings. If this parameter is not specified, the public bandwidth is 0 Mbps by default. 
     * @return InternetAccessible Public bandwidth-related settings. If this parameter is not specified, the public bandwidth is 0 Mbps by default.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public bandwidth-related settings. If this parameter is not specified, the public bandwidth is 0 Mbps by default.
     * @param InternetAccessible Public bandwidth-related settings. If this parameter is not specified, the public bandwidth is 0 Mbps by default.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Number of instances to purchase. value range for monthly subscription instances: [1, 300]. value range for pay-as-you-go instances: [1, 100]. default value: 1. the number of instances to purchase must not exceed the remaining user quota. for specific quota limitations, see [CVM instance purchase limitations](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1). 
     * @return InstanceCount Number of instances to purchase. value range for monthly subscription instances: [1, 300]. value range for pay-as-you-go instances: [1, 100]. default value: 1. the number of instances to purchase must not exceed the remaining user quota. for specific quota limitations, see [CVM instance purchase limitations](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1).
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to purchase. value range for monthly subscription instances: [1, 300]. value range for pay-as-you-go instances: [1, 100]. default value: 1. the number of instances to purchase must not exceed the remaining user quota. for specific quota limitations, see [CVM instance purchase limitations](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1).
     * @param InstanceCount Number of instances to purchase. value range for monthly subscription instances: [1, 300]. value range for pay-as-you-go instances: [1, 100]. default value: 1. the number of instances to purchase must not exceed the remaining user quota. for specific quota limitations, see [CVM instance purchase limitations](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1).
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Instance display name. <li>if the instance display name is not specified, it will display by default as 'unnamed'.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it indicates generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}` will result in instance display names as `server_3` when purchasing 1 instance; when purchasing 2 instances, the instance display names will be `server_3` and `server_4` respectively. it supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances, if no pattern string is specified, a suffix `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, for `server_`, when purchasing 2 instances, the instance display names will be `server_1` and `server_2` respectively.</li> <li>it supports up to 128 characters (including pattern strings).</li>. 
     * @return InstanceName Instance display name. <li>if the instance display name is not specified, it will display by default as 'unnamed'.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it indicates generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}` will result in instance display names as `server_3` when purchasing 1 instance; when purchasing 2 instances, the instance display names will be `server_3` and `server_4` respectively. it supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances, if no pattern string is specified, a suffix `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, for `server_`, when purchasing 2 instances, the instance display names will be `server_1` and `server_2` respectively.</li> <li>it supports up to 128 characters (including pattern strings).</li>.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance display name. <li>if the instance display name is not specified, it will display by default as 'unnamed'.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it indicates generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}` will result in instance display names as `server_3` when purchasing 1 instance; when purchasing 2 instances, the instance display names will be `server_3` and `server_4` respectively. it supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances, if no pattern string is specified, a suffix `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, for `server_`, when purchasing 2 instances, the instance display names will be `server_1` and `server_2` respectively.</li> <li>it supports up to 128 characters (including pattern strings).</li>.
     * @param InstanceName Instance display name. <li>if the instance display name is not specified, it will display by default as 'unnamed'.</li> <li>when purchasing multiple instances, if the pattern string `{R:x}` is specified, it indicates generating numbers `[x, x+n-1]`, where `n` represents the number of purchased instances. for example, `server_{R:3}` will result in instance display names as `server_3` when purchasing 1 instance; when purchasing 2 instances, the instance display names will be `server_3` and `server_4` respectively. it supports specifying multiple pattern strings `{R:x}`.</li> <li>when purchasing multiple instances, if no pattern string is specified, a suffix `1, 2...n` will be added to the instance display name, where `n` represents the number of purchased instances. for example, for `server_`, when purchasing 2 instances, the instance display names will be `server_1` and `server_2` respectively.</li> <li>it supports up to 128 characters (including pattern strings).</li>.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance login settings. this parameter allows you to set the instance login method to key or maintain the original login settings of the image. 
     * @return LoginSettings Instance login settings. this parameter allows you to set the instance login method to key or maintain the original login settings of the image.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login settings. this parameter allows you to set the instance login method to key or maintain the original login settings of the image.
     * @param LoginSettings Instance login settings. this parameter allows you to set the instance login method to key or maintain the original login settings of the image.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Security group to which an instance belongs. this parameter can be obtained by calling the sgId field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1). if not specified, the default security group is bound. 
     * @return SecurityGroupIds Security group to which an instance belongs. this parameter can be obtained by calling the sgId field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1). if not specified, the default security group is bound.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group to which an instance belongs. this parameter can be obtained by calling the sgId field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1). if not specified, the default security group is bound.
     * @param SecurityGroupIds Security group to which an instance belongs. this parameter can be obtained by calling the sgId field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1). if not specified, the default security group is bound.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Enhanced services. You can specify whether to enable services such as Cloud Security and Cloud Monitor through this parameter. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled for public images by default, but not enabled for custom images and marketplace images by default. Instead, they use services retained in the images. 
     * @return EnhancedService Enhanced services. You can specify whether to enable services such as Cloud Security and Cloud Monitor through this parameter. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled for public images by default, but not enabled for custom images and marketplace images by default. Instead, they use services retained in the images.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced services. You can specify whether to enable services such as Cloud Security and Cloud Monitor through this parameter. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled for public images by default, but not enabled for custom images and marketplace images by default. Instead, they use services retained in the images.
     * @param EnhancedService Enhanced services. You can specify whether to enable services such as Cloud Security and Cloud Monitor through this parameter. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled for public images by default, but not enabled for custom images and marketplace images by default. Instead, they use services retained in the images.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed. 
     * @return ClientToken A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     * @param ClientToken A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Specifies the HostName of the cloud virtual machine.<br><li>the dot (.) and hyphen (-) cannot be used at the beginning or end of the HostName, and cannot be used consecutively.</li><li>for Windows instances: the character length is 2 to 15. it consists of letters (case insensitive), digits, and hyphens (-). dots (.) are not supported, and it cannot be all digits.</li><li>for other types (such as Linux) instances: the character length is 2 to 60. multiple dots are allowed. each segment between dots can include letters (case insensitive), digits, and hyphens (-).</li>. 
     * @return HostName Specifies the HostName of the cloud virtual machine.<br><li>the dot (.) and hyphen (-) cannot be used at the beginning or end of the HostName, and cannot be used consecutively.</li><li>for Windows instances: the character length is 2 to 15. it consists of letters (case insensitive), digits, and hyphens (-). dots (.) are not supported, and it cannot be all digits.</li><li>for other types (such as Linux) instances: the character length is 2 to 60. multiple dots are allowed. each segment between dots can include letters (case insensitive), digits, and hyphens (-).</li>.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Specifies the HostName of the cloud virtual machine.<br><li>the dot (.) and hyphen (-) cannot be used at the beginning or end of the HostName, and cannot be used consecutively.</li><li>for Windows instances: the character length is 2 to 15. it consists of letters (case insensitive), digits, and hyphens (-). dots (.) are not supported, and it cannot be all digits.</li><li>for other types (such as Linux) instances: the character length is 2 to 60. multiple dots are allowed. each segment between dots can include letters (case insensitive), digits, and hyphens (-).</li>.
     * @param HostName Specifies the HostName of the cloud virtual machine.<br><li>the dot (.) and hyphen (-) cannot be used at the beginning or end of the HostName, and cannot be used consecutively.</li><li>for Windows instances: the character length is 2 to 15. it consists of letters (case insensitive), digits, and hyphens (-). dots (.) are not supported, and it cannot be all digits.</li><li>for other types (such as Linux) instances: the character length is 2 to 60. multiple dots are allowed. each segment between dots can include letters (case insensitive), digits, and hyphens (-).</li>.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Scheduled task. You can specify a scheduled task for the instance through this parameter. Currently, only scheduled termination is supported. 
     * @return ActionTimer Scheduled task. You can specify a scheduled task for the instance through this parameter. Currently, only scheduled termination is supported.
     */
    public ActionTimer getActionTimer() {
        return this.ActionTimer;
    }

    /**
     * Set Scheduled task. You can specify a scheduled task for the instance through this parameter. Currently, only scheduled termination is supported.
     * @param ActionTimer Scheduled task. You can specify a scheduled task for the instance through this parameter. Currently, only scheduled termination is supported.
     */
    public void setActionTimer(ActionTimer ActionTimer) {
        this.ActionTimer = ActionTimer;
    }

    /**
     * Get Placement group ID. Only one can be specified. 
     * @return DisasterRecoverGroupIds Placement group ID. Only one can be specified.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set Placement group ID. Only one can be specified.
     * @param DisasterRecoverGroupIds Placement group ID. Only one can be specified.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get List of tag descriptions. You can bind tags to corresponding resource instances at the same time by specifying this parameter. Currently, only binding tags to the CVM is supported. 
     * @return TagSpecification List of tag descriptions. You can bind tags to corresponding resource instances at the same time by specifying this parameter. Currently, only binding tags to the CVM is supported.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set List of tag descriptions. You can bind tags to corresponding resource instances at the same time by specifying this parameter. Currently, only binding tags to the CVM is supported.
     * @param TagSpecification List of tag descriptions. You can bind tags to corresponding resource instances at the same time by specifying this parameter. Currently, only binding tags to the CVM is supported.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Market-Related options of the instance, such as relevant parameters of the bidding instance. this parameter is required if the payment mode of the specified instance is spot payment. 
     * @return InstanceMarketOptions Market-Related options of the instance, such as relevant parameters of the bidding instance. this parameter is required if the payment mode of the specified instance is spot payment.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set Market-Related options of the instance, such as relevant parameters of the bidding instance. this parameter is required if the payment mode of the specified instance is spot payment.
     * @param InstanceMarketOptions Market-Related options of the instance, such as relevant parameters of the bidding instance. this parameter is required if the payment mode of the specified instance is spot payment.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get User data provided for an instance must be encoded in base64. valid values for maximum data size are up to 16 KB. for details on obtaining this parameter, see running commands at startup for Windows (https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and Linux (https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1). 
     * @return UserData User data provided for an instance must be encoded in base64. valid values for maximum data size are up to 16 KB. for details on obtaining this parameter, see running commands at startup for Windows (https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and Linux (https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set User data provided for an instance must be encoded in base64. valid values for maximum data size are up to 16 KB. for details on obtaining this parameter, see running commands at startup for Windows (https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and Linux (https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     * @param UserData User data provided for an instance must be encoded in base64. valid values for maximum data size are up to 16 KB. for details on obtaining this parameter, see running commands at startup for Windows (https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and Linux (https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Whether it is a pre-check for this request only.
true: sends a check request without creating an instance. check items include whether required parameters are filled in, request format, service limits, and cvm inventory.
If the check fails, return the corresponding error code.
If the check passed, return RequestId.
false (default): sends a normal request. after passing the check, creates an instance directly. 
     * @return DryRun Whether it is a pre-check for this request only.
true: sends a check request without creating an instance. check items include whether required parameters are filled in, request format, service limits, and cvm inventory.
If the check fails, return the corresponding error code.
If the check passed, return RequestId.
false (default): sends a normal request. after passing the check, creates an instance directly.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether it is a pre-check for this request only.
true: sends a check request without creating an instance. check items include whether required parameters are filled in, request format, service limits, and cvm inventory.
If the check fails, return the corresponding error code.
If the check passed, return RequestId.
false (default): sends a normal request. after passing the check, creates an instance directly.
     * @param DryRun Whether it is a pre-check for this request only.
true: sends a check request without creating an instance. check items include whether required parameters are filled in, request format, service limits, and cvm inventory.
If the check fails, return the corresponding error code.
If the check passed, return RequestId.
false (default): sends a normal request. after passing the check, creates an instance directly.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get CAM role name. it can be obtained through the roleName in the return value from the API DescribeRoleList. 
     * @return CamRoleName CAM role name. it can be obtained through the roleName in the return value from the API DescribeRoleList.
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM role name. it can be obtained through the roleName in the return value from the API DescribeRoleList.
     * @param CamRoleName CAM role name. it can be obtained through the roleName in the return value from the API DescribeRoleList.
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get High-performance computing cluster ID. If the created instance is a high-performance computing instance, the cluster where the instance is placed should be specified. Otherwise, it cannot be specified. 
     * @return HpcClusterId High-performance computing cluster ID. If the created instance is a high-performance computing instance, the cluster where the instance is placed should be specified. Otherwise, it cannot be specified.
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set High-performance computing cluster ID. If the created instance is a high-performance computing instance, the cluster where the instance is placed should be specified. Otherwise, it cannot be specified.
     * @param HpcClusterId High-performance computing cluster ID. If the created instance is a high-performance computing instance, the cluster where the instance is placed should be specified. Otherwise, it cannot be specified.
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get Instance [billing mode](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>PREPAID: prepaid, that is, monthly subscription.</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour.</li><li>CDHPAID: CDH instance (created based on CDH; the resources of the host are free of charge).</li><li>SPOTPAID: spot payment.</li>Default value: POSTPAID_BY_HOUR. 
     * @return InstanceChargeType Instance [billing mode](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>PREPAID: prepaid, that is, monthly subscription.</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour.</li><li>CDHPAID: CDH instance (created based on CDH; the resources of the host are free of charge).</li><li>SPOTPAID: spot payment.</li>Default value: POSTPAID_BY_HOUR.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance [billing mode](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>PREPAID: prepaid, that is, monthly subscription.</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour.</li><li>CDHPAID: CDH instance (created based on CDH; the resources of the host are free of charge).</li><li>SPOTPAID: spot payment.</li>Default value: POSTPAID_BY_HOUR.
     * @param InstanceChargeType Instance [billing mode](https://intl.cloud.tencent.com/document/product/213/2180?from_cn_redirect=1).<br><li>PREPAID: prepaid, that is, monthly subscription.</li><li>POSTPAID_BY_HOUR: pay-as-you-go by hour.</li><li>CDHPAID: CDH instance (created based on CDH; the resources of the host are free of charge).</li><li>SPOTPAID: spot payment.</li>Default value: POSTPAID_BY_HOUR.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Prepaid mode, that is, annual and monthly subscription related parameter settings. Through this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to set auto-renewal, etc. If the specified instance's billing mode is the prepaid mode, this parameter must be passed. 
     * @return InstanceChargePrepaid Prepaid mode, that is, annual and monthly subscription related parameter settings. Through this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to set auto-renewal, etc. If the specified instance's billing mode is the prepaid mode, this parameter must be passed.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Prepaid mode, that is, annual and monthly subscription related parameter settings. Through this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to set auto-renewal, etc. If the specified instance's billing mode is the prepaid mode, this parameter must be passed.
     * @param InstanceChargePrepaid Prepaid mode, that is, annual and monthly subscription related parameter settings. Through this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to set auto-renewal, etc. If the specified instance's billing mode is the prepaid mode, this parameter must be passed.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Instance destruction protection flag: indicates whether an instance is allowed to be deleted through an api. value ranges from: - **TRUE**: indicates that instance protection is enabled, deletion through apis is not allowed. - **FALSE**: indicates that instance protection is disabled, deletion through apis is allowed.  default value: FALSE. 
     * @return DisableApiTermination Instance destruction protection flag: indicates whether an instance is allowed to be deleted through an api. value ranges from: - **TRUE**: indicates that instance protection is enabled, deletion through apis is not allowed. - **FALSE**: indicates that instance protection is disabled, deletion through apis is allowed.  default value: FALSE.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Instance destruction protection flag: indicates whether an instance is allowed to be deleted through an api. value ranges from: - **TRUE**: indicates that instance protection is enabled, deletion through apis is not allowed. - **FALSE**: indicates that instance protection is disabled, deletion through apis is allowed.  default value: FALSE.
     * @param DisableApiTermination Instance destruction protection flag: indicates whether an instance is allowed to be deleted through an api. value ranges from: - **TRUE**: indicates that instance protection is enabled, deletion through apis is not allowed. - **FALSE**: indicates that instance protection is disabled, deletion through apis is allowed.  default value: FALSE.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get Description list of tags. by specifying this parameter, tags can be bound to the instance launch template. 
     * @return LaunchTemplateTagSpecification Description list of tags. by specifying this parameter, tags can be bound to the instance launch template.
     */
    public TagSpecification [] getLaunchTemplateTagSpecification() {
        return this.LaunchTemplateTagSpecification;
    }

    /**
     * Set Description list of tags. by specifying this parameter, tags can be bound to the instance launch template.
     * @param LaunchTemplateTagSpecification Description list of tags. by specifying this parameter, tags can be bound to the instance launch template.
     */
    public void setLaunchTemplateTagSpecification(TagSpecification [] LaunchTemplateTagSpecification) {
        this.LaunchTemplateTagSpecification = LaunchTemplateTagSpecification;
    }

    /**
     * Get Custom metadata. specifies that custom metadata key-value pairs can be added when creating a CVM.
Note: this field is in beta test. 
     * @return Metadata Custom metadata. specifies that custom metadata key-value pairs can be added when creating a CVM.
Note: this field is in beta test.
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Custom metadata. specifies that custom metadata key-value pairs can be added when creating a CVM.
Note: this field is in beta test.
     * @param Metadata Custom metadata. specifies that custom metadata key-value pairs can be added when creating a CVM.
Note: this field is in beta test.
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get Specifies that only the Update and Replace parameters are allowed. this parameter is valid only when custom Metadata is used in the template and Metadata is also transmitted in RunInstances. defaults to Replace.

-Update: if template t contains this parameter with a value of Update and metadata=[k1:v1, k2:v2], then RunInstances (with metadata=[k2:v3]) + t creates a cvm using metadata=[k1:v1, k2:v3]. 
-Replace: if the template t contains this parameter with a value of Replace and metadata=[k1:v1, k2:v2], then when creating a cvm using RunInstances (with metadata=[k2:v3]) + t, the created cvm will use metadata=[k2:v3]. 
Note: this field is in beta test. 
     * @return TemplateDataModifyAction Specifies that only the Update and Replace parameters are allowed. this parameter is valid only when custom Metadata is used in the template and Metadata is also transmitted in RunInstances. defaults to Replace.

-Update: if template t contains this parameter with a value of Update and metadata=[k1:v1, k2:v2], then RunInstances (with metadata=[k2:v3]) + t creates a cvm using metadata=[k1:v1, k2:v3]. 
-Replace: if the template t contains this parameter with a value of Replace and metadata=[k1:v1, k2:v2], then when creating a cvm using RunInstances (with metadata=[k2:v3]) + t, the created cvm will use metadata=[k2:v3]. 
Note: this field is in beta test.
     */
    public String getTemplateDataModifyAction() {
        return this.TemplateDataModifyAction;
    }

    /**
     * Set Specifies that only the Update and Replace parameters are allowed. this parameter is valid only when custom Metadata is used in the template and Metadata is also transmitted in RunInstances. defaults to Replace.

-Update: if template t contains this parameter with a value of Update and metadata=[k1:v1, k2:v2], then RunInstances (with metadata=[k2:v3]) + t creates a cvm using metadata=[k1:v1, k2:v3]. 
-Replace: if the template t contains this parameter with a value of Replace and metadata=[k1:v1, k2:v2], then when creating a cvm using RunInstances (with metadata=[k2:v3]) + t, the created cvm will use metadata=[k2:v3]. 
Note: this field is in beta test.
     * @param TemplateDataModifyAction Specifies that only the Update and Replace parameters are allowed. this parameter is valid only when custom Metadata is used in the template and Metadata is also transmitted in RunInstances. defaults to Replace.

-Update: if template t contains this parameter with a value of Update and metadata=[k1:v1, k2:v2], then RunInstances (with metadata=[k2:v3]) + t creates a cvm using metadata=[k1:v1, k2:v3]. 
-Replace: if the template t contains this parameter with a value of Replace and metadata=[k1:v1, k2:v2], then when creating a cvm using RunInstances (with metadata=[k2:v3]) + t, the created cvm will use metadata=[k2:v3]. 
Note: this field is in beta test.
     */
    public void setTemplateDataModifyAction(String TemplateDataModifyAction) {
        this.TemplateDataModifyAction = TemplateDataModifyAction;
    }

    public CreateLaunchTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaunchTemplateRequest(CreateLaunchTemplateRequest source) {
        if (source.LaunchTemplateName != null) {
            this.LaunchTemplateName = new String(source.LaunchTemplateName);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.LaunchTemplateVersionDescription != null) {
            this.LaunchTemplateVersionDescription = new String(source.LaunchTemplateVersionDescription);
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
        if (source.ActionTimer != null) {
            this.ActionTimer = new ActionTimer(source.ActionTimer);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
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
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.LaunchTemplateTagSpecification != null) {
            this.LaunchTemplateTagSpecification = new TagSpecification[source.LaunchTemplateTagSpecification.length];
            for (int i = 0; i < source.LaunchTemplateTagSpecification.length; i++) {
                this.LaunchTemplateTagSpecification[i] = new TagSpecification(source.LaunchTemplateTagSpecification[i]);
            }
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.TemplateDataModifyAction != null) {
            this.TemplateDataModifyAction = new String(source.TemplateDataModifyAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateName", this.LaunchTemplateName);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionDescription", this.LaunchTemplateVersionDescription);
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
        this.setParamObj(map, prefix + "ActionTimer.", this.ActionTimer);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamArrayObj(map, prefix + "LaunchTemplateTagSpecification.", this.LaunchTemplateTagSpecification);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "TemplateDataModifyAction", this.TemplateDataModifyAction);

    }
}

