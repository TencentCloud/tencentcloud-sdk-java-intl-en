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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCatalogsRequest extends AbstractModel {

    /**
    * <p>Workspace unique id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Maximum number of result entries</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>Pagination token</p>
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * <p>catalog type. Valid values: TABLE, MODEL, VOLUME</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>Whether to return only those in the current workspace that are authorized. If false, it additionally returns the catalogs that the current user has permission to manage.</p>
    */
    @SerializedName("CurrentWorkspaceOnly")
    @Expose
    private Boolean CurrentWorkspaceOnly;

    /**
    * <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p>
    */
    @SerializedName("FetchOption")
    @Expose
    private FetchOption FetchOption;

    /**
    * Data catalog source filter criteria (additional field in Fusion Edition). For values, see CatalogSourceEnum. Empty array or not passed: only tclake is queried. ["METALAKE"]: only tclake is queried. ["CONNECTION"]: only the analytics edition ana_catalog is queried. ["METALAKE","CONNECTION"]: merged and returned.
    */
    @SerializedName("CatalogSources")
    @Expose
    private String [] CatalogSources;

    /**
     * Get <p>Workspace unique id</p> 
     * @return WorkspaceId <p>Workspace unique id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace unique id</p>
     * @param WorkspaceId <p>Workspace unique id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Maximum number of result entries</p> 
     * @return MaxResults <p>Maximum number of result entries</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>Maximum number of result entries</p>
     * @param MaxResults <p>Maximum number of result entries</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>Pagination token</p> 
     * @return PageToken <p>Pagination token</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>Pagination token</p>
     * @param PageToken <p>Pagination token</p>
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get <p>catalog type. Valid values: TABLE, MODEL, VOLUME</p> 
     * @return Types <p>catalog type. Valid values: TABLE, MODEL, VOLUME</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>catalog type. Valid values: TABLE, MODEL, VOLUME</p>
     * @param Types <p>catalog type. Valid values: TABLE, MODEL, VOLUME</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>Whether to return only those in the current workspace that are authorized. If false, it additionally returns the catalogs that the current user has permission to manage.</p> 
     * @return CurrentWorkspaceOnly <p>Whether to return only those in the current workspace that are authorized. If false, it additionally returns the catalogs that the current user has permission to manage.</p>
     */
    public Boolean getCurrentWorkspaceOnly() {
        return this.CurrentWorkspaceOnly;
    }

    /**
     * Set <p>Whether to return only those in the current workspace that are authorized. If false, it additionally returns the catalogs that the current user has permission to manage.</p>
     * @param CurrentWorkspaceOnly <p>Whether to return only those in the current workspace that are authorized. If false, it additionally returns the catalogs that the current user has permission to manage.</p>
     */
    public void setCurrentWorkspaceOnly(Boolean CurrentWorkspaceOnly) {
        this.CurrentWorkspaceOnly = CurrentWorkspaceOnly;
    }

    /**
     * Get <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p> 
     * @return FetchOption <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p>
     */
    public FetchOption getFetchOption() {
        return this.FetchOption;
    }

    /**
     * Set <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p>
     * @param FetchOption <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p>
     */
    public void setFetchOption(FetchOption FetchOption) {
        this.FetchOption = FetchOption;
    }

    /**
     * Get Data catalog source filter criteria (additional field in Fusion Edition). For values, see CatalogSourceEnum. Empty array or not passed: only tclake is queried. ["METALAKE"]: only tclake is queried. ["CONNECTION"]: only the analytics edition ana_catalog is queried. ["METALAKE","CONNECTION"]: merged and returned. 
     * @return CatalogSources Data catalog source filter criteria (additional field in Fusion Edition). For values, see CatalogSourceEnum. Empty array or not passed: only tclake is queried. ["METALAKE"]: only tclake is queried. ["CONNECTION"]: only the analytics edition ana_catalog is queried. ["METALAKE","CONNECTION"]: merged and returned.
     */
    public String [] getCatalogSources() {
        return this.CatalogSources;
    }

    /**
     * Set Data catalog source filter criteria (additional field in Fusion Edition). For values, see CatalogSourceEnum. Empty array or not passed: only tclake is queried. ["METALAKE"]: only tclake is queried. ["CONNECTION"]: only the analytics edition ana_catalog is queried. ["METALAKE","CONNECTION"]: merged and returned.
     * @param CatalogSources Data catalog source filter criteria (additional field in Fusion Edition). For values, see CatalogSourceEnum. Empty array or not passed: only tclake is queried. ["METALAKE"]: only tclake is queried. ["CONNECTION"]: only the analytics edition ana_catalog is queried. ["METALAKE","CONNECTION"]: merged and returned.
     */
    public void setCatalogSources(String [] CatalogSources) {
        this.CatalogSources = CatalogSources;
    }

    public ListCatalogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogsRequest(ListCatalogsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.CurrentWorkspaceOnly != null) {
            this.CurrentWorkspaceOnly = new Boolean(source.CurrentWorkspaceOnly);
        }
        if (source.FetchOption != null) {
            this.FetchOption = new FetchOption(source.FetchOption);
        }
        if (source.CatalogSources != null) {
            this.CatalogSources = new String[source.CatalogSources.length];
            for (int i = 0; i < source.CatalogSources.length; i++) {
                this.CatalogSources[i] = new String(source.CatalogSources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "CurrentWorkspaceOnly", this.CurrentWorkspaceOnly);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);
        this.setParamArraySimple(map, prefix + "CatalogSources.", this.CatalogSources);

    }
}

