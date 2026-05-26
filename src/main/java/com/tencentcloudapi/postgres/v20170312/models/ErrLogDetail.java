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

public class ErrLogDetail extends AbstractModel {

    /**
    * <p>userName</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Database name</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Error occurrence time</p>
    */
    @SerializedName("ErrTime")
    @Expose
    private String ErrTime;

    /**
    * <p>Error message</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>Process ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * <p>client address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * <p>Session ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Session start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
    * <p>Virtual transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualTransactionId")
    @Expose
    private String VirtualTransactionId;

    /**
    * <p>SQLSTATE error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlStateCode")
    @Expose
    private String SqlStateCode;

    /**
    * <p>client application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get <p>userName</p> 
     * @return UserName <p>userName</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>userName</p>
     * @param UserName <p>userName</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Database name</p> 
     * @return Database <p>Database name</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Database name</p>
     * @param Database <p>Database name</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Error occurrence time</p> 
     * @return ErrTime <p>Error occurrence time</p>
     */
    public String getErrTime() {
        return this.ErrTime;
    }

    /**
     * Set <p>Error occurrence time</p>
     * @param ErrTime <p>Error occurrence time</p>
     */
    public void setErrTime(String ErrTime) {
        this.ErrTime = ErrTime;
    }

    /**
     * Get <p>Error message</p> 
     * @return ErrMsg <p>Error message</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error message</p>
     * @param ErrMsg <p>Error message</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>Process ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessId <p>Process ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>Process ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessId <p>Process ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>client address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientAddr <p>client address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set <p>client address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientAddr <p>client address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get <p>Session ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionId <p>Session ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionId <p>Session ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Session start time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionStartTime <p>Session start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set <p>Session start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionStartTime <p>Session start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
    }

    /**
     * Get <p>Virtual transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirtualTransactionId <p>Virtual transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirtualTransactionId() {
        return this.VirtualTransactionId;
    }

    /**
     * Set <p>Virtual transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirtualTransactionId <p>Virtual transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualTransactionId(String VirtualTransactionId) {
        this.VirtualTransactionId = VirtualTransactionId;
    }

    /**
     * Get <p>SQLSTATE error code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlStateCode <p>SQLSTATE error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlStateCode() {
        return this.SqlStateCode;
    }

    /**
     * Set <p>SQLSTATE error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlStateCode <p>SQLSTATE error code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlStateCode(String SqlStateCode) {
        this.SqlStateCode = SqlStateCode;
    }

    /**
     * Get <p>client application name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName <p>client application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>client application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName <p>client application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public ErrLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrLogDetail(ErrLogDetail source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.ErrTime != null) {
            this.ErrTime = new String(source.ErrTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionStartTime != null) {
            this.SessionStartTime = new String(source.SessionStartTime);
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
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrTime", this.ErrTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionStartTime", this.SessionStartTime);
        this.setParamSimple(map, prefix + "VirtualTransactionId", this.VirtualTransactionId);
        this.setParamSimple(map, prefix + "SqlStateCode", this.SqlStateCode);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

