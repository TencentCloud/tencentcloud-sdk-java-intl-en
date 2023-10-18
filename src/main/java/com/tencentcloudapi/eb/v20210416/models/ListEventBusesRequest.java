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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEventBusesRequest extends AbstractModel {

    /**
    * Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Filter. For more information, see the Instance Filter Table below. Each request can contain up to 10 `Filters` and 5 `Filter.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time) 
     * @return OrderBy Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     * @param OrderBy Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order) 
     * @return Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     * @param Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Filter. For more information, see the Instance Filter Table below. Each request can contain up to 10 `Filters` and 5 `Filter.Values`. 
     * @return Filters Filter. For more information, see the Instance Filter Table below. Each request can contain up to 10 `Filters` and 5 `Filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. For more information, see the Instance Filter Table below. Each request can contain up to 10 `Filters` and 5 `Filter.Values`.
     * @param Filters Filter. For more information, see the Instance Filter Table below. Each request can contain up to 10 `Filters` and 5 `Filter.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListEventBusesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEventBusesRequest(ListEventBusesRequest source) {
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

