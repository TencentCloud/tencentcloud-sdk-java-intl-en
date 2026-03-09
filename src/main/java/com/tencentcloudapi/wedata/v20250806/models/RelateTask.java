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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelateTask extends AbstractModel {

    /**
    * Task type

-OfflineIntegration --- offline integration task.
-RealtimeIntegration --- real-time integration task.
-DataDevelopment - data development task.
-DataQuality - data quality tasks.
-DataService - data service task.
-MetadataCollection --- metadata collection task.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Number of Tasks
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * Task details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskList")
    @Expose
    private BriefTask [] TaskList;

    /**
     * Get Task type

-OfflineIntegration --- offline integration task.
-RealtimeIntegration --- real-time integration task.
-DataDevelopment - data development task.
-DataQuality - data quality tasks.
-DataService - data service task.
-MetadataCollection --- metadata collection task. 
     * @return TaskType Task type

-OfflineIntegration --- offline integration task.
-RealtimeIntegration --- real-time integration task.
-DataDevelopment - data development task.
-DataQuality - data quality tasks.
-DataService - data service task.
-MetadataCollection --- metadata collection task.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type

-OfflineIntegration --- offline integration task.
-RealtimeIntegration --- real-time integration task.
-DataDevelopment - data development task.
-DataQuality - data quality tasks.
-DataService - data service task.
-MetadataCollection --- metadata collection task.
     * @param TaskType Task type

-OfflineIntegration --- offline integration task.
-RealtimeIntegration --- real-time integration task.
-DataDevelopment - data development task.
-DataQuality - data quality tasks.
-DataService - data service task.
-MetadataCollection --- metadata collection task.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Number of Tasks 
     * @return TaskNum Number of Tasks
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set Number of Tasks
     * @param TaskNum Number of Tasks
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get Task details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskList Task details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BriefTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set Task details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskList Task details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskList(BriefTask [] TaskList) {
        this.TaskList = TaskList;
    }

    public RelateTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelateTask(RelateTask source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskNum != null) {
            this.TaskNum = new Long(source.TaskNum);
        }
        if (source.TaskList != null) {
            this.TaskList = new BriefTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new BriefTask(source.TaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);

    }
}

