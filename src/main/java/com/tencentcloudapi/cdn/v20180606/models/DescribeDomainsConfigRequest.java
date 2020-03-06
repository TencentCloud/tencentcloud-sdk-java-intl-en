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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsConfigRequest extends AbstractModel{

    /**
    * Offset for paged queries. Default value: 0 (the first page).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paged queries. Default value: 100. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query condition filter, complex type.
    */
    @SerializedName("Filters")
    @Expose
    private DomainFilter [] Filters;

    /**
    * Sorting rules
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get Offset for paged queries. Default value: 0 (the first page). 
     * @return Offset Offset for paged queries. Default value: 0 (the first page).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paged queries. Default value: 0 (the first page).
     * @param Offset Offset for paged queries. Default value: 0 (the first page).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paged queries. Default value: 100. Maximum value: 1000. 
     * @return Limit Limit on paged queries. Default value: 100. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paged queries. Default value: 100. Maximum value: 1000.
     * @param Limit Limit on paged queries. Default value: 100. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query condition filter, complex type. 
     * @return Filters Query condition filter, complex type.
     */
    public DomainFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query condition filter, complex type.
     * @param Filters Query condition filter, complex type.
     */
    public void setFilters(DomainFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting rules 
     * @return Sort Sorting rules
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting rules
     * @param Sort Sorting rules
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

