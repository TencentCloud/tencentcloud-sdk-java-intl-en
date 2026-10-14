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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessDetail extends AbstractModel {

    /**
    * <p>Number of completed</p>
    */
    @SerializedName("Completed")
    @Expose
    private Long Completed;

    /**
    * <p>Remaining quantity</p>
    */
    @SerializedName("Remain")
    @Expose
    private Long Remain;

    /**
    * <p>Total quantity.</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>Task type:<br>60: Restart task<br>70: Shard migration task<br>80: Node configuration modification task</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>Estimated remaining time</p><p>Unit: seconds</p>
    */
    @SerializedName("EstimatedTimeRemaining")
    @Expose
    private Long EstimatedTimeRemaining;

    /**
     * Get <p>Number of completed</p> 
     * @return Completed <p>Number of completed</p>
     */
    public Long getCompleted() {
        return this.Completed;
    }

    /**
     * Set <p>Number of completed</p>
     * @param Completed <p>Number of completed</p>
     */
    public void setCompleted(Long Completed) {
        this.Completed = Completed;
    }

    /**
     * Get <p>Remaining quantity</p> 
     * @return Remain <p>Remaining quantity</p>
     */
    public Long getRemain() {
        return this.Remain;
    }

    /**
     * Set <p>Remaining quantity</p>
     * @param Remain <p>Remaining quantity</p>
     */
    public void setRemain(Long Remain) {
        this.Remain = Remain;
    }

    /**
     * Get <p>Total quantity.</p> 
     * @return Total <p>Total quantity.</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>Total quantity.</p>
     * @param Total <p>Total quantity.</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>Task type:<br>60: Restart task<br>70: Shard migration task<br>80: Node configuration modification task</p> 
     * @return TaskType <p>Task type:<br>60: Restart task<br>70: Shard migration task<br>80: Node configuration modification task</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type:<br>60: Restart task<br>70: Shard migration task<br>80: Node configuration modification task</p>
     * @param TaskType <p>Task type:<br>60: Restart task<br>70: Shard migration task<br>80: Node configuration modification task</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Estimated remaining time</p><p>Unit: seconds</p> 
     * @return EstimatedTimeRemaining <p>Estimated remaining time</p><p>Unit: seconds</p>
     */
    public Long getEstimatedTimeRemaining() {
        return this.EstimatedTimeRemaining;
    }

    /**
     * Set <p>Estimated remaining time</p><p>Unit: seconds</p>
     * @param EstimatedTimeRemaining <p>Estimated remaining time</p><p>Unit: seconds</p>
     */
    public void setEstimatedTimeRemaining(Long EstimatedTimeRemaining) {
        this.EstimatedTimeRemaining = EstimatedTimeRemaining;
    }

    public ProcessDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessDetail(ProcessDetail source) {
        if (source.Completed != null) {
            this.Completed = new Long(source.Completed);
        }
        if (source.Remain != null) {
            this.Remain = new Long(source.Remain);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.EstimatedTimeRemaining != null) {
            this.EstimatedTimeRemaining = new Long(source.EstimatedTimeRemaining);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "EstimatedTimeRemaining", this.EstimatedTimeRemaining);

    }
}

