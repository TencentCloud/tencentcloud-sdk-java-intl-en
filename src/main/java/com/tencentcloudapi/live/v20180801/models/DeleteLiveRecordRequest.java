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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveRecordRequest extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Task ID, which uniquely identifies a recording task globally.
Get the `TaskId` from the returned value of the [CreateLiveRecord](/document/product/267/30148) API.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Task ID, which uniquely identifies a recording task globally.
Get the `TaskId` from the returned value of the [CreateLiveRecord](/document/product/267/30148) API. 
     * @return TaskId Task ID, which uniquely identifies a recording task globally.
Get the `TaskId` from the returned value of the [CreateLiveRecord](/document/product/267/30148) API.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, which uniquely identifies a recording task globally.
Get the `TaskId` from the returned value of the [CreateLiveRecord](/document/product/267/30148) API.
     * @param TaskId Task ID, which uniquely identifies a recording task globally.
Get the `TaskId` from the returned value of the [CreateLiveRecord](/document/product/267/30148) API.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

