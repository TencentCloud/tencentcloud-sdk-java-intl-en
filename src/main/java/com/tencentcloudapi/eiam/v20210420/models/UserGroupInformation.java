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

public class UserGroupInformation extends AbstractModel {

    /**
    * User group ID.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * User group name.
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
     * Get User group ID. 
     * @return UserGroupId User group ID.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group ID.
     * @param UserGroupId User group ID.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get User group name. 
     * @return UserGroupName User group name.
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set User group name.
     * @param UserGroupName User group name.
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifiedDate Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifiedDate Last update time in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    public UserGroupInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInformation(UserGroupInformation source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);

    }
}

