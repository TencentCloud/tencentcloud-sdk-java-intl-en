/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupMembers extends AbstractModel {

    /**
    * Queried username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Display name of the user.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Email address of the user, which must be unique within the directory.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * User status: Enabled, Disabled.
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * User type. Manual: manually created; Synchronized: externally imported.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * User ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Time when the user joins the user group.
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
     * Get Queried username. 
     * @return UserName Queried username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Queried username.
     * @param UserName Queried username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Display name of the user. 
     * @return DisplayName Display name of the user.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display name of the user.
     * @param DisplayName Display name of the user.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User description. 
     * @return Description User description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User description.
     * @param Description User description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Email address of the user, which must be unique within the directory. 
     * @return Email Email address of the user, which must be unique within the directory.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address of the user, which must be unique within the directory.
     * @param Email Email address of the user, which must be unique within the directory.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get User status: Enabled, Disabled. 
     * @return UserStatus User status: Enabled, Disabled.
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set User status: Enabled, Disabled.
     * @param UserStatus User status: Enabled, Disabled.
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get User type. Manual: manually created; Synchronized: externally imported. 
     * @return UserType User type. Manual: manually created; Synchronized: externally imported.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set User type. Manual: manually created; Synchronized: externally imported.
     * @param UserType User type. Manual: manually created; Synchronized: externally imported.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get User ID. 
     * @return UserId User ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID.
     * @param UserId User ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Time when the user joins the user group. 
     * @return JoinTime Time when the user joins the user group.
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set Time when the user joins the user group.
     * @param JoinTime Time when the user joins the user group.
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    public GroupMembers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupMembers(GroupMembers source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.UserStatus != null) {
            this.UserStatus = new String(source.UserStatus);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);

    }
}

