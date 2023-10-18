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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpstreamsRequest extends AbstractModel {

    /**
    * Number of entries per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The starting position of paging
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filters. Valid values: `UpstreamId` and `UpstreamName`
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Number of entries per page 
     * @return Limit Number of entries per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page
     * @param Limit Number of entries per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The starting position of paging 
     * @return Offset The starting position of paging
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The starting position of paging
     * @param Offset The starting position of paging
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filters. Valid values: `UpstreamId` and `UpstreamName` 
     * @return Filters Filters. Valid values: `UpstreamId` and `UpstreamName`
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters. Valid values: `UpstreamId` and `UpstreamName`
     * @param Filters Filters. Valid values: `UpstreamId` and `UpstreamName`
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeUpstreamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpstreamsRequest(DescribeUpstreamsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

