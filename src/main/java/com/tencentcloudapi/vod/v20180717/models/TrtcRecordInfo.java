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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrtcRecordInfo extends AbstractModel {

    /**
    * The TRTC application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The TRTC room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The recording task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The IDs of users whose streams are mixed.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get The TRTC application ID. 
     * @return SdkAppId The TRTC application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The TRTC application ID.
     * @param SdkAppId The TRTC application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The TRTC room ID. 
     * @return RoomId The TRTC room ID.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The TRTC room ID.
     * @param RoomId The TRTC room ID.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The recording task ID. 
     * @return TaskId The recording task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The recording task ID.
     * @param TaskId The recording task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The IDs of users whose streams are mixed. 
     * @return UserIds The IDs of users whose streams are mixed.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set The IDs of users whose streams are mixed.
     * @param UserIds The IDs of users whose streams are mixed.
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

