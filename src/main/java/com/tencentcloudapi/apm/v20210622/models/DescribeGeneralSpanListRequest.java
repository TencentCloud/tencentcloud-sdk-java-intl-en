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

public class DescribeGeneralSpanListRequest extends AbstractModel {

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Span query start timestamp (unit: seconds).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Span query end timestamp (unit: seconds).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Universal filter parameters.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
    * Number of items per page, defaults to 10,000, valid values are 0 to 10,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Span query start timestamp (unit: seconds). 
     * @return StartTime Span query start timestamp (unit: seconds).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Span query start timestamp (unit: seconds).
     * @param StartTime Span query start timestamp (unit: seconds).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Span query end timestamp (unit: seconds). 
     * @return EndTime Span query end timestamp (unit: seconds).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Span query end timestamp (unit: seconds).
     * @param EndTime Span query end timestamp (unit: seconds).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Universal filter parameters. 
     * @return Filters Universal filter parameters.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Universal filter parameters.
     * @param Filters Universal filter parameters.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Number of items per page, defaults to 10,000, valid values are 0 to 10,000. 
     * @return Limit Number of items per page, defaults to 10,000, valid values are 0 to 10,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page, defaults to 10,000, valid values are 0 to 10,000.
     * @param Limit Number of items per page, defaults to 10,000, valid values are 0 to 10,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination. 
     * @return Offset Pagination.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination.
     * @param Offset Pagination.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeGeneralSpanListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralSpanListRequest(DescribeGeneralSpanListRequest source) {
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
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

