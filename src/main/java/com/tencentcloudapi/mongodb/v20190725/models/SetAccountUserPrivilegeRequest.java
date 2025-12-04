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

public class SetAccountUserPrivilegeRequest extends AbstractModel {

    /**
    * Specifies the instance ID for the account to be configured. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sets the account name to access the instance. The setting requirements are as follows: The name should be started with a letter and its length should be 1–64 characters. Only uppercase letters, lowercase letters, digits (1–9), underscores (_), and hyphens (-) can be entered.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Sets the permission information.
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
     * Get Specifies the instance ID for the account to be configured. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list. 
     * @return InstanceId Specifies the instance ID for the account to be configured. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID for the account to be configured. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     * @param InstanceId Specifies the instance ID for the account to be configured. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sets the account name to access the instance. The setting requirements are as follows: The name should be started with a letter and its length should be 1–64 characters. Only uppercase letters, lowercase letters, digits (1–9), underscores (_), and hyphens (-) can be entered. 
     * @return UserName Sets the account name to access the instance. The setting requirements are as follows: The name should be started with a letter and its length should be 1–64 characters. Only uppercase letters, lowercase letters, digits (1–9), underscores (_), and hyphens (-) can be entered.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Sets the account name to access the instance. The setting requirements are as follows: The name should be started with a letter and its length should be 1–64 characters. Only uppercase letters, lowercase letters, digits (1–9), underscores (_), and hyphens (-) can be entered.
     * @param UserName Sets the account name to access the instance. The setting requirements are as follows: The name should be started with a letter and its length should be 1–64 characters. Only uppercase letters, lowercase letters, digits (1–9), underscores (_), and hyphens (-) can be entered.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Sets the permission information. 
     * @return AuthRole Sets the permission information.
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set Sets the permission information.
     * @param AuthRole Sets the permission information.
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    public SetAccountUserPrivilegeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAccountUserPrivilegeRequest(SetAccountUserPrivilegeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);

    }
}

