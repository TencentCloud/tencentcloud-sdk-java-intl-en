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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseTableRequest extends AbstractModel {

    /**
    * Instance ID, for example: tdsql3-ow7t8lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name, obtained via the DescribeDatabases api.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name, obtained through the DescribeDatabaseObjects api.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get Instance ID, for example: tdsql3-ow7t8lmc. 
     * @return InstanceId Instance ID, for example: tdsql3-ow7t8lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, for example: tdsql3-ow7t8lmc.
     * @param InstanceId Instance ID, for example: tdsql3-ow7t8lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name, obtained via the DescribeDatabases api. 
     * @return DbName Database name, obtained via the DescribeDatabases api.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name, obtained via the DescribeDatabases api.
     * @param DbName Database name, obtained via the DescribeDatabases api.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name, obtained through the DescribeDatabaseObjects api. 
     * @return Table Table name, obtained through the DescribeDatabaseObjects api.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name, obtained through the DescribeDatabaseObjects api.
     * @param Table Table name, obtained through the DescribeDatabaseObjects api.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    public DescribeDatabaseTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseTableRequest(DescribeDatabaseTableRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

