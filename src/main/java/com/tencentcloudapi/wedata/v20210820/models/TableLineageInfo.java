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

public class TableLineageInfo extends AbstractModel {

    /**
    * Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * Space ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Table ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table Lineage Parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private LineageParamRecord [] Params;

    /**
    * Parent Node List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChildSet")
    @Expose
    private String ChildSet;

    /**
    * Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtParams")
    @Expose
    private RecordField [] ExtParams;

    /**
    * Lineage ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreTypeName")
    @Expose
    private String MetastoreTypeName;

    /**
    * Table name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Full Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * Number of Downstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * Number of Upstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * Bloodline Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Path from the central node to this node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PrefixPath")
    @Expose
    private String PrefixPath;

    /**
    * Bloodline Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Bloodline Update Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * List of task IDs for modifying bloodline
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * Module/Application Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChannelType")
    @Expose
    private String ChannelType;

    /**
    * Display Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayType")
    @Expose
    private String DisplayType;

    /**
    * Table Types
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Table Types
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * datasourceName
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * DatabaseName
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * DatabaseId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
     * Get Metadata Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreType Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreType Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get Space ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Space ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Space ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Space ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Data source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Table ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table Lineage Parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Params Table Lineage Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public LineageParamRecord [] getParams() {
        return this.Params;
    }

    /**
     * Set Table Lineage Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Params Table Lineage Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(LineageParamRecord [] Params) {
        this.Params = Params;
    }

    /**
     * Get Parent Node List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentSet Parent Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set Parent Node List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentSet Parent Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get Child Node List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChildSet Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChildSet Child Node List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChildSet(String ChildSet) {
        this.ChildSet = ChildSet;
    }

    /**
     * Get Additional parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtParams Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtParams Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtParams(RecordField [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get Lineage ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Lineage ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Lineage ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Lineage ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetastoreTypeName Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMetastoreTypeName() {
        return this.MetastoreTypeName;
    }

    /**
     * Set Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetastoreTypeName Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetastoreTypeName(String MetastoreTypeName) {
        this.MetastoreTypeName = MetastoreTypeName;
    }

    /**
     * Get Table name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Full Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualifiedName Full Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set Full Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualifiedName Full Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get Number of Downstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DownStreamCount Number of Downstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set Number of Downstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DownStreamCount Number of Downstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get Number of Upstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpStreamCount Number of Upstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set Number of Upstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpStreamCount Number of Upstream Nodes in Lineage
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get Bloodline Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Bloodline Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Bloodline Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Bloodline Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Path from the central node to this node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PrefixPath Path from the central node to this node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set Path from the central node to this node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PrefixPath Path from the central node to this node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPrefixPath(String PrefixPath) {
        this.PrefixPath = PrefixPath;
    }

    /**
     * Get Bloodline Creation Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Bloodline Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Bloodline Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Bloodline Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Bloodline Update Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifyTime Bloodline Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Bloodline Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Bloodline Update Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get List of task IDs for modifying bloodline
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tasks List of task IDs for modifying bloodline
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set List of task IDs for modifying bloodline
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tasks List of task IDs for modifying bloodline
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Module/Application Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChannelType Module/Application Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set Module/Application Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChannelType Module/Application Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChannelType(String ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get Display Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DisplayType Display Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set Display Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DisplayType Display Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplayType(String DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get Table Types
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EngineType Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EngineType Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Table Types
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableType Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableType Table Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get datasourceName
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceName datasourceName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set datasourceName
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceName datasourceName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get DatabaseName
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName DatabaseName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set DatabaseName
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName DatabaseName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get DatabaseId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId DatabaseId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set DatabaseId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId DatabaseId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    public TableLineageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableLineageInfo(TableLineageInfo source) {
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Params != null) {
            this.Params = new LineageParamRecord[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new LineageParamRecord(source.Params[i]);
            }
        }
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new RecordField[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new RecordField(source.ExtParams[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MetastoreTypeName != null) {
            this.MetastoreTypeName = new String(source.MetastoreTypeName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.QualifiedName != null) {
            this.QualifiedName = new String(source.QualifiedName);
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PrefixPath != null) {
            this.PrefixPath = new String(source.PrefixPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
        if (source.ChannelType != null) {
            this.ChannelType = new String(source.ChannelType);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new String(source.DisplayType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetastoreTypeName", this.MetastoreTypeName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PrefixPath", this.PrefixPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);

    }
}

