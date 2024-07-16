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

public class SlowQueryRecord extends AbstractModel {

    /**
    * User query 
    */
    @SerializedName("OsUser")
    @Expose
    private String OsUser;

    /**
    * ID query
    */
    @SerializedName("InitialQueryId")
    @Expose
    private String InitialQueryId;

    /**
    * SQL statement
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Start time
    */
    @SerializedName("QueryStartTime")
    @Expose
    private String QueryStartTime;

    /**
    * Execution duration
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * The number of read rows
    */
    @SerializedName("ReadRows")
    @Expose
    private Long ReadRows;

    /**
    * Total number of read bytes
    */
    @SerializedName("ResultRows")
    @Expose
    private Long ResultRows;

    /**
    * Result bytes
    */
    @SerializedName("ResultBytes")
    @Expose
    private Long ResultBytes;

    /**
    * Memory
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Long MemoryUsage;

    /**
    * Initial query IP
    */
    @SerializedName("InitialAddress")
    @Expose
    private String InitialAddress;

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Whether it is a query. 0 indicates no, and 1 indicates query statement.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsQuery")
    @Expose
    private Long IsQuery;

    /**
    * MB format of ResultBytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultBytesMB")
    @Expose
    private Float ResultBytesMB;

    /**
    * MemoryUsage, in MB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryUsageMB")
    @Expose
    private Float MemoryUsageMB;

    /**
    * DurationMs, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DurationSec")
    @Expose
    private Float DurationSec;

    /**
     * Get User query  
     * @return OsUser User query 
     */
    public String getOsUser() {
        return this.OsUser;
    }

    /**
     * Set User query 
     * @param OsUser User query 
     */
    public void setOsUser(String OsUser) {
        this.OsUser = OsUser;
    }

    /**
     * Get ID query 
     * @return InitialQueryId ID query
     */
    public String getInitialQueryId() {
        return this.InitialQueryId;
    }

    /**
     * Set ID query
     * @param InitialQueryId ID query
     */
    public void setInitialQueryId(String InitialQueryId) {
        this.InitialQueryId = InitialQueryId;
    }

    /**
     * Get SQL statement 
     * @return Sql SQL statement
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL statement
     * @param Sql SQL statement
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Start time 
     * @return QueryStartTime Start time
     */
    public String getQueryStartTime() {
        return this.QueryStartTime;
    }

    /**
     * Set Start time
     * @param QueryStartTime Start time
     */
    public void setQueryStartTime(String QueryStartTime) {
        this.QueryStartTime = QueryStartTime;
    }

    /**
     * Get Execution duration 
     * @return DurationMs Execution duration
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set Execution duration
     * @param DurationMs Execution duration
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get The number of read rows 
     * @return ReadRows The number of read rows
     */
    public Long getReadRows() {
        return this.ReadRows;
    }

    /**
     * Set The number of read rows
     * @param ReadRows The number of read rows
     */
    public void setReadRows(Long ReadRows) {
        this.ReadRows = ReadRows;
    }

    /**
     * Get Total number of read bytes 
     * @return ResultRows Total number of read bytes
     */
    public Long getResultRows() {
        return this.ResultRows;
    }

    /**
     * Set Total number of read bytes
     * @param ResultRows Total number of read bytes
     */
    public void setResultRows(Long ResultRows) {
        this.ResultRows = ResultRows;
    }

    /**
     * Get Result bytes 
     * @return ResultBytes Result bytes
     */
    public Long getResultBytes() {
        return this.ResultBytes;
    }

    /**
     * Set Result bytes
     * @param ResultBytes Result bytes
     */
    public void setResultBytes(Long ResultBytes) {
        this.ResultBytes = ResultBytes;
    }

    /**
     * Get Memory 
     * @return MemoryUsage Memory
     */
    public Long getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set Memory
     * @param MemoryUsage Memory
     */
    public void setMemoryUsage(Long MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get Initial query IP 
     * @return InitialAddress Initial query IP
     */
    public String getInitialAddress() {
        return this.InitialAddress;
    }

    /**
     * Set Initial query IP
     * @param InitialAddress Initial query IP
     */
    public void setInitialAddress(String InitialAddress) {
        this.InitialAddress = InitialAddress;
    }

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Whether it is a query. 0 indicates no, and 1 indicates query statement.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsQuery Whether it is a query. 0 indicates no, and 1 indicates query statement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set Whether it is a query. 0 indicates no, and 1 indicates query statement.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsQuery Whether it is a query. 0 indicates no, and 1 indicates query statement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsQuery(Long IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Get MB format of ResultBytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultBytesMB MB format of ResultBytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getResultBytesMB() {
        return this.ResultBytesMB;
    }

    /**
     * Set MB format of ResultBytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultBytesMB MB format of ResultBytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultBytesMB(Float ResultBytesMB) {
        this.ResultBytesMB = ResultBytesMB;
    }

    /**
     * Get MemoryUsage, in MB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryUsageMB MemoryUsage, in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMemoryUsageMB() {
        return this.MemoryUsageMB;
    }

    /**
     * Set MemoryUsage, in MB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryUsageMB MemoryUsage, in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryUsageMB(Float MemoryUsageMB) {
        this.MemoryUsageMB = MemoryUsageMB;
    }

    /**
     * Get DurationMs, in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DurationSec DurationMs, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDurationSec() {
        return this.DurationSec;
    }

    /**
     * Set DurationMs, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DurationSec DurationMs, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDurationSec(Float DurationSec) {
        this.DurationSec = DurationSec;
    }

    public SlowQueryRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowQueryRecord(SlowQueryRecord source) {
        if (source.OsUser != null) {
            this.OsUser = new String(source.OsUser);
        }
        if (source.InitialQueryId != null) {
            this.InitialQueryId = new String(source.InitialQueryId);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.QueryStartTime != null) {
            this.QueryStartTime = new String(source.QueryStartTime);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.ReadRows != null) {
            this.ReadRows = new Long(source.ReadRows);
        }
        if (source.ResultRows != null) {
            this.ResultRows = new Long(source.ResultRows);
        }
        if (source.ResultBytes != null) {
            this.ResultBytes = new Long(source.ResultBytes);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Long(source.MemoryUsage);
        }
        if (source.InitialAddress != null) {
            this.InitialAddress = new String(source.InitialAddress);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Long(source.IsQuery);
        }
        if (source.ResultBytesMB != null) {
            this.ResultBytesMB = new Float(source.ResultBytesMB);
        }
        if (source.MemoryUsageMB != null) {
            this.MemoryUsageMB = new Float(source.MemoryUsageMB);
        }
        if (source.DurationSec != null) {
            this.DurationSec = new Float(source.DurationSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsUser", this.OsUser);
        this.setParamSimple(map, prefix + "InitialQueryId", this.InitialQueryId);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "QueryStartTime", this.QueryStartTime);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "ReadRows", this.ReadRows);
        this.setParamSimple(map, prefix + "ResultRows", this.ResultRows);
        this.setParamSimple(map, prefix + "ResultBytes", this.ResultBytes);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "InitialAddress", this.InitialAddress);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);
        this.setParamSimple(map, prefix + "ResultBytesMB", this.ResultBytesMB);
        this.setParamSimple(map, prefix + "MemoryUsageMB", this.MemoryUsageMB);
        this.setParamSimple(map, prefix + "DurationSec", this.DurationSec);

    }
}

