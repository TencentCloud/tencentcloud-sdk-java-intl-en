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
package com.tencentcloudapi.cls.v20201016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cls.v20201016.models.*;

public class ClsClient extends AbstractClient{
    private static String endpoint = "cls.intl.tencentcloudapi.com";
    private static String service = "cls";
    private static String version = "2020-10-16";

    public ClsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClsClient(Credential credential, String region, ClientProfile profile) {
        super(ClsClient.endpoint, ClsClient.version, credential, region, profile);
    }

    /**
     *This API is used to add machine group information.
     * @param req AddMachineGroupInfoRequest
     * @return AddMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineGroupInfoResponse AddMachineGroupInfo(AddMachineGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMachineGroupInfo", AddMachineGroupInfoResponse.class);
    }

    /**
     *This API is used to apply the collection configuration to a specified machine group.
     * @param req ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConfigToMachineGroupResponse ApplyConfigToMachineGroup(ApplyConfigToMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyConfigToMachineGroup", ApplyConfigToMachineGroupResponse.class);
    }

    /**
     *This API is used to cancel creating a reindexing task.
     * @param req CancelRebuildIndexTaskRequest
     * @return CancelRebuildIndexTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelRebuildIndexTaskResponse CancelRebuildIndexTask(CancelRebuildIndexTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelRebuildIndexTask", CancelRebuildIndexTaskResponse.class);
    }

    /**
     *Call the API to initiate a dialogue request.
This API supports AI-powered logging features such as intelligently generating retrieval analysis statements.
Note: When calling this API via SSE streaming, ensure the request domain name is set to cls.ai.tencentcloudapi.com (configurable as cls.ai.internal.tencentcloudapi.com in a private network environment).
     * @param req ChatCompletionsRequest
     * @return ChatCompletionsResponse
     * @throws TencentCloudSDKException
     */
    public ChatCompletionsResponse ChatCompletions(ChatCompletionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatCompletions", ChatCompletionsResponse.class);
    }

    /**
     *This API is used to verify the syntax of data processing DSL functions.
     * @param req CheckFunctionRequest
     * @return CheckFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CheckFunctionResponse CheckFunction(CheckFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFunction", CheckFunctionResponse.class);
    }

    /**
     *This API is used to check whether the Kafka service cluster is accessible.
     * @param req CheckRechargeKafkaServerRequest
     * @return CheckRechargeKafkaServerResponse
     * @throws TencentCloudSDKException
     */
    public CheckRechargeKafkaServerResponse CheckRechargeKafkaServer(CheckRechargeKafkaServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRechargeKafkaServer", CheckRechargeKafkaServerResponse.class);
    }

    /**
     *This API is used to disable Kafka consumption.
     * @param req CloseKafkaConsumerRequest
     * @return CloseKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CloseKafkaConsumerResponse CloseKafkaConsumer(CloseKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseKafkaConsumer", CloseKafkaConsumerResponse.class);
    }

    /**
     *This API is used to submit a consumption offset.
     * @param req CommitConsumerOffsetsRequest
     * @return CommitConsumerOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public CommitConsumerOffsetsResponse CommitConsumerOffsets(CommitConsumerOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitConsumerOffsets", CommitConsumerOffsetsResponse.class);
    }

    /**
     *This API is used to create an alarm policy.
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarm", CreateAlarmResponse.class);
    }

    /**
     *This API is used to create a notification channel group with two configuration modes to choose from.
1. Easy mode provides the most basic notification channel function. The following parameters are required:
- Type
- NoticeReceivers
- WebCallbacks

2. Advanced mode: On the basis of easy mode, it supports setting rules, setting notification channels for different types of alarms, and escalating alarms. The following parameters are required:
- NoticeRules
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmNotice", CreateAlarmNoticeResponse.class);
    }

    /**
     *This API is used to create an alarm blocking rule.
     * @param req CreateAlarmShieldRequest
     * @return CreateAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmShieldResponse CreateAlarmShield(CreateAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmShield", CreateAlarmShieldResponse.class);
    }

    /**
     *Cloud product integration uses internal APIs
     * @param req CreateCloudProductLogCollectionRequest
     * @return CreateCloudProductLogCollectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudProductLogCollectionResponse CreateCloudProductLogCollection(CreateCloudProductLogCollectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudProductLogCollection", CreateCloudProductLogCollectionResponse.class);
    }

    /**
     *This API is used to create collection rule configuration.
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfig", CreateConfigResponse.class);
    }

    /**
     *This API is used to create the DataSight Console
     * @param req CreateConsoleRequest
     * @return CreateConsoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleResponse CreateConsole(CreateConsoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsole", CreateConsoleResponse.class);
    }

    /**
     *This API is used to create a CKafka delivery task.
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumer", CreateConsumerResponse.class);
    }

    /**
     *This API is used to check the heartbeat of a consumer group.
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
    }

    /**
     *This API is used to create a COS import task.
     * @param req CreateCosRechargeRequest
     * @return CreateCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosRechargeResponse CreateCosRecharge(CreateCosRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosRecharge", CreateCosRechargeResponse.class);
    }

    /**
     *This API is used to create a dashboard.
     * @param req CreateDashboardRequest
     * @return CreateDashboardResponse
     * @throws TencentCloudSDKException
     */
    public CreateDashboardResponse CreateDashboard(CreateDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDashboard", CreateDashboardResponse.class);
    }

    /**
     *This API is used to create a dashboard subscription.
     * @param req CreateDashboardSubscribeRequest
     * @return CreateDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateDashboardSubscribeResponse CreateDashboardSubscribe(CreateDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDashboardSubscribe", CreateDashboardSubscribeResponse.class);
    }

    /**
     *This API is used to create a data processing task.
     * @param req CreateDataTransformRequest
     * @return CreateDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataTransformResponse CreateDataTransform(CreateDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataTransform", CreateDataTransformResponse.class);
    }

    /**
     *This API is used to create a delivery SCF task.
     * @param req CreateDeliverCloudFunctionRequest
     * @return CreateDeliverCloudFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeliverCloudFunctionResponse CreateDeliverCloudFunction(CreateDeliverCloudFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeliverCloudFunction", CreateDeliverCloudFunctionResponse.class);
    }

    /**
     *Create a DLC delivery task
     * @param req CreateDlcDeliverRequest
     * @return CreateDlcDeliverResponse
     * @throws TencentCloudSDKException
     */
    public CreateDlcDeliverResponse CreateDlcDeliver(CreateDlcDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDlcDeliver", CreateDlcDeliverResponse.class);
    }

