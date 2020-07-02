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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsResponse extends AbstractModel{

    /**
    * Total number of results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Data offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Resource tag
    */
    @SerializedName("Rows")
    @Expose
    private TagResource [] Rows;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of results 
     * @return TotalCount Total number of results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results
     * @param TotalCount Total number of results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Data offset. 
     * @return Offset Data offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset.
     * @param Offset Data offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Limit Number of entries per page.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Limit Number of entries per page.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Resource tag 
     * @return Rows Resource tag
     */
    public TagResource [] getRows() {
        return this.Rows;
    }

    /**
     * Set Resource tag
     * @param Rows Resource tag
     */
    public void setRows(TagResource [] Rows) {
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

