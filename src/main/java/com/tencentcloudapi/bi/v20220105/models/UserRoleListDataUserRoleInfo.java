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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleListDataUserRoleInfo extends AbstractModel {

    /**
    * Business ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * This API is used to obtain the role list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleList")
    @Expose
    private UserRoleListDataRoleInfo [] RoleList;

    /**
    * Role ID list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * User ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Enterprise ID.
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * Email.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Updater.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * Update time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Last login time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * Account status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Telephone country code.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * Whether it is the root account.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootAccount")
    @Expose
    private Boolean RootAccount;

    /**
    * Whether it is an enterprise administrator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CorpAdmin")
    @Expose
    private Boolean CorpAdmin;

    /**
    * WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * Nickname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserAliasName")
    @Expose
    private String AppUserAliasName;

    /**
    * Application username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * Whether it is within the visible range.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InValidateAppRange")
    @Expose
    private Boolean InValidateAppRange;

    /**
    * User openID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppOpenUserId")
    @Expose
    private String AppOpenUserId;

    /**
    * Activation status of email.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmailActivationStatus")
    @Expose
    private Long EmailActivationStatus;

    /**
    * User group information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupList")
    @Expose
    private UserGroupDTO [] UserGroupList;

    /**
     * Get Business ID. 
     * @return Id Business ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Business ID.
     * @param Id Business ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get This API is used to obtain the role list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleList This API is used to obtain the role list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserRoleListDataRoleInfo [] getRoleList() {
        return this.RoleList;
    }

    /**
     * Set This API is used to obtain the role list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleList This API is used to obtain the role list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleList(UserRoleListDataRoleInfo [] RoleList) {
        this.RoleList = RoleList;
    }

    /**
     * Get Role ID list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleIdList Role ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set Role ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleIdList Role ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
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
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Enterprise ID. 
     * @return CorpId Enterprise ID.
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set Enterprise ID.
     * @param CorpId Enterprise ID.
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get Email.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email Email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email Email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Updater.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Last login time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastLogin Last login time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastLogin() {
        return this.LastLogin;
    }

    /**
     * Set Last login time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastLogin Last login time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastLogin(String LastLogin) {
        this.LastLogin = LastLogin;
    }

    /**
     * Get Account status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Account status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Account status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Account status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Mobile number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneNumber Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneNumber Mobile number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Telephone country code.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AreaCode Telephone country code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set Telephone country code.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AreaCode Telephone country code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get Whether it is the root account.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RootAccount Whether it is the root account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRootAccount() {
        return this.RootAccount;
    }

    /**
     * Set Whether it is the root account.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RootAccount Whether it is the root account.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRootAccount(Boolean RootAccount) {
        this.RootAccount = RootAccount;
    }

    /**
     * Get Whether it is an enterprise administrator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CorpAdmin Whether it is an enterprise administrator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCorpAdmin() {
        return this.CorpAdmin;
    }

    /**
     * Set Whether it is an enterprise administrator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CorpAdmin Whether it is an enterprise administrator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCorpAdmin(Boolean CorpAdmin) {
        this.CorpAdmin = CorpAdmin;
    }

    /**
     * Get WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserId WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserId WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get Nickname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserAliasName Nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserAliasName() {
        return this.AppUserAliasName;
    }

    /**
     * Set Nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserAliasName Nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserAliasName(String AppUserAliasName) {
        this.AppUserAliasName = AppUserAliasName;
    }

    /**
     * Get Application username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserName Application username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set Application username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserName Application username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get Whether it is within the visible range.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InValidateAppRange Whether it is within the visible range.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getInValidateAppRange() {
        return this.InValidateAppRange;
    }

    /**
     * Set Whether it is within the visible range.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InValidateAppRange Whether it is within the visible range.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInValidateAppRange(Boolean InValidateAppRange) {
        this.InValidateAppRange = InValidateAppRange;
    }

    /**
     * Get User openID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppOpenUserId User openID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppOpenUserId() {
        return this.AppOpenUserId;
    }

    /**
     * Set User openID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppOpenUserId User openID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppOpenUserId(String AppOpenUserId) {
        this.AppOpenUserId = AppOpenUserId;
    }

    /**
     * Get Activation status of email.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EmailActivationStatus Activation status of email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEmailActivationStatus() {
        return this.EmailActivationStatus;
    }

    /**
     * Set Activation status of email.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EmailActivationStatus Activation status of email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmailActivationStatus(Long EmailActivationStatus) {
        this.EmailActivationStatus = EmailActivationStatus;
    }

    /**
     * Get User group information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupList User group information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserGroupDTO [] getUserGroupList() {
        return this.UserGroupList;
    }

    /**
     * Set User group information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserGroupList User group information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupList(UserGroupDTO [] UserGroupList) {
        this.UserGroupList = UserGroupList;
    }

    public UserRoleListDataUserRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleListDataUserRoleInfo(UserRoleListDataUserRoleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RoleList != null) {
            this.RoleList = new UserRoleListDataRoleInfo[source.RoleList.length];
            for (int i = 0; i < source.RoleList.length; i++) {
                this.RoleList[i] = new UserRoleListDataRoleInfo(source.RoleList[i]);
            }
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.LastLogin != null) {
            this.LastLogin = new String(source.LastLogin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.RootAccount != null) {
            this.RootAccount = new Boolean(source.RootAccount);
        }
        if (source.CorpAdmin != null) {
            this.CorpAdmin = new Boolean(source.CorpAdmin);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
        if (source.AppUserAliasName != null) {
            this.AppUserAliasName = new String(source.AppUserAliasName);
        }
        if (source.AppUserName != null) {
            this.AppUserName = new String(source.AppUserName);
        }
        if (source.InValidateAppRange != null) {
            this.InValidateAppRange = new Boolean(source.InValidateAppRange);
        }
        if (source.AppOpenUserId != null) {
            this.AppOpenUserId = new String(source.AppOpenUserId);
        }
        if (source.EmailActivationStatus != null) {
            this.EmailActivationStatus = new Long(source.EmailActivationStatus);
        }
        if (source.UserGroupList != null) {
            this.UserGroupList = new UserGroupDTO[source.UserGroupList.length];
            for (int i = 0; i < source.UserGroupList.length; i++) {
                this.UserGroupList[i] = new UserGroupDTO(source.UserGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "RoleList.", this.RoleList);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "LastLogin", this.LastLogin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "RootAccount", this.RootAccount);
        this.setParamSimple(map, prefix + "CorpAdmin", this.CorpAdmin);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserAliasName", this.AppUserAliasName);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);
        this.setParamSimple(map, prefix + "InValidateAppRange", this.InValidateAppRange);
        this.setParamSimple(map, prefix + "AppOpenUserId", this.AppOpenUserId);
        this.setParamSimple(map, prefix + "EmailActivationStatus", this.EmailActivationStatus);
        this.setParamArrayObj(map, prefix + "UserGroupList.", this.UserGroupList);

    }
}

