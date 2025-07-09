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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsConfigRequest extends AbstractModel {

    /**
    * Pagination offset address. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of domain names per page. Default value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query filter.
    */
    @SerializedName("Filters")
    @Expose
    private DomainFilter [] Filters;

    /**
    * Query result sorting rule.
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get Pagination offset address. Default value: 0. 
     * @return Offset Pagination offset address. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset address. Default value: 0.
     * @param Offset Pagination offset address. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of domain names per page. Default value: 100. 
     * @return Limit Number of domain names per page. Default value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of domain names per page. Default value: 100.
     * @param Limit Number of domain names per page. Default value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query filter. 
     * @return Filters Query filter.
     */
    public DomainFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter.
     * @param Filters Query filter.
     */
    public void setFilters(DomainFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query result sorting rule. 
     * @return Sort Query result sorting rule.
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set Query result sorting rule.
     * @param Sort Query result sorting rule.
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeDomainsConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainsConfigRequest(DescribeDomainsConfigRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new DomainFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DomainFilter(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
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

