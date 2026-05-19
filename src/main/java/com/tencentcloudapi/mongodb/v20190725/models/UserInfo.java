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
    * 
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("UserDesc")
    @Expose
    private String UserDesc;

    /**
    * Console password update time.
    */
    @SerializedName("ConsolePassUpdateTime")
    @Expose
    private String ConsolePassUpdateTime;

    /**
     * Get  
     * @return UserName 
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 
     * @param UserName 
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get  
     * @return AuthRole 
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set 
     * @param AuthRole 
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return UserDesc 
     */
    public String getUserDesc() {
        return this.UserDesc;
    }

    /**
     * Set 
     * @param UserDesc 
     */
    public void setUserDesc(String UserDesc) {
        this.UserDesc = UserDesc;
    }

    /**
     * Get Console password update time. 
     * @return ConsolePassUpdateTime Console password update time.
     */
    public String getConsolePassUpdateTime() {
        return this.ConsolePassUpdateTime;
    }

    /**
     * Set Console password update time.
     * @param ConsolePassUpdateTime Console password update time.
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

