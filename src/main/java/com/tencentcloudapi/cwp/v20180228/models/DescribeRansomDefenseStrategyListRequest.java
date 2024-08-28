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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseStrategyListRequest extends AbstractModel {

    /**
    * Pagination parameter (maximum quantity: 100)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filtering criteria
<li>Ips - String - required: no - IP addresses for querying </li>
<li>MachineNames - String - required: no - instance names for querying </li>
<li>Names - String - required: no - anti-ransomware policy names for querying </li>
<li>Dirs - String - required: no - bait directory </li>
<li>Status - String - required: no - policy status: 0: disabled; 1: enabled </li>
<li>BackupType - String - required: no - backup mode: 0: weekly; 1: daily </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting order: ASC and DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting fields, supporting CreateTime and MachineCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Pagination parameter (maximum quantity: 100) 
     * @return Limit Pagination parameter (maximum quantity: 100)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter (maximum quantity: 100)
     * @param Limit Pagination parameter (maximum quantity: 100)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filtering criteria
<li>Ips - String - required: no - IP addresses for querying </li>
<li>MachineNames - String - required: no - instance names for querying </li>
<li>Names - String - required: no - anti-ransomware policy names for querying </li>
<li>Dirs - String - required: no - bait directory </li>
<li>Status - String - required: no - policy status: 0: disabled; 1: enabled </li>
<li>BackupType - String - required: no - backup mode: 0: weekly; 1: daily </li> 
     * @return Filters Filtering criteria
<li>Ips - String - required: no - IP addresses for querying </li>
<li>MachineNames - String - required: no - instance names for querying </li>
<li>Names - String - required: no - anti-ransomware policy names for querying </li>
<li>Dirs - String - required: no - bait directory </li>
<li>Status - String - required: no - policy status: 0: disabled; 1: enabled </li>
<li>BackupType - String - required: no - backup mode: 0: weekly; 1: daily </li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>Ips - String - required: no - IP addresses for querying </li>
<li>MachineNames - String - required: no - instance names for querying </li>
<li>Names - String - required: no - anti-ransomware policy names for querying </li>
<li>Dirs - String - required: no - bait directory </li>
<li>Status - String - required: no - policy status: 0: disabled; 1: enabled </li>
<li>BackupType - String - required: no - backup mode: 0: weekly; 1: daily </li>
     * @param Filters Filtering criteria
<li>Ips - String - required: no - IP addresses for querying </li>
<li>MachineNames - String - required: no - instance names for querying </li>
<li>Names - String - required: no - anti-ransomware policy names for querying </li>
<li>Dirs - String - required: no - bait directory </li>
<li>Status - String - required: no - policy status: 0: disabled; 1: enabled </li>
<li>BackupType - String - required: no - backup mode: 0: weekly; 1: daily </li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting order: ASC and DESC 
     * @return Order Sorting order: ASC and DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: ASC and DESC
     * @param Order Sorting order: ASC and DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting fields, supporting CreateTime and MachineCount 
     * @return By Sorting fields, supporting CreateTime and MachineCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting fields, supporting CreateTime and MachineCount
     * @param By Sorting fields, supporting CreateTime and MachineCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRansomDefenseStrategyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseStrategyListRequest(DescribeRansomDefenseStrategyListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

