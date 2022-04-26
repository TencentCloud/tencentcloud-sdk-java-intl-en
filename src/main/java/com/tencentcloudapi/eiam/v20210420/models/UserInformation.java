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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInformation extends AbstractModel{

    /**
    * Username, which can contain up to 32 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User status.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User remarks, which can contain up to 512 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Last update time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * User creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Path ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPath")
    @Expose
    private String OrgPath;

    /**
    * User's mobile number with country code, such as `+86-00000000000`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectGroups")
    @Expose
    private String [] SubjectGroups;

    /**
    * User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Last login time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
    * User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Username, which can contain up to 32 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username, which can contain up to 32 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which can contain up to 32 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username, which can contain up to 32 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User status.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status User status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set User status.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status User status.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User remarks, which can contain up to 512 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description User remarks, which can contain up to 512 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User remarks, which can contain up to 512 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description User remarks, which can contain up to 512 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Last update time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTime Last update time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTime Last update time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get User creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreationTime User creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set User creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreationTime User creation time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Path ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgPath Path ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgPath() {
        return this.OrgPath;
    }

    /**
     * Set Path ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgPath Path ID of the user's primary organization.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPath(String OrgPath) {
        this.OrgPath = OrgPath;
    }

    /**
     * Get User's mobile number with country code, such as `+86-00000000000`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Phone User's mobile number with country code, such as `+86-00000000000`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set User's mobile number with country code, such as `+86-00000000000`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Phone User's mobile number with country code, such as `+86-00000000000`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubjectGroups List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectGroups() {
        return this.SubjectGroups;
    }

    /**
     * Set List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubjectGroups List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectGroups(String [] SubjectGroups) {
        this.SubjectGroups = SubjectGroups;
    }

    /**
     * Get User's email address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Email User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Email User's email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Last login time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastLoginTime Last login time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set Last login time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastLoginTime Last login time of the user in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    /**
     * Get User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UserInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInformation(UserInformation source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.OrgPath != null) {
            this.OrgPath = new String(source.OrgPath);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.SubjectGroups != null) {
            this.SubjectGroups = new String[source.SubjectGroups.length];
            for (int i = 0; i < source.SubjectGroups.length; i++) {
                this.SubjectGroups[i] = new String(source.SubjectGroups[i]);
            }
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "OrgPath", this.OrgPath);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamArraySimple(map, prefix + "SubjectGroups.", this.SubjectGroups);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

