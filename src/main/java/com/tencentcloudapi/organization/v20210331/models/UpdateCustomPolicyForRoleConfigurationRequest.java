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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCustomPolicyForRoleConfigurationRequest extends AbstractModel {

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
    * Permission policy name, which contains up to 32 characters.
    */
    @SerializedName("CustomPolicyName")
    @Expose
    private String CustomPolicyName;

    /**
    * Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
    */
    @SerializedName("NewCustomPolicyDocument")
    @Expose
    private String NewCustomPolicyDocument;

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
     * Get Permission policy name, which contains up to 32 characters. 
     * @return CustomPolicyName Permission policy name, which contains up to 32 characters.
     */
    public String getCustomPolicyName() {
        return this.CustomPolicyName;
    }

    /**
     * Set Permission policy name, which contains up to 32 characters.
     * @param CustomPolicyName Permission policy name, which contains up to 32 characters.
     */
    public void setCustomPolicyName(String CustomPolicyName) {
        this.CustomPolicyName = CustomPolicyName;
    }

    /**
     * Get Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure. 
     * @return NewCustomPolicyDocument Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     */
    public String getNewCustomPolicyDocument() {
        return this.NewCustomPolicyDocument;
    }

    /**
     * Set Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     * @param NewCustomPolicyDocument Custom policy content, which contains up to 4096 characters. When RolePolicyType is Inline, this parameter must be configured. For details, see the permission policy syntax and structure.
     */
    public void setNewCustomPolicyDocument(String NewCustomPolicyDocument) {
        this.NewCustomPolicyDocument = NewCustomPolicyDocument;
    }

    public UpdateCustomPolicyForRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCustomPolicyForRoleConfigurationRequest(UpdateCustomPolicyForRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.CustomPolicyName != null) {
            this.CustomPolicyName = new String(source.CustomPolicyName);
        }
        if (source.NewCustomPolicyDocument != null) {
            this.NewCustomPolicyDocument = new String(source.NewCustomPolicyDocument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "CustomPolicyName", this.CustomPolicyName);
        this.setParamSimple(map, prefix + "NewCustomPolicyDocument", this.NewCustomPolicyDocument);

    }
}

