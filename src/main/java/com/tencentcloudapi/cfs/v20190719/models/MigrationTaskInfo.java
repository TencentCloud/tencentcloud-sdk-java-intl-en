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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationTaskInfo extends AbstractModel{

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
    * Data source bucket name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Data source bucket region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Data source bucket address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketAddress")
    @Expose
    private String BucketAddress;

    /**
    * List address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListAddress")
    @Expose
    private String ListAddress;

    /**
    * File system instance name
Note: This field may return null, indicating that no valid values can be obtained.
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
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Migration status. Valid values: `0` (completed), `1` (in progress), and `2` (stopped).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of files
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * Number of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMigratedCount")
    @Expose
    private Long FileMigratedCount;

    /**
    * Number of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * File size, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * Size of migrated files, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMigratedSize")
    @Expose
    private Long FileMigratedSize;

    /**
    * Size of files that failed to be migrated, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * List of all files
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * List of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileCompletedList")
    @Expose
    private String FileCompletedList;

    /**
    * List of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * Source bucket path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

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
     * Get Data source bucket name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketName Data source bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Data source bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketName Data source bucket name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Data source bucket region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketRegion Data source bucket region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Data source bucket region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketRegion Data source bucket region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Data source bucket address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketAddress Data source bucket address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketAddress() {
        return this.BucketAddress;
    }

    /**
     * Set Data source bucket address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketAddress Data source bucket address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketAddress(String BucketAddress) {
        this.BucketAddress = BucketAddress;
    }

    /**
     * Get List address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListAddress List address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListAddress() {
        return this.ListAddress;
    }

    /**
     * Set List address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListAddress List address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListAddress(String ListAddress) {
        this.ListAddress = ListAddress;
    }

    /**
     * Get File system instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FsName File system instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set File system instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FsName File system instance name
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Migration status. Valid values: `0` (completed), `1` (in progress), and `2` (stopped). 
     * @return Status Migration status. Valid values: `0` (completed), `1` (in progress), and `2` (stopped).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Migration status. Valid values: `0` (completed), `1` (in progress), and `2` (stopped).
     * @param Status Migration status. Valid values: `0` (completed), `1` (in progress), and `2` (stopped).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of files
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileTotalCount Number of files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set Number of files
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileTotalCount Number of files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get Number of migrated files
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMigratedCount Number of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileMigratedCount() {
        return this.FileMigratedCount;
    }

    /**
     * Set Number of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMigratedCount Number of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMigratedCount(Long FileMigratedCount) {
        this.FileMigratedCount = FileMigratedCount;
    }

    /**
     * Get Number of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileFailedCount Number of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set Number of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileFailedCount Number of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get File size, in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileTotalSize File size, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set File size, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileTotalSize File size, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get Size of migrated files, in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMigratedSize Size of migrated files, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileMigratedSize() {
        return this.FileMigratedSize;
    }

    /**
     * Set Size of migrated files, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMigratedSize Size of migrated files, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMigratedSize(Long FileMigratedSize) {
        this.FileMigratedSize = FileMigratedSize;
    }

    /**
     * Get Size of files that failed to be migrated, in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileFailedSize Size of files that failed to be migrated, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set Size of files that failed to be migrated, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileFailedSize Size of files that failed to be migrated, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get List of all files
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileTotalList List of all files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set List of all files
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileTotalList List of all files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get List of migrated files
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileCompletedList List of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileCompletedList() {
        return this.FileCompletedList;
    }

    /**
     * Set List of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileCompletedList List of migrated files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileCompletedList(String FileCompletedList) {
        this.FileCompletedList = FileCompletedList;
    }

    /**
     * Get List of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileFailedList List of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set List of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileFailedList List of files that failed to be migrated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get Source bucket path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketPath Source bucket path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set Source bucket path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketPath Source bucket path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
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

    }
}

