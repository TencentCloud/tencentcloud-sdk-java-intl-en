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

public class TaskGroupConfig extends AbstractModel {

    /**
    * Instance object associated with the action group
    */
    @SerializedName("TaskGroupInstances")
    @Expose
    private String [] TaskGroupInstances;

    /**
    * Action group name. If this parameter is left blank, the action group name in the template is used by default.
    */
    @SerializedName("TaskGroupTitle")
    @Expose
    private String TaskGroupTitle;

    /**
    * Action group description. If this parameter is left blank, the action group description in the template is used by default.
    */
    @SerializedName("TaskGroupDescription")
    @Expose
    private String TaskGroupDescription;

    /**
    * Action group execution mode. 1: sequential execution; 2: execution by stage. If this parameter is left blank, the action execution mode in the template is used by default.
    */
    @SerializedName("TaskGroupMode")
    @Expose
    private Long TaskGroupMode;

    /**
    * Action parameters in the action group. If this field is left blank, the action parameters in the template is used by default. You only need to specify the action whose parameters are to be modified during configuration.
    */
    @SerializedName("TaskGroupActionsConfig")
    @Expose
    private TaskGroupActionConfig [] TaskGroupActionsConfig;

    /**
     * Get Instance object associated with the action group 
     * @return TaskGroupInstances Instance object associated with the action group
     */
    public String [] getTaskGroupInstances() {
        return this.TaskGroupInstances;
    }

    /**
     * Set Instance object associated with the action group
     * @param TaskGroupInstances Instance object associated with the action group
     */
    public void setTaskGroupInstances(String [] TaskGroupInstances) {
        this.TaskGroupInstances = TaskGroupInstances;
    }

    /**
     * Get Action group name. If this parameter is left blank, the action group name in the template is used by default. 
     * @return TaskGroupTitle Action group name. If this parameter is left blank, the action group name in the template is used by default.
     */
    public String getTaskGroupTitle() {
        return this.TaskGroupTitle;
    }

    /**
     * Set Action group name. If this parameter is left blank, the action group name in the template is used by default.
     * @param TaskGroupTitle Action group name. If this parameter is left blank, the action group name in the template is used by default.
     */
    public void setTaskGroupTitle(String TaskGroupTitle) {
        this.TaskGroupTitle = TaskGroupTitle;
    }

    /**
     * Get Action group description. If this parameter is left blank, the action group description in the template is used by default. 
     * @return TaskGroupDescription Action group description. If this parameter is left blank, the action group description in the template is used by default.
     */
    public String getTaskGroupDescription() {
        return this.TaskGroupDescription;
    }

    /**
     * Set Action group description. If this parameter is left blank, the action group description in the template is used by default.
     * @param TaskGroupDescription Action group description. If this parameter is left blank, the action group description in the template is used by default.
     */
    public void setTaskGroupDescription(String TaskGroupDescription) {
        this.TaskGroupDescription = TaskGroupDescription;
    }

    /**
     * Get Action group execution mode. 1: sequential execution; 2: execution by stage. If this parameter is left blank, the action execution mode in the template is used by default. 
     * @return TaskGroupMode Action group execution mode. 1: sequential execution; 2: execution by stage. If this parameter is left blank, the action execution mode in the template is used by default.
     */
    public Long getTaskGroupMode() {
        return this.TaskGroupMode;
    }

    /**
     * Set Action group execution mode. 1: sequential execution; 2: execution by stage. If this parameter is left blank, the action execution mode in the template is used by default.
     * @param TaskGroupMode Action group execution mode. 1: sequential execution; 2: execution by stage. If this parameter is left blank, the action execution mode in the template is used by default.
     */
    public void setTaskGroupMode(Long TaskGroupMode) {
        this.TaskGroupMode = TaskGroupMode;
    }

    /**
     * Get Action parameters in the action group. If this field is left blank, the action parameters in the template is used by default. You only need to specify the action whose parameters are to be modified during configuration. 
     * @return TaskGroupActionsConfig Action parameters in the action group. If this field is left blank, the action parameters in the template is used by default. You only need to specify the action whose parameters are to be modified during configuration.
     */
    public TaskGroupActionConfig [] getTaskGroupActionsConfig() {
        return this.TaskGroupActionsConfig;
    }

    /**
     * Set Action parameters in the action group. If this field is left blank, the action parameters in the template is used by default. You only need to specify the action whose parameters are to be modified during configuration.
     * @param TaskGroupActionsConfig Action parameters in the action group. If this field is left blank, the action parameters in the template is used by default. You only need to specify the action whose parameters are to be modified during configuration.
     */
    public void setTaskGroupActionsConfig(TaskGroupActionConfig [] TaskGroupActionsConfig) {
        this.TaskGroupActionsConfig = TaskGroupActionsConfig;
    }

    public TaskGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupConfig(TaskGroupConfig source) {
        if (source.TaskGroupInstances != null) {
            this.TaskGroupInstances = new String[source.TaskGroupInstances.length];
            for (int i = 0; i < source.TaskGroupInstances.length; i++) {
                this.TaskGroupInstances[i] = new String(source.TaskGroupInstances[i]);
            }
        }
        if (source.TaskGroupTitle != null) {
            this.TaskGroupTitle = new String(source.TaskGroupTitle);
        }
        if (source.TaskGroupDescription != null) {
            this.TaskGroupDescription = new String(source.TaskGroupDescription);
        }
        if (source.TaskGroupMode != null) {
            this.TaskGroupMode = new Long(source.TaskGroupMode);
        }
        if (source.TaskGroupActionsConfig != null) {
            this.TaskGroupActionsConfig = new TaskGroupActionConfig[source.TaskGroupActionsConfig.length];
            for (int i = 0; i < source.TaskGroupActionsConfig.length; i++) {
                this.TaskGroupActionsConfig[i] = new TaskGroupActionConfig(source.TaskGroupActionsConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskGroupInstances.", this.TaskGroupInstances);
        this.setParamSimple(map, prefix + "TaskGroupTitle", this.TaskGroupTitle);
        this.setParamSimple(map, prefix + "TaskGroupDescription", this.TaskGroupDescription);
        this.setParamSimple(map, prefix + "TaskGroupMode", this.TaskGroupMode);
        this.setParamArrayObj(map, prefix + "TaskGroupActionsConfig.", this.TaskGroupActionsConfig);

    }
}

