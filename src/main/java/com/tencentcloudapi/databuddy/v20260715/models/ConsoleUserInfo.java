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

public class ConsoleUserInfo extends AbstractModel {

    /**
    * User UIN.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * List of characters.
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * User source. group: user group, user: user
    */
    @SerializedName("UserSource")
    @Expose
    private String UserSource;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether it is the root account.
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
    * 0: general user; 1: Entra ID user.
    */
    @SerializedName("UserTag")
    @Expose
    private Long UserTag;

    /**
    * Whether it is a sub-account with admin permission
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
     * Get User UIN. 
     * @return UserUin User UIN.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set User UIN.
     * @param UserUin User UIN.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

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
     * Get Nickname 
     * @return Nickname Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
     * @param Nickname Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get List of characters. 
     * @return Roles List of characters.
     */
    public RoleBasicInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set List of characters.
     * @param Roles List of characters.
     */
    public void setRoles(RoleBasicInfo [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get User source. group: user group, user: user 
     * @return UserSource User source. group: user group, user: user
     */
    public String getUserSource() {
        return this.UserSource;
    }

    /**
     * Set User source. group: user group, user: user
     * @param UserSource User source. group: user group, user: user
     */
    public void setUserSource(String UserSource) {
        this.UserSource = UserSource;
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
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether it is the root account. 
     * @return IsOwner Whether it is the root account.
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set Whether it is the root account.
     * @param IsOwner Whether it is the root account.
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    /**
     * Get 0: general user; 1: Entra ID user. 
     * @return UserTag 0: general user; 1: Entra ID user.
     */
    public Long getUserTag() {
        return this.UserTag;
    }

    /**
     * Set 0: general user; 1: Entra ID user.
     * @param UserTag 0: general user; 1: Entra ID user.
     */
    public void setUserTag(Long UserTag) {
        this.UserTag = UserTag;
    }

    /**
     * Get Whether it is a sub-account with admin permission 
     * @return IsAdmin Whether it is a sub-account with admin permission
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set Whether it is a sub-account with admin permission
     * @param IsAdmin Whether it is a sub-account with admin permission
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public ConsoleUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleUserInfo(ConsoleUserInfo source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Roles != null) {
            this.Roles = new RoleBasicInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleBasicInfo(source.Roles[i]);
            }
        }
        if (source.UserSource != null) {
            this.UserSource = new String(source.UserSource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsOwner != null) {
            this.IsOwner = new Boolean(source.IsOwner);
        }
        if (source.UserTag != null) {
            this.UserTag = new Long(source.UserTag);
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "UserSource", this.UserSource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsOwner", this.IsOwner);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);

    }
}

