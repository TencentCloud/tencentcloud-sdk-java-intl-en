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

public class DatabaseInfo extends AbstractModel {

    /**
    * Database GUID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * Database name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Database catalog.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Repository description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Database location.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Database storage size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

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
     * Get Database GUID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Guid Database GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set Database GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Guid Database GUID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get Database name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Database catalog.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CatalogName Database catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Database catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CatalogName Database catalog.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Repository description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Repository description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Repository description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Repository description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Database location.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Database location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Database location.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Database location.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Database storage size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageSize Database storage size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Database storage size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageSize Database storage size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
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

    public DatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseInfo(DatabaseInfo source) {
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
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
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

