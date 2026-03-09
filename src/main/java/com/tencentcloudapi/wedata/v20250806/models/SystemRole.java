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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemRole extends AbstractModel {

    /**
    * Role id.
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Display name of the role.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleDisplayName")
    @Expose
    private String RoleDisplayName;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Role id. 
     * @return RoleId Role id.
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role id.
     * @param RoleId Role id.
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Display name of the role.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleDisplayName Display name of the role.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleDisplayName() {
        return this.RoleDisplayName;
    }

    /**
     * Set Display name of the role.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleDisplayName Display name of the role.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleDisplayName(String RoleDisplayName) {
        this.RoleDisplayName = RoleDisplayName;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public SystemRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemRole(SystemRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleDisplayName != null) {
            this.RoleDisplayName = new String(source.RoleDisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleDisplayName", this.RoleDisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

