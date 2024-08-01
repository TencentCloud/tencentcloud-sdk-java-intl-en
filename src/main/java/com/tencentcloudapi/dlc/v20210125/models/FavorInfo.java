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

public class FavorInfo extends AbstractModel {

    /**
    * Prioritized items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * DataBase name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataBase")
    @Expose
    private String DataBase;

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get Prioritized items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Priority Prioritized items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Prioritized items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Priority Prioritized items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

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
     * Get DataBase name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataBase DataBase name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataBase() {
        return this.DataBase;
    }

    /**
     * Set DataBase name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataBase DataBase name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
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

    public FavorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FavorInfo(FavorInfo source) {
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.DataBase != null) {
            this.DataBase = new String(source.DataBase);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "DataBase", this.DataBase);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

