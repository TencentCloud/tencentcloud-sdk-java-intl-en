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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsRequest extends AbstractModel{

    /**
    * Pagination offset address. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of domain names per page. Default value: 100. Maximum value: 1000.
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
     * Get Number of domain names per page. Default value: 100. Maximum value: 1000. 
     * @return Limit Number of domain names per page. Default value: 100. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of domain names per page. Default value: 100. Maximum value: 1000.
     * @param Limit Number of domain names per page. Default value: 100. Maximum value: 1000.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

