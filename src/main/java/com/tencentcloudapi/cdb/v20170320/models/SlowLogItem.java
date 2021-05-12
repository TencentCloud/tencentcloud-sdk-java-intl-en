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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogItem extends AbstractModel{

    /**
    * SQL execution time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * SQL execution duration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * SQL statement.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Client address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * Username.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Lock duration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * Number of scanned rows.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * Number of rows in result set.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * SQL template.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * SQL statement MD5.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get SQL execution time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp SQL execution time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set SQL execution time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Timestamp SQL execution time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get SQL execution duration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return QueryTime SQL execution duration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set SQL execution duration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param QueryTime SQL execution duration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get SQL statement.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SqlText SQL statement.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL statement.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SqlText SQL statement.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Client address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserHost Client address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set Client address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserHost Client address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get Username.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Database Database name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Database Database name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Lock duration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LockTime Lock duration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock duration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LockTime Lock duration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Number of scanned rows.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RowsExamined Number of scanned rows.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set Number of scanned rows.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RowsExamined Number of scanned rows.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get Number of rows in result set.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RowsSent Number of rows in result set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Number of rows in result set.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RowsSent Number of rows in result set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get SQL template.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SqlTemplate SQL template.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set SQL template.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SqlTemplate SQL template.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get SQL statement MD5.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Md5 SQL statement MD5.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set SQL statement MD5.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Md5 SQL statement MD5.
Note: this field may return null, indicating that no valid values can be obtained.
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

