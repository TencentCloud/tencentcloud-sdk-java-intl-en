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

public class TableField extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * Database view name.
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * Table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Database field name.
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Sensitive field information.
    */
    @SerializedName("Sensitive")
    @Expose
    private SensitiveDetail Sensitive;

    /**
     * Get Database name 
     * @return DB Database name
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set Database name
     * @param DB Database name
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get Database view name. 
     * @return Schema Database view name.
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Database view name.
     * @param Schema Database view name.
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
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
     * Get Database field name. 
     * @return Field Database field name.
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Database field name.
     * @param Field Database field name.
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Sensitive field information. 
     * @return Sensitive Sensitive field information.
     */
    public SensitiveDetail getSensitive() {
        return this.Sensitive;
    }

    /**
     * Set Sensitive field information.
     * @param Sensitive Sensitive field information.
     */
    public void setSensitive(SensitiveDetail Sensitive) {
        this.Sensitive = Sensitive;
    }

    public TableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableField(TableField source) {
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Sensitive != null) {
            this.Sensitive = new SensitiveDetail(source.Sensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamObj(map, prefix + "Sensitive.", this.Sensitive);

    }
}

