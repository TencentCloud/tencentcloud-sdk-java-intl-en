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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomListItem extends AbstractModel{

    /**
    * Room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The first time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The last time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number of users in the room.
    */
    @SerializedName("UserNumber")
    @Expose
    private Long UserNumber;

    /**
     * Get Room ID. 
     * @return RoomId Room ID.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID.
     * @param RoomId Room ID.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The first time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds. 
     * @return StartTime The first time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The first time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     * @param StartTime The first time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The last time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds. 
     * @return EndTime The last time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The last time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     * @param EndTime The last time when the room ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of users in the room. 
     * @return UserNumber Number of users in the room.
     */
    public Long getUserNumber() {
        return this.UserNumber;
    }

    /**
     * Set Number of users in the room.
     * @param UserNumber Number of users in the room.
     */
    public void setUserNumber(Long UserNumber) {
        this.UserNumber = UserNumber;
    }

    public RoomListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomListItem(RoomListItem source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.UserNumber != null) {
            this.UserNumber = new Long(source.UserNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserNumber", this.UserNumber);

    }
}

