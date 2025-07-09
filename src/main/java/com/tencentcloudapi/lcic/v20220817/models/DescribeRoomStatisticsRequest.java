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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomStatisticsRequest extends AbstractModel {

    /**
    * Room ID
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Current page in pagination, which starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of data entries to return per page. Maximum value: 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Room ID 
     * @return RoomId Room ID
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID
     * @param RoomId Room ID
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Current page in pagination, which starts from 1. 
     * @return Page Current page in pagination, which starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Current page in pagination, which starts from 1.
     * @param Page Current page in pagination, which starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of data entries to return per page. Maximum value: 1000 
     * @return Limit Number of data entries to return per page. Maximum value: 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of data entries to return per page. Maximum value: 1000
     * @param Limit Number of data entries to return per page. Maximum value: 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRoomStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomStatisticsRequest(DescribeRoomStatisticsRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

