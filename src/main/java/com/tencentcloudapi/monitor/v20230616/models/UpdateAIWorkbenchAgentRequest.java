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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAIWorkbenchAgentRequest extends AbstractModel {

    /**
    * <p>Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Agent description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Agent Category.</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Agent Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Agent prompt</p>
    */
    @SerializedName("Instruction")
    @Expose
    private InstructionConfig Instruction;

    /**
    * <p>List of associated skill IDs.</p>
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>Source</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ID of the associated resource map</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>Associated mcp</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>Environment variables required by the agent at runtime</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
     * Get <p>Agent ID</p> 
     * @return AgentId <p>Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
     * @param AgentId <p>Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent name</p> 
     * @return Name <p>Agent name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent name</p>
     * @param Name <p>Agent name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Agent description</p> 
     * @return Description <p>Agent description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Agent description</p>
     * @param Description <p>Agent description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Agent Category.</p> 
     * @return Category <p>Agent Category.</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Agent Category.</p>
     * @param Category <p>Agent Category.</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Agent Tag.</p> 
     * @return Tags <p>Agent Tag.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Agent Tag.</p>
     * @param Tags <p>Agent Tag.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Agent prompt</p> 
     * @return Instruction <p>Agent prompt</p>
     */
    public InstructionConfig getInstruction() {
        return this.Instruction;
    }

    /**
     * Set <p>Agent prompt</p>
     * @param Instruction <p>Agent prompt</p>
     */
    public void setInstruction(InstructionConfig Instruction) {
        this.Instruction = Instruction;
    }

    /**
     * Get <p>List of associated skill IDs.</p> 
     * @return SkillIds <p>List of associated skill IDs.</p>
     */
    public String [] getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>List of associated skill IDs.</p>
     * @param SkillIds <p>List of associated skill IDs.</p>
     */
    public void setSkillIds(String [] SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>Source</p> 
     * @return Source <p>Source</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source</p>
     * @param Source <p>Source</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ID of the associated resource map</p> 
     * @return ResourceMapId <p>ID of the associated resource map</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>ID of the associated resource map</p>
     * @param ResourceMapId <p>ID of the associated resource map</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>Associated mcp</p> 
     * @return MCPIds <p>Associated mcp</p>
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>Associated mcp</p>
     * @param MCPIds <p>Associated mcp</p>
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>Environment variables required by the agent at runtime</p> 
     * @return EnvVars <p>Environment variables required by the agent at runtime</p>
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>Environment variables required by the agent at runtime</p>
     * @param EnvVars <p>Environment variables required by the agent at runtime</p>
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    public UpdateAIWorkbenchAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAIWorkbenchAgentRequest(UpdateAIWorkbenchAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Instruction != null) {
            this.Instruction = new InstructionConfig(source.Instruction);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String[source.SkillIds.length];
            for (int i = 0; i < source.SkillIds.length; i++) {
                this.SkillIds[i] = new String(source.SkillIds[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String[source.MCPIds.length];
            for (int i = 0; i < source.MCPIds.length; i++) {
                this.MCPIds[i] = new String(source.MCPIds[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Instruction.", this.Instruction);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);

    }
}

