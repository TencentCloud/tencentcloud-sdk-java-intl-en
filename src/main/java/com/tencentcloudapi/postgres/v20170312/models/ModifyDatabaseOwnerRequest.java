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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatabaseOwnerRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Database name. obtain through the api [DescribeDatabases](https://www.tencentcloud.com/document/api/409/43353?from_cn_redirect=1).
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * New owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Database name. obtain through the api [DescribeDatabases](https://www.tencentcloud.com/document/api/409/43353?from_cn_redirect=1). 
     * @return DatabaseName Database name. obtain through the api [DescribeDatabases](https://www.tencentcloud.com/document/api/409/43353?from_cn_redirect=1).
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name. obtain through the api [DescribeDatabases](https://www.tencentcloud.com/document/api/409/43353?from_cn_redirect=1).
     * @param DatabaseName Database name. obtain through the api [DescribeDatabases](https://www.tencentcloud.com/document/api/409/43353?from_cn_redirect=1).
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get New owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1). 
     * @return DatabaseOwner New owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set New owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     * @param DatabaseOwner New owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    public ModifyDatabaseOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatabaseOwnerRequest(ModifyDatabaseOwnerRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseOwner != null) {
            this.DatabaseOwner = new String(source.DatabaseOwner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseOwner", this.DatabaseOwner);

    }
}

