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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveRecordRequest extends AbstractModel {

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Task ID returned by the `CreateLiveRecord` API.
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
     * Get Task ID returned by the `CreateLiveRecord` API. 
     * @return TaskId Task ID returned by the `CreateLiveRecord` API.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID returned by the `CreateLiveRecord` API.
     * @param TaskId Task ID returned by the `CreateLiveRecord` API.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DeleteLiveRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLiveRecordRequest(DeleteLiveRecordRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

