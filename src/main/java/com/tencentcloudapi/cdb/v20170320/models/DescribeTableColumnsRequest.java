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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableColumnsRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. Its value is the InstanceId field in the output parameter.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name. Obtain through the [Query Database](https://www.tencentcloud.com/document/api/236/17493?from_cn_redirect=1) API.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Name of the table in the database.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. Its value is the InstanceId field in the output parameter. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. Its value is the InstanceId field in the output parameter.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. Its value is the InstanceId field in the output parameter.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the [Query Instance List](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. Its value is the InstanceId field in the output parameter.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name. Obtain through the [Query Database](https://www.tencentcloud.com/document/api/236/17493?from_cn_redirect=1) API. 
     * @return Database Database name. Obtain through the [Query Database](https://www.tencentcloud.com/document/api/236/17493?from_cn_redirect=1) API.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name. Obtain through the [Query Database](https://www.tencentcloud.com/document/api/236/17493?from_cn_redirect=1) API.
     * @param Database Database name. Obtain through the [Query Database](https://www.tencentcloud.com/document/api/236/17493?from_cn_redirect=1) API.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Name of the table in the database. 
     * @return Table Name of the table in the database.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Name of the table in the database.
     * @param Table Name of the table in the database.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    public DescribeTableColumnsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableColumnsRequest(DescribeTableColumnsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
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
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

