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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIncrementalMigrationStrategyInfosRequest extends AbstractModel {

    /**
    * <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filter criteria. The maximum number of Filters.Values is `20`. If this parameter is not input, all stategy information under the current SubAppId will be returned. The detailed filter criteria are as follows:
<li>BucketId: Filter by the ID of bucket;</li>
<li>StrategyId: Filter by the ID of strategy.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sort the returned results according to this field. 
SortBy.Field Values include: 
<li>UpdateTime: (Default) Update time of the strategy.</li>SortBy.Order Values include: 
<li>Desc: (Default) The order is descend.</li> 

    */
    @SerializedName("SortBy")
    @Expose
    private SortBy SortBy;

    /**
    * Offset for paginated queries. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: `20`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b> 
     * @return SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     * @param SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filter criteria. The maximum number of Filters.Values is `20`. If this parameter is not input, all stategy information under the current SubAppId will be returned. The detailed filter criteria are as follows:
<li>BucketId: Filter by the ID of bucket;</li>
<li>StrategyId: Filter by the ID of strategy.</li> 
     * @return Filters Filter criteria. The maximum number of Filters.Values is `20`. If this parameter is not input, all stategy information under the current SubAppId will be returned. The detailed filter criteria are as follows:
<li>BucketId: Filter by the ID of bucket;</li>
<li>StrategyId: Filter by the ID of strategy.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is `20`. If this parameter is not input, all stategy information under the current SubAppId will be returned. The detailed filter criteria are as follows:
<li>BucketId: Filter by the ID of bucket;</li>
<li>StrategyId: Filter by the ID of strategy.</li>
     * @param Filters Filter criteria. The maximum number of Filters.Values is `20`. If this parameter is not input, all stategy information under the current SubAppId will be returned. The detailed filter criteria are as follows:
<li>BucketId: Filter by the ID of bucket;</li>
<li>StrategyId: Filter by the ID of strategy.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort the returned results according to this field. 
SortBy.Field Values include: 
<li>UpdateTime: (Default) Update time of the strategy.</li>SortBy.Order Values include: 
<li>Desc: (Default) The order is descend.</li> 
 
     * @return SortBy Sort the returned results according to this field. 
SortBy.Field Values include: 
<li>UpdateTime: (Default) Update time of the strategy.</li>SortBy.Order Values include: 
<li>Desc: (Default) The order is descend.</li> 

     */
    public SortBy getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort the returned results according to this field. 
SortBy.Field Values include: 
<li>UpdateTime: (Default) Update time of the strategy.</li>SortBy.Order Values include: 
<li>Desc: (Default) The order is descend.</li> 

     * @param SortBy Sort the returned results according to this field. 
SortBy.Field Values include: 
<li>UpdateTime: (Default) Update time of the strategy.</li>SortBy.Order Values include: 
<li>Desc: (Default) The order is descend.</li> 

     */
    public void setSortBy(SortBy SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Offset for paginated queries. Default value: `0`. 
     * @return Offset Offset for paginated queries. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: `0`.
     * @param Offset Offset for paginated queries. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: `20`. Maximum value: `100`. 
     * @return Limit Limit on paginated queries. Default value: `20`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: `20`. Maximum value: `100`.
     * @param Limit Limit on paginated queries. Default value: `20`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIncrementalMigrationStrategyInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIncrementalMigrationStrategyInfosRequest(DescribeIncrementalMigrationStrategyInfosRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy(source.SortBy);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "SortBy.", this.SortBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

