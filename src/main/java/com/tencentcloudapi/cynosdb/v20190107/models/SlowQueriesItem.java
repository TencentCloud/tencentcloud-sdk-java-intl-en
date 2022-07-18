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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowQueriesItem extends AbstractModel{

    /**
    * Execution timestamp
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Execution duration in seconds
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * SQL statement
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
    * Username
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
    * Lock duration in seconds
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * Number of scanned rows
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * Number of returned rows
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * SQL template
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * MD5 value of the SQL statement
    */
    @SerializedName("SqlMd5")
    @Expose
    private String SqlMd5;

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
     * Get Execution duration in seconds 
     * @return QueryTime Execution duration in seconds
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Execution duration in seconds
     * @param QueryTime Execution duration in seconds
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get SQL statement 
     * @return SqlText SQL statement
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL statement
     * @param SqlText SQL statement
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
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
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
     * Get Lock duration in seconds 
     * @return LockTime Lock duration in seconds
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock duration in seconds
     * @param LockTime Lock duration in seconds
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Number of scanned rows 
     * @return RowsExamined Number of scanned rows
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set Number of scanned rows
     * @param RowsExamined Number of scanned rows
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get Number of returned rows 
     * @return RowsSent Number of returned rows
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Number of returned rows
     * @param RowsSent Number of returned rows
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get SQL template 
     * @return SqlTemplate SQL template
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set SQL template
     * @param SqlTemplate SQL template
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get MD5 value of the SQL statement 
     * @return SqlMd5 MD5 value of the SQL statement
     */
    public String getSqlMd5() {
        return this.SqlMd5;
    }

    /**
     * Set MD5 value of the SQL statement
     * @param SqlMd5 MD5 value of the SQL statement
     */
    public void setSqlMd5(String SqlMd5) {
        this.SqlMd5 = SqlMd5;
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

    }
}

