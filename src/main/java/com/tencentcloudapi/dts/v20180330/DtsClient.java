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
package com.tencentcloudapi.dts.v20180330;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dts.v20180330.models.*;

public class DtsClient extends AbstractClient{
    private static String endpoint = "dts.tencentcloudapi.com";
    private static String service = "dts";
    private static String version = "2018-03-30";

    public DtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DtsClient(Credential credential, String region, ClientProfile profile) {
        super(DtsClient.endpoint, DtsClient.version, credential, region, profile);
    }

    /**
     *This API is used to configure a data subscription, which can be called only for subscription instances in unconfigured status.
     * @param req ActivateSubscribeRequest
     * @return ActivateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ActivateSubscribeResponse ActivateSubscribe(ActivateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActivateSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ActivateSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ActivateSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CompleteMigrateJob) is used to complete a data migration task.
For tasks in incremental migration mode, you need to call this API before migration gets ready, so as to stop migrating incremental data.
If the task status queried through the (DescribeMigrateJobs) API is ready (status=8), you can call this API to complete the migration task.

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
     *This API is used to create a migration check task.
Before migration, you should call this API to create a check. Migration will start only if the check succeeds. You can view the check result through the DescribeMigrateCheckJob API.
After successful check, if the migration task needs to be modified, a new check task should be created and migration will begin only after the new check succeeds.
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
     *This API (CreateMigrateJob) is used to create a data migration task.

For a finance zone linkage, please use the domain name dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req CreateMigrateJobRequest
     * @return CreateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateJobResponse CreateMigrateJob(CreateMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a data subscription instance.
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Before the StartSyncJob API is called to start disaster recovery sync, this API should be called first to create a check. Data sync can start only if the check succeeds. You can view the check result through the DescribeSyncCheckJob API.
Sync can begin only if the check succeeds.
     * @param req CreateSyncCheckJobRequest
     * @return CreateSyncCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncCheckJobResponse CreateSyncCheckJob(CreateSyncCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSyncCheckJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSyncCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSyncCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSyncJob) is used to create a disaster recovery sync task.
After successful creation, check can be initiated through the CreateSyncCheckJob API. The sync task can be started through the StartSyncJob API only if the check succeeds.
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
     *This API (DeleteMigrationJob) is used to delete a data migration task. If the task status queried through the DescribeMigrateJobs API is checking (status=3), running (status=7), ready (status=8), canceling (status=11), or completing (status=12), the task cannot be deleted.
     * @param req DeleteMigrateJobRequest
     * @return DeleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrateJobResponse DeleteMigrateJob(DeleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a disaster recovery sync task. Sync tasks that are running cannot be deleted.
     * @param req DeleteSyncJobRequest
     * @return DeleteSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSyncJobResponse DeleteSyncJob(DeleteSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the execution result of a task.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncRequestInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRequestInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncRequestInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the check result and query check status and progress after a check is created. 
If the check succeeds, you can call the StartMigrateJob API to start migration.
If the check fails, the reason can be queried. Please modify the migration configuration or adjust relevant parameters of the source/target instances through the ModifyMigrateJob API based on the error message.
     * @param req DescribeMigrateCheckJobRequest
     * @return DescribeMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateCheckJobResponse DescribeMigrateCheckJob(DescribeMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateCheckJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrateCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query data migration tasks.
For a finance zone linkage, please use the domain name https://dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req DescribeMigrateJobsRequest
     * @return DescribeMigrateJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateJobsResponse DescribeMigrateJobs(DescribeMigrateJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrateJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable subscription instance regions.
     * @param req DescribeRegionConfRequest
     * @return DescribeRegionConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionConfResponse DescribeRegionConf(DescribeRegionConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegionConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the subscription instance configuration.
     * @param req DescribeSubscribeConfRequest
     * @return DescribeSubscribeConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeConfResponse DescribeSubscribeConf(DescribeSubscribeConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscribeConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscribeConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubscribeConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information list of data subscription instances. Pagination is enabled by default with 20 results returned each time.
     * @param req DescribeSubscribesRequest
     * @return DescribeSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribesResponse DescribeSubscribes(DescribeSubscribesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscribesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscribesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubscribes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the check result after a disaster recovery sync check task is created through the CreateSyncCheckJob API. Check status and progress can be queried.
If the check succeeds, you can call the StartSyncJob API to start the sync task.
If the check fails, the reason will be returned. You can modify the configuration through the ModifySyncJob API and initiate check again.
It takes about 30 seconds to complete the check task. If the returned status is not "finished", the check has not been completed, and this API needs to be polled.
If Status=finished and CheckFlag=1, the check succeeds.
If Status=finished and CheckFlag !=1, the check fails.
     * @param req DescribeSyncCheckJobRequest
     * @return DescribeSyncCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncCheckJobResponse DescribeSyncCheckJob(DescribeSyncCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncCheckJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSyncCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query disaster recovery sync tasks initiated on the DTS platform.
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
     *This API is used to isolate an hourly billed subscription instance. After this API is called, the instance will become unavailable and billing will stop for it.
     * @param req IsolateSubscribeRequest
     * @return IsolateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSubscribeResponse IsolateSubscribe(IsolateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyMigrateJob) is used to modify a data migration task.
If the status of a migration task is creating (status=1), check succeeded (status=4), check failed (status=5), or migration failed (status=10), this API can be called to modify the task, but the type of the source and target instances and the region of the target instance cannot be modified.

For a finance zone linkage, please use the domain name dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req ModifyMigrateJobRequest
     * @return ModifyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobResponse ModifyMigrateJob(ModifyMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the consumption time point of a data subscription channel.
     * @param req ModifySubscribeConsumeTimeRequest
     * @return ModifySubscribeConsumeTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeConsumeTimeResponse ModifySubscribeConsumeTime(ModifySubscribeConsumeTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeConsumeTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeConsumeTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubscribeConsumeTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to rename a data subscription instance.
     * @param req ModifySubscribeNameRequest
     * @return ModifySubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeNameResponse ModifySubscribeName(ModifySubscribeNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubscribeName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the subscription rule of a data subscription channel.
     * @param req ModifySubscribeObjectsRequest
     * @return ModifySubscribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeObjectsResponse ModifySubscribeObjects(ModifySubscribeObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeObjectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeObjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubscribeObjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the IP and port number of a data subscription instance.
     * @param req ModifySubscribeVipVportRequest
     * @return ModifySubscribeVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeVipVportResponse ModifySubscribeVipVport(ModifySubscribeVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeVipVportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeVipVportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubscribeVipVport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a disaster recovery sync task. 
If the status of a sync task is creating, created, check succeeded, or check failed, this API can be called to modify the task. 
The information of the source and target instances cannot be modified, but the task name and the tables to be synced can.
     * @param req ModifySyncJobRequest
     * @return ModifySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncJobResponse ModifySyncJob(ModifySyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySyncJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deactivate an isolated data subscription instance.
     * @param req OfflineIsolatedSubscribeRequest
     * @return OfflineIsolatedSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedSubscribeResponse OfflineIsolatedSubscribe(OfflineIsolatedSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineIsolatedSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset a data subscription instance. Once reset, an activated instance can be bound to other database instances through the `ActivateSubscribe` API.
     * @param req ResetSubscribeRequest
     * @return ResetSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResetSubscribeResponse ResetSubscribe(ResetSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (StartMigrationJob) is used to start a migration task. After the API is called, non-scheduled migration tasks will start the migration immediately, while scheduled tasks will start the countdown.
Before calling this API, be sure to use the CreateMigrateCheckJob API to check the data migration task, which can be started only if its status queried through the DescribeMigrateJobs API is check succeeded (status=4).
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
     *This API is used to start a disaster recovery sync task after it is successfully checked through the CreateSyncCheckJob and DescribeSyncCheckJob APIs.
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
     *This API (StopMigrateJob) is used to cancel a data migration task.
During migration, this API can be used to cancel migration if the task status queried through the DescribeMigrateJobs API is running (status=7) or ready (status=8), and the migration task will fail.
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
     *This API is used to promote a disaster recovery instance to a master instance, which will stop sync from the original master instance and end the master/slave relationship.
     * @param req SwitchDrToMasterRequest
     * @return SwitchDrToMasterResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDrToMasterResponse SwitchDrToMaster(SwitchDrToMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDrToMasterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDrToMasterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDrToMaster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
