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

public class TableItem extends AbstractModel{

    /**
    * Name of the table to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Name of the table after migration, which is required if `TableEditMode` is `rename`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * Temp table to be migrated, which is required if `TableEditMode` is `pt`. To sync temp tables that may be generated during migration by tools such as pt-online-schema-change, you can use this parameter to configure the temp table names.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TmpTables")
    @Expose
    private String [] TmpTables;

    /**
    * Table editing type. Valid values: `rename` (table mapping); `pt` (additional table sync).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableEditMode")
    @Expose
    private String TableEditMode;

    /**
     * Get Name of the table to be migrated
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Name of the table to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Name of the table to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Name of the table to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Name of the table after migration, which is required if `TableEditMode` is `rename`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewTableName Name of the table after migration, which is required if `TableEditMode` is `rename`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set Name of the table after migration, which is required if `TableEditMode` is `rename`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewTableName Name of the table after migration, which is required if `TableEditMode` is `rename`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get Temp table to be migrated, which is required if `TableEditMode` is `pt`. To sync temp tables that may be generated during migration by tools such as pt-online-schema-change, you can use this parameter to configure the temp table names.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TmpTables Temp table to be migrated, which is required if `TableEditMode` is `pt`. To sync temp tables that may be generated during migration by tools such as pt-online-schema-change, you can use this parameter to configure the temp table names.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTmpTables() {
        return this.TmpTables;
    }

    /**
     * Set Temp table to be migrated, which is required if `TableEditMode` is `pt`. To sync temp tables that may be generated during migration by tools such as pt-online-schema-change, you can use this parameter to configure the temp table names.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TmpTables Temp table to be migrated, which is required if `TableEditMode` is `pt`. To sync temp tables that may be generated during migration by tools such as pt-online-schema-change, you can use this parameter to configure the temp table names.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTmpTables(String [] TmpTables) {
        this.TmpTables = TmpTables;
    }

    /**
     * Get Table editing type. Valid values: `rename` (table mapping); `pt` (additional table sync).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableEditMode Table editing type. Valid values: `rename` (table mapping); `pt` (additional table sync).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableEditMode() {
        return this.TableEditMode;
    }

    /**
     * Set Table editing type. Valid values: `rename` (table mapping); `pt` (additional table sync).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableEditMode Table editing type. Valid values: `rename` (table mapping); `pt` (additional table sync).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableEditMode(String TableEditMode) {
        this.TableEditMode = TableEditMode;
    }

    public TableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableItem(TableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.TmpTables != null) {
            this.TmpTables = new String[source.TmpTables.length];
            for (int i = 0; i < source.TmpTables.length; i++) {
                this.TmpTables[i] = new String(source.TmpTables[i]);
            }
        }
        if (source.TableEditMode != null) {
            this.TableEditMode = new String(source.TableEditMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamArraySimple(map, prefix + "TmpTables.", this.TmpTables);
        this.setParamSimple(map, prefix + "TableEditMode", this.TableEditMode);

    }
}

