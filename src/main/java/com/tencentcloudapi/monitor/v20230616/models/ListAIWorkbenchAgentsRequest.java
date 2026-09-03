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

public class ListAIWorkbenchAgentsRequest extends AbstractModel {

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
    * <p>Status filtering</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Category filtering</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Search keyword</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Filter by source</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Agent ID list filtering</p>
    */
    @SerializedName("AgentIds")
    @Expose
    private String [] AgentIds;

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
     * Get <p>Status filtering</p> 
     * @return Status <p>Status filtering</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status filtering</p>
     * @param Status <p>Status filtering</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Category filtering</p> 
     * @return Category <p>Category filtering</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Category filtering</p>
     * @param Category <p>Category filtering</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
     * Get <p>Filter by source</p> 
     * @return Source <p>Filter by source</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Filter by source</p>
     * @param Source <p>Filter by source</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Agent ID list filtering</p> 
     * @return AgentIds <p>Agent ID list filtering</p>
     */
    public String [] getAgentIds() {
        return this.AgentIds;
    }

    /**
     * Set <p>Agent ID list filtering</p>
     * @param AgentIds <p>Agent ID list filtering</p>
     */
    public void setAgentIds(String [] AgentIds) {
        this.AgentIds = AgentIds;
    }

    public ListAIWorkbenchAgentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchAgentsRequest(ListAIWorkbenchAgentsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AgentIds != null) {
            this.AgentIds = new String[source.AgentIds.length];
            for (int i = 0; i < source.AgentIds.length; i++) {
                this.AgentIds[i] = new String(source.AgentIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "AgentIds.", this.AgentIds);

    }
}

