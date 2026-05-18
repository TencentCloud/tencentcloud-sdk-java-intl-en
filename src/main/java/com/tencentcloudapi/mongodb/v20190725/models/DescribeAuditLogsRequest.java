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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * Instance ID, in the format of cmgo-xftsghuy. It is the same as the instance ID displayed on the TencentDB console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time, format: "2017-07-12 10:29:20".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, format: "2017-07-12 10:29:20".
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter conditions. You can filter logs based on these conditions.
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
    * Pagination parameter indicates the number of returned data entries. Default value is 100. Maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting method of the audit log.
<ul><li>ASC: ascending.</li><li>DESC: descending order.</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field of the audit log, including:
<ul><li>timestamp: Timestamp.</li>
<li>affectRows: Number of affected rows.</li>
<li>execTime: Execution time.</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get Instance ID, in the format of cmgo-xftsghuy. It is the same as the instance ID displayed on the TencentDB console page. 
     * @return InstanceId Instance ID, in the format of cmgo-xftsghuy. It is the same as the instance ID displayed on the TencentDB console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of cmgo-xftsghuy. It is the same as the instance ID displayed on the TencentDB console page.
     * @param InstanceId Instance ID, in the format of cmgo-xftsghuy. It is the same as the instance ID displayed on the TencentDB console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time, format: "2017-07-12 10:29:20". 
     * @return StartTime Start time, format: "2017-07-12 10:29:20".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, format: "2017-07-12 10:29:20".
     * @param StartTime Start time, format: "2017-07-12 10:29:20".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, format: "2017-07-12 10:29:20". 
     * @return EndTime End time, format: "2017-07-12 10:29:20".
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, format: "2017-07-12 10:29:20".
     * @param EndTime End time, format: "2017-07-12 10:29:20".
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter conditions. You can filter logs based on these conditions. 
     * @return Filter Filter conditions. You can filter logs based on these conditions.
     */
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter conditions. You can filter logs based on these conditions.
     * @param Filter Filter conditions. You can filter logs based on these conditions.
     */
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Pagination parameter indicates the number of returned data entries. Default value is 100. Maximum value is 100. 
     * @return Limit Pagination parameter indicates the number of returned data entries. Default value is 100. Maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter indicates the number of returned data entries. Default value is 100. Maximum value is 100.
     * @param Limit Pagination parameter indicates the number of returned data entries. Default value is 100. Maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting method of the audit log.
<ul><li>ASC: ascending.</li><li>DESC: descending order.</li></ul> 
     * @return Order Sorting method of the audit log.
<ul><li>ASC: ascending.</li><li>DESC: descending order.</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method of the audit log.
<ul><li>ASC: ascending.</li><li>DESC: descending order.</li></ul>
     * @param Order Sorting method of the audit log.
<ul><li>ASC: ascending.</li><li>DESC: descending order.</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field of the audit log, including:
<ul><li>timestamp: Timestamp.</li>
<li>affectRows: Number of affected rows.</li>
<li>execTime: Execution time.</li></ul> 
     * @return OrderBy Sorting field of the audit log, including:
<ul><li>timestamp: Timestamp.</li>
<li>affectRows: Number of affected rows.</li>
<li>execTime: Execution time.</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field of the audit log, including:
<ul><li>timestamp: Timestamp.</li>
<li>affectRows: Number of affected rows.</li>
<li>execTime: Execution time.</li></ul>
     * @param OrderBy Sorting field of the audit log, including:
<ul><li>timestamp: Timestamp.</li>
<li>affectRows: Number of affected rows.</li>
<li>execTime: Execution time.</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
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
        if (source.Filter != null) {
            this.Filter = new AuditLogFilter(source.Filter);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

