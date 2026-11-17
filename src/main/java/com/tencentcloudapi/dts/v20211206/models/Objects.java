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

public class Objects extends AbstractModel {

    /**
    * <p>Sync object type Partial (partial objects)</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Sync object, not empty when Mode is Partial</p>
    */
    @SerializedName("Databases")
    @Expose
    private Database [] Databases;

    /**
    * <p>Advanced object types, such as function and procedure. Note: If you need to migrate and synchronize advanced objects, this configuration should contain the corresponding advanced object type. When synchronization of advanced objects is required, the initialization type must contain the structure initialization type, that is, the field value of task Options.InitType must be Structure or Full.</p>
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
    * <p>This field is deprecated. For temporary table synchronization, use Objects.Databases[n].Tables[n].TmpTables to import.</p>
    */
    @SerializedName("OnlineDDL")
    @Expose
    private OnlineDDL OnlineDDL;

    /**
    * <p>Database/Table/View-level DML/DDL allowlist</p>
    */
    @SerializedName("DatabasesOpFilter")
    @Expose
    private DBOpFilter [] DatabasesOpFilter;

    /**
     * Get <p>Sync object type Partial (partial objects)</p> 
     * @return Mode <p>Sync object type Partial (partial objects)</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Sync object type Partial (partial objects)</p>
     * @param Mode <p>Sync object type Partial (partial objects)</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Sync object, not empty when Mode is Partial</p> 
     * @return Databases <p>Sync object, not empty when Mode is Partial</p>
     */
    public Database [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>Sync object, not empty when Mode is Partial</p>
     * @param Databases <p>Sync object, not empty when Mode is Partial</p>
     */
    public void setDatabases(Database [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get <p>Advanced object types, such as function and procedure. Note: If you need to migrate and synchronize advanced objects, this configuration should contain the corresponding advanced object type. When synchronization of advanced objects is required, the initialization type must contain the structure initialization type, that is, the field value of task Options.InitType must be Structure or Full.</p> 
     * @return AdvancedObjects <p>Advanced object types, such as function and procedure. Note: If you need to migrate and synchronize advanced objects, this configuration should contain the corresponding advanced object type. When synchronization of advanced objects is required, the initialization type must contain the structure initialization type, that is, the field value of task Options.InitType must be Structure or Full.</p>
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set <p>Advanced object types, such as function and procedure. Note: If you need to migrate and synchronize advanced objects, this configuration should contain the corresponding advanced object type. When synchronization of advanced objects is required, the initialization type must contain the structure initialization type, that is, the field value of task Options.InitType must be Structure or Full.</p>
     * @param AdvancedObjects <p>Advanced object types, such as function and procedure. Note: If you need to migrate and synchronize advanced objects, this configuration should contain the corresponding advanced object type. When synchronization of advanced objects is required, the initialization type must contain the structure initialization type, that is, the field value of task Options.InitType must be Structure or Full.</p>
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    /**
     * Get <p>This field is deprecated. For temporary table synchronization, use Objects.Databases[n].Tables[n].TmpTables to import.</p> 
     * @return OnlineDDL <p>This field is deprecated. For temporary table synchronization, use Objects.Databases[n].Tables[n].TmpTables to import.</p>
     */
    public OnlineDDL getOnlineDDL() {
        return this.OnlineDDL;
    }

    /**
     * Set <p>This field is deprecated. For temporary table synchronization, use Objects.Databases[n].Tables[n].TmpTables to import.</p>
     * @param OnlineDDL <p>This field is deprecated. For temporary table synchronization, use Objects.Databases[n].Tables[n].TmpTables to import.</p>
     */
    public void setOnlineDDL(OnlineDDL OnlineDDL) {
        this.OnlineDDL = OnlineDDL;
    }

    /**
     * Get <p>Database/Table/View-level DML/DDL allowlist</p> 
     * @return DatabasesOpFilter <p>Database/Table/View-level DML/DDL allowlist</p>
     */
    public DBOpFilter [] getDatabasesOpFilter() {
        return this.DatabasesOpFilter;
    }

    /**
     * Set <p>Database/Table/View-level DML/DDL allowlist</p>
     * @param DatabasesOpFilter <p>Database/Table/View-level DML/DDL allowlist</p>
     */
    public void setDatabasesOpFilter(DBOpFilter [] DatabasesOpFilter) {
        this.DatabasesOpFilter = DatabasesOpFilter;
    }

    public Objects() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Objects(Objects source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Databases != null) {
            this.Databases = new Database[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new Database(source.Databases[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
        if (source.OnlineDDL != null) {
            this.OnlineDDL = new OnlineDDL(source.OnlineDDL);
        }
        if (source.DatabasesOpFilter != null) {
            this.DatabasesOpFilter = new DBOpFilter[source.DatabasesOpFilter.length];
            for (int i = 0; i < source.DatabasesOpFilter.length; i++) {
                this.DatabasesOpFilter[i] = new DBOpFilter(source.DatabasesOpFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);
        this.setParamObj(map, prefix + "OnlineDDL.", this.OnlineDDL);
        this.setParamArrayObj(map, prefix + "DatabasesOpFilter.", this.DatabasesOpFilter);

    }
}

