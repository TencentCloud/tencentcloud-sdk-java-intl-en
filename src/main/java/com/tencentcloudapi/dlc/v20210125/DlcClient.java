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
     *This API is used to cancel a Spark SQL batch task.
     * @param req CancelSparkSessionBatchSQLRequest
     * @return CancelSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CancelSparkSessionBatchSQLResponse CancelSparkSessionBatchSQL(CancelSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelSparkSessionBatchSQLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CancelSparkSessionBatchSQL", CancelSparkSessionBatchSQLResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CancelTask", CancelTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a data engine.
     * @param req CreateDataEngineRequest
     * @return CreateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataEngineResponse CreateDataEngine(CreateDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDataEngine", CreateDataEngineResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a managed internal table. It has been disused.
     * @param req CreateInternalTableRequest
     * @return CreateInternalTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateInternalTableResponse CreateInternalTable(CreateInternalTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInternalTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateInternalTable", CreateInternalTableResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a query result download task.
     * @param req CreateResultDownloadRequest
     * @return CreateResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public CreateResultDownloadResponse CreateResultDownload(CreateResultDownloadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResultDownloadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateResultDownload", CreateResultDownloadResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a Spark job.
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSparkApp", CreateSparkAppResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to start a Spark job.
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSparkAppTask", CreateSparkAppTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to submit a Spark SQL batch task to the job engine.
     * @param req CreateSparkSessionBatchSQLRequest
     * @return CreateSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkSessionBatchSQLResponse CreateSparkSessionBatchSQL(CreateSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkSessionBatchSQLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSparkSessionBatchSQL", CreateSparkSessionBatchSQLResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create and execute a SQL task. (`CreateTasks` is recommended.)
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create and execute SQL tasks in batches.
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTasks", CreateTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a Spark job.
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSparkApp", DeleteSparkAppResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the resource usage of a data engine based on its ID.
     * @param req DescribeEngineUsageInfoRequest
     * @return DescribeEngineUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineUsageInfoResponse DescribeEngineUsageInfo(DescribeEngineUsageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEngineUsageInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEngineUsageInfo", DescribeEngineUsageInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of disabled table attributes (new).
     * @param req DescribeForbiddenTableProRequest
     * @return DescribeForbiddenTableProResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForbiddenTableProResponse DescribeForbiddenTablePro(DescribeForbiddenTableProRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeForbiddenTableProResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeForbiddenTablePro", DescribeForbiddenTableProResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the summary of a specified directory in a managed storage.
     * @param req DescribeLakeFsDirSummaryRequest
     * @return DescribeLakeFsDirSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsDirSummaryResponse DescribeLakeFsDirSummary(DescribeLakeFsDirSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLakeFsDirSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLakeFsDirSummary", DescribeLakeFsDirSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query managed storage information.
     * @param req DescribeLakeFsInfoRequest
     * @return DescribeLakeFsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsInfoResponse DescribeLakeFsInfo(DescribeLakeFsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLakeFsInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLakeFsInfo", DescribeLakeFsInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a query result download task.
     * @param req DescribeResultDownloadRequest
     * @return DescribeResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResultDownloadResponse DescribeResultDownload(DescribeResultDownloadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResultDownloadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeResultDownload", DescribeResultDownloadResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *u200cThis API is used to query the information of a Spark job.
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSparkAppJob", DescribeSparkAppJobResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of Spark jobs.
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSparkAppJobs", DescribeSparkAppJobsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of running task instances of a Spark job.
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSparkAppTasks", DescribeSparkAppTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the logs of a Spark SQL batch task.
     * @param req DescribeSparkSessionBatchSqlLogRequest
     * @return DescribeSparkSessionBatchSqlLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSqlLogResponse DescribeSparkSessionBatchSqlLog(DescribeSparkSessionBatchSqlLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkSessionBatchSqlLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSparkSessionBatchSqlLog", DescribeSparkSessionBatchSqlLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
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
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enumerate user roles.
     * @param req DescribeUserRolesRequest
     * @return DescribeUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRolesResponse DescribeUserRoles(DescribeUserRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUserRoles", DescribeUserRolesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to generate SQL statements for creating a managed table.
     * @param req GenerateCreateMangedTableSqlRequest
     * @return GenerateCreateMangedTableSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCreateMangedTableSqlResponse GenerateCreateMangedTableSql(GenerateCreateMangedTableSqlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateCreateMangedTableSqlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GenerateCreateMangedTableSql", GenerateCreateMangedTableSqlResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change data governance event thresholds.
     * @param req ModifyGovernEventRuleRequest
     * @return ModifyGovernEventRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernEventRuleResponse ModifyGovernEventRule(ModifyGovernEventRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGovernEventRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyGovernEventRule", ModifyGovernEventRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a Spark job.
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySparkApp", ModifySparkAppResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify Spark job parameters in batches.
     * @param req ModifySparkAppBatchRequest
     * @return ModifySparkAppBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppBatchResponse ModifySparkAppBatch(ModifySparkAppBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppBatchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySparkAppBatch", ModifySparkAppBatchResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to suspend or start a data engine.
     * @param req SuspendResumeDataEngineRequest
     * @return SuspendResumeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SuspendResumeDataEngineResponse SuspendResumeDataEngine(SuspendResumeDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendResumeDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SuspendResumeDataEngine", SuspendResumeDataEngineResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to switch between the primary and standby clusters.
     * @param req SwitchDataEngineRequest
     * @return SwitchDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineResponse SwitchDataEngine(SwitchDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SwitchDataEngine", SwitchDataEngineResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update row filters. Please note that it updates filters only but not catalogs, databases, or tables.
     * @param req UpdateRowFilterRequest
     * @return UpdateRowFilterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRowFilterResponse UpdateRowFilter(UpdateRowFilterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRowFilterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateRowFilter", UpdateRowFilterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
