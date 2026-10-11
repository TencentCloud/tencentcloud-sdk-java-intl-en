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

public class DeleteSchemaRequest extends AbstractModel {

    /**
    * Data catalog name
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Database name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Unique id of the workspace where the call is made
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Data source connection ID. Selectable (additional field in Fusion Edition). Schemas in the analytics edition catalog cannot be deleted. If a non-empty value is imported, the server returns the ANA_catalog_NOT_SUPPORTED error.
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * Data catalog source. Optional (additional fields added by Setats fusion). Values: METALAKE (Pro Edition tclake) / CONNECTION (Analytics Edition Linked Catalog) / SETATS (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deemed as CONNECTION) > default METALAKE. ConnectionId will be ignored when CatalogSource is non-empty.
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
     * Get Data catalog name 
     * @return CatalogName Data catalog name
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Data catalog name
     * @param CatalogName Data catalog name
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Database name 
     * @return SchemaName Database name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Database name
     * @param SchemaName Database name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Unique id of the workspace where the call is made 
     * @return WorkspaceId Unique id of the workspace where the call is made
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set Unique id of the workspace where the call is made
     * @param WorkspaceId Unique id of the workspace where the call is made
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get Data source connection ID. Selectable (additional field in Fusion Edition). Schemas in the analytics edition catalog cannot be deleted. If a non-empty value is imported, the server returns the ANA_catalog_NOT_SUPPORTED error. 
     * @return ConnectionId Data source connection ID. Selectable (additional field in Fusion Edition). Schemas in the analytics edition catalog cannot be deleted. If a non-empty value is imported, the server returns the ANA_catalog_NOT_SUPPORTED error.
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set Data source connection ID. Selectable (additional field in Fusion Edition). Schemas in the analytics edition catalog cannot be deleted. If a non-empty value is imported, the server returns the ANA_catalog_NOT_SUPPORTED error.
     * @param ConnectionId Data source connection ID. Selectable (additional field in Fusion Edition). Schemas in the analytics edition catalog cannot be deleted. If a non-empty value is imported, the server returns the ANA_catalog_NOT_SUPPORTED error.
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get Data catalog source. Optional (additional fields added by Setats fusion). Values: METALAKE (Pro Edition tclake) / CONNECTION (Analytics Edition Linked Catalog) / SETATS (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deemed as CONNECTION) > default METALAKE. ConnectionId will be ignored when CatalogSource is non-empty. 
     * @return CatalogSource Data catalog source. Optional (additional fields added by Setats fusion). Values: METALAKE (Pro Edition tclake) / CONNECTION (Analytics Edition Linked Catalog) / SETATS (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deemed as CONNECTION) > default METALAKE. ConnectionId will be ignored when CatalogSource is non-empty.
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set Data catalog source. Optional (additional fields added by Setats fusion). Values: METALAKE (Pro Edition tclake) / CONNECTION (Analytics Edition Linked Catalog) / SETATS (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deemed as CONNECTION) > default METALAKE. ConnectionId will be ignored when CatalogSource is non-empty.
     * @param CatalogSource Data catalog source. Optional (additional fields added by Setats fusion). Values: METALAKE (Pro Edition tclake) / CONNECTION (Analytics Edition Linked Catalog) / SETATS (Setats metadata). Routing priority: explicit non-empty CatalogSource > non-empty ConnectionId (deemed as CONNECTION) > default METALAKE. ConnectionId will be ignored when CatalogSource is non-empty.
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    public DeleteSchemaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSchemaRequest(DeleteSchemaRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
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
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

