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
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum number of Filters is 20, and the maximum number of Filters.Values is 20. If this parameter is left empty, the content identifiers authorized under the current AppId are returned by default. The detailed filter criteria are as follows: <li>description: filter by content identifier description in batches. For example: test;</li><li>content-id: filter by content identifier ID in batches. For example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li><li>status: filter by content identifier status. Valid values: active: active; deleted: deleted.</li>Fuzzy query is supported only for description. Precise query is required for other fields.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get The offset of paginated query. Default value: 0. 
     * @return Offset The offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. Default value: 0.
     * @param Offset The offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Maximum value: 100. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 100.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum number of Filters is 20, and the maximum number of Filters.Values is 20. If this parameter is left empty, the content identifiers authorized under the current AppId are returned by default. The detailed filter criteria are as follows: <li>description: filter by content identifier description in batches. For example: test;</li><li>content-id: filter by content identifier ID in batches. For example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li><li>status: filter by content identifier status. Valid values: active: active; deleted: deleted.</li>Fuzzy query is supported only for description. Precise query is required for other fields. 
     * @return Filters Filter criteria. The maximum number of Filters is 20, and the maximum number of Filters.Values is 20. If this parameter is left empty, the content identifiers authorized under the current AppId are returned by default. The detailed filter criteria are as follows: <li>description: filter by content identifier description in batches. For example: test;</li><li>content-id: filter by content identifier ID in batches. For example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li><li>status: filter by content identifier status. Valid values: active: active; deleted: deleted.</li>Fuzzy query is supported only for description. Precise query is required for other fields.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters is 20, and the maximum number of Filters.Values is 20. If this parameter is left empty, the content identifiers authorized under the current AppId are returned by default. The detailed filter criteria are as follows: <li>description: filter by content identifier description in batches. For example: test;</li><li>content-id: filter by content identifier ID in batches. For example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li><li>status: filter by content identifier status. Valid values: active: active; deleted: deleted.</li>Fuzzy query is supported only for description. Precise query is required for other fields.
     * @param Filters Filter criteria. The maximum number of Filters is 20, and the maximum number of Filters.Values is 20. If this parameter is left empty, the content identifiers authorized under the current AppId are returned by default. The detailed filter criteria are as follows: <li>description: filter by content identifier description in batches. For example: test;</li><li>content-id: filter by content identifier ID in batches. For example: eocontent-2noz78a8ev6k;</li><li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li><li>status: filter by content identifier status. Valid values: active: active; deleted: deleted.</li>Fuzzy query is supported only for description. Precise query is required for other fields.
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

