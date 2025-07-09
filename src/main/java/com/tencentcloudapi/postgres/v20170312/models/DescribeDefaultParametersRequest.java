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

public class DescribeDefaultParametersRequest extends AbstractModel {

    /**
    * The major database version number, such as 11, 12, 13.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Database engine, such as postgresql, mssql_compatible.
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
     * Get The major database version number, such as 11, 12, 13. 
     * @return DBMajorVersion The major database version number, such as 11, 12, 13.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major database version number, such as 11, 12, 13.
     * @param DBMajorVersion The major database version number, such as 11, 12, 13.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Database engine, such as postgresql, mssql_compatible. 
     * @return DBEngine Database engine, such as postgresql, mssql_compatible.
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engine, such as postgresql, mssql_compatible.
     * @param DBEngine Database engine, such as postgresql, mssql_compatible.
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    public DescribeDefaultParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultParametersRequest(DescribeDefaultParametersRequest source) {
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);

    }
}

