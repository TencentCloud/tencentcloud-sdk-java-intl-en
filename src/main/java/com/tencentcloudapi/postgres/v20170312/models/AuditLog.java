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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel {

    /**
    * <p>Log time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Number of affected rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>Database</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>Error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>Error message</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>Execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>Origin</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Instance Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Object name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * <p>Object type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>sql</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>sql type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>thread ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>User</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get <p>Log time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp <p>Log time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Log time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamp <p>Log time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Number of affected rows</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AffectRows <p>Number of affected rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>Number of affected rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AffectRows <p>Number of affected rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>Database</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBName <p>Database</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>Database</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBName <p>Database</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>Error code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode <p>Error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrCode <p>Error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage <p>Error message</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>Error message</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage <p>Error message</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>Execution time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecTime <p>Execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>Execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecTime <p>Execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>Origin</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Host <p>Origin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Origin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Host <p>Origin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Instance Id</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId <p>Instance Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId <p>Instance Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Object name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectName <p>Object name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set <p>Object name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectName <p>Object name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get <p>Object type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectType <p>Object type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>Object type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectType <p>Object type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>sql</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sql <p>sql</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>sql</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sql <p>sql</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>sql type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlType <p>sql type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>sql type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlType <p>sql type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>thread ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThreadId <p>thread ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>thread ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThreadId <p>thread ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>User</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User <p>User</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>User</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User <p>User</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

