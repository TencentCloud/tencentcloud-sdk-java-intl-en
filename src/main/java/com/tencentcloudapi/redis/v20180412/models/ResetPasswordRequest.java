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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetPasswordRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Reset password. This parameter can be left unspecified when a password-free instance is used.
- It should contain 8 to 32 characters. 12 or more characters are recommended.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to switch to a password-free instance.
- false: switch to an instance that requires a password. The default value is false.
- true: switch to a password-free instance.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * Whether to encrypt the password.
- false: non-encrypted password. The default value is false.
- true: encrypted password.
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Reset password. This parameter can be left unspecified when a password-free instance is used.
- It should contain 8 to 32 characters. 12 or more characters are recommended.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/). 
     * @return Password Reset password. This parameter can be left unspecified when a password-free instance is used.
- It should contain 8 to 32 characters. 12 or more characters are recommended.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Reset password. This parameter can be left unspecified when a password-free instance is used.
- It should contain 8 to 32 characters. 12 or more characters are recommended.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     * @param Password Reset password. This parameter can be left unspecified when a password-free instance is used.
- It should contain 8 to 32 characters. 12 or more characters are recommended.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to switch to a password-free instance.
- false: switch to an instance that requires a password. The default value is false.
- true: switch to a password-free instance. 
     * @return NoAuth Whether to switch to a password-free instance.
- false: switch to an instance that requires a password. The default value is false.
- true: switch to a password-free instance.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether to switch to a password-free instance.
- false: switch to an instance that requires a password. The default value is false.
- true: switch to a password-free instance.
     * @param NoAuth Whether to switch to a password-free instance.
- false: switch to an instance that requires a password. The default value is false.
- true: switch to a password-free instance.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get Whether to encrypt the password.
- false: non-encrypted password. The default value is false.
- true: encrypted password. 
     * @return EncryptPassword Whether to encrypt the password.
- false: non-encrypted password. The default value is false.
- true: encrypted password.
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set Whether to encrypt the password.
- false: non-encrypted password. The default value is false.
- true: encrypted password.
     * @param EncryptPassword Whether to encrypt the password.
- false: non-encrypted password. The default value is false.
- true: encrypted password.
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    public ResetPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetPasswordRequest(ResetPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}

