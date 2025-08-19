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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleListDataRoleInfo extends AbstractModel {

    /**
    * Role Name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Whether it is a global role (0: no; 1: yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
    * Role key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleCollection")
    @Expose
    private String ModuleCollection;

    /**
     * Get Role Name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleName Role Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role Name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleName Role Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleId Role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleId Role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Whether it is a global role (0: no; 1: yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScopeType Whether it is a global role (0: no; 1: yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set Whether it is a global role (0: no; 1: yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScopeType Whether it is a global role (0: no; 1: yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get Role key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModuleCollection Role key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModuleCollection() {
        return this.ModuleCollection;
    }

    /**
     * Set Role key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModuleCollection Role key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleCollection(String ModuleCollection) {
        this.ModuleCollection = ModuleCollection;
    }

    public UserRoleListDataRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleListDataRoleInfo(UserRoleListDataRoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
        if (source.ModuleCollection != null) {
            this.ModuleCollection = new String(source.ModuleCollection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "ModuleCollection", this.ModuleCollection);

    }
}

