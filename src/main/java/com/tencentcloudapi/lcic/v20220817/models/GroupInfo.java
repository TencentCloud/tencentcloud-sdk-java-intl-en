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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubGroupIds")
    @Expose
    private String SubGroupIds;

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeacherId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeacherId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupType 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupType 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubGroupIds 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubGroupIds() {
        return this.SubGroupIds;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubGroupIds 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubGroupIds(String SubGroupIds) {
        this.SubGroupIds = SubGroupIds;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.SubGroupIds != null) {
            this.SubGroupIds = new String(source.SubGroupIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "SubGroupIds", this.SubGroupIds);

    }
}

