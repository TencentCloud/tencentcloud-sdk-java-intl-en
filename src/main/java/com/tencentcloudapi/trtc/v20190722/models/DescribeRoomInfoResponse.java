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

public class DescribeRoomInfoResponse extends AbstractModel {

    /**
    * The number of records returned.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The room information.
    */
    @SerializedName("RoomList")
    @Expose
    private RoomState [] RoomList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of records returned. 
     * @return Total The number of records returned.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The number of records returned.
     * @param Total The number of records returned.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The room information. 
     * @return RoomList The room information.
     */
    public RoomState [] getRoomList() {
        return this.RoomList;
    }

    /**
     * Set The room information.
     * @param RoomList The room information.
     */
    public void setRoomList(RoomState [] RoomList) {
        this.RoomList = RoomList;
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

    public DescribeRoomInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInfoResponse(DescribeRoomInfoResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RoomList != null) {
            this.RoomList = new RoomState[source.RoomList.length];
            for (int i = 0; i < source.RoomList.length; i++) {
                this.RoomList[i] = new RoomState(source.RoomList[i]);
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
        this.setParamArrayObj(map, prefix + "RoomList.", this.RoomList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

