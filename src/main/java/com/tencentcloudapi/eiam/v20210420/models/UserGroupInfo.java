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

public class UserGroupInfo extends AbstractModel {

    /**
    * Nickname, which can contain up to 64 characters and is the same as the username by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * User group ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * User group remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

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
     * Get User group ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupId User group ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupId User group ID, which is globally unique and can contain up to 64 characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get User group remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description User group remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User group remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description User group remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public UserGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInfo(UserGroupInfo source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

