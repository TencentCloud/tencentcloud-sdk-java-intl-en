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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShippersRequest extends AbstractModel {

    /**
    * -shipperName: Filter by [delivery rule name].
Type: String.
    Required: No
-shipperId: Filter by [Delivery Rule ID].
Type: String.
    Required: No
-topicId: Filter by [log topic].
Type: String.
    Required: No
-taskStatus: Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
    Required: No

Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Default value: 20. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Control whether the relevant fields in Filters use exact matching. 0: Default value, fuzzy matching for shipperName. 1: Exact match for shipperName.
    */
    @SerializedName("PreciseSearch")
    @Expose
    private Long PreciseSearch;

    /**
     * Get -shipperName: Filter by [delivery rule name].
Type: String.
    Required: No
-shipperId: Filter by [Delivery Rule ID].
Type: String.
    Required: No
-topicId: Filter by [log topic].
Type: String.
    Required: No
-taskStatus: Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
    Required: No

Each request can have up to 10 Filters. The upper limit of Filter.Values is 10. 
     * @return Filters -shipperName: Filter by [delivery rule name].
Type: String.
    Required: No
-shipperId: Filter by [Delivery Rule ID].
Type: String.
    Required: No
-topicId: Filter by [log topic].
Type: String.
    Required: No
-taskStatus: Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
    Required: No

Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set -shipperName: Filter by [delivery rule name].
Type: String.
    Required: No
-shipperId: Filter by [Delivery Rule ID].
Type: String.
    Required: No
-topicId: Filter by [log topic].
Type: String.
    Required: No
-taskStatus: Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
    Required: No

Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     * @param Filters -shipperName: Filter by [delivery rule name].
Type: String.
    Required: No
-shipperId: Filter by [Delivery Rule ID].
Type: String.
    Required: No
-topicId: Filter by [log topic].
Type: String.
    Required: No
-taskStatus: Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
    Required: No

Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries per page. Default value: 20. Maximum value: 100 
     * @return Limit Maximum number of entries per page. Default value: 20. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Default value: 20. Maximum value: 100
     * @param Limit Maximum number of entries per page. Default value: 20. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Control whether the relevant fields in Filters use exact matching. 0: Default value, fuzzy matching for shipperName. 1: Exact match for shipperName. 
     * @return PreciseSearch Control whether the relevant fields in Filters use exact matching. 0: Default value, fuzzy matching for shipperName. 1: Exact match for shipperName.
     */
    public Long getPreciseSearch() {
        return this.PreciseSearch;
    }

    /**
     * Set Control whether the relevant fields in Filters use exact matching. 0: Default value, fuzzy matching for shipperName. 1: Exact match for shipperName.
     * @param PreciseSearch Control whether the relevant fields in Filters use exact matching. 0: Default value, fuzzy matching for shipperName. 1: Exact match for shipperName.
     */
    public void setPreciseSearch(Long PreciseSearch) {
        this.PreciseSearch = PreciseSearch;
    }

    public DescribeShippersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShippersRequest(DescribeShippersRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PreciseSearch != null) {
            this.PreciseSearch = new Long(source.PreciseSearch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PreciseSearch", this.PreciseSearch);

    }
}

