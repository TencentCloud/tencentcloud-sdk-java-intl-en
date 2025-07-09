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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DLCTable extends AbstractModel {

    /**
    * Basic information of the data table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * Data table column information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private TColumn [] Columns;

    /**
    * Data table partition information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private TPartition [] Partitions;

    /**
    * Data storage path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Data table attribute information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * Data table update information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Database creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Data format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputFormat")
    @Expose
    private String InputFormat;

    /**
    * Data storage size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Number of rows in the data table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Materialized view name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MapMaterializedViewName")
    @Expose
    private String MapMaterializedViewName;

    /**
    * Visit hot spots
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeatValue")
    @Expose
    private Long HeatValue;

    /**
    * External table configuration information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalDataConfiguration")
    @Expose
    private ExternalDataConfiguration ExternalDataConfiguration;

    /**
     * Get Basic information of the data table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableBaseInfo Basic information of the data table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set Basic information of the data table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableBaseInfo Basic information of the data table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get Data table column information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Columns Data table column information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Data table column information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Columns Data table column information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumns(TColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Data table partition information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Data table partition information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Data table partition information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions Data table partition information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(TPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Data storage path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Data storage path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Data storage path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Data storage path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Data table attribute information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Properties Data table attribute information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Data table attribute information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Properties Data table attribute information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Data table update information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Data table update information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Data table update information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Data table update information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Database creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Database creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Database creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Database creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Data format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputFormat Data format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInputFormat() {
        return this.InputFormat;
    }

    /**
     * Set Data format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputFormat Data format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputFormat(String InputFormat) {
        this.InputFormat = InputFormat;
    }

    /**
     * Get Data storage size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageSize Data storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Data storage size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageSize Data storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Number of rows in the data table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordCount Number of rows in the data table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of rows in the data table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordCount Number of rows in the data table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Materialized view name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MapMaterializedViewName Materialized view name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMapMaterializedViewName() {
        return this.MapMaterializedViewName;
    }

    /**
     * Set Materialized view name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MapMaterializedViewName Materialized view name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMapMaterializedViewName(String MapMaterializedViewName) {
        this.MapMaterializedViewName = MapMaterializedViewName;
    }

    /**
     * Get Visit hot spots
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HeatValue Visit hot spots
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeatValue() {
        return this.HeatValue;
    }

    /**
     * Set Visit hot spots
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HeatValue Visit hot spots
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeatValue(Long HeatValue) {
        this.HeatValue = HeatValue;
    }

    /**
     * Get External table configuration information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExternalDataConfiguration External table configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExternalDataConfiguration getExternalDataConfiguration() {
        return this.ExternalDataConfiguration;
    }

    /**
     * Set External table configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExternalDataConfiguration External table configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExternalDataConfiguration(ExternalDataConfiguration ExternalDataConfiguration) {
        this.ExternalDataConfiguration = ExternalDataConfiguration;
    }

    public DLCTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DLCTable(DLCTable source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.Columns != null) {
            this.Columns = new TColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new TColumn(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new TPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new TPartition(source.Partitions[i]);
            }
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InputFormat != null) {
            this.InputFormat = new String(source.InputFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.MapMaterializedViewName != null) {
            this.MapMaterializedViewName = new String(source.MapMaterializedViewName);
        }
        if (source.HeatValue != null) {
            this.HeatValue = new Long(source.HeatValue);
        }
        if (source.ExternalDataConfiguration != null) {
            this.ExternalDataConfiguration = new ExternalDataConfiguration(source.ExternalDataConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InputFormat", this.InputFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "MapMaterializedViewName", this.MapMaterializedViewName);
        this.setParamSimple(map, prefix + "HeatValue", this.HeatValue);
        this.setParamObj(map, prefix + "ExternalDataConfiguration.", this.ExternalDataConfiguration);

    }
}

