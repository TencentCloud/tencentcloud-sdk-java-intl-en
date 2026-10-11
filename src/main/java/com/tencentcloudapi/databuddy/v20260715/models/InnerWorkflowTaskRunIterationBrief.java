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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InnerWorkflowTaskRunIterationBrief extends AbstractModel {

    /**
    * <p>Task running ID</p>
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * <p>Iteration serial number</p>
    */
    @SerializedName("IterationIndex")
    @Expose
    private String IterationIndex;

    /**
    * <p>Start time in milliseconds.</p>
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>Running end time, unit: timestamp in milliseconds</p>
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * <p>Running state</p>
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * <p>Running time, unit: seconds</p>
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * <p>Running parameter</p>
    */
    @SerializedName("TaskParams")
    @Expose
    private String TaskParams;

    /**
    * <p>Error code</p>
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
     * Get <p>Task running ID</p> 
     * @return WorkflowTaskRunId <p>Task running ID</p>
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>Task running ID</p>
     * @param WorkflowTaskRunId <p>Task running ID</p>
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get <p>Iteration serial number</p> 
     * @return IterationIndex <p>Iteration serial number</p>
     */
    public String getIterationIndex() {
        return this.IterationIndex;
    }

    /**
     * Set <p>Iteration serial number</p>
     * @param IterationIndex <p>Iteration serial number</p>
     */
    public void setIterationIndex(String IterationIndex) {
        this.IterationIndex = IterationIndex;
    }

    /**
     * Get <p>Start time in milliseconds.</p> 
     * @return RunStartTime <p>Start time in milliseconds.</p>
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set <p>Start time in milliseconds.</p>
     * @param RunStartTime <p>Start time in milliseconds.</p>
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>Running end time, unit: timestamp in milliseconds</p> 
     * @return RunEndTime <p>Running end time, unit: timestamp in milliseconds</p>
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set <p>Running end time, unit: timestamp in milliseconds</p>
     * @param RunEndTime <p>Running end time, unit: timestamp in milliseconds</p>
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * Get <p>Running state</p> 
     * @return RunState <p>Running state</p>
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>Running state</p>
     * @param RunState <p>Running state</p>
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get <p>Running time, unit: seconds</p> 
     * @return RunCostTime <p>Running time, unit: seconds</p>
     */
    public String getRunCostTime() {
        return this.RunCostTime;
    }

    /**
     * Set <p>Running time, unit: seconds</p>
     * @param RunCostTime <p>Running time, unit: seconds</p>
     */
    public void setRunCostTime(String RunCostTime) {
        this.RunCostTime = RunCostTime;
    }

    /**
     * Get <p>Running parameter</p> 
     * @return TaskParams <p>Running parameter</p>
     */
    public String getTaskParams() {
        return this.TaskParams;
    }

    /**
     * Set <p>Running parameter</p>
     * @param TaskParams <p>Running parameter</p>
     */
    public void setTaskParams(String TaskParams) {
        this.TaskParams = TaskParams;
    }

    /**
     * Get <p>Error code</p> 
     * @return ErrorCodeString <p>Error code</p>
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set <p>Error code</p>
     * @param ErrorCodeString <p>Error code</p>
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    public InnerWorkflowTaskRunIterationBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunIterationBrief(InnerWorkflowTaskRunIterationBrief source) {
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
        }
        if (source.IterationIndex != null) {
            this.IterationIndex = new String(source.IterationIndex);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.TaskParams != null) {
            this.TaskParams = new String(source.TaskParams);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamSimple(map, prefix + "IterationIndex", this.IterationIndex);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "TaskParams", this.TaskParams);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);

    }
}

