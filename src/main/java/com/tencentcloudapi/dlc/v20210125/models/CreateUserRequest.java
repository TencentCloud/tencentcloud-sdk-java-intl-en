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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel {

    /**
    * Sub-user UIN that needs to be granted permissions. It can be checked through the upper right corner of Tencent Cloud Console → Account Information → Account ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User description, which can make it easy to identify different users.
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * Collections of permissions bound to users
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * Types of users. ADMIN: administrators; COMMON: general users. When the type of user is administrator, the collections of permissions and bound working groups cannot be set. Administrators own all the permissions by default. If the parameter is not filled in, it will be COMMON by default.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Collection of IDs of working groups bound to users
    */
    @SerializedName("WorkGroupIds")
    @Expose
    private Long [] WorkGroupIds;

    /**
    * User alias, and its characters are less than 50.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
     * Get Sub-user UIN that needs to be granted permissions. It can be checked through the upper right corner of Tencent Cloud Console → Account Information → Account ID. 
     * @return UserId Sub-user UIN that needs to be granted permissions. It can be checked through the upper right corner of Tencent Cloud Console → Account Information → Account ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Sub-user UIN that needs to be granted permissions. It can be checked through the upper right corner of Tencent Cloud Console → Account Information → Account ID.
     * @param UserId Sub-user UIN that needs to be granted permissions. It can be checked through the upper right corner of Tencent Cloud Console → Account Information → Account ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User description, which can make it easy to identify different users. 
     * @return UserDescription User description, which can make it easy to identify different users.
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set User description, which can make it easy to identify different users.
     * @param UserDescription User description, which can make it easy to identify different users.
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get Collections of permissions bound to users 
     * @return PolicySet Collections of permissions bound to users
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Collections of permissions bound to users
     * @param PolicySet Collections of permissions bound to users
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Types of users. ADMIN: administrators; COMMON: general users. When the type of user is administrator, the collections of permissions and bound working groups cannot be set. Administrators own all the permissions by default. If the parameter is not filled in, it will be COMMON by default. 
     * @return UserType Types of users. ADMIN: administrators; COMMON: general users. When the type of user is administrator, the collections of permissions and bound working groups cannot be set. Administrators own all the permissions by default. If the parameter is not filled in, it will be COMMON by default.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Types of users. ADMIN: administrators; COMMON: general users. When the type of user is administrator, the collections of permissions and bound working groups cannot be set. Administrators own all the permissions by default. If the parameter is not filled in, it will be COMMON by default.
     * @param UserType Types of users. ADMIN: administrators; COMMON: general users. When the type of user is administrator, the collections of permissions and bound working groups cannot be set. Administrators own all the permissions by default. If the parameter is not filled in, it will be COMMON by default.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Collection of IDs of working groups bound to users 
     * @return WorkGroupIds Collection of IDs of working groups bound to users
     */
    public Long [] getWorkGroupIds() {
        return this.WorkGroupIds;
    }

    /**
     * Set Collection of IDs of working groups bound to users
     * @param WorkGroupIds Collection of IDs of working groups bound to users
     */
    public void setWorkGroupIds(Long [] WorkGroupIds) {
        this.WorkGroupIds = WorkGroupIds;
    }

    /**
     * Get User alias, and its characters are less than 50. 
     * @return UserAlias User alias, and its characters are less than 50.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User alias, and its characters are less than 50.
     * @param UserAlias User alias, and its characters are less than 50.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.WorkGroupIds != null) {
            this.WorkGroupIds = new Long[source.WorkGroupIds.length];
            for (int i = 0; i < source.WorkGroupIds.length; i++) {
                this.WorkGroupIds[i] = new Long(source.WorkGroupIds[i]);
            }
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamArraySimple(map, prefix + "WorkGroupIds.", this.WorkGroupIds);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);

    }
}

