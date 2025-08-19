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

public class UserIdAndUserName extends AbstractModel {

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
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Last login time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastLogin")
    @Expose
    private String LastLogin;

    /**
    * Enabled/Disabled status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether to change the password during the first-time login.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstModify")
    @Expose
    private Long FirstModify;

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
    * Modifier.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * Change time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Global role.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GlobalUserName")
    @Expose
    private String GlobalUserName;

    /**
    * Global role code.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GlobalUserCode")
    @Expose
    private String GlobalUserCode;

    /**
    * Mobile number.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserAliasName")
    @Expose
    private String AppUserAliasName;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InValidateAppRange")
    @Expose
    private Boolean InValidateAppRange;

    /**
    *  -1: No activation required. 0: Inactivated. 1: Activated. Null value represents pending binding.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmailActivationStatus")
    @Expose
    private Long EmailActivationStatus;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CorpId Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CorpId Enterprise ID.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Enabled/Disabled status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Enabled/Disabled status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabled/Disabled status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Enabled/Disabled status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to change the password during the first-time login.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstModify Whether to change the password during the first-time login.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFirstModify() {
        return this.FirstModify;
    }

    /**
     * Set Whether to change the password during the first-time login.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstModify Whether to change the password during the first-time login.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstModify(Long FirstModify) {
        this.FirstModify = FirstModify;
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
     * Get Modifier.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedUser Modifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set Modifier.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedUser Modifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get Change time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Change time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Change time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Change time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Global role.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GlobalUserName Global role.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGlobalUserName() {
        return this.GlobalUserName;
    }

    /**
     * Set Global role.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GlobalUserName Global role.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGlobalUserName(String GlobalUserName) {
        this.GlobalUserName = GlobalUserName;
    }

    /**
     * Get Global role code.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GlobalUserCode Global role code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGlobalUserCode() {
        return this.GlobalUserCode;
    }

    /**
     * Set Global role code.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GlobalUserCode Global role code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGlobalUserCode(String GlobalUserCode) {
        this.GlobalUserCode = GlobalUserCode;
    }

    /**
     * Get Mobile number.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mobile Mobile number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set Mobile number.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mobile Mobile number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserId 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserId 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserAliasName 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserAliasName() {
        return this.AppUserAliasName;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserAliasName 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserAliasName(String AppUserAliasName) {
        this.AppUserAliasName = AppUserAliasName;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserName 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserName 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InValidateAppRange 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getInValidateAppRange() {
        return this.InValidateAppRange;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InValidateAppRange 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInValidateAppRange(Boolean InValidateAppRange) {
        this.InValidateAppRange = InValidateAppRange;
    }

    /**
     * Get  -1: No activation required. 0: Inactivated. 1: Activated. Null value represents pending binding.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EmailActivationStatus  -1: No activation required. 0: Inactivated. 1: Activated. Null value represents pending binding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEmailActivationStatus() {
        return this.EmailActivationStatus;
    }

    /**
     * Set  -1: No activation required. 0: Inactivated. 1: Activated. Null value represents pending binding.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EmailActivationStatus  -1: No activation required. 0: Inactivated. 1: Activated. Null value represents pending binding.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmailActivationStatus(Long EmailActivationStatus) {
        this.EmailActivationStatus = EmailActivationStatus;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public UserIdAndUserName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdAndUserName(UserIdAndUserName source) {
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
        if (source.LastLogin != null) {
            this.LastLogin = new String(source.LastLogin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FirstModify != null) {
            this.FirstModify = new Long(source.FirstModify);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
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
        if (source.GlobalUserName != null) {
            this.GlobalUserName = new String(source.GlobalUserName);
        }
        if (source.GlobalUserCode != null) {
            this.GlobalUserCode = new String(source.GlobalUserCode);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        if (source.EmailActivationStatus != null) {
            this.EmailActivationStatus = new Long(source.EmailActivationStatus);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "LastLogin", this.LastLogin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FirstModify", this.FirstModify);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "GlobalUserName", this.GlobalUserName);
        this.setParamSimple(map, prefix + "GlobalUserCode", this.GlobalUserCode);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserAliasName", this.AppUserAliasName);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);
        this.setParamSimple(map, prefix + "InValidateAppRange", this.InValidateAppRange);
        this.setParamSimple(map, prefix + "EmailActivationStatus", this.EmailActivationStatus);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

