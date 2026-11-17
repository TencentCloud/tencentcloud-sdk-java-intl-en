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

public class DBOpFilter extends AbstractModel {

    /**
    * Database name for rule effectiveness
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Database-level DDL/DML Filter Rule
    */
    @SerializedName("OpFilter")
    @Expose
    private OpFilter OpFilter;

    /**
    * Table-level DDL/DML filtering information
    */
    @SerializedName("Tables")
    @Expose
    private TableFilter [] Tables;

    /**
    * View-level DDL/DML filtering information
    */
    @SerializedName("Views")
    @Expose
    private ViewFilter [] Views;

    /**
     * Get Database name for rule effectiveness 
     * @return DbName Database name for rule effectiveness
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name for rule effectiveness
     * @param DbName Database name for rule effectiveness
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Database-level DDL/DML Filter Rule 
     * @return OpFilter Database-level DDL/DML Filter Rule
     */
    public OpFilter getOpFilter() {
        return this.OpFilter;
    }

    /**
     * Set Database-level DDL/DML Filter Rule
     * @param OpFilter Database-level DDL/DML Filter Rule
     */
    public void setOpFilter(OpFilter OpFilter) {
        this.OpFilter = OpFilter;
    }

    /**
     * Get Table-level DDL/DML filtering information 
     * @return Tables Table-level DDL/DML filtering information
     */
    public TableFilter [] getTables() {
        return this.Tables;
    }

    /**
     * Set Table-level DDL/DML filtering information
     * @param Tables Table-level DDL/DML filtering information
     */
    public void setTables(TableFilter [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get View-level DDL/DML filtering information 
     * @return Views View-level DDL/DML filtering information
     */
    public ViewFilter [] getViews() {
        return this.Views;
    }

    /**
     * Set View-level DDL/DML filtering information
     * @param Views View-level DDL/DML filtering information
     */
    public void setViews(ViewFilter [] Views) {
        this.Views = Views;
    }

    public DBOpFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBOpFilter(DBOpFilter source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.OpFilter != null) {
            this.OpFilter = new OpFilter(source.OpFilter);
        }
        if (source.Tables != null) {
            this.Tables = new TableFilter[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new TableFilter(source.Tables[i]);
            }
        }
        if (source.Views != null) {
            this.Views = new ViewFilter[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new ViewFilter(source.Views[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamObj(map, prefix + "OpFilter.", this.OpFilter);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);

    }
}

