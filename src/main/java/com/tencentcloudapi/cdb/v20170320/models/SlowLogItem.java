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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogItem extends AbstractModel {

    /**
    * Sql execution time. Unix second-level timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Execution duration of Sql (seconds).
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * Sql statement.
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Client IP address.
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
    * Database name.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Lock duration (unit: second).
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
    * Result set row count.
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * Sql Template.
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * md5 of the Sql statement.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get Sql execution time. Unix second-level timestamp. 
     * @return Timestamp Sql execution time. Unix second-level timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Sql execution time. Unix second-level timestamp.
     * @param Timestamp Sql execution time. Unix second-level timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Execution duration of Sql (seconds). 
     * @return QueryTime Execution duration of Sql (seconds).
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Execution duration of Sql (seconds).
     * @param QueryTime Execution duration of Sql (seconds).
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Sql statement. 
     * @return SqlText Sql statement.
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set Sql statement.
     * @param SqlText Sql statement.
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Client IP address. 
     * @return UserHost Client IP address.
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set Client IP address.
     * @param UserHost Client IP address.
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
     * Get Database name. 
     * @return Database Database name.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name.
     * @param Database Database name.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Lock duration (unit: second). 
     * @return LockTime Lock duration (unit: second).
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock duration (unit: second).
     * @param LockTime Lock duration (unit: second).
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
     * Get Result set row count. 
     * @return RowsSent Result set row count.
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Result set row count.
     * @param RowsSent Result set row count.
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get Sql Template. 
     * @return SqlTemplate Sql Template.
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set Sql Template.
     * @param SqlTemplate Sql Template.
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get md5 of the Sql statement. 
     * @return Md5 md5 of the Sql statement.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set md5 of the Sql statement.
     * @param Md5 md5 of the Sql statement.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    public SlowLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogItem(SlowLogItem source) {
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
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
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
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

