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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopWebRecordRequest extends AbstractModel {

    /**
    * The ID of the task that needs to be stopped
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get The ID of the task that needs to be stopped 
     * @return TaskId The ID of the task that needs to be stopped
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The ID of the task that needs to be stopped
     * @param TaskId The ID of the task that needs to be stopped
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public StopWebRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopWebRecordRequest(StopWebRecordRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

