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

public class ToolConfig extends AbstractModel {

    /**
    * <p>API tool configuration message.</p>
    */
    @SerializedName("ApiToolConfig")
    @Expose
    private ApiToolConfig ApiToolConfig;

    /**
    * <p>Application configuration information</p>
    */
    @SerializedName("AppToolConfig")
    @Expose
    private AppToolConfig AppToolConfig;

    /**
    * <p>Code tool configuration message</p>
    */
    @SerializedName("CodeToolConfig")
    @Expose
    private CodeToolConfig CodeToolConfig;

    /**
    * <p>Configuration information of the MCP tool</p>
    */
    @SerializedName("MCPToolConfig")
    @Expose
    private MCPToolConfig MCPToolConfig;

    /**
     * Get <p>API tool configuration message.</p> 
     * @return ApiToolConfig <p>API tool configuration message.</p>
     */
    public ApiToolConfig getApiToolConfig() {
        return this.ApiToolConfig;
    }

    /**
     * Set <p>API tool configuration message.</p>
     * @param ApiToolConfig <p>API tool configuration message.</p>
     */
    public void setApiToolConfig(ApiToolConfig ApiToolConfig) {
        this.ApiToolConfig = ApiToolConfig;
    }

    /**
     * Get <p>Application configuration information</p> 
     * @return AppToolConfig <p>Application configuration information</p>
     */
    public AppToolConfig getAppToolConfig() {
        return this.AppToolConfig;
    }

    /**
     * Set <p>Application configuration information</p>
     * @param AppToolConfig <p>Application configuration information</p>
     */
    public void setAppToolConfig(AppToolConfig AppToolConfig) {
        this.AppToolConfig = AppToolConfig;
    }

    /**
     * Get <p>Code tool configuration message</p> 
     * @return CodeToolConfig <p>Code tool configuration message</p>
     */
    public CodeToolConfig getCodeToolConfig() {
        return this.CodeToolConfig;
    }

    /**
     * Set <p>Code tool configuration message</p>
     * @param CodeToolConfig <p>Code tool configuration message</p>
     */
    public void setCodeToolConfig(CodeToolConfig CodeToolConfig) {
        this.CodeToolConfig = CodeToolConfig;
    }

    /**
     * Get <p>Configuration information of the MCP tool</p> 
     * @return MCPToolConfig <p>Configuration information of the MCP tool</p>
     */
    public MCPToolConfig getMCPToolConfig() {
        return this.MCPToolConfig;
    }

    /**
     * Set <p>Configuration information of the MCP tool</p>
     * @param MCPToolConfig <p>Configuration information of the MCP tool</p>
     */
    public void setMCPToolConfig(MCPToolConfig MCPToolConfig) {
        this.MCPToolConfig = MCPToolConfig;
    }

    public ToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolConfig(ToolConfig source) {
        if (source.ApiToolConfig != null) {
            this.ApiToolConfig = new ApiToolConfig(source.ApiToolConfig);
        }
        if (source.AppToolConfig != null) {
            this.AppToolConfig = new AppToolConfig(source.AppToolConfig);
        }
        if (source.CodeToolConfig != null) {
            this.CodeToolConfig = new CodeToolConfig(source.CodeToolConfig);
        }
        if (source.MCPToolConfig != null) {
            this.MCPToolConfig = new MCPToolConfig(source.MCPToolConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ApiToolConfig.", this.ApiToolConfig);
        this.setParamObj(map, prefix + "AppToolConfig.", this.AppToolConfig);
        this.setParamObj(map, prefix + "CodeToolConfig.", this.CodeToolConfig);
        this.setParamObj(map, prefix + "MCPToolConfig.", this.MCPToolConfig);

    }
}

