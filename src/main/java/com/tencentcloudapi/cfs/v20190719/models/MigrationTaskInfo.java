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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationTaskInfo extends AbstractModel {

    /**
    * Migration task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Migration task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
    */
    @SerializedName("MigrationType")
    @Expose
    private Long MigrationType;

    /**
    * Migration mode. Default value: `0` (full migration).
    */
    @SerializedName("MigrationMode")
    @Expose
    private Long MigrationMode;

    /**
    * Data source bucket name.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Source bucket region.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Data source bucket address.
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * Checklist address.
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * File system instance name.
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * File system instance ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * File system path
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
    * Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
    */
    @SerializedName("CoverType")
    @Expose
    private Long CoverType;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Completion/Termination time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Migration status. 0: completed; 1: creating; 2: running; 3: terminating; 4: terminated; 5: creation failed; 6: running failure; 7: ending; 8: deleting; 9: waiting.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of files.
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * Number of migrated files.
    */
    @SerializedName("FileMigratedCount")
    @Expose
    private Long FileMigratedCount;

    /**
    * Number of failed files in migration.
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * File capacity, in Byte.
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * Migrated file capacity in Byte.
    */
    @SerializedName("FileMigratedSize")
    @Expose
    private Long FileMigratedSize;

    /**
    * Capacity of failed migration files, in Byte.
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * Total inventory.
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * File list completed.
    */
    @SerializedName("FileCompletedList")
    @Expose
    private String FileCompletedList;

    /**
    * Failed file list.
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * Source bucket path.
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
    * Migration direction. valid values: 0 (cos migration to file system), 1 (file system migration to cos). default is 0.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get Migration task name 
     * @return TaskName Migration task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Migration task name
     * @param TaskName Migration task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Migration task ID 
     * @return TaskId Migration task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Migration task ID
     * @param TaskId Migration task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`. 
     * @return MigrationType Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     */
    public Long getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     * @param MigrationType Migration type. Valid values: `0` (bucket) and `1` (list). Default value: `0`.
     */
    public void setMigrationType(Long MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get Migration mode. Default value: `0` (full migration). 
     * @return MigrationMode Migration mode. Default value: `0` (full migration).
     */
    public Long getMigrationMode() {
        return this.MigrationMode;
    }

    /**
     * Set Migration mode. Default value: `0` (full migration).
     * @param MigrationMode Migration mode. Default value: `0` (full migration).
     */
    public void setMigrationMode(Long MigrationMode) {
        this.MigrationMode = MigrationMode;
    }

    /**
     * Get Data source bucket name. 
     * @return BucketName Data source bucket name.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Data source bucket name.
     * @param BucketName Data source bucket name.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Source bucket region. 
     * @return BucketRegion Source bucket region.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Source bucket region.
     * @param BucketRegion Source bucket region.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Data source bucket address. 
     * @return BucketAddress Data source bucket address.
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set Data source bucket address.
     * @param BucketAddress Data source bucket address.
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get Checklist address. 
     * @return ListAddress Checklist address.
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set Checklist address.
     * @param ListAddress Checklist address.
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get File system instance name. 
     * @return FsName File system instance name.
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set File system instance name.
     * @param FsName File system instance name.
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get File system instance ID 
     * @return FileSystemId File system instance ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system instance ID
     * @param FileSystemId File system instance ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get File system path 
     * @return FsPath File system path
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set File system path
     * @param FsPath File system path
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    /**
     * Get Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`. 
     * @return CoverType Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     */
    public Long getCoverType() {
        return this.CoverType;
    }

    /**
     * Set Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     * @param CoverType Overwrite policy for files with the same name. Valid values: `0` (retain the file with the latest modified time), `1` (overwrite); and `2` (not overwrite). Default value: `0`.
     */
    public void setCoverType(Long CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Completion/Termination time. 
     * @return EndTime Completion/Termination time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Completion/Termination time.
     * @param EndTime Completion/Termination time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Migration status. 0: completed; 1: creating; 2: running; 3: terminating; 4: terminated; 5: creation failed; 6: running failure; 7: ending; 8: deleting; 9: waiting. 
     * @return Status Migration status. 0: completed; 1: creating; 2: running; 3: terminating; 4: terminated; 5: creation failed; 6: running failure; 7: ending; 8: deleting; 9: waiting.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Migration status. 0: completed; 1: creating; 2: running; 3: terminating; 4: terminated; 5: creation failed; 6: running failure; 7: ending; 8: deleting; 9: waiting.
     * @param Status Migration status. 0: completed; 1: creating; 2: running; 3: terminating; 4: terminated; 5: creation failed; 6: running failure; 7: ending; 8: deleting; 9: waiting.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of files. 
     * @return FileTotalCount Number of files.
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set Number of files.
     * @param FileTotalCount Number of files.
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get Number of migrated files. 
     * @return FileMigratedCount Number of migrated files.
     */
    public Long getFileMigratedCount() {
        return this.FileMigratedCount;
    }

    /**
     * Set Number of migrated files.
     * @param FileMigratedCount Number of migrated files.
     */
    public void setFileMigratedCount(Long FileMigratedCount) {
        this.FileMigratedCount = FileMigratedCount;
    }

    /**
     * Get Number of failed files in migration. 
     * @return FileFailedCount Number of failed files in migration.
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set Number of failed files in migration.
     * @param FileFailedCount Number of failed files in migration.
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get File capacity, in Byte. 
     * @return FileTotalSize File capacity, in Byte.
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set File capacity, in Byte.
     * @param FileTotalSize File capacity, in Byte.
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get Migrated file capacity in Byte. 
     * @return FileMigratedSize Migrated file capacity in Byte.
     */
    public Long getFileMigratedSize() {
        return this.FileMigratedSize;
    }

    /**
     * Set Migrated file capacity in Byte.
     * @param FileMigratedSize Migrated file capacity in Byte.
     */
    public void setFileMigratedSize(Long FileMigratedSize) {
        this.FileMigratedSize = FileMigratedSize;
    }

    /**
     * Get Capacity of failed migration files, in Byte. 
     * @return FileFailedSize Capacity of failed migration files, in Byte.
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set Capacity of failed migration files, in Byte.
     * @param FileFailedSize Capacity of failed migration files, in Byte.
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get Total inventory. 
     * @return FileTotalList Total inventory.
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set Total inventory.
     * @param FileTotalList Total inventory.
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get File list completed. 
     * @return FileCompletedList File list completed.
     */
    public String getFileCompletedList() {
        return this.FileCompletedList;
    }

    /**
     * Set File list completed.
     * @param FileCompletedList File list completed.
     */
    public void setFileCompletedList(String FileCompletedList) {
        this.FileCompletedList = FileCompletedList;
    }

    /**
     * Get Failed file list. 
     * @return FileFailedList Failed file list.
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set Failed file list.
     * @param FileFailedList Failed file list.
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get Source bucket path. 
     * @return BucketPath Source bucket path.
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set Source bucket path.
     * @param BucketPath Source bucket path.
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    /**
     * Get Migration direction. valid values: 0 (cos migration to file system), 1 (file system migration to cos). default is 0. 
     * @return Direction Migration direction. valid values: 0 (cos migration to file system), 1 (file system migration to cos). default is 0.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Migration direction. valid values: 0 (cos migration to file system), 1 (file system migration to cos). default is 0.
     * @param Direction Migration direction. valid values: 0 (cos migration to file system), 1 (file system migration to cos). default is 0.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public MigrationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationTaskInfo(MigrationTaskInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new Long(source.MigrationType);
        }
        if (source.MigrationMode != null) {
            this.MigrationMode = new Long(source.MigrationMode);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketAddress != null) {
            this.BucketAddress = new String(source.BucketAddress);
        }
        if (source.ListAddress != null) {
            this.ListAddress = new String(source.ListAddress);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsPath != null) {
            this.FsPath = new String(source.FsPath);
        }
        if (source.CoverType != null) {
            this.CoverType = new Long(source.CoverType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FileTotalCount != null) {
            this.FileTotalCount = new Long(source.FileTotalCount);
        }
        if (source.FileMigratedCount != null) {
            this.FileMigratedCount = new Long(source.FileMigratedCount);
        }
        if (source.FileFailedCount != null) {
            this.FileFailedCount = new Long(source.FileFailedCount);
        }
        if (source.FileTotalSize != null) {
            this.FileTotalSize = new Long(source.FileTotalSize);
        }
        if (source.FileMigratedSize != null) {
            this.FileMigratedSize = new Long(source.FileMigratedSize);
        }
        if (source.FileFailedSize != null) {
            this.FileFailedSize = new Long(source.FileFailedSize);
        }
        if (source.FileTotalList != null) {
            this.FileTotalList = new String(source.FileTotalList);
        }
        if (source.FileCompletedList != null) {
            this.FileCompletedList = new String(source.FileCompletedList);
        }
        if (source.FileFailedList != null) {
            this.FileFailedList = new String(source.FileFailedList);
        }
        if (source.BucketPath != null) {
            this.BucketPath = new String(source.BucketPath);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "MigrationMode", this.MigrationMode);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketAddress", this.BucketAddress);
        this.setParamSimple(map, prefix + "ListAddress", this.ListAddress);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsPath", this.FsPath);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileTotalCount", this.FileTotalCount);
        this.setParamSimple(map, prefix + "FileMigratedCount", this.FileMigratedCount);
        this.setParamSimple(map, prefix + "FileFailedCount", this.FileFailedCount);
        this.setParamSimple(map, prefix + "FileTotalSize", this.FileTotalSize);
        this.setParamSimple(map, prefix + "FileMigratedSize", this.FileMigratedSize);
        this.setParamSimple(map, prefix + "FileFailedSize", this.FileFailedSize);
        this.setParamSimple(map, prefix + "FileTotalList", this.FileTotalList);
        this.setParamSimple(map, prefix + "FileCompletedList", this.FileCompletedList);
        this.setParamSimple(map, prefix + "FileFailedList", this.FileFailedList);
        this.setParamSimple(map, prefix + "BucketPath", this.BucketPath);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

