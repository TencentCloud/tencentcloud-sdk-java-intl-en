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
package com.tencentcloudapi.batch.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.batch.v20170312.models.*;

public class BatchClient extends AbstractClient{
    private static String endpoint = "batch.intl.tencentcloudapi.com";
    private static String service = "batch";
    private static String version = "2017-03-12";

    public BatchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BatchClient(Credential credential, String region, ClientProfile profile) {
        super(BatchClient.endpoint, BatchClient.version, credential, region, profile);
    }

    /**
     *This API is used to add existing instances to the compute environment.
Requirements: <br/>
1. The instance is not in the batch compute system.<br/>
2. The instance is in “Running” status.<br/>
3. Spot instances are not supported.<b/>

For instances added to the compute environment, their UserData will be reset, and the operating systems will be reinstalled.
     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachInstances", AttachInstancesResponse.class);
    }

    /**
     *This API is used to create a compute environment.
     * @param req CreateComputeEnvRequest
     * @return CreateComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateComputeEnvResponse CreateComputeEnv(CreateComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComputeEnv", CreateComputeEnvResponse.class);
    }

    /**
     *This API is used to create a task template.
     * @param req CreateTaskTemplateRequest
     * @return CreateTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskTemplateResponse CreateTaskTemplate(CreateTaskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskTemplate", CreateTaskTemplateResponse.class);
    }

    /**
     *This API is used to delete a compute environment.
     * @param req DeleteComputeEnvRequest
     * @return DeleteComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComputeEnvResponse DeleteComputeEnv(DeleteComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteComputeEnv", DeleteComputeEnvResponse.class);
    }

    /**
     *This API is used to delete a job.
When a job is deleted, all related information is deleted and the job cannot be queried.
To delete a job, the job and all its task instances must be in SUCCEED or FAILED status.
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJob", DeleteJobResponse.class);
    }

    /**
     *This API is used to delete task template information.
     * @param req DeleteTaskTemplatesRequest
     * @return DeleteTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskTemplatesResponse DeleteTaskTemplates(DeleteTaskTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskTemplates", DeleteTaskTemplatesResponse.class);
    }

    /**
     *This API is used to view the information of available CVM model configurations.
     * @param req DescribeAvailableCvmInstanceTypesRequest
     * @return DescribeAvailableCvmInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableCvmInstanceTypesResponse DescribeAvailableCvmInstanceTypes(DescribeAvailableCvmInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableCvmInstanceTypes", DescribeAvailableCvmInstanceTypesResponse.class);
    }

    /**
     *This API is used to query compute environment details.
     * @param req DescribeComputeEnvRequest
     * @return DescribeComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvResponse DescribeComputeEnv(DescribeComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnv", DescribeComputeEnvResponse.class);
    }

    /**
     *This API is used to query the information of activities in the compute environment.
     * @param req DescribeComputeEnvActivitiesRequest
     * @return DescribeComputeEnvActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvActivitiesResponse DescribeComputeEnvActivities(DescribeComputeEnvActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvActivities", DescribeComputeEnvActivitiesResponse.class);
    }

    /**
     *This API is used to query the compute environment creation information.
     * @param req DescribeComputeEnvCreateInfoRequest
     * @return DescribeComputeEnvCreateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfoResponse DescribeComputeEnvCreateInfo(DescribeComputeEnvCreateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvCreateInfo", DescribeComputeEnvCreateInfoResponse.class);
    }

    /**
     *This API is used to view the list of information of compute environment creation, including name, description, type, environment parameters, notifications, and number of desired nodes.
     * @param req DescribeComputeEnvCreateInfosRequest
     * @return DescribeComputeEnvCreateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfosResponse DescribeComputeEnvCreateInfos(DescribeComputeEnvCreateInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvCreateInfos", DescribeComputeEnvCreateInfosResponse.class);
    }

    /**
     *This API is used to get the list of compute environments.
     * @param req DescribeComputeEnvsRequest
     * @return DescribeComputeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvsResponse DescribeComputeEnvs(DescribeComputeEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComputeEnvs", DescribeComputeEnvsResponse.class);
    }

    /**
     *This API is used to get the model configuration information of the availability zone of BatchCompute.
     * @param req DescribeCvmZoneInstanceConfigInfosRequest
     * @return DescribeCvmZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCvmZoneInstanceConfigInfosResponse DescribeCvmZoneInstanceConfigInfos(DescribeCvmZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCvmZoneInstanceConfigInfos", DescribeCvmZoneInstanceConfigInfosResponse.class);
    }

    /**
     *Currently, CVM instance families are classified into different category, and each category contains several instance families. This API is used to query the instance category information.
     * @param req DescribeInstanceCategoriesRequest
     * @return DescribeInstanceCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCategoriesResponse DescribeInstanceCategories(DescribeInstanceCategoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceCategories", DescribeInstanceCategoriesResponse.class);
    }

    /**
     *This API is used to query the details of a job, including internal task (`Task`) and dependency (`Dependence`) information.
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJob", DescribeJobResponse.class);
    }

    /**
     *This API is used to query the submission information of the specified job, with the return including the job submission information used as input parameters in the JobId and SubmitJob APIs.
     * @param req DescribeJobSubmitInfoRequest
     * @return DescribeJobSubmitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmitInfoResponse DescribeJobSubmitInfo(DescribeJobSubmitInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobSubmitInfo", DescribeJobSubmitInfoResponse.class);
    }

    /**
     *This API is used to query the overview information of several jobs.
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *This API is used to query the details of a specified task, including information of the task instances inside the task.
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *This API is used to get the standard outputs and standard error logs of multiple task instances.
     * @param req DescribeTaskLogsRequest
     * @return DescribeTaskLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogsResponse DescribeTaskLogs(DescribeTaskLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogs", DescribeTaskLogsResponse.class);
    }

    /**
     *This API is used to query the information of task templates.
     * @param req DescribeTaskTemplatesRequest
     * @return DescribeTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTemplatesResponse DescribeTaskTemplates(DescribeTaskTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskTemplates", DescribeTaskTemplatesResponse.class);
    }

    /**
     *This API is used to remove instances that from compute environment. 
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachInstances", DetachInstancesResponse.class);
    }

    /**
     *This API is used to modify the attributes of a compute environment.
     * @param req ModifyComputeEnvRequest
     * @return ModifyComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyComputeEnvResponse ModifyComputeEnv(ModifyComputeEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyComputeEnv", ModifyComputeEnvResponse.class);
    }

    /**
     *This API is used to modify a task template.
     * @param req ModifyTaskTemplateRequest
     * @return ModifyTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskTemplateResponse ModifyTaskTemplate(ModifyTaskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskTemplate", ModifyTaskTemplateResponse.class);
    }

    /**
     *This API is used to retry the failed task instances in a job.
Job retry is supported only if a job is in the "FAILED" state. After the retry operation succeeds, the job will retry the failing task instances in each task in turn according to the task dependencies specified in the "DAG". The history information of the task instances will be reset, the instances will participate in subsequent scheduling and execution as if they are run for the first time.
     * @param req RetryJobsRequest
     * @return RetryJobsResponse
     * @throws TencentCloudSDKException
     */
    public RetryJobsResponse RetryJobs(RetryJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryJobs", RetryJobsResponse.class);
    }

