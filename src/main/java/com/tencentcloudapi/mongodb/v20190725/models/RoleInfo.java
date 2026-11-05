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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel {

    /**
    * <p>Role name.</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Character's Belonging Database</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>Grant permission</p>
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * <p>Inheritable role.</p>
    */
    @SerializedName("InheritedRoles")
    @Expose
    private Role [] InheritedRoles;

    /**
     * Get <p>Role name.</p> 
     * @return RoleName <p>Role name.</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Role name.</p>
     * @param RoleName <p>Role name.</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Character's Belonging Database</p> 
     * @return Database <p>Character's Belonging Database</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Character's Belonging Database</p>
     * @param Database <p>Character's Belonging Database</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role</p> 
     * @return RoleType <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role</p>
     * @param RoleType <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>Grant permission</p> 
     * @return Privileges <p>Grant permission</p>
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>Grant permission</p>
     * @param Privileges <p>Grant permission</p>
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>Inheritable role.</p> 
     * @return InheritedRoles <p>Inheritable role.</p>
     */
    public Role [] getInheritedRoles() {
        return this.InheritedRoles;
    }

    /**
     * Set <p>Inheritable role.</p>
     * @param InheritedRoles <p>Inheritable role.</p>
     */
    public void setInheritedRoles(Role [] InheritedRoles) {
        this.InheritedRoles = InheritedRoles;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.Privileges != null) {
            this.Privileges = new RolePrivilege[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new RolePrivilege(source.Privileges[i]);
            }
        }
        if (source.InheritedRoles != null) {
            this.InheritedRoles = new Role[source.InheritedRoles.length];
            for (int i = 0; i < source.InheritedRoles.length; i++) {
                this.InheritedRoles[i] = new Role(source.InheritedRoles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamArrayObj(map, prefix + "InheritedRoles.", this.InheritedRoles);

    }
}

