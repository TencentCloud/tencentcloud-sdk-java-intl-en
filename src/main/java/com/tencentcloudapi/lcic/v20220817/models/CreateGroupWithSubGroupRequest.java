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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupWithSubGroupRequest extends AbstractModel{

    /**
    * The group name after merging.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The IDs of the groups to merge. Duplicate group IDs are not allowed. Array length limit: 40.
    */
    @SerializedName("SubGroupIds")
    @Expose
    private String [] SubGroupIds;

    /**
    * The user ID of the teacher.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
     * Get The group name after merging. 
     * @return GroupName The group name after merging.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The group name after merging.
     * @param GroupName The group name after merging.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The SDKAppID assigned by LCIC. 
     * @return SdkAppId The SDKAppID assigned by LCIC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.
     * @param SdkAppId The SDKAppID assigned by LCIC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The IDs of the groups to merge. Duplicate group IDs are not allowed. Array length limit: 40. 
     * @return SubGroupIds The IDs of the groups to merge. Duplicate group IDs are not allowed. Array length limit: 40.
     */
    public String [] getSubGroupIds() {
        return this.SubGroupIds;
    }

    /**
     * Set The IDs of the groups to merge. Duplicate group IDs are not allowed. Array length limit: 40.
     * @param SubGroupIds The IDs of the groups to merge. Duplicate group IDs are not allowed. Array length limit: 40.
     */
    public void setSubGroupIds(String [] SubGroupIds) {
        this.SubGroupIds = SubGroupIds;
    }

    /**
     * Get The user ID of the teacher. 
     * @return TeacherId The user ID of the teacher.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set The user ID of the teacher.
     * @param TeacherId The user ID of the teacher.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    public CreateGroupWithSubGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupWithSubGroupRequest(CreateGroupWithSubGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubGroupIds != null) {
            this.SubGroupIds = new String[source.SubGroupIds.length];
            for (int i = 0; i < source.SubGroupIds.length; i++) {
                this.SubGroupIds[i] = new String(source.SubGroupIds[i]);
            }
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "SubGroupIds.", this.SubGroupIds);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);

    }
}