    /**
     *This API is used to create an es import configuration
     * @param req CreateEsRechargeRequest
     * @return CreateEsRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateEsRechargeResponse CreateEsRecharge(CreateEsRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEsRecharge", CreateEsRechargeResponse.class);
    }

    /**
     *This API only creates download tasks. The download address returned by the task can be obtained by user invocation of [DescribeExports](https://www.tencentcloud.com/document/product/614/56449?from_cn_redirect=1) to view task list, which includes the CosPath parameter for the download address.
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExport", CreateExportResponse.class);
    }

    /**
     *This API is used to create host metric collection configurations.
     * @param req CreateHostMetricConfigRequest
     * @return CreateHostMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostMetricConfigResponse CreateHostMetricConfig(CreateHostMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostMetricConfig", CreateHostMetricConfigResponse.class);
    }

    /**
     *This API is used to create an index.
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
    }

    /**
     *This API is used to create a Kafka data subscription task.
     * @param req CreateKafkaRechargeRequest
     * @return CreateKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateKafkaRechargeResponse CreateKafkaRecharge(CreateKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKafkaRecharge", CreateKafkaRechargeResponse.class);
    }

    /**
     *This API is used to create a logset. The ID of the created logset is returned.
     * @param req CreateLogsetRequest
     * @return CreateLogsetResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogsetResponse CreateLogset(CreateLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogset", CreateLogsetResponse.class);
    }

    /**
     *This API is used to create a machine group.
     * @param req CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMachineGroupResponse CreateMachineGroup(CreateMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMachineGroup", CreateMachineGroupResponse.class);
    }

    /**
     *This API is used to create metric collection configurations.
     * @param req CreateMetricConfigRequest
     * @return CreateMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateMetricConfigResponse CreateMetricConfig(CreateMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMetricConfig", CreateMetricConfigResponse.class);
    }

    /**
     *This API is used to create metric subscription configurations.
     * @param req CreateMetricSubscribeRequest
     * @return CreateMetricSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateMetricSubscribeResponse CreateMetricSubscribe(CreateMetricSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMetricSubscribe", CreateMetricSubscribeResponse.class);
    }

    /**
     *This API is used to create a network application.
     * @param req CreateNetworkApplicationRequest
     * @return CreateNetworkApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkApplicationResponse CreateNetworkApplication(CreateNetworkApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkApplication", CreateNetworkApplicationResponse.class);
    }

    /**
     *This API is used to create notification content.
     * @param req CreateNoticeContentRequest
     * @return CreateNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public CreateNoticeContentResponse CreateNoticeContent(CreateNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNoticeContent", CreateNoticeContentResponse.class);
    }

    /**
     *This API is used to creates rebuild index tasks.
Note:
-A single log topic allows only one index reconstruction task at a time and can have up to 10 rebuild index task records. Delete task records that are no longer needed before creating an index task.
-Logs within the same time range only allow rebuilding indexes once. Delete previous task records before rebuilding again.
-Deleting a rebuild index task record restores the index data before rebuilding an index.
-The log write traffic of the selected time range cannot exceed 5TB.
-The index rebuilding time range is subject to the log time. When the log uploading time has a deviation exceeding one hour from the index rebuilding time range (for example, reporting a new log at 16:00 for 02:00 to CLS and rebuilding the log index for 00:00–12:00), the logs will not be rebuilt and cannot be retrieved subsequently. When reporting a new log to the reconstructed log time range, it will not be rebuilt and cannot be retrieved subsequently.
     * @param req CreateRebuildIndexTaskRequest
     * @return CreateRebuildIndexTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRebuildIndexTaskResponse CreateRebuildIndexTask(CreateRebuildIndexTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRebuildIndexTask", CreateRebuildIndexTaskResponse.class);
    }

    /**
     *Creating a Metric Pre-Aggregation Task
     * @param req CreateRecordingRuleTaskRequest
     * @return CreateRecordingRuleTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleTaskResponse CreateRecordingRuleTask(CreateRecordingRuleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordingRuleTask", CreateRecordingRuleTaskResponse.class);
    }

    /**
     *Creating a Metric Pre-Aggregation Task Through a YAML File
     * @param req CreateRecordingRuleYamlTaskRequest
     * @return CreateRecordingRuleYamlTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingRuleYamlTaskResponse CreateRecordingRuleYamlTask(CreateRecordingRuleYamlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordingRuleYamlTask", CreateRecordingRuleYamlTaskResponse.class);
    }

    /**
     *This API is used to create a remote write delivery task.
     * @param req CreateRemoteWriteTaskRequest
     * @return CreateRemoteWriteTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRemoteWriteTaskResponse CreateRemoteWriteTask(CreateRemoteWriteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRemoteWriteTask", CreateRemoteWriteTaskResponse.class);
    }

    /**
     *This API is used to create a scheduled SQL analysis task.
     * @param req CreateScheduledSqlRequest
     * @return CreateScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledSqlResponse CreateScheduledSql(CreateScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScheduledSql", CreateScheduledSqlResponse.class);
    }

    /**
     *Create a query view
     * @param req CreateSearchViewRequest
     * @return CreateSearchViewResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchViewResponse CreateSearchView(CreateSearchViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSearchView", CreateSearchViewResponse.class);
    }

    /**
     *This API is used to create a task to ship to COS. Note: To use this API, you need to check whether you have configured the role and permission for shipping to COS. If not, see **Viewing and Configuring Shipping Authorization** at https://intl.cloud.tencent.com/document/product/614/71623.?from_cn_redirect=1
     * @param req CreateShipperRequest
     * @return CreateShipperResponse
     * @throws TencentCloudSDKException
     */
    public CreateShipperResponse CreateShipper(CreateShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateShipper", CreateShipperResponse.class);
    }

    /**
     *Create a Splunk delivery task
     * @param req CreateSplunkDeliverRequest
     * @return CreateSplunkDeliverResponse
     * @throws TencentCloudSDKException
     */
    public CreateSplunkDeliverResponse CreateSplunkDeliver(CreateSplunkDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSplunkDeliver", CreateSplunkDeliverResponse.class);
    }

