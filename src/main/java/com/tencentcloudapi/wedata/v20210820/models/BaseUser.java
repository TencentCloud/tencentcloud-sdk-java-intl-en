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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseUser extends AbstractModel {

    /**
    * Cloud User UIN, Globally Unique
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User Global Unique Identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User Display Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Telephone Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Email
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get Cloud User UIN, Globally Unique
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId Cloud User UIN, Globally Unique
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Cloud User UIN, Globally Unique
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId Cloud User UIN, Globally Unique
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User Global Unique Identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserName User Global Unique Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User Global Unique Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserName User Global Unique Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User Display Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DisplayName User Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set User Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DisplayName User Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Telephone Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PhoneNum Telephone Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Telephone Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PhoneNum Telephone Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Email
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Email Email
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Email Email
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public BaseUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseUser(BaseUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

