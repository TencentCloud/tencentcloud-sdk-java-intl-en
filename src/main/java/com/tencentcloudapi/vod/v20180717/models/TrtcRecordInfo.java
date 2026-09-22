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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrtcRecordInfo extends AbstractModel {

    /**
    * TRTC application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Recording task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * User ID list of the recording participants.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get TRTC application ID. 
     * @return SdkAppId TRTC application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC application ID.
     * @param SdkAppId TRTC application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC room ID. 
     * @return RoomId TRTC room ID.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC room ID.
     * @param RoomId TRTC room ID.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Recording task ID. 
     * @return TaskId Recording task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Recording task ID.
     * @param TaskId Recording task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get User ID list of the recording participants. 
     * @return UserIds User ID list of the recording participants.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set User ID list of the recording participants.
     * @param UserIds User ID list of the recording participants.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public TrtcRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrtcRecordInfo(TrtcRecordInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

