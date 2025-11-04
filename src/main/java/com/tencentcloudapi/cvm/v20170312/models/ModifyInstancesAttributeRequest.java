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

public class ModifyInstancesAttributeRequest extends AbstractModel {

    /**
    * Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Modified instance name. can be named as required but should not exceed 128 characters.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * User data provided to an instance, which needs to be encoded in Base64 format with a maximum size of 16 KB. For details on obtaining this parameter, refer to the startup commands for [Windows](https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Specifies the security group Id list of the specified instance after modification. the instance will reassociate with the security groups in the specified list, and the associated security group will be unbound.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * The role bound with the instance. If it is not specified, it indicates to unbind the current role of the CVM.
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * Modified hostname of an instance.<li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 60 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>Note: After the hostname is modified, the instance will restart immediately, and the new hostname will take effect after the restart.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Instance termination protection flag, indicating whether an instance is allowed to be deleted through an API. Valid values:<li>true: Instance protection is enabled, and the instance is not allowed to be deleted through the API.</li><li>false: Instance protection is disabled, and the instance is allowed to be deleted through the API.</li>Default value: false.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * Role type, used in conjunction with CamRoleName. this value can be obtained from the RoleType field in the API response of CAM [DescribeRoleList](https://www.tencentcloud.comom/document/product/598/36223?from_cn_redirect=1) or [GetRole](https://www.tencentcloud.comom/document/product/598/36221?from_cn_redirect=1). currently, only user, system, and service_linked types are accepted.
For example, when CamRoleName contains "LinkedRoleIn" (such as TKE_QCSLinkedRoleInPrometheusService), DescribeRoleList and GetRole return RoleType as service_linked, this parameter must also transmit service_linked.
The parameter default value is user. this parameter can be omitted if CameRoleName is not of the service_linked kind.
    */
    @SerializedName("CamRoleType")
    @Expose
    private String CamRoleType;

    /**
    * Whether to automatically restart an instance when modifying a hostname. If not specified, the instance will automatically restart by default.
- true: Modify the hostname and automatically restart the instance.
- false: Modify the hostname without automatically restarting the instance. A manual restart is required for the new hostname to take effect.
Note: This parameter is valid only when a hostname is modified.
    */
    @SerializedName("AutoReboot")
    @Expose
    private Boolean AutoReboot;

