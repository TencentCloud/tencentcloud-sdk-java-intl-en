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

public class PermissionDetail extends AbstractModel {

    /**
    * Permission list of the current user for this entity.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * Permission information of the catalog on the workspace (optional). Value: WORKSPACE_READONLY (read-only) or WORKSPACE_READWRITE (read-write).
    */
    @SerializedName("CatalogWorkspacePrivilege")
    @Expose
    private String CatalogWorkspacePrivilege;

    /**
    * Total deny permission list (user deny ∪ role deny ∪ inherited deny, deduplicated and excluded from Permissions)
    */
    @SerializedName("DenyPrivilegeList")
    @Expose
    private String [] DenyPrivilegeList;

    /**
     * Get Permission list of the current user for this entity. 
     * @return Permissions Permission list of the current user for this entity.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permission list of the current user for this entity.
     * @param Permissions Permission list of the current user for this entity.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get Permission information of the catalog on the workspace (optional). Value: WORKSPACE_READONLY (read-only) or WORKSPACE_READWRITE (read-write). 
     * @return CatalogWorkspacePrivilege Permission information of the catalog on the workspace (optional). Value: WORKSPACE_READONLY (read-only) or WORKSPACE_READWRITE (read-write).
     */
    public String getCatalogWorkspacePrivilege() {
        return this.CatalogWorkspacePrivilege;
    }

    /**
     * Set Permission information of the catalog on the workspace (optional). Value: WORKSPACE_READONLY (read-only) or WORKSPACE_READWRITE (read-write).
     * @param CatalogWorkspacePrivilege Permission information of the catalog on the workspace (optional). Value: WORKSPACE_READONLY (read-only) or WORKSPACE_READWRITE (read-write).
     */
    public void setCatalogWorkspacePrivilege(String CatalogWorkspacePrivilege) {
        this.CatalogWorkspacePrivilege = CatalogWorkspacePrivilege;
    }

    /**
     * Get Total deny permission list (user deny ∪ role deny ∪ inherited deny, deduplicated and excluded from Permissions) 
     * @return DenyPrivilegeList Total deny permission list (user deny ∪ role deny ∪ inherited deny, deduplicated and excluded from Permissions)
     */
    public String [] getDenyPrivilegeList() {
        return this.DenyPrivilegeList;
    }

    /**
     * Set Total deny permission list (user deny ∪ role deny ∪ inherited deny, deduplicated and excluded from Permissions)
     * @param DenyPrivilegeList Total deny permission list (user deny ∪ role deny ∪ inherited deny, deduplicated and excluded from Permissions)
     */
    public void setDenyPrivilegeList(String [] DenyPrivilegeList) {
        this.DenyPrivilegeList = DenyPrivilegeList;
    }

    public PermissionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionDetail(PermissionDetail source) {
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.CatalogWorkspacePrivilege != null) {
            this.CatalogWorkspacePrivilege = new String(source.CatalogWorkspacePrivilege);
        }
        if (source.DenyPrivilegeList != null) {
            this.DenyPrivilegeList = new String[source.DenyPrivilegeList.length];
            for (int i = 0; i < source.DenyPrivilegeList.length; i++) {
                this.DenyPrivilegeList[i] = new String(source.DenyPrivilegeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "CatalogWorkspacePrivilege", this.CatalogWorkspacePrivilege);
        this.setParamArraySimple(map, prefix + "DenyPrivilegeList.", this.DenyPrivilegeList);

    }
}

