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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupFilesRequest extends AbstractModel {

    /**
    * Query by instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup type. Valid values: `Data` (data backup), `Binlog` (Binlog backup), `Errlog` (error log), `Slowlog` (slow log).
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Query by start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query by end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting dimension. Valid values: `Time`, `Size`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `DESC`, `ASC`.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Query by instance ID 
     * @return InstanceId Query by instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Query by instance ID
     * @param InstanceId Query by instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup type. Valid values: `Data` (data backup), `Binlog` (Binlog backup), `Errlog` (error log), `Slowlog` (slow log). 
     * @return BackupType Backup type. Valid values: `Data` (data backup), `Binlog` (Binlog backup), `Errlog` (error log), `Slowlog` (slow log).
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `Data` (data backup), `Binlog` (Binlog backup), `Errlog` (error log), `Slowlog` (slow log).
     * @param BackupType Backup type. Valid values: `Data` (data backup), `Binlog` (Binlog backup), `Errlog` (error log), `Slowlog` (slow log).
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Query by start time 
     * @return StartTime Query by start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query by start time
     * @param StartTime Query by start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query by end time 
     * @return EndTime Query by end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query by end time
     * @param EndTime Query by end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting dimension. Valid values: `Time`, `Size`. 
     * @return OrderBy Sorting dimension. Valid values: `Time`, `Size`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting dimension. Valid values: `Time`, `Size`.
     * @param OrderBy Sorting dimension. Valid values: `Time`, `Size`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `DESC`, `ASC`. 
     * @return OrderType Sorting order. Valid values: `DESC`, `ASC`.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting order. Valid values: `DESC`, `ASC`.
     * @param OrderType Sorting order. Valid values: `DESC`, `ASC`.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
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
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

