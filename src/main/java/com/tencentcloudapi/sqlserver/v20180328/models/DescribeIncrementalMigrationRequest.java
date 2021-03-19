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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIncrementalMigrationRequest extends AbstractModel{

    /**
    * Backup import task ID, which is returned through the API CreateBackupMigration
    */
    @SerializedName("BackupMigrationId")
    @Expose
    private String BackupMigrationId;

    /**
    * ID of imported target instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup file name
    */
    @SerializedName("BackupFileName")
    @Expose
    private String BackupFileName;

    /**
    * Status set of import tasks
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * Paging. Page size
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Paging. Number of pages
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Field for order: name,createTime,startTime,endTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Type of order: desc,asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * ID of an incremental backup import task
    */
    @SerializedName("IncrementalMigrationId")
    @Expose
    private String IncrementalMigrationId;

    /**
     * Get Backup import task ID, which is returned through the API CreateBackupMigration 
     * @return BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration
     */
    public String getBackupMigrationId() {
        return this.BackupMigrationId;
    }

    /**
     * Set Backup import task ID, which is returned through the API CreateBackupMigration
     * @param BackupMigrationId Backup import task ID, which is returned through the API CreateBackupMigration
     */
    public void setBackupMigrationId(String BackupMigrationId) {
        this.BackupMigrationId = BackupMigrationId;
    }

    /**
     * Get ID of imported target instance 
     * @return InstanceId ID of imported target instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of imported target instance
     * @param InstanceId ID of imported target instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup file name 
     * @return BackupFileName Backup file name
     */
    public String getBackupFileName() {
        return this.BackupFileName;
    }

    /**
     * Set Backup file name
     * @param BackupFileName Backup file name
     */
    public void setBackupFileName(String BackupFileName) {
        this.BackupFileName = BackupFileName;
    }

    /**
     * Get Status set of import tasks 
     * @return StatusSet Status set of import tasks
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set Status set of import tasks
     * @param StatusSet Status set of import tasks
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get Paging. Page size 
     * @return Limit Paging. Page size
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paging. Page size
     * @param Limit Paging. Page size
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paging. Number of pages 
     * @return Offset Paging. Number of pages
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging. Number of pages
     * @param Offset Paging. Number of pages
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Field for order: name,createTime,startTime,endTime 
     * @return OrderBy Field for order: name,createTime,startTime,endTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Field for order: name,createTime,startTime,endTime
     * @param OrderBy Field for order: name,createTime,startTime,endTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Type of order: desc,asc 
     * @return OrderByType Type of order: desc,asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Type of order: desc,asc
     * @param OrderByType Type of order: desc,asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get ID of an incremental backup import task 
     * @return IncrementalMigrationId ID of an incremental backup import task
     */
    public String getIncrementalMigrationId() {
        return this.IncrementalMigrationId;
    }

    /**
     * Set ID of an incremental backup import task
     * @param IncrementalMigrationId ID of an incremental backup import task
     */
    public void setIncrementalMigrationId(String IncrementalMigrationId) {
        this.IncrementalMigrationId = IncrementalMigrationId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupFileName", this.BackupFileName);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "IncrementalMigrationId", this.IncrementalMigrationId);

    }
}

