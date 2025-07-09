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

public class RemovePermissionPolicyFromRoleConfigurationRequest extends AbstractModel {

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
    * Permission policy name, which contains up to 32 characters.
    */
    @SerializedName("RolePolicyName")
    @Expose
    private String RolePolicyName;

    /**
    * Policy ID.
    */
    @SerializedName("RolePolicyId")
    @Expose
    private Long RolePolicyId;

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
     * Get Permission policy name, which contains up to 32 characters. 
     * @return RolePolicyName Permission policy name, which contains up to 32 characters.
     */
    public String getRolePolicyName() {
        return this.RolePolicyName;
    }

    /**
     * Set Permission policy name, which contains up to 32 characters.
     * @param RolePolicyName Permission policy name, which contains up to 32 characters.
     */
    public void setRolePolicyName(String RolePolicyName) {
        this.RolePolicyName = RolePolicyName;
    }

    /**
     * Get Policy ID. 
     * @return RolePolicyId Policy ID.
     */
    public Long getRolePolicyId() {
        return this.RolePolicyId;
    }

    /**
     * Set Policy ID.
     * @param RolePolicyId Policy ID.
     */
    public void setRolePolicyId(Long RolePolicyId) {
        this.RolePolicyId = RolePolicyId;
    }

    public RemovePermissionPolicyFromRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemovePermissionPolicyFromRoleConfigurationRequest(RemovePermissionPolicyFromRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyName != null) {
            this.RolePolicyName = new String(source.RolePolicyName);
        }
        if (source.RolePolicyId != null) {
            this.RolePolicyId = new Long(source.RolePolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamSimple(map, prefix + "RolePolicyName", this.RolePolicyName);
        this.setParamSimple(map, prefix + "RolePolicyId", this.RolePolicyId);

    }
}

