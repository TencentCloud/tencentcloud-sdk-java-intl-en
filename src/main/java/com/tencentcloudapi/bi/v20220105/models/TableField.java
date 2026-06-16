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

public class TableField extends AbstractModel {

    /**
    * Field name in the db
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * bi display name
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Field type in the db
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Abstract field types after BI categorization, such as string, number, time
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Complex detail type generated after calculation formula of combination of fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldComplexType")
    @Expose
    private String FieldComplexType;

    /**
    * Field description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Field calculation formula
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
    * Chinese formula content of the calculated field, displayed on the front-end
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcDesc")
    @Expose
    private String CalcDesc;

    /**
    * Associate dictionary table id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DictId")
    @Expose
    private Long DictId;

    /**
    * Associate dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DictName")
    @Expose
    private String DictName;

    /**
    * Optional, join tables to add field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableNodeId")
    @Expose
    private String TableNodeId;

    /**
    * excel
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExcelName")
    @Expose
    private String ExcelName;

    /**
    * Optional, join tables to add field, name of the table the field belongs to
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * api data source path name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonPathName")
    @Expose
    private String JsonPathName;

    /**
    * Geographic field identifier
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * Map id
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
     * Get Field name in the db 
     * @return DbName Field name in the db
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Field name in the db
     * @param DbName Field name in the db
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get bi display name 
     * @return AliasName bi display name
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set bi display name
     * @param AliasName bi display name
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Field type in the db 
     * @return DbType Field type in the db
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Field type in the db
     * @param DbType Field type in the db
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Abstract field types after BI categorization, such as string, number, time 
     * @return FieldType Abstract field types after BI categorization, such as string, number, time
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Abstract field types after BI categorization, such as string, number, time
     * @param FieldType Abstract field types after BI categorization, such as string, number, time
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Complex detail type generated after calculation formula of combination of fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldComplexType Complex detail type generated after calculation formula of combination of fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldComplexType() {
        return this.FieldComplexType;
    }

    /**
     * Set Complex detail type generated after calculation formula of combination of fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldComplexType Complex detail type generated after calculation formula of combination of fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldComplexType(String FieldComplexType) {
        this.FieldComplexType = FieldComplexType;
    }

    /**
     * Get Field description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mark Field description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Field description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mark Field description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Field calculation formula
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormatRule Field calculation formula
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormatRule() {
        return this.FormatRule;
    }

    /**
     * Set Field calculation formula
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormatRule Field calculation formula
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
     * Get Chinese formula content of the calculated field, displayed on the front-end
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CalcDesc Chinese formula content of the calculated field, displayed on the front-end
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCalcDesc() {
        return this.CalcDesc;
    }

    /**
     * Set Chinese formula content of the calculated field, displayed on the front-end
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CalcDesc Chinese formula content of the calculated field, displayed on the front-end
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCalcDesc(String CalcDesc) {
        this.CalcDesc = CalcDesc;
    }

    /**
     * Get Associate dictionary table id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DictId Associate dictionary table id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDictId() {
        return this.DictId;
    }

    /**
     * Set Associate dictionary table id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DictId Associate dictionary table id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDictId(Long DictId) {
        this.DictId = DictId;
    }

    /**
     * Get Associate dictionary table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DictName Associate dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDictName() {
        return this.DictName;
    }

    /**
     * Set Associate dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DictName Associate dictionary table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDictName(String DictName) {
        this.DictName = DictName;
    }

    /**
     * Get Optional, join tables to add field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableNodeId Optional, join tables to add field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableNodeId() {
        return this.TableNodeId;
    }

    /**
     * Set Optional, join tables to add field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableNodeId Optional, join tables to add field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableNodeId(String TableNodeId) {
        this.TableNodeId = TableNodeId;
    }

    /**
     * Get excel
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExcelName excel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExcelName() {
        return this.ExcelName;
    }

    /**
     * Set excel
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExcelName excel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExcelName(String ExcelName) {
        this.ExcelName = ExcelName;
    }

    /**
     * Get Optional, join tables to add field, name of the table the field belongs to
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Optional, join tables to add field, name of the table the field belongs to
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Optional, join tables to add field, name of the table the field belongs to
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Optional, join tables to add field, name of the table the field belongs to
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get api data source path name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonPathName api data source path name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJsonPathName() {
        return this.JsonPathName;
    }

    /**
     * Set api data source path name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonPathName api data source path name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonPathName(String JsonPathName) {
        this.JsonPathName = JsonPathName;
    }

    /**
     * Get Geographic field identifier
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Granularity Geographic field identifier
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Geographic field identifier
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Granularity Geographic field identifier
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Map id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GeoJsonId Map id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGeoJsonId() {
        return this.GeoJsonId;
    }

    /**
     * Set Map id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GeoJsonId Map id
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

    public TableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableField(TableField source) {
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
        if (source.FieldComplexType != null) {
            this.FieldComplexType = new String(source.FieldComplexType);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
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
        if (source.DictId != null) {
            this.DictId = new Long(source.DictId);
        }
        if (source.DictName != null) {
            this.DictName = new String(source.DictName);
        }
        if (source.TableNodeId != null) {
            this.TableNodeId = new String(source.TableNodeId);
        }
        if (source.ExcelName != null) {
            this.ExcelName = new String(source.ExcelName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
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
        this.setParamSimple(map, prefix + "FieldComplexType", this.FieldComplexType);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "FormatRule", this.FormatRule);
        this.setParamSimple(map, prefix + "IsFilter", this.IsFilter);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcFormula", this.CalcFormula);
        this.setParamSimple(map, prefix + "CalcDesc", this.CalcDesc);
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "DictName", this.DictName);
        this.setParamSimple(map, prefix + "TableNodeId", this.TableNodeId);
        this.setParamSimple(map, prefix + "ExcelName", this.ExcelName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "JsonPathName", this.JsonPathName);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "GeoJsonId", this.GeoJsonId);
        this.setParamObj(map, prefix + "EmptyValueConfig.", this.EmptyValueConfig);
        this.setParamSimple(map, prefix + "DbFieldName", this.DbFieldName);
        this.setParamSimple(map, prefix + "IsCopyOperation", this.IsCopyOperation);
        this.setParamSimple(map, prefix + "IsCopyFromNormal", this.IsCopyFromNormal);

    }
}

