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

public class MCPPluginConfig extends AbstractModel {

    /**
    * <p>MCP plug-in public access address</p>
    */
    @SerializedName("ExternalMCPServerUrl")
    @Expose
    private String ExternalMCPServerUrl;

    /**
    * <p>MCP server address</p>
    */
    @SerializedName("MCPServerUrl")
    @Expose
    private String MCPServerUrl;

    /**
    * <p>MCP transmission type: SSE/Streamable<br>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | SSE + HTTP mode |<br>| 1 | Streamable HTTP mode |</p>
    */
    @SerializedName("MCPTransport")
    @Expose
    private Long MCPTransport;

    /**
    * <p>header parameters of the MCP plug-in</p>
    */
    @SerializedName("PluginHeader")
    @Expose
    private PluginParam [] PluginHeader;

    /**
    * <p>query parameter of the MCP plug-in</p>
    */
    @SerializedName("PluginQuery")
    @Expose
    private PluginParam [] PluginQuery;

    /**
    * <p>SSE persistent connection timeout period, in seconds</p>
    */
    @SerializedName("SSEReadTimeout")
    @Expose
    private Long SSEReadTimeout;

    /**
    * <p>Request timeout period, in seconds</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Authorization information.</p>
    */
    @SerializedName("AuthConfig")
    @Expose
    private AuthConfig AuthConfig;

    /**
    * <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default false</p>
    */
    @SerializedName("SupportsApps")
    @Expose
    private Boolean SupportsApps;

    /**
     * Get <p>MCP plug-in public access address</p> 
     * @return ExternalMCPServerUrl <p>MCP plug-in public access address</p>
     */
    public String getExternalMCPServerUrl() {
        return this.ExternalMCPServerUrl;
    }

    /**
     * Set <p>MCP plug-in public access address</p>
     * @param ExternalMCPServerUrl <p>MCP plug-in public access address</p>
     */
    public void setExternalMCPServerUrl(String ExternalMCPServerUrl) {
        this.ExternalMCPServerUrl = ExternalMCPServerUrl;
    }

    /**
     * Get <p>MCP server address</p> 
     * @return MCPServerUrl <p>MCP server address</p>
     */
    public String getMCPServerUrl() {
        return this.MCPServerUrl;
    }

    /**
     * Set <p>MCP server address</p>
     * @param MCPServerUrl <p>MCP server address</p>
     */
    public void setMCPServerUrl(String MCPServerUrl) {
        this.MCPServerUrl = MCPServerUrl;
    }

    /**
     * Get <p>MCP transmission type: SSE/Streamable<br>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | SSE + HTTP mode |<br>| 1 | Streamable HTTP mode |</p> 
     * @return MCPTransport <p>MCP transmission type: SSE/Streamable<br>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | SSE + HTTP mode |<br>| 1 | Streamable HTTP mode |</p>
     */
    public Long getMCPTransport() {
        return this.MCPTransport;
    }

    /**
     * Set <p>MCP transmission type: SSE/Streamable<br>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | SSE + HTTP mode |<br>| 1 | Streamable HTTP mode |</p>
     * @param MCPTransport <p>MCP transmission type: SSE/Streamable<br>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | SSE + HTTP mode |<br>| 1 | Streamable HTTP mode |</p>
     */
    public void setMCPTransport(Long MCPTransport) {
        this.MCPTransport = MCPTransport;
    }

    /**
     * Get <p>header parameters of the MCP plug-in</p> 
     * @return PluginHeader <p>header parameters of the MCP plug-in</p>
     */
    public PluginParam [] getPluginHeader() {
        return this.PluginHeader;
    }

    /**
     * Set <p>header parameters of the MCP plug-in</p>
     * @param PluginHeader <p>header parameters of the MCP plug-in</p>
     */
    public void setPluginHeader(PluginParam [] PluginHeader) {
        this.PluginHeader = PluginHeader;
    }

    /**
     * Get <p>query parameter of the MCP plug-in</p> 
     * @return PluginQuery <p>query parameter of the MCP plug-in</p>
     */
    public PluginParam [] getPluginQuery() {
        return this.PluginQuery;
    }

