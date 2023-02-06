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
package com.tencentcloudapi.dlc.v20210125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dlc.v20210125.models.*;

public class DlcClient extends AbstractClient{
    private static String endpoint = "dlc.tencentcloudapi.com";
    private static String service = "dlc";
    private static String version = "2021-01-25";

    public DlcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DlcClient(Credential credential, String region, ClientProfile profile) {
        super(DlcClient.endpoint, DlcClient.version, credential, region, profile);
    }

    /**
     *This API is used to cancel a task.
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Spark application.
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a Spark task.
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSparkAppTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSparkAppTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a SQL query task. (We recommend you use the `CreateTasks` API instead.)
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create tasks in batches.
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Spark application.
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a specific Spark application.
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of Spark applications.
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of running task instances of a Spark application.
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the result of a task.
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of tasks.
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a Spark application.
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to suspend or resume a data engine.
     * @param req SuspendResumeDataEngineRequest
     * @return SuspendResumeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SuspendResumeDataEngineResponse SuspendResumeDataEngine(SuspendResumeDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendResumeDataEngineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SuspendResumeDataEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SuspendResumeDataEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
