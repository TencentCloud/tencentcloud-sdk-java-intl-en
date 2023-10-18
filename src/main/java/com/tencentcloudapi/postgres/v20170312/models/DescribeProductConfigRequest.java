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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductConfigRequest extends AbstractModel {

    /**
    * AZ name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
Default value: `postgresql`
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
     * Get AZ name 
     * @return Zone AZ name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name
     * @param Zone AZ name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
Default value: `postgresql` 
     * @return DBEngine Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
Default value: `postgresql`
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
Default value: `postgresql`
     * @param DBEngine Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
Default value: `postgresql`
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    public DescribeProductConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductConfigRequest(DescribeProductConfigRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);

    }
}

