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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerFilter extends AbstractModel {

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User source.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Group name.
    */
    @SerializedName("Groups")
    @Expose
    private String Groups;

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
     * Get User source. 
     * @return UserType User source.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set User source.
     * @param UserType User source.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Group name. 
     * @return Groups Group name.
     */
    public String getGroups() {
        return this.Groups;
    }

    /**
     * Set Group name.
     * @param Groups Group name.
     */
    public void setGroups(String Groups) {
        this.Groups = Groups;
    }

    public UserManagerFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserManagerFilter(UserManagerFilter source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.Groups != null) {
            this.Groups = new String(source.Groups);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Groups", this.Groups);

    }
}

