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

public class ConversationMcpApp extends AbstractModel {

    /**
    * <p>Capacity boundary: A single request is read-only for resources belonging to this plugin</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>ui:// resource, based on which the frontend calls ReadMCPResource to pull HTML</p>
    */
    @SerializedName("ResourceUri")
    @Expose
    private String ResourceUri;

    /**
    * <p>thread on the agent-exec side</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>JSON: The complete original CallToolResult for replay when rebuilding historical sessions</p>
    */
    @SerializedName("ToolResult")
    @Expose
    private String ToolResult;

    /**
     * Get <p>Capacity boundary: A single request is read-only for resources belonging to this plugin</p> 
     * @return PluginId <p>Capacity boundary: A single request is read-only for resources belonging to this plugin</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>Capacity boundary: A single request is read-only for resources belonging to this plugin</p>
     * @param PluginId <p>Capacity boundary: A single request is read-only for resources belonging to this plugin</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>ui:// resource, based on which the frontend calls ReadMCPResource to pull HTML</p> 
     * @return ResourceUri <p>ui:// resource, based on which the frontend calls ReadMCPResource to pull HTML</p>
     */
    public String getResourceUri() {
        return this.ResourceUri;
    }

    /**
     * Set <p>ui:// resource, based on which the frontend calls ReadMCPResource to pull HTML</p>
     * @param ResourceUri <p>ui:// resource, based on which the frontend calls ReadMCPResource to pull HTML</p>
     */
    public void setResourceUri(String ResourceUri) {
        this.ResourceUri = ResourceUri;
    }

    /**
     * Get <p>thread on the agent-exec side</p> 
     * @return ThreadId <p>thread on the agent-exec side</p>
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>thread on the agent-exec side</p>
     * @param ThreadId <p>thread on the agent-exec side</p>
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>JSON: The complete original CallToolResult for replay when rebuilding historical sessions</p> 
     * @return ToolResult <p>JSON: The complete original CallToolResult for replay when rebuilding historical sessions</p>
     */
    public String getToolResult() {
        return this.ToolResult;
    }

    /**
     * Set <p>JSON: The complete original CallToolResult for replay when rebuilding historical sessions</p>
     * @param ToolResult <p>JSON: The complete original CallToolResult for replay when rebuilding historical sessions</p>
     */
    public void setToolResult(String ToolResult) {
        this.ToolResult = ToolResult;
    }

    public ConversationMcpApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationMcpApp(ConversationMcpApp source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ResourceUri != null) {
            this.ResourceUri = new String(source.ResourceUri);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.ToolResult != null) {
            this.ToolResult = new String(source.ToolResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ResourceUri", this.ResourceUri);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "ToolResult", this.ToolResult);

    }
}

