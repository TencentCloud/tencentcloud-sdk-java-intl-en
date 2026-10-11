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

public class AddWorkspaceGroupsRequest extends AbstractModel {

    /**
    * User group ID, which can be obtained through the ListWorkspaceGroups API.
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * Workspace ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Role ID, which can be obtained through the ListWorkspaceRoles API.
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
     * Get User group ID, which can be obtained through the ListWorkspaceGroups API. 
     * @return GroupIds User group ID, which can be obtained through the ListWorkspaceGroups API.
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set User group ID, which can be obtained through the ListWorkspaceGroups API.
     * @param GroupIds User group ID, which can be obtained through the ListWorkspaceGroups API.
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

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
     * @return RoleIds Role ID, which can be obtained through the ListWorkspaceRoles API.
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set Role ID, which can be obtained through the ListWorkspaceRoles API.
     * @param RoleIds Role ID, which can be obtained through the ListWorkspaceRoles API.
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    public AddWorkspaceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddWorkspaceGroupsRequest(AddWorkspaceGroupsRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);

    }
}

