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

public class Task extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task name
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * Task description
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTag")
    @Expose
    private String TaskTag;

    /**
    * Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task end status, indicating the status of the task when it ends. 0: not ended; 1: successful; 2: failed; 3: terminated.
    */
    @SerializedName("TaskStatusType")
    @Expose
    private Long TaskStatusType;

    /**
    * Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskProtectStrategy")
    @Expose
    private String TaskProtectStrategy;

    /**
    * Task creation time
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * Task update time
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * Task action group
    */
    @SerializedName("TaskGroups")
    @Expose
    private TaskGroup [] TaskGroups;

    /**
    * Start time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * End time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * Whether expectations are met. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskExpect")
    @Expose
    private Long TaskExpect;

    /**
    * Experiment record
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskSummary")
    @Expose
    private String TaskSummary;

    /**
    * Task mode. 1: manual execution; 2: automatic execution.
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Automatic pause duration. Unit: minutes.
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * Main account that creates the experiment
    */
    @SerializedName("TaskOwnerUin")
    @Expose
    private String TaskOwnerUin;

    /**
    * Region ID
    */
    @SerializedName("TaskRegionId")
    @Expose
    private Long TaskRegionId;

    /**
    * Monitoring metric list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskMonitors")
    @Expose
    private TaskMonitor [] TaskMonitors;

    /**
    * Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPolicy")
    @Expose
    private DescribePolicy TaskPolicy;

    /**
    * Tag list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * ID of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPlanId")
    @Expose
    private Long TaskPlanId;

    /**
    * Name of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPlanTitle")
    @Expose
    private String TaskPlanTitle;

    /**
    * ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Associated alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private String [] AlarmPolicy;

    /**
    * Associated APM services
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApmServiceList")
    @Expose
    private ApmServiceInfo [] ApmServiceList;

    /**
    * ID of the associated threat verification item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyId")
    @Expose
    private Long VerifyId;

    /**
    * Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyDealType")
    @Expose
    private Long PolicyDealType;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name 
     * @return TaskTitle Task name
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set Task name
     * @param TaskTitle Task name
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get Task description 
     * @return TaskDescription Task description
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Task description
     * @param TaskDescription Task description
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Custom tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTag Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTag Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTag(String TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Task status. 1001: not started; 1002: in progress (executing); 1003: in progress (paused); 1004: execution ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task end status, indicating the status of the task when it ends. 0: not ended; 1: successful; 2: failed; 3: terminated. 
     * @return TaskStatusType Task end status, indicating the status of the task when it ends. 0: not ended; 1: successful; 2: failed; 3: terminated.
     */
    public Long getTaskStatusType() {
        return this.TaskStatusType;
    }

    /**
     * Set Task end status, indicating the status of the task when it ends. 0: not ended; 1: successful; 2: failed; 3: terminated.
     * @param TaskStatusType Task end status, indicating the status of the task when it ends. 0: not ended; 1: successful; 2: failed; 3: terminated.
     */
    public void setTaskStatusType(Long TaskStatusType) {
        this.TaskStatusType = TaskStatusType;
    }

    /**
     * Get Protection policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskProtectStrategy Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskProtectStrategy() {
        return this.TaskProtectStrategy;
    }

    /**
     * Set Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskProtectStrategy Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskProtectStrategy(String TaskProtectStrategy) {
        this.TaskProtectStrategy = TaskProtectStrategy;
    }

    /**
     * Get Task creation time 
     * @return TaskCreateTime Task creation time
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set Task creation time
     * @param TaskCreateTime Task creation time
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get Task update time 
     * @return TaskUpdateTime Task update time
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set Task update time
     * @param TaskUpdateTime Task update time
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get Task action group 
     * @return TaskGroups Task action group
     */
    public TaskGroup [] getTaskGroups() {
        return this.TaskGroups;
    }

    /**
     * Set Task action group
     * @param TaskGroups Task action group
     */
    public void setTaskGroups(TaskGroup [] TaskGroups) {
        this.TaskGroups = TaskGroups;
    }

    /**
     * Get Start time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStartTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set Start time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStartTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get End time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskEndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set End time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskEndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get Whether expectations are met. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskExpect Whether expectations are met. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskExpect() {
        return this.TaskExpect;
    }

    /**
     * Set Whether expectations are met. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskExpect Whether expectations are met. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskExpect(Long TaskExpect) {
        this.TaskExpect = TaskExpect;
    }

    /**
     * Get Experiment record
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskSummary Experiment record
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskSummary() {
        return this.TaskSummary;
    }

    /**
     * Set Experiment record
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskSummary Experiment record
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskSummary(String TaskSummary) {
        this.TaskSummary = TaskSummary;
    }

    /**
     * Get Task mode. 1: manual execution; 2: automatic execution. 
     * @return TaskMode Task mode. 1: manual execution; 2: automatic execution.
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Task mode. 1: manual execution; 2: automatic execution.
     * @param TaskMode Task mode. 1: manual execution; 2: automatic execution.
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Automatic pause duration. Unit: minutes. 
     * @return TaskPauseDuration Automatic pause duration. Unit: minutes.
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set Automatic pause duration. Unit: minutes.
     * @param TaskPauseDuration Automatic pause duration. Unit: minutes.
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get Main account that creates the experiment 
     * @return TaskOwnerUin Main account that creates the experiment
     */
    public String getTaskOwnerUin() {
        return this.TaskOwnerUin;
    }

    /**
     * Set Main account that creates the experiment
     * @param TaskOwnerUin Main account that creates the experiment
     */
    public void setTaskOwnerUin(String TaskOwnerUin) {
        this.TaskOwnerUin = TaskOwnerUin;
    }

    /**
     * Get Region ID 
     * @return TaskRegionId Region ID
     */
    public Long getTaskRegionId() {
        return this.TaskRegionId;
    }

    /**
     * Set Region ID
     * @param TaskRegionId Region ID
     */
    public void setTaskRegionId(Long TaskRegionId) {
        this.TaskRegionId = TaskRegionId;
    }

    /**
     * Get Monitoring metric list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskMonitors Monitoring metric list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskMonitor [] getTaskMonitors() {
        return this.TaskMonitors;
    }

    /**
     * Set Monitoring metric list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskMonitors Monitoring metric list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskMonitors(TaskMonitor [] TaskMonitors) {
        this.TaskMonitors = TaskMonitors;
    }

    /**
     * Get Protection policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPolicy Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribePolicy getTaskPolicy() {
        return this.TaskPolicy;
    }

    /**
     * Set Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPolicy Protection policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPolicy(DescribePolicy TaskPolicy) {
        this.TaskPolicy = TaskPolicy;
    }

    /**
     * Get Tag list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPlanId ID of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskPlanId() {
        return this.TaskPlanId;
    }

    /**
     * Set ID of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPlanId ID of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPlanId(Long TaskPlanId) {
        this.TaskPlanId = TaskPlanId;
    }

    /**
     * Get Name of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPlanTitle Name of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskPlanTitle() {
        return this.TaskPlanTitle;
    }

    /**
     * Set Name of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPlanTitle Name of the associated experiment plan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPlanTitle(String TaskPlanTitle) {
        this.TaskPlanTitle = TaskPlanTitle;
    }

    /**
     * Get ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Associated alarm metrics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmPolicy Associated alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set Associated alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmPolicy Associated alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmPolicy(String [] AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    /**
     * Get Associated APM services
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApmServiceList Associated APM services
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmServiceInfo [] getApmServiceList() {
        return this.ApmServiceList;
    }

    /**
     * Set Associated APM services
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApmServiceList Associated APM services
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApmServiceList(ApmServiceInfo [] ApmServiceList) {
        this.ApmServiceList = ApmServiceList;
    }

    /**
     * Get ID of the associated threat verification item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerifyId ID of the associated threat verification item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVerifyId() {
        return this.VerifyId;
    }

    /**
     * Set ID of the associated threat verification item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerifyId ID of the associated threat verification item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyId(Long VerifyId) {
        this.VerifyId = VerifyId;
    }

    /**
     * Get Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyDealType() {
        return this.PolicyDealType;
    }

    /**
     * Set Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyDealType(Long PolicyDealType) {
        this.PolicyDealType = PolicyDealType;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String(source.TaskTag);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskStatusType != null) {
            this.TaskStatusType = new Long(source.TaskStatusType);
        }
        if (source.TaskProtectStrategy != null) {
            this.TaskProtectStrategy = new String(source.TaskProtectStrategy);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.TaskGroups != null) {
            this.TaskGroups = new TaskGroup[source.TaskGroups.length];
            for (int i = 0; i < source.TaskGroups.length; i++) {
                this.TaskGroups[i] = new TaskGroup(source.TaskGroups[i]);
            }
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskExpect != null) {
            this.TaskExpect = new Long(source.TaskExpect);
        }
        if (source.TaskSummary != null) {
            this.TaskSummary = new String(source.TaskSummary);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.TaskOwnerUin != null) {
            this.TaskOwnerUin = new String(source.TaskOwnerUin);
        }
        if (source.TaskRegionId != null) {
            this.TaskRegionId = new Long(source.TaskRegionId);
        }
        if (source.TaskMonitors != null) {
            this.TaskMonitors = new TaskMonitor[source.TaskMonitors.length];
            for (int i = 0; i < source.TaskMonitors.length; i++) {
                this.TaskMonitors[i] = new TaskMonitor(source.TaskMonitors[i]);
            }
        }
        if (source.TaskPolicy != null) {
            this.TaskPolicy = new DescribePolicy(source.TaskPolicy);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.TaskPlanId != null) {
            this.TaskPlanId = new Long(source.TaskPlanId);
        }
        if (source.TaskPlanTitle != null) {
            this.TaskPlanTitle = new String(source.TaskPlanTitle);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new String[source.AlarmPolicy.length];
            for (int i = 0; i < source.AlarmPolicy.length; i++) {
                this.AlarmPolicy[i] = new String(source.AlarmPolicy[i]);
            }
        }
        if (source.ApmServiceList != null) {
            this.ApmServiceList = new ApmServiceInfo[source.ApmServiceList.length];
            for (int i = 0; i < source.ApmServiceList.length; i++) {
                this.ApmServiceList[i] = new ApmServiceInfo(source.ApmServiceList[i]);
            }
        }
        if (source.VerifyId != null) {
            this.VerifyId = new Long(source.VerifyId);
        }
        if (source.PolicyDealType != null) {
            this.PolicyDealType = new Long(source.PolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskTag", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskStatusType", this.TaskStatusType);
        this.setParamSimple(map, prefix + "TaskProtectStrategy", this.TaskProtectStrategy);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamArrayObj(map, prefix + "TaskGroups.", this.TaskGroups);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskExpect", this.TaskExpect);
        this.setParamSimple(map, prefix + "TaskSummary", this.TaskSummary);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamSimple(map, prefix + "TaskOwnerUin", this.TaskOwnerUin);
        this.setParamSimple(map, prefix + "TaskRegionId", this.TaskRegionId);
        this.setParamArrayObj(map, prefix + "TaskMonitors.", this.TaskMonitors);
        this.setParamObj(map, prefix + "TaskPolicy.", this.TaskPolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TaskPlanId", this.TaskPlanId);
        this.setParamSimple(map, prefix + "TaskPlanTitle", this.TaskPlanTitle);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamArraySimple(map, prefix + "AlarmPolicy.", this.AlarmPolicy);
        this.setParamArrayObj(map, prefix + "ApmServiceList.", this.ApmServiceList);
        this.setParamSimple(map, prefix + "VerifyId", this.VerifyId);
        this.setParamSimple(map, prefix + "PolicyDealType", this.PolicyDealType);

    }
}

