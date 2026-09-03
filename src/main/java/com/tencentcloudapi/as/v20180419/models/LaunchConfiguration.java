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

public class LaunchConfiguration extends AbstractModel {

    /**
    * <p>Project ID of the instance.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Launch configuration ID.</p>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>Startup configuration name.</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>Instance model.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance system disk configuration information.</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>Instance data disk configuration information.</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>Instance login settings.</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * <p>Public network bandwidth-related information settings.</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>Security group to which an instance belongs.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>The scaling group bound to the launch configuration.</p>
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * <p>Custom data.</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>Launch configuration creation time, in standard <code>UTC</code> time.</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Enhanced services enabling situation of the instance and its settings.</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Current status of the launch configuration. Value range: <li>NORMAL: Normal</li><li>IMAGE_ABNORMAL: The launch configuration image is exceptional</li><li>CBS_SNAP_ABNORMAL: The launch configuration data disk snapshot is exceptional</li><li>SECURITY_GROUP_ABNORMAL: The launch configuration security group is exceptional</li></p>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
    * <p>Instance billing type. The value range is as follows:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, i.e. monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Market-related options of the instance, such as spot instance parameters. If the payment mode of the specified instance is spot payment, this parameter is required.</p>
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>Instance model list.</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>Instance tag list. Instances scaled out will automatically come with tags, supporting up to 10 tags.</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>Tag list. The tags in this parameter are only used to bind launch configurations and will not be passed to CVM instances scaled out based on the launch configuration.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Version number.</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private Long VersionNumber;

    /**
    * <p>Update time in standard <code>UTC</code> format.</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>CAM role name, which can be obtained from the roleName in the return value from the <a href="https://www.tencentcloud.com/document/product/598/36223?from_cn_redirect=1">DescribeRoleList</a> API.</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>The value of InstanceTypesCheckPolicy last time when operating.</p>
    */
    @SerializedName("LastOperationInstanceTypesCheckPolicy")
    @Expose
    private String LastOperationInstanceTypesCheckPolicy;

    /**
    * <p>Related settings for the CVM host name (HostName).</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>Related settings for the cloud server instance name (InstanceName).</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>Prepaid mode, i.e., parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode for the specified instance is prepaid.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>Cloud disk type selection policy. Parameter value range: <li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select available cloud disk types in the current AZ</li></p>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>Hyper Computing Cluster ID.<br><br>Note: This field is empty by default.</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>IPv6 public network bandwidth-related information settings.</p>
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
    * <p>Image family name.</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>Local dedicated cluster ID.</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>ENI configuration of the launch configuration.</p>
    */
    @SerializedName("NetworkInterfaces")
    @Expose
    private NetworkInterface [] NetworkInterfaces;

