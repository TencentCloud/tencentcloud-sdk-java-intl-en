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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowQueriesItem extends AbstractModel {

    /**
    * Execution timestamp
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Execution duration in seconds.
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * sql statement
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Client host
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Lock duration in seconds.
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * Number of scanned rows.
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * Rows returned
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * sql template
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * md5 of the sql statement
    */
    @SerializedName("SqlMd5")
    @Expose
    private String SqlMd5;

    /**
    * Remote reading count
Database kernel version above 3.1.12
    */
    @SerializedName("SyncReadCountRemote")
    @Expose
    private Long SyncReadCountRemote;

    /**
    * Number of remote read bytes
Database kernel version above 3.1.12
    */
    @SerializedName("SyncReadBytesRemote")
    @Expose
    private Long SyncReadBytesRemote;

    /**
    * Time spent on remote reads (µs)
Database kernel version above 3.1.12
    */
    @SerializedName("SyncReadTimeRemote")
    @Expose
    private Long SyncReadTimeRemote;

    /**
    * Remote write count
Database kernel version above 3.1.12
    */
    @SerializedName("SyncWriteCountRemote")
    @Expose
    private Long SyncWriteCountRemote;

    /**
    * Number of remote written bytes.
Database kernel version above 3.1.12
    */
    @SerializedName("SyncWriteBytesRemote")
    @Expose
    private Long SyncWriteBytesRemote;

    /**
    * Time spent on remote writing (µs).
Database kernel version above 3.1.12
    */
    @SerializedName("SyncWriteTimeRemote")
    @Expose
    private Long SyncWriteTimeRemote;

    /**
    * Transaction submission delay (µs)
Database kernel version above 3.1.12
    */
    @SerializedName("TrxCommitDelay")
    @Expose
    private Long TrxCommitDelay;

    /**
     * Get Execution timestamp 
     * @return Timestamp Execution timestamp
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Execution timestamp
     * @param Timestamp Execution timestamp
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Execution duration in seconds. 
     * @return QueryTime Execution duration in seconds.
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Execution duration in seconds.
     * @param QueryTime Execution duration in seconds.
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get sql statement 
     * @return SqlText sql statement
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set sql statement
     * @param SqlText sql statement
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Client host 
     * @return UserHost Client host
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set Client host
     * @param UserHost Client host
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Lock duration in seconds. 
     * @return LockTime Lock duration in seconds.
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock duration in seconds.
     * @param LockTime Lock duration in seconds.
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Number of scanned rows. 
     * @return RowsExamined Number of scanned rows.
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set Number of scanned rows.
     * @param RowsExamined Number of scanned rows.
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get Rows returned 
     * @return RowsSent Rows returned
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Rows returned
     * @param RowsSent Rows returned
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get sql template 
     * @return SqlTemplate sql template
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set sql template
     * @param SqlTemplate sql template
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get md5 of the sql statement 
     * @return SqlMd5 md5 of the sql statement
     */
    public String getSqlMd5() {
        return this.SqlMd5;
    }

    /**
     * Set md5 of the sql statement
     * @param SqlMd5 md5 of the sql statement
     */
    public void setSqlMd5(String SqlMd5) {
        this.SqlMd5 = SqlMd5;
    }

    /**
     * Get Remote reading count
Database kernel version above 3.1.12 
     * @return SyncReadCountRemote Remote reading count
Database kernel version above 3.1.12
     */
    public Long getSyncReadCountRemote() {
        return this.SyncReadCountRemote;
    }

    /**
     * Set Remote reading count
Database kernel version above 3.1.12
     * @param SyncReadCountRemote Remote reading count
Database kernel version above 3.1.12
     */
    public void setSyncReadCountRemote(Long SyncReadCountRemote) {
        this.SyncReadCountRemote = SyncReadCountRemote;
    }

    /**
     * Get Number of remote read bytes
Database kernel version above 3.1.12 
     * @return SyncReadBytesRemote Number of remote read bytes
Database kernel version above 3.1.12
     */
    public Long getSyncReadBytesRemote() {
        return this.SyncReadBytesRemote;
    }

    /**
     * Set Number of remote read bytes
Database kernel version above 3.1.12
     * @param SyncReadBytesRemote Number of remote read bytes
Database kernel version above 3.1.12
     */
    public void setSyncReadBytesRemote(Long SyncReadBytesRemote) {
        this.SyncReadBytesRemote = SyncReadBytesRemote;
    }

    /**
     * Get Time spent on remote reads (µs)
Database kernel version above 3.1.12 
     * @return SyncReadTimeRemote Time spent on remote reads (µs)
Database kernel version above 3.1.12
     */
    public Long getSyncReadTimeRemote() {
        return this.SyncReadTimeRemote;
    }

    /**
     * Set Time spent on remote reads (µs)
Database kernel version above 3.1.12
     * @param SyncReadTimeRemote Time spent on remote reads (µs)
Database kernel version above 3.1.12
     */
    public void setSyncReadTimeRemote(Long SyncReadTimeRemote) {
        this.SyncReadTimeRemote = SyncReadTimeRemote;
    }

    /**
     * Get Remote write count
Database kernel version above 3.1.12 
     * @return SyncWriteCountRemote Remote write count
Database kernel version above 3.1.12
     */
    public Long getSyncWriteCountRemote() {
        return this.SyncWriteCountRemote;
    }

    /**
     * Set Remote write count
Database kernel version above 3.1.12
     * @param SyncWriteCountRemote Remote write count
Database kernel version above 3.1.12
     */
    public void setSyncWriteCountRemote(Long SyncWriteCountRemote) {
        this.SyncWriteCountRemote = SyncWriteCountRemote;
    }

    /**
     * Get Number of remote written bytes.
Database kernel version above 3.1.12 
     * @return SyncWriteBytesRemote Number of remote written bytes.
Database kernel version above 3.1.12
     */
    public Long getSyncWriteBytesRemote() {
        return this.SyncWriteBytesRemote;
    }

    /**
     * Set Number of remote written bytes.
Database kernel version above 3.1.12
     * @param SyncWriteBytesRemote Number of remote written bytes.
Database kernel version above 3.1.12
     */
    public void setSyncWriteBytesRemote(Long SyncWriteBytesRemote) {
        this.SyncWriteBytesRemote = SyncWriteBytesRemote;
    }

    /**
     * Get Time spent on remote writing (µs).
Database kernel version above 3.1.12 
     * @return SyncWriteTimeRemote Time spent on remote writing (µs).
Database kernel version above 3.1.12
     */
    public Long getSyncWriteTimeRemote() {
        return this.SyncWriteTimeRemote;
    }

    /**
     * Set Time spent on remote writing (µs).
Database kernel version above 3.1.12
     * @param SyncWriteTimeRemote Time spent on remote writing (µs).
Database kernel version above 3.1.12
     */
    public void setSyncWriteTimeRemote(Long SyncWriteTimeRemote) {
        this.SyncWriteTimeRemote = SyncWriteTimeRemote;
    }

    /**
     * Get Transaction submission delay (µs)
Database kernel version above 3.1.12 
     * @return TrxCommitDelay Transaction submission delay (µs)
Database kernel version above 3.1.12
     */
    public Long getTrxCommitDelay() {
        return this.TrxCommitDelay;
    }

    /**
     * Set Transaction submission delay (µs)
Database kernel version above 3.1.12
     * @param TrxCommitDelay Transaction submission delay (µs)
Database kernel version above 3.1.12
     */
    public void setTrxCommitDelay(Long TrxCommitDelay) {
        this.TrxCommitDelay = TrxCommitDelay;
    }

    public SlowQueriesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowQueriesItem(SlowQueriesItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.UserHost != null) {
            this.UserHost = new String(source.UserHost);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.LockTime != null) {
            this.LockTime = new Float(source.LockTime);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlMd5 != null) {
            this.SqlMd5 = new String(source.SqlMd5);
        }
        if (source.SyncReadCountRemote != null) {
            this.SyncReadCountRemote = new Long(source.SyncReadCountRemote);
        }
        if (source.SyncReadBytesRemote != null) {
            this.SyncReadBytesRemote = new Long(source.SyncReadBytesRemote);
        }
        if (source.SyncReadTimeRemote != null) {
            this.SyncReadTimeRemote = new Long(source.SyncReadTimeRemote);
        }
        if (source.SyncWriteCountRemote != null) {
            this.SyncWriteCountRemote = new Long(source.SyncWriteCountRemote);
        }
        if (source.SyncWriteBytesRemote != null) {
            this.SyncWriteBytesRemote = new Long(source.SyncWriteBytesRemote);
        }
        if (source.SyncWriteTimeRemote != null) {
            this.SyncWriteTimeRemote = new Long(source.SyncWriteTimeRemote);
        }
        if (source.TrxCommitDelay != null) {
            this.TrxCommitDelay = new Long(source.TrxCommitDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlMd5", this.SqlMd5);
        this.setParamSimple(map, prefix + "SyncReadCountRemote", this.SyncReadCountRemote);
        this.setParamSimple(map, prefix + "SyncReadBytesRemote", this.SyncReadBytesRemote);
        this.setParamSimple(map, prefix + "SyncReadTimeRemote", this.SyncReadTimeRemote);
        this.setParamSimple(map, prefix + "SyncWriteCountRemote", this.SyncWriteCountRemote);
        this.setParamSimple(map, prefix + "SyncWriteBytesRemote", this.SyncWriteBytesRemote);
        this.setParamSimple(map, prefix + "SyncWriteTimeRemote", this.SyncWriteTimeRemote);
        this.setParamSimple(map, prefix + "TrxCommitDelay", this.TrxCommitDelay);

    }
}

