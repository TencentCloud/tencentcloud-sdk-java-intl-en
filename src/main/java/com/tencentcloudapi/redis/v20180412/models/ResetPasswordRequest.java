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
    * Reset password. This parameter can be left blank when a password-free instance is used. It is required in other cases.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to switch to a password-free instance.
- false: Switch to a non-password-free instance.
- true: Switch to a password-free instance. Default value: false.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

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
     * Get Reset password. This parameter can be left blank when a password-free instance is used. It is required in other cases. 
     * @return Password Reset password. This parameter can be left blank when a password-free instance is used. It is required in other cases.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Reset password. This parameter can be left blank when a password-free instance is used. It is required in other cases.
     * @param Password Reset password. This parameter can be left blank when a password-free instance is used. It is required in other cases.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to switch to a password-free instance.
- false: Switch to a non-password-free instance.
- true: Switch to a password-free instance. Default value: false. 
     * @return NoAuth Whether to switch to a password-free instance.
- false: Switch to a non-password-free instance.
- true: Switch to a password-free instance. Default value: false.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether to switch to a password-free instance.
- false: Switch to a non-password-free instance.
- true: Switch to a password-free instance. Default value: false.
     * @param NoAuth Whether to switch to a password-free instance.
- false: Switch to a non-password-free instance.
- true: Switch to a password-free instance. Default value: false.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

