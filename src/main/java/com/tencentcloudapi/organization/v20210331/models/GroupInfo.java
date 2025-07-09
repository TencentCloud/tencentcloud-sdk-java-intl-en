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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * User group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * User group description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time of the user group.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User group type. Manual: manually created; Synchronized: externally imported.
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * Modification time of the user group.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * User group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Number of group members.
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * If the input parameter FilterUsers is provided, return true when the user is in the user group; otherwise, return false.
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

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
     * Get User group description. 
     * @return Description User group description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User group description.
     * @param Description User group description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time of the user group. 
     * @return CreateTime Creation time of the user group.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the user group.
     * @param CreateTime Creation time of the user group.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get User group type. Manual: manually created; Synchronized: externally imported. 
     * @return GroupType User group type. Manual: manually created; Synchronized: externally imported.
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set User group type. Manual: manually created; Synchronized: externally imported.
     * @param GroupType User group type. Manual: manually created; Synchronized: externally imported.
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get Modification time of the user group. 
     * @return UpdateTime Modification time of the user group.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time of the user group.
     * @param UpdateTime Modification time of the user group.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get User group ID. 
     * @return GroupId User group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set User group ID.
     * @param GroupId User group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Number of group members. 
     * @return MemberCount Number of group members.
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of group members.
     * @param MemberCount Number of group members.
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get If the input parameter FilterUsers is provided, return true when the user is in the user group; otherwise, return false. 
     * @return IsSelected If the input parameter FilterUsers is provided, return true when the user is in the user group; otherwise, return false.
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set If the input parameter FilterUsers is provided, return true when the user is in the user group; otherwise, return false.
     * @param IsSelected If the input parameter FilterUsers is provided, return true when the user is in the user group; otherwise, return false.
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);

    }
}

