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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchConfigurationRequest extends AbstractModel {

    /**
    * <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, the separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. One and only one of image ID and image family name must be filled in. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can get available image IDs in the following ways:<br><li>You can query the image IDs of <code>public images</code>, <code>custom images</code>, and <code>shared images</code> by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>; query the image IDs in the <code>service image market</code> in <a href="https://market.cloud.tencent.com/list">Marketplace</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and get the <code>ImageId</code> field in the returned information.</li></p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>The project ID of the launch configuration. Default value: 0, indicating the default project. Obtain this parameter by calling <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> and using the projectId field in the return value.<br>Note: The project ID of instances within the scaling group is the scaling group project ID, irrelevant to the value here.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Instance model. Different instance models specify different resource specifications. The specific values can be obtained by calling the <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> API to get the latest specification table or refer to the <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">instance type</a> description.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive, and one and only one must be filled in.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance system disk configuration information. If not specified, it will be allocated based on system default values.</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>Instance data disk configuration information. If not specified, no data disks are purchased by default, and a maximum of 11 data disks can be specified.</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>Public network bandwidth-related information settings. If not specified, the public network bandwidth defaults to 0 Mbps.</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>Instance login settings. Through this parameter, you can set the instance's login method to password, key, or maintain the image's original login settings. By default, a password will be randomly generated, and the user will be notified through an internal message.</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>Security group to which an instance belongs. The value of this parameter can be obtained from the returned <code>SecurityGroupId</code> field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, no security groups are associated by default.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Enhancement services. This parameter can be used to specify whether to enable services such as Cloud Monitor and cloud security. If not specified, cloud monitoring and cloud security services are enabled by default.</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>Custom data after Base64 encoding should not exceed 16KB.</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>Instance billing type. The default value of CVM is handled as POSTPAID_BY_HOUR.</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepayment, which is monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Market options of the instance, such as spot instance parameters. This parameter is required if the payment mode of the specified instance is spot payment.</p>
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>Instance model list. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive. One and only one of them must be filled in. To obtain the specific values, call the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to get the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>Instance type validation policy. Valid values include ALL and ANY. Default value: ANY. This parameter is valid only when InstanceTypes contains multiple models.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li><li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li><p>Common causes of InstanceTypes unavailable include the instance type sold out and the corresponding cloud disk sold out.<br>If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.</p>
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * <p>Tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. A maximum of 10 tags can be specified.</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>Tag description list. By specifying this parameter, you can bind tags to a launch configuration. Each launch configuration supports up to 30 tags.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Related settings of the CVM host name (HostName).<br>Setting the host name for windows instances is unsupported.<br>When adding this attribute, you must pass the CVM host name. Other unspecified fields will be set to default values.<br>The host name (with the suffix added if it exists) is verified against a maximum length of 46 characters.</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>Related settings of CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group is set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group is set as "as-{{ scaling group AutoScalingGroupName }}" and transmitted to CVM.<br>When adding new this attribute, the instance name of the CVM must be transmitted. Other fields not transmitted will be set as default values.<br>It will verify whether the instance name (plus the suffix if it exists) exceeds the maximum length of 108 characters.</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. If the billing mode of the specified instance is prepaid, this parameter must be passed.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>Cloud disk type selection policy. Default value: ORIGINAL. Value range:</p><li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select the currently available cloud disk type</li>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>Public network bandwidth-related information settings for IPv6. If the new instance contains an IPv6 address, this parameter can allocate public network bandwidth to the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
    */
    @SerializedName("IPv6InternetAccessible")
    @Expose
    private IPv6InternetAccessible IPv6InternetAccessible;

    /**
    * <p>Placement Group id. Only one can be specified.</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>Image family name. Either image Id or image family name must be specified, and one and only one must be filled in. This parameter can be obtained through the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>CDC ID. Obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/1346/73758?from_cn_redirect=1">DescribeDedicatedClusters</a> API.</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>Custom metadata.</p>
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * <p>Configure the elastic network interface for scale-out instances.</p><p>Input limits: up to 17 items. When configuring this parameter, you must explicitly include and can only include one PRIMARY. AS does not auto-complete the primary ENI. An explicitly empty array is illegal. Spot instances do not support this parameter.</p><p>The VPC and subnet are automatically injected by the scaling group based on the current candidate subnets. If not configured, they are not transmitted to CVM. The SecurityGroupIds parameter in the launch configuration is retained.</p>
    */
    @SerializedName("NetworkInterfaces")
    @Expose
    private NetworkInterface [] NetworkInterfaces;

    /**
     * Get <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, the separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p> 
     * @return LaunchConfigurationName <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, the separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, the separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     * @param LaunchConfigurationName <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, the separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. One and only one of image ID and image family name must be filled in. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can get available image IDs in the following ways:<br><li>You can query the image IDs of <code>public images</code>, <code>custom images</code>, and <code>shared images</code> by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>; query the image IDs in the <code>service image market</code> in <a href="https://market.cloud.tencent.com/list">Marketplace</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and get the <code>ImageId</code> field in the returned information.</li></p> 
     * @return ImageId <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. One and only one of image ID and image family name must be filled in. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can get available image IDs in the following ways:<br><li>You can query the image IDs of <code>public images</code>, <code>custom images</code>, and <code>shared images</code> by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>; query the image IDs in the <code>service image market</code> in <a href="https://market.cloud.tencent.com/list">Marketplace</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and get the <code>ImageId</code> field in the returned information.</li></p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. One and only one of image ID and image family name must be filled in. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can get available image IDs in the following ways:<br><li>You can query the image IDs of <code>public images</code>, <code>custom images</code>, and <code>shared images</code> by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>; query the image IDs in the <code>service image market</code> in <a href="https://market.cloud.tencent.com/list">Marketplace</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and get the <code>ImageId</code> field in the returned information.</li></p>
     * @param ImageId <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. One and only one of image ID and image family name must be filled in. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can get available image IDs in the following ways:<br><li>You can query the image IDs of <code>public images</code>, <code>custom images</code>, and <code>shared images</code> by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>; query the image IDs in the <code>service image market</code> in <a href="https://market.cloud.tencent.com/list">Marketplace</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and get the <code>ImageId</code> field in the returned information.</li></p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>The project ID of the launch configuration. Default value: 0, indicating the default project. Obtain this parameter by calling <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> and using the projectId field in the return value.<br>Note: The project ID of instances within the scaling group is the scaling group project ID, irrelevant to the value here.</p> 
     * @return ProjectId <p>The project ID of the launch configuration. Default value: 0, indicating the default project. Obtain this parameter by calling <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> and using the projectId field in the return value.<br>Note: The project ID of instances within the scaling group is the scaling group project ID, irrelevant to the value here.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>The project ID of the launch configuration. Default value: 0, indicating the default project. Obtain this parameter by calling <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> and using the projectId field in the return value.<br>Note: The project ID of instances within the scaling group is the scaling group project ID, irrelevant to the value here.</p>
     * @param ProjectId <p>The project ID of the launch configuration. Default value: 0, indicating the default project. Obtain this parameter by calling <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> and using the projectId field in the return value.<br>Note: The project ID of instances within the scaling group is the scaling group project ID, irrelevant to the value here.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Instance model. Different instance models specify different resource specifications. The specific values can be obtained by calling the <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> API to get the latest specification table or refer to the <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">instance type</a> description.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive, and one and only one must be filled in.</p> 
     * @return InstanceType <p>Instance model. Different instance models specify different resource specifications. The specific values can be obtained by calling the <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> API to get the latest specification table or refer to the <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">instance type</a> description.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive, and one and only one must be filled in.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance model. Different instance models specify different resource specifications. The specific values can be obtained by calling the <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> API to get the latest specification table or refer to the <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">instance type</a> description.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive, and one and only one must be filled in.</p>
     * @param InstanceType <p>Instance model. Different instance models specify different resource specifications. The specific values can be obtained by calling the <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> API to get the latest specification table or refer to the <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">instance type</a> description.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive, and one and only one must be filled in.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Instance system disk configuration information. If not specified, it will be allocated based on system default values.</p> 
     * @return SystemDisk <p>Instance system disk configuration information. If not specified, it will be allocated based on system default values.</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>Instance system disk configuration information. If not specified, it will be allocated based on system default values.</p>
     * @param SystemDisk <p>Instance system disk configuration information. If not specified, it will be allocated based on system default values.</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>Instance data disk configuration information. If not specified, no data disks are purchased by default, and a maximum of 11 data disks can be specified.</p> 
     * @return DataDisks <p>Instance data disk configuration information. If not specified, no data disks are purchased by default, and a maximum of 11 data disks can be specified.</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>Instance data disk configuration information. If not specified, no data disks are purchased by default, and a maximum of 11 data disks can be specified.</p>
     * @param DataDisks <p>Instance data disk configuration information. If not specified, no data disks are purchased by default, and a maximum of 11 data disks can be specified.</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>Public network bandwidth-related information settings. If not specified, the public network bandwidth defaults to 0 Mbps.</p> 
     * @return InternetAccessible <p>Public network bandwidth-related information settings. If not specified, the public network bandwidth defaults to 0 Mbps.</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>Public network bandwidth-related information settings. If not specified, the public network bandwidth defaults to 0 Mbps.</p>
     * @param InternetAccessible <p>Public network bandwidth-related information settings. If not specified, the public network bandwidth defaults to 0 Mbps.</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>Instance login settings. Through this parameter, you can set the instance's login method to password, key, or maintain the image's original login settings. By default, a password will be randomly generated, and the user will be notified through an internal message.</p> 
     * @return LoginSettings <p>Instance login settings. Through this parameter, you can set the instance's login method to password, key, or maintain the image's original login settings. By default, a password will be randomly generated, and the user will be notified through an internal message.</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>Instance login settings. Through this parameter, you can set the instance's login method to password, key, or maintain the image's original login settings. By default, a password will be randomly generated, and the user will be notified through an internal message.</p>
     * @param LoginSettings <p>Instance login settings. Through this parameter, you can set the instance's login method to password, key, or maintain the image's original login settings. By default, a password will be randomly generated, and the user will be notified through an internal message.</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>Security group to which an instance belongs. The value of this parameter can be obtained from the returned <code>SecurityGroupId</code> field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, no security groups are associated by default.</p> 
     * @return SecurityGroupIds <p>Security group to which an instance belongs. The value of this parameter can be obtained from the returned <code>SecurityGroupId</code> field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, no security groups are associated by default.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group to which an instance belongs. The value of this parameter can be obtained from the returned <code>SecurityGroupId</code> field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, no security groups are associated by default.</p>
     * @param SecurityGroupIds <p>Security group to which an instance belongs. The value of this parameter can be obtained from the returned <code>SecurityGroupId</code> field of the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. If this parameter is not specified, no security groups are associated by default.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Enhancement services. This parameter can be used to specify whether to enable services such as Cloud Monitor and cloud security. If not specified, cloud monitoring and cloud security services are enabled by default.</p> 
     * @return EnhancedService <p>Enhancement services. This parameter can be used to specify whether to enable services such as Cloud Monitor and cloud security. If not specified, cloud monitoring and cloud security services are enabled by default.</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>Enhancement services. This parameter can be used to specify whether to enable services such as Cloud Monitor and cloud security. If not specified, cloud monitoring and cloud security services are enabled by default.</p>
     * @param EnhancedService <p>Enhancement services. This parameter can be used to specify whether to enable services such as Cloud Monitor and cloud security. If not specified, cloud monitoring and cloud security services are enabled by default.</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get <p>Custom data after Base64 encoding should not exceed 16KB.</p> 
     * @return UserData <p>Custom data after Base64 encoding should not exceed 16KB.</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>Custom data after Base64 encoding should not exceed 16KB.</p>
     * @param UserData <p>Custom data after Base64 encoding should not exceed 16KB.</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>Instance billing type. The default value of CVM is handled as POSTPAID_BY_HOUR.</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepayment, which is monthly subscription</li><li>CDCPAID: dedicated cluster payment</li> 
     * @return InstanceChargeType <p>Instance billing type. The default value of CVM is handled as POSTPAID_BY_HOUR.</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepayment, which is monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type. The default value of CVM is handled as POSTPAID_BY_HOUR.</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepayment, which is monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     * @param InstanceChargeType <p>Instance billing type. The default value of CVM is handled as POSTPAID_BY_HOUR.</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepayment, which is monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Market options of the instance, such as spot instance parameters. This parameter is required if the payment mode of the specified instance is spot payment.</p> 
     * @return InstanceMarketOptions <p>Market options of the instance, such as spot instance parameters. This parameter is required if the payment mode of the specified instance is spot payment.</p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>Market options of the instance, such as spot instance parameters. This parameter is required if the payment mode of the specified instance is spot payment.</p>
     * @param InstanceMarketOptions <p>Market options of the instance, such as spot instance parameters. This parameter is required if the payment mode of the specified instance is spot payment.</p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>Instance model list. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive. One and only one of them must be filled in. To obtain the specific values, call the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to get the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p> 
     * @return InstanceTypes <p>Instance model list. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive. One and only one of them must be filled in. To obtain the specific values, call the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to get the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>Instance model list. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive. One and only one of them must be filled in. To obtain the specific values, call the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to get the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     * @param InstanceTypes <p>Instance model list. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>The <code>InstanceType</code> and <code>InstanceTypes</code> parameters are mutually exclusive. One and only one of them must be filled in. To obtain the specific values, call the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to get the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p> 
     * @return CamRoleName <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
     * @param CamRoleName <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get <p>Instance type validation policy. Valid values include ALL and ANY. Default value: ANY. This parameter is valid only when InstanceTypes contains multiple models.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li><li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li><p>Common causes of InstanceTypes unavailable include the instance type sold out and the corresponding cloud disk sold out.<br>If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.</p> 
     * @return InstanceTypesCheckPolicy <p>Instance type validation policy. Valid values include ALL and ANY. Default value: ANY. This parameter is valid only when InstanceTypes contains multiple models.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li><li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li><p>Common causes of InstanceTypes unavailable include the instance type sold out and the corresponding cloud disk sold out.<br>If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.</p>
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set <p>Instance type validation policy. Valid values include ALL and ANY. Default value: ANY. This parameter is valid only when InstanceTypes contains multiple models.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li><li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li><p>Common causes of InstanceTypes unavailable include the instance type sold out and the corresponding cloud disk sold out.<br>If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.</p>
     * @param InstanceTypesCheckPolicy <p>Instance type validation policy. Valid values include ALL and ANY. Default value: ANY. This parameter is valid only when InstanceTypes contains multiple models.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li><li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li><p>Common causes of InstanceTypes unavailable include the instance type sold out and the corresponding cloud disk sold out.<br>If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.</p>
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get <p>Tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. A maximum of 10 tags can be specified.</p> 
     * @return InstanceTags <p>Tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. A maximum of 10 tags can be specified.</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. A maximum of 10 tags can be specified.</p>
     * @param InstanceTags <p>Tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. A maximum of 10 tags can be specified.</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Tag description list. By specifying this parameter, you can bind tags to a launch configuration. Each launch configuration supports up to 30 tags.</p> 
     * @return Tags <p>Tag description list. By specifying this parameter, you can bind tags to a launch configuration. Each launch configuration supports up to 30 tags.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag description list. By specifying this parameter, you can bind tags to a launch configuration. Each launch configuration supports up to 30 tags.</p>
     * @param Tags <p>Tag description list. By specifying this parameter, you can bind tags to a launch configuration. Each launch configuration supports up to 30 tags.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Related settings of the CVM host name (HostName).<br>Setting the host name for windows instances is unsupported.<br>When adding this attribute, you must pass the CVM host name. Other unspecified fields will be set to default values.<br>The host name (with the suffix added if it exists) is verified against a maximum length of 46 characters.</p> 
     * @return HostNameSettings <p>Related settings of the CVM host name (HostName).<br>Setting the host name for windows instances is unsupported.<br>When adding this attribute, you must pass the CVM host name. Other unspecified fields will be set to default values.<br>The host name (with the suffix added if it exists) is verified against a maximum length of 46 characters.</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>Related settings of the CVM host name (HostName).<br>Setting the host name for windows instances is unsupported.<br>When adding this attribute, you must pass the CVM host name. Other unspecified fields will be set to default values.<br>The host name (with the suffix added if it exists) is verified against a maximum length of 46 characters.</p>
     * @param HostNameSettings <p>Related settings of the CVM host name (HostName).<br>Setting the host name for windows instances is unsupported.<br>When adding this attribute, you must pass the CVM host name. Other unspecified fields will be set to default values.<br>The host name (with the suffix added if it exists) is verified against a maximum length of 46 characters.</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>Related settings of CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group is set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group is set as "as-{{ scaling group AutoScalingGroupName }}" and transmitted to CVM.<br>When adding new this attribute, the instance name of the CVM must be transmitted. Other fields not transmitted will be set as default values.<br>It will verify whether the instance name (plus the suffix if it exists) exceeds the maximum length of 108 characters.</p> 
     * @return InstanceNameSettings <p>Related settings of CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group is set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group is set as "as-{{ scaling group AutoScalingGroupName }}" and transmitted to CVM.<br>When adding new this attribute, the instance name of the CVM must be transmitted. Other fields not transmitted will be set as default values.<br>It will verify whether the instance name (plus the suffix if it exists) exceeds the maximum length of 108 characters.</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>Related settings of CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group is set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group is set as "as-{{ scaling group AutoScalingGroupName }}" and transmitted to CVM.<br>When adding new this attribute, the instance name of the CVM must be transmitted. Other fields not transmitted will be set as default values.<br>It will verify whether the instance name (plus the suffix if it exists) exceeds the maximum length of 108 characters.</p>
     * @param InstanceNameSettings <p>Related settings of CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group is set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group is set as "as-{{ scaling group AutoScalingGroupName }}" and transmitted to CVM.<br>When adding new this attribute, the instance name of the CVM must be transmitted. Other fields not transmitted will be set as default values.<br>It will verify whether the instance name (plus the suffix if it exists) exceeds the maximum length of 108 characters.</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. If the billing mode of the specified instance is prepaid, this parameter must be passed.</p> 
     * @return InstanceChargePrepaid <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. If the billing mode of the specified instance is prepaid, this parameter must be passed.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. If the billing mode of the specified instance is prepaid, this parameter must be passed.</p>
     * @param InstanceChargePrepaid <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. If the billing mode of the specified instance is prepaid, this parameter must be passed.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>Cloud disk type selection policy. Default value: ORIGINAL. Value range:</p><li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select the currently available cloud disk type</li> 
     * @return DiskTypePolicy <p>Cloud disk type selection policy. Default value: ORIGINAL. Value range:</p><li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select the currently available cloud disk type</li>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>Cloud disk type selection policy. Default value: ORIGINAL. Value range:</p><li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select the currently available cloud disk type</li>
     * @param DiskTypePolicy <p>Cloud disk type selection policy. Default value: ORIGINAL. Value range:</p><li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select the currently available cloud disk type</li>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p> 
     * @return HpcClusterId <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p>
     * @param HpcClusterId <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p>
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get <p>Public network bandwidth-related information settings for IPv6. If the new instance contains an IPv6 address, this parameter can allocate public network bandwidth to the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p> 
     * @return IPv6InternetAccessible <p>Public network bandwidth-related information settings for IPv6. If the new instance contains an IPv6 address, this parameter can allocate public network bandwidth to the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set <p>Public network bandwidth-related information settings for IPv6. If the new instance contains an IPv6 address, this parameter can allocate public network bandwidth to the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     * @param IPv6InternetAccessible <p>Public network bandwidth-related information settings for IPv6. If the new instance contains an IPv6 address, this parameter can allocate public network bandwidth to the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     */
    public void setIPv6InternetAccessible(IPv6InternetAccessible IPv6InternetAccessible) {
        this.IPv6InternetAccessible = IPv6InternetAccessible;
    }

    /**
     * Get <p>Placement Group id. Only one can be specified.</p> 
     * @return DisasterRecoverGroupIds <p>Placement Group id. Only one can be specified.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>Placement Group id. Only one can be specified.</p>
     * @param DisasterRecoverGroupIds <p>Placement Group id. Only one can be specified.</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>Image family name. Either image Id or image family name must be specified, and one and only one must be filled in. This parameter can be obtained through the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p> 
     * @return ImageFamily <p>Image family name. Either image Id or image family name must be specified, and one and only one must be filled in. This parameter can be obtained through the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>Image family name. Either image Id or image family name must be specified, and one and only one must be filled in. This parameter can be obtained through the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     * @param ImageFamily <p>Image family name. Either image Id or image family name must be specified, and one and only one must be filled in. This parameter can be obtained through the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>CDC ID. Obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/1346/73758?from_cn_redirect=1">DescribeDedicatedClusters</a> API.</p> 
     * @return DedicatedClusterId <p>CDC ID. Obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/1346/73758?from_cn_redirect=1">DescribeDedicatedClusters</a> API.</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>CDC ID. Obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/1346/73758?from_cn_redirect=1">DescribeDedicatedClusters</a> API.</p>
     * @param DedicatedClusterId <p>CDC ID. Obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/1346/73758?from_cn_redirect=1">DescribeDedicatedClusters</a> API.</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>Custom metadata.</p> 
     * @return Metadata <p>Custom metadata.</p>
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Custom metadata.</p>
     * @param Metadata <p>Custom metadata.</p>
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Configure the elastic network interface for scale-out instances.</p><p>Input limits: up to 17 items. When configuring this parameter, you must explicitly include and can only include one PRIMARY. AS does not auto-complete the primary ENI. An explicitly empty array is illegal. Spot instances do not support this parameter.</p><p>The VPC and subnet are automatically injected by the scaling group based on the current candidate subnets. If not configured, they are not transmitted to CVM. The SecurityGroupIds parameter in the launch configuration is retained.</p> 
     * @return NetworkInterfaces <p>Configure the elastic network interface for scale-out instances.</p><p>Input limits: up to 17 items. When configuring this parameter, you must explicitly include and can only include one PRIMARY. AS does not auto-complete the primary ENI. An explicitly empty array is illegal. Spot instances do not support this parameter.</p><p>The VPC and subnet are automatically injected by the scaling group based on the current candidate subnets. If not configured, they are not transmitted to CVM. The SecurityGroupIds parameter in the launch configuration is retained.</p>
     */
    public NetworkInterface [] getNetworkInterfaces() {
        return this.NetworkInterfaces;
    }

    /**
     * Set <p>Configure the elastic network interface for scale-out instances.</p><p>Input limits: up to 17 items. When configuring this parameter, you must explicitly include and can only include one PRIMARY. AS does not auto-complete the primary ENI. An explicitly empty array is illegal. Spot instances do not support this parameter.</p><p>The VPC and subnet are automatically injected by the scaling group based on the current candidate subnets. If not configured, they are not transmitted to CVM. The SecurityGroupIds parameter in the launch configuration is retained.</p>
     * @param NetworkInterfaces <p>Configure the elastic network interface for scale-out instances.</p><p>Input limits: up to 17 items. When configuring this parameter, you must explicitly include and can only include one PRIMARY. AS does not auto-complete the primary ENI. An explicitly empty array is illegal. Spot instances do not support this parameter.</p><p>The VPC and subnet are automatically injected by the scaling group based on the current candidate subnets. If not configured, they are not transmitted to CVM. The SecurityGroupIds parameter in the launch configuration is retained.</p>
     */
    public void setNetworkInterfaces(NetworkInterface [] NetworkInterfaces) {
        this.NetworkInterfaces = NetworkInterfaces;
    }

    public CreateLaunchConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaunchConfigurationRequest(CreateLaunchConfigurationRequest source) {
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
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
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.InstanceTypesCheckPolicy != null) {
            this.InstanceTypesCheckPolicy = new String(source.InstanceTypesCheckPolicy);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTag(source.InstanceTags[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HostNameSettings != null) {
            this.HostNameSettings = new HostNameSettings(source.HostNameSettings);
        }
        if (source.InstanceNameSettings != null) {
            this.InstanceNameSettings = new InstanceNameSettings(source.InstanceNameSettings);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DiskTypePolicy != null) {
            this.DiskTypePolicy = new String(source.DiskTypePolicy);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.IPv6InternetAccessible != null) {
            this.IPv6InternetAccessible = new IPv6InternetAccessible(source.IPv6InternetAccessible);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.NetworkInterfaces != null) {
            this.NetworkInterfaces = new NetworkInterface[source.NetworkInterfaces.length];
            for (int i = 0; i < source.NetworkInterfaces.length; i++) {
                this.NetworkInterfaces[i] = new NetworkInterface(source.NetworkInterfaces[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArrayObj(map, prefix + "NetworkInterfaces.", this.NetworkInterfaces);

    }
}

