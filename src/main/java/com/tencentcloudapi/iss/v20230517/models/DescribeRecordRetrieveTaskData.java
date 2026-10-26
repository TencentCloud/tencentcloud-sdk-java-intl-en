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

public class DescribeRecordRetrieveTaskData extends AbstractModel {

    /**
    * Retrieval task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name for retrieval
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
    * Retrieval mode. 1: speed mode. Others not supported currently.
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
    * Task status. 0: Retrieved, 1: Retrieving, 2: To be retrieved
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
    * Task device channel id
    */
    @SerializedName("Channels")
    @Expose
    private RecordRetrieveTaskChannelInfo [] Channels;

    /**
    * Task description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Number of task channels
    */
    @SerializedName("ChannelCount")
    @Expose
    private Long ChannelCount;

    /**
     * Get Retrieval task ID 
     * @return TaskId Retrieval task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Retrieval task ID
     * @param TaskId Retrieval task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name for retrieval 
     * @return TaskName Task name for retrieval
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name for retrieval
     * @param TaskName Task name for retrieval
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
     * Get Retrieval mode. 1: speed mode. Others not supported currently. 
     * @return Mode Retrieval mode. 1: speed mode. Others not supported currently.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Retrieval mode. 1: speed mode. Others not supported currently.
     * @param Mode Retrieval mode. 1: speed mode. Others not supported currently.
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
     * Get Task status. 0: Retrieved, 1: Retrieving, 2: To be retrieved 
     * @return Status Task status. 0: Retrieved, 1: Retrieving, 2: To be retrieved
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: Retrieved, 1: Retrieving, 2: To be retrieved
     * @param Status Task status. 0: Retrieved, 1: Retrieving, 2: To be retrieved
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
     * Get Task device channel id 
     * @return Channels Task device channel id
     */
    public RecordRetrieveTaskChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set Task device channel id
     * @param Channels Task device channel id
     */
    public void setChannels(RecordRetrieveTaskChannelInfo [] Channels) {
        this.Channels = Channels;
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

    /**
     * Get Number of task channels 
     * @return ChannelCount Number of task channels
     */
    public Long getChannelCount() {
        return this.ChannelCount;
    }

    /**
     * Set Number of task channels
     * @param ChannelCount Number of task channels
     */
    public void setChannelCount(Long ChannelCount) {
        this.ChannelCount = ChannelCount;
    }

    public DescribeRecordRetrieveTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordRetrieveTaskData(DescribeRecordRetrieveTaskData source) {
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
        if (source.Channels != null) {
            this.Channels = new RecordRetrieveTaskChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new RecordRetrieveTaskChannelInfo(source.Channels[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.ChannelCount != null) {
            this.ChannelCount = new Long(source.ChannelCount);
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
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "ChannelCount", this.ChannelCount);

    }
}

