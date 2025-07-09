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
    * Project ID of the instance.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Launch configuration name.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Information of the instance's system disk configuration.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Information of the instance's data disk configuration.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Instance login settings.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * Information of the public network bandwidth configuration.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Security group of the instance.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Auto scaling group associated with the launch configuration.
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * Custom data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Creation time of the launch configuration.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Conditions of enhancement services for the instance and their settings.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Image ID.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Current status of the launch configuration. Valid values: <li>NORMAL: Normal.</li> <li>IMAGE_ABNORMAL: Image exception in the launch configuration.</li> <li>CBS_SNAP_ABNORMAL: Exception with data disk snapshot in the launch configuration.</li> <li>SECURITY_GROUP_ABNORMAL: Security group exception in the launch configuration.</li>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
    * Instance billing type, with the CVM default value processed as POSTPAID_BY_HOUR. <li>POSTPAID_BY_HOUR: Hourly postpaid billing.</li> <li>SPOTPAID: Spot billing.</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Market options of the instance, such as parameters related to spot instances. This parameter is required for spot instances.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * List of instance models.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * List of instance tags, which will be added to instances created by the scale-out activity. Up to 10 tags allowed.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * Tag list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Version
    */
    @SerializedName("VersionNumber")
    @Expose
    private Long VersionNumber;

    /**
    * Update time
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * CAM role name. This parameter can be obtained from the `roleName` field returned by DescribeRoleList API.
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * Value of InstanceTypesCheckPolicy upon the last operation.
    */
    @SerializedName("LastOperationInstanceTypesCheckPolicy")
    @Expose
    private String LastOperationInstanceTypesCheckPolicy;

    /**
    * CVM hostname settings.
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * Settings of CVM instance names
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * Details of the monthly subscription, including the purchase period, auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Cloud disk type selection policy. Valid values: <li>ORIGINAL: Use the set cloud disk type.</li> <li>AUTOMATIC: Automatically select available cloud disk types in the current availability zone.</li>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * HPC ID<br>
Note: This field is default to empty
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * IPv6 public network bandwidth configuration.
    */
    @SerializedName("IPv6InternetAccessible")
    @Expose
    private IPv6InternetAccessible IPv6InternetAccessible;

    /**
    * Placement group ID, supporting specification of only one.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * Image family name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * CDC ID.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get Project ID of the instance. 
     * @return ProjectId Project ID of the instance.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of the instance.
     * @param ProjectId Project ID of the instance.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

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
     * Get Launch configuration name. 
     * @return LaunchConfigurationName Launch configuration name.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set Launch configuration name.
     * @param LaunchConfigurationName Launch configuration name.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get Instance model. 
     * @return InstanceType Instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model.
     * @param InstanceType Instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Information of the instance's system disk configuration. 
     * @return SystemDisk Information of the instance's system disk configuration.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Information of the instance's system disk configuration.
     * @param SystemDisk Information of the instance's system disk configuration.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Information of the instance's data disk configuration. 
     * @return DataDisks Information of the instance's data disk configuration.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Information of the instance's data disk configuration.
     * @param DataDisks Information of the instance's data disk configuration.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Instance login settings. 
     * @return LoginSettings Instance login settings.
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login settings.
     * @param LoginSettings Instance login settings.
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Information of the public network bandwidth configuration. 
     * @return InternetAccessible Information of the public network bandwidth configuration.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Information of the public network bandwidth configuration.
     * @param InternetAccessible Information of the public network bandwidth configuration.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Security group of the instance. 
     * @return SecurityGroupIds Security group of the instance.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance.
     * @param SecurityGroupIds Security group of the instance.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Auto scaling group associated with the launch configuration. 
     * @return AutoScalingGroupAbstractSet Auto scaling group associated with the launch configuration.
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * Set Auto scaling group associated with the launch configuration.
     * @param AutoScalingGroupAbstractSet Auto scaling group associated with the launch configuration.
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * Get Custom data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserData Custom data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set Custom data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserData Custom data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Creation time of the launch configuration. 
     * @return CreatedTime Creation time of the launch configuration.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the launch configuration.
     * @param CreatedTime Creation time of the launch configuration.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Conditions of enhancement services for the instance and their settings. 
     * @return EnhancedService Conditions of enhancement services for the instance and their settings.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Conditions of enhancement services for the instance and their settings.
     * @param EnhancedService Conditions of enhancement services for the instance and their settings.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Image ID. 
     * @return ImageId Image ID.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID.
     * @param ImageId Image ID.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Current status of the launch configuration. Valid values: <li>NORMAL: Normal.</li> <li>IMAGE_ABNORMAL: Image exception in the launch configuration.</li> <li>CBS_SNAP_ABNORMAL: Exception with data disk snapshot in the launch configuration.</li> <li>SECURITY_GROUP_ABNORMAL: Security group exception in the launch configuration.</li> 
     * @return LaunchConfigurationStatus Current status of the launch configuration. Valid values: <li>NORMAL: Normal.</li> <li>IMAGE_ABNORMAL: Image exception in the launch configuration.</li> <li>CBS_SNAP_ABNORMAL: Exception with data disk snapshot in the launch configuration.</li> <li>SECURITY_GROUP_ABNORMAL: Security group exception in the launch configuration.</li>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * Set Current status of the launch configuration. Valid values: <li>NORMAL: Normal.</li> <li>IMAGE_ABNORMAL: Image exception in the launch configuration.</li> <li>CBS_SNAP_ABNORMAL: Exception with data disk snapshot in the launch configuration.</li> <li>SECURITY_GROUP_ABNORMAL: Security group exception in the launch configuration.</li>
     * @param LaunchConfigurationStatus Current status of the launch configuration. Valid values: <li>NORMAL: Normal.</li> <li>IMAGE_ABNORMAL: Image exception in the launch configuration.</li> <li>CBS_SNAP_ABNORMAL: Exception with data disk snapshot in the launch configuration.</li> <li>SECURITY_GROUP_ABNORMAL: Security group exception in the launch configuration.</li>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * Get Instance billing type, with the CVM default value processed as POSTPAID_BY_HOUR. <li>POSTPAID_BY_HOUR: Hourly postpaid billing.</li> <li>SPOTPAID: Spot billing.</li> 
     * @return InstanceChargeType Instance billing type, with the CVM default value processed as POSTPAID_BY_HOUR. <li>POSTPAID_BY_HOUR: Hourly postpaid billing.</li> <li>SPOTPAID: Spot billing.</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type, with the CVM default value processed as POSTPAID_BY_HOUR. <li>POSTPAID_BY_HOUR: Hourly postpaid billing.</li> <li>SPOTPAID: Spot billing.</li>
     * @param InstanceChargeType Instance billing type, with the CVM default value processed as POSTPAID_BY_HOUR. <li>POSTPAID_BY_HOUR: Hourly postpaid billing.</li> <li>SPOTPAID: Spot billing.</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Market options of the instance, such as parameters related to spot instances. This parameter is required for spot instances.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceMarketOptions Market options of the instance, such as parameters related to spot instances. This parameter is required for spot instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set Market options of the instance, such as parameters related to spot instances. This parameter is required for spot instances.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceMarketOptions Market options of the instance, such as parameters related to spot instances. This parameter is required for spot instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get List of instance models. 
     * @return InstanceTypes List of instance models.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set List of instance models.
     * @param InstanceTypes List of instance models.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get List of instance tags, which will be added to instances created by the scale-out activity. Up to 10 tags allowed. 
     * @return InstanceTags List of instance tags, which will be added to instances created by the scale-out activity. Up to 10 tags allowed.
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set List of instance tags, which will be added to instances created by the scale-out activity. Up to 10 tags allowed.
     * @param InstanceTags List of instance tags, which will be added to instances created by the scale-out activity. Up to 10 tags allowed.
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get Tag list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Version 
     * @return VersionNumber Version
     */
    public Long getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set Version
     * @param VersionNumber Version
     */
    public void setVersionNumber(Long VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get Update time 
     * @return UpdatedTime Update time
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Update time
     * @param UpdatedTime Update time
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
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

    /**
     * Get Value of InstanceTypesCheckPolicy upon the last operation. 
     * @return LastOperationInstanceTypesCheckPolicy Value of InstanceTypesCheckPolicy upon the last operation.
     */
    public String getLastOperationInstanceTypesCheckPolicy() {
        return this.LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Set Value of InstanceTypesCheckPolicy upon the last operation.
     * @param LastOperationInstanceTypesCheckPolicy Value of InstanceTypesCheckPolicy upon the last operation.
     */
    public void setLastOperationInstanceTypesCheckPolicy(String LastOperationInstanceTypesCheckPolicy) {
        this.LastOperationInstanceTypesCheckPolicy = LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Get CVM hostname settings. 
     * @return HostNameSettings CVM hostname settings.
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set CVM hostname settings.
     * @param HostNameSettings CVM hostname settings.
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get Settings of CVM instance names 
     * @return InstanceNameSettings Settings of CVM instance names
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set Settings of CVM instance names
     * @param InstanceNameSettings Settings of CVM instance names
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
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
     * Get Cloud disk type selection policy. Valid values: <li>ORIGINAL: Use the set cloud disk type.</li> <li>AUTOMATIC: Automatically select available cloud disk types in the current availability zone.</li> 
     * @return DiskTypePolicy Cloud disk type selection policy. Valid values: <li>ORIGINAL: Use the set cloud disk type.</li> <li>AUTOMATIC: Automatically select available cloud disk types in the current availability zone.</li>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set Cloud disk type selection policy. Valid values: <li>ORIGINAL: Use the set cloud disk type.</li> <li>AUTOMATIC: Automatically select available cloud disk types in the current availability zone.</li>
     * @param DiskTypePolicy Cloud disk type selection policy. Valid values: <li>ORIGINAL: Use the set cloud disk type.</li> <li>AUTOMATIC: Automatically select available cloud disk types in the current availability zone.</li>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get HPC ID<br>
Note: This field is default to empty 
     * @return HpcClusterId HPC ID<br>
Note: This field is default to empty
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set HPC ID<br>
Note: This field is default to empty
     * @param HpcClusterId HPC ID<br>
Note: This field is default to empty
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get IPv6 public network bandwidth configuration. 
     * @return IPv6InternetAccessible IPv6 public network bandwidth configuration.
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set IPv6 public network bandwidth configuration.
     * @param IPv6InternetAccessible IPv6 public network bandwidth configuration.
     */
    public void setIPv6InternetAccessible(IPv6InternetAccessible IPv6InternetAccessible) {
        this.IPv6InternetAccessible = IPv6InternetAccessible;
    }

    /**
     * Get Placement group ID, supporting specification of only one. 
     * @return DisasterRecoverGroupIds Placement group ID, supporting specification of only one.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set Placement group ID, supporting specification of only one.
     * @param DisasterRecoverGroupIds Placement group ID, supporting specification of only one.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get Image family name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageFamily Image family name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set Image family name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageFamily Image family name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get CDC ID. 
     * @return DedicatedClusterId CDC ID.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID.
     * @param DedicatedClusterId CDC ID.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
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

    }
}

