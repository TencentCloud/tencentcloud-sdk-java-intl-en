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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobResponse extends AbstractModel {

    /**
    * Job ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Job name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Availability zone information
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Job priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Job state
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * Creation Date
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task view information
    */
    @SerializedName("TaskSet")
    @Expose
    private TaskView [] TaskSet;

    /**
    * Information of the dependency among tasks
    */
    @SerializedName("DependenceSet")
    @Expose
    private Dependence [] DependenceSet;

    /**
    * Task statistical metrics
    */
    @SerializedName("TaskMetrics")
    @Expose
    private TaskMetrics TaskMetrics;

    /**
    * Task instance statistical metrics
    */
    @SerializedName("TaskInstanceMetrics")
    @Expose
    private TaskInstanceMetrics TaskInstanceMetrics;

    /**
    * Job failure reason
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Next action
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NextAction")
    @Expose
    private String NextAction;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Job ID 
     * @return JobId Job ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID
     * @param JobId Job ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Job name 
     * @return JobName Job name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Job name
     * @param JobName Job name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Availability zone information 
     * @return Zone Availability zone information
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone information
     * @param Zone Availability zone information
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Job priority 
     * @return Priority Job priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Job priority
     * @param Priority Job priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Job state 
     * @return JobState Job state
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set Job state
     * @param JobState Job state
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * Get Creation Date 
     * @return CreateTime Creation Date
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Date
     * @param CreateTime Creation Date
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task view information 
     * @return TaskSet Task view information
     */
    public TaskView [] getTaskSet() {
        return this.TaskSet;
    }

    /**
     * Set Task view information
     * @param TaskSet Task view information
     */
    public void setTaskSet(TaskView [] TaskSet) {
        this.TaskSet = TaskSet;
    }

    /**
     * Get Information of the dependency among tasks 
     * @return DependenceSet Information of the dependency among tasks
     */
    public Dependence [] getDependenceSet() {
        return this.DependenceSet;
    }

    /**
     * Set Information of the dependency among tasks
     * @param DependenceSet Information of the dependency among tasks
     */
    public void setDependenceSet(Dependence [] DependenceSet) {
        this.DependenceSet = DependenceSet;
    }

    /**
     * Get Task statistical metrics 
     * @return TaskMetrics Task statistical metrics
     */
    public TaskMetrics getTaskMetrics() {
        return this.TaskMetrics;
    }

    /**
     * Set Task statistical metrics
     * @param TaskMetrics Task statistical metrics
     */
    public void setTaskMetrics(TaskMetrics TaskMetrics) {
        this.TaskMetrics = TaskMetrics;
    }

    /**
     * Get Task instance statistical metrics 
     * @return TaskInstanceMetrics Task instance statistical metrics
     */
    public TaskInstanceMetrics getTaskInstanceMetrics() {
        return this.TaskInstanceMetrics;
    }

    /**
     * Set Task instance statistical metrics
     * @param TaskInstanceMetrics Task instance statistical metrics
     */
    public void setTaskInstanceMetrics(TaskInstanceMetrics TaskInstanceMetrics) {
        this.TaskInstanceMetrics = TaskInstanceMetrics;
    }

    /**
     * Get Job failure reason 
     * @return StateReason Job failure reason
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set Job failure reason
     * @param StateReason Job failure reason
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Next action
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NextAction Next action
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getNextAction() {
        return this.NextAction;
    }

    /**
     * Set Next action
Note: This field may return `null`, indicating that no valid value was found.
     * @param NextAction Next action
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNextAction(String NextAction) {
        this.NextAction = NextAction;
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

    public DescribeJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobResponse(DescribeJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.JobState != null) {
            this.JobState = new String(source.JobState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskSet != null) {
            this.TaskSet = new TaskView[source.TaskSet.length];
            for (int i = 0; i < source.TaskSet.length; i++) {
                this.TaskSet[i] = new TaskView(source.TaskSet[i]);
            }
        }
        if (source.DependenceSet != null) {
            this.DependenceSet = new Dependence[source.DependenceSet.length];
            for (int i = 0; i < source.DependenceSet.length; i++) {
                this.DependenceSet[i] = new Dependence(source.DependenceSet[i]);
            }
        }
        if (source.TaskMetrics != null) {
            this.TaskMetrics = new TaskMetrics(source.TaskMetrics);
        }
        if (source.TaskInstanceMetrics != null) {
            this.TaskInstanceMetrics = new TaskInstanceMetrics(source.TaskInstanceMetrics);
        }
        if (source.StateReason != null) {
            this.StateReason = new String(source.StateReason);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NextAction != null) {
            this.NextAction = new String(source.NextAction);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "TaskSet.", this.TaskSet);
        this.setParamArrayObj(map, prefix + "DependenceSet.", this.DependenceSet);
        this.setParamObj(map, prefix + "TaskMetrics.", this.TaskMetrics);
        this.setParamObj(map, prefix + "TaskInstanceMetrics.", this.TaskInstanceMetrics);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NextAction", this.NextAction);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

