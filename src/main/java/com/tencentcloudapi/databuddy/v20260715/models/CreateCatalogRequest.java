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

public class CreateCatalogRequest extends AbstractModel {

    /**
    * catalog name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * catalog type. Available values: TABLE, MODEL, VOLUME
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Workspace unique id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Description
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * ID of the connection
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * Data catalog source. Option (additional field in the fusion edition). For values, see CatalogSourceEnum: METALAKE (pro edition) / CONNECTION (analytics edition). If not specified, it is handled as METALAKE by default.
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
    * Catalog name or database name on the connection side. Required for three-segment data sources, not required for two-segment data sources such as MySQL. For three-segment data sources with MySQL kernels such as Doris, StarRocks, and TChouse-D, fill in the external catalog name. For three-segment data sources with PG kernels such as PostgreSQL, Tencent PG, GaussDB, and Hologres, fill in the databaseName. Not required for two-segment data sources such as MySQL.
    */
    @SerializedName("ConnectionCatalogName")
    @Expose
    private String ConnectionCatalogName;

    /**
     * Get catalog name 
     * @return Name catalog name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set catalog name
     * @param Name catalog name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get catalog type. Available values: TABLE, MODEL, VOLUME 
     * @return Type catalog type. Available values: TABLE, MODEL, VOLUME
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set catalog type. Available values: TABLE, MODEL, VOLUME
     * @param Type catalog type. Available values: TABLE, MODEL, VOLUME
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Workspace unique id 
     * @return WorkspaceId Workspace unique id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set Workspace unique id
     * @param WorkspaceId Workspace unique id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get Description 
     * @return Comment Description
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description
     * @param Comment Description
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get ID of the connection 
     * @return ConnectionId ID of the connection
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set ID of the connection
     * @param ConnectionId ID of the connection
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get Data catalog source. Option (additional field in the fusion edition). For values, see CatalogSourceEnum: METALAKE (pro edition) / CONNECTION (analytics edition). If not specified, it is handled as METALAKE by default. 
     * @return CatalogSource Data catalog source. Option (additional field in the fusion edition). For values, see CatalogSourceEnum: METALAKE (pro edition) / CONNECTION (analytics edition). If not specified, it is handled as METALAKE by default.
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set Data catalog source. Option (additional field in the fusion edition). For values, see CatalogSourceEnum: METALAKE (pro edition) / CONNECTION (analytics edition). If not specified, it is handled as METALAKE by default.
     * @param CatalogSource Data catalog source. Option (additional field in the fusion edition). For values, see CatalogSourceEnum: METALAKE (pro edition) / CONNECTION (analytics edition). If not specified, it is handled as METALAKE by default.
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    /**
     * Get Catalog name or database name on the connection side. Required for three-segment data sources, not required for two-segment data sources such as MySQL. For three-segment data sources with MySQL kernels such as Doris, StarRocks, and TChouse-D, fill in the external catalog name. For three-segment data sources with PG kernels such as PostgreSQL, Tencent PG, GaussDB, and Hologres, fill in the databaseName. Not required for two-segment data sources such as MySQL. 
     * @return ConnectionCatalogName Catalog name or database name on the connection side. Required for three-segment data sources, not required for two-segment data sources such as MySQL. For three-segment data sources with MySQL kernels such as Doris, StarRocks, and TChouse-D, fill in the external catalog name. For three-segment data sources with PG kernels such as PostgreSQL, Tencent PG, GaussDB, and Hologres, fill in the databaseName. Not required for two-segment data sources such as MySQL.
     */
    public String getConnectionCatalogName() {
        return this.ConnectionCatalogName;
    }

    /**
     * Set Catalog name or database name on the connection side. Required for three-segment data sources, not required for two-segment data sources such as MySQL. For three-segment data sources with MySQL kernels such as Doris, StarRocks, and TChouse-D, fill in the external catalog name. For three-segment data sources with PG kernels such as PostgreSQL, Tencent PG, GaussDB, and Hologres, fill in the databaseName. Not required for two-segment data sources such as MySQL.
     * @param ConnectionCatalogName Catalog name or database name on the connection side. Required for three-segment data sources, not required for two-segment data sources such as MySQL. For three-segment data sources with MySQL kernels such as Doris, StarRocks, and TChouse-D, fill in the external catalog name. For three-segment data sources with PG kernels such as PostgreSQL, Tencent PG, GaussDB, and Hologres, fill in the databaseName. Not required for two-segment data sources such as MySQL.
     */
    public void setConnectionCatalogName(String ConnectionCatalogName) {
        this.ConnectionCatalogName = ConnectionCatalogName;
    }

    public CreateCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCatalogRequest(CreateCatalogRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
        if (source.ConnectionCatalogName != null) {
            this.ConnectionCatalogName = new String(source.ConnectionCatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);
        this.setParamSimple(map, prefix + "ConnectionCatalogName", this.ConnectionCatalogName);

    }
}

