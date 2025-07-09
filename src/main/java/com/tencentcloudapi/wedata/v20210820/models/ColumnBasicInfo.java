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

public class ColumnBasicInfo extends AbstractModel {

    /**
    * Table's Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Data Source Globally Unique ID
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
    * Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Field NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * Data Type, such as string/int etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * Field Type, such as varchar(32)/int(10) etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnDefault")
    @Expose
    private String ColumnDefault;

    /**
    * Index Type, such as PRI/MUL/PARTITION etc., For normal fields, this value is an empty string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnKey")
    @Expose
    private String ColumnKey;

    /**
    * Field Order Identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnPosition")
    @Expose
    private Long ColumnPosition;

    /**
    * Field Comment
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnComment")
    @Expose
    private String ColumnComment;

    /**
    * Data TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StoreType")
    @Expose
    private String StoreType;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
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
    * Project Name in Chinese
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

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
    * Precision
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
     * Get Table's Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table's Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table's Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table's Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Data Source Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source Globally Unique ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source Globally Unique ID
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
     * Get Data Type, such as string/int etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataType Data Type, such as string/int etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set Data Type, such as string/int etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataType Data Type, such as string/int etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get Field Type, such as varchar(32)/int(10) etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnType Field Type, such as varchar(32)/int(10) etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set Field Type, such as varchar(32)/int(10) etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnType Field Type, such as varchar(32)/int(10) etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get Field Default Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnDefault Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnDefault() {
        return this.ColumnDefault;
    }

    /**
     * Set Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnDefault Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnDefault(String ColumnDefault) {
        this.ColumnDefault = ColumnDefault;
    }

    /**
     * Get Index Type, such as PRI/MUL/PARTITION etc., For normal fields, this value is an empty string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnKey Index Type, such as PRI/MUL/PARTITION etc., For normal fields, this value is an empty string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnKey() {
        return this.ColumnKey;
    }

    /**
     * Set Index Type, such as PRI/MUL/PARTITION etc., For normal fields, this value is an empty string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnKey Index Type, such as PRI/MUL/PARTITION etc., For normal fields, this value is an empty string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnKey(String ColumnKey) {
        this.ColumnKey = ColumnKey;
    }

    /**
     * Get Field Order Identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnPosition Field Order Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getColumnPosition() {
        return this.ColumnPosition;
    }

    /**
     * Set Field Order Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnPosition Field Order Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnPosition(Long ColumnPosition) {
        this.ColumnPosition = ColumnPosition;
    }

    /**
     * Get Field Comment
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnComment Field Comment
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnComment() {
        return this.ColumnComment;
    }

    /**
     * Set Field Comment
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnComment Field Comment
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnComment(String ColumnComment) {
        this.ColumnComment = ColumnComment;
    }

    /**
     * Get Data TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StoreType Data TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStoreType() {
        return this.StoreType;
    }

    /**
     * Set Data TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StoreType Data TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStoreType(String StoreType) {
        this.StoreType = StoreType;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
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
     * Get Project Name in Chinese
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectDisplayName Project Name in Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set Project Name in Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectDisplayName Project Name in Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
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
     * Get Precision
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Scale Precision
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Precision
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Scale Precision
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    public ColumnBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnBasicInfo(ColumnBasicInfo source) {
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
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
        if (source.ColumnDefault != null) {
            this.ColumnDefault = new String(source.ColumnDefault);
        }
        if (source.ColumnKey != null) {
            this.ColumnKey = new String(source.ColumnKey);
        }
        if (source.ColumnPosition != null) {
            this.ColumnPosition = new Long(source.ColumnPosition);
        }
        if (source.ColumnComment != null) {
            this.ColumnComment = new String(source.ColumnComment);
        }
        if (source.StoreType != null) {
            this.StoreType = new String(source.StoreType);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
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
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "ColumnDefault", this.ColumnDefault);
        this.setParamSimple(map, prefix + "ColumnKey", this.ColumnKey);
        this.setParamSimple(map, prefix + "ColumnPosition", this.ColumnPosition);
        this.setParamSimple(map, prefix + "ColumnComment", this.ColumnComment);
        this.setParamSimple(map, prefix + "StoreType", this.StoreType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Scale", this.Scale);

    }
}

