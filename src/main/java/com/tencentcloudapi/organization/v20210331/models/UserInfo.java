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

public class UserInfo extends AbstractModel {

    /**
    * Queried username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * First name of the user.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name of the user.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

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
    * User status. Valid values: Enabled, Disabled.
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
    * Creation time of the user.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time of the user.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether selected
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

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
     * Get First name of the user. 
     * @return FirstName First name of the user.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name of the user.
     * @param FirstName First name of the user.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Last name of the user. 
     * @return LastName Last name of the user.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name of the user.
     * @param LastName Last name of the user.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * Get User status. Valid values: Enabled, Disabled. 
     * @return UserStatus User status. Valid values: Enabled, Disabled.
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set User status. Valid values: Enabled, Disabled.
     * @param UserStatus User status. Valid values: Enabled, Disabled.
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
     * Get Creation time of the user. 
     * @return CreateTime Creation time of the user.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the user.
     * @param CreateTime Creation time of the user.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time of the user. 
     * @return UpdateTime Modification time of the user.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time of the user.
     * @param UpdateTime Modification time of the user.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether selected 
     * @return IsSelected Whether selected
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set Whether selected
     * @param IsSelected Whether selected
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
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
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);

    }
}

