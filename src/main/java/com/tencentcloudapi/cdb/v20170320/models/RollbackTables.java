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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTables extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Database table details
    */
    @SerializedName("Table")
    @Expose
    private RollbackTableName [] Table;

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
     * Get Database table details 
     * @return Table Database table details
     */
    public RollbackTableName [] getTable() {
        return this.Table;
    }

    /**
     * Set Database table details
     * @param Table Database table details
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

