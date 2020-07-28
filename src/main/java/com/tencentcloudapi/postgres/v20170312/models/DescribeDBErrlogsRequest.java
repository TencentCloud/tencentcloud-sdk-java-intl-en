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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBErrlogsRequest extends AbstractModel{

    /**
    * Instance ID in the format of postgres-5bq3wfjd
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Query start time in the format of 2018-01-01 00:00:00, which cannot be more than 7 days ago
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of 2018-01-01 00:00:00
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
    * Search keyword
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * Number of entries returned per page. Value range: 1-100
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
     * Get Instance ID in the format of postgres-5bq3wfjd 
     * @return DBInstanceId Instance ID in the format of postgres-5bq3wfjd
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-5bq3wfjd
     * @param DBInstanceId Instance ID in the format of postgres-5bq3wfjd
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Query start time in the format of 2018-01-01 00:00:00, which cannot be more than 7 days ago 
     * @return StartTime Query start time in the format of 2018-01-01 00:00:00, which cannot be more than 7 days ago
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of 2018-01-01 00:00:00, which cannot be more than 7 days ago
     * @param StartTime Query start time in the format of 2018-01-01 00:00:00, which cannot be more than 7 days ago
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of 2018-01-01 00:00:00 
     * @return EndTime Query end time in the format of 2018-01-01 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of 2018-01-01 00:00:00
     * @param EndTime Query end time in the format of 2018-01-01 00:00:00
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
     * Get Search keyword 
     * @return SearchKeys Search keyword
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set Search keyword
     * @param SearchKeys Search keyword
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get Number of entries returned per page. Value range: 1-100 
     * @return Limit Number of entries returned per page. Value range: 1-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page. Value range: 1-100
     * @param Limit Number of entries returned per page. Value range: 1-100
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

