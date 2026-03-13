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
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status.
init: pending.
running: executing, finished: completed.
failed: failure.
Stopping: stopping, stopped: stopped.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Task creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Task end time.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Total files.
    */
    @SerializedName("FileTotalCount")
    @Expose
    private Long FileTotalCount;

    /**
    * Number of successfully processed files.
    */
    @SerializedName("FileSuccessedCount")
    @Expose
    private Long FileSuccessedCount;

    /**
    * Number of failed files.
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
    * Processed file capacity, in Byte.


    */
    @SerializedName("FileSuccessedSize")
    @Expose
    private Long FileSuccessedSize;

    /**
    * Capacity of processed failed files, in Byte.

    */
    @SerializedName("FileFailedSize")
    @Expose
    private Long FileFailedSize;

    /**
    * Total file list.
    */
    @SerializedName("FileTotalList")
    @Expose
    private String FileTotalList;

    /**
    * List of successful files.
    */
    @SerializedName("FileSuccessedList")
    @Expose
    private String FileSuccessedList;

    /**
    * List of failed files.
    */
    @SerializedName("FileFailedList")
    @Expose
    private String FileFailedList;

    /**
    * FileSystemId
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task path.
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * Task type, archive: indicates settlement task, restore: indicates pull task.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Data flow Id.
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time, it does not release hot data storage).
Default false when empty.
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status.
init: pending.
running: executing, finished: completed.
failed: failure.
Stopping: stopping, stopped: stopped. 
     * @return TaskStatus Task status.
init: pending.
running: executing, finished: completed.
failed: failure.
Stopping: stopping, stopped: stopped.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status.
init: pending.
running: executing, finished: completed.
failed: failure.
Stopping: stopping, stopped: stopped.
     * @param TaskStatus Task status.
init: pending.
running: executing, finished: completed.
failed: failure.
Stopping: stopping, stopped: stopped.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task creation time 
     * @return CreationTime Task creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Task creation time
     * @param CreationTime Task creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Task end time. 
     * @return FinishTime Task end time.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task end time.
     * @param FinishTime Task end time.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Total files. 
     * @return FileTotalCount Total files.
     */
    public Long getFileTotalCount() {
        return this.FileTotalCount;
    }

    /**
     * Set Total files.
     * @param FileTotalCount Total files.
     */
    public void setFileTotalCount(Long FileTotalCount) {
        this.FileTotalCount = FileTotalCount;
    }

    /**
     * Get Number of successfully processed files. 
     * @return FileSuccessedCount Number of successfully processed files.
     */
    public Long getFileSuccessedCount() {
        return this.FileSuccessedCount;
    }

    /**
     * Set Number of successfully processed files.
     * @param FileSuccessedCount Number of successfully processed files.
     */
    public void setFileSuccessedCount(Long FileSuccessedCount) {
        this.FileSuccessedCount = FileSuccessedCount;
    }

    /**
     * Get Number of failed files. 
     * @return FileFailedCount Number of failed files.
     */
    public Long getFileFailedCount() {
        return this.FileFailedCount;
    }

    /**
     * Set Number of failed files.
     * @param FileFailedCount Number of failed files.
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
     * Get Processed file capacity, in Byte.

 
     * @return FileSuccessedSize Processed file capacity, in Byte.


     */
    public Long getFileSuccessedSize() {
        return this.FileSuccessedSize;
    }

    /**
     * Set Processed file capacity, in Byte.


     * @param FileSuccessedSize Processed file capacity, in Byte.


     */
    public void setFileSuccessedSize(Long FileSuccessedSize) {
        this.FileSuccessedSize = FileSuccessedSize;
    }

    /**
     * Get Capacity of processed failed files, in Byte.
 
     * @return FileFailedSize Capacity of processed failed files, in Byte.

     */
    public Long getFileFailedSize() {
        return this.FileFailedSize;
    }

    /**
     * Set Capacity of processed failed files, in Byte.

     * @param FileFailedSize Capacity of processed failed files, in Byte.

     */
    public void setFileFailedSize(Long FileFailedSize) {
        this.FileFailedSize = FileFailedSize;
    }

    /**
     * Get Total file list. 
     * @return FileTotalList Total file list.
     */
    public String getFileTotalList() {
        return this.FileTotalList;
    }

    /**
     * Set Total file list.
     * @param FileTotalList Total file list.
     */
    public void setFileTotalList(String FileTotalList) {
        this.FileTotalList = FileTotalList;
    }

    /**
     * Get List of successful files. 
     * @return FileSuccessedList List of successful files.
     */
    public String getFileSuccessedList() {
        return this.FileSuccessedList;
    }

    /**
     * Set List of successful files.
     * @param FileSuccessedList List of successful files.
     */
    public void setFileSuccessedList(String FileSuccessedList) {
        this.FileSuccessedList = FileSuccessedList;
    }

    /**
     * Get List of failed files. 
     * @return FileFailedList List of failed files.
     */
    public String getFileFailedList() {
        return this.FileFailedList;
    }

    /**
     * Set List of failed files.
     * @param FileFailedList List of failed files.
     */
    public void setFileFailedList(String FileFailedList) {
        this.FileFailedList = FileFailedList;
    }

    /**
     * Get FileSystemId 
     * @return FileSystemId FileSystemId
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set FileSystemId
     * @param FileSystemId FileSystemId
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task path. 
     * @return TaskPath Task path.
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set Task path.
     * @param TaskPath Task path.
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get Task type, archive: indicates settlement task, restore: indicates pull task. 
     * @return Type Task type, archive: indicates settlement task, restore: indicates pull task.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type, archive: indicates settlement task, restore: indicates pull task.
     * @param Type Task type, archive: indicates settlement task, restore: indicates pull task.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Data flow Id. 
     * @return DataFlowId Data flow Id.
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set Data flow Id.
     * @param DataFlowId Data flow Id.
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time, it does not release hot data storage).
Default false when empty. 
     * @return IsOverwrite When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time, it does not release hot data storage).
Default false when empty.
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time, it does not release hot data storage).
Default false when empty.
     * @param IsOverwrite When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time, it does not release hot data storage).
Default false when empty.
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
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

    }
}

