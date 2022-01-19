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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLaunchConfigurationAttributesRequest extends AbstractModel{

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Valid [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-8toqc6s3`. There are four types of images: <br/><li>Public images </li><li>Custom images </li><li>Shared images </li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways: <br/><li>For `public images`, `custom images`, and `shared images`, log in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE) to query the image IDs; for `marketplace images`, query the image IDs through [Cloud Marketplace](https://market.cloud.tencent.com/list). </li><li>This value can be obtained from the `ImageId` field in the return value of the [DescribeImages API](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1).</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * List of instance types. Each type specifies different resource specifications. This list contains up to 10 instance types.
The launch configuration uses `InstanceType` to indicate one single instance type and `InstanceTypes` to indicate multiple instance types. Specifying the `InstanceTypes` field will invalidate the original `InstanceType`.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Instance type verification policy which works when InstanceTypes is actually modified. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will success only if all instance types (InstanceType) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any instance type (InstanceType) is available; otherwise, an error will be reported.

Common reasons why an instance type is unavailable include stock-out of the instance type or the corresponding cloud disk.
If a model in InstanceTypes does not exist or has been discontinued, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * Display name of the launch configuration, which can contain Chinese characters, letters, numbers, underscores, separators ("-"), and decimal points with a maximum length of 60 bytes.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Base64-encoded custom data of up to 16 KB. If you want to clear `UserData`, set it to an empty string.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Security group to which the instance belongs. This parameter can be obtained from the `SecurityGroupId` field in the response of the [`DescribeSecurityGroups`](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
At least one security group is required for this parameter. The security group specified is sequential.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Information of the public network bandwidth configuration.
When the public outbound network bandwidth is 0 Mbps, assigning a public IP is not allowed. Accordingly, if a public IP is assigned, the new public network outbound bandwidth must be greater than 0 Mbps.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Instance billing mode. Valid values:
<br><li>POSTPAID_BY_HOUR: pay-as-you-go hourly
<br><li>SPOTPAID: spot instance
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set the auto-renewal, and other attributes of the monthly-subscribed instances.
This parameter is required when changing the instance billing mode to monthly subscription. It will be automatically discarded after you choose another billing mode.
This field requires passing in the `Period` field. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is monthly subscription.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Market-related options for instances, such as parameters related to spot instances.
This parameter is required when changing the instance billing mode to spot instance. It will be automatically discarded after you choose another instance billing mode.
This field requires passing in the `MaxPrice` field under the `SpotOptions`. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is spot instance.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * Selection policy of cloud disks. Default value: ORIGINAL. Valid values:
<br><li>ORIGINAL: uses the configured cloud disk type
<br><li>AUTOMATIC: automatically chooses an available cloud disk type
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * Instance system disk configurations
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Configuration information of instance data disks.
Up to 11 data disks can be specified and will be collectively modified. Please provide all the new values for the modification.
The default data disk should be the same as the system disk.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * CVM hostname settings.
This field is not supported for Windows instances.
This field requires passing the `HostName` field. Other fields that are not passed in will use their default values.
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * Settings of CVM instance names. 
If this field is configured in a launch configuration, the `InstanceName` of a CVM created by the scaling group will be generated according to the configuration; otherwise, it will be in the `as-{{AutoScalingGroupName }}` format.
This field requires passing in the `InstanceName` field. Other fields that are not passed in will use their default values.
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * Specifies whether to enable additional services, such as security services and monitoring service.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API.
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
     * Get Launch configuration ID 
     * @return LaunchConfigurationId Launch configuration ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set Launch configuration ID
     * @param LaunchConfigurationId Launch configuration ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get Valid [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-8toqc6s3`. There are four types of images: <br/><li>Public images </li><li>Custom images </li><li>Shared images </li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways: <br/><li>For `public images`, `custom images`, and `shared images`, log in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE) to query the image IDs; for `marketplace images`, query the image IDs through [Cloud Marketplace](https://market.cloud.tencent.com/list). </li><li>This value can be obtained from the `ImageId` field in the return value of the [DescribeImages API](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1).</li> 
     * @return ImageId Valid [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-8toqc6s3`. There are four types of images: <br/><li>Public images </li><li>Custom images </li><li>Shared images </li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways: <br/><li>For `public images`, `custom images`, and `shared images`, log in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE) to query the image IDs; for `marketplace images`, query the image IDs through [Cloud Marketplace](https://market.cloud.tencent.com/list). </li><li>This value can be obtained from the `ImageId` field in the return value of the [DescribeImages API](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1).</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Valid [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-8toqc6s3`. There are four types of images: <br/><li>Public images </li><li>Custom images </li><li>Shared images </li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways: <br/><li>For `public images`, `custom images`, and `shared images`, log in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE) to query the image IDs; for `marketplace images`, query the image IDs through [Cloud Marketplace](https://market.cloud.tencent.com/list). </li><li>This value can be obtained from the `ImageId` field in the return value of the [DescribeImages API](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1).</li>
     * @param ImageId Valid [image](https://intl.cloud.tencent.com/document/product/213/4940?from_cn_redirect=1) ID in the format of `img-8toqc6s3`. There are four types of images: <br/><li>Public images </li><li>Custom images </li><li>Shared images </li><li>Marketplace images </li><br/>You can obtain the available image IDs in the following ways: <br/><li>For `public images`, `custom images`, and `shared images`, log in to the [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE) to query the image IDs; for `marketplace images`, query the image IDs through [Cloud Marketplace](https://market.cloud.tencent.com/list). </li><li>This value can be obtained from the `ImageId` field in the return value of the [DescribeImages API](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1).</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get List of instance types. Each type specifies different resource specifications. This list contains up to 10 instance types.
The launch configuration uses `InstanceType` to indicate one single instance type and `InstanceTypes` to indicate multiple instance types. Specifying the `InstanceTypes` field will invalidate the original `InstanceType`. 
     * @return InstanceTypes List of instance types. Each type specifies different resource specifications. This list contains up to 10 instance types.
The launch configuration uses `InstanceType` to indicate one single instance type and `InstanceTypes` to indicate multiple instance types. Specifying the `InstanceTypes` field will invalidate the original `InstanceType`.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set List of instance types. Each type specifies different resource specifications. This list contains up to 10 instance types.
The launch configuration uses `InstanceType` to indicate one single instance type and `InstanceTypes` to indicate multiple instance types. Specifying the `InstanceTypes` field will invalidate the original `InstanceType`.
     * @param InstanceTypes List of instance types. Each type specifies different resource specifications. This list contains up to 10 instance types.
The launch configuration uses `InstanceType` to indicate one single instance type and `InstanceTypes` to indicate multiple instance types. Specifying the `InstanceTypes` field will invalidate the original `InstanceType`.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Instance type verification policy which works when InstanceTypes is actually modified. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will success only if all instance types (InstanceType) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any instance type (InstanceType) is available; otherwise, an error will be reported.

Common reasons why an instance type is unavailable include stock-out of the instance type or the corresponding cloud disk.
If a model in InstanceTypes does not exist or has been discontinued, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy. 
     * @return InstanceTypesCheckPolicy Instance type verification policy which works when InstanceTypes is actually modified. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will success only if all instance types (InstanceType) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any instance type (InstanceType) is available; otherwise, an error will be reported.

Common reasons why an instance type is unavailable include stock-out of the instance type or the corresponding cloud disk.
If a model in InstanceTypes does not exist or has been discontinued, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set Instance type verification policy which works when InstanceTypes is actually modified. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will success only if all instance types (InstanceType) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any instance type (InstanceType) is available; otherwise, an error will be reported.

Common reasons why an instance type is unavailable include stock-out of the instance type or the corresponding cloud disk.
If a model in InstanceTypes does not exist or has been discontinued, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     * @param InstanceTypesCheckPolicy Instance type verification policy which works when InstanceTypes is actually modified. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will success only if all instance types (InstanceType) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any instance type (InstanceType) is available; otherwise, an error will be reported.

Common reasons why an instance type is unavailable include stock-out of the instance type or the corresponding cloud disk.
If a model in InstanceTypes does not exist or has been discontinued, a verification error will be reported regardless of the value of InstanceTypesCheckPolicy.
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get Display name of the launch configuration, which can contain Chinese characters, letters, numbers, underscores, separators ("-"), and decimal points with a maximum length of 60 bytes. 
     * @return LaunchConfigurationName Display name of the launch configuration, which can contain Chinese characters, letters, numbers, underscores, separators ("-"), and decimal points with a maximum length of 60 bytes.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set Display name of the launch configuration, which can contain Chinese characters, letters, numbers, underscores, separators ("-"), and decimal points with a maximum length of 60 bytes.
     * @param LaunchConfigurationName Display name of the launch configuration, which can contain Chinese characters, letters, numbers, underscores, separators ("-"), and decimal points with a maximum length of 60 bytes.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get Base64-encoded custom data of up to 16 KB. If you want to clear `UserData`, set it to an empty string. 
     * @return UserData Base64-encoded custom data of up to 16 KB. If you want to clear `UserData`, set it to an empty string.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set Base64-encoded custom data of up to 16 KB. If you want to clear `UserData`, set it to an empty string.
     * @param UserData Base64-encoded custom data of up to 16 KB. If you want to clear `UserData`, set it to an empty string.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Security group to which the instance belongs. This parameter can be obtained from the `SecurityGroupId` field in the response of the [`DescribeSecurityGroups`](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
At least one security group is required for this parameter. The security group specified is sequential. 
     * @return SecurityGroupIds Security group to which the instance belongs. This parameter can be obtained from the `SecurityGroupId` field in the response of the [`DescribeSecurityGroups`](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
At least one security group is required for this parameter. The security group specified is sequential.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group to which the instance belongs. This parameter can be obtained from the `SecurityGroupId` field in the response of the [`DescribeSecurityGroups`](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
At least one security group is required for this parameter. The security group specified is sequential.
     * @param SecurityGroupIds Security group to which the instance belongs. This parameter can be obtained from the `SecurityGroupId` field in the response of the [`DescribeSecurityGroups`](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
At least one security group is required for this parameter. The security group specified is sequential.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Information of the public network bandwidth configuration.
When the public outbound network bandwidth is 0 Mbps, assigning a public IP is not allowed. Accordingly, if a public IP is assigned, the new public network outbound bandwidth must be greater than 0 Mbps. 
     * @return InternetAccessible Information of the public network bandwidth configuration.
When the public outbound network bandwidth is 0 Mbps, assigning a public IP is not allowed. Accordingly, if a public IP is assigned, the new public network outbound bandwidth must be greater than 0 Mbps.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Information of the public network bandwidth configuration.
When the public outbound network bandwidth is 0 Mbps, assigning a public IP is not allowed. Accordingly, if a public IP is assigned, the new public network outbound bandwidth must be greater than 0 Mbps.
     * @param InternetAccessible Information of the public network bandwidth configuration.
When the public outbound network bandwidth is 0 Mbps, assigning a public IP is not allowed. Accordingly, if a public IP is assigned, the new public network outbound bandwidth must be greater than 0 Mbps.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Instance billing mode. Valid values:
<br><li>POSTPAID_BY_HOUR: pay-as-you-go hourly
<br><li>SPOTPAID: spot instance 
     * @return InstanceChargeType Instance billing mode. Valid values:
<br><li>POSTPAID_BY_HOUR: pay-as-you-go hourly
<br><li>SPOTPAID: spot instance
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values:
<br><li>POSTPAID_BY_HOUR: pay-as-you-go hourly
<br><li>SPOTPAID: spot instance
     * @param InstanceChargeType Instance billing mode. Valid values:
<br><li>POSTPAID_BY_HOUR: pay-as-you-go hourly
<br><li>SPOTPAID: spot instance
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set the auto-renewal, and other attributes of the monthly-subscribed instances.
This parameter is required when changing the instance billing mode to monthly subscription. It will be automatically discarded after you choose another billing mode.
This field requires passing in the `Period` field. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is monthly subscription. 
     * @return InstanceChargePrepaid Parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set the auto-renewal, and other attributes of the monthly-subscribed instances.
This parameter is required when changing the instance billing mode to monthly subscription. It will be automatically discarded after you choose another billing mode.
This field requires passing in the `Period` field. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is monthly subscription.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set the auto-renewal, and other attributes of the monthly-subscribed instances.
This parameter is required when changing the instance billing mode to monthly subscription. It will be automatically discarded after you choose another billing mode.
This field requires passing in the `Period` field. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is monthly subscription.
     * @param InstanceChargePrepaid Parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set the auto-renewal, and other attributes of the monthly-subscribed instances.
This parameter is required when changing the instance billing mode to monthly subscription. It will be automatically discarded after you choose another billing mode.
This field requires passing in the `Period` field. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is monthly subscription.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Market-related options for instances, such as parameters related to spot instances.
This parameter is required when changing the instance billing mode to spot instance. It will be automatically discarded after you choose another instance billing mode.
This field requires passing in the `MaxPrice` field under the `SpotOptions`. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is spot instance. 
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
This parameter is required when changing the instance billing mode to spot instance. It will be automatically discarded after you choose another instance billing mode.
This field requires passing in the `MaxPrice` field under the `SpotOptions`. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is spot instance.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set Market-related options for instances, such as parameters related to spot instances.
This parameter is required when changing the instance billing mode to spot instance. It will be automatically discarded after you choose another instance billing mode.
This field requires passing in the `MaxPrice` field under the `SpotOptions`. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is spot instance.
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
This parameter is required when changing the instance billing mode to spot instance. It will be automatically discarded after you choose another instance billing mode.
This field requires passing in the `MaxPrice` field under the `SpotOptions`. Other fields that are not passed in will use their default values.
This field can be modified only when the current billing mode is spot instance.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get Selection policy of cloud disks. Default value: ORIGINAL. Valid values:
<br><li>ORIGINAL: uses the configured cloud disk type
<br><li>AUTOMATIC: automatically chooses an available cloud disk type 
     * @return DiskTypePolicy Selection policy of cloud disks. Default value: ORIGINAL. Valid values:
<br><li>ORIGINAL: uses the configured cloud disk type
<br><li>AUTOMATIC: automatically chooses an available cloud disk type
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set Selection policy of cloud disks. Default value: ORIGINAL. Valid values:
<br><li>ORIGINAL: uses the configured cloud disk type
<br><li>AUTOMATIC: automatically chooses an available cloud disk type
     * @param DiskTypePolicy Selection policy of cloud disks. Default value: ORIGINAL. Valid values:
<br><li>ORIGINAL: uses the configured cloud disk type
<br><li>AUTOMATIC: automatically chooses an available cloud disk type
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get Instance system disk configurations 
     * @return SystemDisk Instance system disk configurations
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Instance system disk configurations
     * @param SystemDisk Instance system disk configurations
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Configuration information of instance data disks.
Up to 11 data disks can be specified and will be collectively modified. Please provide all the new values for the modification.
The default data disk should be the same as the system disk. 
     * @return DataDisks Configuration information of instance data disks.
Up to 11 data disks can be specified and will be collectively modified. Please provide all the new values for the modification.
The default data disk should be the same as the system disk.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Configuration information of instance data disks.
Up to 11 data disks can be specified and will be collectively modified. Please provide all the new values for the modification.
The default data disk should be the same as the system disk.
     * @param DataDisks Configuration information of instance data disks.
Up to 11 data disks can be specified and will be collectively modified. Please provide all the new values for the modification.
The default data disk should be the same as the system disk.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get CVM hostname settings.
This field is not supported for Windows instances.
This field requires passing the `HostName` field. Other fields that are not passed in will use their default values. 
     * @return HostNameSettings CVM hostname settings.
This field is not supported for Windows instances.
This field requires passing the `HostName` field. Other fields that are not passed in will use their default values.
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set CVM hostname settings.
This field is not supported for Windows instances.
This field requires passing the `HostName` field. Other fields that are not passed in will use their default values.
     * @param HostNameSettings CVM hostname settings.
This field is not supported for Windows instances.
This field requires passing the `HostName` field. Other fields that are not passed in will use their default values.
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get Settings of CVM instance names. 
If this field is configured in a launch configuration, the `InstanceName` of a CVM created by the scaling group will be generated according to the configuration; otherwise, it will be in the `as-{{AutoScalingGroupName }}` format.
This field requires passing in the `InstanceName` field. Other fields that are not passed in will use their default values. 
     * @return InstanceNameSettings Settings of CVM instance names. 
If this field is configured in a launch configuration, the `InstanceName` of a CVM created by the scaling group will be generated according to the configuration; otherwise, it will be in the `as-{{AutoScalingGroupName }}` format.
This field requires passing in the `InstanceName` field. Other fields that are not passed in will use their default values.
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set Settings of CVM instance names. 
If this field is configured in a launch configuration, the `InstanceName` of a CVM created by the scaling group will be generated according to the configuration; otherwise, it will be in the `as-{{AutoScalingGroupName }}` format.
This field requires passing in the `InstanceName` field. Other fields that are not passed in will use their default values.
     * @param InstanceNameSettings Settings of CVM instance names. 
If this field is configured in a launch configuration, the `InstanceName` of a CVM created by the scaling group will be generated according to the configuration; otherwise, it will be in the `as-{{AutoScalingGroupName }}` format.
This field requires passing in the `InstanceName` field. Other fields that are not passed in will use their default values.
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get Specifies whether to enable additional services, such as security services and monitoring service. 
     * @return EnhancedService Specifies whether to enable additional services, such as security services and monitoring service.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Specifies whether to enable additional services, such as security services and monitoring service.
     * @param EnhancedService Specifies whether to enable additional services, such as security services and monitoring service.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API. 
     * @return CamRoleName CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API.
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API.
     * @param CamRoleName CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API.
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
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

    }
}

