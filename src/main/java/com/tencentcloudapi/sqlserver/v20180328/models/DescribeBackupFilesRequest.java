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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupFilesRequest extends AbstractModel {

    /**
    * Instance ID in the format of mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Group ID of unarchived backup files, which can be obtained by the `DescribeBackups` API (Querying archived backup record is not supported).
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Number of entries to be returned per page. Value range: 1-100. Default value: `20`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: `0`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter backups by database name. If the parameter is left empty, this filter criterion will not take effect.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * List items sorting by backup size. Valid values: `desc`(descending order), `asc` (ascending order). Default value: `desc`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting field. Size - sort by backup size; DBs - sort by database name. The default value is size.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID in the format of mssql-njj2mtpl 
     * @return InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-njj2mtpl
     * @param InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Group ID of unarchived backup files, which can be obtained by the `DescribeBackups` API (Querying archived backup record is not supported). 
     * @return GroupId Group ID of unarchived backup files, which can be obtained by the `DescribeBackups` API (Querying archived backup record is not supported).
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of unarchived backup files, which can be obtained by the `DescribeBackups` API (Querying archived backup record is not supported).
     * @param GroupId Group ID of unarchived backup files, which can be obtained by the `DescribeBackups` API (Querying archived backup record is not supported).
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Number of entries to be returned per page. Value range: 1-100. Default value: `20` 
     * @return Limit Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     * @param Limit Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: `0` 
     * @return Offset Page number. Default value: `0`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: `0`
     * @param Offset Page number. Default value: `0`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter backups by database name. If the parameter is left empty, this filter criterion will not take effect. 
     * @return DatabaseName Filter backups by database name. If the parameter is left empty, this filter criterion will not take effect.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Filter backups by database name. If the parameter is left empty, this filter criterion will not take effect.
     * @param DatabaseName Filter backups by database name. If the parameter is left empty, this filter criterion will not take effect.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get List items sorting by backup size. Valid values: `desc`(descending order), `asc` (ascending order). Default value: `desc`. 
     * @return OrderBy List items sorting by backup size. Valid values: `desc`(descending order), `asc` (ascending order). Default value: `desc`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set List items sorting by backup size. Valid values: `desc`(descending order), `asc` (ascending order). Default value: `desc`.
     * @param OrderBy List items sorting by backup size. Valid values: `desc`(descending order), `asc` (ascending order). Default value: `desc`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting field. Size - sort by backup size; DBs - sort by database name. The default value is size. 
     * @return OrderByType Sorting field. Size - sort by backup size; DBs - sort by database name. The default value is size.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting field. Size - sort by backup size; DBs - sort by database name. The default value is size.
     * @param OrderByType Sorting field. Size - sort by backup size; DBs - sort by database name. The default value is size.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBackupFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupFilesRequest(DescribeBackupFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

