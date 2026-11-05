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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentCollaborationConfig extends AbstractModel {

    /**
    * Collaboration mode. Enumeration values: 1: Free transfer: Agents can freely transmit tasks with each other. 2: Workflow orchestration: Collaboration based on predefined processes. 3: Plan-and-Execute: A collaboration mode with separate planning and execution.
    */
    @SerializedName("AgentCollaborationMode")
    @Expose
    private Long AgentCollaborationMode;

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
     * Get Collaboration mode. Enumeration values: 1: Free transfer: Agents can freely transmit tasks with each other. 2: Workflow orchestration: Collaboration based on predefined processes. 3: Plan-and-Execute: A collaboration mode with separate planning and execution. 
     * @return AgentCollaborationMode Collaboration mode. Enumeration values: 1: Free transfer: Agents can freely transmit tasks with each other. 2: Workflow orchestration: Collaboration based on predefined processes. 3: Plan-and-Execute: A collaboration mode with separate planning and execution.
     */
    public Long getAgentCollaborationMode() {
        return this.AgentCollaborationMode;
    }

    /**
     * Set Collaboration mode. Enumeration values: 1: Free transfer: Agents can freely transmit tasks with each other. 2: Workflow orchestration: Collaboration based on predefined processes. 3: Plan-and-Execute: A collaboration mode with separate planning and execution.
     * @param AgentCollaborationMode Collaboration mode. Enumeration values: 1: Free transfer: Agents can freely transmit tasks with each other. 2: Workflow orchestration: Collaboration based on predefined processes. 3: Plan-and-Execute: A collaboration mode with separate planning and execution.
     */
    public void setAgentCollaborationMode(Long AgentCollaborationMode) {
        this.AgentCollaborationMode = AgentCollaborationMode;
    }

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

    public AgentCollaborationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentCollaborationConfig(AgentCollaborationConfig source) {
        if (source.AgentCollaborationMode != null) {
            this.AgentCollaborationMode = new Long(source.AgentCollaborationMode);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentCollaborationMode", this.AgentCollaborationMode);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);

    }
}

