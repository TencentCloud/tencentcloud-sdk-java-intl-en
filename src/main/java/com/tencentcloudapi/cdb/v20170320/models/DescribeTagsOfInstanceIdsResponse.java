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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsOfInstanceIdsResponse extends AbstractModel{

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Instance tag information.
    */
    @SerializedName("Rows")
    @Expose
    private TagsInfoOfInstance [] Rows;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. 
     * @return Limit Number of entries per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
     * @param Limit Number of entries per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Instance tag information. 
     * @return Rows Instance tag information.
     */
    public TagsInfoOfInstance [] getRows() {
        return this.Rows;
    }

    /**
     * Set Instance tag information.
     * @param Rows Instance tag information.
     */
    public void setRows(TagsInfoOfInstance [] Rows) {
        this.Rows = Rows;
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

