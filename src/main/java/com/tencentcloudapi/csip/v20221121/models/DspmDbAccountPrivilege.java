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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmDbAccountPrivilege extends AbstractModel {

    /**
    * Use the default permission. 0: inactive; 1: read-only permission, that is, SELECT permission; 2: all permissions, that is, all permissions at the global level.
    */
    @SerializedName("UseDefaultPrivilege")
    @Expose
    private Long UseDefaultPrivilege;

    /**
    * Global permission array.
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Database permission array.
    */
    @SerializedName("DatabasePrivilegesList")
    @Expose
    private DspmDatabasePrivilege [] DatabasePrivilegesList;

    /**
    * Array of table permissions in the database.
    */
    @SerializedName("TablePrivileges")
    @Expose
    private DspmTablePrivilege [] TablePrivileges;

    /**
    * Column permission array in the database table.
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private DspmColumnPrivilege [] ColumnPrivileges;

    /**
     * Get Use the default permission. 0: inactive; 1: read-only permission, that is, SELECT permission; 2: all permissions, that is, all permissions at the global level. 
     * @return UseDefaultPrivilege Use the default permission. 0: inactive; 1: read-only permission, that is, SELECT permission; 2: all permissions, that is, all permissions at the global level.
     */
    public Long getUseDefaultPrivilege() {
        return this.UseDefaultPrivilege;
    }

    /**
     * Set Use the default permission. 0: inactive; 1: read-only permission, that is, SELECT permission; 2: all permissions, that is, all permissions at the global level.
     * @param UseDefaultPrivilege Use the default permission. 0: inactive; 1: read-only permission, that is, SELECT permission; 2: all permissions, that is, all permissions at the global level.
     */
    public void setUseDefaultPrivilege(Long UseDefaultPrivilege) {
        this.UseDefaultPrivilege = UseDefaultPrivilege;
    }

    /**
     * Get Global permission array. 
     * @return GlobalPrivileges Global permission array.
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set Global permission array.
     * @param GlobalPrivileges Global permission array.
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Database permission array. 
     * @return DatabasePrivilegesList Database permission array.
     */
    public DspmDatabasePrivilege [] getDatabasePrivilegesList() {
        return this.DatabasePrivilegesList;
    }

    /**
     * Set Database permission array.
     * @param DatabasePrivilegesList Database permission array.
     */
    public void setDatabasePrivilegesList(DspmDatabasePrivilege [] DatabasePrivilegesList) {
        this.DatabasePrivilegesList = DatabasePrivilegesList;
    }

    /**
     * Get Array of table permissions in the database. 
     * @return TablePrivileges Array of table permissions in the database.
     */
    public DspmTablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Array of table permissions in the database.
     * @param TablePrivileges Array of table permissions in the database.
     */
    public void setTablePrivileges(DspmTablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get Column permission array in the database table. 
     * @return ColumnPrivileges Column permission array in the database table.
     */
    public DspmColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set Column permission array in the database table.
     * @param ColumnPrivileges Column permission array in the database table.
     */
    public void setColumnPrivileges(DspmColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    public DspmDbAccountPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmDbAccountPrivilege(DspmDbAccountPrivilege source) {
        if (source.UseDefaultPrivilege != null) {
            this.UseDefaultPrivilege = new Long(source.UseDefaultPrivilege);
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivilegesList != null) {
            this.DatabasePrivilegesList = new DspmDatabasePrivilege[source.DatabasePrivilegesList.length];
            for (int i = 0; i < source.DatabasePrivilegesList.length; i++) {
                this.DatabasePrivilegesList[i] = new DspmDatabasePrivilege(source.DatabasePrivilegesList[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new DspmTablePrivilege[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new DspmTablePrivilege(source.TablePrivileges[i]);
            }
        }
        if (source.ColumnPrivileges != null) {
            this.ColumnPrivileges = new DspmColumnPrivilege[source.ColumnPrivileges.length];
            for (int i = 0; i < source.ColumnPrivileges.length; i++) {
                this.ColumnPrivileges[i] = new DspmColumnPrivilege(source.ColumnPrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseDefaultPrivilege", this.UseDefaultPrivilege);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivilegesList.", this.DatabasePrivilegesList);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamArrayObj(map, prefix + "ColumnPrivileges.", this.ColumnPrivileges);

    }
}

