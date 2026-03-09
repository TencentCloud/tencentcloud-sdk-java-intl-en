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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfo extends AbstractModel {

    /**
    * Data table GUID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * Data table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Table description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Database name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Table type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Technical metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TechnicalMetadata")
    @Expose
    private TechnicalMetadata TechnicalMetadata;

    /**
    * Business metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessMetadata")
    @Expose
    private BusinessMetadata BusinessMetadata;

    /**
    * Data catalog.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Data source type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get Data table GUID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Guid Data table GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set Data table GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Guid Data table GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get Data table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Data table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Data table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Table description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Table description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Table description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Table description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Database name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Schema name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchemaName Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchemaName Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Table type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableType Table type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableType Table type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Technical metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TechnicalMetadata Technical metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TechnicalMetadata getTechnicalMetadata() {
        return this.TechnicalMetadata;
    }

    /**
     * Set Technical metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TechnicalMetadata Technical metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTechnicalMetadata(TechnicalMetadata TechnicalMetadata) {
        this.TechnicalMetadata = TechnicalMetadata;
    }

    /**
     * Get Business metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessMetadata Business metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BusinessMetadata getBusinessMetadata() {
        return this.BusinessMetadata;
    }

    /**
     * Set Business metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessMetadata Business metadata of the table.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessMetadata(BusinessMetadata BusinessMetadata) {
        this.BusinessMetadata = BusinessMetadata;
    }

    /**
     * Get Data catalog.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CatalogName Data catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Data catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CatalogName Data catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Data source ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceId Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data source type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceType Data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceType Data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TechnicalMetadata != null) {
            this.TechnicalMetadata = new TechnicalMetadata(source.TechnicalMetadata);
        }
        if (source.BusinessMetadata != null) {
            this.BusinessMetadata = new BusinessMetadata(source.BusinessMetadata);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "TechnicalMetadata.", this.TechnicalMetadata);
        this.setParamObj(map, prefix + "BusinessMetadata.", this.BusinessMetadata);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

