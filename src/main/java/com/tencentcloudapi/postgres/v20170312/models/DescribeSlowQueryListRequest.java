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

public class DescribeSlowQueryListRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Start timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". The log is retained for seven days by default, so the start timestamp must fall within the retention period.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss".
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter by database name. This parameter is optional.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Sorting order. Valid values: `asc` (ascending), `desc` (descending). Default value: `desc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Sort by field. Valid values: `SessionStartTime` (default), `Duration`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Number of entries per page. Value range: [1,100]. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. Value range: [0,INF). Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID. 
     * @return DBInstanceId Instance ID.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID.
     * @param DBInstanceId Instance ID.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Start timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". The log is retained for seven days by default, so the start timestamp must fall within the retention period. 
     * @return StartTime Start timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". The log is retained for seven days by default, so the start timestamp must fall within the retention period.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". The log is retained for seven days by default, so the start timestamp must fall within the retention period.
     * @param StartTime Start timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". The log is retained for seven days by default, so the start timestamp must fall within the retention period.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss". 
     * @return EndTime End timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss".
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss".
     * @param EndTime End timestamp of the query range in the format of "YYYY-MM-DD HH:mm:ss".
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter by database name. This parameter is optional. 
     * @return DatabaseName Filter by database name. This parameter is optional.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Filter by database name. This parameter is optional.
     * @param DatabaseName Filter by database name. This parameter is optional.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Sorting order. Valid values: `asc` (ascending), `desc` (descending). Default value: `desc`. 
     * @return OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending). Default value: `desc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: `asc` (ascending), `desc` (descending). Default value: `desc`.
     * @param OrderByType Sorting order. Valid values: `asc` (ascending), `desc` (descending). Default value: `desc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Sort by field. Valid values: `SessionStartTime` (default), `Duration`. 
     * @return OrderBy Sort by field. Valid values: `SessionStartTime` (default), `Duration`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field. Valid values: `SessionStartTime` (default), `Duration`.
     * @param OrderBy Sort by field. Valid values: `SessionStartTime` (default), `Duration`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Number of entries per page. Value range: [1,100]. Default value: `20`. 
     * @return Limit Number of entries per page. Value range: [1,100]. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Value range: [1,100]. Default value: `20`.
     * @param Limit Number of entries per page. Value range: [1,100]. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. Value range: [0,INF). Default value: `0`. 
     * @return Offset Pagination offset. Value range: [0,INF). Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Value range: [0,INF). Default value: `0`.
     * @param Offset Pagination offset. Value range: [0,INF). Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSlowQueryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryListRequest(DescribeSlowQueryListRequest source) {
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
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
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
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