    /**
     *This API is used to create logs or metric topics.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *This API is used to create alarm channel callback configurations.
     * @param req CreateWebCallbackRequest
     * @return CreateWebCallbackResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebCallbackResponse CreateWebCallback(CreateWebCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebCallback", CreateWebCallbackResponse.class);
    }

    /**
     *This API is used to delete an alarm policy.
     * @param req DeleteAlarmRequest
     * @return DeleteAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarm", DeleteAlarmResponse.class);
    }

    /**
     *This API is used to delete a notification group.
     * @param req DeleteAlarmNoticeRequest
     * @return DeleteAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticeResponse DeleteAlarmNotice(DeleteAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmNotice", DeleteAlarmNoticeResponse.class);
    }

    /**
     *This API is used to delete an alarm blocking rule. When the alarm blocking rule is active or invalid, it cannot be deleted.
     * @param req DeleteAlarmShieldRequest
     * @return DeleteAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmShieldResponse DeleteAlarmShield(DeleteAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmShield", DeleteAlarmShieldResponse.class);
    }

    /**
     *Cloud product integration uses internal APIs
     * @param req DeleteCloudProductLogCollectionRequest
     * @return DeleteCloudProductLogCollectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudProductLogCollectionResponse DeleteCloudProductLogCollection(DeleteCloudProductLogCollectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudProductLogCollection", DeleteCloudProductLogCollectionResponse.class);
    }

    /**
     *This API is used to delete collection rule configuration.
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfig", DeleteConfigResponse.class);
    }

    /**
     *This API is used to delete the collection configuration applied to a machine group.
     * @param req DeleteConfigFromMachineGroupRequest
     * @return DeleteConfigFromMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFromMachineGroupResponse DeleteConfigFromMachineGroup(DeleteConfigFromMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigFromMachineGroup", DeleteConfigFromMachineGroupResponse.class);
    }

    /**
     *This API is used to delete the DataSight Console
     * @param req DeleteConsoleRequest
     * @return DeleteConsoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsoleResponse DeleteConsole(DeleteConsoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsole", DeleteConsoleResponse.class);
    }

    /**
     *Deleting a CKafka Delivery Task
     * @param req DeleteConsumerRequest
     * @return DeleteConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerResponse DeleteConsumer(DeleteConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumer", DeleteConsumerResponse.class);
    }

    /**
     *Delete consumer groups.
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *This API is used to delete a cos Import Task.
     * @param req DeleteCosRechargeRequest
     * @return DeleteCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCosRechargeResponse DeleteCosRecharge(DeleteCosRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCosRecharge", DeleteCosRechargeResponse.class);
    }

    /**
     *This API is used to delete dashboards.
     * @param req DeleteDashboardRequest
     * @return DeleteDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDashboardResponse DeleteDashboard(DeleteDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDashboard", DeleteDashboardResponse.class);
    }

    /**
     *This API is used to delete dashboard subscriptions.
     * @param req DeleteDashboardSubscribeRequest
     * @return DeleteDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDashboardSubscribeResponse DeleteDashboardSubscribe(DeleteDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDashboardSubscribe", DeleteDashboardSubscribeResponse.class);
    }

    /**
     *This API is used to delete a data processing task.
     * @param req DeleteDataTransformRequest
     * @return DeleteDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataTransformResponse DeleteDataTransform(DeleteDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataTransform", DeleteDataTransformResponse.class);
    }

    /**
     *Delete a DLC delivery task
     * @param req DeleteDlcDeliverRequest
     * @return DeleteDlcDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDlcDeliverResponse DeleteDlcDeliver(DeleteDlcDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDlcDeliver", DeleteDlcDeliverResponse.class);
    }

    /**
     *Delete es import configuration
     * @param req DeleteEsRechargeRequest
     * @return DeleteEsRechargeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEsRechargeResponse DeleteEsRecharge(DeleteEsRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEsRecharge", DeleteEsRechargeResponse.class);
    }

    /**
     *This API is used to delete a log download task.
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExport", DeleteExportResponse.class);
    }

    /**
     *Delete host metric collection configuration
     * @param req DeleteHostMetricConfigRequest
     * @return DeleteHostMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostMetricConfigResponse DeleteHostMetricConfig(DeleteHostMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHostMetricConfig", DeleteHostMetricConfigResponse.class);
    }

    /**
     *This API is used to delete the index configuration of a log topic. After deleting, you cannot retrieve or query the collected logs.
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
    }

    /**
     *This API is used to delete a Kafka data subscription task.
     * @param req DeleteKafkaRechargeRequest
     * @return DeleteKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKafkaRechargeResponse DeleteKafkaRecharge(DeleteKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKafkaRecharge", DeleteKafkaRechargeResponse.class);
    }

    /**
     *This API is used to delete a logset.
     * @param req DeleteLogsetRequest
     * @return DeleteLogsetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogsetResponse DeleteLogset(DeleteLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogset", DeleteLogsetResponse.class);
    }

    /**
     *This API is used to delete a machine group.
     * @param req DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupResponse DeleteMachineGroup(DeleteMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineGroup", DeleteMachineGroupResponse.class);
    }

    /**
     *This API is used to delete machine group information.
     * @param req DeleteMachineGroupInfoRequest
     * @return DeleteMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupInfoResponse DeleteMachineGroupInfo(DeleteMachineGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineGroupInfo", DeleteMachineGroupInfoResponse.class);
    }

    /**
     *This API is used to delete metric collection configurations.
     * @param req DeleteMetricConfigRequest
     * @return DeleteMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMetricConfigResponse DeleteMetricConfig(DeleteMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMetricConfig", DeleteMetricConfigResponse.class);
    }

    /**
     *This API is used to delete metric subscription configurations.
     * @param req DeleteMetricSubscribeRequest
     * @return DeleteMetricSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMetricSubscribeResponse DeleteMetricSubscribe(DeleteMetricSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMetricSubscribe", DeleteMetricSubscribeResponse.class);
    }

    /**
     *Delete a web application
     * @param req DeleteNetworkApplicationRequest
     * @return DeleteNetworkApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkApplicationResponse DeleteNetworkApplication(DeleteNetworkApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkApplication", DeleteNetworkApplicationResponse.class);
    }

    /**
     *This API is used to delete notification content configuration.
     * @param req DeleteNoticeContentRequest
     * @return DeleteNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNoticeContentResponse DeleteNoticeContent(DeleteNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNoticeContent", DeleteNoticeContentResponse.class);
    }

    /**
     *This API is used to delete a pre-aggregation analysis task.
     * @param req DeleteRecordingRuleTaskRequest
     * @return DeleteRecordingRuleTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRuleTaskResponse DeleteRecordingRuleTask(DeleteRecordingRuleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordingRuleTask", DeleteRecordingRuleTaskResponse.class);
    }

    /**
     *This API is used to delete the pre-aggregation task in yaml.
     * @param req DeleteRecordingRuleYamlTaskRequest
     * @return DeleteRecordingRuleYamlTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingRuleYamlTaskResponse DeleteRecordingRuleYamlTask(DeleteRecordingRuleYamlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordingRuleYamlTask", DeleteRecordingRuleYamlTaskResponse.class);
    }

    /**
     *This API is used to delete a RemoteWrite task.
     * @param req DeleteRemoteWriteTaskRequest
     * @return DeleteRemoteWriteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRemoteWriteTaskResponse DeleteRemoteWriteTask(DeleteRemoteWriteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRemoteWriteTask", DeleteRemoteWriteTaskResponse.class);
    }

    /**
     *This API is used to delete a scheduled SQL analysis task.
     * @param req DeleteScheduledSqlRequest
     * @return DeleteScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledSqlResponse DeleteScheduledSql(DeleteScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScheduledSql", DeleteScheduledSqlResponse.class);
    }

    /**
     *This API is used to delete a query view.
     * @param req DeleteSearchViewRequest
     * @return DeleteSearchViewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchViewResponse DeleteSearchView(DeleteSearchViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSearchView", DeleteSearchViewResponse.class);
    }

    /**
     *This API is used to delete a COS shipping task.
     * @param req DeleteShipperRequest
     * @return DeleteShipperResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShipperResponse DeleteShipper(DeleteShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShipper", DeleteShipperResponse.class);
    }

    /**
     *Delete a Splunk delivery task
     * @param req DeleteSplunkDeliverRequest
     * @return DeleteSplunkDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSplunkDeliverResponse DeleteSplunkDeliver(DeleteSplunkDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSplunkDeliver", DeleteSplunkDeliverResponse.class);
    }

    /**
     *This API is used to delete logs or metric topics.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *This API is used to delete alarm channel callback configurations.
     * @param req DeleteWebCallbackRequest
     * @return DeleteWebCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebCallbackResponse DeleteWebCallback(DeleteWebCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebCallback", DeleteWebCallbackResponse.class);
    }

    /**
     *This API is used to get the notification group list.
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotices", DescribeAlarmNoticesResponse.class);
    }

    /**
     *This API is used to access alarm blocking configuration rules.
     * @param req DescribeAlarmShieldsRequest
     * @return DescribeAlarmShieldsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmShieldsResponse DescribeAlarmShields(DescribeAlarmShieldsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmShields", DescribeAlarmShieldsResponse.class);
    }

    /**
     *This API is used to get the alarm policy list.
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarms", DescribeAlarmsResponse.class);
    }

    /**
     *This API is used to get alarm records, such as today's uncleared alarms.
     * @param req DescribeAlertRecordHistoryRequest
     * @return DescribeAlertRecordHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordHistoryResponse DescribeAlertRecordHistory(DescribeAlertRecordHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRecordHistory", DescribeAlertRecordHistoryResponse.class);
    }

    /**
     *Cloud product integration uses relevant APIs
     * @param req DescribeCloudProductLogTasksRequest
     * @return DescribeCloudProductLogTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudProductLogTasksResponse DescribeCloudProductLogTasks(DescribeCloudProductLogTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudProductLogTasks", DescribeCloudProductLogTasksResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeClusterBaseMetricConfigsRequest
     * @return DescribeClusterBaseMetricConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterBaseMetricConfigsResponse DescribeClusterBaseMetricConfigs(DescribeClusterBaseMetricConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterBaseMetricConfigs", DescribeClusterBaseMetricConfigsResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeClusterMetricConfigsRequest
     * @return DescribeClusterMetricConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterMetricConfigsResponse DescribeClusterMetricConfigs(DescribeClusterMetricConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterMetricConfigs", DescribeClusterMetricConfigsResponse.class);
    }

    /**
     *This API is used to get the machine group bound to collection rule configuration.
     * @param req DescribeConfigMachineGroupsRequest
     * @return DescribeConfigMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMachineGroupsResponse DescribeConfigMachineGroups(DescribeConfigMachineGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigMachineGroups", DescribeConfigMachineGroupsResponse.class);
    }

    /**
     *This API is used to get collection rule configuration.
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigs", DescribeConfigsResponse.class);
    }

    /**
     *Query the DataSight console instance list
     * @param req DescribeConsolesRequest
     * @return DescribeConsolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsolesResponse DescribeConsoles(DescribeConsolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsoles", DescribeConsolesResponse.class);
    }

    /**
     *This API is used to query a shipping task.
     * @param req DescribeConsumerRequest
     * @return DescribeConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerResponse DescribeConsumer(DescribeConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumer", DescribeConsumerResponse.class);
    }

    /**
     *This API is used to obtain the consumer group list.
     * @param req DescribeConsumerGroupsRequest
     * @return DescribeConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupsResponse DescribeConsumerGroups(DescribeConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroups", DescribeConsumerGroupsResponse.class);
    }

    /**
     *Obtaining the Consumer Group Point Information
     * @param req DescribeConsumerOffsetsRequest
     * @return DescribeConsumerOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerOffsetsResponse DescribeConsumerOffsets(DescribeConsumerOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerOffsets", DescribeConsumerOffsetsResponse.class);
    }

    /**
     *This API is used to preview Kafka shipping data.
     * @param req DescribeConsumerPreviewRequest
     * @return DescribeConsumerPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerPreviewResponse DescribeConsumerPreview(DescribeConsumerPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerPreview", DescribeConsumerPreviewResponse.class);
    }

    /**
     *This API is used to obtain the shipping rule information list.
     * @param req DescribeConsumersRequest
     * @return DescribeConsumersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumersResponse DescribeConsumers(DescribeConsumersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumers", DescribeConsumersResponse.class);
    }

    /**
     *This API is used to get COS import configuration.
     * @param req DescribeCosRechargesRequest
     * @return DescribeCosRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRechargesResponse DescribeCosRecharges(DescribeCosRechargesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRecharges", DescribeCosRechargesResponse.class);
    }

    /**
     *This API is used to obtain the dashboard subscription list, and supports paging.
     * @param req DescribeDashboardSubscribesRequest
     * @return DescribeDashboardSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardSubscribesResponse DescribeDashboardSubscribes(DescribeDashboardSubscribesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboardSubscribes", DescribeDashboardSubscribesResponse.class);
    }

    /**
     *This API is used to get the basic information of data processing tasks.
     * @param req DescribeDataTransformInfoRequest
     * @return DescribeDataTransformInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTransformInfoResponse DescribeDataTransformInfo(DescribeDataTransformInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataTransformInfo", DescribeDataTransformInfoResponse.class);
    }

    /**
     *This API is used to search alarm channel callback configuration lists.
     * @param req DescribeDlcDeliversRequest
     * @return DescribeDlcDeliversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDlcDeliversResponse DescribeDlcDelivers(DescribeDlcDeliversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDlcDelivers", DescribeDlcDeliversResponse.class);
    }

    /**
     *Import Preview
     * @param req DescribeEsRechargePreviewRequest
     * @return DescribeEsRechargePreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEsRechargePreviewResponse DescribeEsRechargePreview(DescribeEsRechargePreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEsRechargePreview", DescribeEsRechargePreviewResponse.class);
    }

    /**
     *Retrieve the es import configuration
     * @param req DescribeEsRechargesRequest
     * @return DescribeEsRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEsRechargesResponse DescribeEsRecharges(DescribeEsRechargesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEsRecharges", DescribeEsRechargesResponse.class);
    }

    /**
     *This API is used to get the list of log download tasks.
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExports", DescribeExportsResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeHostMetricConfigsRequest
     * @return DescribeHostMetricConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostMetricConfigsResponse DescribeHostMetricConfigs(DescribeHostMetricConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostMetricConfigs", DescribeHostMetricConfigsResponse.class);
    }

    /**
     *This API is used to get the index configuration information.
     * @param req DescribeIndexRequest
     * @return DescribeIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexResponse DescribeIndex(DescribeIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndex", DescribeIndexResponse.class);
    }

    /**
     *This API is used to access Kafka protocol consumption information.
     * @param req DescribeKafkaConsumerRequest
     * @return DescribeKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerResponse DescribeKafkaConsumer(DescribeKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumer", DescribeKafkaConsumerResponse.class);
    }

    /**
     *Retrieve Kafka protocol consumption group details
     * @param req DescribeKafkaConsumerGroupDetailRequest
     * @return DescribeKafkaConsumerGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerGroupDetailResponse DescribeKafkaConsumerGroupDetail(DescribeKafkaConsumerGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumerGroupDetail", DescribeKafkaConsumerGroupDetailResponse.class);
    }

    /**
     *Retrieve the information list of Kafka protocol consumption groups
     * @param req DescribeKafkaConsumerGroupListRequest
     * @return DescribeKafkaConsumerGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerGroupListResponse DescribeKafkaConsumerGroupList(DescribeKafkaConsumerGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumerGroupList", DescribeKafkaConsumerGroupListResponse.class);
    }

    /**
     *This API is used to preview the Kafka consumption.
     * @param req DescribeKafkaConsumerPreviewRequest
     * @return DescribeKafkaConsumerPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerPreviewResponse DescribeKafkaConsumerPreview(DescribeKafkaConsumerPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumerPreview", DescribeKafkaConsumerPreviewResponse.class);
    }

    /**
     *This API is used to obtain the topic information list of Kafka consumption.
     * @param req DescribeKafkaConsumerTopicsRequest
     * @return DescribeKafkaConsumerTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerTopicsResponse DescribeKafkaConsumerTopics(DescribeKafkaConsumerTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumerTopics", DescribeKafkaConsumerTopicsResponse.class);
    }

    /**
     *This API is used to get the list of Kafka data subscription tasks.
     * @param req DescribeKafkaRechargesRequest
     * @return DescribeKafkaRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaRechargesResponse DescribeKafkaRecharges(DescribeKafkaRechargesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaRecharges", DescribeKafkaRechargesResponse.class);
    }

    /**
     *This API is used to search for content near the log context. For more details, see [Context Search](https://intl.cloud.tencent.com/document/product/614/53248?from_cn_redirect=1).The maximum value of API's return data packet is 49MB. It is recommended to enable gzip compression (HTTP Request Header Accept-Encoding: gzip).
     * @param req DescribeLogContextRequest
     * @return DescribeLogContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogContextResponse DescribeLogContext(DescribeLogContextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogContext", DescribeLogContextResponse.class);
    }

    /**
     *This API is used to get a log count histogram.
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
    }

    /**
     *This API is used to get the list of logsets.
     * @param req DescribeLogsetsRequest
     * @return DescribeLogsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsetsResponse DescribeLogsets(DescribeLogsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogsets", DescribeLogsetsResponse.class);
    }

    /**
     *This API is used to get the collection rule configuration bound to a machine group.
     * @param req DescribeMachineGroupConfigsRequest
     * @return DescribeMachineGroupConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupConfigsResponse DescribeMachineGroupConfigs(DescribeMachineGroupConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGroupConfigs", DescribeMachineGroupConfigsResponse.class);
    }

    /**
     *This API is used to get the list of machine groups.
     * @param req DescribeMachineGroupsRequest
     * @return DescribeMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupsResponse DescribeMachineGroups(DescribeMachineGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGroups", DescribeMachineGroupsResponse.class);
    }

    /**
     *This API is used to get the status of a machine under the specified machine group.
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeMetricCorrectDimensionRequest
     * @return DescribeMetricCorrectDimensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricCorrectDimensionResponse DescribeMetricCorrectDimension(DescribeMetricCorrectDimensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricCorrectDimension", DescribeMetricCorrectDimensionResponse.class);
    }

    /**
     *This API is used to create metric subscription configurations.
     * @param req DescribeMetricSubscribePreviewRequest
     * @return DescribeMetricSubscribePreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricSubscribePreviewResponse DescribeMetricSubscribePreview(DescribeMetricSubscribePreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricSubscribePreview", DescribeMetricSubscribePreviewResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeMetricSubscribesRequest
     * @return DescribeMetricSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricSubscribesResponse DescribeMetricSubscribes(DescribeMetricSubscribesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricSubscribes", DescribeMetricSubscribesResponse.class);
    }

    /**
     *Retrieve web application details
     * @param req DescribeNetworkApplicationDetailRequest
     * @return DescribeNetworkApplicationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkApplicationDetailResponse DescribeNetworkApplicationDetail(DescribeNetworkApplicationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkApplicationDetail", DescribeNetworkApplicationDetailResponse.class);
    }

    /**
     *Retrieve the network application list
     * @param req DescribeNetworkApplicationsRequest
     * @return DescribeNetworkApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkApplicationsResponse DescribeNetworkApplications(DescribeNetworkApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkApplications", DescribeNetworkApplicationsResponse.class);
    }

    /**
     *This API is used to obtain the notification content list.
     * @param req DescribeNoticeContentsRequest
     * @return DescribeNoticeContentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoticeContentsResponse DescribeNoticeContents(DescribeNoticeContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoticeContents", DescribeNoticeContentsResponse.class);
    }

    /**
     *This API is deprecated. If needed, please use the DescribeTopics API to get the number of partitions.
     * @param req DescribePartitionsRequest
     * @return DescribePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePartitionsResponse DescribePartitions(DescribePartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePartitions", DescribePartitionsResponse.class);
    }

    /**
     *This API is used to obtain the list of rebuild index tasks.
     * @param req DescribeRebuildIndexTasksRequest
     * @return DescribeRebuildIndexTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebuildIndexTasksResponse DescribeRebuildIndexTasks(DescribeRebuildIndexTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebuildIndexTasks", DescribeRebuildIndexTasksResponse.class);
    }

    /**
     *This API is used to retrieve the pre-aggregation task list.
     * @param req DescribeRecordingRuleTaskRequest
     * @return DescribeRecordingRuleTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRuleTaskResponse DescribeRecordingRuleTask(DescribeRecordingRuleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordingRuleTask", DescribeRecordingRuleTaskResponse.class);
    }

    /**
     *This API is used to retrieve the pre-aggregation task list in yaml.
     * @param req DescribeRecordingRuleYamlTaskRequest
     * @return DescribeRecordingRuleYamlTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingRuleYamlTaskResponse DescribeRecordingRuleYamlTask(DescribeRecordingRuleYamlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordingRuleYamlTask", DescribeRecordingRuleYamlTaskResponse.class);
    }

    /**
     *This API is used to obtain the list of RemoteWrite delivery tasks.
     * @param req DescribeRemoteWriteTasksRequest
     * @return DescribeRemoteWriteTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRemoteWriteTasksResponse DescribeRemoteWriteTasks(DescribeRemoteWriteTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRemoteWriteTasks", DescribeRemoteWriteTasksResponse.class);
    }

    /**
     *This API is used to access the scheduled SQL analysis task list.
     * @param req DescribeScheduledSqlInfoRequest
     * @return DescribeScheduledSqlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledSqlInfoResponse DescribeScheduledSqlInfo(DescribeScheduledSqlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduledSqlInfo", DescribeScheduledSqlInfoResponse.class);
    }

    /**
     *Query view list
     * @param req DescribeSearchViewsRequest
     * @return DescribeSearchViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchViewsResponse DescribeSearchViews(DescribeSearchViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchViews", DescribeSearchViewsResponse.class);
    }

    /**
     *This API is used to get the list of shipping tasks.
     * @param req DescribeShipperTasksRequest
     * @return DescribeShipperTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShipperTasksResponse DescribeShipperTasks(DescribeShipperTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShipperTasks", DescribeShipperTasksResponse.class);
    }

    /**
     *This API is used to get the configuration of the task shipped to COS.
     * @param req DescribeShippersRequest
     * @return DescribeShippersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShippersResponse DescribeShippers(DescribeShippersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShippers", DescribeShippersResponse.class);
    }

    /**
     *Retrieve the Splunk delivery task list
     * @param req DescribeSplunkDeliversRequest
     * @return DescribeSplunkDeliversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSplunkDeliversResponse DescribeSplunkDelivers(DescribeSplunkDeliversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSplunkDelivers", DescribeSplunkDeliversResponse.class);
    }

    /**
     *splunk delivery task preview
     * @param req DescribeSplunkPreviewRequest
     * @return DescribeSplunkPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSplunkPreviewResponse DescribeSplunkPreview(DescribeSplunkPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSplunkPreview", DescribeSplunkPreviewResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeTopicBaseMetricConfigsRequest
     * @return DescribeTopicBaseMetricConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicBaseMetricConfigsResponse DescribeTopicBaseMetricConfigs(DescribeTopicBaseMetricConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicBaseMetricConfigs", DescribeTopicBaseMetricConfigsResponse.class);
    }

    /**
     *This API is used to obtain metric subscription configurations.
     * @param req DescribeTopicMetricConfigsRequest
     * @return DescribeTopicMetricConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicMetricConfigsResponse DescribeTopicMetricConfigs(DescribeTopicMetricConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicMetricConfigs", DescribeTopicMetricConfigsResponse.class);
    }

    /**
     *This API is used to obtain logs or metric topic lists and supports pagination.
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
    }

    /**
     *This API is used to search alarm channel callback configuration lists.
     * @param req DescribeWebCallbacksRequest
     * @return DescribeWebCallbacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebCallbacksResponse DescribeWebCallbacks(DescribeWebCallbacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebCallbacks", DescribeWebCallbacksResponse.class);
    }

    /**
     *This API is used to estimate rebuild index tasks.
     * @param req EstimateRebuildIndexTaskRequest
     * @return EstimateRebuildIndexTaskResponse
     * @throws TencentCloudSDKException
     */
    public EstimateRebuildIndexTaskResponse EstimateRebuildIndexTask(EstimateRebuildIndexTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EstimateRebuildIndexTask", EstimateRebuildIndexTaskResponse.class);
    }

