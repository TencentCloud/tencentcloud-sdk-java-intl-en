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

public class CompareObjectItem extends AbstractModel{

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Database selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Schema name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableMode")
    @Expose
    private String TableMode;

    /**
    * Table configuration for data consistency check, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tables")
    @Expose
    private CompareTableItem [] Tables;

    /**
    * View selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewMode")
    @Expose
    private String ViewMode;

    /**
    * View configuration for data consistency check, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Views")
    @Expose
    private CompareViewItem [] Views;

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Database selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbMode Database selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbMode Database selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Schema name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchemaName Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchemaName Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableMode Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableMode() {
        return this.TableMode;
    }

    /**
     * Set Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableMode Schema selection mode. Valid values: `all`, `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableMode(String TableMode) {
        this.TableMode = TableMode;
    }

    /**
     * Get Table configuration for data consistency check, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tables Table configuration for data consistency check, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareTableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set Table configuration for data consistency check, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tables Table configuration for data consistency check, which is required if `TableMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTables(CompareTableItem [] Tables) {
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
     * Get View configuration for data consistency check, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Views View configuration for data consistency check, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareViewItem [] getViews() {
        return this.Views;
    }

    /**
     * Set View configuration for data consistency check, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Views View configuration for data consistency check, which is required if `ViewMode` is `partial`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setViews(CompareViewItem [] Views) {
        this.Views = Views;
    }

    public CompareObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareObjectItem(CompareObjectItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableMode != null) {
            this.TableMode = new String(source.TableMode);
        }
        if (source.Tables != null) {
            this.Tables = new CompareTableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new CompareTableItem(source.Tables[i]);
            }
        }
        if (source.ViewMode != null) {
            this.ViewMode = new String(source.ViewMode);
        }
        if (source.Views != null) {
            this.Views = new CompareViewItem[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new CompareViewItem(source.Views[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableMode", this.TableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamSimple(map, prefix + "ViewMode", this.ViewMode);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);

    }
}

