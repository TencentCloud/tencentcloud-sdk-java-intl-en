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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateWorkspaceRoleRequest extends AbstractModel {

    /**
    * Workspace ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Role information.
    */
    @SerializedName("BasicInfo")
    @Expose
    private RoleBasicInfo BasicInfo;

    /**
    * Feature permission
    */
    @SerializedName("Permissions")
    @Expose
    private RolePermission [] Permissions;

    /**
     * Get Workspace ID 
     * @return WorkspaceId Workspace ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set Workspace ID
     * @param WorkspaceId Workspace ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get Role information. 
     * @return BasicInfo Role information.
     */
    public RoleBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set Role information.
     * @param BasicInfo Role information.
     */
    public void setBasicInfo(RoleBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get Feature permission 
     * @return Permissions Feature permission
     */
    public RolePermission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Feature permission
     * @param Permissions Feature permission
     */
    public void setPermissions(RolePermission [] Permissions) {
        this.Permissions = Permissions;
    }

    public UpdateWorkspaceRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkspaceRoleRequest(UpdateWorkspaceRoleRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new RoleBasicInfo(source.BasicInfo);
        }
        if (source.Permissions != null) {
            this.Permissions = new RolePermission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new RolePermission(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

