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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsRequest extends AbstractModel{

    /**
    * Instance ID in the format of `tdsql-ow728lmc`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data entry number starting from which to return results
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query start time in the format of `2016-07-23 14:55:20`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of `2016-08-22 14:55:20`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specific name of database to be queried
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Sort by metric. Valid values: query_time_sum, query_count
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: desc, asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Whether to query slow queries of the secondary. 0: primary, 1: secondary
    */
    @SerializedName("Slave")
    @Expose
    private Long Slave;

    /**
     * Get Instance ID in the format of `tdsql-ow728lmc`. 
     * @return InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `tdsql-ow728lmc`.
     * @param InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data entry number starting from which to return results 
     * @return Offset Data entry number starting from which to return results
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data entry number starting from which to return results
     * @param Offset Data entry number starting from which to return results
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned 
     * @return Limit Number of results to be returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned
     * @param Limit Number of results to be returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query start time in the format of `2016-07-23 14:55:20` 
     * @return StartTime Query start time in the format of `2016-07-23 14:55:20`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of `2016-07-23 14:55:20`
     * @param StartTime Query start time in the format of `2016-07-23 14:55:20`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of `2016-08-22 14:55:20` 
     * @return EndTime Query end time in the format of `2016-08-22 14:55:20`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of `2016-08-22 14:55:20`
     * @param EndTime Query end time in the format of `2016-08-22 14:55:20`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specific name of database to be queried 
     * @return Db Specific name of database to be queried
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Specific name of database to be queried
     * @param Db Specific name of database to be queried
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Sort by metric. Valid values: query_time_sum, query_count 
     * @return OrderBy Sort by metric. Valid values: query_time_sum, query_count
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by metric. Valid values: query_time_sum, query_count
     * @param OrderBy Sort by metric. Valid values: query_time_sum, query_count
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: desc, asc 
     * @return OrderByType Sorting order. Valid values: desc, asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: desc, asc
     * @param OrderByType Sorting order. Valid values: desc, asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Whether to query slow queries of the secondary. 0: primary, 1: secondary 
     * @return Slave Whether to query slow queries of the secondary. 0: primary, 1: secondary
     */
    public Long getSlave() {
        return this.Slave;
    }

    /**
     * Set Whether to query slow queries of the secondary. 0: primary, 1: secondary
     * @param Slave Whether to query slow queries of the secondary. 0: primary, 1: secondary
     */
    public void setSlave(Long Slave) {
        this.Slave = Slave;
    }

    public DescribeDBSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSlowLogsRequest(DescribeDBSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Slave != null) {
            this.Slave = new Long(source.Slave);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Slave", this.Slave);

    }
}

