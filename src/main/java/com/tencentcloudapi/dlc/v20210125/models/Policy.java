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

public class Policy extends AbstractModel {

    /**
    * The database name requiring authorization. use * to represent all databases under the current Catalog. for administrator level authorization type, only * is allowed. for data connection level authorization type, leave it blank. for other types, any specified database is allowed.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Specifies the name of the data source requiring authorization. at administrator level, only * is supported (representing all resources at this level). for database-level or data source-level authentication, only COSDataCatalog or * is supported. for table-level authentication, user-defined data sources can be filled. defaults to DataLakeCatalog if left blank. note: if authenticating a user-defined data source, the permissions DLC can manage are a subset of the account provided when the user accesses the data source.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Specifies the table name requiring authorization. use * to represent all tables in the current Database. for administrator-level authorization type, only * is allowed. for data connection level or Database-level authorization type, leave it blank. for other types, any specific data table can be specified.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * The target permissions, which vary by permission level. Admin: `ALL` (default); data connection: `CREATE`; database: `ALL`, `CREATE`, `ALTER`, and `DROP`; table: `ALL`, `SELECT`, `INSERT`, `ALTER`, `DELETE`, `DROP`, and `UPDATE`. Note: For table permissions, if a data source other than `COSDataCatalog` is specified, only the `SELECT` permission can be granted here.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * The permission type. Valid values: `ADMIN`, `DATASOURCE`, `DATABASE`, `TABLE`, `VIEW`, `FUNCTION`, `COLUMN`, and `ENGINE`. Note: If it is left empty, `ADMIN` is used.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Name of the function requiring authorization. use * to represent all functions in the current Catalog. for administrator-level authorization type, only * is allowed. for data connection-level authorization type, leave it blank. for other types, any function can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * Authorization is required for the view. fill in * to represent all views under the current Database. when the authorization type is administrator level, only * is allowed. when the authorization type is data connection level or Database level, only blank is allowed. for other types, any view can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Columns requiring authorization. use * to represent all current columns. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * The data engine requiring authorization. use * to represent all current engines. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * Whether the grantee is allowed to further grant the permissions. Valid values: `false` (default) and `true` (the grantee can grant permissions gained here to other sub-users).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReAuth")
    @Expose
    private Boolean ReAuth;

    /**
    * The permission source, which is not required when input parameters are passed in. Valid values: `USER` (from the user) and `WORKGROUP` (from one or more associated work groups).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * The grant mode, which is not required as an input parameter. Valid values: `COMMON` and `SENIOR`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The operator, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The permission policy creation time, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The ID of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * The name of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * The policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Specifies the engine type.

    */
    @SerializedName("EngineGeneration")
    @Expose
    private String EngineGeneration;

