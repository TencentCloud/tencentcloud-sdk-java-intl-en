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
    * Instance ID	
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * u200cu200cu200cQuery start time in the format of 2018-01-01 00:00:00. The log is retained for seven days by default, so the start time must fall within the retention period.	
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * u200cu200cu200cu200cQuery end time in the format of 2018-01-01 00:00:00	
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
    * Keywords used for search
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * Number of results returned per page. Value range: 1-100. Default value: `50`.	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset, which starts from 0. Default value: `0`.	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID	 
     * @return DBInstanceId Instance ID	
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID	
     * @param DBInstanceId Instance ID	
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get u200cu200cu200cQuery start time in the format of 2018-01-01 00:00:00. The log is retained for seven days by default, so the start time must fall within the retention period.	 
     * @return StartTime u200cu200cu200cQuery start time in the format of 2018-01-01 00:00:00. The log is retained for seven days by default, so the start time must fall within the retention period.	
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set u200cu200cu200cQuery start time in the format of 2018-01-01 00:00:00. The log is retained for seven days by default, so the start time must fall within the retention period.	
     * @param StartTime u200cu200cu200cQuery start time in the format of 2018-01-01 00:00:00. The log is retained for seven days by default, so the start time must fall within the retention period.	
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get u200cu200cu200cu200cQuery end time in the format of 2018-01-01 00:00:00	 
     * @return EndTime u200cu200cu200cu200cQuery end time in the format of 2018-01-01 00:00:00	
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set u200cu200cu200cu200cQuery end time in the format of 2018-01-01 00:00:00	
     * @param EndTime u200cu200cu200cu200cQuery end time in the format of 2018-01-01 00:00:00	
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
     * Get Keywords used for search 
     * @return SearchKeys Keywords used for search
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set Keywords used for search
     * @param SearchKeys Keywords used for search
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get Number of results returned per page. Value range: 1-100. Default value: `50`.	 
     * @return Limit Number of results returned per page. Value range: 1-100. Default value: `50`.	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned per page. Value range: 1-100. Default value: `50`.	
     * @param Limit Number of results returned per page. Value range: 1-100. Default value: `50`.	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset, which starts from 0. Default value: `0`.	 
     * @return Offset Data offset, which starts from 0. Default value: `0`.	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset, which starts from 0. Default value: `0`.	
     * @param Offset Data offset, which starts from 0. Default value: `0`.	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

