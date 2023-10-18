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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseTableRequest extends AbstractModel {

    /**
    * Instance ID in the format of `dcdbt-ow7t8lmc`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name, which can be obtained through the `DescribeDatabases` API.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name, which can be obtained through the `DescribeDatabaseObjects` API.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get Instance ID in the format of `dcdbt-ow7t8lmc`. 
     * @return InstanceId Instance ID in the format of `dcdbt-ow7t8lmc`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `dcdbt-ow7t8lmc`.
     * @param InstanceId Instance ID in the format of `dcdbt-ow7t8lmc`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name, which can be obtained through the `DescribeDatabases` API. 
     * @return DbName Database name, which can be obtained through the `DescribeDatabases` API.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name, which can be obtained through the `DescribeDatabases` API.
     * @param DbName Database name, which can be obtained through the `DescribeDatabases` API.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name, which can be obtained through the `DescribeDatabaseObjects` API. 
     * @return Table Table name, which can be obtained through the `DescribeDatabaseObjects` API.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name, which can be obtained through the `DescribeDatabaseObjects` API.
     * @param Table Table name, which can be obtained through the `DescribeDatabaseObjects` API.
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

