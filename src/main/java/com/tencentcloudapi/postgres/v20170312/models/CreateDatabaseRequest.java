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

public class CreateDatabaseRequest extends AbstractModel {

    /**
    * Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Specifies the user-created database name.
Name specification: consists of letters (a-z, a-z), digits (0-9), and underscores (_), starting with a letter or underscore (_), up to 63 characters. system reserved keywords cannot be used, and 'postgres' is not allowed.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
    * Specifies the character encoding of the database.
Supported character sets include UTF8, LATIN1, LATIN2, WIN1250, WIN1251, WIN1252, KOI8R, EUC_JP, and EUC_KR.
Default value: UTF8.
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * Specifies the database sorting rule.
    */
    @SerializedName("Collate")
    @Expose
    private String Collate;

    /**
    * Specifies the character category of the database.
    */
    @SerializedName("Ctype")
    @Expose
    private String Ctype;

    /**
     * Get Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Specifies the user-created database name.
Name specification: consists of letters (a-z, a-z), digits (0-9), and underscores (_), starting with a letter or underscore (_), up to 63 characters. system reserved keywords cannot be used, and 'postgres' is not allowed. 
     * @return DatabaseName Specifies the user-created database name.
Name specification: consists of letters (a-z, a-z), digits (0-9), and underscores (_), starting with a letter or underscore (_), up to 63 characters. system reserved keywords cannot be used, and 'postgres' is not allowed.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Specifies the user-created database name.
Name specification: consists of letters (a-z, a-z), digits (0-9), and underscores (_), starting with a letter or underscore (_), up to 63 characters. system reserved keywords cannot be used, and 'postgres' is not allowed.
     * @param DatabaseName Specifies the user-created database name.
Name specification: consists of letters (a-z, a-z), digits (0-9), and underscores (_), starting with a letter or underscore (_), up to 63 characters. system reserved keywords cannot be used, and 'postgres' is not allowed.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1). 
     * @return DatabaseOwner Owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set Owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     * @param DatabaseOwner Owner of the database. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    /**
     * Get Specifies the character encoding of the database.
Supported character sets include UTF8, LATIN1, LATIN2, WIN1250, WIN1251, WIN1252, KOI8R, EUC_JP, and EUC_KR.
Default value: UTF8. 
     * @return Encoding Specifies the character encoding of the database.
Supported character sets include UTF8, LATIN1, LATIN2, WIN1250, WIN1251, WIN1252, KOI8R, EUC_JP, and EUC_KR.
Default value: UTF8.
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Specifies the character encoding of the database.
Supported character sets include UTF8, LATIN1, LATIN2, WIN1250, WIN1251, WIN1252, KOI8R, EUC_JP, and EUC_KR.
Default value: UTF8.
     * @param Encoding Specifies the character encoding of the database.
Supported character sets include UTF8, LATIN1, LATIN2, WIN1250, WIN1251, WIN1252, KOI8R, EUC_JP, and EUC_KR.
Default value: UTF8.
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get Specifies the database sorting rule. 
     * @return Collate Specifies the database sorting rule.
     */
    public String getCollate() {
        return this.Collate;
    }

    /**
     * Set Specifies the database sorting rule.
     * @param Collate Specifies the database sorting rule.
     */
    public void setCollate(String Collate) {
        this.Collate = Collate;
    }

    /**
     * Get Specifies the character category of the database. 
     * @return Ctype Specifies the character category of the database.
     */
    public String getCtype() {
        return this.Ctype;
    }

    /**
     * Set Specifies the character category of the database.
     * @param Ctype Specifies the character category of the database.
     */
    public void setCtype(String Ctype) {
        this.Ctype = Ctype;
    }

    public CreateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseRequest(CreateDatabaseRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseOwner != null) {
            this.DatabaseOwner = new String(source.DatabaseOwner);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Collate != null) {
            this.Collate = new String(source.Collate);
        }
        if (source.Ctype != null) {
            this.Ctype = new String(source.Ctype);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseOwner", this.DatabaseOwner);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Collate", this.Collate);
        this.setParamSimple(map, prefix + "Ctype", this.Ctype);

    }
}

