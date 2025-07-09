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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContentIdentifiersRequest extends AbstractModel {

    /**
    * The offset of paginated query. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. default value: `20`. maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. the upper limit for filters is 20, and the upper limit for filters.values is 20. if this parameter is not filled in, the content identifiers with permissions under the current appid are returned by default. detailed filtering conditions are as follows: <li>description: filter by content identifier description in batches; for example: test;</li><li>content-id: filter by content identifier id in batches; for example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by Tag key;</li><li>tag-value: filter by Tag value;</li><li>status: filter by content identifier status. valid values: active: active; deleted: deleted.</li>only description supports fuzzy query, other fields require precise query.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get The offset of paginated query. default value: 0. 
     * @return Offset The offset of paginated query. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. default value: 0.
     * @param Offset The offset of paginated query. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. default value: `20`. maximum value: `100`. 
     * @return Limit Limit on paginated queries. default value: `20`. maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. default value: `20`. maximum value: `100`.
     * @param Limit Limit on paginated queries. default value: `20`. maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. the upper limit for filters is 20, and the upper limit for filters.values is 20. if this parameter is not filled in, the content identifiers with permissions under the current appid are returned by default. detailed filtering conditions are as follows: <li>description: filter by content identifier description in batches; for example: test;</li><li>content-id: filter by content identifier id in batches; for example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by Tag key;</li><li>tag-value: filter by Tag value;</li><li>status: filter by content identifier status. valid values: active: active; deleted: deleted.</li>only description supports fuzzy query, other fields require precise query. 
     * @return Filters Filter conditions. the upper limit for filters is 20, and the upper limit for filters.values is 20. if this parameter is not filled in, the content identifiers with permissions under the current appid are returned by default. detailed filtering conditions are as follows: <li>description: filter by content identifier description in batches; for example: test;</li><li>content-id: filter by content identifier id in batches; for example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by Tag key;</li><li>tag-value: filter by Tag value;</li><li>status: filter by content identifier status. valid values: active: active; deleted: deleted.</li>only description supports fuzzy query, other fields require precise query.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. the upper limit for filters is 20, and the upper limit for filters.values is 20. if this parameter is not filled in, the content identifiers with permissions under the current appid are returned by default. detailed filtering conditions are as follows: <li>description: filter by content identifier description in batches; for example: test;</li><li>content-id: filter by content identifier id in batches; for example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by Tag key;</li><li>tag-value: filter by Tag value;</li><li>status: filter by content identifier status. valid values: active: active; deleted: deleted.</li>only description supports fuzzy query, other fields require precise query.
     * @param Filters Filter conditions. the upper limit for filters is 20, and the upper limit for filters.values is 20. if this parameter is not filled in, the content identifiers with permissions under the current appid are returned by default. detailed filtering conditions are as follows: <li>description: filter by content identifier description in batches; for example: test;</li><li>content-id: filter by content identifier id in batches; for example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by Tag key;</li><li>tag-value: filter by Tag value;</li><li>status: filter by content identifier status. valid values: active: active; deleted: deleted.</li>only description supports fuzzy query, other fields require precise query.
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeContentIdentifiersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContentIdentifiersRequest(DescribeContentIdentifiersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

