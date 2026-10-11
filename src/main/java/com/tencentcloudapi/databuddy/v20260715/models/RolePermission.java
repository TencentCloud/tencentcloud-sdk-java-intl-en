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

public class RolePermission extends AbstractModel {

    /**
    * <p>Module ID, which must be the module ID of a feature module (leaf node) activated for the current tenant (hierarchical encoded string, for example 101=quick start, 109=workflow, 116101103=workspace management_role permission). An illegal value returns InvalidParameterValue. Method for obtaining the module list: call the ListWorkspaceModules API to query the workspace module list, and take the returned Items[].ModuleId field (leaf nodes with IsLeaf set to true). You can also view it on the "Workspace settings-Role permission" page in the console.</p>
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * <p>Module access permission. Single value: R=read-only, RW=read-write, RWD=read and write delete, N=no permission</p>
    */
    @SerializedName("Permissions")
    @Expose
    private String Permissions;

    /**
     * Get <p>Module ID, which must be the module ID of a feature module (leaf node) activated for the current tenant (hierarchical encoded string, for example 101=quick start, 109=workflow, 116101103=workspace management_role permission). An illegal value returns InvalidParameterValue. Method for obtaining the module list: call the ListWorkspaceModules API to query the workspace module list, and take the returned Items[].ModuleId field (leaf nodes with IsLeaf set to true). You can also view it on the "Workspace settings-Role permission" page in the console.</p> 
     * @return ModuleId <p>Module ID, which must be the module ID of a feature module (leaf node) activated for the current tenant (hierarchical encoded string, for example 101=quick start, 109=workflow, 116101103=workspace management_role permission). An illegal value returns InvalidParameterValue. Method for obtaining the module list: call the ListWorkspaceModules API to query the workspace module list, and take the returned Items[].ModuleId field (leaf nodes with IsLeaf set to true). You can also view it on the "Workspace settings-Role permission" page in the console.</p>
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set <p>Module ID, which must be the module ID of a feature module (leaf node) activated for the current tenant (hierarchical encoded string, for example 101=quick start, 109=workflow, 116101103=workspace management_role permission). An illegal value returns InvalidParameterValue. Method for obtaining the module list: call the ListWorkspaceModules API to query the workspace module list, and take the returned Items[].ModuleId field (leaf nodes with IsLeaf set to true). You can also view it on the "Workspace settings-Role permission" page in the console.</p>
     * @param ModuleId <p>Module ID, which must be the module ID of a feature module (leaf node) activated for the current tenant (hierarchical encoded string, for example 101=quick start, 109=workflow, 116101103=workspace management_role permission). An illegal value returns InvalidParameterValue. Method for obtaining the module list: call the ListWorkspaceModules API to query the workspace module list, and take the returned Items[].ModuleId field (leaf nodes with IsLeaf set to true). You can also view it on the "Workspace settings-Role permission" page in the console.</p>
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get <p>Module access permission. Single value: R=read-only, RW=read-write, RWD=read and write delete, N=no permission</p> 
     * @return Permissions <p>Module access permission. Single value: R=read-only, RW=read-write, RWD=read and write delete, N=no permission</p>
     */
    public String getPermissions() {
        return this.Permissions;
    }

    /**
     * Set <p>Module access permission. Single value: R=read-only, RW=read-write, RWD=read and write delete, N=no permission</p>
     * @param Permissions <p>Module access permission. Single value: R=read-only, RW=read-write, RWD=read and write delete, N=no permission</p>
     */
    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    public RolePermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePermission(RolePermission source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.Permissions != null) {
            this.Permissions = new String(source.Permissions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "Permissions", this.Permissions);

    }
}

