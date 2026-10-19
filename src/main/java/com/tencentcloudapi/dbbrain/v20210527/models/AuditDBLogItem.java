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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditDBLogItem extends AbstractModel {

    /**
    * <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Number of affected rows.</p>
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>Number of scanned rows.</p>
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * <p>CPU time (µs).</p>
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * <p>Backend Set Host (source field dbHost).</p>
    */
    @SerializedName("SetHost")
    @Expose
    private String SetHost;

    /**
    * <p>Database name where the SQL is executed.</p>
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>Error code returned by SQL execution. 0 indicates success.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>SQL execution time (µs).</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>Client source IP.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Set Name (source field instanceId).</p>
    */
    @SerializedName("SetName")
    @Expose
    private String SetName;

    /**
    * <p>IO wait time (µs).</p>
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long IoWaitTime;

    /**
    * <p>Lock waiting time (µs).</p>
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long LockWaitTime;

    /**
    * <p>SQL start time (nanosecond timestamp).</p>
    */
    @SerializedName("SqlStartTimeNs")
    @Expose
    private Long SqlStartTimeNs;

    /**
    * <p>Query ID (used for join queries).</p>
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * <p>Serial number for queries (serial number of SQL in the same transaction).</p>
    */
    @SerializedName("QueryNo")
    @Expose
    private Long QueryNo;

    /**
    * <p>Number of rows returned (rows in the scanning result set).</p>
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * <p>Original executed SQL statement.</p>
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>SQL Template ID.</p>
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL type (for example, Select, Insert, Update, Delete).</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>Tables involved.</p>
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * <p>Thread ID.</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>SQL start time (millisecond-level timestamp).</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>Transaction time to live (µs).</p>
    */
    @SerializedName("TrxLivingTime")
    @Expose
    private Long TrxLivingTime;

    /**
    * <p>Database username that executes the SQL.</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>Transaction ID.</p>
    */
    @SerializedName("TrxId")
    @Expose
    private String TrxId;

    /**
    * <p>Internal XID.</p>
    */
    @SerializedName("InternalXId")
    @Expose
    private String InternalXId;

    /**
    * <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>Gateway circulation duration (ms). It is returned only when LogType=All after gateway log association. When LogType=DB, this field is not delivered.</p>
    */
    @SerializedName("FlowTime")
    @Expose
    private Long FlowTime;

    /**
     * Get <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p> 
     * @return Timestamp <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     * @param Timestamp <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Number of affected rows.</p> 
     * @return AffectRows <p>Number of affected rows.</p>
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>Number of affected rows.</p>
     * @param AffectRows <p>Number of affected rows.</p>
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>Number of scanned rows.</p> 
     * @return CheckRows <p>Number of scanned rows.</p>
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set <p>Number of scanned rows.</p>
     * @param CheckRows <p>Number of scanned rows.</p>
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get <p>CPU time (µs).</p> 
     * @return CpuTime <p>CPU time (µs).</p>
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>CPU time (µs).</p>
     * @param CpuTime <p>CPU time (µs).</p>
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>Backend Set Host (source field dbHost).</p> 
     * @return SetHost <p>Backend Set Host (source field dbHost).</p>
     */
    public String getSetHost() {
        return this.SetHost;
    }

    /**
     * Set <p>Backend Set Host (source field dbHost).</p>
     * @param SetHost <p>Backend Set Host (source field dbHost).</p>
     */
    public void setSetHost(String SetHost) {
        this.SetHost = SetHost;
    }

    /**
     * Get <p>Database name where the SQL is executed.</p> 
     * @return DBName <p>Database name where the SQL is executed.</p>
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>Database name where the SQL is executed.</p>
     * @param DBName <p>Database name where the SQL is executed.</p>
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>Error code returned by SQL execution. 0 indicates success.</p> 
     * @return ErrCode <p>Error code returned by SQL execution. 0 indicates success.</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code returned by SQL execution. 0 indicates success.</p>
     * @param ErrCode <p>Error code returned by SQL execution. 0 indicates success.</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>SQL execution time (µs).</p> 
     * @return ExecTime <p>SQL execution time (µs).</p>
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>SQL execution time (µs).</p>
     * @param ExecTime <p>SQL execution time (µs).</p>
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>Client source IP.</p> 
     * @return Host <p>Client source IP.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Client source IP.</p>
     * @param Host <p>Client source IP.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Set Name (source field instanceId).</p> 
     * @return SetName <p>Set Name (source field instanceId).</p>
     */
    public String getSetName() {
        return this.SetName;
    }

    /**
     * Set <p>Set Name (source field instanceId).</p>
     * @param SetName <p>Set Name (source field instanceId).</p>
     */
    public void setSetName(String SetName) {
        this.SetName = SetName;
    }

    /**
     * Get <p>IO wait time (µs).</p> 
     * @return IoWaitTime <p>IO wait time (µs).</p>
     */
    public Long getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set <p>IO wait time (µs).</p>
     * @param IoWaitTime <p>IO wait time (µs).</p>
     */
    public void setIoWaitTime(Long IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get <p>Lock waiting time (µs).</p> 
     * @return LockWaitTime <p>Lock waiting time (µs).</p>
     */
    public Long getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set <p>Lock waiting time (µs).</p>
     * @param LockWaitTime <p>Lock waiting time (µs).</p>
     */
    public void setLockWaitTime(Long LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get <p>SQL start time (nanosecond timestamp).</p> 
     * @return SqlStartTimeNs <p>SQL start time (nanosecond timestamp).</p>
     */
    public Long getSqlStartTimeNs() {
        return this.SqlStartTimeNs;
    }

    /**
     * Set <p>SQL start time (nanosecond timestamp).</p>
     * @param SqlStartTimeNs <p>SQL start time (nanosecond timestamp).</p>
     */
    public void setSqlStartTimeNs(Long SqlStartTimeNs) {
        this.SqlStartTimeNs = SqlStartTimeNs;
    }

    /**
     * Get <p>Query ID (used for join queries).</p> 
     * @return QueryId <p>Query ID (used for join queries).</p>
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>Query ID (used for join queries).</p>
     * @param QueryId <p>Query ID (used for join queries).</p>
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get <p>Serial number for queries (serial number of SQL in the same transaction).</p> 
     * @return QueryNo <p>Serial number for queries (serial number of SQL in the same transaction).</p>
     */
    public Long getQueryNo() {
        return this.QueryNo;
    }

    /**
     * Set <p>Serial number for queries (serial number of SQL in the same transaction).</p>
     * @param QueryNo <p>Serial number for queries (serial number of SQL in the same transaction).</p>
     */
    public void setQueryNo(Long QueryNo) {
        this.QueryNo = QueryNo;
    }

    /**
     * Get <p>Number of rows returned (rows in the scanning result set).</p> 
     * @return SentRows <p>Number of rows returned (rows in the scanning result set).</p>
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set <p>Number of rows returned (rows in the scanning result set).</p>
     * @param SentRows <p>Number of rows returned (rows in the scanning result set).</p>
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get <p>Original executed SQL statement.</p> 
     * @return Sql <p>Original executed SQL statement.</p>
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>Original executed SQL statement.</p>
     * @param Sql <p>Original executed SQL statement.</p>
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>SQL Template ID.</p> 
     * @return SqlTemplateId <p>SQL Template ID.</p>
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL Template ID.</p>
     * @param SqlTemplateId <p>SQL Template ID.</p>
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>SQL type (for example, Select, Insert, Update, Delete).</p> 
     * @return SqlType <p>SQL type (for example, Select, Insert, Update, Delete).</p>
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL type (for example, Select, Insert, Update, Delete).</p>
     * @param SqlType <p>SQL type (for example, Select, Insert, Update, Delete).</p>
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>Tables involved.</p> 
     * @return Tables <p>Tables involved.</p>
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set <p>Tables involved.</p>
     * @param Tables <p>Tables involved.</p>
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>Thread ID.</p> 
     * @return ThreadId <p>Thread ID.</p>
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>Thread ID.</p>
     * @param ThreadId <p>Thread ID.</p>
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>SQL start time (millisecond-level timestamp).</p> 
     * @return SqlStartTime <p>SQL start time (millisecond-level timestamp).</p>
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL start time (millisecond-level timestamp).</p>
     * @param SqlStartTime <p>SQL start time (millisecond-level timestamp).</p>
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>Transaction time to live (µs).</p> 
     * @return TrxLivingTime <p>Transaction time to live (µs).</p>
     */
    public Long getTrxLivingTime() {
        return this.TrxLivingTime;
    }

    /**
     * Set <p>Transaction time to live (µs).</p>
     * @param TrxLivingTime <p>Transaction time to live (µs).</p>
     */
    public void setTrxLivingTime(Long TrxLivingTime) {
        this.TrxLivingTime = TrxLivingTime;
    }

    /**
     * Get <p>Database username that executes the SQL.</p> 
     * @return User <p>Database username that executes the SQL.</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>Database username that executes the SQL.</p>
     * @param User <p>Database username that executes the SQL.</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>Transaction ID.</p> 
     * @return TrxId <p>Transaction ID.</p>
     */
    public String getTrxId() {
        return this.TrxId;
    }

    /**
     * Set <p>Transaction ID.</p>
     * @param TrxId <p>Transaction ID.</p>
     */
    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get <p>Internal XID.</p> 
     * @return InternalXId <p>Internal XID.</p>
     */
    public String getInternalXId() {
        return this.InternalXId;
    }

    /**
     * Set <p>Internal XID.</p>
     * @param InternalXId <p>Internal XID.</p>
     */
    public void setInternalXId(String InternalXId) {
        this.InternalXId = InternalXId;
    }

    /**
     * Get <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p> 
     * @return BusinessCode <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     * @param BusinessCode <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>Gateway circulation duration (ms). It is returned only when LogType=All after gateway log association. When LogType=DB, this field is not delivered.</p> 
     * @return FlowTime <p>Gateway circulation duration (ms). It is returned only when LogType=All after gateway log association. When LogType=DB, this field is not delivered.</p>
     */
    public Long getFlowTime() {
        return this.FlowTime;
    }

    /**
     * Set <p>Gateway circulation duration (ms). It is returned only when LogType=All after gateway log association. When LogType=DB, this field is not delivered.</p>
     * @param FlowTime <p>Gateway circulation duration (ms). It is returned only when LogType=All after gateway log association. When LogType=DB, this field is not delivered.</p>
     */
    public void setFlowTime(Long FlowTime) {
        this.FlowTime = FlowTime;
    }

    public AuditDBLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditDBLogItem(AuditDBLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.CheckRows != null) {
            this.CheckRows = new Long(source.CheckRows);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long(source.CpuTime);
        }
        if (source.SetHost != null) {
            this.SetHost = new String(source.SetHost);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.SetName != null) {
            this.SetName = new String(source.SetName);
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long(source.IoWaitTime);
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long(source.LockWaitTime);
        }
        if (source.SqlStartTimeNs != null) {
            this.SqlStartTimeNs = new Long(source.SqlStartTimeNs);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.QueryNo != null) {
            this.QueryNo = new Long(source.QueryNo);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.TrxLivingTime != null) {
            this.TrxLivingTime = new Long(source.TrxLivingTime);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.TrxId != null) {
            this.TrxId = new String(source.TrxId);
        }
        if (source.InternalXId != null) {
            this.InternalXId = new String(source.InternalXId);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.FlowTime != null) {
            this.FlowTime = new Long(source.FlowTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "CheckRows", this.CheckRows);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "SetHost", this.SetHost);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "SetName", this.SetName);
        this.setParamSimple(map, prefix + "IoWaitTime", this.IoWaitTime);
        this.setParamSimple(map, prefix + "LockWaitTime", this.LockWaitTime);
        this.setParamSimple(map, prefix + "SqlStartTimeNs", this.SqlStartTimeNs);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "QueryNo", this.QueryNo);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "TrxLivingTime", this.TrxLivingTime);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "TrxId", this.TrxId);
        this.setParamSimple(map, prefix + "InternalXId", this.InternalXId);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "FlowTime", this.FlowTime);

    }
}

