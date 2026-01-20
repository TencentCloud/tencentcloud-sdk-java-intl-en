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

public class CreateAuditLogFileRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
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
    * Sort order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "DESC".
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Field to sort by. Valid values: "timestamp" - Timestamp; "affectRows" - Number of affected rows; "execTime" - Execution time. Default value: "timestamp".
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
    * Filter conditions. You can filter logs based on these conditions.
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilters [] LogFilter;

    /**
    * Columns to include in the download.
    */
    @SerializedName("ColumnFilter")
    @Expose
    private String [] ColumnFilter;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
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
     * Get Field to sort by. Valid values: "timestamp" - Timestamp; "affectRows" - Number of affected rows; "execTime" - Execution time. Default value: "timestamp". 
     * @return OrderBy Field to sort by. Valid values: "timestamp" - Timestamp; "affectRows" - Number of affected rows; "execTime" - Execution time. Default value: "timestamp".
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Field to sort by. Valid values: "timestamp" - Timestamp; "affectRows" - Number of affected rows; "execTime" - Execution time. Default value: "timestamp".
     * @param OrderBy Field to sort by. Valid values: "timestamp" - Timestamp; "affectRows" - Number of affected rows; "execTime" - Execution time. Default value: "timestamp".
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
     * Get Filter conditions. You can filter logs based on these conditions. 
     * @return LogFilter Filter conditions. You can filter logs based on these conditions.
     */
    public InstanceAuditLogFilters [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter conditions. You can filter logs based on these conditions.
     * @param LogFilter Filter conditions. You can filter logs based on these conditions.
     */
    public void setLogFilter(InstanceAuditLogFilters [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get Columns to include in the download. 
     * @return ColumnFilter Columns to include in the download.
     */
    public String [] getColumnFilter() {
        return this.ColumnFilter;
    }

    /**
     * Set Columns to include in the download.
     * @param ColumnFilter Columns to include in the download.
     */
    public void setColumnFilter(String [] ColumnFilter) {
        this.ColumnFilter = ColumnFilter;
    }

    public CreateAuditLogFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditLogFileRequest(CreateAuditLogFileRequest source) {
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
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilters[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilters(source.LogFilter[i]);
            }
        }
        if (source.ColumnFilter != null) {
            this.ColumnFilter = new String[source.ColumnFilter.length];
            for (int i = 0; i < source.ColumnFilter.length; i++) {
                this.ColumnFilter[i] = new String(source.ColumnFilter[i]);
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
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamArraySimple(map, prefix + "ColumnFilter.", this.ColumnFilter);

    }
}

