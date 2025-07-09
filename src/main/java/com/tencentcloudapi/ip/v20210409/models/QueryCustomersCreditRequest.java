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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomersCreditRequest extends AbstractModel {

    /**
    * Search condition type. You can only search by UIN, name, or remarks.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Search condition
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * A pagination parameter that specifies the current page number, with a value starting from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * A pagination parameter that specifies the number of entries per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * A sort parameter that specifies the sort order. Valid values: `desc` (descending order), or `asc` (ascending order) based on `AssociationTime`. The value will be `desc` if left empty.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Search condition type. You can only search by UIN, name, or remarks. 
     * @return FilterType Search condition type. You can only search by UIN, name, or remarks.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Search condition type. You can only search by UIN, name, or remarks.
     * @param FilterType Search condition type. You can only search by UIN, name, or remarks.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Search condition 
     * @return Filter Search condition
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Search condition
     * @param Filter Search condition
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get A pagination parameter that specifies the current page number, with a value starting from 1. 
     * @return Page A pagination parameter that specifies the current page number, with a value starting from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set A pagination parameter that specifies the current page number, with a value starting from 1.
     * @param Page A pagination parameter that specifies the current page number, with a value starting from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get A pagination parameter that specifies the number of entries per page. 
     * @return PageSize A pagination parameter that specifies the number of entries per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set A pagination parameter that specifies the number of entries per page.
     * @param PageSize A pagination parameter that specifies the number of entries per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get A sort parameter that specifies the sort order. Valid values: `desc` (descending order), or `asc` (ascending order) based on `AssociationTime`. The value will be `desc` if left empty. 
     * @return Order A sort parameter that specifies the sort order. Valid values: `desc` (descending order), or `asc` (ascending order) based on `AssociationTime`. The value will be `desc` if left empty.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set A sort parameter that specifies the sort order. Valid values: `desc` (descending order), or `asc` (ascending order) based on `AssociationTime`. The value will be `desc` if left empty.
     * @param Order A sort parameter that specifies the sort order. Valid values: `desc` (descending order), or `asc` (ascending order) based on `AssociationTime`. The value will be `desc` if left empty.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public QueryCustomersCreditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomersCreditRequest(QueryCustomersCreditRequest source) {
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

