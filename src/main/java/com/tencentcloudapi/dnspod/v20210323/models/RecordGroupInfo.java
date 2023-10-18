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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordGroupInfo extends AbstractModel {

    /**
    * Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Group type. Valid values: `system`, `user`.
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
     * Get Group ID 
     * @return GroupId Group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID
     * @param GroupId Group ID
     */
    public void setGroupId(Long GroupId) {
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
     * Get Group type. Valid values: `system`, `user`. 
     * @return GroupType Group type. Valid values: `system`, `user`.
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set Group type. Valid values: `system`, `user`.
     * @param GroupType Group type. Valid values: `system`, `user`.
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public RecordGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordGroupInfo(RecordGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

