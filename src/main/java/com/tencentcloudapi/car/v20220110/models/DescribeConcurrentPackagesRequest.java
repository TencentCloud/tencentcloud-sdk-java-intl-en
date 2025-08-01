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

public class DescribeConcurrentPackagesRequest extends AbstractModel {

    /**
    * Subscript.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter List
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Subscript. 
     * @return Offset Subscript.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Subscript.
     * @param Offset Subscript.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. 
     * @return Limit Number of entries per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
     * @param Limit Number of entries per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter List 
     * @return Filters Filter List
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter List
     * @param Filters Filter List
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeConcurrentPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrentPackagesRequest(DescribeConcurrentPackagesRequest source) {
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

