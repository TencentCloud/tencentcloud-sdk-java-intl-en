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

public class DeleteWorkspaceRoleRequest extends AbstractModel {

    /**
    * Workspace ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Role ID, which can be obtained through the ListWorkspaceRoles API.
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

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
     * Get Role ID, which can be obtained through the ListWorkspaceRoles API. 
     * @return RoleId Role ID, which can be obtained through the ListWorkspaceRoles API.
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID, which can be obtained through the ListWorkspaceRoles API.
     * @param RoleId Role ID, which can be obtained through the ListWorkspaceRoles API.
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public DeleteWorkspaceRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkspaceRoleRequest(DeleteWorkspaceRoleRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);

    }
}

