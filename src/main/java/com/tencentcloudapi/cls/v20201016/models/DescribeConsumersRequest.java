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

public class DescribeConsumersRequest extends AbstractModel {

    /**
    * - consumerId
Filter by [Delivery Rule ID].
Type: String
Required: No

- topicId
Filter by [Log topic].
Type: String
Required: No

- taskStatus
Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
Required: No


Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination single page limit. The default value is 20, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get - consumerId
Filter by [Delivery Rule ID].
Type: String
Required: No

- topicId
Filter by [Log topic].
Type: String
Required: No

- taskStatus
Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
Required: No


Each request can have up to 10 Filters. The upper limit of Filter.Values is 10. 
     * @return Filters - consumerId
Filter by [Delivery Rule ID].
Type: String
Required: No

- topicId
Filter by [Log topic].
Type: String
Required: No

- taskStatus
Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
Required: No


Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - consumerId
Filter by [Delivery Rule ID].
Type: String
Required: No

- topicId
Filter by [Log topic].
Type: String
Required: No

- taskStatus
Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
Required: No


Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     * @param Filters - consumerId
Filter by [Delivery Rule ID].
Type: String
Required: No

- topicId
Filter by [Log topic].
Type: String
Required: No

- taskStatus
Filter by [task running status]. Supported values: `0`: stop, `1`: running, `2`: exception.
Type: String
Required: No


Each request can have up to 10 Filters. The upper limit of Filter.Values is 10.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination single page limit. The default value is 20, and the maximum value is 100. 
     * @return Limit Pagination single page limit. The default value is 20, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination single page limit. The default value is 20, and the maximum value is 100.
     * @param Limit Pagination single page limit. The default value is 20, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeConsumersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumersRequest(DescribeConsumersRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

