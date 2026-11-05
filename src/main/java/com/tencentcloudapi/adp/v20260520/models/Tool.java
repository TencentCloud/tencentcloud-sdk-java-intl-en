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

public class Tool extends AbstractModel {

    /**
    * <p>Tool billing information</p>
    */
    @SerializedName("Billing")
    @Expose
    private ToolBilling Billing;

    /**
    * <p>Tool call count</p><p>Unit: count</p>
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * <p>Tool description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tool name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Plug-in ID</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>Not specified</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>Read-only</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>Write/Delete</td></tr></tbody></table>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
    * <p>Tool configuration info</p>
    */
    @SerializedName("ToolConfig")
    @Expose
    private ToolConfig ToolConfig;

    /**
    * <p>Tool ID</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
     * Get <p>Tool billing information</p> 
     * @return Billing <p>Tool billing information</p>
     */
    public ToolBilling getBilling() {
        return this.Billing;
    }

    /**
     * Set <p>Tool billing information</p>
     * @param Billing <p>Tool billing information</p>
     */
    public void setBilling(ToolBilling Billing) {
        this.Billing = Billing;
    }

    /**
     * Get <p>Tool call count</p><p>Unit: count</p> 
     * @return CallCount <p>Tool call count</p><p>Unit: count</p>
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>Tool call count</p><p>Unit: count</p>
     * @param CallCount <p>Tool call count</p><p>Unit: count</p>
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>Tool description</p> 
     * @return Description <p>Tool description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Tool description</p>
     * @param Description <p>Tool description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Tool name</p> 
     * @return Name <p>Tool name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tool name</p>
     * @param Name <p>Tool name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Plug-in ID</p> 
     * @return PluginId <p>Plug-in ID</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>Plug-in ID</p>
     * @param PluginId <p>Plug-in ID</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>Not specified</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>Read-only</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>Write/Delete</td></tr></tbody></table> 
     * @return ToolAccessMode <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>Not specified</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>Read-only</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>Write/Delete</td></tr></tbody></table>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>Not specified</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>Read-only</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>Write/Delete</td></tr></tbody></table>
     * @param ToolAccessMode <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>TOOL_ACCESS_MODE_UNKNOWN</td><td>0</td><td>Not specified</td></tr><tr><td>TOOL_ACCESS_MODE_READ_ONLY</td><td>1</td><td>Read-only</td></tr><tr><td>TOOL_ACCESS_MODE_WRITE_DELETE</td><td>2</td><td>Write/Delete</td></tr></tbody></table>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    /**
     * Get <p>Tool configuration info</p> 
     * @return ToolConfig <p>Tool configuration info</p>
     */
    public ToolConfig getToolConfig() {
        return this.ToolConfig;
    }

    /**
     * Set <p>Tool configuration info</p>
     * @param ToolConfig <p>Tool configuration info</p>
     */
    public void setToolConfig(ToolConfig ToolConfig) {
        this.ToolConfig = ToolConfig;
    }

    /**
     * Get <p>Tool ID</p> 
     * @return ToolId <p>Tool ID</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>Tool ID</p>
     * @param ToolId <p>Tool ID</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    public Tool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tool(Tool source) {
        if (source.Billing != null) {
            this.Billing = new ToolBilling(source.Billing);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
        if (source.ToolConfig != null) {
            this.ToolConfig = new ToolConfig(source.ToolConfig);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);
        this.setParamObj(map, prefix + "ToolConfig.", this.ToolConfig);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);

    }
}

