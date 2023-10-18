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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupRequest extends AbstractModel {

    /**
    * The ID of the group to modify.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The user ID of the teacher.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * The new group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get The ID of the group to modify. 
     * @return GroupId The ID of the group to modify.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The ID of the group to modify.
     * @param GroupId The ID of the group to modify.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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

    /**
     * Get The new group name. 
     * @return GroupName The new group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The new group name.
     * @param GroupName The new group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

