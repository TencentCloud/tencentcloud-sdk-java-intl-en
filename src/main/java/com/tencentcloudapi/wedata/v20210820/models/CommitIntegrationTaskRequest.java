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

public class CommitIntegrationTaskRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 0. Only submit, 1. Start immediately, 2. Stop online jobs, discard job state data, restart, 3. Pause online jobs, keep job state data, continue running, 4. Keep job state data, continue running
    */
    @SerializedName("CommitType")
    @Expose
    private Long CommitType;

    /**
    * Real-time task 201 Offline task 202 Default is real-time task
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Additional parameters
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * Submit version description
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * Submit version number
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * Describe the type of front-end operation
    */
    @SerializedName("EventDesc")
    @Expose
    private String EventDesc;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 0. Only submit, 1. Start immediately, 2. Stop online jobs, discard job state data, restart, 3. Pause online jobs, keep job state data, continue running, 4. Keep job state data, continue running 
     * @return CommitType 0. Only submit, 1. Start immediately, 2. Stop online jobs, discard job state data, restart, 3. Pause online jobs, keep job state data, continue running, 4. Keep job state data, continue running
     */
    public Long getCommitType() {
        return this.CommitType;
    }

    /**
     * Set 0. Only submit, 1. Start immediately, 2. Stop online jobs, discard job state data, restart, 3. Pause online jobs, keep job state data, continue running, 4. Keep job state data, continue running
     * @param CommitType 0. Only submit, 1. Start immediately, 2. Stop online jobs, discard job state data, restart, 3. Pause online jobs, keep job state data, continue running, 4. Keep job state data, continue running
     */
    public void setCommitType(Long CommitType) {
        this.CommitType = CommitType;
    }

    /**
     * Get Real-time task 201 Offline task 202 Default is real-time task 
     * @return TaskType Real-time task 201 Offline task 202 Default is real-time task
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Real-time task 201 Offline task 202 Default is real-time task
     * @param TaskType Real-time task 201 Offline task 202 Default is real-time task
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Additional parameters 
     * @return ExtConfig Additional parameters
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set Additional parameters
     * @param ExtConfig Additional parameters
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get Submit version description 
     * @return VersionDesc Submit version description
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set Submit version description
     * @param VersionDesc Submit version description
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get Submit version number 
     * @return InstanceVersion Submit version number
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Submit version number
     * @param InstanceVersion Submit version number
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Describe the type of front-end operation 
     * @return EventDesc Describe the type of front-end operation
     */
    public String getEventDesc() {
        return this.EventDesc;
    }

    /**
     * Set Describe the type of front-end operation
     * @param EventDesc Describe the type of front-end operation
     */
    public void setEventDesc(String EventDesc) {
        this.EventDesc = EventDesc;
    }

    public CommitIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitIntegrationTaskRequest(CommitIntegrationTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CommitType != null) {
            this.CommitType = new Long(source.CommitType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.EventDesc != null) {
            this.EventDesc = new String(source.EventDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CommitType", this.CommitType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "EventDesc", this.EventDesc);

    }
}

