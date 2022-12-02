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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel{

    /**
    * Name of the database to be migrated or synced, which is required if `ObjectMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Name of the database after migration or sync, which is the same as the source database name by default.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * Database selection mode, which is required if `Mode` is `Partial`. Valid values: `All`, `Partial`. Note that the sync of advanced objects does not depend on this parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * The schema to be migrated or synced
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Name of the schema after migration or sync
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * Table selection mode, which is required if `DBMode` is `Partial`. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * The set of table objects, which is required if `TableMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tables")
    @Expose
    private Table [] Tables;

    /**
    * View selection mode. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * The set of view objects, which is required if `ViewMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Views")
    @Expose
    private View [] Views;

    /**
    * Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * This parameter is required if `FunctionMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * This parameter is required if `ProcedureMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
     * Get Name of the database to be migrated or synced, which is required if `ObjectMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Name of the database to be migrated or synced, which is required if `ObjectMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Name of the database to be migrated or synced, which is required if `ObjectMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Name of the database to be migrated or synced, which is required if `ObjectMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Name of the database after migration or sync, which is the same as the source database name by default.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewDbName Name of the database after migration or sync, which is the same as the source database name by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set Name of the database after migration or sync, which is the same as the source database name by default.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewDbName Name of the database after migration or sync, which is the same as the source database name by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get Database selection mode, which is required if `Mode` is `Partial`. Valid values: `All`, `Partial`. Note that the sync of advanced objects does not depend on this parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbMode Database selection mode, which is required if `Mode` is `Partial`. Valid values: `All`, `Partial`. Note that the sync of advanced objects does not depend on this parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database selection mode, which is required if `Mode` is `Partial`. Valid values: `All`, `Partial`. Note that the sync of advanced objects does not depend on this parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbMode Database selection mode, which is required if `Mode` is `Partial`. Valid values: `All`, `Partial`. Note that the sync of advanced objects does not depend on this parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get The schema to be migrated or synced
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchemaName The schema to be migrated or synced
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set The schema to be migrated or synced
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchemaName The schema to be migrated or synced
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Name of the schema after migration or sync
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewSchemaName Name of the schema after migration or sync
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set Name of the schema after migration or sync
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewSchemaName Name of the schema after migration or sync
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get Table selection mode, which is required if `DBMode` is `Partial`. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableMode Table selection mode, which is required if `DBMode` is `Partial`. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set Table selection mode, which is required if `DBMode` is `Partial`. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableMode Table selection mode, which is required if `DBMode` is `Partial`. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get The set of table objects, which is required if `TableMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tables The set of table objects, which is required if `TableMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Table [] getTables() {
        return this.Tables;
    }

    /**
     * Set The set of table objects, which is required if `TableMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tables The set of table objects, which is required if `TableMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTables(Table [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get View selection mode. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ViewMode View selection mode. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set View selection mode. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ViewMode View selection mode. Valid values: `All`, `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get The set of view objects, which is required if `ViewMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Views The set of view objects, which is required if `ViewMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public View [] getViews() {
        return this.Views;
    }

    /**
     * Set The set of view objects, which is required if `ViewMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Views The set of view objects, which is required if `ViewMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViews(View [] Views) {
        this.Views = Views;
    }

    /**
     * Get Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FunctionMode Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FunctionMode Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get This parameter is required if `FunctionMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Functions This parameter is required if `FunctionMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set This parameter is required if `FunctionMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Functions This parameter is required if `FunctionMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureMode Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcedureMode Sync mode. Valid values: `Partial`, `All`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get This parameter is required if `ProcedureMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Procedures This parameter is required if `ProcedureMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set This parameter is required if `ProcedureMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Procedures This parameter is required if `ProcedureMode` is `Partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    public Database() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Database(Database source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.NewDbName != null) {
            this.NewDbName = new String(source.NewDbName);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.NewSchemaName != null) {
            this.NewSchemaName = new String(source.NewSchemaName);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new Table[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new Table(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new View[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new View(source.Views[i]);
            }
        }
        if (source.FunctionMode != null) {
            this.FunctionMode = new String(source.FunctionMode);
        }
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.ProcedureMode != null) {
            this.ProcedureMode = new String(source.ProcedureMode);
        }
        if (source.Procedures != null) {
            this.Procedures = new String[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new String(source.Procedures[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "NewDbName", this.NewDbName);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "NewSchemaName", this.NewSchemaName);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);

    }
}