    /**
     *This API is used to access alarm policy execution details.
     * @param req GetAlarmLogRequest
     * @return GetAlarmLogResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmLogResponse GetAlarmLog(GetAlarmLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlarmLog", GetAlarmLogResponse.class);
    }

    /**
     *This API is used to check whether CLS is enabled.
This API is used to fill in any region for Region, recommend using Guangzhou (ap-guangzhou).
     * @param req GetClsServiceRequest
     * @return GetClsServiceResponse
     * @throws TencentCloudSDKException
     */
    public GetClsServiceResponse GetClsService(GetClsServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetClsService", GetClsServiceResponse.class);
    }

    /**
     *This API is used to obtain the list of time series label values.
     * @param req GetMetricLabelValuesRequest
     * @return GetMetricLabelValuesResponse
     * @throws TencentCloudSDKException
     */
    public GetMetricLabelValuesResponse GetMetricLabelValues(GetMetricLabelValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMetricLabelValues", GetMetricLabelValuesResponse.class);
    }

    /**
     *This API is deprecated. If needed, please use the ModifyTopic API to change the number of partitions.
     * @param req MergePartitionRequest
     * @return MergePartitionResponse
     * @throws TencentCloudSDKException
     */
    public MergePartitionResponse MergePartition(MergePartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MergePartition", MergePartitionResponse.class);
    }

