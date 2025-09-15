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

public class GroupInfo extends AbstractModel {

    /**
    * Group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Remarks.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User list.
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
     * Get Group name. 
     * @return GroupName Group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name.
     * @param GroupName Group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Remarks. 
     * @return Description Remarks.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks.
     * @param Description Remarks.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User list. 
     * @return Users User list.
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set User list.
     * @param Users User list.
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);

    }
}

