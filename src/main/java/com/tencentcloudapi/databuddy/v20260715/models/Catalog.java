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

public class Catalog extends AbstractModel {

    /**
    * <p>Unique id of the data catalog.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Data catalog name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Data catalog type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Data catalog description</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Status info: being registered 0, trial 1, connected successfully 2, connection failure 3, deleting 4, deleted 5</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Data catalog properties</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>Operator</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>Responsible person information.</p>
    */
    @SerializedName("MetaOwner")
    @Expose
    private MetaOwner MetaOwner;

    /**
    * <p>Audit information</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * <p>Globally unique ID of the asset</p>
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * <p>Current workspace permission level. The value corresponds to PermissionLevel: 0 - no permission, 1 - read-only, 2 - read-write</p>
    */
    @SerializedName("CurrentWorkspacePermissionLevel")
    @Expose
    private Long CurrentWorkspacePermissionLevel;

    /**
    * <p>tccatalog.identifier in tccatalog properties</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>Permission information of the current user for this entity.</p>
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * <p>Whether it is an external data Catalog (a Catalog created based on a data source connection, such as MYSQL, EMR_HIVE, TCHOUSE_D, POSTGRESQL, DLC). true: external Catalog, false: built-in Catalog (TABLE/MODEL/VOLUME)</p>
    */
    @SerializedName("IsExternal")
    @Expose
    private Boolean IsExternal;

    /**
    * <p>Tag information list. Note: It is returned only when FetchTags=true in the request. By default, it is not returned.</p>
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
    * <p>Data catalog source</p>
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
    * <p>The data catalog name or database name on the connection side (only available for three-segment data sources in the analytics edition; empty string for two-segment data sources). For MySQL-kernel three-segment data sources such as Doris/StarRocks/TChouse-D: external catalog name; for PG-kernel three-segment data sources such as PostgreSQL/Tencent PG/GaussDB/Hologres: databaseName; for two-segment data sources such as MySQL: empty string. Note: This field is only valid for the analytics edition (CatalogSource=CONNECTION) and is not filled for the pro edition (METALAKE).</p>
    */
    @SerializedName("ConnectionCatalogName")
    @Expose
    private String ConnectionCatalogName;

    /**
     * Get <p>Unique id of the data catalog.</p> 
     * @return Id <p>Unique id of the data catalog.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Unique id of the data catalog.</p>
     * @param Id <p>Unique id of the data catalog.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Data catalog name.</p> 
     * @return Name <p>Data catalog name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Data catalog name.</p>
     * @param Name <p>Data catalog name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Data catalog type</p> 
     * @return Type <p>Data catalog type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Data catalog type</p>
     * @param Type <p>Data catalog type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Data catalog description</p> 
     * @return Comment <p>Data catalog description</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Data catalog description</p>
     * @param Comment <p>Data catalog description</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Status info: being registered 0, trial 1, connected successfully 2, connection failure 3, deleting 4, deleted 5</p> 
     * @return Status <p>Status info: being registered 0, trial 1, connected successfully 2, connection failure 3, deleting 4, deleted 5</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status info: being registered 0, trial 1, connected successfully 2, connection failure 3, deleting 4, deleted 5</p>
     * @param Status <p>Status info: being registered 0, trial 1, connected successfully 2, connection failure 3, deleting 4, deleted 5</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Data catalog properties</p> 
     * @return Properties <p>Data catalog properties</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>Data catalog properties</p>
     * @param Properties <p>Data catalog properties</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>Operator</p> 
     * @return Operator <p>Operator</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>Operator</p>
     * @param Operator <p>Operator</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>Responsible person information.</p> 
     * @return MetaOwner <p>Responsible person information.</p>
     */
    public MetaOwner getMetaOwner() {
        return this.MetaOwner;
    }

    /**
     * Set <p>Responsible person information.</p>
     * @param MetaOwner <p>Responsible person information.</p>
     */
    public void setMetaOwner(MetaOwner MetaOwner) {
        this.MetaOwner = MetaOwner;
    }

