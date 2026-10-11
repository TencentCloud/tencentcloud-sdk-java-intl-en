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

public class GetCatalogRequest extends AbstractModel {

    /**
    * <p>Data catalog name.</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>Unique id of the workspace where the call is made.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Data directory id</p>
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * <p>Data access option. Selectable. Controls whether to return permission information and filter by permission.</p>
    */
    @SerializedName("FetchOption")
    @Expose
    private FetchOption FetchOption;

    /**
    * <p>Data source connection ID, selectable (additional field in fusion edition). Non-empty → use the analytical path; empty/default → use the professional edition TcLake path</p>
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * <p>Data Catalog source, selectable (additional field for Setats fusion). Value: METALAKE (pro edition tclake) / CONNECTION (analytical edition Linked Catalog) / Setats (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deem as CONNECTION) > default METALAKE; ConnectionId will be ignored when CatalogSource is non-empty.</p>
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
     * Get <p>Data catalog name.</p> 
     * @return CatalogName <p>Data catalog name.</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>Data catalog name.</p>
     * @param CatalogName <p>Data catalog name.</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>Unique id of the workspace where the call is made.</p> 
     * @return WorkspaceId <p>Unique id of the workspace where the call is made.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Unique id of the workspace where the call is made.</p>
     * @param WorkspaceId <p>Unique id of the workspace where the call is made.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Data directory id</p> 
     * @return CatalogId <p>Data directory id</p>
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set <p>Data directory id</p>
     * @param CatalogId <p>Data directory id</p>
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
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
     * Get <p>Data source connection ID, selectable (additional field in fusion edition). Non-empty → use the analytical path; empty/default → use the professional edition TcLake path</p> 
     * @return ConnectionId <p>Data source connection ID, selectable (additional field in fusion edition). Non-empty → use the analytical path; empty/default → use the professional edition TcLake path</p>
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set <p>Data source connection ID, selectable (additional field in fusion edition). Non-empty → use the analytical path; empty/default → use the professional edition TcLake path</p>
     * @param ConnectionId <p>Data source connection ID, selectable (additional field in fusion edition). Non-empty → use the analytical path; empty/default → use the professional edition TcLake path</p>
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get <p>Data Catalog source, selectable (additional field for Setats fusion). Value: METALAKE (pro edition tclake) / CONNECTION (analytical edition Linked Catalog) / Setats (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deem as CONNECTION) > default METALAKE; ConnectionId will be ignored when CatalogSource is non-empty.</p> 
     * @return CatalogSource <p>Data Catalog source, selectable (additional field for Setats fusion). Value: METALAKE (pro edition tclake) / CONNECTION (analytical edition Linked Catalog) / Setats (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deem as CONNECTION) > default METALAKE; ConnectionId will be ignored when CatalogSource is non-empty.</p>
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>Data Catalog source, selectable (additional field for Setats fusion). Value: METALAKE (pro edition tclake) / CONNECTION (analytical edition Linked Catalog) / Setats (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deem as CONNECTION) > default METALAKE; ConnectionId will be ignored when CatalogSource is non-empty.</p>
     * @param CatalogSource <p>Data Catalog source, selectable (additional field for Setats fusion). Value: METALAKE (pro edition tclake) / CONNECTION (analytical edition Linked Catalog) / Setats (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deem as CONNECTION) > default METALAKE; ConnectionId will be ignored when CatalogSource is non-empty.</p>
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    public GetCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCatalogRequest(GetCatalogRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
        if (source.FetchOption != null) {
            this.FetchOption = new FetchOption(source.FetchOption);
        }
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

