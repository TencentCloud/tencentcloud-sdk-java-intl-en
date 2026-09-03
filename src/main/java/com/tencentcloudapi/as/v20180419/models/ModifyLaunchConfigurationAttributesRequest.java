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

public class ModifyLaunchConfigurationAttributesRequest extends AbstractModel {

    /**
    * <p>Launch configuration ID. You can obtain it by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a> or calling the <a href="https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> API, and retrieving LaunchConfigurationId from the returned information.</p>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can obtain an available image ID in the following ways:<br><li>For <code>public images</code>, <code>custom images</code>, and <code>shared images</code>, query the image ID by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>. For <code>service market images</code>, query the image ID in the <a href="https://market.cloud.tencent.com/list">cloud market</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and take the <code>ImageId</code> field from the returned information.</li></p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Types of CVM instances. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>InstanceType specifies a single instance type. By setting InstanceTypes, you can specify multiple instance types and invalidate the original InstanceType. Specific values can be obtained by calling the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to obtain the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>Instance type validation policy, effective during actual modification of InstanceTypes. Valid values include ALL and ANY, default value: ANY.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li> <li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li> Common causes of InstanceTypes unavailable include InstanceType sold out, corresponding cloud disk sold out. If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>The custom data after Base64 encoding should not exceed 16 KB. To clear UserData, assign it an empty string.</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>Security group to which the instance belongs. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API and getting the <code>SecurityGroupId</code> field in the return value.<br>If you specify this parameter, provide at least one security group, and the list order is sequential.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Public network bandwidth-related information settings.<br>When the public network outbound bandwidth cap is 0 Mbps, it cannot be modified to enable assigning public IP. Accordingly, when assigning public IP is currently enabled, the modified public network outbound bandwidth cap must be greater than 0 Mbps.</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>Instance billing type. Valid values:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, which is a Monthly Subscription</li><li>CDCPAID: dedicated cluster payment</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can set attributes such as the duration of instance purchase and whether to enable auto-renewal.<br>If you change the payment mode of an instance to prepaid, this parameter is required. When changing from prepaid to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must specify the duration of instance purchase. Other fields not specified will be set to default values.<br>When modifying this field, the current payment mode must be prepaid.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>Market-related options of the instance, such as bidding instance parameters.<br>If you change the payment mode of the instance to spot payment, this parameter is required. When changing from spot payment to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must transmit the bid price under relevant spot options. Other fields not transmitted will be set as default.<br>When modifying this field, the current payment mode must be spot payment.</p>
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>Cloud disk type selection policy. Value range:</p><li>ORIGINAL: use the set cloud disk type.</li><li>AUTOMATIC: automatically select the currently available cloud disk type.</li>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>Instance system disk configuration information.</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>Instance data disk configuration information.<br>Supports up to 11 data disks. Apply the modification as a whole, so provide all values after modification.<br>The data disk type is consistent with the system disk type by default.</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>Settings for the CVM host name.<br>Configuring the host name for windows instances is not supported.<br>When adding this attribute, you must transmit the CVM host name. Other fields not transmitted will be set to default values.<br>The host name (with the suffix added if it exists) is verified to check whether it exceeds the maximum length of 46 characters.</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>Settings related to the CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group will be set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group will be set as "as-{{ AutoScalingGroupName }}" and transmitted to CVM.<br>When adding this attribute, the CVM instance name must be transmitted. Other fields not transmitted will be set to default values.<br>It will verify whether the instance name (with the suffix added if it exists) exceeds the maximum length of 108 characters.</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>Enhanced service. This parameter can be used to specify whether to enable services such as cloud security and Cloud Monitor.</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>Hyper Computing Cluster ID. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/83220?from_cn_redirect=1">DescribeHpcClusters</a> API.<br>Note: This field is empty by default.</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>IPv6 public network bandwidth-related information settings. If the new instance includes an IPv6 address, this parameter can allocate public network bandwidth for the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
    */
    @SerializedName("IPv6InternetAccessible")
    @Expose
    private IPv6InternetAccessible IPv6InternetAccessible;

