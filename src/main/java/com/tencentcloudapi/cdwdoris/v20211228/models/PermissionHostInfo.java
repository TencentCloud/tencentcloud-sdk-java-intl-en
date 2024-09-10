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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionHostInfo extends AbstractModel {

    /**
    * A list of user permissions in the global scope, which can be applied to all databases and tables.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GlobalPermissions")
    @Expose
    private String [] GlobalPermissions;

    /**
    * The key is the database name, and the value is the permission list of the user on the database.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabasePermissions")
    @Expose
    private DatabasePermissions [] DatabasePermissions;

    /**
    * The key is the full name of the table, and the value is the permission list of the user on the table.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TablePermissions")
    @Expose
    private TablePermissions [] TablePermissions;

    /**
    * The key is the full name of the catalog, and the value is the permission list of the user on the catalog.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CatalogPermissions")
    @Expose
    private CatalogPermission [] CatalogPermissions;

    /**
     * Get A list of user permissions in the global scope, which can be applied to all databases and tables.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GlobalPermissions A list of user permissions in the global scope, which can be applied to all databases and tables.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getGlobalPermissions() {
        return this.GlobalPermissions;
    }

    /**
     * Set A list of user permissions in the global scope, which can be applied to all databases and tables.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param GlobalPermissions A list of user permissions in the global scope, which can be applied to all databases and tables.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGlobalPermissions(String [] GlobalPermissions) {
        this.GlobalPermissions = GlobalPermissions;
    }

    /**
     * Get The key is the database name, and the value is the permission list of the user on the database.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabasePermissions The key is the database name, and the value is the permission list of the user on the database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DatabasePermissions [] getDatabasePermissions() {
        return this.DatabasePermissions;
    }

    /**
     * Set The key is the database name, and the value is the permission list of the user on the database.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabasePermissions The key is the database name, and the value is the permission list of the user on the database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabasePermissions(DatabasePermissions [] DatabasePermissions) {
        this.DatabasePermissions = DatabasePermissions;
    }

    /**
     * Get The key is the full name of the table, and the value is the permission list of the user on the table.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TablePermissions The key is the full name of the table, and the value is the permission list of the user on the table.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TablePermissions [] getTablePermissions() {
        return this.TablePermissions;
    }

    /**
     * Set The key is the full name of the table, and the value is the permission list of the user on the table.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TablePermissions The key is the full name of the table, and the value is the permission list of the user on the table.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTablePermissions(TablePermissions [] TablePermissions) {
        this.TablePermissions = TablePermissions;
    }

    /**
     * Get The key is the full name of the catalog, and the value is the permission list of the user on the catalog.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CatalogPermissions The key is the full name of the catalog, and the value is the permission list of the user on the catalog.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CatalogPermission [] getCatalogPermissions() {
        return this.CatalogPermissions;
    }

    /**
     * Set The key is the full name of the catalog, and the value is the permission list of the user on the catalog.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CatalogPermissions The key is the full name of the catalog, and the value is the permission list of the user on the catalog.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalogPermissions(CatalogPermission [] CatalogPermissions) {
        this.CatalogPermissions = CatalogPermissions;
    }

    public PermissionHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionHostInfo(PermissionHostInfo source) {
        if (source.GlobalPermissions != null) {
            this.GlobalPermissions = new String[source.GlobalPermissions.length];
            for (int i = 0; i < source.GlobalPermissions.length; i++) {
                this.GlobalPermissions[i] = new String(source.GlobalPermissions[i]);
            }
        }
        if (source.DatabasePermissions != null) {
            this.DatabasePermissions = new DatabasePermissions[source.DatabasePermissions.length];
            for (int i = 0; i < source.DatabasePermissions.length; i++) {
                this.DatabasePermissions[i] = new DatabasePermissions(source.DatabasePermissions[i]);
            }
        }
        if (source.TablePermissions != null) {
            this.TablePermissions = new TablePermissions[source.TablePermissions.length];
            for (int i = 0; i < source.TablePermissions.length; i++) {
                this.TablePermissions[i] = new TablePermissions(source.TablePermissions[i]);
            }
        }
        if (source.CatalogPermissions != null) {
            this.CatalogPermissions = new CatalogPermission[source.CatalogPermissions.length];
            for (int i = 0; i < source.CatalogPermissions.length; i++) {
                this.CatalogPermissions[i] = new CatalogPermission(source.CatalogPermissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GlobalPermissions.", this.GlobalPermissions);
        this.setParamArrayObj(map, prefix + "DatabasePermissions.", this.DatabasePermissions);
        this.setParamArrayObj(map, prefix + "TablePermissions.", this.TablePermissions);
        this.setParamArrayObj(map, prefix + "CatalogPermissions.", this.CatalogPermissions);

    }
}

