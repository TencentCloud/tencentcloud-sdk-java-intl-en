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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddPermissionPolicyToRoleConfigurationRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * Permission policy type. Valid values: System: system policy, namely the CAM system policy reused; Custom: custom policy, namely the custom policy prepared according to the CAM permission policy syntax and structure.  
    */
    @SerializedName("RolePolicyType")
    @Expose
    private String RolePolicyType;

    /**
    * Permission policy name, supporting up to 20 policies, with each policy having a maximum of 32 characters. If you need to add a system policy, it is recommended to use the RolePolicies parameter. For custom policies, the array length is up to 1.
    */
    @SerializedName("RolePolicyNames")
    @Expose
    private String [] RolePolicyNames;

    /**
    * Details of an added system policy.
    */
    @SerializedName("RolePolicies")
    @Expose
    private PolicyDetail [] RolePolicies;

    /**
    * Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
    */
    @SerializedName("CustomPolicyDocument")
    @Expose
    private String CustomPolicyDocument;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Permission configuration ID. 
     * @return RoleConfigurationId Permission configuration ID.
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set Permission configuration ID.
     * @param RoleConfigurationId Permission configuration ID.
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get Permission policy type. Valid values: System: system policy, namely the CAM system policy reused; Custom: custom policy, namely the custom policy prepared according to the CAM permission policy syntax and structure.   
     * @return RolePolicyType Permission policy type. Valid values: System: system policy, namely the CAM system policy reused; Custom: custom policy, namely the custom policy prepared according to the CAM permission policy syntax and structure.  
     */
    public String getRolePolicyType() {
        return this.RolePolicyType;
    }

    /**
     * Set Permission policy type. Valid values: System: system policy, namely the CAM system policy reused; Custom: custom policy, namely the custom policy prepared according to the CAM permission policy syntax and structure.  
     * @param RolePolicyType Permission policy type. Valid values: System: system policy, namely the CAM system policy reused; Custom: custom policy, namely the custom policy prepared according to the CAM permission policy syntax and structure.  
     */
    public void setRolePolicyType(String RolePolicyType) {
        this.RolePolicyType = RolePolicyType;
    }

    /**
     * Get Permission policy name, supporting up to 20 policies, with each policy having a maximum of 32 characters. If you need to add a system policy, it is recommended to use the RolePolicies parameter. For custom policies, the array length is up to 1. 
     * @return RolePolicyNames Permission policy name, supporting up to 20 policies, with each policy having a maximum of 32 characters. If you need to add a system policy, it is recommended to use the RolePolicies parameter. For custom policies, the array length is up to 1.
     */
    public String [] getRolePolicyNames() {
        return this.RolePolicyNames;
    }

    /**
     * Set Permission policy name, supporting up to 20 policies, with each policy having a maximum of 32 characters. If you need to add a system policy, it is recommended to use the RolePolicies parameter. For custom policies, the array length is up to 1.
     * @param RolePolicyNames Permission policy name, supporting up to 20 policies, with each policy having a maximum of 32 characters. If you need to add a system policy, it is recommended to use the RolePolicies parameter. For custom policies, the array length is up to 1.
     */
    public void setRolePolicyNames(String [] RolePolicyNames) {
        this.RolePolicyNames = RolePolicyNames;
    }

    /**
     * Get Details of an added system policy. 
     * @return RolePolicies Details of an added system policy.
     */
    public PolicyDetail [] getRolePolicies() {
        return this.RolePolicies;
    }

    /**
     * Set Details of an added system policy.
     * @param RolePolicies Details of an added system policy.
     */
    public void setRolePolicies(PolicyDetail [] RolePolicies) {
        this.RolePolicies = RolePolicies;
    }

    /**
     * Get Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure. 
     * @return CustomPolicyDocument Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     */
    public String getCustomPolicyDocument() {
        return this.CustomPolicyDocument;
    }

    /**
     * Set Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     * @param CustomPolicyDocument Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     */
    public void setCustomPolicyDocument(String CustomPolicyDocument) {
        this.CustomPolicyDocument = CustomPolicyDocument;
    }

    public AddPermissionPolicyToRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddPermissionPolicyToRoleConfigurationRequest(AddPermissionPolicyToRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyNames != null) {
            this.RolePolicyNames = new String[source.RolePolicyNames.length];
            for (int i = 0; i < source.RolePolicyNames.length; i++) {
                this.RolePolicyNames[i] = new String(source.RolePolicyNames[i]);
            }
        }
        if (source.RolePolicies != null) {
            this.RolePolicies = new PolicyDetail[source.RolePolicies.length];
            for (int i = 0; i < source.RolePolicies.length; i++) {
                this.RolePolicies[i] = new PolicyDetail(source.RolePolicies[i]);
            }
        }
        if (source.CustomPolicyDocument != null) {
            this.CustomPolicyDocument = new String(source.CustomPolicyDocument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamArraySimple(map, prefix + "RolePolicyNames.", this.RolePolicyNames);
        this.setParamArrayObj(map, prefix + "RolePolicies.", this.RolePolicies);
        this.setParamSimple(map, prefix + "CustomPolicyDocument", this.CustomPolicyDocument);

    }
}

