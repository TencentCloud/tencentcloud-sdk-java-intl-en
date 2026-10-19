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

public class AuditLog extends AbstractModel {

    /**
    * Number of affected rows.
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * Error code.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * SQL type.
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Table name.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Audit policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Database name.
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * SQL statement.
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Client address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Execution time, in microseconds.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Time.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Number of rows returned.
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * Execution thread ID.
    */
    @SerializedName("ThreadId")
    @Expose
    private Long ThreadId;

    /**
    * Number of scanned rows.
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * cpu execution time, in microseconds.
    */
    @SerializedName("CpuTime")
    @Expose
    private Float CpuTime;

    /**
    * IO wait time, in microseconds.
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long IoWaitTime;

    /**
    * Lock waiting time in microseconds.
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long LockWaitTime;

    /**
    * Transaction continuous waiting time, in µs.
    */
    @SerializedName("TrxLivingTime")
    @Expose
    private Long TrxLivingTime;

    /**
    * Start time. Together with timestamp, it forms a nanosecond-precision time.
    */
    @SerializedName("NsTime")
    @Expose
    private Long NsTime;

    /**
    * Basic information of the log hit rule template
    */
    @SerializedName("TemplateInfo")
    @Expose
    private LogRuleTemplateInfo [] TemplateInfo;

    /**
    * Transaction ID
    */
    @SerializedName("TrxId")
    @Expose
    private Long TrxId;

    /**
    * Client port.
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
     * Get Number of affected rows. 
     * @return AffectRows Number of affected rows.
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows.
     * @param AffectRows Number of affected rows.
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get Error code. 
     * @return ErrCode Error code.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code.
     * @param ErrCode Error code.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get SQL type. 
     * @return SqlType SQL type.
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL type.
     * @param SqlType SQL type.
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Table name. 
     * @return TableName Table name.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name.
     * @param TableName Table name.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Audit policy name. 
     * @return PolicyName Audit policy name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Audit policy name.
     * @param PolicyName Audit policy name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Database name. 
     * @return DBName Database name.
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set Database name.
     * @param DBName Database name.
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get SQL statement. 
     * @return Sql SQL statement.
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL statement.
     * @param Sql SQL statement.
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Client address. 
     * @return Host Client address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Client address.
     * @param Host Client address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Username. 
     * @return User Username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username.
     * @param User Username.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Execution time, in microseconds. 
     * @return ExecTime Execution time, in microseconds.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time, in microseconds.
     * @param ExecTime Execution time, in microseconds.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Time. 
     * @return Timestamp Time.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time.
     * @param Timestamp Time.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Number of rows returned. 
     * @return SentRows Number of rows returned.
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set Number of rows returned.
     * @param SentRows Number of rows returned.
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get Execution thread ID. 
     * @return ThreadId Execution thread ID.
     */
    public Long getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set Execution thread ID.
     * @param ThreadId Execution thread ID.
     */
    public void setThreadId(Long ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get Number of scanned rows. 
     * @return CheckRows Number of scanned rows.
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set Number of scanned rows.
     * @param CheckRows Number of scanned rows.
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get cpu execution time, in microseconds. 
     * @return CpuTime cpu execution time, in microseconds.
     */
    public Float getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set cpu execution time, in microseconds.
     * @param CpuTime cpu execution time, in microseconds.
     */
    public void setCpuTime(Float CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get IO wait time, in microseconds. 
     * @return IoWaitTime IO wait time, in microseconds.
     */
    public Long getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set IO wait time, in microseconds.
     * @param IoWaitTime IO wait time, in microseconds.
     */
    public void setIoWaitTime(Long IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get Lock waiting time in microseconds. 
     * @return LockWaitTime Lock waiting time in microseconds.
     */
    public Long getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set Lock waiting time in microseconds.
     * @param LockWaitTime Lock waiting time in microseconds.
     */
    public void setLockWaitTime(Long LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get Transaction continuous waiting time, in µs. 
     * @return TrxLivingTime Transaction continuous waiting time, in µs.
     */
    public Long getTrxLivingTime() {
        return this.TrxLivingTime;
    }

    /**
     * Set Transaction continuous waiting time, in µs.
     * @param TrxLivingTime Transaction continuous waiting time, in µs.
     */
    public void setTrxLivingTime(Long TrxLivingTime) {
        this.TrxLivingTime = TrxLivingTime;
    }

    /**
     * Get Start time. Together with timestamp, it forms a nanosecond-precision time. 
     * @return NsTime Start time. Together with timestamp, it forms a nanosecond-precision time.
     */
    public Long getNsTime() {
        return this.NsTime;
    }

    /**
     * Set Start time. Together with timestamp, it forms a nanosecond-precision time.
     * @param NsTime Start time. Together with timestamp, it forms a nanosecond-precision time.
     */
    public void setNsTime(Long NsTime) {
        this.NsTime = NsTime;
    }

    /**
     * Get Basic information of the log hit rule template 
     * @return TemplateInfo Basic information of the log hit rule template
     */
    public LogRuleTemplateInfo [] getTemplateInfo() {
        return this.TemplateInfo;
    }

    /**
     * Set Basic information of the log hit rule template
     * @param TemplateInfo Basic information of the log hit rule template
     */
    public void setTemplateInfo(LogRuleTemplateInfo [] TemplateInfo) {
        this.TemplateInfo = TemplateInfo;
    }

    /**
     * Get Transaction ID 
     * @return TrxId Transaction ID
     */
    public Long getTrxId() {
        return this.TrxId;
    }

    /**
     * Set Transaction ID
     * @param TrxId Transaction ID
     */
    public void setTrxId(Long TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get Client port. 
     * @return ClientPort Client port.
     */
    public Long getClientPort() {
        return this.ClientPort;
    }

    /**
     * Set Client port.
     * @param ClientPort Client port.
     */
    public void setClientPort(Long ClientPort) {
        this.ClientPort = ClientPort;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new Long(source.ThreadId);
        }
        if (source.CheckRows != null) {
            this.CheckRows = new Long(source.CheckRows);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Float(source.CpuTime);
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long(source.IoWaitTime);
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long(source.LockWaitTime);
        }
        if (source.TrxLivingTime != null) {
            this.TrxLivingTime = new Long(source.TrxLivingTime);
        }
        if (source.NsTime != null) {
            this.NsTime = new Long(source.NsTime);
        }
        if (source.TemplateInfo != null) {
            this.TemplateInfo = new LogRuleTemplateInfo[source.TemplateInfo.length];
            for (int i = 0; i < source.TemplateInfo.length; i++) {
                this.TemplateInfo[i] = new LogRuleTemplateInfo(source.TemplateInfo[i]);
            }
        }
        if (source.TrxId != null) {
            this.TrxId = new Long(source.TrxId);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "CheckRows", this.CheckRows);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "IoWaitTime", this.IoWaitTime);
        this.setParamSimple(map, prefix + "LockWaitTime", this.LockWaitTime);
        this.setParamSimple(map, prefix + "TrxLivingTime", this.TrxLivingTime);
        this.setParamSimple(map, prefix + "NsTime", this.NsTime);
        this.setParamArrayObj(map, prefix + "TemplateInfo.", this.TemplateInfo);
        this.setParamSimple(map, prefix + "TrxId", this.TrxId);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);

    }
}

