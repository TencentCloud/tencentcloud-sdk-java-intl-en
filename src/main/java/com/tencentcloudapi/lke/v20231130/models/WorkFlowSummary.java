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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkFlowSummary extends AbstractModel {

    /**
    * Workflow ID.
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
    * Workflow running ID.
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * Node information.
    */
    @SerializedName("RunNodes")
    @Expose
    private WorkflowRunNodeInfo [] RunNodes;

    /**
    * Tab.
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * Output results of multiple bubbles.
    */
    @SerializedName("Outputs")
    @Expose
    private String [] Outputs;

    /**
    * Workflow release time, Unix timestamp.
    */
    @SerializedName("WorkflowReleaseTime")
    @Expose
    private String WorkflowReleaseTime;

    /**
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
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
     * Get Workflow running ID. 
     * @return WorkflowRunId Workflow running ID.
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set Workflow running ID.
     * @param WorkflowRunId Workflow running ID.
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get Node information. 
     * @return RunNodes Node information.
     */
    public WorkflowRunNodeInfo [] getRunNodes() {
        return this.RunNodes;
    }

    /**
     * Set Node information.
     * @param RunNodes Node information.
     */
    public void setRunNodes(WorkflowRunNodeInfo [] RunNodes) {
        this.RunNodes = RunNodes;
    }

    /**
     * Get Tab. 
     * @return OptionCards Tab.
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set Tab.
     * @param OptionCards Tab.
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get Output results of multiple bubbles. 
     * @return Outputs Output results of multiple bubbles.
     */
    public String [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output results of multiple bubbles.
     * @param Outputs Output results of multiple bubbles.
     */
    public void setOutputs(String [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get Workflow release time, Unix timestamp. 
     * @return WorkflowReleaseTime Workflow release time, Unix timestamp.
     */
    public String getWorkflowReleaseTime() {
        return this.WorkflowReleaseTime;
    }

    /**
     * Set Workflow release time, Unix timestamp.
     * @param WorkflowReleaseTime Workflow release time, Unix timestamp.
     */
    public void setWorkflowReleaseTime(String WorkflowReleaseTime) {
        this.WorkflowReleaseTime = WorkflowReleaseTime;
    }

    public WorkFlowSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkFlowSummary(WorkFlowSummary source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunNodes != null) {
            this.RunNodes = new WorkflowRunNodeInfo[source.RunNodes.length];
            for (int i = 0; i < source.RunNodes.length; i++) {
                this.RunNodes[i] = new WorkflowRunNodeInfo(source.RunNodes[i]);
            }
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new String[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new String(source.Outputs[i]);
            }
        }
        if (source.WorkflowReleaseTime != null) {
            this.WorkflowReleaseTime = new String(source.WorkflowReleaseTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamArrayObj(map, prefix + "RunNodes.", this.RunNodes);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamArraySimple(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "WorkflowReleaseTime", this.WorkflowReleaseTime);

    }
}

