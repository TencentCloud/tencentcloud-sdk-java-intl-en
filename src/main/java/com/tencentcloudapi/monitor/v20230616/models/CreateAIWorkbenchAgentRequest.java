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

public class CreateAIWorkbenchAgentRequest extends AbstractModel {

    /**
    * <p>Agent Name</p>
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
    * <p>Agent Category</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Agent tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Agent prompt content</p>
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
    * <p>Source: builtin / custom</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Map ID of the associated resource</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>Associated mcp tool</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>Resource tag</p>
    */
    @SerializedName("CamTags")
    @Expose
    private Tag [] CamTags;

    /**
    * <p>agent runtime environment variable</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
     * Get <p>Agent Name</p> 
     * @return Name <p>Agent Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent Name</p>
     * @param Name <p>Agent Name</p>
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
     * Get <p>Agent Category</p> 
     * @return Category <p>Agent Category</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Agent Category</p>
     * @param Category <p>Agent Category</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Agent tag</p> 
     * @return Tags <p>Agent tag</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Agent tag</p>
     * @param Tags <p>Agent tag</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Agent prompt content</p> 
     * @return Instruction <p>Agent prompt content</p>
     */
    public InstructionConfig getInstruction() {
        return this.Instruction;
    }

    /**
     * Set <p>Agent prompt content</p>
     * @param Instruction <p>Agent prompt content</p>
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
     * Get <p>Source: builtin / custom</p> 
     * @return Source <p>Source: builtin / custom</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source: builtin / custom</p>
     * @param Source <p>Source: builtin / custom</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Map ID of the associated resource</p> 
     * @return ResourceMapId <p>Map ID of the associated resource</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>Map ID of the associated resource</p>
     * @param ResourceMapId <p>Map ID of the associated resource</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>Associated mcp tool</p> 
     * @return MCPIds <p>Associated mcp tool</p>
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>Associated mcp tool</p>
     * @param MCPIds <p>Associated mcp tool</p>
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>Resource tag</p> 
     * @return CamTags <p>Resource tag</p>
     */
    public Tag [] getCamTags() {
        return this.CamTags;
    }

    /**
     * Set <p>Resource tag</p>
     * @param CamTags <p>Resource tag</p>
     */
    public void setCamTags(Tag [] CamTags) {
        this.CamTags = CamTags;
    }

    /**
     * Get <p>agent runtime environment variable</p> 
     * @return EnvVars <p>agent runtime environment variable</p>
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>agent runtime environment variable</p>
     * @param EnvVars <p>agent runtime environment variable</p>
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    public CreateAIWorkbenchAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIWorkbenchAgentRequest(CreateAIWorkbenchAgentRequest source) {
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
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String[source.MCPIds.length];
            for (int i = 0; i < source.MCPIds.length; i++) {
                this.MCPIds[i] = new String(source.MCPIds[i]);
            }
        }
        if (source.CamTags != null) {
            this.CamTags = new Tag[source.CamTags.length];
            for (int i = 0; i < source.CamTags.length; i++) {
                this.CamTags[i] = new Tag(source.CamTags[i]);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Instruction.", this.Instruction);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamArrayObj(map, prefix + "CamTags.", this.CamTags);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);

    }
}

