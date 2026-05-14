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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmSQLInjectionDetailRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * unix second-level timestamp
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * unix second-level timestamp
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Order.
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * Query filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Aggregation dimension
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * Metric list
    */
    @SerializedName("Metrics")
    @Expose
    private QueryMetricItem [] Metrics;

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get unix second-level timestamp 
     * @return StartTime unix second-level timestamp
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set unix second-level timestamp
     * @param StartTime unix second-level timestamp
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get unix second-level timestamp 
     * @return EndTime unix second-level timestamp
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set unix second-level timestamp
     * @param EndTime unix second-level timestamp
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Order. 
     * @return OrderBy Order.
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Order.
     * @param OrderBy Order.
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Query filter criteria. 
     * @return Filters Query filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter criteria.
     * @param Filters Query filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Aggregation dimension 
     * @return GroupBy Aggregation dimension
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Aggregation dimension
     * @param GroupBy Aggregation dimension
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get Metric list 
     * @return Metrics Metric list
     */
    public QueryMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric list
     * @param Metrics Metric list
     */
    public void setMetrics(QueryMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    public DescribeApmSQLInjectionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmSQLInjectionDetailRequest(DescribeApmSQLInjectionDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);

    }
}

