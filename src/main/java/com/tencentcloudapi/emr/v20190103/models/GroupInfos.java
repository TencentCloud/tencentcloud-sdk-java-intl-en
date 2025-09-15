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

public class GroupInfos extends AbstractModel {

    /**
    * User group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * User name list.
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * Remarks.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User group type.
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * User group type description.
    */
    @SerializedName("GroupTypeDesc")
    @Expose
    private String GroupTypeDesc;

    /**
     * Get User group name. 
     * @return GroupName User group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User group name.
     * @param GroupName User group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get User name list. 
     * @return Users User name list.
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set User name list.
     * @param Users User name list.
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
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
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get User group type. 
     * @return GroupType User group type.
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set User group type.
     * @param GroupType User group type.
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get User group type description. 
     * @return GroupTypeDesc User group type description.
     */
    public String getGroupTypeDesc() {
        return this.GroupTypeDesc;
    }

    /**
     * Set User group type description.
     * @param GroupTypeDesc User group type description.
     */
    public void setGroupTypeDesc(String GroupTypeDesc) {
        this.GroupTypeDesc = GroupTypeDesc;
    }

    public GroupInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfos(GroupInfos source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.GroupTypeDesc != null) {
            this.GroupTypeDesc = new String(source.GroupTypeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupTypeDesc", this.GroupTypeDesc);

    }
}

