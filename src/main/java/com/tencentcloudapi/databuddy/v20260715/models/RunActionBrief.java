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

public class RunActionBrief extends AbstractModel {

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Operation action ID, used to trace the specific executed action.
    */
    @SerializedName("RunActionId")
    @Expose
    private String RunActionId;

    /**
    * Failure error message. When the operation fails, a specific error description is returned.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Operation status. `true` indicates success, and `false` indicates failure.
    */
    @SerializedName("OpStatus")
    @Expose
    private Boolean OpStatus;

    /**
    * Workflow running ID. In rerun/termination scenarios, the operated running ID is returned. It is empty in the run workflow scenario.
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name. 
     * @return WorkflowName Workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
     * @param WorkflowName Workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Operation action ID, used to trace the specific executed action. 
     * @return RunActionId Operation action ID, used to trace the specific executed action.
     */
    public String getRunActionId() {
        return this.RunActionId;
    }

    /**
     * Set Operation action ID, used to trace the specific executed action.
     * @param RunActionId Operation action ID, used to trace the specific executed action.
     */
    public void setRunActionId(String RunActionId) {
        this.RunActionId = RunActionId;
    }

    /**
     * Get Failure error message. When the operation fails, a specific error description is returned. 
     * @return ErrorMessage Failure error message. When the operation fails, a specific error description is returned.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Failure error message. When the operation fails, a specific error description is returned.
     * @param ErrorMessage Failure error message. When the operation fails, a specific error description is returned.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Operation status. `true` indicates success, and `false` indicates failure. 
     * @return OpStatus Operation status. `true` indicates success, and `false` indicates failure.
     */
    public Boolean getOpStatus() {
        return this.OpStatus;
    }

    /**
     * Set Operation status. `true` indicates success, and `false` indicates failure.
     * @param OpStatus Operation status. `true` indicates success, and `false` indicates failure.
     */
    public void setOpStatus(Boolean OpStatus) {
        this.OpStatus = OpStatus;
    }

    /**
     * Get Workflow running ID. In rerun/termination scenarios, the operated running ID is returned. It is empty in the run workflow scenario. 
     * @return WorkflowRunId Workflow running ID. In rerun/termination scenarios, the operated running ID is returned. It is empty in the run workflow scenario.
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set Workflow running ID. In rerun/termination scenarios, the operated running ID is returned. It is empty in the run workflow scenario.
     * @param WorkflowRunId Workflow running ID. In rerun/termination scenarios, the operated running ID is returned. It is empty in the run workflow scenario.
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public RunActionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunActionBrief(RunActionBrief source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RunActionId != null) {
            this.RunActionId = new String(source.RunActionId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.OpStatus != null) {
            this.OpStatus = new Boolean(source.OpStatus);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RunActionId", this.RunActionId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "OpStatus", this.OpStatus);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

