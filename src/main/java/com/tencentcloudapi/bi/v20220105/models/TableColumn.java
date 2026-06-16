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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableColumn extends AbstractModel {

    /**
    * Column name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * alias name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Column type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Segment type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * excel name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExcelName")
    @Expose
    private String ExcelName;

    /**
    * Associated dictionary table Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DictId")
    @Expose
    private Long DictId;

    /**
    * Associated dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DictName")
    @Expose
    private String DictName;

    /**
    * Join tables and add fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableNodeId")
    @Expose
    private String TableNodeId;

    /**
    * Table name to which the field belongs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Complex format of the target set by the user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldComplexType")
    @Expose
    private String FieldComplexType;

    /**
    * format rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormatRule")
    @Expose
    private String FormatRule;

    /**
    * Whether to filter empty data fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFilter")
    @Expose
    private Boolean IsFilter;

    /**
    * Compute field type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * Formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcFormula")
    @Expose
    private String CalcFormula;

    /**
    * Chinese formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcDesc")
    @Expose
    private String CalcDesc;

    /**
    * Api data source json path name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonPathName")
    @Expose
    private String JsonPathName;

    /**
    * Geographic type identifier
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * Custom map Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GeoJsonId")
    @Expose
    private Long GeoJsonId;

    /**
    * Style configuration for null value display
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmptyValueConfig")
    @Expose
    private EmptyValueConfig EmptyValueConfig;

    /**
    * Original column name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbFieldName")
    @Expose
    private String DbFieldName;

    /**
    * Whether to copy field operation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCopyOperation")
    @Expose
    private Boolean IsCopyOperation;

    /**
    * Whether to copy from common fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCopyFromNormal")
    @Expose
    private Boolean IsCopyFromNormal;

    /**
     * Get Column name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Column name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get alias name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AliasName alias name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set alias name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AliasName alias name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Column type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbType Column type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Column type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbType Column type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Segment type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldType Segment type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Segment type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldType Segment type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get excel name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExcelName excel name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExcelName() {
        return this.ExcelName;
    }

    /**
     * Set excel name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExcelName excel name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExcelName(String ExcelName) {
        this.ExcelName = ExcelName;
    }

    /**
     * Get Associated dictionary table Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DictId Associated dictionary table Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDictId() {
        return this.DictId;
    }

    /**
     * Set Associated dictionary table Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DictId Associated dictionary table Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDictId(Long DictId) {
        this.DictId = DictId;
    }

    /**
     * Get Associated dictionary table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DictName Associated dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDictName() {
        return this.DictName;
    }

    /**
     * Set Associated dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DictName Associated dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDictName(String DictName) {
        this.DictName = DictName;
    }

    /**
     * Get Join tables and add fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableNodeId Join tables and add fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableNodeId() {
        return this.TableNodeId;
    }

    /**
     * Set Join tables and add fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableNodeId Join tables and add fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableNodeId(String TableNodeId) {
        this.TableNodeId = TableNodeId;
    }

    /**
     * Get Table name to which the field belongs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name to which the field belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name to which the field belongs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name to which the field belongs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Complex format of the target set by the user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldComplexType Complex format of the target set by the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldComplexType() {
        return this.FieldComplexType;
    }

    /**
     * Set Complex format of the target set by the user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldComplexType Complex format of the target set by the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldComplexType(String FieldComplexType) {
        this.FieldComplexType = FieldComplexType;
    }

    /**
     * Get format rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormatRule format rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormatRule() {
        return this.FormatRule;
    }

    /**
     * Set format rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormatRule format rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormatRule(String FormatRule) {
        this.FormatRule = FormatRule;
    }

    /**
     * Get Whether to filter empty data fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsFilter Whether to filter empty data fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsFilter() {
        return this.IsFilter;
    }

    /**
     * Set Whether to filter empty data fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsFilter Whether to filter empty data fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsFilter(Boolean IsFilter) {
        this.IsFilter = IsFilter;
    }

    /**
     * Get Compute field type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CalcType Compute field type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set Compute field type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CalcType Compute field type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get Formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CalcFormula Formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCalcFormula() {
        return this.CalcFormula;
    }

    /**
     * Set Formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CalcFormula Formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCalcFormula(String CalcFormula) {
        this.CalcFormula = CalcFormula;
    }

    /**
     * Get Chinese formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CalcDesc Chinese formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCalcDesc() {
        return this.CalcDesc;
    }

    /**
     * Set Chinese formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CalcDesc Chinese formula content of the calculated field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCalcDesc(String CalcDesc) {
        this.CalcDesc = CalcDesc;
    }

    /**
     * Get Api data source json path name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonPathName Api data source json path name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJsonPathName() {
        return this.JsonPathName;
    }

    /**
     * Set Api data source json path name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonPathName Api data source json path name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonPathName(String JsonPathName) {
        this.JsonPathName = JsonPathName;
    }

    /**
     * Get Geographic type identifier
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Granularity Geographic type identifier
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Geographic type identifier
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Granularity Geographic type identifier
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Custom map Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GeoJsonId Custom map Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGeoJsonId() {
        return this.GeoJsonId;
    }

    /**
     * Set Custom map Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GeoJsonId Custom map Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGeoJsonId(Long GeoJsonId) {
        this.GeoJsonId = GeoJsonId;
    }

    /**
     * Get Style configuration for null value display
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EmptyValueConfig Style configuration for null value display
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EmptyValueConfig getEmptyValueConfig() {
        return this.EmptyValueConfig;
    }

    /**
     * Set Style configuration for null value display
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EmptyValueConfig Style configuration for null value display
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmptyValueConfig(EmptyValueConfig EmptyValueConfig) {
        this.EmptyValueConfig = EmptyValueConfig;
    }

    /**
     * Get Original column name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbFieldName Original column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbFieldName() {
        return this.DbFieldName;
    }

    /**
     * Set Original column name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbFieldName Original column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbFieldName(String DbFieldName) {
        this.DbFieldName = DbFieldName;
    }

    /**
     * Get Whether to copy field operation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCopyOperation Whether to copy field operation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsCopyOperation() {
        return this.IsCopyOperation;
    }

    /**
     * Set Whether to copy field operation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCopyOperation Whether to copy field operation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCopyOperation(Boolean IsCopyOperation) {
        this.IsCopyOperation = IsCopyOperation;
    }

    /**
     * Get Whether to copy from common fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCopyFromNormal Whether to copy from common fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsCopyFromNormal() {
        return this.IsCopyFromNormal;
    }

    /**
     * Set Whether to copy from common fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCopyFromNormal Whether to copy from common fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCopyFromNormal(Boolean IsCopyFromNormal) {
        this.IsCopyFromNormal = IsCopyFromNormal;
    }

    public TableColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableColumn(TableColumn source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.ExcelName != null) {
            this.ExcelName = new String(source.ExcelName);
        }
        if (source.DictId != null) {
            this.DictId = new Long(source.DictId);
        }
        if (source.DictName != null) {
            this.DictName = new String(source.DictName);
        }
        if (source.TableNodeId != null) {
            this.TableNodeId = new String(source.TableNodeId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldComplexType != null) {
            this.FieldComplexType = new String(source.FieldComplexType);
        }
        if (source.FormatRule != null) {
            this.FormatRule = new String(source.FormatRule);
        }
        if (source.IsFilter != null) {
            this.IsFilter = new Boolean(source.IsFilter);
        }
        if (source.CalcType != null) {
            this.CalcType = new String(source.CalcType);
        }
        if (source.CalcFormula != null) {
            this.CalcFormula = new String(source.CalcFormula);
        }
        if (source.CalcDesc != null) {
            this.CalcDesc = new String(source.CalcDesc);
        }
        if (source.JsonPathName != null) {
            this.JsonPathName = new String(source.JsonPathName);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.GeoJsonId != null) {
            this.GeoJsonId = new Long(source.GeoJsonId);
        }
        if (source.EmptyValueConfig != null) {
            this.EmptyValueConfig = new EmptyValueConfig(source.EmptyValueConfig);
        }
        if (source.DbFieldName != null) {
            this.DbFieldName = new String(source.DbFieldName);
        }
        if (source.IsCopyOperation != null) {
            this.IsCopyOperation = new Boolean(source.IsCopyOperation);
        }
        if (source.IsCopyFromNormal != null) {
            this.IsCopyFromNormal = new Boolean(source.IsCopyFromNormal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "ExcelName", this.ExcelName);
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "DictName", this.DictName);
        this.setParamSimple(map, prefix + "TableNodeId", this.TableNodeId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldComplexType", this.FieldComplexType);
        this.setParamSimple(map, prefix + "FormatRule", this.FormatRule);
        this.setParamSimple(map, prefix + "IsFilter", this.IsFilter);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcFormula", this.CalcFormula);
        this.setParamSimple(map, prefix + "CalcDesc", this.CalcDesc);
        this.setParamSimple(map, prefix + "JsonPathName", this.JsonPathName);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "GeoJsonId", this.GeoJsonId);
        this.setParamObj(map, prefix + "EmptyValueConfig.", this.EmptyValueConfig);
        this.setParamSimple(map, prefix + "DbFieldName", this.DbFieldName);
        this.setParamSimple(map, prefix + "IsCopyOperation", this.IsCopyOperation);
        this.setParamSimple(map, prefix + "IsCopyFromNormal", this.IsCopyFromNormal);

    }
}

