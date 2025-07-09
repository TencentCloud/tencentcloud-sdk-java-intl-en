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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefenceEventRequest extends AbstractModel {

    /**
    * Filtering criteria: Keywords for IP or host name; VulKeywords vulnerability name or CveId for fuzzy query; Quuid, VulId, EventType, Status for precise match; CreateBeginTime, CreateEndTime for time period query
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Data offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Data limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method, case insensitive: ASC for ascending order; DESC for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort columns, which are strictly equal: CreateTime for creation time, MergeTime for merge time, and Count for event count
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria: Keywords for IP or host name; VulKeywords vulnerability name or CveId for fuzzy query; Quuid, VulId, EventType, Status for precise match; CreateBeginTime, CreateEndTime for time period query 
     * @return Filters Filtering criteria: Keywords for IP or host name; VulKeywords vulnerability name or CveId for fuzzy query; Quuid, VulId, EventType, Status for precise match; CreateBeginTime, CreateEndTime for time period query
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria: Keywords for IP or host name; VulKeywords vulnerability name or CveId for fuzzy query; Quuid, VulId, EventType, Status for precise match; CreateBeginTime, CreateEndTime for time period query
     * @param Filters Filtering criteria: Keywords for IP or host name; VulKeywords vulnerability name or CveId for fuzzy query; Quuid, VulId, EventType, Status for precise match; CreateBeginTime, CreateEndTime for time period query
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Data limit 
     * @return Limit Data limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Data limit
     * @param Limit Data limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting method, case insensitive: ASC for ascending order; DESC for descending order 
     * @return Order Sorting method, case insensitive: ASC for ascending order; DESC for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method, case insensitive: ASC for ascending order; DESC for descending order
     * @param Order Sorting method, case insensitive: ASC for ascending order; DESC for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort columns, which are strictly equal: CreateTime for creation time, MergeTime for merge time, and Count for event count 
     * @return By Sort columns, which are strictly equal: CreateTime for creation time, MergeTime for merge time, and Count for event count
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort columns, which are strictly equal: CreateTime for creation time, MergeTime for merge time, and Count for event count
     * @param By Sort columns, which are strictly equal: CreateTime for creation time, MergeTime for merge time, and Count for event count
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulDefenceEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceEventRequest(DescribeVulDefenceEventRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

