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

public class DescribeRoomInformationResponse extends AbstractModel{

    /**
    * Total number of data entries displayed on the current page
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Room information list
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
     * Get Total number of data entries displayed on the current page 
     * @return Total Total number of data entries displayed on the current page
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of data entries displayed on the current page
     * @param Total Total number of data entries displayed on the current page
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Room information list 
     * @return RoomList Room information list
     */
    public RoomState [] getRoomList() {
        return this.RoomList;
    }

    /**
     * Set Room information list
     * @param RoomList Room information list
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "RoomList.", this.RoomList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

