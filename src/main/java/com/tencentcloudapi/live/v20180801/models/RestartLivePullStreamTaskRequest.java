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

public class RestartLivePullStreamTaskRequest extends AbstractModel {

    /**
    * Task Id.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * task operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Task Id. 
     * @return TaskId Task Id.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task Id.
     * @param TaskId Task Id.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get task operator. 
     * @return Operator task operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set task operator.
     * @param Operator task operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public RestartLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartLivePullStreamTaskRequest(RestartLivePullStreamTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

