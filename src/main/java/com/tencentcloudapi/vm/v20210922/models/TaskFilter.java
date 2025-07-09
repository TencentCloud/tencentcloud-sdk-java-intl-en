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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFilter extends AbstractModel {

    /**
    * Task type
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * Task type. Values: `VIDEO`, `AUDIO`, `LIVE_VIDEO`, and `LIVE_AUDIO`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Suggestion. Values: `Pass`, `Review`, and `Block`.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Task status. Values: `PENDING`, `RUNNING`, `ERROR`, `FINISH`, and `CANCELLED`.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get Task type 
     * @return BizType Task type
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Task type
     * @param BizType Task type
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Task type. Values: `VIDEO`, `AUDIO`, `LIVE_VIDEO`, and `LIVE_AUDIO`. 
     * @return Type Task type. Values: `VIDEO`, `AUDIO`, `LIVE_VIDEO`, and `LIVE_AUDIO`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Values: `VIDEO`, `AUDIO`, `LIVE_VIDEO`, and `LIVE_AUDIO`.
     * @param Type Task type. Values: `VIDEO`, `AUDIO`, `LIVE_VIDEO`, and `LIVE_AUDIO`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Suggestion. Values: `Pass`, `Review`, and `Block`. 
     * @return Suggestion Suggestion. Values: `Pass`, `Review`, and `Block`.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion. Values: `Pass`, `Review`, and `Block`.
     * @param Suggestion Suggestion. Values: `Pass`, `Review`, and `Block`.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Task status. Values: `PENDING`, `RUNNING`, `ERROR`, `FINISH`, and `CANCELLED`. 
     * @return TaskStatus Task status. Values: `PENDING`, `RUNNING`, `ERROR`, `FINISH`, and `CANCELLED`.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. Values: `PENDING`, `RUNNING`, `ERROR`, `FINISH`, and `CANCELLED`.
     * @param TaskStatus Task status. Values: `PENDING`, `RUNNING`, `ERROR`, `FINISH`, and `CANCELLED`.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public TaskFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFilter(TaskFilter source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

