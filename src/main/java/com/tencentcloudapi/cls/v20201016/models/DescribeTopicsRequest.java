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
    * <ul><li>Filter topicName by [topic name]. The default is fuzzy matching. You can set the PreciseSearch parameter to exact match. Type: String. Required: No</li>
<li>logsetName filters by [logset name], defaults to fuzzy matching, and can be set to exact match using the PreciseSearch parameter. Type: String. Required: No</li>
<li>topicId filters by [topic ID]. Type: String. Required: No</li>
<li>logsetId filters by [logset ID]. You can call the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">DescribeLogsets</a> API to query the list of created logsets or log in to the console to view. You can also call the <a href="https://www.tencentcloud.com/document/product/614/58626?from_cn_redirect=1">CreateLogset</a> API to create logset. Type: String. Required: No</li>
<li>tagKey Filter by [tag key]. Type: String. Required: No</li>
<li>tag:tagKey - filter by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String. Required: no</li>
<li>storageType filters by [storage type of the topic]. Value range: hot (standard storage), cold (infrequent storage). Type: String. Required: No</li></ul>
Note: Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
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
    * Control whether the related fields in Filters are exact matches.
<ul><li>0: Default value. topicName and logsetName use fuzzy matching</li>
<li>1: topicName   Exact match</li>
<li>2: Exact match by logsetName</li>
<li>3: Exact match by both topicName and logsetName</li></ul>
    */
    @SerializedName("PreciseSearch")
    @Expose
    private Long PreciseSearch;

    /**
    * Topic type
-0: Log topic, default value
-Metric topic
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
     * Get <ul><li>Filter topicName by [topic name]. The default is fuzzy matching. You can set the PreciseSearch parameter to exact match. Type: String. Required: No</li>
<li>logsetName filters by [logset name], defaults to fuzzy matching, and can be set to exact match using the PreciseSearch parameter. Type: String. Required: No</li>
<li>topicId filters by [topic ID]. Type: String. Required: No</li>
<li>logsetId filters by [logset ID]. You can call the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">DescribeLogsets</a> API to query the list of created logsets or log in to the console to view. You can also call the <a href="https://www.tencentcloud.com/document/product/614/58626?from_cn_redirect=1">CreateLogset</a> API to create logset. Type: String. Required: No</li>
<li>tagKey Filter by [tag key]. Type: String. Required: No</li>
<li>tag:tagKey - filter by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String. Required: no</li>
<li>storageType filters by [storage type of the topic]. Value range: hot (standard storage), cold (infrequent storage). Type: String. Required: No</li></ul>
Note: Each request can have up to 10 Filters. The upper limit of Filter.Values is 100. 
     * @return Filters <ul><li>Filter topicName by [topic name]. The default is fuzzy matching. You can set the PreciseSearch parameter to exact match. Type: String. Required: No</li>
<li>logsetName filters by [logset name], defaults to fuzzy matching, and can be set to exact match using the PreciseSearch parameter. Type: String. Required: No</li>
<li>topicId filters by [topic ID]. Type: String. Required: No</li>
<li>logsetId filters by [logset ID]. You can call the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">DescribeLogsets</a> API to query the list of created logsets or log in to the console to view. You can also call the <a href="https://www.tencentcloud.com/document/product/614/58626?from_cn_redirect=1">CreateLogset</a> API to create logset. Type: String. Required: No</li>
<li>tagKey Filter by [tag key]. Type: String. Required: No</li>
<li>tag:tagKey - filter by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String. Required: no</li>
<li>storageType filters by [storage type of the topic]. Value range: hot (standard storage), cold (infrequent storage). Type: String. Required: No</li></ul>
Note: Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <ul><li>Filter topicName by [topic name]. The default is fuzzy matching. You can set the PreciseSearch parameter to exact match. Type: String. Required: No</li>
<li>logsetName filters by [logset name], defaults to fuzzy matching, and can be set to exact match using the PreciseSearch parameter. Type: String. Required: No</li>
<li>topicId filters by [topic ID]. Type: String. Required: No</li>
<li>logsetId filters by [logset ID]. You can call the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">DescribeLogsets</a> API to query the list of created logsets or log in to the console to view. You can also call the <a href="https://www.tencentcloud.com/document/product/614/58626?from_cn_redirect=1">CreateLogset</a> API to create logset. Type: String. Required: No</li>
<li>tagKey Filter by [tag key]. Type: String. Required: No</li>
<li>tag:tagKey - filter by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String. Required: no</li>
<li>storageType filters by [storage type of the topic]. Value range: hot (standard storage), cold (infrequent storage). Type: String. Required: No</li></ul>
Note: Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     * @param Filters <ul><li>Filter topicName by [topic name]. The default is fuzzy matching. You can set the PreciseSearch parameter to exact match. Type: String. Required: No</li>
<li>logsetName filters by [logset name], defaults to fuzzy matching, and can be set to exact match using the PreciseSearch parameter. Type: String. Required: No</li>
<li>topicId filters by [topic ID]. Type: String. Required: No</li>
<li>logsetId filters by [logset ID]. You can call the <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">DescribeLogsets</a> API to query the list of created logsets or log in to the console to view. You can also call the <a href="https://www.tencentcloud.com/document/product/614/58626?from_cn_redirect=1">CreateLogset</a> API to create logset. Type: String. Required: No</li>
<li>tagKey Filter by [tag key]. Type: String. Required: No</li>
<li>tag:tagKey - filter by [tag key-value pair]. Replace tagKey with a specific tag key, such as tag:exampleKey. Type: String. Required: no</li>
<li>storageType filters by [storage type of the topic]. Value range: hot (standard storage), cold (infrequent storage). Type: String. Required: No</li></ul>
Note: Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
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
     * Get Control whether the related fields in Filters are exact matches.
<ul><li>0: Default value. topicName and logsetName use fuzzy matching</li>
<li>1: topicName   Exact match</li>
<li>2: Exact match by logsetName</li>
<li>3: Exact match by both topicName and logsetName</li></ul> 
     * @return PreciseSearch Control whether the related fields in Filters are exact matches.
<ul><li>0: Default value. topicName and logsetName use fuzzy matching</li>
<li>1: topicName   Exact match</li>
<li>2: Exact match by logsetName</li>
<li>3: Exact match by both topicName and logsetName</li></ul>
     */
    public Long getPreciseSearch() {
        return this.PreciseSearch;
    }

    /**
     * Set Control whether the related fields in Filters are exact matches.
<ul><li>0: Default value. topicName and logsetName use fuzzy matching</li>
<li>1: topicName   Exact match</li>
<li>2: Exact match by logsetName</li>
<li>3: Exact match by both topicName and logsetName</li></ul>
     * @param PreciseSearch Control whether the related fields in Filters are exact matches.
<ul><li>0: Default value. topicName and logsetName use fuzzy matching</li>
<li>1: topicName   Exact match</li>
<li>2: Exact match by logsetName</li>
<li>3: Exact match by both topicName and logsetName</li></ul>
     */
    public void setPreciseSearch(Long PreciseSearch) {
        this.PreciseSearch = PreciseSearch;
    }

    /**
     * Get Topic type
-0: Log topic, default value
-Metric topic 
     * @return BizType Topic type
-0: Log topic, default value
-Metric topic
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set Topic type
-0: Log topic, default value
-Metric topic
     * @param BizType Topic type
-0: Log topic, default value
-Metric topic
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

