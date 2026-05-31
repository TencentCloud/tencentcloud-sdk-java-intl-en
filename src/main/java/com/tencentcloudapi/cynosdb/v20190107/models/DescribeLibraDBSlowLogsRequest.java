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

public class DescribeLibraDBSlowLogsRequest extends AbstractModel {

    /**
    * Read-only analysis engine instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time, 1753171200.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, 1753171200.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Log items per page limit: 0-200.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Log paginate, more than 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Log sorting method, DESC - descending order, ASC - ascending order.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Log sorting condition.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filter criteria
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
     * Get Read-only analysis engine instance ID 
     * @return InstanceId Read-only analysis engine instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Read-only analysis engine instance ID
     * @param InstanceId Read-only analysis engine instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time, 1753171200. 
     * @return StartTime Start time, 1753171200.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, 1753171200.
     * @param StartTime Start time, 1753171200.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, 1753171200. 
     * @return EndTime End time, 1753171200.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, 1753171200.
     * @param EndTime End time, 1753171200.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Log items per page limit: 0-200. 
     * @return Limit Log items per page limit: 0-200.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Log items per page limit: 0-200.
     * @param Limit Log items per page limit: 0-200.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log paginate, more than 0. 
     * @return Offset Log paginate, more than 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Log paginate, more than 0.
     * @param Offset Log paginate, more than 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Log sorting method, DESC - descending order, ASC - ascending order. 
     * @return Order Log sorting method, DESC - descending order, ASC - ascending order.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Log sorting method, DESC - descending order, ASC - ascending order.
     * @param Order Log sorting method, DESC - descending order, ASC - ascending order.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Log sorting condition. 
     * @return OrderBy Log sorting condition.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Log sorting condition.
     * @param OrderBy Log sorting condition.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filter criteria 
     * @return LogFilter Filter criteria
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set Filter criteria
     * @param LogFilter Filter criteria
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    public DescribeLibraDBSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBSlowLogsRequest(DescribeLibraDBSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
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

