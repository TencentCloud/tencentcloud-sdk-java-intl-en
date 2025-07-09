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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGroupRequest extends AbstractModel {

    /**
    * User Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * User Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * User Group description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get User Group ID 
     * @return GroupId User Group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set User Group ID
     * @param GroupId User Group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get User Group name 
     * @return GroupName User Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set User Group name
     * @param GroupName User Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get User Group description 
     * @return Remark User Group description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set User Group description
     * @param Remark User Group description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public UpdateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGroupRequest(UpdateGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

