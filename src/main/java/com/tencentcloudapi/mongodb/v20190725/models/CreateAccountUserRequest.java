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

public class CreateAccountUserRequest extends AbstractModel {

    /**
    * Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * New account name. The format requirements are as follows:
- The value range for the character length is [1, 64].
- Allowed characters include uppercase letters, lowercase letters, digits (1–9), underscores (\_), and hyphens (-).
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * New account password. The password complexity requirements are as follows:
- The value range for the character length is [8, 32].
- It should include at least two of the following: letters, digits, and special characters (the exclamation mark (!), at sign (@), number sign (#), percent sign (%), caret (^), asterisk (*), parentheses (), and underscore (_)).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Password corresponding to the mongouser account. mongouser is the default account of the system; it indicates the password set during instance creation.
    */
    @SerializedName("MongoUserPassword")
    @Expose
    private String MongoUserPassword;

    /**
    * Account remarks.
    */
    @SerializedName("UserDesc")
    @Expose
    private String UserDesc;

    /**
    * Read/Write permission information of the account.
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
     * Get Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get New account name. The format requirements are as follows:
- The value range for the character length is [1, 64].
- Allowed characters include uppercase letters, lowercase letters, digits (1–9), underscores (\_), and hyphens (-). 
     * @return UserName New account name. The format requirements are as follows:
- The value range for the character length is [1, 64].
- Allowed characters include uppercase letters, lowercase letters, digits (1–9), underscores (\_), and hyphens (-).
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set New account name. The format requirements are as follows:
- The value range for the character length is [1, 64].
- Allowed characters include uppercase letters, lowercase letters, digits (1–9), underscores (\_), and hyphens (-).
     * @param UserName New account name. The format requirements are as follows:
- The value range for the character length is [1, 64].
- Allowed characters include uppercase letters, lowercase letters, digits (1–9), underscores (\_), and hyphens (-).
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get New account password. The password complexity requirements are as follows:
- The value range for the character length is [8, 32].
- It should include at least two of the following: letters, digits, and special characters (the exclamation mark (!), at sign (@), number sign (#), percent sign (%), caret (^), asterisk (*), parentheses (), and underscore (_)). 
     * @return Password New account password. The password complexity requirements are as follows:
- The value range for the character length is [8, 32].
- It should include at least two of the following: letters, digits, and special characters (the exclamation mark (!), at sign (@), number sign (#), percent sign (%), caret (^), asterisk (*), parentheses (), and underscore (_)).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New account password. The password complexity requirements are as follows:
- The value range for the character length is [8, 32].
- It should include at least two of the following: letters, digits, and special characters (the exclamation mark (!), at sign (@), number sign (#), percent sign (%), caret (^), asterisk (*), parentheses (), and underscore (_)).
     * @param Password New account password. The password complexity requirements are as follows:
- The value range for the character length is [8, 32].
- It should include at least two of the following: letters, digits, and special characters (the exclamation mark (!), at sign (@), number sign (#), percent sign (%), caret (^), asterisk (*), parentheses (), and underscore (_)).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Password corresponding to the mongouser account. mongouser is the default account of the system; it indicates the password set during instance creation. 
     * @return MongoUserPassword Password corresponding to the mongouser account. mongouser is the default account of the system; it indicates the password set during instance creation.
     */
    public String getMongoUserPassword() {
        return this.MongoUserPassword;
    }

    /**
     * Set Password corresponding to the mongouser account. mongouser is the default account of the system; it indicates the password set during instance creation.
     * @param MongoUserPassword Password corresponding to the mongouser account. mongouser is the default account of the system; it indicates the password set during instance creation.
     */
    public void setMongoUserPassword(String MongoUserPassword) {
        this.MongoUserPassword = MongoUserPassword;
    }

    /**
     * Get Account remarks. 
     * @return UserDesc Account remarks.
     */
    public String getUserDesc() {
        return this.UserDesc;
    }

    /**
     * Set Account remarks.
     * @param UserDesc Account remarks.
     */
    public void setUserDesc(String UserDesc) {
        this.UserDesc = UserDesc;
    }

    /**
     * Get Read/Write permission information of the account. 
     * @return AuthRole Read/Write permission information of the account.
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set Read/Write permission information of the account.
     * @param AuthRole Read/Write permission information of the account.
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    public CreateAccountUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountUserRequest(CreateAccountUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.MongoUserPassword != null) {
            this.MongoUserPassword = new String(source.MongoUserPassword);
        }
        if (source.UserDesc != null) {
            this.UserDesc = new String(source.UserDesc);
        }
        if (source.AuthRole != null) {
            this.AuthRole = new Auth[source.AuthRole.length];
            for (int i = 0; i < source.AuthRole.length; i++) {
                this.AuthRole[i] = new Auth(source.AuthRole[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "MongoUserPassword", this.MongoUserPassword);
        this.setParamSimple(map, prefix + "UserDesc", this.UserDesc);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);

    }
}

