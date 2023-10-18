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

public class DescribeClustersRequest extends AbstractModel {

    /**
    * Start offset, which defaults to 0 if left empty.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter by cluster ID.
    */
    @SerializedName("ClusterIdList")
    @Expose
    private String [] ClusterIdList;

    /**
    * Whether to filter by tag.
    */
    @SerializedName("IsTagFilter")
    @Expose
    private Boolean IsTagFilter;

    /**
    * Filter. Currently, you can filter by tag.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Start offset, which defaults to 0 if left empty. 
     * @return Offset Start offset, which defaults to 0 if left empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Start offset, which defaults to 0 if left empty.
     * @param Offset Start offset, which defaults to 0 if left empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20. 
     * @return Limit The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     * @param Limit The number of results to be returned, which defaults to 10 if left empty. The maximum value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter by cluster ID. 
     * @return ClusterIdList Filter by cluster ID.
     */
    public String [] getClusterIdList() {
        return this.ClusterIdList;
    }

    /**
     * Set Filter by cluster ID.
     * @param ClusterIdList Filter by cluster ID.
     */
    public void setClusterIdList(String [] ClusterIdList) {
        this.ClusterIdList = ClusterIdList;
    }

    /**
     * Get Whether to filter by tag. 
     * @return IsTagFilter Whether to filter by tag.
     */
    public Boolean getIsTagFilter() {
        return this.IsTagFilter;
    }

    /**
     * Set Whether to filter by tag.
     * @param IsTagFilter Whether to filter by tag.
     */
    public void setIsTagFilter(Boolean IsTagFilter) {
        this.IsTagFilter = IsTagFilter;
    }

    /**
     * Get Filter. Currently, you can filter by tag. 
     * @return Filters Filter. Currently, you can filter by tag.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Currently, you can filter by tag.
     * @param Filters Filter. Currently, you can filter by tag.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterIdList != null) {
            this.ClusterIdList = new String[source.ClusterIdList.length];
            for (int i = 0; i < source.ClusterIdList.length; i++) {
                this.ClusterIdList[i] = new String(source.ClusterIdList[i]);
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
        this.setParamArraySimple(map, prefix + "ClusterIdList.", this.ClusterIdList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

