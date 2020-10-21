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
    * Instance description
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * Job priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the job
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Task information
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
    * Tag list bound to the job.
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
     * Get Instance description 
     * @return JobDescription Instance description
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set Instance description
     * @param JobDescription Instance description
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get Job priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the job 
     * @return Priority Job priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the job
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Job priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the job
     * @param Priority Job priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the job
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Task information 
     * @return Tasks Task information
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task information
     * @param Tasks Task information
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

