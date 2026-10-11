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

public class WorkspaceUserInfo extends AbstractModel {

    /**
    * <p>User UIN.</p>
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Nickname</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>List of characters.</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * <p>User source. group: user group, user: user</p>
    */
    @SerializedName("UserSource")
    @Expose
    private String UserSource;

    /**
    * <p>Creation time. Millisecond timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time. Millisecond timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Root account or not</p>
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
    * <p>0: general user 1: entraId user</p>
    */
    @SerializedName("UserTag")
    @Expose
    private Long UserTag;

    /**
    * <p>Whether the sub-account has admin permission</p>
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
    * <p>Tags after merge (directly bound to user + inherited from user group)</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>User UIN.</p> 
     * @return UserUin <p>User UIN.</p>
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set <p>User UIN.</p>
     * @param UserUin <p>User UIN.</p>
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Nickname</p> 
     * @return Nickname <p>Nickname</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>Nickname</p>
     * @param Nickname <p>Nickname</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>List of characters.</p> 
     * @return Roles <p>List of characters.</p>
     */
    public RoleBasicInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>List of characters.</p>
     * @param Roles <p>List of characters.</p>
     */
    public void setRoles(RoleBasicInfo [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>User source. group: user group, user: user</p> 
     * @return UserSource <p>User source. group: user group, user: user</p>
     */
    public String getUserSource() {
        return this.UserSource;
    }

    /**
     * Set <p>User source. group: user group, user: user</p>
     * @param UserSource <p>User source. group: user group, user: user</p>
     */
    public void setUserSource(String UserSource) {
        this.UserSource = UserSource;
    }

    /**
     * Get <p>Creation time. Millisecond timestamp</p> 
     * @return CreateTime <p>Creation time. Millisecond timestamp</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time. Millisecond timestamp</p>
     * @param CreateTime <p>Creation time. Millisecond timestamp</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time. Millisecond timestamp</p> 
     * @return UpdateTime <p>Update time. Millisecond timestamp</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time. Millisecond timestamp</p>
     * @param UpdateTime <p>Update time. Millisecond timestamp</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Root account or not</p> 
     * @return IsOwner <p>Root account or not</p>
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set <p>Root account or not</p>
     * @param IsOwner <p>Root account or not</p>
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    /**
     * Get <p>0: general user 1: entraId user</p> 
     * @return UserTag <p>0: general user 1: entraId user</p>
     */
    public Long getUserTag() {
        return this.UserTag;
    }

    /**
     * Set <p>0: general user 1: entraId user</p>
     * @param UserTag <p>0: general user 1: entraId user</p>
     */
    public void setUserTag(Long UserTag) {
        this.UserTag = UserTag;
    }

    /**
     * Get <p>Whether the sub-account has admin permission</p> 
     * @return IsAdmin <p>Whether the sub-account has admin permission</p>
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set <p>Whether the sub-account has admin permission</p>
     * @param IsAdmin <p>Whether the sub-account has admin permission</p>
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Get <p>Tags after merge (directly bound to user + inherited from user group)</p> 
     * @return Tags <p>Tags after merge (directly bound to user + inherited from user group)</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tags after merge (directly bound to user + inherited from user group)</p>
     * @param Tags <p>Tags after merge (directly bound to user + inherited from user group)</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public WorkspaceUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceUserInfo(WorkspaceUserInfo source) {
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
        if (source.Tags != null) {
            this.Tags = new UserTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new UserTagInfo(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

