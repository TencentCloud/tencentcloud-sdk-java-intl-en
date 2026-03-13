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
     *Associate a project cluster.
     * @param req AddCalcEnginesToProjectRequest
     * @return AddCalcEnginesToProjectResponse
     * @throws TencentCloudSDKException
     */
    public AddCalcEnginesToProjectResponse AddCalcEnginesToProject(AddCalcEnginesToProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCalcEnginesToProject", AddCalcEnginesToProjectResponse.class);
    }

    /**
     *This API is used to bind the designated execution resource group to the project.
     * @param req AssociateResourceGroupToProjectRequest
     * @return AssociateResourceGroupToProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssociateResourceGroupToProjectResponse AssociateResourceGroupToProject(AssociateResourceGroupToProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateResourceGroupToProject", AssociateResourceGroupToProjectResponse.class);
    }

    /**
     *Authorize a data source.
     * @param req AuthorizeDataSourceRequest
     * @return AuthorizeDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeDataSourceResponse AuthorizeDataSource(AuthorizeDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizeDataSource", AuthorizeDataSourceResponse.class);
    }

    /**
     *Authorization in Catalog mode.
     * @param req AuthorizePrivilegesRequest
     * @return AuthorizePrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizePrivilegesResponse AuthorizePrivileges(AuthorizePrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizePrivileges", AuthorizePrivilegesResponse.class);
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
     *Configure CodeStudio entity permission.
     * @param req CreateCodePermissionsRequest
     * @return CreateCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodePermissionsResponse CreateCodePermissions(CreateCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCodePermissions", CreateCodePermissionsResponse.class);
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
     *This API is used to create a data source in the designated project.
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataSource", CreateDataSourceResponse.class);
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
     *Create a project with cluster information upon creation.
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *Add project user role.
     * @param req CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectMemberResponse CreateProjectMember(CreateProjectMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProjectMember", CreateProjectMemberResponse.class);
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
     *This API is used to purchase resources.
     * @param req CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceGroupResponse CreateResourceGroup(CreateResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResourceGroup", CreateResourceGroupResponse.class);
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
     *Create a folder.
     * @param req CreateTaskFolderRequest
     * @return CreateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFolderResponse CreateTaskFolder(CreateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFolder", CreateTaskFolderResponse.class);
    }

    /**
     *This API is used to create a task.
     * @param req CreateTriggerTaskRequest
     * @return CreateTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerTaskResponse CreateTriggerTask(CreateTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTriggerTask", CreateTriggerTaskResponse.class);
    }

    /**
     *create workflow.
     * @param req CreateTriggerWorkflowRequest
     * @return CreateTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerWorkflowResponse CreateTriggerWorkflow(CreateTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTriggerWorkflow", CreateTriggerWorkflowResponse.class);
    }

    /**
     *Run workflow under workflow scheduling model.
     * @param req CreateTriggerWorkflowRunRequest
     * @return CreateTriggerWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerWorkflowRunResponse CreateTriggerWorkflowRun(CreateTriggerWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTriggerWorkflowRun", CreateTriggerWorkflowRunResponse.class);
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
     *This API is used to configure data development permissions.
     * @param req CreateWorkflowPermissionsRequest
     * @return CreateWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowPermissionsResponse CreateWorkflowPermissions(CreateWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflowPermissions", CreateWorkflowPermissionsResponse.class);
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
     *Delete CodeStudio entity permission.
     * @param req DeleteCodePermissionsRequest
     * @return DeleteCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodePermissionsResponse DeleteCodePermissions(DeleteCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCodePermissions", DeleteCodePermissionsResponse.class);
    }

    /**
     *Delete a replenishment plan.
     * @param req DeleteDataBackfillPlanAsyncRequest
     * @return DeleteDataBackfillPlanAsyncResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataBackfillPlanAsyncResponse DeleteDataBackfillPlanAsync(DeleteDataBackfillPlanAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataBackfillPlanAsync", DeleteDataBackfillPlanAsyncResponse.class);
    }

    /**
     *This API is used to delete a data source.
     * @param req DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSource", DeleteDataSourceResponse.class);
    }

    /**
     *RegisterLineage
     * @param req DeleteLineageRequest
     * @return DeleteLineageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLineageResponse DeleteLineage(DeleteLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLineage", DeleteLineageResponse.class);
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
     *This API is used to delete a project.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *This API is used to delete project users.
     * @param req DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectMemberResponse DeleteProjectMember(DeleteProjectMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectMember", DeleteProjectMemberResponse.class);
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
     *This API is used to destroy resources.
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceGroup", DeleteResourceGroupResponse.class);
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
     *Delete a data development task folder.
     * @param req DeleteTaskFolderRequest
     * @return DeleteTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskFolderResponse DeleteTaskFolder(DeleteTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTaskFolder", DeleteTaskFolderResponse.class);
    }

    /**
     *Delete a workflow scheduling task.
     * @param req DeleteTriggerTaskRequest
     * @return DeleteTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerTaskResponse DeleteTriggerTask(DeleteTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTriggerTask", DeleteTriggerTaskResponse.class);
    }

    /**
     *Deletes a workflow
     * @param req DeleteTriggerWorkflowRequest
     * @return DeleteTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerWorkflowResponse DeleteTriggerWorkflow(DeleteTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTriggerWorkflow", DeleteTriggerWorkflowResponse.class);
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
     *This API is used to delete workflow folder permissions.
     * @param req DeleteWorkflowPermissionsRequest
     * @return DeleteWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowPermissionsResponse DeleteWorkflowPermissions(DeleteWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflowPermissions", DeleteWorkflowPermissionsResponse.class);
    }

    /**
     *View Data Source Permission.
     * @param req DescribeDataSourceAuthorityRequest
     * @return DescribeDataSourceAuthorityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceAuthorityResponse DescribeDataSourceAuthority(DescribeDataSourceAuthorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSourceAuthority", DescribeDataSourceAuthorityResponse.class);
    }

    /**
     *Disable a project.
     * @param req DisableProjectRequest
     * @return DisableProjectResponse
     * @throws TencentCloudSDKException
     */
    public DisableProjectResponse DisableProject(DisableProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableProject", DisableProjectResponse.class);
    }

    /**
     *This API is used to unbind the designated execution resource group from the project.
     * @param req DissociateResourceGroupFromProjectRequest
     * @return DissociateResourceGroupFromProjectResponse
     * @throws TencentCloudSDKException
     */
    public DissociateResourceGroupFromProjectResponse DissociateResourceGroupFromProject(DissociateResourceGroupFromProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DissociateResourceGroupFromProject", DissociateResourceGroupFromProjectResponse.class);
    }

    /**
     *Enable a project.
     * @param req EnableProjectRequest
     * @return EnableProjectResponse
     * @throws TencentCloudSDKException
     */
    public EnableProjectResponse EnableProject(EnableProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableProject", EnableProjectResponse.class);
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
     *Retrieve sql folder details.
     * @param req GetCodeFolderRequest
     * @return GetCodeFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetCodeFolderResponse GetCodeFolder(GetCodeFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCodeFolder", GetCodeFolderResponse.class);
    }

    /**
     *Retrieve supplementary plan details.
     * @param req GetDataBackfillPlanRequest
     * @return GetDataBackfillPlanResponse
     * @throws TencentCloudSDKException
     */
    public GetDataBackfillPlanResponse GetDataBackfillPlan(GetDataBackfillPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataBackfillPlan", GetDataBackfillPlanResponse.class);
    }

    /**
     *This API is used to view detailed information of the specified data source.
     * @param req GetDataSourceRequest
     * @return GetDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public GetDataSourceResponse GetDataSource(GetDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataSource", GetDataSourceResponse.class);
    }

    /**
     *Query the associated task details of a data source.
     * @param req GetDataSourceRelatedTasksRequest
     * @return GetDataSourceRelatedTasksResponse
     * @throws TencentCloudSDKException
     */
    public GetDataSourceRelatedTasksResponse GetDataSourceRelatedTasks(GetDataSourceRelatedTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataSourceRelatedTasks", GetDataSourceRelatedTasksResponse.class);
    }

    /**
     *View the current user's maximum permission scope for the CodeStudio entity.
     * @param req GetMyCodeMaxPermissionRequest
     * @return GetMyCodeMaxPermissionResponse
     * @throws TencentCloudSDKException
     */
    public GetMyCodeMaxPermissionResponse GetMyCodeMaxPermission(GetMyCodeMaxPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMyCodeMaxPermission", GetMyCodeMaxPermissionResponse.class);
    }

    /**
     *Check the current user's maximum permission scope for the workflow folder recursively.
     * @param req GetMyWorkflowMaxPermissionRequest
     * @return GetMyWorkflowMaxPermissionResponse
     * @throws TencentCloudSDKException
     */
    public GetMyWorkflowMaxPermissionResponse GetMyWorkflowMaxPermission(GetMyWorkflowMaxPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMyWorkflowMaxPermission", GetMyWorkflowMaxPermissionResponse.class);
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
     *Query workflow task details.
     * @param req GetOpsTriggerWorkflowRequest
     * @return GetOpsTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetOpsTriggerWorkflowResponse GetOpsTriggerWorkflow(GetOpsTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpsTriggerWorkflow", GetOpsTriggerWorkflowResponse.class);
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
     *This API is used to get project information.
     * @param req GetProjectRequest
     * @return GetProjectResponse
     * @throws TencentCloudSDKException
     */
    public GetProjectResponse GetProject(GetProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProject", GetProjectResponse.class);
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
     *Query a resource file folder details.
     * @param req GetResourceFolderRequest
     * @return GetResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceFolderResponse GetResourceFolder(GetResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceFolder", GetResourceFolderResponse.class);
    }

    /**
     *This API is used to view specified execution resource group monitoring metrics.
     * @param req GetResourceGroupMetricsRequest
     * @return GetResourceGroupMetricsResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceGroupMetricsResponse GetResourceGroupMetrics(GetResourceGroupMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceGroupMetrics", GetResourceGroupMetricsResponse.class);
    }

    /**
     *Retrieve sql folder details.
     * @param req GetSQLFolderRequest
     * @return GetSQLFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetSQLFolderResponse GetSQLFolder(GetSQLFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSQLFolder", GetSQLFolderResponse.class);
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
     *Query table details.
     * @param req GetTableRequest
     * @return GetTableResponse
     * @throws TencentCloudSDKException
     */
    public GetTableResponse GetTable(GetTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTable", GetTableResponse.class);
    }

    /**
     *This API is used to obtain the list of all fields in a table.
     * @param req GetTableColumnsRequest
     * @return GetTableColumnsResponse
     * @throws TencentCloudSDKException
     */
    public GetTableColumnsResponse GetTableColumns(GetTableColumnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTableColumns", GetTableColumnsResponse.class);
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
     *Query Task Folder Details.
     * @param req GetTaskFolderRequest
     * @return GetTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskFolderResponse GetTaskFolder(GetTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskFolder", GetTaskFolderResponse.class);
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
     *This API is used to retrieve task details.
     * @param req GetTriggerTaskRequest
     * @return GetTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskResponse GetTriggerTask(GetTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTask", GetTriggerTaskResponse.class);
    }

    /**
     *Retrieve workflow scheduling task code.
     * @param req GetTriggerTaskCodeRequest
     * @return GetTriggerTaskCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskCodeResponse GetTriggerTaskCode(GetTriggerTaskCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskCode", GetTriggerTaskCodeResponse.class);
    }

    /**
     *Query task execution details.
     * @param req GetTriggerTaskRunRequest
     * @return GetTriggerTaskRunResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskRunResponse GetTriggerTaskRun(GetTriggerTaskRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskRun", GetTriggerTaskRunResponse.class);
    }

    /**
     *Get task version list.
     * @param req GetTriggerTaskVersionRequest
     * @return GetTriggerTaskVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerTaskVersionResponse GetTriggerTaskVersion(GetTriggerTaskVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerTaskVersion", GetTriggerTaskVersionResponse.class);
    }

    /**
     *Retrieve workflow information.
     * @param req GetTriggerWorkflowRequest
     * @return GetTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerWorkflowResponse GetTriggerWorkflow(GetTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerWorkflow", GetTriggerWorkflowResponse.class);
    }

    /**
     *Query workflow task details.
     * @param req GetTriggerWorkflowRunRequest
     * @return GetTriggerWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public GetTriggerWorkflowRunResponse GetTriggerWorkflowRun(GetTriggerWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTriggerWorkflowRun", GetTriggerWorkflowRunResponse.class);
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
     *Query folder details.
     * @param req GetWorkflowFolderRequest
     * @return GetWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowFolderResponse GetWorkflowFolder(GetWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowFolder", GetWorkflowFolderResponse.class);
    }

    /**
     *Modify project user roles.
     * @param req GrantMemberProjectRoleRequest
     * @return GrantMemberProjectRoleResponse
     * @throws TencentCloudSDKException
     */
    public GrantMemberProjectRoleResponse GrantMemberProjectRole(GrantMemberProjectRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantMemberProjectRole", GrantMemberProjectRoleResponse.class);
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
     *Terminate running.
     * @param req KillTriggerWorkflowRunsRequest
     * @return KillTriggerWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public KillTriggerWorkflowRunsResponse KillTriggerWorkflowRuns(KillTriggerWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillTriggerWorkflowRuns", KillTriggerWorkflowRunsResponse.class);
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
     *Retrieve asset catalog info.
     * @param req ListCatalogRequest
     * @return ListCatalogResponse
     * @throws TencentCloudSDKException
     */
    public ListCatalogResponse ListCatalog(ListCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCatalog", ListCatalogResponse.class);
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
     *View CodeStudio entity permission.
     * @param req ListCodePermissionsRequest
     * @return ListCodePermissionsResponse
     * @throws TencentCloudSDKException
     */
    public ListCodePermissionsResponse ListCodePermissions(ListCodePermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCodePermissions", ListCodePermissionsResponse.class);
    }

    /**
     *This API is used to obtain table field lineage information.
     * @param req ListColumnLineageRequest
     * @return ListColumnLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListColumnLineageResponse ListColumnLineage(ListColumnLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListColumnLineage", ListColumnLineageResponse.class);
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
     *This API is used to query the data source list in the designated project.
     * @param req ListDataSourcesRequest
     * @return ListDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDataSourcesResponse ListDataSources(ListDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataSources", ListDataSourcesResponse.class);
    }

    /**
     *This API is used to obtain asset database info.
     * @param req ListDatabaseRequest
     * @return ListDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public ListDatabaseResponse ListDatabase(ListDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDatabase", ListDatabaseResponse.class);
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
     *This API is used to retrieve direct downstream task details.
     * @param req ListDownstreamTriggerTasksRequest
     * @return ListDownstreamTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDownstreamTriggerTasksResponse ListDownstreamTriggerTasks(ListDownstreamTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDownstreamTriggerTasks", ListDownstreamTriggerTasksResponse.class);
    }

    /**
     *This API is used to obtain asset lineage information.
     * @param req ListLineageRequest
     * @return ListLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListLineageResponse ListLineage(ListLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLineage", ListLineageResponse.class);
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
     *This API is used to query the list of workflows.
     * @param req ListOpsTriggerWorkflowsRequest
     * @return ListOpsTriggerWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListOpsTriggerWorkflowsResponse ListOpsTriggerWorkflows(ListOpsTriggerWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOpsTriggerWorkflows", ListOpsTriggerWorkflowsResponse.class);
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
     *Retrieve authorizable permission details.
     * @param req ListPermissionsRequest
     * @return ListPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public ListPermissionsResponse ListPermissions(ListPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPermissions", ListPermissionsResponse.class);
    }

    /**
     *This API is used to obtain asset lineage information.
     * @param req ListProcessLineageRequest
     * @return ListProcessLineageResponse
     * @throws TencentCloudSDKException
     */
    public ListProcessLineageResponse ListProcessLineage(ListProcessLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProcessLineage", ListProcessLineageResponse.class);
    }

    /**
     *This API is used to obtain the user under the project with pagination return.
     * @param req ListProjectMembersRequest
     * @return ListProjectMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectMembersResponse ListProjectMembers(ListProjectMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjectMembers", ListProjectMembersResponse.class);
    }

    /**
     *Get role list info.
     * @param req ListProjectRolesRequest
     * @return ListProjectRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectRolesResponse ListProjectRoles(ListProjectRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjectRoles", ListProjectRolesResponse.class);
    }

    /**
     *The project list in the tenant's global scope is irrelevant to the user's viewing range.
     * @param req ListProjectsRequest
     * @return ListProjectsResponse
     * @throws TencentCloudSDKException
     */
    public ListProjectsResponse ListProjects(ListProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListProjects", ListProjectsResponse.class);
    }

    /**
     *[Filter criteria] {template Name, query usage with Keyword fuzzy matching} {template type, 1. system template 2. custom template} {quality detection dimensions (QualityDims), 1. accuracy 2. uniqueness 3. integrity 4. consistency 5. timeliness 6. validity} [Sorting field] {citation sorting type, sort ASC or DESC based on the number of references}.
     * @param req ListQualityRuleTemplatesRequest
     * @return ListQualityRuleTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListQualityRuleTemplatesResponse ListQualityRuleTemplates(ListQualityRuleTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListQualityRuleTemplates", ListQualityRuleTemplatesResponse.class);
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
     *This API is used to query the execution resource group list.
     * @param req ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceGroupsResponse ListResourceGroups(ListResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceGroups", ListResourceGroupsResponse.class);
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
     *This API is used to obtain the asset database Schema information.
     * @param req ListSchemaRequest
     * @return ListSchemaResponse
     * @throws TencentCloudSDKException
     */
    public ListSchemaResponse ListSchema(ListSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSchema", ListSchemaResponse.class);
    }

    /**
     *This API is used to obtain table information of assets.
     * @param req ListTableRequest
     * @return ListTableResponse
     * @throws TencentCloudSDKException
     */
    public ListTableResponse ListTable(ListTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTable", ListTableResponse.class);
    }

    /**
     *Query Task Folder List.
     * @param req ListTaskFoldersRequest
     * @return ListTaskFoldersResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskFoldersResponse ListTaskFolders(ListTaskFoldersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskFolders", ListTaskFoldersResponse.class);
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
     *Get the role list of all root accounts.
     * @param req ListTenantRolesRequest
     * @return ListTenantRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListTenantRolesResponse ListTenantRoles(ListTenantRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTenantRoles", ListTenantRolesResponse.class);
    }

    /**
     *Task save version list.
     * @param req ListTriggerTaskVersionsRequest
     * @return ListTriggerTaskVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerTaskVersionsResponse ListTriggerTaskVersions(ListTriggerTaskVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerTaskVersions", ListTriggerTaskVersionsResponse.class);
    }

    /**
     *Query job pagination information.
     * @param req ListTriggerTasksRequest
     * @return ListTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerTasksResponse ListTriggerTasks(ListTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerTasks", ListTriggerTasksResponse.class);
    }

    /**
     *Query workflow operation.
     * @param req ListTriggerWorkflowRunsRequest
     * @return ListTriggerWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerWorkflowRunsResponse ListTriggerWorkflowRuns(ListTriggerWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerWorkflowRuns", ListTriggerWorkflowRunsResponse.class);
    }

    /**
     *This API is used to query the list of workflows.
     * @param req ListTriggerWorkflowsRequest
     * @return ListTriggerWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggerWorkflowsResponse ListTriggerWorkflows(ListTriggerWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggerWorkflows", ListTriggerWorkflowsResponse.class);
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
     *This API is used to retrieve direct upstream tasks.
     * @param req ListUpstreamTriggerTasksRequest
     * @return ListUpstreamTriggerTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListUpstreamTriggerTasksResponse ListUpstreamTriggerTasks(ListUpstreamTriggerTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUpstreamTriggerTasks", ListUpstreamTriggerTasksResponse.class);
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
     *Query workflow authorization permissions.
     * @param req ListWorkflowPermissionsRequest
     * @return ListWorkflowPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowPermissionsResponse ListWorkflowPermissions(ListWorkflowPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowPermissions", ListWorkflowPermissionsResponse.class);
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
     *RegisterLineage
     * @param req RegisterLineageRequest
     * @return RegisterLineageResponse
     * @throws TencentCloudSDKException
     */
    public RegisterLineageResponse RegisterLineage(RegisterLineageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterLineage", RegisterLineageResponse.class);
    }

    /**
     *Delete project user roles.
     * @param req RemoveMemberProjectRoleRequest
     * @return RemoveMemberProjectRoleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMemberProjectRoleResponse RemoveMemberProjectRole(RemoveMemberProjectRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMemberProjectRole", RemoveMemberProjectRoleResponse.class);
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
     *Rerun an operation.
     * @param req RerunTriggerWorkflowRunAsyncRequest
     * @return RerunTriggerWorkflowRunAsyncResponse
     * @throws TencentCloudSDKException
     */
    public RerunTriggerWorkflowRunAsyncResponse RerunTriggerWorkflowRunAsync(RerunTriggerWorkflowRunAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunTriggerWorkflowRunAsync", RerunTriggerWorkflowRunAsyncResponse.class);
    }

    /**
     *Revoke data source permission.
     * @param req RevokeDataSourceAuthorizationRequest
     * @return RevokeDataSourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public RevokeDataSourceAuthorizationResponse RevokeDataSourceAuthorization(RevokeDataSourceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeDataSourceAuthorization", RevokeDataSourceAuthorizationResponse.class);
    }

    /**
     *Authorization Revoked in Catalog mode.
     * @param req RevokePrivilegesRequest
     * @return RevokePrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public RevokePrivilegesResponse RevokePrivileges(RevokePrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokePrivileges", RevokePrivilegesResponse.class);
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
     *Start tasks asynchronously in batch.
     * @param req StartOpsTasksRequest
     * @return StartOpsTasksResponse
     * @throws TencentCloudSDKException
     */
    public StartOpsTasksResponse StartOpsTasks(StartOpsTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOpsTasks", StartOpsTasksResponse.class);
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
     *Submit a workflow scheduling task.
     * @param req SubmitTriggerTaskRequest
     * @return SubmitTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTriggerTaskResponse SubmitTriggerTask(SubmitTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTriggerTask", SubmitTriggerTaskResponse.class);
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
     *This API is used to update a data source.
     * @param req UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataSourceResponse UpdateDataSource(UpdateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataSource", UpdateDataSourceResponse.class);
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
     *Query task execution details.
     * @param req UpdateOpsTriggerTasksOwnerRequest
     * @return UpdateOpsTriggerTasksOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOpsTriggerTasksOwnerResponse UpdateOpsTriggerTasksOwner(UpdateOpsTriggerTasksOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOpsTriggerTasksOwner", UpdateOpsTriggerTasksOwnerResponse.class);
    }

    /**
     *This API is used to modify project basic information.
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProject", UpdateProjectResponse.class);
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
     *Update resource folder.
     * @param req UpdateResourceFolderRequest
     * @return UpdateResourceFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceFolderResponse UpdateResourceFolder(UpdateResourceFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceFolder", UpdateResourceFolderResponse.class);
    }

    /**
     *This API is used to modify configurations or renew resources.
     * @param req UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceGroupResponse UpdateResourceGroup(UpdateResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateResourceGroup", UpdateResourceGroupResponse.class);
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
     *Update a task folder.
     * @param req UpdateTaskFolderRequest
     * @return UpdateTaskFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskFolderResponse UpdateTaskFolder(UpdateTaskFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTaskFolder", UpdateTaskFolderResponse.class);
    }

    /**
     *This API is used to update a task.
     * @param req UpdateTaskPartiallyRequest
     * @return UpdateTaskPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTaskPartiallyResponse UpdateTaskPartially(UpdateTaskPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTaskPartially", UpdateTaskPartiallyResponse.class);
    }

    /**
     *This API is used to update a task.
     * @param req UpdateTriggerTaskRequest
     * @return UpdateTriggerTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerTaskResponse UpdateTriggerTask(UpdateTriggerTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerTask", UpdateTriggerTaskResponse.class);
    }

    /**
     *This API is used to update a task.
     * @param req UpdateTriggerTaskPartiallyRequest
     * @return UpdateTriggerTaskPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerTaskPartiallyResponse UpdateTriggerTaskPartially(UpdateTriggerTaskPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerTaskPartially", UpdateTriggerTaskPartiallyResponse.class);
    }

    /**
     *This API is used to update workflow, including basic information and workflow parameters.
     * @param req UpdateTriggerWorkflowRequest
     * @return UpdateTriggerWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerWorkflowResponse UpdateTriggerWorkflow(UpdateTriggerWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerWorkflow", UpdateTriggerWorkflowResponse.class);
    }

    /**
     *Update workflow (including basic info and workflow parameters).
     * @param req UpdateTriggerWorkflowPartiallyRequest
     * @return UpdateTriggerWorkflowPartiallyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerWorkflowPartiallyResponse UpdateTriggerWorkflowPartially(UpdateTriggerWorkflowPartiallyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerWorkflowPartially", UpdateTriggerWorkflowPartiallyResponse.class);
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
     *Refresh workflow folder.
     * @param req UpdateWorkflowFolderRequest
     * @return UpdateWorkflowFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowFolderResponse UpdateWorkflowFolder(UpdateWorkflowFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflowFolder", UpdateWorkflowFolderResponse.class);
    }

}
