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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel {

    /**
    * <p>Database name for migration or synchronization. This item is required when ObjectMode is Partial.</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>The name of the migrated or synchronized database is identical to that of the source database by default.</p>
    */
    @SerializedName("NewDbName")
    @Expose
    private String NewDbName;

    /**
    * <p>DB selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when Mode is Partial. Note that synchronization of advanced objects is independent of this value. If you sync entire database, it should be All here.</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>schema for migration or synchronization</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>schema name after migration or synchronization</p>
    */
    @SerializedName("NewSchemaName")
    @Expose
    private String NewSchemaName;

    /**
    * <p>schema Selection Mode, pg and sqlserver require the use of</p><p>Enumeration value:</p><ul><li>All: All objects under the current object</li><li>Partial: Partial objects</li></ul>
    */
    @SerializedName("SchemaMode")
    @Expose
    private String SchemaMode;

    /**
    * <p>Schema selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when DBMode is Partial. If you sync entire database, it should be All here.</p>
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * <p>Table diagram object set. This item needs to be filled in when TableMode is Partial.</p>
    */
    @SerializedName("Tables")
    @Expose
    private Table [] Tables;

    /**
    * <p>View selection mode: All indicates all view objects under the current object, Partial indicates partial view objects. If you sync entire database, it should be All here.</p>
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * <p>View object set. When ViewMode is Partial, this item requires filling in.</p>
    */
    @SerializedName("Views")
    @Expose
    private View [] Views;

    /**
    * <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
    */
    @SerializedName("FunctionMode")
    @Expose
    private String FunctionMode;

    /**
    * <p>This item needs to be filled in when FunctionMode value is Partial.</p>
    */
    @SerializedName("Functions")
    @Expose
    private String [] Functions;

    /**
    * <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
    */
    @SerializedName("ProcedureMode")
    @Expose
    private String ProcedureMode;

    /**
    * <p>This item needs to be filled in when the ProcedureMode value is Partial.</p>
    */
    @SerializedName("Procedures")
    @Expose
    private String [] Procedures;

    /**
    * <p>Trigger migration mode, All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. Data sync does not currently support this advanced object.</p>
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * <p>When TriggerMode is partial, specify the trigger name to migrate.</p>
    */
    @SerializedName("Triggers")
    @Expose
    private String [] Triggers;

    /**
    * <p>Event migration mode: All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. This advanced object is not currently supported for data sync.</p>
    */
    @SerializedName("EventMode")
    @Expose
    private String EventMode;

    /**
    * <p>When EventMode is partial, specify the event name to migrate.</p>
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
     * Get <p>Database name for migration or synchronization. This item is required when ObjectMode is Partial.</p> 
     * @return DbName <p>Database name for migration or synchronization. This item is required when ObjectMode is Partial.</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>Database name for migration or synchronization. This item is required when ObjectMode is Partial.</p>
     * @param DbName <p>Database name for migration or synchronization. This item is required when ObjectMode is Partial.</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>The name of the migrated or synchronized database is identical to that of the source database by default.</p> 
     * @return NewDbName <p>The name of the migrated or synchronized database is identical to that of the source database by default.</p>
     */
    public String getNewDbName() {
        return this.NewDbName;
    }

    /**
     * Set <p>The name of the migrated or synchronized database is identical to that of the source database by default.</p>
     * @param NewDbName <p>The name of the migrated or synchronized database is identical to that of the source database by default.</p>
     */
    public void setNewDbName(String NewDbName) {
        this.NewDbName = NewDbName;
    }

    /**
     * Get <p>DB selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when Mode is Partial. Note that synchronization of advanced objects is independent of this value. If you sync entire database, it should be All here.</p> 
     * @return DbMode <p>DB selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when Mode is Partial. Note that synchronization of advanced objects is independent of this value. If you sync entire database, it should be All here.</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>DB selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when Mode is Partial. Note that synchronization of advanced objects is independent of this value. If you sync entire database, it should be All here.</p>
     * @param DbMode <p>DB selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when Mode is Partial. Note that synchronization of advanced objects is independent of this value. If you sync entire database, it should be All here.</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>schema for migration or synchronization</p> 
     * @return SchemaName <p>schema for migration or synchronization</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema for migration or synchronization</p>
     * @param SchemaName <p>schema for migration or synchronization</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>schema name after migration or synchronization</p> 
     * @return NewSchemaName <p>schema name after migration or synchronization</p>
     */
    public String getNewSchemaName() {
        return this.NewSchemaName;
    }

    /**
     * Set <p>schema name after migration or synchronization</p>
     * @param NewSchemaName <p>schema name after migration or synchronization</p>
     */
    public void setNewSchemaName(String NewSchemaName) {
        this.NewSchemaName = NewSchemaName;
    }

    /**
     * Get <p>schema Selection Mode, pg and sqlserver require the use of</p><p>Enumeration value:</p><ul><li>All: All objects under the current object</li><li>Partial: Partial objects</li></ul> 
     * @return SchemaMode <p>schema Selection Mode, pg and sqlserver require the use of</p><p>Enumeration value:</p><ul><li>All: All objects under the current object</li><li>Partial: Partial objects</li></ul>
     */
    public String getSchemaMode() {
        return this.SchemaMode;
    }

    /**
     * Set <p>schema Selection Mode, pg and sqlserver require the use of</p><p>Enumeration value:</p><ul><li>All: All objects under the current object</li><li>Partial: Partial objects</li></ul>
     * @param SchemaMode <p>schema Selection Mode, pg and sqlserver require the use of</p><p>Enumeration value:</p><ul><li>All: All objects under the current object</li><li>Partial: Partial objects</li></ul>
     */
    public void setSchemaMode(String SchemaMode) {
        this.SchemaMode = SchemaMode;
    }

    /**
     * Get <p>Schema selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when DBMode is Partial. If you sync entire database, it should be All here.</p> 
     * @return TableMode <p>Schema selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when DBMode is Partial. If you sync entire database, it should be All here.</p>
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set <p>Schema selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when DBMode is Partial. If you sync entire database, it should be All here.</p>
     * @param TableMode <p>Schema selection mode: All (for all objects under the current object), Partial (partial objects). This item is required when DBMode is Partial. If you sync entire database, it should be All here.</p>
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get <p>Table diagram object set. This item needs to be filled in when TableMode is Partial.</p> 
     * @return Tables <p>Table diagram object set. This item needs to be filled in when TableMode is Partial.</p>
     */
    public Table [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>Table diagram object set. This item needs to be filled in when TableMode is Partial.</p>
     * @param Tables <p>Table diagram object set. This item needs to be filled in when TableMode is Partial.</p>
     */
    public void setTables(Table [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>View selection mode: All indicates all view objects under the current object, Partial indicates partial view objects. If you sync entire database, it should be All here.</p> 
     * @return ViewMode <p>View selection mode: All indicates all view objects under the current object, Partial indicates partial view objects. If you sync entire database, it should be All here.</p>
     */
    public String getViewMode() {
        return this.ViewMode;
    }

    /**
     * Set <p>View selection mode: All indicates all view objects under the current object, Partial indicates partial view objects. If you sync entire database, it should be All here.</p>
     * @param ViewMode <p>View selection mode: All indicates all view objects under the current object, Partial indicates partial view objects. If you sync entire database, it should be All here.</p>
     */
    public void setViewMode(String ViewMode) {
        this.ViewMode = ViewMode;
    }

    /**
     * Get <p>View object set. When ViewMode is Partial, this item requires filling in.</p> 
     * @return Views <p>View object set. When ViewMode is Partial, this item requires filling in.</p>
     */
    public View [] getViews() {
        return this.Views;
    }

    /**
     * Set <p>View object set. When ViewMode is Partial, this item requires filling in.</p>
     * @param Views <p>View object set. When ViewMode is Partial, this item requires filling in.</p>
     */
    public void setViews(View [] Views) {
        this.Views = Views;
    }

    /**
     * Get <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p> 
     * @return FunctionMode <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     */
    public String getFunctionMode() {
        return this.FunctionMode;
    }

    /**
     * Set <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     * @param FunctionMode <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     */
    public void setFunctionMode(String FunctionMode) {
        this.FunctionMode = FunctionMode;
    }

    /**
     * Get <p>This item needs to be filled in when FunctionMode value is Partial.</p> 
     * @return Functions <p>This item needs to be filled in when FunctionMode value is Partial.</p>
     */
    public String [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set <p>This item needs to be filled in when FunctionMode value is Partial.</p>
     * @param Functions <p>This item needs to be filled in when FunctionMode value is Partial.</p>
     */
    public void setFunctions(String [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p> 
     * @return ProcedureMode <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     */
    public String getProcedureMode() {
        return this.ProcedureMode;
    }

    /**
     * Set <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     * @param ProcedureMode <p>Select the sync mode. Partial means part, and All means the entire database. If you want to sync entire database, select All here.</p>
     */
    public void setProcedureMode(String ProcedureMode) {
        this.ProcedureMode = ProcedureMode;
    }

    /**
     * Get <p>This item needs to be filled in when the ProcedureMode value is Partial.</p> 
     * @return Procedures <p>This item needs to be filled in when the ProcedureMode value is Partial.</p>
     */
    public String [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set <p>This item needs to be filled in when the ProcedureMode value is Partial.</p>
     * @param Procedures <p>This item needs to be filled in when the ProcedureMode value is Partial.</p>
     */
    public void setProcedures(String [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get <p>Trigger migration mode, All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. Data sync does not currently support this advanced object.</p> 
     * @return TriggerMode <p>Trigger migration mode, All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. Data sync does not currently support this advanced object.</p>
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set <p>Trigger migration mode, All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. Data sync does not currently support this advanced object.</p>
     * @param TriggerMode <p>Trigger migration mode, All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. Data sync does not currently support this advanced object.</p>
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get <p>When TriggerMode is partial, specify the trigger name to migrate.</p> 
     * @return Triggers <p>When TriggerMode is partial, specify the trigger name to migrate.</p>
     */
    public String [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>When TriggerMode is partial, specify the trigger name to migrate.</p>
     * @param Triggers <p>When TriggerMode is partial, specify the trigger name to migrate.</p>
     */
    public void setTriggers(String [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>Event migration mode: All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. This advanced object is not currently supported for data sync.</p> 
     * @return EventMode <p>Event migration mode: All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. This advanced object is not currently supported for data sync.</p>
     */
    public String getEventMode() {
        return this.EventMode;
    }

    /**
     * Set <p>Event migration mode: All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. This advanced object is not currently supported for data sync.</p>
     * @param EventMode <p>Event migration mode: All (all objects under the current object), Partial (partial objects). If syncing the entire database, it should be All here. This advanced object is not currently supported for data sync.</p>
     */
    public void setEventMode(String EventMode) {
        this.EventMode = EventMode;
    }

    /**
     * Get <p>When EventMode is partial, specify the event name to migrate.</p> 
     * @return Events <p>When EventMode is partial, specify the event name to migrate.</p>
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>When EventMode is partial, specify the event name to migrate.</p>
     * @param Events <p>When EventMode is partial, specify the event name to migrate.</p>
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
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
        if (source.SchemaMode != null) {
            this.SchemaMode = new String(source.SchemaMode);
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
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.Triggers != null) {
            this.Triggers = new String[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new String(source.Triggers[i]);
            }
        }
        if (source.EventMode != null) {
            this.EventMode = new String(source.EventMode);
        }
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
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
        this.setParamSimple(map, prefix + "SchemaMode", this.SchemaMode);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamSimple(map, prefix + "FunctionMode", this.FunctionMode);
        this.setParamArraySimple(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "ProcedureMode", this.ProcedureMode);
        this.setParamArraySimple(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamArraySimple(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "EventMode", this.EventMode);
        this.setParamArraySimple(map, prefix + "Events.", this.Events);

    }
}

