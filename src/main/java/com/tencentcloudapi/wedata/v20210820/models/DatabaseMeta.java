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

public class DatabaseMeta extends AbstractModel {

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Technology Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Project English Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Data Source Category: Binding Engine, Binding Database, Available Values: DB, ENGINE
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Data Source Engine Region
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Database Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Project Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * Person in Charge Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Data Source Type: hive/mysql/hbase, etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Storage Size in bytes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Formatted Storage Size, with unit, e.g., 12B
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Technology Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreType Technology Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set Technology Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreType Technology Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
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
     * Get Data Source IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Project English Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project English Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Data Source Category: Binding Engine, Binding Database, Available Values: DB, ENGINE
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Category Data Source Category: Binding Engine, Binding Database, Available Values: DB, ENGINE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Data Source Category: Binding Engine, Binding Database, Available Values: DB, ENGINE
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Category Data Source Category: Binding Engine, Binding Database, Available Values: DB, ENGINE
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Data source description informationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Data Source Engine Region
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Data Source Engine Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Data Source Engine Region
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Data Source Engine Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Database Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Project Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectDisplayName Project Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set Project Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectDisplayName Project Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get Person in Charge Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerAccountName Person in Charge Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set Person in Charge Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerAccountName Person in Charge Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DisplayName Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DisplayName Data Source Display Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
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
     * Get Data Source Type: hive/mysql/hbase, etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Catalog Data Source Type: hive/mysql/hbase, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Data Source Type: hive/mysql/hbase, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Catalog Data Source Type: hive/mysql/hbase, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Storage Size in bytes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageSize Storage Size in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage Size in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageSize Storage Size in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Formatted Storage Size, with unit, e.g., 12B
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageSizeWithUnit Formatted Storage Size, with unit, e.g., 12B
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set Formatted Storage Size, with unit, e.g., 12B
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageSizeWithUnit Formatted Storage Size, with unit, e.g., 12B
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
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

    public DatabaseMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseMeta(DatabaseMeta source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

