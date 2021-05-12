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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation extends AbstractModel{

    /**
    * Unique operation ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Operation start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operation type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Operation details
    */
    @SerializedName("Detail")
    @Expose
    private OperationDetail Detail;

    /**
    * Operation result
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Workflow task information
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDetail [] Tasks;

    /**
    * Operation progress
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
     * Get Unique operation ID 
     * @return Id Unique operation ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique operation ID
     * @param Id Unique operation ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Operation start time 
     * @return StartTime Operation start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Operation start time
     * @param StartTime Operation start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operation type 
     * @return Type Operation type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type
     * @param Type Operation type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Operation details 
     * @return Detail Operation details
     */
    public OperationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set Operation details
     * @param Detail Operation details
     */
    public void setDetail(OperationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Operation result 
     * @return Result Operation result
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Operation result
     * @param Result Operation result
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Workflow task information 
     * @return Tasks Workflow task information
     */
    public TaskDetail [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Workflow task information
     * @param Tasks Workflow task information
     */
    public void setTasks(TaskDetail [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Operation progress 
     * @return Progress Operation progress
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Operation progress
     * @param Progress Operation progress
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    public Operation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Operation(Operation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Detail != null) {
            this.Detail = new OperationDetail(source.Detail);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskDetail[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskDetail(source.Tasks[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

