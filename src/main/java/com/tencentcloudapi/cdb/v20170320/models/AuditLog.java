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

public class AuditLog extends AbstractModel {

    /**
    * Number of affected rows
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * The error code
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Audit policy name, which will be unavailable soon.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Client address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Execution time (μs)
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Time
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Number of returned rows
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * Thread ID
    */
    @SerializedName("ThreadId")
    @Expose
    private Long ThreadId;

    /**
    * Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * CPU execution time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuTime")
    @Expose
    private Float CpuTime;

    /**
    * IO wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long IoWaitTime;

    /**
    * Lock wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long LockWaitTime;

    /**
    * Start time, which forms a time accurate to nanoseconds with·`timestamp`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NsTime")
    @Expose
    private Long NsTime;

    /**
    * Transaction duration (μs)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrxLivingTime")
    @Expose
    private Long TrxLivingTime;

    /**
    * Basic information on the rule template hit by the log.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("TemplateInfo")
    @Expose
    private LogRuleTemplateInfo [] TemplateInfo;

    /**
     * Get Number of affected rows 
     * @return AffectRows Number of affected rows
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows
     * @param AffectRows Number of affected rows
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get The error code 
     * @return ErrCode The error code
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set The error code
     * @param ErrCode The error code
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get  
     * @return SqlType 
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set 
     * @param SqlType 
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Audit policy name, which will be unavailable soon. 
     * @return PolicyName Audit policy name, which will be unavailable soon.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Audit policy name, which will be unavailable soon.
     * @param PolicyName Audit policy name, which will be unavailable soon.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get  
     * @return DBName 
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 
     * @param DBName 
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get  
     * @return Sql 
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 
     * @param Sql 
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Client address 
     * @return Host Client address
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Client address
     * @param Host Client address
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Username 
     * @return User Username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username
     * @param User Username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Execution time (μs) 
     * @return ExecTime Execution time (μs)
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time (μs)
     * @param ExecTime Execution time (μs)
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Time 
     * @return Timestamp Time
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time
     * @param Timestamp Time
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Number of returned rows 
     * @return SentRows Number of returned rows
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set Number of returned rows
     * @param SentRows Number of returned rows
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get Thread ID 
     * @return ThreadId Thread ID
     */
    public Long getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set Thread ID
     * @param ThreadId Thread ID
     */
    public void setThreadId(Long ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckRows Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckRows Number of scanned rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get CPU execution time (μs)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuTime CPU execution time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set CPU execution time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuTime CPU execution time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuTime(Float CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get IO wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IoWaitTime IO wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set IO wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IoWaitTime IO wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIoWaitTime(Long IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get Lock wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LockWaitTime Lock wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set Lock wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LockWaitTime Lock wait time (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLockWaitTime(Long LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get Start time, which forms a time accurate to nanoseconds with·`timestamp`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NsTime Start time, which forms a time accurate to nanoseconds with·`timestamp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNsTime() {
        return this.NsTime;
    }

    /**
     * Set Start time, which forms a time accurate to nanoseconds with·`timestamp`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NsTime Start time, which forms a time accurate to nanoseconds with·`timestamp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNsTime(Long NsTime) {
        this.NsTime = NsTime;
    }

    /**
     * Get Transaction duration (μs)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrxLivingTime Transaction duration (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTrxLivingTime() {
        return this.TrxLivingTime;
    }

    /**
     * Set Transaction duration (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrxLivingTime Transaction duration (μs)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrxLivingTime(Long TrxLivingTime) {
        this.TrxLivingTime = TrxLivingTime;
    }

    /**
     * Get Basic information on the rule template hit by the log.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return TemplateInfo Basic information on the rule template hit by the log.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public LogRuleTemplateInfo [] getTemplateInfo() {
        return this.TemplateInfo;
    }

    /**
     * Set Basic information on the rule template hit by the log.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param TemplateInfo Basic information on the rule template hit by the log.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setTemplateInfo(LogRuleTemplateInfo [] TemplateInfo) {
        this.TemplateInfo = TemplateInfo;
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
        if (source.NsTime != null) {
            this.NsTime = new Long(source.NsTime);
        }
        if (source.TrxLivingTime != null) {
            this.TrxLivingTime = new Long(source.TrxLivingTime);
        }
        if (source.TemplateInfo != null) {
            this.TemplateInfo = new LogRuleTemplateInfo[source.TemplateInfo.length];
            for (int i = 0; i < source.TemplateInfo.length; i++) {
                this.TemplateInfo[i] = new LogRuleTemplateInfo(source.TemplateInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
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
        this.setParamSimple(map, prefix + "NsTime", this.NsTime);
        this.setParamSimple(map, prefix + "TrxLivingTime", this.TrxLivingTime);
        this.setParamArrayObj(map, prefix + "TemplateInfo.", this.TemplateInfo);

    }
}

