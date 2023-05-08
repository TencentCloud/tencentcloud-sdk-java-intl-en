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

public class DescribeJobSubmitInfoResponse extends AbstractModel{

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
    * Job description
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * Job priority. Tasks (Task) and task instances (TaskInstance) inherit the job priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Information of tasks in the job
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * Dependency information
    */
    @SerializedName("Dependences")
    @Expose
    private Dependence [] Dependences;

    /**
    * List of tags bound with the job.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get Job description 
     * @return JobDescription Job description
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set Job description
     * @param JobDescription Job description
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get Job priority. Tasks (Task) and task instances (TaskInstance) inherit the job priority 
     * @return Priority Job priority. Tasks (Task) and task instances (TaskInstance) inherit the job priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Job priority. Tasks (Task) and task instances (TaskInstance) inherit the job priority
     * @param Priority Job priority. Tasks (Task) and task instances (TaskInstance) inherit the job priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Information of tasks in the job 
     * @return Tasks Information of tasks in the job
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Information of tasks in the job
     * @param Tasks Information of tasks in the job
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Dependency information 
     * @return Dependences Dependency information
     */
    public Dependence [] getDependences() {
        return this.Dependences;
    }

    /**
     * Set Dependency information
     * @param Dependences Dependency information
     */
    public void setDependences(Dependence [] Dependences) {
        this.Dependences = Dependences;
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

    public DescribeJobSubmitInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobSubmitInfoResponse(DescribeJobSubmitInfoResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobDescription != null) {
            this.JobDescription = new String(source.JobDescription);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Tasks != null) {
            this.Tasks = new Task[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new Task(source.Tasks[i]);
            }
        }
        if (source.Dependences != null) {
            this.Dependences = new Dependence[source.Dependences.length];
            for (int i = 0; i < source.Dependences.length; i++) {
                this.Dependences[i] = new Dependence(source.Dependences[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Dependences.", this.Dependences);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

