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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesAttributeRequest extends AbstractModel{

    /**
    * Instance ID(s). To obtain the instance IDs, you can call [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and look for `InstanceId` in the response. The maximum number of instances in each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * The instance name, which can not exceed 60 characters
<dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they can not be both specified.</dx-alert>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * IDs of security groups associated with the specified instance. You can associate with a security group by adding its ID, or cancel the association with a security group by removing its ID. <dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they cannot be both set.</dx-alert>
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
    * Host name of the instance. <br><li>Hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name. <br><li>Windows: 2-15 characters, including [a-z], [A-Z], [0-9] and hyphens (-). Digit-only strings are not allowed. <br><li>Other OS: 2-60 characters, including [a-z], [A-Z], [0-9] and [.-]. Separate characters with dots. 
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Whether the termination protection is enabled. Values: <br><li>`TRUE`: enable instance protection, which means that this instance can not be deleted by an API action.<br><li>`FALSE`: do not enable the instance protection.<br><br>Default Value: `FALSE`.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * The role type, which is used in conjunction with `CamRoleName`. The value is obtained in `RoleType` field, returning by `CAM DescribeRoleList` and `GetRole` APIs. Valid value: `user`, `system` and `service_linked`.
For example, when `LinkedRoleIn` is contained in `CamRoleName` (such as `TKE_QCSLinkedRoleInPrometheusService`), the returned `RoleType` of `DescribeRoleList` and `GetRoleis` is `service_linked`, and the `CamRoleType` `service_linked`.
When the value obtained in `RoleType` is `user` (default) or `system`, `CamRoleType` can be left empty.
    */
    @SerializedName("CamRoleType")
    @Expose
    private String CamRoleType;

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
     * Get The instance name, which can not exceed 60 characters
<dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they can not be both specified.</dx-alert> 
     * @return InstanceName The instance name, which can not exceed 60 characters
<dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they can not be both specified.</dx-alert>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set The instance name, which can not exceed 60 characters
<dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they can not be both specified.</dx-alert>
     * @param InstanceName The instance name, which can not exceed 60 characters
<dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they can not be both specified.</dx-alert>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get IDs of security groups associated with the specified instance. You can associate with a security group by adding its ID, or cancel the association with a security group by removing its ID. <dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they cannot be both set.</dx-alert> 
     * @return SecurityGroups IDs of security groups associated with the specified instance. You can associate with a security group by adding its ID, or cancel the association with a security group by removing its ID. <dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they cannot be both set.</dx-alert>
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set IDs of security groups associated with the specified instance. You can associate with a security group by adding its ID, or cancel the association with a security group by removing its ID. <dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they cannot be both set.</dx-alert>
     * @param SecurityGroups IDs of security groups associated with the specified instance. You can associate with a security group by adding its ID, or cancel the association with a security group by removing its ID. <dx-alert infotype="explain" title="">Either `InstanceName` or `SecurityGroups` must be specified, but they cannot be both set.</dx-alert>
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
     * Get Host name of the instance. <br><li>Hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name. <br><li>Windows: 2-15 characters, including [a-z], [A-Z], [0-9] and hyphens (-). Digit-only strings are not allowed. <br><li>Other OS: 2-60 characters, including [a-z], [A-Z], [0-9] and [.-]. Separate characters with dots.  
     * @return HostName Host name of the instance. <br><li>Hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name. <br><li>Windows: 2-15 characters, including [a-z], [A-Z], [0-9] and hyphens (-). Digit-only strings are not allowed. <br><li>Other OS: 2-60 characters, including [a-z], [A-Z], [0-9] and [.-]. Separate characters with dots. 
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name of the instance. <br><li>Hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name. <br><li>Windows: 2-15 characters, including [a-z], [A-Z], [0-9] and hyphens (-). Digit-only strings are not allowed. <br><li>Other OS: 2-60 characters, including [a-z], [A-Z], [0-9] and [.-]. Separate characters with dots. 
     * @param HostName Host name of the instance. <br><li>Hyphens (-) cannot be the start or end of a host name or appear consecutively in a host name. <br><li>Windows: 2-15 characters, including [a-z], [A-Z], [0-9] and hyphens (-). Digit-only strings are not allowed. <br><li>Other OS: 2-60 characters, including [a-z], [A-Z], [0-9] and [.-]. Separate characters with dots. 
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Whether the termination protection is enabled. Values: <br><li>`TRUE`: enable instance protection, which means that this instance can not be deleted by an API action.<br><li>`FALSE`: do not enable the instance protection.<br><br>Default Value: `FALSE`. 
     * @return DisableApiTermination Whether the termination protection is enabled. Values: <br><li>`TRUE`: enable instance protection, which means that this instance can not be deleted by an API action.<br><li>`FALSE`: do not enable the instance protection.<br><br>Default Value: `FALSE`.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Whether the termination protection is enabled. Values: <br><li>`TRUE`: enable instance protection, which means that this instance can not be deleted by an API action.<br><li>`FALSE`: do not enable the instance protection.<br><br>Default Value: `FALSE`.
     * @param DisableApiTermination Whether the termination protection is enabled. Values: <br><li>`TRUE`: enable instance protection, which means that this instance can not be deleted by an API action.<br><li>`FALSE`: do not enable the instance protection.<br><br>Default Value: `FALSE`.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get The role type, which is used in conjunction with `CamRoleName`. The value is obtained in `RoleType` field, returning by `CAM DescribeRoleList` and `GetRole` APIs. Valid value: `user`, `system` and `service_linked`.
For example, when `LinkedRoleIn` is contained in `CamRoleName` (such as `TKE_QCSLinkedRoleInPrometheusService`), the returned `RoleType` of `DescribeRoleList` and `GetRoleis` is `service_linked`, and the `CamRoleType` `service_linked`.
When the value obtained in `RoleType` is `user` (default) or `system`, `CamRoleType` can be left empty. 
     * @return CamRoleType The role type, which is used in conjunction with `CamRoleName`. The value is obtained in `RoleType` field, returning by `CAM DescribeRoleList` and `GetRole` APIs. Valid value: `user`, `system` and `service_linked`.
For example, when `LinkedRoleIn` is contained in `CamRoleName` (such as `TKE_QCSLinkedRoleInPrometheusService`), the returned `RoleType` of `DescribeRoleList` and `GetRoleis` is `service_linked`, and the `CamRoleType` `service_linked`.
When the value obtained in `RoleType` is `user` (default) or `system`, `CamRoleType` can be left empty.
     */
    public String getCamRoleType() {
        return this.CamRoleType;
    }

    /**
     * Set The role type, which is used in conjunction with `CamRoleName`. The value is obtained in `RoleType` field, returning by `CAM DescribeRoleList` and `GetRole` APIs. Valid value: `user`, `system` and `service_linked`.
For example, when `LinkedRoleIn` is contained in `CamRoleName` (such as `TKE_QCSLinkedRoleInPrometheusService`), the returned `RoleType` of `DescribeRoleList` and `GetRoleis` is `service_linked`, and the `CamRoleType` `service_linked`.
When the value obtained in `RoleType` is `user` (default) or `system`, `CamRoleType` can be left empty.
     * @param CamRoleType The role type, which is used in conjunction with `CamRoleName`. The value is obtained in `RoleType` field, returning by `CAM DescribeRoleList` and `GetRole` APIs. Valid value: `user`, `system` and `service_linked`.
For example, when `LinkedRoleIn` is contained in `CamRoleName` (such as `TKE_QCSLinkedRoleInPrometheusService`), the returned `RoleType` of `DescribeRoleList` and `GetRoleis` is `service_linked`, and the `CamRoleType` `service_linked`.
When the value obtained in `RoleType` is `user` (default) or `system`, `CamRoleType` can be left empty.
     */
    public void setCamRoleType(String CamRoleType) {
        this.CamRoleType = CamRoleType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "CamRoleType", this.CamRoleType);

    }
}

