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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildIndexTaskInfo extends AbstractModel {

    /**
    * Reindexing task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Current status of the reindexing task. 0: reindexing task created; 1: creating reindexing resources; 2: reindexing resources created; 3: reindexing; 4: paused; 5: reindexing completed; 6: reindexing succeeded (searchable); 7: reindexing failed; 8: revoked; 9: deleting the metadata and index.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Start timestamp of the reindexing task
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Rebuild task end timestamp
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Estimated remaining time for reshipping, in seconds
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * Rebuild task creation timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Re-shipping completion degree, in percentages.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Update time of the reindexing task
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Additional status description. Currently, it only describes the reason for failure.
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
     * Get Reindexing task ID 
     * @return TaskId Reindexing task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Reindexing task ID
     * @param TaskId Reindexing task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Current status of the reindexing task. 0: reindexing task created; 1: creating reindexing resources; 2: reindexing resources created; 3: reindexing; 4: paused; 5: reindexing completed; 6: reindexing succeeded (searchable); 7: reindexing failed; 8: revoked; 9: deleting the metadata and index. 
     * @return Status Current status of the reindexing task. 0: reindexing task created; 1: creating reindexing resources; 2: reindexing resources created; 3: reindexing; 4: paused; 5: reindexing completed; 6: reindexing succeeded (searchable); 7: reindexing failed; 8: revoked; 9: deleting the metadata and index.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current status of the reindexing task. 0: reindexing task created; 1: creating reindexing resources; 2: reindexing resources created; 3: reindexing; 4: paused; 5: reindexing completed; 6: reindexing succeeded (searchable); 7: reindexing failed; 8: revoked; 9: deleting the metadata and index.
     * @param Status Current status of the reindexing task. 0: reindexing task created; 1: creating reindexing resources; 2: reindexing resources created; 3: reindexing; 4: paused; 5: reindexing completed; 6: reindexing succeeded (searchable); 7: reindexing failed; 8: revoked; 9: deleting the metadata and index.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Start timestamp of the reindexing task 
     * @return StartTime Start timestamp of the reindexing task
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp of the reindexing task
     * @param StartTime Start timestamp of the reindexing task
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Rebuild task end timestamp 
     * @return EndTime Rebuild task end timestamp
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Rebuild task end timestamp
     * @param EndTime Rebuild task end timestamp
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Estimated remaining time for reshipping, in seconds 
     * @return RemainTime Estimated remaining time for reshipping, in seconds
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set Estimated remaining time for reshipping, in seconds
     * @param RemainTime Estimated remaining time for reshipping, in seconds
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get Rebuild task creation timestamp 
     * @return CreateTime Rebuild task creation timestamp
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Rebuild task creation timestamp
     * @param CreateTime Rebuild task creation timestamp
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Re-shipping completion degree, in percentages. 
     * @return Progress Re-shipping completion degree, in percentages.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Re-shipping completion degree, in percentages.
     * @param Progress Re-shipping completion degree, in percentages.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Update time of the reindexing task 
     * @return UpdateTime Update time of the reindexing task
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time of the reindexing task
     * @param UpdateTime Update time of the reindexing task
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Additional status description. Currently, it only describes the reason for failure. 
     * @return StatusMessage Additional status description. Currently, it only describes the reason for failure.
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set Additional status description. Currently, it only describes the reason for failure.
     * @param StatusMessage Additional status description. Currently, it only describes the reason for failure.
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    public RebuildIndexTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildIndexTaskInfo(RebuildIndexTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RemainTime != null) {
            this.RemainTime = new Long(source.RemainTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RemainTime", this.RemainTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);

    }
}

