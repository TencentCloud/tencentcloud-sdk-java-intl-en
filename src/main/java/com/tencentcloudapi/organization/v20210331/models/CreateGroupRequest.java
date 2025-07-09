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

public class CreateGroupRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User group name, which contains up to 128 characters, including English letters, digits, and special characters (-).
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * User group description, which contains up to 1024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User group type. Manual: manually created, Synchronized: imported from external sources.
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User group name, which contains up to 128 characters, including English letters, digits, and special characters (-). 
     * @return GroupName User group name, which contains up to 128 characters, including English letters, digits, and special characters (-).
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User group name, which contains up to 128 characters, including English letters, digits, and special characters (-).
     * @param GroupName User group name, which contains up to 128 characters, including English letters, digits, and special characters (-).
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get User group description, which contains up to 1024 characters. 
     * @return Description User group description, which contains up to 1024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User group description, which contains up to 1024 characters.
     * @param Description User group description, which contains up to 1024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User group type. Manual: manually created, Synchronized: imported from external sources. 
     * @return GroupType User group type. Manual: manually created, Synchronized: imported from external sources.
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set User group type. Manual: manually created, Synchronized: imported from external sources.
     * @param GroupType User group type. Manual: manually created, Synchronized: imported from external sources.
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public CreateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupRequest(CreateGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

