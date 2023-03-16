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
package com.tencentcloudapi.dts.v20211206;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dts.v20211206.models.*;

public class DtsClient extends AbstractClient{
    private static String endpoint = "dts.tencentcloudapi.com";
    private static String service = "dts";
    private static String version = "2021-12-06";

    public DtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DtsClient(Credential credential, String region, ClientProfile profile) {
        super(DtsClient.endpoint, DtsClient.version, credential, region, profile);
    }

    /**
     *This API is used to complete a data migration task.
For tasks in incremental migration mode, you need to call this API before migration gets ready for completion to stop migrating incremental data.
If the task status queried through the `DescribeMigrationJobs` API is ready (`Status` = `readyComplete), you can call this API to complete the migration task.

     * @param req CompleteMigrateJobRequest
     * @return CompleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrateJobResponse CompleteMigrateJob(CompleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompleteMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure a sync task.
     * @param req ConfigureSyncJobRequest
     * @return ConfigureSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSyncJobResponse ConfigureSyncJob(ConfigureSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConfigureSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ConfigureSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConfigureSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume a paused migration task.
     * @param req ContinueMigrateJobRequest
     * @return ContinueMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueMigrateJobResponse ContinueMigrateJob(ContinueMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContinueMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ContinueMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContinueMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume a paused data sync task.
     * @param req ContinueSyncJobRequest
     * @return ContinueSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueSyncJobResponse ContinueSyncJob(ContinueSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContinueSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ContinueSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContinueSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify a sync task by checking required parameters and peripheral configuration.
     * @param req CreateCheckSyncJobRequest
     * @return CreateCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckSyncJobResponse CreateCheckSyncJob(CreateCheckSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCheckSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCheckSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCheckSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a data consistency check task. After the task is successfully created, its ID will be returned in the format of `dts-8yv4w2i1-cmp-37skmii9`, and you can call `StartCompare` to start it.
     * @param req CreateCompareTaskRequest
     * @return CreateCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCompareTaskResponse CreateCompareTask(CreateCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCompareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify a migration task.
Before migration, you should call this API to create a check task. Migration will start only if the check succeeds. You can view the check result through the `DescribeMigrationCheckJob` API.
After successful check, if the migration task needs to be modified, a new check task should be created, and migration will start only after the new check succeeds.

     * @param req CreateMigrateCheckJobRequest
     * @return CreateMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateCheckJobResponse CreateMigrateCheckJob(CreateMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateCheckJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigrateCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to purchase migration tasks. After the tasks are purchased successfully, a randomly generated list of task IDs will be returned. You can also call the `DescribeMigrationJobs` API to query the IDs of the successfully purchased tasks. Note that once a task is purchased successfully, the types and regions of the source and target databases cannot be changed.
     * @param req CreateMigrationServiceRequest
     * @return CreateMigrationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationServiceResponse CreateMigrationService(CreateMigrationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrationServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigrationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a sync task.
     * @param req CreateSyncJobRequest
     * @return CreateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncJobResponse CreateSyncJob(CreateSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a data consistency check task, which can be called when the task status is `success`, `failed`, or `canceled`.
     * @param req DeleteCompareTaskRequest
     * @return DeleteCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompareTaskResponse DeleteCompareTask(DeleteCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCompareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the result of the sync check task and check the required parameters and peripheral configurations.
     * @param req DescribeCheckSyncJobResultRequest
     * @return DescribeCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSyncJobResultResponse DescribeCheckSyncJobResult(DescribeCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckSyncJobResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckSyncJobResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckSyncJobResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a data consistency check task.
     * @param req DescribeCompareReportRequest
     * @return DescribeCompareReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareReportResponse DescribeCompareReport(DescribeCompareReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompareReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompareReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompareReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of data consistency check tasks under the current task.
     * @param req DescribeCompareTasksRequest
     * @return DescribeCompareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareTasksResponse DescribeCompareTasks(DescribeCompareTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompareTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompareTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompareTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query migratable database instances.
     * @param req DescribeMigrateDBInstancesRequest
     * @return DescribeMigrateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateDBInstancesResponse DescribeMigrateDBInstances(DescribeMigrateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the check result and query the check status and progress after a check is created. 
If the check succeeds, you can call the `StartMigrateJob` API to start migration.
If the check fails, the cause can be queried. Modify the migration configuration or adjust relevant parameters of the source/target instances through the `ModifyMigrationJob` API based on the error message.
     * @param req DescribeMigrationCheckJobRequest
     * @return DescribeMigrationCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationCheckJobResponse DescribeMigrationCheckJob(DescribeMigrationCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationCheckJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a migration task.
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of data migration tasks.
     * @param req DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationJobsResponse DescribeMigrationJobs(DescribeMigrationJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of a sync task.
     * @param req DescribeSyncJobsRequest
     * @return DescribeSyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncJobsResponse DescribeSyncJobs(DescribeSyncJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSyncJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a data migration task. For a billed task, you must first call the `IsolateMigrateJob` API to isolate it and make sure that it is in **Isolated** status before calling this API to delete it. For a free task, you can directly call the `IsolateMigrateJob` API to delete it.
     * @param req DestroyMigrateJobRequest
     * @return DestroyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroyMigrateJobResponse DestroyMigrateJob(DestroyMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a sync task. Only tasks in **Isolated** status can be completely deleted. After deletion, you can call the `DescribeSyncJobs` API to get the task list. If the deleted task is not in the list, it is deleted successfully.
     * @param req DestroySyncJobRequest
     * @return DestroySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroySyncJobResponse DestroySyncJob(DestroySyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroySyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroySyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroySyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API is used to isolate and return a data migration task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status. For a billed task, after isolating it, you can call `RecoverMigrationJob` to recover it or call `DestroyMigrateJob` to delete it. For a free task, calling this API will directly delete it permanently.
     * @param req IsolateMigrateJobRequest
     * @return IsolateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateMigrateJobResponse IsolateMigrateJob(IsolateMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to isolate a sync task. After the task is isolated, you can call the `DescribeSyncJobs` API to query its status, call `RecoverSyncJob` to recover it, or directly delete it. For a free task, calling this API will directly delete it permanently.
     * @param req IsolateSyncJobRequest
     * @return IsolateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSyncJobResponse IsolateSyncJob(IsolateSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the parameters of a data consistency check task after it is created and before it starts.
     * @param req ModifyCompareTaskRequest
     * @return ModifyCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskResponse ModifyCompareTask(ModifyCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a data consistency check task.
     * @param req ModifyCompareTaskNameRequest
     * @return ModifyCompareTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskNameResponse ModifyCompareTaskName(ModifyCompareTaskNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompareTaskNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCompareTaskNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCompareTaskName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to adjust the specification of a pay-as-you-go task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req ModifyMigrateJobSpecRequest
     * @return ModifyMigrateJobSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobSpecResponse ModifyMigrateJobSpec(ModifyMigrateJobSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateJobSpecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateJobSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrateJobSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a migration task.
     * @param req ModifyMigrateNameRequest
     * @return ModifyMigrateNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateNameResponse ModifyMigrateName(ModifyMigrateNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrateName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure a migration task. After it is configured successfully, you can call the `CreateMigrationCheckJob` API to create a check task, and only after it passes the check can it be started.
     * @param req ModifyMigrationJobRequest
     * @return ModifyMigrationJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationJobResponse ModifyMigrationJob(ModifyMigrationJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrationJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pause a migration task.
     * @param req PauseMigrateJobRequest
     * @return PauseMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseMigrateJobResponse PauseMigrateJob(PauseMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PauseMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pause a data sync task.
     * @param req PauseSyncJobRequest
     * @return PauseSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseSyncJobResponse PauseSyncJob(PauseSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PauseSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recover a data migration task in **Isolated** status. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req RecoverMigrateJobRequest
     * @return RecoverMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMigrateJobResponse RecoverMigrateJob(RecoverMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recover a sync task in **Isolated** status. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req RecoverSyncJobRequest
     * @return RecoverSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverSyncJobResponse RecoverSyncJob(RecoverSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to adjust the specification of a pay-as-you-go sync task. After this API is called, the backend needs to take about 3-5 minutes to implement the adjustment. You can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req ResizeSyncJobRequest
     * @return ResizeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResizeSyncJobResponse ResizeSyncJob(ResizeSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to retry an abnormal or failed Redis data migration task. Note that this operation will skip the check stage and directly start the task, just like by calling `StartMigrationJob`. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req ResumeMigrateJobRequest
     * @return ResumeMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeMigrateJobResponse ResumeMigrateJob(ResumeMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to retry a sync task after certain resolvable errors are reported. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req ResumeSyncJobRequest
     * @return ResumeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSyncJobResponse ResumeSyncJob(ResumeSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used for the backend to skip a failed check item. Theoretically, to execute a migration task normally, any check step cannot be skipped, and the check must be passed. For products or links that support check item skipping, see [Check Item Overview](https://www.tencentcloud.com/document/product/571/42551).
     * @param req SkipCheckItemRequest
     * @return SkipCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipCheckItemResponse SkipCheckItem(SkipCheckItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SkipCheckItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SkipCheckItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SkipCheckItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used for the backend to skip a failed check item. Theoretically, to execute a sync task normally, any check step cannot be skipped, and the check must be passed. For products or links that support check item skipping, see [Check Item Overview](https://www.tencentcloud.com/document/product/571/42551).
     * @param req SkipSyncCheckItemRequest
     * @return SkipSyncCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipSyncCheckItemResponse SkipSyncCheckItem(SkipSyncCheckItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SkipSyncCheckItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SkipSyncCheckItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SkipSyncCheckItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a data consistency check task after creating it by calling the `CreateCompareTask` API. After calling this API, you can call the `DescribeCompareTasks` API to query the latest task status.
     * @param req StartCompareRequest
     * @return StartCompareResponse
     * @throws TencentCloudSDKException
     */
    public StartCompareResponse StartCompare(StartCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartCompareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (`StartMigrationJob`) is used to start a migration task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a sync task.
     * @param req StartSyncJobRequest
     * @return StartSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartSyncJobResponse StartSyncJob(StartSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a data consistency check task.
     * @param req StopCompareRequest
     * @return StopCompareResponse
     * @throws TencentCloudSDKException
     */
    public StopCompareResponse StopCompare(StopCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopCompareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a data migration task.
After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a sync task. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req StopSyncJobRequest
     * @return StopSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StopSyncJobResponse StopSyncJob(StopSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