    /**
     *This API is used to modify an alarm policy. At least one valid configuration item needs to be modified.
     * @param req ModifyAlarmRequest
     * @return ModifyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmResponse ModifyAlarm(ModifyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarm", ModifyAlarmResponse.class);
    }

    /**
     *This API is used to modify a notification group.
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmNotice", ModifyAlarmNoticeResponse.class);
    }

    /**
     *This API is used to modify alarm blocking rules. When the alarm blocking rule is invalid, it cannot be modified.
     * @param req ModifyAlarmShieldRequest
     * @return ModifyAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmShieldResponse ModifyAlarmShield(ModifyAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmShield", ModifyAlarmShieldResponse.class);
    }

    /**
     *Cloud product integration uses internal APIs
     * @param req ModifyCloudProductLogCollectionRequest
     * @return ModifyCloudProductLogCollectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudProductLogCollectionResponse ModifyCloudProductLogCollection(ModifyCloudProductLogCollectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudProductLogCollection", ModifyCloudProductLogCollectionResponse.class);
    }

    /**
     *This API is used to modify collection rule configuration.
     * @param req ModifyConfigRequest
     * @return ModifyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigResponse ModifyConfig(ModifyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfig", ModifyConfigResponse.class);
    }

    /**
     *This API is used to edit the DataSight Console
     * @param req ModifyConsoleRequest
     * @return ModifyConsoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsoleResponse ModifyConsole(ModifyConsoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsole", ModifyConsoleResponse.class);
    }

    /**
     *This API is used to modify a CKafka delivery task.
     * @param req ModifyConsumerRequest
     * @return ModifyConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerResponse ModifyConsumer(ModifyConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumer", ModifyConsumerResponse.class);
    }

    /**
     *This API is used to update the consumer group information.
     * @param req ModifyConsumerGroupRequest
     * @return ModifyConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupResponse ModifyConsumerGroup(ModifyConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroup", ModifyConsumerGroupResponse.class);
    }

    /**
     *This API is used to modify a COS import task.
     * @param req ModifyCosRechargeRequest
     * @return ModifyCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosRechargeResponse ModifyCosRecharge(ModifyCosRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosRecharge", ModifyCosRechargeResponse.class);
    }

    /**
     *This API is used to modify the dashboard.
     * @param req ModifyDashboardRequest
     * @return ModifyDashboardResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDashboardResponse ModifyDashboard(ModifyDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDashboard", ModifyDashboardResponse.class);
    }

    /**
     *This API is used to modify dashboard subscriptions.
     * @param req ModifyDashboardSubscribeRequest
     * @return ModifyDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDashboardSubscribeResponse ModifyDashboardSubscribe(ModifyDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDashboardSubscribe", ModifyDashboardSubscribeResponse.class);
    }

    /**
     *This API is used to modify a data processing task.
     * @param req ModifyDataTransformRequest
     * @return ModifyDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataTransformResponse ModifyDataTransform(ModifyDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataTransform", ModifyDataTransformResponse.class);
    }

    /**
     *Modify a DLC delivery task
     * @param req ModifyDlcDeliverRequest
     * @return ModifyDlcDeliverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDlcDeliverResponse ModifyDlcDeliver(ModifyDlcDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDlcDeliver", ModifyDlcDeliverResponse.class);
    }

    /**
     *Modify es import configuration
     * @param req ModifyEsRechargeRequest
     * @return ModifyEsRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEsRechargeResponse ModifyEsRecharge(ModifyEsRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEsRecharge", ModifyEsRechargeResponse.class);
    }

    /**
     *Modify host metric collection configuration
     * @param req ModifyHostMetricConfigRequest
     * @return ModifyHostMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostMetricConfigResponse ModifyHostMetricConfig(ModifyHostMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostMetricConfig", ModifyHostMetricConfigResponse.class);
    }

    /**
     *This API is used to modify the index configuration. It is subject to the default request frequency limit, and the number of concurrent requests to the same log topic cannot exceed 1, i.e., the index configuration of only one log topic can be modified at a time.
     * @param req ModifyIndexRequest
     * @return ModifyIndexResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIndexResponse ModifyIndex(ModifyIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIndex", ModifyIndexResponse.class);
    }

    /**
     *This API is used to modify Kafka protocol consumption information.
     * @param req ModifyKafkaConsumerRequest
     * @return ModifyKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaConsumerResponse ModifyKafkaConsumer(ModifyKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKafkaConsumer", ModifyKafkaConsumerResponse.class);
    }

    /**
     *This API is used to modify Kafka protocol consumption group offsets.
     * @param req ModifyKafkaConsumerGroupOffsetRequest
     * @return ModifyKafkaConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaConsumerGroupOffsetResponse ModifyKafkaConsumerGroupOffset(ModifyKafkaConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKafkaConsumerGroupOffset", ModifyKafkaConsumerGroupOffsetResponse.class);
    }

    /**
     *This API is used to modify a Kafka data subscription task.
     * @param req ModifyKafkaRechargeRequest
     * @return ModifyKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaRechargeResponse ModifyKafkaRecharge(ModifyKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKafkaRecharge", ModifyKafkaRechargeResponse.class);
    }

    /**
     *This API is used to modify a logset.
     * @param req ModifyLogsetRequest
     * @return ModifyLogsetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogsetResponse ModifyLogset(ModifyLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogset", ModifyLogsetResponse.class);
    }

    /**
     *Modify machine group.
Note: Modifying the interface will directly overwrite historical data and change it to valid input parameters this time. Please be cautious when calling this API.
     * @param req ModifyMachineGroupRequest
     * @return ModifyMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineGroupResponse ModifyMachineGroup(ModifyMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineGroup", ModifyMachineGroupResponse.class);
    }

    /**
     *This API is used to create metric collection configurations.
     * @param req ModifyMetricConfigRequest
     * @return ModifyMetricConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMetricConfigResponse ModifyMetricConfig(ModifyMetricConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMetricConfig", ModifyMetricConfigResponse.class);
    }

    /**
     *This API is used to modify metric subscription configurations.
     * @param req ModifyMetricSubscribeRequest
     * @return ModifyMetricSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMetricSubscribeResponse ModifyMetricSubscribe(ModifyMetricSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMetricSubscribe", ModifyMetricSubscribeResponse.class);
    }

    /**
     *Modify a web application
     * @param req ModifyNetworkApplicationRequest
     * @return ModifyNetworkApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkApplicationResponse ModifyNetworkApplication(ModifyNetworkApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkApplication", ModifyNetworkApplicationResponse.class);
    }

    /**
     *This API is used to modify notification content configuration.
     * @param req ModifyNoticeContentRequest
     * @return ModifyNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNoticeContentResponse ModifyNoticeContent(ModifyNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNoticeContent", ModifyNoticeContentResponse.class);
    }

    /**
     *This API is used to modify a scheduled pre-aggregation task.
     * @param req ModifyRecordingRuleTaskRequest
     * @return ModifyRecordingRuleTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordingRuleTaskResponse ModifyRecordingRuleTask(ModifyRecordingRuleTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordingRuleTask", ModifyRecordingRuleTaskResponse.class);
    }

    /**
     *Modifying a Metric Pre-Aggregation Task Through a YAML File
     * @param req ModifyRecordingRuleYamlTaskRequest
     * @return ModifyRecordingRuleYamlTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordingRuleYamlTaskResponse ModifyRecordingRuleYamlTask(ModifyRecordingRuleYamlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordingRuleYamlTask", ModifyRecordingRuleYamlTaskResponse.class);
    }

    /**
     *This API is used to modify a RemoteWrite task.
     * @param req ModifyRemoteWriteTaskRequest
     * @return ModifyRemoteWriteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRemoteWriteTaskResponse ModifyRemoteWriteTask(ModifyRemoteWriteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRemoteWriteTask", ModifyRemoteWriteTaskResponse.class);
    }

    /**
     *This API is used to modify a scheduled SQL analysis task.
     * @param req ModifyScheduledSqlRequest
     * @return ModifyScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledSqlResponse ModifyScheduledSql(ModifyScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScheduledSql", ModifyScheduledSqlResponse.class);
    }

    /**
     *This API is used to modify a query view.
     * @param req ModifySearchViewRequest
     * @return ModifySearchViewResponse
     * @throws TencentCloudSDKException
     */
    public ModifySearchViewResponse ModifySearchView(ModifySearchViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySearchView", ModifySearchViewResponse.class);
    }

