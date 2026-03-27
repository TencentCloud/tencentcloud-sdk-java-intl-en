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

public class WorkflowInfo extends AbstractModel {

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow Name
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow Run ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * Tab
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * Multi-bubble output results
    */
    @SerializedName("Outputs")
    @Expose
    private String [] Outputs;

    /**
    * Workflow Publish Time, unix timestamp
    */
    @SerializedName("WorkflowReleaseTime")
    @Expose
    private String WorkflowReleaseTime;

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
     * Get Workflow Name 
     * @return WorkflowName Workflow Name
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow Name
     * @param WorkflowName Workflow Name
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Workflow Run ID 
     * @return WorkflowRunId Workflow Run ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set Workflow Run ID
     * @param WorkflowRunId Workflow Run ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get Tab 
     * @return OptionCards Tab
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set Tab
     * @param OptionCards Tab
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get Multi-bubble output results 
     * @return Outputs Multi-bubble output results
     */
    public String [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Multi-bubble output results
     * @param Outputs Multi-bubble output results
     */
    public void setOutputs(String [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get Workflow Publish Time, unix timestamp 
     * @return WorkflowReleaseTime Workflow Publish Time, unix timestamp
     */
    public String getWorkflowReleaseTime() {
        return this.WorkflowReleaseTime;
    }

    /**
     * Set Workflow Publish Time, unix timestamp
     * @param WorkflowReleaseTime Workflow Publish Time, unix timestamp
     */
    public void setWorkflowReleaseTime(String WorkflowReleaseTime) {
        this.WorkflowReleaseTime = WorkflowReleaseTime;
    }

    public WorkflowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowInfo(WorkflowInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
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
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamArraySimple(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "WorkflowReleaseTime", this.WorkflowReleaseTime);

    }
}

