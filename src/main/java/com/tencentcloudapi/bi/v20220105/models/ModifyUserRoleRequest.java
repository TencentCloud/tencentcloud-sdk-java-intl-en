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

public class ModifyUserRoleRequest extends AbstractModel {

    /**
    * User ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Role ID list.
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * Mailbox.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Mobile number.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Telephone country code.
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * WeCom user ID.
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * Whether to enable mobile phone verification code login (0: disabled, 1: enabled).
    */
    @SerializedName("LoginSecurityStatus")
    @Expose
    private Long LoginSecurityStatus;

    /**
    * Whether to enable password expiration reminder (0: disabled, 1: enabled).
    */
    @SerializedName("ResetPassWordTip")
    @Expose
    private Long ResetPassWordTip;

    /**
    * Force password reset (0: disabled, 1: enabled).
    */
    @SerializedName("ForceResetPassWord")
    @Expose
    private Long ForceResetPassWord;

    /**
    * Password expiration reminder period: 30, 60, 90 (default), or 180 days.
    */
    @SerializedName("PasswordExpired")
    @Expose
    private Long PasswordExpired;

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
     * Get Role ID list. 
     * @return RoleIdList Role ID list.
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set Role ID list.
     * @param RoleIdList Role ID list.
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get Mailbox. 
     * @return Email Mailbox.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Mailbox.
     * @param Email Mailbox.
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * Get Mobile number. 
     * @return PhoneNumber Mobile number.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number.
     * @param PhoneNumber Mobile number.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Telephone country code. 
     * @return AreaCode Telephone country code.
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set Telephone country code.
     * @param AreaCode Telephone country code.
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get WeCom user ID. 
     * @return AppUserId WeCom user ID.
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set WeCom user ID.
     * @param AppUserId WeCom user ID.
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get Whether to enable mobile phone verification code login (0: disabled, 1: enabled). 
     * @return LoginSecurityStatus Whether to enable mobile phone verification code login (0: disabled, 1: enabled).
     */
    public Long getLoginSecurityStatus() {
        return this.LoginSecurityStatus;
    }

    /**
     * Set Whether to enable mobile phone verification code login (0: disabled, 1: enabled).
     * @param LoginSecurityStatus Whether to enable mobile phone verification code login (0: disabled, 1: enabled).
     */
    public void setLoginSecurityStatus(Long LoginSecurityStatus) {
        this.LoginSecurityStatus = LoginSecurityStatus;
    }

    /**
     * Get Whether to enable password expiration reminder (0: disabled, 1: enabled). 
     * @return ResetPassWordTip Whether to enable password expiration reminder (0: disabled, 1: enabled).
     */
    public Long getResetPassWordTip() {
        return this.ResetPassWordTip;
    }

    /**
     * Set Whether to enable password expiration reminder (0: disabled, 1: enabled).
     * @param ResetPassWordTip Whether to enable password expiration reminder (0: disabled, 1: enabled).
     */
    public void setResetPassWordTip(Long ResetPassWordTip) {
        this.ResetPassWordTip = ResetPassWordTip;
    }

    /**
     * Get Force password reset (0: disabled, 1: enabled). 
     * @return ForceResetPassWord Force password reset (0: disabled, 1: enabled).
     */
    public Long getForceResetPassWord() {
        return this.ForceResetPassWord;
    }

    /**
     * Set Force password reset (0: disabled, 1: enabled).
     * @param ForceResetPassWord Force password reset (0: disabled, 1: enabled).
     */
    public void setForceResetPassWord(Long ForceResetPassWord) {
        this.ForceResetPassWord = ForceResetPassWord;
    }

    /**
     * Get Password expiration reminder period: 30, 60, 90 (default), or 180 days. 
     * @return PasswordExpired Password expiration reminder period: 30, 60, 90 (default), or 180 days.
     */
    public Long getPasswordExpired() {
        return this.PasswordExpired;
    }

    /**
     * Set Password expiration reminder period: 30, 60, 90 (default), or 180 days.
     * @param PasswordExpired Password expiration reminder period: 30, 60, 90 (default), or 180 days.
     */
    public void setPasswordExpired(Long PasswordExpired) {
        this.PasswordExpired = PasswordExpired;
    }

    public ModifyUserRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRoleRequest(ModifyUserRoleRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.AppUserId != null) {
            this.AppUserId = new String(source.AppUserId);
        }
        if (source.LoginSecurityStatus != null) {
            this.LoginSecurityStatus = new Long(source.LoginSecurityStatus);
        }
        if (source.ResetPassWordTip != null) {
            this.ResetPassWordTip = new Long(source.ResetPassWordTip);
        }
        if (source.ForceResetPassWord != null) {
            this.ForceResetPassWord = new Long(source.ForceResetPassWord);
        }
        if (source.PasswordExpired != null) {
            this.PasswordExpired = new Long(source.PasswordExpired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "LoginSecurityStatus", this.LoginSecurityStatus);
        this.setParamSimple(map, prefix + "ResetPassWordTip", this.ResetPassWordTip);
        this.setParamSimple(map, prefix + "ForceResetPassWord", this.ForceResetPassWord);
        this.setParamSimple(map, prefix + "PasswordExpired", this.PasswordExpired);

    }
}