    /**
     * Get <p>Project ID of the instance.</p> 
     * @return ProjectId <p>Project ID of the instance.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID of the instance.</p>
     * @param ProjectId <p>Project ID of the instance.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Launch configuration ID.</p> 
     * @return LaunchConfigurationId <p>Launch configuration ID.</p>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>Launch configuration ID.</p>
     * @param LaunchConfigurationId <p>Launch configuration ID.</p>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>Startup configuration name.</p> 
     * @return LaunchConfigurationName <p>Startup configuration name.</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>Startup configuration name.</p>
     * @param LaunchConfigurationName <p>Startup configuration name.</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>Instance model.</p> 
     * @return InstanceType <p>Instance model.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance model.</p>
     * @param InstanceType <p>Instance model.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get <p>Instance data disk configuration information.</p> 
     * @return DataDisks <p>Instance data disk configuration information.</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>Instance data disk configuration information.</p>
     * @param DataDisks <p>Instance data disk configuration information.</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>Instance login settings.</p> 
     * @return LoginSettings <p>Instance login settings.</p>
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>Instance login settings.</p>
     * @param LoginSettings <p>Instance login settings.</p>
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>Public network bandwidth-related information settings.</p> 
     * @return InternetAccessible <p>Public network bandwidth-related information settings.</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>Public network bandwidth-related information settings.</p>
     * @param InternetAccessible <p>Public network bandwidth-related information settings.</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>Security group to which an instance belongs.</p> 
     * @return SecurityGroupIds <p>Security group to which an instance belongs.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group to which an instance belongs.</p>
     * @param SecurityGroupIds <p>Security group to which an instance belongs.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>The scaling group bound to the launch configuration.</p> 
     * @return AutoScalingGroupAbstractSet <p>The scaling group bound to the launch configuration.</p>
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * Set <p>The scaling group bound to the launch configuration.</p>
     * @param AutoScalingGroupAbstractSet <p>The scaling group bound to the launch configuration.</p>
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * Get <p>Custom data.</p> 
     * @return UserData <p>Custom data.</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>Custom data.</p>
     * @param UserData <p>Custom data.</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>Launch configuration creation time, in standard <code>UTC</code> time.</p> 
     * @return CreatedTime <p>Launch configuration creation time, in standard <code>UTC</code> time.</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Launch configuration creation time, in standard <code>UTC</code> time.</p>
     * @param CreatedTime <p>Launch configuration creation time, in standard <code>UTC</code> time.</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Enhanced services enabling situation of the instance and its settings.</p> 
     * @return EnhancedService <p>Enhanced services enabling situation of the instance and its settings.</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>Enhanced services enabling situation of the instance and its settings.</p>
     * @param EnhancedService <p>Enhanced services enabling situation of the instance and its settings.</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Current status of the launch configuration. Value range: <li>NORMAL: Normal</li><li>IMAGE_ABNORMAL: The launch configuration image is exceptional</li><li>CBS_SNAP_ABNORMAL: The launch configuration data disk snapshot is exceptional</li><li>SECURITY_GROUP_ABNORMAL: The launch configuration security group is exceptional</li></p> 
     * @return LaunchConfigurationStatus <p>Current status of the launch configuration. Value range: <li>NORMAL: Normal</li><li>IMAGE_ABNORMAL: The launch configuration image is exceptional</li><li>CBS_SNAP_ABNORMAL: The launch configuration data disk snapshot is exceptional</li><li>SECURITY_GROUP_ABNORMAL: The launch configuration security group is exceptional</li></p>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * Set <p>Current status of the launch configuration. Value range: <li>NORMAL: Normal</li><li>IMAGE_ABNORMAL: The launch configuration image is exceptional</li><li>CBS_SNAP_ABNORMAL: The launch configuration data disk snapshot is exceptional</li><li>SECURITY_GROUP_ABNORMAL: The launch configuration security group is exceptional</li></p>
     * @param LaunchConfigurationStatus <p>Current status of the launch configuration. Value range: <li>NORMAL: Normal</li><li>IMAGE_ABNORMAL: The launch configuration image is exceptional</li><li>CBS_SNAP_ABNORMAL: The launch configuration data disk snapshot is exceptional</li><li>SECURITY_GROUP_ABNORMAL: The launch configuration security group is exceptional</li></p>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * Get <p>Instance billing type. The value range is as follows:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, i.e. monthly subscription</li><li>CDCPAID: dedicated cluster payment</li> 
     * @return InstanceChargeType <p>Instance billing type. The value range is as follows:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, i.e. monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type. The value range is as follows:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, i.e. monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     * @param InstanceChargeType <p>Instance billing type. The value range is as follows:</p><li>POSTPAID_BY_HOUR: hourly postpaid</li><li>SPOTPAID: spot payment</li><li>PREPAID: prepaid, i.e. monthly subscription</li><li>CDCPAID: dedicated cluster payment</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Market-related options of the instance, such as spot instance parameters. If the payment mode of the specified instance is spot payment, this parameter is required.</p> 
     * @return InstanceMarketOptions <p>Market-related options of the instance, such as spot instance parameters. If the payment mode of the specified instance is spot payment, this parameter is required.</p>
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>Market-related options of the instance, such as spot instance parameters. If the payment mode of the specified instance is spot payment, this parameter is required.</p>
     * @param InstanceMarketOptions <p>Market-related options of the instance, such as spot instance parameters. If the payment mode of the specified instance is spot payment, this parameter is required.</p>
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>Instance model list.</p> 
     * @return InstanceTypes <p>Instance model list.</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>Instance model list.</p>
     * @param InstanceTypes <p>Instance model list.</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>Instance tag list. Instances scaled out will automatically come with tags, supporting up to 10 tags.</p> 
     * @return InstanceTags <p>Instance tag list. Instances scaled out will automatically come with tags, supporting up to 10 tags.</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Instance tag list. Instances scaled out will automatically come with tags, supporting up to 10 tags.</p>
     * @param InstanceTags <p>Instance tag list. Instances scaled out will automatically come with tags, supporting up to 10 tags.</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Tag list. The tags in this parameter are only used to bind launch configurations and will not be passed to CVM instances scaled out based on the launch configuration.</p> 
     * @return Tags <p>Tag list. The tags in this parameter are only used to bind launch configurations and will not be passed to CVM instances scaled out based on the launch configuration.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list. The tags in this parameter are only used to bind launch configurations and will not be passed to CVM instances scaled out based on the launch configuration.</p>
     * @param Tags <p>Tag list. The tags in this parameter are only used to bind launch configurations and will not be passed to CVM instances scaled out based on the launch configuration.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Version number.</p> 
     * @return VersionNumber <p>Version number.</p>
     */
    public Long getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>Version number.</p>
     * @param VersionNumber <p>Version number.</p>
     */
    public void setVersionNumber(Long VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>Update time in standard <code>UTC</code> format.</p> 
     * @return UpdatedTime <p>Update time in standard <code>UTC</code> format.</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>Update time in standard <code>UTC</code> format.</p>
     * @param UpdatedTime <p>Update time in standard <code>UTC</code> format.</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
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
     * Get <p>The value of InstanceTypesCheckPolicy last time when operating.</p> 
     * @return LastOperationInstanceTypesCheckPolicy <p>The value of InstanceTypesCheckPolicy last time when operating.</p>
     */
    public String getLastOperationInstanceTypesCheckPolicy() {
        return this.LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Set <p>The value of InstanceTypesCheckPolicy last time when operating.</p>
     * @param LastOperationInstanceTypesCheckPolicy <p>The value of InstanceTypesCheckPolicy last time when operating.</p>
     */
    public void setLastOperationInstanceTypesCheckPolicy(String LastOperationInstanceTypesCheckPolicy) {
        this.LastOperationInstanceTypesCheckPolicy = LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Get <p>Related settings for the CVM host name (HostName).</p> 
     * @return HostNameSettings <p>Related settings for the CVM host name (HostName).</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>Related settings for the CVM host name (HostName).</p>
     * @param HostNameSettings <p>Related settings for the CVM host name (HostName).</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>Related settings for the cloud server instance name (InstanceName).</p> 
     * @return InstanceNameSettings <p>Related settings for the cloud server instance name (InstanceName).</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>Related settings for the cloud server instance name (InstanceName).</p>
     * @param InstanceNameSettings <p>Related settings for the cloud server instance name (InstanceName).</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>Prepaid mode, i.e., parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode for the specified instance is prepaid.</p> 
     * @return InstanceChargePrepaid <p>Prepaid mode, i.e., parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode for the specified instance is prepaid.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Prepaid mode, i.e., parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode for the specified instance is prepaid.</p>
     * @param InstanceChargePrepaid <p>Prepaid mode, i.e., parameter settings related to monthly/annual subscription. By specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode for the specified instance is prepaid.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>Cloud disk type selection policy. Parameter value range: <li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select available cloud disk types in the current AZ</li></p> 
     * @return DiskTypePolicy <p>Cloud disk type selection policy. Parameter value range: <li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select available cloud disk types in the current AZ</li></p>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>Cloud disk type selection policy. Parameter value range: <li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select available cloud disk types in the current AZ</li></p>
     * @param DiskTypePolicy <p>Cloud disk type selection policy. Parameter value range: <li>ORIGINAL: use the set cloud disk type</li><li>AUTOMATIC: automatically select available cloud disk types in the current AZ</li></p>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>Hyper Computing Cluster ID.<br><br>Note: This field is empty by default.</p> 
     * @return HpcClusterId <p>Hyper Computing Cluster ID.<br><br>Note: This field is empty by default.</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>Hyper Computing Cluster ID.<br><br>Note: This field is empty by default.</p>
     * @param HpcClusterId <p>Hyper Computing Cluster ID.<br><br>Note: This field is empty by default.</p>
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get <p>IPv6 public network bandwidth-related information settings.</p> 
     * @return IPv6InternetAccessible <p>IPv6 public network bandwidth-related information settings.</p>
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set <p>IPv6 public network bandwidth-related information settings.</p>
     * @param IPv6InternetAccessible <p>IPv6 public network bandwidth-related information settings.</p>
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
     * Get <p>Image family name.</p> 
     * @return ImageFamily <p>Image family name.</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>Image family name.</p>
     * @param ImageFamily <p>Image family name.</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>Local dedicated cluster ID.</p> 
     * @return DedicatedClusterId <p>Local dedicated cluster ID.</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>Local dedicated cluster ID.</p>
     * @param DedicatedClusterId <p>Local dedicated cluster ID.</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>ENI configuration of the launch configuration.</p> 
     * @return NetworkInterfaces <p>ENI configuration of the launch configuration.</p>
     */
    public NetworkInterface [] getNetworkInterfaces() {
        return this.NetworkInterfaces;
    }

    /**
     * Set <p>ENI configuration of the launch configuration.</p>
     * @param NetworkInterfaces <p>ENI configuration of the launch configuration.</p>
     */
    public void setNetworkInterfaces(NetworkInterface [] NetworkInterfaces) {
        this.NetworkInterfaces = NetworkInterfaces;
    }

    public LaunchConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchConfiguration(LaunchConfiguration source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
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
        if (source.LoginSettings != null) {
            this.LoginSettings = new LimitedLoginSettings(source.LoginSettings);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AutoScalingGroupAbstractSet != null) {
            this.AutoScalingGroupAbstractSet = new AutoScalingGroupAbstract[source.AutoScalingGroupAbstractSet.length];
            for (int i = 0; i < source.AutoScalingGroupAbstractSet.length; i++) {
                this.AutoScalingGroupAbstractSet[i] = new AutoScalingGroupAbstract(source.AutoScalingGroupAbstractSet[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.LaunchConfigurationStatus != null) {
            this.LaunchConfigurationStatus = new String(source.LaunchConfigurationStatus);
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
        if (source.VersionNumber != null) {
            this.VersionNumber = new Long(source.VersionNumber);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.LastOperationInstanceTypesCheckPolicy != null) {
            this.LastOperationInstanceTypesCheckPolicy = new String(source.LastOperationInstanceTypesCheckPolicy);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "AutoScalingGroupAbstractSet.", this.AutoScalingGroupAbstractSet);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchConfigurationStatus", this.LaunchConfigurationStatus);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "LastOperationInstanceTypesCheckPolicy", this.LastOperationInstanceTypesCheckPolicy);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamArrayObj(map, prefix + "NetworkInterfaces.", this.NetworkInterfaces);

    }
}

