/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class TableBasicInfo extends AbstractModel {

    /**
    * Global Unique ID of the Table
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Engine/Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Table Types, such as View, External Table, etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project Name in English
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project English and Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerId")
    @Expose
    private String TableOwnerId;

    /**
    * Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * Storage locationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageLocation")
    @Expose
    private Long StorageLocation;

    /**
    * Table Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is a partitioned table, 0-Full Table 1-Partition Table
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsPartitionTable")
    @Expose
    private Long IsPartitionTable;

    /**
    * Partition field list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionColumns")
    @Expose
    private String [] PartitionColumns;

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
    * Storage Volume, Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * Cumulative storage [MB]
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalSizeMb")
    @Expose
    private Long TotalSizeMb;

    /**
    * Replica quantityNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReplicaCount")
    @Expose
    private Long ReplicaCount;

    /**
    * Number of Files
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileCount")
    @Expose
    private Long FileCount;

    /**
    * Total Partitions (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Number of partition fields (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionFieldCount")
    @Expose
    private Long PartitionFieldCount;

    /**
    * Lifecycle - Partition Retention Days [Effective during Partition Retention Policy]
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PartitionExpireDays")
    @Expose
    private Long PartitionExpireDays;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Storage locationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

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
     * Get Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source Global Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get Engine/Storage Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EngineType Engine/Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine/Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EngineType Engine/Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Table Types, such as View, External Table, etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableType Table Types, such as View, External Table, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table Types, such as View, External Table, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableType Table Types, such as View, External Table, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
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
     * Get Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerId Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerId() {
        return this.TableOwnerId;
    }

    /**
     * Set Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerId Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerId(String TableOwnerId) {
        this.TableOwnerId = TableOwnerId;
    }

    /**
     * Get Person in Charge
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerName Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerName Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get Storage locationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageLocation Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStorageLocation() {
        return this.StorageLocation;
    }

    /**
     * Set Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     * @param StorageLocation Storage locationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageLocation(Long StorageLocation) {
        this.StorageLocation = StorageLocation;
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
     * Get Whether it is a partitioned table, 0-Full Table 1-Partition Table
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsPartitionTable Whether it is a partitioned table, 0-Full Table 1-Partition Table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIsPartitionTable() {
        return this.IsPartitionTable;
    }

    /**
     * Set Whether it is a partitioned table, 0-Full Table 1-Partition Table
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsPartitionTable Whether it is a partitioned table, 0-Full Table 1-Partition Table
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsPartitionTable(Long IsPartitionTable) {
        this.IsPartitionTable = IsPartitionTable;
    }

    /**
     * Get Partition field list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionColumns Partition field list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getPartitionColumns() {
        return this.PartitionColumns;
    }

    /**
     * Set Partition field list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionColumns Partition field list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionColumns(String [] PartitionColumns) {
        this.PartitionColumns = PartitionColumns;
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
     * Get Storage Volume, Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageSizeWithUnit Storage Volume, Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set Storage Volume, Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageSizeWithUnit Storage Volume, Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get Cumulative storage [MB]
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalSizeMb Cumulative storage [MB]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalSizeMb() {
        return this.TotalSizeMb;
    }

    /**
     * Set Cumulative storage [MB]
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalSizeMb Cumulative storage [MB]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalSizeMb(Long TotalSizeMb) {
        this.TotalSizeMb = TotalSizeMb;
    }

    /**
     * Get Replica quantityNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ReplicaCount Replica quantityNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getReplicaCount() {
        return this.ReplicaCount;
    }

    /**
     * Set Replica quantityNote: This field may return null, indicating that no valid value can be obtained.
     * @param ReplicaCount Replica quantityNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReplicaCount(Long ReplicaCount) {
        this.ReplicaCount = ReplicaCount;
    }

    /**
     * Get Number of Files
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileCount Number of Files
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFileCount() {
        return this.FileCount;
    }

    /**
     * Set Number of Files
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileCount Number of Files
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileCount(Long FileCount) {
        this.FileCount = FileCount;
    }

    /**
     * Get Total Partitions (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionCount Total Partitions (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Total Partitions (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionCount Total Partitions (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Number of partition fields (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionFieldCount Number of partition fields (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPartitionFieldCount() {
        return this.PartitionFieldCount;
    }

    /**
     * Set Number of partition fields (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionFieldCount Number of partition fields (including hive, iceberg)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionFieldCount(Long PartitionFieldCount) {
        this.PartitionFieldCount = PartitionFieldCount;
    }

    /**
     * Get Lifecycle - Partition Retention Days [Effective during Partition Retention Policy]
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PartitionExpireDays Lifecycle - Partition Retention Days [Effective during Partition Retention Policy]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPartitionExpireDays() {
        return this.PartitionExpireDays;
    }

    /**
     * Set Lifecycle - Partition Retention Days [Effective during Partition Retention Policy]
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PartitionExpireDays Lifecycle - Partition Retention Days [Effective during Partition Retention Policy]
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPartitionExpireDays(Long PartitionExpireDays) {
        this.PartitionExpireDays = PartitionExpireDays;
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
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public TableBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableBasicInfo(TableBasicInfo source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.TableOwnerId != null) {
            this.TableOwnerId = new String(source.TableOwnerId);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.StorageLocation != null) {
            this.StorageLocation = new Long(source.StorageLocation);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.StorageFormat != null) {
            this.StorageFormat = new String(source.StorageFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.TotalSizeMb != null) {
            this.TotalSizeMb = new Long(source.TotalSizeMb);
        }
        if (source.ReplicaCount != null) {
            this.ReplicaCount = new Long(source.ReplicaCount);
        }
        if (source.FileCount != null) {
            this.FileCount = new Long(source.FileCount);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.PartitionFieldCount != null) {
            this.PartitionFieldCount = new Long(source.PartitionFieldCount);
        }
        if (source.PartitionExpireDays != null) {
            this.PartitionExpireDays = new Long(source.PartitionExpireDays);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "TableOwnerId", this.TableOwnerId);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "StorageLocation", this.StorageLocation);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsPartitionTable", this.IsPartitionTable);
        this.setParamArraySimple(map, prefix + "PartitionColumns.", this.PartitionColumns);
        this.setParamSimple(map, prefix + "StorageFormat", this.StorageFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "TotalSizeMb", this.TotalSizeMb);
        this.setParamSimple(map, prefix + "ReplicaCount", this.ReplicaCount);
        this.setParamSimple(map, prefix + "FileCount", this.FileCount);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "PartitionFieldCount", this.PartitionFieldCount);
        this.setParamSimple(map, prefix + "PartitionExpireDays", this.PartitionExpireDays);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

