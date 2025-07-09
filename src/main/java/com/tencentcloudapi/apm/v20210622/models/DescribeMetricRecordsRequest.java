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

public class DescribeMetricRecordsRequest extends AbstractModel {

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
    * Filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Or filter criteria.
    */
    @SerializedName("OrFilters")
    @Expose
    private Filter [] OrFilters;

    /**
    * Aggregation dimension.
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * Sort
.
The currently supported keys are:.

-StartTime (start time).
-EndTime (end time).
-Duration (response time).

The currently supported values are:.

- desc: sort in descending order.
-Asc - ascending order.
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * The service name of the business itself. console users should fill in taw.
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * Special handling of query results.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Size per page, defaults to 1,000, valid value range is 0 – 1,000.
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
    * Page number.
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * Page length.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get Or filter criteria. 
     * @return OrFilters Or filter criteria.
     */
    public Filter [] getOrFilters() {
        return this.OrFilters;
    }

    /**
     * Set Or filter criteria.
     * @param OrFilters Or filter criteria.
     */
    public void setOrFilters(Filter [] OrFilters) {
        this.OrFilters = OrFilters;
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
     * Get Sort
.
The currently supported keys are:.

-StartTime (start time).
-EndTime (end time).
-Duration (response time).

The currently supported values are:.

- desc: sort in descending order.
-Asc - ascending order. 
     * @return OrderBy Sort
.
The currently supported keys are:.

-StartTime (start time).
-EndTime (end time).
-Duration (response time).

The currently supported values are:.

- desc: sort in descending order.
-Asc - ascending order.
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort
.
The currently supported keys are:.

-StartTime (start time).
-EndTime (end time).
-Duration (response time).

The currently supported values are:.

- desc: sort in descending order.
-Asc - ascending order.
     * @param OrderBy Sort
.
The currently supported keys are:.

-StartTime (start time).
-EndTime (end time).
-Duration (response time).

The currently supported values are:.

- desc: sort in descending order.
-Asc - ascending order.
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get The service name of the business itself. console users should fill in taw. 
     * @return BusinessName The service name of the business itself. console users should fill in taw.
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set The service name of the business itself. console users should fill in taw.
     * @param BusinessName The service name of the business itself. console users should fill in taw.
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get Special handling of query results. 
     * @return Type Special handling of query results.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Special handling of query results.
     * @param Type Special handling of query results.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Size per page, defaults to 1,000, valid value range is 0 – 1,000. 
     * @return Limit Size per page, defaults to 1,000, valid value range is 0 – 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Size per page, defaults to 1,000, valid value range is 0 – 1,000.
     * @param Limit Size per page, defaults to 1,000, valid value range is 0 – 1,000.
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

    /**
     * Get Page number. 
     * @return PageIndex Page number.
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set Page number.
     * @param PageIndex Page number.
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get Page length. 
     * @return PageSize Page length.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page length.
     * @param PageSize Page length.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeMetricRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricRecordsRequest(DescribeMetricRecordsRequest source) {
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrFilters != null) {
            this.OrFilters = new Filter[source.OrFilters.length];
            for (int i = 0; i < source.OrFilters.length; i++) {
                this.OrFilters[i] = new Filter(source.OrFilters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrFilters.", this.OrFilters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

