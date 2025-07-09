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

public class ProcedureDebugging extends AbstractModel {

    /**
    * Retrieve query.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * System prompt.
    */
    @SerializedName("System")
    @Expose
    private String System;

    /**
    * Multiple rounds of historical information.
    */
    @SerializedName("Histories")
    @Expose
    private HistorySummary [] Histories;

    /**
    * Retrieve knowledge.
    */
    @SerializedName("Knowledge")
    @Expose
    private KnowledgeSummary [] Knowledge;

    /**
    * Task process.
    */
    @SerializedName("TaskFlow")
    @Expose
    private TaskFlowSummary TaskFlow;

    /**
    * Workflow debugging information.
    */
    @SerializedName("WorkFlow")
    @Expose
    private WorkFlowSummary WorkFlow;

    /**
    * Agent debugging information.
    */
    @SerializedName("Agent")
    @Expose
    private AgentDebugInfo Agent;

    /**
    * Custom parameter.
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
     * Get Retrieve query. 
     * @return Content Retrieve query.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Retrieve query.
     * @param Content Retrieve query.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get System prompt. 
     * @return System System prompt.
     */
    public String getSystem() {
        return this.System;
    }

    /**
     * Set System prompt.
     * @param System System prompt.
     */
    public void setSystem(String System) {
        this.System = System;
    }

    /**
     * Get Multiple rounds of historical information. 
     * @return Histories Multiple rounds of historical information.
     */
    public HistorySummary [] getHistories() {
        return this.Histories;
    }

    /**
     * Set Multiple rounds of historical information.
     * @param Histories Multiple rounds of historical information.
     */
    public void setHistories(HistorySummary [] Histories) {
        this.Histories = Histories;
    }

    /**
     * Get Retrieve knowledge. 
     * @return Knowledge Retrieve knowledge.
     */
    public KnowledgeSummary [] getKnowledge() {
        return this.Knowledge;
    }

    /**
     * Set Retrieve knowledge.
     * @param Knowledge Retrieve knowledge.
     */
    public void setKnowledge(KnowledgeSummary [] Knowledge) {
        this.Knowledge = Knowledge;
    }

    /**
     * Get Task process. 
     * @return TaskFlow Task process.
     */
    public TaskFlowSummary getTaskFlow() {
        return this.TaskFlow;
    }

    /**
     * Set Task process.
     * @param TaskFlow Task process.
     */
    public void setTaskFlow(TaskFlowSummary TaskFlow) {
        this.TaskFlow = TaskFlow;
    }

    /**
     * Get Workflow debugging information. 
     * @return WorkFlow Workflow debugging information.
     */
    public WorkFlowSummary getWorkFlow() {
        return this.WorkFlow;
    }

    /**
     * Set Workflow debugging information.
     * @param WorkFlow Workflow debugging information.
     */
    public void setWorkFlow(WorkFlowSummary WorkFlow) {
        this.WorkFlow = WorkFlow;
    }

    /**
     * Get Agent debugging information. 
     * @return Agent Agent debugging information.
     */
    public AgentDebugInfo getAgent() {
        return this.Agent;
    }

    /**
     * Set Agent debugging information.
     * @param Agent Agent debugging information.
     */
    public void setAgent(AgentDebugInfo Agent) {
        this.Agent = Agent;
    }

    /**
     * Get Custom parameter. 
     * @return CustomVariables Custom parameter.
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set Custom parameter.
     * @param CustomVariables Custom parameter.
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    public ProcedureDebugging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureDebugging(ProcedureDebugging source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.System != null) {
            this.System = new String(source.System);
        }
        if (source.Histories != null) {
            this.Histories = new HistorySummary[source.Histories.length];
            for (int i = 0; i < source.Histories.length; i++) {
                this.Histories[i] = new HistorySummary(source.Histories[i]);
            }
        }
        if (source.Knowledge != null) {
            this.Knowledge = new KnowledgeSummary[source.Knowledge.length];
            for (int i = 0; i < source.Knowledge.length; i++) {
                this.Knowledge[i] = new KnowledgeSummary(source.Knowledge[i]);
            }
        }
        if (source.TaskFlow != null) {
            this.TaskFlow = new TaskFlowSummary(source.TaskFlow);
        }
        if (source.WorkFlow != null) {
            this.WorkFlow = new WorkFlowSummary(source.WorkFlow);
        }
        if (source.Agent != null) {
            this.Agent = new AgentDebugInfo(source.Agent);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new String[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new String(source.CustomVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "System", this.System);
        this.setParamArrayObj(map, prefix + "Histories.", this.Histories);
        this.setParamArrayObj(map, prefix + "Knowledge.", this.Knowledge);
        this.setParamObj(map, prefix + "TaskFlow.", this.TaskFlow);
        this.setParamObj(map, prefix + "WorkFlow.", this.WorkFlow);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "CustomVariables.", this.CustomVariables);

    }
}

