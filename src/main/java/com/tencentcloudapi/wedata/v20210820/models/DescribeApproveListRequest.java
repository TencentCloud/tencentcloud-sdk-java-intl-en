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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApproveListRequest extends AbstractModel {

    /**
    * Approval Category Key
    */
    @SerializedName("ApproveClassification")
    @Expose
    private String ApproveClassification;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Pagination Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Custom Definition condition query
    */
    @SerializedName("Filters")
    @Expose
    private FilterOptional [] Filters;

    /**
    * Sort Fields
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderFieldOptional [] OrderFields;

    /**
     * Get Approval Category Key 
     * @return ApproveClassification Approval Category Key
     */
    public String getApproveClassification() {
        return this.ApproveClassification;
    }

    /**
     * Set Approval Category Key
     * @param ApproveClassification Approval Category Key
     */
    public void setApproveClassification(String ApproveClassification) {
        this.ApproveClassification = ApproveClassification;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Pagination Number 
     * @return PageNumber Pagination Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Pagination Number
     * @param PageNumber Pagination Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Custom Definition condition query 
     * @return Filters Custom Definition condition query
     */
    public FilterOptional [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Custom Definition condition query
     * @param Filters Custom Definition condition query
     */
    public void setFilters(FilterOptional [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort Fields 
     * @return OrderFields Sort Fields
     */
    public OrderFieldOptional [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sort Fields
     * @param OrderFields Sort Fields
     */
    public void setOrderFields(OrderFieldOptional [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeApproveListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApproveListRequest(DescribeApproveListRequest source) {
        if (source.ApproveClassification != null) {
            this.ApproveClassification = new String(source.ApproveClassification);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Filters != null) {
            this.Filters = new FilterOptional[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterOptional(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderFieldOptional[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderFieldOptional(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproveClassification", this.ApproveClassification);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

