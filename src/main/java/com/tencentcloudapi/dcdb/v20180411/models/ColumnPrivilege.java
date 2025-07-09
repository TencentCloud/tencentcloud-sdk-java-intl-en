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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnPrivilege extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Column name
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * Permission information
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

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
     * Get Table name 
     * @return Table Table name
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
     * @param Table Table name
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Column name 
     * @return Column Column name
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set Column name
     * @param Column Column name
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get Permission information 
     * @return Privileges Permission information
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission information
     * @param Privileges Permission information
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ColumnPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnPrivilege(ColumnPrivilege source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