    /**
     * Set <p>query parameter of the MCP plug-in</p>
     * @param PluginQuery <p>query parameter of the MCP plug-in</p>
     */
    public void setPluginQuery(PluginParam [] PluginQuery) {
        this.PluginQuery = PluginQuery;
    }

    /**
     * Get <p>SSE persistent connection timeout period, in seconds</p> 
     * @return SSEReadTimeout <p>SSE persistent connection timeout period, in seconds</p>
     */
    public Long getSSEReadTimeout() {
        return this.SSEReadTimeout;
    }

    /**
     * Set <p>SSE persistent connection timeout period, in seconds</p>
     * @param SSEReadTimeout <p>SSE persistent connection timeout period, in seconds</p>
     */
    public void setSSEReadTimeout(Long SSEReadTimeout) {
        this.SSEReadTimeout = SSEReadTimeout;
    }

    /**
     * Get <p>Request timeout period, in seconds</p> 
     * @return Timeout <p>Request timeout period, in seconds</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Request timeout period, in seconds</p>
     * @param Timeout <p>Request timeout period, in seconds</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Authorization information.</p> 
     * @return AuthConfig <p>Authorization information.</p>
     */
    public AuthConfig getAuthConfig() {
        return this.AuthConfig;
    }

    /**
     * Set <p>Authorization information.</p>
     * @param AuthConfig <p>Authorization information.</p>
     */
    public void setAuthConfig(AuthConfig AuthConfig) {
        this.AuthConfig = AuthConfig;
    }

    /**
     * Get <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default false</p> 
     * @return SupportsApps <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default false</p>
     */
    public Boolean getSupportsApps() {
        return this.SupportsApps;
    }

    /**
     * Set <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default false</p>
     * @param SupportsApps <p>Whether the interactive interface (MCP Apps) and plug-in-level tags are supported. Default false</p>
     */
    public void setSupportsApps(Boolean SupportsApps) {
        this.SupportsApps = SupportsApps;
    }

    public MCPPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPPluginConfig(MCPPluginConfig source) {
        if (source.ExternalMCPServerUrl != null) {
            this.ExternalMCPServerUrl = new String(source.ExternalMCPServerUrl);
        }
        if (source.MCPServerUrl != null) {
            this.MCPServerUrl = new String(source.MCPServerUrl);
        }
        if (source.MCPTransport != null) {
            this.MCPTransport = new Long(source.MCPTransport);
        }
        if (source.PluginHeader != null) {
            this.PluginHeader = new PluginParam[source.PluginHeader.length];
            for (int i = 0; i < source.PluginHeader.length; i++) {
                this.PluginHeader[i] = new PluginParam(source.PluginHeader[i]);
            }
        }
        if (source.PluginQuery != null) {
            this.PluginQuery = new PluginParam[source.PluginQuery.length];
            for (int i = 0; i < source.PluginQuery.length; i++) {
                this.PluginQuery[i] = new PluginParam(source.PluginQuery[i]);
            }
        }
        if (source.SSEReadTimeout != null) {
            this.SSEReadTimeout = new Long(source.SSEReadTimeout);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.AuthConfig != null) {
            this.AuthConfig = new AuthConfig(source.AuthConfig);
        }
        if (source.SupportsApps != null) {
            this.SupportsApps = new Boolean(source.SupportsApps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalMCPServerUrl", this.ExternalMCPServerUrl);
        this.setParamSimple(map, prefix + "MCPServerUrl", this.MCPServerUrl);
        this.setParamSimple(map, prefix + "MCPTransport", this.MCPTransport);
        this.setParamArrayObj(map, prefix + "PluginHeader.", this.PluginHeader);
        this.setParamArrayObj(map, prefix + "PluginQuery.", this.PluginQuery);
        this.setParamSimple(map, prefix + "SSEReadTimeout", this.SSEReadTimeout);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamObj(map, prefix + "AuthConfig.", this.AuthConfig);
        this.setParamSimple(map, prefix + "SupportsApps", this.SupportsApps);

    }
}

