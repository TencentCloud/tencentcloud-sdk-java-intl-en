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
    * <p>Business system ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Span query start timestamp (unit: seconds)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Span query end timestamp (unit: s)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Universal filter parameters supported filter key such as service.name</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Sort<br>Keys now supported:</p><ul><li>startTime</li><li>endTime</li><li>duration</li></ul><p>Values now supported:</p><ul><li>desc (sort in descending order)</li><li>asc (ascending order)</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * <p>Business service name. Console users please enter taw</p>
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * <p>Count of single-page projects. Defaults to 1000. Valid value range is 1–1000.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Page</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Business system ID</p> 
     * @return InstanceId <p>Business system ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Business system ID</p>
     * @param InstanceId <p>Business system ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Span query start timestamp (unit: seconds)</p> 
     * @return StartTime <p>Span query start timestamp (unit: seconds)</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Span query start timestamp (unit: seconds)</p>
     * @param StartTime <p>Span query start timestamp (unit: seconds)</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Span query end timestamp (unit: s)</p> 
     * @return EndTime <p>Span query end timestamp (unit: s)</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Span query end timestamp (unit: s)</p>
     * @param EndTime <p>Span query end timestamp (unit: s)</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Universal filter parameters supported filter key such as service.name</p> 
     * @return Filters <p>Universal filter parameters supported filter key such as service.name</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal filter parameters supported filter key such as service.name</p>
     * @param Filters <p>Universal filter parameters supported filter key such as service.name</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sort<br>Keys now supported:</p><ul><li>startTime</li><li>endTime</li><li>duration</li></ul><p>Values now supported:</p><ul><li>desc (sort in descending order)</li><li>asc (ascending order)</li></ul> 
     * @return OrderBy <p>Sort<br>Keys now supported:</p><ul><li>startTime</li><li>endTime</li><li>duration</li></ul><p>Values now supported:</p><ul><li>desc (sort in descending order)</li><li>asc (ascending order)</li></ul>
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sort<br>Keys now supported:</p><ul><li>startTime</li><li>endTime</li><li>duration</li></ul><p>Values now supported:</p><ul><li>desc (sort in descending order)</li><li>asc (ascending order)</li></ul>
     * @param OrderBy <p>Sort<br>Keys now supported:</p><ul><li>startTime</li><li>endTime</li><li>duration</li></ul><p>Values now supported:</p><ul><li>desc (sort in descending order)</li><li>asc (ascending order)</li></ul>
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Business service name. Console users please enter taw</p> 
     * @return BusinessName <p>Business service name. Console users please enter taw</p>
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set <p>Business service name. Console users please enter taw</p>
     * @param BusinessName <p>Business service name. Console users please enter taw</p>
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get <p>Count of single-page projects. Defaults to 1000. Valid value range is 1–1000.</p> 
     * @return Limit <p>Count of single-page projects. Defaults to 1000. Valid value range is 1–1000.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Count of single-page projects. Defaults to 1000. Valid value range is 1–1000.</p>
     * @param Limit <p>Count of single-page projects. Defaults to 1000. Valid value range is 1–1000.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Page</p> 
     * @return Offset <p>Page</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Page</p>
     * @param Offset <p>Page</p>
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

