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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupItem extends AbstractModel{

    /**
    * Group ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of group members.
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
     * Get Group ID. 
     * @return Id Group ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Group ID.
     * @param Id Group ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Group name. 
     * @return Name Group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Group name.
     * @param Name Group name.
     */
    public void setName(String Name) {
        this.Name = Name;
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

    public GroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupItem(GroupItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);

    }
}