    /**
    * <p>Placement Group id. Only one can be specified. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a> API.</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>Instance login settings, including passwords, keys, or maintaining the image's original login settings.<br>Please note that specifying new login settings overwrites existing login settings. For example, if you previously used a password to login, use this parameter to change login settings to a key, and the original password is removed.</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>Instance tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. Up to 10 Tags can be specified.<br>This parameter overrides the original instance tag list. To add a tag, import both the new tag and the original tags.</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>Image family name. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>Local exclusive cluster ID.</p>
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
    * <p>Replace the ENI configuration in the launch configuration.</p><p>Input limits: up to 17 items; must explicitly include and can only contain one PRIMARY. AS does not auto-complete the primary ENI. An explicit empty array is illegal.</p><p>Field rules match CreateLaunchConfiguration. To clean up, call ClearLaunchConfigurationAttributes with ClearNetworkInterfaces=true.</p>
    */
    @SerializedName("NetworkInterfaces")
    @Expose
    private NetworkInterface [] NetworkInterfaces;

    /**
     * Get <p>Launch configuration ID. You can obtain it by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a> or calling the <a href="https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> API, and retrieving LaunchConfigurationId from the returned information.</p> 
     * @return LaunchConfigurationId <p>Launch configuration ID. You can obtain it by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a> or calling the <a href="https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> API, and retrieving LaunchConfigurationId from the returned information.</p>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>Launch configuration ID. You can obtain it by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a> or calling the <a href="https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> API, and retrieving LaunchConfigurationId from the returned information.</p>
     * @param LaunchConfigurationId <p>Launch configuration ID. You can obtain it by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a> or calling the <a href="https://www.tencentcloud.com/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> API, and retrieving LaunchConfigurationId from the returned information.</p>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can obtain an available image ID in the following ways:<br><li>For <code>public images</code>, <code>custom images</code>, and <code>shared images</code>, query the image ID by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>. For <code>service market images</code>, query the image ID in the <a href="https://market.cloud.tencent.com/list">cloud market</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and take the <code>ImageId</code> field from the returned information.</li></p> 
     * @return ImageId <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can obtain an available image ID in the following ways:<br><li>For <code>public images</code>, <code>custom images</code>, and <code>shared images</code>, query the image ID by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>. For <code>service market images</code>, query the image ID in the <a href="https://market.cloud.tencent.com/list">cloud market</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and take the <code>ImageId</code> field from the returned information.</li></p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can obtain an available image ID in the following ways:<br><li>For <code>public images</code>, <code>custom images</code>, and <code>shared images</code>, query the image ID by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>. For <code>service market images</code>, query the image ID in the <a href="https://market.cloud.tencent.com/list">cloud market</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and take the <code>ImageId</code> field from the returned information.</li></p>
     * @param ImageId <p>Specify a valid <a href="https://www.tencentcloud.com/document/product/213/4940?from_cn_redirect=1">image</a> ID, such as <code>img-8toqc6s3</code>. There are four image types:<br><li>Public image</li><li>Custom image</li><li>Shared image</li><li>Service market image</li><br>You can obtain an available image ID in the following ways:<br><li>For <code>public images</code>, <code>custom images</code>, and <code>shared images</code>, query the image ID by logging in to the <a href="https://console.cloud.tencent.com/cvm/image?rid=1&amp;imageType=PUBLIC_IMAGE">console</a>. For <code>service market images</code>, query the image ID in the <a href="https://market.cloud.tencent.com/list">cloud market</a>.</li><li>Call the <a href="https://www.tencentcloud.com/document/api/213/15715?from_cn_redirect=1">DescribeImages</a> API and take the <code>ImageId</code> field from the returned information.</li></p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Types of CVM instances. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>InstanceType specifies a single instance type. By setting InstanceTypes, you can specify multiple instance types and invalidate the original InstanceType. Specific values can be obtained by calling the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to obtain the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p> 
     * @return InstanceTypes <p>Types of CVM instances. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>InstanceType specifies a single instance type. By setting InstanceTypes, you can specify multiple instance types and invalidate the original InstanceType. Specific values can be obtained by calling the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to obtain the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>Types of CVM instances. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>InstanceType specifies a single instance type. By setting InstanceTypes, you can specify multiple instance types and invalidate the original InstanceType. Specific values can be obtained by calling the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to obtain the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     * @param InstanceTypes <p>Types of CVM instances. Different instance models specify different resource specifications, and a maximum of 10 instance models are supported.<br>InstanceType specifies a single instance type. By setting InstanceTypes, you can specify multiple instance types and invalidate the original InstanceType. Specific values can be obtained by calling the API <a href="https://www.tencentcloud.com/document/api/213/15749?from_cn_redirect=1">DescribeInstanceTypeConfigs</a> to obtain the latest specification table or see <a href="https://www.tencentcloud.com/document/product/213/11518?from_cn_redirect=1">Instance Specifications</a>.</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>Instance type validation policy, effective during actual modification of InstanceTypes. Valid values include ALL and ANY, default value: ANY.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li> <li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li> Common causes of InstanceTypes unavailable include InstanceType sold out, corresponding cloud disk sold out. If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy. 
     * @return InstanceTypesCheckPolicy <p>Instance type validation policy, effective during actual modification of InstanceTypes. Valid values include ALL and ANY, default value: ANY.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li> <li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li> Common causes of InstanceTypes unavailable include InstanceType sold out, corresponding cloud disk sold out. If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set <p>Instance type validation policy, effective during actual modification of InstanceTypes. Valid values include ALL and ANY, default value: ANY.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li> <li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li> Common causes of InstanceTypes unavailable include InstanceType sold out, corresponding cloud disk sold out. If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     * @param InstanceTypesCheckPolicy <p>Instance type validation policy, effective during actual modification of InstanceTypes. Valid values include ALL and ANY, default value: ANY.</p><li>ALL: Verification passes if all InstanceTypes are available; otherwise, a verification error will be reported.</li> <li>ANY: Verification passes if any InstanceType is available; otherwise, a verification error will be reported.</li> Common causes of InstanceTypes unavailable include InstanceType sold out, corresponding cloud disk sold out. If a model in InstanceTypes does not exist or has been removed, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p> 
     * @return LaunchConfigurationName <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     * @param LaunchConfigurationName <p>Display name of the launch configuration. The name only supports Chinese, English, numbers, underscores, separator "-", and decimal points. The maximum length cannot exceed 60 bytes.</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>The custom data after Base64 encoding should not exceed 16 KB. To clear UserData, assign it an empty string.</p> 
     * @return UserData <p>The custom data after Base64 encoding should not exceed 16 KB. To clear UserData, assign it an empty string.</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>The custom data after Base64 encoding should not exceed 16 KB. To clear UserData, assign it an empty string.</p>
     * @param UserData <p>The custom data after Base64 encoding should not exceed 16 KB. To clear UserData, assign it an empty string.</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>Security group to which the instance belongs. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API and getting the <code>SecurityGroupId</code> field in the return value.<br>If you specify this parameter, provide at least one security group, and the list order is sequential.</p> 
     * @return SecurityGroupIds <p>Security group to which the instance belongs. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API and getting the <code>SecurityGroupId</code> field in the return value.<br>If you specify this parameter, provide at least one security group, and the list order is sequential.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group to which the instance belongs. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API and getting the <code>SecurityGroupId</code> field in the return value.<br>If you specify this parameter, provide at least one security group, and the list order is sequential.</p>
     * @param SecurityGroupIds <p>Security group to which the instance belongs. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API and getting the <code>SecurityGroupId</code> field in the return value.<br>If you specify this parameter, provide at least one security group, and the list order is sequential.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Public network bandwidth-related information settings.<br>When the public network outbound bandwidth cap is 0 Mbps, it cannot be modified to enable assigning public IP. Accordingly, when assigning public IP is currently enabled, the modified public network outbound bandwidth cap must be greater than 0 Mbps.</p> 
     * @return InternetAccessible <p>Public network bandwidth-related information settings.<br>When the public network outbound bandwidth cap is 0 Mbps, it cannot be modified to enable assigning public IP. Accordingly, when assigning public IP is currently enabled, the modified public network outbound bandwidth cap must be greater than 0 Mbps.</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>Public network bandwidth-related information settings.<br>When the public network outbound bandwidth cap is 0 Mbps, it cannot be modified to enable assigning public IP. Accordingly, when assigning public IP is currently enabled, the modified public network outbound bandwidth cap must be greater than 0 Mbps.</p>
     * @param InternetAccessible <p>Public network bandwidth-related information settings.<br>When the public network outbound bandwidth cap is 0 Mbps, it cannot be modified to enable assigning public IP. Accordingly, when assigning public IP is currently enabled, the modified public network outbound bandwidth cap must be greater than 0 Mbps.</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>Instance billing type. Valid values:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, which is a Monthly Subscription</li><li>CDCPAID: dedicated cluster payment</li> 
     * @return InstanceChargeType <p>Instance billing type. Valid values:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, which is a Monthly Subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type. Valid values:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, which is a Monthly Subscription</li><li>CDCPAID: dedicated cluster payment</li>
     * @param InstanceChargeType <p>Instance billing type. Valid values:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, which is a Monthly Subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can set attributes such as the duration of instance purchase and whether to enable auto-renewal.<br>If you change the payment mode of an instance to prepaid, this parameter is required. When changing from prepaid to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must specify the duration of instance purchase. Other fields not specified will be set to default values.<br>When modifying this field, the current payment mode must be prepaid.</p> 
     * @return InstanceChargePrepaid <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can set attributes such as the duration of instance purchase and whether to enable auto-renewal.<br>If you change the payment mode of an instance to prepaid, this parameter is required. When changing from prepaid to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must specify the duration of instance purchase. Other fields not specified will be set to default values.<br>When modifying this field, the current payment mode must be prepaid.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can set attributes such as the duration of instance purchase and whether to enable auto-renewal.<br>If you change the payment mode of an instance to prepaid, this parameter is required. When changing from prepaid to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must specify the duration of instance purchase. Other fields not specified will be set to default values.<br>When modifying this field, the current payment mode must be prepaid.</p>
     * @param InstanceChargePrepaid <p>Prepaid mode, that is, parameter settings related to monthly/annual subscription. By specifying this parameter, you can set attributes such as the duration of instance purchase and whether to enable auto-renewal.<br>If you change the payment mode of an instance to prepaid, this parameter is required. When changing from prepaid to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must specify the duration of instance purchase. Other fields not specified will be set to default values.<br>When modifying this field, the current payment mode must be prepaid.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>Market-related options of the instance, such as bidding instance parameters.<br>If you change the payment mode of the instance to spot payment, this parameter is required. When changing from spot payment to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must transmit the bid price under relevant spot options. Other fields not transmitted will be set as default.<br>When modifying this field, the current payment mode must be spot payment.</p> 
     * @return InstanceMarketOptions <p>Market-related options of the instance, such as bidding instance parameters.<br>If you change the payment mode of the instance to spot payment, this parameter is required. When changing from spot payment to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must transmit the bid price under relevant spot options. Other fields not transmitted will be set as default.<br>When modifying this field, the current payment mode must be spot payment.</p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>Market-related options of the instance, such as bidding instance parameters.<br>If you change the payment mode of the instance to spot payment, this parameter is required. When changing from spot payment to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must transmit the bid price under relevant spot options. Other fields not transmitted will be set as default.<br>When modifying this field, the current payment mode must be spot payment.</p>
     * @param InstanceMarketOptions <p>Market-related options of the instance, such as bidding instance parameters.<br>If you change the payment mode of the instance to spot payment, this parameter is required. When changing from spot payment to other payment modes, the original info in this field is automatically discarded.<br>When adding this field, you must transmit the bid price under relevant spot options. Other fields not transmitted will be set as default.<br>When modifying this field, the current payment mode must be spot payment.</p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>Cloud disk type selection policy. Value range:</p><li>ORIGINAL: use the set cloud disk type.</li><li>AUTOMATIC: automatically select the currently available cloud disk type.</li> 
     * @return DiskTypePolicy <p>Cloud disk type selection policy. Value range:</p><li>ORIGINAL: use the set cloud disk type.</li><li>AUTOMATIC: automatically select the currently available cloud disk type.</li>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>Cloud disk type selection policy. Value range:</p><li>ORIGINAL: use the set cloud disk type.</li><li>AUTOMATIC: automatically select the currently available cloud disk type.</li>
     * @param DiskTypePolicy <p>Cloud disk type selection policy. Value range:</p><li>ORIGINAL: use the set cloud disk type.</li><li>AUTOMATIC: automatically select the currently available cloud disk type.</li>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>Instance system disk configuration information.</p> 
     * @return SystemDisk <p>Instance system disk configuration information.</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>Instance system disk configuration information.</p>
     * @param SystemDisk <p>Instance system disk configuration information.</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>Instance data disk configuration information.<br>Supports up to 11 data disks. Apply the modification as a whole, so provide all values after modification.<br>The data disk type is consistent with the system disk type by default.</p> 
     * @return DataDisks <p>Instance data disk configuration information.<br>Supports up to 11 data disks. Apply the modification as a whole, so provide all values after modification.<br>The data disk type is consistent with the system disk type by default.</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>Instance data disk configuration information.<br>Supports up to 11 data disks. Apply the modification as a whole, so provide all values after modification.<br>The data disk type is consistent with the system disk type by default.</p>
     * @param DataDisks <p>Instance data disk configuration information.<br>Supports up to 11 data disks. Apply the modification as a whole, so provide all values after modification.<br>The data disk type is consistent with the system disk type by default.</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>Settings for the CVM host name.<br>Configuring the host name for windows instances is not supported.<br>When adding this attribute, you must transmit the CVM host name. Other fields not transmitted will be set to default values.<br>The host name (with the suffix added if it exists) is verified to check whether it exceeds the maximum length of 46 characters.</p> 
     * @return HostNameSettings <p>Settings for the CVM host name.<br>Configuring the host name for windows instances is not supported.<br>When adding this attribute, you must transmit the CVM host name. Other fields not transmitted will be set to default values.<br>The host name (with the suffix added if it exists) is verified to check whether it exceeds the maximum length of 46 characters.</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>Settings for the CVM host name.<br>Configuring the host name for windows instances is not supported.<br>When adding this attribute, you must transmit the CVM host name. Other fields not transmitted will be set to default values.<br>The host name (with the suffix added if it exists) is verified to check whether it exceeds the maximum length of 46 characters.</p>
     * @param HostNameSettings <p>Settings for the CVM host name.<br>Configuring the host name for windows instances is not supported.<br>When adding this attribute, you must transmit the CVM host name. Other fields not transmitted will be set to default values.<br>The host name (with the suffix added if it exists) is verified to check whether it exceeds the maximum length of 46 characters.</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>Settings related to the CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group will be set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group will be set as "as-{{ AutoScalingGroupName }}" and transmitted to CVM.<br>When adding this attribute, the CVM instance name must be transmitted. Other fields not transmitted will be set to default values.<br>It will verify whether the instance name (with the suffix added if it exists) exceeds the maximum length of 108 characters.</p> 
     * @return InstanceNameSettings <p>Settings related to the CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group will be set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group will be set as "as-{{ AutoScalingGroupName }}" and transmitted to CVM.<br>When adding this attribute, the CVM instance name must be transmitted. Other fields not transmitted will be set to default values.<br>It will verify whether the instance name (with the suffix added if it exists) exceeds the maximum length of 108 characters.</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>Settings related to the CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group will be set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group will be set as "as-{{ AutoScalingGroupName }}" and transmitted to CVM.<br>When adding this attribute, the CVM instance name must be transmitted. Other fields not transmitted will be set to default values.<br>It will verify whether the instance name (with the suffix added if it exists) exceeds the maximum length of 108 characters.</p>
     * @param InstanceNameSettings <p>Settings related to the CVM instance name (InstanceName).<br>If the user sets this field in the launch configuration, the InstanceName of instances created by the scaling group will be set according to this field and transmitted to CVM. If the user does not set this field in the launch configuration, the InstanceName of instances created by the scaling group will be set as "as-{{ AutoScalingGroupName }}" and transmitted to CVM.<br>When adding this attribute, the CVM instance name must be transmitted. Other fields not transmitted will be set to default values.<br>It will verify whether the instance name (with the suffix added if it exists) exceeds the maximum length of 108 characters.</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>Enhanced service. This parameter can be used to specify whether to enable services such as cloud security and Cloud Monitor.</p> 
     * @return EnhancedService <p>Enhanced service. This parameter can be used to specify whether to enable services such as cloud security and Cloud Monitor.</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>Enhanced service. This parameter can be used to specify whether to enable services such as cloud security and Cloud Monitor.</p>
     * @param EnhancedService <p>Enhanced service. This parameter can be used to specify whether to enable services such as cloud security and Cloud Monitor.</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
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
     * Get <p>IPv6 public network bandwidth-related information settings. If the new instance includes an IPv6 address, this parameter can allocate public network bandwidth for the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p> 
     * @return IPv6InternetAccessible <p>IPv6 public network bandwidth-related information settings. If the new instance includes an IPv6 address, this parameter can allocate public network bandwidth for the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set <p>IPv6 public network bandwidth-related information settings. If the new instance includes an IPv6 address, this parameter can allocate public network bandwidth for the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     * @param IPv6InternetAccessible <p>IPv6 public network bandwidth-related information settings. If the new instance includes an IPv6 address, this parameter can allocate public network bandwidth for the IPv6 address of the new instance. When the Ipv6AddressCount parameter of the scaling group associated with the launch configuration is 0, this parameter will not take effect.</p>
     */
    public void setIPv6InternetAccessible(IPv6InternetAccessible IPv6InternetAccessible) {
        this.IPv6InternetAccessible = IPv6InternetAccessible;
    }

