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

public class DescribeTaskDetailResponse extends AbstractModel{

    /**
    * The task type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>LiveStreamProcessTask</li>
<li>ScheduleTask (scheme)</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status. Valid values:
<li>WAITING: Waiting;</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time of a task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Video editing task information. This field has a value only when `TaskType` is `EditMediaTask`.
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * Information of a video processing task. This field has a value only when `TaskType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowTask")
    @Expose
    private WorkflowTask WorkflowTask;

    /**
    * Information of a live stream processing task. This field has a value only when `TaskType` is `LiveStreamProcessTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveStreamProcessTask")
    @Expose
    private LiveStreamProcessTask LiveStreamProcessTask;

    /**
    * Event notification information of a task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Task flow priority. Value range: [-10, 10].
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Extended information field, used in specific scenarios.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * The information of a scheme. This parameter is valid only if `TaskType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleTask")
    @Expose
    private ScheduleTask ScheduleTask;

    /**
    * The information of a live scheme. This parameter is valid only if `TaskType` is `LiveScheduleTask`.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveScheduleTask")
    @Expose
    private LiveScheduleTask LiveScheduleTask;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The task type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>LiveStreamProcessTask</li>
<li>ScheduleTask (scheme)</li> 
     * @return TaskType The task type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>LiveStreamProcessTask</li>
<li>ScheduleTask (scheme)</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>LiveStreamProcessTask</li>
<li>ScheduleTask (scheme)</li>
     * @param TaskType The task type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>LiveStreamProcessTask</li>
<li>ScheduleTask (scheme)</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status. Valid values:
<li>WAITING: Waiting;</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li> 
     * @return Status Task status. Valid values:
<li>WAITING: Waiting;</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values:
<li>WAITING: Waiting;</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     * @param Status Task status. Valid values:
<li>WAITING: Waiting;</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time of a task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time of a task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time of a task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return FinishTime End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param FinishTime End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Video editing task information. This field has a value only when `TaskType` is `EditMediaTask`. 
     * @return EditMediaTask Video editing task information. This field has a value only when `TaskType` is `EditMediaTask`.
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set Video editing task information. This field has a value only when `TaskType` is `EditMediaTask`.
     * @param EditMediaTask Video editing task information. This field has a value only when `TaskType` is `EditMediaTask`.
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get Information of a video processing task. This field has a value only when `TaskType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowTask Information of a video processing task. This field has a value only when `TaskType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowTask getWorkflowTask() {
        return this.WorkflowTask;
    }

    /**
     * Set Information of a video processing task. This field has a value only when `TaskType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowTask Information of a video processing task. This field has a value only when `TaskType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowTask(WorkflowTask WorkflowTask) {
        this.WorkflowTask = WorkflowTask;
    }

    /**
     * Get Information of a live stream processing task. This field has a value only when `TaskType` is `LiveStreamProcessTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveStreamProcessTask Information of a live stream processing task. This field has a value only when `TaskType` is `LiveStreamProcessTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveStreamProcessTask getLiveStreamProcessTask() {
        return this.LiveStreamProcessTask;
    }

    /**
     * Set Information of a live stream processing task. This field has a value only when `TaskType` is `LiveStreamProcessTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveStreamProcessTask Information of a live stream processing task. This field has a value only when `TaskType` is `LiveStreamProcessTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveStreamProcessTask(LiveStreamProcessTask LiveStreamProcessTask) {
        this.LiveStreamProcessTask = LiveStreamProcessTask;
    }

    /**
     * Get Event notification information of a task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskNotifyConfig Event notification information of a task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of a task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskNotifyConfig Event notification information of a task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Task flow priority. Value range: [-10, 10]. 
     * @return TasksPriority Task flow priority. Value range: [-10, 10].
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task flow priority. Value range: [-10, 10].
     * @param TasksPriority Task flow priority. Value range: [-10, 10].
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed. 
     * @return SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     * @param SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters. 
     * @return SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     * @param SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Extended information field, used in specific scenarios. 
     * @return ExtInfo Extended information field, used in specific scenarios.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Extended information field, used in specific scenarios.
     * @param ExtInfo Extended information field, used in specific scenarios.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get The information of a scheme. This parameter is valid only if `TaskType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleTask The information of a scheme. This parameter is valid only if `TaskType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleTask getScheduleTask() {
        return this.ScheduleTask;
    }

    /**
     * Set The information of a scheme. This parameter is valid only if `TaskType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleTask The information of a scheme. This parameter is valid only if `TaskType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleTask(ScheduleTask ScheduleTask) {
        this.ScheduleTask = ScheduleTask;
    }

    /**
     * Get The information of a live scheme. This parameter is valid only if `TaskType` is `LiveScheduleTask`.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LiveScheduleTask The information of a live scheme. This parameter is valid only if `TaskType` is `LiveScheduleTask`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public LiveScheduleTask getLiveScheduleTask() {
        return this.LiveScheduleTask;
    }

    /**
     * Set The information of a live scheme. This parameter is valid only if `TaskType` is `LiveScheduleTask`.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LiveScheduleTask The information of a live scheme. This parameter is valid only if `TaskType` is `LiveScheduleTask`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLiveScheduleTask(LiveScheduleTask LiveScheduleTask) {
        this.LiveScheduleTask = LiveScheduleTask;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.EditMediaTask != null) {
            this.EditMediaTask = new EditMediaTask(source.EditMediaTask);
        }
        if (source.WorkflowTask != null) {
            this.WorkflowTask = new WorkflowTask(source.WorkflowTask);
        }
        if (source.LiveStreamProcessTask != null) {
            this.LiveStreamProcessTask = new LiveStreamProcessTask(source.LiveStreamProcessTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.ScheduleTask != null) {
            this.ScheduleTask = new ScheduleTask(source.ScheduleTask);
        }
        if (source.LiveScheduleTask != null) {
            this.LiveScheduleTask = new LiveScheduleTask(source.LiveScheduleTask);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "EditMediaTask.", this.EditMediaTask);
        this.setParamObj(map, prefix + "WorkflowTask.", this.WorkflowTask);
        this.setParamObj(map, prefix + "LiveStreamProcessTask.", this.LiveStreamProcessTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamObj(map, prefix + "ScheduleTask.", this.ScheduleTask);
        this.setParamObj(map, prefix + "LiveScheduleTask.", this.LiveScheduleTask);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

