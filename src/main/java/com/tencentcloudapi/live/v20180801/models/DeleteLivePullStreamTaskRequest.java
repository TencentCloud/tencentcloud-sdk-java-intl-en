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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLivePullStreamTaskRequest extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The operator. 
     * @return Operator The operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The operator.
     * @param Operator The operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DeleteLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLivePullStreamTaskRequest(DeleteLivePullStreamTaskRequest source) {
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

