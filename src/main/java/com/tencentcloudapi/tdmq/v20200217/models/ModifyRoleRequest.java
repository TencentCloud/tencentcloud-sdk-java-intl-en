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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoleRequest extends AbstractModel {

    /**
    * Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Cluster ID (required)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Batch binds namespace information.
    */
    @SerializedName("EnvironmentRoleSets")
    @Expose
    private EnvironmentRoleSet [] EnvironmentRoleSets;

    /**
    * Unbinds all namespaces. set to true.
    */
    @SerializedName("UnbindAllEnvironment")
    @Expose
    private Boolean UnbindAllEnvironment;

    /**
     * Get Role name, which can contain up to 32 letters, digits, hyphens, and underscores. 
     * @return RoleName Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     * @param RoleName Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Cluster ID (required) 
     * @return ClusterId Cluster ID (required)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID (required)
     * @param ClusterId Cluster ID (required)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Batch binds namespace information. 
     * @return EnvironmentRoleSets Batch binds namespace information.
     */
    public EnvironmentRoleSet [] getEnvironmentRoleSets() {
        return this.EnvironmentRoleSets;
    }

    /**
     * Set Batch binds namespace information.
     * @param EnvironmentRoleSets Batch binds namespace information.
     */
    public void setEnvironmentRoleSets(EnvironmentRoleSet [] EnvironmentRoleSets) {
        this.EnvironmentRoleSets = EnvironmentRoleSets;
    }

    /**
     * Get Unbinds all namespaces. set to true. 
     * @return UnbindAllEnvironment Unbinds all namespaces. set to true.
     */
    public Boolean getUnbindAllEnvironment() {
        return this.UnbindAllEnvironment;
    }

    /**
     * Set Unbinds all namespaces. set to true.
     * @param UnbindAllEnvironment Unbinds all namespaces. set to true.
     */
    public void setUnbindAllEnvironment(Boolean UnbindAllEnvironment) {
        this.UnbindAllEnvironment = UnbindAllEnvironment;
    }

    public ModifyRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoleRequest(ModifyRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EnvironmentRoleSets != null) {
            this.EnvironmentRoleSets = new EnvironmentRoleSet[source.EnvironmentRoleSets.length];
            for (int i = 0; i < source.EnvironmentRoleSets.length; i++) {
                this.EnvironmentRoleSets[i] = new EnvironmentRoleSet(source.EnvironmentRoleSets[i]);
            }
        }
        if (source.UnbindAllEnvironment != null) {
            this.UnbindAllEnvironment = new Boolean(source.UnbindAllEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "EnvironmentRoleSets.", this.EnvironmentRoleSets);
        this.setParamSimple(map, prefix + "UnbindAllEnvironment", this.UnbindAllEnvironment);

    }
}

