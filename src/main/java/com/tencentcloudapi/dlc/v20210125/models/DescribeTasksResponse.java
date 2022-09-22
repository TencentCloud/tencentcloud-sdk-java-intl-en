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

public class DescribeTasksResponse extends AbstractModel{

    /**
    * List of task objects.
    */
    @SerializedName("TaskList")
    @Expose
    private TaskResponseInfo [] TaskList;

    /**
    * Total number of instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The task overview.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TasksOverview")
    @Expose
    private TasksOverview TasksOverview;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of task objects. 
     * @return TaskList List of task objects.
     */
    public TaskResponseInfo [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set List of task objects.
     * @param TaskList List of task objects.
     */
    public void setTaskList(TaskResponseInfo [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get Total number of instances 
     * @return TotalCount Total number of instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of instances
     * @param TotalCount Total number of instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The task overview.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TasksOverview The task overview.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TasksOverview getTasksOverview() {
        return this.TasksOverview;
    }

    /**
     * Set The task overview.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TasksOverview The task overview.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTasksOverview(TasksOverview TasksOverview) {
        this.TasksOverview = TasksOverview;
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

    public DescribeTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksResponse(DescribeTasksResponse source) {
        if (source.TaskList != null) {
            this.TaskList = new TaskResponseInfo[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new TaskResponseInfo(source.TaskList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TasksOverview != null) {
            this.TasksOverview = new TasksOverview(source.TasksOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "TasksOverview.", this.TasksOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

