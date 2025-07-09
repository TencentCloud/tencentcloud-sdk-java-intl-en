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

public class SchedulesInfo extends AbstractModel {

    /**
    * The scheme ID.
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * The scheme name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * The scheme type. Valid values:
 <li>`Preset`</li>
<li>`Custom` </li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The scheme status. Valid values:
`Enabled`
`Disabled`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The trigger of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * The subtasks of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * The bucket to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The directory to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * The notification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * The creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Resource ID. For those without an associated resource ID, fill in with an account's primary resource ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get The scheme ID. 
     * @return ScheduleId The scheme ID.
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set The scheme ID.
     * @param ScheduleId The scheme ID.
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get The scheme name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleName The scheme name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set The scheme name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleName The scheme name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get The scheme type. Valid values:
 <li>`Preset`</li>
<li>`Custom` </li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type The scheme type. Valid values:
 <li>`Preset`</li>
<li>`Custom` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The scheme type. Valid values:
 <li>`Preset`</li>
<li>`Custom` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type The scheme type. Valid values:
 <li>`Preset`</li>
<li>`Custom` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The scheme status. Valid values:
`Enabled`
`Disabled`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The scheme status. Valid values:
`Enabled`
`Disabled`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The scheme status. Valid values:
`Enabled`
`Disabled`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The scheme status. Valid values:
`Enabled`
`Disabled`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The trigger of the scheme.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Trigger The trigger of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set The trigger of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Trigger The trigger of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get The subtasks of the scheme.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Activities The subtasks of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set The subtasks of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Activities The subtasks of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get The bucket to save the output file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage The bucket to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set The bucket to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage The bucket to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The directory to save the output file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputDir The directory to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set The directory to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputDir The directory to save the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get The notification configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskNotifyConfig The notification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set The notification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskNotifyConfig The notification configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get The creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The creation time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The last updated time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The last updated time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Resource ID. For those without an associated resource ID, fill in with an account's primary resource ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID. For those without an associated resource ID, fill in with an account's primary resource ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID. For those without an associated resource ID, fill in with an account's primary resource ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID. For those without an associated resource ID, fill in with an account's primary resource ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public SchedulesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulesInfo(SchedulesInfo source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