    /**
     * Get Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100. 
     * @return InstanceIds Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     * @param InstanceIds Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Modified instance name. can be named as required but should not exceed 128 characters. 
     * @return InstanceName Modified instance name. can be named as required but should not exceed 128 characters.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Modified instance name. can be named as required but should not exceed 128 characters.
     * @param InstanceName Modified instance name. can be named as required but should not exceed 128 characters.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get User data provided to an instance, which needs to be encoded in Base64 format with a maximum size of 16 KB. For details on obtaining this parameter, refer to the startup commands for [Windows](https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1). 
     * @return UserData User data provided to an instance, which needs to be encoded in Base64 format with a maximum size of 16 KB. For details on obtaining this parameter, refer to the startup commands for [Windows](https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set User data provided to an instance, which needs to be encoded in Base64 format with a maximum size of 16 KB. For details on obtaining this parameter, refer to the startup commands for [Windows](https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     * @param UserData User data provided to an instance, which needs to be encoded in Base64 format with a maximum size of 16 KB. For details on obtaining this parameter, refer to the startup commands for [Windows](https://intl.cloud.tencent.com/document/product/213/17526?from_cn_redirect=1) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525?from_cn_redirect=1).
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Specifies the security group Id list of the specified instance after modification. the instance will reassociate with the security groups in the specified list, and the associated security group will be unbound. 
     * @return SecurityGroups Specifies the security group Id list of the specified instance after modification. the instance will reassociate with the security groups in the specified list, and the associated security group will be unbound.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set Specifies the security group Id list of the specified instance after modification. the instance will reassociate with the security groups in the specified list, and the associated security group will be unbound.
     * @param SecurityGroups Specifies the security group Id list of the specified instance after modification. the instance will reassociate with the security groups in the specified list, and the associated security group will be unbound.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get The role bound with the instance. If it is not specified, it indicates to unbind the current role of the CVM. 
     * @return CamRoleName The role bound with the instance. If it is not specified, it indicates to unbind the current role of the CVM.
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set The role bound with the instance. If it is not specified, it indicates to unbind the current role of the CVM.
     * @param CamRoleName The role bound with the instance. If it is not specified, it indicates to unbind the current role of the CVM.
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get Modified hostname of an instance.<li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 60 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>Note: After the hostname is modified, the instance will restart immediately, and the new hostname will take effect after the restart. 
     * @return HostName Modified hostname of an instance.<li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 60 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>Note: After the hostname is modified, the instance will restart immediately, and the new hostname will take effect after the restart.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Modified hostname of an instance.<li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 60 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>Note: After the hostname is modified, the instance will restart immediately, and the new hostname will take effect after the restart.
     * @param HostName Modified hostname of an instance.<li>Period (.) and hyphen (-) should not be used as the first or last character of the hostname, and should not be used consecutively.</li><li>Windows instances: The hostname should contain 2 to 15 characters, including letters (case insensitive), digits, and hyphens (-), does not support periods (.), and should not be all digits.</li><li>Instances of other types (such as Linux instances): The hostname should contain 2 to 60 characters, including multiple periods (.), with each segment between periods considered as one section. Each section can contain letters (case insensitive), digits, and hyphens (-).</li>Note: After the hostname is modified, the instance will restart immediately, and the new hostname will take effect after the restart.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Instance termination protection flag, indicating whether an instance is allowed to be deleted through an API. Valid values:<li>true: Instance protection is enabled, and the instance is not allowed to be deleted through the API.</li><li>false: Instance protection is disabled, and the instance is allowed to be deleted through the API.</li>Default value: false. 
     * @return DisableApiTermination Instance termination protection flag, indicating whether an instance is allowed to be deleted through an API. Valid values:<li>true: Instance protection is enabled, and the instance is not allowed to be deleted through the API.</li><li>false: Instance protection is disabled, and the instance is allowed to be deleted through the API.</li>Default value: false.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Instance termination protection flag, indicating whether an instance is allowed to be deleted through an API. Valid values:<li>true: Instance protection is enabled, and the instance is not allowed to be deleted through the API.</li><li>false: Instance protection is disabled, and the instance is allowed to be deleted through the API.</li>Default value: false.
     * @param DisableApiTermination Instance termination protection flag, indicating whether an instance is allowed to be deleted through an API. Valid values:<li>true: Instance protection is enabled, and the instance is not allowed to be deleted through the API.</li><li>false: Instance protection is disabled, and the instance is allowed to be deleted through the API.</li>Default value: false.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get Role type, used in conjunction with CamRoleName. this value can be obtained from the RoleType field in the API response of CAM [DescribeRoleList](https://www.tencentcloud.comom/document/product/598/36223?from_cn_redirect=1) or [GetRole](https://www.tencentcloud.comom/document/product/598/36221?from_cn_redirect=1). currently, only user, system, and service_linked types are accepted.
For example, when CamRoleName contains "LinkedRoleIn" (such as TKE_QCSLinkedRoleInPrometheusService), DescribeRoleList and GetRole return RoleType as service_linked, this parameter must also transmit service_linked.
The parameter default value is user. this parameter can be omitted if CameRoleName is not of the service_linked kind. 
     * @return CamRoleType Role type, used in conjunction with CamRoleName. this value can be obtained from the RoleType field in the API response of CAM [DescribeRoleList](https://www.tencentcloud.comom/document/product/598/36223?from_cn_redirect=1) or [GetRole](https://www.tencentcloud.comom/document/product/598/36221?from_cn_redirect=1). currently, only user, system, and service_linked types are accepted.
For example, when CamRoleName contains "LinkedRoleIn" (such as TKE_QCSLinkedRoleInPrometheusService), DescribeRoleList and GetRole return RoleType as service_linked, this parameter must also transmit service_linked.
The parameter default value is user. this parameter can be omitted if CameRoleName is not of the service_linked kind.
     */
    public String getCamRoleType() {
        return this.CamRoleType;
    }

