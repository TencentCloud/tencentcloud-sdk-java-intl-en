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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppTasksResponse extends AbstractModel {

    /**
    * Task result (this field has been disused)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private TaskResponseInfo Tasks;

    /**
    * Total number of tasks
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of task results
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparkAppTasks")
    @Expose
    private TaskResponseInfo [] SparkAppTasks;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task result (this field has been disused)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tasks Task result (this field has been disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskResponseInfo getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task result (this field has been disused)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tasks Task result (this field has been disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTasks(TaskResponseInfo Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Total number of tasks 
     * @return TotalCount Total number of tasks
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of tasks
     * @param TotalCount Total number of tasks
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of task results
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparkAppTasks List of task results
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskResponseInfo [] getSparkAppTasks() {
        return this.SparkAppTasks;
    }

    /**
     * Set List of task results
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparkAppTasks List of task results
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparkAppTasks(TaskResponseInfo [] SparkAppTasks) {
        this.SparkAppTasks = SparkAppTasks;
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

    public DescribeSparkAppTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppTasksResponse(DescribeSparkAppTasksResponse source) {
        if (source.Tasks != null) {
            this.Tasks = new TaskResponseInfo(source.Tasks);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SparkAppTasks != null) {
            this.SparkAppTasks = new TaskResponseInfo[source.SparkAppTasks.length];
            for (int i = 0; i < source.SparkAppTasks.length; i++) {
                this.SparkAppTasks[i] = new TaskResponseInfo(source.SparkAppTasks[i]);
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
        this.setParamObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SparkAppTasks.", this.SparkAppTasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

