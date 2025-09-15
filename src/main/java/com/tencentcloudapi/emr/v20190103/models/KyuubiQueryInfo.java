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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KyuubiQueryInfo extends AbstractModel {

    /**
    * Submitter IP address.
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Execution duration.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Engine Id
    */
    @SerializedName("EngineID")
    @Expose
    private String EngineID;

    /**
    * Computing engine.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Session Id
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * Start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * Execution status.
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * Execution statement.
    */
    @SerializedName("ExecutionStatement")
    @Expose
    private String ExecutionStatement;

    /**
    * Statement Id
    */
    @SerializedName("StatementID")
    @Expose
    private String StatementID;

    /**
    * User who submits requests.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get Submitter IP address. 
     * @return ClientIP Submitter IP address.
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set Submitter IP address.
     * @param ClientIP Submitter IP address.
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Execution duration. 
     * @return Duration Execution duration.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Execution duration.
     * @param Duration Execution duration.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Engine Id 
     * @return EngineID Engine Id
     */
    public String getEngineID() {
        return this.EngineID;
    }

    /**
     * Set Engine Id
     * @param EngineID Engine Id
     */
    public void setEngineID(String EngineID) {
        this.EngineID = EngineID;
    }

    /**
     * Get Computing engine. 
     * @return EngineType Computing engine.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Computing engine.
     * @param EngineType Computing engine.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Session Id 
     * @return SessionID Session Id
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set Session Id
     * @param SessionID Session Id
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get Start time. 
     * @return BeginTime Start time.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time.
     * @param BeginTime Start time.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Execution status. 
     * @return ExecutionState Execution status.
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set Execution status.
     * @param ExecutionState Execution status.
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get Execution statement. 
     * @return ExecutionStatement Execution statement.
     */
    public String getExecutionStatement() {
        return this.ExecutionStatement;
    }

    /**
     * Set Execution statement.
     * @param ExecutionStatement Execution statement.
     */
    public void setExecutionStatement(String ExecutionStatement) {
        this.ExecutionStatement = ExecutionStatement;
    }

    /**
     * Get Statement Id 
     * @return StatementID Statement Id
     */
    public String getStatementID() {
        return this.StatementID;
    }

    /**
     * Set Statement Id
     * @param StatementID Statement Id
     */
    public void setStatementID(String StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get User who submits requests. 
     * @return User User who submits requests.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User who submits requests.
     * @param User User who submits requests.
     */
    public void setUser(String User) {
        this.User = User;
    }

    public KyuubiQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KyuubiQueryInfo(KyuubiQueryInfo source) {
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EngineID != null) {
            this.EngineID = new String(source.EngineID);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecutionStatement != null) {
            this.ExecutionStatement = new String(source.ExecutionStatement);
        }
        if (source.StatementID != null) {
            this.StatementID = new String(source.StatementID);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EngineID", this.EngineID);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecutionStatement", this.ExecutionStatement);
        this.setParamSimple(map, prefix + "StatementID", this.StatementID);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

