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

public class GroupIdOfUidInfo extends AbstractModel {

    /**
    * User Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user UIN. For UIN and UID, at least one of them is required.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

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
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Sub-user UIN. For UIN and UID, at least one of them is required. 
     * @return Uin Sub-user UIN. For UIN and UID, at least one of them is required.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user UIN. For UIN and UID, at least one of them is required.
     * @param Uin Sub-user UIN. For UIN and UID, at least one of them is required.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    public GroupIdOfUidInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupIdOfUidInfo(GroupIdOfUidInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

