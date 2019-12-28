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

public class EventConfig extends AbstractModel{

    /**
    * Event type. Value range: <br/><li>"JOB_RUNNING": the job is running, applicable to "SubmitJob". </li><li>"JOB_SUCCEED: the job succeeded, applicable to "SubmitJob". </li><li>"JOB_FAILED": the job failed, applicable to "SubmitJob". </li><li>"JOB_FAILED_INTERRUPTED": the job failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_RUNNING": the task is running, applicable to "SubmitJob". </li><li>"TASK_SUCCEED": the task succeeded, applicable to "SubmitJob". </li><li>"TASK_FAILED": the task failed, applicable to "SubmitJob". </li><li>"TASK_FAILED_INTERRUPTED": the task failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_RUNNING": the task instance is running, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_SUCCEED": the task instance succeeded, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED": the task instance failed, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED_INTERRUPTED": the task instance failed and the instance is retained, applicable to "SubmitJob". </li><li>"COMPUTE_ENV_CREATED": the compute environment has been created, applicable to "CreateComputeEnv". </li><li>"COMPUTE_ENV_DELETED": the compute environment has been deleted, applicable to "CreateComputeEnv". </li><li>"COMPUTE_NODE_CREATED": the compute node has been created, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_CREATION_FAILED": the compute node creation failed, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_RUNNING": the compute node is running, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_ABNORMAL": the compute node is exceptional, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_DELETING": the compute node has been deleted, applicable to "CreateComputeEnv" and "SubmitJob". </li>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Custom key-value pair
    */
    @SerializedName("EventVars")
    @Expose
    private EventVar [] EventVars;

