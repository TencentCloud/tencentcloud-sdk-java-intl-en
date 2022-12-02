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

public class DBItem extends AbstractModel{

    /**
    * Name of the database to be migrated or synced, which is required if `ObjectMode` is `partial`.
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
    * Database selection mode, which is required if `ObjectMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBMode")
    @Expose
    private String DBMode;

    /**
    * Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchemaMode")
    @Expose
    private String SchemaMode;

    /**
    * Table selection mode, which is required if `DBMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * The set of table objects, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tables")
    @Expose
    private TableItem [] Tables;

    /**
    * View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * The set of view objects, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Views")
    @Expose
    private ViewItem [] Views;

    /**
    * Role selection mode, which is exclusive to PostgreSQL. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleMode")
    @Expose
    private String RoleMode;

    /**
    * Role, which is exclusive to PostgreSQL and required if `RoleMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Roles")
    @Expose
    private RoleItem [] Roles;

    /**
    * Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * This parameter is required if `FunctionMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * This parameter is required if `ProcedureMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * This parameter is required if `EventMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
    * This parameter is required if `TriggerMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
     * Get Name of the database to be migrated or synced, which is required if `ObjectMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Name of the database to be migrated or synced, which is required if `ObjectMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Name of the database to be migrated or synced, which is required if `ObjectMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Name of the database to be migrated or synced, which is required if `ObjectMode` is `partial`.
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
     * Get Database selection mode, which is required if `ObjectMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBMode Database selection mode, which is required if `ObjectMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBMode() {
        return this.DBMode;
    }

    /**
     * Set Database selection mode, which is required if `ObjectMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBMode Database selection mode, which is required if `ObjectMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBMode(String DBMode) {
        this.DBMode = DBMode;
    }

    /**
     * Get Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchemaMode Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchemaMode() {
        return this.SchemaMode;
    }

    /**
     * Set Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchemaMode Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchemaMode(String SchemaMode) {
        this.SchemaMode = SchemaMode;
    }

    /**
     * Get Table selection mode, which is required if `DBMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableMode Table selection mode, which is required if `DBMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set Table selection mode, which is required if `DBMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableMode Table selection mode, which is required if `DBMode` is `partial`. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get The set of table objects, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tables The set of table objects, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set The set of table objects, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tables The set of table objects, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTables(TableItem [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ViewMode View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ViewMode View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get The set of view objects, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Views The set of view objects, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ViewItem [] getViews() {
        return this.Views;
    }

    /**
     * Set The set of view objects, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Views The set of view objects, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViews(ViewItem [] Views) {
        this.Views = Views;
    }

    /**
     * Get Role selection mode, which is exclusive to PostgreSQL. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleMode Role selection mode, which is exclusive to PostgreSQL. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleMode() {
        return this.RoleMode;
    }

    /**
     * Set Role selection mode, which is exclusive to PostgreSQL. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleMode Role selection mode, which is exclusive to PostgreSQL. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleMode(String RoleMode) {
        this.RoleMode = RoleMode;
    }

    /**
     * Get Role, which is exclusive to PostgreSQL and required if `RoleMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Roles Role, which is exclusive to PostgreSQL and required if `RoleMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RoleItem [] getRoles() {
        return this.Roles;
    }

    /**
     * Set Role, which is exclusive to PostgreSQL and required if `RoleMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Roles Role, which is exclusive to PostgreSQL and required if `RoleMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoles(RoleItem [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FunctionMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FunctionMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcedureMode Sync mode. Valid values: `partial`, `all`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get This parameter is required if `FunctionMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Functions This parameter is required if `FunctionMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set This parameter is required if `FunctionMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Functions This parameter is required if `FunctionMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get This parameter is required if `ProcedureMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Procedures This parameter is required if `ProcedureMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set This parameter is required if `ProcedureMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Procedures This parameter is required if `ProcedureMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get This parameter is required if `EventMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Events This parameter is required if `EventMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set This parameter is required if `EventMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Events This parameter is required if `EventMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
    }

    /**
     * Get This parameter is required if `TriggerMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Triggers This parameter is required if `TriggerMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set This parameter is required if `TriggerMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Triggers This parameter is required if `TriggerMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggers(String [] Triggers) {
        this.Triggers = Triggers;
    }

    public DBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBItem(DBItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.NewDbName != null) {
            this.NewDbName = new String(source.NewDbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.NewSchemaName != null) {
            this.NewSchemaName = new String(source.NewSchemaName);
        }
        if (source.DBMode != null) {
            this.DBMode = new String(source.DBMode);
        }
        if (source.SchemaMode != null) {
            this.SchemaMode = new String(source.SchemaMode);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new TableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new TableItem(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new ViewItem[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new ViewItem(source.Views[i]);
            }
        }
        if (source.RoleMode != null) {
            this.RoleMode = new String(source.RoleMode);
        }
        if (source.Roles != null) {
            this.Roles = new RoleItem[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleItem(source.Roles[i]);
            }
        }
        if (source.FunctionMode != null) {
            this.FunctionMode = new String(source.FunctionMode);
        }
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.EventMode != null) {
            this.EventMode = new String(source.EventMode);
        }
        if (source.ProcedureMode != null) {
            this.ProcedureMode = new String(source.ProcedureMode);
        }
        if (source.Functions != null) {
            this.Functions = new String[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new String(source.Functions[i]);
            }
        }
        if (source.Procedures != null) {
            this.Procedures = new String[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new String(source.Procedures[i]);
            }
        }
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
            }
        }
        if (source.Triggers != null) {
            this.Triggers = new String[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new String(source.Triggers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "NewDbName", this.NewDbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "NewSchemaName", this.NewSchemaName);
        this.setParamSimple(map, prefix + "DBMode", this.DBMode);
        this.setParamSimple(map, prefix + "SchemaMode", this.SchemaMode);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "RoleMode", this.RoleMode);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamSimple(map, prefix + "EventMode", this.EventMode);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);
        this.setParamArraySimple(map, prefix + "Events.", this.Events);
        this.setParamArraySimple(map, prefix + "Triggers.", this.Triggers);

    }
}