    /**
     *This API is used to modify an existing shipping rule. To use this API, you need to grant CLS the write permission of the specified bucket.
     * @param req ModifyShipperRequest
     * @return ModifyShipperResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShipperResponse ModifyShipper(ModifyShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShipper", ModifyShipperResponse.class);
    }

    /**
     *Modify information related to splunk delivery task
     * @param req ModifySplunkDeliverRequest
     * @return ModifySplunkDeliverResponse
     * @throws TencentCloudSDKException
     */
    public ModifySplunkDeliverResponse ModifySplunkDeliver(ModifySplunkDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySplunkDeliver", ModifySplunkDeliverResponse.class);
    }

    /**
     *This API is used to modify logs or metric topics.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *This API is used to modify alarm channel callback configurations.
     * @param req ModifyWebCallbackRequest
     * @return ModifyWebCallbackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebCallbackResponse ModifyWebCallback(ModifyWebCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebCallback", ModifyWebCallbackResponse.class);
    }

    /**
     *This API is used to create resources and indexes dependent on OpenClaw.
     * @param req OpenClawServiceRequest
     * @return OpenClawServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenClawServiceResponse OpenClawService(OpenClawServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClawService", OpenClawServiceResponse.class);
    }

    /**
     *Enable logging
This API is used to enable CLS in all regions by filling any region for Region, recommend using Guangzhou (ap-guangzhou).
     * @param req OpenClsServiceRequest
     * @return OpenClsServiceResponse
     * @throws TencentCloudSDKException
     */
    public OpenClsServiceResponse OpenClsService(OpenClsServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenClsService", OpenClsServiceResponse.class);
    }

