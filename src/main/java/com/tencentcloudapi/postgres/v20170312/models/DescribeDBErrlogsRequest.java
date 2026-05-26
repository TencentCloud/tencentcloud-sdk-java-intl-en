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

public class DescribeDBErrlogsRequest extends AbstractModel {

    /**
    * <p>Instance ID. It can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Query start time, such as 2018-01-01 00:00:00. Log retention time defaults to 7 days. Start time cannot exceed the retention period.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Query end time, in the format of 2018-01-01 00:00:00.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Database name</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>Search keywords.</p>
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * <p>Number of results returned per page, with a value range of 1-100. The default value is `50`.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Data offset, which starts from 0. The default value is 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Log filter criteria. Format is [{Type: "ApplicationName", Compare: "INC", Value: ["123"]}].</p>
    */
    @SerializedName("LogFilters")
    @Expose
    private LogFilter [] LogFilters;

    /**
     * Get <p>Instance ID. It can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p> 
     * @return DBInstanceId <p>Instance ID. It can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>Instance ID. It can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     * @param DBInstanceId <p>Instance ID. It can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Query start time, such as 2018-01-01 00:00:00. Log retention time defaults to 7 days. Start time cannot exceed the retention period.</p> 
     * @return StartTime <p>Query start time, such as 2018-01-01 00:00:00. Log retention time defaults to 7 days. Start time cannot exceed the retention period.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Query start time, such as 2018-01-01 00:00:00. Log retention time defaults to 7 days. Start time cannot exceed the retention period.</p>
     * @param StartTime <p>Query start time, such as 2018-01-01 00:00:00. Log retention time defaults to 7 days. Start time cannot exceed the retention period.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Query end time, in the format of 2018-01-01 00:00:00.</p> 
     * @return EndTime <p>Query end time, in the format of 2018-01-01 00:00:00.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Query end time, in the format of 2018-01-01 00:00:00.</p>
     * @param EndTime <p>Query end time, in the format of 2018-01-01 00:00:00.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Database name</p> 
     * @return DatabaseName <p>Database name</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>Database name</p>
     * @param DatabaseName <p>Database name</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>Search keywords.</p> 
     * @return SearchKeys <p>Search keywords.</p>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>Search keywords.</p>
     * @param SearchKeys <p>Search keywords.</p>
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get <p>Number of results returned per page, with a value range of 1-100. The default value is `50`.</p> 
     * @return Limit <p>Number of results returned per page, with a value range of 1-100. The default value is `50`.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results returned per page, with a value range of 1-100. The default value is `50`.</p>
     * @param Limit <p>Number of results returned per page, with a value range of 1-100. The default value is `50`.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Data offset, which starts from 0. The default value is 0.</p> 
     * @return Offset <p>Data offset, which starts from 0. The default value is 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Data offset, which starts from 0. The default value is 0.</p>
     * @param Offset <p>Data offset, which starts from 0. The default value is 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Log filter criteria. Format is [{Type: "ApplicationName", Compare: "INC", Value: ["123"]}].</p> 
     * @return LogFilters <p>Log filter criteria. Format is [{Type: "ApplicationName", Compare: "INC", Value: ["123"]}].</p>
     */
    public LogFilter [] getLogFilters() {
        return this.LogFilters;
    }

    /**
     * Set <p>Log filter criteria. Format is [{Type: "ApplicationName", Compare: "INC", Value: ["123"]}].</p>
     * @param LogFilters <p>Log filter criteria. Format is [{Type: "ApplicationName", Compare: "INC", Value: ["123"]}].</p>
     */
    public void setLogFilters(LogFilter [] LogFilters) {
        this.LogFilters = LogFilters;
    }

    public DescribeDBErrlogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBErrlogsRequest(DescribeDBErrlogsRequest source) {
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
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LogFilters != null) {
            this.LogFilters = new LogFilter[source.LogFilters.length];
            for (int i = 0; i < source.LogFilters.length; i++) {
                this.LogFilters[i] = new LogFilter(source.LogFilters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "LogFilters.", this.LogFilters);

    }
}

