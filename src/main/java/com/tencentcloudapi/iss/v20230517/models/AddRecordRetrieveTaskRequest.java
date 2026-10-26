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

public class AddRecordRetrieveTaskRequest extends AbstractModel {

    /**
    * Task name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The name must be globally unique and cannot be empty or repeated.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Start time for retrieving the video recording in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for retrieving the video recording, in UTC seconds, for example: 1662114146. The period between the start and end times can be up to one day and cannot span multiple days.
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
    * Retrieval replica validity period of the video recording. Minimum: 1 day. Maximum: 365 days.
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * Device channel. A task can contain up to 32 device channels.
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * Retrieve the task description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
     * Get Task name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The name must be globally unique and cannot be empty or repeated. 
     * @return TaskName Task name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The name must be globally unique and cannot be empty or repeated.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The name must be globally unique and cannot be empty or repeated.
     * @param TaskName Task name. It supports Chinese, English, digits, _, and -, with a length not exceeding 32 characters. The name must be globally unique and cannot be empty or repeated.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Start time for retrieving the video recording in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days. 
     * @return StartTime Start time for retrieving the video recording in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for retrieving the video recording in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     * @param StartTime Start time for retrieving the video recording in UTC seconds, for example: 1662114146. The longest period between the start and end times is one day and cannot span multiple days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for retrieving the video recording, in UTC seconds, for example: 1662114146. The period between the start and end times can be up to one day and cannot span multiple days. 
     * @return EndTime End time for retrieving the video recording, in UTC seconds, for example: 1662114146. The period between the start and end times can be up to one day and cannot span multiple days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for retrieving the video recording, in UTC seconds, for example: 1662114146. The period between the start and end times can be up to one day and cannot span multiple days.
     * @param EndTime End time for retrieving the video recording, in UTC seconds, for example: 1662114146. The period between the start and end times can be up to one day and cannot span multiple days.
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
     * Get Retrieval replica validity period of the video recording. Minimum: 1 day. Maximum: 365 days. 
     * @return Expiration Retrieval replica validity period of the video recording. Minimum: 1 day. Maximum: 365 days.
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Retrieval replica validity period of the video recording. Minimum: 1 day. Maximum: 365 days.
     * @param Expiration Retrieval replica validity period of the video recording. Minimum: 1 day. Maximum: 365 days.
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get Device channel. A task can contain up to 32 device channels. 
     * @return Channels Device channel. A task can contain up to 32 device channels.
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set Device channel. A task can contain up to 32 device channels.
     * @param Channels Device channel. A task can contain up to 32 device channels.
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get Retrieve the task description 
     * @return Describe Retrieve the task description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Retrieve the task description
     * @param Describe Retrieve the task description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    public AddRecordRetrieveTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordRetrieveTaskRequest(AddRecordRetrieveTaskRequest source) {
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
        if (source.Channels != null) {
            this.Channels = new ChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelInfo(source.Channels[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "Describe", this.Describe);

    }
}

