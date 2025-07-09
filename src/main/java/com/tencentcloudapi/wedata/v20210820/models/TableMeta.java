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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableMeta extends AbstractModel {

    /**
    * Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TablePath")
    @Expose
    private String TablePath;

    /**
    * Chinese Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableNameCn")
    @Expose
    private String TableNameCn;

    /**
    * Metadata Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreId")
    @Expose
    private Long MetastoreId;

    /**
    * Technology Type, available values: HIVE,MYSQL,KAFKA, HBASE
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * Table Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Column Separator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnSeparator")
    @Expose
    private String ColumnSeparator;

    /**
    * Storage Format
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageFormat")
    @Expose
    private String StorageFormat;

    /**
    * Storage Volume, Byte Count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Table Types, such as hive MANAGED_TABLE;EXTERNAL_TABLE
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest Data Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Latest DDL Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DdlModifyTime")
    @Expose
    private String DdlModifyTime;

    /**
    * Last Access Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * Project Name in English
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Data Directory ID (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BizCatalogIds")
    @Expose
    private String [] BizCatalogIds;

    /**
    * Data Directory (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BizCatalogNames")
    @Expose
    private String [] BizCatalogNames;

    /**
    * true for Favorited/false indicates not favorited
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasFavorite")
    @Expose
    private Boolean HasFavorite;

    /**
    * LifecycleNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LifeCycleTime")
    @Expose
    private Long LifeCycleTime;

    /**
    * Storage Volume, displayed in appropriate units
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * Instance ID of the Data Source Engine: e.g., EMR Cluster Instance ID/Data Source Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data Source Technology Type: HIVE/MYSQL/HBASE/KAFKA etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TechnologyType")
    @Expose
    private String TechnologyType;

    /**
    * Table English Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableNameEn")
    @Expose
    private String TableNameEn;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Number of partitions in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * Number of replicas in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReplicationFactor")
    @Expose
    private String ReplicationFactor;

    /**
    * Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * Last Modified Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataModifyTime")
    @Expose
    private String DataModifyTime;

    /**
    * Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Current user has Administrator Privileges
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasAdminAuthority")
    @Expose
    private Boolean HasAdminAuthority;

    /**
    * Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceDisplayName")
    @Expose
    private String DatasourceDisplayName;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Total favorites on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FavoriteCount")
    @Expose
    private Long FavoriteCount;

    /**
    * Total likes on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LikeCount")
    @Expose
    private Long LikeCount;

    /**
    * true for liked/false for not liked status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasLike")
    @Expose
    private Boolean HasLike;

    /**
    * Asset score of the table
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TablePropertyScore")
    @Expose
    private TablePropertyScore TablePropertyScore;

    /**
    * Heat value of the table
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableHeat")
    @Expose
    private TableHeat TableHeat;

    /**
    * Data source ownerProjectId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerId")
    @Expose
    private String TableOwnerId;

    /**
    * System Source -CLUSTER, DB - Self Definition Source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataSourceCategory")
    @Expose
    private String DataSourceCategory;

    /**
    * Table Field Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private SearchColumnDocVO [] Columns;

    /**
    * Table Collection Type
TABLE, VIEW, MANAGED_TABLE (Hive managed table), EXTERNAL_TABLE (Hive external table), VIRTUAL_VIEW (virtual view), MATERIALIZED_VIEW (materialized view), LATERAL_VIEW, INDEX_TABLE (index table), END_SELECT (query structure), INSTANCE (intermediate temporary table type (data lineage)), CDW (CDW table type)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetaCrawlType")
    @Expose
    private String MetaCrawlType;

    /**
    * Is View
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsView")
    @Expose
    private Boolean IsView;

    /**
    * Storage locationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Determine if it is a partitioned table 1 Yes 0 No
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsPartitionTable")
    @Expose
    private Long IsPartitionTable;

    /**
    * Partition Field Key
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionColumns")
    @Expose
    private String [] PartitionColumns;

    /**
    * Lifecycle - Partition Retention Days [Valid when Partition Retention Policy is applied]
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionExpireDays")
    @Expose
    private Long PartitionExpireDays;

    /**
    * Table Ancillary Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableProperties")
    @Expose
    private TableMetaProperty [] TableProperties;

    /**
     * Get Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerName Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerName Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Cluster Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterName Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterName Cluster Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Data Source Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Table Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TablePath Table Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTablePath() {
        return this.TablePath;
    }

    /**
     * Set Table Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TablePath Table Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTablePath(String TablePath) {
        this.TablePath = TablePath;
    }

    /**
     * Get Chinese Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableNameCn Chinese Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableNameCn() {
        return this.TableNameCn;
    }

    /**
     * Set Chinese Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableNameCn Chinese Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableNameCn(String TableNameCn) {
        this.TableNameCn = TableNameCn;
    }

    /**
     * Get Metadata Tenant ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreId Metadata Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMetastoreId() {
        return this.MetastoreId;
    }

    /**
     * Set Metadata Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreId Metadata Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreId(Long MetastoreId) {
        this.MetastoreId = MetastoreId;
    }

    /**
     * Get Technology Type, available values: HIVE,MYSQL,KAFKA, HBASE
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreType Technology Type, available values: HIVE,MYSQL,KAFKA, HBASE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set Technology Type, available values: HIVE,MYSQL,KAFKA, HBASE
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreType Technology Type, available values: HIVE,MYSQL,KAFKA, HBASE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get Table Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Table Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Table Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Table Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Column Separator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnSeparator Column Separator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnSeparator() {
        return this.ColumnSeparator;
    }

    /**
     * Set Column Separator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnSeparator Column Separator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnSeparator(String ColumnSeparator) {
        this.ColumnSeparator = ColumnSeparator;
    }

    /**
     * Get Storage Format
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageFormat Storage Format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStorageFormat() {
        return this.StorageFormat;
    }

    /**
     * Set Storage Format
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageFormat Storage Format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageFormat(String StorageFormat) {
        this.StorageFormat = StorageFormat;
    }

    /**
     * Get Storage Volume, Byte Count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageSize Storage Volume, Byte Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage Volume, Byte Count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageSize Storage Volume, Byte Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Table Types, such as hive MANAGED_TABLE;EXTERNAL_TABLE
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableType Table Types, such as hive MANAGED_TABLE;EXTERNAL_TABLE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table Types, such as hive MANAGED_TABLE;EXTERNAL_TABLE
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableType Table Types, such as hive MANAGED_TABLE;EXTERNAL_TABLE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest Data Modification Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifyTime Latest Data Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Latest Data Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Latest Data Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Latest DDL Modification Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DdlModifyTime Latest DDL Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDdlModifyTime() {
        return this.DdlModifyTime;
    }

    /**
     * Set Latest DDL Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DdlModifyTime Latest DDL Modification Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDdlModifyTime(String DdlModifyTime) {
        this.DdlModifyTime = DdlModifyTime;
    }

    /**
     * Get Last Access Time of Data
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastAccessTime Last Access Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set Last Access Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastAccessTime Last Access Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get Project Name in English
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project Name in English
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project Name in English
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project Name in English
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Data Directory ID (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BizCatalogIds Data Directory ID (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getBizCatalogIds() {
        return this.BizCatalogIds;
    }

    /**
     * Set Data Directory ID (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BizCatalogIds Data Directory ID (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBizCatalogIds(String [] BizCatalogIds) {
        this.BizCatalogIds = BizCatalogIds;
    }

    /**
     * Get Data Directory (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BizCatalogNames Data Directory (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getBizCatalogNames() {
        return this.BizCatalogNames;
    }

    /**
     * Set Data Directory (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BizCatalogNames Data Directory (may be multiple)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBizCatalogNames(String [] BizCatalogNames) {
        this.BizCatalogNames = BizCatalogNames;
    }

    /**
     * Get true for Favorited/false indicates not favorited
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasFavorite true for Favorited/false indicates not favorited
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getHasFavorite() {
        return this.HasFavorite;
    }

    /**
     * Set true for Favorited/false indicates not favorited
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasFavorite true for Favorited/false indicates not favorited
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasFavorite(Boolean HasFavorite) {
        this.HasFavorite = HasFavorite;
    }

    /**
     * Get LifecycleNote: This field may return null, indicating that no valid value can be obtained. 
     * @return LifeCycleTime LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLifeCycleTime() {
        return this.LifeCycleTime;
    }

    /**
     * Set LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     * @param LifeCycleTime LifecycleNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLifeCycleTime(Long LifeCycleTime) {
        this.LifeCycleTime = LifeCycleTime;
    }

    /**
     * Get Storage Volume, displayed in appropriate units
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageSizeWithUnit Storage Volume, displayed in appropriate units
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set Storage Volume, displayed in appropriate units
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageSizeWithUnit Storage Volume, displayed in appropriate units
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get Instance ID of the Data Source Engine: e.g., EMR Cluster Instance ID/Data Source Instance ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance ID of the Data Source Engine: e.g., EMR Cluster Instance ID/Data Source Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the Data Source Engine: e.g., EMR Cluster Instance ID/Data Source Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance ID of the Data Source Engine: e.g., EMR Cluster Instance ID/Data Source Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data Source Technology Type: HIVE/MYSQL/HBASE/KAFKA etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TechnologyType Data Source Technology Type: HIVE/MYSQL/HBASE/KAFKA etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTechnologyType() {
        return this.TechnologyType;
    }

    /**
     * Set Data Source Technology Type: HIVE/MYSQL/HBASE/KAFKA etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TechnologyType Data Source Technology Type: HIVE/MYSQL/HBASE/KAFKA etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTechnologyType(String TechnologyType) {
        this.TechnologyType = TechnologyType;
    }

    /**
     * Get Table English Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableNameEn Table English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableNameEn() {
        return this.TableNameEn;
    }

    /**
     * Set Table English Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableNameEn Table English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableNameEn(String TableNameEn) {
        this.TableNameEn = TableNameEn;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Number of partitions in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Partitions Number of partitions in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Number of partitions in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Partitions Number of partitions in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Number of replicas in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReplicationFactor Number of replicas in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReplicationFactor() {
        return this.ReplicationFactor;
    }

    /**
     * Set Number of replicas in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReplicationFactor Number of replicas in Kafka Topic
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReplicationFactor(String ReplicationFactor) {
        this.ReplicationFactor = ReplicationFactor;
    }

    /**
     * Get Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectDisplayName Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectDisplayName Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get Last Modified Time of Data
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataModifyTime Last Modified Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDataModifyTime() {
        return this.DataModifyTime;
    }

    /**
     * Set Last Modified Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataModifyTime Last Modified Time of Data
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataModifyTime(String DataModifyTime) {
        this.DataModifyTime = DataModifyTime;
    }

    /**
     * Get Cluster ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Current user has Administrator Privileges
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasAdminAuthority Current user has Administrator Privileges
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getHasAdminAuthority() {
        return this.HasAdminAuthority;
    }

    /**
     * Set Current user has Administrator Privileges
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasAdminAuthority Current user has Administrator Privileges
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasAdminAuthority(Boolean HasAdminAuthority) {
        this.HasAdminAuthority = HasAdminAuthority;
    }

    /**
     * Get Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceDisplayName Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceDisplayName() {
        return this.DatasourceDisplayName;
    }

    /**
     * Set Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceDisplayName Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceDisplayName(String DatasourceDisplayName) {
        this.DatasourceDisplayName = DatasourceDisplayName;
    }

    /**
     * Get Database ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Total favorites on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FavoriteCount Total favorites on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFavoriteCount() {
        return this.FavoriteCount;
    }

    /**
     * Set Total favorites on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FavoriteCount Total favorites on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFavoriteCount(Long FavoriteCount) {
        this.FavoriteCount = FavoriteCount;
    }

    /**
     * Get Total likes on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LikeCount Total likes on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLikeCount() {
        return this.LikeCount;
    }

    /**
     * Set Total likes on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LikeCount Total likes on the table under the tenant
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLikeCount(Long LikeCount) {
        this.LikeCount = LikeCount;
    }

    /**
     * Get true for liked/false for not liked status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasLike true for liked/false for not liked status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getHasLike() {
        return this.HasLike;
    }

    /**
     * Set true for liked/false for not liked status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasLike true for liked/false for not liked status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasLike(Boolean HasLike) {
        this.HasLike = HasLike;
    }

    /**
     * Get Asset score of the table
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TablePropertyScore Asset score of the table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TablePropertyScore getTablePropertyScore() {
        return this.TablePropertyScore;
    }

    /**
     * Set Asset score of the table
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TablePropertyScore Asset score of the table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTablePropertyScore(TablePropertyScore TablePropertyScore) {
        this.TablePropertyScore = TablePropertyScore;
    }

    /**
     * Get Heat value of the table
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableHeat Heat value of the table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TableHeat getTableHeat() {
        return this.TableHeat;
    }

    /**
     * Set Heat value of the table
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableHeat Heat value of the table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableHeat(TableHeat TableHeat) {
        this.TableHeat = TableHeat;
    }

    /**
     * Get Data source ownerProjectId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerProjectId Data source ownerProjectId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set Data source ownerProjectId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerProjectId Data source ownerProjectId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerId Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerId() {
        return this.TableOwnerId;
    }

    /**
     * Set Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerId Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerId(String TableOwnerId) {
        this.TableOwnerId = TableOwnerId;
    }

    /**
     * Get System Source -CLUSTER, DB - Self Definition Source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataSourceCategory System Source -CLUSTER, DB - Self Definition Source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDataSourceCategory() {
        return this.DataSourceCategory;
    }

    /**
     * Set System Source -CLUSTER, DB - Self Definition Source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataSourceCategory System Source -CLUSTER, DB - Self Definition Source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataSourceCategory(String DataSourceCategory) {
        this.DataSourceCategory = DataSourceCategory;
    }

    /**
     * Get Table Field Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Columns Table Field Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SearchColumnDocVO [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Table Field Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Columns Table Field Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumns(SearchColumnDocVO [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Table Collection Type
TABLE, VIEW, MANAGED_TABLE (Hive managed table), EXTERNAL_TABLE (Hive external table), VIRTUAL_VIEW (virtual view), MATERIALIZED_VIEW (materialized view), LATERAL_VIEW, INDEX_TABLE (index table), END_SELECT (query structure), INSTANCE (intermediate temporary table type (data lineage)), CDW (CDW table type)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetaCrawlType Table Collection Type
TABLE, VIEW, MANAGED_TABLE (Hive managed table), EXTERNAL_TABLE (Hive external table), VIRTUAL_VIEW (virtual view), MATERIALIZED_VIEW (materialized view), LATERAL_VIEW, INDEX_TABLE (index table), END_SELECT (query structure), INSTANCE (intermediate temporary table type (data lineage)), CDW (CDW table type)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetaCrawlType() {
        return this.MetaCrawlType;
    }

    /**
     * Set Table Collection Type
TABLE, VIEW, MANAGED_TABLE (Hive managed table), EXTERNAL_TABLE (Hive external table), VIRTUAL_VIEW (virtual view), MATERIALIZED_VIEW (materialized view), LATERAL_VIEW, INDEX_TABLE (index table), END_SELECT (query structure), INSTANCE (intermediate temporary table type (data lineage)), CDW (CDW table type)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetaCrawlType Table Collection Type
TABLE, VIEW, MANAGED_TABLE (Hive managed table), EXTERNAL_TABLE (Hive external table), VIRTUAL_VIEW (virtual view), MATERIALIZED_VIEW (materialized view), LATERAL_VIEW, INDEX_TABLE (index table), END_SELECT (query structure), INSTANCE (intermediate temporary table type (data lineage)), CDW (CDW table type)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetaCrawlType(String MetaCrawlType) {
        this.MetaCrawlType = MetaCrawlType;
    }

    /**
     * Get Is View
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsView Is View
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsView() {
        return this.IsView;
    }

    /**
     * Set Is View
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsView Is View
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsView(Boolean IsView) {
        this.IsView = IsView;
    }

    /**
     * Get Storage locationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Location Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Location Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Determine if it is a partitioned table 1 Yes 0 No
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsPartitionTable Determine if it is a partitioned table 1 Yes 0 No
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIsPartitionTable() {
        return this.IsPartitionTable;
    }

    /**
     * Set Determine if it is a partitioned table 1 Yes 0 No
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsPartitionTable Determine if it is a partitioned table 1 Yes 0 No
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsPartitionTable(Long IsPartitionTable) {
        this.IsPartitionTable = IsPartitionTable;
    }

    /**
     * Get Partition Field Key
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionColumns Partition Field Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getPartitionColumns() {
        return this.PartitionColumns;
    }

    /**
     * Set Partition Field Key
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionColumns Partition Field Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionColumns(String [] PartitionColumns) {
        this.PartitionColumns = PartitionColumns;
    }

    /**
     * Get Lifecycle - Partition Retention Days [Valid when Partition Retention Policy is applied]
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionExpireDays Lifecycle - Partition Retention Days [Valid when Partition Retention Policy is applied]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPartitionExpireDays() {
        return this.PartitionExpireDays;
    }

    /**
     * Set Lifecycle - Partition Retention Days [Valid when Partition Retention Policy is applied]
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionExpireDays Lifecycle - Partition Retention Days [Valid when Partition Retention Policy is applied]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionExpireDays(Long PartitionExpireDays) {
        this.PartitionExpireDays = PartitionExpireDays;
    }

    /**
     * Get Table Ancillary Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableProperties Table Ancillary Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TableMetaProperty [] getTableProperties() {
        return this.TableProperties;
    }

    /**
     * Set Table Ancillary Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableProperties Table Ancillary Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableProperties(TableMetaProperty [] TableProperties) {
        this.TableProperties = TableProperties;
    }

    public TableMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableMeta(TableMeta source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TablePath != null) {
            this.TablePath = new String(source.TablePath);
        }
        if (source.TableNameCn != null) {
            this.TableNameCn = new String(source.TableNameCn);
        }
        if (source.MetastoreId != null) {
            this.MetastoreId = new Long(source.MetastoreId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ColumnSeparator != null) {
            this.ColumnSeparator = new String(source.ColumnSeparator);
        }
        if (source.StorageFormat != null) {
            this.StorageFormat = new String(source.StorageFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DdlModifyTime != null) {
            this.DdlModifyTime = new String(source.DdlModifyTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.BizCatalogIds != null) {
            this.BizCatalogIds = new String[source.BizCatalogIds.length];
            for (int i = 0; i < source.BizCatalogIds.length; i++) {
                this.BizCatalogIds[i] = new String(source.BizCatalogIds[i]);
            }
        }
        if (source.BizCatalogNames != null) {
            this.BizCatalogNames = new String[source.BizCatalogNames.length];
            for (int i = 0; i < source.BizCatalogNames.length; i++) {
                this.BizCatalogNames[i] = new String(source.BizCatalogNames[i]);
            }
        }
        if (source.HasFavorite != null) {
            this.HasFavorite = new Boolean(source.HasFavorite);
        }
        if (source.LifeCycleTime != null) {
            this.LifeCycleTime = new Long(source.LifeCycleTime);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TechnologyType != null) {
            this.TechnologyType = new String(source.TechnologyType);
        }
        if (source.TableNameEn != null) {
            this.TableNameEn = new String(source.TableNameEn);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Partitions != null) {
            this.Partitions = new String(source.Partitions);
        }
        if (source.ReplicationFactor != null) {
            this.ReplicationFactor = new String(source.ReplicationFactor);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.DataModifyTime != null) {
            this.DataModifyTime = new String(source.DataModifyTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.HasAdminAuthority != null) {
            this.HasAdminAuthority = new Boolean(source.HasAdminAuthority);
        }
        if (source.DatasourceDisplayName != null) {
            this.DatasourceDisplayName = new String(source.DatasourceDisplayName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.FavoriteCount != null) {
            this.FavoriteCount = new Long(source.FavoriteCount);
        }
        if (source.LikeCount != null) {
            this.LikeCount = new Long(source.LikeCount);
        }
        if (source.HasLike != null) {
            this.HasLike = new Boolean(source.HasLike);
        }
        if (source.TablePropertyScore != null) {
            this.TablePropertyScore = new TablePropertyScore(source.TablePropertyScore);
        }
        if (source.TableHeat != null) {
            this.TableHeat = new TableHeat(source.TableHeat);
        }
        if (source.OwnerProjectId != null) {
            this.OwnerProjectId = new String(source.OwnerProjectId);
        }
        if (source.TableOwnerId != null) {
            this.TableOwnerId = new String(source.TableOwnerId);
        }
        if (source.DataSourceCategory != null) {
            this.DataSourceCategory = new String(source.DataSourceCategory);
        }
        if (source.Columns != null) {
            this.Columns = new SearchColumnDocVO[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new SearchColumnDocVO(source.Columns[i]);
            }
        }
        if (source.MetaCrawlType != null) {
            this.MetaCrawlType = new String(source.MetaCrawlType);
        }
        if (source.IsView != null) {
            this.IsView = new Boolean(source.IsView);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.IsPartitionTable != null) {
            this.IsPartitionTable = new Long(source.IsPartitionTable);
        }
        if (source.PartitionColumns != null) {
            this.PartitionColumns = new String[source.PartitionColumns.length];
            for (int i = 0; i < source.PartitionColumns.length; i++) {
                this.PartitionColumns[i] = new String(source.PartitionColumns[i]);
            }
        }
        if (source.PartitionExpireDays != null) {
            this.PartitionExpireDays = new Long(source.PartitionExpireDays);
        }
        if (source.TableProperties != null) {
            this.TableProperties = new TableMetaProperty[source.TableProperties.length];
            for (int i = 0; i < source.TableProperties.length; i++) {
                this.TableProperties[i] = new TableMetaProperty(source.TableProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TablePath", this.TablePath);
        this.setParamSimple(map, prefix + "TableNameCn", this.TableNameCn);
        this.setParamSimple(map, prefix + "MetastoreId", this.MetastoreId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ColumnSeparator", this.ColumnSeparator);
        this.setParamSimple(map, prefix + "StorageFormat", this.StorageFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DdlModifyTime", this.DdlModifyTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamArraySimple(map, prefix + "BizCatalogIds.", this.BizCatalogIds);
        this.setParamArraySimple(map, prefix + "BizCatalogNames.", this.BizCatalogNames);
        this.setParamSimple(map, prefix + "HasFavorite", this.HasFavorite);
        this.setParamSimple(map, prefix + "LifeCycleTime", this.LifeCycleTime);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TechnologyType", this.TechnologyType);
        this.setParamSimple(map, prefix + "TableNameEn", this.TableNameEn);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ReplicationFactor", this.ReplicationFactor);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "DataModifyTime", this.DataModifyTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "HasAdminAuthority", this.HasAdminAuthority);
        this.setParamSimple(map, prefix + "DatasourceDisplayName", this.DatasourceDisplayName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "FavoriteCount", this.FavoriteCount);
        this.setParamSimple(map, prefix + "LikeCount", this.LikeCount);
        this.setParamSimple(map, prefix + "HasLike", this.HasLike);
        this.setParamObj(map, prefix + "TablePropertyScore.", this.TablePropertyScore);
        this.setParamObj(map, prefix + "TableHeat.", this.TableHeat);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "TableOwnerId", this.TableOwnerId);
        this.setParamSimple(map, prefix + "DataSourceCategory", this.DataSourceCategory);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "MetaCrawlType", this.MetaCrawlType);
        this.setParamSimple(map, prefix + "IsView", this.IsView);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "IsPartitionTable", this.IsPartitionTable);
        this.setParamArraySimple(map, prefix + "PartitionColumns.", this.PartitionColumns);
        this.setParamSimple(map, prefix + "PartitionExpireDays", this.PartitionExpireDays);
        this.setParamArrayObj(map, prefix + "TableProperties.", this.TableProperties);

    }
}

