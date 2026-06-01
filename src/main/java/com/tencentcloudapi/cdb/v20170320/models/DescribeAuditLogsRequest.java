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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time. We recommend that the interval between start and end time does not exceed 7 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. We recommend that the interval between start and end time does not exceed 7 days.
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
    * Log offset, supports up to 65535 log entries for offset querying. Fill in the range: 0 - 65535.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC".
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Field to sort by. Valid values:
"timestamp" - timestamp;
"affectRows" - Number of affected rows.
"execTime" - Execution time.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filter. Multiple values are in `AND` relationship.
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilters [] LogFilter;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time. We recommend that the interval between start and end time does not exceed 7 days. 
     * @return StartTime Start time. We recommend that the interval between start and end time does not exceed 7 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. We recommend that the interval between start and end time does not exceed 7 days.
     * @param StartTime Start time. We recommend that the interval between start and end time does not exceed 7 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. We recommend that the interval between start and end time does not exceed 7 days. 
     * @return EndTime End time. We recommend that the interval between start and end time does not exceed 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. We recommend that the interval between start and end time does not exceed 7 days.
     * @param EndTime End time. We recommend that the interval between start and end time does not exceed 7 days.
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
     * Get Log offset, supports up to 65535 log entries for offset querying. Fill in the range: 0 - 65535. 
     * @return Offset Log offset, supports up to 65535 log entries for offset querying. Fill in the range: 0 - 65535.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Log offset, supports up to 65535 log entries for offset querying. Fill in the range: 0 - 65535.
     * @param Offset Log offset, supports up to 65535 log entries for offset querying. Fill in the range: 0 - 65535.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC". 
     * @return Order Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC".
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC".
     * @param Order Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC".
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Field to sort by. Valid values:
"timestamp" - timestamp;
"affectRows" - Number of affected rows.
"execTime" - Execution time. 
     * @return OrderBy Field to sort by. Valid values:
"timestamp" - timestamp;
"affectRows" - Number of affected rows.
"execTime" - Execution time.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Field to sort by. Valid values:
"timestamp" - timestamp;
"affectRows" - Number of affected rows.
"execTime" - Execution time.
     * @param OrderBy Field to sort by. Valid values:
"timestamp" - timestamp;
"affectRows" - Number of affected rows.
"execTime" - Execution time.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filter. Multiple values are in `AND` relationship. 
     * @return LogFilter Filter. Multiple values are in `AND` relationship.
     */
    public InstanceAuditLogFilters [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter. Multiple values are in `AND` relationship.
     * @param LogFilter Filter. Multiple values are in `AND` relationship.
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

