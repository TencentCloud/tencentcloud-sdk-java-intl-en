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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginEvent extends AbstractModel {

    /**
    * <p>Basic user information</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>The user name entered when the user logged in</p>
    */
    @SerializedName("UserLoginName")
    @Expose
    private String UserLoginName;

    /**
    * <p>Login result</p>
    */
    @SerializedName("LoginResult")
    @Expose
    private Result LoginResult;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>Basic user information</p> 
     * @return UserInfo <p>Basic user information</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>Basic user information</p>
     * @param UserInfo <p>Basic user information</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>The user name entered when the user logged in</p> 
     * @return UserLoginName <p>The user name entered when the user logged in</p>
     */
    public String getUserLoginName() {
        return this.UserLoginName;
    }

    /**
     * Set <p>The user name entered when the user logged in</p>
     * @param UserLoginName <p>The user name entered when the user logged in</p>
     */
    public void setUserLoginName(String UserLoginName) {
        this.UserLoginName = UserLoginName;
    }

    /**
     * Get <p>Login result</p> 
     * @return LoginResult <p>Login result</p>
     */
    public Result getLoginResult() {
        return this.LoginResult;
    }

    /**
     * Set <p>Login result</p>
     * @param LoginResult <p>Login result</p>
     */
    public void setLoginResult(Result LoginResult) {
        this.LoginResult = LoginResult;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public LoginEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginEvent(LoginEvent source) {
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.UserLoginName != null) {
            this.UserLoginName = new String(source.UserLoginName);
        }
        if (source.LoginResult != null) {
            this.LoginResult = new Result(source.LoginResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "UserLoginName", this.UserLoginName);
        this.setParamObj(map, prefix + "LoginResult.", this.LoginResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