    /**
     * Set Role type, used in conjunction with CamRoleName. this value can be obtained from the RoleType field in the API response of CAM [DescribeRoleList](https://www.tencentcloud.comom/document/product/598/36223?from_cn_redirect=1) or [GetRole](https://www.tencentcloud.comom/document/product/598/36221?from_cn_redirect=1). currently, only user, system, and service_linked types are accepted.
For example, when CamRoleName contains "LinkedRoleIn" (such as TKE_QCSLinkedRoleInPrometheusService), DescribeRoleList and GetRole return RoleType as service_linked, this parameter must also transmit service_linked.
The parameter default value is user. this parameter can be omitted if CameRoleName is not of the service_linked kind.
     * @param CamRoleType Role type, used in conjunction with CamRoleName. this value can be obtained from the RoleType field in the API response of CAM [DescribeRoleList](https://www.tencentcloud.comom/document/product/598/36223?from_cn_redirect=1) or [GetRole](https://www.tencentcloud.comom/document/product/598/36221?from_cn_redirect=1). currently, only user, system, and service_linked types are accepted.
For example, when CamRoleName contains "LinkedRoleIn" (such as TKE_QCSLinkedRoleInPrometheusService), DescribeRoleList and GetRole return RoleType as service_linked, this parameter must also transmit service_linked.
The parameter default value is user. this parameter can be omitted if CameRoleName is not of the service_linked kind.
     */
    public void setCamRoleType(String CamRoleType) {
        this.CamRoleType = CamRoleType;
    }

    /**
     * Get Whether to automatically restart an instance when modifying a hostname. If not specified, the instance will automatically restart by default.
- true: Modify the hostname and automatically restart the instance.
- false: Modify the hostname without automatically restarting the instance. A manual restart is required for the new hostname to take effect.
Note: This parameter is valid only when a hostname is modified. 
     * @return AutoReboot Whether to automatically restart an instance when modifying a hostname. If not specified, the instance will automatically restart by default.
- true: Modify the hostname and automatically restart the instance.
- false: Modify the hostname without automatically restarting the instance. A manual restart is required for the new hostname to take effect.
Note: This parameter is valid only when a hostname is modified.
     */
    public Boolean getAutoReboot() {
        return this.AutoReboot;
    }

    /**
     * Set Whether to automatically restart an instance when modifying a hostname. If not specified, the instance will automatically restart by default.
- true: Modify the hostname and automatically restart the instance.
- false: Modify the hostname without automatically restarting the instance. A manual restart is required for the new hostname to take effect.
Note: This parameter is valid only when a hostname is modified.
     * @param AutoReboot Whether to automatically restart an instance when modifying a hostname. If not specified, the instance will automatically restart by default.
- true: Modify the hostname and automatically restart the instance.
- false: Modify the hostname without automatically restarting the instance. A manual restart is required for the new hostname to take effect.
Note: This parameter is valid only when a hostname is modified.
     */
    public void setAutoReboot(Boolean AutoReboot) {
        this.AutoReboot = AutoReboot;
    }

    public ModifyInstancesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesAttributeRequest(ModifyInstancesAttributeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.CamRoleType != null) {
            this.CamRoleType = new String(source.CamRoleType);
        }
        if (source.AutoReboot != null) {
            this.AutoReboot = new Boolean(source.AutoReboot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "CamRoleType", this.CamRoleType);
        this.setParamSimple(map, prefix + "AutoReboot", this.AutoReboot);

    }
}

