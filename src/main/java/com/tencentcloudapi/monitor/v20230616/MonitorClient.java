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
package com.tencentcloudapi.monitor.v20230616;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.monitor.v20230616.models.*;

public class MonitorClient extends AbstractClient{
    private static String endpoint = "monitor.intl.tencentcloudapi.com";
    private static String service = "monitor";
    private static String version = "2023-06-16";

    public MonitorClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MonitorClient(Credential credential, String region, ClientProfile profile) {
        super(MonitorClient.endpoint, MonitorClient.version, credential, region, profile);
    }

    /**
     *Cancel dialogue execution
     * @param req CancelAIWorkbenchChatRequest
     * @return CancelAIWorkbenchChatResponse
     * @throws TencentCloudSDKException
     */
    public CancelAIWorkbenchChatResponse CancelAIWorkbenchChat(CancelAIWorkbenchChatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAIWorkbenchChat", CancelAIWorkbenchChatResponse.class);
    }

    /**
     *This API is used to create an Agent.
     * @param req CreateAIWorkbenchAgentRequest
     * @return CreateAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIWorkbenchAgentResponse CreateAIWorkbenchAgent(CreateAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIWorkbenchAgent", CreateAIWorkbenchAgentResponse.class);
    }

    /**
     *Create a task
     * @param req CreateAIWorkbenchTaskRequest
     * @return CreateAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIWorkbenchTaskResponse CreateAIWorkbenchTask(CreateAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIWorkbenchTask", CreateAIWorkbenchTaskResponse.class);
    }

    /**
     *Delete Agent
     * @param req DeleteAIWorkbenchAgentRequest
     * @return DeleteAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIWorkbenchAgentResponse DeleteAIWorkbenchAgent(DeleteAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIWorkbenchAgent", DeleteAIWorkbenchAgentResponse.class);
    }

    /**
     *This API is used to delete a task.
     * @param req DeleteAIWorkbenchTaskRequest
     * @return DeleteAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIWorkbenchTaskResponse DeleteAIWorkbenchTask(DeleteAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIWorkbenchTask", DeleteAIWorkbenchTaskResponse.class);
    }

    /**
     *Query Agent details.
     * @param req DescribeAIWorkbenchAgentRequest
     * @return DescribeAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchAgentResponse DescribeAIWorkbenchAgent(DescribeAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchAgent", DescribeAIWorkbenchAgentResponse.class);
    }

    /**
     *Query artifact details.
     * @param req DescribeAIWorkbenchArtifactRequest
     * @return DescribeAIWorkbenchArtifactResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchArtifactResponse DescribeAIWorkbenchArtifact(DescribeAIWorkbenchArtifactRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchArtifact", DescribeAIWorkbenchArtifactResponse.class);
    }

    /**
     *Query execution details.
     * @param req DescribeAIWorkbenchExecutionRequest
     * @return DescribeAIWorkbenchExecutionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchExecutionResponse DescribeAIWorkbenchExecution(DescribeAIWorkbenchExecutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchExecution", DescribeAIWorkbenchExecutionResponse.class);
    }

    /**
     *Query session details
     * @param req DescribeAIWorkbenchSessionRequest
     * @return DescribeAIWorkbenchSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSessionResponse DescribeAIWorkbenchSession(DescribeAIWorkbenchSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSession", DescribeAIWorkbenchSessionResponse.class);
    }

    /**
     *Query skill details
     * @param req DescribeAIWorkbenchSkillRequest
     * @return DescribeAIWorkbenchSkillResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIWorkbenchSkillResponse DescribeAIWorkbenchSkill(DescribeAIWorkbenchSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIWorkbenchSkill", DescribeAIWorkbenchSkillResponse.class);
    }

    /**
     *Query alarm notification history as needed
     * @param req DescribeAlarmNotifyHistoriesRequest
     * @return DescribeAlarmNotifyHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNotifyHistoriesResponse DescribeAlarmNotifyHistories(DescribeAlarmNotifyHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotifyHistories", DescribeAlarmNotifyHistoriesResponse.class);
    }

    /**
     *Get the download URL of AI Workbench artifacts.
     * @param req GetAIWorkbenchArtifactDownloadURLRequest
     * @return GetAIWorkbenchArtifactDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public GetAIWorkbenchArtifactDownloadURLResponse GetAIWorkbenchArtifactDownloadURL(GetAIWorkbenchArtifactDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAIWorkbenchArtifactDownloadURL", GetAIWorkbenchArtifactDownloadURLResponse.class);
    }

    /**
     *Query the Agent list.
     * @param req ListAIWorkbenchAgentsRequest
     * @return ListAIWorkbenchAgentsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchAgentsResponse ListAIWorkbenchAgents(ListAIWorkbenchAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchAgents", ListAIWorkbenchAgentsResponse.class);
    }

    /**
     *Query the product list
     * @param req ListAIWorkbenchArtifactsRequest
     * @return ListAIWorkbenchArtifactsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchArtifactsResponse ListAIWorkbenchArtifacts(ListAIWorkbenchArtifactsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchArtifacts", ListAIWorkbenchArtifactsResponse.class);
    }

    /**
     *Query the execution list
     * @param req ListAIWorkbenchExecutionsRequest
     * @return ListAIWorkbenchExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchExecutionsResponse ListAIWorkbenchExecutions(ListAIWorkbenchExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchExecutions", ListAIWorkbenchExecutionsResponse.class);
    }

    /**
     *Query the MCP list.
     * @param req ListAIWorkbenchMCPsRequest
     * @return ListAIWorkbenchMCPsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchMCPsResponse ListAIWorkbenchMCPs(ListAIWorkbenchMCPsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchMCPs", ListAIWorkbenchMCPsResponse.class);
    }

    /**
     *This API is used to query message list.
     * @param req ListAIWorkbenchMessagesRequest
     * @return ListAIWorkbenchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchMessagesResponse ListAIWorkbenchMessages(ListAIWorkbenchMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchMessages", ListAIWorkbenchMessagesResponse.class);
    }

    /**
     *List resource instances.
     * @param req ListAIWorkbenchResourceInstancesRequest
     * @return ListAIWorkbenchResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchResourceInstancesResponse ListAIWorkbenchResourceInstances(ListAIWorkbenchResourceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchResourceInstances", ListAIWorkbenchResourceInstancesResponse.class);
    }

    /**
     *Query the list of resource maps
     * @param req ListAIWorkbenchResourceMapsRequest
     * @return ListAIWorkbenchResourceMapsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchResourceMapsResponse ListAIWorkbenchResourceMaps(ListAIWorkbenchResourceMapsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchResourceMaps", ListAIWorkbenchResourceMapsResponse.class);
    }

    /**
     *Query session list
     * @param req ListAIWorkbenchSessionsRequest
     * @return ListAIWorkbenchSessionsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchSessionsResponse ListAIWorkbenchSessions(ListAIWorkbenchSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchSessions", ListAIWorkbenchSessionsResponse.class);
    }

    /**
     *Query the skill list
     * @param req ListAIWorkbenchSkillsRequest
     * @return ListAIWorkbenchSkillsResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchSkillsResponse ListAIWorkbenchSkills(ListAIWorkbenchSkillsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchSkills", ListAIWorkbenchSkillsResponse.class);
    }

    /**
     *This API is used to query the task list.
     * @param req ListAIWorkbenchTasksRequest
     * @return ListAIWorkbenchTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListAIWorkbenchTasksResponse ListAIWorkbenchTasks(ListAIWorkbenchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAIWorkbenchTasks", ListAIWorkbenchTasksResponse.class);
    }

    /**
     *Manually trigger a task.
     * @param req TriggerAIWorkbenchTaskRequest
     * @return TriggerAIWorkbenchTaskResponse
     * @throws TencentCloudSDKException
     */
    public TriggerAIWorkbenchTaskResponse TriggerAIWorkbenchTask(TriggerAIWorkbenchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TriggerAIWorkbenchTask", TriggerAIWorkbenchTaskResponse.class);
    }

    /**
     *Update an Agent
     * @param req UpdateAIWorkbenchAgentRequest
     * @return UpdateAIWorkbenchAgentResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAIWorkbenchAgentResponse UpdateAIWorkbenchAgent(UpdateAIWorkbenchAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAIWorkbenchAgent", UpdateAIWorkbenchAgentResponse.class);
    }

}
