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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowQueryRecordsRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Slow log time
    */
    @SerializedName("QueryDurationMs")
    @Expose
    private Long QueryDurationMs;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Paging
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Paging
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Sort parameters
    */
    @SerializedName("DurationMs")
    @Expose
    private String DurationMs;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String [] DbName;

    /**
    * Whether it is a query. 0 indicates no, and 1 indicates yes.
    */
    @SerializedName("IsQuery")
    @Expose
    private Long IsQuery;

    /**
    * catalog name
    */
    @SerializedName("CatalogName")
    @Expose
    private String [] CatalogName;

    /**
    * SQL name
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * ReadRows sort field
    */
    @SerializedName("ReadRows")
    @Expose
    private String ReadRows;

    /**
    * ResultBytes sort field
    */
    @SerializedName("ResultBytes")
    @Expose
    private String ResultBytes;

    /**
    * MemoryUsage sort field
    */
    @SerializedName("MemoryUsage")
    @Expose
    private String MemoryUsage;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Slow log time 
     * @return QueryDurationMs Slow log time
     */
    public Long getQueryDurationMs() {
        return this.QueryDurationMs;
    }

    /**
     * Set Slow log time
     * @param QueryDurationMs Slow log time
     */
    public void setQueryDurationMs(Long QueryDurationMs) {
        this.QueryDurationMs = QueryDurationMs;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Paging 
     * @return PageSize Paging
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Paging
     * @param PageSize Paging
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Paging 
     * @return PageNum Paging
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Paging
     * @param PageNum Paging
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Sort parameters 
     * @return DurationMs Sort parameters
     */
    public String getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set Sort parameters
     * @param DurationMs Sort parameters
     */
    public void setDurationMs(String DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String [] getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String [] DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Whether it is a query. 0 indicates no, and 1 indicates yes. 
     * @return IsQuery Whether it is a query. 0 indicates no, and 1 indicates yes.
     */
    public Long getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set Whether it is a query. 0 indicates no, and 1 indicates yes.
     * @param IsQuery Whether it is a query. 0 indicates no, and 1 indicates yes.
     */
    public void setIsQuery(Long IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Get catalog name 
     * @return CatalogName catalog name
     */
    public String [] getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog name
     * @param CatalogName catalog name
     */
    public void setCatalogName(String [] CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get SQL name 
     * @return Sql SQL name
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL name
     * @param Sql SQL name
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get ReadRows sort field 
     * @return ReadRows ReadRows sort field
     */
    public String getReadRows() {
        return this.ReadRows;
    }

    /**
     * Set ReadRows sort field
     * @param ReadRows ReadRows sort field
     */
    public void setReadRows(String ReadRows) {
        this.ReadRows = ReadRows;
    }

    /**
     * Get ResultBytes sort field 
     * @return ResultBytes ResultBytes sort field
     */
    public String getResultBytes() {
        return this.ResultBytes;
    }

    /**
     * Set ResultBytes sort field
     * @param ResultBytes ResultBytes sort field
     */
    public void setResultBytes(String ResultBytes) {
        this.ResultBytes = ResultBytes;
    }

    /**
     * Get MemoryUsage sort field 
     * @return MemoryUsage MemoryUsage sort field
     */
    public String getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set MemoryUsage sort field
     * @param MemoryUsage MemoryUsage sort field
     */
    public void setMemoryUsage(String MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    public DescribeSlowQueryRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowQueryRecordsRequest(DescribeSlowQueryRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.QueryDurationMs != null) {
            this.QueryDurationMs = new Long(source.QueryDurationMs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new String(source.DurationMs);
        }
        if (source.DbName != null) {
            this.DbName = new String[source.DbName.length];
            for (int i = 0; i < source.DbName.length; i++) {
                this.DbName[i] = new String(source.DbName[i]);
            }
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Long(source.IsQuery);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String[source.CatalogName.length];
            for (int i = 0; i < source.CatalogName.length; i++) {
                this.CatalogName[i] = new String(source.CatalogName[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ReadRows != null) {
            this.ReadRows = new String(source.ReadRows);
        }
        if (source.ResultBytes != null) {
            this.ResultBytes = new String(source.ResultBytes);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new String(source.MemoryUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "QueryDurationMs", this.QueryDurationMs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamArraySimple(map, prefix + "DbName.", this.DbName);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);
        this.setParamArraySimple(map, prefix + "CatalogName.", this.CatalogName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ReadRows", this.ReadRows);
        this.setParamSimple(map, prefix + "ResultBytes", this.ResultBytes);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);

    }
}

