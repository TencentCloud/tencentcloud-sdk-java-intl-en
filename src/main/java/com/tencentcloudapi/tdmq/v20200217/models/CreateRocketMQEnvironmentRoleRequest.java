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

public class CreateRocketMQEnvironmentRoleRequest extends AbstractModel {

    /**
    * Namespace
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
    * Authorization item, which can contain a non-empty character array of up to 2 items including produce and consume.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * Required field, cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Permission configuration for topic and group dimensions.
    */
    @SerializedName("DetailedPerms")
    @Expose
    private DetailedRolePerm [] DetailedPerms;

    /**
     * Get Namespace 
     * @return EnvironmentId Namespace
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace
     * @param EnvironmentId Namespace
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
     * Get Authorization item, which can contain a non-empty character array of up to 2 items including produce and consume. 
     * @return Permissions Authorization item, which can contain a non-empty character array of up to 2 items including produce and consume.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Authorization item, which can contain a non-empty character array of up to 2 items including produce and consume.
     * @param Permissions Authorization item, which can contain a non-empty character array of up to 2 items including produce and consume.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get Required field, cluster ID 
     * @return ClusterId Required field, cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Required field, cluster ID
     * @param ClusterId Required field, cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Permission configuration for topic and group dimensions. 
     * @return DetailedPerms Permission configuration for topic and group dimensions.
     */
    public DetailedRolePerm [] getDetailedPerms() {
        return this.DetailedPerms;
    }

    /**
     * Set Permission configuration for topic and group dimensions.
     * @param DetailedPerms Permission configuration for topic and group dimensions.
     */
    public void setDetailedPerms(DetailedRolePerm [] DetailedPerms) {
        this.DetailedPerms = DetailedPerms;
    }

    public CreateRocketMQEnvironmentRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQEnvironmentRoleRequest(CreateRocketMQEnvironmentRoleRequest source) {
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
        if (source.DetailedPerms != null) {
            this.DetailedPerms = new DetailedRolePerm[source.DetailedPerms.length];
            for (int i = 0; i < source.DetailedPerms.length; i++) {
                this.DetailedPerms[i] = new DetailedRolePerm(source.DetailedPerms[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DetailedPerms.", this.DetailedPerms);

    }
}

