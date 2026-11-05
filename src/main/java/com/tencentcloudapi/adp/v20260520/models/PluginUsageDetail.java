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

public class PluginUsageDetail extends AbstractModel {

    /**
    * <p>Plugin name.</p>
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * <p>Consumption measurement list for a single PLUGIN domain call (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
    * <p>Plug-in Tool Name (tool_name)</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
     * Get <p>Plugin name.</p> 
     * @return PluginName <p>Plugin name.</p>
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set <p>Plugin name.</p>
     * @param PluginName <p>Plugin name.</p>
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get <p>Consumption measurement list for a single PLUGIN domain call (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p> 
     * @return ResourceConsumptionList <p>Consumption measurement list for a single PLUGIN domain call (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>Consumption measurement list for a single PLUGIN domain call (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     * @param ResourceConsumptionList <p>Consumption measurement list for a single PLUGIN domain call (authoritative field): lists each measurement category by unit + label. When unit=TOKEN, label is case-sensitive for Token subcategories (input/output/avg_*). Being empty indicates total_tokens</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    /**
     * Get <p>Plug-in Tool Name (tool_name)</p> 
     * @return ToolName <p>Plug-in Tool Name (tool_name)</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>Plug-in Tool Name (tool_name)</p>
     * @param ToolName <p>Plug-in Tool Name (tool_name)</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    public PluginUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginUsageDetail(PluginUsageDetail source) {
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.ResourceConsumptionList != null) {
            this.ResourceConsumptionList = new ResourceConsumption[source.ResourceConsumptionList.length];
            for (int i = 0; i < source.ResourceConsumptionList.length; i++) {
                this.ResourceConsumptionList[i] = new ResourceConsumption(source.ResourceConsumptionList[i]);
            }
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);

    }
}

