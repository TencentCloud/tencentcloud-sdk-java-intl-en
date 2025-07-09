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

public class GetRoomEventRequest extends AbstractModel {

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The starting page. Pagination starts from 1. This parameter is valid only if `keyword` is empty.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The maximum number of records (up to 200) per page. This parameter is valid only if `keyword` is empty.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The type of events to query. Valid values:
`RoomStart`: The class started.
`RoomEnd`: The class ended.
`MemberJoin`: A user joined.
`MemberQuit`: A user left.
`RecordFinish`: Recording is finished.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

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
     * Get The application ID. 
     * @return SdkAppId The application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID.
     * @param SdkAppId The application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The starting page. Pagination starts from 1. This parameter is valid only if `keyword` is empty. 
     * @return Page The starting page. Pagination starts from 1. This parameter is valid only if `keyword` is empty.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The starting page. Pagination starts from 1. This parameter is valid only if `keyword` is empty.
     * @param Page The starting page. Pagination starts from 1. This parameter is valid only if `keyword` is empty.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The maximum number of records (up to 200) per page. This parameter is valid only if `keyword` is empty. 
     * @return Limit The maximum number of records (up to 200) per page. This parameter is valid only if `keyword` is empty.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of records (up to 200) per page. This parameter is valid only if `keyword` is empty.
     * @param Limit The maximum number of records (up to 200) per page. This parameter is valid only if `keyword` is empty.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The type of events to query. Valid values:
`RoomStart`: The class started.
`RoomEnd`: The class ended.
`MemberJoin`: A user joined.
`MemberQuit`: A user left.
`RecordFinish`: Recording is finished. 
     * @return Keyword The type of events to query. Valid values:
`RoomStart`: The class started.
`RoomEnd`: The class ended.
`MemberJoin`: A user joined.
`MemberQuit`: A user left.
`RecordFinish`: Recording is finished.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set The type of events to query. Valid values:
`RoomStart`: The class started.
`RoomEnd`: The class ended.
`MemberJoin`: A user joined.
`MemberQuit`: A user left.
`RecordFinish`: Recording is finished.
     * @param Keyword The type of events to query. Valid values:
`RoomStart`: The class started.
`RoomEnd`: The class ended.
`MemberJoin`: A user joined.
`MemberQuit`: A user left.
`RecordFinish`: Recording is finished.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public GetRoomEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomEventRequest(GetRoomEventRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

