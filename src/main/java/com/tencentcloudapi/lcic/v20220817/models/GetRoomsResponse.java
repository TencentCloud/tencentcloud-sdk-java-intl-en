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

public class GetRoomsResponse extends AbstractModel{

    /**
    * The total number of rooms.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The room list.
    */
    @SerializedName("Rooms")
    @Expose
    private RoomItem [] Rooms;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of rooms. 
     * @return Total The total number of rooms.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of rooms.
     * @param Total The total number of rooms.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The room list. 
     * @return Rooms The room list.
     */
    public RoomItem [] getRooms() {
        return this.Rooms;
    }

    /**
     * Set The room list.
     * @param Rooms The room list.
     */
    public void setRooms(RoomItem [] Rooms) {
        this.Rooms = Rooms;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetRoomsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomsResponse(GetRoomsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Rooms != null) {
            this.Rooms = new RoomItem[source.Rooms.length];
            for (int i = 0; i < source.Rooms.length; i++) {
                this.Rooms[i] = new RoomItem(source.Rooms[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Rooms.", this.Rooms);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

