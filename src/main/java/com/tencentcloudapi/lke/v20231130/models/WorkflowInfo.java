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
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow name.</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>Workflow run ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>Tab</p>
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>Output result of multiple bubbles</p>
    */
    @SerializedName("Outputs")
    @Expose
    private String [] Outputs;

    /**
    * <p>Workflow release time, unix timestamp.</p>
    */
    @SerializedName("WorkflowReleaseTime")
    @Expose
    private String WorkflowReleaseTime;

    /**
    * <p>Workflow multi-bubble output</p>
    */
    @SerializedName("Contents")
    @Expose
    private Content [] Contents;

    /**
    * <p>Flag indicating whether the tab is single-selection or dual-selection</p><p>Enumeration values:</p><ul><li>0: single selection</li><li>1: multiple selection</li></ul>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
     * Get <p>Workflow ID</p> 
     * @return WorkflowId <p>Workflow ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID</p>
     * @param WorkflowId <p>Workflow ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Workflow name.</p> 
     * @return WorkflowName <p>Workflow name.</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>Workflow name.</p>
     * @param WorkflowName <p>Workflow name.</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>Workflow run ID</p> 
     * @return WorkflowRunId <p>Workflow run ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Workflow run ID</p>
     * @param WorkflowRunId <p>Workflow run ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>Tab</p> 
     * @return OptionCards <p>Tab</p>
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>Tab</p>
     * @param OptionCards <p>Tab</p>
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>Output result of multiple bubbles</p> 
     * @return Outputs <p>Output result of multiple bubbles</p>
     */
    public String [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>Output result of multiple bubbles</p>
     * @param Outputs <p>Output result of multiple bubbles</p>
     */
    public void setOutputs(String [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>Workflow release time, unix timestamp.</p> 
     * @return WorkflowReleaseTime <p>Workflow release time, unix timestamp.</p>
     */
    public String getWorkflowReleaseTime() {
        return this.WorkflowReleaseTime;
    }

    /**
     * Set <p>Workflow release time, unix timestamp.</p>
     * @param WorkflowReleaseTime <p>Workflow release time, unix timestamp.</p>
     */
    public void setWorkflowReleaseTime(String WorkflowReleaseTime) {
        this.WorkflowReleaseTime = WorkflowReleaseTime;
    }

    /**
     * Get <p>Workflow multi-bubble output</p> 
     * @return Contents <p>Workflow multi-bubble output</p>
     */
    public Content [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>Workflow multi-bubble output</p>
     * @param Contents <p>Workflow multi-bubble output</p>
     */
    public void setContents(Content [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get <p>Flag indicating whether the tab is single-selection or dual-selection</p><p>Enumeration values:</p><ul><li>0: single selection</li><li>1: multiple selection</li></ul> 
     * @return OptionMode <p>Flag indicating whether the tab is single-selection or dual-selection</p><p>Enumeration values:</p><ul><li>0: single selection</li><li>1: multiple selection</li></ul>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>Flag indicating whether the tab is single-selection or dual-selection</p><p>Enumeration values:</p><ul><li>0: single selection</li><li>1: multiple selection</li></ul>
     * @param OptionMode <p>Flag indicating whether the tab is single-selection or dual-selection</p><p>Enumeration values:</p><ul><li>0: single selection</li><li>1: multiple selection</li></ul>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
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
        if (source.Contents != null) {
            this.Contents = new Content[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new Content(source.Contents[i]);
            }
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
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
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);

    }
}