    /**
     * Get <p>Audit information</p> 
     * @return Audit <p>Audit information</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>Audit information</p>
     * @param Audit <p>Audit information</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get <p>Globally unique ID of the asset</p> 
     * @return AssetGuid <p>Globally unique ID of the asset</p>
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set <p>Globally unique ID of the asset</p>
     * @param AssetGuid <p>Globally unique ID of the asset</p>
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    /**
     * Get <p>Current workspace permission level. The value corresponds to PermissionLevel: 0 - no permission, 1 - read-only, 2 - read-write</p> 
     * @return CurrentWorkspacePermissionLevel <p>Current workspace permission level. The value corresponds to PermissionLevel: 0 - no permission, 1 - read-only, 2 - read-write</p>
     */
    public Long getCurrentWorkspacePermissionLevel() {
        return this.CurrentWorkspacePermissionLevel;
    }

    /**
     * Set <p>Current workspace permission level. The value corresponds to PermissionLevel: 0 - no permission, 1 - read-only, 2 - read-write</p>
     * @param CurrentWorkspacePermissionLevel <p>Current workspace permission level. The value corresponds to PermissionLevel: 0 - no permission, 1 - read-only, 2 - read-write</p>
     */
    public void setCurrentWorkspacePermissionLevel(Long CurrentWorkspacePermissionLevel) {
        this.CurrentWorkspacePermissionLevel = CurrentWorkspacePermissionLevel;
    }

    /**
     * Get <p>tccatalog.identifier in tccatalog properties</p> 
     * @return Identifier <p>tccatalog.identifier in tccatalog properties</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>tccatalog.identifier in tccatalog properties</p>
     * @param Identifier <p>tccatalog.identifier in tccatalog properties</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>Permission information of the current user for this entity.</p> 
     * @return PermissionDetail <p>Permission information of the current user for this entity.</p>
     */
    public PermissionDetail getPermissionDetail() {
        return this.PermissionDetail;
    }

    /**
     * Set <p>Permission information of the current user for this entity.</p>
     * @param PermissionDetail <p>Permission information of the current user for this entity.</p>
     */
    public void setPermissionDetail(PermissionDetail PermissionDetail) {
        this.PermissionDetail = PermissionDetail;
    }

    /**
     * Get <p>Whether it is an external data Catalog (a Catalog created based on a data source connection, such as MYSQL, EMR_HIVE, TCHOUSE_D, POSTGRESQL, DLC). true: external Catalog, false: built-in Catalog (TABLE/MODEL/VOLUME)</p> 
     * @return IsExternal <p>Whether it is an external data Catalog (a Catalog created based on a data source connection, such as MYSQL, EMR_HIVE, TCHOUSE_D, POSTGRESQL, DLC). true: external Catalog, false: built-in Catalog (TABLE/MODEL/VOLUME)</p>
     */
    public Boolean getIsExternal() {
        return this.IsExternal;
    }

    /**
     * Set <p>Whether it is an external data Catalog (a Catalog created based on a data source connection, such as MYSQL, EMR_HIVE, TCHOUSE_D, POSTGRESQL, DLC). true: external Catalog, false: built-in Catalog (TABLE/MODEL/VOLUME)</p>
     * @param IsExternal <p>Whether it is an external data Catalog (a Catalog created based on a data source connection, such as MYSQL, EMR_HIVE, TCHOUSE_D, POSTGRESQL, DLC). true: external Catalog, false: built-in Catalog (TABLE/MODEL/VOLUME)</p>
     */
    public void setIsExternal(Boolean IsExternal) {
        this.IsExternal = IsExternal;
    }

