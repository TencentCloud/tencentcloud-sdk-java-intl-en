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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduleRequest extends AbstractModel{

    /**
    * The scheme name (max 128 characters). This name should be unique across your account.
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * The trigger of the scheme. If a file is uploaded to the specified bucket, the scheme will be triggered.
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * The subtasks of the scheme.
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * The bucket to save the output file. If you do not specify this parameter, the bucket in `Trigger` will be used.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this, the file will be saved to the trigger directory.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * The notification configuration. If you do not specify this parameter, notifications will not be sent.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
     * Get The scheme name (max 128 characters). This name should be unique across your account. 
     * @return ScheduleName The scheme name (max 128 characters). This name should be unique across your account.
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set The scheme name (max 128 characters). This name should be unique across your account.
     * @param ScheduleName The scheme name (max 128 characters). This name should be unique across your account.
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get The trigger of the scheme. If a file is uploaded to the specified bucket, the scheme will be triggered. 
     * @return Trigger The trigger of the scheme. If a file is uploaded to the specified bucket, the scheme will be triggered.
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set The trigger of the scheme. If a file is uploaded to the specified bucket, the scheme will be triggered.
     * @param Trigger The trigger of the scheme. If a file is uploaded to the specified bucket, the scheme will be triggered.
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get The subtasks of the scheme. 
     * @return Activities The subtasks of the scheme.
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set The subtasks of the scheme.
     * @param Activities The subtasks of the scheme.
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get The bucket to save the output file. If you do not specify this parameter, the bucket in `Trigger` will be used. 
     * @return OutputStorage The bucket to save the output file. If you do not specify this parameter, the bucket in `Trigger` will be used.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set The bucket to save the output file. If you do not specify this parameter, the bucket in `Trigger` will be used.
     * @param OutputStorage The bucket to save the output file. If you do not specify this parameter, the bucket in `Trigger` will be used.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this, the file will be saved to the trigger directory. 
     * @return OutputDir The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this, the file will be saved to the trigger directory.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this, the file will be saved to the trigger directory.
     * @param OutputDir The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this, the file will be saved to the trigger directory.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get The notification configuration. If you do not specify this parameter, notifications will not be sent. 
     * @return TaskNotifyConfig The notification configuration. If you do not specify this parameter, notifications will not be sent.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set The notification configuration. If you do not specify this parameter, notifications will not be sent.
     * @param TaskNotifyConfig The notification configuration. If you do not specify this parameter, notifications will not be sent.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
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

    }
}

