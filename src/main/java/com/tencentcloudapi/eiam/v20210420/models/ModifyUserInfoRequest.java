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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserInfoRequest extends AbstractModel {

    /**
    * Username, which can contain up to 32 characters. You need to select either `Username` or `UserId` as the search criterion; if both are selected, `Username` will be used by default.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Nickname, which can contain up to 64 characters and is the same as the username by default.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User remarks, which can contain up to 512 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of IDs of the user's user groups.
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * User ID. You need to select either `UserName` or `UserId` as the search criterion. If both are selected, `UserName` will be used by default.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User's mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * User expiration time in ISO 8601 format.
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * User password, which needs to be configured according to the password policy.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * User's email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Whether the password needs to be reset. Default value: false (no).
    */
    @SerializedName("PwdNeedReset")
    @Expose
    private Boolean PwdNeedReset;

    /**
    * Unique ID of the user's primary organization. If this parameter is left empty, the user will be created under the root node by default.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * List of IDs of the user's secondary organizations.
    */
    @SerializedName("SecondaryOrgNodeIdList")
    @Expose
    private String [] SecondaryOrgNodeIdList;

    /**
     * Get Username, which can contain up to 32 characters. You need to select either `Username` or `UserId` as the search criterion; if both are selected, `Username` will be used by default. 
     * @return UserName Username, which can contain up to 32 characters. You need to select either `Username` or `UserId` as the search criterion; if both are selected, `Username` will be used by default.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which can contain up to 32 characters. You need to select either `Username` or `UserId` as the search criterion; if both are selected, `Username` will be used by default.
     * @param UserName Username, which can contain up to 32 characters. You need to select either `Username` or `UserId` as the search criterion; if both are selected, `Username` will be used by default.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Nickname, which can contain up to 64 characters and is the same as the username by default. 
     * @return DisplayName Nickname, which can contain up to 64 characters and is the same as the username by default.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Nickname, which can contain up to 64 characters and is the same as the username by default.
     * @param DisplayName Nickname, which can contain up to 64 characters and is the same as the username by default.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get User remarks, which can contain up to 512 characters. 
     * @return Description User remarks, which can contain up to 512 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User remarks, which can contain up to 512 characters.
     * @param Description User remarks, which can contain up to 512 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of IDs of the user's user groups. 
     * @return UserGroupIds List of IDs of the user's user groups.
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set List of IDs of the user's user groups.
     * @param UserGroupIds List of IDs of the user's user groups.
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get User ID. You need to select either `UserName` or `UserId` as the search criterion. If both are selected, `UserName` will be used by default. 
     * @return UserId User ID. You need to select either `UserName` or `UserId` as the search criterion. If both are selected, `UserName` will be used by default.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID. You need to select either `UserName` or `UserId` as the search criterion. If both are selected, `UserName` will be used by default.
     * @param UserId User ID. You need to select either `UserName` or `UserId` as the search criterion. If both are selected, `UserName` will be used by default.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User's mobile number. 
     * @return Phone User's mobile number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set User's mobile number.
     * @param Phone User's mobile number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get User expiration time in ISO 8601 format. 
     * @return ExpirationTime User expiration time in ISO 8601 format.
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set User expiration time in ISO 8601 format.
     * @param ExpirationTime User expiration time in ISO 8601 format.
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get User password, which needs to be configured according to the password policy. 
     * @return Password User password, which needs to be configured according to the password policy.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set User password, which needs to be configured according to the password policy.
     * @param Password User password, which needs to be configured according to the password policy.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get User's email address. 
     * @return Email User's email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set User's email address.
     * @param Email User's email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Whether the password needs to be reset. Default value: false (no). 
     * @return PwdNeedReset Whether the password needs to be reset. Default value: false (no).
     */
    public Boolean getPwdNeedReset() {
        return this.PwdNeedReset;
    }

    /**
     * Set Whether the password needs to be reset. Default value: false (no).
     * @param PwdNeedReset Whether the password needs to be reset. Default value: false (no).
     */
    public void setPwdNeedReset(Boolean PwdNeedReset) {
        this.PwdNeedReset = PwdNeedReset;
    }

    /**
     * Get Unique ID of the user's primary organization. If this parameter is left empty, the user will be created under the root node by default. 
     * @return OrgNodeId Unique ID of the user's primary organization. If this parameter is left empty, the user will be created under the root node by default.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Unique ID of the user's primary organization. If this parameter is left empty, the user will be created under the root node by default.
     * @param OrgNodeId Unique ID of the user's primary organization. If this parameter is left empty, the user will be created under the root node by default.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get List of IDs of the user's secondary organizations. 
     * @return SecondaryOrgNodeIdList List of IDs of the user's secondary organizations.
     */
    public String [] getSecondaryOrgNodeIdList() {
        return this.SecondaryOrgNodeIdList;
    }

    /**
     * Set List of IDs of the user's secondary organizations.
     * @param SecondaryOrgNodeIdList List of IDs of the user's secondary organizations.
     */
    public void setSecondaryOrgNodeIdList(String [] SecondaryOrgNodeIdList) {
        this.SecondaryOrgNodeIdList = SecondaryOrgNodeIdList;
    }

    public ModifyUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserInfoRequest(ModifyUserInfoRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.PwdNeedReset != null) {
            this.PwdNeedReset = new Boolean(source.PwdNeedReset);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.SecondaryOrgNodeIdList != null) {
            this.SecondaryOrgNodeIdList = new String[source.SecondaryOrgNodeIdList.length];
            for (int i = 0; i < source.SecondaryOrgNodeIdList.length; i++) {
                this.SecondaryOrgNodeIdList[i] = new String(source.SecondaryOrgNodeIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "PwdNeedReset", this.PwdNeedReset);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamArraySimple(map, prefix + "SecondaryOrgNodeIdList.", this.SecondaryOrgNodeIdList);

    }
}

