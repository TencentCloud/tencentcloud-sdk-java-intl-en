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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCmqQueuesRequest extends AbstractModel{

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
    * Filter by `QueueName`
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Filter by CMQ queue name.
    */
    @SerializedName("QueueNameList")
    @Expose
    private String [] QueueNameList;

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
     * Get Filter by `QueueName` 
     * @return QueueName Filter by `QueueName`
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Filter by `QueueName`
     * @param QueueName Filter by `QueueName`
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Filter by CMQ queue name. 
     * @return QueueNameList Filter by CMQ queue name.
     */
    public String [] getQueueNameList() {
        return this.QueueNameList;
    }

    /**
     * Set Filter by CMQ queue name.
     * @param QueueNameList Filter by CMQ queue name.
     */
    public void setQueueNameList(String [] QueueNameList) {
        this.QueueNameList = QueueNameList;
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

    public DescribeCmqQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqQueuesRequest(DescribeCmqQueuesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueueNameList != null) {
            this.QueueNameList = new String[source.QueueNameList.length];
            for (int i = 0; i < source.QueueNameList.length; i++) {
                this.QueueNameList[i] = new String(source.QueueNameList[i]);
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
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArraySimple(map, prefix + "QueueNameList.", this.QueueNameList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

