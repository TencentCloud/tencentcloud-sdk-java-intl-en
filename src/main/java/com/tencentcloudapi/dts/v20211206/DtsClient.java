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
    private static String endpoint = "dts.intl.tencentcloudapi.com";
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
If the task status queried through the `DescribeMigrationJobs` API is ready (`Status` = `readyComplete`), you can call this API to complete the migration task.
     * @param req CompleteMigrateJobRequest
     * @return CompleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrateJobResponse CompleteMigrateJob(CompleteMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteMigrateJob", CompleteMigrateJobResponse.class);
    }

    /**
     *This API is used to configure data subscription instances.
     * @param req ConfigureSubscribeJobRequest
     * @return ConfigureSubscribeJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSubscribeJobResponse ConfigureSubscribeJob(ConfigureSubscribeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureSubscribeJob", ConfigureSubscribeJobResponse.class);
    }

    /**
     *This API is used to configure a sync task.
     * @param req ConfigureSyncJobRequest
     * @return ConfigureSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSyncJobResponse ConfigureSyncJob(ConfigureSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureSyncJob", ConfigureSyncJobResponse.class);
    }

    /**
     *This API is used to resume a paused migration task.
     * @param req ContinueMigrateJobRequest
     * @return ContinueMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueMigrateJobResponse ContinueMigrateJob(ContinueMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueMigrateJob", ContinueMigrateJobResponse.class);
    }

    /**
     *This API is used to resume a paused data sync task.
     * @param req ContinueSyncJobRequest
     * @return ContinueSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueSyncJobResponse ContinueSyncJob(ContinueSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueSyncJob", ContinueSyncJobResponse.class);
    }

    /**
     *This API is used to verify a sync task by checking required parameters and peripheral configuration.
     * @param req CreateCheckSyncJobRequest
     * @return CreateCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckSyncJobResponse CreateCheckSyncJob(CreateCheckSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCheckSyncJob", CreateCheckSyncJobResponse.class);
    }

    /**
     *This API is used to create a data consistency check task. After the task is successfully created, its ID will be returned in the format of `dts-8yv4w2i1-cmp-37skmii9`, and you can call `StartCompare` to start it.
     * @param req CreateCompareTaskRequest
     * @return CreateCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCompareTaskResponse CreateCompareTask(CreateCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCompareTask", CreateCompareTaskResponse.class);
    }

    /**
     *This API is used to creat a consumer group for the subscription instance.
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrateCheckJob", CreateMigrateCheckJobResponse.class);
    }

    /**
     *This API is used to purchase migration tasks. After the tasks are purchased successfully, a randomly generated list of task IDs will be returned. You can also call the `DescribeMigrationJobs` API to query the IDs of the successfully purchased tasks. Note that once a task is purchased successfully, the types and regions of the source and target databases cannot be changed.
     * @param req CreateMigrationServiceRequest
     * @return CreateMigrationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationServiceResponse CreateMigrationService(CreateMigrationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrationService", CreateMigrationServiceResponse.class);
    }

    /**
     *This API is used to check whether the current data sync task supports object modification after the task configuration is modified.
     * @param req CreateModifyCheckSyncJobRequest
     * @return CreateModifyCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateModifyCheckSyncJobResponse CreateModifyCheckSyncJob(CreateModifyCheckSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModifyCheckSyncJob", CreateModifyCheckSyncJobResponse.class);
    }

    /**
     *This API is used to create a data subscription task.
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribe", CreateSubscribeResponse.class);
    }

    /**
     *This API is used to create a subscription check task. The task must have successfully called the ConfigureSubscribeJob interface to configure all necessary information before starting the check.
     * @param req CreateSubscribeCheckJobRequest
     * @return CreateSubscribeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeCheckJobResponse CreateSubscribeCheckJob(CreateSubscribeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribeCheckJob", CreateSubscribeCheckJobResponse.class);
    }

    /**
     *This API is used to create a sync task.
     * @param req CreateSyncJobRequest
     * @return CreateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncJobResponse CreateSyncJob(CreateSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSyncJob", CreateSyncJobResponse.class);
    }

    /**
     *This API is used to delete a data consistency check task, which can be called when the task status is `success`, `failed`, or `canceled`.
     * @param req DeleteCompareTaskRequest
     * @return DeleteCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompareTaskResponse DeleteCompareTask(DeleteCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompareTask", DeleteCompareTaskResponse.class);
    }

    /**
     *This API is used to delete a consumer group of a subscription task.
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *This API is used to query the result of the sync check task and check the required parameters and peripheral configurations.
     * @param req DescribeCheckSyncJobResultRequest
     * @return DescribeCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSyncJobResultResponse DescribeCheckSyncJobResult(DescribeCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckSyncJobResult", DescribeCheckSyncJobResultResponse.class);
    }

    /**
     *This API is used to query the details of a data consistency check task.
     * @param req DescribeCompareReportRequest
     * @return DescribeCompareReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareReportResponse DescribeCompareReport(DescribeCompareReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompareReport", DescribeCompareReportResponse.class);
    }

    /**
     *This API is used to query the list of data consistency check tasks under the current task.
     * @param req DescribeCompareTasksRequest
     * @return DescribeCompareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareTasksResponse DescribeCompareTasks(DescribeCompareTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompareTasks", DescribeCompareTasksResponse.class);
    }

    /**
     *This API is used to get consumer group details for the subscription instance configuration.
     * @param req DescribeConsumerGroupsRequest
     * @return DescribeConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupsResponse DescribeConsumerGroups(DescribeConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroups", DescribeConsumerGroupsResponse.class);
    }

    /**
     *This API is used to query migratable database instances.
     * @param req DescribeMigrateDBInstancesRequest
     * @return DescribeMigrateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateDBInstancesResponse DescribeMigrateDBInstances(DescribeMigrateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrateDBInstances", DescribeMigrateDBInstancesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationCheckJob", DescribeMigrationCheckJobResponse.class);
    }

    /**
     *This API is used to query the details of a migration task.
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDetail", DescribeMigrationDetailResponse.class);
    }

    /**
     *This API is used to query the list of data migration tasks.
     * @param req DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationJobsResponse DescribeMigrationJobs(DescribeMigrationJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationJobs", DescribeMigrationJobsResponse.class);
    }

    /**
     *This API is used to query the result of the created check task for object modification.
     * @param req DescribeModifyCheckSyncJobResultRequest
     * @return DescribeModifyCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyCheckSyncJobResultResponse DescribeModifyCheckSyncJobResult(DescribeModifyCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyCheckSyncJobResult", DescribeModifyCheckSyncJobResultResponse.class);
    }

    /**
     *This API is used to query the latest offset before the specified time in KafkaTopic.The offset output by the interface is the closest offset to this time.If the input time is much later than the current time, the output is equivalent to the latest offset;If the input time is much earlier than the current time, the output is equivalent to the oldest offset;If the input is empty, the default time is 0, which is the oldest offset to be queried.
     * @param req DescribeOffsetByTimeRequest
     * @return DescribeOffsetByTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOffsetByTimeResponse DescribeOffsetByTime(DescribeOffsetByTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOffsetByTime", DescribeOffsetByTimeResponse.class);
    }

    /**
     *This API is used to query the results of a subscription check task.
     * @param req DescribeSubscribeCheckJobRequest
     * @return DescribeSubscribeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeCheckJobResponse DescribeSubscribeCheckJob(DescribeSubscribeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeCheckJob", DescribeSubscribeCheckJobResponse.class);
    }

    /**
     *This API is used to get the configuration information of the data subscription instance.
     * @param req DescribeSubscribeDetailRequest
     * @return DescribeSubscribeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeDetailResponse DescribeSubscribeDetail(DescribeSubscribeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeDetail", DescribeSubscribeDetailResponse.class);
    }

    /**
     *This API is used to get the information list of data subscription instances. Pagination is enabled by default with 20 results returned each time.
     * @param req DescribeSubscribeJobsRequest
     * @return DescribeSubscribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeJobsResponse DescribeSubscribeJobs(DescribeSubscribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeJobs", DescribeSubscribeJobsResponse.class);
    }

    /**
     *This API is used to query whether a subscription task can be terminated and returned.
     * @param req DescribeSubscribeReturnableRequest
     * @return DescribeSubscribeReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeReturnableResponse DescribeSubscribeReturnable(DescribeSubscribeReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeReturnable", DescribeSubscribeReturnableResponse.class);
    }

    /**
     *This API is used to query the information of a sync task.
     * @param req DescribeSyncJobsRequest
     * @return DescribeSyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncJobsResponse DescribeSyncJobs(DescribeSyncJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSyncJobs", DescribeSyncJobsResponse.class);
    }

    /**
     *This API is used to deactivate an isolated data subscription instance.
     * @param req DestroyIsolatedSubscribeRequest
     * @return DestroyIsolatedSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DestroyIsolatedSubscribeResponse DestroyIsolatedSubscribe(DestroyIsolatedSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyIsolatedSubscribe", DestroyIsolatedSubscribeResponse.class);
    }

    /**
     *This API is used to delete a data migration task. For a billed task, you must first call the `IsolateMigrateJob` API to isolate it and make sure that it is in **Isolated** status before calling this API to delete it. For a free task, you can directly call the `IsolateMigrateJob` API to delete it.
     * @param req DestroyMigrateJobRequest
     * @return DestroyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroyMigrateJobResponse DestroyMigrateJob(DestroyMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyMigrateJob", DestroyMigrateJobResponse.class);
    }

    /**
     *This API is used to delete a sync task. Only tasks in **Isolated** status can be completely deleted. After deletion, you can call the `DescribeSyncJobs` API to get the task list. If the deleted task is not in the list, it is deleted successfully.
     * @param req DestroySyncJobRequest
     * @return DestroySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroySyncJobResponse DestroySyncJob(DestroySyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroySyncJob", DestroySyncJobResponse.class);
    }

    /**
     * This API is used to isolate and return a data migration task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status. For a billed task, after isolating it, you can call `RecoverMigrationJob` to recover it or call `DestroyMigrateJob` to delete it. For a free task, calling this API will directly delete it permanently.
     * @param req IsolateMigrateJobRequest
     * @return IsolateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateMigrateJobResponse IsolateMigrateJob(IsolateMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateMigrateJob", IsolateMigrateJobResponse.class);
    }

    /**
     *This API is used to isolate the subscription task. After calling, the subscription task will not be available. Pay-as-you-go tasks will stop billing, and monthly subscription tasks will refund automatically.
     * @param req IsolateSubscribeRequest
     * @return IsolateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSubscribeResponse IsolateSubscribe(IsolateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateSubscribe", IsolateSubscribeResponse.class);
    }

    /**
     *This API is used to isolate a sync task. After the task is isolated, you can call the `DescribeSyncJobs` API to query its status, call `RecoverSyncJob` to recover it, or directly delete it. For a free task, calling this API will directly delete it permanently.
     * @param req IsolateSyncJobRequest
     * @return IsolateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSyncJobResponse IsolateSyncJob(IsolateSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateSyncJob", IsolateSyncJobResponse.class);
    }

    /**
     *This API is used to modify the parameters of a data consistency check task after it is created and before it starts.
     * @param req ModifyCompareTaskRequest
     * @return ModifyCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskResponse ModifyCompareTask(ModifyCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompareTask", ModifyCompareTaskResponse.class);
    }

    /**
     *This API is used to rename a data consistency check task.
     * @param req ModifyCompareTaskNameRequest
     * @return ModifyCompareTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskNameResponse ModifyCompareTaskName(ModifyCompareTaskNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompareTaskName", ModifyCompareTaskNameResponse.class);
    }

    /**
     *This API is used to modify the description of the specified subscription consumption group.
     * @param req ModifyConsumerGroupDescriptionRequest
     * @return ModifyConsumerGroupDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupDescriptionResponse ModifyConsumerGroupDescription(ModifyConsumerGroupDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroupDescription", ModifyConsumerGroupDescriptionResponse.class);
    }

    /**
     *This API is used to modify the password of the specified subscription consumer group.
     * @param req ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupPasswordResponse ModifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroupPassword", ModifyConsumerGroupPasswordResponse.class);
    }

    /**
     *This API is used to adjust the specification of a pay-as-you-go task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req ModifyMigrateJobSpecRequest
     * @return ModifyMigrateJobSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobSpecResponse ModifyMigrateJobSpec(ModifyMigrateJobSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateJobSpec", ModifyMigrateJobSpecResponse.class);
    }

    /**
     *This API is used to rename a migration task.
     * @param req ModifyMigrateNameRequest
     * @return ModifyMigrateNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateNameResponse ModifyMigrateName(ModifyMigrateNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateName", ModifyMigrateNameResponse.class);
    }

    /**
     *This API is used to restrict the rate limit of the task, when a user finds that migration task has a large impact on the load of user's database.
     * @param req ModifyMigrateRateLimitRequest
     * @return ModifyMigrateRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateRateLimitResponse ModifyMigrateRateLimit(ModifyMigrateRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateRateLimit", ModifyMigrateRateLimitResponse.class);
    }

    /**
     *This API is used to modify task runtime attributes. This interface is different from the configuration class interface and does not perform state machine evaluation.
     * @param req ModifyMigrateRuntimeAttributeRequest
     * @return ModifyMigrateRuntimeAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateRuntimeAttributeResponse ModifyMigrateRuntimeAttribute(ModifyMigrateRuntimeAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateRuntimeAttribute", ModifyMigrateRuntimeAttributeResponse.class);
    }

    /**
     *This API is used to configure a migration task. After it is configured successfully, you can call the `CreateMigrationCheckJob` API to create a check task, and only after it passes the check can it be started.
     * @param req ModifyMigrationJobRequest
     * @return ModifyMigrationJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationJobResponse ModifyMigrationJob(ModifyMigrationJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrationJob", ModifyMigrationJobResponse.class);
    }

    /**
     *This API is used to modify the auto-renewal flag of your subscription instance. Only the monthly subscription modification task makes sense. After modifying, the pay-as-you-go task has no impact.
     * @param req ModifySubscribeAutoRenewFlagRequest
     * @return ModifySubscribeAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeAutoRenewFlagResponse ModifySubscribeAutoRenewFlag(ModifySubscribeAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeAutoRenewFlag", ModifySubscribeAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the name of the data subscription instance.
     * @param req ModifySubscribeNameRequest
     * @return ModifySubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeNameResponse ModifySubscribeName(ModifySubscribeNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeName", ModifySubscribeNameResponse.class);
    }

    /**
     *This API is used to modify the data subscription object and Kafka partition rule. For MongoDB subscription, you can also modify the output aggregation rule.
     * @param req ModifySubscribeObjectsRequest
     * @return ModifySubscribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeObjectsResponse ModifySubscribeObjects(ModifySubscribeObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeObjects", ModifySubscribeObjectsResponse.class);
    }

    /**
     *This API is used to modify the configuration of a data sync task after the task is started.\n Configuration modification steps:  Modify sync task configuration -> Create a modification check task -> Query the check task result -> Start the configuration modification check task
     * @param req ModifySyncJobConfigRequest
     * @return ModifySyncJobConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncJobConfigResponse ModifySyncJobConfig(ModifySyncJobConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySyncJobConfig", ModifySyncJobConfigResponse.class);
    }

    /**
     *This API is used to restrict the rate limit of the task, when a user finds that the sync task has a large impact on the load of user's database.
     * @param req ModifySyncRateLimitRequest
     * @return ModifySyncRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncRateLimitResponse ModifySyncRateLimit(ModifySyncRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySyncRateLimit", ModifySyncRateLimitResponse.class);
    }

    /**
     *This API is used to pause a migration task.
     * @param req PauseMigrateJobRequest
     * @return PauseMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseMigrateJobResponse PauseMigrateJob(PauseMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseMigrateJob", PauseMigrateJobResponse.class);
    }

    /**
     *This API is used to pause a data sync task.
     * @param req PauseSyncJobRequest
     * @return PauseSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseSyncJobResponse PauseSyncJob(PauseSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseSyncJob", PauseSyncJobResponse.class);
    }

    /**
     *This API is used to recover a data migration task in **Isolated** status. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req RecoverMigrateJobRequest
     * @return RecoverMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMigrateJobResponse RecoverMigrateJob(RecoverMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverMigrateJob", RecoverMigrateJobResponse.class);
    }

    /**
     *This API is used to recover a sync task in **Isolated** status. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req RecoverSyncJobRequest
     * @return RecoverSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverSyncJobResponse RecoverSyncJob(RecoverSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverSyncJob", RecoverSyncJobResponse.class);
    }

    /**
     *This API is used to reset the offset of the subscription consumer group. Call the DescribeConsumerGroups API to query the status of the consumer group, only when the status is Dead or Empty can this operation be executed. Otherwise, the reset will not be effective and the API will not return any error.
     * @param req ResetConsumerGroupOffsetRequest
     * @return ResetConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ResetConsumerGroupOffsetResponse ResetConsumerGroupOffset(ResetConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConsumerGroupOffset", ResetConsumerGroupOffsetResponse.class);
    }

    /**
     *This API is used to reset the subscription instance. After resetting, the subscription task can be reconfigured.You can call DescribeSubscribeDetail to query the subscription information to determine whether the subscription is successful. When SubsStatus changes to notStarted, it means the reset is successful.
     * @param req ResetSubscribeRequest
     * @return ResetSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResetSubscribeResponse ResetSubscribe(ResetSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSubscribe", ResetSubscribeResponse.class);
    }

    /**
     *This API is used to adjust the specification of a pay-as-you-go sync task. After this API is called, the backend needs to take about 3-5 minutes to implement the adjustment. You can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req ResizeSyncJobRequest
     * @return ResizeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResizeSyncJobResponse ResizeSyncJob(ResizeSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeSyncJob", ResizeSyncJobResponse.class);
    }

    /**
     *This API is used to retry an abnormal or failed Redis data migration task. Note that this operation will skip the check stage and directly start the task, just like by calling `StartMigrationJob`. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req ResumeMigrateJobRequest
     * @return ResumeMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeMigrateJobResponse ResumeMigrateJob(ResumeMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeMigrateJob", ResumeMigrateJobResponse.class);
    }

    /**
     *This API is used to resume faulty subscription tasks. When the status of the subscription task is set to error, you can resume task via this API.
     * @param req ResumeSubscribeRequest
     * @return ResumeSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSubscribeResponse ResumeSubscribe(ResumeSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSubscribe", ResumeSubscribeResponse.class);
    }

    /**
     *This API is used to retry a sync task after certain resolvable errors are reported. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req ResumeSyncJobRequest
     * @return ResumeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSyncJobResponse ResumeSyncJob(ResumeSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSyncJob", ResumeSyncJobResponse.class);
    }

    /**
     *This API is used for the backend to skip a failed check item. Theoretically, to execute a migration task normally, any check step cannot be skipped, and the check must be passed. For products or links that support check item skipping, see [Check Item Overview](https://www.tencentcloud.com/document/product/571/42551).
     * @param req SkipCheckItemRequest
     * @return SkipCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipCheckItemResponse SkipCheckItem(SkipCheckItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SkipCheckItem", SkipCheckItemResponse.class);
    }

    /**
     *This API is used for the backend to skip a failed check item. Theoretically, to execute a sync task normally, any check step cannot be skipped, and the check must be passed. For products or links that support check item skipping, see [Check Item Overview](https://www.tencentcloud.com/document/product/571/42551).
     * @param req SkipSyncCheckItemRequest
     * @return SkipSyncCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipSyncCheckItemResponse SkipSyncCheckItem(SkipSyncCheckItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SkipSyncCheckItem", SkipSyncCheckItemResponse.class);
    }

    /**
     *This API is used to start a data consistency check task after creating it by calling the `CreateCompareTask` API. After calling this API, you can call the `DescribeCompareTasks` API to query the latest task status.
     * @param req StartCompareRequest
     * @return StartCompareResponse
     * @throws TencentCloudSDKException
     */
    public StartCompareResponse StartCompare(StartCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCompare", StartCompareResponse.class);
    }

    /**
     *This API (`StartMigrationJob`) is used to start a migration task. After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMigrateJob", StartMigrateJobResponse.class);
    }

    /**
     *This API is used to start the configuration modification process when the modification check task status becomes “success”.
     * @param req StartModifySyncJobRequest
     * @return StartModifySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartModifySyncJobResponse StartModifySyncJob(StartModifySyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartModifySyncJob", StartModifySyncJobResponse.class);
    }

    /**
     *This API is used to start a Kafka version of the data subscription instance. This interface can be called only when the status of the subscription task is checkPass.
     * @param req StartSubscribeRequest
     * @return StartSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public StartSubscribeResponse StartSubscribe(StartSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSubscribe", StartSubscribeResponse.class);
    }

    /**
     *This API is used to start a sync task.
     * @param req StartSyncJobRequest
     * @return StartSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartSyncJobResponse StartSyncJob(StartSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSyncJob", StartSyncJobResponse.class);
    }

    /**
     *This API is used to stop a data consistency check task.
     * @param req StopCompareRequest
     * @return StopCompareResponse
     * @throws TencentCloudSDKException
     */
    public StopCompareResponse StopCompare(StopCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCompare", StopCompareResponse.class);
    }

    /**
     *This API is used to stop a data migration task.
After calling this API, you can call the `DescribeMigrationJobs` API to query the latest task status.
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigrateJob", StopMigrateJobResponse.class);
    }

    /**
     *This API is used to stop a sync task. After calling this API, you can call the `DescribeSyncJobs` API to query the latest task status.
     * @param req StopSyncJobRequest
     * @return StopSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StopSyncJobResponse StopSyncJob(StopSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSyncJob", StopSyncJobResponse.class);
    }

}
