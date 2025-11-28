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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * Download task type. 0: slow log; 1: error log.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * File size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Task status. 0: initialized; 1: running; 2: successful; 3: failed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Percentage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Download URL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Download task type. 0: slow log; 1: error log. 
     * @return TaskType Download task type. 0: slow log; 1: error log.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Download task type. 0: slow log; 1: error log.
     * @param TaskType Download task type. 0: slow log; 1: error log.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

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
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get File size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileSize File size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileSize File size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Task status. 0: initialized; 1: running; 2: successful; 3: failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status. 0: initialized; 1: running; 2: successful; 3: failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: initialized; 1: running; 2: successful; 3: failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status. 0: initialized; 1: running; 2: successful; 3: failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Percentage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Download URL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Download URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Download URL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Download URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

