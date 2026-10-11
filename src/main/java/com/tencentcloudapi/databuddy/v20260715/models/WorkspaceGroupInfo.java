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

public class WorkspaceGroupInfo extends AbstractModel {

    /**
    * <p>User group ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>User group name</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>List of characters.</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * <p>Creation time, timestamp in milliseconds</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time, millisecond timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Number of users in the user group</p>
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * <p>user group type. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>Tags directly bound to this group (excluding inheritance).</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>User group ID</p> 
     * @return GroupId <p>User group ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>User group ID</p>
     * @param GroupId <p>User group ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * Get <p>Creation time, timestamp in milliseconds</p> 
     * @return CreateTime <p>Creation time, timestamp in milliseconds</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, timestamp in milliseconds</p>
     * @param CreateTime <p>Creation time, timestamp in milliseconds</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time, millisecond timestamp</p> 
     * @return UpdateTime <p>Update time, millisecond timestamp</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, millisecond timestamp</p>
     * @param UpdateTime <p>Update time, millisecond timestamp</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Number of users in the user group</p> 
     * @return UserCount <p>Number of users in the user group</p>
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set <p>Number of users in the user group</p>
     * @param UserCount <p>Number of users in the user group</p>
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get <p>user group type. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type</p> 
     * @return GroupType <p>user group type. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>user group type. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type</p>
     * @param GroupType <p>user group type. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>Tags directly bound to this group (excluding inheritance).</p> 
     * @return Tags <p>Tags directly bound to this group (excluding inheritance).</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tags directly bound to this group (excluding inheritance).</p>
     * @param Tags <p>Tags directly bound to this group (excluding inheritance).</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public WorkspaceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceGroupInfo(WorkspaceGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Roles != null) {
            this.Roles = new RoleBasicInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleBasicInfo(source.Roles[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

