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

public class PluginConfig extends AbstractModel {

    /**
    * API plug-in configuration
    */
    @SerializedName("ApiPluginConfig")
    @Expose
    private ApiPluginConfig ApiPluginConfig;

    /**
    * App plugin configuration
    */
    @SerializedName("AppPluginConfig")
    @Expose
    private AppPluginConfig AppPluginConfig;

    /**
    * mcp plug-in configuration
    */
    @SerializedName("MCPPluginConfig")
    @Expose
    private MCPPluginConfig MCPPluginConfig;

    /**
     * Get API plug-in configuration 
     * @return ApiPluginConfig API plug-in configuration
     */
    public ApiPluginConfig getApiPluginConfig() {
        return this.ApiPluginConfig;
    }

    /**
     * Set API plug-in configuration
     * @param ApiPluginConfig API plug-in configuration
     */
    public void setApiPluginConfig(ApiPluginConfig ApiPluginConfig) {
        this.ApiPluginConfig = ApiPluginConfig;
    }

    /**
     * Get App plugin configuration 
     * @return AppPluginConfig App plugin configuration
     */
    public AppPluginConfig getAppPluginConfig() {
        return this.AppPluginConfig;
    }

    /**
     * Set App plugin configuration
     * @param AppPluginConfig App plugin configuration
     */
    public void setAppPluginConfig(AppPluginConfig AppPluginConfig) {
        this.AppPluginConfig = AppPluginConfig;
    }

    /**
     * Get mcp plug-in configuration 
     * @return MCPPluginConfig mcp plug-in configuration
     */
    public MCPPluginConfig getMCPPluginConfig() {
        return this.MCPPluginConfig;
    }

    /**
     * Set mcp plug-in configuration
     * @param MCPPluginConfig mcp plug-in configuration
     */
    public void setMCPPluginConfig(MCPPluginConfig MCPPluginConfig) {
        this.MCPPluginConfig = MCPPluginConfig;
    }

    public PluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginConfig(PluginConfig source) {
        if (source.ApiPluginConfig != null) {
            this.ApiPluginConfig = new ApiPluginConfig(source.ApiPluginConfig);
        }
        if (source.AppPluginConfig != null) {
            this.AppPluginConfig = new AppPluginConfig(source.AppPluginConfig);
        }
        if (source.MCPPluginConfig != null) {
            this.MCPPluginConfig = new MCPPluginConfig(source.MCPPluginConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ApiPluginConfig.", this.ApiPluginConfig);
        this.setParamObj(map, prefix + "AppPluginConfig.", this.AppPluginConfig);
        this.setParamObj(map, prefix + "MCPPluginConfig.", this.MCPPluginConfig);

    }
}

