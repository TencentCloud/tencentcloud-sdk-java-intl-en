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

public class DescribeQuestionListRequest extends AbstractModel{

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The room ID. 
     * @return RoomId The room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
     * @param RoomId The room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The page to return records from. Pagination starts from 1, which is also the default value of this parameter. 
     * @return Page The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     * @param Page The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The page to return records from. Pagination starts from 1, which is also the default value of this parameter. 
     * @return Limit The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     * @param Limit The page to return records from. Pagination starts from 1, which is also the default value of this parameter.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeQuestionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuestionListRequest(DescribeQuestionListRequest source) {
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

