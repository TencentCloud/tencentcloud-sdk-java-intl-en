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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBaseAuditRecord extends AbstractModel {

    /**
    * Query user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OsUser")
    @Expose
    private String OsUser;

    /**
    * Query ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitialQueryId")
    @Expose
    private String InitialQueryId;

    /**
    * SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueryStartTime")
    @Expose
    private String QueryStartTime;

    /**
    * Execution duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadRows")
    @Expose
    private Long ReadRows;

    /**
    * Total number of read bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultRows")
    @Expose
    private Long ResultRows;

    /**
    * Result bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultBytes")
    @Expose
    private Long ResultBytes;

    /**
    * Memory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Long MemoryUsage;

    /**
    * Initial query IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitialAddress")
    @Expose
    private String InitialAddress;

    /**
    * Database
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * SQL type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
     * Get Query user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OsUser Query user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOsUser() {
        return this.OsUser;
    }

    /**
     * Set Query user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OsUser Query user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOsUser(String OsUser) {
        this.OsUser = OsUser;
    }

    /**
     * Get Query ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitialQueryId Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitialQueryId() {
        return this.InitialQueryId;
    }

    /**
     * Set Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitialQueryId Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitialQueryId(String InitialQueryId) {
        this.InitialQueryId = InitialQueryId;
    }

    /**
     * Get SQL statement
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sql SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sql SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueryStartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueryStartTime() {
        return this.QueryStartTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueryStartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueryStartTime(String QueryStartTime) {
        this.QueryStartTime = QueryStartTime;
    }

    /**
     * Get Execution duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DurationMs Execution duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set Execution duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DurationMs Execution duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get The number of read rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadRows The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadRows() {
        return this.ReadRows;
    }

    /**
     * Set The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadRows The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadRows(Long ReadRows) {
        this.ReadRows = ReadRows;
    }

    /**
     * Get Total number of read bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultRows Total number of read bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResultRows() {
        return this.ResultRows;
    }

    /**
     * Set Total number of read bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultRows Total number of read bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultRows(Long ResultRows) {
        this.ResultRows = ResultRows;
    }

    /**
     * Get Result bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultBytes Result bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResultBytes() {
        return this.ResultBytes;
    }

    /**
     * Set Result bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultBytes Result bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultBytes(Long ResultBytes) {
        this.ResultBytes = ResultBytes;
    }

    /**
     * Get Memory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryUsage Memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set Memory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryUsage Memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryUsage(Long MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get Initial query IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitialAddress Initial query IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitialAddress() {
        return this.InitialAddress;
    }

    /**
     * Set Initial query IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitialAddress Initial query IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitialAddress(String InitialAddress) {
        this.InitialAddress = InitialAddress;
    }

    /**
     * Get Database
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get SQL type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlType SQL type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlType SQL type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Catalog name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    public DataBaseAuditRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBaseAuditRecord(DataBaseAuditRecord source) {
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
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
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
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);

    }
}

