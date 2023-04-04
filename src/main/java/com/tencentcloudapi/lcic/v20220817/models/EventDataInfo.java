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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDataInfo extends AbstractModel{

    /**
    * The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get The room ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public EventDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDataInfo(EventDataInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

