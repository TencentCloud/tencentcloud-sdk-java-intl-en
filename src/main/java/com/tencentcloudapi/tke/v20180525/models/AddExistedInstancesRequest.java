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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddExistedInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance list. Spot instance is not supported.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Detailed information of the instance
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * Enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Node login information (currently only supports using Password or single KeyIds)
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * When reinstalling the system, you can specify the HostName of the modified instance (when the cluster is in HostName mode, this parameter is required, and the rule name is the same as the [Create CVM Instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API HostName except for uppercase letters not being supported.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Security group to which the instance belongs. This parameter can be obtained from the `sgId` field returned by DescribeSecurityGroups. If this parameter is not specified, the default security group is bound. (Currently, you can only set a single sgId)
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Node pool options
    */
    @SerializedName("NodePool")
    @Expose
    private NodePoolOption NodePool;

    /**
    * Skips the specified verification. Valid values: GlobalRouteCIDRCheck, VpcCniCIDRCheck
    */
    @SerializedName("SkipValidateOptions")
    @Expose
    private String [] SkipValidateOptions;

    /**
    * This API is used to customize the configuration of an instance, which corresponds to the "InstanceIds" one-to-one in sequence. If the InstanceAdvancedSettingsOverrides array is passed in, the default parameter "InstanceAdvancedSettings" will be overwritten. If the parameter InstanceAdvancedSettingsOverrides is not passed in, the parameter "InstanceAdvancedSettings" will take effect for each instance. The array length of "InstanceAdvancedSettingsOverride" should be the same as the array length of "InstanceIds". If its array length is greater than the "InstanceIds" array length, an error will be reported. If its array length is less than the "InstanceIds" array length, the instance without corresponding configuration will use the default configuration.
    */
    @SerializedName("InstanceAdvancedSettingsOverrides")
    @Expose
    private InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides;

    /**
    * Node image
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance list. Spot instance is not supported. 
     * @return InstanceIds Instance list. Spot instance is not supported.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance list. Spot instance is not supported.
     * @param InstanceIds Instance list. Spot instance is not supported.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Detailed information of the instance 
     * @return InstanceAdvancedSettings Detailed information of the instance
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Detailed information of the instance
     * @param InstanceAdvancedSettings Detailed information of the instance
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get Enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled by default. 
     * @return EnhancedService Enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled by default.
     * @param EnhancedService Enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, Cloud Monitor and Cloud Security are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Node login information (currently only supports using Password or single KeyIds) 
     * @return LoginSettings Node login information (currently only supports using Password or single KeyIds)
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Node login information (currently only supports using Password or single KeyIds)
     * @param LoginSettings Node login information (currently only supports using Password or single KeyIds)
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get When reinstalling the system, you can specify the HostName of the modified instance (when the cluster is in HostName mode, this parameter is required, and the rule name is the same as the [Create CVM Instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API HostName except for uppercase letters not being supported. 
     * @return HostName When reinstalling the system, you can specify the HostName of the modified instance (when the cluster is in HostName mode, this parameter is required, and the rule name is the same as the [Create CVM Instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API HostName except for uppercase letters not being supported.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set When reinstalling the system, you can specify the HostName of the modified instance (when the cluster is in HostName mode, this parameter is required, and the rule name is the same as the [Create CVM Instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API HostName except for uppercase letters not being supported.
     * @param HostName When reinstalling the system, you can specify the HostName of the modified instance (when the cluster is in HostName mode, this parameter is required, and the rule name is the same as the [Create CVM Instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API HostName except for uppercase letters not being supported.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Security group to which the instance belongs. This parameter can be obtained from the `sgId` field returned by DescribeSecurityGroups. If this parameter is not specified, the default security group is bound. (Currently, you can only set a single sgId) 
     * @return SecurityGroupIds Security group to which the instance belongs. This parameter can be obtained from the `sgId` field returned by DescribeSecurityGroups. If this parameter is not specified, the default security group is bound. (Currently, you can only set a single sgId)
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group to which the instance belongs. This parameter can be obtained from the `sgId` field returned by DescribeSecurityGroups. If this parameter is not specified, the default security group is bound. (Currently, you can only set a single sgId)
     * @param SecurityGroupIds Security group to which the instance belongs. This parameter can be obtained from the `sgId` field returned by DescribeSecurityGroups. If this parameter is not specified, the default security group is bound. (Currently, you can only set a single sgId)
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Node pool options 
     * @return NodePool Node pool options
     */
    public NodePoolOption getNodePool() {
        return this.NodePool;
    }

    /**
     * Set Node pool options
     * @param NodePool Node pool options
     */
    public void setNodePool(NodePoolOption NodePool) {
        this.NodePool = NodePool;
    }

    /**
     * Get Skips the specified verification. Valid values: GlobalRouteCIDRCheck, VpcCniCIDRCheck 
     * @return SkipValidateOptions Skips the specified verification. Valid values: GlobalRouteCIDRCheck, VpcCniCIDRCheck
     */
    public String [] getSkipValidateOptions() {
        return this.SkipValidateOptions;
    }

    /**
     * Set Skips the specified verification. Valid values: GlobalRouteCIDRCheck, VpcCniCIDRCheck
     * @param SkipValidateOptions Skips the specified verification. Valid values: GlobalRouteCIDRCheck, VpcCniCIDRCheck
     */
    public void setSkipValidateOptions(String [] SkipValidateOptions) {
        this.SkipValidateOptions = SkipValidateOptions;
    }

    /**
     * Get This API is used to customize the configuration of an instance, which corresponds to the "InstanceIds" one-to-one in sequence. If the InstanceAdvancedSettingsOverrides array is passed in, the default parameter "InstanceAdvancedSettings" will be overwritten. If the parameter InstanceAdvancedSettingsOverrides is not passed in, the parameter "InstanceAdvancedSettings" will take effect for each instance. The array length of "InstanceAdvancedSettingsOverride" should be the same as the array length of "InstanceIds". If its array length is greater than the "InstanceIds" array length, an error will be reported. If its array length is less than the "InstanceIds" array length, the instance without corresponding configuration will use the default configuration. 
     * @return InstanceAdvancedSettingsOverrides This API is used to customize the configuration of an instance, which corresponds to the "InstanceIds" one-to-one in sequence. If the InstanceAdvancedSettingsOverrides array is passed in, the default parameter "InstanceAdvancedSettings" will be overwritten. If the parameter InstanceAdvancedSettingsOverrides is not passed in, the parameter "InstanceAdvancedSettings" will take effect for each instance. The array length of "InstanceAdvancedSettingsOverride" should be the same as the array length of "InstanceIds". If its array length is greater than the "InstanceIds" array length, an error will be reported. If its array length is less than the "InstanceIds" array length, the instance without corresponding configuration will use the default configuration.
     */
    public InstanceAdvancedSettings [] getInstanceAdvancedSettingsOverrides() {
        return this.InstanceAdvancedSettingsOverrides;
    }

    /**
     * Set This API is used to customize the configuration of an instance, which corresponds to the "InstanceIds" one-to-one in sequence. If the InstanceAdvancedSettingsOverrides array is passed in, the default parameter "InstanceAdvancedSettings" will be overwritten. If the parameter InstanceAdvancedSettingsOverrides is not passed in, the parameter "InstanceAdvancedSettings" will take effect for each instance. The array length of "InstanceAdvancedSettingsOverride" should be the same as the array length of "InstanceIds". If its array length is greater than the "InstanceIds" array length, an error will be reported. If its array length is less than the "InstanceIds" array length, the instance without corresponding configuration will use the default configuration.
     * @param InstanceAdvancedSettingsOverrides This API is used to customize the configuration of an instance, which corresponds to the "InstanceIds" one-to-one in sequence. If the InstanceAdvancedSettingsOverrides array is passed in, the default parameter "InstanceAdvancedSettings" will be overwritten. If the parameter InstanceAdvancedSettingsOverrides is not passed in, the parameter "InstanceAdvancedSettings" will take effect for each instance. The array length of "InstanceAdvancedSettingsOverride" should be the same as the array length of "InstanceIds". If its array length is greater than the "InstanceIds" array length, an error will be reported. If its array length is less than the "InstanceIds" array length, the instance without corresponding configuration will use the default configuration.
     */
    public void setInstanceAdvancedSettingsOverrides(InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides) {
        this.InstanceAdvancedSettingsOverrides = InstanceAdvancedSettingsOverrides;
    }

    /**
     * Get Node image 
     * @return ImageId Node image
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Node image
     * @param ImageId Node image
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public AddExistedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddExistedInstancesRequest(AddExistedInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NodePool != null) {
            this.NodePool = new NodePoolOption(source.NodePool);
        }
        if (source.SkipValidateOptions != null) {
            this.SkipValidateOptions = new String[source.SkipValidateOptions.length];
            for (int i = 0; i < source.SkipValidateOptions.length; i++) {
                this.SkipValidateOptions[i] = new String(source.SkipValidateOptions[i]);
            }
        }
        if (source.InstanceAdvancedSettingsOverrides != null) {
            this.InstanceAdvancedSettingsOverrides = new InstanceAdvancedSettings[source.InstanceAdvancedSettingsOverrides.length];
            for (int i = 0; i < source.InstanceAdvancedSettingsOverrides.length; i++) {
                this.InstanceAdvancedSettingsOverrides[i] = new InstanceAdvancedSettings(source.InstanceAdvancedSettingsOverrides[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "NodePool.", this.NodePool);
        this.setParamArraySimple(map, prefix + "SkipValidateOptions.", this.SkipValidateOptions);
        this.setParamArrayObj(map, prefix + "InstanceAdvancedSettingsOverrides.", this.InstanceAdvancedSettingsOverrides);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