    /**
     * Get The database name requiring authorization. use * to represent all databases under the current Catalog. for administrator level authorization type, only * is allowed. for data connection level authorization type, leave it blank. for other types, any specified database is allowed. 
     * @return Database The database name requiring authorization. use * to represent all databases under the current Catalog. for administrator level authorization type, only * is allowed. for data connection level authorization type, leave it blank. for other types, any specified database is allowed.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set The database name requiring authorization. use * to represent all databases under the current Catalog. for administrator level authorization type, only * is allowed. for data connection level authorization type, leave it blank. for other types, any specified database is allowed.
     * @param Database The database name requiring authorization. use * to represent all databases under the current Catalog. for administrator level authorization type, only * is allowed. for data connection level authorization type, leave it blank. for other types, any specified database is allowed.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Specifies the name of the data source requiring authorization. at administrator level, only * is supported (representing all resources at this level). for database-level or data source-level authentication, only COSDataCatalog or * is supported. for table-level authentication, user-defined data sources can be filled. defaults to DataLakeCatalog if left blank. note: if authenticating a user-defined data source, the permissions DLC can manage are a subset of the account provided when the user accesses the data source. 
     * @return Catalog Specifies the name of the data source requiring authorization. at administrator level, only * is supported (representing all resources at this level). for database-level or data source-level authentication, only COSDataCatalog or * is supported. for table-level authentication, user-defined data sources can be filled. defaults to DataLakeCatalog if left blank. note: if authenticating a user-defined data source, the permissions DLC can manage are a subset of the account provided when the user accesses the data source.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Specifies the name of the data source requiring authorization. at administrator level, only * is supported (representing all resources at this level). for database-level or data source-level authentication, only COSDataCatalog or * is supported. for table-level authentication, user-defined data sources can be filled. defaults to DataLakeCatalog if left blank. note: if authenticating a user-defined data source, the permissions DLC can manage are a subset of the account provided when the user accesses the data source.
     * @param Catalog Specifies the name of the data source requiring authorization. at administrator level, only * is supported (representing all resources at this level). for database-level or data source-level authentication, only COSDataCatalog or * is supported. for table-level authentication, user-defined data sources can be filled. defaults to DataLakeCatalog if left blank. note: if authenticating a user-defined data source, the permissions DLC can manage are a subset of the account provided when the user accesses the data source.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Specifies the table name requiring authorization. use * to represent all tables in the current Database. for administrator-level authorization type, only * is allowed. for data connection level or Database-level authorization type, leave it blank. for other types, any specific data table can be specified. 
     * @return Table Specifies the table name requiring authorization. use * to represent all tables in the current Database. for administrator-level authorization type, only * is allowed. for data connection level or Database-level authorization type, leave it blank. for other types, any specific data table can be specified.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Specifies the table name requiring authorization. use * to represent all tables in the current Database. for administrator-level authorization type, only * is allowed. for data connection level or Database-level authorization type, leave it blank. for other types, any specific data table can be specified.
     * @param Table Specifies the table name requiring authorization. use * to represent all tables in the current Database. for administrator-level authorization type, only * is allowed. for data connection level or Database-level authorization type, leave it blank. for other types, any specific data table can be specified.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get The target permissions, which vary by permission level. Admin: `ALL` (default); data connection: `CREATE`; database: `ALL`, `CREATE`, `ALTER`, and `DROP`; table: `ALL`, `SELECT`, `INSERT`, `ALTER`, `DELETE`, `DROP`, and `UPDATE`. Note: For table permissions, if a data source other than `COSDataCatalog` is specified, only the `SELECT` permission can be granted here. 
     * @return Operation The target permissions, which vary by permission level. Admin: `ALL` (default); data connection: `CREATE`; database: `ALL`, `CREATE`, `ALTER`, and `DROP`; table: `ALL`, `SELECT`, `INSERT`, `ALTER`, `DELETE`, `DROP`, and `UPDATE`. Note: For table permissions, if a data source other than `COSDataCatalog` is specified, only the `SELECT` permission can be granted here.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set The target permissions, which vary by permission level. Admin: `ALL` (default); data connection: `CREATE`; database: `ALL`, `CREATE`, `ALTER`, and `DROP`; table: `ALL`, `SELECT`, `INSERT`, `ALTER`, `DELETE`, `DROP`, and `UPDATE`. Note: For table permissions, if a data source other than `COSDataCatalog` is specified, only the `SELECT` permission can be granted here.
     * @param Operation The target permissions, which vary by permission level. Admin: `ALL` (default); data connection: `CREATE`; database: `ALL`, `CREATE`, `ALTER`, and `DROP`; table: `ALL`, `SELECT`, `INSERT`, `ALTER`, `DELETE`, `DROP`, and `UPDATE`. Note: For table permissions, if a data source other than `COSDataCatalog` is specified, only the `SELECT` permission can be granted here.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get The permission type. Valid values: `ADMIN`, `DATASOURCE`, `DATABASE`, `TABLE`, `VIEW`, `FUNCTION`, `COLUMN`, and `ENGINE`. Note: If it is left empty, `ADMIN` is used. 
     * @return PolicyType The permission type. Valid values: `ADMIN`, `DATASOURCE`, `DATABASE`, `TABLE`, `VIEW`, `FUNCTION`, `COLUMN`, and `ENGINE`. Note: If it is left empty, `ADMIN` is used.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set The permission type. Valid values: `ADMIN`, `DATASOURCE`, `DATABASE`, `TABLE`, `VIEW`, `FUNCTION`, `COLUMN`, and `ENGINE`. Note: If it is left empty, `ADMIN` is used.
     * @param PolicyType The permission type. Valid values: `ADMIN`, `DATASOURCE`, `DATABASE`, `TABLE`, `VIEW`, `FUNCTION`, `COLUMN`, and `ENGINE`. Note: If it is left empty, `ADMIN` is used.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Name of the function requiring authorization. use * to represent all functions in the current Catalog. for administrator-level authorization type, only * is allowed. for data connection-level authorization type, leave it blank. for other types, any function can be specified.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Function Name of the function requiring authorization. use * to represent all functions in the current Catalog. for administrator-level authorization type, only * is allowed. for data connection-level authorization type, leave it blank. for other types, any function can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set Name of the function requiring authorization. use * to represent all functions in the current Catalog. for administrator-level authorization type, only * is allowed. for data connection-level authorization type, leave it blank. for other types, any function can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Function Name of the function requiring authorization. use * to represent all functions in the current Catalog. for administrator-level authorization type, only * is allowed. for data connection-level authorization type, leave it blank. for other types, any function can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get Authorization is required for the view. fill in * to represent all views under the current Database. when the authorization type is administrator level, only * is allowed. when the authorization type is data connection level or Database level, only blank is allowed. for other types, any view can be specified.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return View Authorization is required for the view. fill in * to represent all views under the current Database. when the authorization type is administrator level, only * is allowed. when the authorization type is data connection level or Database level, only blank is allowed. for other types, any view can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set Authorization is required for the view. fill in * to represent all views under the current Database. when the authorization type is administrator level, only * is allowed. when the authorization type is data connection level or Database level, only blank is allowed. for other types, any view can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param View Authorization is required for the view. fill in * to represent all views under the current Database. when the authorization type is administrator level, only * is allowed. when the authorization type is data connection level or Database level, only blank is allowed. for other types, any view can be specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Columns requiring authorization. use * to represent all current columns. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Column Columns requiring authorization. use * to represent all current columns. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set Columns requiring authorization. use * to represent all current columns. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Column Columns requiring authorization. use * to represent all current columns. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get The data engine requiring authorization. use * to represent all current engines. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngine The data engine requiring authorization. use * to represent all current engines. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set The data engine requiring authorization. use * to represent all current engines. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngine The data engine requiring authorization. use * to represent all current engines. when the authorization type is administrator level, only * is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get Whether the grantee is allowed to further grant the permissions. Valid values: `false` (default) and `true` (the grantee can grant permissions gained here to other sub-users).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReAuth Whether the grantee is allowed to further grant the permissions. Valid values: `false` (default) and `true` (the grantee can grant permissions gained here to other sub-users).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getReAuth() {
        return this.ReAuth;
    }

    /**
     * Set Whether the grantee is allowed to further grant the permissions. Valid values: `false` (default) and `true` (the grantee can grant permissions gained here to other sub-users).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReAuth Whether the grantee is allowed to further grant the permissions. Valid values: `false` (default) and `true` (the grantee can grant permissions gained here to other sub-users).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReAuth(Boolean ReAuth) {
        this.ReAuth = ReAuth;
    }

    /**
     * Get The permission source, which is not required when input parameters are passed in. Valid values: `USER` (from the user) and `WORKGROUP` (from one or more associated work groups).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Source The permission source, which is not required when input parameters are passed in. Valid values: `USER` (from the user) and `WORKGROUP` (from one or more associated work groups).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set The permission source, which is not required when input parameters are passed in. Valid values: `USER` (from the user) and `WORKGROUP` (from one or more associated work groups).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Source The permission source, which is not required when input parameters are passed in. Valid values: `USER` (from the user) and `WORKGROUP` (from one or more associated work groups).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get The grant mode, which is not required as an input parameter. Valid values: `COMMON` and `SENIOR`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mode The grant mode, which is not required as an input parameter. Valid values: `COMMON` and `SENIOR`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The grant mode, which is not required as an input parameter. Valid values: `COMMON` and `SENIOR`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mode The grant mode, which is not required as an input parameter. Valid values: `COMMON` and `SENIOR`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The operator, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operator The operator, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The operator, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operator The operator, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The permission policy creation time, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The permission policy creation time, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The permission policy creation time, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The permission policy creation time, which is not required as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The ID of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceId The ID of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set The ID of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceId The ID of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get The name of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceName The name of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set The name of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceName The name of the work group, which applies only when the value of the `Source` field is `WORKGROUP`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get The policy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id The policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id The policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the engine type.
 
     * @return EngineGeneration Specifies the engine type.

     */
    public String getEngineGeneration() {
        return this.EngineGeneration;
    }

    /**
     * Set Specifies the engine type.

     * @param EngineGeneration Specifies the engine type.

     */
    public void setEngineGeneration(String EngineGeneration) {
        this.EngineGeneration = EngineGeneration;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.ReAuth != null) {
            this.ReAuth = new Boolean(source.ReAuth);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SourceId != null) {
            this.SourceId = new Long(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.EngineGeneration != null) {
            this.EngineGeneration = new String(source.EngineGeneration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "ReAuth", this.ReAuth);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "EngineGeneration", this.EngineGeneration);

    }
}

