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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomState extends AbstractModel{

    /**
    * Call ID (unique call ID)
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * Room ID of string type
    */
    @SerializedName("RoomString")
    @Expose
    private String RoomString;

    /**
    * Room creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Room termination time
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * Whether the room is terminated
    */
    @SerializedName("IsFinished")
    @Expose
    private Boolean IsFinished;

    /**
    * Room creator ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Call ID (unique call ID) 
     * @return CommId Call ID (unique call ID)
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set Call ID (unique call ID)
     * @param CommId Call ID (unique call ID)
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get Room ID of string type 
     * @return RoomString Room ID of string type
     */
    public String getRoomString() {
        return this.RoomString;
    }

    /**
     * Set Room ID of string type
     * @param RoomString Room ID of string type
     */
    public void setRoomString(String RoomString) {
        this.RoomString = RoomString;
    }

    /**
     * Get Room creation time 
     * @return CreateTime Room creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Room creation time
     * @param CreateTime Room creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Room termination time 
     * @return DestroyTime Room termination time
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set Room termination time
     * @param DestroyTime Room termination time
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get Whether the room is terminated 
     * @return IsFinished Whether the room is terminated
     */
    public Boolean getIsFinished() {
        return this.IsFinished;
    }

    /**
     * Set Whether the room is terminated
     * @param IsFinished Whether the room is terminated
     */
    public void setIsFinished(Boolean IsFinished) {
        this.IsFinished = IsFinished;
    }

    /**
     * Get Room creator ID 
     * @return UserId Room creator ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Room creator ID
     * @param UserId Room creator ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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

