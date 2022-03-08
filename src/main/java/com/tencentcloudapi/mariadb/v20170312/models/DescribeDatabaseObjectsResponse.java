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

public class DescribeDatabaseObjectsResponse extends AbstractModel{

    /**
    * Passed through from the input parameters.
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
    * List of tables.
    */
    @SerializedName("Tables")
    @Expose
    private DatabaseTable [] Tables;

    /**
    * List of views.
    */
    @SerializedName("Views")
    @Expose
    private DatabaseView [] Views;

    /**
    * List of stored procedures.
    */
    @SerializedName("Procs")
    @Expose
    private DatabaseProcedure [] Procs;

    /**
    * List of functions.
    */
    @SerializedName("Funcs")
    @Expose
    private DatabaseFunction [] Funcs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Passed through from the input parameters. 
     * @return InstanceId Passed through from the input parameters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Passed through from the input parameters.
     * @param InstanceId Passed through from the input parameters.
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
     * Get List of tables. 
     * @return Tables List of tables.
     */
    public DatabaseTable [] getTables() {
        return this.Tables;
    }

    /**
     * Set List of tables.
     * @param Tables List of tables.
     */
    public void setTables(DatabaseTable [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get List of views. 
     * @return Views List of views.
     */
    public DatabaseView [] getViews() {
        return this.Views;
    }

    /**
     * Set List of views.
     * @param Views List of views.
     */
    public void setViews(DatabaseView [] Views) {
        this.Views = Views;
    }

    /**
     * Get List of stored procedures. 
     * @return Procs List of stored procedures.
     */
    public DatabaseProcedure [] getProcs() {
        return this.Procs;
    }

    /**
     * Set List of stored procedures.
     * @param Procs List of stored procedures.
     */
    public void setProcs(DatabaseProcedure [] Procs) {
        this.Procs = Procs;
    }

    /**
     * Get List of functions. 
     * @return Funcs List of functions.
     */
    public DatabaseFunction [] getFuncs() {
        return this.Funcs;
    }

    /**
     * Set List of functions.
     * @param Funcs List of functions.
     */
    public void setFuncs(DatabaseFunction [] Funcs) {
        this.Funcs = Funcs;
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

    public DescribeDatabaseObjectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectsResponse(DescribeDatabaseObjectsResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Tables != null) {
            this.Tables = new DatabaseTable[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new DatabaseTable(source.Tables[i]);
            }
        }
        if (source.Views != null) {
            this.Views = new DatabaseView[source.Views.length];
            for (int i = 0; i < source.Views.length; i++) {
                this.Views[i] = new DatabaseView(source.Views[i]);
            }
        }
        if (source.Procs != null) {
            this.Procs = new DatabaseProcedure[source.Procs.length];
            for (int i = 0; i < source.Procs.length; i++) {
                this.Procs[i] = new DatabaseProcedure(source.Procs[i]);
            }
        }
        if (source.Funcs != null) {
            this.Funcs = new DatabaseFunction[source.Funcs.length];
            for (int i = 0; i < source.Funcs.length; i++) {
                this.Funcs[i] = new DatabaseFunction(source.Funcs[i]);
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
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamArrayObj(map, prefix + "Procs.", this.Procs);
        this.setParamArrayObj(map, prefix + "Funcs.", this.Funcs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

