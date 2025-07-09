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

public class QueryDetails extends AbstractModel {

    /**
    * Initiating User
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Initiator")
    @Expose
    private String Initiator;

    /**
    * Access source address

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceAddress")
    @Expose
    private String SourceAddress;

    /**
    * Initial request ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitialRequestId")
    @Expose
    private String InitialRequestId;

    /**
    * catalog name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * SQL Type: 0 is non-query, 1 is query, -1 is unrestricted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SQLStatement")
    @Expose
    private String SQLStatement;

    /**
    * Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Runtime (s)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsRead")
    @Expose
    private Long RowsRead;

    /**
    * Read data volume (MB)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataRead")
    @Expose
    private Float DataRead;

    /**
    * Memory usage (MB)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Float MemoryUsage;

    /**
     * Get Initiating User
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Initiator Initiating User
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitiator() {
        return this.Initiator;
    }

    /**
     * Set Initiating User
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Initiator Initiating User
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitiator(String Initiator) {
        this.Initiator = Initiator;
    }

    /**
     * Get Access source address

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceAddress Access source address

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceAddress() {
        return this.SourceAddress;
    }

    /**
     * Set Access source address

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceAddress Access source address

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceAddress(String SourceAddress) {
        this.SourceAddress = SourceAddress;
    }

    /**
     * Get Initial request ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitialRequestId Initial request ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitialRequestId() {
        return this.InitialRequestId;
    }

    /**
     * Set Initial request ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitialRequestId Initial request ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitialRequestId(String InitialRequestId) {
        this.InitialRequestId = InitialRequestId;
    }

    /**
     * Get catalog name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get SQL Type: 0 is non-query, 1 is query, -1 is unrestricted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SQLType SQL Type: 0 is non-query, 1 is query, -1 is unrestricted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set SQL Type: 0 is non-query, 1 is query, -1 is unrestricted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SQLType SQL Type: 0 is non-query, 1 is query, -1 is unrestricted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get SQL statement
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SQLStatement SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSQLStatement() {
        return this.SQLStatement;
    }

    /**
     * Set SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SQLStatement SQL statement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSQLStatement(String SQLStatement) {
        this.SQLStatement = SQLStatement;
    }

    /**
     * Get Execution start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Runtime (s)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration Runtime (s)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Runtime (s)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration Runtime (s)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The number of read rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsRead The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsRead() {
        return this.RowsRead;
    }

    /**
     * Set The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsRead The number of read rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsRead(Long RowsRead) {
        this.RowsRead = RowsRead;
    }

    /**
     * Get Read data volume (MB)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataRead Read data volume (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDataRead() {
        return this.DataRead;
    }

    /**
     * Set Read data volume (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataRead Read data volume (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataRead(Float DataRead) {
        this.DataRead = DataRead;
    }

    /**
     * Get Memory usage (MB)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryUsage Memory usage (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set Memory usage (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryUsage Memory usage (MB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryUsage(Float MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    public QueryDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDetails(QueryDetails source) {
        if (source.Initiator != null) {
            this.Initiator = new String(source.Initiator);
        }
        if (source.SourceAddress != null) {
            this.SourceAddress = new String(source.SourceAddress);
        }
        if (source.InitialRequestId != null) {
            this.InitialRequestId = new String(source.InitialRequestId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.SQLStatement != null) {
            this.SQLStatement = new String(source.SQLStatement);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RowsRead != null) {
            this.RowsRead = new Long(source.RowsRead);
        }
        if (source.DataRead != null) {
            this.DataRead = new Float(source.DataRead);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Float(source.MemoryUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Initiator", this.Initiator);
        this.setParamSimple(map, prefix + "SourceAddress", this.SourceAddress);
        this.setParamSimple(map, prefix + "InitialRequestId", this.InitialRequestId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "SQLStatement", this.SQLStatement);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RowsRead", this.RowsRead);
        this.setParamSimple(map, prefix + "DataRead", this.DataRead);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);

    }
}

