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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClusterTablesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Data table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Data table type. Valid values:
`view`: Only return to view,
`base_table`: Only return to basic table,
`all`: Return to view and table.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Data table name 
     * @return Table Data table name
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Data table name
     * @param Table Data table name
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Data table type. Valid values:
`view`: Only return to view,
`base_table`: Only return to basic table,
`all`: Return to view and table. 
     * @return TableType Data table type. Valid values:
`view`: Only return to view,
`base_table`: Only return to basic table,
`all`: Return to view and table.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Data table type. Valid values:
`view`: Only return to view,
`base_table`: Only return to basic table,
`all`: Return to view and table.
     * @param TableType Data table type. Valid values:
`view`: Only return to view,
`base_table`: Only return to basic table,
`all`: Return to view and table.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    public SearchClusterTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchClusterTablesRequest(SearchClusterTablesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

