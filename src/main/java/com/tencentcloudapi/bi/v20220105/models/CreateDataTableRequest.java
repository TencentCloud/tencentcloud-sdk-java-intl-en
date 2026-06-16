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

public class CreateDataTableRequest extends AbstractModel {

    /**
    * The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Data table name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * None.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * folder
    */
    @SerializedName("FoldId")
    @Expose
    private Long FoldId;

    /**
    * data source Id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * physical table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * sql statement
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * excel address
    */
    @SerializedName("ExcelUrl")
    @Expose
    private String ExcelUrl;

    /**
    * configure field
    */
    @SerializedName("Fields")
    @Expose
    private TableField [] Fields;

    /**
    * Multi-table join usage: 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
    */
    @SerializedName("TableNodeType")
    @Expose
    private Long TableNodeType;

    /**
    * Original table information for multi-table join
    */
    @SerializedName("Tables")
    @Expose
    private JoinSourceTable [] Tables;

    /**
    * Multi-table join association information
    */
    @SerializedName("Joins")
    @Expose
    private JoinRelation [] Joins;

    /**
    * Additional info, such as api data source info and Tencent document access info
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * whether
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * dependent async transaction id
    */
    @SerializedName("ParentTranId")
    @Expose
    private String ParentTranId;

    /**
    * API data source configuration
    */
    @SerializedName("ApiDatasourceConfig")
    @Expose
    private ApiDatasourceConfig ApiDatasourceConfig;

    /**
    * 1
    */
    @SerializedName("ParamList")
    @Expose
    private ParamCreateDTO [] ParamList;

    /**
    * dlc advanced parameter
    */
    @SerializedName("DlcExtInfo")
    @Expose
    private String DlcExtInfo;

    /**
    * Query database required or not
    */
    @SerializedName("QueryDbData")
    @Expose
    private String QueryDbData;

    /**
    * Table remark
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * Whether to query field remarks
    */
    @SerializedName("QueryFieldRemark")
    @Expose
    private Long QueryFieldRemark;

    /**
    * Field remarks list
    */
    @SerializedName("FieldRemarkList")
    @Expose
    private FieldRemarkDTO [] FieldRemarkList;

    /**
     * Get The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query. 
     * @return Type The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     * @param Type The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Data table name 
     * @return Name Data table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data table name
     * @param Name Data table name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get None. 
     * @return ProjectId None.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set None.
     * @param ProjectId None.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get folder 
     * @return FoldId folder
     */
    public Long getFoldId() {
        return this.FoldId;
    }

    /**
     * Set folder
     * @param FoldId folder
     */
    public void setFoldId(Long FoldId) {
        this.FoldId = FoldId;
    }

    /**
     * Get data source Id 
     * @return DatasourceId data source Id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set data source Id
     * @param DatasourceId data source Id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get physical table name 
     * @return TableName physical table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set physical table name
     * @param TableName physical table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get sql statement 
     * @return Sql sql statement
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql statement
     * @param Sql sql statement
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get excel address 
     * @return ExcelUrl excel address
     */
    public String getExcelUrl() {
        return this.ExcelUrl;
    }

    /**
     * Set excel address
     * @param ExcelUrl excel address
     */
    public void setExcelUrl(String ExcelUrl) {
        this.ExcelUrl = ExcelUrl;
    }

    /**
     * Get configure field 
     * @return Fields configure field
     */
    public TableField [] getFields() {
        return this.Fields;
    }

