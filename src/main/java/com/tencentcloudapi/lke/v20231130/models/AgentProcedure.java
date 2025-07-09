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

public class AgentProcedure extends AbstractModel {

    /**
    * Index.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * English name of the execution process.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Chinese name for display.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Status constant: processing; success; failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Icon.
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * Agent debugging information.
    */
    @SerializedName("Debugging")
    @Expose
    private AgentProcedureDebugging Debugging;

    /**
    * Whether to switch to Agent. The value can be "main" or "workflow". Leave it blank for no switch.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Current request execution time, in milliseconds.
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * Workflow node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Used to display in which reply bubble the thoughts are placed.
    */
    @SerializedName("ReplyIndex")
    @Expose
    private Long ReplyIndex;

    /**
    * Main agent.
    */
    @SerializedName("SourceAgentName")
    @Expose
    private String SourceAgentName;

    /**
    * Registration agent.
    */
    @SerializedName("TargetAgentName")
    @Expose
    private String TargetAgentName;

    /**
    * Icon of Agent.
    */
    @SerializedName("AgentIcon")
    @Expose
    private String AgentIcon;

    /**
     * Get Index. 
     * @return Index Index.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Index.
     * @param Index Index.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get English name of the execution process. 
     * @return Name English name of the execution process.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set English name of the execution process.
     * @param Name English name of the execution process.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Chinese name for display. 
     * @return Title Chinese name for display.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Chinese name for display.
     * @param Title Chinese name for display.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Status constant: processing; success; failed. 
     * @return Status Status constant: processing; success; failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status constant: processing; success; failed.
     * @param Status Status constant: processing; success; failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Icon. 
     * @return Icon Icon.
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set Icon.
     * @param Icon Icon.
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get Agent debugging information. 
     * @return Debugging Agent debugging information.
     */
    public AgentProcedureDebugging getDebugging() {
        return this.Debugging;
    }

    /**
     * Set Agent debugging information.
     * @param Debugging Agent debugging information.
     */
    public void setDebugging(AgentProcedureDebugging Debugging) {
        this.Debugging = Debugging;
    }

    /**
     * Get Whether to switch to Agent. The value can be "main" or "workflow". Leave it blank for no switch. 
     * @return Switch Whether to switch to Agent. The value can be "main" or "workflow". Leave it blank for no switch.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to switch to Agent. The value can be "main" or "workflow". Leave it blank for no switch.
     * @param Switch Whether to switch to Agent. The value can be "main" or "workflow". Leave it blank for no switch.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
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
     * Get Current request execution time, in milliseconds. 
     * @return Elapsed Current request execution time, in milliseconds.
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set Current request execution time, in milliseconds.
     * @param Elapsed Current request execution time, in milliseconds.
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get Workflow node name. 
     * @return NodeName Workflow node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Workflow node name.
     * @param NodeName Workflow node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Used to display in which reply bubble the thoughts are placed. 
     * @return ReplyIndex Used to display in which reply bubble the thoughts are placed.
     */
    public Long getReplyIndex() {
        return this.ReplyIndex;
    }

    /**
     * Set Used to display in which reply bubble the thoughts are placed.
     * @param ReplyIndex Used to display in which reply bubble the thoughts are placed.
     */
    public void setReplyIndex(Long ReplyIndex) {
        this.ReplyIndex = ReplyIndex;
    }

    /**
     * Get Main agent. 
     * @return SourceAgentName Main agent.
     */
    public String getSourceAgentName() {
        return this.SourceAgentName;
    }

    /**
     * Set Main agent.
     * @param SourceAgentName Main agent.
     */
    public void setSourceAgentName(String SourceAgentName) {
        this.SourceAgentName = SourceAgentName;
    }

    /**
     * Get Registration agent. 
     * @return TargetAgentName Registration agent.
     */
    public String getTargetAgentName() {
        return this.TargetAgentName;
    }

    /**
     * Set Registration agent.
     * @param TargetAgentName Registration agent.
     */
    public void setTargetAgentName(String TargetAgentName) {
        this.TargetAgentName = TargetAgentName;
    }

    /**
     * Get Icon of Agent. 
     * @return AgentIcon Icon of Agent.
     */
    public String getAgentIcon() {
        return this.AgentIcon;
    }

    /**
     * Set Icon of Agent.
     * @param AgentIcon Icon of Agent.
     */
    public void setAgentIcon(String AgentIcon) {
        this.AgentIcon = AgentIcon;
    }

    public AgentProcedure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProcedure(AgentProcedure source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Debugging != null) {
            this.Debugging = new AgentProcedureDebugging(source.Debugging);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ReplyIndex != null) {
            this.ReplyIndex = new Long(source.ReplyIndex);
        }
        if (source.SourceAgentName != null) {
            this.SourceAgentName = new String(source.SourceAgentName);
        }
        if (source.TargetAgentName != null) {
            this.TargetAgentName = new String(source.TargetAgentName);
        }
        if (source.AgentIcon != null) {
            this.AgentIcon = new String(source.AgentIcon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamObj(map, prefix + "Debugging.", this.Debugging);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ReplyIndex", this.ReplyIndex);
        this.setParamSimple(map, prefix + "SourceAgentName", this.SourceAgentName);
        this.setParamSimple(map, prefix + "TargetAgentName", this.TargetAgentName);
        this.setParamSimple(map, prefix + "AgentIcon", this.AgentIcon);

    }
}

