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

public class DescribeDataSourceListRequest extends AbstractModel {

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of returns
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting Configuration
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Optional Filter Criteria, Filter optional configurations (reference): "Name": { "type": "string", "description": "Data Source Name" }, "Type": { "type": "string", "description": "Type" }, "ClusterId": { "type": "string", "description": "Cluster ID" }, "CategoryId": { "type": "string", "description": "Classification, Project or Space ID" }
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of returns 
     * @return PageSize Number of returns
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of returns
     * @param PageSize Number of returns
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting Configuration 
     * @return OrderFields Sorting Configuration
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting Configuration
     * @param OrderFields Sorting Configuration
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Optional Filter Criteria, Filter optional configurations (reference): "Name": { "type": "string", "description": "Data Source Name" }, "Type": { "type": "string", "description": "Type" }, "ClusterId": { "type": "string", "description": "Cluster ID" }, "CategoryId": { "type": "string", "description": "Classification, Project or Space ID" } 
     * @return Filters Optional Filter Criteria, Filter optional configurations (reference): "Name": { "type": "string", "description": "Data Source Name" }, "Type": { "type": "string", "description": "Type" }, "ClusterId": { "type": "string", "description": "Cluster ID" }, "CategoryId": { "type": "string", "description": "Classification, Project or Space ID" }
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Optional Filter Criteria, Filter optional configurations (reference): "Name": { "type": "string", "description": "Data Source Name" }, "Type": { "type": "string", "description": "Type" }, "ClusterId": { "type": "string", "description": "Cluster ID" }, "CategoryId": { "type": "string", "description": "Classification, Project or Space ID" }
     * @param Filters Optional Filter Criteria, Filter optional configurations (reference): "Name": { "type": "string", "description": "Data Source Name" }, "Type": { "type": "string", "description": "Type" }, "ClusterId": { "type": "string", "description": "Cluster ID" }, "CategoryId": { "type": "string", "description": "Classification, Project or Space ID" }
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDataSourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataSourceListRequest(DescribeDataSourceListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

