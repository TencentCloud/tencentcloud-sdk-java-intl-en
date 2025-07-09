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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceGroupRequest extends AbstractModel {

    /**
    * Group ID
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
    * Parent group ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get Group ID 
     * @return GroupId Group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID
     * @param GroupId Group ID
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
     * Get Parent group ID 
     * @return ParentId Parent group ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent group ID
     * @param ParentId Parent group ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public ModifyResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceGroupRequest(ModifyResourceGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

