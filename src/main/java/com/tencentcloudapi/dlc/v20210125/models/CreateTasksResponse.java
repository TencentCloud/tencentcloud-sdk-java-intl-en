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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTasksResponse extends AbstractModel{

    /**
    * ID of the current batch of submitted tasks
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * Collection of task IDs arranged in order of execution
    */
    @SerializedName("TaskIdSet")
    @Expose
    private String [] TaskIdSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the current batch of submitted tasks 
     * @return BatchId ID of the current batch of submitted tasks
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set ID of the current batch of submitted tasks
     * @param BatchId ID of the current batch of submitted tasks
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get Collection of task IDs arranged in order of execution 
     * @return TaskIdSet Collection of task IDs arranged in order of execution
     */
    public String [] getTaskIdSet() {
        return this.TaskIdSet;
    }

    /**
     * Set Collection of task IDs arranged in order of execution
     * @param TaskIdSet Collection of task IDs arranged in order of execution
     */
    public void setTaskIdSet(String [] TaskIdSet) {
        this.TaskIdSet = TaskIdSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTasksResponse(CreateTasksResponse source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskIdSet != null) {
            this.TaskIdSet = new String[source.TaskIdSet.length];
            for (int i = 0; i < source.TaskIdSet.length; i++) {
                this.TaskIdSet[i] = new String(source.TaskIdSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamArraySimple(map, prefix + "TaskIdSet.", this.TaskIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

