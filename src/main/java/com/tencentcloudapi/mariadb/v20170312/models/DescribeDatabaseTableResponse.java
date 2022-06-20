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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseTableResponse extends AbstractModel{

    /**
    * Instance name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Column information.
    */
    @SerializedName("Cols")
    @Expose
    private TableColumn [] Cols;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance name. 
     * @return InstanceId Instance name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name.
     * @param InstanceId Instance name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name. 
     * @return DbName Database name.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name.
     * @param DbName Database name.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name. 
     * @return Table Table name.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name.
     * @param Table Table name.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Column information. 
     * @return Cols Column information.
     */
    public TableColumn [] getCols() {
        return this.Cols;
    }

    /**
     * Set Column information.
     * @param Cols Column information.
     */
    public void setCols(TableColumn [] Cols) {
        this.Cols = Cols;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDatabaseTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseTableResponse(DescribeDatabaseTableResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Cols != null) {
            this.Cols = new TableColumn[source.Cols.length];
            for (int i = 0; i < source.Cols.length; i++) {
                this.Cols[i] = new TableColumn(source.Cols[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArrayObj(map, prefix + "Cols.", this.Cols);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

