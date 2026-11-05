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

public class DescribePluginSummaryListRequest extends AbstractModel {

    /**
    * <p>Space ID, used when querying the plug-in list in the space</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Filter criteria list, supporting PluginKind, CategoryKey, PluginSource, PluginId, PluginClass, BillingType, AuthType, IsShared, IsCreatedByMe</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Whether to only return favorite plug-ins. If set to true, only plug-ins favorited by the current user are returned. If set to false or not specified, no filtering by favorite status is applied.</p>
    */
    @SerializedName("IsFavoriteOnly")
    @Expose
    private Boolean IsFavoriteOnly;

    /**
    * <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
    * <p>Page number. Starts from 0</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Query content fuzzy matching: plugin name/plugin description/tool name/tool description</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Sorting method.</p><p>Enumeration values:</p><ul><li>0: not specified, default sorting</li><li>1: relevance ranking</li><li>2: sort by update time</li><li>3: default sorting</li><li>4: sort by popularity</li></ul>
    */
    @SerializedName("SortType")
    @Expose
    private Long SortType;

    /**
    * <p>Filter plug-ins shared by the current space/business</p><p>Value range: [0, 2]</p>
    */
    @SerializedName("PluginSpaceRelation")
    @Expose
    private Long PluginSpaceRelation;

    /**
     * Get <p>Space ID, used when querying the plug-in list in the space</p> 
     * @return SpaceId <p>Space ID, used when querying the plug-in list in the space</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID, used when querying the plug-in list in the space</p>
     * @param SpaceId <p>Space ID, used when querying the plug-in list in the space</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Filter criteria list, supporting PluginKind, CategoryKey, PluginSource, PluginId, PluginClass, BillingType, AuthType, IsShared, IsCreatedByMe</p> 
     * @return FilterList <p>Filter criteria list, supporting PluginKind, CategoryKey, PluginSource, PluginId, PluginClass, BillingType, AuthType, IsShared, IsCreatedByMe</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter criteria list, supporting PluginKind, CategoryKey, PluginSource, PluginId, PluginClass, BillingType, AuthType, IsShared, IsCreatedByMe</p>
     * @param FilterList <p>Filter criteria list, supporting PluginKind, CategoryKey, PluginSource, PluginId, PluginClass, BillingType, AuthType, IsShared, IsCreatedByMe</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Whether to only return favorite plug-ins. If set to true, only plug-ins favorited by the current user are returned. If set to false or not specified, no filtering by favorite status is applied.</p> 
     * @return IsFavoriteOnly <p>Whether to only return favorite plug-ins. If set to true, only plug-ins favorited by the current user are returned. If set to false or not specified, no filtering by favorite status is applied.</p>
     */
    public Boolean getIsFavoriteOnly() {
        return this.IsFavoriteOnly;
    }

    /**
     * Set <p>Whether to only return favorite plug-ins. If set to true, only plug-ins favorited by the current user are returned. If set to false or not specified, no filtering by favorite status is applied.</p>
     * @param IsFavoriteOnly <p>Whether to only return favorite plug-ins. If set to true, only plug-ins favorited by the current user are returned. If set to false or not specified, no filtering by favorite status is applied.</p>
     */
    public void setIsFavoriteOnly(Boolean IsFavoriteOnly) {
        this.IsFavoriteOnly = IsFavoriteOnly;
    }

    /**
     * Get <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul> 
     * @return Module <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     * @param Module <p>Plug-in display scenario. If not passed or set to 0, the scenario is not limited.</p><p>Enumeration values:</p><ul><li>0: Not limited</li><li>1: Agent Mode</li><li>2: Workflow</li><li>3: Intelligent workbench</li></ul>
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    /**
     * Get <p>Page number. Starts from 0</p> 
     * @return PageNumber <p>Page number. Starts from 0</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Starts from 0</p>
     * @param PageNumber <p>Page number. Starts from 0</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page.</p> 
     * @return PageSize <p>Size per page.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page.</p>
     * @param PageSize <p>Size per page.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Query content fuzzy matching: plugin name/plugin description/tool name/tool description</p> 
     * @return Query <p>Query content fuzzy matching: plugin name/plugin description/tool name/tool description</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query content fuzzy matching: plugin name/plugin description/tool name/tool description</p>
     * @param Query <p>Query content fuzzy matching: plugin name/plugin description/tool name/tool description</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Sorting method.</p><p>Enumeration values:</p><ul><li>0: not specified, default sorting</li><li>1: relevance ranking</li><li>2: sort by update time</li><li>3: default sorting</li><li>4: sort by popularity</li></ul> 
     * @return SortType <p>Sorting method.</p><p>Enumeration values:</p><ul><li>0: not specified, default sorting</li><li>1: relevance ranking</li><li>2: sort by update time</li><li>3: default sorting</li><li>4: sort by popularity</li></ul>
     */
    public Long getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>Sorting method.</p><p>Enumeration values:</p><ul><li>0: not specified, default sorting</li><li>1: relevance ranking</li><li>2: sort by update time</li><li>3: default sorting</li><li>4: sort by popularity</li></ul>
     * @param SortType <p>Sorting method.</p><p>Enumeration values:</p><ul><li>0: not specified, default sorting</li><li>1: relevance ranking</li><li>2: sort by update time</li><li>3: default sorting</li><li>4: sort by popularity</li></ul>
     */
    public void setSortType(Long SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>Filter plug-ins shared by the current space/business</p><p>Value range: [0, 2]</p> 
     * @return PluginSpaceRelation <p>Filter plug-ins shared by the current space/business</p><p>Value range: [0, 2]</p>
     */
    public Long getPluginSpaceRelation() {
        return this.PluginSpaceRelation;
    }

    /**
     * Set <p>Filter plug-ins shared by the current space/business</p><p>Value range: [0, 2]</p>
     * @param PluginSpaceRelation <p>Filter plug-ins shared by the current space/business</p><p>Value range: [0, 2]</p>
     */
    public void setPluginSpaceRelation(Long PluginSpaceRelation) {
        this.PluginSpaceRelation = PluginSpaceRelation;
    }

    public DescribePluginSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginSummaryListRequest(DescribePluginSummaryListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.IsFavoriteOnly != null) {
            this.IsFavoriteOnly = new Boolean(source.IsFavoriteOnly);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SortType != null) {
            this.SortType = new Long(source.SortType);
        }
        if (source.PluginSpaceRelation != null) {
            this.PluginSpaceRelation = new Long(source.PluginSpaceRelation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "IsFavoriteOnly", this.IsFavoriteOnly);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PluginSpaceRelation", this.PluginSpaceRelation);

    }
}

