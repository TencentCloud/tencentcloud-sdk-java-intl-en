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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveUserRequest extends AbstractModel {

    /**
    * `SDKAppId` of TRTC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room number.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * List of up to 10 users to be removed.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get `SDKAppId` of TRTC. 
     * @return SdkAppId `SDKAppId` of TRTC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SDKAppId` of TRTC.
     * @param SdkAppId `SDKAppId` of TRTC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room number. 
     * @return RoomId Room number.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room number.
     * @param RoomId Room number.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get List of up to 10 users to be removed. 
     * @return UserIds List of up to 10 users to be removed.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set List of up to 10 users to be removed.
     * @param UserIds List of up to 10 users to be removed.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public RemoveUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveUserRequest(RemoveUserRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

