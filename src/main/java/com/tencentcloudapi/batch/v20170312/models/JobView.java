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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobView extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Instance name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Instance state
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * Instance priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Location information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task statistical metrics
    */
    @SerializedName("TaskMetrics")
    @Expose
    private TaskMetrics TaskMetrics;

    /**
    * Tag list bound to the job.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Instance ID 
     * @return JobId Instance ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Instance ID
     * @param JobId Instance ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Instance name 
     * @return JobName Instance name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Instance name
     * @param JobName Instance name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Instance state 
     * @return JobState Instance state
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set Instance state
     * @param JobState Instance state
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * Get Instance priority 
     * @return Priority Instance priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Instance priority
     * @param Priority Instance priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Location information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Placement Location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Placement Location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get Tag list bound to the job.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag list bound to the job.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list bound to the job.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag list bound to the job.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "TaskMetrics.", this.TaskMetrics);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

