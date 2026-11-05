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

public class CreateInstanceUserRequest extends AbstractModel {

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Encrypted password (choose either this or Password)</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
    * <p>Authentication database (Belonging Database of the user).</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Get role list (new method, can include built-in role and custom role)</p>
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
    * <p>Custom description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether password rotation is enabled (0: not enabled, 1: enabled)</p>
    */
    @SerializedName("EnablePasswordRotation")
    @Expose
    private Long EnablePasswordRotation;

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get <p>Password</p> 
     * @return Password <p>Password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password</p>
     * @param Password <p>Password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Encrypted password (choose either this or Password)</p> 
     * @return EncryptedPassword <p>Encrypted password (choose either this or Password)</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>Encrypted password (choose either this or Password)</p>
     * @param EncryptedPassword <p>Encrypted password (choose either this or Password)</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    /**
     * Get <p>Authentication database (Belonging Database of the user).</p> 
     * @return Database <p>Authentication database (Belonging Database of the user).</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Authentication database (Belonging Database of the user).</p>
     * @param Database <p>Authentication database (Belonging Database of the user).</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Get role list (new method, can include built-in role and custom role)</p> 
     * @return Roles <p>Get role list (new method, can include built-in role and custom role)</p>
     */
    public Role [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>Get role list (new method, can include built-in role and custom role)</p>
     * @param Roles <p>Get role list (new method, can include built-in role and custom role)</p>
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
     * Get <p>Custom description.</p> 
     * @return Description <p>Custom description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Custom description.</p>
     * @param Description <p>Custom description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether password rotation is enabled (0: not enabled, 1: enabled)</p> 
     * @return EnablePasswordRotation <p>Whether password rotation is enabled (0: not enabled, 1: enabled)</p>
     */
    public Long getEnablePasswordRotation() {
        return this.EnablePasswordRotation;
    }

    /**
     * Set <p>Whether password rotation is enabled (0: not enabled, 1: enabled)</p>
     * @param EnablePasswordRotation <p>Whether password rotation is enabled (0: not enabled, 1: enabled)</p>
     */
    public void setEnablePasswordRotation(Long EnablePasswordRotation) {
        this.EnablePasswordRotation = EnablePasswordRotation;
    }

    public CreateInstanceUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceUserRequest(CreateInstanceUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnablePasswordRotation != null) {
            this.EnablePasswordRotation = new Long(source.EnablePasswordRotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnablePasswordRotation", this.EnablePasswordRotation);

    }
}

