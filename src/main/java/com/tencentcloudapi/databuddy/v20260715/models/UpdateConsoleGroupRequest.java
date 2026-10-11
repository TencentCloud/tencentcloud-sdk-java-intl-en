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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateConsoleGroupRequest extends AbstractModel {

    /**
    * <p>User group ID, which can be obtained through the ListConsoleGroups API</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Modification Flag: USER_GROUP_OPER_TYPE_ADD_USER(1)=add member, USER_GROUP_OPER_TYPE_DELETE_USER(2)=delete member, USER_GROUP_OPER_TYPE_BASIC_INFO(3)=basic information (alias and description)</p>
    */
    @SerializedName("OperType")
    @Expose
    private Long OperType;

    /**
    * <p>User group name</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>User group alias.</p>
    */
    @SerializedName("GroupNickname")
    @Expose
    private String GroupNickname;

    /**
    * <p>User group description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Member UIN list (used when OperType is add/delete member), up to 100 at a time</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
     * Get <p>User group ID, which can be obtained through the ListConsoleGroups API</p> 
     * @return GroupId <p>User group ID, which can be obtained through the ListConsoleGroups API</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>User group ID, which can be obtained through the ListConsoleGroups API</p>
     * @param GroupId <p>User group ID, which can be obtained through the ListConsoleGroups API</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Modification Flag: USER_GROUP_OPER_TYPE_ADD_USER(1)=add member, USER_GROUP_OPER_TYPE_DELETE_USER(2)=delete member, USER_GROUP_OPER_TYPE_BASIC_INFO(3)=basic information (alias and description)</p> 
     * @return OperType <p>Modification Flag: USER_GROUP_OPER_TYPE_ADD_USER(1)=add member, USER_GROUP_OPER_TYPE_DELETE_USER(2)=delete member, USER_GROUP_OPER_TYPE_BASIC_INFO(3)=basic information (alias and description)</p>
     */
    public Long getOperType() {
        return this.OperType;
    }

    /**
     * Set <p>Modification Flag: USER_GROUP_OPER_TYPE_ADD_USER(1)=add member, USER_GROUP_OPER_TYPE_DELETE_USER(2)=delete member, USER_GROUP_OPER_TYPE_BASIC_INFO(3)=basic information (alias and description)</p>
     * @param OperType <p>Modification Flag: USER_GROUP_OPER_TYPE_ADD_USER(1)=add member, USER_GROUP_OPER_TYPE_DELETE_USER(2)=delete member, USER_GROUP_OPER_TYPE_BASIC_INFO(3)=basic information (alias and description)</p>
     */
    public void setOperType(Long OperType) {
        this.OperType = OperType;
    }

    /**
     * Get <p>User group name</p> 
     * @return GroupName <p>User group name</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>User group name</p>
     * @param GroupName <p>User group name</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>User group alias.</p> 
     * @return GroupNickname <p>User group alias.</p>
     */
    public String getGroupNickname() {
        return this.GroupNickname;
    }

    /**
     * Set <p>User group alias.</p>
     * @param GroupNickname <p>User group alias.</p>
     */
    public void setGroupNickname(String GroupNickname) {
        this.GroupNickname = GroupNickname;
    }

    /**
     * Get <p>User group description.</p> 
     * @return Description <p>User group description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>User group description.</p>
     * @param Description <p>User group description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Member UIN list (used when OperType is add/delete member), up to 100 at a time</p> 
     * @return UserUins <p>Member UIN list (used when OperType is add/delete member), up to 100 at a time</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>Member UIN list (used when OperType is add/delete member), up to 100 at a time</p>
     * @param UserUins <p>Member UIN list (used when OperType is add/delete member), up to 100 at a time</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    public UpdateConsoleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConsoleGroupRequest(UpdateConsoleGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.OperType != null) {
            this.OperType = new Long(source.OperType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNickname != null) {
            this.GroupNickname = new String(source.GroupNickname);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OperType", this.OperType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNickname", this.GroupNickname);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);

    }
}