    /**
     * Get Event type. Value range: <br/><li>"JOB_RUNNING": the job is running, applicable to "SubmitJob". </li><li>"JOB_SUCCEED: the job succeeded, applicable to "SubmitJob". </li><li>"JOB_FAILED": the job failed, applicable to "SubmitJob". </li><li>"JOB_FAILED_INTERRUPTED": the job failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_RUNNING": the task is running, applicable to "SubmitJob". </li><li>"TASK_SUCCEED": the task succeeded, applicable to "SubmitJob". </li><li>"TASK_FAILED": the task failed, applicable to "SubmitJob". </li><li>"TASK_FAILED_INTERRUPTED": the task failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_RUNNING": the task instance is running, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_SUCCEED": the task instance succeeded, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED": the task instance failed, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED_INTERRUPTED": the task instance failed and the instance is retained, applicable to "SubmitJob". </li><li>"COMPUTE_ENV_CREATED": the compute environment has been created, applicable to "CreateComputeEnv". </li><li>"COMPUTE_ENV_DELETED": the compute environment has been deleted, applicable to "CreateComputeEnv". </li><li>"COMPUTE_NODE_CREATED": the compute node has been created, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_CREATION_FAILED": the compute node creation failed, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_RUNNING": the compute node is running, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_ABNORMAL": the compute node is exceptional, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_DELETING": the compute node has been deleted, applicable to "CreateComputeEnv" and "SubmitJob". </li> 
     * @return EventName Event type. Value range: <br/><li>"JOB_RUNNING": the job is running, applicable to "SubmitJob". </li><li>"JOB_SUCCEED: the job succeeded, applicable to "SubmitJob". </li><li>"JOB_FAILED": the job failed, applicable to "SubmitJob". </li><li>"JOB_FAILED_INTERRUPTED": the job failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_RUNNING": the task is running, applicable to "SubmitJob". </li><li>"TASK_SUCCEED": the task succeeded, applicable to "SubmitJob". </li><li>"TASK_FAILED": the task failed, applicable to "SubmitJob". </li><li>"TASK_FAILED_INTERRUPTED": the task failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_RUNNING": the task instance is running, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_SUCCEED": the task instance succeeded, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED": the task instance failed, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED_INTERRUPTED": the task instance failed and the instance is retained, applicable to "SubmitJob". </li><li>"COMPUTE_ENV_CREATED": the compute environment has been created, applicable to "CreateComputeEnv". </li><li>"COMPUTE_ENV_DELETED": the compute environment has been deleted, applicable to "CreateComputeEnv". </li><li>"COMPUTE_NODE_CREATED": the compute node has been created, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_CREATION_FAILED": the compute node creation failed, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_RUNNING": the compute node is running, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_ABNORMAL": the compute node is exceptional, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_DELETING": the compute node has been deleted, applicable to "CreateComputeEnv" and "SubmitJob". </li>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event type. Value range: <br/><li>"JOB_RUNNING": the job is running, applicable to "SubmitJob". </li><li>"JOB_SUCCEED: the job succeeded, applicable to "SubmitJob". </li><li>"JOB_FAILED": the job failed, applicable to "SubmitJob". </li><li>"JOB_FAILED_INTERRUPTED": the job failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_RUNNING": the task is running, applicable to "SubmitJob". </li><li>"TASK_SUCCEED": the task succeeded, applicable to "SubmitJob". </li><li>"TASK_FAILED": the task failed, applicable to "SubmitJob". </li><li>"TASK_FAILED_INTERRUPTED": the task failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_RUNNING": the task instance is running, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_SUCCEED": the task instance succeeded, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED": the task instance failed, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED_INTERRUPTED": the task instance failed and the instance is retained, applicable to "SubmitJob". </li><li>"COMPUTE_ENV_CREATED": the compute environment has been created, applicable to "CreateComputeEnv". </li><li>"COMPUTE_ENV_DELETED": the compute environment has been deleted, applicable to "CreateComputeEnv". </li><li>"COMPUTE_NODE_CREATED": the compute node has been created, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_CREATION_FAILED": the compute node creation failed, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_RUNNING": the compute node is running, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_ABNORMAL": the compute node is exceptional, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_DELETING": the compute node has been deleted, applicable to "CreateComputeEnv" and "SubmitJob". </li>
     * @param EventName Event type. Value range: <br/><li>"JOB_RUNNING": the job is running, applicable to "SubmitJob". </li><li>"JOB_SUCCEED: the job succeeded, applicable to "SubmitJob". </li><li>"JOB_FAILED": the job failed, applicable to "SubmitJob". </li><li>"JOB_FAILED_INTERRUPTED": the job failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_RUNNING": the task is running, applicable to "SubmitJob". </li><li>"TASK_SUCCEED": the task succeeded, applicable to "SubmitJob". </li><li>"TASK_FAILED": the task failed, applicable to "SubmitJob". </li><li>"TASK_FAILED_INTERRUPTED": the task failed and the instance is retained, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_RUNNING": the task instance is running, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_SUCCEED": the task instance succeeded, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED": the task instance failed, applicable to "SubmitJob". </li><li>"TASK_INSTANCE_FAILED_INTERRUPTED": the task instance failed and the instance is retained, applicable to "SubmitJob". </li><li>"COMPUTE_ENV_CREATED": the compute environment has been created, applicable to "CreateComputeEnv". </li><li>"COMPUTE_ENV_DELETED": the compute environment has been deleted, applicable to "CreateComputeEnv". </li><li>"COMPUTE_NODE_CREATED": the compute node has been created, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_CREATION_FAILED": the compute node creation failed, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_RUNNING": the compute node is running, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_ABNORMAL": the compute node is exceptional, applicable to "CreateComputeEnv" and "SubmitJob". </li><li>"COMPUTE_NODE_DELETING": the compute node has been deleted, applicable to "CreateComputeEnv" and "SubmitJob". </li>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Custom key-value pair 
     * @return EventVars Custom key-value pair
     */
    public EventVar [] getEventVars() {
        return this.EventVars;
    }

    /**
     * Set Custom key-value pair
     * @param EventVars Custom key-value pair
     */
    public void setEventVars(EventVar [] EventVars) {
        this.EventVars = EventVars;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamArrayObj(map, prefix + "EventVars.", this.EventVars);

    }
}

