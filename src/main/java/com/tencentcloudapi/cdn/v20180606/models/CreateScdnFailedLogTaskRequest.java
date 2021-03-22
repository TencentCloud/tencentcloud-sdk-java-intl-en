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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScdnFailedLogTaskRequest extends AbstractModel{

    /**
    * ID of the failed task to retry
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Region. Valid values: `mainland` and `overseas`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get ID of the failed task to retry 
     * @return TaskId ID of the failed task to retry
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the failed task to retry
     * @param TaskId ID of the failed task to retry
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Region. Valid values: `mainland` and `overseas`. 
     * @return Area Region. Valid values: `mainland` and `overseas`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region. Valid values: `mainland` and `overseas`.
     * @param Area Region. Valid values: `mainland` and `overseas`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

