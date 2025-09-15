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

public class StarRocksQueryInfo extends AbstractModel {

    /**
    * Submission IP address.
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * Total CPU time (ns).
    */
    @SerializedName("CPUCost")
    @Expose
    private Long CPUCost;

    /**
    * Default DB.
    */
    @SerializedName("DefaultDB")
    @Expose
    private String DefaultDB;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Execution IP address.
    */
    @SerializedName("ExecutionIP")
    @Expose
    private String ExecutionIP;

    /**
    * Query ID.
    */
    @SerializedName("QueryID")
    @Expose
    private String QueryID;

    /**
    * Query type.
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * Total memory consumed (bytes).
    */
    @SerializedName("MemCost")
    @Expose
    private Long MemCost;

    /**
    * CPU usage (ns) at the plan stage.
    */
    @SerializedName("PlanCpuCosts")
    @Expose
    private Long PlanCpuCosts;

    /**
    * Memory usage (bytes) at the plan stage.
    */
    @SerializedName("PlanMemCosts")
    @Expose
    private Long PlanMemCosts;

    /**
    * Execution duration.
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
    * Resource group.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Number of rows obtained.
    */
    @SerializedName("ReturnRows")
    @Expose
    private Long ReturnRows;

    /**
    * Scanned data volume (bytes).
    */
    @SerializedName("ScanBytes")
    @Expose
    private Long ScanBytes;

    /**
    * Number of scanned rows.
    */
    @SerializedName("ScanRows")
    @Expose
    private Long ScanRows;

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
    * User.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get Submission IP address. 
     * @return ClientIP Submission IP address.
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set Submission IP address.
     * @param ClientIP Submission IP address.
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get Total CPU time (ns). 
     * @return CPUCost Total CPU time (ns).
     */
    public Long getCPUCost() {
        return this.CPUCost;
    }

    /**
     * Set Total CPU time (ns).
     * @param CPUCost Total CPU time (ns).
     */
    public void setCPUCost(Long CPUCost) {
        this.CPUCost = CPUCost;
    }

    /**
     * Get Default DB. 
     * @return DefaultDB Default DB.
     */
    public String getDefaultDB() {
        return this.DefaultDB;
    }

