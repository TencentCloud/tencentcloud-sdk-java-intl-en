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

public class UserInfo extends AbstractModel {

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
    * Email.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

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
    * WeCom account ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserId")
    @Expose
    private String AppUserId;

    /**
    * WeCom account name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppUserName")
    @Expose
    private String AppUserName;

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
     * Get WeCom account ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserId WeCom account ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserId() {
        return this.AppUserId;
    }

    /**
     * Set WeCom account ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserId WeCom account ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserId(String AppUserId) {
        this.AppUserId = AppUserId;
    }

    /**
     * Get WeCom account name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppUserName WeCom account name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppUserName() {
        return this.AppUserName;
    }

    /**
     * Set WeCom account name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppUserName WeCom account name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppUserName(String AppUserName) {
        this.AppUserName = AppUserName;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
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
        if (source.AppUserName != null) {
            this.AppUserName = new String(source.AppUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "AppUserId", this.AppUserId);
        this.setParamSimple(map, prefix + "AppUserName", this.AppUserName);

    }
}

