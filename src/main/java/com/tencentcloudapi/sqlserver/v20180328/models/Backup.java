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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backup extends AbstractModel {

    /**
    * File name. The name of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in KB. The size of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
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
    * Private network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Public network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * Unique ID of a backup file, which is used by the `RestoreInstance` API. The unique ID of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
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
    * Backup Mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup).
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
    * Backup task name (customizable)
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Group ID of unarchived backup files, which can be used as a request parameter in the `DescribeBackupFiles` API to get details of unarchived backup files in the specified group. This parameter is invalid for archived backup files.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Backup file format. Valid values:`pkg` (archive file), `single` (unarchived files).
    */
    @SerializedName("BackupFormat")
    @Expose
    private String BackupFormat;

    /**
    * The code of current region where the instance resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The download address of cross-region backup in target region
    */
    @SerializedName("CrossBackupAddr")
    @Expose
    private CrossBackupAddr [] CrossBackupAddr;

    /**
    * The target region and status of cross-region backup
    */
    @SerializedName("CrossBackupStatus")
    @Expose
    private CrossRegionStatus [] CrossBackupStatus;

    /**
     * Get File name. The name of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter. 
     * @return FileName File name. The name of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name. The name of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     * @param FileName File name. The name of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size in KB. The size of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter. 
     * @return Size File size in KB. The size of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size in KB. The size of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     * @param Size File size in KB. The size of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
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
     * Get Private network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter. 
     * @return InternalAddr Private network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Private network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     * @param InternalAddr Private network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Public network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter. 
     * @return ExternalAddr Public network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Public network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     * @param ExternalAddr Public network download address. The download address of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get Unique ID of a backup file, which is used by the `RestoreInstance` API. The unique ID of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter. 
     * @return Id Unique ID of a backup file, which is used by the `RestoreInstance` API. The unique ID of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of a backup file, which is used by the `RestoreInstance` API. The unique ID of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
     * @param Id Unique ID of a backup file, which is used by the `RestoreInstance` API. The unique ID of an unarchived backup file is returned by the `DescribeBackupFiles` API instead of this parameter.
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
     * Get Backup Mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). 
     * @return BackupWay Backup Mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup).
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set Backup Mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup).
     * @param BackupWay Backup Mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup).
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Get Backup task name (customizable) 
     * @return BackupName Backup task name (customizable)
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup task name (customizable)
     * @param BackupName Backup task name (customizable)
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Group ID of unarchived backup files, which can be used as a request parameter in the `DescribeBackupFiles` API to get details of unarchived backup files in the specified group. This parameter is invalid for archived backup files. 
     * @return GroupId Group ID of unarchived backup files, which can be used as a request parameter in the `DescribeBackupFiles` API to get details of unarchived backup files in the specified group. This parameter is invalid for archived backup files.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of unarchived backup files, which can be used as a request parameter in the `DescribeBackupFiles` API to get details of unarchived backup files in the specified group. This parameter is invalid for archived backup files.
     * @param GroupId Group ID of unarchived backup files, which can be used as a request parameter in the `DescribeBackupFiles` API to get details of unarchived backup files in the specified group. This parameter is invalid for archived backup files.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Backup file format. Valid values:`pkg` (archive file), `single` (unarchived files). 
     * @return BackupFormat Backup file format. Valid values:`pkg` (archive file), `single` (unarchived files).
     */
    public String getBackupFormat() {
        return this.BackupFormat;
    }

    /**
     * Set Backup file format. Valid values:`pkg` (archive file), `single` (unarchived files).
     * @param BackupFormat Backup file format. Valid values:`pkg` (archive file), `single` (unarchived files).
     */
    public void setBackupFormat(String BackupFormat) {
        this.BackupFormat = BackupFormat;
    }

    /**
     * Get The code of current region where the instance resides 
     * @return Region The code of current region where the instance resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The code of current region where the instance resides
     * @param Region The code of current region where the instance resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The download address of cross-region backup in target region 
     * @return CrossBackupAddr The download address of cross-region backup in target region
     */
    public CrossBackupAddr [] getCrossBackupAddr() {
        return this.CrossBackupAddr;
    }

    /**
     * Set The download address of cross-region backup in target region
     * @param CrossBackupAddr The download address of cross-region backup in target region
     */
    public void setCrossBackupAddr(CrossBackupAddr [] CrossBackupAddr) {
        this.CrossBackupAddr = CrossBackupAddr;
    }

    /**
     * Get The target region and status of cross-region backup 
     * @return CrossBackupStatus The target region and status of cross-region backup
     */
    public CrossRegionStatus [] getCrossBackupStatus() {
        return this.CrossBackupStatus;
    }

    /**
     * Set The target region and status of cross-region backup
     * @param CrossBackupStatus The target region and status of cross-region backup
     */
    public void setCrossBackupStatus(CrossRegionStatus [] CrossBackupStatus) {
        this.CrossBackupStatus = CrossBackupStatus;
    }

    public Backup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Backup(Backup source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DBs != null) {
            this.DBs = new String[source.DBs.length];
            for (int i = 0; i < source.DBs.length; i++) {
                this.DBs[i] = new String(source.DBs[i]);
            }
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.BackupWay != null) {
            this.BackupWay = new Long(source.BackupWay);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.BackupFormat != null) {
            this.BackupFormat = new String(source.BackupFormat);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CrossBackupAddr != null) {
            this.CrossBackupAddr = new CrossBackupAddr[source.CrossBackupAddr.length];
            for (int i = 0; i < source.CrossBackupAddr.length; i++) {
                this.CrossBackupAddr[i] = new CrossBackupAddr(source.CrossBackupAddr[i]);
            }
        }
        if (source.CrossBackupStatus != null) {
            this.CrossBackupStatus = new CrossRegionStatus[source.CrossBackupStatus.length];
            for (int i = 0; i < source.CrossBackupStatus.length; i++) {
                this.CrossBackupStatus[i] = new CrossRegionStatus(source.CrossBackupStatus[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "BackupFormat", this.BackupFormat);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "CrossBackupAddr.", this.CrossBackupAddr);
        this.setParamArrayObj(map, prefix + "CrossBackupStatus.", this.CrossBackupStatus);

    }
}

