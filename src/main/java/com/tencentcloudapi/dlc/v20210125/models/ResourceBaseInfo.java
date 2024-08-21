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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceBaseInfo extends AbstractModel {

    /**
    * Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Schema name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * View name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Function name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
     * Get Catalog name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Schema name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Schema Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Schema Schema name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get Table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get View name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return View View name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set View name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param View View name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Function name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Function Function name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set Function name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Function Function name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    public ResourceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceBaseInfo(ResourceBaseInfo source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Function", this.Function);

    }
}

