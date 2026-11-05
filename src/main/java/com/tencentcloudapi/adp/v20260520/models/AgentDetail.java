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

public class AgentDetail extends AbstractModel {

    /**
    * <p>Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent Basic Configuration</p>
    */
    @SerializedName("Profile")
    @Expose
    private AgentProfile Profile;

    /**
    * <p>System prompt</p>
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
    * <p>Model information</p>
    */
    @SerializedName("Model")
    @Expose
    private AgentModelConfig Model;

    /**
    * <p>Tool details</p>
    */
    @SerializedName("ToolList")
    @Expose
    private AgentTool [] ToolList;

    /**
    * <p>Plug-in configuration</p>
    */
    @SerializedName("PluginList")
    @Expose
    private AgentPlugin [] PluginList;

    /**
    * <p>Skill details.</p>
    */
    @SerializedName("SkillList")
    @Expose
    private AgentSkill [] SkillList;

    /**
    * <p>Advanced configurations.</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AgentAdvancedConfig AdvancedConfig;

    /**
    * <p>List of Function Tools executed by the caller</p><p>Input parameter limit: only available in client user state Agent scenario. This field is ignored in business configuration state Agent</p>
    */
    @SerializedName("ExternalToolList")
    @Expose
    private AgentExternalToolConfig [] ExternalToolList;

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
     * Get <p>Agent Basic Configuration</p> 
     * @return Profile <p>Agent Basic Configuration</p>
     */
    public AgentProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Agent Basic Configuration</p>
     * @param Profile <p>Agent Basic Configuration</p>
     */
    public void setProfile(AgentProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>System prompt</p> 
     * @return Instructions <p>System prompt</p>
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set <p>System prompt</p>
     * @param Instructions <p>System prompt</p>
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Get <p>Model information</p> 
     * @return Model <p>Model information</p>
     */
    public AgentModelConfig getModel() {
        return this.Model;
    }

    /**
     * Set <p>Model information</p>
     * @param Model <p>Model information</p>
     */
    public void setModel(AgentModelConfig Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Tool details</p> 
     * @return ToolList <p>Tool details</p>
     */
    public AgentTool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>Tool details</p>
     * @param ToolList <p>Tool details</p>
     */
    public void setToolList(AgentTool [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get <p>Plug-in configuration</p> 
     * @return PluginList <p>Plug-in configuration</p>
     */
    public AgentPlugin [] getPluginList() {
        return this.PluginList;
    }

    /**
     * Set <p>Plug-in configuration</p>
     * @param PluginList <p>Plug-in configuration</p>
     */
    public void setPluginList(AgentPlugin [] PluginList) {
        this.PluginList = PluginList;
    }

    /**
     * Get <p>Skill details.</p> 
     * @return SkillList <p>Skill details.</p>
     */
    public AgentSkill [] getSkillList() {
        return this.SkillList;
    }

    /**
     * Set <p>Skill details.</p>
     * @param SkillList <p>Skill details.</p>
     */
    public void setSkillList(AgentSkill [] SkillList) {
        this.SkillList = SkillList;
    }

    /**
     * Get <p>Advanced configurations.</p> 
     * @return AdvancedConfig <p>Advanced configurations.</p>
     */
    public AgentAdvancedConfig getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>Advanced configurations.</p>
     * @param AdvancedConfig <p>Advanced configurations.</p>
     */
    public void setAdvancedConfig(AgentAdvancedConfig AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>List of Function Tools executed by the caller</p><p>Input parameter limit: only available in client user state Agent scenario. This field is ignored in business configuration state Agent</p> 
     * @return ExternalToolList <p>List of Function Tools executed by the caller</p><p>Input parameter limit: only available in client user state Agent scenario. This field is ignored in business configuration state Agent</p>
     */
    public AgentExternalToolConfig [] getExternalToolList() {
        return this.ExternalToolList;
    }

    /**
     * Set <p>List of Function Tools executed by the caller</p><p>Input parameter limit: only available in client user state Agent scenario. This field is ignored in business configuration state Agent</p>
     * @param ExternalToolList <p>List of Function Tools executed by the caller</p><p>Input parameter limit: only available in client user state Agent scenario. This field is ignored in business configuration state Agent</p>
     */
    public void setExternalToolList(AgentExternalToolConfig [] ExternalToolList) {
        this.ExternalToolList = ExternalToolList;
    }

    public AgentDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentDetail(AgentDetail source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Profile != null) {
            this.Profile = new AgentProfile(source.Profile);
        }
        if (source.Instructions != null) {
            this.Instructions = new String(source.Instructions);
        }
        if (source.Model != null) {
            this.Model = new AgentModelConfig(source.Model);
        }
        if (source.ToolList != null) {
            this.ToolList = new AgentTool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new AgentTool(source.ToolList[i]);
            }
        }
        if (source.PluginList != null) {
            this.PluginList = new AgentPlugin[source.PluginList.length];
            for (int i = 0; i < source.PluginList.length; i++) {
                this.PluginList[i] = new AgentPlugin(source.PluginList[i]);
            }
        }
        if (source.SkillList != null) {
            this.SkillList = new AgentSkill[source.SkillList.length];
            for (int i = 0; i < source.SkillList.length; i++) {
                this.SkillList[i] = new AgentSkill(source.SkillList[i]);
            }
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AgentAdvancedConfig(source.AdvancedConfig);
        }
        if (source.ExternalToolList != null) {
            this.ExternalToolList = new AgentExternalToolConfig[source.ExternalToolList.length];
            for (int i = 0; i < source.ExternalToolList.length; i++) {
                this.ExternalToolList[i] = new AgentExternalToolConfig(source.ExternalToolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "Instructions", this.Instructions);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamArrayObj(map, prefix + "PluginList.", this.PluginList);
        this.setParamArrayObj(map, prefix + "SkillList.", this.SkillList);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamArrayObj(map, prefix + "ExternalToolList.", this.ExternalToolList);

    }
}