    /**
     * Get <p>Placement Group id. Only one can be specified. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a> API.</p> 
     * @return DisasterRecoverGroupIds <p>Placement Group id. Only one can be specified. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a> API.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>Placement Group id. Only one can be specified. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a> API.</p>
     * @param DisasterRecoverGroupIds <p>Placement Group id. Only one can be specified. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a> API.</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>Instance login settings, including passwords, keys, or maintaining the image's original login settings.<br>Please note that specifying new login settings overwrites existing login settings. For example, if you previously used a password to login, use this parameter to change login settings to a key, and the original password is removed.</p> 
     * @return LoginSettings <p>Instance login settings, including passwords, keys, or maintaining the image's original login settings.<br>Please note that specifying new login settings overwrites existing login settings. For example, if you previously used a password to login, use this parameter to change login settings to a key, and the original password is removed.</p>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>Instance login settings, including passwords, keys, or maintaining the image's original login settings.<br>Please note that specifying new login settings overwrites existing login settings. For example, if you previously used a password to login, use this parameter to change login settings to a key, and the original password is removed.</p>
     * @param LoginSettings <p>Instance login settings, including passwords, keys, or maintaining the image's original login settings.<br>Please note that specifying new login settings overwrites existing login settings. For example, if you previously used a password to login, use this parameter to change login settings to a key, and the original password is removed.</p>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>Instance tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. Up to 10 Tags can be specified.<br>This parameter overrides the original instance tag list. To add a tag, import both the new tag and the original tags.</p> 
     * @return InstanceTags <p>Instance tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. Up to 10 Tags can be specified.<br>This parameter overrides the original instance tag list. To add a tag, import both the new tag and the original tags.</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Instance tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. Up to 10 Tags can be specified.<br>This parameter overrides the original instance tag list. To add a tag, import both the new tag and the original tags.</p>
     * @param InstanceTags <p>Instance tag list. By specifying this parameter, the instances added through scale-out can be bound to the tag. Up to 10 Tags can be specified.<br>This parameter overrides the original instance tag list. To add a tag, import both the new tag and the original tags.</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Image family name. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p> 
     * @return ImageFamily <p>Image family name. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>Image family name. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     * @param ImageFamily <p>Image family name. You can obtain this parameter by calling the <a href="https://www.tencentcloud.com/document/product/213/15715?from_cn_redirect=1">DescribeImages</a> API.</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>Local exclusive cluster ID.</p> 
     * @return DedicatedClusterId <p>Local exclusive cluster ID.</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>Local exclusive cluster ID.</p>
     * @param DedicatedClusterId <p>Local exclusive cluster ID.</p>
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
     * Get <p>Replace the ENI configuration in the launch configuration.</p><p>Input limits: up to 17 items; must explicitly include and can only contain one PRIMARY. AS does not auto-complete the primary ENI. An explicit empty array is illegal.</p><p>Field rules match CreateLaunchConfiguration. To clean up, call ClearLaunchConfigurationAttributes with ClearNetworkInterfaces=true.</p> 
     * @return NetworkInterfaces <p>Replace the ENI configuration in the launch configuration.</p><p>Input limits: up to 17 items; must explicitly include and can only contain one PRIMARY. AS does not auto-complete the primary ENI. An explicit empty array is illegal.</p><p>Field rules match CreateLaunchConfiguration. To clean up, call ClearLaunchConfigurationAttributes with ClearNetworkInterfaces=true.</p>
     */
    public NetworkInterface [] getNetworkInterfaces() {
        return this.NetworkInterfaces;
    }

