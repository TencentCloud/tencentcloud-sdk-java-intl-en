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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQVipInstancesRequest extends AbstractModel {

    /**
    * Query condition filter
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The maximum number of queried items, which defaults to 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start offset for query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Query condition filter 
     * @return Filters Query condition filter
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query condition filter
     * @param Filters Query condition filter
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The maximum number of queried items, which defaults to 20. 
     * @return Limit The maximum number of queried items, which defaults to 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of queried items, which defaults to 20.
     * @param Limit The maximum number of queried items, which defaults to 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start offset for query 
     * @return Offset Start offset for query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Start offset for query
     * @param Offset Start offset for query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeRabbitMQVipInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVipInstancesRequest(DescribeRabbitMQVipInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

