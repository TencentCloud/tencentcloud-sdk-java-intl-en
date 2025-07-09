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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineListRequest extends AbstractModel {

    /**
    * Pagination parameter, indicating the number of entries per page. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filtering criteria
<li>StrategyId - Uint64 - baseline policy ID</li>
<li>Status - Uint64 - processing status: 1: passed; 0: failed</li><li>Level - Uint64[] - risk level: 1: low; 2: medium; 3: high; 4: critical</li><li>BaselineName - String - baseline name</li>
<li>Quuid - String - host QUUID</li>
<li>Uuid - String - host UUID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Pagination parameter, indicating the number of entries per page. Maximum value: 100. 
     * @return Limit Pagination parameter, indicating the number of entries per page. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter, indicating the number of entries per page. Maximum value: 100.
     * @param Limit Pagination parameter, indicating the number of entries per page. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filtering criteria
<li>StrategyId - Uint64 - baseline policy ID</li>
<li>Status - Uint64 - processing status: 1: passed; 0: failed</li><li>Level - Uint64[] - risk level: 1: low; 2: medium; 3: high; 4: critical</li><li>BaselineName - String - baseline name</li>
<li>Quuid - String - host QUUID</li>
<li>Uuid - String - host UUID</li> 
     * @return Filters Filtering criteria
<li>StrategyId - Uint64 - baseline policy ID</li>
<li>Status - Uint64 - processing status: 1: passed; 0: failed</li><li>Level - Uint64[] - risk level: 1: low; 2: medium; 3: high; 4: critical</li><li>BaselineName - String - baseline name</li>
<li>Quuid - String - host QUUID</li>
<li>Uuid - String - host UUID</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>StrategyId - Uint64 - baseline policy ID</li>
<li>Status - Uint64 - processing status: 1: passed; 0: failed</li><li>Level - Uint64[] - risk level: 1: low; 2: medium; 3: high; 4: critical</li><li>BaselineName - String - baseline name</li>
<li>Quuid - String - host QUUID</li>
<li>Uuid - String - host UUID</li>
     * @param Filters Filtering criteria
<li>StrategyId - Uint64 - baseline policy ID</li>
<li>Status - Uint64 - processing status: 1: passed; 0: failed</li><li>Level - Uint64[] - risk level: 1: low; 2: medium; 3: high; 4: critical</li><li>BaselineName - String - baseline name</li>
<li>Quuid - String - host QUUID</li>
<li>Uuid - String - host UUID</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBaselineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineListRequest(DescribeBaselineListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

