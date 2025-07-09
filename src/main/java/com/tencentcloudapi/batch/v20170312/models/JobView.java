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

public class JobView extends AbstractModel {

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
    * Job state
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * Job priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Location information
Note: This field may return `null`, indicating that no valid value was found.
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
Note: This field may return `null`, indicating that no valid value was found.
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
    * List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get Location information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Placement Location information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location information
Note: This field may return `null`, indicating that no valid value was found.
     * @param Placement Location information
Note: This field may return `null`, indicating that no valid value was found.
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
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EndTime End time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return `null`, indicating that no valid value was found.
     * @param EndTime End time
Note: This field may return `null`, indicating that no valid value was found.
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

    public JobView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobView(JobView source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobState != null) {
            this.JobState = new String(source.JobState);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskMetrics != null) {
            this.TaskMetrics = new TaskMetrics(source.TaskMetrics);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
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

