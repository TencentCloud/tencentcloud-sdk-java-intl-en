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

public class ScaleInfomation extends AbstractModel{

    /**
    * Start time for each day
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Number of users in room. If a user enters the room for multiple times, the user will be counted as one user.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserNumber")
    @Expose
    private Long UserNumber;

    /**
    * Number of room entries. Every time when a user enters the room, it will be counted as one room entry.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * Number of rooms under `sdkappid` on a day
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomNumbers")
    @Expose
    private Long RoomNumbers;

    /**
     * Get Start time for each day 
     * @return Time Start time for each day
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Start time for each day
     * @param Time Start time for each day
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Number of users in room. If a user enters the room for multiple times, the user will be counted as one user.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserNumber Number of users in room. If a user enters the room for multiple times, the user will be counted as one user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUserNumber() {
        return this.UserNumber;
    }

    /**
     * Set Number of users in room. If a user enters the room for multiple times, the user will be counted as one user.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserNumber Number of users in room. If a user enters the room for multiple times, the user will be counted as one user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserNumber(Long UserNumber) {
        this.UserNumber = UserNumber;
    }

    /**
     * Get Number of room entries. Every time when a user enters the room, it will be counted as one room entry.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserCount Number of room entries. Every time when a user enters the room, it will be counted as one room entry.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set Number of room entries. Every time when a user enters the room, it will be counted as one room entry.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserCount Number of room entries. Every time when a user enters the room, it will be counted as one room entry.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get Number of rooms under `sdkappid` on a day
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoomNumbers Number of rooms under `sdkappid` on a day
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoomNumbers() {
        return this.RoomNumbers;
    }

    /**
     * Set Number of rooms under `sdkappid` on a day
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoomNumbers Number of rooms under `sdkappid` on a day
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoomNumbers(Long RoomNumbers) {
        this.RoomNumbers = RoomNumbers;
    }

    public ScaleInfomation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleInfomation(ScaleInfomation source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.UserNumber != null) {
            this.UserNumber = new Long(source.UserNumber);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.RoomNumbers != null) {
            this.RoomNumbers = new Long(source.RoomNumbers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "UserNumber", this.UserNumber);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "RoomNumbers", this.RoomNumbers);

    }
}

