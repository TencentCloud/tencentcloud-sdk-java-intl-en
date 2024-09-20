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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskConfig extends AbstractModel {

    /**
    * Action group configurations. The number of configured action groups needs to be consistent with that in the template.
    */
    @SerializedName("TaskGroupsConfig")
    @Expose
    private TaskGroupConfig [] TaskGroupsConfig;

    /**
    * Experiment name after change. If this parameter is left blank, the template name is used by default.
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * Experiment description after change. If this parameter is left blank, the template description is used by default.
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Experiment execution mode. 1: manual execution; 2: automatic execution. If this parameter is left blank, the template execution mode is used by default.
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Automatic pause time of the experiment, in minutes. If this parameter is left blank, the automatic pause time of the template is used by default.
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * Experiment tag. If this parameter is left blank, the template tag is used by default.
    */
    @SerializedName("Tags")
    @Expose
    private TagWithCreate [] Tags;

    /**
    * Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
    */
    @SerializedName("PolicyDealType")
    @Expose
    private Long PolicyDealType;

    /**
     * Get Action group configurations. The number of configured action groups needs to be consistent with that in the template. 
     * @return TaskGroupsConfig Action group configurations. The number of configured action groups needs to be consistent with that in the template.
     */
    public TaskGroupConfig [] getTaskGroupsConfig() {
        return this.TaskGroupsConfig;
    }

    /**
     * Set Action group configurations. The number of configured action groups needs to be consistent with that in the template.
     * @param TaskGroupsConfig Action group configurations. The number of configured action groups needs to be consistent with that in the template.
     */
    public void setTaskGroupsConfig(TaskGroupConfig [] TaskGroupsConfig) {
        this.TaskGroupsConfig = TaskGroupsConfig;
    }

    /**
     * Get Experiment name after change. If this parameter is left blank, the template name is used by default. 
     * @return TaskTitle Experiment name after change. If this parameter is left blank, the template name is used by default.
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set Experiment name after change. If this parameter is left blank, the template name is used by default.
     * @param TaskTitle Experiment name after change. If this parameter is left blank, the template name is used by default.
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get Experiment description after change. If this parameter is left blank, the template description is used by default. 
     * @return TaskDescription Experiment description after change. If this parameter is left blank, the template description is used by default.
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Experiment description after change. If this parameter is left blank, the template description is used by default.
     * @param TaskDescription Experiment description after change. If this parameter is left blank, the template description is used by default.
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Experiment execution mode. 1: manual execution; 2: automatic execution. If this parameter is left blank, the template execution mode is used by default. 
     * @return TaskMode Experiment execution mode. 1: manual execution; 2: automatic execution. If this parameter is left blank, the template execution mode is used by default.
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Experiment execution mode. 1: manual execution; 2: automatic execution. If this parameter is left blank, the template execution mode is used by default.
     * @param TaskMode Experiment execution mode. 1: manual execution; 2: automatic execution. If this parameter is left blank, the template execution mode is used by default.
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Automatic pause time of the experiment, in minutes. If this parameter is left blank, the automatic pause time of the template is used by default. 
     * @return TaskPauseDuration Automatic pause time of the experiment, in minutes. If this parameter is left blank, the automatic pause time of the template is used by default.
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set Automatic pause time of the experiment, in minutes. If this parameter is left blank, the automatic pause time of the template is used by default.
     * @param TaskPauseDuration Automatic pause time of the experiment, in minutes. If this parameter is left blank, the automatic pause time of the template is used by default.
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get Experiment tag. If this parameter is left blank, the template tag is used by default. 
     * @return Tags Experiment tag. If this parameter is left blank, the template tag is used by default.
     */
    public TagWithCreate [] getTags() {
        return this.Tags;
    }

    /**
     * Set Experiment tag. If this parameter is left blank, the template tag is used by default.
     * @param Tags Experiment tag. If this parameter is left blank, the template tag is used by default.
     */
    public void setTags(TagWithCreate [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Guardrail processing method. 1: roll back sequentially; 2: pause experiment. 
     * @return PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
     */
    public Long getPolicyDealType() {
        return this.PolicyDealType;
    }

    /**
     * Set Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
     * @param PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
     */
    public void setPolicyDealType(Long PolicyDealType) {
        this.PolicyDealType = PolicyDealType;
    }

    public TaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskConfig(TaskConfig source) {
        if (source.TaskGroupsConfig != null) {
            this.TaskGroupsConfig = new TaskGroupConfig[source.TaskGroupsConfig.length];
            for (int i = 0; i < source.TaskGroupsConfig.length; i++) {
                this.TaskGroupsConfig[i] = new TaskGroupConfig(source.TaskGroupsConfig[i]);
            }
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithCreate[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithCreate(source.Tags[i]);
            }
        }
        if (source.PolicyDealType != null) {
            this.PolicyDealType = new Long(source.PolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskGroupsConfig.", this.TaskGroupsConfig);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PolicyDealType", this.PolicyDealType);

    }
}

