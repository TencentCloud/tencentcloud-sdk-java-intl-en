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
    private static String endpoint = "batch.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public BatchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BatchClient(Credential credential, String region, ClientProfile profile) {
        super(BatchClient.endpoint, BatchClient.version, credential, region, profile);
    }

    /**
     *This API is used to add existing instances to the compute environment.
Considerations: <br/>
1. The instance should not be in the batch compute system.<br/>
2. The instance status should be 'running'.<br/>
3. It supports dedicated CVMs and pay-as-you-go instances that billed on an hourly basis. Spot instances are not supported.<b/>

For instances added to the compute environment, their UserData will be reset and the operating systems will be reinstalled.
     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a compute environment.
     * @param req CreateComputeEnvRequest
     * @return CreateComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateComputeEnvResponse CreateComputeEnv(CreateComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateComputeEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateComputeEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateComputeEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a task template.
     * @param req CreateTaskTemplateRequest
     * @return CreateTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskTemplateResponse CreateTaskTemplate(CreateTaskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a compute environment.
     * @param req DeleteComputeEnvRequest
     * @return DeleteComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComputeEnvResponse DeleteComputeEnv(DeleteComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteComputeEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteComputeEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteComputeEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a job.
Deleting a job is equivalent to deleting all the information related to the job. After successful deletion, all information related to the job cannot be queried.
The job to be deleted must be in a completed state, and all task instances contained in it must also be in a completed state; otherwise, the operation will be prohibited. The completed state can be either SUCCEED or FAILED.
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete task template information.
     * @param req DeleteTaskTemplatesRequest
     * @return DeleteTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskTemplatesResponse DeleteTaskTemplates(DeleteTaskTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTaskTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the information of available CVM model configurations.
     * @param req DescribeAvailableCvmInstanceTypesRequest
     * @return DescribeAvailableCvmInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableCvmInstanceTypesResponse DescribeAvailableCvmInstanceTypes(DescribeAvailableCvmInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableCvmInstanceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableCvmInstanceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableCvmInstanceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query compute environment details.
     * @param req DescribeComputeEnvRequest
     * @return DescribeComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvResponse DescribeComputeEnv(DescribeComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComputeEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of activities in the compute environment.
     * @param req DescribeComputeEnvActivitiesRequest
     * @return DescribeComputeEnvActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvActivitiesResponse DescribeComputeEnvActivities(DescribeComputeEnvActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvActivitiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComputeEnvActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Views compute environment creation information.
     * @param req DescribeComputeEnvCreateInfoRequest
     * @return DescribeComputeEnvCreateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfoResponse DescribeComputeEnvCreateInfo(DescribeComputeEnvCreateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvCreateInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvCreateInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComputeEnvCreateInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the list of information of compute environment creation, including name, description, type, environment parameters, notifications, and number of desired nodes.
     * @param req DescribeComputeEnvCreateInfosRequest
     * @return DescribeComputeEnvCreateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvCreateInfosResponse DescribeComputeEnvCreateInfos(DescribeComputeEnvCreateInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvCreateInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvCreateInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComputeEnvCreateInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the list of compute environments.
     * @param req DescribeComputeEnvsRequest
     * @return DescribeComputeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComputeEnvsResponse DescribeComputeEnvs(DescribeComputeEnvsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComputeEnvsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComputeEnvsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComputeEnvs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the model configuration information of the availability zone of BatchCompute.
     * @param req DescribeCvmZoneInstanceConfigInfosRequest
     * @return DescribeCvmZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCvmZoneInstanceConfigInfosResponse DescribeCvmZoneInstanceConfigInfos(DescribeCvmZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCvmZoneInstanceConfigInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCvmZoneInstanceConfigInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCvmZoneInstanceConfigInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Currently, CVM instance families are classified into different category, and each category contains several instance families. This API is used to query the instance category information.
     * @param req DescribeInstanceCategoriesRequest
     * @return DescribeInstanceCategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCategoriesResponse DescribeInstanceCategories(DescribeInstanceCategoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceCategoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceCategoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceCategories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the details of a job, including internal task (Task) and dependency (Dependence) information.
     * @param req DescribeJobRequest
     * @return DescribeJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobResponse DescribeJob(DescribeJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the submission information of the specified job, with the return including the job submission information used as input parameters in the JobId and SubmitJob APIs.
     * @param req DescribeJobSubmitInfoRequest
     * @return DescribeJobSubmitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmitInfoResponse DescribeJobSubmitInfo(DescribeJobSubmitInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobSubmitInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobSubmitInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobSubmitInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the overview information of several instances.
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a specified task, including information of the task instances inside the task.
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the standard outputs and standard error logs of multiple task instances.
     * @param req DescribeTaskLogsRequest
     * @return DescribeTaskLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogsResponse DescribeTaskLogs(DescribeTaskLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of task templates.
     * @param req DescribeTaskTemplatesRequest
     * @return DescribeTaskTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskTemplatesResponse DescribeTaskTemplates(DescribeTaskTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove instances that from compute environment. 
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a compute environment.
     * @param req ModifyComputeEnvRequest
     * @return ModifyComputeEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyComputeEnvResponse ModifyComputeEnv(ModifyComputeEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyComputeEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyComputeEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyComputeEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a task template.
     * @param req ModifyTaskTemplateRequest
     * @return ModifyTaskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskTemplateResponse ModifyTaskTemplate(ModifyTaskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to retry the failing task instance in instances.
Job retry is supported only if a job is in the "FAILED" state. After the retry operation succeeds, the instance will retry the failing task instances in each task in turn according to the task dependencies specified in the "DAG". The history information of the task instances will be reset, the instances will participate in subsequent scheduling and execution as if they are run for the first time.
     * @param req RetryJobsRequest
     * @return RetryJobsResponse
     * @throws TencentCloudSDKException
     */
    public RetryJobsResponse RetryJobs(RetryJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RetryJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to submit a instance.
     * @param req SubmitJobRequest
     * @return SubmitJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitJobResponse SubmitJob(SubmitJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate a compute node.
Termination is allowed for nodes in the CREATED, CREATION_FAILED, RUNNING or ABNORMAL state.
     * @param req TerminateComputeNodeRequest
     * @return TerminateComputeNodeResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodeResponse TerminateComputeNode(TerminateComputeNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateComputeNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateComputeNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateComputeNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate compute nodes in batches. It is not allowed to repeatedly terminate the same node.
     * @param req TerminateComputeNodesRequest
     * @return TerminateComputeNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateComputeNodesResponse TerminateComputeNodes(TerminateComputeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateComputeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateComputeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateComputeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate an instance.
Termination is prohibited if an instance is in the "SUBMITTED" state and does not take effect if it is in the "SUCCEED" state.
Instance termination is an asynchronous process, and the time it takes to complete the entire process is directly proportional to the total number of tasks. The effect of terminating an instance is equivalent to performing the TerminateTaskInstance operation on all the task instances contained in the job. For more information on the specific effect and usage, see TerminateTaskInstance.
     * @param req TerminateJobRequest
     * @return TerminateJobResponse
     * @throws TencentCloudSDKException
     */
    public TerminateJobResponse TerminateJob(TerminateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate a task instance.
Task instances in the "SUCCEED" or "FAILED" state will not be processed.
Task instances in the "SUBMITTED", "PENDING", or "RUNNABLE" state will be set to the "FAILED" state.
For task instances in the "STARTING", "RUNNING", or "FAILED_INTERRUPTED" state, there will be two cases: if no compute environment is specified, the CVM instance will be terminated first, and then the state will be set to "FAILED"; if a compute environment's EnvId is specified, the state of the task instances will be set to "FAILED" first, and then the CVM instance that performs the task will be restarted. Both cases takes a certain amount of time to be completed.
For task instances in the "FAILED_INTERRUPTED" state, the related resources and quotas will be released only after the termination actually succeeds.
     * @param req TerminateTaskInstanceRequest
     * @return TerminateTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskInstanceResponse TerminateTaskInstance(TerminateTaskInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateTaskInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateTaskInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateTaskInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
