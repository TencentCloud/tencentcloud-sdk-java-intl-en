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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersRequest extends AbstractModel {

    /**
    * Current page number.		
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query parameter: Filtering and querying by instance ID (cluster_id) and instance name (name) are supported.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting parameter: Sorting by the creation time field (created_at) is supported. The value of Type can be set to DESC (descending order) or ASC (ascending order).
    */
    @SerializedName("Orders")
    @Expose
    private Order [] Orders;

    /**
     * Get Current page number.		 
     * @return PageNumber Current page number.		
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current page number.		
     * @param PageNumber Current page number.		
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query parameter: Filtering and querying by instance ID (cluster_id) and instance name (name) are supported. 
     * @return Filters Query parameter: Filtering and querying by instance ID (cluster_id) and instance name (name) are supported.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query parameter: Filtering and querying by instance ID (cluster_id) and instance name (name) are supported.
     * @param Filters Query parameter: Filtering and querying by instance ID (cluster_id) and instance name (name) are supported.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting parameter: Sorting by the creation time field (created_at) is supported. The value of Type can be set to DESC (descending order) or ASC (ascending order). 
     * @return Orders Sorting parameter: Sorting by the creation time field (created_at) is supported. The value of Type can be set to DESC (descending order) or ASC (ascending order).
     */
    public Order [] getOrders() {
        return this.Orders;
    }

    /**
     * Set Sorting parameter: Sorting by the creation time field (created_at) is supported. The value of Type can be set to DESC (descending order) or ASC (ascending order).
     * @param Orders Sorting parameter: Sorting by the creation time field (created_at) is supported. The value of Type can be set to DESC (descending order) or ASC (ascending order).
     */
    public void setOrders(Order [] Orders) {
        this.Orders = Orders;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Orders != null) {
            this.Orders = new Order[source.Orders.length];
            for (int i = 0; i < source.Orders.length; i++) {
                this.Orders[i] = new Order(source.Orders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Orders.", this.Orders);

    }
}

