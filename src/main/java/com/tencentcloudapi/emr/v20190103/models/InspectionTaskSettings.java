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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InspectionTaskSettings extends AbstractModel {

    /**
    * Unique identifier for inspection tasks.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Inspection task group name.
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Inspection task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Inspection task parameter settings.
    */
    @SerializedName("TaskSettings")
    @Expose
    private TaskSettings [] TaskSettings;

    /**
    * Whether it is selected, with the valid values of "true" and "false".
    */
    @SerializedName("Selected")
    @Expose
    private String Selected;

    /**
    * Whether monitoring is enabled.
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * Event JSON template.
    */
    @SerializedName("SettingsJson")
    @Expose
    private String SettingsJson;

    /**
     * Get Unique identifier for inspection tasks. 
     * @return TaskType Unique identifier for inspection tasks.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Unique identifier for inspection tasks.
     * @param TaskType Unique identifier for inspection tasks.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Inspection task group name. 
     * @return Group Inspection task group name.
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Inspection task group name.
     * @param Group Inspection task group name.
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Inspection task name. 
     * @return Name Inspection task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Inspection task name.
     * @param Name Inspection task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Inspection task parameter settings. 
     * @return TaskSettings Inspection task parameter settings.
     */
    public TaskSettings [] getTaskSettings() {
        return this.TaskSettings;
    }

    /**
     * Set Inspection task parameter settings.
     * @param TaskSettings Inspection task parameter settings.
     */
    public void setTaskSettings(TaskSettings [] TaskSettings) {
        this.TaskSettings = TaskSettings;
    }

    /**
     * Get Whether it is selected, with the valid values of "true" and "false". 
     * @return Selected Whether it is selected, with the valid values of "true" and "false".
     */
    public String getSelected() {
        return this.Selected;
    }

    /**
     * Set Whether it is selected, with the valid values of "true" and "false".
     * @param Selected Whether it is selected, with the valid values of "true" and "false".
     */
    public void setSelected(String Selected) {
        this.Selected = Selected;
    }

    /**
     * Get Whether monitoring is enabled. 
     * @return Enable Whether monitoring is enabled.
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether monitoring is enabled.
     * @param Enable Whether monitoring is enabled.
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Event JSON template. 
     * @return SettingsJson Event JSON template.
     */
    public String getSettingsJson() {
        return this.SettingsJson;
    }

    /**
     * Set Event JSON template.
     * @param SettingsJson Event JSON template.
     */
    public void setSettingsJson(String SettingsJson) {
        this.SettingsJson = SettingsJson;
    }

    public InspectionTaskSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InspectionTaskSettings(InspectionTaskSettings source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskSettings != null) {
            this.TaskSettings = new TaskSettings[source.TaskSettings.length];
            for (int i = 0; i < source.TaskSettings.length; i++) {
                this.TaskSettings[i] = new TaskSettings(source.TaskSettings[i]);
            }
        }
        if (source.Selected != null) {
            this.Selected = new String(source.Selected);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.SettingsJson != null) {
            this.SettingsJson = new String(source.SettingsJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TaskSettings.", this.TaskSettings);
        this.setParamSimple(map, prefix + "Selected", this.Selected);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "SettingsJson", this.SettingsJson);

    }
}

