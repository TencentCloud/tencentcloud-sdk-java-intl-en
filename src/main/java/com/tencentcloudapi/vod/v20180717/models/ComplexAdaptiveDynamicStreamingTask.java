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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexAdaptiveDynamicStreamingTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTaskResultSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskResult [] ComplexAdaptiveDynamicStreamingTaskResultSet;

    /**
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ComplexAdaptiveDynamicStreamingTaskResultSet 
     */
    public ComplexAdaptiveDynamicStreamingTaskResult [] getComplexAdaptiveDynamicStreamingTaskResultSet() {
        return this.ComplexAdaptiveDynamicStreamingTaskResultSet;
    }

    /**
     * Set 
     * @param ComplexAdaptiveDynamicStreamingTaskResultSet 
     */
    public void setComplexAdaptiveDynamicStreamingTaskResultSet(ComplexAdaptiveDynamicStreamingTaskResult [] ComplexAdaptiveDynamicStreamingTaskResultSet) {
        this.ComplexAdaptiveDynamicStreamingTaskResultSet = ComplexAdaptiveDynamicStreamingTaskResultSet;
    }

    public ComplexAdaptiveDynamicStreamingTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplexAdaptiveDynamicStreamingTaskResultSet != null) {
            this.ComplexAdaptiveDynamicStreamingTaskResultSet = new ComplexAdaptiveDynamicStreamingTaskResult[source.ComplexAdaptiveDynamicStreamingTaskResultSet.length];
            for (int i = 0; i < source.ComplexAdaptiveDynamicStreamingTaskResultSet.length; i++) {
                this.ComplexAdaptiveDynamicStreamingTaskResultSet[i] = new ComplexAdaptiveDynamicStreamingTaskResult(source.ComplexAdaptiveDynamicStreamingTaskResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ComplexAdaptiveDynamicStreamingTaskResultSet.", this.ComplexAdaptiveDynamicStreamingTaskResultSet);

    }
}

