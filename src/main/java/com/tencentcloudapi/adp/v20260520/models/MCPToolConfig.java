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

public class MCPToolConfig extends AbstractModel {

    /**
    * <p>Input parameter</p>
    */
    @SerializedName("Inputs")
    @Expose
    private RequestParam [] Inputs;

    /**
    * <p>Output parameters</p>
    */
    @SerializedName("Outputs")
    @Expose
    private ResponseParam [] Outputs;

    /**
    * <p>Tool meta information</p>
    */
    @SerializedName("Meta")
    @Expose
    private MCPToolMeta Meta;

    /**
    * <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default value: false</p>
    */
    @SerializedName("SupportsApps")
    @Expose
    private Boolean SupportsApps;

    /**
     * Get <p>Input parameter</p> 
     * @return Inputs <p>Input parameter</p>
     */
    public RequestParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set <p>Input parameter</p>
     * @param Inputs <p>Input parameter</p>
     */
    public void setInputs(RequestParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get <p>Output parameters</p> 
     * @return Outputs <p>Output parameters</p>
     */
    public ResponseParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>Output parameters</p>
     * @param Outputs <p>Output parameters</p>
     */
    public void setOutputs(ResponseParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>Tool meta information</p> 
     * @return Meta <p>Tool meta information</p>
     */
    public MCPToolMeta getMeta() {
        return this.Meta;
    }

    /**
     * Set <p>Tool meta information</p>
     * @param Meta <p>Tool meta information</p>
     */
    public void setMeta(MCPToolMeta Meta) {
        this.Meta = Meta;
    }

    /**
     * Get <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default value: false</p> 
     * @return SupportsApps <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default value: false</p>
     */
    public Boolean getSupportsApps() {
        return this.SupportsApps;
    }

    /**
     * Set <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default value: false</p>
     * @param SupportsApps <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default value: false</p>
     */
    public void setSupportsApps(Boolean SupportsApps) {
        this.SupportsApps = SupportsApps;
    }

    public MCPToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPToolConfig(MCPToolConfig source) {
        if (source.Inputs != null) {
            this.Inputs = new RequestParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new RequestParam(source.Inputs[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new ResponseParam[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new ResponseParam(source.Outputs[i]);
            }
        }
        if (source.Meta != null) {
            this.Meta = new MCPToolMeta(source.Meta);
        }
        if (source.SupportsApps != null) {
            this.SupportsApps = new Boolean(source.SupportsApps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamObj(map, prefix + "Meta.", this.Meta);
        this.setParamSimple(map, prefix + "SupportsApps", this.SupportsApps);

    }
}

