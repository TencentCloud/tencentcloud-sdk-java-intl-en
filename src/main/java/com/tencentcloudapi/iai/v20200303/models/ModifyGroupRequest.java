/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupRequest extends AbstractModel{

    /**
    * Group ID, which is the `GroupId` in the `CreateGroup` API.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Custom description field of the group to be modified, which is a `key-value` pair.
    */
    @SerializedName("GroupExDescriptionInfos")
    @Expose
    private GroupExDescriptionInfo [] GroupExDescriptionInfos;

    /**
    * Group remarks
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get Group ID, which is the `GroupId` in the `CreateGroup` API. 
     * @return GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID, which is the `GroupId` in the `CreateGroup` API.
     * @param GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name 
     * @return GroupName Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name
     * @param GroupName Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Custom description field of the group to be modified, which is a `key-value` pair. 
     * @return GroupExDescriptionInfos Custom description field of the group to be modified, which is a `key-value` pair.
     */
    public GroupExDescriptionInfo [] getGroupExDescriptionInfos() {
        return this.GroupExDescriptionInfos;
    }

    /**
     * Set Custom description field of the group to be modified, which is a `key-value` pair.
     * @param GroupExDescriptionInfos Custom description field of the group to be modified, which is a `key-value` pair.
     */
    public void setGroupExDescriptionInfos(GroupExDescriptionInfo [] GroupExDescriptionInfos) {
        this.GroupExDescriptionInfos = GroupExDescriptionInfos;
    }

    /**
     * Get Group remarks 
     * @return Tag Group remarks
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Group remarks
     * @param Tag Group remarks
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public ModifyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGroupRequest(ModifyGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupExDescriptionInfos != null) {
            this.GroupExDescriptionInfos = new GroupExDescriptionInfo[source.GroupExDescriptionInfos.length];
            for (int i = 0; i < source.GroupExDescriptionInfos.length; i++) {
                this.GroupExDescriptionInfos[i] = new GroupExDescriptionInfo(source.GroupExDescriptionInfos[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "GroupExDescriptionInfos.", this.GroupExDescriptionInfos);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

