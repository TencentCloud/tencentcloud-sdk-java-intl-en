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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleAccount extends AbstractModel {

    /**
    * <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>User password</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Tencent Cloud account SecretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>Tencent Cloud Account SecretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>Electronic mailbox for sending verification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>User password</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password <p>User password</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>User password</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password <p>User password</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Tencent Cloud account SecretId</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretId <p>Tencent Cloud account SecretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>Tencent Cloud account SecretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretId <p>Tencent Cloud account SecretId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>Tencent Cloud Account SecretKey</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey <p>Tencent Cloud Account SecretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>Tencent Cloud Account SecretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey <p>Tencent Cloud Account SecretKey</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>Electronic mailbox for sending verification code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email <p>Electronic mailbox for sending verification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>Electronic mailbox for sending verification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email <p>Electronic mailbox for sending verification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ConsoleAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleAccount(ConsoleAccount source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

