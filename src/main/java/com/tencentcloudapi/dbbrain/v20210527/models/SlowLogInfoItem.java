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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogInfoItem extends AbstractModel{

    /**
    * Slow log start time
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * SQL statement
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Database
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * User source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * IP source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * Execution time in seconds
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
    * Lock time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * Number of returned rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
     * Get Slow log start time 
     * @return Timestamp Slow log start time
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Slow log start time
     * @param Timestamp Slow log start time
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
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
     * Get Database 
     * @return Database Database
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database
     * @param Database Database
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get User source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName User source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName User source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get IP source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserHost IP source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set IP source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserHost IP source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get Execution time in seconds 
     * @return QueryTime Execution time in seconds
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Execution time in seconds
     * @param QueryTime Execution time in seconds
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Lock time in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LockTime Lock time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LockTime Lock time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsExamined Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsExamined Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get Number of returned rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsSent Number of returned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Number of returned rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsSent Number of returned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    public SlowLogInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogInfoItem(SlowLogInfoItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserHost != null) {
            this.UserHost = new String(source.UserHost);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);

    }
}

