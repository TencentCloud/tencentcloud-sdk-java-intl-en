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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskExecuteLogsRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Number of returned content lines
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log start line
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Number of returned content lines 
     * @return Limit Number of returned content lines
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned content lines
     * @param Limit Number of returned content lines
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log start line 
     * @return Offset Log start line
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Log start line
     * @param Offset Log start line
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTaskExecuteLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskExecuteLogsRequest(DescribeTaskExecuteLogsRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

