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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthInfo extends AbstractModel {

    /**
    * Authorize the target project id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthProjectIds")
    @Expose
    private String [] AuthProjectIds;

    /**
    * List of users under the authorized project.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthUsers")
    @Expose
    private String [] AuthUsers;

    /**
     * Get Authorize the target project id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthProjectIds Authorize the target project id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAuthProjectIds() {
        return this.AuthProjectIds;
    }

    /**
     * Set Authorize the target project id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthProjectIds Authorize the target project id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthProjectIds(String [] AuthProjectIds) {
        this.AuthProjectIds = AuthProjectIds;
    }

    /**
     * Get List of users under the authorized project.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthUsers List of users under the authorized project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAuthUsers() {
        return this.AuthUsers;
    }

    /**
     * Set List of users under the authorized project.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthUsers List of users under the authorized project.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthUsers(String [] AuthUsers) {
        this.AuthUsers = AuthUsers;
    }

    public AuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfo(AuthInfo source) {
        if (source.AuthProjectIds != null) {
            this.AuthProjectIds = new String[source.AuthProjectIds.length];
            for (int i = 0; i < source.AuthProjectIds.length; i++) {
                this.AuthProjectIds[i] = new String(source.AuthProjectIds[i]);
            }
        }
        if (source.AuthUsers != null) {
            this.AuthUsers = new String[source.AuthUsers.length];
            for (int i = 0; i < source.AuthUsers.length; i++) {
                this.AuthUsers[i] = new String(source.AuthUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AuthProjectIds.", this.AuthProjectIds);
        this.setParamArraySimple(map, prefix + "AuthUsers.", this.AuthUsers);

    }
}

