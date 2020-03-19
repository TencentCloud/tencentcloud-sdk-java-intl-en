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

public class Backup extends AbstractModel{

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in KB
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Backup start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Download address for private network
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Download address for public network
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * Unique ID of backup file, which will be used by the `RestoreInstance` API
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Backup file status (0: creating, 1: succeeded, 2: failed)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * List of databases for multi-database backup
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * Backup policy (0: instance backup, 1: multi-database backup)
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Backup mode. 0: scheduled, 1: manual
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size in KB 
     * @return Size File size in KB
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size in KB
     * @param Size File size in KB
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Backup start time 
     * @return StartTime Backup start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time
     * @param StartTime Backup start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup end time 
     * @return EndTime Backup end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time
     * @param EndTime Backup end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Download address for private network 
     * @return InternalAddr Download address for private network
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Download address for private network
     * @param InternalAddr Download address for private network
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Download address for public network 
     * @return ExternalAddr Download address for public network
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Download address for public network
     * @param ExternalAddr Download address for public network
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get Unique ID of backup file, which will be used by the `RestoreInstance` API 
     * @return Id Unique ID of backup file, which will be used by the `RestoreInstance` API
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of backup file, which will be used by the `RestoreInstance` API
     * @param Id Unique ID of backup file, which will be used by the `RestoreInstance` API
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Backup file status (0: creating, 1: succeeded, 2: failed) 
     * @return Status Backup file status (0: creating, 1: succeeded, 2: failed)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Backup file status (0: creating, 1: succeeded, 2: failed)
     * @param Status Backup file status (0: creating, 1: succeeded, 2: failed)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get List of databases for multi-database backup 
     * @return DBs List of databases for multi-database backup
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set List of databases for multi-database backup
     * @param DBs List of databases for multi-database backup
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get Backup policy (0: instance backup, 1: multi-database backup) 
     * @return Strategy Backup policy (0: instance backup, 1: multi-database backup)
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Backup policy (0: instance backup, 1: multi-database backup)
     * @param Strategy Backup policy (0: instance backup, 1: multi-database backup)
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Backup mode. 0: scheduled, 1: manual 
     * @return BackupWay Backup mode. 0: scheduled, 1: manual
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set Backup mode. 0: scheduled, 1: manual
     * @param BackupWay Backup mode. 0: scheduled, 1: manual
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);

    }
}

