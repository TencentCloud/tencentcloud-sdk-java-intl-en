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

public class DescribeAccountPrivilegesRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Describes the permissions owned by this account for a database object. the account name can be obtained through the [DescribeAccounts](https://www.tencentcloud.com/document/product/409/18109?lang=en) api.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Specifies the database object information to query.
    */
    @SerializedName("DatabaseObjectSet")
    @Expose
    private DatabaseObject [] DatabaseObjectSet;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Describes the permissions owned by this account for a database object. the account name can be obtained through the [DescribeAccounts](https://www.tencentcloud.com/document/product/409/18109?lang=en) api. 
     * @return UserName Describes the permissions owned by this account for a database object. the account name can be obtained through the [DescribeAccounts](https://www.tencentcloud.com/document/product/409/18109?lang=en) api.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Describes the permissions owned by this account for a database object. the account name can be obtained through the [DescribeAccounts](https://www.tencentcloud.com/document/product/409/18109?lang=en) api.
     * @param UserName Describes the permissions owned by this account for a database object. the account name can be obtained through the [DescribeAccounts](https://www.tencentcloud.com/document/product/409/18109?lang=en) api.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Specifies the database object information to query. 
     * @return DatabaseObjectSet Specifies the database object information to query.
     */
    public DatabaseObject [] getDatabaseObjectSet() {
        return this.DatabaseObjectSet;
    }

    /**
     * Set Specifies the database object information to query.
     * @param DatabaseObjectSet Specifies the database object information to query.
     */
    public void setDatabaseObjectSet(DatabaseObject [] DatabaseObjectSet) {
        this.DatabaseObjectSet = DatabaseObjectSet;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DatabaseObjectSet != null) {
            this.DatabaseObjectSet = new DatabaseObject[source.DatabaseObjectSet.length];
            for (int i = 0; i < source.DatabaseObjectSet.length; i++) {
                this.DatabaseObjectSet[i] = new DatabaseObject(source.DatabaseObjectSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "DatabaseObjectSet.", this.DatabaseObjectSet);

    }
}

