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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogsResponse extends AbstractModel {

    /**
    * Total number of task instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Set of task instance log details
    */
    @SerializedName("TaskInstanceLogSet")
    @Expose
    private TaskInstanceLog [] TaskInstanceLogSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of task instances 
     * @return TotalCount Total number of task instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of task instances
     * @param TotalCount Total number of task instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Set of task instance log details 
     * @return TaskInstanceLogSet Set of task instance log details
     */
    public TaskInstanceLog [] getTaskInstanceLogSet() {
        return this.TaskInstanceLogSet;
    }

    /**
     * Set Set of task instance log details
     * @param TaskInstanceLogSet Set of task instance log details
     */
    public void setTaskInstanceLogSet(TaskInstanceLog [] TaskInstanceLogSet) {
        this.TaskInstanceLogSet = TaskInstanceLogSet;
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

    public DescribeTaskLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogsResponse(DescribeTaskLogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskInstanceLogSet != null) {
            this.TaskInstanceLogSet = new TaskInstanceLog[source.TaskInstanceLogSet.length];
            for (int i = 0; i < source.TaskInstanceLogSet.length; i++) {
                this.TaskInstanceLogSet[i] = new TaskInstanceLog(source.TaskInstanceLogSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TaskInstanceLogSet.", this.TaskInstanceLogSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

