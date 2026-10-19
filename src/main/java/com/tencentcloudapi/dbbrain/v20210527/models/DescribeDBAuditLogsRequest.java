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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBAuditLogsRequest extends AbstractModel {

    /**
    * <p>Service product type. Currently, Cloud API only supports: dcdb, mariadb (cdb and cynosdb have been migrated to the central platform).</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Start time, format yyyy-MM-dd HH:mm:ss.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time, format: yyyy-MM-dd HH:mm:ss.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Instance ID, required. In dcdb and mariadb scenarios, query audit logs by instance dimension.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log type: Proxy log, DB database log, All.</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Sorting field. Default: Timestamp.</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>Sorting method: ASC for ascending order, DESC for descending order. Default: DESC.</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results. Default: 20. Maximum: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>SQL start time (millisecond-level timestamp), used when performing a join query by QueryId.</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>A collection of query filter criteria for audit logs.</p>
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogQueryFilter Filter;

    /**
    * <p>Cluster ID. Query audit logs for the dcdb product at the cluster level</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>Service product type. Currently, Cloud API only supports: dcdb, mariadb (cdb and cynosdb have been migrated to the central platform).</p> 
     * @return Product <p>Service product type. Currently, Cloud API only supports: dcdb, mariadb (cdb and cynosdb have been migrated to the central platform).</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>Service product type. Currently, Cloud API only supports: dcdb, mariadb (cdb and cynosdb have been migrated to the central platform).</p>
     * @param Product <p>Service product type. Currently, Cloud API only supports: dcdb, mariadb (cdb and cynosdb have been migrated to the central platform).</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Start time, format yyyy-MM-dd HH:mm:ss.</p> 
     * @return StartTime <p>Start time, format yyyy-MM-dd HH:mm:ss.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time, format yyyy-MM-dd HH:mm:ss.</p>
     * @param StartTime <p>Start time, format yyyy-MM-dd HH:mm:ss.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time, format: yyyy-MM-dd HH:mm:ss.</p> 
     * @return EndTime <p>End time, format: yyyy-MM-dd HH:mm:ss.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time, format: yyyy-MM-dd HH:mm:ss.</p>
     * @param EndTime <p>End time, format: yyyy-MM-dd HH:mm:ss.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Instance ID, required. In dcdb and mariadb scenarios, query audit logs by instance dimension.</p> 
     * @return InstanceId <p>Instance ID, required. In dcdb and mariadb scenarios, query audit logs by instance dimension.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, required. In dcdb and mariadb scenarios, query audit logs by instance dimension.</p>
     * @param InstanceId <p>Instance ID, required. In dcdb and mariadb scenarios, query audit logs by instance dimension.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log type: Proxy log, DB database log, All.</p> 
     * @return LogType <p>Log type: Proxy log, DB database log, All.</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type: Proxy log, DB database log, All.</p>
     * @param LogType <p>Log type: Proxy log, DB database log, All.</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Sorting field. Default: Timestamp.</p> 
     * @return SortBy <p>Sorting field. Default: Timestamp.</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>Sorting field. Default: Timestamp.</p>
     * @param SortBy <p>Sorting field. Default: Timestamp.</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>Sorting method: ASC for ascending order, DESC for descending order. Default: DESC.</p> 
     * @return OrderBy <p>Sorting method: ASC for ascending order, DESC for descending order. Default: DESC.</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting method: ASC for ascending order, DESC for descending order. Default: DESC.</p>
     * @param OrderBy <p>Sorting method: ASC for ascending order, DESC for descending order. Default: DESC.</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results. Default: 20. Maximum: 100.</p> 
     * @return Limit <p>Number of returned results. Default: 20. Maximum: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. Default: 20. Maximum: 100.</p>
     * @param Limit <p>Number of returned results. Default: 20. Maximum: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>SQL start time (millisecond-level timestamp), used when performing a join query by QueryId.</p> 
     * @return SqlStartTime <p>SQL start time (millisecond-level timestamp), used when performing a join query by QueryId.</p>
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL start time (millisecond-level timestamp), used when performing a join query by QueryId.</p>
     * @param SqlStartTime <p>SQL start time (millisecond-level timestamp), used when performing a join query by QueryId.</p>
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>A collection of query filter criteria for audit logs.</p> 
     * @return Filter <p>A collection of query filter criteria for audit logs.</p>
     */
    public AuditLogQueryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>A collection of query filter criteria for audit logs.</p>
     * @param Filter <p>A collection of query filter criteria for audit logs.</p>
     */
    public void setFilter(AuditLogQueryFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Cluster ID. Query audit logs for the dcdb product at the cluster level</p> 
     * @return ClusterId <p>Cluster ID. Query audit logs for the dcdb product at the cluster level</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID. Query audit logs for the dcdb product at the cluster level</p>
     * @param ClusterId <p>Cluster ID. Query audit logs for the dcdb product at the cluster level</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DescribeDBAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAuditLogsRequest(DescribeDBAuditLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.Filter != null) {
            this.Filter = new AuditLogQueryFilter(source.Filter);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

