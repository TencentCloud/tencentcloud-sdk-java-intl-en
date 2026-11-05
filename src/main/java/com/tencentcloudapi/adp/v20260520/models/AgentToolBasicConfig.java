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

public class AgentToolBasicConfig extends AbstractModel {

    /**
    * <p>plugin_id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>Tool id</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tool input parameter list</p>
    */
    @SerializedName("InputList")
    @Expose
    private AgentToolInputParameter [] InputList;

    /**
    * <p>Tool output parameter list</p>
    */
    @SerializedName("OutputList")
    @Expose
    private AgentToolOutputParameter [] OutputList;

    /**
    * <p>Tool Header parameter list</p>
    */
    @SerializedName("HeaderParameterList")
    @Expose
    private AgentPluginParameter [] HeaderParameterList;

    /**
    * <p>Tool Query parameter list</p>
    */
    @SerializedName("QueryParameterList")
    @Expose
    private AgentPluginParameter [] QueryParameterList;

    /**
    * <p>Tool source: 0-comes from plug-in, 1-comes from workflow</p>
    */
    @SerializedName("ToolSource")
    @Expose
    private Long ToolSource;

    /**
    * <p>Whether to disable</p>
    */
    @SerializedName("IsDisabled")
    @Expose
    private Boolean IsDisabled;

    /**
     * Get <p>plugin_id</p> 
     * @return PluginId <p>plugin_id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>plugin_id</p>
     * @param PluginId <p>plugin_id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>Tool id</p> 
     * @return ToolId <p>Tool id</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>Tool id</p>
     * @param ToolId <p>Tool id</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Tool input parameter list</p> 
     * @return InputList <p>Tool input parameter list</p>
     */
    public AgentToolInputParameter [] getInputList() {
        return this.InputList;
    }

    /**
     * Set <p>Tool input parameter list</p>
     * @param InputList <p>Tool input parameter list</p>
     */
    public void setInputList(AgentToolInputParameter [] InputList) {
        this.InputList = InputList;
    }

    /**
     * Get <p>Tool output parameter list</p> 
     * @return OutputList <p>Tool output parameter list</p>
     */
    public AgentToolOutputParameter [] getOutputList() {
        return this.OutputList;
    }

    /**
     * Set <p>Tool output parameter list</p>
     * @param OutputList <p>Tool output parameter list</p>
     */
    public void setOutputList(AgentToolOutputParameter [] OutputList) {
        this.OutputList = OutputList;
    }

    /**
     * Get <p>Tool Header parameter list</p> 
     * @return HeaderParameterList <p>Tool Header parameter list</p>
     */
    public AgentPluginParameter [] getHeaderParameterList() {
        return this.HeaderParameterList;
    }

    /**
     * Set <p>Tool Header parameter list</p>
     * @param HeaderParameterList <p>Tool Header parameter list</p>
     */
    public void setHeaderParameterList(AgentPluginParameter [] HeaderParameterList) {
        this.HeaderParameterList = HeaderParameterList;
    }

    /**
     * Get <p>Tool Query parameter list</p> 
     * @return QueryParameterList <p>Tool Query parameter list</p>
     */
    public AgentPluginParameter [] getQueryParameterList() {
        return this.QueryParameterList;
    }

    /**
     * Set <p>Tool Query parameter list</p>
     * @param QueryParameterList <p>Tool Query parameter list</p>
     */
    public void setQueryParameterList(AgentPluginParameter [] QueryParameterList) {
        this.QueryParameterList = QueryParameterList;
    }

    /**
     * Get <p>Tool source: 0-comes from plug-in, 1-comes from workflow</p> 
     * @return ToolSource <p>Tool source: 0-comes from plug-in, 1-comes from workflow</p>
     */
    public Long getToolSource() {
        return this.ToolSource;
    }

    /**
     * Set <p>Tool source: 0-comes from plug-in, 1-comes from workflow</p>
     * @param ToolSource <p>Tool source: 0-comes from plug-in, 1-comes from workflow</p>
     */
    public void setToolSource(Long ToolSource) {
        this.ToolSource = ToolSource;
    }

    /**
     * Get <p>Whether to disable</p> 
     * @return IsDisabled <p>Whether to disable</p>
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set <p>Whether to disable</p>
     * @param IsDisabled <p>Whether to disable</p>
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public AgentToolBasicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolBasicConfig(AgentToolBasicConfig source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputList != null) {
            this.InputList = new AgentToolInputParameter[source.InputList.length];
            for (int i = 0; i < source.InputList.length; i++) {
                this.InputList[i] = new AgentToolInputParameter(source.InputList[i]);
            }
        }
        if (source.OutputList != null) {
            this.OutputList = new AgentToolOutputParameter[source.OutputList.length];
            for (int i = 0; i < source.OutputList.length; i++) {
                this.OutputList[i] = new AgentToolOutputParameter(source.OutputList[i]);
            }
        }
        if (source.HeaderParameterList != null) {
            this.HeaderParameterList = new AgentPluginParameter[source.HeaderParameterList.length];
            for (int i = 0; i < source.HeaderParameterList.length; i++) {
                this.HeaderParameterList[i] = new AgentPluginParameter(source.HeaderParameterList[i]);
            }
        }
        if (source.QueryParameterList != null) {
            this.QueryParameterList = new AgentPluginParameter[source.QueryParameterList.length];
            for (int i = 0; i < source.QueryParameterList.length; i++) {
                this.QueryParameterList[i] = new AgentPluginParameter(source.QueryParameterList[i]);
            }
        }
        if (source.ToolSource != null) {
            this.ToolSource = new Long(source.ToolSource);
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Boolean(source.IsDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "InputList.", this.InputList);
        this.setParamArrayObj(map, prefix + "OutputList.", this.OutputList);
        this.setParamArrayObj(map, prefix + "HeaderParameterList.", this.HeaderParameterList);
        this.setParamArrayObj(map, prefix + "QueryParameterList.", this.QueryParameterList);
        this.setParamSimple(map, prefix + "ToolSource", this.ToolSource);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}

