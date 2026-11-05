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

public class UpdateInstanceRoleRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Role name.</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Belonging Database of the character.</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Role permission list. If not passed, no modification will be made.</p>
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * <p>Get role list. If not passed, no modification is made.</p>
    */
    @SerializedName("InheritedRoles")
    @Expose
    private Role [] InheritedRoles;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get <p>Belonging Database of the character.</p> 
     * @return Database <p>Belonging Database of the character.</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Belonging Database of the character.</p>
     * @param Database <p>Belonging Database of the character.</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Role permission list. If not passed, no modification will be made.</p> 
     * @return Privileges <p>Role permission list. If not passed, no modification will be made.</p>
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>Role permission list. If not passed, no modification will be made.</p>
     * @param Privileges <p>Role permission list. If not passed, no modification will be made.</p>
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>Get role list. If not passed, no modification is made.</p> 
     * @return InheritedRoles <p>Get role list. If not passed, no modification is made.</p>
     */
    public Role [] getInheritedRoles() {
        return this.InheritedRoles;
    }

    /**
     * Set <p>Get role list. If not passed, no modification is made.</p>
     * @param InheritedRoles <p>Get role list. If not passed, no modification is made.</p>
     */
    public void setInheritedRoles(Role [] InheritedRoles) {
        this.InheritedRoles = InheritedRoles;
    }

    public UpdateInstanceRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInstanceRoleRequest(UpdateInstanceRoleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamArrayObj(map, prefix + "InheritedRoles.", this.InheritedRoles);

    }
}

