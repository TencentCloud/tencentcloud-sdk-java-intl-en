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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupsSTDRequest extends AbstractModel {

    /**
    * Cluster name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Description key-value pair filter, which is used for conditional filtering queries.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Description order, which is used for sorting.
    */
    @SerializedName("OrderFields")
    @Expose
    private Order OrderFields;

    /**
    * Number of returns.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Cluster name. 
     * @return InstanceId Cluster name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster name.
     * @param InstanceId Cluster name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Description key-value pair filter, which is used for conditional filtering queries. 
     * @return Filters Description key-value pair filter, which is used for conditional filtering queries.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Description key-value pair filter, which is used for conditional filtering queries.
     * @param Filters Description key-value pair filter, which is used for conditional filtering queries.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Description order, which is used for sorting. 
     * @return OrderFields Description order, which is used for sorting.
     */
    public Order getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Description order, which is used for sorting.
     * @param OrderFields Description order, which is used for sorting.
     */
    public void setOrderFields(Order OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Number of returns. 
     * @return Limit Number of returns.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns.
     * @param Limit Number of returns.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter. 
     * @return Offset Pagination parameter.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter.
     * @param Offset Pagination parameter.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeGroupsSTDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupsSTDRequest(DescribeGroupsSTDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new Order(source.OrderFields);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

