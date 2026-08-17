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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsRequest extends AbstractModel {

    /**
    * <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Filter conditions.</p>
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
    * <p>List size of returned logs per page.</p><ul><li>Default value: 20.</li><li>Value ranges from 1 to 100.</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Starting offset amount of pagination.</p><ul><li>Default: 0.</li><li>Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Log sorting method. Default value is DESC. Values are as follows:</p><ul><li>ASC: Sort in ascending order by time with the earliest log first.</li><li>DESC: Sort in descending order with the latest log first.</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field. Specifies the field used to sort logs.</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p> 
     * @return StartTime <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     * @param StartTime <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p> 
     * @return EndTime <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     * @param EndTime <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul> 
     * @return LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     * @param LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Filter conditions.</p> 
     * @return LogFilter <p>Filter conditions.</p>
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set <p>Filter conditions.</p>
     * @param LogFilter <p>Filter conditions.</p>
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get <p>List size of returned logs per page.</p><ul><li>Default value: 20.</li><li>Value ranges from 1 to 100.</li></ul> 
     * @return Limit <p>List size of returned logs per page.</p><ul><li>Default value: 20.</li><li>Value ranges from 1 to 100.</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>List size of returned logs per page.</p><ul><li>Default value: 20.</li><li>Value ranges from 1 to 100.</li></ul>
     * @param Limit <p>List size of returned logs per page.</p><ul><li>Default value: 20.</li><li>Value ranges from 1 to 100.</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Starting offset amount of pagination.</p><ul><li>Default: 0.</li><li>Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</li></ul> 
     * @return Offset <p>Starting offset amount of pagination.</p><ul><li>Default: 0.</li><li>Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Starting offset amount of pagination.</p><ul><li>Default: 0.</li><li>Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</li></ul>
     * @param Offset <p>Starting offset amount of pagination.</p><ul><li>Default: 0.</li><li>Value: Multiple of Limit. Calculation formula: offset=limit*(page number-1).</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Log sorting method. Default value is DESC. Values are as follows:</p><ul><li>ASC: Sort in ascending order by time with the earliest log first.</li><li>DESC: Sort in descending order with the latest log first.</li></ul> 
     * @return Order <p>Log sorting method. Default value is DESC. Values are as follows:</p><ul><li>ASC: Sort in ascending order by time with the earliest log first.</li><li>DESC: Sort in descending order with the latest log first.</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Log sorting method. Default value is DESC. Values are as follows:</p><ul><li>ASC: Sort in ascending order by time with the earliest log first.</li><li>DESC: Sort in descending order with the latest log first.</li></ul>
     * @param Order <p>Log sorting method. Default value is DESC. Values are as follows:</p><ul><li>ASC: Sort in ascending order by time with the earliest log first.</li><li>DESC: Sort in descending order with the latest log first.</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field. Specifies the field used to sort logs.</p> 
     * @return OrderBy <p>Sorting field. Specifies the field used to sort logs.</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field. Specifies the field used to sort logs.</p>
     * @param OrderBy <p>Sorting field. Specifies the field used to sort logs.</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogsRequest(DescribeLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
            }
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
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

