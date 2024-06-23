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

public class ColumnLineageInfo extends AbstractModel {

    /**
    * Lineage ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Field NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnNameCn")
    @Expose
    private String ColumnNameCn;

    /**
    * Field TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * Relationship Parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RelationParams")
    @Expose
    private String RelationParams;

    /**
    * ParameterNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Parent ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Metadata Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * Metadata Type Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetastoreTypeName")
    @Expose
    private String MetastoreTypeName;

    /**
    * Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Full Field Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * Number of Downstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * Number of Upstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Path Information Starting from the Central Node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PrefixPath")
    @Expose
    private String PrefixPath;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Task ID list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * Parent Node List String
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * Child Node List String
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
    private LineageParamRecord [] ExtParams;

    /**
    * Table IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

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
     * Get Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Field NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnName Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set Field NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnName Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnNameCn Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnNameCn() {
        return this.ColumnNameCn;
    }

    /**
     * Set Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnNameCn Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnNameCn(String ColumnNameCn) {
        this.ColumnNameCn = ColumnNameCn;
    }

    /**
     * Get Field TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnType Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnType Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get Relationship Parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RelationParams Relationship Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRelationParams() {
        return this.RelationParams;
    }

    /**
     * Set Relationship Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RelationParams Relationship Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRelationParams(String RelationParams) {
        this.RelationParams = RelationParams;
    }

    /**
     * Get ParameterNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Params ParameterNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set ParameterNote: This field may return null, indicating that no valid value can be obtained.
     * @param Params ParameterNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Parent ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentId Parent ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentId Parent ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

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
     * Get Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Full Field Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualifiedName Full Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set Full Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualifiedName Full Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get Number of Downstream Nodes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DownStreamCount Number of Downstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set Number of Downstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DownStreamCount Number of Downstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get Number of Upstream Nodes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpStreamCount Number of Upstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set Number of Upstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpStreamCount Number of Upstream Nodes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Path Information Starting from the Central Node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PrefixPath Path Information Starting from the Central Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set Path Information Starting from the Central Node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PrefixPath Path Information Starting from the Central Node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPrefixPath(String PrefixPath) {
        this.PrefixPath = PrefixPath;
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
     * @return ModifyTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Task ID list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tasks Task ID list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task ID list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tasks Task ID list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Parent Node List String
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentSet Parent Node List String
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set Parent Node List String
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentSet Parent Node List String
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get Child Node List String
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChildSet Child Node List String
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set Child Node List String
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChildSet Child Node List String
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
    public LineageParamRecord [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtParams Additional parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtParams(LineageParamRecord [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get Table IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    public ColumnLineageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnLineageInfo(ColumnLineageInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ColumnNameCn != null) {
            this.ColumnNameCn = new String(source.ColumnNameCn);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
        if (source.RelationParams != null) {
            this.RelationParams = new String(source.RelationParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
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
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new LineageParamRecord[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new LineageParamRecord(source.ExtParams[i]);
            }
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnNameCn", this.ColumnNameCn);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "RelationParams", this.RelationParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
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
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "TableId", this.TableId);

    }
}

