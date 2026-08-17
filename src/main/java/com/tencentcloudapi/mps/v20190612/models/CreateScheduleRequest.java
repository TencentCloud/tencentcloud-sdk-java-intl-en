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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduleRequest extends AbstractModel {

    /**
    * Orchestration name, up to 128 characters. The name is unique for the same user.
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * Orchestrate the bound trigger rule. The orchestration is triggered when an uploaded video hits the rule for the object.
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * Orchestration task list.
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * Media Processing Service output storage location. If left blank, it inherits the storage location from Trigger.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left empty, it is the same as the directory of the trigger file.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Event notification configuration of the task. If left blank, it indicates that no event notification will be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Orchestration name, up to 128 characters. The name is unique for the same user. 
     * @return ScheduleName Orchestration name, up to 128 characters. The name is unique for the same user.
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set Orchestration name, up to 128 characters. The name is unique for the same user.
     * @param ScheduleName Orchestration name, up to 128 characters. The name is unique for the same user.
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get Orchestrate the bound trigger rule. The orchestration is triggered when an uploaded video hits the rule for the object. 
     * @return Trigger Orchestrate the bound trigger rule. The orchestration is triggered when an uploaded video hits the rule for the object.
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Orchestrate the bound trigger rule. The orchestration is triggered when an uploaded video hits the rule for the object.
     * @param Trigger Orchestrate the bound trigger rule. The orchestration is triggered when an uploaded video hits the rule for the object.
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Orchestration task list. 
     * @return Activities Orchestration task list.
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set Orchestration task list.
     * @param Activities Orchestration task list.
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get Media Processing Service output storage location. If left blank, it inherits the storage location from Trigger. 
     * @return OutputStorage Media Processing Service output storage location. If left blank, it inherits the storage location from Trigger.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Media Processing Service output storage location. If left blank, it inherits the storage location from Trigger.
     * @param OutputStorage Media Processing Service output storage location. If left blank, it inherits the storage location from Trigger.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left empty, it is the same as the directory of the trigger file. 
     * @return OutputDir Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left empty, it is the same as the directory of the trigger file.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left empty, it is the same as the directory of the trigger file.
     * @param OutputDir Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left empty, it is the same as the directory of the trigger file.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Event notification configuration of the task. If left blank, it indicates that no event notification will be obtained. 
     * @return TaskNotifyConfig Event notification configuration of the task. If left blank, it indicates that no event notification will be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification configuration of the task. If left blank, it indicates that no event notification will be obtained.
     * @param TaskNotifyConfig Event notification configuration of the task. If left blank, it indicates that no event notification will be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account. 
     * @return ResourceId Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     * @param ResourceId Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public CreateScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduleRequest(CreateScheduleRequest source) {
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTrigger(source.Trigger);
        }
        if (source.Activities != null) {
            this.Activities = new Activity[source.Activities.length];
            for (int i = 0; i < source.Activities.length; i++) {
                this.Activities[i] = new Activity(source.Activities[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

