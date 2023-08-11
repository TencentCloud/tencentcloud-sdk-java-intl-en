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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The pagination parameter, which specifies the number of entries per page. Maximum value: 100 (default).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting order Valid values: `ASC (ascending), `DESC` (descending).
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field Valid values: 
`timestamp`: Timestamp,
`affectRows`: Number of affected rows,
`execTime`: Execution time.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filter, which can be used to filter logs.
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilters [] LogFilter;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The pagination parameter, which specifies the number of entries per page. Maximum value: 100 (default). 
     * @return Limit The pagination parameter, which specifies the number of entries per page. Maximum value: 100 (default).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The pagination parameter, which specifies the number of entries per page. Maximum value: 100 (default).
     * @param Limit The pagination parameter, which specifies the number of entries per page. Maximum value: 100 (default).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting order Valid values: `ASC (ascending), `DESC` (descending). 
     * @return Order Sorting order Valid values: `ASC (ascending), `DESC` (descending).
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order Valid values: `ASC (ascending), `DESC` (descending).
     * @param Order Sorting order Valid values: `ASC (ascending), `DESC` (descending).
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field Valid values: 
`timestamp`: Timestamp,
`affectRows`: Number of affected rows,
`execTime`: Execution time. 
     * @return OrderBy Sorting field Valid values: 
`timestamp`: Timestamp,
`affectRows`: Number of affected rows,
`execTime`: Execution time.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field Valid values: 
`timestamp`: Timestamp,
`affectRows`: Number of affected rows,
`execTime`: Execution time.
     * @param OrderBy Sorting field Valid values: 
`timestamp`: Timestamp,
`affectRows`: Number of affected rows,
`execTime`: Execution time.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filter, which can be used to filter logs. 
     * @return LogFilter Filter, which can be used to filter logs.
     */
    public InstanceAuditLogFilters [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter, which can be used to filter logs.
     * @param LogFilter Filter, which can be used to filter logs.
     */
    public void setLogFilter(InstanceAuditLogFilters [] LogFilter) {
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilters[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilters(source.LogFilter[i]);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);

    }
}

