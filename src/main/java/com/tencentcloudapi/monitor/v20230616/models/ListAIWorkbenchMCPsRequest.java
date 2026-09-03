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

public class ListAIWorkbenchMCPsRequest extends AbstractModel {

    /**
    * <p>Number of items per page</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>Filter by transmission protocol</p>
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * <p>Search keyword</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Whether to enable filter</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Associated mcp</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>MCP type (built-in/private)</p><p>Enumeration values:</p><ul><li>builtin: platform built-in</li><li>private: user-customized</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Number of items per page</p> 
     * @return PerPage <p>Number of items per page</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>Number of items per page</p>
     * @param PerPage <p>Number of items per page</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageNo <p>Page number.</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageNo <p>Page number.</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>Filter by transmission protocol</p> 
     * @return Transport <p>Filter by transmission protocol</p>
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set <p>Filter by transmission protocol</p>
     * @param Transport <p>Filter by transmission protocol</p>
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get <p>Search keyword</p> 
     * @return Keyword <p>Search keyword</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Search keyword</p>
     * @param Keyword <p>Search keyword</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>Whether to enable filter</p> 
     * @return Enabled <p>Whether to enable filter</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable filter</p>
     * @param Enabled <p>Whether to enable filter</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Associated mcp</p> 
     * @return MCPIds <p>Associated mcp</p>
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>Associated mcp</p>
     * @param MCPIds <p>Associated mcp</p>
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>MCP type (built-in/private)</p><p>Enumeration values:</p><ul><li>builtin: platform built-in</li><li>private: user-customized</li></ul> 
     * @return Type <p>MCP type (built-in/private)</p><p>Enumeration values:</p><ul><li>builtin: platform built-in</li><li>private: user-customized</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>MCP type (built-in/private)</p><p>Enumeration values:</p><ul><li>builtin: platform built-in</li><li>private: user-customized</li></ul>
     * @param Type <p>MCP type (built-in/private)</p><p>Enumeration values:</p><ul><li>builtin: platform built-in</li><li>private: user-customized</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ListAIWorkbenchMCPsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchMCPsRequest(ListAIWorkbenchMCPsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String[source.MCPIds.length];
            for (int i = 0; i < source.MCPIds.length; i++) {
                this.MCPIds[i] = new String(source.MCPIds[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

