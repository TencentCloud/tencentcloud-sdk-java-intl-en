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

public class CreateUserRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User name, which must be unique within the space and cannot be modified. It contains up to 64 characters, including digits, English letters, and special characters such as plus signs (+), equal signs (=), commas (,), periods (.), at signs (@), hyphens (-), and underscores (_).
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Last name of the user, which contains up to 64 characters.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * First name of the user, which contains up to 64 characters.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Display name of the user, which contains up to 256 characters.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User description, which contains up to 1024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Email address of the user, which must be unique within the directory and contains up to 128 characters.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * User status. Valid values: Enabled (default), Disabled.
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * User type. Manual: manually created, Synchronized: imported from external sources.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User name, which must be unique within the space and cannot be modified. It contains up to 64 characters, including digits, English letters, and special characters such as plus signs (+), equal signs (=), commas (,), periods (.), at signs (@), hyphens (-), and underscores (_). 
     * @return UserName User name, which must be unique within the space and cannot be modified. It contains up to 64 characters, including digits, English letters, and special characters such as plus signs (+), equal signs (=), commas (,), periods (.), at signs (@), hyphens (-), and underscores (_).
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User name, which must be unique within the space and cannot be modified. It contains up to 64 characters, including digits, English letters, and special characters such as plus signs (+), equal signs (=), commas (,), periods (.), at signs (@), hyphens (-), and underscores (_).
     * @param UserName User name, which must be unique within the space and cannot be modified. It contains up to 64 characters, including digits, English letters, and special characters such as plus signs (+), equal signs (=), commas (,), periods (.), at signs (@), hyphens (-), and underscores (_).
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Last name of the user, which contains up to 64 characters. 
     * @return FirstName Last name of the user, which contains up to 64 characters.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set Last name of the user, which contains up to 64 characters.
     * @param FirstName Last name of the user, which contains up to 64 characters.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get First name of the user, which contains up to 64 characters. 
     * @return LastName First name of the user, which contains up to 64 characters.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set First name of the user, which contains up to 64 characters.
     * @param LastName First name of the user, which contains up to 64 characters.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Display name of the user, which contains up to 256 characters. 
     * @return DisplayName Display name of the user, which contains up to 256 characters.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display name of the user, which contains up to 256 characters.
     * @param DisplayName Display name of the user, which contains up to 256 characters.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User description, which contains up to 1024 characters. 
     * @return Description User description, which contains up to 1024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User description, which contains up to 1024 characters.
     * @param Description User description, which contains up to 1024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Email address of the user, which must be unique within the directory and contains up to 128 characters. 
     * @return Email Email address of the user, which must be unique within the directory and contains up to 128 characters.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address of the user, which must be unique within the directory and contains up to 128 characters.
     * @param Email Email address of the user, which must be unique within the directory and contains up to 128 characters.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get User status. Valid values: Enabled (default), Disabled. 
     * @return UserStatus User status. Valid values: Enabled (default), Disabled.
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set User status. Valid values: Enabled (default), Disabled.
     * @param UserStatus User status. Valid values: Enabled (default), Disabled.
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get User type. Manual: manually created, Synchronized: imported from external sources. 
     * @return UserType User type. Manual: manually created, Synchronized: imported from external sources.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set User type. Manual: manually created, Synchronized: imported from external sources.
     * @param UserType User type. Manual: manually created, Synchronized: imported from external sources.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

