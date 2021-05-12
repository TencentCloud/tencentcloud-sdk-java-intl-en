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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTables extends AbstractModel{

    /**
    * Database name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private RollbackTableName [] Table;

    /**
     * Get Database name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Database Database name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Database Database name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Table Table details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RollbackTableName [] getTable() {
        return this.Table;
    }

    /**
     * Set Table details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Table Table details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(RollbackTableName [] Table) {
        this.Table = Table;
    }

    public RollbackTables() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTables(RollbackTables source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new RollbackTableName[source.Table.length];
            for (int i = 0; i < source.Table.length; i++) {
                this.Table[i] = new RollbackTableName(source.Table[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Table.", this.Table);

    }
}

