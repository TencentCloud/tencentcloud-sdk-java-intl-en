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

public class DeleteRolesRequest extends AbstractModel {

    /**
    * Array of role names.
    */
    @SerializedName("RoleNames")
    @Expose
    private String [] RoleNames;

    /**
    * Cluster ID (required)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Array of role names. 
     * @return RoleNames Array of role names.
     */
    public String [] getRoleNames() {
        return this.RoleNames;
    }

    /**
     * Set Array of role names.
     * @param RoleNames Array of role names.
     */
    public void setRoleNames(String [] RoleNames) {
        this.RoleNames = RoleNames;
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

    public DeleteRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRolesRequest(DeleteRolesRequest source) {
        if (source.RoleNames != null) {
            this.RoleNames = new String[source.RoleNames.length];
            for (int i = 0; i < source.RoleNames.length; i++) {
                this.RoleNames[i] = new String(source.RoleNames[i]);
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
        this.setParamArraySimple(map, prefix + "RoleNames.", this.RoleNames);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

