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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceOverviewRequest extends AbstractModel {

    /**
    * Metric list.
    */
    @SerializedName("Metrics")
    @Expose
    private QueryMetricItem [] Metrics;

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Aggregation dimension.
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * Start time (unit: sec).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time (unit: seconds).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Sorting method
.
Value: fill in.
-Asc: sorts query metrics in ascending order.
- desc: sort query metrics in descending order.
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * Page size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Paging starting point.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Metric list. 
     * @return Metrics Metric list.
     */
    public QueryMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric list.
     * @param Metrics Metric list.
     */
    public void setMetrics(QueryMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Business system id. 
     * @return InstanceId Business system id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system id.
     * @param InstanceId Business system id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Filter criteria. 
     * @return Filters Filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
     * @param Filters Filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Aggregation dimension. 
     * @return GroupBy Aggregation dimension.
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Aggregation dimension.
     * @param GroupBy Aggregation dimension.
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get Start time (unit: sec). 
     * @return StartTime Start time (unit: sec).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (unit: sec).
     * @param StartTime Start time (unit: sec).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (unit: seconds). 
     * @return EndTime End time (unit: seconds).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (unit: seconds).
     * @param EndTime End time (unit: seconds).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting method
.
Value: fill in.
-Asc: sorts query metrics in ascending order.
- desc: sort query metrics in descending order. 
     * @return OrderBy Sorting method
.
Value: fill in.
-Asc: sorts query metrics in ascending order.
- desc: sort query metrics in descending order.
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting method
.
Value: fill in.
-Asc: sorts query metrics in ascending order.
- desc: sort query metrics in descending order.
     * @param OrderBy Sorting method
.
Value: fill in.
-Asc: sorts query metrics in ascending order.
- desc: sort query metrics in descending order.
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Page size. 
     * @return Limit Page size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size.
     * @param Limit Page size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paging starting point. 
     * @return Offset Paging starting point.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging starting point.
     * @param Offset Paging starting point.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeServiceOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceOverviewRequest(DescribeServiceOverviewRequest source) {
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
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
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

