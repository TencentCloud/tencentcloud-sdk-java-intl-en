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

public class SimpleColumnInfo extends AbstractModel {

    /**
    * Column ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Qualified Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * Column nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * Column Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnNameCn")
    @Expose
    private String ColumnNameCn;

    /**
    * Column Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * Column Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Prefix Path
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
    * Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Downstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * Upstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

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
    * Task Collection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
     * Get Column ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Column ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Column ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Column ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Qualified Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualifiedName Qualified Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set Qualified Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualifiedName Qualified Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get Column nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnName Column nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set Column nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnName Column nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get Column Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnNameCn Column Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnNameCn() {
        return this.ColumnNameCn;
    }

    /**
     * Set Column Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnNameCn Column Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnNameCn(String ColumnNameCn) {
        this.ColumnNameCn = ColumnNameCn;
    }

    /**
     * Get Column Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnType Column Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set Column Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnType Column Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get Column Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Column Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Column Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Column Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Prefix Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PrefixPath Prefix Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set Prefix Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PrefixPath Prefix Path
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
     * Get Modification TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifyTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get Downstream Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DownStreamCount Downstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set Downstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DownStreamCount Downstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get Upstream Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpStreamCount Upstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set Upstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpStreamCount Upstream Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
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
     * Get Task Collection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tasks Task Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task Collection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tasks Task Collection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public SimpleColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleColumnInfo(SimpleColumnInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.QualifiedName != null) {
            this.QualifiedName = new String(source.QualifiedName);
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
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
        if (source.RelationParams != null) {
            this.RelationParams = new String(source.RelationParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnNameCn", this.ColumnNameCn);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PrefixPath", this.PrefixPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "RelationParams", this.RelationParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}

