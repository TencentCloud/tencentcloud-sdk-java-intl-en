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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvironmentRoleRequest extends AbstractModel{

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Role name.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Permissions, which is a non-empty string array of `produce` and `consume` at the most.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * Cluster ID (required)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Role name. 
     * @return RoleName Role name.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name.
     * @param RoleName Role name.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Permissions, which is a non-empty string array of `produce` and `consume` at the most. 
     * @return Permissions Permissions, which is a non-empty string array of `produce` and `consume` at the most.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permissions, which is a non-empty string array of `produce` and `consume` at the most.
     * @param Permissions Permissions, which is a non-empty string array of `produce` and `consume` at the most.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
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

    public CreateEnvironmentRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRoleRequest(CreateEnvironmentRoleRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

