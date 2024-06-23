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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationStatisticsTaskStatusRequest extends AbstractModel {

    /**
    * Task Type (Real-time: 201, Offline: 202)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Query Date
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
    * Resource Group ID
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
     * Get Task Type (Real-time: 201, Offline: 202) 
     * @return TaskType Task Type (Real-time: 201, Offline: 202)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type (Real-time: 201, Offline: 202)
     * @param TaskType Task Type (Real-time: 201, Offline: 202)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Query Date 
     * @return QueryDate Query Date
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set Query Date
     * @param QueryDate Query Date
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    /**
     * Get Resource Group ID 
     * @return ExecutorGroupId Resource Group ID
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Resource Group ID
     * @param ExecutorGroupId Resource Group ID
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    public DescribeIntegrationStatisticsTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationStatisticsTaskStatusRequest(DescribeIntegrationStatisticsTaskStatusRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);

    }
}

