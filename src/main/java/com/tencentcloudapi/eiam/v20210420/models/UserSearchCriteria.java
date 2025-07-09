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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserSearchCriteria extends AbstractModel {

    /**
    * Username, which can contain up to 64 characters.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User's mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * User's email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * User creation time in ISO 8601 format.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * The user's last update time.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Search by name. The match criteria include username and user ID.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Username, which can contain up to 64 characters. 
     * @return UserName Username, which can contain up to 64 characters.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which can contain up to 64 characters.
     * @param UserName Username, which can contain up to 64 characters.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled. 
     * @return Status User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
     * @param Status User status. Valid values: NORMAL: normal; FREEZE: frozen; LOCKED: locked; NOT_ENABLED: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get User creation time in ISO 8601 format. 
     * @return CreationTime User creation time in ISO 8601 format.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set User creation time in ISO 8601 format.
     * @param CreationTime User creation time in ISO 8601 format.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get The user's last update time. 
     * @return LastUpdateTime The user's last update time.
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set The user's last update time.
     * @param LastUpdateTime The user's last update time.
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Search by name. The match criteria include username and user ID. 
     * @return Keyword Search by name. The match criteria include username and user ID.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search by name. The match criteria include username and user ID.
     * @param Keyword Search by name. The match criteria include username and user ID.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public UserSearchCriteria() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserSearchCriteria(UserSearchCriteria source) {
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
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

