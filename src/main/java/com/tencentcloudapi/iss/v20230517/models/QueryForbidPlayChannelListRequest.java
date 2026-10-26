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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryForbidPlayChannelListRequest extends AbstractModel {

    /**
    * Sub-user uin, which can also be the root user uin.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Maximum number of items per page. Maximum value: 200. If the number of items exceeds 200, 200 items are returned.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Which page.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Sub-user uin, which can also be the root user uin. 
     * @return UserId Sub-user uin, which can also be the root user uin.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Sub-user uin, which can also be the root user uin.
     * @param UserId Sub-user uin, which can also be the root user uin.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Maximum number of items per page. Maximum value: 200. If the number of items exceeds 200, 200 items are returned. 
     * @return PageSize Maximum number of items per page. Maximum value: 200. If the number of items exceeds 200, 200 items are returned.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Maximum number of items per page. Maximum value: 200. If the number of items exceeds 200, 200 items are returned.
     * @param PageSize Maximum number of items per page. Maximum value: 200. If the number of items exceeds 200, 200 items are returned.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Which page. 
     * @return PageNumber Which page.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Which page.
     * @param PageNumber Which page.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public QueryForbidPlayChannelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryForbidPlayChannelListRequest(QueryForbidPlayChannelListRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

