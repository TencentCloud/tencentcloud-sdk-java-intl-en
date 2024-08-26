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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinedGroups extends AbstractModel {

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
    * User group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * User group type. Valid values:

Manual: manually created.
Synchronized: externally synchronized.
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * Time of joining the user group.
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

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
     * Get User group type. Valid values:

Manual: manually created.
Synchronized: externally synchronized. 
     * @return GroupType User group type. Valid values:

Manual: manually created.
Synchronized: externally synchronized.
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set User group type. Valid values:

Manual: manually created.
Synchronized: externally synchronized.
     * @param GroupType User group type. Valid values:

Manual: manually created.
Synchronized: externally synchronized.
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get Time of joining the user group. 
     * @return JoinTime Time of joining the user group.
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set Time of joining the user group.
     * @param JoinTime Time of joining the user group.
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    public JoinedGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinedGroups(JoinedGroups source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);

    }
}

