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
    private static String endpoint = "cls.tencentcloudapi.com";
    private static String service = "cls";
    private static String version = "2020-10-16";

    public ClsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClsClient(Credential credential, String region, ClientProfile profile) {
        super(ClsClient.endpoint, ClsClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply the collection configuration to the specified machine group.
     * @param req ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConfigToMachineGroupResponse ApplyConfigToMachineGroup(ApplyConfigToMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyConfigToMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyConfigToMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyConfigToMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an alarm policy.
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an alarm notification template.
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an offline context search task.
     * @param req CreateAsyncContextTaskRequest
     * @return CreateAsyncContextTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAsyncContextTaskResponse CreateAsyncContextTask(CreateAsyncContextTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAsyncContextTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAsyncContextTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAsyncContextTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an offline search task.
     * @param req CreateAsyncSearchTaskRequest
     * @return CreateAsyncSearchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAsyncSearchTaskResponse CreateAsyncSearchTask(CreateAsyncSearchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAsyncSearchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAsyncSearchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAsyncSearchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a collection rule configuration.
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a log download task.
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an index.
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a logset. The ID of the created logset is returned.
     * @param req CreateLogsetRequest
     * @return CreateLogsetResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogsetResponse CreateLogset(CreateLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogsetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a machine group.
     * @param req CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMachineGroupResponse CreateMachineGroup(CreateMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a shipping rule. To use this API, you need to grant CLS the write permission of the specified bucket.
     * @param req CreateShipperRequest
     * @return CreateShipperResponse
     * @throws TencentCloudSDKException
     */
    public CreateShipperResponse CreateShipper(CreateShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShipperResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShipperResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateShipper");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a log topic.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alarm policy.
     * @param req DeleteAlarmRequest
     * @return DeleteAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alarm notification template.
     * @param req DeleteAlarmNoticeRequest
     * @return DeleteAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticeResponse DeleteAlarmNotice(DeleteAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an offline context search task.
     * @param req DeleteAsyncContextTaskRequest
     * @return DeleteAsyncContextTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAsyncContextTaskResponse DeleteAsyncContextTask(DeleteAsyncContextTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAsyncContextTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAsyncContextTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAsyncContextTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an offline search task.
     * @param req DeleteAsyncSearchTaskRequest
     * @return DeleteAsyncSearchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAsyncSearchTaskResponse DeleteAsyncSearchTask(DeleteAsyncSearchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAsyncSearchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAsyncSearchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAsyncSearchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a collection rule configuration.
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the collection configuration applied to a machine group.
     * @param req DeleteConfigFromMachineGroupRequest
     * @return DeleteConfigFromMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFromMachineGroupResponse DeleteConfigFromMachineGroup(DeleteConfigFromMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigFromMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConfigFromMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConfigFromMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a log download task.
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the index configuration of a log topic.
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a logset.
     * @param req DeleteLogsetRequest
     * @return DeleteLogsetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogsetResponse DeleteLogset(DeleteLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogsetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a machine group.
     * @param req DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupResponse DeleteMachineGroup(DeleteMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a shipping rule.
     * @param req DeleteShipperRequest
     * @return DeleteShipperResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShipperResponse DeleteShipper(DeleteShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShipperResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShipperResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteShipper");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a log topic.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of alarm notification templates.
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of alarm policies.
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the result of an offline context search task.
     * @param req DescribeAsyncContextResultRequest
     * @return DescribeAsyncContextResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncContextResultResponse DescribeAsyncContextResult(DescribeAsyncContextResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncContextResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncContextResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncContextResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of offline context search tasks.
     * @param req DescribeAsyncContextTasksRequest
     * @return DescribeAsyncContextTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncContextTasksResponse DescribeAsyncContextTasks(DescribeAsyncContextTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncContextTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncContextTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncContextTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the result of an offline search task.
     * @param req DescribeAsyncSearchResultRequest
     * @return DescribeAsyncSearchResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncSearchResultResponse DescribeAsyncSearchResult(DescribeAsyncSearchResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncSearchResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncSearchResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncSearchResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of offline search tasks.
     * @param req DescribeAsyncSearchTasksRequest
     * @return DescribeAsyncSearchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncSearchTasksResponse DescribeAsyncSearchTasks(DescribeAsyncSearchTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncSearchTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncSearchTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncSearchTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the machine group bound to a collection rule configuration.
     * @param req DescribeConfigMachineGroupsRequest
     * @return DescribeConfigMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMachineGroupsResponse DescribeConfigMachineGroups(DescribeConfigMachineGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigMachineGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigMachineGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigMachineGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a collection rule configuration.
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of log download tasks.
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the index configuration information.
     * @param req DescribeIndexRequest
     * @return DescribeIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexResponse DescribeIndex(DescribeIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search for content in the log context.
     * @param req DescribeLogContextRequest
     * @return DescribeLogContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogContextResponse DescribeLogContext(DescribeLogContextRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogContextResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogContextResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogContext");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of logsets.
     * @param req DescribeLogsetsRequest
     * @return DescribeLogsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsetsResponse DescribeLogsets(DescribeLogsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogsetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the collection rule configuration bound to a machine group.
     * @param req DescribeMachineGroupConfigsRequest
     * @return DescribeMachineGroupConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupConfigsResponse DescribeMachineGroupConfigs(DescribeMachineGroupConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGroupConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineGroupConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineGroupConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of machine groups.
     * @param req DescribeMachineGroupsRequest
     * @return DescribeMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupsResponse DescribeMachineGroups(DescribeMachineGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the machine status in the specified machine group.
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of topic partitions.
     * @param req DescribePartitionsRequest
     * @return DescribePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePartitionsResponse DescribePartitions(DescribePartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePartitionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePartitionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePartitions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of shipping tasks.
     * @param req DescribeShipperTasksRequest
     * @return DescribeShipperTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShipperTasksResponse DescribeShipperTasks(DescribeShipperTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShipperTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShipperTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShipperTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of shipping rules.
     * @param req DescribeShippersRequest
     * @return DescribeShippersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShippersResponse DescribeShippers(DescribeShippersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShippersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShippersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShippers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * This API is used to get the list of log topics and supports pagination.
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the records of alarm tasks.
     * @param req GetAlarmLogRequest
     * @return GetAlarmLogResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmLogResponse GetAlarmLog(GetAlarmLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAlarmLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAlarmLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAlarmLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to merge a topic partition in read/write state. During merge, a topic partition ID can be specified, and CLS will automatically merge the partition adjacent to the right of the range.
     * @param req MergePartitionRequest
     * @return MergePartitionResponse
     * @throws TencentCloudSDKException
     */
    public MergePartitionResponse MergePartition(MergePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MergePartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MergePartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MergePartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an alarm policy. At least one valid configuration item needs to be modified.
     * @param req ModifyAlarmRequest
     * @return ModifyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmResponse ModifyAlarm(ModifyAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an alarm notification template.
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a collection rule configuration.
     * @param req ModifyConfigRequest
     * @return ModifyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigResponse ModifyConfig(ModifyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the index configuration.

     * @param req ModifyIndexRequest
     * @return ModifyIndexResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIndexResponse ModifyIndex(ModifyIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a logset.
     * @param req ModifyLogsetRequest
     * @return ModifyLogsetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogsetResponse ModifyLogset(ModifyLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogsetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a machine group.
     * @param req ModifyMachineGroupRequest
     * @return ModifyMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineGroupResponse ModifyMachineGroup(ModifyMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an existing shipping rule. To use this API, you need to grant CLS the write permission of the specified bucket.
     * @param req ModifyShipperRequest
     * @return ModifyShipperResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShipperResponse ModifyShipper(ModifyShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyShipperResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyShipperResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyShipper");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a log topic.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to retry a failed shipping task.
     * @param req RetryShipperTaskRequest
     * @return RetryShipperTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryShipperTaskResponse RetryShipperTask(RetryShipperTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryShipperTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RetryShipperTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryShipperTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search for logs.
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to split a topic partition.
     * @param req SplitPartitionRequest
     * @return SplitPartitionResponse
     * @throws TencentCloudSDKException
     */
    public SplitPartitionResponse SplitPartition(SplitPartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SplitPartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SplitPartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SplitPartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *## Feature Description

This API is used to write a log to the specified log topic.

CLS provides the following two modes:

#### Load balancing mode

In this mode, logs will be automatically written to a target partition among all readable/writable partitions under the current log topic based on the load balancing principle. This mode is suitable for scenarios where the sequential consumption is not needed.

#### Hash routing mode

In this mode, data will be written to a target partition that meets the range requirements based on the hash value (X-CLS-HashKey) carried by data. For example, a log source can be bound to a topic partition through `hashkey`, strictly guaranteeing the sequence of the data written to and consumed in this partition.

In addition, CLS allows you to upload logs in the following two modes:


## Request

#### Request header parameters

The `X-CLS-HashKey` request header indicates that logs are written to the CLS topic partitions with a range corresponding to the hashkey route, strictly guaranteeing the write sequence of logs to each topic partition for sequential consumption.

| Field | Type | Location | Required | Description |
| ------------------ | ------ | ------ | -------- | ------------------------------------------------------------ |
| X-CLS-HashKey | string | header | No       | Logs are written to the corresponding topic partition according to `hashkey` |
| X-CLS-TopicId      | String | header | Yes       | Topic ID                                                       |                                                 |
| Content-Type | String | header | Yes | Protocol type of the request parameter. Currently, only the PB protocol is supported. Please enter "application/octet-stream". |
| X-TC-Action | String |	header | Yes | Common parameter. The value used for this API: UploadLog.                   
| X-TC-Region | String | header | Yes	  | Common parameter. This parameter is not required for this API.                       
| X-TC-Version | String | header | Yes | Common parameter. The value used for this API: 2020-10-16.                  

#### Input parameters (PB protocol)

| Field | Type | Location | Required | Description |
| ------------ | ------- | ---- | ---- | ------------------------------------------------------------ |
| logGroupList | message | pb    | Yes   | The logGroup list, which describes the encapsulated log groups. No more than five `logGroup` values are recommended.                     |

`LogGroup` description:

| Field | Required | Description |
| ----------- | -------- | ------------------------------------------------------------ |
| logs        | Yes       | Log array consisting of multiple `Log` values. The `Log` indicates a log, and a `LogGroup` can contain up to 10,000 `Log` values. |
| contextFlow | No       | Unique LogGroup ID, which should be passed in if the context feature needs to be used. Format: "{context ID}-{LogGroupID}". <br>Context ID: uniquely identifies the context (a series of log files that are continuously scrolling or a series of logs that need to be sequenced), which is a 64-bit integer hex string. <br>LogGroupID: a 64-bit integer hex string that continuously increases, such as "102700A66102516A-59F59".                        |
| filename    | No       | Log filename                                                   |
| source      | No       | Log source, which is generally the server IP                           |
| logTags     | No       | Tag list of the log                                               |

`Log` description:

| Field | Required | Description |
| -------- | -------- | ------------------------------------------------------------ |
| time | Yes | UNIX timestamp of log time in seconds or milliseconds (recommended) |
| contents | No | Log content in `key-value` format. A log can contain multiple `key-value` pairs. |

`Content` description:

| Field | Required | Description |
| ------ | -------- | ------------------------------------------------------------ |
| key    | Yes       | Key of a field group in one log, which cannot start with `_`.                 |
| value  | Yes       | Value of a field group, which cannot exceed 1 MB in one log. The total value cannot exceed 5 MB in `LogGroup`. |

`LogTag` description:

| Field | Required | Description |
| ------ | -------- | -------------------------------- |
| key    | Yes       | Key of a custom tag                 |
| value  | Yes       | Value corresponding to the custom tag key |

## PB Compilation Sample

This sample describes how to use the protoc compiler to compile the PB description file into a log upload API in C++.

> ?Currently, protoc supports compilation in multiple programming languages such as Java, C++, and Python. For more information, please see [protoc](https://github.com/protocolbuffers/protobuf).

#### 1. Install Protocol Buffer

Download [Protocol Buffer](https://main.qcloudimg.com/raw/d7810aaf8b3073fbbc9d4049c21532aa/protobuf-2.6.1.tar.gz), decompress the package, and install the tool. The version used in the sample is protobuf 2.6.1 running on CentOS 7.3. Run the following command to decompress the `protobuf-2.6.1.tar.gz` package to the `/usr/local` directory and enter the directory:

```
tar -zxvf protobuf-2.6.1.tar.gz -C /usr/local/ && cd /usr/local/protobuf-2.6.1
```

Run the following commands to start compilation and installation, and configure the environment variables:

```
[root@VM_0_8_centos protobuf-2.6.1]# ./configure 
[root@VM_0_8_centos protobuf-2.6.1]# make && make install
[root@VM_0_8_centos protobuf-2.6.1]# export PATH=$PATH:/usr/local/protobuf-2.6.1/bin
```

After the compilation succeeds, run the following command to check the version:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --version
liprotoc 2.6.1
```

#### 2. Create a PB description file

A PB description file is an agreed-on data exchange format for communication. To upload logs, please compile the specified protocol format to an API in the target programming language and add the API to the project code. For more information, please see [protoc](https://github.com/protocolbuffers/protobuf).

Create a PB message description file `cls.proto` based on the PB data format content specified by CLS.

> !The PB description file content cannot be modified, and the filename must end with `.proto`.

The content of `cls.proto` (PB description file) is as follows:

```
package cls;

message Log
{
    message Content
    {
        required string key   = 1; // Key of each field group
        required string value = 2; // Value of each field group
    }
    required int64   time     = 1; // Unix timestamp
    repeated Content contents = 2; // Multiple `key-value` pairs in one log
}

message LogTag
{
    required string key       = 1;
    required string value     = 2;
}

message LogGroup
{
    repeated Log    logs        = 1; // Log array consisting of multiple logs
    optional string contextFlow = 2; // This parameter does not take effect currently
    optional string filename    = 3; // Log filename
    optional string source      = 4; // Log source, which is generally the server IP
    repeated LogTag logTags     = 5;
}

message LogGroupList
{
    repeated LogGroup logGroupList = 1; // Log group list
}
```

#### 3. Compile and generate the API

This sample uses the proto compiler to generate a C++ file in the same directory as the `cls.proto` file. Run the following compilation commands:

```
protoc --cpp_out=./ ./cls.proto 
```

> ?`--cpp_out=./` indicates that the file will be compiled in cpp format and output to the current directory. `./cls.proto` indicates the `cls.proto` description file in the current directory.

After the compilation succeeds, the code file in the corresponding programming language will be generated. This sample generates the `cls.pb.h` header file and [cls.pb.cc](http://cls.pb.cc) code implementation file as shown below:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --cpp_out=./ ./cls.proto
[root@VM_0_8_centos protobuf-2.6.1]# ls
cls.pb.cc cls.pb.h cls.proto
```

#### 4. Call

Import the generated `cls.pb.h` header file into the code and call the API for data format encapsulation.
     * @param req UploadLogRequest
     * @return UploadLogResponse
     * @throws TencentCloudSDKException
     */
    public UploadLogResponse UploadLog(UploadLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
