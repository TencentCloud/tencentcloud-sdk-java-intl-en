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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel {

    /**
    * Scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Task ID.
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * Task status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get Scan time 
     * @return ScanTime Scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
     * @param ScanTime Scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Task ID. 
     * @return TaskID Task ID.
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set Task ID.
     * @param TaskID Task ID.
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get Task status. 
     * @return Status Task status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
     * @param Status Task status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

