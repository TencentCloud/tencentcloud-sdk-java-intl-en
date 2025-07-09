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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateIntegrationTaskAlarmsRequest extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Alert Configuration Information
    */
    @SerializedName("TaskAlarmInfo")
    @Expose
    private TaskAlarmInfo TaskAlarmInfo;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Task ID. 
     * @return TaskIds Task ID.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task ID.
     * @param TaskIds Task ID.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Alert Configuration Information 
     * @return TaskAlarmInfo Alert Configuration Information
     */
    public TaskAlarmInfo getTaskAlarmInfo() {
        return this.TaskAlarmInfo;
    }

    /**
     * Set Alert Configuration Information
     * @param TaskAlarmInfo Alert Configuration Information
     */
    public void setTaskAlarmInfo(TaskAlarmInfo TaskAlarmInfo) {
        this.TaskAlarmInfo = TaskAlarmInfo;
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

    public BatchCreateIntegrationTaskAlarmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateIntegrationTaskAlarmsRequest(BatchCreateIntegrationTaskAlarmsRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TaskAlarmInfo != null) {
            this.TaskAlarmInfo = new TaskAlarmInfo(source.TaskAlarmInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamObj(map, prefix + "TaskAlarmInfo.", this.TaskAlarmInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

