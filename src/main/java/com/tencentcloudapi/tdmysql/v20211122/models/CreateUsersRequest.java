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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUsersRequest extends AbstractModel {

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Add user list</p>
    */
    @SerializedName("Users")
    @Expose
    private User [] Users;

    /**
    * <p>Unencrypted password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Encryption password</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
    * <p>User description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get <p>Add user list</p> 
     * @return Users <p>Add user list</p>
     */
    public User [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>Add user list</p>
     * @param Users <p>Add user list</p>
     */
    public void setUsers(User [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>Unencrypted password</p> 
     * @return Password <p>Unencrypted password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Unencrypted password</p>
     * @param Password <p>Unencrypted password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Encryption password</p> 
     * @return EncryptedPassword <p>Encryption password</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>Encryption password</p>
     * @param EncryptedPassword <p>Encryption password</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    /**
     * Get <p>User description</p> 
     * @return Description <p>User description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>User description</p>
     * @param Description <p>User description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUsersRequest(CreateUsersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Users != null) {
            this.Users = new User[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new User(source.Users[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

