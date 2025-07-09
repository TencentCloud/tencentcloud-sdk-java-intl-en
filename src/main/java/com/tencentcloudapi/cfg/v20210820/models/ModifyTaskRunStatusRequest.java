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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskRunStatusRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether the execution result meets expectations (This field is required when the task status is Execution Ended.)
    */
    @SerializedName("IsExpect")
    @Expose
    private Boolean IsExpect;

    /**
    * Experiment result (This field is required when the experiment status changes to Execution Ended.)
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

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
     * Get Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended. 
     * @return Status Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
     * @param Status Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the execution result meets expectations (This field is required when the task status is Execution Ended.) 
     * @return IsExpect Whether the execution result meets expectations (This field is required when the task status is Execution Ended.)
     */
    public Boolean getIsExpect() {
        return this.IsExpect;
    }

    /**
     * Set Whether the execution result meets expectations (This field is required when the task status is Execution Ended.)
     * @param IsExpect Whether the execution result meets expectations (This field is required when the task status is Execution Ended.)
     */
    public void setIsExpect(Boolean IsExpect) {
        this.IsExpect = IsExpect;
    }

    /**
     * Get Experiment result (This field is required when the experiment status changes to Execution Ended.) 
     * @return Summary Experiment result (This field is required when the experiment status changes to Execution Ended.)
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Experiment result (This field is required when the experiment status changes to Execution Ended.)
     * @param Summary Experiment result (This field is required when the experiment status changes to Execution Ended.)
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public ModifyTaskRunStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskRunStatusRequest(ModifyTaskRunStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsExpect != null) {
            this.IsExpect = new Boolean(source.IsExpect);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsExpect", this.IsExpect);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

