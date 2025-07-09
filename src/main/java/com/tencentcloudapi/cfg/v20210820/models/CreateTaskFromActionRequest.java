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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFromActionRequest extends AbstractModel {

    /**
    * Action ID, which can be obtained by using the action list API DescribeActionLibraryList.
    */
    @SerializedName("TaskActionId")
    @Expose
    private Long TaskActionId;

    /**
    * ID of the instance participating in the experiment.
    */
    @SerializedName("TaskInstances")
    @Expose
    private String [] TaskInstances;

    /**
    * Experiment name. If this parameter is left blank, the action name is used by default.
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * Experiment description. If this parameter is left blank, the action description is used by default.
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the action details API DescribeActionFieldConfigList. If this field is left blank, the default action parameters are used by default.
    */
    @SerializedName("TaskActionGeneralConfiguration")
    @Expose
    private String TaskActionGeneralConfiguration;

    /**
    * Action custom parameters need to be passed in as json serialization. They can be obtained from the action details interface DescribeActionFieldConfigList. If not filled in, the default action parameters will be used. Note: Required parameters have no default values. Be sure to pass in valid values.
    */
    @SerializedName("TaskActionCustomConfiguration")
    @Expose
    private String TaskActionCustomConfiguration;

    /**
    * Automatic experiment pause time, in minutes. If this parameter is left blank, the default value 60 is used.
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
     * Get Action ID, which can be obtained by using the action list API DescribeActionLibraryList. 
     * @return TaskActionId Action ID, which can be obtained by using the action list API DescribeActionLibraryList.
     */
    public Long getTaskActionId() {
        return this.TaskActionId;
    }

    /**
     * Set Action ID, which can be obtained by using the action list API DescribeActionLibraryList.
     * @param TaskActionId Action ID, which can be obtained by using the action list API DescribeActionLibraryList.
     */
    public void setTaskActionId(Long TaskActionId) {
        this.TaskActionId = TaskActionId;
    }

    /**
     * Get ID of the instance participating in the experiment. 
     * @return TaskInstances ID of the instance participating in the experiment.
     */
    public String [] getTaskInstances() {
        return this.TaskInstances;
    }

    /**
     * Set ID of the instance participating in the experiment.
     * @param TaskInstances ID of the instance participating in the experiment.
     */
    public void setTaskInstances(String [] TaskInstances) {
        this.TaskInstances = TaskInstances;
    }

    /**
     * Get Experiment name. If this parameter is left blank, the action name is used by default. 
     * @return TaskTitle Experiment name. If this parameter is left blank, the action name is used by default.
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set Experiment name. If this parameter is left blank, the action name is used by default.
     * @param TaskTitle Experiment name. If this parameter is left blank, the action name is used by default.
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get Experiment description. If this parameter is left blank, the action description is used by default. 
     * @return TaskDescription Experiment description. If this parameter is left blank, the action description is used by default.
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Experiment description. If this parameter is left blank, the action description is used by default.
     * @param TaskDescription Experiment description. If this parameter is left blank, the action description is used by default.
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the action details API DescribeActionFieldConfigList. If this field is left blank, the default action parameters are used by default. 
     * @return TaskActionGeneralConfiguration General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the action details API DescribeActionFieldConfigList. If this field is left blank, the default action parameters are used by default.
     */
    public String getTaskActionGeneralConfiguration() {
        return this.TaskActionGeneralConfiguration;
    }

    /**
     * Set General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the action details API DescribeActionFieldConfigList. If this field is left blank, the default action parameters are used by default.
     * @param TaskActionGeneralConfiguration General action parameters, which need to be passed in after JSON serialization. The parameters can be obtained by using the action details API DescribeActionFieldConfigList. If this field is left blank, the default action parameters are used by default.
     */
    public void setTaskActionGeneralConfiguration(String TaskActionGeneralConfiguration) {
        this.TaskActionGeneralConfiguration = TaskActionGeneralConfiguration;
    }

    /**
     * Get Action custom parameters need to be passed in as json serialization. They can be obtained from the action details interface DescribeActionFieldConfigList. If not filled in, the default action parameters will be used. Note: Required parameters have no default values. Be sure to pass in valid values. 
     * @return TaskActionCustomConfiguration Action custom parameters need to be passed in as json serialization. They can be obtained from the action details interface DescribeActionFieldConfigList. If not filled in, the default action parameters will be used. Note: Required parameters have no default values. Be sure to pass in valid values.
     */
    public String getTaskActionCustomConfiguration() {
        return this.TaskActionCustomConfiguration;
    }

    /**
     * Set Action custom parameters need to be passed in as json serialization. They can be obtained from the action details interface DescribeActionFieldConfigList. If not filled in, the default action parameters will be used. Note: Required parameters have no default values. Be sure to pass in valid values.
     * @param TaskActionCustomConfiguration Action custom parameters need to be passed in as json serialization. They can be obtained from the action details interface DescribeActionFieldConfigList. If not filled in, the default action parameters will be used. Note: Required parameters have no default values. Be sure to pass in valid values.
     */
    public void setTaskActionCustomConfiguration(String TaskActionCustomConfiguration) {
        this.TaskActionCustomConfiguration = TaskActionCustomConfiguration;
    }

    /**
     * Get Automatic experiment pause time, in minutes. If this parameter is left blank, the default value 60 is used. 
     * @return TaskPauseDuration Automatic experiment pause time, in minutes. If this parameter is left blank, the default value 60 is used.
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set Automatic experiment pause time, in minutes. If this parameter is left blank, the default value 60 is used.
     * @param TaskPauseDuration Automatic experiment pause time, in minutes. If this parameter is left blank, the default value 60 is used.
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    public CreateTaskFromActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFromActionRequest(CreateTaskFromActionRequest source) {
        if (source.TaskActionId != null) {
            this.TaskActionId = new Long(source.TaskActionId);
        }
        if (source.TaskInstances != null) {
            this.TaskInstances = new String[source.TaskInstances.length];
            for (int i = 0; i < source.TaskInstances.length; i++) {
                this.TaskInstances[i] = new String(source.TaskInstances[i]);
            }
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskActionGeneralConfiguration != null) {
            this.TaskActionGeneralConfiguration = new String(source.TaskActionGeneralConfiguration);
        }
        if (source.TaskActionCustomConfiguration != null) {
            this.TaskActionCustomConfiguration = new String(source.TaskActionCustomConfiguration);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskActionId", this.TaskActionId);
        this.setParamArraySimple(map, prefix + "TaskInstances.", this.TaskInstances);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskActionGeneralConfiguration", this.TaskActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskActionCustomConfiguration", this.TaskActionCustomConfiguration);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);

    }
}

