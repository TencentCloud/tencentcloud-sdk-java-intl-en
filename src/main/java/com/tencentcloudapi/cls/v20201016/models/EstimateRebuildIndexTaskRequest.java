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

public class EstimateRebuildIndexTaskRequest extends AbstractModel {

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Estimated task start time, in milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Estimated end time of the task, in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Estimated task start time, in milliseconds 
     * @return StartTime Estimated task start time, in milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Estimated task start time, in milliseconds
     * @param StartTime Estimated task start time, in milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Estimated end time of the task, in milliseconds. 
     * @return EndTime Estimated end time of the task, in milliseconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Estimated end time of the task, in milliseconds.
     * @param EndTime Estimated end time of the task, in milliseconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public EstimateRebuildIndexTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EstimateRebuildIndexTaskRequest(EstimateRebuildIndexTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

