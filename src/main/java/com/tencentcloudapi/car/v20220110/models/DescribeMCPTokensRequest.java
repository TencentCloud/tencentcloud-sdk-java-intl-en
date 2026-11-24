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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMCPTokensRequest extends AbstractModel {

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of items per page</p><p>Value range: [0, 200]</p><p>Default value: 20</p><p>If 0 is passed in, the default value is used.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter list</p><p>Only filtering by TokenId and TokenName is supported. The number of Filters cannot exceed 10, the number of Values in each Filter cannot exceed 20, the length of a single Value cannot exceed 64 characters, and duplicate Filter names are not allowed.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of items per page</p><p>Value range: [0, 200]</p><p>Default value: 20</p><p>If 0 is passed in, the default value is used.</p> 
     * @return Limit <p>Number of items per page</p><p>Value range: [0, 200]</p><p>Default value: 20</p><p>If 0 is passed in, the default value is used.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page</p><p>Value range: [0, 200]</p><p>Default value: 20</p><p>If 0 is passed in, the default value is used.</p>
     * @param Limit <p>Number of items per page</p><p>Value range: [0, 200]</p><p>Default value: 20</p><p>If 0 is passed in, the default value is used.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter list</p><p>Only filtering by TokenId and TokenName is supported. The number of Filters cannot exceed 10, the number of Values in each Filter cannot exceed 20, the length of a single Value cannot exceed 64 characters, and duplicate Filter names are not allowed.</p> 
     * @return Filters <p>Filter list</p><p>Only filtering by TokenId and TokenName is supported. The number of Filters cannot exceed 10, the number of Values in each Filter cannot exceed 20, the length of a single Value cannot exceed 64 characters, and duplicate Filter names are not allowed.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter list</p><p>Only filtering by TokenId and TokenName is supported. The number of Filters cannot exceed 10, the number of Values in each Filter cannot exceed 20, the length of a single Value cannot exceed 64 characters, and duplicate Filter names are not allowed.</p>
     * @param Filters <p>Filter list</p><p>Only filtering by TokenId and TokenName is supported. The number of Filters cannot exceed 10, the number of Values in each Filter cannot exceed 20, the length of a single Value cannot exceed 64 characters, and duplicate Filter names are not allowed.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMCPTokensRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMCPTokensRequest(DescribeMCPTokensRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

