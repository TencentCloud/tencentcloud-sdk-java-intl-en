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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomState extends AbstractModel {

    /**
    * The call ID, which uniquely identifies a call.
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * The room ID.
    */
    @SerializedName("RoomString")
    @Expose
    private String RoomString;

    /**
    * The room creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * The room termination time.
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * Whether the room is terminated.
    */
    @SerializedName("IsFinished")
    @Expose
    private Boolean IsFinished;

    /**
    * The user ID of the room creator.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get The call ID, which uniquely identifies a call. 
     * @return CommId The call ID, which uniquely identifies a call.
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set The call ID, which uniquely identifies a call.
     * @param CommId The call ID, which uniquely identifies a call.
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get The room ID. 
     * @return RoomString The room ID.
     */
    public String getRoomString() {
        return this.RoomString;
    }

    /**
     * Set The room ID.
     * @param RoomString The room ID.
     */
    public void setRoomString(String RoomString) {
        this.RoomString = RoomString;
    }

    /**
     * Get The room creation time. 
     * @return CreateTime The room creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The room creation time.
     * @param CreateTime The room creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The room termination time. 
     * @return DestroyTime The room termination time.
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set The room termination time.
     * @param DestroyTime The room termination time.
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get Whether the room is terminated. 
     * @return IsFinished Whether the room is terminated.
     */
    public Boolean getIsFinished() {
        return this.IsFinished;
    }

    /**
     * Set Whether the room is terminated.
     * @param IsFinished Whether the room is terminated.
     */
    public void setIsFinished(Boolean IsFinished) {
        this.IsFinished = IsFinished;
    }

    /**
     * Get The user ID of the room creator. 
     * @return UserId The user ID of the room creator.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID of the room creator.
     * @param UserId The user ID of the room creator.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public RoomState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomState(RoomState source) {
        if (source.CommId != null) {
            this.CommId = new String(source.CommId);
        }
        if (source.RoomString != null) {
            this.RoomString = new String(source.RoomString);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new Long(source.DestroyTime);
        }
        if (source.IsFinished != null) {
            this.IsFinished = new Boolean(source.IsFinished);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "RoomString", this.RoomString);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "IsFinished", this.IsFinished);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

