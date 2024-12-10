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
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateSubscribe", ActivateSubscribeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteMigrateJob", CompleteMigrateJobResponse.class);
    }

    /**
     *This API is used to create a migration check task.
Before migration, you should call this API to create a check. Migration will start only if the check succeeds. You can view the check result through the `DescribeMigrateCheckJob` API.
After successful check, if the migration task needs to be modified, a new check task should be created and migration will begin only after the new check succeeds.

For a finance zone link, use the domain name https://dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req CreateMigrateCheckJobRequest
     * @return CreateMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateCheckJobResponse CreateMigrateCheckJob(CreateMigrateCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrateCheckJob", CreateMigrateCheckJobResponse.class);
    }

    /**
     *This API (CreateMigrateJob) is used to create a data migration task.

For a finance zone linkage, please use the domain name dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req CreateMigrateJobRequest
     * @return CreateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateJobResponse CreateMigrateJob(CreateMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrateJob", CreateMigrateJobResponse.class);
    }

    /**
     *This API is used to create a data subscription instance.
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribe", CreateSubscribeResponse.class);
    }

    /**
     *This API (DeleteMigrationJob) is used to delete a data migration task. If the task status queried through the DescribeMigrateJobs API is checking (status=3), running (status=7), ready (status=8), canceling (status=11), or completing (status=12), the task cannot be deleted.
     * @param req DeleteMigrateJobRequest
     * @return DeleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrateJobResponse DeleteMigrateJob(DeleteMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMigrateJob", DeleteMigrateJobResponse.class);
    }

    /**
     *This API is used to query the execution result of a task.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrateCheckJob", DescribeMigrateCheckJobResponse.class);
    }

    /**
     *This API is used to query data migration tasks.
For a finance zone linkage, please use the domain name https://dts.ap-shenzhen-fsi.tencentcloudapi.com.
     * @param req DescribeMigrateJobsRequest
     * @return DescribeMigrateJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateJobsResponse DescribeMigrateJobs(DescribeMigrateJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrateJobs", DescribeMigrateJobsResponse.class);
    }

    /**
     *This API is used to query the subscription instance configuration.
     * @param req DescribeSubscribeConfRequest
     * @return DescribeSubscribeConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeConfResponse DescribeSubscribeConf(DescribeSubscribeConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeConf", DescribeSubscribeConfResponse.class);
    }

    /**
     *This API is used to get the information list of data subscription instances. Pagination is enabled by default with 20 results returned each time.
     * @param req DescribeSubscribesRequest
     * @return DescribeSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribesResponse DescribeSubscribes(DescribeSubscribesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribes", DescribeSubscribesResponse.class);
    }

    /**
     *This API is used to isolate an hourly billed subscription instance. After this API is called, the instance will become unavailable and billing will stop for it.
     * @param req IsolateSubscribeRequest
     * @return IsolateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSubscribeResponse IsolateSubscribe(IsolateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateSubscribe", IsolateSubscribeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateJob", ModifyMigrateJobResponse.class);
    }

    /**
     *This API is used to modify the consumption time point of a data subscription channel.
     * @param req ModifySubscribeConsumeTimeRequest
     * @return ModifySubscribeConsumeTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeConsumeTimeResponse ModifySubscribeConsumeTime(ModifySubscribeConsumeTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeConsumeTime", ModifySubscribeConsumeTimeResponse.class);
    }

    /**
     *This API is used to rename a data subscription instance.
     * @param req ModifySubscribeNameRequest
     * @return ModifySubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeNameResponse ModifySubscribeName(ModifySubscribeNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeName", ModifySubscribeNameResponse.class);
    }

    /**
     *This API is used to modify the subscription rule of a data subscription channel.
     * @param req ModifySubscribeObjectsRequest
     * @return ModifySubscribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeObjectsResponse ModifySubscribeObjects(ModifySubscribeObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeObjects", ModifySubscribeObjectsResponse.class);
    }

    /**
     *This API is used to modify the IP and port number of a data subscription instance.
     * @param req ModifySubscribeVipVportRequest
     * @return ModifySubscribeVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeVipVportResponse ModifySubscribeVipVport(ModifySubscribeVipVportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeVipVport", ModifySubscribeVipVportResponse.class);
    }

    /**
     *This API is used to deactivate an isolated data subscription instance.
     * @param req OfflineIsolatedSubscribeRequest
     * @return OfflineIsolatedSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedSubscribeResponse OfflineIsolatedSubscribe(OfflineIsolatedSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedSubscribe", OfflineIsolatedSubscribeResponse.class);
    }

    /**
     *This API is used to reset a data subscription instance. Once reset, an activated instance can be bound to other database instances through the `ActivateSubscribe` API.
     * @param req ResetSubscribeRequest
     * @return ResetSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResetSubscribeResponse ResetSubscribe(ResetSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSubscribe", ResetSubscribeResponse.class);
    }

    /**
     *This API (StartMigrationJob) is used to start a migration task. After the API is called, non-scheduled migration tasks will start the migration immediately, while scheduled tasks will start the countdown.
Before calling this API, be sure to use the CreateMigrateCheckJob API to check the data migration task, which can be started only if its status queried through the DescribeMigrateJobs API is check succeeded (status=4).
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMigrateJob", StartMigrateJobResponse.class);
    }

    /**
     *This API (StopMigrateJob) is used to cancel a data migration task.
During migration, this API can be used to cancel migration if the task status queried through the DescribeMigrateJobs API is running (status=7) or ready (status=8), and the migration task will fail.
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigrateJob", StopMigrateJobResponse.class);
    }

}
