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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowlogsRequest extends AbstractModel {

    /**
    * Instance ID in the format of postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of 2018-06-10 17:06:38
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Metric for sorting. Valid values: `sum_calls` (total number of calls), `sum_cost_time` (total time consumed)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. desc: descending, asc: ascending
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Number of entries returned per page. Value range: 1-100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number for data return in paged query. Pagination starts from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID in the format of postgres-lnp6j617 
     * @return DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-lnp6j617
     * @param DBInstanceId Instance ID in the format of postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago 
     * @return StartTime Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     * @param StartTime Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of 2018-06-10 17:06:38 
     * @return EndTime Query end time in the format of 2018-06-10 17:06:38
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of 2018-06-10 17:06:38
     * @param EndTime Query end time in the format of 2018-06-10 17:06:38
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Metric for sorting. Valid values: `sum_calls` (total number of calls), `sum_cost_time` (total time consumed) 
     * @return OrderBy Metric for sorting. Valid values: `sum_calls` (total number of calls), `sum_cost_time` (total time consumed)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Metric for sorting. Valid values: `sum_calls` (total number of calls), `sum_cost_time` (total time consumed)
     * @param OrderBy Metric for sorting. Valid values: `sum_calls` (total number of calls), `sum_cost_time` (total time consumed)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. desc: descending, asc: ascending 
     * @return OrderByType Sorting order. desc: descending, asc: ascending
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. desc: descending, asc: ascending
     * @param OrderByType Sorting order. desc: descending, asc: ascending
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Number of entries returned per page. Value range: 1-100. Default value: 20. 
     * @return Limit Number of entries returned per page. Value range: 1-100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page. Value range: 1-100. Default value: 20.
     * @param Limit Number of entries returned per page. Value range: 1-100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number for data return in paged query. Pagination starts from 0 
     * @return Offset Page number for data return in paged query. Pagination starts from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number for data return in paged query. Pagination starts from 0
     * @param Offset Page number for data return in paged query. Pagination starts from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDBSlowlogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSlowlogsRequest(DescribeDBSlowlogsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