    /**
     *This API is used to terminate a compute node.
Termination is allowed for nodes in the CREATED, CREATION_FAILED, RUNNING or ABNORMAL state.
     * @param req TerminateComputeNodeRequest
     * @return TerminateComputeNodeResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodeResponse TerminateComputeNode(TerminateComputeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateComputeNode", TerminateComputeNodeResponse.class);
    }

    /**
     *This API is used to terminate compute nodes in batches. It is not allowed to repeatedly terminate the same node.
     * @param req TerminateComputeNodesRequest
     * @return TerminateComputeNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodesResponse TerminateComputeNodes(TerminateComputeNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateComputeNodes", TerminateComputeNodesResponse.class);
    }

    /**
     *This API is used to terminate a job.
Termination is prohibited if a job is in the `SUBMITTED` state and does not take effect if it is in the `SUCCEED` state.
Job termination is an asynchronous process, and the time it takes to complete the entire process is directly proportional to the total number of tasks. The effect of terminating a job is equivalent to performing the TerminateTaskInstance operation on all the task instances contained in the job. For more information on the specific effect and usage, see TerminateTaskInstance.
     * @param req TerminateJobRequest
     * @return TerminateJobResponse
     * @throws TencentCloudSDKException
     */
    public TerminateJobResponse TerminateJob(TerminateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateJob", TerminateJobResponse.class);
    }

    /**
     *This API is used to terminate a task instance.
`SUCCEED` and `FAILED` task instances: No action
`SUBMITTED`, `PENDING`, and `RUNNABLE` task instances: Change status to `FAILED`.
`STARTING`, `RUNNING` and `FAILED_INTERRUPTED` task instances: If `EnvId` is not specified, the CVM instance is terminated, and then the task status goes to `FAILED`. If `EnvId` is specified, the task instance changes to `FAILED`, then the related CVM instance is restarted. 
`FAILED_INTERRUPTED` task instances: The related resources and quotas will be released only after the termination actually succeeds.
     * @param req TerminateTaskInstanceRequest
     * @return TerminateTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskInstanceResponse TerminateTaskInstance(TerminateTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTaskInstance", TerminateTaskInstanceResponse.class);
    }

}
