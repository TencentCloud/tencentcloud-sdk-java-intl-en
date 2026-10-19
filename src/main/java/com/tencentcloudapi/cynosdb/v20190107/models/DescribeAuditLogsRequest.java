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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of "2017-07-12 10:29:20".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format: "2017-07-12 10:29:20".
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sort order. Supported values: "ASC" - Ascending order, "DESC" - Descending order.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field. Supported values include:
timestamp
"affectRows" - Number of affected rows
"execTime" - Execution time.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Deprecated.
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
    * Pagination parameter. Number of data entries returned per request. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
Description: The sum of Limit and Offset must be less than or equal to 65536.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria. Multiple values have an AND relationship.
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilter [] LogFilter;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time in the format of "2017-07-12 10:29:20". 
     * @return StartTime Start time in the format of "2017-07-12 10:29:20".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of "2017-07-12 10:29:20".
     * @param StartTime Start time in the format of "2017-07-12 10:29:20".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format: "2017-07-12 10:29:20". 
     * @return EndTime End time in the format: "2017-07-12 10:29:20".
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format: "2017-07-12 10:29:20".
     * @param EndTime End time in the format: "2017-07-12 10:29:20".
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sort order. Supported values: "ASC" - Ascending order, "DESC" - Descending order. 
     * @return Order Sort order. Supported values: "ASC" - Ascending order, "DESC" - Descending order.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. Supported values: "ASC" - Ascending order, "DESC" - Descending order.
     * @param Order Sort order. Supported values: "ASC" - Ascending order, "DESC" - Descending order.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field. Supported values include:
timestamp
"affectRows" - Number of affected rows
"execTime" - Execution time. 
     * @return OrderBy Sorting field. Supported values include:
timestamp
"affectRows" - Number of affected rows
"execTime" - Execution time.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Supported values include:
timestamp
"affectRows" - Number of affected rows
"execTime" - Execution time.
     * @param OrderBy Sorting field. Supported values include:
timestamp
"affectRows" - Number of affected rows
"execTime" - Execution time.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Deprecated. 
     * @return Filter Deprecated.
     * @deprecated
     */
    @Deprecated
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Deprecated.
     * @param Filter Deprecated.
     * @deprecated
     */
    @Deprecated
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Pagination parameter. Number of data entries returned per request. Default value: 100. Maximum value: 100. 
     * @return Limit Pagination parameter. Number of data entries returned per request. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter. Number of data entries returned per request. Default value: 100. Maximum value: 100.
     * @param Limit Pagination parameter. Number of data entries returned per request. Default value: 100. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset.
Description: The sum of Limit and Offset must be less than or equal to 65536. 
     * @return Offset Pagination offset.
Description: The sum of Limit and Offset must be less than or equal to 65536.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
Description: The sum of Limit and Offset must be less than or equal to 65536.
     * @param Offset Pagination offset.
Description: The sum of Limit and Offset must be less than or equal to 65536.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria. Multiple values have an AND relationship. 
     * @return LogFilter Filter criteria. Multiple values have an AND relationship.
     */
    public InstanceAuditLogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter criteria. Multiple values have an AND relationship.
     * @param LogFilter Filter criteria. Multiple values have an AND relationship.
     */
    public void setLogFilter(InstanceAuditLogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    public DescribeAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogsRequest(DescribeAuditLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Filter != null) {
            this.Filter = new AuditLogFilter(source.Filter);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilter(source.LogFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);

    }
}

