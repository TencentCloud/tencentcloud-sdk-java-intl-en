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

public class AddGroupMemberRequest extends AbstractModel {

    /**
    * The group ID.
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
    * The users. Array length limit: 200.
    */
    @SerializedName("MemberIds")
    @Expose
    private String [] MemberIds;

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
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
     * Get The users. Array length limit: 200. 
     * @return MemberIds The users. Array length limit: 200.
     */
    public String [] getMemberIds() {
        return this.MemberIds;
    }

    /**
     * Set The users. Array length limit: 200.
     * @param MemberIds The users. Array length limit: 200.
     */
    public void setMemberIds(String [] MemberIds) {
        this.MemberIds = MemberIds;
    }

    public AddGroupMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddGroupMemberRequest(AddGroupMemberRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.MemberIds != null) {
            this.MemberIds = new String[source.MemberIds.length];
            for (int i = 0; i < source.MemberIds.length; i++) {
                this.MemberIds[i] = new String(source.MemberIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "MemberIds.", this.MemberIds);

    }
}