    /**
     * Set Default DB.
     * @param DefaultDB Default DB.
     */
    public void setDefaultDB(String DefaultDB) {
        this.DefaultDB = DefaultDB;
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
     * Get Execution IP address. 
     * @return ExecutionIP Execution IP address.
     */
    public String getExecutionIP() {
        return this.ExecutionIP;
    }

    /**
     * Set Execution IP address.
     * @param ExecutionIP Execution IP address.
     */
    public void setExecutionIP(String ExecutionIP) {
        this.ExecutionIP = ExecutionIP;
    }

    /**
     * Get Query ID. 
     * @return QueryID Query ID.
     */
    public String getQueryID() {
        return this.QueryID;
    }

    /**
     * Set Query ID.
     * @param QueryID Query ID.
     */
    public void setQueryID(String QueryID) {
        this.QueryID = QueryID;
    }

    /**
     * Get Query type. 
     * @return QueryType Query type.
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set Query type.
     * @param QueryType Query type.
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get Total memory consumed (bytes). 
     * @return MemCost Total memory consumed (bytes).
     */
    public Long getMemCost() {
        return this.MemCost;
    }

    /**
     * Set Total memory consumed (bytes).
     * @param MemCost Total memory consumed (bytes).
     */
    public void setMemCost(Long MemCost) {
        this.MemCost = MemCost;
    }

    /**
     * Get CPU usage (ns) at the plan stage. 
     * @return PlanCpuCosts CPU usage (ns) at the plan stage.
     */
    public Long getPlanCpuCosts() {
        return this.PlanCpuCosts;
    }

    /**
     * Set CPU usage (ns) at the plan stage.
     * @param PlanCpuCosts CPU usage (ns) at the plan stage.
     */
    public void setPlanCpuCosts(Long PlanCpuCosts) {
        this.PlanCpuCosts = PlanCpuCosts;
    }

    /**
     * Get Memory usage (bytes) at the plan stage. 
     * @return PlanMemCosts Memory usage (bytes) at the plan stage.
     */
    public Long getPlanMemCosts() {
        return this.PlanMemCosts;
    }

    /**
     * Set Memory usage (bytes) at the plan stage.
     * @param PlanMemCosts Memory usage (bytes) at the plan stage.
     */
    public void setPlanMemCosts(Long PlanMemCosts) {
        this.PlanMemCosts = PlanMemCosts;
    }

    /**
     * Get Execution duration. 
     * @return QueryTime Execution duration.
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Execution duration.
     * @param QueryTime Execution duration.
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Resource group. 
     * @return ResourceGroup Resource group.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource group.
     * @param ResourceGroup Resource group.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Number of rows obtained. 
     * @return ReturnRows Number of rows obtained.
     */
    public Long getReturnRows() {
        return this.ReturnRows;
    }

    /**
     * Set Number of rows obtained.
     * @param ReturnRows Number of rows obtained.
     */
    public void setReturnRows(Long ReturnRows) {
        this.ReturnRows = ReturnRows;
    }

    /**
     * Get Scanned data volume (bytes). 
     * @return ScanBytes Scanned data volume (bytes).
     */
    public Long getScanBytes() {
        return this.ScanBytes;
    }

    /**
     * Set Scanned data volume (bytes).
     * @param ScanBytes Scanned data volume (bytes).
     */
    public void setScanBytes(Long ScanBytes) {
        this.ScanBytes = ScanBytes;
    }

    /**
     * Get Number of scanned rows. 
     * @return ScanRows Number of scanned rows.
     */
    public Long getScanRows() {
        return this.ScanRows;
    }

    /**
     * Set Number of scanned rows.
     * @param ScanRows Number of scanned rows.
     */
    public void setScanRows(Long ScanRows) {
        this.ScanRows = ScanRows;
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
     * Get User. 
     * @return User User.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User.
     * @param User User.
     */
    public void setUser(String User) {
        this.User = User;
    }

    public StarRocksQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StarRocksQueryInfo(StarRocksQueryInfo source) {
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.CPUCost != null) {
            this.CPUCost = new Long(source.CPUCost);
        }
        if (source.DefaultDB != null) {
            this.DefaultDB = new String(source.DefaultDB);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ExecutionIP != null) {
            this.ExecutionIP = new String(source.ExecutionIP);
        }
        if (source.QueryID != null) {
            this.QueryID = new String(source.QueryID);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.MemCost != null) {
            this.MemCost = new Long(source.MemCost);
        }
        if (source.PlanCpuCosts != null) {
            this.PlanCpuCosts = new Long(source.PlanCpuCosts);
        }
        if (source.PlanMemCosts != null) {
            this.PlanMemCosts = new Long(source.PlanMemCosts);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ReturnRows != null) {
            this.ReturnRows = new Long(source.ReturnRows);
        }
        if (source.ScanBytes != null) {
            this.ScanBytes = new Long(source.ScanBytes);
        }
        if (source.ScanRows != null) {
            this.ScanRows = new Long(source.ScanRows);
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
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "CPUCost", this.CPUCost);
        this.setParamSimple(map, prefix + "DefaultDB", this.DefaultDB);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionIP", this.ExecutionIP);
        this.setParamSimple(map, prefix + "QueryID", this.QueryID);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "MemCost", this.MemCost);
        this.setParamSimple(map, prefix + "PlanCpuCosts", this.PlanCpuCosts);
        this.setParamSimple(map, prefix + "PlanMemCosts", this.PlanMemCosts);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ReturnRows", this.ReturnRows);
        this.setParamSimple(map, prefix + "ScanBytes", this.ScanBytes);
        this.setParamSimple(map, prefix + "ScanRows", this.ScanRows);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecutionStatement", this.ExecutionStatement);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

