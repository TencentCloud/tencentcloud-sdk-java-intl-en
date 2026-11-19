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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel {

    /**
    * <p>Makers site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Page number offset, starting from 0. The backend skips Offset * Limit entries</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of items per page. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter criteria. Name parameter values: ProjectId, Name, Status, Provider</p>
    */
    @SerializedName("Filters")
    @Expose
    private ProjectFilter [] Filters;

    /**
    * <p>Query by project ID</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * <p>Sorting field. CreatedOn, ModifiedOn. Default: CreatedOn</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting order. Asc, Desc, ASC, DESC. Default: DESC</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>Source. Only return the Upload project on drop</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Fuzzy search by project name</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>Makers site ID</p> 
     * @return ZoneId <p>Makers site ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers site ID</p>
     * @param ZoneId <p>Makers site ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Page number offset, starting from 0. The backend skips Offset * Limit entries</p> 
     * @return Offset <p>Page number offset, starting from 0. The backend skips Offset * Limit entries</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Page number offset, starting from 0. The backend skips Offset * Limit entries</p>
     * @param Offset <p>Page number offset, starting from 0. The backend skips Offset * Limit entries</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of items per page. Maximum value: 100.</p> 
     * @return Limit <p>Number of items per page. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page. Maximum value: 100.</p>
     * @param Limit <p>Number of items per page. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter criteria. Name parameter values: ProjectId, Name, Status, Provider</p> 
     * @return Filters <p>Filter criteria. Name parameter values: ProjectId, Name, Status, Provider</p>
     */
    public ProjectFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. Name parameter values: ProjectId, Name, Status, Provider</p>
     * @param Filters <p>Filter criteria. Name parameter values: ProjectId, Name, Status, Provider</p>
     */
    public void setFilters(ProjectFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Query by project ID</p> 
     * @return ProjectIds <p>Query by project ID</p>
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>Query by project ID</p>
     * @param ProjectIds <p>Query by project ID</p>
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>Sorting field. CreatedOn, ModifiedOn. Default: CreatedOn</p> 
     * @return OrderBy <p>Sorting field. CreatedOn, ModifiedOn. Default: CreatedOn</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field. CreatedOn, ModifiedOn. Default: CreatedOn</p>
     * @param OrderBy <p>Sorting field. CreatedOn, ModifiedOn. Default: CreatedOn</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting order. Asc, Desc, ASC, DESC. Default: DESC</p> 
     * @return OrderType <p>Sorting order. Asc, Desc, ASC, DESC. Default: DESC</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting order. Asc, Desc, ASC, DESC. Default: DESC</p>
     * @param OrderType <p>Sorting order. Asc, Desc, ASC, DESC. Default: DESC</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Source. Only return the Upload project on drop</p> 
     * @return Source <p>Source. Only return the Upload project on drop</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source. Only return the Upload project on drop</p>
     * @param Source <p>Source. Only return the Upload project on drop</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Fuzzy search by project name</p> 
     * @return Query <p>Fuzzy search by project name</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Fuzzy search by project name</p>
     * @param Query <p>Fuzzy search by project name</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ProjectFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ProjectFilter(source.Filters[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

