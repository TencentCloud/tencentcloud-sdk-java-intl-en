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

public class AgentInfo extends AbstractModel {

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
    * <p>Status: draft/configured/running/standby/disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>List of associated skill IDs.</p>
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>Associated resource map ID.</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>Associated mcp id.</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>Resource Tag.</p>
    */
    @SerializedName("CamTags")
    @Expose
    private Tag [] CamTags;

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
     * Get <p>Status: draft/configured/running/standby/disabled</p> 
     * @return Status <p>Status: draft/configured/running/standby/disabled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status: draft/configured/running/standby/disabled</p>
     * @param Status <p>Status: draft/configured/running/standby/disabled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>Associated resource map ID.</p> 
     * @return ResourceMapId <p>Associated resource map ID.</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>Associated resource map ID.</p>
     * @param ResourceMapId <p>Associated resource map ID.</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>Associated mcp id.</p> 
     * @return MCPIds <p>Associated mcp id.</p>
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>Associated mcp id.</p>
     * @param MCPIds <p>Associated mcp id.</p>
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>Resource Tag.</p> 
     * @return CamTags <p>Resource Tag.</p>
     */
    public Tag [] getCamTags() {
        return this.CamTags;
    }

    /**
     * Set <p>Resource Tag.</p>
     * @param CamTags <p>Resource Tag.</p>
     */
    public void setCamTags(Tag [] CamTags) {
        this.CamTags = CamTags;
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

    public AgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInfo(AgentInfo source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String[source.SkillIds.length];
            for (int i = 0; i < source.SkillIds.length; i++) {
                this.SkillIds[i] = new String(source.SkillIds[i]);
            }
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
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamArrayObj(map, prefix + "CamTags.", this.CamTags);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);

    }
}

