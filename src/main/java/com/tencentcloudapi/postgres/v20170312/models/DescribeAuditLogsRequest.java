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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Query limit</p><p>Value range: [1, 100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Product name</p><p>Parameter format: postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Offset</p><p>Value range: [0, 10000]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting method</p><p>Input parameter limitation: Timestamp,AffectRows,ExecTime</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field</p><p>Input limit: ASC, DESC</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Filter criteria</p>
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p> 
     * @return StartTime <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     * @param StartTime <p>Start time</p><p>Parameter format: 2026-03-25 00:00:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p> 
     * @return EndTime <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     * @param EndTime <p>End time</p><p>Parameter format: 2026-03-25 01:00:00</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Query limit</p><p>Value range: [1, 100]</p> 
     * @return Limit <p>Query limit</p><p>Value range: [1, 100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Query limit</p><p>Value range: [1, 100]</p>
     * @param Limit <p>Query limit</p><p>Value range: [1, 100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Product name</p><p>Parameter format: postgres</p> 
     * @return Product <p>Product name</p><p>Parameter format: postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Product name</p><p>Parameter format: postgres</p>
     * @param Product <p>Product name</p><p>Parameter format: postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Offset</p><p>Value range: [0, 10000]</p> 
     * @return Offset <p>Offset</p><p>Value range: [0, 10000]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset</p><p>Value range: [0, 10000]</p>
     * @param Offset <p>Offset</p><p>Value range: [0, 10000]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting method</p><p>Input parameter limitation: Timestamp,AffectRows,ExecTime</p> 
     * @return Order <p>Sorting method</p><p>Input parameter limitation: Timestamp,AffectRows,ExecTime</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method</p><p>Input parameter limitation: Timestamp,AffectRows,ExecTime</p>
     * @param Order <p>Sorting method</p><p>Input parameter limitation: Timestamp,AffectRows,ExecTime</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field</p><p>Input limit: ASC, DESC</p> 
     * @return OrderBy <p>Sorting field</p><p>Input limit: ASC, DESC</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field</p><p>Input limit: ASC, DESC</p>
     * @param OrderBy <p>Sorting field</p><p>Input limit: ASC, DESC</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Filter criteria</p> 
     * @return Filter <p>Filter criteria</p>
     */
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Filter criteria</p>
     * @param Filter <p>Filter criteria</p>
     */
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
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
        if (source.Product != null) {
            this.Product = new String(source.Product);
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
        if (source.Filter != null) {
            this.Filter = new AuditLogFilter(source.Filter);
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
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

