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

public class MCPInfo extends AbstractModel {

    /**
    * <p>mcp ID</p>
    */
    @SerializedName("MCPId")
    @Expose
    private String MCPId;

    /**
    * <p>MCP name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>MCP description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>MCP URL</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Transport protocol: sse / streamable_http / stdio</p>
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * <p>Authentication type: none / bearer / basic / api_key</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>Authentication key (masked in the response)</p>
    */
    @SerializedName("AuthSecret")
    @Expose
    private String AuthSecret;

    /**
    * <p>Timeout (s)</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Retry count</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>Request header JSON</p>
    */
    @SerializedName("Headers")
    @Expose
    private String Headers;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>mcp ID</p> 
     * @return MCPId <p>mcp ID</p>
     */
    public String getMCPId() {
        return this.MCPId;
    }

    /**
     * Set <p>mcp ID</p>
     * @param MCPId <p>mcp ID</p>
     */
    public void setMCPId(String MCPId) {
        this.MCPId = MCPId;
    }

    /**
     * Get <p>MCP name</p> 
     * @return Name <p>MCP name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>MCP name</p>
     * @param Name <p>MCP name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>MCP description</p> 
     * @return Description <p>MCP description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>MCP description</p>
     * @param Description <p>MCP description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>MCP URL</p> 
     * @return Url <p>MCP URL</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>MCP URL</p>
     * @param Url <p>MCP URL</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Transport protocol: sse / streamable_http / stdio</p> 
     * @return Transport <p>Transport protocol: sse / streamable_http / stdio</p>
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set <p>Transport protocol: sse / streamable_http / stdio</p>
     * @param Transport <p>Transport protocol: sse / streamable_http / stdio</p>
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get <p>Authentication type: none / bearer / basic / api_key</p> 
     * @return AuthType <p>Authentication type: none / bearer / basic / api_key</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>Authentication type: none / bearer / basic / api_key</p>
     * @param AuthType <p>Authentication type: none / bearer / basic / api_key</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>Authentication key (masked in the response)</p> 
     * @return AuthSecret <p>Authentication key (masked in the response)</p>
     */
    public String getAuthSecret() {
        return this.AuthSecret;
    }

    /**
     * Set <p>Authentication key (masked in the response)</p>
     * @param AuthSecret <p>Authentication key (masked in the response)</p>
     */
    public void setAuthSecret(String AuthSecret) {
        this.AuthSecret = AuthSecret;
    }

    /**
     * Get <p>Timeout (s)</p> 
     * @return Timeout <p>Timeout (s)</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout (s)</p>
     * @param Timeout <p>Timeout (s)</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Retry count</p> 
     * @return RetryCount <p>Retry count</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>Retry count</p>
     * @param RetryCount <p>Retry count</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>Request header JSON</p> 
     * @return Headers <p>Request header JSON</p>
     */
    public String getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>Request header JSON</p>
     * @param Headers <p>Request header JSON</p>
     */
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return Enabled <p>Whether to enable</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param Enabled <p>Whether to enable</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public MCPInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPInfo(MCPInfo source) {
        if (source.MCPId != null) {
            this.MCPId = new String(source.MCPId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.AuthSecret != null) {
            this.AuthSecret = new String(source.AuthSecret);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.Headers != null) {
            this.Headers = new String(source.Headers);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MCPId", this.MCPId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthSecret", this.AuthSecret);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "Headers", this.Headers);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

