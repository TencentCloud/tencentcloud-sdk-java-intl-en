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

public class DescribeAIScheduleTaskDetailRequest extends AbstractModel {

    /**
    * <p>Task ID. You can obtain it through the DescribeAIScheduleTaskList API.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get <p>Task ID. You can obtain it through the DescribeAIScheduleTaskList API.</p> 
     * @return TaskId <p>Task ID. You can obtain it through the DescribeAIScheduleTaskList API.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID. You can obtain it through the DescribeAIScheduleTaskList API.</p>
     * @param TaskId <p>Task ID. You can obtain it through the DescribeAIScheduleTaskList API.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeAIScheduleTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIScheduleTaskDetailRequest(DescribeAIScheduleTaskDetailRequest source) {
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

