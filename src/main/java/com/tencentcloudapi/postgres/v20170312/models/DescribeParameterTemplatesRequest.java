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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParameterTemplatesRequest extends AbstractModel {

    /**
    * Filter criteria currently supported: TemplateName, TemplateId, DBMajorVersion, DBEngine. fuzzy matching is not supported for TemplateName.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The maximum number of results returned per page. Value range: 0-100. Default: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting metric, enumeration value, supports: CreateTime, TemplateName, DBMajorVersion. if this parameter is not set, it defaults to sorting by the parameter template number in reverse order, which means that newly added parameter templates appear at the top.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method, enumeration value, supports: `asc` (ascending) and `desc` (descending). the default value is `asc`. when OrderBy is not specified, this parameter becomes invalid, at which point the sorting method follows the default sorting order provided in the OrderBy parameter description.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Filter criteria currently supported: TemplateName, TemplateId, DBMajorVersion, DBEngine. fuzzy matching is not supported for TemplateName. 
     * @return Filters Filter criteria currently supported: TemplateName, TemplateId, DBMajorVersion, DBEngine. fuzzy matching is not supported for TemplateName.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria currently supported: TemplateName, TemplateId, DBMajorVersion, DBEngine. fuzzy matching is not supported for TemplateName.
     * @param Filters Filter criteria currently supported: TemplateName, TemplateId, DBMajorVersion, DBEngine. fuzzy matching is not supported for TemplateName.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The maximum number of results returned per page. Value range: 0-100. Default: `20`. 
     * @return Limit The maximum number of results returned per page. Value range: 0-100. Default: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned per page. Value range: 0-100. Default: `20`.
     * @param Limit The maximum number of results returned per page. Value range: 0-100. Default: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset 
     * @return Offset Data offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset
     * @param Offset Data offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting metric, enumeration value, supports: CreateTime, TemplateName, DBMajorVersion. if this parameter is not set, it defaults to sorting by the parameter template number in reverse order, which means that newly added parameter templates appear at the top. 
     * @return OrderBy Sorting metric, enumeration value, supports: CreateTime, TemplateName, DBMajorVersion. if this parameter is not set, it defaults to sorting by the parameter template number in reverse order, which means that newly added parameter templates appear at the top.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting metric, enumeration value, supports: CreateTime, TemplateName, DBMajorVersion. if this parameter is not set, it defaults to sorting by the parameter template number in reverse order, which means that newly added parameter templates appear at the top.
     * @param OrderBy Sorting metric, enumeration value, supports: CreateTime, TemplateName, DBMajorVersion. if this parameter is not set, it defaults to sorting by the parameter template number in reverse order, which means that newly added parameter templates appear at the top.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method, enumeration value, supports: `asc` (ascending) and `desc` (descending). the default value is `asc`. when OrderBy is not specified, this parameter becomes invalid, at which point the sorting method follows the default sorting order provided in the OrderBy parameter description. 
     * @return OrderByType Sorting method, enumeration value, supports: `asc` (ascending) and `desc` (descending). the default value is `asc`. when OrderBy is not specified, this parameter becomes invalid, at which point the sorting method follows the default sorting order provided in the OrderBy parameter description.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method, enumeration value, supports: `asc` (ascending) and `desc` (descending). the default value is `asc`. when OrderBy is not specified, this parameter becomes invalid, at which point the sorting method follows the default sorting order provided in the OrderBy parameter description.
     * @param OrderByType Sorting method, enumeration value, supports: `asc` (ascending) and `desc` (descending). the default value is `asc`. when OrderBy is not specified, this parameter becomes invalid, at which point the sorting method follows the default sorting order provided in the OrderBy parameter description.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeParameterTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParameterTemplatesRequest(DescribeParameterTemplatesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

