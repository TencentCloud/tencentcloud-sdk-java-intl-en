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
package com.tencentcloudapi.wedata.v20250806;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wedata.v20250806.models.*;

public class WedataClient extends AbstractClient{
    private static String endpoint = "wedata.intl.tencentcloudapi.com";
    private static String service = "wedata";
    private static String version = "2025-08-06";

    public WedataClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WedataClient(Credential credential, String region, ClientProfile profile) {
        super(WedataClient.endpoint, WedataClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a code file.
     * @param req CreateCodeFileRequest
     * @return CreateCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeFileResponse CreateCodeFile(CreateCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeFile", CreateCodeFileResponse.class);
    }

    /**
     *This API is used to create a code folder.
     * @param req CreateCodeFolderRequest
     * @return CreateCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeFolderResponse CreateCodeFolder(CreateCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodeFolder", CreateCodeFolderResponse.class);
    }

    /**
     *This API is used to create a data backfill plan.
     * @param req CreateDataBackfillPlanRequest
     * @return CreateDataBackfillPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataBackfillPlanResponse CreateDataBackfillPlan(CreateDataBackfillPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataBackfillPlan", CreateDataBackfillPlanResponse.class);
    }

    /**
     *This API is used to set alarm rules.
     * @param req CreateOpsAlarmRuleRequest
     * @return CreateOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpsAlarmRuleResponse CreateOpsAlarmRule(CreateOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpsAlarmRule", CreateOpsAlarmRuleResponse.class);
    }

    /**
     *This API is used to create a resource file.
     * @param req CreateResourceFileRequest
     * @return CreateResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceFileResponse CreateResourceFile(CreateResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceFile", CreateResourceFileResponse.class);
    }

    /**
     *This API is used to create a resource file folder.
     * @param req CreateResourceFolderRequest
     * @return CreateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceFolderResponse CreateResourceFolder(CreateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceFolder", CreateResourceFolderResponse.class);
    }

    /**
     *This API is used to create an SQL folder
     * @param req CreateSQLFolderRequest
     * @return CreateSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateSQLFolderResponse CreateSQLFolder(CreateSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSQLFolder", CreateSQLFolderResponse.class);
    }

    /**
     *This API is used to add an SQL script.
     * @param req CreateSQLScriptRequest
     * @return CreateSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateSQLScriptResponse CreateSQLScript(CreateSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSQLScript", CreateSQLScriptResponse.class);
    }

    /**
     *This API is used to create a task.
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *This API is used to create workflow.
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
    }

    /**
     *This API is used to create a workflow folder.
     * @param req CreateWorkflowFolderRequest
     * @return CreateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowFolderResponse CreateWorkflowFolder(CreateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowFolder", CreateWorkflowFolderResponse.class);
    }

    /**
     *This API is used to delete a code file.
     * @param req DeleteCodeFileRequest
     * @return DeleteCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeFileResponse DeleteCodeFile(DeleteCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeFile", DeleteCodeFileResponse.class);
    }

    /**
     *This API is used to delete folders in data exploration.
     * @param req DeleteCodeFolderRequest
     * @return DeleteCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeFolderResponse DeleteCodeFolder(DeleteCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodeFolder", DeleteCodeFolderResponse.class);
    }

    /**
     *Deletes alarm rules
     * @param req DeleteOpsAlarmRuleRequest
     * @return DeleteOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOpsAlarmRuleResponse DeleteOpsAlarmRule(DeleteOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOpsAlarmRule", DeleteOpsAlarmRuleResponse.class);
    }

    /**
     *This API is used to delete a resource file.
     * @param req DeleteResourceFileRequest
     * @return DeleteResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFileResponse DeleteResourceFile(DeleteResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFile", DeleteResourceFileResponse.class);
    }

    /**
     *This API is used to delete a resource folder.
     * @param req DeleteResourceFolderRequest
     * @return DeleteResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceFolderResponse DeleteResourceFolder(DeleteResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceFolder", DeleteResourceFolderResponse.class);
    }

    /**
     *This API is used to delete a SQL folder.
     * @param req DeleteSQLFolderRequest
     * @return DeleteSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSQLFolderResponse DeleteSQLFolder(DeleteSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSQLFolder", DeleteSQLFolderResponse.class);
    }

    /**
     *This API is used to delete an SQL script.
     * @param req DeleteSQLScriptRequest
     * @return DeleteSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSQLScriptResponse DeleteSQLScript(DeleteSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSQLScript", DeleteSQLScriptResponse.class);
    }

    /**
     *This API is used to delete an orchestration space task.
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *Deletes a workflow
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflow", DeleteWorkflowResponse.class);
    }

    /**
     *This API is used to delete a data development folder
     * @param req DeleteWorkflowFolderRequest
     * @return DeleteWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowFolderResponse DeleteWorkflowFolder(DeleteWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowFolder", DeleteWorkflowFolderResponse.class);
    }

    /**
     *This API is used to query alert information details.
     * @param req GetAlarmMessageRequest
     * @return GetAlarmMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmMessageResponse GetAlarmMessage(GetAlarmMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlarmMessage", GetAlarmMessageResponse.class);
    }

    /**
     *This API is used to view code file details.
     * @param req GetCodeFileRequest
     * @return GetCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public GetCodeFileResponse GetCodeFile(GetCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCodeFile", GetCodeFileResponse.class);
    }

    /**
     *This API is used to query alert rule information based on alarm rule id or name.
     * @param req GetOpsAlarmRuleRequest
     * @return GetOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsAlarmRuleResponse GetOpsAlarmRule(GetOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsAlarmRule", GetOpsAlarmRuleResponse.class);
    }

    /**
     *This API is used to query async operation details in Ops center.
     * @param req GetOpsAsyncJobRequest
     * @return GetOpsAsyncJobResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsAsyncJobResponse GetOpsAsyncJob(GetOpsAsyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsAsyncJob", GetOpsAsyncJobResponse.class);
    }

    /**
     *Obtaining Task Details
     * @param req GetOpsTaskRequest
     * @return GetOpsTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTaskResponse GetOpsTask(GetOpsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTask", GetOpsTaskResponse.class);
    }

    /**
     *This API is used to retrieve task code.
     * @param req GetOpsTaskCodeRequest
     * @return GetOpsTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTaskCodeResponse GetOpsTaskCode(GetOpsTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTaskCode", GetOpsTaskCodeResponse.class);
    }

    /**
     *This API is used to obtain workflow scheduling details based on the workflow id.
     * @param req GetOpsWorkflowRequest
     * @return GetOpsWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsWorkflowResponse GetOpsWorkflow(GetOpsWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsWorkflow", GetOpsWorkflowResponse.class);
    }

    /**
     *This API is used to obtain resource file details.
     * @param req GetResourceFileRequest
     * @return GetResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceFileResponse GetResourceFile(GetResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceFile", GetResourceFileResponse.class);
    }

    /**
     *This API is used to query script details.
     * @param req GetSQLScriptRequest
     * @return GetSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public GetSQLScriptResponse GetSQLScript(GetSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSQLScript", GetSQLScriptResponse.class);
    }

    /**
     *This API is used to retrieve task details.
     * @param req GetTaskRequest
     * @return GetTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskResponse GetTask(GetTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTask", GetTaskResponse.class);
    }

    /**
     *This API is used to obtain task code.
     * @param req GetTaskCodeRequest
     * @return GetTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskCodeResponse GetTaskCode(GetTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskCode", GetTaskCodeResponse.class);
    }

    /**
     *This API is used to query the details of a scheduling instance.
     * @param req GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceResponse GetTaskInstance(GetTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstance", GetTaskInstanceResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskInstanceLogResponse GetTaskInstanceLog(GetTaskInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskInstanceLog", GetTaskInstanceLogResponse.class);
    }

    /**
     *This API is used to list task versions.
     * @param req GetTaskVersionRequest
     * @return GetTaskVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskVersionResponse GetTaskVersion(GetTaskVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskVersion", GetTaskVersionResponse.class);
    }

    /**
     *This API is used to retrieve workflow information.
     * @param req GetWorkflowRequest
     * @return GetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowResponse GetWorkflow(GetWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflow", GetWorkflowResponse.class);
    }

    /**
     *This API is used to terminate instances in batches asynchronously.
     * @param req KillTaskInstancesAsyncRequest
     * @return KillTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public KillTaskInstancesAsyncResponse KillTaskInstancesAsync(KillTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillTaskInstancesAsync", KillTaskInstancesAsyncResponse.class);
    }

    /**
     *This API is used to search the alarm information list.
     * @param req ListAlarmMessagesRequest
     * @return ListAlarmMessagesResponse
     * @throws TencentCloudSDKException
     */
    public ListAlarmMessagesResponse ListAlarmMessages(ListAlarmMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlarmMessages", ListAlarmMessagesResponse.class);
    }

    /**
     *This API is used to get folder content.
     * @param req ListCodeFolderContentsRequest
     * @return ListCodeFolderContentsResponse
     * @throws TencentCloudSDKException
     */
    public ListCodeFolderContentsResponse ListCodeFolderContents(ListCodeFolderContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCodeFolderContents", ListCodeFolderContentsResponse.class);
    }

    /**
     *This API is used to retrieve all instances of a single backfill.
     * @param req ListDataBackfillInstancesRequest
     * @return ListDataBackfillInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListDataBackfillInstancesResponse ListDataBackfillInstances(ListDataBackfillInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataBackfillInstances", ListDataBackfillInstancesResponse.class);
    }

    /**
     *This API is used to retrieve task direct downstream details.
     * @param req ListDownstreamOpsTasksRequest
     * @return ListDownstreamOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamOpsTasksResponse ListDownstreamOpsTasks(ListDownstreamOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamOpsTasks", ListDownstreamOpsTasksResponse.class);
    }

    /**
     *This API is used to get the direct upstream of an instance.
     * @param req ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTaskInstancesResponse ListDownstreamTaskInstances(ListDownstreamTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTaskInstances", ListDownstreamTaskInstancesResponse.class);
    }

    /**
     *This API is used to retrieve the direct downstream task details.
     * @param req ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTasksResponse ListDownstreamTasks(ListDownstreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTasks", ListDownstreamTasksResponse.class);
    }

    /**
     *This API is used to query the alarm rule list.
     * @param req ListOpsAlarmRulesRequest
     * @return ListOpsAlarmRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsAlarmRulesResponse ListOpsAlarmRules(ListOpsAlarmRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsAlarmRules", ListOpsAlarmRulesResponse.class);
    }

    /**
     *This API is used to obtain the task list based on the project id.
     * @param req ListOpsTasksRequest
     * @return ListOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsTasksResponse ListOpsTasks(ListOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsTasks", ListOpsTasksResponse.class);
    }

    /**
     *Get Workflows under a Project by Project ID.
     * @param req ListOpsWorkflowsRequest
     * @return ListOpsWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsWorkflowsResponse ListOpsWorkflows(ListOpsWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsWorkflows", ListOpsWorkflowsResponse.class);
    }

    /**
     *This API is used to view resource file list
     * @param req ListResourceFilesRequest
     * @return ListResourceFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceFilesResponse ListResourceFiles(ListResourceFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceFiles", ListResourceFilesResponse.class);
    }

    /**
     *This API is used to query the resource file folder list.
     * @param req ListResourceFoldersRequest
     * @return ListResourceFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceFoldersResponse ListResourceFolders(ListResourceFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceFolders", ListResourceFoldersResponse.class);
    }

    /**
     *This API is used to retrieve the content list of an sql folder
     * @param req ListSQLFolderContentsRequest
     * @return ListSQLFolderContentsResponse
     * @throws TencentCloudSDKException
     */
    public ListSQLFolderContentsResponse ListSQLFolderContents(ListSQLFolderContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSQLFolderContents", ListSQLFolderContentsResponse.class);
    }

    /**
     *This API is used to query SQL run history.
     * @param req ListSQLScriptRunsRequest
     * @return ListSQLScriptRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListSQLScriptRunsResponse ListSQLScriptRuns(ListSQLScriptRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSQLScriptRuns", ListSQLScriptRunsResponse.class);
    }

    /**
     *This API is used to query the details of a scheduling instance.
     * @param req ListTaskInstanceExecutionsRequest
     * @return ListTaskInstanceExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskInstanceExecutionsResponse ListTaskInstanceExecutions(ListTaskInstanceExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskInstanceExecutions", ListTaskInstanceExecutionsResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskInstancesResponse ListTaskInstances(ListTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskInstances", ListTaskInstancesResponse.class);
    }

    /**
     *This API is used to list saved task versions.
     * @param req ListTaskVersionsRequest
     * @return ListTaskVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskVersionsResponse ListTaskVersions(ListTaskVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskVersions", ListTaskVersionsResponse.class);
    }

    /**
     *This API is used to query pagination information of tasks.
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *This API is used to retrieve task direct upstream.
     * @param req ListUpstreamOpsTasksRequest
     * @return ListUpstreamOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamOpsTasksResponse ListUpstreamOpsTasks(ListUpstreamOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamOpsTasks", ListUpstreamOpsTasksResponse.class);
    }

    /**
     *This API is used to get the direct upstream of an instance.
     * @param req ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTaskInstancesResponse ListUpstreamTaskInstances(ListUpstreamTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTaskInstances", ListUpstreamTaskInstancesResponse.class);
    }

    /**
     *This API is used to retrieve the direct upstream task.
     * @param req ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTasksResponse ListUpstreamTasks(ListUpstreamTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTasks", ListUpstreamTasksResponse.class);
    }

    /**
     *This API is used to query the folder list.
     * @param req ListWorkflowFoldersRequest
     * @return ListWorkflowFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowFoldersResponse ListWorkflowFolders(ListWorkflowFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowFolders", ListWorkflowFoldersResponse.class);
    }

    /**
     *This API is used to query the list of workflows.
     * @param req ListWorkflowsRequest
     * @return ListWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowsResponse ListWorkflows(ListWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflows", ListWorkflowsResponse.class);
    }

    /**
     *This API is used to pause tasks in batches asynchronously.
     * @param req PauseOpsTasksAsyncRequest
     * @return PauseOpsTasksAsyncResponse
     * @throws TencentCloudSDKException
     */
    public PauseOpsTasksAsyncResponse PauseOpsTasksAsync(PauseOpsTasksAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseOpsTasksAsync", PauseOpsTasksAsyncResponse.class);
    }

    /**
     *This API is used to batch rerun instances asynchronously.
     * @param req RerunTaskInstancesAsyncRequest
     * @return RerunTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public RerunTaskInstancesAsyncResponse RerunTaskInstancesAsync(RerunTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunTaskInstancesAsync", RerunTaskInstancesAsyncResponse.class);
    }

    /**
     *This API is used to run an SQL script.
     * @param req RunSQLScriptRequest
     * @return RunSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public RunSQLScriptResponse RunSQLScript(RunSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunSQLScript", RunSQLScriptResponse.class);
    }

    /**
     *This API is used to batch configure instances asynchronously.
     * @param req SetSuccessTaskInstancesAsyncRequest
     * @return SetSuccessTaskInstancesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public SetSuccessTaskInstancesAsyncResponse SetSuccessTaskInstancesAsync(SetSuccessTaskInstancesAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSuccessTaskInstancesAsync", SetSuccessTaskInstancesAsyncResponse.class);
    }

    /**
     *This API is used to asynchronously deactivate tasks in batch.
     * @param req StopOpsTasksAsyncRequest
     * @return StopOpsTasksAsyncResponse
     * @throws TencentCloudSDKException
     */
    public StopOpsTasksAsyncResponse StopOpsTasksAsync(StopOpsTasksAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopOpsTasksAsync", StopOpsTasksAsyncResponse.class);
    }

    /**
     *This API is used to stop running an SQL script.
     * @param req StopSQLScriptRunRequest
     * @return StopSQLScriptRunResponse
     * @throws TencentCloudSDKException
     */
    public StopSQLScriptRunResponse StopSQLScriptRun(StopSQLScriptRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSQLScriptRun", StopSQLScriptRunResponse.class);
    }

    /**
     *This API is used to submit a task.
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTask", SubmitTaskResponse.class);
    }

    /**
     *This API is used to update a code file.
     * @param req UpdateCodeFileRequest
     * @return UpdateCodeFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeFileResponse UpdateCodeFile(UpdateCodeFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeFile", UpdateCodeFileResponse.class);
    }

    /**
     *This API is used to rename a code folder.
     * @param req UpdateCodeFolderRequest
     * @return UpdateCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCodeFolderResponse UpdateCodeFolder(UpdateCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCodeFolder", UpdateCodeFolderResponse.class);
    }

    /**
     *Modifies alarm rules
     * @param req UpdateOpsAlarmRuleRequest
     * @return UpdateOpsAlarmRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsAlarmRuleResponse UpdateOpsAlarmRule(UpdateOpsAlarmRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsAlarmRule", UpdateOpsAlarmRuleResponse.class);
    }

    /**
     *This API is used to modify the task owner.
     * @param req UpdateOpsTasksOwnerRequest
     * @return UpdateOpsTasksOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsTasksOwnerResponse UpdateOpsTasksOwner(UpdateOpsTasksOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsTasksOwner", UpdateOpsTasksOwnerResponse.class);
    }

    /**
     *This API is used to update a resource file.
     * @param req UpdateResourceFileRequest
     * @return UpdateResourceFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFileResponse UpdateResourceFile(UpdateResourceFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFile", UpdateResourceFileResponse.class);
    }

    /**
     *This API is used to update a resource folder.
     * @param req UpdateResourceFolderRequest
     * @return UpdateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFolderResponse UpdateResourceFolder(UpdateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFolder", UpdateResourceFolderResponse.class);
    }

    /**
     *This API is used to rename an SQL folder.
     * @param req UpdateSQLFolderRequest
     * @return UpdateSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSQLFolderResponse UpdateSQLFolder(UpdateSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSQLFolder", UpdateSQLFolderResponse.class);
    }

    /**
     *This API is used to save the script content for data exploration.
     * @param req UpdateSQLScriptRequest
     * @return UpdateSQLScriptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSQLScriptResponse UpdateSQLScript(UpdateSQLScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSQLScript", UpdateSQLScriptResponse.class);
    }

    /**
     *This API is used to update a task.
     * @param req UpdateTaskRequest
     * @return UpdateTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskResponse UpdateTask(UpdateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTask", UpdateTaskResponse.class);
    }

    /**
     *This API is used to update a workflow including basic information and workflow parameters.
     * @param req UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowResponse UpdateWorkflow(UpdateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflow", UpdateWorkflowResponse.class);
    }

    /**
     *This API is used to update a workflow folder
     * @param req UpdateWorkflowFolderRequest
     * @return UpdateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowFolderResponse UpdateWorkflowFolder(UpdateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowFolder", UpdateWorkflowFolderResponse.class);
    }

}