    /**
     *This API is used to enable the Kafka consumption feature.
     * @param req OpenKafkaConsumerRequest
     * @return OpenKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public OpenKafkaConsumerResponse OpenKafkaConsumer(OpenKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenKafkaConsumer", OpenKafkaConsumerResponse.class);
    }

    /**
     *This API is used to preview the logs of Kafka data subscription tasks.
     * @param req PreviewKafkaRechargeRequest
     * @return PreviewKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public PreviewKafkaRechargeResponse PreviewKafkaRecharge(PreviewKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewKafkaRecharge", PreviewKafkaRechargeResponse.class);
    }

    /**
     *Query the latest metric value at a specified time.
If there is no metric data in the 5 minutes before that moment, there will be no query result.
     * @param req QueryMetricRequest
     * @return QueryMetricResponse
     * @throws TencentCloudSDKException
     */
    public QueryMetricResponse QueryMetric(QueryMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryMetric", QueryMetricResponse.class);
    }

    /**
     *This API is used to query the trend of metrics within a specified time range.
     * @param req QueryRangeMetricRequest
     * @return QueryRangeMetricResponse
     * @throws TencentCloudSDKException
     */
    public QueryRangeMetricResponse QueryRangeMetric(QueryRangeMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryRangeMetric", QueryRangeMetricResponse.class);
    }

    /**
     *This API is used to retry a failed shipping task.
     * @param req RetryShipperTaskRequest
     * @return RetryShipperTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryShipperTaskResponse RetryShipperTask(RetryShipperTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryShipperTask", RetryShipperTaskResponse.class);
    }

    /**
     *This API is used to preview COS import information.
     * @param req SearchCosRechargeInfoRequest
     * @return SearchCosRechargeInfoResponse
     * @throws TencentCloudSDKException
     */
    public SearchCosRechargeInfoResponse SearchCosRechargeInfo(SearchCosRechargeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchCosRechargeInfo", SearchCosRechargeInfoResponse.class);
    }

