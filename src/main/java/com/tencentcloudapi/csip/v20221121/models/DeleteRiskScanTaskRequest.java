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

public class DeleteRiskScanTaskRequest extends AbstractModel {

    /**
    * List of task IDs
    */
    @SerializedName("TaskIdList")
    @Expose
    private TaskIdListKey [] TaskIdList;

    /**
     * Get List of task IDs 
     * @return TaskIdList List of task IDs
     */
    public TaskIdListKey [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set List of task IDs
     * @param TaskIdList List of task IDs
     */
    public void setTaskIdList(TaskIdListKey [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    public DeleteRiskScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRiskScanTaskRequest(DeleteRiskScanTaskRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new TaskIdListKey[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new TaskIdListKey(source.TaskIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskIdList.", this.TaskIdList);

    }
}

