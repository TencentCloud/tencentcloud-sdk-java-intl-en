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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRecordRetrieveTaskData extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Start time of video recording retrieval
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Retrieval end time of the video recording
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Retrieval mode. 1: ultrafast mode. Others not supported currently.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Replica validity period
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * Task status. 0: retrieved, 1: retrieving, 2: pending retrieval
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Retrieval capacity, in MB.
    */
    @SerializedName("Capacity")
    @Expose
    private Float Capacity;

    /**
    * Task description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

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
     * Get Start time of video recording retrieval 
     * @return StartTime Start time of video recording retrieval
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of video recording retrieval
     * @param StartTime Start time of video recording retrieval
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Retrieval end time of the video recording 
     * @return EndTime Retrieval end time of the video recording
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Retrieval end time of the video recording
     * @param EndTime Retrieval end time of the video recording
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Retrieval mode. 1: ultrafast mode. Others not supported currently. 
     * @return Mode Retrieval mode. 1: ultrafast mode. Others not supported currently.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Retrieval mode. 1: ultrafast mode. Others not supported currently.
     * @param Mode Retrieval mode. 1: ultrafast mode. Others not supported currently.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Replica validity period 
     * @return Expiration Replica validity period
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Replica validity period
     * @param Expiration Replica validity period
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get Task status. 0: retrieved, 1: retrieving, 2: pending retrieval 
     * @return Status Task status. 0: retrieved, 1: retrieving, 2: pending retrieval
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: retrieved, 1: retrieving, 2: pending retrieval
     * @param Status Task status. 0: retrieved, 1: retrieving, 2: pending retrieval
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Retrieval capacity, in MB. 
     * @return Capacity Retrieval capacity, in MB.
     */
    public Float getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Retrieval capacity, in MB.
     * @param Capacity Retrieval capacity, in MB.
     */
    public void setCapacity(Float Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get Task description 
     * @return Describe Task description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Task description
     * @param Describe Task description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    public AddRecordRetrieveTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordRetrieveTaskData(AddRecordRetrieveTaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Capacity != null) {
            this.Capacity = new Float(source.Capacity);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "Describe", this.Describe);

    }
}

