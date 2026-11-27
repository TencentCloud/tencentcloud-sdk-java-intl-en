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

public class LifecycleDataTaskInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task status.</p><p>Valid values:</p><ul><li>init: queuing</li><li>running: running</li><li>finished: completed</li><li>failed: failed</li><li>stopping: stopping</li><li>stopped: stopped</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>Task creation time</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>Task end time</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Total number of files</p>
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * <p>Number of files processed successfully</p>
    */
    @SerializedName("FileSuccessedCount")
    @Expose
    private Long FileSuccessedCount;

    /**
    * <p>Number of files that have failed</p>
    */
    @SerializedName("FileFailedCount")
    @Expose
    private Long FileFailedCount;

    /**
    * <p>File size, in bytes</p>
    */
    @SerializedName("FileTotalSize")
    @Expose
    private Long FileTotalSize;

    /**
    * <p>Size of processed files, in bytes</p>
    */
    @SerializedName("FileSuccessedSize")
    @Expose
    private Long FileSuccessedSize;

    /**
    * <p>Size of failed files, in bytes</p>
    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * <p>Total file list.</p>
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * <p>List of successful files.</p>
    */
    @SerializedName("FileSuccessedList")
    @Expose
    private String FileSuccessedList;

    /**
    * <p>List of failed files.</p>
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * <p>FileSystemId</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Task name.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Task path.</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>Task type. archive: an archiving task. restore: a retrieval task.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Data flow Id.</p>
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * <p>Whether to overwrite files with the same name in CFS Turbo and external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).<br>If this parameter is left empty, the default value is false.</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. This parameter and TaskPath are alternative. <br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
    */
    @SerializedName("ListPath")
    @Expose
    private String ListPath;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task status.</p><p>Valid values:</p><ul><li>init: queuing</li><li>running: running</li><li>finished: completed</li><li>failed: failed</li><li>stopping: stopping</li><li>stopped: stopped</li></ul> 
     * @return TaskStatus <p>Task status.</p><p>Valid values:</p><ul><li>init: queuing</li><li>running: running</li><li>finished: completed</li><li>failed: failed</li><li>stopping: stopping</li><li>stopped: stopped</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status.</p><p>Valid values:</p><ul><li>init: queuing</li><li>running: running</li><li>finished: completed</li><li>failed: failed</li><li>stopping: stopping</li><li>stopped: stopped</li></ul>
     * @param TaskStatus <p>Task status.</p><p>Valid values:</p><ul><li>init: queuing</li><li>running: running</li><li>finished: completed</li><li>failed: failed</li><li>stopping: stopping</li><li>stopped: stopped</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Task creation time</p> 
     * @return CreationTime <p>Task creation time</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>Task creation time</p>
     * @param CreationTime <p>Task creation time</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>Task end time</p> 
     * @return FinishTime <p>Task end time</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Task end time</p>
     * @param FinishTime <p>Task end time</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Total number of files</p> 
     * @return FileTotalCount <p>Total number of files</p>
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set <p>Total number of files</p>
     * @param FileTotalCount <p>Total number of files</p>
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get <p>Number of files processed successfully</p> 
     * @return FileSuccessedCount <p>Number of files processed successfully</p>
     */
    public Long getFileSuccessedCount() {
        return this.FileSuccessedCount;
    }

    /**
     * Set <p>Number of files processed successfully</p>
     * @param FileSuccessedCount <p>Number of files processed successfully</p>
     */
    public void setFileSuccessedCount(Long FileSuccessedCount) {
        this.FileSuccessedCount = FileSuccessedCount;
    }

    /**
     * Get <p>Number of files that have failed</p> 
     * @return FileFailedCount <p>Number of files that have failed</p>
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set <p>Number of files that have failed</p>
     * @param FileFailedCount <p>Number of files that have failed</p>
     */
    public void setFileFailedCount(Long FileFailedCount) {
        this.FileFailedCount = FileFailedCount;
    }

    /**
     * Get <p>File size, in bytes</p> 
     * @return FileTotalSize <p>File size, in bytes</p>
     */
    public Long getFileTotalSize() {
        return this.FileTotalSize;
    }

    /**
     * Set <p>File size, in bytes</p>
     * @param FileTotalSize <p>File size, in bytes</p>
     */
    public void setFileTotalSize(Long FileTotalSize) {
        this.FileTotalSize = FileTotalSize;
    }

    /**
     * Get <p>Size of processed files, in bytes</p> 
     * @return FileSuccessedSize <p>Size of processed files, in bytes</p>
     */
    public Long getFileSuccessedSize() {
        return this.FileSuccessedSize;
    }

    /**
     * Set <p>Size of processed files, in bytes</p>
     * @param FileSuccessedSize <p>Size of processed files, in bytes</p>
     */
    public void setFileSuccessedSize(Long FileSuccessedSize) {
        this.FileSuccessedSize = FileSuccessedSize;
    }

    /**
     * Get <p>Size of failed files, in bytes</p> 
     * @return FileFailedSize <p>Size of failed files, in bytes</p>
     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set <p>Size of failed files, in bytes</p>
     * @param FileFailedSize <p>Size of failed files, in bytes</p>
     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get <p>Total file list.</p> 
     * @return FileTotalList <p>Total file list.</p>
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set <p>Total file list.</p>
     * @param FileTotalList <p>Total file list.</p>
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get <p>List of successful files.</p> 
     * @return FileSuccessedList <p>List of successful files.</p>
     */
    public String getFileSuccessedList() {
        return this.FileSuccessedList;
    }

    /**
     * Set <p>List of successful files.</p>
     * @param FileSuccessedList <p>List of successful files.</p>
     */
    public void setFileSuccessedList(String FileSuccessedList) {
        this.FileSuccessedList = FileSuccessedList;
    }

    /**
     * Get <p>List of failed files.</p> 
     * @return FileFailedList <p>List of failed files.</p>
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set <p>List of failed files.</p>
     * @param FileFailedList <p>List of failed files.</p>
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get <p>FileSystemId</p> 
     * @return FileSystemId <p>FileSystemId</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>FileSystemId</p>
     * @param FileSystemId <p>FileSystemId</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Task name.</p> 
     * @return TaskName <p>Task name.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name.</p>
     * @param TaskName <p>Task name.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Task path.</p> 
     * @return TaskPath <p>Task path.</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>Task path.</p>
     * @param TaskPath <p>Task path.</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>Task type. archive: an archiving task. restore: a retrieval task.</p> 
     * @return Type <p>Task type. archive: an archiving task. restore: a retrieval task.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Task type. archive: an archiving task. restore: a retrieval task.</p>
     * @param Type <p>Task type. archive: an archiving task. restore: a retrieval task.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Data flow Id.</p> 
     * @return DataFlowId <p>Data flow Id.</p>
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set <p>Data flow Id.</p>
     * @param DataFlowId <p>Data flow Id.</p>
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get <p>Whether to overwrite files with the same name in CFS Turbo and external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).<br>If this parameter is left empty, the default value is false.</p> 
     * @return IsOverwrite <p>Whether to overwrite files with the same name in CFS Turbo and external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).<br>If this parameter is left empty, the default value is false.</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>Whether to overwrite files with the same name in CFS Turbo and external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).<br>If this parameter is left empty, the default value is false.</p>
     * @param IsOverwrite <p>Whether to overwrite files with the same name in CFS Turbo and external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).<br>If this parameter is left empty, the default value is false.</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. This parameter and TaskPath are alternative. <br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul> 
     * @return ListPath <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. This parameter and TaskPath are alternative. <br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     */
    public String getListPath() {
        return this.ListPath;
    }

    /**
     * Set <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. This parameter and TaskPath are alternative. <br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     * @param ListPath <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. This parameter and TaskPath are alternative. <br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     */
    public void setListPath(String ListPath) {
        this.ListPath = ListPath;
    }

    public LifecycleDataTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleDataTaskInfo(LifecycleDataTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.FileTotalCount != null) {
            this.FileTotalCount = new Long(source.FileTotalCount);
        }
        if (source.FileSuccessedCount != null) {
            this.FileSuccessedCount = new Long(source.FileSuccessedCount);
        }
        if (source.FileFailedCount != null) {
            this.FileFailedCount = new Long(source.FileFailedCount);
        }
        if (source.FileTotalSize != null) {
            this.FileTotalSize = new Long(source.FileTotalSize);
        }
        if (source.FileSuccessedSize != null) {
            this.FileSuccessedSize = new Long(source.FileSuccessedSize);
        }
        if (source.FileFailedSize != null) {
            this.FileFailedSize = new Long(source.FileFailedSize);
        }
        if (source.FileTotalList != null) {
            this.FileTotalList = new String(source.FileTotalList);
        }
        if (source.FileSuccessedList != null) {
            this.FileSuccessedList = new String(source.FileSuccessedList);
        }
        if (source.FileFailedList != null) {
            this.FileFailedList = new String(source.FileFailedList);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.ListPath != null) {
            this.ListPath = new String(source.ListPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "FileTotalCount", this.FileTotalCount);
        this.setParamSimple(map, prefix + "FileSuccessedCount", this.FileSuccessedCount);
        this.setParamSimple(map, prefix + "FileFailedCount", this.FileFailedCount);
        this.setParamSimple(map, prefix + "FileTotalSize", this.FileTotalSize);
        this.setParamSimple(map, prefix + "FileSuccessedSize", this.FileSuccessedSize);
        this.setParamSimple(map, prefix + "FileFailedSize", this.FileFailedSize);
        this.setParamSimple(map, prefix + "FileTotalList", this.FileTotalList);
        this.setParamSimple(map, prefix + "FileSuccessedList", this.FileSuccessedList);
        this.setParamSimple(map, prefix + "FileFailedList", this.FileFailedList);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamSimple(map, prefix + "ListPath", this.ListPath);

    }
}

