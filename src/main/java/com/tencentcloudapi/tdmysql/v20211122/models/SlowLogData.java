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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogData extends AbstractModel {

    /**
    * <p>Sql execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Sql execution duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * <p>Sql statement</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>Client IP address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Database name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Lock duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * <p>Number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * <p>Result set row count</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * <p>Transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>rpc duration</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RpcTime")
    @Expose
    private Float RpcTime;

    /**
    * <p>rpc duration for node interaction with storage</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageRpcTime")
    @Expose
    private Float StorageRpcTime;

    /**
    * <p>rpc retry latency</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RpcRetryDelayTime")
    @Expose
    private Float RpcRetryDelayTime;

    /**
    * <p>node Name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>rpc link tracing</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RpcTrace")
    @Expose
    private String RpcTrace;

    /**
    * <p>TDStore lock duration</p><p>Unit: seconds</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TDStoreLockTime")
    @Expose
    private Float TDStoreLockTime;

    /**
    * <p>Global ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>Execution plan</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Explain")
    @Expose
    private Explain [] Explain;

    /**
     * Get <p>Sql execution time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp <p>Sql execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Sql execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamp <p>Sql execution time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Sql execution duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueryTime <p>Sql execution duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set <p>Sql execution duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueryTime <p>Sql execution duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get <p>Sql statement</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlText <p>Sql statement</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>Sql statement</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlText <p>Sql statement</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>Client IP address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserHost <p>Client IP address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set <p>Client IP address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserHost <p>Client IP address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName <p>Username.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Database name.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database <p>Database name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Database name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database <p>Database name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Lock duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LockTime <p>Lock duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set <p>Lock duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LockTime <p>Lock duration (seconds)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get <p>Number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsExamined <p>Number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set <p>Number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsExamined <p>Number of scanned rows</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get <p>Result set row count</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsSent <p>Result set row count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set <p>Result set row count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsSent <p>Result set row count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get <p>Transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransactionId <p>Transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>Transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransactionId <p>Transaction ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>rpc duration</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RpcTime <p>rpc duration</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRpcTime() {
        return this.RpcTime;
    }

    /**
     * Set <p>rpc duration</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RpcTime <p>rpc duration</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRpcTime(Float RpcTime) {
        this.RpcTime = RpcTime;
    }

    /**
     * Get <p>rpc duration for node interaction with storage</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageRpcTime <p>rpc duration for node interaction with storage</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getStorageRpcTime() {
        return this.StorageRpcTime;
    }

    /**
     * Set <p>rpc duration for node interaction with storage</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageRpcTime <p>rpc duration for node interaction with storage</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageRpcTime(Float StorageRpcTime) {
        this.StorageRpcTime = StorageRpcTime;
    }

    /**
     * Get <p>rpc retry latency</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RpcRetryDelayTime <p>rpc retry latency</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRpcRetryDelayTime() {
        return this.RpcRetryDelayTime;
    }

    /**
     * Set <p>rpc retry latency</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RpcRetryDelayTime <p>rpc retry latency</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRpcRetryDelayTime(Float RpcRetryDelayTime) {
        this.RpcRetryDelayTime = RpcRetryDelayTime;
    }

    /**
     * Get <p>node Name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId <p>node Name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>node Name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId <p>node Name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>rpc link tracing</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RpcTrace <p>rpc link tracing</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRpcTrace() {
        return this.RpcTrace;
    }

    /**
     * Set <p>rpc link tracing</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RpcTrace <p>rpc link tracing</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRpcTrace(String RpcTrace) {
        this.RpcTrace = RpcTrace;
    }

    /**
     * Get <p>TDStore lock duration</p><p>Unit: seconds</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TDStoreLockTime <p>TDStore lock duration</p><p>Unit: seconds</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTDStoreLockTime() {
        return this.TDStoreLockTime;
    }

    /**
     * Set <p>TDStore lock duration</p><p>Unit: seconds</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TDStoreLockTime <p>TDStore lock duration</p><p>Unit: seconds</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTDStoreLockTime(Float TDStoreLockTime) {
        this.TDStoreLockTime = TDStoreLockTime;
    }

    /**
     * Get <p>Global ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TraceId <p>Global ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>Global ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TraceId <p>Global ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>Execution plan</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Explain <p>Execution plan</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Explain [] getExplain() {
        return this.Explain;
    }

    /**
     * Set <p>Execution plan</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Explain <p>Execution plan</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExplain(Explain [] Explain) {
        this.Explain = Explain;
    }

    public SlowLogData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogData(SlowLogData source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
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
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.RpcTime != null) {
            this.RpcTime = new Float(source.RpcTime);
        }
        if (source.StorageRpcTime != null) {
            this.StorageRpcTime = new Float(source.StorageRpcTime);
        }
        if (source.RpcRetryDelayTime != null) {
            this.RpcRetryDelayTime = new Float(source.RpcRetryDelayTime);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.RpcTrace != null) {
            this.RpcTrace = new String(source.RpcTrace);
        }
        if (source.TDStoreLockTime != null) {
            this.TDStoreLockTime = new Float(source.TDStoreLockTime);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.Explain != null) {
            this.Explain = new Explain[source.Explain.length];
            for (int i = 0; i < source.Explain.length; i++) {
                this.Explain[i] = new Explain(source.Explain[i]);
            }
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
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "RpcTime", this.RpcTime);
        this.setParamSimple(map, prefix + "StorageRpcTime", this.StorageRpcTime);
        this.setParamSimple(map, prefix + "RpcRetryDelayTime", this.RpcRetryDelayTime);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "RpcTrace", this.RpcTrace);
        this.setParamSimple(map, prefix + "TDStoreLockTime", this.TDStoreLockTime);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "Explain.", this.Explain);

    }
}