    /**
     *This API is used to preview the dashboard subscription.
     * @param req SearchDashboardSubscribeRequest
     * @return SearchDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public SearchDashboardSubscribeResponse SearchDashboardSubscribe(SearchDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchDashboardSubscribe", SearchDashboardSubscribeResponse.class);
    }

    /**
     *This API is used to retrieve and analyze logs. Please note the following matters when using this API.
1. Besides being subject to the default API request rate limit, for a single log topic, the number of concurrent queries cannot exceed 15.
2. The API's return data packet maximum is 49MB. It is recommended to enable gzip compression (HTTP Request Header Accept-Encoding: gzip).
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *This API is used to check the heartbeat of a consumer group.
     * @param req SendConsumerHeartbeatRequest
     * @return SendConsumerHeartbeatResponse
     * @throws TencentCloudSDKException
     */
    public SendConsumerHeartbeatResponse SendConsumerHeartbeat(SendConsumerHeartbeatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendConsumerHeartbeat", SendConsumerHeartbeatResponse.class);
    }

    /**
     *This API is deprecated. If needed, please use the ModifyTopic API to change the number of partitions.
     * @param req SplitPartitionRequest
     * @return SplitPartitionResponse
     * @throws TencentCloudSDKException
     */
    public SplitPartitionResponse SplitPartition(SplitPartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SplitPartition", SplitPartitionResponse.class);
    }

    /**
     *## Notification
To ensure the reliability of your log data and use the log service more efficiently, we recommend that you use the CLS-optimized API to upload structured logs (https://www.tencentcloud.com/document/product/614/16873?from_cn_redirect=1).

Meanwhile, we have specially optimized and customized SDKs in multiple languages for this API for you to choose from. The SDK provides unified async sending, resource control, automatic retry, graceful shutdown, perception reporting, and other features to improve the log reporting function. For details, refer to [SDK Collection](https://www.tencentcloud.com/document/product/614/67157?from_cn_redirect=1).

Meanwhile, the log upload API also supports synchronous log data upload. If you select to continue using this API, refer to the following text.

## Feature Description

This API is used to write logs to the designated log topic.

#### Input parameter (pb binary stream, located in body)

| Field name | Data type | Location | Must | Description |
| ------------ | ------- | ---- | ---- | ------------------------------------------------------------ |
| logGroupList | message | pb   | Yes | logGroup list, encapsulated content of the log group list. It is advisable not to exceed 5 logGroups. |

Group description:

| Field name | Required or optional | Description |
| ----------- | -------- | ------------------------------------------------------------ |
| logs        | is       | a log array, which means a set of multiple logs. One Log represents one log, and the number of logs in one LogGroup cannot exceed 10000 |
| contextFlow | No | The unique ID of LogGroup, which must be imported when using context features. Format: "{context ID}-{LogGroupID}".<br>Context ID: A unique identifier for a context (a series of consecutively scrolled log files or a sequence of logs requiring order preservation), a 64-bit integer string in base 16.<br>LogGroupID: A consecutively incremental integer string in base 16. Example: "102700A66102516A-59F59".
| filename    | No       | Log file name |
| source      | No       | Log source, using machine IP as a label in general use       |
| logTags     | No       | Log tag list                                               |

Log description:

| field name | Required or optional | Description |
| -------- | -------- | ------------------------------------------------------------ |
| time     | is       | log time (Unix timestamp), supports second, millisecond, microsecond, milliseconds is recommended |
| contents | No | Key-value formatted log content, representing multiple key-value composites in a log |

Content description:

| Field name | Required or optional | Description |
| ------ | -------- | ------------------------------------------------------------ |
| key    | Yes       | The key value of a field group in a single-line log. It cannot start with `_` |
| value  | Yes       | The value of a field group in a single-line log. The value of a single-line log must not exceed 1MB, and the sum of ALL values in a LogGroup cannot exceed 5MB. |

LogTag description:

| Field name | Required or optional | Description |
| ------ | -------- | -------------------------------- |
| key    | Yes      | Custom tag key                 |
| value  | is       | value corresponding to the custom tag key |

## PB Compilation Example

This example shows how to use the official protoc compiler to compile and generate a C++ language adjustable log upload API from a description file.

Currently protoc officially supports compilation for languages such as Java, C++, and Python. For details, see [protoc](https://github.com/protocolbuffers/protobuf).

#### 1. Protocol Buffer installation

Download [Protocol Buffer](https://main.qcloudimg.com/raw/d7810aaf8b3073fbbc9d4049c21532aa/protobuf-2.6.1.tar.gz), unzip and install. The example version is protobuf 2.6.1, and the environment is Centos 7.3 system. Decompress the `protobuf-2.6.1.tar.gz` compressed package to the `/usr/local` directory and enter the directory. Execute the command as follows:

```
tar -zxvf protobuf-2.6.1.tar.gz -C /usr/local/ && cd /usr/local/protobuf-2.6.1
```

Start compilation and installation, configure environment variables, execute the command as follows:

```
[root@VM_0_8_centos protobuf-2.6.1]# ./configure 
[root@VM_0_8_centos protobuf-2.6.1]# make && make install
[root@VM_0_8_centos protobuf-2.6.1]# export PATH=$PATH:/usr/local/protobuf-2.6.1/bin
```

After successful compilation, view the version using the following command:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --version
liprotoc 2.6.1
```

#### 2. Create PB description file

The PB description file is the data interchange format agreed by the communication parties. When uploading logs, compile the specified protocol format into the calling interface of the corresponding language version, then add to engineering code. For details, see [protoc](https://github.com/protocolbuffers/protobuf).

Create a local PB message description file cls.proto based on the PB data format specified by the log service.

!PB description file content immutable, and the file name must end with `.proto`.

The content of cls.proto (PB description file) is as follows:

```
package cls;

message Log
{
    message Content
    {
required string key = 1; // key for each group of fields
required string value = 2; // The value of the group field
    }
required int64   time     = 1; // A timestamp in UNIX time format
repeated Content contents = 2; // multiple kv combinations in a log
}

message LogTag
{
    required string key       = 1;
    required string value     = 2;
}

message LogGroup
{
repeated Log    logs        = 1; // log array composed of multiple logs
optional string contextFlow = 2; // Currently no utility
optional string filename = 3; // log file name
optional string source      = 4; // log source, general use machine IP
    repeated LogTag logTags     = 5;
}

message LogGroupList
{
repeated LogGroup logGroupList = 1; // log group list
}
```

#### 3. Compile and generate

In this example, use the proto compiler to generate C++ language files under the same directory as the cls.proto file and execute the following compilation command:

```
protoc --cpp_out=./ ./cls.proto 
```

`--cpp_out=./` means compile to cpp format and output in the current directory. `./cls.proto` refers to the cls.proto description file located in the current directory.

After successful compilation, it will output the code file in the corresponding language. This routine generates the cls.pb.h header file and the cls.pb.cc code implementation file, as shown below:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --cpp_out=./ ./cls.proto
[root@VM_0_8_centos protobuf-2.6.1]# ls
cls.pb.cc cls.pb.h cls.proto
```

#### 4. Call

Import the generated cls.pb.h header file into the code and call the interface to encapsulate the data format.
     * @param req UploadLogRequest
     * @return UploadLogResponse
     * @throws TencentCloudSDKException
     */
    public UploadLogResponse UploadLog(UploadLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadLog", UploadLogResponse.class);
    }

}
