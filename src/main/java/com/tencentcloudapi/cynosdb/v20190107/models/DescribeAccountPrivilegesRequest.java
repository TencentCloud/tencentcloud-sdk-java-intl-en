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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Account name
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Database name. If it is `*`, Type/TableName are ignored, which means querying the user's global permission. If not passed, it defaults to `*`.
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Specific object types under the designated database. Options: "table", "*". Defaults to * if not specified. TableName must be specified when Type is table.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * When Type is "table", it is used to specify the table name. Required when Type is "table".
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Account name 
     * @return AccountName Account name
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name
     * @param AccountName Account name
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Host 
     * @return Host Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host
     * @param Host Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Database name. If it is `*`, Type/TableName are ignored, which means querying the user's global permission. If not passed, it defaults to `*`. 
     * @return Db Database name. If it is `*`, Type/TableName are ignored, which means querying the user's global permission. If not passed, it defaults to `*`.
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Database name. If it is `*`, Type/TableName are ignored, which means querying the user's global permission. If not passed, it defaults to `*`.
     * @param Db Database name. If it is `*`, Type/TableName are ignored, which means querying the user's global permission. If not passed, it defaults to `*`.
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Specific object types under the designated database. Options: "table", "*". Defaults to * if not specified. TableName must be specified when Type is table. 
     * @return Type Specific object types under the designated database. Options: "table", "*". Defaults to * if not specified. TableName must be specified when Type is table.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specific object types under the designated database. Options: "table", "*". Defaults to * if not specified. TableName must be specified when Type is table.
     * @param Type Specific object types under the designated database. Options: "table", "*". Defaults to * if not specified. TableName must be specified when Type is table.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get When Type is "table", it is used to specify the table name. Required when Type is "table". 
     * @return TableName When Type is "table", it is used to specify the table name. Required when Type is "table".
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set When Type is "table", it is used to specify the table name. Required when Type is "table".
     * @param TableName When Type is "table", it is used to specify the table name. Required when Type is "table".
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

