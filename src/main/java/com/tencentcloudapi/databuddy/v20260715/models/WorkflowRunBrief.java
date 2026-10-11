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

public class WorkflowRunBrief extends AbstractModel {

    /**
    * Workflow running ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * Start time in milliseconds.
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("SUCCESS"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * Runtime error code
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
     * Get Workflow running ID 
     * @return WorkflowRunId Workflow running ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set Workflow running ID
     * @param WorkflowRunId Workflow running ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get Start time in milliseconds. 
     * @return RunStartTime Start time in milliseconds.
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set Start time in milliseconds.
     * @param RunStartTime Start time in milliseconds.
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("SUCCESS"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p> 
     * @return RunState <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("SUCCESS"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("SUCCESS"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     * @param RunState <p>RUNNING state. CREATE("initialization"), QUEUED("Waiting"), PENDING("preparing"), RUNNING("RUNNING"), SKIPPED("skip RUNNING"), SUCCESS("SUCCESS"), FAILED("failure"), TERMINATING("TERMINATING"), TERMINATED("termination"), CANCELLED("manual termination"), etc.</p>
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get Runtime error code 
     * @return ErrorCodeString Runtime error code
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set Runtime error code
     * @param ErrorCodeString Runtime error code
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    public WorkflowRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunBrief(WorkflowRunBrief source) {
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);

    }
}

