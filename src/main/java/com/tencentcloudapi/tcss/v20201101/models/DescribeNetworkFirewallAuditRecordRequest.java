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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkFirewallAuditRecordRequest extends AbstractModel {

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of records per query
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name - Action
Name. Valid values: `publish`, `unpublish`, `confirm`, `add`, `update`, `delete`.
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order. Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of records per query 
     * @return Limit Maximum number of records per query
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of records per query
     * @param Limit Maximum number of records per query
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name - Action
Name. Valid values: `publish`, `unpublish`, `confirm`, `add`, `update`, `delete`. 
     * @return Filters Name - Action
Name. Valid values: `publish`, `unpublish`, `confirm`, `add`, `update`, `delete`.
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Name - Action
Name. Valid values: `publish`, `unpublish`, `confirm`, `add`, `update`, `delete`.
     * @param Filters Name - Action
Name. Valid values: `publish`, `unpublish`, `confirm`, `add`, `update`, `delete`.
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting order. Valid values: `asc`, `desc`. 
     * @return Order Sorting order. Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: `asc`, `desc`.
     * @param Order Sorting order. Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeNetworkFirewallAuditRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkFirewallAuditRecordRequest(DescribeNetworkFirewallAuditRecordRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

