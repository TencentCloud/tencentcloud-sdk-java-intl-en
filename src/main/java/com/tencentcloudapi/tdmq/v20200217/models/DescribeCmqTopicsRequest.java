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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCmqTopicsRequest extends AbstractModel {

    /**
    * Starting position of a queue list to be returned on the current page in case of paginated return. If a value is entered, `limit` must be specified. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of queues to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Fuzzy search by `TopicName`
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Filter by CMQ topic name.
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
    * For filtering by tag, this parameter must be set to `true`.
    */
    @SerializedName("IsTagFilter")
    @Expose
    private Boolean IsTagFilter;

    /**
    * Filter. Currently, you can filter by tag. The tag name must be prefixed with “tag:”, such as “tag: owner”, “tag: environment”, or “tag: business”.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Starting position of a queue list to be returned on the current page in case of paginated return. If a value is entered, `limit` must be specified. If this parameter is left empty, 0 will be used by default. 
     * @return Offset Starting position of a queue list to be returned on the current page in case of paginated return. If a value is entered, `limit` must be specified. If this parameter is left empty, 0 will be used by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of a queue list to be returned on the current page in case of paginated return. If a value is entered, `limit` must be specified. If this parameter is left empty, 0 will be used by default.
     * @param Offset Starting position of a queue list to be returned on the current page in case of paginated return. If a value is entered, `limit` must be specified. If this parameter is left empty, 0 will be used by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of queues to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50. 
     * @return Limit The number of queues to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of queues to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     * @param Limit The number of queues to be returned per page in case of paginated return. If this parameter is not passed in, 20 will be used by default. Maximum value: 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Fuzzy search by `TopicName` 
     * @return TopicName Fuzzy search by `TopicName`
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Fuzzy search by `TopicName`
     * @param TopicName Fuzzy search by `TopicName`
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Filter by CMQ topic name. 
     * @return TopicNameList Filter by CMQ topic name.
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set Filter by CMQ topic name.
     * @param TopicNameList Filter by CMQ topic name.
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    /**
     * Get For filtering by tag, this parameter must be set to `true`. 
     * @return IsTagFilter For filtering by tag, this parameter must be set to `true`.
     */
    public Boolean getIsTagFilter() {
        return this.IsTagFilter;
    }

    /**
     * Set For filtering by tag, this parameter must be set to `true`.
     * @param IsTagFilter For filtering by tag, this parameter must be set to `true`.
     */
    public void setIsTagFilter(Boolean IsTagFilter) {
        this.IsTagFilter = IsTagFilter;
    }

    /**
     * Get Filter. Currently, you can filter by tag. The tag name must be prefixed with “tag:”, such as “tag: owner”, “tag: environment”, or “tag: business”. 
     * @return Filters Filter. Currently, you can filter by tag. The tag name must be prefixed with “tag:”, such as “tag: owner”, “tag: environment”, or “tag: business”.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Currently, you can filter by tag. The tag name must be prefixed with “tag:”, such as “tag: owner”, “tag: environment”, or “tag: business”.
     * @param Filters Filter. Currently, you can filter by tag. The tag name must be prefixed with “tag:”, such as “tag: owner”, “tag: environment”, or “tag: business”.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCmqTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqTopicsRequest(DescribeCmqTopicsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
        if (source.IsTagFilter != null) {
            this.IsTagFilter = new Boolean(source.IsTagFilter);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