    /**
     * Get <p>Tag information list. Note: It is returned only when FetchTags=true in the request. By default, it is not returned.</p> 
     * @return Tags <p>Tag information list. Note: It is returned only when FetchTags=true in the request. By default, it is not returned.</p>
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information list. Note: It is returned only when FetchTags=true in the request. By default, it is not returned.</p>
     * @param Tags <p>Tag information list. Note: It is returned only when FetchTags=true in the request. By default, it is not returned.</p>
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Data catalog source</p> 
     * @return CatalogSource <p>Data catalog source</p>
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>Data catalog source</p>
     * @param CatalogSource <p>Data catalog source</p>
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    /**
     * Get <p>The data catalog name or database name on the connection side (only available for three-segment data sources in the analytics edition; empty string for two-segment data sources). For MySQL-kernel three-segment data sources such as Doris/StarRocks/TChouse-D: external catalog name; for PG-kernel three-segment data sources such as PostgreSQL/Tencent PG/GaussDB/Hologres: databaseName; for two-segment data sources such as MySQL: empty string. Note: This field is only valid for the analytics edition (CatalogSource=CONNECTION) and is not filled for the pro edition (METALAKE).</p> 
     * @return ConnectionCatalogName <p>The data catalog name or database name on the connection side (only available for three-segment data sources in the analytics edition; empty string for two-segment data sources). For MySQL-kernel three-segment data sources such as Doris/StarRocks/TChouse-D: external catalog name; for PG-kernel three-segment data sources such as PostgreSQL/Tencent PG/GaussDB/Hologres: databaseName; for two-segment data sources such as MySQL: empty string. Note: This field is only valid for the analytics edition (CatalogSource=CONNECTION) and is not filled for the pro edition (METALAKE).</p>
     */
    public String getConnectionCatalogName() {
        return this.ConnectionCatalogName;
    }

    /**
     * Set <p>The data catalog name or database name on the connection side (only available for three-segment data sources in the analytics edition; empty string for two-segment data sources). For MySQL-kernel three-segment data sources such as Doris/StarRocks/TChouse-D: external catalog name; for PG-kernel three-segment data sources such as PostgreSQL/Tencent PG/GaussDB/Hologres: databaseName; for two-segment data sources such as MySQL: empty string. Note: This field is only valid for the analytics edition (CatalogSource=CONNECTION) and is not filled for the pro edition (METALAKE).</p>
     * @param ConnectionCatalogName <p>The data catalog name or database name on the connection side (only available for three-segment data sources in the analytics edition; empty string for two-segment data sources). For MySQL-kernel three-segment data sources such as Doris/StarRocks/TChouse-D: external catalog name; for PG-kernel three-segment data sources such as PostgreSQL/Tencent PG/GaussDB/Hologres: databaseName; for two-segment data sources such as MySQL: empty string. Note: This field is only valid for the analytics edition (CatalogSource=CONNECTION) and is not filled for the pro edition (METALAKE).</p>
     */
    public void setConnectionCatalogName(String ConnectionCatalogName) {
        this.ConnectionCatalogName = ConnectionCatalogName;
    }

    public Catalog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Catalog(Catalog source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.MetaOwner != null) {
            this.MetaOwner = new MetaOwner(source.MetaOwner);
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.CurrentWorkspacePermissionLevel != null) {
            this.CurrentWorkspacePermissionLevel = new Long(source.CurrentWorkspacePermissionLevel);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.PermissionDetail != null) {
            this.PermissionDetail = new PermissionDetail(source.PermissionDetail);
        }
        if (source.IsExternal != null) {
            this.IsExternal = new Boolean(source.IsExternal);
        }
        if (source.Tags != null) {
            this.Tags = new CommonTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CommonTagInfo(source.Tags[i]);
            }
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamSimple(map, prefix + "CurrentWorkspacePermissionLevel", this.CurrentWorkspacePermissionLevel);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamSimple(map, prefix + "IsExternal", this.IsExternal);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);
        this.setParamSimple(map, prefix + "ConnectionCatalogName", this.ConnectionCatalogName);

    }
}

