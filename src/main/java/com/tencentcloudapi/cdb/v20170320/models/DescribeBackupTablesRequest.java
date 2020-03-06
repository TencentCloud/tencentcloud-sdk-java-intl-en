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

public class DescribeBackupTablesRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-07-12 10:29:20.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specified database name.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Prefix of the table to be queried.
    */
    @SerializedName("SearchTable")
    @Expose
    private String SearchTable;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Value range: 1-2,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-07-12 10:29:20. 
     * @return StartTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-07-12 10:29:20.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-07-12 10:29:20.
     * @param StartTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-07-12 10:29:20.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specified database name. 
     * @return DatabaseName Specified database name.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Specified database name.
     * @param DatabaseName Specified database name.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Prefix of the table to be queried. 
     * @return SearchTable Prefix of the table to be queried.
     */
    public String getSearchTable() {
        return this.SearchTable;
    }

    /**
     * Set Prefix of the table to be queried.
     * @param SearchTable Prefix of the table to be queried.
     */
    public void setSearchTable(String SearchTable) {
        this.SearchTable = SearchTable;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Value range: 1-2,000. 
     * @return Limit Number of entries per page. Value range: 1-2,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Value range: 1-2,000.
     * @param Limit Number of entries per page. Value range: 1-2,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SearchTable", this.SearchTable);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

