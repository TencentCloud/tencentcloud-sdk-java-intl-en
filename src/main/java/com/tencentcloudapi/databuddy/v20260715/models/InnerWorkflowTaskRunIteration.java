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

public class InnerWorkflowTaskRunIteration extends AbstractModel {

    /**
    * <p>Built-in flow running ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

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
    * <p>Running state (for reference, see the workflow execution status enumeration)</p>
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
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>Error code</p>
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * <p>Task operation inside the built-in workflow</p>
    */
    @SerializedName("InnerTaskRun")
    @Expose
    private InnerWorkflowTaskRunIterationBrief InnerTaskRun;

    /**
     * Get <p>Built-in flow running ID</p> 
     * @return WorkflowRunId <p>Built-in flow running ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Built-in flow running ID</p>
     * @param WorkflowRunId <p>Built-in flow running ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
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
     * Get <p>Running state (for reference, see the workflow execution status enumeration)</p> 
     * @return RunState <p>Running state (for reference, see the workflow execution status enumeration)</p>
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>Running state (for reference, see the workflow execution status enumeration)</p>
     * @param RunState <p>Running state (for reference, see the workflow execution status enumeration)</p>
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
     * @return WorkflowParams <p>Running parameter</p>
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>Running parameter</p>
     * @param WorkflowParams <p>Running parameter</p>
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
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

    /**
     * Get <p>Task operation inside the built-in workflow</p> 
     * @return InnerTaskRun <p>Task operation inside the built-in workflow</p>
     */
    public InnerWorkflowTaskRunIterationBrief getInnerTaskRun() {
        return this.InnerTaskRun;
    }

    /**
     * Set <p>Task operation inside the built-in workflow</p>
     * @param InnerTaskRun <p>Task operation inside the built-in workflow</p>
     */
    public void setInnerTaskRun(InnerWorkflowTaskRunIterationBrief InnerTaskRun) {
        this.InnerTaskRun = InnerTaskRun;
    }

    public InnerWorkflowTaskRunIteration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunIteration(InnerWorkflowTaskRunIteration source) {
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
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
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
        if (source.InnerTaskRun != null) {
            this.InnerTaskRun = new InnerWorkflowTaskRunIterationBrief(source.InnerTaskRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "IterationIndex", this.IterationIndex);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamObj(map, prefix + "InnerTaskRun.", this.InnerTaskRun);

    }
}

