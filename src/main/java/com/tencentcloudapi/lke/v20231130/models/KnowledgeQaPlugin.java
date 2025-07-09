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

public class KnowledgeQaPlugin extends AbstractModel {

    /**
    * Plugin ID.
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Plugin name.
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * Plugin icon.
    */
    @SerializedName("PluginIcon")
    @Expose
    private String PluginIcon;

    /**
    * Tool ID.
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * Tool name.
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * Tool description.
    */
    @SerializedName("ToolDesc")
    @Expose
    private String ToolDesc;

    /**
    * Tool input parameter.
    */
    @SerializedName("Inputs")
    @Expose
    private PluginToolReqParam [] Inputs;

    /**
    * Whether the plugin is bound to the knowledge library.
    */
    @SerializedName("IsBindingKnowledge")
    @Expose
    private Boolean IsBindingKnowledge;

    /**
     * Get Plugin ID. 
     * @return PluginId Plugin ID.
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set Plugin ID.
     * @param PluginId Plugin ID.
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Plugin name. 
     * @return PluginName Plugin name.
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set Plugin name.
     * @param PluginName Plugin name.
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get Plugin icon. 
     * @return PluginIcon Plugin icon.
     */
    public String getPluginIcon() {
        return this.PluginIcon;
    }

    /**
     * Set Plugin icon.
     * @param PluginIcon Plugin icon.
     */
    public void setPluginIcon(String PluginIcon) {
        this.PluginIcon = PluginIcon;
    }

    /**
     * Get Tool ID. 
     * @return ToolId Tool ID.
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set Tool ID.
     * @param ToolId Tool ID.
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get Tool name. 
     * @return ToolName Tool name.
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set Tool name.
     * @param ToolName Tool name.
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get Tool description. 
     * @return ToolDesc Tool description.
     */
    public String getToolDesc() {
        return this.ToolDesc;
    }

    /**
     * Set Tool description.
     * @param ToolDesc Tool description.
     */
    public void setToolDesc(String ToolDesc) {
        this.ToolDesc = ToolDesc;
    }

    /**
     * Get Tool input parameter. 
     * @return Inputs Tool input parameter.
     */
    public PluginToolReqParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set Tool input parameter.
     * @param Inputs Tool input parameter.
     */
    public void setInputs(PluginToolReqParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get Whether the plugin is bound to the knowledge library. 
     * @return IsBindingKnowledge Whether the plugin is bound to the knowledge library.
     */
    public Boolean getIsBindingKnowledge() {
        return this.IsBindingKnowledge;
    }

    /**
     * Set Whether the plugin is bound to the knowledge library.
     * @param IsBindingKnowledge Whether the plugin is bound to the knowledge library.
     */
    public void setIsBindingKnowledge(Boolean IsBindingKnowledge) {
        this.IsBindingKnowledge = IsBindingKnowledge;
    }

    public KnowledgeQaPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaPlugin(KnowledgeQaPlugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginIcon != null) {
            this.PluginIcon = new String(source.PluginIcon);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolDesc != null) {
            this.ToolDesc = new String(source.ToolDesc);
        }
        if (source.Inputs != null) {
            this.Inputs = new PluginToolReqParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new PluginToolReqParam(source.Inputs[i]);
            }
        }
        if (source.IsBindingKnowledge != null) {
            this.IsBindingKnowledge = new Boolean(source.IsBindingKnowledge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginIcon", this.PluginIcon);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolDesc", this.ToolDesc);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamSimple(map, prefix + "IsBindingKnowledge", this.IsBindingKnowledge);

    }
}

