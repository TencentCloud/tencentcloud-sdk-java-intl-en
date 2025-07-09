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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelTaskRequest extends AbstractModel {

    /**
    * This field indicates the task ID (in the `Results` parameter) returned after a video moderation task is created. It is used to identify the moderation task to be canceled.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get This field indicates the task ID (in the `Results` parameter) returned after a video moderation task is created. It is used to identify the moderation task to be canceled. 
     * @return TaskId This field indicates the task ID (in the `Results` parameter) returned after a video moderation task is created. It is used to identify the moderation task to be canceled.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set This field indicates the task ID (in the `Results` parameter) returned after a video moderation task is created. It is used to identify the moderation task to be canceled.
     * @param TaskId This field indicates the task ID (in the `Results` parameter) returned after a video moderation task is created. It is used to identify the moderation task to be canceled.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public CancelTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelTaskRequest(CancelTaskRequest source) {
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

