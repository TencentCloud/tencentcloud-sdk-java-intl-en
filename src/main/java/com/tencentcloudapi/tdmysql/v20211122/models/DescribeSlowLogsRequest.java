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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogsRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Search log start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time to retrieve logs
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter criteria.
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
    * Items per page limit
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
    * Sort, selectable: ASC, DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting criteria may not be the same as selectable fields used to sort according to business.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

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
     * Get Search log start time 
     * @return StartTime Search log start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Search log start time
     * @param StartTime Search log start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time to retrieve logs 
     * @return EndTime End time to retrieve logs
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time to retrieve logs
     * @param EndTime End time to retrieve logs
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter criteria. 
     * @return LogFilter Filter criteria.
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter criteria.
     * @param LogFilter Filter criteria.
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get Items per page limit 
     * @return Limit Items per page limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Items per page limit
     * @param Limit Items per page limit
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
     * Get Sort, selectable: ASC, DESC 
     * @return Order Sort, selectable: ASC, DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort, selectable: ASC, DESC
     * @param Order Sort, selectable: ASC, DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting criteria may not be the same as selectable fields used to sort according to business. 
     * @return OrderBy Sorting criteria may not be the same as selectable fields used to sort according to business.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting criteria may not be the same as selectable fields used to sort according to business.
     * @param OrderBy Sorting criteria may not be the same as selectable fields used to sort according to business.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogsRequest(DescribeSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

