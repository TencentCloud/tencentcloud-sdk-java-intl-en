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

public class RawSlowQuery extends AbstractModel {

    /**
    * <p>Slow SQL statement</p>
    */
    @SerializedName("RawQuery")
    @Expose
    private String RawQuery;

    /**
    * <p>Database for slow SQL queries</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>Slow SQL execution duration</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>Client that executes Slow SQL</p>
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * <p>userName that executes slow SQL</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Start time of Slow SQL execution</p>
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
    * <p>Process ID of the slow SQL being executed</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * <p>Session ID that executes slow SQL.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Transaction ID of the executed slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualTransactionId")
    @Expose
    private String VirtualTransactionId;

    /**
    * <p>Status code for executing slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlStateCode")
    @Expose
    private String SqlStateCode;

    /**
    * <p>client name that executes slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get <p>Slow SQL statement</p> 
     * @return RawQuery <p>Slow SQL statement</p>
     */
    public String getRawQuery() {
        return this.RawQuery;
    }

    /**
     * Set <p>Slow SQL statement</p>
     * @param RawQuery <p>Slow SQL statement</p>
     */
    public void setRawQuery(String RawQuery) {
        this.RawQuery = RawQuery;
    }

    /**
     * Get <p>Database for slow SQL queries</p> 
     * @return DatabaseName <p>Database for slow SQL queries</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>Database for slow SQL queries</p>
     * @param DatabaseName <p>Database for slow SQL queries</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>Slow SQL execution duration</p> 
     * @return Duration <p>Slow SQL execution duration</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Slow SQL execution duration</p>
     * @param Duration <p>Slow SQL execution duration</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Client that executes Slow SQL</p> 
     * @return ClientAddr <p>Client that executes Slow SQL</p>
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set <p>Client that executes Slow SQL</p>
     * @param ClientAddr <p>Client that executes Slow SQL</p>
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get <p>userName that executes slow SQL</p> 
     * @return UserName <p>userName that executes slow SQL</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>userName that executes slow SQL</p>
     * @param UserName <p>userName that executes slow SQL</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Start time of Slow SQL execution</p> 
     * @return SessionStartTime <p>Start time of Slow SQL execution</p>
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set <p>Start time of Slow SQL execution</p>
     * @param SessionStartTime <p>Start time of Slow SQL execution</p>
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
    }

    /**
     * Get <p>Process ID of the slow SQL being executed</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessId <p>Process ID of the slow SQL being executed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>Process ID of the slow SQL being executed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessId <p>Process ID of the slow SQL being executed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>Session ID that executes slow SQL.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionId <p>Session ID that executes slow SQL.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID that executes slow SQL.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionId <p>Session ID that executes slow SQL.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Transaction ID of the executed slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirtualTransactionId <p>Transaction ID of the executed slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirtualTransactionId() {
        return this.VirtualTransactionId;
    }

    /**
     * Set <p>Transaction ID of the executed slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirtualTransactionId <p>Transaction ID of the executed slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualTransactionId(String VirtualTransactionId) {
        this.VirtualTransactionId = VirtualTransactionId;
    }

    /**
     * Get <p>Status code for executing slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlStateCode <p>Status code for executing slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlStateCode() {
        return this.SqlStateCode;
    }

    /**
     * Set <p>Status code for executing slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlStateCode <p>Status code for executing slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlStateCode(String SqlStateCode) {
        this.SqlStateCode = SqlStateCode;
    }

    /**
     * Get <p>client name that executes slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName <p>client name that executes slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>client name that executes slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName <p>client name that executes slow SQL</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public RawSlowQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSlowQuery(RawSlowQuery source) {
        if (source.RawQuery != null) {
            this.RawQuery = new String(source.RawQuery);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SessionStartTime != null) {
            this.SessionStartTime = new String(source.SessionStartTime);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.VirtualTransactionId != null) {
            this.VirtualTransactionId = new String(source.VirtualTransactionId);
        }
        if (source.SqlStateCode != null) {
            this.SqlStateCode = new String(source.SqlStateCode);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RawQuery", this.RawQuery);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SessionStartTime", this.SessionStartTime);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "VirtualTransactionId", this.VirtualTransactionId);
        this.setParamSimple(map, prefix + "SqlStateCode", this.SqlStateCode);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