    /**
     * Set configure field
     * @param Fields configure field
     */
    public void setFields(TableField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get Multi-table join usage: 1: Data source original table, 2: Local table, 3: Excel table, 4: API table 
     * @return TableNodeType Multi-table join usage: 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
     */
    public Long getTableNodeType() {
        return this.TableNodeType;
    }

    /**
     * Set Multi-table join usage: 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
     * @param TableNodeType Multi-table join usage: 1: Data source original table, 2: Local table, 3: Excel table, 4: API table
     */
    public void setTableNodeType(Long TableNodeType) {
        this.TableNodeType = TableNodeType;
    }

    /**
     * Get Original table information for multi-table join 
     * @return Tables Original table information for multi-table join
     */
    public JoinSourceTable [] getTables() {
        return this.Tables;
    }

    /**
     * Set Original table information for multi-table join
     * @param Tables Original table information for multi-table join
     */
    public void setTables(JoinSourceTable [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get Multi-table join association information 
     * @return Joins Multi-table join association information
     */
    public JoinRelation [] getJoins() {
        return this.Joins;
    }

    /**
     * Set Multi-table join association information
     * @param Joins Multi-table join association information
     */
    public void setJoins(JoinRelation [] Joins) {
        this.Joins = Joins;
    }

    /**
     * Get Additional info, such as api data source info and Tencent document access info 
     * @return ExtInfo Additional info, such as api data source info and Tencent document access info
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Additional info, such as api data source info and Tencent document access info
     * @param ExtInfo Additional info, such as api data source info and Tencent document access info
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get whether 
     * @return AsyncRequest whether
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set whether
     * @param AsyncRequest whether
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get dependent async transaction id 
     * @return ParentTranId dependent async transaction id
     */
    public String getParentTranId() {
        return this.ParentTranId;
    }

    /**
     * Set dependent async transaction id
     * @param ParentTranId dependent async transaction id
     */
    public void setParentTranId(String ParentTranId) {
        this.ParentTranId = ParentTranId;
    }

    /**
     * Get API data source configuration 
     * @return ApiDatasourceConfig API data source configuration
     */
    public ApiDatasourceConfig getApiDatasourceConfig() {
        return this.ApiDatasourceConfig;
    }

    /**
     * Set API data source configuration
     * @param ApiDatasourceConfig API data source configuration
     */
    public void setApiDatasourceConfig(ApiDatasourceConfig ApiDatasourceConfig) {
        this.ApiDatasourceConfig = ApiDatasourceConfig;
    }

    /**
     * Get 1 
     * @return ParamList 1
     */
    public ParamCreateDTO [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 1
     * @param ParamList 1
     */
    public void setParamList(ParamCreateDTO [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get dlc advanced parameter 
     * @return DlcExtInfo dlc advanced parameter
     */
    public String getDlcExtInfo() {
        return this.DlcExtInfo;
    }

    /**
     * Set dlc advanced parameter
     * @param DlcExtInfo dlc advanced parameter
     */
    public void setDlcExtInfo(String DlcExtInfo) {
        this.DlcExtInfo = DlcExtInfo;
    }

    /**
     * Get Query database required or not 
     * @return QueryDbData Query database required or not
     */
    public String getQueryDbData() {
        return this.QueryDbData;
    }

    /**
     * Set Query database required or not
     * @param QueryDbData Query database required or not
     */
    public void setQueryDbData(String QueryDbData) {
        this.QueryDbData = QueryDbData;
    }

    /**
     * Get Table remark 
     * @return TableComment Table remark
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set Table remark
     * @param TableComment Table remark
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get Whether to query field remarks 
     * @return QueryFieldRemark Whether to query field remarks
     */
    public Long getQueryFieldRemark() {
        return this.QueryFieldRemark;
    }

    /**
     * Set Whether to query field remarks
     * @param QueryFieldRemark Whether to query field remarks
     */
    public void setQueryFieldRemark(Long QueryFieldRemark) {
        this.QueryFieldRemark = QueryFieldRemark;
    }

    /**
     * Get Field remarks list 
     * @return FieldRemarkList Field remarks list
     */
    public FieldRemarkDTO [] getFieldRemarkList() {
        return this.FieldRemarkList;
    }

    /**
     * Set Field remarks list
     * @param FieldRemarkList Field remarks list
     */
    public void setFieldRemarkList(FieldRemarkDTO [] FieldRemarkList) {
        this.FieldRemarkList = FieldRemarkList;
    }

    public CreateDataTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataTableRequest(CreateDataTableRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.FoldId != null) {
            this.FoldId = new Long(source.FoldId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ExcelUrl != null) {
            this.ExcelUrl = new String(source.ExcelUrl);
        }
        if (source.Fields != null) {
            this.Fields = new TableField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new TableField(source.Fields[i]);
            }
        }
        if (source.TableNodeType != null) {
            this.TableNodeType = new Long(source.TableNodeType);
        }
        if (source.Tables != null) {
            this.Tables = new JoinSourceTable[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new JoinSourceTable(source.Tables[i]);
            }
        }
        if (source.Joins != null) {
            this.Joins = new JoinRelation[source.Joins.length];
            for (int i = 0; i < source.Joins.length; i++) {
                this.Joins[i] = new JoinRelation(source.Joins[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.ParentTranId != null) {
            this.ParentTranId = new String(source.ParentTranId);
        }
        if (source.ApiDatasourceConfig != null) {
            this.ApiDatasourceConfig = new ApiDatasourceConfig(source.ApiDatasourceConfig);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamCreateDTO[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamCreateDTO(source.ParamList[i]);
            }
        }
        if (source.DlcExtInfo != null) {
            this.DlcExtInfo = new String(source.DlcExtInfo);
        }
        if (source.QueryDbData != null) {
            this.QueryDbData = new String(source.QueryDbData);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.QueryFieldRemark != null) {
            this.QueryFieldRemark = new Long(source.QueryFieldRemark);
        }
        if (source.FieldRemarkList != null) {
            this.FieldRemarkList = new FieldRemarkDTO[source.FieldRemarkList.length];
            for (int i = 0; i < source.FieldRemarkList.length; i++) {
                this.FieldRemarkList[i] = new FieldRemarkDTO(source.FieldRemarkList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FoldId", this.FoldId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ExcelUrl", this.ExcelUrl);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "TableNodeType", this.TableNodeType);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Joins.", this.Joins);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "ParentTranId", this.ParentTranId);
        this.setParamObj(map, prefix + "ApiDatasourceConfig.", this.ApiDatasourceConfig);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "DlcExtInfo", this.DlcExtInfo);
        this.setParamSimple(map, prefix + "QueryDbData", this.QueryDbData);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamSimple(map, prefix + "QueryFieldRemark", this.QueryFieldRemark);
        this.setParamArrayObj(map, prefix + "FieldRemarkList.", this.FieldRemarkList);

    }
}

