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

public class InstanceUserInfo extends AbstractModel {

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Authentication database</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Get role list (new method)</p>
    */
    @SerializedName("Roles")
    @Expose
    private Role [] Roles;

    /**
    * <p>Permission list (old method)</p>
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Console password last update time</p>
    */
    @SerializedName("ConsolePassUpdateTime")
    @Expose
    private String ConsolePassUpdateTime;

    /**
    * <p>Whether to enable password rotation</p>
    */
    @SerializedName("EnablePasswordRotation")
    @Expose
    private Long EnablePasswordRotation;

    /**
    * <p>Custom description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Authentication database</p> 
     * @return Database <p>Authentication database</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Authentication database</p>
     * @param Database <p>Authentication database</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Get role list (new method)</p> 
     * @return Roles <p>Get role list (new method)</p>
     */
    public Role [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>Get role list (new method)</p>
     * @param Roles <p>Get role list (new method)</p>
     */
    public void setRoles(Role [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>Permission list (old method)</p> 
     * @return AuthRole <p>Permission list (old method)</p>
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set <p>Permission list (old method)</p>
     * @param AuthRole <p>Permission list (old method)</p>
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Console password last update time</p> 
     * @return ConsolePassUpdateTime <p>Console password last update time</p>
     */
    public String getConsolePassUpdateTime() {
        return this.ConsolePassUpdateTime;
    }

    /**
     * Set <p>Console password last update time</p>
     * @param ConsolePassUpdateTime <p>Console password last update time</p>
     */
    public void setConsolePassUpdateTime(String ConsolePassUpdateTime) {
        this.ConsolePassUpdateTime = ConsolePassUpdateTime;
    }

    /**
     * Get <p>Whether to enable password rotation</p> 
     * @return EnablePasswordRotation <p>Whether to enable password rotation</p>
     */
    public Long getEnablePasswordRotation() {
        return this.EnablePasswordRotation;
    }

    /**
     * Set <p>Whether to enable password rotation</p>
     * @param EnablePasswordRotation <p>Whether to enable password rotation</p>
     */
    public void setEnablePasswordRotation(Long EnablePasswordRotation) {
        this.EnablePasswordRotation = EnablePasswordRotation;
    }

    /**
     * Get <p>Custom description</p> 
     * @return Description <p>Custom description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Custom description</p>
     * @param Description <p>Custom description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public InstanceUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUserInfo(InstanceUserInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Roles != null) {
            this.Roles = new Role[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new Role(source.Roles[i]);
            }
        }
        if (source.AuthRole != null) {
            this.AuthRole = new Auth[source.AuthRole.length];
            for (int i = 0; i < source.AuthRole.length; i++) {
                this.AuthRole[i] = new Auth(source.AuthRole[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ConsolePassUpdateTime != null) {
            this.ConsolePassUpdateTime = new String(source.ConsolePassUpdateTime);
        }
        if (source.EnablePasswordRotation != null) {
            this.EnablePasswordRotation = new Long(source.EnablePasswordRotation);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ConsolePassUpdateTime", this.ConsolePassUpdateTime);
        this.setParamSimple(map, prefix + "EnablePasswordRotation", this.EnablePasswordRotation);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

