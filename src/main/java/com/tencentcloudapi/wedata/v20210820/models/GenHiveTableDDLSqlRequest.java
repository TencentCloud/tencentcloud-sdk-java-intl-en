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

public class GenHiveTableDDLSqlRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Target Database
    */
    @SerializedName("SinkDatabase")
    @Expose
    private String SinkDatabase;

    /**
    * Node ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Metadata Type (MYSQL,ORACLE)
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Source Library Name
    */
    @SerializedName("SourceDatabase")
    @Expose
    private String SourceDatabase;

    /**
    * Source Table Name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Target Table Metadata Type (HIVE,GBASE)
    */
    @SerializedName("SinkType")
    @Expose
    private String SinkType;

    /**
    * Source Schema Name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Field Information of Upstream Node
    */
    @SerializedName("SourceFieldInfoList")
    @Expose
    private SourceFieldInfo [] SourceFieldInfoList;

    /**
    * Partition Field
    */
    @SerializedName("Partitions")
    @Expose
    private Partition [] Partitions;

    /**
    * Table Creation Attributes
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * Table Creation Mode,0: Wizard Mode,1: ddl
    */
    @SerializedName("TableMode")
    @Expose
    private Long TableMode;

    /**
    * DLC Table Version, v1/v2
    */
    @SerializedName("TableVersion")
    @Expose
    private String TableVersion;

    /**
    * Whether to Upsert Writes
    */
    @SerializedName("UpsertFlag")
    @Expose
    private Boolean UpsertFlag;

    /**
    * Table Description Information
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * Threshold for Increased Number of Files, Exceeding Value Will Trigger Small File Merge
    */
    @SerializedName("AddDataFiles")
    @Expose
    private Long AddDataFiles;

    /**
    * Threshold for Increased Number of Equality Deletes, Exceeding Value Will Trigger Small File Merge
    */
    @SerializedName("AddEqualityDeletes")
    @Expose
    private Long AddEqualityDeletes;

    /**
    * Threshold for Increased Number of Position Deletes, Exceeding Value Will Trigger Small File Merge
    */
    @SerializedName("AddPositionDeletes")
    @Expose
    private Long AddPositionDeletes;

    /**
    * Threshold for Increased Number of Delete Files
    */
    @SerializedName("AddDeleteFiles")
    @Expose
    private Long AddDeleteFiles;

    /**
    * Downstream Node Data Source ID
    */
    @SerializedName("TargetDatasourceId")
    @Expose
    private String TargetDatasourceId;

    /**
    * DLC Upsert Primary Key
    */
    @SerializedName("UpsertKeys")
    @Expose
    private String [] UpsertKeys;

    /**
    * DLC Table Governance Information
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * Target Schema Name
    */
    @SerializedName("SinkSchemaName")
    @Expose
    private String SinkSchemaName;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Target Database 
     * @return SinkDatabase Target Database
     */
    public String getSinkDatabase() {
        return this.SinkDatabase;
    }

    /**
     * Set Target Database
     * @param SinkDatabase Target Database
     */
    public void setSinkDatabase(String SinkDatabase) {
        this.SinkDatabase = SinkDatabase;
    }

    /**
     * Get Node ID 
     * @return Id Node ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Node ID
     * @param Id Node ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Metadata Type (MYSQL,ORACLE) 
     * @return MsType Metadata Type (MYSQL,ORACLE)
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set Metadata Type (MYSQL,ORACLE)
     * @param MsType Metadata Type (MYSQL,ORACLE)
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Source Library Name 
     * @return SourceDatabase Source Library Name
     */
    public String getSourceDatabase() {
        return this.SourceDatabase;
    }

    /**
     * Set Source Library Name
     * @param SourceDatabase Source Library Name
     */
    public void setSourceDatabase(String SourceDatabase) {
        this.SourceDatabase = SourceDatabase;
    }

    /**
     * Get Source Table Name 
     * @return TableName Source Table Name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Source Table Name
     * @param TableName Source Table Name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Target Table Metadata Type (HIVE,GBASE) 
     * @return SinkType Target Table Metadata Type (HIVE,GBASE)
     */
    public String getSinkType() {
        return this.SinkType;
    }

    /**
     * Set Target Table Metadata Type (HIVE,GBASE)
     * @param SinkType Target Table Metadata Type (HIVE,GBASE)
     */
    public void setSinkType(String SinkType) {
        this.SinkType = SinkType;
    }

    /**
     * Get Source Schema Name 
     * @return SchemaName Source Schema Name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Source Schema Name
     * @param SchemaName Source Schema Name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Field Information of Upstream Node 
     * @return SourceFieldInfoList Field Information of Upstream Node
     */
    public SourceFieldInfo [] getSourceFieldInfoList() {
        return this.SourceFieldInfoList;
    }

    /**
     * Set Field Information of Upstream Node
     * @param SourceFieldInfoList Field Information of Upstream Node
     */
    public void setSourceFieldInfoList(SourceFieldInfo [] SourceFieldInfoList) {
        this.SourceFieldInfoList = SourceFieldInfoList;
    }

    /**
     * Get Partition Field 
     * @return Partitions Partition Field
     */
    public Partition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition Field
     * @param Partitions Partition Field
     */
    public void setPartitions(Partition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Table Creation Attributes 
     * @return Properties Table Creation Attributes
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Table Creation Attributes
     * @param Properties Table Creation Attributes
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Table Creation Mode,0: Wizard Mode,1: ddl 
     * @return TableMode Table Creation Mode,0: Wizard Mode,1: ddl
     */
    public Long getTableMode() {
        return this.TableMode;
    }

    /**
     * Set Table Creation Mode,0: Wizard Mode,1: ddl
     * @param TableMode Table Creation Mode,0: Wizard Mode,1: ddl
     */
    public void setTableMode(Long TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get DLC Table Version, v1/v2 
     * @return TableVersion DLC Table Version, v1/v2
     */
    public String getTableVersion() {
        return this.TableVersion;
    }

    /**
     * Set DLC Table Version, v1/v2
     * @param TableVersion DLC Table Version, v1/v2
     */
    public void setTableVersion(String TableVersion) {
        this.TableVersion = TableVersion;
    }

    /**
     * Get Whether to Upsert Writes 
     * @return UpsertFlag Whether to Upsert Writes
     */
    public Boolean getUpsertFlag() {
        return this.UpsertFlag;
    }

    /**
     * Set Whether to Upsert Writes
     * @param UpsertFlag Whether to Upsert Writes
     */
    public void setUpsertFlag(Boolean UpsertFlag) {
        this.UpsertFlag = UpsertFlag;
    }

    /**
     * Get Table Description Information 
     * @return TableComment Table Description Information
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set Table Description Information
     * @param TableComment Table Description Information
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get Threshold for Increased Number of Files, Exceeding Value Will Trigger Small File Merge 
     * @return AddDataFiles Threshold for Increased Number of Files, Exceeding Value Will Trigger Small File Merge
     */
    public Long getAddDataFiles() {
        return this.AddDataFiles;
    }

    /**
     * Set Threshold for Increased Number of Files, Exceeding Value Will Trigger Small File Merge
     * @param AddDataFiles Threshold for Increased Number of Files, Exceeding Value Will Trigger Small File Merge
     */
    public void setAddDataFiles(Long AddDataFiles) {
        this.AddDataFiles = AddDataFiles;
    }

    /**
     * Get Threshold for Increased Number of Equality Deletes, Exceeding Value Will Trigger Small File Merge 
     * @return AddEqualityDeletes Threshold for Increased Number of Equality Deletes, Exceeding Value Will Trigger Small File Merge
     */
    public Long getAddEqualityDeletes() {
        return this.AddEqualityDeletes;
    }

    /**
     * Set Threshold for Increased Number of Equality Deletes, Exceeding Value Will Trigger Small File Merge
     * @param AddEqualityDeletes Threshold for Increased Number of Equality Deletes, Exceeding Value Will Trigger Small File Merge
     */
    public void setAddEqualityDeletes(Long AddEqualityDeletes) {
        this.AddEqualityDeletes = AddEqualityDeletes;
    }

    /**
     * Get Threshold for Increased Number of Position Deletes, Exceeding Value Will Trigger Small File Merge 
     * @return AddPositionDeletes Threshold for Increased Number of Position Deletes, Exceeding Value Will Trigger Small File Merge
     */
    public Long getAddPositionDeletes() {
        return this.AddPositionDeletes;
    }

    /**
     * Set Threshold for Increased Number of Position Deletes, Exceeding Value Will Trigger Small File Merge
     * @param AddPositionDeletes Threshold for Increased Number of Position Deletes, Exceeding Value Will Trigger Small File Merge
     */
    public void setAddPositionDeletes(Long AddPositionDeletes) {
        this.AddPositionDeletes = AddPositionDeletes;
    }

    /**
     * Get Threshold for Increased Number of Delete Files 
     * @return AddDeleteFiles Threshold for Increased Number of Delete Files
     */
    public Long getAddDeleteFiles() {
        return this.AddDeleteFiles;
    }

    /**
     * Set Threshold for Increased Number of Delete Files
     * @param AddDeleteFiles Threshold for Increased Number of Delete Files
     */
    public void setAddDeleteFiles(Long AddDeleteFiles) {
        this.AddDeleteFiles = AddDeleteFiles;
    }

    /**
     * Get Downstream Node Data Source ID 
     * @return TargetDatasourceId Downstream Node Data Source ID
     */
    public String getTargetDatasourceId() {
        return this.TargetDatasourceId;
    }

    /**
     * Set Downstream Node Data Source ID
     * @param TargetDatasourceId Downstream Node Data Source ID
     */
    public void setTargetDatasourceId(String TargetDatasourceId) {
        this.TargetDatasourceId = TargetDatasourceId;
    }

    /**
     * Get DLC Upsert Primary Key 
     * @return UpsertKeys DLC Upsert Primary Key
     */
    public String [] getUpsertKeys() {
        return this.UpsertKeys;
    }

    /**
     * Set DLC Upsert Primary Key
     * @param UpsertKeys DLC Upsert Primary Key
     */
    public void setUpsertKeys(String [] UpsertKeys) {
        this.UpsertKeys = UpsertKeys;
    }

    /**
     * Get DLC Table Governance Information 
     * @return TableBaseInfo DLC Table Governance Information
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set DLC Table Governance Information
     * @param TableBaseInfo DLC Table Governance Information
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get Target Schema Name 
     * @return SinkSchemaName Target Schema Name
     */
    public String getSinkSchemaName() {
        return this.SinkSchemaName;
    }

    /**
     * Set Target Schema Name
     * @param SinkSchemaName Target Schema Name
     */
    public void setSinkSchemaName(String SinkSchemaName) {
        this.SinkSchemaName = SinkSchemaName;
    }

    public GenHiveTableDDLSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenHiveTableDDLSqlRequest(GenHiveTableDDLSqlRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SinkDatabase != null) {
            this.SinkDatabase = new String(source.SinkDatabase);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.SourceDatabase != null) {
            this.SourceDatabase = new String(source.SourceDatabase);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SinkType != null) {
            this.SinkType = new String(source.SinkType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.SourceFieldInfoList != null) {
            this.SourceFieldInfoList = new SourceFieldInfo[source.SourceFieldInfoList.length];
            for (int i = 0; i < source.SourceFieldInfoList.length; i++) {
                this.SourceFieldInfoList[i] = new SourceFieldInfo(source.SourceFieldInfoList[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new Partition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partition(source.Partitions[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.TableMode != null) {
            this.TableMode = new Long(source.TableMode);
        }
        if (source.TableVersion != null) {
            this.TableVersion = new String(source.TableVersion);
        }
        if (source.UpsertFlag != null) {
            this.UpsertFlag = new Boolean(source.UpsertFlag);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.AddDataFiles != null) {
            this.AddDataFiles = new Long(source.AddDataFiles);
        }
        if (source.AddEqualityDeletes != null) {
            this.AddEqualityDeletes = new Long(source.AddEqualityDeletes);
        }
        if (source.AddPositionDeletes != null) {
            this.AddPositionDeletes = new Long(source.AddPositionDeletes);
        }
        if (source.AddDeleteFiles != null) {
            this.AddDeleteFiles = new Long(source.AddDeleteFiles);
        }
        if (source.TargetDatasourceId != null) {
            this.TargetDatasourceId = new String(source.TargetDatasourceId);
        }
        if (source.UpsertKeys != null) {
            this.UpsertKeys = new String[source.UpsertKeys.length];
            for (int i = 0; i < source.UpsertKeys.length; i++) {
                this.UpsertKeys[i] = new String(source.UpsertKeys[i]);
            }
        }
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.SinkSchemaName != null) {
            this.SinkSchemaName = new String(source.SinkSchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SinkDatabase", this.SinkDatabase);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "SourceDatabase", this.SourceDatabase);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SinkType", this.SinkType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamArrayObj(map, prefix + "SourceFieldInfoList.", this.SourceFieldInfoList);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamSimple(map, prefix + "TableVersion", this.TableVersion);
        this.setParamSimple(map, prefix + "UpsertFlag", this.UpsertFlag);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "AddDataFiles", this.AddDataFiles);
        this.setParamSimple(map, prefix + "AddEqualityDeletes", this.AddEqualityDeletes);
        this.setParamSimple(map, prefix + "AddPositionDeletes", this.AddPositionDeletes);
        this.setParamSimple(map, prefix + "AddDeleteFiles", this.AddDeleteFiles);
        this.setParamSimple(map, prefix + "TargetDatasourceId", this.TargetDatasourceId);
        this.setParamArraySimple(map, prefix + "UpsertKeys.", this.UpsertKeys);
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamSimple(map, prefix + "SinkSchemaName", this.SinkSchemaName);

    }
}

