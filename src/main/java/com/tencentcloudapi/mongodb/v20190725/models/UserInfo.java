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

public class UserInfo extends AbstractModel {

    /**
    * The account name.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The account permission details.
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
    * The time when the account was created.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The time when the account was last updated.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The remarks for the account.
    */
    @SerializedName("UserDesc")
    @Expose
    private String UserDesc;

    /**
    * The time when the console password was last updated.
    */
    @SerializedName("ConsolePassUpdateTime")
    @Expose
    private String ConsolePassUpdateTime;

    /**
     * Get The account name. 
     * @return UserName The account name.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set The account name.
     * @param UserName The account name.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get The account permission details. 
     * @return AuthRole The account permission details.
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set The account permission details.
     * @param AuthRole The account permission details.
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    /**
     * Get The time when the account was created. 
     * @return CreateTime The time when the account was created.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the account was created.
     * @param CreateTime The time when the account was created.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The time when the account was last updated. 
     * @return UpdateTime The time when the account was last updated.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The time when the account was last updated.
     * @param UpdateTime The time when the account was last updated.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The remarks for the account. 
     * @return UserDesc The remarks for the account.
     */
    public String getUserDesc() {
        return this.UserDesc;
    }

    /**
     * Set The remarks for the account.
     * @param UserDesc The remarks for the account.
     */
    public void setUserDesc(String UserDesc) {
        this.UserDesc = UserDesc;
    }

    /**
     * Get The time when the console password was last updated. 
     * @return ConsolePassUpdateTime The time when the console password was last updated.
     */
    public String getConsolePassUpdateTime() {
        return this.ConsolePassUpdateTime;
    }

    /**
     * Set The time when the console password was last updated.
     * @param ConsolePassUpdateTime The time when the console password was last updated.
     */
    public void setConsolePassUpdateTime(String ConsolePassUpdateTime) {
        this.ConsolePassUpdateTime = ConsolePassUpdateTime;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        if (source.UserDesc != null) {
            this.UserDesc = new String(source.UserDesc);
        }
        if (source.ConsolePassUpdateTime != null) {
            this.ConsolePassUpdateTime = new String(source.ConsolePassUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UserDesc", this.UserDesc);
        this.setParamSimple(map, prefix + "ConsolePassUpdateTime", this.ConsolePassUpdateTime);

    }
}