    /**
     * Set <p>Replace the ENI configuration in the launch configuration.</p><p>Input limits: up to 17 items; must explicitly include and can only contain one PRIMARY. AS does not auto-complete the primary ENI. An explicit empty array is illegal.</p><p>Field rules match CreateLaunchConfiguration. To clean up, call ClearLaunchConfigurationAttributes with ClearNetworkInterfaces=true.</p>
     * @param NetworkInterfaces <p>Replace the ENI configuration in the launch configuration.</p><p>Input limits: up to 17 items; must explicitly include and can only contain one PRIMARY. AS does not auto-complete the primary ENI. An explicit empty array is illegal.</p><p>Field rules match CreateLaunchConfiguration. To clean up, call ClearLaunchConfigurationAttributes with ClearNetworkInterfaces=true.</p>
     */
    public void setNetworkInterfaces(NetworkInterface [] NetworkInterfaces) {
        this.NetworkInterfaces = NetworkInterfaces;
    }

    public ModifyLaunchConfigurationAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLaunchConfigurationAttributesRequest(ModifyLaunchConfigurationAttributesRequest source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.InstanceTypesCheckPolicy != null) {
            this.InstanceTypesCheckPolicy = new String(source.InstanceTypesCheckPolicy);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.DiskTypePolicy != null) {
            this.DiskTypePolicy = new String(source.DiskTypePolicy);
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
        if (source.HostNameSettings != null) {
            this.HostNameSettings = new HostNameSettings(source.HostNameSettings);
        }
        if (source.InstanceNameSettings != null) {
            this.InstanceNameSettings = new InstanceNameSettings(source.InstanceNameSettings);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
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
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTag(source.InstanceTags[i]);
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
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArrayObj(map, prefix + "NetworkInterfaces.", this.NetworkInterfaces);

    }
}

