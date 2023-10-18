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

public class UserInfo extends AbstractModel {

    /**
    * User ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Username.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Email address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * User status.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Data source.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

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
     * Get Username.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Phone User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Phone User's mobile number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Email address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Email Email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Email Email address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * Get Data source.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataSource Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataSource Data source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
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
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);

    }
}

