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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Record offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Regular expression for matching table names, which complies with the rules at MySQL's official website
    */
    @SerializedName("TableRegexp")
    @Expose
    private String TableRegexp;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name. 
     * @return Database Database name.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name.
     * @param Database Database name.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Record offset. Default value: 0. 
     * @return Offset Record offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: 0.
     * @param Offset Record offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000. 
     * @return Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     * @param Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Regular expression for matching table names, which complies with the rules at MySQL's official website 
     * @return TableRegexp Regular expression for matching table names, which complies with the rules at MySQL's official website
     */
    public String getTableRegexp() {
        return this.TableRegexp;
    }

    /**
     * Set Regular expression for matching table names, which complies with the rules at MySQL's official website
     * @param TableRegexp Regular expression for matching table names, which complies with the rules at MySQL's official website
     */
    public void setTableRegexp(String TableRegexp) {
        this.TableRegexp = TableRegexp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TableRegexp", this.TableRegexp);

    }
}

