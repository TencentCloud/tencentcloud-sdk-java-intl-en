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

public class DescribeTopicsRequest extends AbstractModel {

    /**
    * <li>topicName: Filter by **log topic name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required. No. <br><li>logsetName: Filter by **logset name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required: No. <br><li>topicId: Filter by **log topic ID**. Type: String. Required: No. <br><li>logsetId: Filter by **logset ID**. You can call `DescribeLogsets` to query the list of created logsets or log in to the console to view them. You can also call `CreateLogset` to create a logset. Type: String. Required: No. <br><li>tagKey: Filter by **tag key**. Type: String. Required: No. <br><li>tag:tagKey: Filter by **tag key-value pair**. The `tagKey` should be replaced with a specified tag key, such as `tag:exampleKey`. Type: String. Required: No. <br><li>storageType: Filter by **log topic storage type**. Valid values: `hot` (standard storage) and `cold` (IA storage). Type: String. Required: No. Each request can have up to 10 `Filters` and 100 `Filter.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Page offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Match mode for `Filters` fields.
- 0: Fuzzy match for `topicName` and `logsetName`. This is the default value.
- 1: Exact match for `topicName`.
- 2: Exact match for `logsetName`.
- 3: Exact match for `topicName` and `logsetName`.
    */
    @SerializedName("PreciseSearch")
    @Expose
    private Long PreciseSearch;

    /**
    * Topic type
- 0 (default): Log topic.
- 1: Metric topic.

    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
     * Get <li>topicName: Filter by **log topic name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required. No. <br><li>logsetName: Filter by **logset name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required: No. <br><li>topicId: Filter by **log topic ID**. Type: String. Required: No. <br><li>logsetId: Filter by **logset ID**. You can call `DescribeLogsets` to query the list of created logsets or log in to the console to view them. You can also call `CreateLogset` to create a logset. Type: String. Required: No. <br><li>tagKey: Filter by **tag key**. Type: String. Required: No. <br><li>tag:tagKey: Filter by **tag key-value pair**. The `tagKey` should be replaced with a specified tag key, such as `tag:exampleKey`. Type: String. Required: No. <br><li>storageType: Filter by **log topic storage type**. Valid values: `hot` (standard storage) and `cold` (IA storage). Type: String. Required: No. Each request can have up to 10 `Filters` and 100 `Filter.Values`. 
     * @return Filters <li>topicName: Filter by **log topic name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required. No. <br><li>logsetName: Filter by **logset name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required: No. <br><li>topicId: Filter by **log topic ID**. Type: String. Required: No. <br><li>logsetId: Filter by **logset ID**. You can call `DescribeLogsets` to query the list of created logsets or log in to the console to view them. You can also call `CreateLogset` to create a logset. Type: String. Required: No. <br><li>tagKey: Filter by **tag key**. Type: String. Required: No. <br><li>tag:tagKey: Filter by **tag key-value pair**. The `tagKey` should be replaced with a specified tag key, such as `tag:exampleKey`. Type: String. Required: No. <br><li>storageType: Filter by **log topic storage type**. Valid values: `hot` (standard storage) and `cold` (IA storage). Type: String. Required: No. Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>topicName: Filter by **log topic name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required. No. <br><li>logsetName: Filter by **logset name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required: No. <br><li>topicId: Filter by **log topic ID**. Type: String. Required: No. <br><li>logsetId: Filter by **logset ID**. You can call `DescribeLogsets` to query the list of created logsets or log in to the console to view them. You can also call `CreateLogset` to create a logset. Type: String. Required: No. <br><li>tagKey: Filter by **tag key**. Type: String. Required: No. <br><li>tag:tagKey: Filter by **tag key-value pair**. The `tagKey` should be replaced with a specified tag key, such as `tag:exampleKey`. Type: String. Required: No. <br><li>storageType: Filter by **log topic storage type**. Valid values: `hot` (standard storage) and `cold` (IA storage). Type: String. Required: No. Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     * @param Filters <li>topicName: Filter by **log topic name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required. No. <br><li>logsetName: Filter by **logset name**. Fuzzy match is implemented by default. You can use the `PreciseSearch` parameter to set exact match. Type: String. Required: No. <br><li>topicId: Filter by **log topic ID**. Type: String. Required: No. <br><li>logsetId: Filter by **logset ID**. You can call `DescribeLogsets` to query the list of created logsets or log in to the console to view them. You can also call `CreateLogset` to create a logset. Type: String. Required: No. <br><li>tagKey: Filter by **tag key**. Type: String. Required: No. <br><li>tag:tagKey: Filter by **tag key-value pair**. The `tagKey` should be replaced with a specified tag key, such as `tag:exampleKey`. Type: String. Required: No. <br><li>storageType: Filter by **log topic storage type**. Valid values: `hot` (standard storage) and `cold` (IA storage). Type: String. Required: No. Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Page offset. Default value: 0. 
     * @return Offset Page offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0.
     * @param Offset Page offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries per page. Default value: 20. Maximum value: 100. 
     * @return Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Default value: 20. Maximum value: 100.
     * @param Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Match mode for `Filters` fields.
- 0: Fuzzy match for `topicName` and `logsetName`. This is the default value.
- 1: Exact match for `topicName`.
- 2: Exact match for `logsetName`.
- 3: Exact match for `topicName` and `logsetName`. 
     * @return PreciseSearch Match mode for `Filters` fields.
- 0: Fuzzy match for `topicName` and `logsetName`. This is the default value.
- 1: Exact match for `topicName`.
- 2: Exact match for `logsetName`.
- 3: Exact match for `topicName` and `logsetName`.
     */
    public Long getPreciseSearch() {
        return this.PreciseSearch;
    }

    /**
     * Set Match mode for `Filters` fields.
- 0: Fuzzy match for `topicName` and `logsetName`. This is the default value.
- 1: Exact match for `topicName`.
- 2: Exact match for `logsetName`.
- 3: Exact match for `topicName` and `logsetName`.
     * @param PreciseSearch Match mode for `Filters` fields.
- 0: Fuzzy match for `topicName` and `logsetName`. This is the default value.
- 1: Exact match for `topicName`.
- 2: Exact match for `logsetName`.
- 3: Exact match for `topicName` and `logsetName`.
     */
    public void setPreciseSearch(Long PreciseSearch) {
        this.PreciseSearch = PreciseSearch;
    }

    /**
     * Get Topic type
- 0 (default): Log topic.
- 1: Metric topic.
 
     * @return BizType Topic type
- 0 (default): Log topic.
- 1: Metric topic.

     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set Topic type
- 0 (default): Log topic.
- 1: Metric topic.

     * @param BizType Topic type
- 0 (default): Log topic.
- 1: Metric topic.

     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    public DescribeTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicsRequest(DescribeTopicsRequest source) {
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
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

