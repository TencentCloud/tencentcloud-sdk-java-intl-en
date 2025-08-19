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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRoleProjectRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Role ID list.
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long [] RoleIdList;

    /**
    * User list (deprecated).
    */
    @SerializedName("UserList")
    @Expose
    private UserIdAndUserName [] UserList;

    /**
    * User list (new).
    */
    @SerializedName("UserInfoList")
    @Expose
    private UserInfo [] UserInfoList;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Role ID list. 
     * @return RoleIdList Role ID list.
     */
    public Long [] getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set Role ID list.
     * @param RoleIdList Role ID list.
     */
    public void setRoleIdList(Long [] RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get User list (deprecated). 
     * @return UserList User list (deprecated).
     * @deprecated
     */
    @Deprecated
    public UserIdAndUserName [] getUserList() {
        return this.UserList;
    }

    /**
     * Set User list (deprecated).
     * @param UserList User list (deprecated).
     * @deprecated
     */
    @Deprecated
    public void setUserList(UserIdAndUserName [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get User list (new). 
     * @return UserInfoList User list (new).
     */
    public UserInfo [] getUserInfoList() {
        return this.UserInfoList;
    }

    /**
     * Set User list (new).
     * @param UserInfoList User list (new).
     */
    public void setUserInfoList(UserInfo [] UserInfoList) {
        this.UserInfoList = UserInfoList;
    }

    public CreateUserRoleProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRoleProjectRequest(CreateUserRoleProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long[source.RoleIdList.length];
            for (int i = 0; i < source.RoleIdList.length; i++) {
                this.RoleIdList[i] = new Long(source.RoleIdList[i]);
            }
        }
        if (source.UserList != null) {
            this.UserList = new UserIdAndUserName[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new UserIdAndUserName(source.UserList[i]);
            }
        }
        if (source.UserInfoList != null) {
            this.UserInfoList = new UserInfo[source.UserInfoList.length];
            for (int i = 0; i < source.UserInfoList.length; i++) {
                this.UserInfoList[i] = new UserInfo(source.UserInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RoleIdList.", this.RoleIdList);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamArrayObj(map, prefix + "UserInfoList.", this.UserInfoList);

    }
}

