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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionInfo extends AbstractModel {

    /**
    * <p>Task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Execution ID</p>
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Session ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Trigger type: manual / cron / webhook</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Status: pending/running/completed/failed/timeout/cancelled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Execution Abstract</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>Execution time (ms)</p>
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
     * Get <p>Task name</p> 
     * @return Name <p>Task name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name</p>
     * @param Name <p>Task name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Execution ID</p> 
     * @return ExecutionId <p>Execution ID</p>
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>Execution ID</p>
     * @param ExecutionId <p>Execution ID</p>
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>Agent ID</p> 
     * @return AgentId <p>Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
     * @param AgentId <p>Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Session ID</p> 
     * @return SessionId <p>Session ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID</p>
     * @param SessionId <p>Session ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Trigger type: manual / cron / webhook</p> 
     * @return TriggerType <p>Trigger type: manual / cron / webhook</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger type: manual / cron / webhook</p>
     * @param TriggerType <p>Trigger type: manual / cron / webhook</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Status: pending/running/completed/failed/timeout/cancelled</p> 
     * @return Status <p>Status: pending/running/completed/failed/timeout/cancelled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status: pending/running/completed/failed/timeout/cancelled</p>
     * @param Status <p>Status: pending/running/completed/failed/timeout/cancelled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Execution Abstract</p> 
     * @return Summary <p>Execution Abstract</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>Execution Abstract</p>
     * @param Summary <p>Execution Abstract</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>Execution time (ms)</p> 
     * @return DurationMs <p>Execution time (ms)</p>
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>Execution time (ms)</p>
     * @param DurationMs <p>Execution time (ms)</p>
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    public ExecutionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionInfo(ExecutionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);

    }
}

