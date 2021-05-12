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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutRolePermissionsBoundaryRequest extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Role ID (either it or the role name must be entered)
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name (either it or the role ID must be entered)
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Role ID (either it or the role name must be entered) 
     * @return RoleId Role ID (either it or the role name must be entered)
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID (either it or the role name must be entered)
     * @param RoleId Role ID (either it or the role name must be entered)
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name (either it or the role ID must be entered) 
     * @return RoleName Role name (either it or the role ID must be entered)
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name (either it or the role ID must be entered)
     * @param RoleName Role name (either it or the role ID must be entered)
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public PutRolePermissionsBoundaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutRolePermissionsBoundaryRequest(PutRolePermissionsBoundaryRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

