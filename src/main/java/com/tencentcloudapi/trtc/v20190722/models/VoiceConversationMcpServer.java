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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationMcpServer extends AbstractModel {

    /**
    * <p>The unique mcp identifier.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Endpoint URL.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Request timeout in ms. Default: 5000. This value should not exceed 30000.</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Custom request headers, such as authentication information.</p>
    */
    @SerializedName("Headers")
    @Expose
    private KeyValueItem [] Headers;

    /**
    * <p>Allowlist of tools that can be used.</p>
    */
    @SerializedName("ToolList")
    @Expose
    private String [] ToolList;

    /**
     * Get <p>The unique mcp identifier.</p> 
     * @return Name <p>The unique mcp identifier.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>The unique mcp identifier.</p>
     * @param Name <p>The unique mcp identifier.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Endpoint URL.</p> 
     * @return Url <p>Endpoint URL.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Endpoint URL.</p>
     * @param Url <p>Endpoint URL.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Request timeout in ms. Default: 5000. This value should not exceed 30000.</p> 
     * @return Timeout <p>Request timeout in ms. Default: 5000. This value should not exceed 30000.</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Request timeout in ms. Default: 5000. This value should not exceed 30000.</p>
     * @param Timeout <p>Request timeout in ms. Default: 5000. This value should not exceed 30000.</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Custom request headers, such as authentication information.</p> 
     * @return Headers <p>Custom request headers, such as authentication information.</p>
     */
    public KeyValueItem [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>Custom request headers, such as authentication information.</p>
     * @param Headers <p>Custom request headers, such as authentication information.</p>
     */
    public void setHeaders(KeyValueItem [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>Allowlist of tools that can be used.</p> 
     * @return ToolList <p>Allowlist of tools that can be used.</p>
     */
    public String [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>Allowlist of tools that can be used.</p>
     * @param ToolList <p>Allowlist of tools that can be used.</p>
     */
    public void setToolList(String [] ToolList) {
        this.ToolList = ToolList;
    }

    public VoiceConversationMcpServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationMcpServer(VoiceConversationMcpServer source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Headers != null) {
            this.Headers = new KeyValueItem[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new KeyValueItem(source.Headers[i]);
            }
        }
        if (source.ToolList != null) {
            this.ToolList = new String[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new String(source.ToolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamArraySimple(map, prefix + "ToolList.", this.ToolList);

    }
}

